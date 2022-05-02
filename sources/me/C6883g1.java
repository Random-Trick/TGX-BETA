package me;

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
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import gd.AbstractC4761s4;
import gd.C4779t2;
import id.C5340e0;
import java.io.File;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p067ed.C4183a;
import p080fb.AbstractC4345j;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5143t;
import p193nb.C7321e;
import p292ud.C9773p0;
import p350yd.C10536ab;
import p350yd.C10756j9;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C6883g1 implements C10756j9.AbstractC10759c, C3950k.AbstractC3952b, C9773p0.AbstractC9779f {
    public static final Handler f21653d1 = new HandlerC6884a(Looper.getMainLooper());
    public static final Interpolator f21654e1 = new DecelerateInterpolator(0.72f);
    public static Path f21655f1;
    public static Path f21656g1;
    public boolean f21657A0;
    public int f21658B0;
    public int f21659C0;
    public int f21660D0;
    public int f21661E0;
    public AbstractC4345j f21662F0;
    public boolean f21663G0;
    public int f21664H0;
    public int f21665I0;
    public int f21666J0;
    public int f21667K0;
    public float f21668L0;
    public TdApi.File f21669M;
    public C3950k f21670M0;
    public String f21671N;
    public boolean f21672N0;
    public boolean f21673O;
    public boolean f21675P;
    public C3950k f21676P0;
    public boolean f21677Q;
    public float f21678Q0;
    public int f21679R;
    public C3950k f21680R0;
    public boolean f21682S0;
    public int f21683T;
    public RunnableC6969m2 f21684T0;
    public float f21686U0;
    public long f21687V;
    public float f21688V0;
    public long f21689W;
    public int f21690W0;
    public boolean f21691X;
    public boolean f21692X0;
    public boolean f21693Y;
    public AbstractC4761s4 f21694Y0;
    public boolean f21695Z;
    public float f21696Z0;
    public final AbstractView$OnTouchListenerC7889a f21697a;
    public C3950k f21699a1;
    public final C10930q6 f21700b;
    public boolean f21702b1;
    public final int f21703c;
    public boolean f21705c1;
    public float f21706d0;
    public boolean f21707e0;
    public boolean f21708f0;
    public boolean f21709g0;
    public boolean f21710h0;
    public int f21711i0;
    public int f21712j0;
    public C3940f f21713k0;
    public Drawable f21714l0;
    public int f21715m0;
    public AbstractC6886c f21717o0;
    public AbstractC6885b f21718p0;
    public TdApi.Message f21719q0;
    public C9773p0.AbstractC9776c f21720r0;
    public C9773p0.AbstractC9779f f21721s0;
    public boolean f21722t0;
    public boolean f21723u0;
    public boolean f21724v0;
    public C3950k f21725w0;
    public float f21726x0;
    public Path f21727y0;
    public float f21728z0;
    public final Rect f21698a0 = new Rect();
    public final RectF f21701b0 = new RectF();
    public final RectF f21704c0 = new RectF();
    public int f21685U = R.drawable.baseline_file_download_24;
    public int f21681S = 1711276032;
    public float f21674O0 = 1.0f;
    public float f21716n0 = 1.0f;

    public class HandlerC6884a extends Handler {
        public HandlerC6884a(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((C6883g1) message.obj).m18679D();
            } else if (i == 1) {
                ((C6883g1) message.obj).m18626h0(message.arg1, true);
            } else if (i == 2) {
                ((C6883g1) message.obj).m18674F0(Float.intBitsToFloat(message.arg1), Float.intBitsToFloat(message.arg2));
            }
        }
    }

    public interface AbstractC6885b {
        TdApi.File mo18589a(TdApi.File file);
    }

    public interface AbstractC6886c {
        void mo15929b(TdApi.File file, int i);

        boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j);

        void mo15923f(TdApi.File file, float f);
    }

    public C6883g1(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, int i, boolean z, long j, long j2) {
        this.f21697a = aVar;
        this.f21700b = q6Var;
        this.f21703c = i;
        this.f21673O = z;
        this.f21687V = j;
        this.f21689W = j2;
    }

    public void m18659N(AbstractC9323v4 v4Var) {
        C7389v0.m16607m2(v4Var, C7389v0.m16565x0(this.f21669M.local.path), new File(this.f21669M.local.path), this.f21671N, 0);
    }

    public int m18685A() {
        TdApi.File file = this.f21669M;
        if (file != null) {
            return file.expectedSize;
        }
        return 0;
    }

    public void m18684A0(int i) {
        if (this.f21685U != i) {
            this.f21685U = i;
            if (this.f21690W0 == 0) {
                m18610p0(i, false);
                m18640a0(i != 0 ? 1.0f : 0.0f, false);
            }
        }
    }

    public final float m18683B(float f) {
        if (!this.f21675P) {
            return f;
        }
        if (f > 0.0f) {
            return (f * 0.65f) + 0.35f;
        }
        if (C5070i.m24062i(this.f21669M.local.path)) {
            return 0.0f;
        }
        C5340e0.C5343c Y = this.f21700b.m2429h5().m23123Y(this.f21669M.local.path);
        float g = Y != null ? (float) Y.m23175g() : 1.0f;
        return g == 1.0f ? (f * 0.65f) + 0.35f : g * 0.35f;
    }

    public final void m18682B0(float f) {
        if (this.f21726x0 != f) {
            this.f21726x0 = f;
            m18657O();
            m18681C();
        }
    }

    public void m18681C() {
        AbstractC4345j jVar = this.f21662F0;
        if (jVar == null) {
            return;
        }
        if (this.f21692X0) {
            jVar.invalidate();
            return;
        }
        int y = m18593y();
        int d = m18635d();
        int e = m18633e();
        int i = y / 2;
        this.f21662F0.mo28230d(d - i, e - i, d + i, e + i);
    }

    public final void m18680C0(float f, boolean z) {
        if (z) {
            if (this.f21725w0 == null) {
                this.f21725w0 = new C3950k(3, this, C2057b.f7280b, 138L, this.f21726x0);
            }
            this.f21725w0.m29546i(f);
            return;
        }
        C3950k kVar = this.f21725w0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        m18682B0(f);
    }

    public void m18679D() {
        if (this.f21673O) {
            AbstractC4345j jVar = this.f21662F0;
            if (jVar == null || !jVar.mo18573a()) {
                Log.m14719i("Warning: FileProgressComponent.invalidateContent ignored", new Object[0]);
            }
        }
    }

    public void m18678D0(TdApi.Message message, C9773p0.AbstractC9776c cVar) {
        m18676E0(message, cVar, null);
    }

    public boolean m18677E() {
        TdApi.File file;
        return this.f21690W0 == 2 || ((file = this.f21669M) != null && C4779t2.m25599T2(file));
    }

    public void m18676E0(TdApi.Message message, C9773p0.AbstractC9776c cVar, C9773p0.AbstractC9779f fVar) {
        if (this.f21669M == null) {
            m18624i0(R.drawable.baseline_play_arrow_36_white);
            m18614n0(C4779t2.m25495j1(message), message);
            this.f21719q0 = message;
            this.f21720r0 = cVar;
            this.f21721s0 = fVar;
            this.f21727y0 = new Path();
            m18631f();
            C10536ab.m4667o1().m4636w2().m7026r(this.f21700b, message, this);
            Path path = this.f21727y0;
            int i = C1357a0.m37544i(13.0f);
            float f = this.f21726x0;
            this.f21728z0 = f;
            C1359b.m37520b(path, i, -1.0f, f);
            return;
        }
        throw new IllegalStateException("setPlayPauseObject called after setFile");
    }

    public boolean m18675F() {
        return this.f21690W0 == 3;
    }

    public void m18674F0(float f, float f2) {
        if (this.f21686U0 != f || this.f21688V0 != f2) {
            boolean z = false;
            if (Log.isEnabled(Log.TAG_TDLIB_FILES) && Log.checkLogLevel(3)) {
                Object[] objArr = new Object[5];
                TdApi.File file = this.f21669M;
                objArr[0] = Integer.valueOf(file != null ? file.f25376id : 0);
                objArr[1] = Integer.valueOf((int) (this.f21686U0 * 100.0f));
                objArr[2] = Integer.valueOf((int) (f * 100.0f));
                objArr[3] = Integer.valueOf((int) (this.f21688V0 * 100.0f));
                objArr[4] = Integer.valueOf((int) (100.0f * f2));
                Log.m14721i((int) Log.TAG_TDLIB_FILES, "setProgress id=%d done=%d->%d%% visual=%d->%d%%", objArr);
            }
            this.f21686U0 = f;
            this.f21688V0 = f2;
            RunnableC6969m2 m2Var = this.f21684T0;
            if (m2Var != null) {
                if (m18656O0() && this.f21674O0 > 0.0f) {
                    z = true;
                }
                m2Var.m18268v(f2, z);
            }
            AbstractC6886c cVar = this.f21717o0;
            if (cVar != null && this.f21690W0 == 1) {
                cVar.mo15923f(this.f21669M, f);
            }
        }
    }

    public boolean m18673G() {
        return this.f21690W0 == 2;
    }

    public final void m18672G0(float f) {
        if (this.f21678Q0 != f) {
            this.f21678Q0 = f;
            if (this.f21702b1) {
                m18657O();
            }
            m18681C();
        }
    }

    public boolean m18671H() {
        return this.f21690W0 == 1;
    }

    public void m18670H0(float f) {
        if (this.f21716n0 != f) {
            this.f21716n0 = f;
            m18681C();
        }
    }

    public boolean m18669I() {
        TdApi.File file = this.f21669M;
        if (file != null && !file.local.isDownloadingCompleted) {
            TdApi.RemoteFile remoteFile = file.remote;
            if (!remoteFile.isUploadingCompleted && remoteFile.uploadedSize == 0) {
                return true;
            }
        }
        return false;
    }

    public void m18668I0(AbstractC6886c cVar) {
        this.f21717o0 = cVar;
    }

    public boolean m18667J() {
        return this.f21702b1;
    }

    public void m18666J0() {
        this.f21692X0 = true;
        RunnableC6969m2 m2Var = this.f21684T0;
        if (m2Var != null) {
            m2Var.m18292D();
        }
    }

    public boolean m18665K() {
        return C4779t2.m25569Y2(this.f21669M);
    }

    public void m18664K0(boolean z) {
        this.f21707e0 = z;
        this.f21727y0 = new Path();
        m18600u0(false, false);
        Path path = this.f21727y0;
        int i = C1357a0.m37544i(18.0f);
        float f = this.f21726x0;
        this.f21728z0 = f;
        C1359b.m37520b(path, i, -1.0f, f);
    }

    public boolean m18663L() {
        return this.f21707e0;
    }

    public void m18662L0(boolean z, boolean z2, int i, RectF rectF, C3940f fVar) {
        int i2 = this.f21711i0;
        boolean z3 = this.f21708f0 != z || !this.f21701b0.equals(rectF);
        this.f21708f0 = z;
        this.f21710h0 = z2;
        this.f21713k0 = fVar;
        this.f21711i0 = i;
        this.f21701b0.set(rectF);
        m18650R0();
        if (i2 != this.f21711i0) {
            m18631f();
            if (this.f21690W0 == 1) {
                m18610p0(m18605s(), false);
            }
        }
        if (z3) {
            m18657O();
        }
    }

    public final boolean m18661M() {
        return this.f21711i0 != 0;
    }

    public void m18660M0(boolean z) {
        this.f21709g0 = z;
    }

    public void m18658N0(AbstractC4345j jVar) {
        this.f21662F0 = jVar;
        RunnableC6969m2 m2Var = this.f21684T0;
        if (m2Var != null) {
            m2Var.m18291E(jVar);
        }
    }

    public final void m18657O() {
        int i;
        int i2;
        if (this.f21684T0 != null) {
            TdApi.Message message = this.f21719q0;
            if ((message != null && C4183a.m28616c(message) && !this.f21695Z) || (m18663L() && this.f21710h0)) {
                int d = m18635d();
                int e = m18633e();
                if (this.f21702b1) {
                    int i3 = C1357a0.m37544i(11.0f);
                    i = (int) (C1357a0.m37544i(7.0f) + ((i3 - i2) * this.f21678Q0));
                    this.f21684T0.m18267w(i);
                } else {
                    double radians = Math.toRadians(45.0d);
                    double d2 = (this.f21660D0 - this.f21658B0) / 2;
                    d += (int) (Math.sin(radians) * d2);
                    e += (int) (d2 * Math.cos(radians));
                    i = C1357a0.m37544i(5.0f);
                    this.f21684T0.m18267w(i - C1357a0.m37544i(2.0f));
                }
                this.f21684T0.m18274p(d - i, e - i, d + i, e + i);
            } else if (m18663L()) {
                m18650R0();
                this.f21684T0.m18267w(m18593y() - C1357a0.m37544i(4.0f));
                RunnableC6969m2 m2Var = this.f21684T0;
                Rect rect = this.f21698a0;
                m2Var.m18274p(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                this.f21684T0.m18267w(m18593y() - C1357a0.m37544i(4.0f));
                this.f21684T0.m18274p(this.f21658B0, this.f21659C0, this.f21660D0, this.f21661E0);
            }
        }
    }

    public final boolean m18656O0() {
        AbstractC4345j jVar = this.f21662F0;
        return jVar != null && jVar.mo28227g() && !this.f21672N0;
    }

    public void m18655P() {
        RunnableC6969m2 m2Var = this.f21684T0;
        if (m2Var != null) {
            m2Var.m18277m();
        }
    }

    public void m18654P0(Rect rect) {
        int d = m18635d();
        int e = m18633e();
        int y = m18593y();
        rect.set(d - y, e - y, d + y, e + y);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m18632e0(f);
        } else if (i == 1) {
            m18642Z(f);
        } else if (i == 2) {
            m18672G0(f);
        } else if (i == 3) {
            m18682B0(f);
        } else if (i == 4) {
            m18628g0(1.0f - f);
        }
    }

    public boolean m18653Q(View view, MotionEvent motionEvent) {
        AbstractC4345j jVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f21663G0) {
                        this.f21663G0 = false;
                        return true;
                    }
                } else if (this.f21663G0 && Math.max(Math.abs(this.f21664H0 - x), Math.abs(this.f21665I0 - y)) > C1357a0.m37537p()) {
                    this.f21663G0 = false;
                    return true;
                }
            } else if (this.f21663G0) {
                if (m18647U(view) && (jVar = this.f21662F0) != null) {
                    jVar.mo28229e();
                }
                return true;
            }
            return this.f21663G0;
        }
        this.f21664H0 = (int) x;
        this.f21665I0 = (int) y;
        if (x >= this.f21658B0 && x <= this.f21660D0 && y >= this.f21659C0 && y <= this.f21661E0 && (!this.f21702b1 || this.f21690W0 != 2)) {
            z = true;
        }
        this.f21663G0 = z;
        return z;
    }

    public void m18652Q0(long j, long j2, boolean z) {
        if (this.f21689W == j) {
            this.f21689W = j2;
            int i = 0;
            this.f21724v0 = false;
            if (!z) {
                i = 3;
            } else if (C4779t2.m25587V2(this.f21669M)) {
                i = 2;
            }
            m18626h0(i, m18656O0());
        }
        TdApi.Message message = this.f21719q0;
        if (message != null && message.f25409id == j) {
            message.f25409id = j2;
        }
    }

    public final boolean m18651R() {
        final AbstractC9323v4<?> t;
        if (this.f21671N == null || (t = C1379j0.m37306t(this.f21697a)) == null) {
            return false;
        }
        return m18649S(t, new Runnable() {
            @Override
            public final void run() {
                C6883g1.this.m18659N(t);
            }
        });
    }

    public final void m18650R0() {
        int i = this.f21658B0;
        int i2 = this.f21711i0;
        int i3 = (i + C1357a0.m37544i(i2 == 2 ? 4.0f : i2 == 1 ? 8.0f : 14.0f)) - this.f21712j0;
        int i4 = this.f21659C0;
        int i5 = this.f21711i0;
        int i6 = ((i4 + C1357a0.m37544i(i5 == 2 ? 3.0f : i5 == 1 ? 6.0f : 12.0f)) + (this.f21708f0 ? C1357a0.m37544i(16.0f) : 0)) - this.f21712j0;
        this.f21698a0.set(i3, i6, (m18593y() * 2) + i3, (m18593y() * 2) + i6);
    }

    @Override
    public void mo3954R2(C10930q6 q6Var, int i, int i2, TdApi.File file) {
        TdApi.File file2;
        boolean z = Looper.getMainLooper() == Looper.myLooper();
        if (i2 == 2) {
            if (file != null) {
                TdApi.File file3 = this.f21669M;
                if (file3 != null) {
                    C7321e.m16907u(file, file3);
                }
                if (this.f21673O) {
                    Handler handler = f21653d1;
                    handler.sendMessage(Message.obtain(handler, 0, this));
                }
            }
        } else if (!(file == null || (file2 = this.f21669M) == null)) {
            C7321e.m16907u(file, file2);
        }
        if (z) {
            m18626h0(i2, m18656O0());
            return;
        }
        Handler handler2 = f21653d1;
        handler2.sendMessage(Message.obtain(handler2, 1, i2, 0, this));
    }

    public boolean m18649S(AbstractC9323v4<?> v4Var, Runnable runnable) {
        if (this.f21669M == null || this.f21703c != 8) {
            return false;
        }
        if (v4Var != null && v4Var.mo4348c() == this.f21700b) {
            if ((this.f21679R & 1) != 0) {
                v4Var.mo4348c().m2485dd().m3758O7(v4Var, this.f21669M, null, runnable);
            } else {
                runnable.run();
            }
        }
        return true;
    }

    public void m18648T(boolean z) {
        if (this.f21669M != null && this.f21690W0 == 1) {
            this.f21700b.m2413i5().m3981m(this.f21669M.f25376id, z, false);
        }
    }

    public boolean m18647U(View view) {
        return m18645W(view, false);
    }

    public boolean m18646V(View view, float f, float f2) {
        this.f21664H0 = (int) f;
        this.f21665I0 = (int) f2;
        return m18645W(view, false);
    }

    @Override
    public void mo3953V0(TdApi.File file) {
        boolean z = !this.f21677Q && file.local.isDownloadingCompleted;
        C7321e.m16907u(file, this.f21669M);
        float s1 = C4779t2.m25432s1(file);
        float B = m18683B(s1);
        Handler handler = f21653d1;
        handler.sendMessage(Message.obtain(handler, 2, Float.floatToIntBits(s1), Float.floatToIntBits(B), this));
        if (z) {
            this.f21677Q = true;
            if (this.f21673O) {
                handler.sendMessage(Message.obtain(handler, 0, this));
            }
        }
    }

    @Override
    public void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        TdApi.File file;
        C9773p0.AbstractC9779f fVar;
        if (this.f21700b == q6Var && (file = this.f21669M) != null && file.f25376id == i && (fVar = this.f21721s0) != null) {
            fVar.mo6973V2(q6Var, j, j2, i, f, j3, j4, z);
        }
    }

    public boolean m18645W(View view, boolean z) {
        AbstractC6886c cVar;
        TdApi.Message message;
        AbstractC6886c cVar2;
        if (this.f21693Y && (!m18663L() || !this.f21701b0.contains(this.f21664H0, this.f21665I0))) {
            return !z && (cVar2 = this.f21717o0) != null && cVar2.mo15925e(this, view, this.f21669M, this.f21689W);
        }
        if (this.f21702b1 || this.f21669M == null || (message = this.f21719q0) == null || ((!C4183a.m28616c(message) || this.f21695Z) && this.f21690W0 != 2)) {
            int i = this.f21690W0;
            if (i != 0) {
                if (i == 1) {
                    TdApi.File file = this.f21669M;
                    if (file != null) {
                        if (file.remote.isUploadingActive || this.f21724v0) {
                            this.f21700b.m2754M4(this.f21687V, new long[]{this.f21689W}, true);
                        } else {
                            this.f21700b.m2413i5().m3981m(this.f21669M.f25376id, false, true);
                        }
                        return true;
                    }
                } else if (i == 2 && ((!z && (cVar = this.f21717o0) != null && cVar.mo15925e(this, view, this.f21669M, this.f21689W)) || m18651R())) {
                    return true;
                }
            } else if (this.f21669M != null) {
                this.f21700b.m2413i5().m3975p(this.f21669M);
                return true;
            }
            return false;
        }
        TdApi.File file2 = this.f21669M;
        if (file2.remote.isUploadingCompleted || file2.f25376id == -1) {
            C10536ab.m4667o1().m4636w2().m7105H0(this.f21700b, this.f21719q0, this.f21720r0);
        }
        return true;
    }

    public boolean m18644X(View view) {
        this.f21663G0 = false;
        return false;
    }

    public void m18643Y(TdApi.File file, TdApi.Message message) {
        m18614n0(file, message);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 1.0f) {
            C3950k kVar2 = this.f21670M0;
            if (kVar2 != null) {
                kVar2.m29543l(0.0f);
            }
            this.f21668L0 = 0.0f;
        }
    }

    public final void m18642Z(float f) {
        if (this.f21674O0 != f) {
            this.f21674O0 = f;
            m18681C();
        }
    }

    public final void m18640a0(float f, boolean z) {
        if (z && m18656O0()) {
            float f2 = this.f21674O0;
            if (!(f2 == f && this.f21676P0 == null)) {
                if (this.f21676P0 == null) {
                    this.f21676P0 = new C3950k(1, this, C2057b.f7280b, 240L, f2);
                }
                this.f21676P0.m29546i(f);
                return;
            }
        }
        C3950k kVar = this.f21676P0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        m18642Z(f);
    }

    public final float m18639b() {
        if (this.f21690W0 != 2) {
            return 0.0f;
        }
        C3950k kVar = this.f21670M0;
        if (kVar == null || !kVar.m29533v()) {
            return 1.0f;
        }
        float f = this.f21668L0;
        if (f <= 0.5f) {
            return 0.0f;
        }
        return (f - 0.5f) / 0.5f;
    }

    public void m18638b0(int i) {
        this.f21723u0 = false;
        this.f21681S = i;
    }

    public final float m18637c() {
        if (this.f21690W0 == 2) {
            return (1.0f - this.f21696Z0) * 1.0f;
        }
        return 0.0f;
    }

    public void m18636c0(int i) {
        this.f21723u0 = true;
        this.f21681S = i;
    }

    public int m18635d() {
        return (this.f21658B0 + this.f21660D0) >> 1;
    }

    public void m18634d0(AbstractC4761s4 s4Var) {
        this.f21694Y0 = s4Var;
    }

    public int m18633e() {
        return (this.f21659C0 + this.f21661E0) >> 1;
    }

    public final void m18632e0(float f) {
        if (this.f21668L0 != f) {
            this.f21668L0 = f;
            int i = this.f21667K0;
            if (i != 0 && f >= 0.5f) {
                this.f21666J0 = i;
                this.f21667K0 = 0;
            }
        }
        m18681C();
    }

    public final void m18631f() {
        int i;
        if (this.f21684T0 != null) {
            boolean z = (C4183a.m28616c(this.f21719q0) && !this.f21695Z) || (m18663L() && this.f21710h0);
            RunnableC6969m2 m2Var = this.f21684T0;
            float f = 1.5f;
            if (!m18663L() || !m18661M()) {
                if (this.f21724v0 || !z) {
                    i = C1357a0.m37544i(3.0f);
                    m2Var.m18293C(i);
                } else if (this.f21702b1) {
                    f = 2.0f;
                }
            }
            i = C1357a0.m37544i(f);
            m2Var.m18293C(i);
        }
    }

    public void m18630f0(int i, int i2, int i3, int i4) {
        if (this.f21658B0 != i || this.f21659C0 != i2 || this.f21660D0 != i3 || this.f21661E0 != i4) {
            this.f21658B0 = i;
            this.f21659C0 = i2;
            this.f21660D0 = i3;
            this.f21661E0 = i4;
            m18657O();
        }
    }

    public final void m18629g(boolean z) {
        if (this.f21719q0 != null) {
            if (z) {
                C3950k kVar = this.f21699a1;
                if (kVar == null) {
                    C3950k kVar2 = new C3950k(4, this, C2057b.f7280b, 180L);
                    this.f21699a1 = kVar2;
                    kVar2.m29555F(2000L);
                } else {
                    kVar.m29543l(0.0f);
                }
                this.f21696Z0 = 1.0f;
                this.f21699a1.m29546i(1.0f);
                return;
            }
            C3950k kVar3 = this.f21699a1;
            if (kVar3 != null) {
                kVar3.m29543l(0.0f);
            }
            this.f21696Z0 = 0.0f;
        }
    }

    public final void m18628g0(float f) {
        if (this.f21696Z0 != f) {
            this.f21696Z0 = f;
            m18681C();
        }
    }

    public AbstractView$OnTouchListenerC7889a m18627h() {
        return this.f21697a;
    }

    public void m18626h0(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: me.C6883g1.m18626h0(int, boolean):void");
    }

    public void m18625i() {
        if (this.f21669M != null) {
            this.f21700b.m2413i5().m4030D0(this.f21669M.f25376id, this);
        }
        if (this.f21719q0 != null) {
            C10536ab.m4667o1().m4636w2().m7081T0(this.f21700b, this.f21719q0, this);
        }
    }

    public void m18624i0(int i) {
        m18622j0(i, m18656O0());
    }

    public boolean m18623j() {
        return m18619l(null);
    }

    public void m18622j0(int i, boolean z) {
        if (this.f21683T != i) {
            this.f21683T = i;
            if (this.f21690W0 == 2) {
                m18610p0(i, z);
                m18640a0(i != 0 ? 1.0f : 0.0f, z);
            }
        }
    }

    public boolean m18621k(long j) {
        TdApi.Chat U2;
        if (this.f21669M == null || (U2 = this.f21700b.m2632U2(j)) == null) {
            return false;
        }
        return m18619l(U2.type);
    }

    public void m18620k0(TdApi.Document document) {
        boolean a = C4183a.m28618a(document);
        m18624i0(a ? R.drawable.baseline_palette_24 : R.drawable.baseline_insert_drive_file_24);
        this.f21679R = C5063c.m24139h(this.f21679R, 1, a);
    }

    public boolean m18619l(TdApi.ChatType chatType) {
        if (this.f21669M != null) {
            if (this.f21700b.m2413i5().m3977o(this.f21669M, chatType, this.f21703c, this.f21690W0 == 0)) {
                return true;
            }
        }
        return false;
    }

    public void m18618l0(AbstractC6885b bVar) {
        this.f21718p0 = bVar;
    }

    public void m18617m() {
        if (this.f21669M == null) {
            return;
        }
        if (this.f21690W0 == 0 || !this.f21700b.m2413i5().m4016P(this.f21669M.f25376id)) {
            this.f21700b.m2413i5().m3975p(this.f21669M);
        }
    }

    public void m18616m0(TdApi.File file) {
        m18614n0(file, null);
    }

    public <T extends View & AbstractC5143t> void m18615n(T t, Canvas canvas) {
        float f;
        Canvas canvas2;
        int i;
        boolean z;
        int i2;
        Drawable drawable;
        C3940f fVar;
        boolean z2;
        boolean z3 = false;
        boolean z4 = C4183a.m28616c(this.f21719q0) && !this.f21695Z;
        float f2 = this.f21674O0 * this.f21716n0;
        if ((this.f21669M == null || f2 == 0.0f || this.f21702b1) ? false : true) {
            int d = m18635d();
            int e = m18633e();
            if (m18663L()) {
                if (this.f21698a0.width() == 0) {
                    m18650R0();
                }
                d = this.f21698a0.centerX();
                e = this.f21698a0.centerY();
            }
            int i3 = d;
            int i4 = e;
            if (f2 == 1.0f) {
                i = this.f21723u0 ? C11524j.m228N(this.f21681S) : this.f21681S;
            } else {
                i = C5064d.m24132a(f2, this.f21723u0 ? C11524j.m228N(this.f21681S) : this.f21681S);
            }
            if (m18663L()) {
                canvas.drawCircle(m18635d(), m18633e(), C1357a0.m37544i(28.0f), C1410y.m37042g(i));
                m18609q(canvas, m18635d(), m18633e(), f2, true);
                if (!this.f21704c0.isEmpty()) {
                    canvas.save();
                    canvas.clipRect(this.f21704c0);
                    canvas.translate(this.f21706d0, 0.0f);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f21710h0) {
                    m18611p(canvas, f2);
                }
                z = z2;
            } else {
                canvas.drawCircle(i3, i4, m18593y(), C1410y.m37042g(i));
                z = false;
            }
            if (z4) {
                m18609q(canvas, i3, i4, f2, true);
            } else {
                int i5 = this.f21666J0;
                if (i5 != 0 && ((i5 != this.f21683T || !this.f21722t0) && (!m18663L() || !this.f21710h0))) {
                    boolean z5 = m18663L() && !m18661M() && (fVar = this.f21713k0) != null && fVar.m29584i();
                    Paint W = C1410y.m37058W(-1);
                    float f3 = this.f21668L0;
                    float f4 = f3 <= 0.5f ? f3 / 0.5f : 1.0f - ((f3 - 0.5f) / 0.5f);
                    float f5 = z5 ? 0.0f : f4;
                    float f6 = (1.0f - f4) * f2;
                    int i6 = (f6 > 1.0f ? 1 : (f6 == 1.0f ? 0 : -1));
                    if (i6 != 0) {
                        W.setAlpha((int) (255.0f * f6));
                    }
                    boolean z6 = f5 != 0.0f;
                    if (z6) {
                        int V = C1399s0.m37202V(canvas);
                        float f7 = ((1.0f - f5) * 0.35000002f) + 0.65f;
                        canvas.scale(f7, f7, i3, i4);
                        i2 = V;
                    } else {
                        i2 = -1;
                    }
                    int i7 = this.f21666J0;
                    if (i7 != R.drawable.baseline_play_arrow_36_white || this.f21719q0 == null) {
                        f = f2;
                        canvas2 = canvas;
                        if (i6 != 0) {
                            drawable = this.f21714l0;
                            if (drawable == null || this.f21715m0 != i7) {
                                this.f21715m0 = i7;
                                drawable = C1362c.m37486f(i7);
                                this.f21714l0 = drawable;
                            }
                        } else {
                            this.f21715m0 = 0;
                            this.f21714l0 = null;
                            drawable = t.mo14041X(i7, 0);
                        }
                        C1362c.m37490b(canvas2, drawable, i3 - (drawable.getMinimumWidth() / 2.0f), i4 - (drawable.getMinimumHeight() / 2.0f), W);
                    } else {
                        int i8 = C1357a0.m37544i(13.0f);
                        Path path = this.f21727y0;
                        float f8 = this.f21728z0;
                        float f9 = this.f21726x0;
                        this.f21728z0 = f9;
                        float f10 = this.f21678Q0;
                        int a = C5064d.m24132a(f6, -1);
                        f = f2;
                        canvas2 = canvas;
                        C1359b.m37502t(canvas, i3, i4, i8, path, f8, f9, f10, a);
                    }
                    if (i6 != 0) {
                        W.setAlpha(255);
                    }
                    if (z6) {
                        C1399s0.m37204T(canvas2, i2);
                    }
                    z3 = z;
                }
            }
            f = f2;
            canvas2 = canvas;
            z3 = z;
        } else {
            f = f2;
            canvas2 = canvas;
        }
        if (z4) {
            m18611p(canvas2, f);
        }
        RunnableC6969m2 m2Var = this.f21684T0;
        if (m2Var != null && !this.f21709g0) {
            m2Var.m18286d(m18597w());
            this.f21684T0.m18287c(canvas2);
        }
        if (z3) {
            canvas.restore();
        }
    }

    public void m18614n0(TdApi.File file, TdApi.Message message) {
        TdApi.LocalFile localFile;
        TdApi.LocalFile localFile2;
        if (this.f21669M != null && !this.f21691X) {
            this.f21700b.m2413i5().m4030D0(this.f21669M.f25376id, this);
        }
        this.f21669M = file;
        int i = 0;
        if (file == null || (localFile2 = file.local) == null) {
            this.f21675P = false;
            this.f21677Q = false;
        } else {
            boolean z = localFile2.isDownloadingCompleted;
            this.f21677Q = z;
            this.f21675P = !z && !file.remote.isUploadingCompleted && message != null && message.content.getConstructor() != -1851395174;
        }
        if (message != null && this.f21700b.m2595W9(message)) {
            this.f21724v0 = true;
        }
        if (file == null) {
            m18626h0(0, m18656O0());
        } else if (this.f21724v0) {
            m18626h0(1, m18656O0());
            if (m18665K()) {
                m18674F0(1.0f, 1.0f);
            }
        } else if (message != null && C4779t2.m25611R2(message)) {
            m18626h0(3, m18656O0());
        } else if (C4779t2.m25581W2(file)) {
            m18626h0(1, m18656O0());
        } else {
            if (C4779t2.m25587V2(file)) {
                i = 2;
            }
            m18626h0(i, m18656O0());
        }
        if (file != null && !this.f21691X) {
            if (this.f21690W0 == 1 && (localFile = file.local) != null && localFile.isDownloadingActive && !this.f21700b.m2413i5().m4016P(file.f25376id)) {
                this.f21700b.m2413i5().m3975p(file);
            }
            this.f21700b.m2413i5().m4034B0(file, this);
        }
    }

    public <T extends View & AbstractC5143t> void m18613o(T t, Canvas canvas, RectF rectF, float f) {
        this.f21706d0 = f;
        this.f21704c0.set(rectF);
        m18615n(t, canvas);
    }

    public void m18612o0(boolean z) {
        if (this.f21722t0 != z) {
            this.f21722t0 = z;
            m18681C();
        }
    }

    public final void m18611p(Canvas canvas, float f) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int d;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Path path;
        int i18;
        int i19;
        int i20;
        float c = m18637c();
        if (c != 1.0f) {
            int d2 = m18635d();
            int e = m18633e();
            if (this.f21702b1) {
                int i21 = C1357a0.m37544i(12.0f);
                i4 = (int) (C1357a0.m37544i(7.0f) + ((i21 - i20) * this.f21678Q0));
                i2 = d2;
                i3 = e;
                i = 0;
            } else {
                double radians = Math.toRadians(45.0d);
                double d3 = (this.f21660D0 - this.f21658B0) / 2;
                i2 = d2 + ((int) (Math.sin(radians) * d3));
                i3 = e + ((int) (d3 * Math.cos(radians)));
                i4 = C1357a0.m37544i(5.0f);
                i = (int) (C1357a0.m37544i(1.5f) * f * (1.0f - c));
            }
            if (this.f21723u0) {
                d = C11524j.m228N(this.f21681S);
            } else {
                float f2 = this.f21726x0;
                int N = f2 != 0.0f ? C11524j.m228N(R.id.theme_color_file) : 0;
                if (f2 != 1.0f) {
                    AbstractC4761s4 s4Var = this.f21694Y0;
                    i5 = s4Var != null ? s4Var.m25834q3() : C11524j.m228N(R.id.theme_color_iconLight);
                } else {
                    i5 = 0;
                }
                d = C5064d.m24129d(i5, N, f2);
            }
            int i22 = d;
            AbstractC4761s4 s4Var2 = this.f21694Y0;
            if (s4Var2 != null) {
                i6 = s4Var2.m25986a3();
            } else {
                i6 = C5064d.m24132a(f, C11524j.m148w());
            }
            int i23 = i6;
            boolean z = this.f21702b1;
            if (!z || this.f21678Q0 <= 1.0f) {
                float f3 = 1.0f - c;
                i8 = i22;
                i7 = i3;
                i9 = i2;
                C1359b.m37516f(canvas, i2, i3, (int) (i4 * f3), 1.0f - ((f * f3) * (z ? 1.0f - this.f21678Q0 : 1.0f)), C5064d.m24132a(f, i22), i, i23);
                if (this.f21702b1) {
                    canvas.drawCircle(i9, i7, (i19 + C1357a0.m37544i(1.0f)) * this.f21678Q0, C1410y.m37042g(C11524j.m148w()));
                }
            } else {
                i8 = i22;
                i7 = i3;
                i9 = i2;
            }
            if (this.f21702b1) {
                int i24 = (int) (C1357a0.m37544i(6.5f) * this.f21678Q0);
                int i25 = i24 / 2;
                int i26 = i9 - i25;
                int i27 = i7 - i25;
                float f4 = i26;
                float f5 = i27;
                float f6 = i26 + i24;
                float f7 = i27 + i24;
                canvas.drawLine(f4, f5, f6, f7, C1410y.m37056Y(i8, C1357a0.m37544i(2.0f)));
                canvas.drawLine(f4, f7, f6, f5, C1410y.m37056Y(i8, C1357a0.m37544i(2.0f)));
            }
            float f8 = 1.0f - c;
            float f9 = (1.0f - this.f21678Q0) * f8 * f;
            if (f9 != 0.0f) {
                if (this.f21690W0 != 2) {
                    if (this.f21702b1) {
                        i18 = C5064d.m24132a(f9, C11524j.m148w());
                        if (f21656g1 == null) {
                            int i28 = C1357a0.m37544i(9.0f);
                            int i29 = C1357a0.m37544i(4.0f);
                            Path path2 = new Path();
                            f21656g1 = path2;
                            path2.setFillType(Path.FillType.EVEN_ODD);
                            f21656g1.moveTo((-i28) / 2, 0.0f);
                            f21656g1.lineTo(i28 / 2, 0.0f);
                            f21656g1.lineTo(0.0f, i29);
                            f21656g1.close();
                        }
                        path = f21656g1;
                        i16 = C1357a0.m37544i(3.5f);
                        i15 = i7 - ((i16 / 2) + C1357a0.m37544i(1.0f));
                        i17 = C1357a0.m37544i(0.2f);
                    } else {
                        i18 = C5064d.m24131b((int) (f9 * 255.0f), -1);
                        if (f21655f1 == null) {
                            int i30 = C1357a0.m37544i(7.0f);
                            int i31 = C1357a0.m37544i(3.0f);
                            Path path3 = new Path();
                            f21655f1 = path3;
                            path3.setFillType(Path.FillType.EVEN_ODD);
                            f21655f1.moveTo((-i30) / 2, 0.0f);
                            f21655f1.lineTo(i30 / 2, 0.0f);
                            f21655f1.lineTo(0.0f, i31);
                            f21655f1.close();
                        }
                        path = f21655f1;
                        i16 = C1357a0.m37544i(2.5f);
                        i15 = i7 - ((i16 / 2) + C1357a0.m37544i(1.0f));
                        i17 = C1357a0.m37544i(0.2f);
                    }
                    int i32 = i15 + i17;
                    Path path4 = path;
                    int i33 = i18;
                    int i34 = i16 / 2;
                    float f10 = i32 + i16;
                    canvas.drawRect(i9 - i34, i32, i34 + i9, f10, C1410y.m37042g(i33));
                    canvas.save();
                    canvas.translate(i9, f10);
                    canvas.drawPath(path4, C1410y.m37042g(i33));
                    canvas.restore();
                    return;
                }
                float b = m18639b();
                if (b != 0.0f) {
                    if (this.f21702b1) {
                        i11 = C1357a0.m37544i(2.0f);
                        i12 = C1357a0.m37544i(2.5f) + i11;
                        i10 = C1357a0.m37544i(5.5f);
                    } else {
                        i11 = C1357a0.m37544i(2.0f);
                        i12 = C1357a0.m37544i(2.0f) + i11;
                        i10 = C1357a0.m37544i(4.5f);
                    }
                    int i35 = i10;
                    int i36 = i11;
                    int i37 = (int) ((i35 + i12) * b);
                    int i38 = i37 < i12 ? i37 : i12;
                    int i39 = i37 >= i12 ? i37 - i12 : 0;
                    int a = this.f21702b1 ? C5064d.m24132a(f9, C11524j.m148w()) : (((int) (f9 * 255.0f)) << 24) | 16777215;
                    if (i37 > 0) {
                        canvas.save();
                        int i40 = -C1357a0.m37544i(2.0f);
                        int i41 = C1357a0.m37544i(this.f21702b1 ? 2.25f : 2.15f);
                        if (f8 != 1.0f) {
                            canvas.scale(f8, f8, i9, i7);
                        }
                        canvas.translate(i40, i41);
                        canvas.rotate(-45.0f, i40 + i9, i7 + i41);
                        float f11 = i9 + i36;
                        float f12 = i7 + i38;
                        canvas.drawRect(i9, i7, f11, f12, C1410y.m37042g(a));
                        if (i39 > 0) {
                            canvas.drawRect(f11, i14 - i36, i13 + i39, f12, C1410y.m37042g(a));
                        }
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final void m18610p0(int i, boolean z) {
        if (!z || !m18656O0() || this.f21666J0 == i || this.f21674O0 != 1.0f) {
            C3950k kVar = this.f21670M0;
            if (kVar != null) {
                kVar.m29543l(0.0f);
            }
            this.f21667K0 = 0;
            this.f21668L0 = 0.0f;
            this.f21666J0 = i;
            m18681C();
            return;
        }
        this.f21667K0 = i;
        C3950k kVar2 = this.f21670M0;
        if (kVar2 == null) {
            this.f21670M0 = new C3950k(0, this, f21654e1, 210L, this.f21668L0);
        } else if (kVar2.m29540o() > 0.5f) {
            this.f21670M0.m29543l(0.0f);
            this.f21668L0 = 0.0f;
        }
        this.f21670M0.m29546i(1.0f);
    }

    public void m18609q(Canvas canvas, int i, int i2, float f, boolean z) {
        float f2;
        float f3 = this.f21728z0;
        if (!z) {
            float f4 = this.f21726x0;
            if (f4 <= 0.0f || f4 >= 1.0f) {
                if (f3 == -1.0f) {
                    this.f21728z0 = 1.0f;
                    f2 = 1.0f;
                } else {
                    f2 = f3;
                }
                C1359b.m37502t(canvas, i, i2, C1357a0.m37544i(13.0f), this.f21727y0, f3, f2, this.f21678Q0, C5064d.m24132a(f, -1));
            }
        }
        float f5 = this.f21726x0;
        this.f21728z0 = f5;
        f2 = f5;
        C1359b.m37502t(canvas, i, i2, C1357a0.m37544i(13.0f), this.f21727y0, f3, f2, this.f21678Q0, C5064d.m24132a(f, -1));
    }

    public void m18608q0(boolean z) {
        this.f21672N0 = z;
    }

    public float m18607r() {
        return this.f21674O0 * this.f21716n0;
    }

    public void m18606r0(boolean z) {
        this.f21693Y = z;
    }

    public final int m18605s() {
        return m18663L() ? m18661M() ? R.drawable.deproko_baseline_close_10 : R.drawable.deproko_baseline_close_18 : R.drawable.deproko_baseline_close_24;
    }

    public final void m18604s0(boolean z, boolean z2) {
        if (this.f21682S0 != z) {
            this.f21682S0 = z;
            if (this.f21684T0 == null) {
                RunnableC6969m2 m2Var = new RunnableC6969m2(this.f21697a, C1357a0.m37544i(22.0f));
                this.f21684T0 = m2Var;
                m2Var.m18268v(this.f21686U0, false);
                this.f21684T0.m18272r();
                this.f21684T0.m18286d(m18597w());
                m18631f();
                m18657O();
                if (this.f21692X0) {
                    this.f21684T0.m18292D();
                }
                this.f21684T0.m18291E(this.f21662F0);
            }
            float f = 1.0f;
            if (!z2 || this.f21674O0 <= 0.0f) {
                C3950k kVar = this.f21680R0;
                if (kVar != null) {
                    kVar.m29543l(z ? 1.0f : 0.0f);
                }
                if (!z) {
                    f = 0.0f;
                }
                m18672G0(f);
                return;
            }
            if (this.f21680R0 == null) {
                this.f21680R0 = new C3950k(2, this, C2057b.f7280b, 210L, this.f21678Q0);
            }
            C3950k kVar2 = this.f21680R0;
            if (!z) {
                f = 0.0f;
            }
            kVar2.m29546i(f);
        }
    }

    public TdApi.File m18603t() {
        return this.f21669M;
    }

    public void m18602t0() {
        this.f21691X = true;
    }

    public long m18601u() {
        return this.f21689W;
    }

    public void m18600u0(boolean z, boolean z2) {
        if (this.f21657A0 != z) {
            this.f21657A0 = z;
            m18680C0(z ? 1.0f : 0.0f, z2 && m18656O0());
        }
    }

    public TdApi.Message m18599v() {
        return this.f21719q0;
    }

    public void m18598v0(boolean z) {
        this.f21702b1 = true;
        m18631f();
        if (z) {
            C10536ab.m4667o1().m4636w2().m7081T0(this.f21700b, this.f21719q0, this);
        }
    }

    public final int m18597w() {
        if (this.f21702b1) {
            return C5064d.m24132a(this.f21678Q0 * this.f21674O0, C11524j.m228N(this.f21681S));
        }
        return (((int) ((this.f21678Q0 * 255.0f) * this.f21674O0)) << 24) | 16777215;
    }

    public void m18596w0(boolean z) {
        if (this.f21705c1 != z) {
            this.f21705c1 = z;
            if (z) {
                m18680C0(this.f21657A0 ? 1.0f : 0.0f, false);
            }
        }
    }

    public int m18595x() {
        TdApi.File file = this.f21669M;
        if (file == null) {
            return 0;
        }
        TdApi.RemoteFile remoteFile = file.remote;
        return remoteFile.isUploadingActive ? remoteFile.uploadedSize : file.local.downloadedSize;
    }

    public void m18594x0(String str) {
        this.f21671N = str;
    }

    public int m18593y() {
        if (m18663L()) {
            return Math.min(C1357a0.m37544i(this.f21711i0 == 0 ? 18.0f : 12.0f), Math.min(this.f21660D0 - this.f21658B0, this.f21661E0 - this.f21659C0) / 2);
        }
        int i = this.f21703c;
        return Math.min(C1357a0.m37544i((i == 8 || i == 16 || i == 2) ? 25.0f : 28.0f), Math.min(this.f21660D0 - this.f21658B0, this.f21661E0 - this.f21659C0) / 2);
    }

    public void m18592y0() {
        this.f21695Z = true;
    }

    public float m18591z() {
        return this.f21716n0;
    }

    public void m18590z0(int i) {
        this.f21712j0 = i;
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
        TdApi.File file;
        if (this.f21700b == q6Var && (file = this.f21669M) != null && file.f25376id == i) {
            m18600u0(i2 == 3, true);
            C9773p0.AbstractC9779f fVar = this.f21721s0;
            if (fVar != null) {
                fVar.mo6972z1(q6Var, j, j2, i, i2);
            }
        }
    }
}
