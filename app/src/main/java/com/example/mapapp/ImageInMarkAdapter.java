package com.example.mapapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageInMarkAdapter extends RecyclerView.Adapter<ImageInMarkAdapter.ImageInMarkViewHolder> {
    private final List<Integer> image;
    public ImageInMarkAdapter(List<Integer> image){
            this.image = image;
    }
    @NonNull
    @Override
    public ImageInMarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.move_item_in__move_item_in___slide_pannel,parent,false);
        return new ImageInMarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageInMarkViewHolder holder, int position) {
        holder.bind(image.get(position));
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    static final class ImageInMarkViewHolder extends RecyclerView.ViewHolder{

        private final ImageView imageImageView;

        public ImageInMarkViewHolder(@NonNull View itemView) {
            super(itemView);
            imageImageView = itemView.findViewById(R.id.move_item_in_slide_pannel__RecyclerView___image);
        }
        private void bind(@NonNull Integer a){
            imageImageView.setImageResource(a);
        }
    }

}
