package edu.uph.quizpemogramanmobiledasar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<activity_main> extends AppCompatActivity {

    LinearLayout tampilan1;
    LinearLayout tampilan2;

    @SuppressLint({"activity_main", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilan1 = (LinearLayout) findViewById(R.id.tampilan1);
        tampilan2 = (LinearLayout) findViewById(R.id.tampilan2);

        tampilan1.setOnClickListener(v -> {
            Log.d("Profile", "Masuk ke tampilan1");
            Intent intent = new Intent(MainActivity.this, profil.class);
            startActivity(intent);
        });

        tampilan2.setOnClickListener(v -> {
            Log.d("todolist.class", "Masuk ke tampilan2");
            Intent intent = new Intent(MainActivity.this, todolist.class);
            startActivity(intent);
        });

    }
}