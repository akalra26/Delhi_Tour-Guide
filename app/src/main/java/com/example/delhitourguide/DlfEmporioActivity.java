package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DlfEmporioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.emporio_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.emporio_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.dlfemporio);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.emporio_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01146116666"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.emporio_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.emporio_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=dlf+emporio&sxsrf=ALeKk024wzFu3Dgd1mK0aB" +
                        "dzSFAFkInwhQ:1623995321660&gs_lcp=Cgdnd3Mtd2l6EAMYADITCC4QsQMQgwEQxwEQrwEQQ" +
                        "xCTAjICCAAyAggAMgIIADICCAAyCAguEMcBEK8BMgIIADICCAAyAggAMgIIADoQCC4QxwEQrwEQ6" +
                        "gIQJxCTAjoHCCMQ6gIQJzoNCC4QxwEQrwEQ6gIQJzoECCMQJzoKCC4QxwEQrwEQJzoKCC4QxwEQ" +
                        "rwEQQzoECAAQQzoNCC4QxwEQrwEQQxCTAjoECC4QQzoICAAQsQMQgwE6BwgAEIcCEBQ6CwguELE" +
                        "DEMcBEKMCOhAILhCxAxCDARDHARCvARBDOgoIABCxAxCDARBDOgcILhCxAxBDOgoILhCHAhCxAx" +
                        "AUOg4ILhCxAxCDARDHARCvAVC7DFjdHWCwJ2gBcAJ4AIAB9AGIAcYMkgEFMC40LjSYAQCgAQGqA" +
                        "Qdnd3Mtd2l6sAEKwAEB&um=1&ie=UTF-8&sa=X&ved=2ahUKEwi05OqDwaDxAhUUheYKHeLMBn8Q" +
                        "_AUoAnoECAEQBA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.dlfemporio.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}