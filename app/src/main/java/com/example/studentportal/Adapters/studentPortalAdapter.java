package com.example.studentportal.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentportal.Models.studentPortalModel;
import com.example.studentportal.R;

import java.util.ArrayList;

public class studentPortalAdapter extends RecyclerView.Adapter<studentPortalAdapter.viewHolder> {

    ArrayList<studentPortalModel> list;
    Context context;

    public studentPortalAdapter(ArrayList<studentPortalModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_recyclarview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        studentPortalModel model=list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

             ImageView imageView;
             TextView textView;
             public viewHolder(@NonNull View itemView) {
                 super(itemView);
                 // Initialize the views in the item layout
                 imageView=itemView.findViewById(R.id.imageView);
                 textView=itemView.findViewById(R.id.textView);
             }
         }


}
