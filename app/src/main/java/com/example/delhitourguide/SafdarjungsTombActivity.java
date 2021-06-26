package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SafdarjungsTombActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.safdarjungs_tomb_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.safdarjungs_tomb_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.safdarjungtomb);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.safdarjungs_tomb_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.safdarjungs_tomb_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.safdarjungs_tomb_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=safdarjung+tomb&sxsrf=ALeKk02fEtkWpi6xbZ" +
                        "Bmx-DwFoq0g2njmQ:1623926127865&gs_lcp=Cgdnd3Mtd2l6EAMYATIECCMQJzIKCC4QxwEQr" +
                        "wEQQzIHCAAQyQMQQzIECAAQQzIECAAQQzIECAAQQzIICAAQsQMQgwEyAggAMgUIABCxAzIOCC4Q" +
                        "sQMQgwEQxwEQowI6BwgjEOoCECc6DQguEMcBEK8BEOoCECc6BAguEENQhQ1YzBJgzx9oAXACeAC" +
                        "AAecBiAGnBZIBBTAuMy4xmAEAoAEBqgEHZ3dzLXdperABCsABAQ&um=1&ie=UTF-8&sa=X&ved=" +
                        "2ahUKEwjrzKSCvp7xAhWRX30KHe7FB-oQ_AUoAnoECAEQBA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://delhitourism.travel/safdarjung-s-tomb-delhi";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}