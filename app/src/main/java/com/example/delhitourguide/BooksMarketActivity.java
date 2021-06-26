package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BooksMarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.book_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.book_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.bookmarket);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.book_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.book_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.book_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Daryaganj+Sunday+Book+Market/@28.641" +
                        "3376,77.236812,17z/data=!4m9!1m2!2m1!1sbooks+market+daryaganj+timing!3m5!1s" +
                        "0x390cfd26dd242465:0x21c68e27916e7952!8m2!3d28.6410863!4d77.2375565!15sCh1i" +
                        "b29rcyBtYXJrZXQgZGFyeWFnYW5qIHRpbWluZyIEGAFwAVoYIhZib29rcyBtYXJrZXQgZGFyeWF" +
                        "nYW5qkgELZmxlYV9tYXJrZXQ";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://delhitourism.gov.in/delhitourism/shopping/chandni_chowk.jsp";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}