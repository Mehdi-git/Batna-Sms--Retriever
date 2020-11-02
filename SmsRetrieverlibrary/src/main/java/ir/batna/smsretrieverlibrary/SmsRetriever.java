package ir.batna.smsretrieverlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import ir.batna.smsretrieverlibrary.utils.Constant;

public class SmsRetriever extends BroadcastReceiver {

    private static final String TAG = SmsRetriever.class.getName();
    private static ISmsListener smsListener;

    public static void bind(ISmsListener listener) {
        smsListener = listener;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String code = intent.getStringExtra(Constant.CODE_KEY);
        smsListener.otpReceived(code);
    }
}
