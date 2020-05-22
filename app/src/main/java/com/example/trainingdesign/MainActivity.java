package com.example.trainingdesign;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.trainingdesign.Fragments.HomeFragment;
import com.example.trainingdesign.Fragments.Menu;
import com.example.trainingdesign.Fragments.Notification;
import com.example.trainingdesign.Fragments.Offers;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {



    BottomNavigationView bottomNavigation;
    Menu menu;
    HomeFragment homeFragment;
    Notification notification;
    Offers offers;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu=new Menu();
        homeFragment = new HomeFragment();
        notification = new Notification();
        offers = new Offers();

        loadFragment(homeFragment);

        bottomNavigation = findViewById(R.id.bottomNav);
        bottomNavigation.getMenu().getItem(2).setEnabled(false);

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);

                switch (item.getItemId()) {
                    case R.id.menu:
                       loadFragment(menu);
                        break;
                    case R.id.offer:
                       loadFragment(offers);
                        break;
                            case R.id.notifi:
                        loadFragment(notification);
                        break;
                    case R.id.home:
                        loadFragment(homeFragment);
                        break;

                }

                return false;
            }
        });
    }

    private void loadFragment(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.containerFrags , fragment).commit();
    }


    public void tocart(View view)
    {
        Toast.makeText(MainActivity.this, "NotYet", Toast.LENGTH_SHORT).show();
    }
}
