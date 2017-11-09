package com.example.sheoliy.mdt;

/**
 * Created by Sheoliy on 2017/9/10.
*/
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LiveFragment extends Fragment {
    public LiveFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab03, container, false);
    }
}
