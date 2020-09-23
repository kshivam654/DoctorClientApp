package app.sharma.doctorclientapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WaitingAdapter extends RecyclerView.Adapter<WaitingAdapter.ViewHolder> {

    private Context context;
    private List<DoctorWaiting> list;

    public WaitingAdapter(Context context, List<DoctorWaiting> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.waitinglist, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        DoctorWaiting doctorWaiting = list.get(position);

        holder.name.setText(doctorWaiting.getName());
        holder.waiting.setText(doctorWaiting.getWaiting());
        
        holder.doctorList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, holder.name.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, waiting;
        public RelativeLayout doctorList;
        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.doctorName);
            waiting = itemView.findViewById(R.id.waiting);
            doctorList = itemView.findViewById(R.id.doctorList);
        }
    }

}