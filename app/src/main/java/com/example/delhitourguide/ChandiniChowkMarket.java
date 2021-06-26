package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChandiniChowkMarket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.chandniChowk_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.chandniChowk_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.chandnichowkmarket);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.chandniChowk_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.chandniChowk_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.chandniChowk_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=chandni+chowk+market&sxsrf=ALeKk03lqoQrg" +
                        "6nBoDUB7XWxXyhvWnKz4A:1624178245356&gs_lcp=Cgdnd3Mtd2l6EAMYATIHCC4QQxCTAjIK" +
                        "CC4QxwEQrwEQQzIECAAQQzIECAAQQzIECAAQQzIECAAQQzIECC4QQzIECAAQQzIECAAQQzIECC4" +
                        "QQzoHCCMQ6gIQJzoHCC4Q6gIQJzoNCC4QxwEQrwEQ6gIQJzoICAAQsQMQgwE6CAguELEDEIMBOg" +
                        "UIABCxAzoCCAA6BAgjECc6BwguEIcCEBRQ868cWK-1HGDrxxxoAXACeACAAbQCiAHFCZIBBzAuN" +
                        "C4xLjGYAQCgAQGqAQdnd3Mtd2l6sAEKwAEB&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjdxdmH7aX" +
                        "xAhWxW3wKHeoVD7AQ_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.delhitourism.gov.in/delhitourism/shopping/chandni_chowk.jsp";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}