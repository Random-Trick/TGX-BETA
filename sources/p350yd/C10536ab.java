package p350yd;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import be.C1379j0;
import com.google.firebase.messaging.FirebaseMessaging;
import gd.C4779t2;
import ge.C4868i;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.C7903b;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p012ab.C0245c;
import p034c7.C2021c;
import p037cb.C2060d;
import p037cb.C2064f;
import p082fd.C4363d0;
import p082fd.C4367e0;
import p108hb.C5062b;
import p108hb.C5070i;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p177m6.AbstractC6765g;
import p177m6.AbstractC6767h;
import p181mb.C6813d;
import p292ud.C9726c;
import p292ud.C9773p0;
import p350yd.C10536ab;
import p350yd.C10827lb;

public class C10536ab implements Iterable<C11131y6>, C1379j0.AbstractC1380a {
    public static final AtomicBoolean f33768m0 = new AtomicBoolean(false);
    public static C10536ab f33769n0;
    public static Set<String> f33770o0;
    public static Set<String> f33771p0;
    public static Set<String> f33772q0;
    public static Set<String> f33773r0;
    public final C4868i.AbstractC4881m f33779R;
    public final C4367e0 f33781T;
    public final C9726c f33783V;
    public final C9773p0 f33784W;
    public boolean f33785X;
    public boolean f33786Y;
    public boolean f33787Z;
    public TdApi.NetworkType f33789a0;
    public C11131y6 f33792c;
    public List<C11131y6> f33793c0;
    public int f33794d0;
    public int f33795e0;
    public String f33797g0;
    public String f33798h0;
    public PowerManager.WakeLock f33801k0;
    public int f33802l0;
    public final ArrayList<C11131y6> f33788a = new ArrayList<>();
    public int f33790b = -1;
    public final C11071v9 f33774M = new C11071v9(this);
    public final HandlerC10540d f33775N = new HandlerC10540d(this);
    public final C10651f1 f33776O = new C10651f1(this);
    public final C10827lb.C10828a f33777P = new C10827lb.C10828a("NotificationQueue", this);
    public final C10552b0 f33778Q = new C10552b0(this);
    public final Comparator<C11131y6> f33791b0 = C11167z9.f35798a;
    public int f33796f0 = 0;
    public final ArrayList<C11131y6> f33799i0 = new ArrayList<>();
    public final Object f33800j0 = new Object();
    public final String f33782U = m4812D0();
    public C4868i.C4873e f33780S = C4868i.m24726c2().m24752Z();

    public class C10537a implements C4868i.AbstractC4881m {
        public C10537a() {
        }

        @Override
        public void mo4623P4(C4868i.C4880l lVar, boolean z) {
        }

        @Override
        public void mo4622g7(boolean z) {
        }

        @Override
        public void mo4621k3(int i, String str, int i2, TdApi.ProxyType proxyType, String str2, boolean z, boolean z2) {
            if (z) {
                Iterator<C11131y6> it = C10536ab.this.iterator();
                while (it.hasNext()) {
                    C10930q6 q6Var = it.next().f35695P;
                    if (q6Var != null) {
                        q6Var.m2390jc(i, str, i2, proxyType);
                    }
                }
            }
        }
    }

    public class RunnableC10538b implements Runnable {
        public final AbstractC10542f f33804M;
        public final Runnable f33805N;
        public final LinkedList f33807a;
        public final AtomicInteger f33808b;
        public final int f33809c;

        public RunnableC10538b(LinkedList linkedList, AtomicInteger atomicInteger, int i, AbstractC10542f fVar, Runnable runnable) {
            this.f33807a = linkedList;
            this.f33808b = atomicInteger;
            this.f33809c = i;
            this.f33804M = fVar;
            this.f33805N = runnable;
        }

        public void m4618c(boolean z, C11131y6 y6Var) {
            if (z) {
                run();
            } else {
                y6Var.m1474f(this);
            }
        }

        public void m4617d(AbstractC10542f fVar, final C11131y6 y6Var, final boolean z) {
            fVar.mo2043a(y6Var, new Runnable() {
                @Override
                public final void run() {
                    C10536ab.RunnableC10538b.this.m4618c(z, y6Var);
                }
            });
        }

        @Override
        public void run() {
            ArrayList<Runnable> arrayList;
            boolean z;
            Runnable runnable;
            synchronized (this.f33807a) {
                this.f33808b.decrementAndGet();
                arrayList = null;
                while (true) {
                    z = true;
                    if (this.f33807a.isEmpty() || this.f33808b.get() >= this.f33809c) {
                        break;
                    }
                    this.f33808b.incrementAndGet();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    final C11131y6 y6Var = (C11131y6) this.f33807a.removeFirst();
                    final boolean B = y6Var.m1509B(true);
                    final AbstractC10542f fVar = this.f33804M;
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            C10536ab.RunnableC10538b.this.m4617d(fVar, y6Var, B);
                        }
                    });
                }
                if (this.f33808b.get() != 0 || !this.f33807a.isEmpty()) {
                    z = false;
                }
            }
            if (arrayList != null) {
                for (Runnable runnable2 : arrayList) {
                    runnable2.run();
                }
            }
            if (z && (runnable = this.f33805N) != null) {
                runnable.run();
            }
        }
    }

    public static class C10539c {
        public C11131y6 f33810a;
        public List<C11131y6> f33811b;
        public int f33812c;

        public C10539c(C11131y6 y6Var, List<C11131y6> list, int i) {
            this.f33810a = y6Var;
            this.f33811b = list;
            this.f33812c = i;
        }
    }

    public static class HandlerC10540d extends Handler {
        public final C10536ab f33813a;

        public HandlerC10540d(C10536ab abVar) {
            super(Looper.getMainLooper());
            this.f33813a = abVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f33813a.m4712c1(message);
        }
    }

    public interface AbstractC10541e {
        void mo3003a(C10930q6 q6Var, Runnable runnable);
    }

    public interface AbstractC10542f {
        void mo2043a(C11131y6 y6Var, Runnable runnable);
    }

    public C10536ab(int i) {
        C10537a aVar = new C10537a();
        this.f33779R = aVar;
        Client.m14781q(new Client.AbstractC7863e() {
            @Override
            public final void mo3307a(Client client, String str, boolean z) {
                C10536ab.this.m4815C1(client, str, z);
            }
        });
        C4868i.m24726c2().m24570w();
        C4367e0 e0Var = new C4367e0(C1379j0.m37315n(), this);
        this.f33781T = e0Var;
        C9773p0 p0Var = new C9773p0(this);
        this.f33784W = p0Var;
        this.f33783V = new C9726c(this, p0Var);
        m4731X1(i);
        C4868i.m24726c2().m24609r(aVar);
        m4707d2().m3051i();
        e0Var.m28125b();
        e0Var.m28126a().m28138o();
        C1379j0.m37335d(this);
        mo1641h(C1379j0.m37364F());
        m4697g0();
    }

    public static boolean m4823A1(C11131y6 y6Var) {
        return y6Var.m1500K() && y6Var.m1510A();
    }

    public static Set<String> m4820B0(boolean z) {
        Set<String> set = z ? f33772q0 : f33773r0;
        if (set != null) {
            return set;
        }
        String[] S0 = m4752S0(z, false);
        HashSet hashSet = new HashSet(S0.length);
        Collections.addAll(hashSet, S0);
        if (z) {
            f33772q0 = hashSet;
        } else {
            f33773r0 = hashSet;
        }
        return hashSet;
    }

    public static void m4819B1(boolean z, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, long j, int i, long j2) {
        if (z) {
            synchronized (atomicBoolean) {
                atomicBoolean.set(true);
                countDownLatch.countDown();
            }
        }
        C7903b.C7904a.m14399a(j, i, "Finished sync in %dms", Long.valueOf(SystemClock.uptimeMillis() - j2));
    }

    public static int m4818B2() {
        File w0 = m4638w0();
        if (!w0.exists()) {
            return 1;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(w0, "r");
            int max = Math.max(1, randomAccessFile.readInt());
            randomAccessFile.close();
            return max;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static String m4816C0() {
        return C7389v0.m16733G0() + " " + Build.MODEL;
    }

    public void m4815C1(Client client, String str, boolean z) {
        C4868i.m24726c2().m24774V5(m4646u0(client), str, 4);
        if (z) {
            Tracer.m14769k(str);
        }
    }

    public static int m4814C2() {
        File w0 = m4638w0();
        if (!w0.exists()) {
            return 0;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(w0, "r");
            int max = Math.max(1, randomAccessFile.readInt());
            int readInt = randomAccessFile.readInt();
            if (readInt < 0 || readInt >= max) {
                readInt = 0;
            }
            randomAccessFile.close();
            return readInt;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String m4812D0() {
        File file = new File(C1379j0.m37309q().getFilesDir(), "langpack");
        if (file.exists() || file.mkdir()) {
            return new File(file, "main").getPath();
        }
        throw new IllegalStateException("Cannot create working directory: " + file.getPath());
    }

    public static int m4811D1(C11131y6 y6Var, C11131y6 y6Var2) {
        if (y6Var.m1500K() != y6Var2.m1500K()) {
            return Boolean.compare(y6Var.m1500K(), y6Var2.m1500K());
        }
        return Long.compare(y6Var2.m1498M(), y6Var.m1498M());
    }

    public static File m4808E0(boolean z) {
        return new File(m4804F0(z));
    }

    public static boolean m4807E1(C11131y6 y6Var, C11131y6 y6Var2, C11131y6 y6Var3) {
        int i = y6Var3.f35705b;
        return i == y6Var.f35705b || (y6Var2 != null && i == y6Var2.f35705b);
    }

    public static String m4804F0(boolean z) {
        StringBuilder sb2 = new StringBuilder(m4748T0(0, false));
        sb2.append("log");
        if (z) {
            sb2.append(".old");
        }
        return sb2.toString();
    }

    public void m4803F1(int i) {
        int v0 = m4642v0(i);
        if (v0 != -1) {
            m4709d0(v0, 0);
        }
    }

    public static File m4800G0(boolean z) {
        return new File(m4796H0(z));
    }

    public void m4799G1(int i, TdApi.AuthorizationState authorizationState, int i2) {
        m4716b1().m1544k(this.f33788a.get(i), authorizationState, i2);
    }

    public static String m4796H0(boolean z) {
        File logDir = Log.getLogDir();
        String str = "tdlib_log.txt";
        if (z) {
            str = str + ".old";
        }
        return new File(logDir, str).getPath();
    }

    public static void m4795H1(int i, C10666fb fbVar, C10930q6 q6Var, Runnable runnable) {
        q6Var.m2912C6();
        if (i == 0) {
            q6Var.m2440ga().m3062x1(fbVar);
        } else if (i == 1) {
            q6Var.m2440ga().m3058y1(fbVar.f34135b);
        } else if (i == 2) {
            fbVar.m4339h(q6Var);
        } else if (i == 3) {
            fbVar.m4343d(q6Var);
        }
        q6Var.m2440ga().m3147b2(runnable);
    }

    public static void m4791I1(C10666fb fbVar, C10930q6 q6Var, Runnable runnable) {
        fbVar.m4339h(q6Var);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Set<String> m4788J0(boolean z) {
        Set<String> set = z ? f33770o0 : f33771p0;
        if (set != null) {
            return set;
        }
        String[] S0 = m4752S0(z, true);
        HashSet hashSet = new HashSet(S0.length);
        Collections.addAll(hashSet, S0);
        if (z) {
            f33770o0 = hashSet;
        } else {
            f33771p0 = hashSet;
        }
        return hashSet;
    }

    public static void m4787J1(final Runnable runnable, final C10930q6 q6Var, final C10666fb fbVar, TdApi.Message message) {
        if (message == null) {
            C1379j0.m37292y0(R.string.NotificationReplyFailed, 0);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        q6Var.m2558Z1(message, new Runnable() {
            @Override
            public final void run() {
                C10536ab.m4791I1(C10666fb.this, q6Var, runnable);
            }
        });
    }

    public static void m4783K1(final C10666fb fbVar, CharSequence charSequence, final C10930q6 q6Var, final Runnable runnable) {
        long j;
        long j2 = fbVar.f34136c;
        long j3 = fbVar.f34137d;
        if (fbVar.f34140g) {
            long[] jArr = fbVar.f34142i;
            j = jArr[jArr.length - 1];
        } else {
            j = 0;
        }
        q6Var.m2215ub(j2, j3, j, false, true, new TdApi.InputMessageText(new TdApi.FormattedText(charSequence.toString(), null), false, false), new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10536ab.m4787J1(runnable, q6Var, fbVar, (TdApi.Message) obj);
            }
        });
    }

    public static void m4779L1(CountDownLatch countDownLatch, long j, int i, String str) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Long.valueOf(SystemClock.uptimeMillis() - j);
        objArr[1] = Integer.valueOf(i);
        if (countDownLatch != null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = str;
        Log.m14721i((int) Log.TAG_ACCOUNTS, "[TASK] END %dms, accountId:%d, isBackground:%b, tag:%s", objArr);
    }

    public static TdApi.LanguagePackStringValue m4776M0(String str, String str2, String str3) {
        TdApi.Object e;
        if (C5070i.m24061i(str2) || (e = Client.m14793e(new TdApi.GetLanguagePackString(str, "android_x", str3, str2))) == null) {
            return null;
        }
        int constructor = e.getConstructor();
        if (constructor == -1679978726) {
            if (((TdApi.Error) e).code != 404) {
                Log.m14724e("getString %s error:%s, languagePackId:%s", str2, C4779t2.m25378z5(e), str3);
            }
            return null;
        } else if (constructor == -249256352 || constructor == 1906840261) {
            return (TdApi.LanguagePackStringValue) e;
        } else {
            return null;
        }
    }

    public static void m4775M1(Runnable runnable, C11131y6 y6Var) {
        if (runnable != null) {
            runnable.run();
        }
        y6Var.mo1480c().m2850G4();
    }

    public static void m4771N1(AbstractC10541e eVar, final C11131y6 y6Var, final Runnable runnable) {
        eVar.mo3003a(y6Var.mo1480c(), new Runnable() {
            @Override
            public final void run() {
                C10536ab.m4775M1(runnable, y6Var);
            }
        });
    }

    public static void m4767O1(final AbstractC10541e eVar, final C11131y6 y6Var, final Runnable runnable) {
        y6Var.mo1480c().m2912C6();
        y6Var.mo1480c().m2543a2(new Runnable() {
            @Override
            public final void run() {
                C10536ab.m4771N1(C10536ab.AbstractC10541e.this, y6Var, runnable);
            }
        });
    }

    public static String m4764P0() {
        try {
            return C2060d.m35728a(C1379j0.m37311p());
        } catch (Throwable unused) {
            return "en-US";
        }
    }

    public static void m4763P1(final long j, final int i, final String str, C10536ab abVar, final AbstractC10541e eVar, AbstractC5912d dVar, final CountDownLatch countDownLatch) {
        abVar.m4644u2(i, new AbstractC10542f() {
            @Override
            public final void mo2043a(C11131y6 y6Var, Runnable runnable) {
                C10536ab.m4767O1(C10536ab.AbstractC10541e.this, y6Var, runnable);
            }
        }, 5, dVar, new Runnable() {
            @Override
            public final void run() {
                C10536ab.m4779L1(countDownLatch, j, i, str);
            }
        });
        if (countDownLatch != null) {
            C7389v0.m16602o(countDownLatch);
        }
    }

    public static String m4760Q0() {
        return C2064f.m35725a() + " (" + Build.VERSION.SDK_INT + ")";
    }

    public static void m4759Q1(AbstractC10542f fVar, C11131y6 y6Var, Runnable runnable) {
        try {
            y6Var.mo1480c();
            fVar.mo2043a(y6Var, runnable);
        } catch (Throwable th) {
            Log.m14725e("Unable to create TDLib instance", th, new Object[0]);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static C10930q6 m4756R0(int i) {
        return m4664p1(i).m4745U(i).mo1480c();
    }

    public static void m4755R1(long j, String str, C11131y6 y6Var, Runnable runnable) {
        y6Var.mo1480c().m2812Ia(j, str, runnable);
    }

    public static String[] m4752S0(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return new String[]{"profile_photos", "secret", "thumbnails", "wallpapers", "stickers"};
            }
            return new String[]{"passport", "profile_photos", "secret", "secret_thumbnails", "temp", "thumbnails", "wallpapers", "stickers"};
        } else if (z2) {
            return new String[]{"animations", "documents", "music", "photos", "videos"};
        } else {
            return new String[]{"animations", "documents", "music", "photos", "temp", "video_notes", "videos", "voice"};
        }
    }

    public static String m4748T0(int i, boolean z) {
        return m4744U0(i, z, true);
    }

    public static void m4747T1(AbstractC5918j jVar, C10930q6 q6Var, Runnable runnable) {
        jVar.mo1330a(q6Var);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static String m4744U0(int i, boolean z, boolean z2) {
        File externalFilesDir = z ? C1379j0.m37315n().getExternalFilesDir(null) : null;
        if (externalFilesDir != null) {
            if (i != 0) {
                File file = new File(externalFilesDir, "x_account" + i);
                if (!file.exists()) {
                    if (!z2) {
                        return null;
                    }
                    if (!file.mkdir()) {
                        throw new IllegalStateException("Could not create external working directory: " + file.getPath());
                    }
                }
                externalFilesDir = file;
            }
            return C4779t2.m25642M4(externalFilesDir.getPath());
        } else if (z && !z2) {
            return null;
        } else {
            File filesDir = C1379j0.m37309q().getFilesDir();
            String str = "tdlib";
            if (i != 0) {
                str = str + i;
            }
            File file2 = new File(filesDir, str);
            if (!file2.exists()) {
                if (!z2) {
                    return null;
                }
                if (!file2.mkdir()) {
                    throw new IllegalStateException("Cannot create working directory: " + file2.getPath());
                }
            }
            return C4779t2.m25642M4(file2.getPath());
        }
    }

    public static void m4743U1(final AbstractC5918j jVar, long j, boolean z, boolean z2, C11131y6 y6Var, final Runnable runnable) {
        final C10930q6 c = y6Var.mo1480c();
        if (jVar != null) {
            c.m2842Gc(j, new Runnable() {
                @Override
                public final void run() {
                    C10536ab.m4747T1(AbstractC5918j.this, c, runnable);
                }
            }, z, z2);
        } else {
            c.m2842Gc(j, runnable, z, z2);
        }
    }

    public static File m4740V0() {
        File file = new File(C1379j0.m37309q().getFilesDir(), "tgvoip");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        throw new IllegalStateException("Cannot create working directory: " + file.getPath());
    }

    public static AbstractC5912d<C11131y6> m4727Y1() {
        return C10584ca.f33933a;
    }

    public static boolean m4723Z1(Context context, final int i, int i2, long j, final boolean z, long j2) {
        boolean z2;
        final long uptimeMillis = SystemClock.uptimeMillis();
        C1379j0.m37356L(context);
        long b3 = j == 0 ? C4868i.m24726c2().m24733b3() : j;
        CountDownLatch countDownLatch = null;
        AtomicBoolean atomicBoolean = z ? new AtomicBoolean(false) : null;
        if (z) {
            countDownLatch = new CountDownLatch(1);
        }
        final CountDownLatch countDownLatch2 = countDownLatch;
        if (i == -1) {
            C7903b.C7904a.m14399a(b3, i, "Performing sync for all accounts, cause: %d, synchronized: %b, timeout: %d, initialized in: %d", Integer.valueOf(i2), Boolean.valueOf(z), Long.valueOf(j2), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        } else {
            C7903b.C7904a.m14399a(b3, i, "Performing sync for account, cause: %d, synchronized: %b, timeout: %d, initialized in: %d", Integer.valueOf(i2), Boolean.valueOf(z), Long.valueOf(j2), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        final AtomicBoolean atomicBoolean2 = atomicBoolean;
        final long j3 = b3;
        long j4 = b3;
        m4664p1(i).m4710c3(j4, i, new Runnable() {
            @Override
            public final void run() {
                C10536ab.m4819B1(z, atomicBoolean2, countDownLatch2, j3, i, uptimeMillis);
            }
        }, true, true, 5, null);
        if (!z) {
            return true;
        }
        try {
            if (j2 > 0) {
                countDownLatch2.await(j2, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch2.await();
            }
        } catch (InterruptedException unused) {
            C7903b.C7904a.m14399a(j4, i, "Sync was interrupted, elapsed: %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        synchronized (atomicBoolean) {
            z2 = atomicBoolean.get();
        }
        return z2;
    }

    public static void m4718a3() {
        Client.m14793e(new TdApi.SetLogVerbosityLevel(5));
        Client.m14793e(new TdApi.SetLogStream(new TdApi.LogStreamDefault()));
        Log.setLogLevel(5);
    }

    public static int m4717b0(int i) {
        return (i * 21) + 8;
    }

    public static int m4685i3(RandomAccessFile randomAccessFile, C10539c cVar) {
        int size = cVar.f33811b.size();
        randomAccessFile.setLength(m4717b0(size));
        randomAccessFile.writeInt(size);
        randomAccessFile.writeInt(cVar.f33812c);
        int i = 0;
        for (C11131y6 y6Var : cVar.f33811b) {
            y6Var.m1493R(randomAccessFile);
            i++;
        }
        return i;
    }

    public static boolean m4683j1() {
        return !m4677l1();
    }

    public static boolean m4677l1() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }

    public static long m4674m0() {
        return m4665p0(0);
    }

    public static long m4671n0(boolean z) {
        return m4665p0(z ? 1 : 2);
    }

    public static long m4668o0(boolean z) {
        File file = new File(m4796H0(z));
        long length = file.length();
        if (length <= 0) {
            return 0L;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(0L);
            randomAccessFile.close();
            return length;
        } catch (IOException unused) {
            return -1L;
        }
    }

    public static C10536ab m4667o1() {
        return m4664p1(-1);
    }

    public static long m4665p0(int i) {
        long j;
        if (C1379j0.f5013g != 1) {
            Client.m14793e(new TdApi.SetLogVerbosityLevel(0));
            Client.m14793e(new TdApi.SetLogStream(new TdApi.LogStreamEmpty()));
        }
        long j2 = -1;
        if (i == 0) {
            long o0 = m4668o0(false);
            if (o0 != -1) {
                long o02 = m4668o0(true);
                o0 = o02 != -1 ? o0 + o02 : -1L;
            }
            if (o0 != -1) {
                long o03 = m4668o0(false);
                o0 = o03 != -1 ? o0 + o03 : -1L;
            }
            j = o0;
            if (j != -1) {
                long o04 = m4668o0(true);
                if (o04 != -1) {
                    j2 = j + o04;
                }
                j = j2;
            }
        } else if (i == 1) {
            j = m4668o0(true);
        } else if (i != 2) {
            return -1L;
        } else {
            j = m4668o0(false);
        }
        C4868i.m24726c2().m24570w();
        return j;
    }

    public static C10536ab m4664p1(int i) {
        if (f33769n0 == null) {
            synchronized (C10536ab.class) {
                if (f33769n0 == null) {
                    if (!f33768m0.getAndSet(true)) {
                        f33769n0 = new C10536ab(i);
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
        return f33769n0;
    }

    public void m4657r1(int i, int i2, AbstractC5917i iVar) {
        Log.m14721i((int) Log.TAG_ACCOUNTS, "Switching preferred account %d -> %d, reason:%d", Integer.valueOf(this.f33790b), Integer.valueOf(i), Integer.valueOf(i2));
        int i3 = this.f33790b;
        this.f33790b = i;
        m4695g2(this.f33788a.get(i), i2, (i3 < 0 || i3 >= this.f33788a.size()) ? null : this.f33788a.get(i3));
        m4766O2(i);
        if (iVar != null) {
            iVar.mo1322a(true);
        }
    }

    public static void m4656r2(Context context, final int i, final C10666fb fbVar) {
        if (fbVar != null) {
            int i2 = fbVar.f34134a;
            m4648t2(context, i2, "external:" + i, new AbstractC10541e() {
                @Override
                public final void mo3003a(C10930q6 q6Var, Runnable runnable) {
                    C10536ab.m4795H1(i, fbVar, q6Var, runnable);
                }
            }, null);
        }
    }

    public void m4653s1(final int i, final AbstractC5917i iVar, final int i2) {
        if (!this.f33788a.get(i).m1500K()) {
            m4798G2(new Runnable() {
                @Override
                public final void run() {
                    C10536ab.this.m4657r1(i, i2, iVar);
                }
            });
        } else if (iVar != null) {
            iVar.mo1322a(false);
        }
    }

    public static void m4652s2(Context context, final CharSequence charSequence, final C10666fb fbVar) {
        if (fbVar != null && fbVar.f34142i != null && !C5070i.m24061i(charSequence)) {
            m4648t2(context, fbVar.f34134a, "reply", new AbstractC10541e() {
                @Override
                public final void mo3003a(C10930q6 q6Var, Runnable runnable) {
                    C10536ab.m4783K1(C10666fb.this, charSequence, q6Var, runnable);
                }
            }, null);
        }
    }

    public void m4649t1(Exception exc) {
        String str;
        Log.m14728e(4, "Failed to retrieve firebase token", exc, new Object[0]);
        if (C5070i.m24061i(exc.getMessage())) {
            str = Log.toString(exc);
        } else {
            str = exc.getClass().getSimpleName() + ": " + exc.getMessage();
        }
        m4714b3(1, str);
    }

    public static void m4648t2(Context context, final int i, final String str, final AbstractC10541e eVar, final AbstractC5912d<C11131y6> dVar) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        C1379j0.m37356L(context);
        final C10536ab p1 = m4664p1(i);
        p1.m4794H2(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10536ab.m4763P1(uptimeMillis, i, str, p1, eVar, dVar, (CountDownLatch) obj);
            }
        });
    }

    public void m4645u1(String str) {
        C7903b.C7904a.m14398b("FirebaseMessaging.getInstance().getToken(): \"%s\"", str);
        m4754R2(str);
    }

    public static void m4641v1(C11131y6 y6Var, Runnable runnable) {
        y6Var.mo1480c().m2334n4(runnable);
    }

    public static File m4638w0() {
        return new File(C1379j0.m37315n().getFilesDir(), "tdlib_accounts.bin");
    }

    public static boolean m4637w1(C11131y6 y6Var) {
        return !y6Var.m1500K() || y6Var.m1509B(false);
    }

    public static long m4634x0() {
        return m4638w0().length();
    }

    public int m4633x1(C11131y6 y6Var, C11131y6 y6Var2) {
        C11131y6 y6Var3 = this.f33792c;
        boolean z = true;
        if ((y6Var == y6Var3) == (y6Var2 == y6Var3)) {
            return y6Var.compareTo(y6Var2);
        }
        boolean z2 = y6Var2 == y6Var3;
        if (y6Var != y6Var3) {
            z = false;
        }
        return Boolean.compare(z2, z);
    }

    public static boolean m4629y1(C11131y6 y6Var) {
        return !y6Var.m1500K();
    }

    public void m4625z1(C11131y6 y6Var) {
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next != y6Var) {
                next.m1497N(false);
            }
        }
    }

    public static C10539c m4624z2(C10536ab abVar, RandomAccessFile randomAccessFile, int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long length = randomAccessFile.length();
        Log.m14719i("readAccountConfig binlogSize:%d", Long.valueOf(length));
        int readInt = length >= 4 ? randomAccessFile.readInt() : 0;
        C11131y6 y6Var = null;
        if (readInt <= 0 || readInt > 65535) {
            Log.m14719i("readAccountConfig accountNum:%d accounts in %dms", Integer.valueOf(readInt), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            return null;
        }
        int readInt2 = randomAccessFile.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            C11131y6 y6Var2 = new C11131y6(abVar, i2, randomAccessFile, i);
            if (!y6Var2.m1500K() && (i2 == readInt2 || y6Var == null || y6Var.f35705b < readInt2)) {
                y6Var = y6Var2;
            }
            arrayList.add(y6Var2);
        }
        Log.m14719i("readAccountConfig finished, accountNum:%d in %dms, preferredAccountId:%d", Integer.valueOf(arrayList.size()), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Integer.valueOf(readInt2));
        return new C10539c(y6Var, arrayList, readInt2);
    }

    public int m4824A0() {
        return this.f33799i0.size();
    }

    public final void m4822A2() {
        C10539c cVar = null;
        this.f33792c = null;
        this.f33790b = 0;
        File w0 = m4638w0();
        if (w0.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(w0, "r");
                cVar = m4624z2(this, randomAccessFile, 2);
                randomAccessFile.close();
            } catch (IOException e) {
                Log.m14723e(e);
            }
        } else {
            try {
                if (!w0.createNewFile()) {
                    Log.m14724e("Unable to create TDLib config file: %s", w0.getPath());
                }
            } catch (IOException e2) {
                Log.m14723e(e2);
            }
        }
        if (cVar != null) {
            this.f33790b = cVar.f33812c;
            this.f33792c = cVar.f33810a;
            this.f33788a.addAll(cVar.f33811b);
            C11131y6 y6Var = this.f33792c;
            if (y6Var != null) {
                y6Var.m1496O();
            }
            for (C11131y6 y6Var2 : cVar.f33811b) {
                m4701f0(y6Var2);
            }
        }
        if (this.f33788a.isEmpty()) {
            C11131y6 y6Var3 = new C11131y6(this, 0, false);
            this.f33788a.add(y6Var3);
            m4701f0(y6Var3);
        }
        if (this.f33792c == null) {
            if (this.f33790b >= this.f33788a.size() || this.f33790b < 0) {
                Log.m14724e("preferredAccountId=%d is not in range 0..%d", Integer.valueOf(this.f33790b), Integer.valueOf(this.f33788a.size()));
                this.f33790b = 0;
            }
            C11131y6 y6Var4 = this.f33788a.get(this.f33790b);
            this.f33792c = y6Var4;
            y6Var4.m1496O();
        }
    }

    public final boolean m4810D2() {
        synchronized (this.f33800j0) {
            if (this.f33802l0 > 0) {
                PowerManager.WakeLock wakeLock = this.f33801k0;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f33802l0--;
                } else {
                    throw new NullPointerException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
        return true;
    }

    public void m4806E2(int i, int i2) {
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(false)) {
                next.mo1480c().m2294pc().m4120g0(i, i2);
            } else {
                C10733ic.m4118h0(next.f35705b, i, i2);
            }
        }
    }

    public void m4802F2() {
        synchronized (this) {
            m4698f3(true, false);
            m4654s0(true);
        }
    }

    public void m4798G2(Runnable runnable) {
        C1379j0.m37334d0(runnable);
    }

    public void m4794H2(final AbstractC5918j<CountDownLatch> jVar) {
        final CountDownLatch countDownLatch = m4677l1() ? null : new CountDownLatch(1);
        m4790I2(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10536ab abVar = (C10536ab) obj;
                AbstractC5918j.this.mo1330a(countDownLatch);
            }
        });
    }

    public int m4792I0() {
        Iterator<C11131y6> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m1464l()) {
                i++;
            }
        }
        return i;
    }

    public void m4790I2(AbstractC5918j<C10536ab> jVar) {
        boolean X = m4733X();
        try {
            jVar.mo1330a(this);
        } finally {
            if (X) {
                m4810D2();
            }
        }
    }

    public final void m4786J2(C11131y6 y6Var, int i) {
        m4782K2(0, y6Var.f35705b);
    }

    public C4868i.C4873e m4784K0() {
        return this.f33780S;
    }

    public final synchronized void m4782K2(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        File w0 = m4638w0();
        try {
            if (!w0.exists() && !w0.createNewFile()) {
                throw new RuntimeException("Cannot save config file");
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(w0, "rw");
                try {
                    int h3 = m4690h3(randomAccessFile, i, i2);
                    randomAccessFile.close();
                    try {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(w0, "rw");
                        try {
                            Log.m14721i((int) Log.TAG_ACCOUNTS, "Saved %d accounts in %dms, mode:%d", Integer.valueOf(h3), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Integer.valueOf(i));
                            randomAccessFile2.close();
                        } catch (Throwable th) {
                            try {
                                randomAccessFile2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        Tracer.m14774f(e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th3) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e2) {
                Tracer.m14774f(e2);
                throw new RuntimeException(e2);
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final TdApi.LanguagePackStringValue m4780L0(String str, String str2) {
        return m4776M0(this.f33782U, str, str2);
    }

    public final void m4778L2(C11131y6 y6Var) {
        m4782K2(4, y6Var.f35705b);
        y6Var.m1497N(false);
    }

    public void m4774M2() {
        m4782K2(3, -1);
    }

    public TdApi.LanguagePackStringValuePluralized m4772N0(String str, String str2) {
        TdApi.LanguagePackStringValue L0 = m4780L0(str, str2);
        if (L0 instanceof TdApi.LanguagePackStringValuePluralized) {
            return (TdApi.LanguagePackStringValuePluralized) L0;
        }
        if (L0 == null) {
            return null;
        }
        Log.m14724e("Expected stringPluralized: %s", L0);
        return null;
    }

    public final void m4770N2(C11131y6 y6Var) {
        m4782K2(1, y6Var.f35705b);
    }

    public TdApi.LanguagePackStringValueOrdinary m4768O0(String str, String str2) {
        TdApi.LanguagePackStringValue L0 = m4780L0(str, str2);
        if (L0 instanceof TdApi.LanguagePackStringValueOrdinary) {
            return (TdApi.LanguagePackStringValueOrdinary) L0;
        }
        if (L0 == null) {
            return null;
        }
        Log.m14724e("Expected stringValue: %s", L0);
        return null;
    }

    public final void m4766O2(int i) {
        m4782K2(2, i);
    }

    public final void m4762P2() {
        Iterator<C11131y6> it = this.f33799i0.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().m1477d0(i);
            i++;
        }
    }

    public void m4758Q2(int i, boolean z) {
        C11131y6 U = m4745U(i);
        if (U.m1490U(z)) {
            m4778L2(U);
        }
        if (!z) {
            C10733ic.m4088w0(i);
        }
    }

    public synchronized void m4754R2(String str) {
        if (!C5070i.m24067c(this.f33798h0, str)) {
            C4868i.m24726c2().m24572v4(str);
            this.f33798h0 = str;
            m4714b3(3, null);
            m4658r0(str);
        }
    }

    public void m4750S2(int i, boolean z) {
        C11131y6 U = m4745U(i);
        if (U.m1488W(z)) {
            m4778L2(U);
        }
    }

    public void m4746T2(boolean z) {
        C4868i.m24726c2().m24852K4(z);
        m4693h0(this.f33792c);
    }

    public C11131y6 m4745U(int i) {
        if (i != -1) {
            return this.f33788a.get(i);
        }
        throw new IllegalArgumentException();
    }

    public void m4742U2(int i, boolean z) {
        C11131y6 U = m4745U(i);
        if (U.m1487X(z)) {
            m4778L2(U);
        }
    }

    public LinkedList<C11131y6> m4741V() {
        return m4737W(null);
    }

    public String m4739V1() {
        return this.f33782U;
    }

    public void m4738V2(int i, boolean z) {
        C11131y6 U = m4745U(i);
        if (U.m1486Y(z)) {
            m4778L2(U);
        }
    }

    public final LinkedList<C11131y6> m4737W(AbstractC5912d<C11131y6> dVar) {
        LinkedList<C11131y6> linkedList = new LinkedList<>();
        if (dVar != null) {
            for (int size = this.f33788a.size() - 1; size >= 0; size--) {
                C11131y6 U = m4745U(size);
                if (dVar.mo1511a(U)) {
                    linkedList.add(U);
                }
            }
        } else {
            Iterator<C11131y6> it = iterator();
            while (it.hasNext()) {
                linkedList.add(it.next());
            }
        }
        return linkedList;
    }

    public String m4736W0() {
        return this.f33798h0;
    }

    public C10651f1 m4735W1() {
        return this.f33776O;
    }

    public void m4734W2(boolean z) {
        if (this.f33786Y != z) {
            this.f33786Y = z;
            Iterator<C11131y6> it = this.f33788a.iterator();
            while (it.hasNext()) {
                C10930q6 q6Var = it.next().f35695P;
                if (q6Var != null) {
                    q6Var.m2563Yb(z);
                }
            }
        }
    }

    public final boolean m4733X() {
        synchronized (this.f33800j0) {
            if (this.f33801k0 == null) {
                PowerManager powerManager = (PowerManager) C1379j0.m37315n().getSystemService("power");
                if (powerManager == null) {
                    return false;
                }
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "tgx:main");
                this.f33801k0 = newWakeLock;
                if (newWakeLock == null) {
                    return false;
                }
                newWakeLock.setReferenceCounted(true);
            }
            this.f33801k0.acquire();
            this.f33802l0++;
            return true;
        }
    }

    public String m4732X0() {
        return this.f33797g0;
    }

    public final void m4731X1(int i) {
        m4822A2();
        final C11131y6 y6Var = i != -1 ? this.f33788a.get(i) : this.f33792c;
        if (y6Var.m1497N(i != -1)) {
            y6Var.mo1480c().m2573Y1(new Runnable() {
                @Override
                public final void run() {
                    C10536ab.this.m4625z1(y6Var);
                }
            });
            return;
        }
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next != y6Var) {
                next.m1497N(false);
            }
        }
    }

    public void m4730X2(int i, boolean z) {
        C11131y6 U = m4745U(i);
        if (U.m1483a0(z)) {
            m4778L2(U);
        }
    }

    public C9726c m4729Y() {
        return this.f33783V;
    }

    public int m4728Y0() {
        return this.f33796f0;
    }

    public void m4726Y2(int i, boolean z) {
        C11131y6 U = m4745U(i);
        if (U.m1479c0(z)) {
            m4778L2(U);
        }
    }

    public long[] m4725Z(boolean z) {
        TreeSet<Long> treeSet = new TreeSet();
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (!next.m1500K() && next.m1504G() == z) {
                long r = next.m1458r();
                if (r != 0) {
                    treeSet.add(Long.valueOf(r));
                }
            }
        }
        int i = 0;
        if (treeSet.isEmpty()) {
            return new long[0];
        }
        long[] jArr = new long[treeSet.size()];
        for (Long l : treeSet) {
            i++;
            jArr[i] = l.longValue();
        }
        return jArr;
    }

    public C11164z6 m4724Z0() {
        return m4720a1(-1);
    }

    public void m4722Z2(TdApi.NetworkType networkType) {
        this.f33789a0 = networkType;
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(false)) {
                next.f35695P.m2438gc(networkType);
            }
        }
    }

    public final int m4721a0() {
        return m4717b0(this.f33788a.size());
    }

    public C11164z6 m4720a1(int i) {
        C11164z6 z6Var = new C11164z6();
        if (i == -1) {
            boolean F = C4868i.m24726c2().m24892F(8);
            boolean F2 = C4868i.m24726c2().m24892F(16);
            Iterator<C11131y6> it = iterator();
            while (it.hasNext()) {
                C11131y6 next = it.next();
                if (!F || next.f35705b == this.f33790b) {
                    if (!F2 || next.m1464l()) {
                        z6Var.m1329a(next.m1452x());
                    }
                }
            }
        } else {
            Iterator<C11131y6> it2 = iterator();
            while (it2.hasNext()) {
                C11131y6 next2 = it2.next();
                if (next2.f35705b != i) {
                    z6Var.m1329a(next2.m1452x());
                }
            }
        }
        return z6Var;
    }

    public void m4719a2(C10930q6 q6Var, Client client) {
        if (this.f33786Y) {
            client.m14783o(new TdApi.SetOption("is_emulator", new TdApi.OptionValueBoolean(true)), q6Var.m2392ja());
        }
        TdApi.NetworkType networkType = this.f33789a0;
        if (networkType != null) {
            client.m14783o(new TdApi.SetNetworkType(networkType), q6Var.m2392ja());
        } else if (C4868i.m24726c2().m24736b0()) {
            client.m14783o(new TdApi.SetNetworkType(new TdApi.NetworkTypeNone()), q6Var.m2392ja());
        }
    }

    public C11071v9 m4716b1() {
        return this.f33774M;
    }

    public void m4715b2(int i, int i2) {
        if (i != i2) {
            C5062b.m24149w(this.f33799i0, i, i2);
            m4762P2();
            m4716b1().m1548g(this.f33799i0.get(i), i, i2);
        }
    }

    public final synchronized void m4714b3(int i, String str) {
        if (this.f33796f0 != 3 || i == 3) {
            this.f33796f0 = i;
            this.f33797g0 = str;
            Iterator<C11131y6> it = m4737W(m4727Y1()).iterator();
            while (it.hasNext()) {
                C11131y6 next = it.next();
                if (next.m1497N(false)) {
                    next.mo1480c().m2382k4();
                }
            }
        }
    }

    public C10552b0 m4713c0() {
        return this.f33778Q;
    }

    public final void m4712c1(Message message) {
        int i = message.what;
        boolean z = false;
        if (i == 0) {
            C11071v9 b1 = m4716b1();
            C10930q6 q6Var = (C10930q6) message.obj;
            int i2 = message.arg2;
            if (this.f33792c.f35705b == message.arg1) {
                z = true;
            }
            b1.m1541n(q6Var, i2, z);
        } else if (i == 1) {
            m4716b1().m1540o(message.arg1, message.arg2);
        } else if (i == 2) {
            C11071v9 b12 = m4716b1();
            if (message.arg1 == 1) {
                z = true;
            }
            b12.m1537r(z);
        } else if (i == 4) {
            C11131y6 U = m4745U(message.arg1);
            TdApi.User user = (TdApi.User) message.obj;
            boolean z2 = message.arg1 == this.f33792c.f35705b;
            if (message.arg2 == 1) {
                z = true;
            }
            m4703e2(U, user, z2, z);
        } else if (i == 5) {
            C11131y6 U2 = m4745U(message.arg1);
            boolean z3 = message.arg2 == 1;
            if (message.arg1 == this.f33792c.f35705b) {
                z = true;
            }
            m4699f2(U2, z3, z);
        } else if (i == 6 || i == 7) {
            C11071v9 b13 = m4716b1();
            TdApi.ChatList chatList = (TdApi.ChatList) message.obj;
            if (message.what == 7) {
                z = true;
            }
            b13.m1536s(chatList, z);
        }
    }

    public int m4711c2(boolean z) {
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.f35705b != this.f33792c.f35705b && next.m1500K() && !next.m1502I()) {
                if (next.m1485Z(z)) {
                    m4778L2(next);
                }
                return next.f35705b;
            }
        }
        if (this.f33788a.size() >= 65535) {
            return -1;
        }
        C11131y6 y6Var = new C11131y6(this, this.f33788a.size(), z);
        this.f33788a.add(y6Var);
        y6Var.m1496O();
        y6Var.mo1480c();
        m4770N2(y6Var);
        if (m4701f0(y6Var)) {
            m4693h0(y6Var);
        }
        return y6Var.f35705b;
    }

    public void m4710c3(final long j, int i, Runnable runnable, final boolean z, final boolean z2, int i2, final AbstractC5918j<C10930q6> jVar) {
        m4640v2(j, i, new AbstractC10542f() {
            @Override
            public final void mo2043a(C11131y6 y6Var, Runnable runnable2) {
                C10536ab.m4743U1(AbstractC5918j.this, j, z, z2, y6Var, runnable2);
            }
        }, i2, null, runnable);
    }

    public void m4709d0(int i, int i2) {
        m4705e0(i, i2, null);
    }

    public boolean m4708d1(int i) {
        return i >= 0 && i < this.f33788a.size();
    }

    public C10827lb.C10828a m4707d2() {
        return this.f33777P;
    }

    public C10930q6 m4706d3(int i) {
        return m4745U(i).mo1480c();
    }

    public void m4705e0(final int i, final int i2, final AbstractC5917i iVar) {
        if (this.f33790b == i) {
            if (iVar != null) {
                iVar.mo1322a(false);
            }
        } else if (i < 0 || i >= this.f33788a.size()) {
            throw new IllegalArgumentException("accountId == " + i);
        } else if (!this.f33788a.get(i).m1500K()) {
            this.f33788a.get(i).mo1480c().m2573Y1(new Runnable() {
                @Override
                public final void run() {
                    C10536ab.this.m4653s1(i, iVar, i2);
                }
            });
        } else if (iVar != null) {
            iVar.mo1322a(false);
        }
    }

    public int m4704e1(String str, int i) {
        for (int size = this.f33788a.size() - 1; size >= 0; size--) {
            C11131y6 y6Var = this.f33788a.get(size);
            if (!(y6Var.f35705b == i || y6Var.m1500K() || !C5070i.m24067c(str, y6Var.m1459q()))) {
                return y6Var.f35705b;
            }
        }
        return -1;
    }

    public final void m4703e2(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        if (!y6Var.m1500K()) {
            m4716b1().m1547h(y6Var, user, z, z2);
            if ((z2 || user == null) && m4701f0(y6Var)) {
                m4693h0(null);
            }
        }
    }

    public void m4702e3(boolean z, int i, long[] jArr) {
        Iterator<C11131y6> it = iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1504G() == z && next.f35705b != i) {
                long r = next.m1458r();
                if (r == 0 || Arrays.binarySearch(jArr, r) < 0) {
                    Log.m14721i(4, "Unregistered accountId:%d userId:%d", Integer.valueOf(next.f35705b), Long.valueOf(r));
                    m4758Q2(next.f35705b, false);
                }
            }
        }
    }

    public final boolean m4701f0(C11131y6 y6Var) {
        boolean z = !y6Var.m1500K() && y6Var.m1450z();
        int indexOf = this.f33799i0.indexOf(y6Var);
        if (indexOf == -1 && z) {
            indexOf = Collections.binarySearch(this.f33799i0, y6Var);
        }
        if (z) {
            if (indexOf >= 0) {
                return false;
            }
            indexOf = (-indexOf) - 1;
            this.f33799i0.add(indexOf, y6Var);
        } else if (indexOf < 0) {
            return false;
        } else {
            this.f33799i0.remove(indexOf);
        }
        m4716b1().m1549f(y6Var, indexOf, z);
        m4802F2();
        m4673m1(y6Var);
        return true;
    }

    public int m4700f1(String str, String str2, int i) {
        for (int size = this.f33788a.size() - 1; size >= 0; size--) {
            C11131y6 y6Var = this.f33788a.get(size);
            if (y6Var.f35705b != i && !y6Var.m1500K() && C5070i.m24067c(str, y6Var.m1459q()) && C5070i.m24067c(str2, y6Var.m1457s())) {
                return y6Var.f35705b;
            }
        }
        return -1;
    }

    public final void m4699f2(C11131y6 y6Var, boolean z, boolean z2) {
        if (!y6Var.m1500K()) {
            m4716b1().m1546i(y6Var, z, z2);
        }
    }

    public final void m4698f3(boolean z, boolean z2) {
        try {
            C0245c.m42022a(C1379j0.m37315n(), m4724Z0().m1328b());
            this.f33787Z = false;
        } catch (Throwable th) {
            if (!this.f33787Z) {
                this.f33787Z = true;
                Log.m14715v("Could not update app badge", th, new Object[0]);
            }
        }
    }

    public void finalize() {
        this.f33781T.m28124c();
        super.finalize();
    }

    public synchronized void m4697g0() {
        m4714b3(2, null);
        AbstractC6765g iaVar = new AbstractC6765g() {
            @Override
            public final void mo4157c(Exception exc) {
                C10536ab.this.m4649t1(exc);
            }
        };
        try {
            C2021c.m35809n(C1379j0.m37315n());
            FirebaseMessaging.m30227f().m30225h().mo19074g(new AbstractC6767h() {
                @Override
                public final void mo3951a(Object obj) {
                    C10536ab.this.m4645u1((String) obj);
                }
            }).mo19076e(iaVar);
        } catch (Exception e) {
            iaVar.mo4157c(e);
        }
    }

    public int m4696g1(String str, boolean z) {
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1504G() == z && next.m1472g(str) && !next.m1500K() && !next.m1502I()) {
                return next.f35705b;
            }
        }
        return -1;
    }

    public final void m4695g2(final C11131y6 y6Var, int i, final C11131y6 y6Var2) {
        this.f33792c = y6Var;
        if (y6Var2 != null) {
            y6Var2.m1496O();
        }
        y6Var.m1496O();
        m4716b1().m1545j(y6Var, y6Var.mo1480c().m2550Z9(), i, y6Var2);
        m4686i2(y6Var.mo1480c(), y6Var.mo1480c().m2142z4());
        if (C4868i.m24726c2().m24892F(8)) {
            m4663p2(null, new AbstractC5912d() {
                @Override
                public final boolean mo1511a(Object obj) {
                    boolean E1;
                    E1 = C10536ab.m4807E1(C11131y6.this, y6Var2, (C11131y6) obj);
                    return E1;
                }
            });
        }
    }

    public C4363d0 m4694g3() {
        return this.f33781T.m28126a();
    }

    @Override
    public void mo1641h(int i) {
        boolean z = (i == 2 || i == -1) ? false : true;
        if (this.f33785X != z) {
            this.f33785X = z;
            Iterator<C11131y6> it = this.f33788a.iterator();
            while (it.hasNext()) {
                C11131y6 next = it.next();
                if (next.m1509B(true)) {
                    next.mo1480c().m2302p4();
                }
            }
        }
    }

    public void m4693h0(C11131y6 y6Var) {
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next != y6Var && next.m1509B(true)) {
                next.mo1480c().m2302p4();
            }
        }
    }

    public boolean m4692h1() {
        return m4824A0() > 0;
    }

    public void m4691h2(C10930q6 q6Var, final TdApi.AuthorizationState authorizationState, final int i, long j) {
        if (i != 0) {
            final int w6 = q6Var.m2188w6();
            boolean z = true;
            boolean z2 = i == 1;
            C11131y6 y6Var = this.f33788a.get(w6);
            if (y6Var.m1500K() == z2) {
                z = false;
            }
            if (y6Var.m1475e0(z2, j)) {
                m4786J2(y6Var, 0);
            }
            if (z) {
                if (m4701f0(y6Var)) {
                    m4693h0(null);
                }
                if (z2 && w6 == this.f33790b) {
                    m4798G2(new Runnable() {
                        @Override
                        public final void run() {
                            C10536ab.this.m4803F1(w6);
                        }
                    });
                }
            }
            m4798G2(new Runnable() {
                @Override
                public final void run() {
                    C10536ab.this.m4799G1(w6, authorizationState, i);
                }
            });
        }
    }

    public final int m4690h3(RandomAccessFile randomAccessFile, int i, int i2) {
        int size = this.f33788a.size();
        int a0 = m4721a0();
        long length = randomAccessFile.length();
        boolean z = i == 0 ? !(i2 == -1 || length != ((long) a0)) : !(i == 1 ? i2 == -1 || 21 + length != ((long) a0) : length != ((long) a0));
        Log.m14721i((int) Log.TAG_ACCOUNTS, "Writing account configuration, accountNum:%d, preferredAccountId:%d, mode:%d, canOptimize:%b, accountId:%d, binlogSize:%d, currentLen:%d", Integer.valueOf(size), Integer.valueOf(this.f33790b), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(a0), Long.valueOf(length));
        if (!z) {
            return m4685i3(randomAccessFile, new C10539c(this.f33792c, this.f33788a, this.f33790b));
        }
        int i3 = 8;
        if (i == 0) {
            randomAccessFile.seek((i2 * 21) + 8);
            this.f33788a.get(i2).m1493R(randomAccessFile);
        } else if (i == 1) {
            randomAccessFile.setLength(a0);
            randomAccessFile.writeInt(size);
            randomAccessFile.seek(length);
            this.f33788a.get(i2).m1493R(randomAccessFile);
        } else if (i == 2) {
            randomAccessFile.seek(4L);
            randomAccessFile.writeInt(i2);
            return 0;
        } else if (i == 3) {
            Iterator<C11131y6> it = this.f33788a.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i3 = it.next().m1491T(randomAccessFile, i3);
                i4++;
            }
            return i4;
        } else if (i != 4) {
            throw new IllegalArgumentException("mode == ");
        } else if (i2 != -1) {
            this.f33788a.get(i2).m1492S(randomAccessFile, (i2 * 21) + 8);
        } else {
            Iterator<C11131y6> it2 = this.f33788a.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                i3 = it2.next().m1492S(randomAccessFile, i3);
                i5++;
            }
            return i5;
        }
        return 1;
    }

    public void m4688i0(int i, boolean z, int i2) {
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(false)) {
                next.mo1480c().m2294pc().m4101q(i, z, i2);
            } else {
                C10733ic.m4103p(next.f35705b, i, z, i2);
            }
        }
    }

    public boolean m4687i1() {
        return this.f33785X;
    }

    public void m4686i2(C10930q6 q6Var, int i) {
        if (i != -1) {
            HandlerC10540d dVar = this.f33775N;
            dVar.sendMessage(Message.obtain(dVar, 0, q6Var.m2188w6(), i));
        }
    }

    @Override
    public Iterator<C11131y6> iterator() {
        ArrayList arrayList = new ArrayList(this.f33788a);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int x1;
                x1 = C10536ab.this.m4633x1((C11131y6) obj, (C11131y6) obj2);
                return x1;
            }
        });
        return new C6813d(arrayList.iterator(), C10608da.f33998a);
    }

    public C10930q6 m4684j0() {
        return this.f33792c.mo1480c();
    }

    public void m4682j2(int i, int i2) {
        HandlerC10540d dVar = this.f33775N;
        dVar.sendMessage(Message.obtain(dVar, 1, i, i2));
    }

    public C11131y6 m4681k0() {
        return this.f33792c;
    }

    public boolean m4680k1() {
        return this.f33780S != null;
    }

    public void m4679k2(int i, long j) {
        C11131y6 y6Var = this.f33788a.get(i);
        if (y6Var.m1481b0(j)) {
            m4786J2(y6Var, 1);
            if (j != 0) {
                y6Var.mo1480c().m2334n4(null);
            }
        }
    }

    public C10930q6 m4678l0() {
        return this.f33792c.m1467i0();
    }

    public void m4676l2(boolean z) {
        HandlerC10540d dVar = this.f33775N;
        dVar.sendMessage(Message.obtain(dVar, 2, z ? 1 : 0, 0));
    }

    public void m4673m1(C11131y6 y6Var) {
        this.f33794d0++;
    }

    public void m4672m2(int i, TdApi.User user, boolean z) {
        HandlerC10540d dVar = this.f33775N;
        dVar.sendMessage(Message.obtain(dVar, 4, i, z ? 1 : 0, user));
    }

    public void m4670n1(TdApi.ChatList chatList, int i, int i2, boolean z) {
        synchronized (this) {
            boolean z2 = (i == 0 && i2 == 0) ? false : true;
            m4698f3(false, z2);
            if (z2) {
                m4654s0(false);
            }
        }
    }

    public void m4669n2(int i, boolean z) {
        HandlerC10540d dVar = this.f33775N;
        dVar.sendMessage(Message.obtain(dVar, 5, i, z ? 1 : 0));
    }

    public void m4666o2() {
        m4663p2(null, null);
    }

    public void m4663p2(TdApi.NotificationSettingsScope notificationSettingsScope, AbstractC5912d<C11131y6> dVar) {
        Iterator<C11131y6> it = iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (dVar == null || dVar.mo1511a(next)) {
                if (next.m1505F()) {
                    next.mo1480c().m2440ga().m3183P1(notificationSettingsScope);
                }
            }
        }
    }

    public void m4662q0(int i) {
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(false)) {
                next.mo1480c().m2294pc().m4111l(i);
            } else {
                C10733ic.m4109m(next.f35705b, i);
            }
        }
    }

    public boolean m4661q1() {
        return this.f33799i0.size() > 1;
    }

    public void m4660q2() {
        m4663p2(new TdApi.NotificationSettingsScopePrivateChats(), null);
    }

    public final void m4658r0(String str) {
        long[] jArr;
        Iterator<C11131y6> it = iterator();
        long[] jArr2 = null;
        long[] jArr3 = null;
        boolean z = false;
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (!next.m1500K() || next.m1509B(false)) {
                long r = next.m1458r();
                if (next.m1504G()) {
                    if (jArr2 == null) {
                        jArr2 = m4725Z(true);
                    }
                    jArr = C5062b.m24147y(jArr2, C5062b.m24153s(jArr2, r));
                } else {
                    if (jArr3 == null) {
                        jArr3 = m4725Z(false);
                    }
                    jArr = C5062b.m24147y(jArr3, C5062b.m24153s(jArr3, r));
                }
                if (!C10733ic.m4115j(next.f35705b, next.m1458r(), str, jArr, true)) {
                    m4758Q2(next.f35705b, false);
                    z = true;
                }
                if (next.m1509B(true)) {
                    next.mo1480c().m2334n4(null);
                }
            }
        }
        if (z) {
            m4644u2(-1, C10974ra.f35245a, 5, C10563ba.f33880a, null);
        }
    }

    public final void m4654s0(boolean z) {
        HandlerC10540d dVar = this.f33775N;
        dVar.sendMessage(Message.obtain(dVar, z ? 7 : 6));
    }

    public boolean m4650t0() {
        if (this.f33780S == null) {
            return false;
        }
        C4868i.m24726c2().m24598s2(this.f33780S);
        this.f33780S = null;
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1509B(true)) {
                next.mo1480c().m2864F6();
            }
        }
        return true;
    }

    public final int m4646u0(Client client) {
        if (client == null) {
            return -1;
        }
        Iterator<C11131y6> it = this.f33788a.iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (next.m1495P(client)) {
                return next.f35705b;
            }
        }
        return -1;
    }

    public final void m4644u2(int i, AbstractC10542f fVar, int i2, AbstractC5912d<C11131y6> dVar, Runnable runnable) {
        if (i != -1) {
            fVar.mo2043a(m4745U(i), runnable);
            return;
        }
        LinkedList<C11131y6> W = m4737W(dVar);
        if (W.isEmpty()) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (W.size() == 1) {
            fVar.mo2043a(W.removeFirst(), runnable);
        } else if (i2 > 0) {
            new RunnableC10538b(W, new AtomicInteger(1), i2, fVar, runnable).run();
        } else {
            throw new AssertionError(i2);
        }
    }

    public int m4642v0(int i) {
        int binarySearch = Collections.binarySearch(this.f33799i0, m4745U(i));
        int i2 = 0;
        if (binarySearch >= 0) {
            int i3 = binarySearch + 1;
            if (this.f33799i0.size() > i3) {
                return this.f33799i0.get(i3).f35705b;
            }
            if (binarySearch > 0) {
                return this.f33799i0.get(0).f35705b;
            }
            return -1;
        }
        int i4 = (-binarySearch) - 1;
        if (i4 < this.f33799i0.size()) {
            return this.f33799i0.get(i4).f35705b;
        }
        Iterator<C11131y6> it = this.f33799i0.iterator();
        int i5 = 0;
        int i6 = -1;
        while (it.hasNext()) {
            C11131y6 next = it.next();
            if (i6 == -1 || Math.abs(i2 - i4) <= i5) {
                i6 = next.f35705b;
                i5 = Math.abs(i2 - i4);
            }
            i2++;
        }
        return i6;
    }

    public final void m4640v2(long j, int i, final AbstractC10542f fVar, int i2, AbstractC5912d<C11131y6> dVar, Runnable runnable) {
        m4644u2(i, new AbstractC10542f() {
            @Override
            public final void mo2043a(C11131y6 y6Var, Runnable runnable2) {
                C10536ab.m4759Q1(C10536ab.AbstractC10542f.this, y6Var, runnable2);
            }
        }, i2, dVar, runnable);
    }

    public C9773p0 m4636w2() {
        return this.f33784W;
    }

    public int m4632x2() {
        return this.f33790b;
    }

    public synchronized int m4630y0(int i, long j) {
        if (this.f33793c0 == null) {
            this.f33793c0 = new ArrayList(this.f33799i0.size());
        }
        if (!(this.f33793c0.size() == this.f33799i0.size() && this.f33795e0 == this.f33794d0)) {
            this.f33793c0.clear();
            this.f33793c0.addAll(this.f33799i0);
            Collections.sort(this.f33793c0, this.f33791b0);
            this.f33795e0 = this.f33794d0;
        }
        C11131y6 U = m4745U(i);
        int indexOf = this.f33793c0.indexOf(U);
        if (indexOf != -1) {
            long M = U.m1498M();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (M != 0 && (M > uptimeMillis || uptimeMillis - M <= j)) {
                return indexOf;
            }
        }
        return -1;
    }

    public void m4628y2(final long j, int i, final String str, Runnable runnable) {
        m4640v2(j, i, new AbstractC10542f() {
            @Override
            public final void mo2043a(C11131y6 y6Var, Runnable runnable2) {
                C10536ab.m4755R1(j, str, y6Var, runnable2);
            }
        }, 5, null, runnable);
    }

    public ArrayList<C11131y6> m4626z0() {
        return this.f33799i0;
    }
}
