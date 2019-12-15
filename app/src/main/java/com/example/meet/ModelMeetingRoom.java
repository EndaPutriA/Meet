package com.example.meet;

import com.example.meet.fragment.Meetingroom;

public class ModelMeetingRoom extends Meetingroom {
    private String Title;
    private int Thumnail;

    public ModelMeetingRoom(String title,int thumnail) {
        // Required empty public constructor
        Title=title;
        Thumnail=thumnail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }



    public int getThumnail() {
        return Thumnail;
    }

    public void setThumnail(int thumnail) {
        Thumnail = thumnail;
    }
}
