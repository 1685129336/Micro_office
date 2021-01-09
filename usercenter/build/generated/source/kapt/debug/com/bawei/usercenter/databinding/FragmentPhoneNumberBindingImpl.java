package com.bawei.usercenter.databinding;
import com.bawei.usercenter.R;
import com.bawei.usercenter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPhoneNumberBindingImpl extends FragmentPhoneNumberBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bt_back, 2);
        sViewsWithIds.put(R.id.phone_input_layout, 3);
        sViewsWithIds.put(R.id.bt_phone_number_next, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPhoneNumberBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentPhoneNumberBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.phoneEt.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.phoneTextChange == variableId) {
            setPhoneTextChange((com.example.common.event.api.IEvent.OnTextChangedListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.bawei.usercenter.viewmodel.UserCenterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPhoneTextChange(@Nullable com.example.common.event.api.IEvent.OnTextChangedListener PhoneTextChange) {
        this.mPhoneTextChange = PhoneTextChange;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.phoneTextChange);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.bawei.usercenter.viewmodel.UserCenterViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        com.example.common.event.api.IEvent.OnTextChangedListener phoneTextChange = mPhoneTextChange;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.common.event.listener.Transaction.onTextChange(this.phoneEt, phoneTextChange);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): phoneTextChange
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}