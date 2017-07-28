package com.kishan.stickyheader.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kishan.stickyheader.R;
import com.kishan.stickyheader.sh.BaseStickyHeaderAdapter;

public class StickyTestAdapter extends BaseStickyHeaderAdapter {

    private static final int ITEM_COUNT = 1000;
    private LayoutInflater mInflater;

    public StickyTestAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

//    item
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View view = mInflater.inflate(R.layout.item_test, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.item.setText("Item " + i);
    }

    @Override
    public int getItemCount() {
        return ITEM_COUNT;
    }

    @Override
    public long getHeaderId(int position) {
        return (long) position / 10;
    }

    //header
    @Override
    public HeaderHolder onCreateHeaderViewHolder(ViewGroup parent) {
        final View view = mInflater.inflate(R.layout.item_header, parent, false);
        return new HeaderHolder(view);
    }

    @Override
    public void onBindHeaderViewHolder(HeaderHolder viewholder, int position) {
        viewholder.header.setText("Header " + getHeaderId(position));
    }
}