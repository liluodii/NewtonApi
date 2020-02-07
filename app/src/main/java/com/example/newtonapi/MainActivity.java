package com.example.newtonapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
<<<<<<< HEAD
import android.widget.EditText;
=======
import android.view.MenuItem;
import android.widget.Toast;
>>>>>>> 27b63489fc36b53afb6e97245b3522af84b7cf14

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public Toolbar toolbar;
    public DrawerLayout drawerLayout;
    public NavController navController;
    public NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD






=======
        setUpNavigation();

    }

    public void setUpNavigation(){
//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);

        navController = Navigation.findNavController(this,R.id.hostFragment);

        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout);
        NavigationUI.setupWithNavController(navigationView,navController);

        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();

        }

    }


    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(Navigation.findNavController(this,R.id.hostFragment),drawerLayout);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        menuItem.setCheckable(true); //to highlight the fragments
        drawerLayout.closeDrawers();

        int id = menuItem.getItemId();

        switch (id){
            case R.id.firstFragment:
                Toast.makeText(getApplicationContext(),"first clicked",Toast.LENGTH_LONG).show();
                navController.navigate(R.id.first_fragment);
                break;
            case R.id.secondFragment:
                Toast.makeText(getApplicationContext(),"second clicked",Toast.LENGTH_LONG).show();
                navController.navigate(R.id.second_fragment);
                break;

            case R.id.thirdFragment:
                Toast.makeText(getApplicationContext(),"third clicked",Toast.LENGTH_LONG).show();
                navController.navigate(R.id.third_fragment);
                break;
        }


        return true;
>>>>>>> 27b63489fc36b53afb6e97245b3522af84b7cf14
    }
}
