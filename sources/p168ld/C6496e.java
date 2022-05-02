package p168ld;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import be.C1357a0;
import gd.C4779t2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.gif.GifBridge;
import p038ce.C2746n9;
import p038ce.y20;
import p108hb.C5070i;
import p154kb.C6227d;
import p168ld.C6509o;
import p193nb.C7321e;
import p292ud.C9773p0;
import p292ud.C9781q0;
import p350yd.C10536ab;
import p350yd.C10930q6;

public class C6496e implements C6509o.AbstractC6510a, C9773p0.AbstractC9777d {
    public static int f20215j0;
    public static C6227d<C6496e> f20216k0;
    public static List<C6503j> f20217l0;
    public C6509o f20219N;
    public final int[] f20220O;
    public final double[] f20221P;
    public final C6513p f20222Q;
    public final boolean f20223R;
    public final Client.AbstractC7865g f20225T;
    public final Client.AbstractC7865g f20226U;
    public final boolean f20228W;
    public volatile boolean f20229X;
    public volatile boolean f20230Y;
    public volatile boolean f20231Z;
    public volatile int f20232a;
    public float f20233a0;
    public volatile long f20234b;
    public final C6503j f20236c;
    public volatile int f20237c0;
    public volatile long f20238d0;
    public long f20239e0;
    public double f20240f0;
    public File f20241g0;
    public int f20242h0;
    public boolean f20243i0;
    public final Object f20218M = new Object();
    public int f20224S = 0;
    public final Object f20235b0 = new Object();
    public final double f20227V = 30.0d;

    public class C6497a implements Client.AbstractC7865g {
        public final C6503j f20244a;

        public C6497a(C6503j jVar) {
            this.f20244a = jVar;
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.m14727e((int) Log.TAG_GIF_LOADER, "GetFileRemote failed: %s", C4779t2.m25378z5(object));
            } else if (constructor == 766337656) {
                TdApi.File file = (TdApi.File) object;
                C7321e.m16907u(file, this.f20244a.m20287d());
                if (file.local.isDownloadingCompleted) {
                    C6496e.this.m20320t();
                    return;
                }
                C6496e.this.f20232a |= 2;
                if (!file.local.isDownloadingActive) {
                    this.f20244a.m20292N().m2270r4().m14783o(new TdApi.DownloadFile(file.f25373id, 1, 0, 0, false), C6496e.this.f20226U);
                }
            }
        }
    }

    public C6496e(final C6503j jVar, C6513p pVar) {
        boolean z = false;
        this.f20228W = jVar.m20276o();
        jVar.m20293M(0);
        jVar.m20269w();
        this.f20223R = jVar.m20283h() == 3 ? true : z;
        this.f20220O = new int[4];
        this.f20221P = new double[3];
        this.f20222Q = pVar;
        this.f20236c = jVar;
        this.f20230Y = m20317w(jVar);
        this.f20225T = new C6497a(jVar);
        this.f20226U = new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C6496e.this.m20353A(jVar, object);
            }
        };
        if (jVar.m20275p()) {
            this.f20229X = C10536ab.m4667o1().m4636w2().m7070Z();
            C10536ab.m4667o1().m4636w2().m7030p(this);
        }
        m20327m(this);
    }

    public void m20353A(C6503j jVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14727e((int) Log.TAG_GIF_LOADER, "DownloadFile failed: %s", C4779t2.m25378z5(object));
        } else if (constructor == 766337656) {
            TdApi.File file = (TdApi.File) object;
            C7321e.m16907u(file, jVar.m20287d());
            TdApi.LocalFile localFile = file.local;
            if (localFile.isDownloadingCompleted) {
                m20320t();
            } else if (!localFile.isDownloadingActive) {
                Log.m14727e((int) Log.TAG_GIF_LOADER, "DownloadFile ignored: %s", file);
            }
        }
    }

    public void m20352B(C6509o oVar, C6509o.C6511b bVar, long j) {
        synchronized (this.f20235b0) {
            if (this.f20234b != 0) {
                long j2 = this.f20234b;
                String path = this.f20241g0.getPath();
                Bitmap e = oVar.m20216e(false);
                Bitmap bitmap = bVar.f20308a;
                this.f20236c.m20269w();
                int createLottieCache = C7888N.createLottieCache(j2, path, e, bitmap, true, true);
                if (createLottieCache == 0) {
                    long u = this.f20239e0 - m20319u();
                    this.f20238d0 = u;
                    bVar.f20309b = u;
                    this.f20224S = 2;
                    if (u != j) {
                        synchronized (this.f20235b0) {
                            if (this.f20234b != 0) {
                                long j3 = this.f20234b;
                                Bitmap bitmap2 = bVar.f20308a;
                                this.f20238d0 = j;
                                bVar.f20309b = j;
                                C7888N.getLottieFrame(j3, bitmap2, j);
                            } else {
                                return;
                            }
                        }
                    }
                    oVar.m20220a(bVar);
                    GifBridge.m14341f().m14338i(this);
                    return;
                }
                oVar.m20219b(bVar);
            }
        }
    }

    public boolean m20351C(C6509o.C6511b bVar) {
        if (this.f20223R) {
            long j = (this.f20236c.m20270v() || this.f20236c.m20278m()) ? this.f20239e0 - 1 : 0L;
            synchronized (this.f20235b0) {
                if (this.f20234b != 0) {
                    long j2 = this.f20234b;
                    Bitmap bitmap = bVar.f20308a;
                    this.f20238d0 = j;
                    if (C7888N.getLottieFrame(j2, bitmap, j)) {
                        bVar.f20309b = j;
                        return true;
                    }
                }
                return false;
            }
        }
        int videoFrame = C7888N.getVideoFrame(this.f20234b, bVar.f20308a, this.f20220O);
        int i = this.f20220O[3];
        this.f20237c0 = i;
        bVar.f20309b = i;
        return videoFrame == 1 && !C7888N.isVideoBroken(this.f20234b);
    }

    public static void m20343K(C6496e eVar) {
        if (f20216k0 == null) {
            synchronized (C6496e.class) {
                if (f20216k0 == null) {
                    return;
                }
            }
        }
        f20216k0.remove(eVar);
    }

    public static void m20342L(C6503j jVar) {
        if (!jVar.m20274q() && !jVar.m20275p() && !jVar.m20277n()) {
            if (f20216k0 == null) {
                synchronized (C6496e.class) {
                    if (f20216k0 == null) {
                        return;
                    }
                }
            }
            String jVar2 = jVar.toString();
            Iterator<C6496e> it = f20216k0.iterator();
            while (it.hasNext()) {
                C6496e next = it.next();
                if (next.f20236c.toString().equals(jVar2)) {
                    next.m20340N();
                }
            }
        }
    }

    public static void m20327m(C6496e eVar) {
        if (f20216k0 == null) {
            synchronized (C6496e.class) {
                if (f20216k0 == null) {
                    f20216k0 = new C6227d<>(true);
                }
            }
        }
        f20216k0.add(eVar);
    }

    public static void m20326n(int i) {
        synchronized (C6496e.class) {
            int i2 = f20215j0;
            boolean z = true;
            boolean z2 = i2 != 0;
            int i3 = i2 + i;
            f20215j0 = i3;
            if (i3 == 0) {
                z = false;
            }
            if (z2 != z) {
                m20322r();
            }
        }
    }

    public static void m20325o(C6503j jVar, boolean z) {
        boolean z2;
        synchronized (C6496e.class) {
            int i = 1;
            if (z) {
                if (f20217l0 == null) {
                    f20217l0 = new ArrayList();
                }
                z2 = !m20315y(f20217l0, jVar);
                f20217l0.add(jVar);
            } else {
                List<C6503j> list = f20217l0;
                if (list != null) {
                    z2 = list.remove(jVar);
                } else {
                    return;
                }
            }
            if (z2) {
                int i2 = f20215j0;
                if (!z) {
                    i = -1;
                }
                f20215j0 = i2 + i;
                m20322r();
            }
        }
    }

    public static void m20322r() {
        C6227d<C6496e> dVar = f20216k0;
        if (dVar != null) {
            Iterator<C6496e> it = dVar.iterator();
            while (it.hasNext()) {
                C6496e next = it.next();
                next.m20339O(m20316x(next.f20236c));
            }
        }
    }

    public static boolean m20317w(C6503j jVar) {
        boolean x;
        synchronized (C6496e.class) {
            x = m20316x(jVar);
        }
        return x;
    }

    public static boolean m20316x(C6503j jVar) {
        return jVar.m20274q() || (f20215j0 != 0 && !m20315y(f20217l0, jVar));
    }

    public static boolean m20315y(List<C6503j> list, C6503j jVar) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(jVar);
    }

    public void m20314z() {
        if (!m20318v()) {
            m20347G(this.f20236c.m20287d());
        }
    }

    public void m20350D() {
        synchronized (this) {
            if ((this.f20232a & 4) != 0) {
                this.f20232a &= -5;
                m20346H(false);
            }
        }
    }

    public void m20349E() {
        m20321s();
        C6503j jVar = this.f20236c;
        if (jVar != null && jVar.m20275p()) {
            C10536ab.m4667o1().m4636w2().m7087Q0(this);
        }
        synchronized (this.f20218M) {
            C6509o oVar = this.f20219N;
            if (oVar != null) {
                oVar.m20205p();
                this.f20219N = null;
            }
        }
        m20343K(this);
    }

    public void m20348F(C6509o oVar) {
        synchronized (this.f20218M) {
            this.f20219N = oVar;
        }
        if (!this.f20230Y) {
            this.f20222Q.m20190j(this);
            m20341M(false);
            return;
        }
        GifBridge.m14341f().m14344c(this.f20236c, oVar);
    }

    public void m20347G(TdApi.File file) {
        synchronized (this) {
            this.f20232a &= -3;
        }
        C7321e.m16907u(file, this.f20236c.m20287d());
        if ((this.f20232a & 1) == 0) {
            this.f20222Q.m20188l(this, file.local.path);
        }
    }

    public void m20346H(boolean z) {
        C6509o oVar;
        synchronized (this) {
            if ((this.f20232a & 1) == 0 && (oVar = this.f20219N) != null) {
                if (oVar.m20211j()) {
                    GifBridge.m14341f().m14344c(this.f20236c, this.f20219N);
                } else if (z) {
                    this.f20232a |= 4;
                }
            }
        }
    }

    public void m20345I() {
        throw new UnsupportedOperationException("Method not decompiled: p168ld.C6496e.m20345I():void");
    }

    public void m20344J() {
        if (this.f20219N != null && C7888N.seekVideoToStart(this.f20234b)) {
            m20345I();
        }
    }

    public final void m20341M(boolean z) {
        int i;
        int i2;
        C6509o oVar;
        int i3 = 0;
        if (this.f20223R) {
            i2 = Math.max(5, (int) ((1000.0d / Math.min(this.f20227V, this.f20240f0)) - 17.0d));
            i = 0;
        } else {
            int i4 = this.f20237c0;
            int[] iArr = this.f20220O;
            if (iArr[3] < i4) {
                i4 = 0;
            }
            int i5 = iArr[3] - i4 != 0 ? iArr[3] - i4 : 50;
            i = iArr[3];
            i2 = Math.max(5, i5 - 17);
        }
        synchronized (this) {
            if ((this.f20232a & 1) == 0) {
                GifBridge f = GifBridge.m14341f();
                int e = this.f20236c.m20286e();
                if (!z) {
                    i3 = i2;
                }
                if (f.m14330q(this, e, i3, z) && ((oVar = this.f20219N) == null || !oVar.m20208m())) {
                    this.f20237c0 = i;
                }
            }
        }
    }

    public void m20340N() {
        if (!this.f20231Z && this.f20237c0 != 0) {
            this.f20231Z = true;
            mo20197c();
        }
    }

    @Override
    public void mo6985N2(int i) {
        C9781q0.m6970b(this, i);
    }

    public final void m20339O(boolean z) {
        if (this.f20230Y != z) {
            this.f20230Y = z;
            if (!z) {
                mo20197c();
            }
        }
    }

    public void m20338P(String str) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        synchronized (this) {
            if (!m20318v()) {
                if (this.f20223R) {
                    String b1 = C7389v0.m16652b1(str);
                    if (!C5070i.m24061i(b1)) {
                        this.f20234b = C7888N.createLottieDecoder(str, b1, this.f20221P, this.f20236c.m20284g());
                        long j = (long) this.f20221P[0];
                        this.f20239e0 = j;
                        this.f20236c.m20295K(j);
                        double[] dArr = this.f20221P;
                        this.f20240f0 = dArr[1];
                        double d = dArr[2];
                        if (this.f20236c.m20269w()) {
                            i6 = Math.max(C2746n9.m33693Xf(), y20.m30835bf());
                            i5 = 160;
                        } else {
                            i6 = C1357a0.m37541i(190.0f);
                            i5 = 384;
                        }
                        i = Math.min(i6, i5);
                        long j2 = this.f20239e0;
                        boolean z3 = j2 <= 0 || this.f20240f0 <= 0.0d || d <= 0.0d;
                        if (j2 == 1) {
                            this.f20236c.m20302D(true);
                        }
                        z = z3;
                        i2 = i;
                    } else {
                        return;
                    }
                } else {
                    this.f20234b = C7888N.createDecoder(str, this.f20220O);
                    int[] iArr = this.f20220O;
                    i2 = iArr[0];
                    int i7 = iArr[1];
                    z = i2 <= 0 || i7 <= 0;
                    i = i7;
                }
                if (z) {
                    m20321s();
                }
                if (this.f20234b != 0) {
                    if (Build.VERSION.SDK_INT < 17 || this.f20223R) {
                        i3 = 0;
                    } else {
                        MediaMetadataRetriever mediaMetadataRetriever = null;
                        try {
                            mediaMetadataRetriever = C7389v0.m16595p2(str);
                            i3 = C5070i.m24051s(mediaMetadataRetriever.extractMetadata(24));
                        } catch (Throwable unused) {
                            i3 = 0;
                        }
                        C7389v0.m16730H(mediaMetadataRetriever);
                    }
                    if (this.f20236c.m20274q()) {
                        i4 = 1;
                    } else {
                        i4 = this.f20223R ? 2 : 3;
                    }
                    C6509o oVar = new C6509o(i2, i, i3, this, i4);
                    oVar.m20202s(this.f20229X);
                    try {
                        z2 = oVar.m20209l(new C6509o.AbstractC6512c() {
                            @Override
                            public final boolean mo20192a(C6509o.C6511b bVar) {
                                boolean C;
                                C = C6496e.this.m20351C(bVar);
                                return C;
                            }
                        }, 1, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError e) {
                        Log.m14712w(Log.TAG_GIF_LOADER, "Cannot start decoding gif", e, new Object[0]);
                        z2 = false;
                    }
                    if (!z2) {
                        oVar.m20205p();
                        m20321s();
                        return;
                    }
                    if (this.f20229X) {
                        this.f20237c0 = 0;
                    }
                    GifBridge.m14341f().m14335l(this.f20236c, oVar);
                }
            }
        }
    }

    public void m20337Q(C6516s sVar) {
        if (this.f20233a0 == 0.0f || (this.f20232a & 2) == 0) {
            C6509o oVar = this.f20219N;
            if (oVar != null) {
                sVar.m20178c(this.f20236c, oVar);
                return;
            }
            return;
        }
        sVar.m20177d(this.f20236c, this.f20233a0);
    }

    @Override
    public void mo6984X(C10930q6 q6Var, TdApi.Message message) {
        C9781q0.m6971a(this, q6Var, message);
    }

    @Override
    public void mo6983Y1(C10930q6 q6Var, TdApi.Message message, int i, int i2, float f, boolean z) {
        boolean z2 = true;
        boolean z3 = i2 != 0;
        if (this.f20229X != z3 || z3) {
            this.f20229X = z3;
            C6509o oVar = this.f20219N;
            if (oVar != null) {
                if (!this.f20229X || this.f20237c0 != 0) {
                    z2 = false;
                }
                oVar.m20202s(z2);
            }
            mo20197c();
        }
    }

    @Override
    public void mo20199a(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: p168ld.C6496e.mo20199a(long):void");
    }

    @Override
    public boolean mo20198b() {
        if (!this.f20243i0 || this.f20236c.m20278m()) {
            return false;
        }
        this.f20243i0 = false;
        return true;
    }

    @Override
    public void mo20197c() {
        synchronized (this) {
            if ((this.f20232a & 1) == 0) {
                if (this.f20231Z && this.f20237c0 == 0) {
                    this.f20231Z = false;
                }
                if (this.f20230Y && !this.f20231Z) {
                    return;
                }
                if (this.f20228W && this.f20236c.m20278m()) {
                    this.f20243i0 = true;
                } else if (this.f20229X) {
                    if (C10536ab.m4667o1().m4636w2().m7072Y(this.f20236c.m20288c(), this.f20236c.m20282i())) {
                        this.f20222Q.m20189k(this);
                        if (this.f20237c0 != 0) {
                            m20341M(true);
                        }
                    }
                } else if (GifBridge.m14341f().m14345b(this, this.f20236c.m20286e())) {
                    this.f20222Q.m20190j(this);
                    m20341M(false);
                }
            }
        }
    }

    public void m20328l() {
        TdApi.File d = this.f20236c.m20287d();
        if (C4779t2.m25586V2(d)) {
            m20347G(d);
            return;
        }
        this.f20232a |= 2;
        this.f20236c.m20292N().m2270r4().m14783o(new TdApi.DownloadFile(d.f25373id, 1, 0, 0, false), this.f20226U);
    }

    public void m20324p(float f) {
        if (f != 0.0f) {
            this.f20233a0 = f;
        }
    }

    public void m20323q() {
        synchronized (this) {
            this.f20232a |= 1;
            if ((this.f20232a & 2) != 0) {
                this.f20236c.m20292N().m2270r4().m14783o(new TdApi.CancelDownloadFile(this.f20236c.m20286e(), false), this.f20226U);
                this.f20232a &= -3;
            } else {
                this.f20222Q.m20191i(this);
            }
        }
    }

    public final void m20321s() {
        if (this.f20234b == 0) {
            return;
        }
        if (this.f20223R) {
            C7888N.cancelLottieDecoder(this.f20234b);
            synchronized (this.f20235b0) {
                C7888N.destroyLottieDecoder(this.f20234b);
                this.f20234b = 0L;
            }
            if (this.f20241g0 != null) {
                C6522y n = C6522y.m20163n();
                C6503j jVar = this.f20236c;
                n.m20171f(jVar, this.f20241g0, jVar.m20269w(), this.f20242h0, this.f20236c.m20284g());
                return;
            }
            return;
        }
        C7888N.destroyDecoder(this.f20234b);
        this.f20234b = 0L;
    }

    public final void m20320t() {
        GifBridge.m14341f().m14342e().m28052e(new Runnable() {
            @Override
            public final void run() {
                C6496e.this.m20314z();
            }
        }, 0L);
    }

    public final long m20319u() {
        return Math.max(1L, (long) (this.f20240f0 / this.f20227V));
    }

    public final boolean m20318v() {
        return (this.f20232a & 1) != 0;
    }
}
