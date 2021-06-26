package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SelectCityWalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.select_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.select_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.selectcitywalk);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.select_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01142114200"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.select_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.select_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=select+city+walk&sxsrf=ALeKk03sP1Cmzl5lC" +
                        "deExcA_wA91JRmMKA:1623990519470&gs_lcp=Cgdnd3Mtd2l6EAMYADIRCC4QsQMQgwEQxwEQ" +
                        "rwEQkwIyAggAMgUIABDJAzICCAAyAggAMggILhDHARCvATICCAAyCAguEMcBEK8BMgIIADICCA" +
                        "A6BwgjEOoCECc6DQguEMcBEK8BEOoCECc6BAgjECc6CgguEMcBEK8BECc6BQgAEJECOggIABCxA" +
                        "xCDAToCCC46CwguEMcBEK8BEJECOgQIABBDOg4ILhDHARCvARCRAhCTAjoFCAAQsQM6BAguEEM6" +
                        "BwguELEDEEM6CgguEMcBEKMCEEM6CgguEMcBEK8BEEM6EAguELEDEIMBEMcBEK8BEEM6BQguELE" +
                        "DOhMILhCxAxCDARDHARCvARBDEJMCUL0JWP8tYOY2aANwAngAgAHRAYgB9xiSAQYwLjE1LjOYAQC" +
                        "gAQGqAQdnd3Mtd2l6sAEKwAEB&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjJs46CvqDxAhXM73MBHU" +
                        "YVAE4Q_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.selectcitywalk.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}