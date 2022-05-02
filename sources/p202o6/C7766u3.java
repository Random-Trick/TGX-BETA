package p202o6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import org.thunderdog.challegram.Log;

public final class C7766u3 {
    public final Context f24866a;

    public C7766u3(Context context) {
        this.f24866a = context;
    }

    public static String m15111b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), Log.TAG_YOUTUBE).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Context m15112a() {
        return this.f24866a;
    }
}
