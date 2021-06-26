package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.myBar_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.myBar_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.mybarhq);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.myBar_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 099999 38571"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.myBar_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.myBar_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=my+bar+headquarters&hotel_occupancy=2&sx" +
                        "srf=ALeKk03YMiGgq-ZMWx80DYzdEVKAwnkzrg:1624262393524&gs_lcp=Cgdnd3Mtd2l6EAE" +
                        "YADIOCC4QsQMQxwEQrwEQkwIyCAguEMcBEK8BMgIIADIICC4QxwEQrwEyAggAMgIIADICCAAyAg" +
                        "gAMgIIADICCAA6BwgjELADECc6BwgAEEcQsAM6BAgjECc6BAgAEEM6BgguEAoQQzoFCAAQkQI6B" +
                        "AguEEM6BwgAELEDEEM6DQguEIcCEMcBEK8BEBQ6BQgAELEDOggIABCxAxCDAToECAAQCjoOCC4Q" +
                        "sQMQgwEQxwEQrwE6BwguELEDEAo6DQguELEDEMcBEK8BEAo6BAguEAo6CgguEMcBEK8BEAo6BAg" +
                        "AEA06BggAEA0QCjoKCC4QxwEQrwEQDToHCAAQyQMQDToFCAAQkgM6BwgjEOoCECc6DQguEMcBEK" +
                        "8BEOoCECc6CAguEJECEJMCOgUILhCRAjoICC4QsQMQgwE6CAguEMcBEKMCOg0ILhDHARCvARBDE" +
                        "JMCOgsILhCxAxDHARCjAjoKCAAQsQMQgwEQQzoKCC4QxwEQrwEQQzoNCC4QsQMQxwEQrwEQQzoF" +
                        "CC4QsQM6BQgAEMkDOgsILhCxAxDHARCvAToCCCZQ5w1Yu1hg82RoBXACeACAAZ4CiAGoHJIBBjA" +
                        "uMTMuNpgBAKABAaoBB2d3cy13aXqwAQrIAQXAAQE&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjHxc" +
                        "K0oqjxAhXDfX0KHcS5BUwQ_AUoAnoECAEQBA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mybarindia.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}