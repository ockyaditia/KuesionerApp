package com.project.ockyaditiasaputra.kuesionerapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ocky Aditia Saputra on 31/08/2016.
 */
public class RegisterActivity extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_register, container, false);

        TextView login = (TextView) view.findViewById(R.id.login);
        login .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame
                                , new LoginActivity())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}
