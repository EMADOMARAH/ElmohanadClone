package com.example.trainingdesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Models.StoreModel;
import com.example.trainingdesign.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.VH> {
    private Context context;
    private List<StoreModel> storeModelList;
    private ItemStoreListener listener;

    public StoreAdapter(List<StoreModel> storeModelList, ItemStoreListener listener) {
        this.storeModelList = storeModelList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new VH(LayoutInflater.from(context).inflate(R.layout.item_store, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.circleImageView.setImageResource(storeModelList.get(position).getStoreThumbnail());
        holder.textView.setText(storeModelList.get(position).getStoreName());
    }

    @Override
    public int getItemCount() {
        return storeModelList.size();
    }

    public interface ItemStoreListener {
        void onItemSelected(int position);
    }

    class VH extends RecyclerView.ViewHolder {
        private CircleImageView circleImageView;
        private TextView textView;

        VH(@NonNull View itemView) {
            super(itemView);

            circleImageView = itemView.findViewById(R.id.item_store_pic);
            textView = itemView.findViewById(R.id.item_store_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemSelected(getAdapterPosition());
                }
            });
        }
    }
}
