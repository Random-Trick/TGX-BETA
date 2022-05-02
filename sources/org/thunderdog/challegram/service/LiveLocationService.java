package org.thunderdog.challegram.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import be.C1405v;
import java.util.ArrayList;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p350yd.C10536ab;
import p350yd.C10651f1;
import p350yd.C10930q6;

public class LiveLocationService extends Service implements C10651f1.AbstractC10652a {
    public boolean f25664M;
    public ArrayList<C10930q6> f25665a;
    public ArrayList<ArrayList<TdApi.Message>> f25666b;
    public boolean f25667c;

    @Override
    public void mo1718L1(TdApi.Location location, int i) {
    }

    @Override
    public void mo4352Q0(C10930q6 q6Var, ArrayList<TdApi.Message> arrayList) {
        ArrayList<C10930q6> arrayList2 = this.f25665a;
        if (arrayList2 != null) {
            int indexOf = arrayList2.indexOf(q6Var);
            if (arrayList == null) {
                if (indexOf != -1) {
                    this.f25665a.remove(indexOf);
                    this.f25666b.remove(indexOf);
                } else {
                    return;
                }
            } else if (indexOf != -1) {
                this.f25666b.set(indexOf, arrayList);
            } else {
                this.f25665a.add(q6Var);
                this.f25666b.add(arrayList);
            }
            m14262b();
        }
    }

    public final Notification m14263a() {
        Notification.Builder builder;
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(this, C1405v.m37109l("location", R.string.AttachLiveLocation));
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentIntent(PendingIntent.getActivity(this, 0, C1405v.m37124S(this.f25664M), 134217728));
        builder.addAction(R.drawable.baseline_stop_24_white, C4403w.m27869i1(R.string.StopLiveLocation), PendingIntent.getBroadcast(this, 100, C1405v.m37123T("org.thunderdog.challegram.ACTION_STOP_LOCATION"), 134217728));
        builder.setSmallIcon(R.drawable.baseline_location_on_24_white);
        builder.setContentTitle(C4403w.m27869i1(R.string.AttachLiveLocation));
        if (this.f25664M) {
            str = C4403w.m27869i1(R.string.LiveLocationError);
        } else {
            str = C4403w.m27869i1(R.string.AttachLiveLocation) + " " + C10536ab.m4667o1().m4735W1().m4370f(this.f25665a, this.f25666b, 0L);
        }
        builder.setContentText(str);
        builder.setOngoing(true);
        return builder.build();
    }

    public final void m14262b() {
        ArrayList<C10930q6> arrayList = this.f25665a;
        if (arrayList == null || arrayList.isEmpty()) {
            if (this.f25667c) {
                stopForeground(true);
                this.f25667c = false;
            }
        } else if (!this.f25667c) {
            C7389v0.m16703N2(this, 2147483646, m14263a());
        } else {
            try {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.notify(2147483646, m14263a());
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public void mo4351b4(ArrayList<C10930q6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        this.f25665a = arrayList;
        this.f25666b = arrayList2;
        m14262b();
    }

    @Override
    public void mo4350k1(C10930q6 q6Var, TdApi.Message message) {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        C7389v0.m16699O2(this, true, 2147483646);
        C10536ab.m4667o1().m4735W1().m4358r(this);
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        C10536ab.m4667o1().m4735W1().m4372d(this);
        return 1;
    }

    @Override
    public void mo4349w5(boolean z) {
        if (this.f25664M != z) {
            this.f25664M = z;
            m14262b();
        }
    }
}
