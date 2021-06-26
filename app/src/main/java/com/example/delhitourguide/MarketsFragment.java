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
 * Use the {@link MarketsFragment} factory method to
 * create an instance of this fragment.
 */
public class MarketsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =   inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Dilli Haat", "Sri Aurobindo Marg", R.drawable.dillihaat));
        places.add(new Place("Janpath Market", "Janpath", R.drawable.janpathmarker));
        places.add(new Place("Khan Market", "Humayun Road", R.drawable.khanmarket));
        places.add(new Place("Sarojini Market", "Sarojini Nagar", R.drawable.sarojinimarket));
        places.add(new Place("Chandini Chowk", "Chandani Chowk, Old Delhi", R.drawable.chandnichowkmarket));
        places.add(new Place("Central Market", "Lajpat Nagar", R.drawable.centralmarket));
        places.add(new Place("Canaught Place", "Canaught Place, New Delhi", R.drawable.canaughtplacemarket));
        places.add(new Place("Karol Bagh Market", "Karol Bagh" , R.drawable.karolbaghmarket));
        places.add(new Place("Paharganj Bazaar", "Paharganj", R.drawable.paharganjmarket));
        places.add(new Place("Palika Baazar", "Canaught Place", R.drawable.palikabazaar));
        places.add(new Place("Books Market", "Daryaganj", R.drawable.bookmarket));
        places.add(new Place("Meena Bazaar", "Red Fort", R.drawable.meenabazaar));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_markets);

        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent dilliHaatIntent = new Intent(getActivity(), DilliHaatActivity.class);
                        startActivity(dilliHaatIntent);
                        break;
                    case 1:
                        Intent janpathMarketIntent = new Intent(getActivity(), JanpathMarketActivity.class);
                        startActivity(janpathMarketIntent);
                        break;
                    case 2:
                        Intent khanMarketIntent = new Intent(getActivity(), KhanMarketActivity.class);
                        startActivity(khanMarketIntent);
                        break;
                    case 3:
                        Intent sarojiniMarketIntent = new Intent(getActivity(), SarojiniMarketActvity.class);
                        startActivity(sarojiniMarketIntent);
                        break;
                    case 4:
                        Intent chandiniChowkMarketIntent = new Intent(getActivity(), ChandiniChowkMarket.class);
                        startActivity(chandiniChowkMarketIntent);
                        break;
                    case 5:
                        Intent centralMarketIntent = new Intent(getActivity(), CentralMarketActivity.class);
                        startActivity(centralMarketIntent);
                        break;
                    case 6:
                        Intent canaugtPlaceMarketIntent = new Intent(getActivity(), CanaughtPlaceMarketActivity.class);
                        startActivity(canaugtPlaceMarketIntent);
                        break;
                    case 7:
                        Intent karolBaghMarketIntent = new Intent(getActivity(), KarolBaghMarketActivity.class);
                        startActivity(karolBaghMarketIntent);
                        break;
                    case 8:
                        Intent paharganjMarketIntent = new Intent(getActivity(), PaharganjMarketActivity.class);
                        startActivity(paharganjMarketIntent);
                        break;
                    case 9:
                        Intent palikaBazaarIntent = new Intent(getActivity(), PalikaBazaarMarketActivity.class);
                        startActivity(palikaBazaarIntent);
                        break;
                    case 10:
                        Intent bookMarketIntent = new Intent(getActivity(), BooksMarketActivity.class);
                        startActivity(bookMarketIntent);
                        break;
                    case 11:
                        Intent meenaBazaarIntent = new Intent(getActivity(), MeenaBazaarActivity.class);
                        startActivity(meenaBazaarIntent);
                        break;
                }
            }
        });
        return rootview;
    }
}