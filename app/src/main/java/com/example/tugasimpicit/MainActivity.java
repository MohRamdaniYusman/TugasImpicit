package com.example.tugasimpicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDialNumber;
    Button btnWebBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);

        btnWebBrowser = findViewById(R.id.btn_web_browser);
        btnWebBrowser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dial_number:
                String phoneNumber = "089619000501";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_web_browser:
                String url = "https://google.com";
                Intent openBrowserIntent = new Intent(Intent.ACTION_VIEW);
                startActivity(openBrowserIntent);
                break;
        }
    }
}
