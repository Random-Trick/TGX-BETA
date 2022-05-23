package ne;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.y;
import eb.f;
import eb.k;
import gb.j;
import hd.s4;
import hd.t2;
import ib.d;
import ib.i;
import ie.t;
import java.io.File;
import jd.e0;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import vd.o0;
import zd.h9;
import zd.o6;
import zd.ya;

public class g1 implements h9.c, k.b, o0.f {
    public static final Handler f18031d1 = new a(Looper.getMainLooper());
    public static final Interpolator f18032e1 = new DecelerateInterpolator(0.72f);
    public static Path f18033f1;
    public static Path f18034g1;
    public boolean A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public j F0;
    public boolean G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public float L0;
    public TdApi.File M;
    public k M0;
    public String N;
    public boolean N0;
    public boolean O;
    public boolean P;
    public k P0;
    public boolean Q;
    public float Q0;
    public int R;
    public k R0;
    public boolean S0;
    public int T;
    public m2 T0;
    public float U0;
    public long V;
    public float V0;
    public long W;
    public int W0;
    public boolean X;
    public boolean X0;
    public boolean Y;
    public s4 Y0;
    public boolean Z;
    public float Z0;
    public final org.thunderdog.challegram.a f18035a;
    public k f18037a1;
    public final o6 f18038b;
    public boolean f18040b1;
    public final int f18041c;
    public boolean f18043c1;
    public float f18044d0;
    public boolean f18045e0;
    public boolean f18046f0;
    public boolean f18047g0;
    public boolean f18048h0;
    public int f18049i0;
    public int f18050j0;
    public f f18051k0;
    public Drawable f18052l0;
    public int f18053m0;
    public c f18055o0;
    public b f18056p0;
    public TdApi.Message f18057q0;
    public o0.c f18058r0;
    public o0.f f18059s0;
    public boolean f18060t0;
    public boolean f18061u0;
    public boolean f18062v0;
    public k f18063w0;
    public float f18064x0;
    public Path f18065y0;
    public float f18066z0;
    public final Rect f18036a0 = new Rect();
    public final RectF f18039b0 = new RectF();
    public final RectF f18042c0 = new RectF();
    public int U = R.drawable.baseline_file_download_24;
    public int S = 1711276032;
    public float O0 = 1.0f;
    public float f18054n0 = 1.0f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((g1) message.obj).E();
            } else if (i10 == 1) {
                ((g1) message.obj).j0(message.arg1, true);
            } else if (i10 == 2) {
                ((g1) message.obj).H0(Float.intBitsToFloat(message.arg1), Float.intBitsToFloat(message.arg2));
            }
        }
    }

    public interface b {
        TdApi.File a(TdApi.File file);
    }

    public interface c {
        void e(TdApi.File file, int i10);

        void g(TdApi.File file, float f10);

        boolean k(g1 g1Var, View view, TdApi.File file, long j10);
    }

    public g1(org.thunderdog.challegram.a aVar, o6 o6Var, int i10, boolean z10, long j10, long j11) {
        this.f18035a = aVar;
        this.f18038b = o6Var;
        this.f18041c = i10;
        this.O = z10;
        this.V = j10;
        this.W = j11;
    }

    public void P(v4 v4Var) {
        v0.m2(v4Var, v0.x0(this.M.local.path), new File(this.M.local.path), this.N, 0);
    }

    public float A() {
        return this.f18054n0;
    }

    public void A0() {
        this.Z = true;
    }

    public int B() {
        TdApi.File file = this.M;
        if (file != null) {
            return file.expectedSize;
        }
        return 0;
    }

    public void B0(int i10) {
        this.f18050j0 = i10;
    }

    public final float C(float f10) {
        if (!this.P) {
            return f10;
        }
        if (f10 > 0.0f) {
            return (f10 * 0.65f) + 0.35f;
        }
        if (i.i(this.M.local.path)) {
            return 0.0f;
        }
        e0.c Y = this.f18038b.l5().Y(this.M.local.path);
        float g10 = Y != null ? (float) Y.g() : 1.0f;
        return g10 == 1.0f ? (f10 * 0.65f) + 0.35f : g10 * 0.35f;
    }

    public void C0(int i10) {
        if (this.U != i10) {
            this.U = i10;
            if (this.W0 == 0) {
                r0(i10, false);
                c0(i10 != 0 ? 1.0f : 0.0f, false);
            }
        }
    }

    public void D() {
        j jVar = this.F0;
        if (jVar == null) {
            return;
        }
        if (this.X0) {
            jVar.invalidate();
            return;
        }
        int z10 = z();
        int d10 = d();
        int e10 = e();
        int i10 = z10 / 2;
        this.F0.d(d10 - i10, e10 - i10, d10 + i10, e10 + i10);
    }

    public final void D0(float f10) {
        if (this.f18064x0 != f10) {
            this.f18064x0 = f10;
            Q();
            D();
        }
    }

    public void E() {
        if (this.O) {
            j jVar = this.F0;
            if (jVar == null || !jVar.a()) {
                Log.i("Warning: FileProgressComponent.invalidateContent ignored", new Object[0]);
            }
        }
    }

    public final void E0(float f10, boolean z10) {
        if (z10) {
            if (this.f18063w0 == null) {
                this.f18063w0 = new k(3, this, db.b.f7287b, 138L, this.f18064x0);
            }
            this.f18063w0.i(f10);
            return;
        }
        k kVar = this.f18063w0;
        if (kVar != null) {
            kVar.l(f10);
        }
        D0(f10);
    }

    public boolean F() {
        TdApi.File file;
        return this.W0 == 2 || ((file = this.M) != null && t2.T2(file));
    }

    public void F0(TdApi.Message message, o0.c cVar) {
        G0(message, cVar, null);
    }

    public boolean G() {
        return this.W0 == 3;
    }

    public void G0(TdApi.Message message, o0.c cVar, o0.f fVar) {
        if (this.M == null) {
            k0(R.drawable.baseline_play_arrow_36_white);
            p0(t2.j1(message), message);
            this.f18057q0 = message;
            this.f18058r0 = cVar;
            this.f18059s0 = fVar;
            this.f18065y0 = new Path();
            f();
            ya.o1().w2().r(this.f18038b, message, this);
            Path path = this.f18065y0;
            int i10 = a0.i(13.0f);
            float f10 = this.f18064x0;
            this.f18066z0 = f10;
            ce.b.b(path, i10, -1.0f, f10);
            return;
        }
        throw new IllegalStateException("setPlayPauseObject called after setFile");
    }

    public boolean H() {
        return this.W0 == 2;
    }

    public void H0(float f10, float f11) {
        if (this.U0 != f10 || this.V0 != f11) {
            boolean z10 = false;
            if (Log.isEnabled(Log.TAG_TDLIB_FILES) && Log.checkLogLevel(3)) {
                Object[] objArr = new Object[5];
                TdApi.File file = this.M;
                objArr[0] = Integer.valueOf(file != null ? file.f19913id : 0);
                objArr[1] = Integer.valueOf((int) (this.U0 * 100.0f));
                objArr[2] = Integer.valueOf((int) (f10 * 100.0f));
                objArr[3] = Integer.valueOf((int) (this.V0 * 100.0f));
                objArr[4] = Integer.valueOf((int) (100.0f * f11));
                Log.i((int) Log.TAG_TDLIB_FILES, "setProgress id=%d done=%d->%d%% visual=%d->%d%%", objArr);
            }
            this.U0 = f10;
            this.V0 = f11;
            m2 m2Var = this.T0;
            if (m2Var != null) {
                if (S0() && this.O0 > 0.0f) {
                    z10 = true;
                }
                m2Var.v(f11, z10);
            }
            c cVar = this.f18055o0;
            if (cVar != null && this.W0 == 1) {
                cVar.g(this.M, f10);
            }
        }
    }

    public boolean I() {
        return this.W0 == 1;
    }

    public final void I0(float f10) {
        if (this.Q0 != f10) {
            this.Q0 = f10;
            if (this.f18040b1) {
                Q();
            }
            D();
        }
    }

    public boolean J() {
        TdApi.File file = this.M;
        if (file != null && !file.local.isDownloadingCompleted) {
            TdApi.RemoteFile remoteFile = file.remote;
            if (!remoteFile.isUploadingCompleted && remoteFile.uploadedSize == 0) {
                return true;
            }
        }
        return false;
    }

    public void J0(float f10) {
        if (this.f18054n0 != f10) {
            this.f18054n0 = f10;
            D();
        }
    }

    public boolean K() {
        return this.f18040b1;
    }

    @Override
    public void K0(o6 o6Var, int i10, int i11, TdApi.File file) {
        TdApi.File file2;
        boolean z10 = Looper.getMainLooper() == Looper.myLooper();
        if (i11 == 2) {
            if (file != null) {
                TdApi.File file3 = this.M;
                if (file3 != null) {
                    e.v(file, file3);
                }
                if (this.O) {
                    Handler handler = f18031d1;
                    handler.sendMessage(Message.obtain(handler, 0, this));
                }
            }
        } else if (!(file == null || (file2 = this.M) == null)) {
            e.v(file, file2);
        }
        if (z10) {
            j0(i11, S0());
            return;
        }
        Handler handler2 = f18031d1;
        handler2.sendMessage(Message.obtain(handler2, 1, i11, 0, this));
    }

    public boolean L() {
        return t2.Y2(this.M);
    }

    public void L0(c cVar) {
        this.f18055o0 = cVar;
    }

    public boolean M() {
        TdApi.File file = this.M;
        return file != null && !file.remote.isUploadingCompleted;
    }

    public void M0() {
        this.X0 = true;
        m2 m2Var = this.T0;
        if (m2Var != null) {
            m2Var.D();
        }
    }

    public boolean N() {
        return this.f18045e0;
    }

    public void N0(boolean z10) {
        boolean z11 = this.f18045e0 != z10;
        this.f18045e0 = z10;
        this.f18065y0 = new Path();
        w0(false, false);
        if (z11) {
            Path path = this.f18065y0;
            int i10 = a0.i(18.0f);
            float f10 = this.f18064x0;
            this.f18066z0 = f10;
            ce.b.b(path, i10, -1.0f, f10);
        }
    }

    public final boolean O() {
        return this.f18049i0 != 0;
    }

    public void O0(RectF rectF) {
        this.f18042c0.set(rectF);
    }

    public void P0(boolean z10, boolean z11, int i10, RectF rectF, f fVar) {
        int i11 = this.f18049i0;
        boolean z12 = this.f18046f0 != z10 || !this.f18039b0.equals(rectF);
        this.f18046f0 = z10;
        this.f18048h0 = z11;
        this.f18051k0 = fVar;
        this.f18049i0 = i10;
        this.f18039b0.set(rectF);
        W0();
        if (i11 != i10) {
            f();
            Path path = this.f18065y0;
            int i12 = a0.i(i10 == 1 ? 15.0f : 18.0f);
            float f10 = this.f18064x0;
            this.f18066z0 = f10;
            ce.b.b(path, i12, -1.0f, f10);
            if (this.W0 == 1) {
                r0(t(), false);
            }
        }
        if (z12) {
            Q();
        }
    }

    public final void Q() {
        int i10;
        int i11;
        if (this.T0 != null) {
            TdApi.Message message = this.f18057q0;
            if ((message != null && fd.a.c(message) && !this.Z) || (N() && this.f18048h0)) {
                int d10 = d();
                int e10 = e();
                if (this.f18040b1) {
                    int i12 = a0.i(11.0f);
                    i10 = (int) (a0.i(7.0f) + ((i12 - i11) * this.Q0));
                    this.T0.w(i10);
                } else if (N()) {
                    int i13 = a0.i(20.0f);
                    d10 += i13;
                    e10 += i13;
                    i10 = a0.i(5.0f);
                    this.T0.w(i10 - a0.i(2.0f));
                } else {
                    double radians = Math.toRadians(45.0d);
                    double d11 = (this.D0 - this.B0) / 2;
                    d10 += (int) (Math.sin(radians) * d11);
                    e10 += (int) (d11 * Math.cos(radians));
                    i10 = a0.i(5.0f);
                    this.T0.w(i10 - a0.i(2.0f));
                }
                this.T0.p(d10 - i10, e10 - i10, d10 + i10, e10 + i10);
            } else if (N()) {
                W0();
                this.T0.w(z() - a0.i(4.0f));
                m2 m2Var = this.T0;
                Rect rect = this.f18036a0;
                m2Var.p(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                this.T0.w(z() - a0.i(4.0f));
                this.T0.p(this.B0, this.C0, this.D0, this.E0);
            }
        }
    }

    public void Q0(boolean z10) {
        this.f18047g0 = z10;
    }

    public void R() {
        m2 m2Var = this.T0;
        if (m2Var != null) {
            m2Var.m();
        }
    }

    public void R0(j jVar) {
        this.F0 = jVar;
        m2 m2Var = this.T0;
        if (m2Var != null) {
            m2Var.E(jVar);
        }
    }

    public boolean S(View view, MotionEvent motionEvent) {
        j jVar;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z10 = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.G0) {
                        this.G0 = false;
                        return true;
                    }
                } else if (this.G0 && Math.max(Math.abs(this.H0 - x10), Math.abs(this.I0 - y10)) > a0.p()) {
                    this.G0 = false;
                    return true;
                }
            } else if (this.G0) {
                if (W(view) && (jVar = this.F0) != null) {
                    jVar.e();
                }
                return true;
            }
            return this.G0;
        }
        this.H0 = (int) x10;
        this.I0 = (int) y10;
        if (x10 >= this.B0 && x10 <= this.D0 && y10 >= this.C0 && y10 <= this.E0 && (!this.f18040b1 || this.W0 != 2)) {
            z10 = true;
        }
        this.G0 = z10;
        return z10;
    }

    public final boolean S0() {
        j jVar = this.F0;
        return jVar != null && jVar.g() && !this.N0;
    }

    public final boolean T() {
        final v4<?> t10;
        if (this.N == null || (t10 = j0.t(this.f18035a)) == null) {
            return false;
        }
        return U(t10, new Runnable() {
            @Override
            public final void run() {
                g1.this.P(t10);
            }
        });
    }

    public void T0(Rect rect) {
        int d10 = d();
        int e10 = e();
        int z10 = z();
        rect.set(d10 - z10, e10 - z10, d10 + z10, e10 + z10);
    }

    public boolean U(v4<?> v4Var, Runnable runnable) {
        if (this.M == null || this.f18041c != 8) {
            return false;
        }
        if (v4Var != null && v4Var.c() == this.f18038b) {
            if ((this.R & 1) != 0) {
                v4Var.c().hd().O7(v4Var, this.M, null, runnable);
            } else {
                runnable.run();
            }
        }
        return true;
    }

    @Override
    public void U0(TdApi.File file) {
        boolean z10 = !this.Q && file.local.isDownloadingCompleted;
        e.v(file, this.M);
        float s12 = t2.s1(file);
        float C = C(s12);
        Handler handler = f18031d1;
        handler.sendMessage(Message.obtain(handler, 2, Float.floatToIntBits(s12), Float.floatToIntBits(C), this));
        if (z10) {
            this.Q = true;
            if (this.O) {
                handler.sendMessage(Message.obtain(handler, 0, this));
            }
        }
    }

    public void V(boolean z10) {
        if (this.M != null && this.W0 == 1) {
            this.f18038b.m5().m(this.M.f19913id, z10, false);
        }
    }

    public void V0(long j10, long j11, boolean z10) {
        if (this.W == j10) {
            this.W = j11;
            int i10 = 0;
            this.f18062v0 = false;
            if (!z10) {
                i10 = 3;
            } else if (t2.V2(this.M)) {
                i10 = 2;
            }
            j0(i10, S0());
        }
        TdApi.Message message = this.f18057q0;
        if (message != null && message.f19946id == j10) {
            message.f19946id = j11;
        }
    }

    public boolean W(View view) {
        return Y(view, false);
    }

    public final void W0() {
        int i10 = this.B0;
        int i11 = this.f18049i0;
        int i12 = (i10 + a0.i(i11 == 2 ? 4.0f : i11 == 1 ? 8.0f : 14.0f)) - this.f18050j0;
        int i13 = this.C0;
        int i14 = this.f18049i0;
        int i15 = ((i13 + a0.i(i14 == 2 ? 3.0f : i14 == 1 ? 6.0f : 12.0f)) + (this.f18046f0 ? a0.i(16.0f) : 0)) - this.f18050j0;
        this.f18036a0.set(i12, i15, (z() * 2) + i12, (z() * 2) + i15);
    }

    public boolean X(View view, float f10, float f11) {
        this.H0 = (int) f10;
        this.I0 = (int) f11;
        return Y(view, false);
    }

    public void X0() {
        f();
        Q();
    }

    public boolean Y(View view, boolean z10) {
        c cVar;
        TdApi.Message message;
        c cVar2;
        if (this.Y && (!N() || !this.f18039b0.contains(this.H0, this.I0))) {
            return !z10 && (cVar2 = this.f18055o0) != null && cVar2.k(this, view, this.M, this.W);
        }
        if (this.f18040b1 || this.M == null || (message = this.f18057q0) == null || ((!fd.a.c(message) || this.Z) && this.W0 != 2)) {
            int i10 = this.W0;
            if (i10 != 0) {
                if (i10 == 1) {
                    TdApi.File file = this.M;
                    if (file != null) {
                        if (file.remote.isUploadingActive || this.f18062v0) {
                            this.f18038b.Q4(this.V, new long[]{this.W}, true);
                        } else {
                            this.f18038b.m5().m(this.M.f19913id, false, true);
                        }
                        return true;
                    }
                } else if (i10 == 2 && ((!z10 && (cVar = this.f18055o0) != null && cVar.k(this, view, this.M, this.W)) || T())) {
                    return true;
                }
            } else if (this.M != null) {
                this.f18038b.m5().p(this.M);
                return true;
            }
            return false;
        }
        TdApi.File file2 = this.M;
        if (file2.remote.isUploadingCompleted || file2.f19913id == -1) {
            ya.o1().w2().H0(this.f18038b, this.f18057q0, this.f18058r0);
        }
        return true;
    }

    public boolean Z(View view) {
        this.G0 = false;
        return false;
    }

    public void a0(TdApi.File file, TdApi.Message message) {
        p0(file, message);
    }

    public final float b() {
        if (this.W0 != 2) {
            return 0.0f;
        }
        k kVar = this.M0;
        if (kVar == null || !kVar.v()) {
            return 1.0f;
        }
        float f10 = this.L0;
        if (f10 <= 0.5f) {
            return 0.0f;
        }
        return (f10 - 0.5f) / 0.5f;
    }

    public final void b0(float f10) {
        if (this.O0 != f10) {
            this.O0 = f10;
            D();
        }
    }

    public final float c() {
        if (this.W0 == 2) {
            return (1.0f - this.Z0) * 1.0f;
        }
        return 0.0f;
    }

    public final void c0(float f10, boolean z10) {
        if (z10 && S0()) {
            float f11 = this.O0;
            if (!(f11 == f10 && this.P0 == null)) {
                if (this.P0 == null) {
                    this.P0 = new k(1, this, db.b.f7287b, 240L, f11);
                }
                this.P0.i(f10);
                return;
            }
        }
        k kVar = this.P0;
        if (kVar != null) {
            kVar.l(f10);
        }
        b0(f10);
    }

    public int d() {
        return (this.B0 + this.D0) >> 1;
    }

    public void d0(int i10) {
        this.f18061u0 = false;
        this.S = i10;
    }

    public int e() {
        return (this.C0 + this.E0) >> 1;
    }

    public void e0(int i10) {
        this.f18061u0 = true;
        this.S = i10;
    }

    public final void f() {
        int i10;
        if (this.T0 != null) {
            boolean z10 = (fd.a.c(this.f18057q0) && !this.Z) || (N() && this.f18048h0);
            m2 m2Var = this.T0;
            float f10 = 1.5f;
            if (!N() || !O()) {
                if (this.f18062v0 || !z10) {
                    i10 = a0.i(3.0f);
                    m2Var.C(i10);
                } else if (this.f18040b1) {
                    f10 = 2.0f;
                }
            }
            i10 = a0.i(f10);
            m2Var.C(i10);
        }
    }

    public void f0(s4 s4Var) {
        this.Y0 = s4Var;
    }

    public final void g(boolean z10) {
        if (this.f18057q0 != null) {
            if (z10) {
                k kVar = this.f18037a1;
                if (kVar == null) {
                    k kVar2 = new k(4, this, db.b.f7287b, 180L);
                    this.f18037a1 = kVar2;
                    kVar2.F(2000L);
                } else {
                    kVar.l(0.0f);
                }
                this.Z0 = 1.0f;
                this.f18037a1.i(1.0f);
                return;
            }
            k kVar3 = this.f18037a1;
            if (kVar3 != null) {
                kVar3.l(0.0f);
            }
            this.Z0 = 0.0f;
        }
    }

    public final void g0(float f10) {
        if (this.L0 != f10) {
            this.L0 = f10;
            int i10 = this.K0;
            if (i10 != 0 && f10 >= 0.5f) {
                this.J0 = i10;
                this.K0 = 0;
            }
        }
        D();
    }

    public org.thunderdog.challegram.a h() {
        return this.f18035a;
    }

    public void h0(int i10, int i11, int i12, int i13) {
        if (this.B0 != i10 || this.C0 != i11 || this.D0 != i12 || this.E0 != i13) {
            this.B0 = i10;
            this.C0 = i11;
            this.D0 = i12;
            this.E0 = i13;
            Q();
        }
    }

    @Override
    public void i(o6 o6Var, long j10, long j11, int i10, int i11) {
        TdApi.File file;
        if (this.f18038b == o6Var && (file = this.M) != null && file.f19913id == i10) {
            w0(i11 == 3, true);
            o0.f fVar = this.f18059s0;
            if (fVar != null) {
                fVar.i(o6Var, j10, j11, i10, i11);
            }
        }
    }

    public final void i0(float f10) {
        if (this.Z0 != f10) {
            this.Z0 = f10;
            D();
        }
    }

    public void j() {
        if (this.M != null) {
            this.f18038b.m5().D0(this.M.f19913id, this);
        }
        if (this.f18057q0 != null) {
            ya.o1().w2().T0(this.f18038b, this.f18057q0, this);
        }
    }

    public void j0(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: ne.g1.j0(int, boolean):void");
    }

    public boolean k() {
        return m(null);
    }

    public void k0(int i10) {
        l0(i10, S0());
    }

    public boolean l(long j10) {
        TdApi.Chat W2;
        if (this.M == null || (W2 = this.f18038b.W2(j10)) == null) {
            return false;
        }
        return m(W2.type);
    }

    public void l0(int i10, boolean z10) {
        if (this.T != i10) {
            this.T = i10;
            if (this.W0 == 2) {
                r0(i10, z10);
                c0(i10 != 0 ? 1.0f : 0.0f, z10);
            }
        }
    }

    public boolean m(TdApi.ChatType chatType) {
        if (this.M != null) {
            if (this.f18038b.m5().o(this.M, chatType, this.f18041c, this.W0 == 0)) {
                return true;
            }
        }
        return false;
    }

    public void m0(TdApi.Document document) {
        boolean a10 = fd.a.a(document);
        k0(a10 ? R.drawable.baseline_palette_24 : R.drawable.baseline_insert_drive_file_24);
        this.R = ib.c.h(this.R, 1, a10);
    }

    public void n() {
        if (this.M == null) {
            return;
        }
        if (this.W0 == 0 || !this.f18038b.m5().P(this.M.f19913id)) {
            this.f18038b.m5().p(this.M);
        }
    }

    public void n0(b bVar) {
        this.f18056p0 = bVar;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            g0(f10);
        } else if (i10 == 1) {
            b0(f10);
        } else if (i10 == 2) {
            I0(f10);
        } else if (i10 == 3) {
            D0(f10);
        } else if (i10 == 4) {
            i0(1.0f - f10);
        }
    }

    public <T extends View & t> void o(T t10, Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i10;
        boolean z10;
        int i11;
        Drawable drawable;
        f fVar;
        boolean z11;
        boolean z12 = false;
        boolean z13 = fd.a.c(this.f18057q0) && !this.Z;
        float f11 = this.O0 * this.f18054n0;
        if ((this.M == null || f11 == 0.0f || this.f18040b1) ? false : true) {
            int d10 = d();
            int e10 = e();
            if (N()) {
                if (this.f18036a0.width() == 0) {
                    W0();
                }
                d10 = this.f18036a0.centerX();
                e10 = this.f18036a0.centerY();
            }
            int i12 = d10;
            int i13 = e10;
            if (f11 == 1.0f) {
                i10 = this.f18061u0 ? ae.j.L(this.S) : this.S;
            } else {
                i10 = d.a(f11, this.f18061u0 ? ae.j.L(this.S) : this.S);
            }
            if (N()) {
                canvas.drawCircle(d(), e(), a0.i(this.f18049i0 == 0 ? 28.0f : 18.0f), y.g(i10));
                r(canvas, d(), e(), f11, true);
                if (this.f18042c0.isEmpty() || this.f18048h0) {
                    z11 = false;
                } else {
                    canvas.save();
                    canvas.clipRect(this.f18042c0);
                    canvas.translate(this.f18044d0, 0.0f);
                    z11 = true;
                }
                if (this.f18048h0) {
                    q(canvas, f11);
                }
                z10 = z11;
            } else {
                canvas.drawCircle(i12, i13, z(), y.g(i10));
                z10 = false;
            }
            if (z13) {
                r(canvas, i12, i13, f11, true);
            } else {
                int i14 = this.J0;
                if (i14 != 0 && ((i14 != this.T || !this.f18060t0) && (!N() || !this.f18048h0))) {
                    boolean z14 = N() && !O() && (fVar = this.f18051k0) != null && fVar.i();
                    Paint W = y.W(-1);
                    float f12 = this.L0;
                    float f13 = f12 <= 0.5f ? f12 / 0.5f : 1.0f - ((f12 - 0.5f) / 0.5f);
                    float f14 = z14 ? 0.0f : f13;
                    float f15 = (1.0f - f13) * f11;
                    int i15 = (f15 > 1.0f ? 1 : (f15 == 1.0f ? 0 : -1));
                    if (i15 != 0) {
                        W.setAlpha((int) (255.0f * f15));
                    }
                    boolean z15 = f14 != 0.0f;
                    if (z15) {
                        int O = p0.O(canvas);
                        float f16 = ((1.0f - f14) * 0.35000002f) + 0.65f;
                        canvas.scale(f16, f16, i12, i13);
                        i11 = O;
                    } else {
                        i11 = -1;
                    }
                    int i16 = this.J0;
                    if (i16 != R.drawable.baseline_play_arrow_36_white || this.f18057q0 == null) {
                        f10 = f11;
                        canvas2 = canvas;
                        if (i15 != 0) {
                            drawable = this.f18052l0;
                            if (drawable == null || this.f18053m0 != i16) {
                                this.f18053m0 = i16;
                                drawable = ce.c.f(i16);
                                this.f18052l0 = drawable;
                            }
                        } else {
                            this.f18053m0 = 0;
                            this.f18052l0 = null;
                            drawable = t10.Z(i16, 0);
                        }
                        ce.c.b(canvas2, drawable, i12 - (drawable.getMinimumWidth() / 2.0f), i13 - (drawable.getMinimumHeight() / 2.0f), W);
                    } else {
                        int i17 = a0.i(13.0f);
                        Path path = this.f18065y0;
                        float f17 = this.f18066z0;
                        float f18 = this.f18064x0;
                        this.f18066z0 = f18;
                        float f19 = this.Q0;
                        int a10 = d.a(f15, -1);
                        f10 = f11;
                        canvas2 = canvas;
                        ce.b.t(canvas, i12, i13, i17, path, f17, f18, f19, a10);
                    }
                    if (i15 != 0) {
                        W.setAlpha(255);
                    }
                    if (z15) {
                        p0.N(canvas2, i11);
                    }
                    z12 = z10;
                }
            }
            f10 = f11;
            canvas2 = canvas;
            z12 = z10;
        } else {
            f10 = f11;
            canvas2 = canvas;
        }
        float f20 = f10;
        if (z13) {
            q(canvas2, f20);
        }
        m2 m2Var = this.T0;
        if (m2Var != null && !this.f18047g0) {
            m2Var.o(f20);
            this.T0.d(x());
            this.T0.c(canvas2);
        }
        if (z12) {
            canvas.restore();
        }
    }

    public void o0(TdApi.File file) {
        p0(file, null);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 1.0f) {
            k kVar2 = this.M0;
            if (kVar2 != null) {
                kVar2.l(0.0f);
            }
            this.L0 = 0.0f;
        }
    }

    public <T extends View & t> void p(T t10, Canvas canvas, RectF rectF, float f10) {
        this.f18044d0 = f10;
        this.f18042c0.set(rectF);
        o(t10, canvas);
    }

    public void p0(TdApi.File file, TdApi.Message message) {
        TdApi.LocalFile localFile;
        TdApi.LocalFile localFile2;
        if (this.M != null && !this.X) {
            this.f18038b.m5().D0(this.M.f19913id, this);
        }
        this.M = file;
        int i10 = 0;
        if (file == null || (localFile2 = file.local) == null) {
            this.P = false;
            this.Q = false;
        } else {
            boolean z10 = localFile2.isDownloadingCompleted;
            this.Q = z10;
            this.P = !z10 && !file.remote.isUploadingCompleted && message != null && message.content.getConstructor() != -1851395174;
        }
        if (message != null && this.f18038b.aa(message)) {
            this.f18062v0 = true;
        }
        if (file == null) {
            j0(0, S0());
        } else if (this.f18062v0) {
            j0(1, S0());
            if (L()) {
                H0(1.0f, 1.0f);
            }
        } else if (message != null && t2.R2(message)) {
            j0(3, S0());
        } else if (t2.W2(file)) {
            j0(1, S0());
        } else {
            if (t2.T2(file)) {
                i10 = 2;
            }
            j0(i10, S0());
        }
        if (file != null && !this.X) {
            if (this.W0 == 1 && (localFile = file.local) != null && localFile.isDownloadingActive && !this.f18038b.m5().P(file.f19913id)) {
                this.f18038b.m5().p(file);
            }
            this.f18038b.m5().B0(file, this);
        }
    }

    public final void q(Canvas canvas, float f10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int d10;
        int i15;
        int i16;
        Canvas canvas2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Path path;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        float c10 = c();
        if (c10 != 1.0f) {
            int d11 = d();
            int e10 = e();
            if (this.f18040b1) {
                int i31 = a0.i(12.0f);
                i13 = (int) (a0.i(7.0f) + ((i31 - i30) * this.Q0));
                i11 = d11;
                i10 = e10;
                i12 = 0;
            } else {
                if (N()) {
                    int i32 = a0.i(20.0f);
                    i29 = d11 + i32;
                    i28 = e10 + i32;
                    i13 = a0.i(5.0f);
                    i27 = a0.i(1.5f);
                } else {
                    double radians = Math.toRadians(45.0d);
                    double d12 = (this.D0 - this.B0) / 2;
                    i29 = d11 + ((int) (d12 * Math.sin(radians)));
                    i28 = e10 + ((int) (d12 * Math.cos(radians)));
                    i13 = a0.i(5.0f);
                    i27 = a0.i(1.5f);
                }
                i12 = (int) (i27 * f10 * (1.0f - c10));
                i11 = i29;
                i10 = i28;
            }
            if (this.f18061u0) {
                d10 = ae.j.L(this.S);
            } else {
                float f11 = this.f18064x0;
                int L = f11 != 0.0f ? ae.j.L(R.id.theme_color_file) : 0;
                if (f11 != 1.0f) {
                    s4 s4Var = this.Y0;
                    i14 = s4Var != null ? s4Var.n3() : ae.j.L(R.id.theme_color_iconLight);
                } else {
                    i14 = 0;
                }
                d10 = d.d(i14, L, f11);
            }
            int i33 = d10;
            s4 s4Var2 = this.Y0;
            if (s4Var2 != null) {
                i15 = s4Var2.Z2();
            } else {
                i15 = d.a(f10, ae.j.u());
            }
            int i34 = i15;
            boolean z10 = this.f18040b1;
            if (!z10 || this.Q0 <= 1.0f) {
                float f12 = 1.0f - c10;
                i16 = i33;
                ce.b.f(canvas, i11, i10, (int) (i13 * f12), 1.0f - ((f10 * f12) * (z10 ? 1.0f - this.Q0 : 1.0f)), d.a(f10, i33), i12, i34, N());
                if (this.f18040b1) {
                    canvas2 = canvas;
                    canvas2.drawCircle(i11, i10, (i26 + a0.i(1.0f)) * this.Q0, y.g(ae.j.u()));
                } else {
                    canvas2 = canvas;
                }
            } else {
                canvas2 = canvas;
                i16 = i33;
            }
            if (this.f18040b1) {
                int i35 = (int) (a0.i(6.5f) * this.Q0);
                int i36 = i35 / 2;
                int i37 = i11 - i36;
                int i38 = i10 - i36;
                float f13 = i37;
                float f14 = i38;
                float f15 = i37 + i35;
                float f16 = i38 + i35;
                canvas.drawLine(f13, f14, f15, f16, y.Y(i16, a0.i(2.0f)));
                canvas.drawLine(f13, f16, f15, f14, y.Y(i16, a0.i(2.0f)));
            }
            float f17 = 1.0f - c10;
            float f18 = (1.0f - this.Q0) * f17 * f10;
            if (f18 != 0.0f) {
                if (this.W0 != 2) {
                    if (this.f18040b1) {
                        i25 = d.a(f18, ae.j.u());
                        if (f18034g1 == null) {
                            int i39 = a0.i(9.0f);
                            int i40 = a0.i(4.0f);
                            Path path2 = new Path();
                            f18034g1 = path2;
                            path2.setFillType(Path.FillType.EVEN_ODD);
                            f18034g1.moveTo((-i39) / 2, 0.0f);
                            f18034g1.lineTo(i39 / 2, 0.0f);
                            f18034g1.lineTo(0.0f, i40);
                            f18034g1.close();
                        }
                        path = f18034g1;
                        i23 = a0.i(3.5f);
                        i22 = i10 - ((i23 / 2) + a0.i(1.0f));
                        i24 = a0.i(0.2f);
                    } else {
                        i25 = d.b((int) (f18 * 255.0f), -1);
                        if (f18033f1 == null) {
                            int i41 = a0.i(7.0f);
                            int i42 = a0.i(3.0f);
                            Path path3 = new Path();
                            f18033f1 = path3;
                            path3.setFillType(Path.FillType.EVEN_ODD);
                            f18033f1.moveTo((-i41) / 2, 0.0f);
                            f18033f1.lineTo(i41 / 2, 0.0f);
                            f18033f1.lineTo(0.0f, i42);
                            f18033f1.close();
                        }
                        path = f18033f1;
                        i23 = a0.i(2.5f);
                        i22 = i10 - ((i23 / 2) + a0.i(1.0f));
                        i24 = a0.i(0.2f);
                    }
                    int i43 = i22 + i24;
                    int i44 = i25;
                    int i45 = i23 / 2;
                    float f19 = i43 + i23;
                    canvas.drawRect(i11 - i45, i43, i45 + i11, f19, y.g(i44));
                    canvas.save();
                    canvas2.translate(i11, f19);
                    canvas2.drawPath(path, y.g(i44));
                    canvas.restore();
                    return;
                }
                float b10 = b();
                if (b10 != 0.0f) {
                    if (this.f18040b1) {
                        i18 = a0.i(2.0f);
                        i19 = a0.i(2.5f) + i18;
                        i17 = a0.i(5.5f);
                    } else {
                        i18 = a0.i(2.0f);
                        i19 = a0.i(2.0f) + i18;
                        i17 = a0.i(4.5f);
                    }
                    int i46 = i17;
                    int i47 = i18;
                    int i48 = (int) ((i46 + i19) * b10);
                    int i49 = i48 < i19 ? i48 : i19;
                    int i50 = i48 >= i19 ? i48 - i19 : 0;
                    int a10 = this.f18040b1 ? d.a(f18, ae.j.u()) : (((int) (f18 * 255.0f)) << 24) | 16777215;
                    if (i48 > 0) {
                        canvas.save();
                        int i51 = -a0.i(2.0f);
                        int i52 = a0.i(this.f18040b1 ? 2.25f : 2.15f);
                        if (f17 != 1.0f) {
                            canvas2.scale(f17, f17, i11, i10);
                        }
                        canvas2.translate(i51, i52);
                        canvas2.rotate(-45.0f, i51 + i11, i52 + i10);
                        float f20 = i11;
                        float f21 = i10;
                        float f22 = i11 + i47;
                        float f23 = i10 + i49;
                        canvas.drawRect(f20, f21, f22, f23, y.g(a10));
                        if (i50 > 0) {
                            canvas.drawRect(f22, i21 - i47, i20 + i50, f23, y.g(a10));
                        }
                        canvas.restore();
                    }
                }
            }
        }
    }

    public void q0(boolean z10) {
        if (this.f18060t0 != z10) {
            this.f18060t0 = z10;
            D();
        }
    }

    public void r(Canvas canvas, int i10, int i11, float f10, boolean z10) {
        float f11;
        float f12 = this.f18066z0;
        if (!z10) {
            float f13 = this.f18064x0;
            if (f13 <= 0.0f || f13 >= 1.0f) {
                if (f12 == -1.0f) {
                    this.f18066z0 = 1.0f;
                    f11 = 1.0f;
                } else {
                    f11 = f12;
                }
                ce.b.t(canvas, i10, i11, a0.i(13.0f), this.f18065y0, f12, f11, this.Q0, d.a(f10, -1));
            }
        }
        float f14 = this.f18064x0;
        this.f18066z0 = f14;
        f11 = f14;
        ce.b.t(canvas, i10, i11, a0.i(13.0f), this.f18065y0, f12, f11, this.Q0, d.a(f10, -1));
    }

    public final void r0(int i10, boolean z10) {
        if (!z10 || !S0() || this.J0 == i10 || this.O0 != 1.0f) {
            k kVar = this.M0;
            if (kVar != null) {
                kVar.l(0.0f);
            }
            this.K0 = 0;
            this.L0 = 0.0f;
            this.J0 = i10;
            D();
            return;
        }
        this.K0 = i10;
        k kVar2 = this.M0;
        if (kVar2 == null) {
            this.M0 = new k(0, this, f18032e1, 210L, this.L0);
        } else if (kVar2.o() > 0.5f) {
            this.M0.l(0.0f);
            this.L0 = 0.0f;
        }
        this.M0.i(1.0f);
    }

    public float s() {
        return this.O0 * this.f18054n0;
    }

    public void s0(boolean z10) {
        this.N0 = z10;
    }

    public final int t() {
        return N() ? O() ? R.drawable.deproko_baseline_close_10 : R.drawable.deproko_baseline_close_18 : R.drawable.deproko_baseline_close_24;
    }

    public void t0(boolean z10) {
        this.Y = z10;
    }

    public TdApi.File u() {
        return this.M;
    }

    public final void u0(boolean z10, boolean z11) {
        if (this.S0 != z10) {
            this.S0 = z10;
            if (this.T0 == null) {
                m2 m2Var = new m2(this.f18035a, a0.i(22.0f));
                this.T0 = m2Var;
                m2Var.v(this.U0, false);
                this.T0.r();
                this.T0.d(x());
                f();
                Q();
                if (this.X0) {
                    this.T0.D();
                }
                this.T0.E(this.F0);
            }
            float f10 = 1.0f;
            if (!z11 || this.O0 <= 0.0f) {
                k kVar = this.R0;
                if (kVar != null) {
                    kVar.l(z10 ? 1.0f : 0.0f);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                I0(f10);
                return;
            }
            if (this.R0 == null) {
                this.R0 = new k(2, this, db.b.f7287b, 210L, this.Q0);
            }
            k kVar2 = this.R0;
            if (!z10) {
                f10 = 0.0f;
            }
            kVar2.i(f10);
        }
    }

    public long v() {
        return this.W;
    }

    public void v0() {
        this.X = true;
    }

    public TdApi.Message w() {
        return this.f18057q0;
    }

    public void w0(boolean z10, boolean z11) {
        if (this.A0 != z10) {
            this.A0 = z10;
            E0(z10 ? 1.0f : 0.0f, z11 && S0());
        }
    }

    public final int x() {
        if (this.f18040b1) {
            return d.a(this.Q0 * this.O0, ae.j.L(this.S));
        }
        return (((int) ((this.Q0 * 255.0f) * this.O0)) << 24) | 16777215;
    }

    public void x0(boolean z10) {
        this.f18040b1 = true;
        f();
        if (z10) {
            ya.o1().w2().T0(this.f18038b, this.f18057q0, this);
        }
    }

    @Override
    public void x6(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10) {
        TdApi.File file;
        o0.f fVar;
        if (this.f18038b == o6Var && (file = this.M) != null && file.f19913id == i10 && (fVar = this.f18059s0) != null) {
            fVar.x6(o6Var, j10, j11, i10, f10, j12, j13, z10);
        }
    }

    public int y() {
        TdApi.File file = this.M;
        if (file == null) {
            return 0;
        }
        TdApi.RemoteFile remoteFile = file.remote;
        return remoteFile.isUploadingActive ? remoteFile.uploadedSize : file.local.downloadedSize;
    }

    public void y0(boolean z10) {
        if (this.f18043c1 != z10) {
            this.f18043c1 = z10;
            if (z10) {
                E0(this.A0 ? 1.0f : 0.0f, false);
            }
        }
    }

    public int z() {
        if (N()) {
            return Math.min(a0.i(this.f18049i0 == 0 ? 18.0f : 12.0f), Math.min(this.D0 - this.B0, this.E0 - this.C0) / 2);
        }
        int i10 = this.f18041c;
        return Math.min(a0.i((i10 == 8 || i10 == 16 || i10 == 2) ? 25.0f : 28.0f), Math.min(this.D0 - this.B0, this.E0 - this.C0) / 2);
    }

    public void z0(String str) {
        this.N = str;
    }
}
