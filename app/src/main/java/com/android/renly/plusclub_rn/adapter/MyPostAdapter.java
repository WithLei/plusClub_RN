package com.android.renly.plusclub_rn.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.renly.plusclub_rn.App;
import com.android.renly.plusclub_rn.api.bean.SimplePost;
import com.android.renly.plusclub_rn.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Reply列表adapter
 */
public class MyPostAdapter extends BaseAdapter {
    private List<SimplePost> postList;
    private Context context;

    public MyPostAdapter(Context context, List<SimplePost> postList) {
        this.context = context;
        this.postList = postList;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == postList.size()) {
            return TYPE_LOADMORE;
        } else {
            return TYPE_NORMAL;
        }
    }

    @Override
    public int getItemCount() {
        return postList.size() + 1;
    }

    @Override
    protected int getDataCount() {
        return postList.size() > 0 ? 1 : postList.size();
    }

    @Override
    protected int getItemType(int pos) {
        if (pos == postList.size()) {
            return TYPE_LOADMORE;
        } else {
            return TYPE_NORMAL;
        }
    }

    @Override
    protected BaseAdapter.BaseViewHolder getItemViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post_me, parent, false);
        NormalViewHolder viewHolder = new NormalViewHolder(view);
        return viewHolder;
    }

    //改变状态
    public void changeLoadMoreState(int i) {
        this.loadState = i;
        notifyItemChanged(0);
    }

    class NormalViewHolder extends BaseViewHolder {
        @BindView(R.id.article_title)
        TextView articleTitle;
        @BindView(R.id.post_time)
        TextView postTime;
        @BindView(R.id.author_name)
        TextView authorName;

        NormalViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @Override
        void setData(int pos) {
            SimplePost object = postList.get(pos);
            articleTitle.setText(object.getTitle());
            postTime.setText(" " + object.getUpdated_at());
            authorName.setText(App.getUserName());
        }
    }
}
