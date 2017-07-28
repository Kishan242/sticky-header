package com.kishan.stickyheader.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kishan.stickyheader.R;
import com.kishan.stickyheader.sh.StickyHeaderRecyclerView;
import com.kishan.stickyheader.ui.adapter.StickyTestAdapter;

public class MainActivity extends AppCompatActivity {

    StickyHeaderRecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        recyclerView = (StickyHeaderRecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new StickyTestAdapter(this));
    }
}
