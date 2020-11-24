package com.example.testdos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter adapter;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.view_pager2);
        adapter = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());

        //Add Fragment
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new AccountFragment());
        adapter.addFragment(new SettingsFragment());

        viewPager2.setAdapter(adapter);

        TabLayout tablayout = findViewById(R.id.tab_layout);

        new TabLayoutMediator(tablayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Home");
                        break;
                    case 1:
                        tab.setText("Account");
                        break;
                    case 2:
                        tab.setText("Settings");
                        break;
                }
            }
        }).attach();

    }
}