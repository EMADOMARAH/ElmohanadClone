package com.example.trainingdesign.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trainingdesign.Adapters.NotoficationAdapter;
import com.example.trainingdesign.Models.NoticationModel;
import com.example.trainingdesign.R;

import java.util.ArrayList;


public class Notification extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    NotoficationAdapter notoficationAdapter;
    ArrayList<NoticationModel>noticationList;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.notification_recycle);
        layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);


        noticationList = new ArrayList<>();
        noticationList.add(new NoticationModel("عروض شركه موبيلى","16:20:21 2020-01-14","عروض شركه موبيلى"));
        noticationList.add(new NoticationModel("تنويه","16:20:21 2020-01-14","للاستفاده من مميزت التطبيق الرائعه"));
        noticationList.add(new NoticationModel("تنويه","16:20:21 2020-01-14","ادفع يبشه"));
        noticationList.add(new NoticationModel("تنويه","16:20:21 2020-01-14","عشه جنيه طيب والنبى"));
        noticationList.add(new NoticationModel("تنويه","16:20:21 2020-01-14","طب واحد بتتس "));
        noticationList.add(new NoticationModel("تنويه","16:20:21 2020-01-14","اااااااااااااااااه"));
        noticationList.add(new NoticationModel("تنويه","16:20:21 2020-01-14","طب قنيه وربع وامرى لله"));

       notoficationAdapter = new NotoficationAdapter(noticationList);
       recyclerView.setLayoutManager(layoutManager);
       recyclerView.setAdapter(notoficationAdapter);

    }
}
