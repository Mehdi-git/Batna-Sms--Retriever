package ir.batna.smsretrieverlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SmsRetriever extends BroadcastReceiver {

    private static ISmsListener smsListener;

    public static void bind(ISmsListener listener) {
        smsListener = listener;

    }



    @Override
    public void onReceive(Context context, Intent intent) {

        String code = intent.getStringExtra("CODE");
        Log.d("MBD","Code received ="+code);
        smsListener.otpReceived(code);



    }
}
