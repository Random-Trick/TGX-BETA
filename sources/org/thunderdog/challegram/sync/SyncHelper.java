package org.thunderdog.challegram.sync;

import android.content.Context;
import org.thunderdog.challegram.Log;

public class SyncHelper {
    public static void a(Context context, int i10) {
        Log.v(4, "SyncHelper.cancel, accountId:%d", Integer.valueOf(i10));
    }

    public static void b(Context context, int i10) {
        Log.v(4, "SyncHelper.register, accountId:%d", Integer.valueOf(i10));
        SyncAdapter.d(context);
    }
}
