package org.thunderdog.challegram.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import ce.v;
import gd.w;
import java.util.ArrayList;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.d1;
import zd.o6;
import zd.ya;

public class LiveLocationService extends Service implements d1.a {
    public boolean M;
    public ArrayList<o6> f20118a;
    public ArrayList<ArrayList<TdApi.Message>> f20119b;
    public boolean f20120c;

    @Override
    public void H1(TdApi.Location location, int i10) {
    }

    @Override
    public void M5(o6 o6Var, TdApi.Message message) {
    }

    @Override
    public void Q3(ArrayList<o6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        this.f20118a = arrayList;
        this.f20119b = arrayList2;
        b();
    }

    public final Notification a() {
        Notification.Builder builder;
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(this, v.l("location", R.string.AttachLiveLocation));
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentIntent(PendingIntent.getActivity(this, 0, v.R(this.M), 134217728));
        builder.addAction(R.drawable.baseline_stop_24_white, w.i1(R.string.StopLiveLocation), PendingIntent.getBroadcast(this, 100, v.S("org.thunderdog.challegram.ACTION_STOP_LOCATION"), 134217728));
        builder.setSmallIcon(R.drawable.baseline_location_on_24_white);
        builder.setContentTitle(w.i1(R.string.AttachLiveLocation));
        if (this.M) {
            str = w.i1(R.string.LiveLocationError);
        } else {
            str = w.i1(R.string.AttachLiveLocation) + " " + ya.o1().W1().g(this.f20118a, this.f20119b, 0L);
        }
        builder.setContentText(str);
        builder.setOngoing(true);
        return builder.build();
    }

    public final void b() {
        ArrayList<o6> arrayList = this.f20118a;
        if (arrayList == null || arrayList.isEmpty()) {
            if (this.f20120c) {
                stopForeground(true);
                this.f20120c = false;
            }
        } else if (!this.f20120c) {
            v0.N2(this, 2147483646, a());
        } else {
            try {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.notify(2147483646, a());
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public void f2(o6 o6Var, ArrayList<TdApi.Message> arrayList) {
        ArrayList<o6> arrayList2 = this.f20118a;
        if (arrayList2 != null) {
            int indexOf = arrayList2.indexOf(o6Var);
            if (arrayList == null) {
                if (indexOf != -1) {
                    this.f20118a.remove(indexOf);
                    this.f20119b.remove(indexOf);
                } else {
                    return;
                }
            } else if (indexOf != -1) {
                this.f20119b.set(indexOf, arrayList);
            } else {
                this.f20118a.add(o6Var);
                this.f20119b.add(arrayList);
            }
            b();
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        v0.O2(this, true, 2147483646);
        ya.o1().W1().r(this);
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        ya.o1().W1().d(this);
        return 1;
    }

    @Override
    public void q5(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            b();
        }
    }
}
