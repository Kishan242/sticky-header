package com.kishan.stickyheader.sh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by USER on 28-Jul-17.
 */

public abstract class BaseStickyHeaderAdapter extends RecyclerView.Adapter<BaseStickyHeaderAdapter.ViewHolder>
        implements StickyHeaderAdapter<BaseStickyHeaderAdapter.HeaderHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView item;

        public ViewHolder(View itemView) {
            super(itemView);

            item = (TextView) itemView;
        }
    }

    public static class HeaderHolder extends RecyclerView.ViewHolder {
        public TextView header;

        public HeaderHolder(View itemView) {
            super(itemView);

            header = (TextView) itemView;
        }
    }
}
