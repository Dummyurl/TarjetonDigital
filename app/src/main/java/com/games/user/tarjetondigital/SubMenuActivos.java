package com.games.user.tarjetondigital;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class SubMenuActivos extends AppCompatActivity {
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_activos);


        //botonatras
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        mAdView = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void activosboton(View view) {

        Intent intent11 = new Intent(this, WbView.class);
        startActivity(intent11);
    }

    public void linkdirecto(View view) {
        Intent intentae = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rh.imss.gob.mx/TarjetonDigital/"));
        startActivity(intentae);
        // Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rh.imss.gob.mx/tarjetondigital/"));
        // startActivity(intent1);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(getBaseContext(), MenuPrincipal.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}


