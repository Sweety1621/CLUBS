package com.example.my_dash;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int tabCount;
    public PagerController(@NonNull FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new Departmental();
            case 1:
                return new Technical();
            case 2:
                return new Cultural();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
