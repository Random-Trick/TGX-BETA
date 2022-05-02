package p163l5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p148k5.AbstractC6116h;

public abstract class AbstractDialogInterface$OnClickListenerC6344g0 implements DialogInterface.OnClickListener {
    public static AbstractDialogInterface$OnClickListenerC6344g0 m20585b(Activity activity, Intent intent, int i) {
        return new C6338e0(intent, activity, i);
    }

    public static AbstractDialogInterface$OnClickListenerC6344g0 m20584c(AbstractC6116h hVar, Intent intent, int i) {
        return new C6341f0(intent, hVar, 2);
    }

    public abstract void mo20586a();

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo20586a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
