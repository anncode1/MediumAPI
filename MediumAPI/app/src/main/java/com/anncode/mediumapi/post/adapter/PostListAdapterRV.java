package com.anncode.mediumapi.post.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anncode.mediumapi.R;
import com.anncode.mediumapi.post.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by anahisalgado on 20/06/17.
 */

public class PostListAdapterRV extends RecyclerView.Adapter<PostListAdapterRV.PostListAdapterViewHolder> {

    private ArrayList<Post> posts;
    private int resource;
    private Activity activity;

    public PostListAdapterRV(ArrayList<Post> posts, int resource, Activity activity) {
        this.posts = posts;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PostListAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PostListAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostListAdapterViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.tvStoryName.setText(post.getName());
        holder.tvStoryDescription.setText(post.getDescription());
        Picasso.with(activity).load(post.getImageUrl()).into(holder.pictureCard);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }


    public class PostListAdapterViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView tvStoryName;
        private TextView tvStoryDescription;


        public PostListAdapterViewHolder(View itemView) {
            super(itemView);

            pictureCard     = (ImageView) itemView.findViewById(R.id.pictureCard);
            tvStoryName    = (TextView) itemView.findViewById(R.id.tvStoryName);
            tvStoryDescription        = (TextView) itemView.findViewById(R.id.tvStoryDescription);

        }
    }
}
