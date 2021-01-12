package com.example.home.adapter;

import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.home.R;
import com.example.home.entity.GetInfoBean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InfoAdapter extends BaseMultiItemQuickAdapter<GetInfoBean, BaseViewHolder> {

    public InfoAdapter(@Nullable List<GetInfoBean> data) {
        super(data);
        addItemType(2, R.layout.layout_getinfo);
        addItemType(1,R.layout.layout_sendinfo);

    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, GetInfoBean getInfoBean) {
        switch (baseViewHolder.getItemViewType()){
            case 2:
                baseViewHolder.setText(R.id.getinfomsg,getInfoBean.getContent());
                ImageView getinfoimg = baseViewHolder.getView(R.id.getinfoimg);

                break;

            case 1:
                baseViewHolder.setText(R.id.sendinfomsg,getInfoBean.getContent());
                ImageView sendinfoimg = baseViewHolder.getView(R.id.sendinfoimg);
                break;
        }
    }

}
