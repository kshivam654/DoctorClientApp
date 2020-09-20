package app.sharma.doctorclientapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PatientActivity extends AppCompatActivity {

    private RecyclerView mList;

    private LinearLayoutManager linearLayoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private List<DoctorWaiting> waitingList;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        mList = findViewById(R.id.patientrecyclerview);

        waitingList = new ArrayList<>();
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        waitingList.add(new DoctorWaiting("Dr. Ramesh", "10"));
        adapter = new WaitingAdapter(getApplicationContext(), waitingList);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        dividerItemDecoration = new DividerItemDecoration(mList.getContext(), linearLayoutManager.getOrientation());

        mList.setHasFixedSize(true);
        mList.setLayoutManager(linearLayoutManager);
        mList.addItemDecoration(dividerItemDecoration);
        mList.setAdapter(adapter);

    }
}