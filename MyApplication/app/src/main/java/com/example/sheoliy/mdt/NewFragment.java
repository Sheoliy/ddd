package com.example.sheoliy.mdt;

/**
 * Created by Sheoliy on 2017/9/10.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ImageView;


public class NewFragment extends Fragment {
 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab01, container, false);
        ImageView imageView2 = ( ImageView ) view.findViewById(R.id.imageView_2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), New_CardActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
                getActivity().startActivity(intent);
            }
        });
        ImageView imageView3 = ( ImageView ) view.findViewById(R.id.imageView_3);
        imageView3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getActivity(), New_netActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
             getActivity().startActivity(intent);
         }
         });
        ImageView imageView4 = ( ImageView ) view.findViewById(R.id.imageView_4);
        imageView4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getActivity(), New_CartimeActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
             getActivity().startActivity(intent);
         }
         });
        ImageView imageView5 = ( ImageView ) view.findViewById(R.id.imageView_5);
        imageView5.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getActivity(), New_AttentionActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
             getActivity().startActivity(intent);
         }
         });
        ImageView imageView6 = ( ImageView ) view.findViewById(R.id.imageView_6);
        imageView6.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getActivity(), New_ProgressActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
             getActivity().startActivity(intent);
         }
         });
        ImageView imageView7 = ( ImageView ) view.findViewById(R.id.imageView_7);
        imageView7.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getActivity(), New_netActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
             getActivity().startActivity(intent);
         }
         });
        ImageView imageView8 = ( ImageView ) view.findViewById(R.id.imageView_8);
        imageView8.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getActivity(), New_netActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
             getActivity().startActivity(intent);
         }
         });
        ImageView imageView1 = ( ImageView ) view.findViewById(R.id.imageView_1);
        imageView1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getActivity(), New_netActivity.class); //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
             getActivity().startActivity(intent);
         }
         });
     return view;
    }
}

