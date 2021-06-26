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
 * Use the {@link MallsFragment} factory method to
 * create an instance of this fragment.
 */
public class MallsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Select City Walk", "Saket", R.drawable.selectcitywalk));
        places.add(new Place("DLF Emporio", "Vasant Kunj", R.drawable.dlfemporio));
        places.add(new Place("DLF Promenade", "Vasant Vihar", R.drawable.dlfpromenade));
        places.add(new Place("Ambience Mall", "Vasant Kunj", R.drawable.ambiencemall));
        places.add(new Place("DLF Place", "Malviya Nagar", R.drawable.dlfplace));
        places.add(new Place("DLF City Centre", "Netajai Subhash Place", R.drawable.dlfcitycentre));
        places.add(new Place("Pacific Mall", "Subhash Nagar", R.drawable.pacificmall));
        places.add(new Place("Ansal Plaza", "Andrews Ganj", R.drawable.ansalplaza));
        places.add(new Place("Metro Walk", "Rohini", R.drawable.metrowalk));
        places.add(new Place("West Gate Mall", "Rajouri Garden", R.drawable.westgatemall));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_malls);

        ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent selectCityWalkIntent = new Intent(getActivity(), SelectCityWalkActivity.class);
                        startActivity(selectCityWalkIntent);
                        break;
                    case 1:
                        Intent dlfEmporioIntent = new Intent(getActivity(), DlfEmporioActivity.class);
                        startActivity(dlfEmporioIntent);
                        break;
                    case 2:
                        Intent dlfPromenadeIntent = new Intent(getActivity(), DlfPromenade.class);
                        startActivity(dlfPromenadeIntent);
                        break;
                    case 3:
                        Intent ambienceIntent = new Intent(getActivity(), AmbienceMallActivity.class);
                        startActivity(ambienceIntent);
                        break;
                    case 4:
                        Intent dlfPlaceIntent = new Intent(getActivity(), DlfPlaceActivity.class);
                        startActivity(dlfPlaceIntent);
                        break;
                    case 5:
                        Intent dlfCityIntent = new Intent(getActivity(), DlfCityActivity.class);
                        startActivity(dlfCityIntent);
                        break;
                    case 6:
                        Intent pacificIntent = new Intent(getActivity(), PacificActivity.class);
                        startActivity(pacificIntent);
                        break;
                    case 7:
                        Intent ansalPlazaIntent = new Intent(getActivity(), AnsalPlazaActivity.class);
                        startActivity(ansalPlazaIntent);
                        break;
                    case 8:
                        Intent metroWalkIntent = new Intent(getActivity(), MetroWalkActivity.class);
                        startActivity(metroWalkIntent);
                        break;
                    case 9:
                        Intent westGateIntent = new Intent(getActivity(), WestGateActivity.class);
                        startActivity(westGateIntent);
                        break;
                }
            }
        });

        return rootview;
    }
}