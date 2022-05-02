package id;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Message;
import ba.AbstractC1296b;
import ba.C1301f;
import ba.C1302g;
import ba.C1303h;
import be.C1379j0;
import ca.AbstractC2055f;
import ca.C2044a;
import ca.C2049c;
import ca.C2053d;
import ca.C2054e;
import ge.C4868i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import lb.EnumC6459p;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4384m;
import p082fd.C4403w;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5920l;
import p180m9.AbstractC6805b;
import p180m9.C6803a;
import p180m9.C6806c;
import p192n9.EnumC7313d;
import p350yd.C10930q6;

public class C5340e0 {
    public final C10930q6 f17551a;
    public final HashMap<String, C5343c> f17553c = new HashMap<>();
    public final C5345e f17552b = new C5345e(this);

    public class C5341a implements AbstractC5344d {
        public final C5343c f17554a;
        public final long f17555b;
        public final boolean f17556c;

        public C5341a(C5343c cVar, long j, boolean z) {
            this.f17554a = cVar;
            this.f17555b = j;
            this.f17556c = z;
        }

        @Override
        public void mo23170a(double d, long j) {
            synchronized (this.f17554a) {
                if (!this.f17554a.f17566a.get() && !this.f17554a.f17567b.get() && d > 0.0d) {
                    long j2 = this.f17555b;
                    if (j2 == 0 || j <= j2 || !this.f17556c) {
                        this.f17554a.m23173h(d, j);
                    } else if (!this.f17554a.f17567b.getAndSet(true)) {
                        this.f17554a.m23175f();
                    }
                }
            }
        }
    }

    public class C5342b implements AbstractC6805b {
        public final AbstractC5344d f17558a;
        public final File f17559b;
        public final Runnable f17560c;
        public final C5349g0 f17561d;
        public final C5343c f17562e;
        public final Runnable f17563f;
        public final AbstractC5918j f17564g;

        public C5342b(AbstractC5344d dVar, File file, Runnable runnable, C5349g0 g0Var, C5343c cVar, Runnable runnable2, AbstractC5918j jVar) {
            this.f17558a = dVar;
            this.f17559b = file;
            this.f17560c = runnable;
            this.f17561d = g0Var;
            this.f17562e = cVar;
            this.f17563f = runnable2;
            this.f17564g = jVar;
        }

        @Override
        public void mo18988a(int i) {
            if (i == 0) {
                this.f17560c.run();
            } else if (i == 1) {
                C5340e0.this.m23182t(this.f17561d, this.f17562e);
            }
        }

        @Override
        public void mo18987b(double d) {
            this.f17558a.mo23170a(d, this.f17559b.exists() ? this.f17559b.length() : 0L);
        }

        @Override
        public void mo18986c(Throwable th) {
            this.f17564g.mo1330a(th);
        }

        @Override
        public void mo18985d() {
            this.f17563f.run();
        }
    }

    public static class C5343c {
        public final AtomicBoolean f17566a;
        public final AtomicBoolean f17567b;
        public final AtomicBoolean f17568c;
        public double f17569d;
        public long f17570e;
        public long f17571f;
        public long f17572g;
        public final C5340e0 f17573h;
        public final long f17574i;
        public Future<Void> f17575j;

        public C5343c(C5340e0 e0Var, long j) {
            this.f17566a = new AtomicBoolean(false);
            this.f17567b = new AtomicBoolean(false);
            this.f17568c = new AtomicBoolean(false);
            this.f17573h = e0Var;
            this.f17574i = j;
        }

        public void m23175f() {
            Future<Void> future = this.f17575j;
            if (future != null) {
                future.cancel(true);
            }
        }

        public double m23174g() {
            return this.f17569d;
        }

        public void m23173h(double d, long j) {
            if (this.f17569d != d) {
                this.f17569d = d;
                m23172i(j, this.f17571f);
            }
        }

        public void m23172i(long j, long j2) {
            if (this.f17572g == j) {
                long j3 = this.f17571f;
                if (j2 >= j3 && j2 - j3 < EnumC6459p.f20156b.mo20395b(5.0d)) {
                    return;
                }
            }
            this.f17572g = j;
            this.f17571f = j2;
            this.f17573h.f17551a.m2270r4().m14783o(new TdApi.SetFileGenerationProgress(this.f17574i, (int) j, (int) j2), this.f17573h.f17551a.m2214uc());
        }

        public void m23171j(long j) {
            this.f17570e = 0L;
            m23172i(j, 0L);
        }
    }

    public interface AbstractC5344d {
        void mo23170a(double d, long j);
    }

    public static class C5345e extends C4384m {
        public final C5340e0 f17576M;

        public C5345e(C5340e0 e0Var) {
            super("VideoGenQueue");
            this.f17576M = e0Var;
        }

        @Override
        public void mo3052f(Message message) {
            if (message.what == 0) {
                this.f17576M.m23181u((C5349g0) message.obj);
            }
        }
    }

    public C5340e0(C10930q6 q6Var) {
        this.f17551a = q6Var;
    }

    public static long m23190l(String str, boolean z) {
        try {
            return new RandomAccessFile(str, "r").length();
        } catch (IOException unused) {
            if (!z) {
                return 0L;
            }
            try {
                InputStream o2 = C7389v0.m16599o2(str);
                long available = o2.available();
                o2.close();
                return available;
            } catch (IOException | SecurityException unused2) {
                return 0L;
            }
        }
    }

    public void m23187o(C5343c cVar, C5349g0 g0Var, String str) {
        synchronized (cVar) {
            if (!cVar.f17566a.getAndSet(true)) {
                this.f17551a.m2429h5().m23136K(g0Var);
                this.f17553c.remove(str);
            }
        }
    }

    public void m23186p(C5343c cVar, C5349g0 g0Var, String str) {
        synchronized (cVar) {
            if (!cVar.f17566a.getAndSet(true)) {
                if (cVar.f17568c.get() || !cVar.f17567b.get()) {
                    this.f17551a.m2429h5().m23138I(g0Var, -1, "Video conversion has been cancelled");
                    this.f17553c.remove(str);
                } else {
                    m23182t(g0Var, cVar);
                }
            }
        }
    }

    public void m23185q(C5343c cVar, String str) {
        synchronized (cVar) {
            cVar.f17568c.set(true);
            cVar.f17566a.set(true);
            this.f17553c.remove(str);
        }
        try {
            if (cVar.f17575j != null && !cVar.f17575j.isDone()) {
                Log.m14719i("Cancelling video generation", new Object[0]);
                cVar.f17575j.cancel(true);
            }
        } catch (Throwable th) {
            Log.m14718i(th);
        }
    }

    public void m23184r(C5343c cVar, String str, boolean z, C5349g0 g0Var, String str2, Throwable th) {
        synchronized (cVar) {
            if (!cVar.f17566a.getAndSet(true)) {
                if (th != null) {
                    Log.m14725e("Failed to generate video: %s", th, str);
                } else {
                    Log.m14719i("No need to transcode video: %s", str);
                }
                if (cVar.f17568c.get() || !z) {
                    this.f17551a.m2429h5().m23138I(g0Var, -1, C4403w.m27869i1(R.string.SendVideoError));
                    this.f17553c.remove(str2);
                } else {
                    m23182t(g0Var, cVar);
                }
            }
        }
    }

    public void m23183s(java.lang.String r15, long r16, java.lang.String r18, id.C5340e0.C5343c r19, id.C5349g0 r20) {
        throw new UnsupportedOperationException("Method not decompiled: id.C5340e0.m23183s(java.lang.String, long, java.lang.String, id.e0$c, id.g0):void");
    }

    public final void m23193i(final C5349g0 g0Var, final C5343c cVar) {
        final String f = g0Var.m23225f();
        final String c = g0Var.m23228c();
        final boolean k = g0Var.m23168k();
        C5341a aVar = new C5341a(cVar, m23190l(f, true), k);
        Runnable zVar = new Runnable() {
            @Override
            public final void run() {
                C5340e0.this.m23187o(cVar, g0Var, c);
            }
        };
        Runnable a0Var = new Runnable() {
            @Override
            public final void run() {
                C5340e0.this.m23186p(cVar, g0Var, c);
            }
        };
        g0Var.m23222i(new Runnable() {
            @Override
            public final void run() {
                C5340e0.this.m23185q(cVar, c);
            }
        });
        AbstractC5918j<Throwable> d0Var = new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C5340e0.this.m23184r(cVar, f, k, g0Var, c, (Throwable) obj);
            }
        };
        if (!g0Var.m23167l() || !k) {
            try {
                m23192j(f, c, g0Var, cVar, aVar, zVar, a0Var, d0Var);
            } catch (Throwable th) {
                Log.m14723e(th);
                d0Var.mo1330a(th);
            }
        } else {
            m23182t(g0Var, cVar);
        }
    }

    public final void m23192j(String str, String str2, C5349g0 g0Var, C5343c cVar, AbstractC5344d dVar, Runnable runnable, Runnable runnable2, AbstractC5918j<Throwable> jVar) {
        AbstractC1296b bVar;
        AbstractC2055f fVar;
        AbstractC2055f fVar2;
        MediaFormat n;
        C4868i.C4891v vVar;
        int i;
        if (str.startsWith("content://")) {
            bVar = new C1303h(C1379j0.m37315n(), Uri.parse(str));
        } else {
            bVar = new C1301f(str);
            bVar.mo6290e();
        }
        C1302g gVar = bVar;
        if (g0Var.m23156w()) {
            long d = gVar.mo6291d() - g0Var.m23166m();
            long o = g0Var.m23164o();
            if (d < 1000) {
                d = 0;
            }
            gVar = new C1302g(gVar, o, d);
        }
        if (g0Var.m23167l()) {
            fVar = new C2053d();
        } else {
            C4868i.C4889t p = g0Var.m23163p();
            if (p == null) {
                p = new C4868i.C4889t();
            }
            long j = p.f16718c;
            int i2 = p.f16717b;
            if (i2 == 0) {
                i2 = 29;
            }
            int K0 = C7389v0.m16717K0();
            if (K0 > 0 && (i = (vVar = p.f16716a).f16719a) > K0) {
                float f = K0 / i;
                int i3 = (int) (i * f);
                int i4 = i3 - (i3 % 2);
                p = p.m24491a(new C4868i.C4891v(i4, ((int) (vVar.f16720b * f)) - (i4 % 2)));
            }
            if (j == Long.MIN_VALUE && (n = gVar.mo6281n(EnumC7313d.VIDEO)) != null) {
                C4868i.C4891v d2 = p.m24488d(n.getInteger("width"), n.getInteger("height"));
                i2 = p.m24489c(n.getInteger("frame-rate"));
                j = p.m24490b(d2, i2, p.f16718c);
            }
            C4868i.C4891v vVar2 = p.f16716a;
            fVar = C2049c.m35757b(vVar2.f16720b, vVar2.f16719a).m35749c(i2).m35751a(j).m35750b();
        }
        int n2 = g0Var.m23165n();
        File file = new File(str2);
        C6806c.C6808b f2 = C6803a.m18991b(str2).m18960a(gVar).m18955f(fVar);
        if (g0Var.m23157v()) {
            fVar2 = new C2054e();
        } else if (g0Var.m23167l() || C4868i.m24726c2().m24663k1(256L)) {
            fVar2 = new C2053d();
        } else {
            fVar2 = new C2044a.C2046b().m35767e(44100).m35771a(62000L).m35769c(2).m35770b();
        }
        cVar.f17575j = f2.m18958c(fVar2).m18956e(n2).m18957d(new C5342b(dVar, file, runnable, g0Var, cVar, runnable2, jVar)).m18954g();
    }

    public final boolean m23191k(String str, String str2, C5349g0 g0Var, AtomicBoolean atomicBoolean, AbstractC5920l lVar) {
        C5373y yVar = new C5373y(str);
        if (g0Var.m23156w()) {
            return yVar.m23058e(str2, g0Var.m23157v(), g0Var.m23165n(), g0Var.m23164o() / 1000000.0d, g0Var.m23166m() / 1000000.0d, lVar, atomicBoolean);
        }
        return yVar.m23057f(str2, g0Var.m23157v(), g0Var.m23165n(), lVar, atomicBoolean);
    }

    public C5343c m23189m(String str) {
        return this.f17553c.get(str);
    }

    public C5345e m23188n() {
        return this.f17552b;
    }

    public final void m23182t(final C5349g0 g0Var, final C5343c cVar) {
        final long d = g0Var.m23227d();
        final String f = g0Var.m23225f();
        final String c = g0Var.m23228c();
        boolean z = false;
        cVar.f17566a.set(false);
        if (g0Var.m23156w() || g0Var.m23157v() || g0Var.m23165n() != 0) {
            cVar.m23171j(0L);
            try {
                z = m23191k(f, c, g0Var, cVar.f17568c, null);
            } catch (Throwable th) {
                Log.m14712w(Log.TAG_VIDEO, "Cannot trim video", th, new Object[0]);
            }
            synchronized (cVar) {
                if (!cVar.f17566a.getAndSet(true)) {
                    if (z) {
                        this.f17551a.m2429h5().m23136K(g0Var);
                    } else {
                        this.f17551a.m2429h5().m23138I(g0Var, -1, C4403w.m27869i1(R.string.SendVideoError));
                    }
                    this.f17553c.remove(c);
                }
            }
            return;
        }
        cVar.m23171j((int) m23190l(f, true));
        this.f17551a.m2429h5().m23124W().execute(new Runnable() {
            @Override
            public final void run() {
                C5340e0.this.m23183s(f, d, c, cVar, g0Var);
            }
        });
    }

    public final void m23181u(C5349g0 g0Var) {
        C5343c cVar = new C5343c(g0Var.f17516a);
        this.f17553c.put(g0Var.m23228c(), cVar);
        m23193i(g0Var, cVar);
    }
}
