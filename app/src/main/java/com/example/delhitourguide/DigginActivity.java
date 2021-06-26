package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DigginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.diggin_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.diggin_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.diggin);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.diggin_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:  01140800081"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.diggin_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.diggin_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=diggin+anand+lok&sxsrf=ALeKk03VCFnY1GJdM" +
                        "B9bT2FMAV3fagpLYQ:1623987766243&gs_lcp=Cgdnd3Mtd2l6EAMYADILCC4QxwEQrwEQkwIyA" +
                        "ggAMggILhDHARCvATICCAAyBQgAEMkDMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4y" +
                        "BggAEBYQHjoHCCMQsAMQJzoHCAAQRxCwAzoQCC4QxwEQrwEQsAMQyAMQQzoTCC4QsQMQgwEQxwE" +
                        "QrwEQQxCTAjoKCC4QxwEQrwEQQzoECAAQQzoHCAAQyQMQQzoFCAAQkgM6BwgAEIcCEBQ6BwguEI" +
                        "cCEBQ6AgguOhAILhCHAhDHARCvARAUEJMCOgQILhAKOgQIABAKOggIABAWEAoQHkoFCDgSATFQhh" +
                        "lYlmFgxGxoAnACeACAAcEBiAH3CJIBAzAuN5gBAKABAaoBB2d3cy13aXrIAQ_AAQE&um=1&ie=U" +
                        "TF-8&sa=X&ved=2ahUKEwiqv6D6oaDxAhVvIbcAHRNZAD8Q_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.zomato.com/ncr/diggin-anand-lok-delhi";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}