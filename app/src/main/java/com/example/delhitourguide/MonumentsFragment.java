package com.example.delhitourguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MonumentsFragment#} factory method to
 * create an instance of this fragment.
 */
public class MonumentsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =   inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Red Fort", "Chandani Chowk", R.drawable.redfort));
        places.add(new Place("Qutub Minar", "Mehrauli", R.drawable.qutubminar));
        places.add(new Place("India Gate", "New Delhi", R.drawable.indiagate));
        places.add(new Place("Humayun's Tomb", "Minto Road", R.drawable.humayuntomb));
        places.add(new Place("Safdarjung's Tomb", "Lodhi Estate", R.drawable.safdarjungtomb));
        places.add(new Place("Rashtrapati Bhawan", "Minto Road", R.drawable.rashtrapatibhawan));
        places.add(new Place("Purana Qila", "Mathura Road", R.drawable.puranqila));
        places.add(new Place("Jama Masjid", "Chandani Chowk", R.drawable.jamamasjid));
        places.add(new Place("Parliament House", "Sansad Marg", R.drawable.parliamenthouse));
        places.add(new Place("Tughlaqabad Fort", "Mehrauli- Badarpur Road", R.drawable.tughlaqabadfort));
        places.add(new Place("Chatarpur Temple", "Chatarpur", R.drawable.chatarpurtemple));
        places.add(new Place("Akshardham Temple", "Pandav Nagar", R.drawable.akshardhamtemple));
        places.add(new Place("Lotus Temple", "Kalkaji", R.drawable.lotustemple));
        places.add(new Place("Bangla Sahib Gurudwara", "Canaught Place", R.drawable.banglasahib));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_monuments);

        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent redFortIntent = new Intent(getActivity(), RedFortActivity.class);
                        startActivity(redFortIntent);
                        break;
                    case 1:
                        Intent qutubMinarIntent = new Intent(getActivity(), QutubMinarActivity.class);
                        startActivity(qutubMinarIntent);
                        break;
                    case 2:
                        Intent indiaGateIntent = new Intent(getActivity(), IndiaGateActivity.class);
                        startActivity(indiaGateIntent);
                        break;
                    case 3:
                        Intent humayunsTombIntent = new Intent(getActivity(), HumayunsTombActivity.class);
                        startActivity(humayunsTombIntent);
                        break;
                    case 4:
                        Intent safdarjungsTombIntent = new Intent(getActivity(), SafdarjungsTombActivity.class);
                        startActivity(safdarjungsTombIntent);
                        break;
                    case 5:
                        Intent rashtrapatiBhawanIntent = new Intent(getActivity(), RashtrapatiBhawanActivity.class);
                        startActivity(rashtrapatiBhawanIntent);
                        break;
                    case 6:
                        Intent puranaQilaIntent = new Intent(getActivity(), PuranaQilaActivity.class);
                        startActivity(puranaQilaIntent);
                        break;
                    case 7:
                        Intent jamaMasjidIntent = new Intent(getActivity(), JamaMasjidActivity.class);
                        startActivity(jamaMasjidIntent);
                        break;
                    case 8:
                        Intent parliamentHouseIntent = new Intent(getActivity(), ParliamentHouseActivity.class);
                        startActivity(parliamentHouseIntent);
                        break;
                    case 9:
                        Intent tughlaqabadFortIntent = new Intent(getActivity(), TughlaqbadFortActivity.class);
                        startActivity(tughlaqabadFortIntent);
                        break;
                    case 10:
                        Intent chatarpurTempleIntent = new Intent(getActivity(), ChatarpurTempleActivity.class);
                        startActivity(chatarpurTempleIntent);
                        break;
                    case 11:
                        Intent  akshardhamTempleIntent = new Intent(getActivity(), AkshardhamTempleActivity.class);
                        startActivity(akshardhamTempleIntent);
                        break;
                    case 12:
                        Intent lotusTempleIntent = new Intent(getActivity(), LotusTempleActivity.class);
                        startActivity(lotusTempleIntent);
                        break;
                    case 13:
                        Intent banglaSahibIntent = new Intent(getActivity(), BanglaSahibGurudwaraActivity.class);
                        startActivity(banglaSahibIntent);
                        break;
                }

            }
        });

        return rootview;
    }
}