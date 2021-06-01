package com.hans.model;

import com.hans.Meeting;
import com.hans.MeetingException;
import com.hans.signatory.Person;

public class KotlinInJava {

    public static void main(String[] args) {
        Meeting board = new Meeting("Board Meeting");
        board.setLocation("Chennai");
        System.out.println(board.getName() + " is in " + board.getLocation());
        board.description = "Q1 Board Meeting";
        int version = Meeting.APP_VERSION;
        System.out.println("Version : " + version);
        System.out.println(Meeting.getAppVersion());
        try {
            board.addAttendee("");
        }catch (MeetingException e) {
            e.printStackTrace();
        }
    }
}
