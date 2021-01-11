package com.bawei.usercenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\'2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J&\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\'2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010/\u001a\u00020\"H\u0002J\"\u00100\u001a\u00020\'2\n\u00101\u001a\u0006\u0012\u0002\b\u0003022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001c\u00103\u001a\u00020$2\n\u00101\u001a\u0006\u0012\u0002\b\u0003022\b\u00104\u001a\u0004\u0018\u000105R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00066"}, d2 = {"Lcom/bawei/usercenter/UserCenterActivity;", "Lcore/ui/BaseActivity;", "()V", "authCodeFragment", "Lcom/bawei/usercenter/fragment/AuthCodeFragment;", "getAuthCodeFragment", "()Lcom/bawei/usercenter/fragment/AuthCodeFragment;", "fragments", "", "Landroidx/fragment/app/Fragment;", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "loginFragment", "Lcom/bawei/usercenter/fragment/LoginFragment;", "getLoginFragment", "()Lcom/bawei/usercenter/fragment/LoginFragment;", "pageStack", "getPageStack", "setPageStack", "passwordFragment", "Lcom/bawei/usercenter/fragment/PasswordFragment;", "getPasswordFragment", "()Lcom/bawei/usercenter/fragment/PasswordFragment;", "phoneNumberFragment", "Lcom/bawei/usercenter/fragment/PhoneNumberFragment;", "getPhoneNumberFragment", "()Lcom/bawei/usercenter/fragment/PhoneNumberFragment;", "userNameFragment", "Lcom/bawei/usercenter/fragment/UserNameFragment;", "getUserNameFragment", "()Lcom/bawei/usercenter/fragment/UserNameFragment;", "goBack", "", "initData", "", "initView", "layoutID", "", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "pageChange", "pos", "fs", "flag", "queryFragment", "fragment", "Ljava/lang/Class;", "startFragment", "data", "Landroid/os/Bundle;", "usercenter_debug"})
public final class UserCenterActivity extends core.ui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<androidx.fragment.app.Fragment> fragments;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<androidx.fragment.app.Fragment> pageStack;
    @org.jetbrains.annotations.NotNull()
    private final com.bawei.usercenter.fragment.LoginFragment loginFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bawei.usercenter.fragment.PhoneNumberFragment phoneNumberFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bawei.usercenter.fragment.AuthCodeFragment authCodeFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bawei.usercenter.fragment.UserNameFragment userNameFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bawei.usercenter.fragment.PasswordFragment passwordFragment = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<androidx.fragment.app.Fragment> getFragments() {
        return null;
    }
    
    public final void setFragments(@org.jetbrains.annotations.NotNull()
    java.util.List<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<androidx.fragment.app.Fragment> getPageStack() {
        return null;
    }
    
    public final void setPageStack(@org.jetbrains.annotations.NotNull()
    java.util.List<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bawei.usercenter.fragment.LoginFragment getLoginFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bawei.usercenter.fragment.PhoneNumberFragment getPhoneNumberFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bawei.usercenter.fragment.AuthCodeFragment getAuthCodeFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bawei.usercenter.fragment.UserNameFragment getUserNameFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bawei.usercenter.fragment.PasswordFragment getPasswordFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public int layoutID() {
        return 0;
    }
    
    private final void pageChange(int pos, java.util.List<androidx.fragment.app.Fragment> fs, boolean flag) {
    }
    
    private final int queryFragment(java.lang.Class<?> fragment, java.util.List<androidx.fragment.app.Fragment> fragments) {
        return 0;
    }
    
    public final void startFragment(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle data) {
    }
    
    public final boolean goBack() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    public UserCenterActivity() {
        super();
    }
}