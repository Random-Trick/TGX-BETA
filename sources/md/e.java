package md;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import ce.a0;
import de.n9;
import de.z20;
import hd.t2;
import ib.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.d;
import md.o;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.loader.gif.GifBridge;
import vd.o0;
import vd.p0;
import zd.o6;
import zd.ya;

public class e implements o.a, o0.d {
    public static int f17403j0;
    public static d<e> f17404k0;
    public static List<j> f17405l0;
    public o N;
    public final int[] O;
    public final double[] P;
    public final p Q;
    public final boolean R;
    public final Client.g T;
    public final Client.g U;
    public final boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile boolean Z;
    public volatile int f17406a;
    public float f17407a0;
    public volatile long f17408b;
    public final j f17410c;
    public volatile int f17411c0;
    public volatile long f17412d0;
    public long f17413e0;
    public double f17414f0;
    public File f17415g0;
    public int f17416h0;
    public boolean f17417i0;
    public final Object M = new Object();
    public int S = 0;
    public final Object f17409b0 = new Object();
    public final double V = 30.0d;

    public class a implements Client.g {
        public final j f17418a;

        public a(j jVar) {
            this.f17418a = jVar;
        }

        @Override
        public void r2(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.e((int) Log.TAG_GIF_LOADER, "GetFileRemote failed: %s", t2.z5(object));
            } else if (constructor == 766337656) {
                TdApi.File file = (TdApi.File) object;
                ob.e.v(file, this.f17418a.d());
                if (file.local.isDownloadingCompleted) {
                    e.this.t();
                    return;
                }
                e.this.f17406a |= 2;
                if (!file.local.isDownloadingActive) {
                    this.f17418a.N().v4().o(new TdApi.DownloadFile(file.f19913id, 1, 0, 0, false), e.this.U);
                }
            }
        }
    }

    public e(final j jVar, p pVar) {
        boolean z10 = false;
        this.W = jVar.o();
        jVar.M(0);
        jVar.w();
        this.R = jVar.h() == 3 ? true : z10;
        this.O = new int[4];
        this.P = new double[3];
        this.Q = pVar;
        this.f17410c = jVar;
        this.Y = w(jVar);
        this.T = new a(jVar);
        this.U = new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                e.this.A(jVar, object);
            }
        };
        if (jVar.p()) {
            this.X = ya.o1().w2().Z();
            ya.o1().w2().p(this);
        }
        m(this);
    }

    public void A(j jVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e((int) Log.TAG_GIF_LOADER, "DownloadFile failed: %s", t2.z5(object));
        } else if (constructor == 766337656) {
            TdApi.File file = (TdApi.File) object;
            ob.e.v(file, jVar.d());
            TdApi.LocalFile localFile = file.local;
            if (localFile.isDownloadingCompleted) {
                t();
            } else if (!localFile.isDownloadingActive) {
                Log.e((int) Log.TAG_GIF_LOADER, "DownloadFile ignored: %s", file);
            }
        }
    }

    public void B(o oVar, o.b bVar, long j10) {
        synchronized (this.f17409b0) {
            if (this.f17408b != 0) {
                long j11 = this.f17408b;
                String path = this.f17415g0.getPath();
                Bitmap e10 = oVar.e(false);
                Bitmap bitmap = bVar.f17468a;
                this.f17410c.w();
                int createLottieCache = N.createLottieCache(j11, path, e10, bitmap, true, true);
                if (createLottieCache == 0) {
                    long u10 = this.f17413e0 - u();
                    this.f17412d0 = u10;
                    bVar.f17469b = u10;
                    this.S = 2;
                    if (u10 != j10) {
                        synchronized (this.f17409b0) {
                            if (this.f17408b != 0) {
                                long j12 = this.f17408b;
                                Bitmap bitmap2 = bVar.f17468a;
                                this.f17412d0 = j10;
                                bVar.f17469b = j10;
                                N.getLottieFrame(j12, bitmap2, j10);
                            } else {
                                return;
                            }
                        }
                    }
                    oVar.a(bVar);
                    GifBridge.f().i(this);
                    return;
                }
                oVar.b(bVar);
            }
        }
    }

    public boolean C(o.b bVar) {
        if (this.R) {
            long j10 = (this.f17410c.v() || this.f17410c.m()) ? this.f17413e0 - 1 : 0L;
            synchronized (this.f17409b0) {
                if (this.f17408b != 0) {
                    long j11 = this.f17408b;
                    Bitmap bitmap = bVar.f17468a;
                    this.f17412d0 = j10;
                    if (N.getLottieFrame(j11, bitmap, j10)) {
                        bVar.f17469b = j10;
                        return true;
                    }
                }
                return false;
            }
        }
        int videoFrame = N.getVideoFrame(this.f17408b, bVar.f17468a, this.O);
        int i10 = this.O[3];
        this.f17411c0 = i10;
        bVar.f17469b = i10;
        return videoFrame == 1 && !N.isVideoBroken(this.f17408b);
    }

    public static void K(e eVar) {
        if (f17404k0 == null) {
            synchronized (e.class) {
                if (f17404k0 == null) {
                    return;
                }
            }
        }
        f17404k0.remove(eVar);
    }

    public static void L(j jVar) {
        if (!jVar.q() && !jVar.p() && !jVar.n()) {
            if (f17404k0 == null) {
                synchronized (e.class) {
                    if (f17404k0 == null) {
                        return;
                    }
                }
            }
            String jVar2 = jVar.toString();
            Iterator<e> it = f17404k0.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next.f17410c.toString().equals(jVar2)) {
                    next.N();
                }
            }
        }
    }

    public static void m(e eVar) {
        if (f17404k0 == null) {
            synchronized (e.class) {
                if (f17404k0 == null) {
                    f17404k0 = new d<>(true);
                }
            }
        }
        f17404k0.add(eVar);
    }

    public static void n(int i10) {
        synchronized (e.class) {
            int i11 = f17403j0;
            boolean z10 = true;
            boolean z11 = i11 != 0;
            int i12 = i11 + i10;
            f17403j0 = i12;
            if (i12 == 0) {
                z10 = false;
            }
            if (z11 != z10) {
                r();
            }
        }
    }

    public static void o(j jVar, boolean z10) {
        boolean z11;
        synchronized (e.class) {
            int i10 = 1;
            if (z10) {
                if (f17405l0 == null) {
                    f17405l0 = new ArrayList();
                }
                z11 = !y(f17405l0, jVar);
                f17405l0.add(jVar);
            } else {
                List<j> list = f17405l0;
                if (list != null) {
                    z11 = list.remove(jVar);
                } else {
                    return;
                }
            }
            if (z11) {
                int i11 = f17403j0;
                if (!z10) {
                    i10 = -1;
                }
                f17403j0 = i11 + i10;
                r();
            }
        }
    }

    public static void r() {
        d<e> dVar = f17404k0;
        if (dVar != null) {
            Iterator<e> it = dVar.iterator();
            while (it.hasNext()) {
                e next = it.next();
                next.O(x(next.f17410c));
            }
        }
    }

    public static boolean w(j jVar) {
        boolean x10;
        synchronized (e.class) {
            x10 = x(jVar);
        }
        return x10;
    }

    public static boolean x(j jVar) {
        return jVar.q() || (f17403j0 != 0 && !y(f17405l0, jVar));
    }

    public static boolean y(List<j> list, j jVar) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(jVar);
    }

    public void z() {
        if (!v()) {
            G(this.f17410c.d());
        }
    }

    public void D() {
        synchronized (this) {
            if ((this.f17406a & 4) != 0) {
                this.f17406a &= -5;
                H(false);
            }
        }
    }

    public void E() {
        s();
        j jVar = this.f17410c;
        if (jVar != null && jVar.p()) {
            ya.o1().w2().Q0(this);
        }
        synchronized (this.M) {
            o oVar = this.N;
            if (oVar != null) {
                oVar.p();
                this.N = null;
            }
        }
        K(this);
    }

    @Override
    public void E2(int i10) {
        p0.b(this, i10);
    }

    public void F(o oVar) {
        synchronized (this.M) {
            this.N = oVar;
        }
        if (!this.Y) {
            this.Q.j(this);
            M(false);
            return;
        }
        GifBridge.f().c(this.f17410c, oVar);
    }

    public void G(TdApi.File file) {
        synchronized (this) {
            this.f17406a &= -3;
        }
        ob.e.v(file, this.f17410c.d());
        if ((this.f17406a & 1) == 0) {
            this.Q.l(this, file.local.path);
        }
    }

    public void H(boolean z10) {
        o oVar;
        synchronized (this) {
            if ((this.f17406a & 1) == 0 && (oVar = this.N) != null) {
                if (oVar.j()) {
                    GifBridge.f().c(this.f17410c, this.N);
                } else if (z10) {
                    this.f17406a |= 4;
                }
            }
        }
    }

    public void I() {
        throw new UnsupportedOperationException("Method not decompiled: md.e.I():void");
    }

    public void J() {
        if (this.N != null && N.seekVideoToStart(this.f17408b)) {
            I();
        }
    }

    public final void M(boolean z10) {
        int i10;
        int i11;
        o oVar;
        int i12 = 0;
        if (this.R) {
            i11 = Math.max(5, (int) ((1000.0d / Math.min(this.V, this.f17414f0)) - 17.0d));
            i10 = 0;
        } else {
            int i13 = this.f17411c0;
            int[] iArr = this.O;
            if (iArr[3] < i13) {
                i13 = 0;
            }
            int i14 = iArr[3] - i13 != 0 ? iArr[3] - i13 : 50;
            i10 = iArr[3];
            i11 = Math.max(5, i14 - 17);
        }
        synchronized (this) {
            if ((this.f17406a & 1) == 0) {
                GifBridge f10 = GifBridge.f();
                int e10 = this.f17410c.e();
                if (!z10) {
                    i12 = i11;
                }
                if (f10.q(this, e10, i12, z10) && ((oVar = this.N) == null || !oVar.m())) {
                    this.f17411c0 = i10;
                }
            }
        }
    }

    public void N() {
        if (!this.Z && this.f17411c0 != 0) {
            this.Z = true;
            c();
        }
    }

    public final void O(boolean z10) {
        if (this.Y != z10) {
            this.Y = z10;
            if (!z10) {
                c();
            }
        }
    }

    public void P(String str) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        synchronized (this) {
            if (!v()) {
                if (this.R) {
                    String b12 = v0.b1(str);
                    if (!i.i(b12)) {
                        this.f17408b = N.createLottieDecoder(str, b12, this.P, this.f17410c.g());
                        long j10 = (long) this.P[0];
                        this.f17413e0 = j10;
                        this.f17410c.K(j10);
                        double[] dArr = this.P;
                        this.f17414f0 = dArr[1];
                        double d10 = dArr[2];
                        if (this.f17410c.w()) {
                            i15 = Math.max(n9.Xf(), z20.bf());
                            i14 = 160;
                        } else {
                            i15 = a0.i(190.0f);
                            i14 = 384;
                        }
                        i10 = Math.min(i15, i14);
                        long j11 = this.f17413e0;
                        boolean z12 = j11 <= 0 || this.f17414f0 <= 0.0d || d10 <= 0.0d;
                        if (j11 == 1) {
                            this.f17410c.D(true);
                        }
                        z10 = z12;
                        i11 = i10;
                    } else {
                        return;
                    }
                } else {
                    this.f17408b = N.createDecoder(str, this.O);
                    int[] iArr = this.O;
                    i11 = iArr[0];
                    int i16 = iArr[1];
                    z10 = i11 <= 0 || i16 <= 0;
                    i10 = i16;
                }
                if (z10) {
                    s();
                }
                if (this.f17408b != 0) {
                    if (!this.R) {
                        MediaMetadataRetriever mediaMetadataRetriever = null;
                        try {
                            mediaMetadataRetriever = v0.p2(str);
                            i12 = i.s(mediaMetadataRetriever.extractMetadata(24));
                        } catch (Throwable unused) {
                            i12 = 0;
                        }
                        v0.H(mediaMetadataRetriever);
                    } else {
                        i12 = 0;
                    }
                    if (this.f17410c.q()) {
                        i13 = 1;
                    } else {
                        i13 = this.R ? 2 : 3;
                    }
                    o oVar = new o(i11, i10, i12, this, i13);
                    oVar.s(this.X);
                    try {
                        z11 = oVar.l(new o.c() {
                            @Override
                            public final boolean a(o.b bVar) {
                                boolean C;
                                C = e.this.C(bVar);
                                return C;
                            }
                        }, 1, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError e10) {
                        Log.w(Log.TAG_GIF_LOADER, "Cannot start decoding gif", e10, new Object[0]);
                        z11 = false;
                    }
                    if (!z11) {
                        oVar.p();
                        s();
                        return;
                    }
                    if (this.X) {
                        this.f17411c0 = 0;
                    }
                    GifBridge.f().l(this.f17410c, oVar);
                }
            }
        }
    }

    public void Q(s sVar) {
        if (this.f17407a0 == 0.0f || (this.f17406a & 2) == 0) {
            o oVar = this.N;
            if (oVar != null) {
                sVar.c(this.f17410c, oVar);
                return;
            }
            return;
        }
        sVar.d(this.f17410c, this.f17407a0);
    }

    @Override
    public void a(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: md.e.a(long):void");
    }

    @Override
    public boolean b() {
        if (!this.f17417i0 || this.f17410c.m()) {
            return false;
        }
        this.f17417i0 = false;
        return true;
    }

    @Override
    public void c() {
        synchronized (this) {
            if ((this.f17406a & 1) == 0) {
                if (this.Z && this.f17411c0 == 0) {
                    this.Z = false;
                }
                if (this.Y && !this.Z) {
                    return;
                }
                if (this.W && this.f17410c.m()) {
                    this.f17417i0 = true;
                } else if (this.X) {
                    if (ya.o1().w2().Y(this.f17410c.c(), this.f17410c.i())) {
                        this.Q.k(this);
                        if (this.f17411c0 != 0) {
                            M(true);
                        }
                    }
                } else if (GifBridge.f().b(this, this.f17410c.e())) {
                    this.Q.j(this);
                    M(false);
                }
            }
        }
    }

    @Override
    public void e5(o6 o6Var, TdApi.Message message, int i10, int i11, float f10, boolean z10) {
        boolean z11 = true;
        boolean z12 = i11 != 0;
        if (this.X != z12 || z12) {
            this.X = z12;
            o oVar = this.N;
            if (oVar != null) {
                if (!this.X || this.f17411c0 != 0) {
                    z11 = false;
                }
                oVar.s(z11);
            }
            c();
        }
    }

    @Override
    public void g0(o6 o6Var, TdApi.Message message) {
        p0.a(this, o6Var, message);
    }

    public void l() {
        TdApi.File d10 = this.f17410c.d();
        if (t2.V2(d10)) {
            G(d10);
            return;
        }
        this.f17406a |= 2;
        this.f17410c.N().v4().o(new TdApi.DownloadFile(d10.f19913id, 1, 0, 0, false), this.U);
    }

    public void p(float f10) {
        if (f10 != 0.0f) {
            this.f17407a0 = f10;
        }
    }

    public void q() {
        synchronized (this) {
            this.f17406a |= 1;
            if ((this.f17406a & 2) != 0) {
                this.f17410c.N().v4().o(new TdApi.CancelDownloadFile(this.f17410c.e(), false), this.U);
                this.f17406a &= -3;
            } else {
                this.Q.i(this);
            }
        }
    }

    public final void s() {
        if (this.f17408b == 0) {
            return;
        }
        if (this.R) {
            N.cancelLottieDecoder(this.f17408b);
            synchronized (this.f17409b0) {
                N.destroyLottieDecoder(this.f17408b);
                this.f17408b = 0L;
            }
            if (this.f17415g0 != null) {
                y n10 = y.n();
                j jVar = this.f17410c;
                n10.f(jVar, this.f17415g0, jVar.w(), this.f17416h0, this.f17410c.g());
                return;
            }
            return;
        }
        N.destroyDecoder(this.f17408b);
        this.f17408b = 0L;
    }

    public final void t() {
        GifBridge.f().e().e(new Runnable() {
            @Override
            public final void run() {
                e.this.z();
            }
        }, 0L);
    }

    public final long u() {
        return Math.max(1L, (long) (this.f17414f0 / this.V));
    }

    public final boolean v() {
        return (this.f17406a & 1) != 0;
    }
}
