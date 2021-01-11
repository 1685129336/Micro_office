// Generated by data binding compiler. Do not edit!
package com.bawei.usercenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bawei.usercenter.R;
import com.bawei.usercenter.viewmodel.UserCenterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentUserNameBinding extends ViewDataBinding {
  @NonNull
  public final Button btBack;

  @NonNull
  public final Button btUserNameNext;

  @Bindable
  protected UserCenterViewModel mViewModel;

  protected FragmentUserNameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btBack, Button btUserNameNext) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btBack = btBack;
    this.btUserNameNext = btUserNameNext;
  }

  public abstract void setViewModel(@Nullable UserCenterViewModel viewModel);

  @Nullable
  public UserCenterViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentUserNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_name, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUserNameBinding>inflateInternal(inflater, R.layout.fragment_user_name, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_name, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUserNameBinding>inflateInternal(inflater, R.layout.fragment_user_name, null, false, component);
  }

  public static FragmentUserNameBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentUserNameBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUserNameBinding)bind(component, view, R.layout.fragment_user_name);
  }
}