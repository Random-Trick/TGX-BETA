package jd;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Message;
import ca.g;
import ca.h;
import ce.j0;
import da.a;
import da.f;
import gd.m;
import gd.w;
import he.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.j;
import kb.l;
import mb.p;
import n9.c;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.o6;

public class e0 {
    public final o6 f15235a;
    public final HashMap<String, c> f15237c = new HashMap<>();
    public final e f15236b = new e(this);

    public class a implements d {
        public final c f15238a;
        public final long f15239b;
        public final boolean f15240c;

        public a(c cVar, long j10, boolean z10) {
            this.f15238a = cVar;
            this.f15239b = j10;
            this.f15240c = z10;
        }

        @Override
        public void a(double d10, long j10) {
            synchronized (this.f15238a) {
                if (!this.f15238a.f15250a.get() && !this.f15238a.f15251b.get() && d10 > 0.0d) {
                    long j11 = this.f15239b;
                    if (j11 == 0 || j10 <= j11 || !this.f15240c) {
                        this.f15238a.h(d10, j10);
                    } else if (!this.f15238a.f15251b.getAndSet(true)) {
                        this.f15238a.f();
                    }
                }
            }
        }
    }

    public class b implements n9.b {
        public final d f15242a;
        public final File f15243b;
        public final Runnable f15244c;
        public final g0 f15245d;
        public final c f15246e;
        public final Runnable f15247f;
        public final j f15248g;

        public b(d dVar, File file, Runnable runnable, g0 g0Var, c cVar, Runnable runnable2, j jVar) {
            this.f15242a = dVar;
            this.f15243b = file;
            this.f15244c = runnable;
            this.f15245d = g0Var;
            this.f15246e = cVar;
            this.f15247f = runnable2;
            this.f15248g = jVar;
        }

        @Override
        public void a(int i10) {
            if (i10 == 0) {
                this.f15244c.run();
            } else if (i10 == 1) {
                e0.this.t(this.f15245d, this.f15246e);
            }
        }

        @Override
        public void b(double d10) {
            this.f15242a.a(d10, this.f15243b.exists() ? this.f15243b.length() : 0L);
        }

        @Override
        public void c(Throwable th) {
            this.f15248g.a(th);
        }

        @Override
        public void d() {
            this.f15247f.run();
        }
    }

    public static class c {
        public final AtomicBoolean f15250a;
        public final AtomicBoolean f15251b;
        public final AtomicBoolean f15252c;
        public double f15253d;
        public long f15254e;
        public long f15255f;
        public long f15256g;
        public final e0 f15257h;
        public final long f15258i;
        public Future<Void> f15259j;

        public c(e0 e0Var, long j10) {
            this.f15250a = new AtomicBoolean(false);
            this.f15251b = new AtomicBoolean(false);
            this.f15252c = new AtomicBoolean(false);
            this.f15257h = e0Var;
            this.f15258i = j10;
        }

        public void f() {
            Future<Void> future = this.f15259j;
            if (future != null) {
                future.cancel(true);
            }
        }

        public double g() {
            return this.f15253d;
        }

        public void h(double d10, long j10) {
            if (this.f15253d != d10) {
                this.f15253d = d10;
                i(j10, this.f15255f);
            }
        }

        public void i(long j10, long j11) {
            if (this.f15256g == j10) {
                long j12 = this.f15255f;
                if (j11 >= j12 && j11 - j12 < p.f17345b.b(5.0d)) {
                    return;
                }
            }
            this.f15256g = j10;
            this.f15255f = j11;
            this.f15257h.f15235a.v4().o(new TdApi.SetFileGenerationProgress(this.f15258i, (int) j10, (int) j11), this.f15257h.f15235a.yc());
        }

        public void j(long j10) {
            this.f15254e = 0L;
            i(j10, 0L);
        }
    }

    public interface d {
        void a(double d10, long j10);
    }

    public static class e extends m {
        public final e0 M;

        public e(e0 e0Var) {
            super("VideoGenQueue");
            this.M = e0Var;
        }

        @Override
        public void f(Message message) {
            if (message.what == 0) {
                this.M.u((g0) message.obj);
            }
        }
    }

    public e0(o6 o6Var) {
        this.f15235a = o6Var;
    }

    public static long l(String str, boolean z10) {
        try {
            return new RandomAccessFile(str, "r").length();
        } catch (IOException unused) {
            if (!z10) {
                return 0L;
            }
            try {
                InputStream o22 = v0.o2(str);
                long available = o22.available();
                o22.close();
                return available;
            } catch (IOException | SecurityException unused2) {
                return 0L;
            }
        }
    }

    public void o(c cVar, g0 g0Var, String str) {
        synchronized (cVar) {
            if (!cVar.f15250a.getAndSet(true)) {
                this.f15235a.l5().L(g0Var);
                this.f15237c.remove(str);
            }
        }
    }

    public void p(c cVar, g0 g0Var, String str) {
        synchronized (cVar) {
            if (!cVar.f15250a.getAndSet(true)) {
                if (cVar.f15252c.get() || !cVar.f15251b.get()) {
                    this.f15235a.l5().J(g0Var, -1, "Video conversion has been cancelled");
                    this.f15237c.remove(str);
                } else {
                    t(g0Var, cVar);
                }
            }
        }
    }

    public void q(c cVar, String str) {
        synchronized (cVar) {
            cVar.f15252c.set(true);
            cVar.f15250a.set(true);
            this.f15237c.remove(str);
        }
        try {
            if (cVar.f15259j != null && !cVar.f15259j.isDone()) {
                Log.i("Cancelling video generation", new Object[0]);
                cVar.f15259j.cancel(true);
            }
        } catch (Throwable th) {
            Log.i(th);
        }
    }

    public void r(c cVar, String str, boolean z10, g0 g0Var, String str2, Throwable th) {
        synchronized (cVar) {
            if (!cVar.f15250a.getAndSet(true)) {
                if (th != null) {
                    Log.e("Failed to generate video: %s", th, str);
                } else {
                    Log.i("No need to transcode video: %s", str);
                }
                if (cVar.f15252c.get() || !z10) {
                    this.f15235a.l5().J(g0Var, -1, w.i1(R.string.SendVideoError));
                    this.f15237c.remove(str2);
                } else {
                    t(g0Var, cVar);
                }
            }
        }
    }

    public void s(java.lang.String r15, long r16, java.lang.String r18, jd.e0.c r19, jd.g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: jd.e0.s(java.lang.String, long, java.lang.String, jd.e0$c, jd.g0):void");
    }

    public final void i(final g0 g0Var, final c cVar) {
        final String f10 = g0Var.f();
        final String c10 = g0Var.c();
        final boolean k10 = g0Var.k();
        a aVar = new a(cVar, l(f10, true), k10);
        Runnable b0Var = new Runnable() {
            @Override
            public final void run() {
                e0.this.o(cVar, g0Var, c10);
            }
        };
        Runnable c0Var = new Runnable() {
            @Override
            public final void run() {
                e0.this.p(cVar, g0Var, c10);
            }
        };
        g0Var.i(new Runnable() {
            @Override
            public final void run() {
                e0.this.q(cVar, c10);
            }
        });
        j<Throwable> d0Var = new j() {
            @Override
            public final void a(Object obj) {
                e0.this.r(cVar, f10, k10, g0Var, c10, (Throwable) obj);
            }
        };
        if (!g0Var.l() || !k10) {
            try {
                j(f10, c10, g0Var, cVar, aVar, b0Var, c0Var, d0Var);
            } catch (Throwable th) {
                Log.e(th);
                d0Var.a(th);
            }
        } else {
            t(g0Var, cVar);
        }
    }

    public final void j(String str, String str2, g0 g0Var, c cVar, d dVar, Runnable runnable, Runnable runnable2, j<Throwable> jVar) {
        ca.b bVar;
        f fVar;
        f fVar2;
        MediaFormat k10;
        i.v vVar;
        int i10;
        if (str.startsWith("content://")) {
            bVar = new h(j0.n(), Uri.parse(str));
        } else {
            bVar = new ca.f(str);
            bVar.e();
        }
        g gVar = bVar;
        if (g0Var.w()) {
            long d10 = gVar.d() - g0Var.m();
            long o10 = g0Var.o();
            if (d10 < 1000) {
                d10 = 0;
            }
            gVar = new g(gVar, o10, d10);
        }
        if (g0Var.l()) {
            fVar = new da.d();
        } else {
            i.t p10 = g0Var.p();
            if (p10 == null) {
                p10 = new i.t();
            }
            long j10 = p10.f13892c;
            int i11 = p10.f13891b;
            if (i11 == 0) {
                i11 = 29;
            }
            int K0 = v0.K0();
            if (K0 > 0 && (i10 = (vVar = p10.f13890a).f13893a) > K0) {
                float f10 = K0 / i10;
                int i12 = (int) (i10 * f10);
                int i13 = i12 - (i12 % 2);
                p10 = p10.a(new i.v(i13, ((int) (vVar.f13894b * f10)) - (i13 % 2)));
            }
            if (j10 == Long.MIN_VALUE && (k10 = gVar.k(o9.d.VIDEO)) != null) {
                i.v d11 = p10.d(k10.getInteger("width"), k10.getInteger("height"));
                i11 = p10.c(k10.getInteger("frame-rate"));
                j10 = p10.b(d11, i11, p10.f13892c);
            }
            i.v vVar2 = p10.f13890a;
            fVar = da.c.b(vVar2.f13894b, vVar2.f13893a).c(i11).a(j10).b();
        }
        int n10 = g0Var.n();
        File file = new File(str2);
        c.b f11 = n9.a.b(str2).a(gVar).f(fVar);
        if (g0Var.v()) {
            fVar2 = new da.e();
        } else if (g0Var.l() || i.c2().k1(256L)) {
            fVar2 = new da.d();
        } else {
            fVar2 = new a.b().e(44100).a(62000L).c(2).b();
        }
        cVar.f15259j = f11.c(fVar2).e(n10).d(new b(dVar, file, runnable, g0Var, cVar, runnable2, jVar)).g();
    }

    public final boolean k(String str, String str2, g0 g0Var, AtomicBoolean atomicBoolean, l lVar) {
        y yVar = new y(str);
        if (g0Var.w()) {
            return yVar.e(str2, g0Var.v(), g0Var.n(), g0Var.o() / 1000000.0d, g0Var.m() / 1000000.0d, lVar, atomicBoolean);
        }
        return yVar.f(str2, g0Var.v(), g0Var.n(), lVar, atomicBoolean);
    }

    public c m(String str) {
        return this.f15237c.get(str);
    }

    public e n() {
        return this.f15236b;
    }

    public final void t(final g0 g0Var, final c cVar) {
        final long d10 = g0Var.d();
        final String f10 = g0Var.f();
        final String c10 = g0Var.c();
        boolean z10 = false;
        cVar.f15250a.set(false);
        if (g0Var.w() || g0Var.v() || g0Var.n() != 0) {
            cVar.j(0L);
            try {
                z10 = k(f10, c10, g0Var, cVar.f15252c, null);
            } catch (Throwable th) {
                Log.w(Log.TAG_VIDEO, "Cannot trim video", th, new Object[0]);
            }
            synchronized (cVar) {
                if (!cVar.f15250a.getAndSet(true)) {
                    if (z10) {
                        this.f15235a.l5().L(g0Var);
                    } else {
                        this.f15235a.l5().J(g0Var, -1, w.i1(R.string.SendVideoError));
                    }
                    this.f15237c.remove(c10);
                }
            }
            return;
        }
        cVar.j((int) l(f10, true));
        this.f15235a.l5().W().execute(new Runnable() {
            @Override
            public final void run() {
                e0.this.s(f10, d10, c10, cVar, g0Var);
            }
        });
    }

    public final void u(g0 g0Var) {
        c cVar = new c(g0Var.f15202a);
        this.f15237c.put(g0Var.c(), cVar);
        i(g0Var, cVar);
    }
}
