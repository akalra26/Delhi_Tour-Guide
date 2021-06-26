package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TughlaqbadFortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.tughlaqabad_fort_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.tughlaqabad_fort_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.tughlaqabadfort);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.tughlaqabad_fort_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01123320005"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.tughlaqabad_fort_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.tughlaqabad_fort_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=tughlaqabad+fort&sxsrf=ALeKk025O8YM8Qc7U" +
                        "9uj3f1wE1sLzf6Acg:1623935589569&gs_lcp=Cgdnd3Mtd2l6EAMYAjIECCMQJzIECCMQJzIL" +
                        "CC4QxwEQrwEQkQIyBAgAEEMyCAguELEDEIMBMgQIABBDMgUIABCxAzIICAAQsQMQgwEyBQguELE" +
                        "DMggIABCxAxCDAToHCCMQ6gIQJzoNCC4QxwEQrwEQ6gIQJzoFCAAQkQI6AgguOgIIAFCtDli-F2" +
                        "CjJ2gCcAF4AIAB5AGIAdoFkgEFMC4zLjGYAQCgAQGqAQdnd3Mtd2l6sAEKwAEB&um=1&ie=UTF-" +
                        "8&sa=X&ved=2ahUKEwiilM284Z7xAhWObn0KHQ28BQoQ_AUoAnoECAEQBA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.delhitourism.gov.in/delhitourism/aboutus/tughlakabad.jsp";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}