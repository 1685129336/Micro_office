package com.bawei.usercenter.databinding;
import com.bawei.usercenter.R;
import com.bawei.usercenter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPasswordBindingImpl extends FragmentPasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bt_back, 3);
        sViewsWithIds.put(R.id.pwd_input_layout_01, 4);
        sViewsWithIds.put(R.id.pwd_input_layout_02, 5);
        sViewsWithIds.put(R.id.bt_register, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[6]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pwdEt01.setTag(null);
        this.pwdEt02.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.pwdTextChange01 == variableId) {
            setPwdTextChange01((com.example.common.event.api.IEvent.OnTextChangedListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.bawei.usercenter.viewmodel.UserCenterViewModel) variable);
        }
        else if (BR.pwdTextChange02 == variableId) {
            setPwdTextChange02((com.example.common.event.api.IEvent.OnTextChangedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPwdTextChange01(@Nullable com.example.common.event.api.IEvent.OnTextChangedListener PwdTextChange01) {
        this.mPwdTextChange01 = PwdTextChange01;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.pwdTextChange01);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.bawei.usercenter.viewmodel.UserCenterViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setPwdTextChange02(@Nullable com.example.common.event.api.IEvent.OnTextChangedListener PwdTextChange02) {
        this.mPwdTextChange02 = PwdTextChange02;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.pwdTextChange02);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.common.event.api.IEvent.OnTextChangedListener pwdTextChange01 = mPwdTextChange01;
        com.example.common.event.api.IEvent.OnTextChangedListener pwdTextChange02 = mPwdTextChange02;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.example.common.event.listener.Transaction.onTextChange(this.pwdEt01, pwdTextChange01);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.example.common.event.listener.Transaction.onTextChange(this.pwdEt02, pwdTextChange02);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pwdTextChange01
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): pwdTextChange02
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}