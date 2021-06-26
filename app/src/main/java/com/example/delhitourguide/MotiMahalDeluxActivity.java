package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MotiMahalDeluxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.motiMahal_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.motiMahal_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.motimahaldelux);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.motiMahal_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01129230480"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.motiMahal_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.motiMahal_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps?q=moti+mahal+greater+kailash&biw=1536&bih=" +
                        "754&sxsrf=ALeKk00nhgjQMrQzs0twGGWWlfqEC_ztkw:1623948013325&gs_lcp=Cgdnd3Mtd" +
                        "2l6EAMYADILCC4QxwEQrwEQkwIyCAguEMcBEK8BMgIIADIICC4QxwEQrwEyCAguEMcBEK8BMgkI" +
                        "ABDJAxAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjoHCAAQsAMQQzoFCAAQsAM" +
                        "6BwgAELADEB46EAguEMcBEK8BELADEMgDEEM6EAguEMcBEKMCELADEMgDEEM6CgguELADEMgDEE" +
                        "M6DgguEMcBEK8BELADEMgDOg0ILhDHARCvARAnEJMCOgsILhCxAxDHARCjAjoHCAAQhwIQFDoE" +
                        "CAAQQzoFCAAQyQM6BQgAEJIDSgUIOBIBMVDrW1jkXmD5aWgBcAB4AIABuAGIAb4FkgEDMC40mAE" +
                        "AoAEBqgEHZ3dzLXdpesgBD8ABAQ&um=1&ie=UTF-8&sa=X&ved=2ahUKEwiTtuDqjZ_xAhXWdH0" +
                        "KHeeADI8Q_AUoAXoECAEQAw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://motimahal.in/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}