package com.bawei.usercenter;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.bawei.usercenter.databinding.ActivityLoginBindingImpl;
import com.bawei.usercenter.databinding.ActivityRegisterBindingImpl;
import com.bawei.usercenter.databinding.ActivityUserCenterBindingImpl;
import com.bawei.usercenter.databinding.FragmentAuthCodeBindingImpl;
import com.bawei.usercenter.databinding.FragmentLoginBindingImpl;
import com.bawei.usercenter.databinding.FragmentPasswordBindingImpl;
import com.bawei.usercenter.databinding.FragmentPhoneNumberBindingImpl;
import com.bawei.usercenter.databinding.FragmentUserNameBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYREGISTER = 2;

  private static final int LAYOUT_ACTIVITYUSERCENTER = 3;

  private static final int LAYOUT_FRAGMENTAUTHCODE = 4;

  private static final int LAYOUT_FRAGMENTLOGIN = 5;

  private static final int LAYOUT_FRAGMENTPASSWORD = 6;

  private static final int LAYOUT_FRAGMENTPHONENUMBER = 7;

  private static final int LAYOUT_FRAGMENTUSERNAME = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.activity_register, LAYOUT_ACTIVITYREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.activity_user_center, LAYOUT_ACTIVITYUSERCENTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.fragment_auth_code, LAYOUT_FRAGMENTAUTHCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.fragment_password, LAYOUT_FRAGMENTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.fragment_phone_number, LAYOUT_FRAGMENTPHONENUMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bawei.usercenter.R.layout.fragment_user_name, LAYOUT_FRAGMENTUSERNAME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTER: {
          if ("layout/activity_register_0".equals(tag)) {
            return new ActivityRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSERCENTER: {
          if ("layout/activity_user_center_0".equals(tag)) {
            return new ActivityUserCenterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user_center is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAUTHCODE: {
          if ("layout/fragment_auth_code_0".equals(tag)) {
            return new FragmentAuthCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_auth_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPASSWORD: {
          if ("layout/fragment_password_0".equals(tag)) {
            return new FragmentPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPHONENUMBER: {
          if ("layout/fragment_phone_number_0".equals(tag)) {
            return new FragmentPhoneNumberBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_phone_number is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERNAME: {
          if ("layout/fragment_user_name_0".equals(tag)) {
            return new FragmentUserNameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_name is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(5);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.bawei.resource.DataBinderMapperImpl());
    result.add(new com.chad.library.DataBinderMapperImpl());
    result.add(new com.example.common.DataBinderMapperImpl());
    result.add(new com.example.mvvmcore.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(11);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "fragments");
      sKeys.put(3, "passwordTextChange");
      sKeys.put(4, "phoneTextChange");
      sKeys.put(5, "pwdTextChange01");
      sKeys.put(6, "pwdTextChange02");
      sKeys.put(7, "titles");
      sKeys.put(8, "userNameTextChange");
      sKeys.put(9, "viewModel");
      sKeys.put(10, "vp");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_login_0", com.bawei.usercenter.R.layout.activity_login);
      sKeys.put("layout/activity_register_0", com.bawei.usercenter.R.layout.activity_register);
      sKeys.put("layout/activity_user_center_0", com.bawei.usercenter.R.layout.activity_user_center);
      sKeys.put("layout/fragment_auth_code_0", com.bawei.usercenter.R.layout.fragment_auth_code);
      sKeys.put("layout/fragment_login_0", com.bawei.usercenter.R.layout.fragment_login);
      sKeys.put("layout/fragment_password_0", com.bawei.usercenter.R.layout.fragment_password);
      sKeys.put("layout/fragment_phone_number_0", com.bawei.usercenter.R.layout.fragment_phone_number);
      sKeys.put("layout/fragment_user_name_0", com.bawei.usercenter.R.layout.fragment_user_name);
    }
  }
}
