package com.example.meet.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meet.MeetingAdapter;
import com.example.meet.ModelMeetingRoom;
import com.example.meet.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Meetingroom extends Fragment {

    List<ModelMeetingRoom> modelMeetingRoomList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_meetingroom, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


          modelMeetingRoomList = new ArrayList<>();
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.a));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.b));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.c));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.d));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.e));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.f));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.g));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.h));
          modelMeetingRoomList.add(new ModelMeetingRoom("The room",R.drawable.a));

        MeetingAdapter myadaptor= new MeetingAdapter(this,modelMeetingRoomList);
        recyclerView.setAdapter(myadaptor);
        // Inflate the layout for this fragment
        return rootView;
    }



}
