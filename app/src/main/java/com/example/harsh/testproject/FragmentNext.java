package com.example.harsh.testproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentNext extends Fragment {
    Button next, previous;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_next, container, false);
        next = (Button)view.findViewById(R.id.next);
        previous = (Button)view.findViewById(R.id.previous);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentLast fragmentlast = new FragmentLast();
                getFragmentManager().beginTransaction()
                        .replace(R.id.linearLL,fragmentlast)
                        .addToBackStack("")
                        .commit();
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return view;
    }
}