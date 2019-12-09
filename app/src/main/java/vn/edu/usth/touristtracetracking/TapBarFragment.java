package vn.edu.usth.touristtracetracking;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.michaldrabik.tapbarmenulib.TapBarMenu;


/**
 * A simple {@link Fragment} subclass.
 */
public class TapBarFragment extends Fragment {
    TapBarMenu tapBarMenu;

    public TapBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tap_bar, container, false);

        tapBarMenu = v.findViewById(R.id.tapBarMenu);
        tapBarMenu.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                tapBarMenu.toggle();
            }
        });

        ImageView item1 = v.findViewById(R.id.item1);
        ImageView item2 = v.findViewById(R.id.item2);
        ImageView item3 = v.findViewById(R.id.item3);
        ImageView item4 = v.findViewById(R.id.item4);

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMenuItemClick(v);
            }
        });

        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMenuItemClick(v);
            }
        });

        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMenuItemClick(v);
            }
        });

        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMenuItemClick(v);
            }
        });

        return v;
    }

    private void onMenuItemClick(View view) {
        tapBarMenu.close();
        switch (view.getId()) {
            case R.id.item1:
                Log.i("TAG", "Item 1 selected");
                Intent intentUserProfile = new Intent(getActivity(), UserProfileActivity.class);
                intentUserProfile.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentUserProfile);
                break;
            case R.id.item2:
                Log.i("TAG", "Item 2 selected");
                Intent intentMap = new Intent(getActivity(), MapsActivity.class);
                intentMap.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentMap);
                break;
            case R.id.item3:
                Log.i("TAG", "Item 3 selected");
                Intent intentFavorite = new Intent(getActivity(), FavoriteActivity.class);
                intentFavorite.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentFavorite);
                break;
            case R.id.item4:
                Log.i("TAG", "Item 4 selected");
                Intent intentSettings = new Intent(getActivity(), SettingsActivity.class);
                intentSettings.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentSettings);
                break;
        }
    }
}