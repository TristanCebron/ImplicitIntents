package com.example.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText spletna;
    private EditText lokacija;
    private EditText besedilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom);
            return insets;
        });

        spletna = findViewById(R.id.editTextText);
        lokacija = findViewById(R.id.editTextTextPostalAddress);
        besedilo = findViewById(R.id.editTextText2);
    }

    public void openWebsite(View view) {
        String url = spletna.getText().toString().trim();

        if (url.isEmpty()) {
            Toast.makeText(this, "Vnesi spletni naslov!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!url.startsWith("https://") && !url.startsWith("http://")) {
            url = "https://" + url;
        }

        Uri povezava = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, povezava);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "Spletne strani ni mogoče odpreti!", Toast.LENGTH_SHORT).show();
        }
    }

}