package com.example.victor.placesearch_android.mainfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.victor.placesearch_android.R;

public class MainFragment extends Fragment {
    public static final String ARGS_PAGE = "args_page";
    public static final String PLACE_ID = "place_id";
    private int mPage;

    public static MainFragment newInstance(int page) {
        Bundle args = new Bundle();

        args.putInt(ARGS_PAGE, page);

        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARGS_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("第" + mPage + "页");
        return view;
    }
}