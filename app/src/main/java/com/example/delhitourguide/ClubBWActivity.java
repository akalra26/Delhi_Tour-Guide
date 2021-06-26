package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ClubBWActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.clubBW_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.clubBW_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.clubbw);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.clubBW_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 088266 98560"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.clubBW_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.clubBW_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=club+bw+delhi&hotel_occupancy=2&sxsrf=AL" +
                        "eKk0201aRgDtV83rcObq3_Cx8kfk6odA:1624263884993&gs_lcp=Cgdnd3Mtd2l6EAMYADIQC" +
                        "C4QhwIQxwEQrwEQFBCTAjIHCAAQhwIQFDICCAAyAggAMgIIADoHCCMQ6gIQJzoNCC4QxwEQrwEQ" +
                        "6gIQJzoNCC4QxwEQrwEQJxCTAjoECCMQJzoLCC4QxwEQrwEQkQI6BQgAEJECOgQIABBDOgQILhB" +
                        "DOgoIABCHAhCxAxAUOggIABCxAxCDAToHCC4QsQMQQzoICC4QxwEQrwE6BwgAELEDEEM6BQgAEL" +
                        "EDOgIILjoOCC4QxwEQrwEQkQIQkwJQyQlY1RtguCNoAXACeACAAc8BiAGvC5IBBTAuNy4xmAEAo" +
                        "AEBqgEHZ3dzLXdperABCsABAQ&um=1&ie=UTF-8&sa=X&ved=2ahUKEwizsdrrp6jxAhVS4HMBH" +
                        "a2bDBEQ_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.zomato.com/ncr/club-bw-the-suryaa-new-delhi-new-friends-colony-new-delhi";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}