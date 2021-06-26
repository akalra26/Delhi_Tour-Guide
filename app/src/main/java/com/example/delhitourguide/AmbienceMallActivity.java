package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AmbienceMallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.ambience_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.ambience_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.ambiencemall);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.ambience_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 081303 50002"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.ambience_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.ambience_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=ambience+mall+vasant+kunj&sxsrf=ALeKk00v" +
                        "TS3woaV5WRae_aTmNK1JTyrO3Q:1623996601962&gs_lcp=Cgdnd3Mtd2l6EAMYAzIECCMQJzI" +
                        "KCC4QxwEQrwEQJzIECCMQJzIKCC4QxwEQrwEQQzIKCC4QxwEQrwEQQzIECAAQQzIKCAAQsQMQgw" +
                        "EQQzIKCC4QxwEQrwEQQzIICAAQsQMQgwEyCgguEMcBEKMCEEM6EAguEMcBEK8BEOoCECcQkwI6D" +
                        "QguEMcBEK8BEOoCECc6BwgjEOoCECc6BAguEEM6AggAULoNWNYQYIEqaAFwAngAgAHaAYgBtASS" +
                        "AQUwLjIuMZgBAKABAaoBB2d3cy13aXqwAQrAAQE&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjcnPj" +
                        "UxKDxAhU06nMBHVxhBC8Q_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.ambiencemalls.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}