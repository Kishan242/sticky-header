package com.kishan.stickyheader.sh;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by USER on 28-Jul-17.
 */

public class StickyHeaderRecyclerView extends RecyclerView {
    public StickyHeaderRecyclerView(Context context) {
        super(context);
    }

    public StickyHeaderRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public StickyHeaderRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setAdapter(Adapter adapter) {
        super.setAdapter(adapter);
        if (adapter instanceof StickyHeaderAdapter)
            addItemDecoration(new StickyHeaderDecoration((StickyHeaderAdapter) adapter));
    }
}
