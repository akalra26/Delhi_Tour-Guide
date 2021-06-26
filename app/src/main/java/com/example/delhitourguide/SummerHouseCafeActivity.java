package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SummerHouseCafeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.summerHouse_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.summerHouse_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.summerhousecafe);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.summerHouse_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:  098102 00780"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.summerHouse_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.summerHouse_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=summer+house+cafe&sxsrf=ALeKk03_iNvCAItx" +
                        "FI7x0CwNYNB7u3Gcxg:1623986878400&gs_lcp=Cgdnd3Mtd2l6EAMyCwguEMcBEK8BEJMCMgI" +
                        "IADICCAAyAggAMgIIADICCAAyCAguEMcBEK8BMggILhDHARCvATICCAAyCAguEMcBEK8BOgcIIx" +
                        "DqAhAnOg0ILhDHARCvARDqAhAnOg0ILhDHARCvARAnEJMCOgQIIxAnOgsILhDHARCvARCRAjoEC" +
                        "C4QQzoICAAQsQMQgwE6AgguOgQIABBDOgoILhDHARCjAhBDOg4ILhDHARCvARCRAhCTAjoICAAQ" +
                        "sQMQkQI6BQgAELEDOgcILhCxAxBDOgoIABCxAxCDARBDOggIABCxAxDJAzoFCAAQkgM6BwgAEIc" +
                        "CEBQ6BQgAEMkDOhAILhCHAhDHARCvARAUEJMCULkTWOUxYPQyaAFwAngAgAHUAYgB7BaSAQYwLjE" +
                        "1LjKYAQCgAQGqAQdnd3Mtd2l6sAEKwAEB&uact=5&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjivM" +
                        "6noKDxAhUYfisKHYq5DkQQ_AUoAnoECAEQBA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://summerhousecafe.info/food-menu/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}