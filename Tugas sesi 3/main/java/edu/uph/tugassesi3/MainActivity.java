package edu.uph.tugassesi3;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton addButton = findViewById(R.id.imageButton9);

        addButton.setOnClickListener(view -> {

            EditText nameEditText = findViewById(R.id.editTextText2);
            RadioButton maleRadioButton = findViewById(R.id.radioButton3);
            RadioButton femaleRadioButton = findViewById(R.id.radioButton4);
            CheckBox codingCheckBox = findViewById(R.id.checkBox4);
            CheckBox readingCheckBox = findViewById(R.id.checkBox3);
            CheckBox travellingCheckBox = findViewById(R.id.checkBox);


            StringBuilder message = new StringBuilder();
            message.append("Nama: ").append(nameEditText.getText()).append("\n");


            if (maleRadioButton.isChecked()) {
                message.append("Gender: PRIA\n");
            } else if (femaleRadioButton.isChecked()) {
                message.append("Gender: WANITA\n");
            }


            message.append("Hobi: ");
            if (codingCheckBox.isChecked()) {
                message.append("Coding ");
            }
            if (readingCheckBox.isChecked()) {
                message.append("Reading ");
            }
            if (travellingCheckBox.isChecked()) {
                message.append("Travelling ");
            }


            showSnackbar(message.toString());
        });
    }


    private void showSnackbar(String message) {
        View parentLayout = findViewById(android.R.id.content);
        Snackbar.make(parentLayout, message, Snackbar.LENGTH_LONG).show();
    }
}