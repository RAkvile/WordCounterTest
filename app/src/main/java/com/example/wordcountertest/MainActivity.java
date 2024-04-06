package com.example.wordcountertest;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    TextView tvResults;
    Spinner spSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spSelection = (Spinner) findViewById(R.id.spSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.selection_options,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSelection.setAdapter(adapter);

        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvResults = findViewById(R.id.tvResults);

        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void btnCountClick(View view) {
        String phrase = edUserInput.getText().toString();

        String selectedOption = spSelection.getSelectedItem().toString();
        if (selectedOption.equalsIgnoreCase("Chars")) {

            int charsCount = TextCounter.getCharsCount(phrase);
            tvResults.setText(String.valueOf(charsCount));
        } else {
            TextCounter tc = new TextCounter();
            int wordsCount = TextCounter.getWordsCount(phrase);
            Toast.makeText(this, "Not implemented words counting", Toast.LENGTH_SHORT).show();
        }
    }
}
