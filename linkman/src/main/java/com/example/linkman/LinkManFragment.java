package com.example.linkman;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.usercenter.R;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class LinkManFragment extends Fragment {
    private View view;
    private RecyclerView persion_rv;
    private RecyclerView letter_rv;
    private LetterAdapter letterAdapter;
    private LinkmanAdapter linkmanAdapter;
    //获取26个英文字母
    List<String> letterList = new ArrayList<>();
    List<LinkMan> linkManList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.linkman_fragment_layout,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initView();
        initData();
    }

    private void initData() {
        getEnglishLetter();
        letterAdapter = new LetterAdapter(letterList, new LetterClickCallBack() {
            @Override
            public void onClick(int position, String s) {

            }
        });
        letter_rv.setAdapter(letterAdapter);

        linkManList.add(new LinkMan("张总","18618487100"));
        linkManList.add(new LinkMan("王总","18618487100"));
        linkManList.add(new LinkMan("李总","18618487100"));
        linkManList.add(new LinkMan("杨总","18618487100"));
        linkManList.add(new LinkMan("赵总","18618487100"));
        linkManList.add(new LinkMan("任总","18618487100"));
        linkManList.add(new LinkMan("丁总","18618487100"));
        linkManList.add(new LinkMan("刘总","18618487100"));
        linkManList.add(new LinkMan("徐总","18618487100"));
        linkManList.add(new LinkMan("高总","18618487100"));
        linkManList.add(new LinkMan("程总","18618487100"));


        sort(linkManList);
        addBigLetter(linkManList);
        linkmanAdapter = new LinkmanAdapter(linkManList);
        persion_rv.setAdapter(linkmanAdapter);
    }

    private void initView() {
        persion_rv = view.findViewById(R.id.linkman_f_persion_rv);
        persion_rv.setLayoutManager(new LinearLayoutManager(getContext()));
        letter_rv = view.findViewById(R.id.linkman_f_letter_rv);
        letter_rv.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public List<String> getEnglishLetter(){
        if (letterList.size()!=26){
            char a = 'A';
            for (int i = 1; i <=26; i++) {
                letterList.add(String.valueOf(a++));
            }
        }
        return letterList;
    }

    public List<LinkMan> sort(List<LinkMan> list){
        //排序
        final Comparator<Object> comparator = Collator.getInstance(Locale.ENGLISH);
        Collections.sort(list,(l1, l2) -> {
            String charPinyin = ChangeToPinYin.getInstance().getCharPinyin(l1.getSortByString().charAt(0));
            Log.d("zf",""+charPinyin+"排序的元素->"+l1.getSortByString());
            String charPinyin2 = ChangeToPinYin.getInstance().getCharPinyin(l2.getSortByString().charAt(0));
            Log.d("zf",""+charPinyin2);
            return comparator.compare(String.valueOf(charPinyin.charAt(0)),String.valueOf(charPinyin2.charAt(0)));
        });
        return list;
    }

    public List<LinkMan> addBigLetter(List<LinkMan> list){
        //添加英文大写字母
        String flag = "";
        for (int i = 0; i < list.size(); i++) {
            String charPinyin = ChangeToPinYin.getInstance().getCharPinyin(list.get(i).getSortByString().charAt(0));
            String change = String.valueOf(charPinyin.charAt(0));
            if (!flag.equals(change)){
                list.add(i,new LinkMan(change.toUpperCase(),LinkMan.ISLETTER));
            }
            flag = change;
        }
        return list;
    }
}
