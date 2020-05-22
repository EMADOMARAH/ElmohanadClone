package com.example.trainingdesign.Adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Models.Fe2atModel;
import com.example.trainingdesign.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fe2atAdapter extends RecyclerView.Adapter<Fe2atAdapter.Fe2atViewHolder> {

    Fe2atModel fe2atModel;
    private Context context;
    private List<Fe2atModel> fe2atModels;
    private ItemCardListener listener;



    public Fe2atAdapter(Context context, List<Fe2atModel> fe2atModels,ItemCardListener listener) {
        this.context = context;
        this.fe2atModels = fe2atModels;
        this.listener= listener;
    }

    @NonNull
    @Override
    public Fe2atViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_sales_item, parent, false);
        return new Fe2atViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull Fe2atViewHolder holder, int position) {

        fe2atModel = fe2atModels.get(position);
        holder.name.setText(fe2atModel.getCardName());
        holder.type.setText(fe2atModel.getCardQuantity());
        holder.quantity.setText((int)fe2atModel.getCardPrice() + "");
        holder.buyNow.setText("اشتري ب" + (int) fe2atModel.getCardPrice()+" ريال");
        holder.imageView.setImageResource(fe2atModel.getCardThumbnail());
        holder.layout.setBackground(context.getDrawable(fe2atModel.getCardBackGround()));
    }

    @Override
    public int getItemCount() {
        return fe2atModels.size();
    }

    public interface ItemCardListener {
        void onCardBought(Fe2atModel cardModel);

        void onCardAddedToWishList(Fe2atModel cardModel);
    }
    //  private ItemCardListener listener;

    public class Fe2atViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imageView;
        private TextView name, type, quantity;
        private Button buyNow, wishList;
        private ConstraintLayout layout;

        public Fe2atViewHolder(@NonNull View itemView) {
            super(itemView);

            layout = itemView.findViewById(R.id.item_home_most_container);
            name = itemView.findViewById(R.id.item_home_most_name);
            type = itemView.findViewById(R.id.item_home_most_type);
            quantity = itemView.findViewById(R.id.item_home_most_quantity);
            imageView = itemView.findViewById(R.id.item_home_most_pic);
            buyNow = itemView.findViewById(R.id.item_home_most_buyNow);
            wishList = itemView.findViewById(R.id.item_home_most_wishList);

            buyNow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onCardBought(fe2atModels.get(getAdapterPosition()));
                }
            });
            wishList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onCardAddedToWishList(fe2atModels.get(getAdapterPosition()));
                }
            });
        }
    }
}
