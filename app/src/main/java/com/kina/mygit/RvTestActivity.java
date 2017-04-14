package com.kina.mygit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RvTestActivity extends AppCompatActivity {

    private Context mContext;
    private RecyclerView mRecyclerView;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_test);
        mContext = this;

        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(this));
        mList = getLists();
        mRecyclerView.setAdapter(new RvAdapter());
    }

    private List<String> getLists() {
        mList = new ArrayList<>();
        for (int i = 0; i < 35; i++) {
            mList.add("hello-->" + i);
        }
        return mList;
    }

    private class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

        @Override
        public RvAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_rv, parent, false));
            return holder;
        }

        @Override
        public void onBindViewHolder(RvAdapter.MyViewHolder holder, int position) {
            holder.mTextView.setText(mList.get(position).toString());
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            private TextView mTextView;
            public MyViewHolder(View itemView) {
                super(itemView);
                mTextView = (TextView) itemView.findViewById(R.id.textView);
            }
        }
    }
}
