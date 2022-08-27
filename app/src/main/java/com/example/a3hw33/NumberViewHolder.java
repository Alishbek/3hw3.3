package com.example.a3hw33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewNumber;

    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewNumber = itemView.findViewById(R.id.text_view_number);
    }

    public void bind(String number){
        textViewNumber.setText(number);
    }


}
