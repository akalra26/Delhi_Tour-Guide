package com.example.delhitourguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NightlifeFragment} factory method to
 * create an instance of this fragment.
 */
public class NightlifeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =   inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Kitty Su", "The Lalit, Canaught Place", R.drawable.kittysu));
        places.add(new Place("Shiro", "Hotel Samrat, Chanakyapuri", R.drawable.shiro));
        places.add(new Place("The Blue Bar","Taj Diplomatic Enclave", R.drawable.bluebar));
        places.add(new Place("Keya", "Vasant Kunj", R.drawable.keya));
        places.add(new Place("Hard Rock Cafe", "Saket", R.drawable.hardrockcafe));
        places.add(new Place("Hybrid", "Janpath Road", R.drawable.hybrid));
        places.add(new Place("TC Bar and Restaurant", "Canaught Place", R.drawable.tcbar));
        places.add(new Place("Mocha Art Place", "Vasant Kunj", R.drawable.mochaartplace));
        places.add(new Place("Little Owl Cafe", "Sector 18, Noida", R.drawable.littleowlcafe));
        places.add(new Place("Comesum", "Nizamudin", R.drawable.comesum));
        places.add(new Place("Monkey Bar", "Canaught Place", R.drawable.monkeybar));
        places.add(new Place("Light, Camera and Action", "Rajouri Garden", R.drawable.lightscameraaction));
        places.add(new Place("My Bar HQ", "Canaught Place", R.drawable.mybarhq));
        places.add(new Place("Club London", "Saket", R.drawable.clublondon));
        places.add(new Place("Lithiyum", "Diplomatic Enclave", R.drawable.lithiyum));
        places.add(new Place("Club BW", "New Friends Colony", R.drawable.clubbw));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_nightlife);
        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent kittysuIntent = new Intent(getActivity(), KittysuActivity.class);
                        startActivity(kittysuIntent);
                        break;
                    case 1:
                        Intent shiroIntent = new Intent(getActivity(), ShiroActivity.class);
                        startActivity(shiroIntent);
                        break;
                    case 2:
                        Intent blueBarIntent = new Intent(getActivity(), BlueBarActivity.class);
                        startActivity(blueBarIntent);
                        break;
                    case 3:
                        Intent keyaIntent = new Intent(getActivity(), KeyaActivity.class);
                        startActivity(keyaIntent);
                        break;
                    case 4:
                        Intent hardRockCafeIntent = new Intent(getActivity(), HardRockCafeActivity.class);
                        startActivity(hardRockCafeIntent);
                        break;
                    case 5:
                        Intent hybridIntent = new Intent(getActivity(), HybridActivity.class);
                        startActivity(hybridIntent);
                        break;
                    case 6:
                        Intent tcBarIntent = new Intent(getActivity(), TCBarActivity.class);
                        startActivity(tcBarIntent);
                        break;
                    case 7:
                        Intent mochaIntent = new Intent(getActivity(), MochaArtPlaceActivity.class);
                        startActivity(mochaIntent);
                        break;
                    case 8:
                        Intent littleOwlIntent = new Intent(getActivity(), LittleOwlActivity.class);
                        startActivity(littleOwlIntent);
                        break;
                    case 9:
                        Intent comesumIntent = new Intent(getActivity(), ComesumActivity.class);
                        startActivity(comesumIntent);
                        break;
                    case 10:
                        Intent monekyBarIntent = new Intent(getActivity(), MonkeyBarActivity.class);
                        startActivity(monekyBarIntent);
                        break;
                    case 11:
                        Intent lightCameraIntent = new Intent(getActivity(), LightCameraActionActivity.class);
                        startActivity(lightCameraIntent);
                        break;
                    case 12:
                        Intent myBarIntent = new Intent(getActivity(), MyBarActivity.class);
                        startActivity(myBarIntent);
                        break;
                    case 13:
                        Intent clubLondonIntent = new Intent(getActivity(), ClubLondonActivity.class);
                        startActivity(clubLondonIntent);
                        break;
                    case 14:
                        Intent lithiyumIntent = new Intent(getActivity(), LithiyumActivity.class);
                        startActivity(lithiyumIntent);
                        break;
                    case 15:
                        Intent clubBWIntent = new Intent(getActivity(), ClubBWActivity.class);
                        startActivity(clubBWIntent);
                        break;
                }
            }
        });
        return rootview;
    }

}