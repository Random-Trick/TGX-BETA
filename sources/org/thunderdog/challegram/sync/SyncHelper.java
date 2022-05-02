package org.thunderdog.challegram.sync;

import android.content.Context;
import org.thunderdog.challegram.Log;

public class SyncHelper {
    public static void m14201a(Context context, int i) {
        Log.m14716v(4, "SyncHelper.cancel, accountId:%d", Integer.valueOf(i));
    }

    public static void m14200b(Context context, int i) {
        Log.m14716v(4, "SyncHelper.register, accountId:%d", Integer.valueOf(i));
        SyncAdapter.m14203d(context);
    }
}
