package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LithiyumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.lithiyum_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.lithiyum_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.lithiyum);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.lithiyum_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 093102 72000"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.lithiyum_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.lithiyum_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=lithium+club&hotel_occupancy=2&sxsrf=ALe" +
                        "Kk01Hm3ftueHP4omB7rWbpw76EvRWZQ:1624263511026&gs_lcp=Cgdnd3Mtd2l6EAMYADINCC" +
                        "4QxwEQrwEQQxCTAjIHCAAQsQMQQzIECAAQQzIFCAAQsQMyBQgAEMkDMgUIABCSAzICCAAyAggAM" +
                        "gIIADIFCAAQsQM6EAguEMcBEK8BEOoCECcQkwI6DQguEMcBEK8BEOoCECc6BwgjEOoCECc6BAgj" +
                        "ECc6CgguEMcBEK8BEEM6BAguEEM6CAgAELEDEIMBOgUILhCxAzoFCAAQkQI6CgguEMcBEKMCEEM" +
                        "6CgguEMcBEK8BECc6CwguEMcBEK8BEJECOgUILhCRAjoHCC4QsQMQQ1DCClj4F2D2K2gBcAB4AI" +
                        "ABngKIAYALkgEFMC4yLjSYAQCgAQGqAQdnd3Mtd2l6sAEKwAEB&um=1&ie=UTF-8&sa=X&ved=2a" +
                        "hUKEwiqiIu_pqjxAhV4_XMBHafzBCMQ_AUoAHoECAEQCg";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.zomato.com/ncr/lithiyum-club-the-ashok-chanakyapuri-new-delhi";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}