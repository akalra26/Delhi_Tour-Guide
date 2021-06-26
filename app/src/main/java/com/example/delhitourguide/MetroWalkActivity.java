package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MetroWalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.metro_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.metro_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.metrowalk);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.metro_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01147044111"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.metro_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.metro_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=metro+walk+mall&hl=en&sxsrf=ALeKk03_fZ-5" +
                        "DuhLllhojGXLjfE0V0BuKw:1624173471769&gs_lcp=Cgdnd3Mtd2l6EAEYATITCC4QsQMQgwEQ" +
                        "xwEQrwEQQxCTAjINCC4QhwIQxwEQrwEQFDICCAAyAggAMgIIADIECAAQQzIFCAAQyQMyAggAMgQ" +
                        "IABBDMgIIADoHCAAQRxCwAzoHCAAQsAMQQzoTCC4QxwEQrwEQsAMQyAMQQxCTAjoQCC4QxwEQrwE" +
                        "QsAMQyAMQQzoKCC4QsAMQyAMQQ0oFCDgSATFQ3jtY3jtggFRoAXACeACAAYICiAGABJIBAzItMpg" +
                        "BAKABAaoBB2d3cy13aXrIAQ_AAQE&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjw57Lc1aXxAhVaWX0KHZpbBX0Q_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://adventureisland.in/travel/delhi-attractions-metro-walk.html";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}