package com.example.testdos;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> arraylist = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return arraylist.get(position);
    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }

    public void addFragment(Fragment fragment){arraylist.add(fragment);}
}
