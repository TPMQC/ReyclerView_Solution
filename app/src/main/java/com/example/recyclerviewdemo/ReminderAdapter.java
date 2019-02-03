package com.example.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerviewdemo.model.Reminder;

import java.util.List;

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ViewHolder> {
    //Todo:
    private Context context;
    private List<Reminder> reminderList;


    //Todo:
    public ReminderAdapter(Context context, List<Reminder> reminderList) {
        this.context = context;
        this.reminderList = reminderList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //todo:
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        //todo:
        viewHolder.bind(reminderList.get(position));
    }

    @Override
    public int getItemCount() {
        //todo:
        return reminderList != null ? reminderList.size() : 0;
    }

    //Todo:
    public void updateReminderList(List<Reminder> reminderList) {
        this.reminderList = reminderList;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        //todo:
        private TextView tvTittle, tvDate, tvPriority;
        private View container;

        public ViewHolder(@NonNull View itemView) {
            //todo:
            super(itemView);
            tvTittle = itemView.findViewById(R.id.title_value_TexView);
            tvDate = itemView.findViewById(R.id.Time_value_TextView);
            tvPriority = itemView.findViewById(R.id.priority_Value_TextView);
            container = itemView.findViewById(R.id.relativelayout_container);
        }

        private void bind(Reminder reminder) {
            //todo:
            tvTittle.setText(reminder.getTittle());
            tvPriority.setText(reminder.getPriority());
            tvDate.setText(reminder.getTime());
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // implement actions everytime a user clicks on the item row
                }
            });
        }
    }

}
