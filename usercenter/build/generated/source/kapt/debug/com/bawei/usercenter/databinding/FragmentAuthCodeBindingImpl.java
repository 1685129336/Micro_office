package com.bawei.usercenter.databinding;
import com.bawei.usercenter.R;
import com.bawei.usercenter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAuthCodeBindingImpl extends FragmentAuthCodeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bt_back, 1);
        sViewsWithIds.put(R.id.auth_code_01, 2);
        sViewsWithIds.put(R.id.auth_code_02, 3);
        sViewsWithIds.put(R.id.auth_code_03, 4);
        sViewsWithIds.put(R.id.auth_code_04, 5);
        sViewsWithIds.put(R.id.auth_code_05, 6);
        sViewsWithIds.put(R.id.auth_code_06, 7);
        sViewsWithIds.put(R.id.bt_auth_code, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAuthCodeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentAuthCodeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (baseview.BaseEditTextView) bindings[2]
            , (baseview.BaseEditTextView) bindings[3]
            , (baseview.BaseEditTextView) bindings[4]
            , (baseview.BaseEditTextView) bindings[5]
            , (baseview.BaseEditTextView) bindings[6]
            , (baseview.BaseEditTextView) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        else {
            variableSet = false;
        }
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}