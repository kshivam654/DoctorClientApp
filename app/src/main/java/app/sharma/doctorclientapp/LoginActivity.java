package app.sharma.doctorclientapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button doctorlogin, patientlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        doctorlogin = findViewById(R.id.doctorlogin);
        patientlogin = findViewById(R.id.patientlogin);

        doctorlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to docker page
                Intent intent = new Intent(LoginActivity.this, DoctorActivity.class);
                startActivity(intent);
                finish();
            }
        });

        patientlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to patients page
                Intent intent = new Intent(LoginActivity.this, PatientActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}