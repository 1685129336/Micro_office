package com.example.linkman;

import com.bawei.usercenter.R;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class LinkmanAdapter extends BaseMultiItemQuickAdapter<LinkMan, BaseViewHolder> {
    private List<LinkMan> linkMEN;
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public LinkmanAdapter(List<LinkMan> data) {
        super(data);
        addItemType(LinkMan.ISLINKMAN, R.layout.linkman_item_layout);
        addItemType(LinkMan.ISLETTER,R.layout.letter_item_layout);
    }

    @Override
    protected void convert(BaseViewHolder helper, LinkMan item) {
        switch (helper.getItemViewType()){
            case 0:
                helper.setText(R.id.linkman_item_name,item.getName());
                helper.setText(R.id.linkman_item_num,item.getPhoneNum());
                break;
            case 1:
                helper.setText(R.id.letter_item_text,item.getName());
                break;
        }
    }
}
