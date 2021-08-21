package com.hans.model;

import com.hans.Meeting;
import com.hans.MeetingException;
import com.hans.coursera.kforj._01basics.Util;
import com.hans.coursera.kforj._03extensions.ExtensionFunctionsKt;
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
        System.out.println(Util.sum(10, 23));
        try {
            board.addAttendee("");
        }catch (MeetingException e) {
            System.out.println("Failed to add attendee");
            e.printStackTrace();
        }
        System.out.println("========================");
        System.out.println("Last charcter in abc : " + ExtensionFunctionsKt.lastChar("abc"));
        System.out.println("Repeat abc 4 times : " + ExtensionFunctionsKt.repeat("abc", 4));
    }
}
