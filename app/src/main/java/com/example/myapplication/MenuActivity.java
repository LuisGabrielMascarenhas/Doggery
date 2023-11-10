package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        bottomNavigationView=findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }
    HomeFragment homeFragment= new HomeFragment();
    PedidosFragment pedidosFragment = new PedidosFragment();
    AgendaFragment agendaFragment = new AgendaFragment();
    PerfilUsuFragment perfilUsuFragment = new PerfilUsuFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.home){
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,homeFragment).commit();}
        else if (item.getItemId()==R.id.menupaw) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,pedidosFragment).commit();}
        else if (item.getItemId()==R.id.data) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,agendaFragment).commit();}
        else if (item.getItemId()==R.id.perfil) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,perfilUsuFragment).commit();}


        return false;
    }

}