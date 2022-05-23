package m5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import l5.h;

public abstract class g0 implements DialogInterface.OnClickListener {
    public static g0 b(Activity activity, Intent intent, int i10) {
        return new e0(intent, activity, i10);
    }

    public static g0 c(h hVar, Intent intent, int i10) {
        return new f0(intent, hVar, 2);
    }

    public abstract void a();

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            a();
        } catch (ActivityNotFoundException e10) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
