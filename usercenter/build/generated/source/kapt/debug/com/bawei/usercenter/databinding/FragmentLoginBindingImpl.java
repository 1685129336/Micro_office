package com.bawei.usercenter.databinding;
import com.bawei.usercenter.R;
import com.bawei.usercenter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.language_spinner, 3);
        sViewsWithIds.put(R.id.username_layout, 4);
        sViewsWithIds.put(R.id.password_input_layout, 5);
        sViewsWithIds.put(R.id.tv_auth_code_login, 6);
        sViewsWithIds.put(R.id.tv_register, 7);
        sViewsWithIds.put(R.id.bt_login, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (android.widget.Spinner) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.EditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.passwordEt.setTag(null);
        this.usernameEt.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.bawei.usercenter.viewmodel.UserCenterViewModel) variable);
        }
        else if (BR.passwordTextChange == variableId) {
            setPasswordTextChange((com.example.common.event.api.IEvent.OnTextChangedListener) variable);
        }
        else if (BR.userNameTextChange == variableId) {
            setUserNameTextChange((com.example.common.event.api.IEvent.OnTextChangedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.bawei.usercenter.viewmodel.UserCenterViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setPasswordTextChange(@Nullable com.example.common.event.api.IEvent.OnTextChangedListener PasswordTextChange) {
        this.mPasswordTextChange = PasswordTextChange;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.passwordTextChange);
        super.requestRebind();
    }
    public void setUserNameTextChange(@Nullable com.example.common.event.api.IEvent.OnTextChangedListener UserNameTextChange) {
        this.mUserNameTextChange = UserNameTextChange;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.userNameTextChange);
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
        com.example.common.event.api.IEvent.OnTextChangedListener passwordTextChange = mPasswordTextChange;
        com.example.common.event.api.IEvent.OnTextChangedListener userNameTextChange = mUserNameTextChange;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.example.common.event.listener.Transaction.onTextChange(this.passwordEt, passwordTextChange);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.example.common.event.listener.Transaction.onTextChange(this.usernameEt, userNameTextChange);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): passwordTextChange
        flag 2 (0x3L): userNameTextChange
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}