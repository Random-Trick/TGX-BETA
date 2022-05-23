package p0;

import android.os.Bundle;
import android.os.IBinder;

public final class d {
    public static void a(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
