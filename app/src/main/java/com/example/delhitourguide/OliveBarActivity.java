package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OliveBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.oliveBar_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.oliveBar_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.olivebar);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.oliveBar_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 09810235472"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.oliveBar_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.oliveBar_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=olive+bar+and+kitchen+delhi&sxsrf=ALeKk0" +
                        "34zz9eZLRXGvMuvFAm9hAz5gR_5Q:1623943408278&gs_lcp=Cgdnd3Mtd2l6EAMYADIOCC4Qx" +
                        "wEQrwEQkQIQkwIyDQguELEDEMcBEKMCEEMyBQguELEDMgQIABBDMgIIADIICC4QxwEQrwEyCAgA" +
                        "ELEDEMkDMgUIABCxAzICCAAyAggAOgcIIxDqAhAnOg0ILhDHARCvARDqAhAnOgQIIxAnOgUILhC" +
                        "RAjoLCC4QxwEQrwEQkQI6CAgAELEDEIMBOgoILhDHARCvARBDOgcIABCHAhAUOgsILhCxAxDHAR" +
                        "CjAjoICC4QsQMQgwE6AgguOgQILhBDOgoILhDHARCjAhBDULNcWMlkYNpuaAFwAXgAgAHjAYgBl" +
                        "QmSAQUwLjYuMZgBAKABAaoBB2d3cy13aXqwAQrAAQE&um=1&ie=UTF-8&sa=X&ved=2ahUKEwik" +
                        "15TQgJ_xAhU8zTgGHUJBDfEQ_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.olivebarandkitchen.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}