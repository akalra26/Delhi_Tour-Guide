package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PaharganjMarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.paharganj_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.paharganj_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.paharganjmarket);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.paharganj_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.paharganj_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.paharganj_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=paharganj+market&sxsrf=ALeKk02laofUnG1n0" +
                        "Fdv7AHUZCN9ESIJuQ:1624187003773&gs_lcp=Cgdnd3Mtd2l6EAMYATIECAAQQzIKCC4QxwE" +
                        "QrwEQQzIHCC4QsQMQQzIECAAQQzIICC4QsQMQgwEyAggAMgIIADIHCAAQhwIQFDIECAAQQzICCA" +
                        "A6EAguEMcBEK8BELADECcQkwI6BwgAEEcQsAM6CgguELADEMgDEEM6EAguEMcBEK8BELADEMgDE" +
                        "EM6EAguELEDEMcBEK8BEEMQkwI6CAguEMcBEK8BOhAILhDHARCvARDqAhAnEJMCOgcIIxDqAhAn" +
                        "OgcILhDqAhAnOgQIIxAnOgoILhDHARCvARAnOgUIABCxAzoECC4QQzoICAAQsQMQgwFKBQg4EgE" +
                        "xUJWUDliirw5g4sUOaARwAngEgAH5AYgBkA-SAQYwLjEwLjGYAQCgAQGqAQdnd3Mtd2l6sAEKyA" +
                        "EPwAEB&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjqnI3TiabxAhVIaCsKHXbnByYQ_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://delhitourism.gov.in/delhitourism/shopping/paharganj.jsp";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}