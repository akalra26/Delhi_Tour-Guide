package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FarziCafeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.farzicafe_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.farzicafe_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.farzicafe);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.farzicafe_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 095998 89701"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.farzicafe_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.farzicafe_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=farzi+cafe+delhi+cp&sxsrf=ALeKk03W21E_cx" +
                        "-wZ85Ko6FknIYflglZfw:1623944482607&gs_lcp=Cgdnd3Mtd2l6EAMYADILCC4QxwEQrwEQk" +
                        "wIyBggAEBYQHjICCCYyAggmMgIIJjoECCMQJzoFCAAQkQI6BwguELEDEEM6BAgAEEM6CgguEMcB" +
                        "EK8BEEM6CggAELEDEIMBEEM6BggAEAcQHjoECAAQDToCCAA6CAguEMcBEK8BUM0TWIAzYJxoaAF" +
                        "wAngAgAGMAogBnguSAQUwLjYuMpgBAKABAaoBB2d3cy13aXrAAQE&um=1&ie=UTF-8&sa=X&ved" +
                        "=2ahUKEwjv6sShg5_xAhWIYysKHUqMB38Q_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://farzicafe.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}