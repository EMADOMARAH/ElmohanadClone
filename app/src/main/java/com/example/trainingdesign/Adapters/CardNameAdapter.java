package com.example.trainingdesign.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.trainingdesign.Models.cardModel1;
import com.example.trainingdesign.R;

import java.util.List;

public class CardNameAdapter extends RecyclerView.Adapter<CardNameAdapter.CardName> {

    List<cardModel1> cardModel1s;
    cardModel1 cardModel1;
    String intentname;
    ItemCardListener listener;



    public CardNameAdapter(List<cardModel1> cardModel1s, ItemCardListener listener) {
        this.cardModel1s = cardModel1s;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CardName onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new CardName(view,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CardName holder, int position) {
         cardModel1 = cardModel1s.get(position);
         holder.serviceName.setText(cardModel1.getTextfield());
         //holder.BackImg.setImageResource();
        Glide.with(holder.itemView.getContext())
        .load(cardModel1.getImage())
        .override(200)
        .error(R.drawable.bg_overlay)
        .placeholder(R.drawable.bg_overlay)
        .into(holder.BackImg);



    }

    @Override
    public int getItemCount() {
        return cardModel1s.size();
    }



    public class CardName extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView serviceName;
        ImageView BackImg;
        ItemCardListener listener;

        public CardName(@NonNull View itemView , ItemCardListener listener) {
            super(itemView);

           serviceName = itemView.findViewById(R.id.item_home_category_name);
           BackImg = itemView.findViewById(R.id.item_home_category_image);

           this.listener = listener;

           itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            listener.onCardClicked(getAdapterPosition());

        }
    }
    public interface ItemCardListener {
        void onCardClicked(int position);

    }
}
