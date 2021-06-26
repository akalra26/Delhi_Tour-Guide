package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SarojiniMarketActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.sarojiniMarket_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.sarojiniMarket_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.sarojinimarket);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.sarojiniMarket_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.sarojiniMarket_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.sarojiniMarket_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=sarojini+nagar+market+delhi&sxsrf=ALeKk01" +
                        "SmNeVGQzYGCi_MoEDhcsg3qAiKQ:1624178213428&gs_lcp=Cgdnd3Mtd2l6EAMYADIHCC4QDR" +
                        "CTAjIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQD" +
                        "ToKCC4QsAMQJxCTAjoHCAAQRxCwAzoKCC4QsAMQyAMQQzoQCC4QxwEQrwEQsAMQyAMQQzoHCC4QJ" +
                        "xCTAjoFCAAQyQM6BAgAEEM6AggAOgIILjoNCC4QhwIQsQMQgwEQFDoFCC4QsQM6BQgAELEDOhAI" +
                        "LhCHAhCxAxCDARAUEJMCOgUIABCRAjoICC4QxwEQrwE6CwguELEDEIMBEJMCOgcIABCHAhAUOgc" +
                        "ILhCHAhAUOgoILhCHAhAUEJMCOgUILhCTAkoFCDgSATFQwxlYmUdgj1ZoA3ACeACAAd8CiAHPHJ" +
                        "IBCDAuMjIuMS4xmAEAoAEBqgEHZ3dzLXdpesgBD8ABAQ&um=1&ie=UTF-8&sa=X&ved=2ahUKEw" +
                        "j83fa656XxAhXIb30KHeq0CgcQ_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.delhitourism.gov.in/delhitourism/shopping/sarojini_nagar.jsp";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}