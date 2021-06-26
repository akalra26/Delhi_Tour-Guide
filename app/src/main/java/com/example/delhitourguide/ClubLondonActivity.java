package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ClubLondonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.clubLondon_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.clubLondon_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.clublondon);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.clubLondon_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 095609 15848"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.clubLondon_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.clubLondon_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=club+london+saket&hotel_occupancy=2&sxsr" +
                        "f=ALeKk02N2JkY-tV3HzoK8OOGhAgTtLWyTw:1624262789087&gs_lcp=Cgdnd3Mtd2l6EAEYA" +
                        "DILCC4QxwEQrwEQkwIyAggAMg0ILhCHAhDHARCvARAUMggILhDHARCvATICCAAyAggAMgIIADIC" +
                        "CAAyAggAMgIIADoQCC4QxwEQrwEQ6gIQJxCTAjoHCCMQ6gIQJzoNCC4QxwEQrwEQ6gIQJzoECCM" +
                        "QJzoKCC4QxwEQrwEQJzoECAAQQzoKCC4QxwEQrwEQQzoECC4QQzoICAAQsQMQgwE6CQgjECcQRh" +
                        "D5AToFCAAQkQI6CwguEMcBEK8BEJECOgcIABDJAxBDOgUIABCSAzoHCC4QsQMQQzoHCAAQsQMQQ" +
                        "zoKCAAQsQMQyQMQQzoLCC4QsQMQxwEQowI6BwgAEIcCEBQ6BQgAEMkDOggILhDHARCjAjoCCC46" +
                        "EAguEIcCEMcBEK8BEBQQkwJQ8gtYhSFg6ENoAXACeACAAf4BiAHCEpIBBTAuNy41mAEAoAEBqgE" +
                        "HZ3dzLXdperABCsABAQ&um=1&ie=UTF-8&sa=X&ved=2ahUKEwigm-KMpajxAhX9H7cAHXsfCfQ" +
                        "Q_AUoAHoECAEQCg";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.zomato.com/ncr/club-london-saket-new-delhi";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}