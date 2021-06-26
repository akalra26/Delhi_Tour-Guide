package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MochaArtPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.mocha_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.mocha_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.mochaartplace);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.mocha_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 080999 37140"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.mocha_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.mocha_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Mocha+Arthouse/@28.5869966,77.153879" +
                        "5,13z/data=!3m1!5s0x390d1dcec97d0347:0xcee4a177e8b12102!4m9!1m2!2m1!1smocha" +
                        "+art+place!3m5!1s0x390d1dcecf2adccd:0xd6ca8e24fe55ca68!8m2!3d28.5430222!4d" +
                        "77.15595!15sCg9tb2NoYSBhcnQgcGxhY2VaESIPbW9jaGEgYXJ0IHBsYWNlkgEEY2FmZZoBI0" +
                        "NoWkRTVWhOTUc5blMwVkpRMEZuU1VSM2FIUlBka3gzRUFF";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.mocha.co.in/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}