package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import org.w3c.dom.Text;

import java.net.CookieManager;


public class DogWalkerActivity extends AppCompatActivity {

   CardView cardView;
   ImageButton imageButton,imageButton1;

   Button button1,button;
   
   

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog_walker_layout);

        cardView=findViewById(R.id.cardperfil);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PerfilActivity.class));
            }
        });

        imageButton =findViewById(R.id.btnvoltar);
        imageButton1=findViewById(R.id.btnchat);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ChatActivity.class));
            }
        });
        MaterialAlertDialogBuilder materialAlertDialogBuilder= new MaterialAlertDialogBuilder(this);
        String [] lista = new String[]{"20/Sep - 22/Sep","29/Sep - 30/Sep","5/Out - 8/out"};
        boolean[] chek = new boolean[lista.length];
        button1 =findViewById(R.id.btnage);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            materialAlertDialogBuilder.setTitle("Disponibilidade");
            materialAlertDialogBuilder.setMultiChoiceItems(lista, chek, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                }
            });

            materialAlertDialogBuilder.show();


            }
        });


        MaterialAlertDialogBuilder materialAlertDialogBuilder2= new MaterialAlertDialogBuilder(this);
        String [] lista2 = new String[]{"Filtro_1","Filtro_2","Filtro_3"};
        boolean[] chek2= new boolean[lista.length];
        button =findViewById(R.id.btnfiltro);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                materialAlertDialogBuilder.setTitle("Filtros");
                materialAlertDialogBuilder.setMultiChoiceItems(lista2, chek2, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                    }
                });

                materialAlertDialogBuilder.show();


            }
        });
   }


}