package com.example.mapapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MarkAdapter extends RecyclerView.Adapter<MarkAdapter.MarkViewHolder> {



    @NonNull
    @Override
    public MarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MarkViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static final class MarkViewHolder extends RecyclerView.ViewHolder{

        public MarkViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
