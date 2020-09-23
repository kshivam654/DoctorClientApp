package app.sharma.doctorclientapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DocterChamber extends AppCompatActivity {

    Button exit, next;
    TextView tokennumber;
    private Integer Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docter_chamber);

        exit = findViewById(R.id.exit);
        next = findViewById(R.id.next);
        tokennumber = findViewById(R.id.tokennumber);
        Number = Integer.parseInt(tokennumber.getText().toString());

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: to change the current patient to the next patient
                Number += 1;
                tokennumber.setText(Number.toString());

            }
        });

    }
}