package com.example.lucas.studenthackquiz;

        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.provider.Settings;
        import android.os.Vibrator;

/**axcccccccccccccccccccccccc
 * Created by Belal on 8/29/2017.
 */

//class extending the Broadcast Receiver
public class MyAlarm extends BroadcastReceiver {
    public static Vibrator v;
    public static MediaPlayer mediaPlayer;
    //the method will be fired when the alarm is triggerred
    @Override
    public void onReceive(Context context, Intent intent) {

        //but you can do any task here that you want to be done at a specific time everyday
        mediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.start();


        // Get instance of Vibrator from current Context
        v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);

// Start without a delay
// Vibrate for 100 milliseconds
// Sleep for 1000 milliseconds
        long[] pattern = {0, 100, 1000};

// The '0' here means to repeat indefinitely
// '0' is actually the index at which the pattern keeps repeating from (the start)
// To repeat the pattern from any other point, you could increase the index, e.g. '1'
        v.vibrate(pattern, 0);
        Intent quiz = new Intent(context, QuizActivity.class);
        quiz.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(quiz);
    }

}