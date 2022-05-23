package p6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import org.thunderdog.challegram.Log;

public final class u3 {
    public final Context f20821a;

    public u3(Context context) {
        this.f20821a = context;
    }

    public static String b(Context context) {
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

    public final Context a() {
        return this.f20821a;
    }
}
