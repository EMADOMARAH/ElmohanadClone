package com.example.trainingdesign.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Models.NoticationModel;
import com.example.trainingdesign.R;

import java.util.List;
import java.util.zip.Inflater;

public class NotoficationAdapter extends RecyclerView.Adapter<NotoficationAdapter.NotificationViewHolder>
{
    List<NoticationModel>noticationModels;
    NoticationModel noticationModel;

    public NotoficationAdapter(List<NoticationModel> noticationModels) {
        this.noticationModels = noticationModels;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item,parent,false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position)
    {
        noticationModel = noticationModels.get(position);

        holder.title.setText(noticationModel.getTitle());
        holder.time.setText(noticationModel.getTime());
        holder.details.setText(noticationModel.getDetails());
    }

    @Override
    public int getItemCount() {
        return noticationModels.size();
    }

    public class NotificationViewHolder extends RecyclerView.ViewHolder
    {
        TextView title,time,details;

        public NotificationViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_txt);
            time = itemView.findViewById(R.id.date_txt);
            details = itemView.findViewById(R.id.details_txt);


        }
    }
}
