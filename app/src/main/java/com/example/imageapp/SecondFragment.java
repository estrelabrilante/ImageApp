package com.example.imageapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondFragment extends Fragment {

   ImageView imageView;
   TextView textView;
    public SecondFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        textView = view.findViewById(R.id.textViewCityName);
        imageView = view.findViewById(R.id.imageView);

        Bundle bundle = getArguments();
       int position = bundle.getInt("position",0);
       if (position == 0){
           textView.setText("Berlin");
           imageView.setImageResource(R.drawable.berlin);

       }
       else if(position == 1){
           textView.setText("Athens");
           imageView.setImageResource(R.drawable.athens);
       }
       else if(position == 2){
           textView.setText("Rome");
           imageView.setImageResource(R.drawable.rome);
       }
       else if(position == 3){
           textView.setText("Tokyo");
           imageView.setImageResource(R.drawable.tokyo);
       }
       else if(position == 4){
           textView.setText("Amsterdam");
           imageView.setImageResource(R.drawable.amsterdam);
       }


        return view;
    }
}