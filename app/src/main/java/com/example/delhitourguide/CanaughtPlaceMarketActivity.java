package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CanaughtPlaceMarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout layout = findViewById(R.id.activity_info_layout);
        layout.setBackgroundColor(getResources().getColor(R.color.tan_background));

        TextView infoNameTextView = findViewById(R.id.infoName_text_view);
        infoNameTextView.setText(R.string.canaught_name);

        TextView infoPlaceTextView = findViewById(R.id.infoPlace_text_view);
        infoPlaceTextView.setText(R.string.canaught_place);

        ImageView infoImageView = findViewById(R.id.info_image_view);
        infoImageView.setImageResource(R.drawable.canaughtplacemarket);

        TextView infoPhoneNumberTextView = findViewById(R.id.infoNumber_text_view);
        infoPhoneNumberTextView.setText(R.string.canaught_number);
        infoPhoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01123365358"));
                startActivity(intent);
            }
        });

        TextView infoTimingsTextView = findViewById(R.id.infoTimings_text_view);
        infoTimingsTextView.setText(R.string.canaught_timing);

        TextView infoBasicTextView = findViewById(R.id.infoBasic_text_view);
        infoBasicTextView.setText(R.string.canaught_basic);

        TextView infoDirectionTextView = findViewById(R.id.infoDirection_text_view);
        infoDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/search?q=connaught%20place%20market&sxsrf=ALeKk" +
                        "03EH9yzZroMWEFLg82sowxVViCIGQ:1624186251697&ei=ix3PYJiIKtmy9QOdhYPYDA&oq=co" +
                        "nnaught+place+market&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyAggAMgQIABBDMgIIADIECAA" +
                        "QQzICCAAyCAguEMcBEK8BMgIIADoHCAAQRxCwAzoHCAAQsAMQQzoNCC4QsAMQyAMQQxCTAjoKCC" +
                        "4QsAMQyAMQQzoQCC4QxwEQrwEQsAMQyAMQQzoKCC4QhwIQsQMQFDoHCAAQhwIQFDoFCC4QsQM6" +
                        "AgguOgUIABDJA0oFCDgSATFQ3CZYom9g9HNoB3ACeAGAAcYBiAGmD5IBBDAuMTKYAQCgAQGqAQd" +
                        "nd3Mtd2l6yAEPwAEB&sclient=gws-wiz&ved=2ahUKEwjY-dKkhabxAhVZWX0KHZ3CAMsQvS4wA" +
                        "HoECAwQNA&uact=5&tbs=lf:1,lf_ui:2&tbm=lcl&rflfq=1&num=10&rldimm=41632217889" +
                        "6073250&lqi=ChZjb25uYXVnaHQgcGxhY2UgbWFya2V0SNOz1snErYCACFokEAIYABgBGAIiFmN" +
                        "vbm5hdWdodCBwbGFjZSBtYXJrZXQqAggCkgEGbWFya2V0&rlst=f#rlfi=hd:;si:416322178" +
                        "896073250,l,ChZjb25uYXVnaHQgcGxhY2UgbWFya2V0SNOz1snErYCACFokEAIYABgBGAIiFmNv" +
                        "bm5hdWdodCBwbGFjZSBtYXJrZXQqAggCkgEGbWFya2V0;mv:[[28.6315936,77.2203044],[2" +
                        "8.6289362,77.2120937]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!1m4" +
                        "!1u16!2m2!16m1!1e1!1m4!1u16!2m2!16m1!1e2!2m1!1e2!2m1!1e16!2m1!1e3!3sIAE,lf:1,lf_ui:2";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        TextView infoWebsiteTextView = findViewById(R.id.infoWebsite_text_view);
        infoWebsiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://delhitourism.gov.in/delhitourism/shopping/connaught_place.jsp";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}