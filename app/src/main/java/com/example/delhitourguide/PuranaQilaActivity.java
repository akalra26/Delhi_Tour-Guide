package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PuranaQilaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.purana_qila_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.purana_qila_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.puranqila);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.purana_qila_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.purana_qila_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.purana_qila_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=purana+qila&sxsrf=ALeKk00o08aUgMkm993v1A" +
                        "Seu9ROBnRdNA:1623927159385&gs_lcp=Cgdnd3Mtd2l6EAMYATIECCMQJzINCC4QsQMQxwEQr" +
                        "wEQQzICCAAyBQgAEMkDMggILhDHARCvATICCAAyAggAMggILhDHARCvATICCAAyAggAOgcIIxDq" +
                        "AhAnOg0ILhDHARCvARDqAhAnOgQIABBDOgoILhDHARCvARBDOggIABCxAxCDAToECC4QQzoFCC" +
                        "4QsQM6CwguELEDEMcBEKMCOgUIABCxAzoOCC4QsQMQgwEQxwEQrwFQyAtYvRdg-jVoAXACeACAA" +
                        "e4BiAG7CpIBBTAuNy4xmAEAoAEBqgEHZ3dzLXdperABCsABAQ&um=1&ie=UTF-8&sa=X&ved=2a" +
                        "hUKEwja3JPf1Z7xAhVQU30KHUioC5AQ_AUoAnoECAEQBA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://delhitourism.travel/purana-qila-delhi";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}