// Generated by data binding compiler. Do not edit!
package com.bawei.usercenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bawei.usercenter.R;
import com.bawei.usercenter.viewmodel.UserCenterViewModel;
import com.example.common.event.api.IEvent;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btLogin;

  @NonNull
  public final Spinner languageSpinner;

  @NonNull
  public final EditText passwordEt;

  @NonNull
  public final TextInputLayout passwordInputLayout;

  @NonNull
  public final TextView tvAuthCodeLogin;

  @NonNull
  public final TextView tvRegister;

  @NonNull
  public final EditText usernameEt;

  @NonNull
  public final TextInputLayout usernameLayout;

  @Bindable
  protected UserCenterViewModel mViewModel;

  @Bindable
  protected IEvent.OnTextChangedListener mUserNameTextChange;

  @Bindable
  protected IEvent.OnTextChangedListener mPasswordTextChange;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btLogin, Spinner languageSpinner, EditText passwordEt,
      TextInputLayout passwordInputLayout, TextView tvAuthCodeLogin, TextView tvRegister,
      EditText usernameEt, TextInputLayout usernameLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btLogin = btLogin;
    this.languageSpinner = languageSpinner;
    this.passwordEt = passwordEt;
    this.passwordInputLayout = passwordInputLayout;
    this.tvAuthCodeLogin = tvAuthCodeLogin;
    this.tvRegister = tvRegister;
    this.usernameEt = usernameEt;
    this.usernameLayout = usernameLayout;
  }

  public abstract void setViewModel(@Nullable UserCenterViewModel viewModel);

  @Nullable
  public UserCenterViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setUserNameTextChange(
      @Nullable IEvent.OnTextChangedListener userNameTextChange);

  @Nullable
  public IEvent.OnTextChangedListener getUserNameTextChange() {
    return mUserNameTextChange;
  }

  public abstract void setPasswordTextChange(
      @Nullable IEvent.OnTextChangedListener passwordTextChange);

  @Nullable
  public IEvent.OnTextChangedListener getPasswordTextChange() {
    return mPasswordTextChange;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
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
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}
