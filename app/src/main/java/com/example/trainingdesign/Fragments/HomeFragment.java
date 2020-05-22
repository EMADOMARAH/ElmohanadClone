package com.example.trainingdesign.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Activity.Category;
import com.example.trainingdesign.Adapters.CardNameAdapter;
import com.example.trainingdesign.Adapters.Fe2atAdapter;
import com.example.trainingdesign.Models.Fe2atModel;
import com.example.trainingdesign.Models.cardModel1;
import com.example.trainingdesign.R;
import com.example.trainingdesign.Adapters.SliderAdapterExample;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.Random;

public class HomeFragment extends Fragment implements CardNameAdapter.ItemCardListener {

    public HomeFragment() {
        // Required empty public constructor
    }

    SliderView sliderView ;

    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.LayoutManager layoutManager1;
    ArrayList<cardModel1> cardModle ;
    ArrayList<Fe2atModel> Fe2atlist;
    Fe2atAdapter fe2atAdapter;
    CardNameAdapter cardNameAdapter;
    Fe2atModel fe2atModel;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sliderView = view.findViewById(R.id.sliderview);
     sliderView.setSliderAdapter(new SliderAdapterExample(getContext()));

        sliderView.startAutoCycle();
        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);

        recyclerView1 = view.findViewById(R.id.Cards_Views);
        recyclerView2 = view.findViewById(R.id.recycler2);
        layoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,true);
        layoutManager1 = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,true);



        cardModle = new ArrayList<>();
        cardModle.add(new cardModel1( "بطاقات اتصالات","https://beebom.com/wp-content/uploads/2016/12/blue-light-filter-apps-like-Flux-for-Android.jpg"));
        cardModle.add(new cardModel1( "بطاقات بيانات", "https://wallpaperplay.com/walls/full/c/e/5/77452.jpg"));
        cardModle.add(new cardModel1( "ايتونز", "https://media.idownloadblog.com/wp-content/uploads/2015/06/iTunes-El-Capitan-Wallaper-iPad-Blank-By-Jason-Zigrino.png"));
        cardModle.add(new cardModel1( "جوجل بلاى", "https://wallpaperaccess.com/full/1492987.jpg"));
        cardModle.add(new cardModel1( "بطاقات العاب", "https://wallpaperaccess.com/full/223111.jpg"));
        cardModle.add(new cardModel1( "بطاقات خدمات", "https://image.freepik.com/free-photo/beautiful-fireworks-glitter-bokeh-lighting-effect-blurred-abstract-background_34266-1054.jpg"));

        cardNameAdapter= new CardNameAdapter(cardModle,this);
        recyclerView1.setAdapter(cardNameAdapter);
        recyclerView1.setLayoutManager(layoutManager);



        Fe2atlist = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String[] names = new String[]{"سوا ", "موبايلي ", "زين", "ليبارا", "فيرجن", "فريندي"};
            int[] prices = new int[]{16, 21, 31, 52, 105, 210, 315};
            int[] quantities = new int[]{16, 20, 30, 50, 100, 200, 300};
            int[] thumbs = new int[]{R.drawable.stc, R.drawable.mobily, R.drawable.zain, R.drawable.lebara, R.drawable.virgin, R.drawable.friendi};
            int[] backs = new int[]{R.drawable.gd_stc, R.drawable.gd_mobily, R.drawable.gd_zain, R.drawable.gd_lebara, R.drawable.gd_virgin, R.drawable.gd_friendi};

            int r1 = random.nextInt(names.length);
            int r2 = random.nextInt(prices.length);

            String price;
            if (prices[r2] % 1 == 0) {
                price = ((int) prices[r2]) + " ريال";
            } else {
                price = prices[r2] + " ريال";
            }

            String quantity = quantities[r2] + " ريال";
            String name = names[r1] + " فئة " + price;

            Fe2atlist.add(new Fe2atModel(name, thumbs[r1], backs[r1], "رصيد بطاقة",prices[r1], thumbs[r1]));
        }

        fe2atAdapter= new Fe2atAdapter(getContext(), Fe2atlist, new Fe2atAdapter.ItemCardListener() {
            @Override
            public void onCardBought(Fe2atModel cardModel) {

                Toast.makeText(getContext(), "انت اشتريت يبشه", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onCardAddedToWishList(Fe2atModel cardModel) {
                Toast.makeText(getContext(), "تم الاضافه فى المفضله", Toast.LENGTH_SHORT).show();

            }
        });
        recyclerView2.setAdapter(fe2atAdapter);
        recyclerView2.setLayoutManager(layoutManager1);





    }


    @Override
    public void onCardClicked(int position) {

        Intent intent = new Intent(getContext(), Category.class);
        intent.putExtra("position" ,position);
        startActivity(intent);
    }
}
/*
           BackImg.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(view.getContext(),Category.class);
                   intentname = serviceName.toString();

                   intent.putExtra("name",intentname);
               }
           });*/