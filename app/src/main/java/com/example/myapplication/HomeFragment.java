package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import org.w3c.dom.Text;

import java.util.Date;


public class HomeFragment extends Fragment {

    HomeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton imageButton =(ImageButton) view.findViewById(R.id.btndogwalker);
        ImageButton imageButton1 =(ImageButton) view.findViewById(R.id.btnchat);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.btnmais);
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.btnnoti);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton imageButton4 = (ImageButton) view.findViewById(R.id.btnperf);
      



        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), DogWalkerActivity.class));
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), ChatActivity.class));
            }
        });

        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder (getContext());
        String [] lista = new String[]{".....","......","....."};
        boolean[] chek = new boolean[lista.length];
        imageButton2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialAlertDialogBuilder.setTitle("Mais");
                materialAlertDialogBuilder.setMultiChoiceItems(lista, chek, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                    }
                });

                materialAlertDialogBuilder.show();

            }
        });

        String [] lista2 = new String[]{"Notificação_1","Notificação_2","Notificação_3"};
        boolean[] chek2 = new boolean[lista.length];
        imageButton3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialAlertDialogBuilder.setTitle("Notificação");
                materialAlertDialogBuilder.setMultiChoiceItems(lista2, chek2, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                    }
                });

                materialAlertDialogBuilder.show();

            }
        });


        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialAlertDialogBuilder.setTitle("Configurações");
                materialAlertDialogBuilder.setIcon(R.drawable.icon_menu);
                materialAlertDialogBuilder.setNegativeButton("Logoff",(dialog, which) -> onStop());
;                materialAlertDialogBuilder.show();
            }
        });




         return view;
    }

}