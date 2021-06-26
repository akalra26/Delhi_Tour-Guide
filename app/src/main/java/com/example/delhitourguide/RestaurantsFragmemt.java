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
 * Use the {@link RestaurantsFragmemt#} factory method to
 * create an instance of this fragment.
 */
public class RestaurantsFragmemt extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Berco's", "Canaught Place", R.drawable.bercos));
        places.add(new Place("Olive Bar and Kitchen", "Mehruali", R.drawable.olivebar));
        places.add(new Place("Farzi Cafe", "Canaught Place", R.drawable.farzicafe));
        places.add(new Place("Indian Accent", "Lodhi Road", R.drawable.indianaccent));
        places.add(new Place("Pind Baluchi", "Janpath", R.drawable.pindbaluchi));
        places.add(new Place("Moti Mahal Delux", "Greater Kailash", R.drawable.motimahaldelux));
        places.add(new Place("Hauz Khas Social", "Hauz Khas Village", R.drawable.hauzkhassocial));
        places.add(new Place("Ardor 2.1", "Canaught Place", R.drawable.ardor));
        places.add(new Place("Ama Cafe", "Majnu ka Tila", R.drawable.amacafe));
        places.add(new Place("Lord of Drinks", "Canaught Place", R.drawable.lordofdrinks));
        places.add(new Place("Summer House Cafe", "Hauz Khas", R.drawable.summerhousecafe));
        places.add(new Place("Diggin", "Anand Lok", R.drawable.diggin));
        places.add(new Place("Naivedeyam", "Hauz Khas Village", R.drawable.naivedeyam));
        places.add(new Place("Naturals Ice Cream", "Canaught Place", R.drawable.naturalsicecream));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);
        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent bercosIntent = new Intent(getActivity(), BercosActivity.class);
                        startActivity(bercosIntent);
                        break;
                    case 1:
                        Intent olivebarIntent = new Intent(getActivity(), OliveBarActivity.class);
                        startActivity(olivebarIntent);
                        break;
                    case 2:
                        Intent farziCafeIntent = new Intent(getActivity(), FarziCafeActivity.class);
                        startActivity(farziCafeIntent);
                        break;
                    case 3:
                        Intent indianAccentIntent = new Intent(getActivity(), IndianAccentActivity.class);
                        startActivity(indianAccentIntent);
                        break;
                    case 4:
                        Intent pindBaluchiIntent = new Intent(getActivity(), PindBaluchiActivity.class);
                        startActivity(pindBaluchiIntent);
                        break;
                    case 5:
                        Intent motiMahalIntent = new Intent(getActivity(), MotiMahalDeluxActivity.class);
                        startActivity(motiMahalIntent);
                        break;
                    case 6:
                        Intent hauzkhasSocialIntent = new Intent(getActivity(), HauzKhasSocialActivity.class);
                        startActivity(hauzkhasSocialIntent);
                        break;
                    case 7:
                        Intent ardorIntent = new Intent(getActivity(), ArdorActivity.class);
                        startActivity(ardorIntent);
                        break;
                    case 8:
                        Intent amaCafeIntent = new Intent(getActivity(), AmaCafeActivity.class);
                        startActivity(amaCafeIntent);
                        break;
                    case 9:
                        Intent lordofDrinksIntent = new Intent(getActivity(), LordofDrinksActivity.class);
                        startActivity(lordofDrinksIntent);
                        break;
                    case 10:
                        Intent summerHouseCafeIntent = new Intent(getActivity(), SummerHouseCafeActivity.class);
                        startActivity(summerHouseCafeIntent);
                        break;
                    case 11:
                        Intent digginActivityIntent = new Intent(getActivity(), DigginActivity.class);
                        startActivity(digginActivityIntent);
                        break;
                    case 12:
                        Intent naivedeyamActivityIntent = new Intent(getActivity(), NaiveDeyamActivity.class);
                        startActivity(naivedeyamActivityIntent);
                        break;
                    case 13:
                        Intent naturalsIceCreamIntent = new Intent(getActivity(), NaturalsIceCreamActivity.class);
                        startActivity(naturalsIceCreamIntent);
                        break;
                }
            }
        });
        return rootview;
    }
}