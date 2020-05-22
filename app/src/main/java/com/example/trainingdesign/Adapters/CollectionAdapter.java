package com.example.trainingdesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Models.CollectionModel;
import com.example.trainingdesign.R;

import java.util.List;

public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.VH> {
    private Context context;
    private List<CollectionModel> collectionModelList;
    private ItemCollectionListener listener;

    public CollectionAdapter(List<CollectionModel> collectionModelList, ItemCollectionListener listener) {
        this.collectionModelList = collectionModelList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new VH(LayoutInflater.from(context).inflate(R.layout.item_collection, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        CollectionModel collectionModel = collectionModelList.get(position);
        holder.textView.setText(collectionModel.getCollectionName());
        holder.imageView.setImageResource(collectionModel.getCollectionThumbnail());
    }

    @Override
    public int getItemCount() {
        return collectionModelList.size();
    }

    public interface ItemCollectionListener {
        void onItemSelected(int position, CollectionModel collectionModel);
    }

    class VH extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;

        VH(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.item_collection_name);
            imageView = itemView.findViewById(R.id.item_collection_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemSelected(getAdapterPosition(),collectionModelList.get(getAdapterPosition()));
                }
            });
        }
    }
}
