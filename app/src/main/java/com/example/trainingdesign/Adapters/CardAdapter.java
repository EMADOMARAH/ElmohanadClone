package com.example.trainingdesign.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Models.CardModel;
import com.example.trainingdesign.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.VH> {
    private Context context;
    private List<CardModel> cardModelList;
    private ItemCardListener listener;

    public CardAdapter(List<CardModel> cardModelList, ItemCardListener listener) {
        this.cardModelList = cardModelList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new VH(LayoutInflater.from(context).inflate(R.layout.item_card, parent, false));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        CardModel cardModel = cardModelList.get(position);

        holder.name.setText(cardModel.getCardName());
        holder.quantity.setText(cardModel.getCardQuantity());
        if (cardModel.getCardPrice() % 1 == 0) {
            holder.buyNow.setText("اشتري ب" + cardModel.getCardPrice() + " ريال");
        } else {
            holder.buyNow.setText("اشتري ب" + cardModel.getCardPrice() + " ريال");
        }
        holder.imageView.setImageResource(cardModel.getCardThumbnail());
        holder.layoutBack.setBackground(context.getDrawable(cardModel.getCardBackGround()));

        if (cardModel.getStoreThumb() == 0) {
            holder.layoutStore.setVisibility(View.GONE);
        } else {
            holder.layoutStore.setVisibility(View.VISIBLE);
            holder.storePic.setImageResource(cardModel.getStoreThumb());
        }
    }

    @Override
    public int getItemCount() {
        return cardModelList.size();
    }

    public interface ItemCardListener {
        void onCardBought(CardModel cardModel);

        void onCardAddedToWishList(CardModel cardModel);
    }

    @SuppressWarnings("FieldCanBeLocal")
    class VH extends RecyclerView.ViewHolder {
        private CircleImageView imageView, storePic;
        private TextView name, quantity;
        private Button buyNow, wishList;
        private ConstraintLayout layoutBack;
        private LinearLayout layoutStore;

        VH(@NonNull View itemView) {
            super(itemView);

            layoutBack = itemView.findViewById(R.id.item_card_container);
            name = itemView.findViewById(R.id.item_card_name);
            quantity = itemView.findViewById(R.id.item_card_quantity);
            imageView = itemView.findViewById(R.id.item_card_pic);
            buyNow = itemView.findViewById(R.id.item_card_buyNow);
            wishList = itemView.findViewById(R.id.item_card_wishList);
            layoutStore = itemView.findViewById(R.id.item_card_storeLayout);
            storePic = itemView.findViewById(R.id.item_card_store);

            buyNow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onCardBought(cardModelList.get(getAdapterPosition()));
                }
            });
            wishList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onCardAddedToWishList(cardModelList.get(getAdapterPosition()));
                }
            });
        }
    }
}
