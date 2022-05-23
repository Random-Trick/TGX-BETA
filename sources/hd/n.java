package hd;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import ce.a0;
import ce.c0;
import ce.e0;
import ce.j0;
import ce.y;
import db.b;
import eb.k;
import gb.j;
import gd.w;
import ib.d;
import ib.i;
import ie.g0;
import ie.h0;
import ie.t;
import java.io.File;
import je.g;
import ld.h;
import ld.o;
import ld.s;
import ld.v;
import mb.p;
import ne.g1;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import vc.n4;
import vd.c;
import vd.o0;
import zd.hj;
import zd.o6;
import zd.r1;
import zd.ya;

public class n extends c implements g1.c, r1.a, o0.f {
    public TdApi.VoiceNote M;
    public g1 N;
    public boolean O;
    public boolean P;
    public long Q = -1;
    public long R = -1;
    public int S;
    public boolean T;
    public h U;
    public h V;
    public h W;
    public String X;
    public boolean Y;
    public String Z;
    public String f13276a0;
    public TdApi.Document f13277b;
    public n4 f13278b0;
    public TdApi.Audio f13279c;
    public g f13280c0;
    public g f13281d0;
    public float f13282e0;
    public final s4 f13283f0;
    public float f13284g0;
    public j f13285h0;
    public int f13286i0;
    public boolean f13287j0;
    public ViewParent f13288k0;
    public float f13289l0;
    public float f13290m0;
    public long f13291n0;
    public boolean f13292o0;
    public boolean f13293p0;
    public int f13294q0;
    public int f13295r0;

    public class a implements k.b {
        public a() {
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            n.this.f13284g0 = f10;
            n.this.f13283f0.u5();
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }
    }

    public n(s4 s4Var, TdApi.Document document) {
        this.f13283f0 = s4Var;
        boolean F3 = t2.F3(document);
        this.O = F3;
        if (F3) {
            TdApi.Audio B4 = t2.B4(document);
            b0(B4, null, null);
            if (B4.audio.size < p.f17345b.b(128.0d)) {
                this.N.A0();
                return;
            }
            return;
        }
        d0(document);
    }

    public static h F(h hVar, String str) {
        hVar.t0(a0.j(80.0f, 3.0f));
        hVar.Z(true);
        hVar.k0();
        hVar.s0(2);
        return hVar;
    }

    public static h H(o6 o6Var, TdApi.Document document) {
        if (e0.c(document.mimeType)) {
            h hVar = new h(o6Var, document.document);
            hVar.p0();
            return F(hVar, document.mimeType);
        } else if (e0.f(document.mimeType)) {
            return F(new s(o6Var, document.document), document.mimeType);
        } else {
            return null;
        }
    }

    public static int J() {
        return a0.i(25.0f) * 2;
    }

    public static int L() {
        return a0.i(12.0f);
    }

    public static int M() {
        return a0.i(25.0f) * 2;
    }

    public static String O(String str) {
        String a10 = e0.a(str);
        if (a10 == null) {
            return str;
        }
        return a10.toUpperCase() + " " + w.i1(R.string.File);
    }

    public boolean U(hj.k kVar, View view, int i10) {
        if (i10 == R.id.btn_messageApplyLocalization) {
            this.f13283f0.c().hd().C8(this.f13283f0.Q0(), kVar, this.f13283f0.X3());
        } else if (i10 == R.id.btn_open) {
            a0();
        }
        this.f13283f0.w8();
        return true;
    }

    public void V(final hj.k kVar) {
        this.f13283f0.Q0().ee(w.i1(R.string.LanguageWarning), new int[]{R.id.btn_messageApplyLocalization, R.id.btn_open}, new String[]{w.i1(R.string.LanguageInstall), w.i1(R.string.Open)}, null, new int[]{R.drawable.baseline_language_24, R.drawable.baseline_open_in_browser_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean U;
                U = n.this.U(kVar, view, i10);
                return U;
            }
        });
    }

    public void W() {
        j0.Z(this.f13283f0.Q0(), i.i(this.f13277b.fileName) ? null : this.f13277b.fileName, new File(this.f13277b.document.local.path), this.f13277b.mimeType, t2.t2(this.f13283f0.X3().interactionInfo));
    }

    public static String w(TdApi.File file, boolean z10, boolean z11) {
        return x(file, false, z10, z11);
    }

    public static String x(TdApi.File file, boolean z10, boolean z11, boolean z12) {
        TdApi.LocalFile localFile;
        TdApi.RemoteFile remoteFile;
        int i10;
        long j10;
        if (file == null || (localFile = file.local) == null || (remoteFile = file.remote) == null) {
            return null;
        }
        if ((!z10 && !localFile.isDownloadingActive && !z11) || (i10 = file.expectedSize) == 0) {
            return null;
        }
        if (z10) {
            j10 = i10;
        } else {
            j10 = remoteFile.isUploadingActive ? remoteFile.uploadedSize : localFile.downloadedSize;
        }
        return w.t0(j10, i10, z12);
    }

    public final void A(int i10) {
        g gVar;
        String str = this.X;
        if (str != null) {
            gVar = new g.b(str, i10, y.q0(), this.f13283f0.K4()).y(this.f13277b != null ? Log.TAG_VOICE : 0).v().b().f();
        } else {
            gVar = null;
        }
        this.f13280c0 = gVar;
        float f10 = this.f13282e0;
        h0(i10);
        if (this.f13282e0 != f10 && f10 != 0.0f) {
            this.f13283f0.a0(false);
        }
    }

    public void D() {
        this.f13287j0 = false;
    }

    @Override
    public boolean D0(int i10) {
        return T() || R();
    }

    public final h E() {
        TdApi.Thumbnail thumbnail;
        if (this.W == null) {
            if (this.f13277b != null) {
                this.W = H(this.f13283f0.c(), this.f13277b);
            } else {
                TdApi.Audio audio = this.f13279c;
                if (audio != null && t2.T2(audio.audio) && ((thumbnail = this.f13279c.albumCoverThumbnail) == null || this.V == null || Math.max(thumbnail.width, thumbnail.height) < 90)) {
                    o oVar = new o(this.f13279c.audio.local.path);
                    this.W = oVar;
                    oVar.t0(a0.j(80.0f, 2.0f));
                    this.W.s0(2);
                }
            }
        }
        return this.W;
    }

    public final void I() {
        ViewParent viewParent = this.f13288k0;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f13288k0 = null;
            this.f13292o0 = false;
            this.f13283f0.u5();
        }
    }

    public int K() {
        if (this.f13278b0 != null) {
            return -2;
        }
        return ((int) this.f13282e0) + M() + L();
    }

    public final int N() {
        g gVar = this.f13281d0;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final int P() {
        g gVar = this.f13280c0;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final void Q() {
        String z10 = z(null, true);
        this.Z = z10;
        this.f13276a0 = z(z10, false);
    }

    public boolean R() {
        return this.f13279c != null;
    }

    public boolean S() {
        return this.f13277b != null;
    }

    public boolean T() {
        return this.M != null;
    }

    public final void X() {
        int L = (this.f13286i0 - L()) - M();
        if (L > 0) {
            float f10 = this.f13282e0;
            h0(L);
            if (this.f13282e0 != f10 && f10 != 0.0f) {
                this.f13283f0.a0(false);
            }
        }
    }

    public final boolean Y() {
        return this.f13278b0 == null;
    }

    public void Z() {
        if (this.M != null) {
            if (this.f13284g0 == 1.0f) {
                if (!this.f13283f0.b5()) {
                    this.f13284g0 = 0.0f;
                } else {
                    new k(0, new a(), b.f7287b, 180L, this.f13284g0).i(0.0f);
                }
            }
            this.f13283f0.u5();
        }
    }

    @Override
    public void a(int i10) {
        this.f13286i0 = i10;
        n4 n4Var = this.f13278b0;
        if (n4Var != null) {
            n4Var.j(Math.min(a0.i(420.0f), (((Math.min(s4.r3(), i10) - (a0.i(25.0f) * 2)) - L()) - ((int) this.f13282e0)) - a0.i(12.0f)));
        }
        if (this.X != null || this.Z != null) {
            A(i10 - (M() + L()));
        }
    }

    public void a0() {
        if (this.f13277b != null) {
            this.N.U(this.f13283f0.Q0(), new Runnable() {
                @Override
                public final void run() {
                    n.this.W();
                }
            });
            this.f13283f0.w8();
        }
    }

    @Override
    public <T extends View & t> void b(T t10, Canvas canvas, int i10, int i11, v vVar, v vVar2, int i12, int i13, float f10, float f11) {
        int i14;
        int i15;
        float f12;
        this.f13294q0 = i10;
        this.f13295r0 = i11;
        int M = M();
        int i16 = i10 + M;
        int i17 = i11 + M;
        vVar.K0(i10, i11, i16, i17);
        float f13 = 1.0f;
        int i18 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i18 != 0) {
            canvas.save();
            float f14 = 1.0f - (0.1f * f11);
            canvas.scale(f14, f14, vVar.J0(), vVar.x0());
        }
        if (this.T) {
            vVar.V(vVar.getAlpha() * f10);
            vVar2.V(vVar2.getAlpha() * f10);
            i14 = i17;
            i15 = i16;
            ce.b.u(canvas, vVar, vVar2, true, true, i10, i11, i16, i14);
            vVar2.Q();
            vVar.Q();
        } else {
            i14 = i17;
            i15 = i16;
        }
        this.N.J0(f10);
        this.N.h0(i10, i11, i15, i14);
        this.N.o(t10, canvas);
        if (i18 != 0) {
            canvas.restore();
        }
        int i19 = i15;
        ce.b.z(canvas, vVar, f11, i13);
        if (this.f13278b0 == null) {
            int L = i19 + L();
            g gVar = this.f13280c0;
            if (gVar != null) {
                gVar.v(canvas, L, L + gVar.getWidth(), 0, i11 + a0.i(8.0f), null, f10);
            }
            g gVar2 = this.f13281d0;
            if (gVar2 != null) {
                gVar2.v(canvas, L, L + gVar2.getWidth(), 0, i11 + a0.i(29.0f), null, f10);
                return;
            }
            return;
        }
        if (this.f13283f0.I2() == 0) {
            f12 = 0.68f;
        } else if (!this.P) {
            if (this.f13283f0.P5()) {
                f13 = 0.0f;
            }
            f12 = f13;
        } else if (this.f13290m0 == -1.0f || (!this.f13292o0 && (this.f13291n0 == 0 || SystemClock.uptimeMillis() - this.f13291n0 >= 100))) {
            long j10 = this.Q;
            if (j10 > 0) {
                long j11 = this.R;
                if (j11 > 0) {
                    f12 = (float) (j11 / j10);
                }
            }
            f12 = 0.0f;
        } else {
            f12 = this.f13290m0;
        }
        int i20 = (a0.i(25.0f) * 2) + i10 + L();
        int i21 = a0.i(25.0f) + i11;
        this.f13278b0.f(canvas, f12, i20, i21);
        boolean g62 = this.f13283f0.g6();
        if (this.f13284g0 != 0.0f) {
            int i22 = a0.i(25.0f);
            a0.i(2.0f);
            double radians = Math.toRadians(45.0d);
            double d10 = i22;
            float i23 = a0.i(25.0f) + i10 + ((float) (d10 * Math.sin(radians))) + a0.i(22.0f);
            float cos = i21 + ((float) (d10 * Math.cos(radians)));
            float f15 = this.f13284g0;
            canvas.drawCircle(i23, cos, a0.i(3.0f) * f15, y.g(d.a(f15, ae.j.L(g62 ? R.id.theme_color_bubbleOut_waveformActive : R.id.theme_color_waveformActive))));
        }
        if (this.f13281d0 != null) {
            int L2 = i19 + L() + this.f13278b0.i() + a0.i(12.0f);
            g gVar3 = this.f13281d0;
            gVar3.v(canvas, L2, L2 + gVar3.getWidth(), 0, i11 + a0.i(18.0f), null, f10);
        }
    }

    public void b0(TdApi.Audio audio, TdApi.Message message, o0.c cVar) {
        this.f13279c = audio;
        String m22 = t2.m2(audio);
        this.X = m22;
        this.Y = g.M0(m22);
        Q();
        boolean z10 = audio.albumCoverThumbnail != null && (fd.a.f11900v || this.f13283f0.X3().viaBotUserId == 0);
        this.T = z10;
        if (z10) {
            if (audio.albumCoverMinithumbnail != null) {
                ld.i iVar = new ld.i(audio.albumCoverMinithumbnail);
                this.U = iVar;
                iVar.s0(2);
                this.U.Z(true);
            } else {
                this.U = null;
            }
            h D5 = t2.D5(this.f13283f0.c(), audio.albumCoverThumbnail);
            this.V = D5;
            if (D5 != null) {
                D5.Z(true);
                this.V.s0(2);
                this.V.k0();
            }
            if (t2.T2(audio.audio)) {
                E();
            }
        }
        g1 g1Var = new g1(this.f13283f0.t(), this.f13283f0.c(), 16, this.V != null, this.f13283f0.I2(), this.f13283f0.K3());
        this.N = g1Var;
        g1Var.f0(this.f13283f0);
        this.N.L0(this);
        if (this.T) {
            this.N.d0(1140850688);
        } else {
            this.N.e0(this.f13283f0.g6() ? R.id.theme_color_bubbleOut_file : R.id.theme_color_file);
        }
        g1 g1Var2 = this.N;
        if (message == null) {
            message = t2.D4(audio);
        }
        g1Var2.F0(message, cVar);
        j jVar = this.f13285h0;
        if (jVar != null) {
            this.N.R0(jVar);
        }
    }

    @Override
    public int c(int i10) {
        return this.T ? M() / 2 : i10;
    }

    public void c0() {
        this.f13293p0 = true;
    }

    @Override
    public TdApi.File d() {
        return f().u();
    }

    public void d0(TdApi.Document document) {
        this.f13277b = document;
        String str = document.fileName;
        this.X = str;
        if (str == null || str.length() == 0) {
            this.X = O(document.mimeType);
        }
        this.Y = g.M0(this.X);
        Q();
        if (document.thumbnail == null && this.f13283f0.n6() && e0.c(v0.z2(document.document.local.path))) {
            this.T = true;
            ld.i iVar = new ld.i(document.document.local.path);
            this.V = iVar;
            iVar.p0();
            this.V.Z(true);
            this.V.t0(a0.j(80.0f, 3.0f));
            this.V.s0(2);
        } else if (document.thumbnail != null) {
            this.T = true;
            if (document.minithumbnail != null) {
                ld.i iVar2 = new ld.i(document.minithumbnail);
                this.U = iVar2;
                iVar2.s0(2);
                this.U.Z(true);
            } else {
                this.U = null;
            }
            h D5 = t2.D5(this.f13283f0.c(), document.thumbnail);
            this.V = D5;
            if (D5 != null) {
                D5.Z(true);
                this.V.t0(a0.j(80.0f, 3.0f));
                this.V.s0(2);
                this.V.k0();
            }
            if (e0.c(document.mimeType)) {
                E();
            }
        }
        g1 g1Var = new g1(this.f13283f0.t(), this.f13283f0.c(), 8, this.T && e0.c(document.mimeType), this.f13283f0.I2(), this.f13283f0.K3());
        this.N = g1Var;
        g1Var.f0(this.f13283f0);
        this.N.L0(this);
        if (this.T) {
            this.N.d0(1140850688);
        } else {
            this.N.m0(document);
            this.N.e0(t2.n1(document, this.f13283f0.g6()));
        }
        this.N.p0(document.document, this.f13283f0.X3());
        j jVar = this.f13285h0;
        if (jVar != null) {
            this.N.R0(jVar);
        }
    }

    @Override
    public void e(TdApi.File file, int i10) {
        if (Y()) {
            f0(y());
        }
    }

    public final void e0(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (!z10) {
                I();
            }
            f0(y());
            this.f13283f0.u5();
        }
    }

    @Override
    public void e1(int i10, boolean z10, boolean z11) {
    }

    @Override
    public g1 f() {
        return this.N;
    }

    public final boolean f0(String str) {
        String z10 = z(str, false);
        if (i.c(this.Z, str) && i.c(this.f13276a0, z10)) {
            return false;
        }
        this.Z = str;
        this.f13276a0 = z10;
        X();
        this.f13283f0.u5();
        return true;
    }

    @Override
    public void g(TdApi.File file, float f10) {
        if (Y()) {
            f0(y());
        }
    }

    public void g0(TdApi.VoiceNote voiceNote, TdApi.Message message, o0.c cVar) {
        this.M = voiceNote;
        Q();
        this.f13278b0 = new n4(voiceNote.waveform, 0, this.f13283f0.g6());
        this.f13284g0 = (message != this.f13283f0.X3() || this.f13283f0.P5()) ? 0.0f : 1.0f;
        g1 g1Var = new g1(this.f13283f0.t(), this.f13283f0.c(), 2, false, this.f13283f0.I2(), this.f13283f0.K3());
        this.N = g1Var;
        g1Var.f0(this.f13283f0);
        this.N.L0(this);
        this.N.e0(this.f13283f0.g6() ? R.id.theme_color_bubbleOut_file : R.id.theme_color_file);
        this.N.G0(message != null ? message : t2.E4(voiceNote), cVar, this);
        j jVar = this.f13285h0;
        if (jVar != null) {
            this.N.R0(jVar);
        }
        if (this.f13283f0.I2() == 0) {
            this.N.j0(2, false);
            this.N.k0(R.drawable.baseline_pause_24);
        }
    }

    @Override
    public int h() {
        return J();
    }

    public final void h0(int i10) {
        this.f13281d0 = !i.i(this.Z) ? new g.b(this.Z, i10, y.g0(), this.f13283f0.m3()).v().f() : null;
        if (!i.i(this.f13276a0)) {
            this.f13282e0 = Math.max(Math.max(this.f13282e0, N()), new g.b(this.f13276a0, i10, y.g0(), this.f13283f0.m3()).v().f().getWidth());
        } else {
            this.f13282e0 = Math.max(this.f13282e0, N());
        }
    }

    @Override
    public void i(o6 o6Var, long j10, long j11, int i10, int i11) {
        e0(i11 == 3 || i11 == 2);
    }

    @Override
    public int j() {
        n4 n4Var;
        int i10;
        float f10;
        float f11;
        int M = M() + L();
        if (this.f13278b0 != null) {
            f11 = M;
            f10 = n4Var.i() + this.f13282e0;
            i10 = a0.i(12.0f);
        } else {
            f11 = M;
            f10 = Math.max(P(), this.f13282e0);
            i10 = a0.i(6.0f);
        }
        return (int) (f11 + f10 + i10);
    }

    @Override
    public boolean k(g1 g1Var, View view, TdApi.File file, long j10) {
        if (this.f13277b == null) {
            return false;
        }
        this.f13283f0.c().hd().M7(this.f13283f0.Q0(), this.f13277b, new kb.j() {
            @Override
            public final void a(Object obj) {
                n.this.V((hj.k) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                n.this.a0();
            }
        });
        return true;
    }

    @Override
    public boolean l(View view, MotionEvent motionEvent) {
        int i10 = this.f13294q0;
        int i11 = this.f13295r0;
        if (this.N.S(view, motionEvent)) {
            return true;
        }
        if (this.f13293p0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (!this.f13287j0 && this.f13288k0 == null) {
                            return false;
                        }
                        I();
                        D();
                    }
                } else if (!this.f13287j0 && this.f13288k0 == null) {
                    return false;
                } else {
                    if (this.f13278b0 != null) {
                        if (this.f13288k0 != null && !this.f13292o0 && Math.abs(this.f13289l0 - x10) >= a0.p()) {
                            this.f13292o0 = true;
                            this.f13289l0 = x10;
                        }
                        if (this.f13292o0) {
                            int i12 = i10 + (a0.i(25.0f) * 2) + L();
                            float i13 = this.f13278b0.i();
                            float d10 = ib.h.d((x10 - i12) / i13);
                            float f10 = this.f13290m0;
                            boolean z10 = f10 == -1.0f || ((int) (i13 * d10)) != ((int) (i13 * f10));
                            this.f13290m0 = d10;
                            if (z10) {
                                this.f13283f0.u5();
                            }
                        }
                        return this.f13288k0 != null;
                    }
                }
            } else if (!this.f13287j0 && this.f13288k0 == null) {
                return false;
            } else {
                if (this.f13292o0 && this.f13290m0 != -1.0f && this.P && this.Q > 0) {
                    this.f13291n0 = SystemClock.uptimeMillis();
                    c Y = ya.o1().Y();
                    long j10 = this.Q;
                    Y.T0((long) (j10 * this.f13290m0), j10);
                }
                I();
                if (this.f13287j0 && this.N.W(view)) {
                    this.f13283f0.k8();
                }
                D();
            }
            return this.f13287j0 || this.f13288k0 != null;
        }
        D();
        if (this.f13278b0 != null && this.P && this.Q > 0 && this.R >= 0) {
            int i14 = a0.i(25.0f);
            int L = (i14 * 2) + i10 + L();
            int i15 = i11 + i14;
            if (y10 >= i15 - i14 && y10 <= i15 + i14 && x10 >= L && x10 <= L + this.f13278b0.i()) {
                this.f13289l0 = i10;
                ViewParent parent = view.getParent();
                this.f13288k0 = parent;
                if (parent == null) {
                    return false;
                }
                parent.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        }
        if (this.X == null && this.Z == null) {
            return false;
        }
        float z11 = this.N.z() * 1.6f;
        float z12 = i11 + this.N.z();
        if (x10 >= (this.N.z() + i10) - z11 && x10 <= i10 + M() + L() + Math.max(P(), this.f13282e0) + z11 && y10 >= z12 - z11 && y10 <= z12 + z11) {
            this.f13287j0 = true;
        }
        return this.f13287j0;
    }

    @Override
    public void m(ld.p pVar) {
        TdApi.Audio audio;
        if (this.T) {
            TdApi.Document document = this.f13277b;
            if ((document == null || !t2.T2(document.document) || !e0.c(this.f13277b.mimeType)) && ((audio = this.f13279c) == null || !t2.T2(audio.audio))) {
                pVar.G(null);
            } else {
                pVar.G(E());
            }
        } else {
            pVar.G(null);
        }
    }

    @Override
    public void n(ld.c cVar) {
        if (this.T) {
            cVar.j(this.U, this.V);
        } else {
            cVar.clear();
        }
    }

    @Override
    public void p(j jVar) {
        this.f13285h0 = jVar;
        this.N.R0(jVar);
    }

    public final String v(TdApi.File file, boolean z10) {
        g1 g1Var = this.N;
        return x(file, z10, g1Var != null && g1Var.I(), this.f13283f0.S0());
    }

    @Override
    public void x6(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10) {
        this.R = j12;
        this.Q = j13;
        boolean z11 = false;
        int w10 = j12 > 0 ? v0.w(j12) : 0;
        if (w10 != this.S) {
            z11 = true;
        }
        this.S = w10;
        if (this.P) {
            if (z11) {
                f0(y());
            }
            this.f13283f0.u5();
        }
    }

    public final String y() {
        return z(null, false);
    }

    public final String z(String str, boolean z10) {
        TdApi.File file;
        String str2 = null;
        if (str != null) {
            TdApi.Document document = this.f13277b;
            if (document != null) {
                file = document.document;
            } else {
                TdApi.Audio audio = this.f13279c;
                file = audio != null ? audio.audio : null;
            }
            String v10 = v(file, true);
            if (v10 == null || v10.equals(str)) {
                return null;
            }
            return v10;
        }
        TdApi.Document document2 = this.f13277b;
        if (document2 != null) {
            TdApi.File file2 = document2.document;
            if (file2.remote.isUploadingActive && file2.expectedSize == 0) {
                return w.i1(R.string.ProcessingFile);
            }
            String v11 = v(file2, false);
            if (v11 != null) {
                return v11;
            }
            if (!i.i(this.f13277b.fileName)) {
                str2 = v0.v0(this.f13277b.fileName);
            }
            if (i.i(str2) && !i.i(this.f13277b.mimeType)) {
                str2 = e0.a(this.f13277b.mimeType);
            }
            if ("tgx-theme".equalsIgnoreCase(str2)) {
                if (z10 && !i.i(this.X) && this.X.toLowerCase().endsWith(".tgx-theme")) {
                    String str3 = this.X;
                    this.X = str3.substring(0, (str3.length() - 1) - 9);
                }
                return w.j1(R.string.ThemeFile, c0.m(file2.expectedSize));
            } else if (i.i(str2) || str2.length() > 7) {
                return c0.m(file2.expectedSize);
            } else {
                String upperCase = str2.toUpperCase();
                if (z10 && !i.i(this.X)) {
                    String upperCase2 = this.X.toUpperCase();
                    if (upperCase2.endsWith("." + upperCase)) {
                        String str4 = this.X;
                        this.X = str4.substring(0, (str4.length() - 1) - upperCase.length());
                    }
                }
                return w.j1(R.string.format_fileSizeAndExtension, c0.m(file2.expectedSize), upperCase);
            }
        } else {
            TdApi.VoiceNote voiceNote = this.M;
            if (voiceNote == null) {
                TdApi.Audio audio2 = this.f13279c;
                if (audio2 == null) {
                    return null;
                }
                String v12 = v(audio2.audio, false);
                return v12 != null ? v12 : t2.f2(this.f13279c);
            } else if (this.P) {
                return c0.h(this.S);
            } else {
                return c0.h(voiceNote.duration);
            }
        }
    }

    public n(s4 s4Var, TdApi.Audio audio, TdApi.Message message, o0.c cVar) {
        this.f13283f0 = s4Var;
        b0(audio, message, cVar);
    }

    public n(s4 s4Var, TdApi.VoiceNote voiceNote, TdApi.Message message, o0.c cVar) {
        this.f13283f0 = s4Var;
        g0(voiceNote, message, cVar);
    }
}
