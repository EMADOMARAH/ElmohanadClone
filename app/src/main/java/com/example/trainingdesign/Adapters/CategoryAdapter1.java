package com.example.trainingdesign.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Models.CategoryModel;
import com.example.trainingdesign.R;

import java.util.List;

public class CategoryAdapter1 extends RecyclerView.Adapter<CategoryAdapter1.CategoryVH>
{
    List<CategoryModel> categorylist;
    CategoryModel categoryModel;

    public CategoryAdapter1(List<CategoryModel> categorylist) {
        this.categorylist = categorylist;
    }

    @NonNull
    @Override
    public CategoryVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item1,parent,false);
        return new CategoryVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryVH holder, int position)
    {
       categoryModel = categorylist.get(position) ;

       holder.categoryName.setText(categoryModel.getCategoryName());
       holder.categoryImage.setImageResource(categoryModel.getCategoryimage());



    }

    @Override
    public int getItemCount() {
        return categorylist.size();
    }

    public class CategoryVH extends RecyclerView.ViewHolder
    {
        TextView categoryName;
        ImageView categoryImage;


        public CategoryVH(@NonNull View itemView)
        {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.category_image);
            categoryName = itemView.findViewById(R.id.title_txt);
        }
    }

}
