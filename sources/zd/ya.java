package zd;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import ce.j0;
import com.google.firebase.messaging.FirebaseMessaging;
import gd.d0;
import gd.e0;
import hd.t2;
import he.i;
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
import kb.j;
import n6.g;
import n6.h;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.b;
import vd.o0;
import zd.jb;
import zd.ya;

public class ya implements Iterable<w6>, j0.a {
    public static final AtomicBoolean f28717m0 = new AtomicBoolean(false);
    public static ya f28718n0;
    public static Set<String> f28719o0;
    public static Set<String> f28720p0;
    public static Set<String> f28721q0;
    public static Set<String> f28722r0;
    public final i.m R;
    public final e0 T;
    public final vd.c V;
    public final o0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public TdApi.NetworkType f28724a0;
    public w6 f28727c;
    public List<w6> f28728c0;
    public int f28729d0;
    public int f28730e0;
    public String f28732g0;
    public String f28733h0;
    public PowerManager.WakeLock f28736k0;
    public int f28737l0;
    public final ArrayList<w6> f28723a = new ArrayList<>();
    public int f28725b = -1;
    public final t9 M = new t9(this);
    public final d N = new d(this);
    public final d1 O = new d1(this);
    public final jb.a P = new jb.a("NotificationQueue", this);
    public final z Q = new z(this);
    public final Comparator<w6> f28726b0 = x9.f28672a;
    public int f28731f0 = 0;
    public final ArrayList<w6> f28734i0 = new ArrayList<>();
    public final Object f28735j0 = new Object();
    public final String U = D0();
    public i.e S = i.c2().Z();

    public class a implements i.m {
        public a() {
        }

        @Override
        public void X0(i.l lVar, boolean z10) {
        }

        @Override
        public void a3(int i10, String str, int i11, TdApi.ProxyType proxyType, String str2, boolean z10, boolean z11) {
            if (z10) {
                Iterator<w6> it = ya.this.iterator();
                while (it.hasNext()) {
                    o6 o6Var = it.next().P;
                    if (o6Var != null) {
                        o6Var.nc(i10, str, i11, proxyType);
                    }
                }
            }
        }

        @Override
        public void g7(boolean z10) {
        }
    }

    public class b implements Runnable {
        public final f M;
        public final Runnable N;
        public final LinkedList f28739a;
        public final AtomicInteger f28740b;
        public final int f28741c;

        public b(LinkedList linkedList, AtomicInteger atomicInteger, int i10, f fVar, Runnable runnable) {
            this.f28739a = linkedList;
            this.f28740b = atomicInteger;
            this.f28741c = i10;
            this.M = fVar;
            this.N = runnable;
        }

        public void c(boolean z10, w6 w6Var) {
            if (z10) {
                run();
            } else {
                w6Var.f(this);
            }
        }

        public void d(f fVar, final w6 w6Var, final boolean z10) {
            fVar.a(w6Var, new Runnable() {
                @Override
                public final void run() {
                    ya.b.this.c(z10, w6Var);
                }
            });
        }

        @Override
        public void run() {
            ArrayList<Runnable> arrayList;
            boolean z10;
            Runnable runnable;
            synchronized (this.f28739a) {
                this.f28740b.decrementAndGet();
                arrayList = null;
                while (true) {
                    z10 = true;
                    if (this.f28739a.isEmpty() || this.f28740b.get() >= this.f28741c) {
                        break;
                    }
                    this.f28740b.incrementAndGet();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    final w6 w6Var = (w6) this.f28739a.removeFirst();
                    final boolean B = w6Var.B(true);
                    final f fVar = this.M;
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            ya.b.this.d(fVar, w6Var, B);
                        }
                    });
                }
                if (this.f28740b.get() != 0 || !this.f28739a.isEmpty()) {
                    z10 = false;
                }
            }
            if (arrayList != null) {
                for (Runnable runnable2 : arrayList) {
                    runnable2.run();
                }
            }
            if (z10 && (runnable = this.N) != null) {
                runnable.run();
            }
        }
    }

    public static class c {
        public w6 f28742a;
        public List<w6> f28743b;
        public int f28744c;

        public c(w6 w6Var, List<w6> list, int i10) {
            this.f28742a = w6Var;
            this.f28743b = list;
            this.f28744c = i10;
        }
    }

    public static class d extends Handler {
        public final ya f28745a;

        public d(ya yaVar) {
            super(Looper.getMainLooper());
            this.f28745a = yaVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f28745a.c1(message);
        }
    }

    public interface e {
        void a(o6 o6Var, Runnable runnable);
    }

    public interface f {
        void a(w6 w6Var, Runnable runnable);
    }

    public ya(int i10) {
        a aVar = new a();
        this.R = aVar;
        Client.q(new Client.e() {
            @Override
            public final void a(Client client, String str, boolean z10) {
                ya.this.C1(client, str, z10);
            }
        });
        i.c2().w();
        e0 e0Var = new e0(j0.n(), this);
        this.T = e0Var;
        o0 o0Var = new o0(this);
        this.W = o0Var;
        this.V = new vd.c(this, o0Var);
        X1(i10);
        i.c2().r(aVar);
        d2().i();
        e0Var.b();
        e0Var.a().o();
        j0.d(this);
        f(j0.F());
        g0();
    }

    public static boolean A1(w6 w6Var) {
        return w6Var.K() && w6Var.A();
    }

    public static Set<String> B0(boolean z10) {
        Set<String> set = z10 ? f28721q0 : f28722r0;
        if (set != null) {
            return set;
        }
        String[] S0 = S0(z10, false);
        HashSet hashSet = new HashSet(S0.length);
        Collections.addAll(hashSet, S0);
        if (z10) {
            f28721q0 = hashSet;
        } else {
            f28722r0 = hashSet;
        }
        return hashSet;
    }

    public static void B1(boolean z10, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, long j10, int i10, long j11) {
        if (z10) {
            synchronized (atomicBoolean) {
                atomicBoolean.set(true);
                countDownLatch.countDown();
            }
        }
        b.a.a(j10, i10, "Finished sync in %dms", Long.valueOf(SystemClock.uptimeMillis() - j11));
    }

    public static int B2() {
        File w02 = w0();
        if (!w02.exists()) {
            return 1;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(w02, "r");
            int max = Math.max(1, randomAccessFile.readInt());
            randomAccessFile.close();
            return max;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static String C0() {
        return v0.G0() + " " + Build.MODEL;
    }

    public void C1(Client client, String str, boolean z10) {
        i.c2().V5(u0(client), str, 4);
        if (z10) {
            Tracer.k(str);
        }
    }

    public static int C2() {
        File w02 = w0();
        if (!w02.exists()) {
            return 0;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(w02, "r");
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

    public static String D0() {
        File file = new File(j0.q().getFilesDir(), "langpack");
        if (file.exists() || file.mkdir()) {
            return new File(file, "main").getPath();
        }
        throw new IllegalStateException("Cannot create working directory: " + file.getPath());
    }

    public static int D1(w6 w6Var, w6 w6Var2) {
        if (w6Var.K() != w6Var2.K()) {
            return Boolean.compare(w6Var.K(), w6Var2.K());
        }
        return Long.compare(w6Var2.M(), w6Var.M());
    }

    public static File E0(boolean z10) {
        return new File(F0(z10));
    }

    public static boolean E1(w6 w6Var, w6 w6Var2, w6 w6Var3) {
        int i10 = w6Var3.f28608b;
        return i10 == w6Var.f28608b || (w6Var2 != null && i10 == w6Var2.f28608b);
    }

    public static String F0(boolean z10) {
        StringBuilder sb2 = new StringBuilder(T0(0, false));
        sb2.append("log");
        if (z10) {
            sb2.append(".old");
        }
        return sb2.toString();
    }

    public void F1(int i10) {
        int v02 = v0(i10);
        if (v02 != -1) {
            d0(v02, 0);
        }
    }

    public static File G0(boolean z10) {
        return new File(H0(z10));
    }

    public void G1(int i10, TdApi.AuthorizationState authorizationState, int i11) {
        b1().k(this.f28723a.get(i10), authorizationState, i11);
    }

    public static String H0(boolean z10) {
        File logDir = Log.getLogDir();
        String str = "tdlib_log.txt";
        if (z10) {
            str = str + ".old";
        }
        return new File(logDir, str).getPath();
    }

    public static void H1(int i10, db dbVar, o6 o6Var, Runnable runnable) {
        o6Var.G6();
        if (i10 == 0) {
            o6Var.ka().x1(dbVar);
        } else if (i10 == 1) {
            o6Var.ka().y1(dbVar.f27395b);
        } else if (i10 == 2) {
            dbVar.h(o6Var);
        } else if (i10 == 3) {
            dbVar.d(o6Var);
        }
        o6Var.ka().b2(runnable);
    }

    public static void I1(db dbVar, o6 o6Var, Runnable runnable) {
        dbVar.h(o6Var);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Set<String> J0(boolean z10) {
        Set<String> set = z10 ? f28719o0 : f28720p0;
        if (set != null) {
            return set;
        }
        String[] S0 = S0(z10, true);
        HashSet hashSet = new HashSet(S0.length);
        Collections.addAll(hashSet, S0);
        if (z10) {
            f28719o0 = hashSet;
        } else {
            f28720p0 = hashSet;
        }
        return hashSet;
    }

    public static void J1(final Runnable runnable, final o6 o6Var, final db dbVar, TdApi.Message message) {
        if (message == null) {
            j0.y0(R.string.NotificationReplyFailed, 0);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        o6Var.Z1(message, new Runnable() {
            @Override
            public final void run() {
                ya.I1(db.this, o6Var, runnable);
            }
        });
    }

    public static void K1(final db dbVar, CharSequence charSequence, final o6 o6Var, final Runnable runnable) {
        long j10;
        long j11 = dbVar.f27396c;
        long j12 = dbVar.f27397d;
        if (dbVar.f27400g) {
            long[] jArr = dbVar.f27402i;
            j10 = jArr[jArr.length - 1];
        } else {
            j10 = 0;
        }
        o6Var.yb(j11, j12, j10, false, true, new TdApi.InputMessageText(new TdApi.FormattedText(charSequence.toString(), null), false, false), new j() {
            @Override
            public final void a(Object obj) {
                ya.J1(runnable, o6Var, dbVar, (TdApi.Message) obj);
            }
        });
    }

    public static void L1(CountDownLatch countDownLatch, long j10, int i10, String str) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        Object[] objArr = new Object[4];
        boolean z10 = false;
        objArr[0] = Long.valueOf(SystemClock.uptimeMillis() - j10);
        objArr[1] = Integer.valueOf(i10);
        if (countDownLatch != null) {
            z10 = true;
        }
        objArr[2] = Boolean.valueOf(z10);
        objArr[3] = str;
        Log.i((int) Log.TAG_ACCOUNTS, "[TASK] END %dms, accountId:%d, isBackground:%b, tag:%s", objArr);
    }

    public static TdApi.LanguagePackStringValue M0(String str, String str2, String str3) {
        TdApi.Object e10;
        if (ib.i.i(str2) || (e10 = Client.e(new TdApi.GetLanguagePackString(str, "android_x", str3, str2))) == null) {
            return null;
        }
        int constructor = e10.getConstructor();
        if (constructor == -1679978726) {
            if (((TdApi.Error) e10).code != 404) {
                Log.e("getString %s error:%s, languagePackId:%s", str2, t2.z5(e10), str3);
            }
            return null;
        } else if (constructor == -249256352 || constructor == 1906840261) {
            return (TdApi.LanguagePackStringValue) e10;
        } else {
            return null;
        }
    }

    public static void M1(Runnable runnable, w6 w6Var) {
        if (runnable != null) {
            runnable.run();
        }
        w6Var.c().K4();
    }

    public static void N1(e eVar, final w6 w6Var, final Runnable runnable) {
        eVar.a(w6Var.c(), new Runnable() {
            @Override
            public final void run() {
                ya.M1(runnable, w6Var);
            }
        });
    }

    public static void O1(final e eVar, final w6 w6Var, final Runnable runnable) {
        w6Var.c().G6();
        w6Var.c().a2(new Runnable() {
            @Override
            public final void run() {
                ya.N1(ya.e.this, w6Var, runnable);
            }
        });
    }

    public static String P0() {
        try {
            return db.d.a(j0.p());
        } catch (Throwable unused) {
            return "en-US";
        }
    }

    public static void P1(final long j10, final int i10, final String str, ya yaVar, final e eVar, kb.d dVar, final CountDownLatch countDownLatch) {
        yaVar.u2(i10, new f() {
            @Override
            public final void a(w6 w6Var, Runnable runnable) {
                ya.O1(ya.e.this, w6Var, runnable);
            }
        }, 5, dVar, new Runnable() {
            @Override
            public final void run() {
                ya.L1(countDownLatch, j10, i10, str);
            }
        });
        if (countDownLatch != null) {
            v0.o(countDownLatch);
        }
    }

    public static String Q0() {
        return db.f.a() + " (" + Build.VERSION.SDK_INT + ")";
    }

    public static void Q1(f fVar, w6 w6Var, Runnable runnable) {
        try {
            w6Var.c();
            fVar.a(w6Var, runnable);
        } catch (Throwable th) {
            Log.e("Unable to create TDLib instance", th, new Object[0]);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static o6 R0(int i10) {
        return p1(i10).U(i10).c();
    }

    public static void R1(long j10, String str, w6 w6Var, Runnable runnable) {
        w6Var.c().Ma(j10, str, runnable);
    }

    public static String[] S0(boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                return new String[]{"profile_photos", "secret", "thumbnails", "wallpapers", "stickers"};
            }
            return new String[]{"passport", "profile_photos", "secret", "secret_thumbnails", "temp", "thumbnails", "wallpapers", "stickers"};
        } else if (z11) {
            return new String[]{"animations", "documents", "music", "photos", "videos"};
        } else {
            return new String[]{"animations", "documents", "music", "photos", "temp", "video_notes", "videos", "voice"};
        }
    }

    public static String T0(int i10, boolean z10) {
        return U0(i10, z10, true);
    }

    public static void T1(j jVar, o6 o6Var, Runnable runnable) {
        jVar.a(o6Var);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static String U0(int i10, boolean z10, boolean z11) {
        File externalFilesDir = z10 ? j0.n().getExternalFilesDir(null) : null;
        if (externalFilesDir != null) {
            if (i10 != 0) {
                File file = new File(externalFilesDir, "x_account" + i10);
                if (!file.exists()) {
                    if (!z11) {
                        return null;
                    }
                    if (!file.mkdir()) {
                        throw new IllegalStateException("Could not create external working directory: " + file.getPath());
                    }
                }
                externalFilesDir = file;
            }
            return t2.M4(externalFilesDir.getPath());
        } else if (z10 && !z11) {
            return null;
        } else {
            File filesDir = j0.q().getFilesDir();
            String str = "tdlib";
            if (i10 != 0) {
                str = str + i10;
            }
            File file2 = new File(filesDir, str);
            if (!file2.exists()) {
                if (!z11) {
                    return null;
                }
                if (!file2.mkdir()) {
                    throw new IllegalStateException("Cannot create working directory: " + file2.getPath());
                }
            }
            return t2.M4(file2.getPath());
        }
    }

    public static void U1(final j jVar, long j10, boolean z10, boolean z11, w6 w6Var, final Runnable runnable) {
        final o6 c10 = w6Var.c();
        if (jVar != null) {
            c10.Kc(j10, new Runnable() {
                @Override
                public final void run() {
                    ya.T1(j.this, c10, runnable);
                }
            }, z10, z11);
        } else {
            c10.Kc(j10, runnable, z10, z11);
        }
    }

    public static File V0() {
        File file = new File(j0.q().getFilesDir(), "tgvoip");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        throw new IllegalStateException("Cannot create working directory: " + file.getPath());
    }

    public static kb.d<w6> Y1() {
        return aa.f27237a;
    }

    public static boolean Z1(Context context, final int i10, int i11, long j10, final boolean z10, long j11) {
        boolean z11;
        final long uptimeMillis = SystemClock.uptimeMillis();
        j0.L(context);
        long b32 = j10 == 0 ? i.c2().b3() : j10;
        CountDownLatch countDownLatch = null;
        AtomicBoolean atomicBoolean = z10 ? new AtomicBoolean(false) : null;
        if (z10) {
            countDownLatch = new CountDownLatch(1);
        }
        final CountDownLatch countDownLatch2 = countDownLatch;
        if (i10 == -1) {
            b.a.a(b32, i10, "Performing sync for all accounts, cause: %d, synchronized: %b, timeout: %d, initialized in: %d", Integer.valueOf(i11), Boolean.valueOf(z10), Long.valueOf(j11), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        } else {
            b.a.a(b32, i10, "Performing sync for account, cause: %d, synchronized: %b, timeout: %d, initialized in: %d", Integer.valueOf(i11), Boolean.valueOf(z10), Long.valueOf(j11), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        final AtomicBoolean atomicBoolean2 = atomicBoolean;
        final long j12 = b32;
        long j13 = b32;
        p1(i10).c3(j13, i10, new Runnable() {
            @Override
            public final void run() {
                ya.B1(z10, atomicBoolean2, countDownLatch2, j12, i10, uptimeMillis);
            }
        }, true, true, 5, null);
        if (!z10) {
            return true;
        }
        try {
            if (j11 > 0) {
                countDownLatch2.await(j11, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch2.await();
            }
        } catch (InterruptedException unused) {
            b.a.a(j13, i10, "Sync was interrupted, elapsed: %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        synchronized (atomicBoolean) {
            z11 = atomicBoolean.get();
        }
        return z11;
    }

    public static void a3() {
        Client.e(new TdApi.SetLogVerbosityLevel(5));
        Client.e(new TdApi.SetLogStream(new TdApi.LogStreamDefault()));
        Log.setLogLevel(5);
    }

    public static int b0(int i10) {
        return (i10 * 21) + 8;
    }

    public static int i3(RandomAccessFile randomAccessFile, c cVar) {
        int size = cVar.f28743b.size();
        randomAccessFile.setLength(b0(size));
        randomAccessFile.writeInt(size);
        randomAccessFile.writeInt(cVar.f28744c);
        int i10 = 0;
        for (w6 w6Var : cVar.f28743b) {
            w6Var.R(randomAccessFile);
            i10++;
        }
        return i10;
    }

    public static boolean j1() {
        return !l1();
    }

    public static boolean l1() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }

    public static long m0() {
        return p0(0);
    }

    public static long n0(boolean z10) {
        return p0(z10 ? 1 : 2);
    }

    public static long o0(boolean z10) {
        File file = new File(H0(z10));
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

    public static ya o1() {
        return p1(-1);
    }

    public static long p0(int i10) {
        long j10;
        if (j0.f5280g != 1) {
            Client.e(new TdApi.SetLogVerbosityLevel(0));
            Client.e(new TdApi.SetLogStream(new TdApi.LogStreamEmpty()));
        }
        long j11 = -1;
        if (i10 == 0) {
            long o02 = o0(false);
            if (o02 != -1) {
                long o03 = o0(true);
                o02 = o03 != -1 ? o02 + o03 : -1L;
            }
            if (o02 != -1) {
                long o04 = o0(false);
                o02 = o04 != -1 ? o02 + o04 : -1L;
            }
            j10 = o02;
            if (j10 != -1) {
                long o05 = o0(true);
                if (o05 != -1) {
                    j11 = j10 + o05;
                }
                j10 = j11;
            }
        } else if (i10 == 1) {
            j10 = o0(true);
        } else if (i10 != 2) {
            return -1L;
        } else {
            j10 = o0(false);
        }
        i.c2().w();
        return j10;
    }

    public static ya p1(int i10) {
        if (f28718n0 == null) {
            synchronized (ya.class) {
                if (f28718n0 == null) {
                    if (!f28717m0.getAndSet(true)) {
                        f28718n0 = new ya(i10);
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
        return f28718n0;
    }

    public void r1(int i10, int i11, kb.i iVar) {
        Log.i((int) Log.TAG_ACCOUNTS, "Switching preferred account %d -> %d, reason:%d", Integer.valueOf(this.f28725b), Integer.valueOf(i10), Integer.valueOf(i11));
        int i12 = this.f28725b;
        this.f28725b = i10;
        g2(this.f28723a.get(i10), i11, (i12 < 0 || i12 >= this.f28723a.size()) ? null : this.f28723a.get(i12));
        O2(i10);
        if (iVar != null) {
            iVar.a(true);
        }
    }

    public static void r2(Context context, final int i10, final db dbVar) {
        if (dbVar != null) {
            int i11 = dbVar.f27394a;
            t2(context, i11, "external:" + i10, new e() {
                @Override
                public final void a(o6 o6Var, Runnable runnable) {
                    ya.H1(i10, dbVar, o6Var, runnable);
                }
            }, null);
        }
    }

    public void s1(final int i10, final kb.i iVar, final int i11) {
        if (!this.f28723a.get(i10).K()) {
            G2(new Runnable() {
                @Override
                public final void run() {
                    ya.this.r1(i10, i11, iVar);
                }
            });
        } else if (iVar != null) {
            iVar.a(false);
        }
    }

    public static void s2(Context context, final CharSequence charSequence, final db dbVar) {
        if (dbVar != null && dbVar.f27402i != null && !ib.i.i(charSequence)) {
            t2(context, dbVar.f27394a, "reply", new e() {
                @Override
                public final void a(o6 o6Var, Runnable runnable) {
                    ya.K1(db.this, charSequence, o6Var, runnable);
                }
            }, null);
        }
    }

    public void t1(Exception exc) {
        String str;
        Log.e(4, "Failed to retrieve firebase token", exc, new Object[0]);
        if (ib.i.i(exc.getMessage())) {
            str = Log.toString(exc);
        } else {
            str = exc.getClass().getSimpleName() + ": " + exc.getMessage();
        }
        b3(1, str);
    }

    public static void t2(Context context, final int i10, final String str, final e eVar, final kb.d<w6> dVar) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        j0.L(context);
        final ya p12 = p1(i10);
        p12.H2(new j() {
            @Override
            public final void a(Object obj) {
                ya.P1(uptimeMillis, i10, str, p12, eVar, dVar, (CountDownLatch) obj);
            }
        });
    }

    public void u1(String str) {
        b.a.b("FirebaseMessaging.getInstance().getToken(): \"%s\"", str);
        R2(str);
    }

    public static void v1(w6 w6Var, Runnable runnable) {
        w6Var.c().r4(runnable);
    }

    public static File w0() {
        return new File(j0.n().getFilesDir(), "tdlib_accounts.bin");
    }

    public static boolean w1(w6 w6Var) {
        return !w6Var.K() || w6Var.B(false);
    }

    public static long x0() {
        return w0().length();
    }

    public int x1(w6 w6Var, w6 w6Var2) {
        w6 w6Var3 = this.f28727c;
        boolean z10 = true;
        if ((w6Var == w6Var3) == (w6Var2 == w6Var3)) {
            return w6Var.compareTo(w6Var2);
        }
        boolean z11 = w6Var2 == w6Var3;
        if (w6Var != w6Var3) {
            z10 = false;
        }
        return Boolean.compare(z11, z10);
    }

    public static boolean y1(w6 w6Var) {
        return !w6Var.K();
    }

    public void z1(w6 w6Var) {
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next != w6Var) {
                next.N(false);
            }
        }
    }

    public static c z2(ya yaVar, RandomAccessFile randomAccessFile, int i10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long length = randomAccessFile.length();
        Log.i("readAccountConfig binlogSize:%d", Long.valueOf(length));
        int readInt = length >= 4 ? randomAccessFile.readInt() : 0;
        w6 w6Var = null;
        if (readInt <= 0 || readInt > 65535) {
            Log.i("readAccountConfig accountNum:%d accounts in %dms", Integer.valueOf(readInt), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            return null;
        }
        int readInt2 = randomAccessFile.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            w6 w6Var2 = new w6(yaVar, i11, randomAccessFile, i10);
            if (!w6Var2.K() && (i11 == readInt2 || w6Var == null || w6Var.f28608b < readInt2)) {
                w6Var = w6Var2;
            }
            arrayList.add(w6Var2);
        }
        Log.i("readAccountConfig finished, accountNum:%d in %dms, preferredAccountId:%d", Integer.valueOf(arrayList.size()), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Integer.valueOf(readInt2));
        return new c(w6Var, arrayList, readInt2);
    }

    public int A0() {
        return this.f28734i0.size();
    }

    public final void A2() {
        c cVar = null;
        this.f28727c = null;
        this.f28725b = 0;
        File w02 = w0();
        if (w02.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(w02, "r");
                cVar = z2(this, randomAccessFile, 2);
                randomAccessFile.close();
            } catch (IOException e10) {
                Log.e(e10);
            }
        } else {
            try {
                if (!w02.createNewFile()) {
                    Log.e("Unable to create TDLib config file: %s", w02.getPath());
                }
            } catch (IOException e11) {
                Log.e(e11);
            }
        }
        if (cVar != null) {
            this.f28725b = cVar.f28744c;
            this.f28727c = cVar.f28742a;
            this.f28723a.addAll(cVar.f28743b);
            w6 w6Var = this.f28727c;
            if (w6Var != null) {
                w6Var.O();
            }
            for (w6 w6Var2 : cVar.f28743b) {
                f0(w6Var2);
            }
        }
        if (this.f28723a.isEmpty()) {
            w6 w6Var3 = new w6(this, 0, false);
            this.f28723a.add(w6Var3);
            f0(w6Var3);
        }
        if (this.f28727c == null) {
            if (this.f28725b >= this.f28723a.size() || this.f28725b < 0) {
                Log.e("preferredAccountId=%d is not in range 0..%d", Integer.valueOf(this.f28725b), Integer.valueOf(this.f28723a.size()));
                this.f28725b = 0;
            }
            w6 w6Var4 = this.f28723a.get(this.f28725b);
            this.f28727c = w6Var4;
            w6Var4.O();
        }
    }

    public final boolean D2() {
        synchronized (this.f28735j0) {
            if (this.f28737l0 > 0) {
                PowerManager.WakeLock wakeLock = this.f28736k0;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f28737l0--;
                } else {
                    throw new NullPointerException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
        return true;
    }

    public void E2(int i10, int i11) {
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(false)) {
                next.c().tc().g0(i10, i11);
            } else {
                gc.h0(next.f28608b, i10, i11);
            }
        }
    }

    public void F2() {
        synchronized (this) {
            f3(true, false);
            s0(true);
        }
    }

    public void G2(Runnable runnable) {
        j0.d0(runnable);
    }

    public void H2(final j<CountDownLatch> jVar) {
        final CountDownLatch countDownLatch = l1() ? null : new CountDownLatch(1);
        I2(new j() {
            @Override
            public final void a(Object obj) {
                ya yaVar = (ya) obj;
                j.this.a(countDownLatch);
            }
        });
    }

    public int I0() {
        Iterator<w6> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().l()) {
                i10++;
            }
        }
        return i10;
    }

    public void I2(j<ya> jVar) {
        boolean X = X();
        try {
            jVar.a(this);
        } finally {
            if (X) {
                D2();
            }
        }
    }

    public final void J2(w6 w6Var, int i10) {
        K2(0, w6Var.f28608b);
    }

    public i.e K0() {
        return this.S;
    }

    public final synchronized void K2(int i10, int i11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        File w02 = w0();
        try {
            if (!w02.exists() && !w02.createNewFile()) {
                throw new RuntimeException("Cannot save config file");
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(w02, "rw");
                try {
                    int h32 = h3(randomAccessFile, i10, i11);
                    randomAccessFile.close();
                    try {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(w02, "rw");
                        try {
                            Log.i((int) Log.TAG_ACCOUNTS, "Saved %d accounts in %dms, mode:%d", Integer.valueOf(h32), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Integer.valueOf(i10));
                            randomAccessFile2.close();
                        } catch (Throwable th) {
                            try {
                                randomAccessFile2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e10) {
                        Tracer.f(e10);
                        throw new RuntimeException(e10);
                    }
                } catch (Throwable th3) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e11) {
                Tracer.f(e11);
                throw new RuntimeException(e11);
            }
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    public final TdApi.LanguagePackStringValue L0(String str, String str2) {
        return M0(this.U, str, str2);
    }

    public final void L2(w6 w6Var) {
        K2(4, w6Var.f28608b);
        w6Var.N(false);
    }

    public void M2() {
        K2(3, -1);
    }

    public TdApi.LanguagePackStringValuePluralized N0(String str, String str2) {
        TdApi.LanguagePackStringValue L0 = L0(str, str2);
        if (L0 instanceof TdApi.LanguagePackStringValuePluralized) {
            return (TdApi.LanguagePackStringValuePluralized) L0;
        }
        if (L0 == null) {
            return null;
        }
        Log.e("Expected stringPluralized: %s", L0);
        return null;
    }

    public final void N2(w6 w6Var) {
        K2(1, w6Var.f28608b);
    }

    public TdApi.LanguagePackStringValueOrdinary O0(String str, String str2) {
        TdApi.LanguagePackStringValue L0 = L0(str, str2);
        if (L0 instanceof TdApi.LanguagePackStringValueOrdinary) {
            return (TdApi.LanguagePackStringValueOrdinary) L0;
        }
        if (L0 == null) {
            return null;
        }
        Log.e("Expected stringValue: %s", L0);
        return null;
    }

    public final void O2(int i10) {
        K2(2, i10);
    }

    public final void P2() {
        Iterator<w6> it = this.f28734i0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next().d0(i10);
            i10++;
        }
    }

    public void Q2(int i10, boolean z10) {
        w6 U = U(i10);
        if (U.U(z10)) {
            L2(U);
        }
        if (!z10) {
            gc.w0(i10);
        }
    }

    public synchronized void R2(String str) {
        if (!ib.i.c(this.f28733h0, str)) {
            i.c2().v4(str);
            this.f28733h0 = str;
            b3(3, null);
            r0(str);
        }
    }

    public void S2(int i10, boolean z10) {
        w6 U = U(i10);
        if (U.W(z10)) {
            L2(U);
        }
    }

    public void T2(boolean z10) {
        i.c2().K4(z10);
        h0(this.f28727c);
    }

    public w6 U(int i10) {
        if (i10 != -1) {
            return this.f28723a.get(i10);
        }
        throw new IllegalArgumentException();
    }

    public void U2(int i10, boolean z10) {
        w6 U = U(i10);
        if (U.X(z10)) {
            L2(U);
        }
    }

    public LinkedList<w6> V() {
        return W(null);
    }

    public String V1() {
        return this.U;
    }

    public void V2(int i10, boolean z10) {
        w6 U = U(i10);
        if (U.Y(z10)) {
            L2(U);
        }
    }

    public final LinkedList<w6> W(kb.d<w6> dVar) {
        LinkedList<w6> linkedList = new LinkedList<>();
        if (dVar != null) {
            for (int size = this.f28723a.size() - 1; size >= 0; size--) {
                w6 U = U(size);
                if (dVar.a(U)) {
                    linkedList.add(U);
                }
            }
        } else {
            Iterator<w6> it = iterator();
            while (it.hasNext()) {
                linkedList.add(it.next());
            }
        }
        return linkedList;
    }

    public String W0() {
        return this.f28733h0;
    }

    public d1 W1() {
        return this.O;
    }

    public void W2(boolean z10) {
        if (this.Y != z10) {
            this.Y = z10;
            Iterator<w6> it = this.f28723a.iterator();
            while (it.hasNext()) {
                o6 o6Var = it.next().P;
                if (o6Var != null) {
                    o6Var.cc(z10);
                }
            }
        }
    }

    public final boolean X() {
        synchronized (this.f28735j0) {
            if (this.f28736k0 == null) {
                PowerManager powerManager = (PowerManager) j0.n().getSystemService("power");
                if (powerManager == null) {
                    return false;
                }
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "tgx:main");
                this.f28736k0 = newWakeLock;
                if (newWakeLock == null) {
                    return false;
                }
                newWakeLock.setReferenceCounted(true);
            }
            this.f28736k0.acquire();
            this.f28737l0++;
            return true;
        }
    }

    public String X0() {
        return this.f28732g0;
    }

    public final void X1(int i10) {
        A2();
        final w6 w6Var = i10 != -1 ? this.f28723a.get(i10) : this.f28727c;
        if (w6Var.N(i10 != -1)) {
            w6Var.c().Y1(new Runnable() {
                @Override
                public final void run() {
                    ya.this.z1(w6Var);
                }
            });
            return;
        }
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next != w6Var) {
                next.N(false);
            }
        }
    }

    public void X2(int i10, boolean z10) {
        w6 U = U(i10);
        if (U.a0(z10)) {
            L2(U);
        }
    }

    public vd.c Y() {
        return this.V;
    }

    public int Y0() {
        return this.f28731f0;
    }

    public void Y2(int i10, boolean z10) {
        w6 U = U(i10);
        if (U.c0(z10)) {
            L2(U);
        }
    }

    public long[] Z(boolean z10) {
        TreeSet<Long> treeSet = new TreeSet();
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (!next.K() && next.G() == z10) {
                long r10 = next.r();
                if (r10 != 0) {
                    treeSet.add(Long.valueOf(r10));
                }
            }
        }
        int i10 = 0;
        if (treeSet.isEmpty()) {
            return new long[0];
        }
        long[] jArr = new long[treeSet.size()];
        for (Long l10 : treeSet) {
            i10++;
            jArr[i10] = l10.longValue();
        }
        return jArr;
    }

    public x6 Z0() {
        return a1(-1);
    }

    public void Z2(TdApi.NetworkType networkType) {
        this.f28724a0 = networkType;
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(false)) {
                next.P.kc(networkType);
            }
        }
    }

    public final int a0() {
        return b0(this.f28723a.size());
    }

    public x6 a1(int i10) {
        x6 x6Var = new x6();
        if (i10 == -1) {
            boolean F = i.c2().F(8);
            boolean F2 = i.c2().F(16);
            Iterator<w6> it = iterator();
            while (it.hasNext()) {
                w6 next = it.next();
                if (!F || next.f28608b == this.f28725b) {
                    if (!F2 || next.l()) {
                        x6Var.a(next.x());
                    }
                }
            }
        } else {
            Iterator<w6> it2 = iterator();
            while (it2.hasNext()) {
                w6 next2 = it2.next();
                if (next2.f28608b != i10) {
                    x6Var.a(next2.x());
                }
            }
        }
        return x6Var;
    }

    public void a2(o6 o6Var, Client client) {
        if (this.Y) {
            client.o(new TdApi.SetOption("is_emulator", new TdApi.OptionValueBoolean(true)), o6Var.na());
        }
        TdApi.NetworkType networkType = this.f28724a0;
        if (networkType != null) {
            client.o(new TdApi.SetNetworkType(networkType), o6Var.na());
        } else if (i.c2().b0()) {
            client.o(new TdApi.SetNetworkType(new TdApi.NetworkTypeNone()), o6Var.na());
        }
    }

    public t9 b1() {
        return this.M;
    }

    public void b2(int i10, int i11) {
        if (i10 != i11) {
            ib.b.w(this.f28734i0, i10, i11);
            P2();
            b1().g(this.f28734i0.get(i10), i10, i11);
        }
    }

    public final synchronized void b3(int i10, String str) {
        if (this.f28731f0 != 3 || i10 == 3) {
            this.f28731f0 = i10;
            this.f28732g0 = str;
            Iterator<w6> it = W(Y1()).iterator();
            while (it.hasNext()) {
                w6 next = it.next();
                if (next.N(false)) {
                    next.c().o4();
                }
            }
        }
    }

    public z c0() {
        return this.Q;
    }

    public final void c1(Message message) {
        int i10 = message.what;
        boolean z10 = false;
        if (i10 == 0) {
            t9 b12 = b1();
            o6 o6Var = (o6) message.obj;
            int i11 = message.arg2;
            if (this.f28727c.f28608b == message.arg1) {
                z10 = true;
            }
            b12.n(o6Var, i11, z10);
        } else if (i10 == 1) {
            b1().o(message.arg1, message.arg2);
        } else if (i10 == 2) {
            t9 b13 = b1();
            if (message.arg1 == 1) {
                z10 = true;
            }
            b13.r(z10);
        } else if (i10 == 4) {
            w6 U = U(message.arg1);
            TdApi.User user = (TdApi.User) message.obj;
            boolean z11 = message.arg1 == this.f28727c.f28608b;
            if (message.arg2 == 1) {
                z10 = true;
            }
            e2(U, user, z11, z10);
        } else if (i10 == 5) {
            w6 U2 = U(message.arg1);
            boolean z12 = message.arg2 == 1;
            if (message.arg1 == this.f28727c.f28608b) {
                z10 = true;
            }
            f2(U2, z12, z10);
        } else if (i10 == 6 || i10 == 7) {
            t9 b14 = b1();
            TdApi.ChatList chatList = (TdApi.ChatList) message.obj;
            if (message.what == 7) {
                z10 = true;
            }
            b14.s(chatList, z10);
        }
    }

    public int c2(boolean z10) {
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.f28608b != this.f28727c.f28608b && next.K() && !next.I()) {
                if (next.Z(z10)) {
                    L2(next);
                }
                return next.f28608b;
            }
        }
        if (this.f28723a.size() >= 65535) {
            return -1;
        }
        w6 w6Var = new w6(this, this.f28723a.size(), z10);
        this.f28723a.add(w6Var);
        w6Var.O();
        w6Var.c();
        N2(w6Var);
        if (f0(w6Var)) {
            h0(w6Var);
        }
        return w6Var.f28608b;
    }

    public void c3(final long j10, int i10, Runnable runnable, final boolean z10, final boolean z11, int i11, final j<o6> jVar) {
        v2(j10, i10, new f() {
            @Override
            public final void a(w6 w6Var, Runnable runnable2) {
                ya.U1(j.this, j10, z10, z11, w6Var, runnable2);
            }
        }, i11, null, runnable);
    }

    public void d0(int i10, int i11) {
        e0(i10, i11, null);
    }

    public boolean d1(int i10) {
        return i10 >= 0 && i10 < this.f28723a.size();
    }

    public jb.a d2() {
        return this.P;
    }

    public o6 d3(int i10) {
        return U(i10).c();
    }

    public void e0(final int i10, final int i11, final kb.i iVar) {
        if (this.f28725b == i10) {
            if (iVar != null) {
                iVar.a(false);
            }
        } else if (i10 < 0 || i10 >= this.f28723a.size()) {
            throw new IllegalArgumentException("accountId == " + i10);
        } else if (!this.f28723a.get(i10).K()) {
            this.f28723a.get(i10).c().Y1(new Runnable() {
                @Override
                public final void run() {
                    ya.this.s1(i10, iVar, i11);
                }
            });
        } else if (iVar != null) {
            iVar.a(false);
        }
    }

    public int e1(String str, int i10) {
        for (int size = this.f28723a.size() - 1; size >= 0; size--) {
            w6 w6Var = this.f28723a.get(size);
            if (!(w6Var.f28608b == i10 || w6Var.K() || !ib.i.c(str, w6Var.q()))) {
                return w6Var.f28608b;
            }
        }
        return -1;
    }

    public final void e2(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
        if (!w6Var.K()) {
            b1().h(w6Var, user, z10, z11);
            if ((z11 || user == null) && f0(w6Var)) {
                h0(null);
            }
        }
    }

    public void e3(boolean z10, int i10, long[] jArr) {
        Iterator<w6> it = iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.G() == z10 && next.f28608b != i10) {
                long r10 = next.r();
                if (r10 == 0 || Arrays.binarySearch(jArr, r10) < 0) {
                    Log.i(4, "Unregistered accountId:%d userId:%d", Integer.valueOf(next.f28608b), Long.valueOf(r10));
                    Q2(next.f28608b, false);
                }
            }
        }
    }

    @Override
    public void f(int i10) {
        boolean z10 = (i10 == 2 || i10 == -1) ? false : true;
        if (this.X != z10) {
            this.X = z10;
            Iterator<w6> it = this.f28723a.iterator();
            while (it.hasNext()) {
                w6 next = it.next();
                if (next.B(true)) {
                    next.c().t4();
                }
            }
        }
    }

    public final boolean f0(w6 w6Var) {
        boolean z10 = !w6Var.K() && w6Var.z();
        int indexOf = this.f28734i0.indexOf(w6Var);
        if (indexOf == -1 && z10) {
            indexOf = Collections.binarySearch(this.f28734i0, w6Var);
        }
        if (z10) {
            if (indexOf >= 0) {
                return false;
            }
            indexOf = (-indexOf) - 1;
            this.f28734i0.add(indexOf, w6Var);
        } else if (indexOf < 0) {
            return false;
        } else {
            this.f28734i0.remove(indexOf);
        }
        b1().f(w6Var, indexOf, z10);
        F2();
        m1(w6Var);
        return true;
    }

    public int f1(String str, String str2, int i10) {
        for (int size = this.f28723a.size() - 1; size >= 0; size--) {
            w6 w6Var = this.f28723a.get(size);
            if (w6Var.f28608b != i10 && !w6Var.K() && ib.i.c(str, w6Var.q()) && ib.i.c(str2, w6Var.s())) {
                return w6Var.f28608b;
            }
        }
        return -1;
    }

    public final void f2(w6 w6Var, boolean z10, boolean z11) {
        if (!w6Var.K()) {
            b1().i(w6Var, z10, z11);
        }
    }

    public final void f3(boolean z10, boolean z11) {
        try {
            bb.c.a(j0.n(), Z0().b());
            this.Z = false;
        } catch (Throwable th) {
            if (!this.Z) {
                this.Z = true;
                Log.v("Could not update app badge", th, new Object[0]);
            }
        }
    }

    public void finalize() {
        this.T.c();
        super.finalize();
    }

    public synchronized void g0() {
        b3(2, null);
        g gaVar = new g() {
            @Override
            public final void c(Exception exc) {
                ya.this.t1(exc);
            }
        };
        try {
            d7.c.n(j0.n());
            FirebaseMessaging.f().h().g(new h() {
                @Override
                public final void a(Object obj) {
                    ya.this.u1((String) obj);
                }
            }).e(gaVar);
        } catch (Exception e10) {
            gaVar.c(e10);
        }
    }

    public int g1(String str, boolean z10) {
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.G() == z10 && next.g(str) && !next.K() && !next.I()) {
                return next.f28608b;
            }
        }
        return -1;
    }

    public final void g2(final w6 w6Var, int i10, final w6 w6Var2) {
        this.f28727c = w6Var;
        if (w6Var2 != null) {
            w6Var2.O();
        }
        w6Var.O();
        b1().j(w6Var, w6Var.c().da(), i10, w6Var2);
        i2(w6Var.c(), w6Var.c().D4());
        if (i.c2().F(8)) {
            p2(null, new kb.d() {
                @Override
                public final boolean a(Object obj) {
                    boolean E1;
                    E1 = ya.E1(w6.this, w6Var2, (w6) obj);
                    return E1;
                }
            });
        }
    }

    public d0 g3() {
        return this.T.a();
    }

    public void h0(w6 w6Var) {
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next != w6Var && next.B(true)) {
                next.c().t4();
            }
        }
    }

    public boolean h1() {
        return A0() > 0;
    }

    public void h2(o6 o6Var, final TdApi.AuthorizationState authorizationState, final int i10, long j10) {
        if (i10 != 0) {
            final int A6 = o6Var.A6();
            boolean z10 = true;
            boolean z11 = i10 == 1;
            w6 w6Var = this.f28723a.get(A6);
            if (w6Var.K() == z11) {
                z10 = false;
            }
            if (w6Var.e0(z11, j10)) {
                J2(w6Var, 0);
            }
            if (z10) {
                if (f0(w6Var)) {
                    h0(null);
                }
                if (z11 && A6 == this.f28725b) {
                    G2(new Runnable() {
                        @Override
                        public final void run() {
                            ya.this.F1(A6);
                        }
                    });
                }
            }
            G2(new Runnable() {
                @Override
                public final void run() {
                    ya.this.G1(A6, authorizationState, i10);
                }
            });
        }
    }

    public final int h3(RandomAccessFile randomAccessFile, int i10, int i11) {
        int size = this.f28723a.size();
        int a02 = a0();
        long length = randomAccessFile.length();
        boolean z10 = i10 == 0 ? !(i11 == -1 || length != ((long) a02)) : !(i10 == 1 ? i11 == -1 || 21 + length != ((long) a02) : length != ((long) a02));
        Log.i((int) Log.TAG_ACCOUNTS, "Writing account configuration, accountNum:%d, preferredAccountId:%d, mode:%d, canOptimize:%b, accountId:%d, binlogSize:%d, currentLen:%d", Integer.valueOf(size), Integer.valueOf(this.f28725b), Integer.valueOf(i10), Boolean.valueOf(z10), Integer.valueOf(i11), Integer.valueOf(a02), Long.valueOf(length));
        if (!z10) {
            return i3(randomAccessFile, new c(this.f28727c, this.f28723a, this.f28725b));
        }
        int i12 = 8;
        if (i10 == 0) {
            randomAccessFile.seek((i11 * 21) + 8);
            this.f28723a.get(i11).R(randomAccessFile);
        } else if (i10 == 1) {
            randomAccessFile.setLength(a02);
            randomAccessFile.writeInt(size);
            randomAccessFile.seek(length);
            this.f28723a.get(i11).R(randomAccessFile);
        } else if (i10 == 2) {
            randomAccessFile.seek(4L);
            randomAccessFile.writeInt(i11);
            return 0;
        } else if (i10 == 3) {
            Iterator<w6> it = this.f28723a.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                i12 = it.next().T(randomAccessFile, i12);
                i13++;
            }
            return i13;
        } else if (i10 != 4) {
            throw new IllegalArgumentException("mode == ");
        } else if (i11 != -1) {
            this.f28723a.get(i11).S(randomAccessFile, (i11 * 21) + 8);
        } else {
            Iterator<w6> it2 = this.f28723a.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                i12 = it2.next().S(randomAccessFile, i12);
                i14++;
            }
            return i14;
        }
        return 1;
    }

    public void i0(int i10, boolean z10, int i11) {
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(false)) {
                next.c().tc().q(i10, z10, i11);
            } else {
                gc.p(next.f28608b, i10, z10, i11);
            }
        }
    }

    public boolean i1() {
        return this.X;
    }

    public void i2(o6 o6Var, int i10) {
        if (i10 != -1) {
            d dVar = this.N;
            dVar.sendMessage(Message.obtain(dVar, 0, o6Var.A6(), i10));
        }
    }

    @Override
    public Iterator<w6> iterator() {
        ArrayList arrayList = new ArrayList(this.f28723a);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int x12;
                x12 = ya.this.x1((w6) obj, (w6) obj2);
                return x12;
            }
        });
        return new nb.d(arrayList.iterator(), ba.f27284a);
    }

    public o6 j0() {
        return this.f28727c.c();
    }

    public void j2(int i10, int i11) {
        d dVar = this.N;
        dVar.sendMessage(Message.obtain(dVar, 1, i10, i11));
    }

    public w6 k0() {
        return this.f28727c;
    }

    public boolean k1() {
        return this.S != null;
    }

    public void k2(int i10, long j10) {
        w6 w6Var = this.f28723a.get(i10);
        if (w6Var.b0(j10)) {
            J2(w6Var, 1);
            if (j10 != 0) {
                w6Var.c().r4(null);
            }
        }
    }

    public o6 l0() {
        return this.f28727c.i0();
    }

    public void l2(boolean z10) {
        d dVar = this.N;
        dVar.sendMessage(Message.obtain(dVar, 2, z10 ? 1 : 0, 0));
    }

    public void m1(w6 w6Var) {
        this.f28729d0++;
    }

    public void m2(int i10, TdApi.User user, boolean z10) {
        d dVar = this.N;
        dVar.sendMessage(Message.obtain(dVar, 4, i10, z10 ? 1 : 0, user));
    }

    public void n1(TdApi.ChatList chatList, int i10, int i11, boolean z10) {
        synchronized (this) {
            boolean z11 = (i10 == 0 && i11 == 0) ? false : true;
            f3(false, z11);
            if (z11) {
                s0(false);
            }
        }
    }

    public void n2(int i10, boolean z10) {
        d dVar = this.N;
        dVar.sendMessage(Message.obtain(dVar, 5, i10, z10 ? 1 : 0));
    }

    public void o2() {
        p2(null, null);
    }

    public void p2(TdApi.NotificationSettingsScope notificationSettingsScope, kb.d<w6> dVar) {
        Iterator<w6> it = iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (dVar == null || dVar.a(next)) {
                if (next.F()) {
                    next.c().ka().P1(notificationSettingsScope);
                }
            }
        }
    }

    public void q0(int i10) {
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(false)) {
                next.c().tc().l(i10);
            } else {
                gc.m(next.f28608b, i10);
            }
        }
    }

    public boolean q1() {
        return this.f28734i0.size() > 1;
    }

    public void q2() {
        p2(new TdApi.NotificationSettingsScopePrivateChats(), null);
    }

    public final void r0(String str) {
        long[] jArr;
        Iterator<w6> it = iterator();
        long[] jArr2 = null;
        long[] jArr3 = null;
        boolean z10 = false;
        while (it.hasNext()) {
            w6 next = it.next();
            if (!next.K() || next.B(false)) {
                long r10 = next.r();
                if (next.G()) {
                    if (jArr2 == null) {
                        jArr2 = Z(true);
                    }
                    jArr = ib.b.y(jArr2, ib.b.s(jArr2, r10));
                } else {
                    if (jArr3 == null) {
                        jArr3 = Z(false);
                    }
                    jArr = ib.b.y(jArr3, ib.b.s(jArr3, r10));
                }
                if (!gc.j(next.f28608b, next.r(), str, jArr, true)) {
                    Q2(next.f28608b, false);
                    z10 = true;
                }
                if (next.B(true)) {
                    next.c().r4(null);
                }
            }
        }
        if (z10) {
            u2(-1, pa.f28228a, 5, z9.f28800a, null);
        }
    }

    public final void s0(boolean z10) {
        d dVar = this.N;
        dVar.sendMessage(Message.obtain(dVar, z10 ? 7 : 6));
    }

    public boolean t0() {
        if (this.S == null) {
            return false;
        }
        i.c2().s2(this.S);
        this.S = null;
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(true)) {
                next.c().J6();
            }
        }
        return true;
    }

    public final int u0(Client client) {
        if (client == null) {
            return -1;
        }
        Iterator<w6> it = this.f28723a.iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.P(client)) {
                return next.f28608b;
            }
        }
        return -1;
    }

    public final void u2(int i10, f fVar, int i11, kb.d<w6> dVar, Runnable runnable) {
        if (i10 != -1) {
            fVar.a(U(i10), runnable);
            return;
        }
        LinkedList<w6> W = W(dVar);
        if (W.isEmpty()) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (W.size() == 1) {
            fVar.a(W.removeFirst(), runnable);
        } else if (i11 > 0) {
            new b(W, new AtomicInteger(1), i11, fVar, runnable).run();
        } else {
            throw new AssertionError(i11);
        }
    }

    public int v0(int i10) {
        int binarySearch = Collections.binarySearch(this.f28734i0, U(i10));
        int i11 = 0;
        if (binarySearch >= 0) {
            int i12 = binarySearch + 1;
            if (this.f28734i0.size() > i12) {
                return this.f28734i0.get(i12).f28608b;
            }
            if (binarySearch > 0) {
                return this.f28734i0.get(0).f28608b;
            }
            return -1;
        }
        int i13 = (-binarySearch) - 1;
        if (i13 < this.f28734i0.size()) {
            return this.f28734i0.get(i13).f28608b;
        }
        Iterator<w6> it = this.f28734i0.iterator();
        int i14 = 0;
        int i15 = -1;
        while (it.hasNext()) {
            w6 next = it.next();
            if (i15 == -1 || Math.abs(i11 - i13) <= i14) {
                i15 = next.f28608b;
                i14 = Math.abs(i11 - i13);
            }
            i11++;
        }
        return i15;
    }

    public final void v2(long j10, int i10, final f fVar, int i11, kb.d<w6> dVar, Runnable runnable) {
        u2(i10, new f() {
            @Override
            public final void a(w6 w6Var, Runnable runnable2) {
                ya.Q1(ya.f.this, w6Var, runnable2);
            }
        }, i11, dVar, runnable);
    }

    public o0 w2() {
        return this.W;
    }

    public int x2() {
        return this.f28725b;
    }

    public synchronized int y0(int i10, long j10) {
        if (this.f28728c0 == null) {
            this.f28728c0 = new ArrayList(this.f28734i0.size());
        }
        if (!(this.f28728c0.size() == this.f28734i0.size() && this.f28730e0 == this.f28729d0)) {
            this.f28728c0.clear();
            this.f28728c0.addAll(this.f28734i0);
            Collections.sort(this.f28728c0, this.f28726b0);
            this.f28730e0 = this.f28729d0;
        }
        w6 U = U(i10);
        int indexOf = this.f28728c0.indexOf(U);
        if (indexOf != -1) {
            long M = U.M();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (M != 0 && (M > uptimeMillis || uptimeMillis - M <= j10)) {
                return indexOf;
            }
        }
        return -1;
    }

    public void y2(final long j10, int i10, final String str, Runnable runnable) {
        v2(j10, i10, new f() {
            @Override
            public final void a(w6 w6Var, Runnable runnable2) {
                ya.R1(j10, str, w6Var, runnable2);
            }
        }, 5, null, runnable);
    }

    public ArrayList<w6> z0() {
        return this.f28734i0;
    }
}
