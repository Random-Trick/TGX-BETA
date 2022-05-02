package org.thunderdog.challegram.service;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import be.C1379j0;
import com.google.firebase.messaging.C3528d;
import com.google.firebase.messaging.FirebaseMessagingService;
import gd.C4779t2;
import ge.C4868i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.thunderdog.challegram.C7903b;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.FirebaseListenerService;
import org.thunderdog.challegram.sync.SyncTask;
import p082fd.C4384m;
import p082fd.C4403w;
import p108hb.C5070i;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p350yd.C10536ab;

public class FirebaseListenerService extends FirebaseMessagingService {
    public static C4384m f25644Q;
    public final Object f25645P = new Object();

    public class C7914a extends AbstractRunnableC5910b {
        public final AtomicInteger f25646M;
        public final long f25647N;
        public final int f25648O;
        public final C10536ab f25649P;
        public final boolean f25650Q;
        public final CountDownLatch f25651R;

        public C7914a(AtomicInteger atomicInteger, long j, int i, C10536ab abVar, boolean z, CountDownLatch countDownLatch) {
            this.f25646M = atomicInteger;
            this.f25647N = j;
            this.f25648O = i;
            this.f25649P = abVar;
            this.f25650Q = z;
            this.f25651R = countDownLatch;
        }

        @Override
        public void mo1364b() {
            synchronized (FirebaseListenerService.this.f25645P) {
                if (this.f25646M.compareAndSet(0, 1)) {
                    C7903b.C7904a.m14399a(this.f25647N, this.f25648O, "Starting a foreground task because the job is running too long", new Object[0]);
                    FirebaseListenerService.this.m14280H(this.f25649P, this.f25650Q, this.f25647N, this.f25648O);
                    this.f25651R.countDown();
                }
            }
        }
    }

    public void m14285C(long j, int i, long j2, AtomicInteger atomicInteger, CountDownLatch countDownLatch, boolean z, AtomicReference atomicReference) {
        String str;
        AbstractRunnableC5910b bVar;
        C7903b.C7904a.m14399a(j, i, "processPushOrSync finished in %dms", Long.valueOf(SystemClock.uptimeMillis() - j2));
        synchronized (this.f25645P) {
            if (atomicInteger.compareAndSet(1, 2)) {
                C7903b.C7904a.m14399a(j, i, "Stopping a foreground task", new Object[0]);
                ForegroundService.m14264e(getApplicationContext(), j, i);
                SyncTask.m14199r(i);
            } else {
                int i2 = atomicInteger.get();
                Object[] objArr = new Object[1];
                if (i2 == 0) {
                    str = "running";
                } else if (i2 == 1) {
                    str = "visible";
                } else {
                    str = i2 == 2 ? "finished" : Integer.toString(i2);
                }
                objArr[0] = str;
                C7903b.C7904a.m14399a(j, i, "Finishing without a foreground task, state: %s", objArr);
                atomicInteger.set(2);
                countDownLatch.countDown();
                if (z && (bVar = (AbstractRunnableC5910b) atomicReference.get()) != null) {
                    bVar.m21857c();
                    m14281G().m28055a(bVar);
                }
            }
        }
        C7903b.C7904a.m14399a(j, i, "Finished push processing task in %dms", Long.valueOf(SystemClock.uptimeMillis() - j2));
    }

    public static String m14284D(C3528d dVar) {
        JSONObject jSONObject = new JSONObject();
        m14282F(jSONObject, "google.sent_time", Long.valueOf(dVar.m30141d()));
        C3528d.C3530b c = dVar.m30142c();
        if (c != null) {
            m14282F(jSONObject, "google.notification.sound", c.m30138b());
        } else {
            Bundle extras = dVar.m30140e().getExtras();
            if (extras != null) {
                if (extras.containsKey("gcm.n.sound2")) {
                    m14282F(jSONObject, "google.notification.sound", extras.getString("gcm.n.sound2"));
                } else if (extras.containsKey("gcm.n.sound")) {
                    m14282F(jSONObject, "google.notification.sound", extras.getString("gcm.n.sound"));
                }
            }
        }
        Map<String, String> b = dVar.m30143b();
        if (b != null) {
            for (Map.Entry<String, String> entry : b.entrySet()) {
                m14282F(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        return jSONObject.toString();
    }

    public static void m14282F(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, m14279I(obj));
        } catch (JSONException unused) {
            Log.m14727e(4, "Cannot set JSON value %s: %s", str, obj);
        }
    }

    public static C4384m m14281G() {
        if (f25644Q == null) {
            f25644Q = new C4384m("FcmForegroundServiceTimer");
        }
        return f25644Q;
    }

    public static Object m14279I(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            return JSONObject.wrap(obj);
        }
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return new JSONArray((Collection) Arrays.asList((Object[]) obj));
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public final void m14287A(C10536ab abVar, final long j, String str, final int i) {
        AtomicReference atomicReference;
        boolean z;
        int i2;
        int i3;
        char c;
        int i4;
        String str2;
        boolean z2 = m14269z();
        boolean y = m14270y();
        final long uptimeMillis = SystemClock.uptimeMillis();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference2 = new AtomicReference();
        boolean k1 = abVar.m4680k1();
        if (z2 || !y || k1) {
            synchronized (this.f25645P) {
                try {
                    try {
                        C7903b.C7904a.m14399a(j, i, "Starting a foreground task because we may be operating in a constrained environment, doze: %b, network: %b, recovery: %b", Boolean.valueOf(z2), Boolean.valueOf(y), Boolean.valueOf(k1));
                        atomicInteger.set(1);
                        i2 = 2;
                        atomicReference = atomicReference2;
                        m14280H(abVar, k1, j, i);
                        countDownLatch.countDown();
                        z = true;
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
            i2 = 2;
            z = false;
        }
        final boolean z3 = z;
        final AtomicReference atomicReference3 = atomicReference;
        abVar.m4628y2(j, i, str, new Runnable() {
            @Override
            public final void run() {
                FirebaseListenerService.this.m14285C(j, i, uptimeMillis, atomicInteger, countDownLatch, z3, atomicReference3);
            }
        });
        if (!z) {
            synchronized (this.f25645P) {
                if (atomicInteger.get() != i2) {
                    C7914a aVar = new C7914a(atomicInteger, j, i, abVar, k1, countDownLatch);
                    atomicReference.set(aVar);
                    m14281G().m28052e(aVar, TimeUnit.SECONDS.toMillis(7L));
                }
            }
        }
        try {
            countDownLatch.await();
            i4 = i;
            c = 0;
            i3 = 2;
        } catch (InterruptedException unused) {
            c = 0;
            i4 = i;
            i3 = 2;
            C7903b.C7904a.m14399a(j, i4, "Interrupted.", new Object[0]);
        }
        synchronized (this.f25645P) {
            int i5 = atomicInteger.get();
            Object[] objArr = new Object[1];
            if (i5 == 0) {
                str2 = "running";
            } else if (i5 == 1) {
                str2 = "visible";
            } else {
                str2 = i5 == i3 ? "finished" : Integer.toString(i5);
            }
            objArr[c] = str2;
            C7903b.C7904a.m14399a(j, i4, "Quitting processPush() with state: %s", objArr);
            if (i5 != i3) {
                SyncTask.m14198s(j, i4);
            }
        }
    }

    public final void m14280H(C10536ab abVar, boolean z, long j, int i) {
        ForegroundService.m14265d(getApplicationContext(), C4403w.m27869i1(z ? R.string.RetrieveMessagesError : R.string.RetrievingMessages), (i == -1 || !abVar.m4661q1()) ? null : C4403w.m27865j1(R.string.RetrievingText, abVar.m4745U(i).m1456t()), C7389v0.m16705N0(), 0, j, i);
    }

    @Override
    public void mo14278n() {
        C1379j0.m37356L(getApplicationContext());
        C7903b.C7904a.m14398b("onDeletedMessages: performing sync for all accounts", new Object[0]);
        C10536ab.m4723Z1(getApplicationContext(), -1, 3, 0L, !C10536ab.m4677l1(), 0L);
    }

    @Override
    public void mo14277o(C3528d dVar) {
        final int i;
        final String D = m14284D(dVar);
        long d = dVar.m30141d();
        C1379j0.m37356L(getApplicationContext());
        final long b3 = C4868i.m24726c2().m24733b3();
        TdApi.Object e = Client.m14793e(new TdApi.GetPushReceiverId(D));
        if (e instanceof TdApi.PushReceiverId) {
            long j = ((TdApi.PushReceiverId) e).f25416id;
            int Y = C4868i.m24726c2().m24759Y(j);
            if (Y != -1) {
                C7903b.C7904a.m14399a(b3, Y, "Found account for receiverId: %d, payload: %s, sentTime: %d", Long.valueOf(j), D, Long.valueOf(d));
            } else {
                C7903b.C7904a.m14399a(b3, Y, "Couldn't find account for receiverId: %d. Sending to all accounts, payload: %s, sentTime: %d", Long.valueOf(j), D, Long.valueOf(d));
            }
            i = Y;
        } else if (C5070i.m24061i(D) || D.equals("{}") || D.equals("{\"badge\":\"0\"}")) {
            C7903b.C7904a.m14399a(b3, -1, "Empty payload: %s, error: %s. Quitting task.", D, C4779t2.m25378z5(e));
            return;
        } else {
            C7903b.C7904a.m14399a(b3, -1, "Couldn't fetch receiverId: %s, payload: %s. Sending to all instances.", C4779t2.m25378z5(e), D);
            i = -1;
        }
        C10536ab.m4664p1(i).m4790I2(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                FirebaseListenerService.this.m14287A(b3, D, i, (C10536ab) obj);
            }
        });
    }

    @Override
    public void mo14276q(final String str) {
        C1379j0.m37356L(getApplicationContext());
        C7903b.C7904a.m14398b("onNewToken %s, sending to all accounts", str);
        C10536ab.m4667o1().m4790I2(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                ((C10536ab) obj).m4754R2(str);
            }
        });
    }

    public final boolean m14270y() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean m14269z() {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((PowerManager) getSystemService("power")).isDeviceIdleMode();
        }
        return false;
    }
}
