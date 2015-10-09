package batterywidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.util.Log;

/**
 * Created by katsuhiro.ito on 15/10/09.<br>
 * バッテリーの変化を受け取るReceiverクラス
 */
public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TEST", "onReceive:" + Intent.ACTION_BATTERY_CHANGED);
        if (!intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)) {
            return;
        }
        Log.d("TEST", "health:" + intent.getIntExtra(BatteryManager.EXTRA_HEALTH, 0));
        Log.d("TEST", "level: " + intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0));
        Log.d("TEST", "scale: " + intent.getIntExtra(BatteryManager.EXTRA_SCALE, 0));
    }
}
