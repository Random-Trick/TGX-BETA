package org.thunderdog.challegram.service;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import ce.j0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.d;
import gd.m;
import gd.w;
import hd.t2;
import he.i;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kb.b;
import kb.j;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.json.JSONException;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.b;
import org.thunderdog.challegram.service.FirebaseListenerService;
import org.thunderdog.challegram.sync.SyncTask;
import zd.ya;

public class FirebaseListenerService extends FirebaseMessagingService {
    public static m Q;
    public final Object P = new Object();

    public class a extends b {
        public final AtomicInteger M;
        public final long N;
        public final int O;
        public final ya P;
        public final boolean Q;
        public final CountDownLatch R;

        public a(AtomicInteger atomicInteger, long j10, int i10, ya yaVar, boolean z10, CountDownLatch countDownLatch) {
            this.M = atomicInteger;
            this.N = j10;
            this.O = i10;
            this.P = yaVar;
            this.Q = z10;
            this.R = countDownLatch;
        }

        @Override
        public void b() {
            synchronized (FirebaseListenerService.this.P) {
                if (this.M.compareAndSet(0, 1)) {
                    b.a.a(this.N, this.O, "Starting a foreground task because the job is running too long", new Object[0]);
                    FirebaseListenerService.this.H(this.P, this.Q, this.N, this.O);
                    this.R.countDown();
                }
            }
        }
    }

    public void C(long j10, int i10, long j11, AtomicInteger atomicInteger, CountDownLatch countDownLatch, boolean z10, AtomicReference atomicReference) {
        String str;
        kb.b bVar;
        b.a.a(j10, i10, "processPushOrSync finished in %dms", Long.valueOf(SystemClock.uptimeMillis() - j11));
        synchronized (this.P) {
            if (atomicInteger.compareAndSet(1, 2)) {
                b.a.a(j10, i10, "Stopping a foreground task", new Object[0]);
                ForegroundService.e(getApplicationContext(), j10, i10);
                SyncTask.r(i10);
            } else {
                int i11 = atomicInteger.get();
                Object[] objArr = new Object[1];
                if (i11 == 0) {
                    str = "running";
                } else if (i11 == 1) {
                    str = "visible";
                } else {
                    str = i11 == 2 ? "finished" : Integer.toString(i11);
                }
                objArr[0] = str;
                b.a.a(j10, i10, "Finishing without a foreground task, state: %s", objArr);
                atomicInteger.set(2);
                countDownLatch.countDown();
                if (z10 && (bVar = (kb.b) atomicReference.get()) != null) {
                    bVar.c();
                    G().a(bVar);
                }
            }
        }
        b.a.a(j10, i10, "Finished push processing task in %dms", Long.valueOf(SystemClock.uptimeMillis() - j11));
    }

    public static String D(d dVar) {
        JSONObject jSONObject = new JSONObject();
        F(jSONObject, "google.sent_time", Long.valueOf(dVar.d()));
        d.b c10 = dVar.c();
        if (c10 != null) {
            F(jSONObject, "google.notification.sound", c10.b());
        } else {
            Bundle extras = dVar.e().getExtras();
            if (extras != null) {
                if (extras.containsKey("gcm.n.sound2")) {
                    F(jSONObject, "google.notification.sound", extras.getString("gcm.n.sound2"));
                } else if (extras.containsKey("gcm.n.sound")) {
                    F(jSONObject, "google.notification.sound", extras.getString("gcm.n.sound"));
                }
            }
        }
        Map<String, String> b10 = dVar.b();
        if (b10 != null) {
            for (Map.Entry<String, String> entry : b10.entrySet()) {
                F(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        return jSONObject.toString();
    }

    public static void F(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, I(obj));
        } catch (JSONException unused) {
            Log.e(4, "Cannot set JSON value %s: %s", str, obj);
        }
    }

    public static m G() {
        if (Q == null) {
            Q = new m("FcmForegroundServiceTimer");
        }
        return Q;
    }

    public static Object I(Object obj) {
        return JSONObject.wrap(obj);
    }

    public final void A(ya yaVar, final long j10, String str, final int i10) {
        AtomicReference atomicReference;
        boolean z10;
        int i11;
        int i12;
        char c10;
        int i13;
        String str2;
        boolean z11 = z();
        boolean y10 = y();
        final long uptimeMillis = SystemClock.uptimeMillis();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference2 = new AtomicReference();
        boolean k12 = yaVar.k1();
        if (z11 || !y10 || k12) {
            synchronized (this.P) {
                try {
                    try {
                        b.a.a(j10, i10, "Starting a foreground task because we may be operating in a constrained environment, doze: %b, network: %b, recovery: %b", Boolean.valueOf(z11), Boolean.valueOf(y10), Boolean.valueOf(k12));
                        atomicInteger.set(1);
                        i11 = 2;
                        atomicReference = atomicReference2;
                        H(yaVar, k12, j10, i10);
                        countDownLatch.countDown();
                        z10 = true;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } else {
            atomicReference = atomicReference2;
            i11 = 2;
            z10 = false;
        }
        final boolean z12 = z10;
        final AtomicReference atomicReference3 = atomicReference;
        yaVar.y2(j10, i10, str, new Runnable() {
            @Override
            public final void run() {
                FirebaseListenerService.this.C(j10, i10, uptimeMillis, atomicInteger, countDownLatch, z12, atomicReference3);
            }
        });
        if (!z10) {
            synchronized (this.P) {
                if (atomicInteger.get() != i11) {
                    a aVar = new a(atomicInteger, j10, i10, yaVar, k12, countDownLatch);
                    atomicReference.set(aVar);
                    G().e(aVar, TimeUnit.SECONDS.toMillis(7L));
                }
            }
        }
        try {
            countDownLatch.await();
            i13 = i10;
            c10 = 0;
            i12 = 2;
        } catch (InterruptedException unused) {
            c10 = 0;
            i13 = i10;
            i12 = 2;
            b.a.a(j10, i13, "Interrupted.", new Object[0]);
        }
        synchronized (this.P) {
            int i14 = atomicInteger.get();
            Object[] objArr = new Object[1];
            if (i14 == 0) {
                str2 = "running";
            } else if (i14 == 1) {
                str2 = "visible";
            } else {
                str2 = i14 == i12 ? "finished" : Integer.toString(i14);
            }
            objArr[c10] = str2;
            b.a.a(j10, i13, "Quitting processPush() with state: %s", objArr);
            if (i14 != i12) {
                SyncTask.s(j10, i13);
            }
        }
    }

    public final void H(ya yaVar, boolean z10, long j10, int i10) {
        ForegroundService.d(getApplicationContext(), w.i1(z10 ? R.string.RetrieveMessagesError : R.string.RetrievingMessages), (i10 == -1 || !yaVar.q1()) ? null : w.j1(R.string.RetrievingText, yaVar.U(i10).t()), v0.N0(), 0, j10, i10);
    }

    @Override
    public void n() {
        j0.L(getApplicationContext());
        b.a.b("onDeletedMessages: performing sync for all accounts", new Object[0]);
        ya.Z1(getApplicationContext(), -1, 3, 0L, !ya.l1(), 0L);
    }

    @Override
    public void o(d dVar) {
        final int i10;
        final String D = D(dVar);
        long d10 = dVar.d();
        j0.L(getApplicationContext());
        final long b32 = i.c2().b3();
        TdApi.Object e10 = Client.e(new TdApi.GetPushReceiverId(D));
        if (e10 instanceof TdApi.PushReceiverId) {
            long j10 = ((TdApi.PushReceiverId) e10).f19957id;
            int Y = i.c2().Y(j10);
            if (Y != -1) {
                b.a.a(b32, Y, "Found account for receiverId: %d, payload: %s, sentTime: %d", Long.valueOf(j10), D, Long.valueOf(d10));
            } else {
                b.a.a(b32, Y, "Couldn't find account for receiverId: %d. Sending to all accounts, payload: %s, sentTime: %d", Long.valueOf(j10), D, Long.valueOf(d10));
            }
            i10 = Y;
        } else if (ib.i.i(D) || D.equals("{}") || D.equals("{\"badge\":\"0\"}")) {
            b.a.a(b32, -1, "Empty payload: %s, error: %s. Quitting task.", D, t2.z5(e10));
            return;
        } else {
            b.a.a(b32, -1, "Couldn't fetch receiverId: %s, payload: %s. Sending to all instances.", t2.z5(e10), D);
            i10 = -1;
        }
        ya.p1(i10).I2(new j() {
            @Override
            public final void a(Object obj) {
                FirebaseListenerService.this.A(b32, D, i10, (ya) obj);
            }
        });
    }

    @Override
    public void q(final String str) {
        j0.L(getApplicationContext());
        b.a.b("onNewToken %s, sending to all accounts", str);
        ya.o1().I2(new j() {
            @Override
            public final void a(Object obj) {
                ((ya) obj).R2(str);
            }
        });
    }

    public final boolean y() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean z() {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((PowerManager) getSystemService("power")).isDeviceIdleMode();
        }
        return false;
    }
}
