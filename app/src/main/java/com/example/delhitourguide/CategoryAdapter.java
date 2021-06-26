package com.example.delhitourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CategoryAdapter extends FragmentStatePagerAdapter{

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return new MonumentsFragment();
           case 1:
               return new RestaurantsFragmemt();
           case 2:
               return new MallsFragment();
           case 3:
               return new MarketsFragment();
           case 4:
               return new NightlifeFragment();
           default:
               return null;
       }
    }

    @Override
    public int getCount() {
        return 5;
    }


    public CharSequence getPageTitle(int position) {
       switch (position){
           case 0:
               return mContext.getString(R.string.category_monuments);
           case 1:
               return mContext.getString(R.string.category_restaurants);
           case 2:
               return mContext.getString(R.string.category_malls);
           case 3:
               return mContext.getString(R.string.category_markets);
           case 4:
               return mContext.getString(R.string.category_nightlife);
           default:
               return null;
       }
    }
}
