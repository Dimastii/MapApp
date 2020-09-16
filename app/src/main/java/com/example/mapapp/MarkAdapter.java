package com.example.mapapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MarkAdapter extends RecyclerView.Adapter<MarkAdapter.MarkViewHolder> {

    private final List<Token> marks;

    public MarkAdapter(List<Token> marks) {
        this.marks = marks;
    }

    @NonNull
    @Override
    public MarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.move_item_in_slide_pannel, parent, false);
        return new MarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MarkViewHolder holder, int position) {
        holder.bind(marks.get(position));
    }

    @Override
    public int getItemCount() {
        return marks.size();
    }

    static final class MarkViewHolder extends RecyclerView.ViewHolder{

        private  final TextView keyTextView;
        private  final TextView titleTextView;

        public MarkViewHolder(@NonNull View itemView) {
            super(itemView);
            keyTextView = itemView.findViewById(R.id.move_item_in_slide_pannel_key);
            titleTextView = itemView.findViewById(R.id.move_item_in_slide_pannel_title);
        }
        private void bind(@NonNull Token Mark){
            keyTextView.setText(Mark.key);
            titleTextView.setText(Mark.title);
        }
    }

}
