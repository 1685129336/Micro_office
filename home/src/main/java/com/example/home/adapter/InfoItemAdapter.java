package com.example.home.adapter;

import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.home.R;
import com.example.home.entity.InfoCollect;
import com.example.home.entity.SearchNumberBean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InfoItemAdapter extends BaseQuickAdapter<InfoCollect, BaseViewHolder> {

    public InfoItemAdapter(int layoutResId, @Nullable List<InfoCollect> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, InfoCollect infoCollect) {
        baseViewHolder.setText(R.id.infoitem_infofromname,infoCollect.getInfofromname());
        baseViewHolder.setText(R.id.infoitem_infofromtime,"16:21");
        baseViewHolder.setText(R.id.infoitem_msg,infoCollect.getMsg());
        ImageView infoitem_imgurl = baseViewHolder.getView(R.id.infoitem_imgurl);
    }
}
