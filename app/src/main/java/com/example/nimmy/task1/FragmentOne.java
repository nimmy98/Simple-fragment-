package com.example.nimmy.task1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nimmy on 30-01-2017.
 */

public class FragmentOne extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

      View view = inflater.inflate(R.layout.fragmentone,container,false);

        return view;
    }


}
