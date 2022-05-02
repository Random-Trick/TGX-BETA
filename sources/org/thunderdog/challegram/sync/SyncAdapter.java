package org.thunderdog.challegram.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import ge.C4868i;
import org.thunderdog.challegram.Log;
import p350yd.C10536ab;
import p350yd.C10930q6;

public class SyncAdapter extends AbstractThreadedSyncAdapter {
    public SyncAdapter(Context context, boolean z) {
        super(context, z);
    }

    public static Account m14207a(Context context) {
        Account account = new Account("Telegram", "org.thunderdog.challegram.sync.account");
        ((AccountManager) context.getSystemService("account")).addAccountExplicitly(account, null, null);
        return account;
    }

    public static boolean m14206b(Context context) {
        try {
            return ContentResolver.getSyncAutomatically(m14207a(context), "org.thunderdog.challegram.sync.provider");
        } catch (SecurityException e) {
            Log.m14723e(e);
            return true;
        }
    }

    public static boolean m14205c() {
        try {
            return ContentResolver.getMasterSyncAutomatically();
        } catch (SecurityException e) {
            Log.m14723e(e);
            return true;
        }
    }

    public static void m14204d(Context context) {
        try {
            Account a = m14207a(context);
            ContentResolver.setIsSyncable(a, "org.thunderdog.challegram.sync.provider", 1);
            ContentResolver.setSyncAutomatically(a, "org.thunderdog.challegram.sync.provider", true);
            ContentResolver.addPeriodicSync(a, "org.thunderdog.challegram.sync.provider", Bundle.EMPTY, C4868i.m24726c2().m24583u1());
        } catch (SecurityException e) {
            Log.m14725e("Cannot register stub account", e, new Object[0]);
        }
    }

    public static void m14203e(Context context, C10930q6 q6Var, boolean z) {
        if (z) {
            try {
                ContentResolver.setMasterSyncAutomatically(true);
            } catch (Throwable th) {
                Log.m14723e(th);
                return;
            }
        }
        m14204d(context);
        q6Var.m2781K9().m1964D2();
    }

    @Override
    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            C10536ab.m4723Z1(getContext(), bundle != null ? bundle.getInt("account_id", -1) : -1, 2, 0L, !C10536ab.m4677l1(), 0L);
        } catch (Throwable th) {
            Log.m14725e("Failed to perform sync", th, new Object[0]);
        }
    }
}
