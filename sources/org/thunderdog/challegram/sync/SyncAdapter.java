package org.thunderdog.challegram.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import he.i;
import org.thunderdog.challegram.Log;
import zd.o6;
import zd.ya;

public class SyncAdapter extends AbstractThreadedSyncAdapter {
    public SyncAdapter(Context context, boolean z10) {
        super(context, z10);
    }

    public static Account a(Context context) {
        Account account = new Account("Telegram", "org.thunderdog.challegram.sync.account");
        ((AccountManager) context.getSystemService("account")).addAccountExplicitly(account, null, null);
        return account;
    }

    public static boolean b(Context context) {
        try {
            return ContentResolver.getSyncAutomatically(a(context), "org.thunderdog.challegram.sync.provider");
        } catch (SecurityException e10) {
            Log.e(e10);
            return true;
        }
    }

    public static boolean c() {
        try {
            return ContentResolver.getMasterSyncAutomatically();
        } catch (SecurityException e10) {
            Log.e(e10);
            return true;
        }
    }

    public static void d(Context context) {
        try {
            Account a10 = a(context);
            ContentResolver.setIsSyncable(a10, "org.thunderdog.challegram.sync.provider", 1);
            ContentResolver.setSyncAutomatically(a10, "org.thunderdog.challegram.sync.provider", true);
            ContentResolver.addPeriodicSync(a10, "org.thunderdog.challegram.sync.provider", Bundle.EMPTY, i.c2().u1());
        } catch (SecurityException e10) {
            Log.e("Cannot register stub account", e10, new Object[0]);
        }
    }

    public static void e(Context context, o6 o6Var, boolean z10) {
        if (z10) {
            try {
                ContentResolver.setMasterSyncAutomatically(true);
            } catch (Throwable th) {
                Log.e(th);
                return;
            }
        }
        d(context);
        o6Var.O9().D2();
    }

    @Override
    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            ya.Z1(getContext(), bundle != null ? bundle.getInt("account_id", -1) : -1, 2, 0L, !ya.l1(), 0L);
        } catch (Throwable th) {
            Log.e("Failed to perform sync", th, new Object[0]);
        }
    }
}
