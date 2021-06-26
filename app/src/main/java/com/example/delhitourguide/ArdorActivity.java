package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ArdorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.ardor_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.ardor_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.ardor);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.ardor_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 078386 52814"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.ardor_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.ardor_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=ardor+2.1&biw=1536&bih=754&sxsrf=ALeKk00" +
                        "cdYMB45kRbv_eY4TueTehrnIe7Q:1623949704281&gs_lcp=Cgdnd3Mtd2l6EAMyDgguELEDEMc" +
                        "BEK8BEJMCMgcIABCHAhAUMgUIABDJAzICCAAyBwgAEIcCEBQyAggAMgIIADICCAAyAggAMgIIADo" +
                        "QCC4QxwEQrwEQ6gIQJxCTAjoNCC4QxwEQrwEQ6gIQJzoHCCMQ6gIQJzoECCMQJzoECC4QQzoKCC" +
                        "4QxwEQrwEQQzoICAAQsQMQgwE6CAguEMcBEKMCOgQIABBDOgIILjoFCC4QsQM6CAguELEDEIMBO" +
                        "hAILhCxAxDHARCvARBDEJMCOgsILhDHARCvARCRAjoFCAAQsQM6BwgAELEDEAo6BAgAEAo6CggA" +
                        "ELEDEIMBEAo6BAguEAo6CgguEMcBEK8BEAo6BwguELEDEApQiQxY0SNg0yVoA3ACeACAAYECiAH" +
                        "iD5IBBjAuMTAuMpgBAKABAaoBB2d3cy13aXqwAQrAAQE&uact=5&um=1&ie=UTF-8&sa=X&ved=" +
                        "2ahUKEwjKqt7Glp_xAhVCyzgGHWRjAiIQ_AUoAnoECAEQBA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.ardor.ind.in/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}