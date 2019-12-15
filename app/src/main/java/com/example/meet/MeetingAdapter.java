package com.example.meet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meet.fragment.Meetingroom;

import java.util.List;

public class MeetingAdapter extends RecyclerView.Adapter<MeetingAdapter.Myviewholder> {

    private Context mcontext;
    private List<ModelMeetingRoom> mdata;

    public MeetingAdapter(Meetingroom meetingroom, List<ModelMeetingRoom> modelMeetingRoomList) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater minflater=LayoutInflater.from(mcontext);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_meetingroom, parent, false);

        return new Myviewholder(view);
    }
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {

        holder.tvMeetrtitle.setText(mdata.get(position).getTitle());
        holder.img_Meet.setImageResource(mdata.get(position).getThumnail());
    }
    public int getItemCount() {
        return mdata.size();
    }

    public static class Myviewholder extends RecyclerView.ViewHolder{

        TextView tvMeetrtitle;
        ImageView img_Meet;
        public Myviewholder(View itemview){
            super(itemview);

            tvMeetrtitle=(TextView) itemview.findViewById(R.id.tvTitle);
            img_Meet=(ImageView) itemview.findViewById(R.id.ivMeetroom);
        }
    }
}
