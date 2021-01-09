package baseview;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bawei.resource.R;

public class BaseEditTextView extends androidx.appcompat.widget.AppCompatEditText {
    private BaseEditTextView next;
    private BaseEditTextView last;
    private boolean flag = false;
    private Runnable runnable = null;
    private String regex = null;

    public void addEdit(BaseEditTextView editTextView){
        this.next = editTextView;
        editTextView.last = this;
    }

    public BaseEditTextView(@NonNull Context context) {
        super(context);
        init();
    }

    public BaseEditTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BaseEditTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
        setGravity(Gravity.CENTER);
        setInputType(0x00000002);
        setBackgroundResource(R.drawable.edit_border);
        setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DEL){
                    if (getText().toString().isEmpty()){
                        if (last!=null){
                            if (flag){
                                getFocus(last);
                            }
                            flag = true;
                        }
                    }
                }
                return false;
            }
        });
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused){
            flag = false;
        }
    }

    public void setFinish(Runnable runnable){
        BaseEditTextView et = this;
        while (true){
            et.runnable = runnable;
            if (et.next!=null){
                this.runnable = runnable;
                et = et.next;
            }else {
                break;
            }
        }
    }

    @Override
    public void setOnFocusChangeListener(OnFocusChangeListener l) {
        super.setOnFocusChangeListener(l);
    }

    public void setRegex(String regex){
        BaseEditTextView et = this;
        while (true){
            et.regex = regex;
            if (et.next!=null){
                this.regex = regex;
                et = et.next;
            }else {
                break;
            }
        }
    }

    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        if (regex==null){
            new Throwable("请定制正确字符串----------------setRegex(String regex)");
        }
        if (runnable==null){
            new Throwable("请设置完成后的事件----------------setFinish(Runnable runnable)");
        }
        if (text.length()>=1){
            if (next != null){
                getFocus(next);
            }else {
                if (isequal(regex)){
                    runnable.run();
                }else {
                    BaseEditTextView et = this;
                    while (et!=null){
                        et.setText("");
                        getFocus(et);
                        et = et.last;
                    }
                }
            }
        }
    }

    private boolean isequal(String regex) {
        BaseEditTextView et = this;
        String s = "";
        //倒序遍历链结构提取输入的字符
        while (true){
            //字符拼接
            s += et.getText().toString();
            //判断是否有上一个节点  如果没有就结束
            if (et.last==null){
                break;
            }
            //节点传递
            et = et.last;
        }
        //字符串翻转
        String s1 = new StringBuilder(s).reverse().toString();
        //判断是否与标准字符相同
        if (s1.equals(regex)) {
            return true;
        }
        return false;
    }

    private void getFocus(BaseEditTextView et) {
        et.setFocusable(true);
        et.setFocusableInTouchMode(true);
        et.requestFocus();
    }
}
