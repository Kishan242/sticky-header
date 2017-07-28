package com.kishan.stickyheader.sh;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

interface StickyHeaderAdapter<VH extends RecyclerView.ViewHolder> {

        long getHeaderId(int position);

        VH onCreateHeaderViewHolder(ViewGroup parent);

        void onBindHeaderViewHolder(VH viewHolder, int position);
    }