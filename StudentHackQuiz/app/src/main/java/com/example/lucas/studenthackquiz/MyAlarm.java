package com.example.lucas.studenthackquiz;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Belal on 8/29/2017.
 */

//class extending the Broadcast Receiver
public class MyAlarm extends BroadcastReceiver {

    //the method will be fired when the alarm is triggerred
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent quiz = new Intent();
        quiz.setClassName("com.example.lucas.studenthackquiz", "com.example.lucas.QuizActivity");
        //you can check the log that it is fired
        //Here we are actually not doing anything
        //but you can do any task here that you want to be done at a specific time everyday
        quiz.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(quiz);
    }

}