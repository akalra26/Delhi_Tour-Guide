package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChatarpurTempleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.chatarpur_temple_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.chatarpur_temple_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.chatarpurtemple);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.chatarpur_temple_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01126802925"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.chatarpur_temple_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.chatarpur_temple_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?sxsrf=ALeKk03LFjKw1JuWkgE-p8eZ2D0Oum2PkA:" +
                        "1623936544176&gs_lcp=Cgdnd3Mtd2l6EAMyCggAELEDEIMBEAoyBAgAEAoyBAgAEAoyBAgAEA" +
                        "oyBAgAEAoyBAgAEAoyBAgAEAoyBAgAEAoyBAgAEAoyBAgAEAo6BwgAEEcQsAM6BwgAEMkDEAo6B" +
                        "ggAEBYQHjoECAAQQzoHCAAQsQMQCjoNCC4QsQMQxwEQrwEQCjoECC4QClDxIljyM2CnN2gBcAF4" +
                        "AIABlAKIAZ4RkgEGMC4xMi4xmAEAoAEBqgEHZ3dzLXdpesgBCMABAQ&uact=5&q=chattarpur+" +
                        "mandir&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjajOiK457xAhWyoekKHXzFCtwQ_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.chhattarpurmandir.org/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}