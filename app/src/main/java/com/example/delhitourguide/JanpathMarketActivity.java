package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class JanpathMarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.janpathMarket_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.janpathMarket_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.janpathmarker);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.janpathMarket_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.janpathMarket_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.janpathMarket_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=janpath+market&sxsrf=ALeKk023c0gMb8ZGKUe" +
                        "oH-4aidfUBOLlOw:1624175846965&gs_lcp=Cgdnd3Mtd2l6EAMYBjIECCMQJzIECCMQJzIECC" +
                        "MQJzIKCC4QxwEQrwEQQzIKCC4QxwEQrwEQQzIECAAQQzIKCC4QxwEQrwEQQzIECC4QQzIKCC4Qx" +
                        "wEQrwEQQzIECAAQQzoQCC4QxwEQrwEQ6gIQJxCTAjoHCCMQ6gIQJzoNCC4QxwEQrwEQ6gIQJzoI" +
                        "CC4QsQMQgwE6BQgAELEDOg4ILhCxAxCDARDHARCvAVDhC1jxLmCEVWgBcAJ4AIABuQGIAfgDkgE" +
                        "DMC4zmAEAoAEBqgEHZ3dzLXdperABCsABAQ&um=1&ie=UTF-8&sa=X&ved=2ahUKEwin0tuJ4KX" +
                        "xAhXLZSsKHWUUApMQ_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://delhitourism.gov.in/delhitourism/shopping/janpath.jsp";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}