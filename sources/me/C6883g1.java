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
    public static final Handler f21653a1 = new HandlerC6884a(Looper.getMainLooper());
    public static final Interpolator f21654b1 = new DecelerateInterpolator(0.72f);
    public static Path f21655c1;
    public static Path f21656d1;
    public int f21657A0;
    public int f21658B0;
    public AbstractC4345j f21659C0;
    public boolean f21660D0;
    public int f21661E0;
    public int f21662F0;
    public int f21663G0;
    public int f21664H0;
    public float f21665I0;
    public C3950k f21666J0;
    public boolean f21667K0;
    public TdApi.File f21669M;
    public C3950k f21670M0;
    public String f21671N;
    public float f21672N0;
    public boolean f21673O;
    public C3950k f21674O0;
    public boolean f21675P;
    public boolean f21676P0;
    public boolean f21677Q;
    public RunnableC6969m2 f21678Q0;
    public int f21679R;
    public float f21680R0;
    public float f21682S0;
    public int f21683T;
    public int f21684T0;
    public boolean f21686U0;
    public long f21687V;
    public AbstractC4761s4 f21688V0;
    public long f21689W;
    public float f21690W0;
    public boolean f21691X;
    public C3950k f21692X0;
    public boolean f21693Y;
    public boolean f21694Y0;
    public boolean f21695Z;
    public boolean f21696Z0;
    public final AbstractView$OnTouchListenerC7889a f21697a;
    public final C10930q6 f21699b;
    public final int f21701c;
    public float f21703d0;
    public boolean f21704e0;
    public boolean f21705f0;
    public boolean f21706g0;
    public boolean f21707h0;
    public int f21708i0;
    public C3940f f21709j0;
    public AbstractC6886c f21711l0;
    public AbstractC6885b f21712m0;
    public TdApi.Message f21713n0;
    public C9773p0.AbstractC9776c f21714o0;
    public C9773p0.AbstractC9779f f21715p0;
    public boolean f21716q0;
    public boolean f21717r0;
    public boolean f21718s0;
    public C3950k f21719t0;
    public float f21720u0;
    public Path f21721v0;
    public float f21722w0;
    public boolean f21723x0;
    public int f21724y0;
    public int f21725z0;
    public final Rect f21698a0 = new Rect();
    public final RectF f21700b0 = new RectF();
    public final RectF f21702c0 = new RectF();
    public int f21685U = R.drawable.baseline_file_download_24;
    public int f21681S = 1711276032;
    public float f21668L0 = 1.0f;
    public float f21710k0 = 1.0f;

    public class HandlerC6884a extends Handler {
        public HandlerC6884a(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((C6883g1) message.obj).m18678D();
            } else if (i == 1) {
                ((C6883g1) message.obj).m18626h0(message.arg1, true);
            } else if (i == 2) {
                ((C6883g1) message.obj).m18675E0(Float.intBitsToFloat(message.arg1), Float.intBitsToFloat(message.arg2));
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
        this.f21699b = q6Var;
        this.f21701c = i;
        this.f21673O = z;
        this.f21687V = j;
        this.f21689W = j2;
    }

    public void m18658N(AbstractC9323v4 v4Var) {
        C7389v0.m16607m2(v4Var, C7389v0.m16565x0(this.f21669M.local.path), new File(this.f21669M.local.path), this.f21671N, 0);
    }

    public int m18684A() {
        TdApi.File file = this.f21669M;
        if (file != null) {
            return file.expectedSize;
        }
        return 0;
    }

    public final void m18683A0(float f) {
        if (this.f21720u0 != f) {
            this.f21720u0 = f;
            m18656O();
            m18680C();
        }
    }

    public final float m18682B(float f) {
        if (!this.f21675P) {
            return f;
        }
        if (f > 0.0f) {
            return (f * 0.65f) + 0.35f;
        }
        if (C5070i.m24061i(this.f21669M.local.path)) {
            return 0.0f;
        }
        C5340e0.C5343c Y = this.f21699b.m2429h5().m23122Y(this.f21669M.local.path);
        float g = Y != null ? (float) Y.m23174g() : 1.0f;
        return g == 1.0f ? (f * 0.65f) + 0.35f : g * 0.35f;
    }

    public final void m18681B0(float f, boolean z) {
        if (z) {
            if (this.f21719t0 == null) {
                this.f21719t0 = new C3950k(3, this, C2057b.f7280b, 138L, this.f21720u0);
            }
            this.f21719t0.m29544i(f);
            return;
        }
        C3950k kVar = this.f21719t0;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        m18683A0(f);
    }

    public void m18680C() {
        AbstractC4345j jVar = this.f21659C0;
        if (jVar == null) {
            return;
        }
        if (this.f21686U0) {
            jVar.invalidate();
            return;
        }
        int y = m18593y();
        int d = m18635d();
        int e = m18633e();
        int i = y / 2;
        this.f21659C0.mo28228d(d - i, e - i, d + i, e + i);
    }

    public void m18679C0(TdApi.Message message, C9773p0.AbstractC9776c cVar) {
        m18677D0(message, cVar, null);
    }

    public void m18678D() {
        if (this.f21673O) {
            AbstractC4345j jVar = this.f21659C0;
            if (jVar == null || !jVar.mo18573a()) {
                Log.m14719i("Warning: FileProgressComponent.invalidateContent ignored", new Object[0]);
            }
        }
    }

    public void m18677D0(TdApi.Message message, C9773p0.AbstractC9776c cVar, C9773p0.AbstractC9779f fVar) {
        if (this.f21669M == null) {
            m18624i0(R.drawable.baseline_play_arrow_36_white);
            m18614n0(C4779t2.m25494j1(message), message);
            this.f21713n0 = message;
            this.f21714o0 = cVar;
            this.f21715p0 = fVar;
            this.f21721v0 = new Path();
            m18631f();
            C10536ab.m4667o1().m4636w2().m7026r(this.f21699b, message, this);
            Path path = this.f21721v0;
            int i = C1357a0.m37541i(13.0f);
            float f = this.f21720u0;
            this.f21722w0 = f;
            C1359b.m37517b(path, i, -1.0f, f);
            return;
        }
        throw new IllegalStateException("setPlayPauseObject called after setFile");
    }

    public boolean m18676E() {
        TdApi.File file;
        return this.f21684T0 == 2 || ((file = this.f21669M) != null && C4779t2.m25598T2(file));
    }

    public void m18675E0(float f, float f2) {
        if (this.f21680R0 != f || this.f21682S0 != f2) {
            boolean z = false;
            if (Log.isEnabled(Log.TAG_TDLIB_FILES) && Log.checkLogLevel(3)) {
                Object[] objArr = new Object[5];
                TdApi.File file = this.f21669M;
                objArr[0] = Integer.valueOf(file != null ? file.f25373id : 0);
                objArr[1] = Integer.valueOf((int) (this.f21680R0 * 100.0f));
                objArr[2] = Integer.valueOf((int) (f * 100.0f));
                objArr[3] = Integer.valueOf((int) (this.f21682S0 * 100.0f));
                objArr[4] = Integer.valueOf((int) (100.0f * f2));
                Log.m14721i((int) Log.TAG_TDLIB_FILES, "setProgress id=%d done=%d->%d%% visual=%d->%d%%", objArr);
            }
            this.f21680R0 = f;
            this.f21682S0 = f2;
            RunnableC6969m2 m2Var = this.f21678Q0;
            if (m2Var != null) {
                if (m18657N0() && this.f21668L0 > 0.0f) {
                    z = true;
                }
                m2Var.m18268v(f2, z);
            }
            AbstractC6886c cVar = this.f21711l0;
            if (cVar != null && this.f21684T0 == 1) {
                cVar.mo15923f(this.f21669M, f);
            }
        }
    }

    public boolean m18674F() {
        return this.f21684T0 == 3;
    }

    public final void m18673F0(float f) {
        if (this.f21672N0 != f) {
            this.f21672N0 = f;
            if (this.f21694Y0) {
                m18656O();
            }
            m18680C();
        }
    }

    public boolean m18672G() {
        return this.f21684T0 == 2;
    }

    public void m18671G0(float f) {
        if (this.f21710k0 != f) {
            this.f21710k0 = f;
            m18680C();
        }
    }

    public boolean m18670H() {
        return this.f21684T0 == 1;
    }

    public void m18669H0(AbstractC6886c cVar) {
        this.f21711l0 = cVar;
    }

    public boolean m18668I() {
        TdApi.File file = this.f21669M;
        if (file != null && !file.local.isDownloadingCompleted) {
            TdApi.RemoteFile remoteFile = file.remote;
            if (!remoteFile.isUploadingCompleted && remoteFile.uploadedSize == 0) {
                return true;
            }
        }
        return false;
    }

    public void m18667I0() {
        this.f21686U0 = true;
        RunnableC6969m2 m2Var = this.f21678Q0;
        if (m2Var != null) {
            m2Var.m18292D();
        }
    }

    public boolean m18666J() {
        return this.f21694Y0;
    }

    public void m18665J0(boolean z) {
        this.f21704e0 = z;
        this.f21721v0 = new Path();
        m18600u0(false, false);
        Path path = this.f21721v0;
        int i = C1357a0.m37541i(18.0f);
        float f = this.f21720u0;
        this.f21722w0 = f;
        C1359b.m37517b(path, i, -1.0f, f);
    }

    public boolean m18664K() {
        return C4779t2.m25568Y2(this.f21669M);
    }

    public void m18663K0(boolean z, boolean z2, int i, RectF rectF, C3940f fVar) {
        int i2 = this.f21708i0;
        boolean z3 = this.f21705f0 != z || !this.f21700b0.equals(rectF);
        this.f21705f0 = z;
        this.f21707h0 = z2;
        this.f21709j0 = fVar;
        this.f21708i0 = i;
        this.f21700b0.set(rectF);
        m18651Q0();
        if (i2 != this.f21708i0) {
            m18631f();
            if (this.f21684T0 == 1) {
                m18610p0(m18605s(), false);
            }
        }
        if (z3) {
            m18656O();
        }
    }

    public boolean m18662L() {
        return this.f21704e0;
    }

    public void m18661L0(boolean z) {
        this.f21706g0 = z;
    }

    public final boolean m18660M() {
        return this.f21708i0 != 0;
    }

    public void m18659M0(AbstractC4345j jVar) {
        this.f21659C0 = jVar;
        RunnableC6969m2 m2Var = this.f21678Q0;
        if (m2Var != null) {
            m2Var.m18291E(jVar);
        }
    }

    public final boolean m18657N0() {
        AbstractC4345j jVar = this.f21659C0;
        return jVar != null && jVar.mo28225g() && !this.f21667K0;
    }

    public final void m18656O() {
        int i;
        int i2;
        if (this.f21678Q0 != null) {
            TdApi.Message message = this.f21713n0;
            if ((message != null && C4183a.m28614c(message) && !this.f21695Z) || (m18662L() && this.f21707h0)) {
                int d = m18635d();
                int e = m18633e();
                if (this.f21694Y0) {
                    int i3 = C1357a0.m37541i(11.0f);
                    i = (int) (C1357a0.m37541i(7.0f) + ((i3 - i2) * this.f21672N0));
                    this.f21678Q0.m18267w(i);
                } else {
                    double radians = Math.toRadians(45.0d);
                    double d2 = (this.f21657A0 - this.f21724y0) / 2;
                    d += (int) (Math.sin(radians) * d2);
                    e += (int) (d2 * Math.cos(radians));
                    i = C1357a0.m37541i(5.0f);
                    this.f21678Q0.m18267w(i - C1357a0.m37541i(2.0f));
                }
                this.f21678Q0.m18274p(d - i, e - i, d + i, e + i);
            } else if (m18662L()) {
                m18651Q0();
                this.f21678Q0.m18267w(m18593y() - C1357a0.m37541i(4.0f));
                RunnableC6969m2 m2Var = this.f21678Q0;
                Rect rect = this.f21698a0;
                m2Var.m18274p(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                this.f21678Q0.m18267w(m18593y() - C1357a0.m37541i(4.0f));
                this.f21678Q0.m18274p(this.f21724y0, this.f21725z0, this.f21657A0, this.f21658B0);
            }
        }
    }

    public void m18655O0(Rect rect) {
        int d = m18635d();
        int e = m18633e();
        int y = m18593y();
        rect.set(d - y, e - y, d + y, e + y);
    }

    public void m18654P() {
        RunnableC6969m2 m2Var = this.f21678Q0;
        if (m2Var != null) {
            m2Var.m18277m();
        }
    }

    public void m18653P0(long j, long j2, boolean z) {
        if (this.f21689W == j) {
            this.f21689W = j2;
            int i = 0;
            this.f21718s0 = false;
            if (!z) {
                i = 3;
            } else if (C4779t2.m25586V2(this.f21669M)) {
                i = 2;
            }
            m18626h0(i, m18657N0());
        }
        TdApi.Message message = this.f21713n0;
        if (message != null && message.f25406id == j) {
            message.f25406id = j2;
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m18632e0(f);
        } else if (i == 1) {
            m18642Z(f);
        } else if (i == 2) {
            m18673F0(f);
        } else if (i == 3) {
            m18683A0(f);
        } else if (i == 4) {
            m18628g0(1.0f - f);
        }
    }

    public boolean m18652Q(View view, MotionEvent motionEvent) {
        AbstractC4345j jVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f21660D0) {
                        this.f21660D0 = false;
                        return true;
                    }
                } else if (this.f21660D0 && Math.max(Math.abs(this.f21661E0 - x), Math.abs(this.f21662F0 - y)) > C1357a0.m37534p()) {
                    this.f21660D0 = false;
                    return true;
                }
            } else if (this.f21660D0) {
                if (m18647U(view) && (jVar = this.f21659C0) != null) {
                    jVar.mo28227e();
                }
                return true;
            }
            return this.f21660D0;
        }
        this.f21661E0 = (int) x;
        this.f21662F0 = (int) y;
        if (x >= this.f21724y0 && x <= this.f21657A0 && y >= this.f21725z0 && y <= this.f21658B0 && (!this.f21694Y0 || this.f21684T0 != 2)) {
            z = true;
        }
        this.f21660D0 = z;
        return z;
    }

    public final void m18651Q0() {
        int i = this.f21724y0;
        int i2 = this.f21708i0;
        int i3 = i + C1357a0.m37541i(i2 == 2 ? 4.0f : i2 == 1 ? 8.0f : 14.0f);
        int i4 = this.f21725z0;
        int i5 = this.f21708i0;
        int i6 = i4 + C1357a0.m37541i(i5 == 2 ? 3.0f : i5 == 1 ? 6.0f : 12.0f) + (this.f21705f0 ? C1357a0.m37541i(16.0f) : 0);
        this.f21698a0.set(i3, i6, (m18593y() * 2) + i3, (m18593y() * 2) + i6);
    }

    public final boolean m18650R() {
        final AbstractC9323v4<?> t;
        if (this.f21671N == null || (t = C1379j0.m37303t(this.f21697a)) == null) {
            return false;
        }
        return m18649S(t, new Runnable() {
            @Override
            public final void run() {
                C6883g1.this.m18658N(t);
            }
        });
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
                    Handler handler = f21653a1;
                    handler.sendMessage(Message.obtain(handler, 0, this));
                }
            }
        } else if (!(file == null || (file2 = this.f21669M) == null)) {
            C7321e.m16907u(file, file2);
        }
        if (z) {
            m18626h0(i2, m18657N0());
            return;
        }
        Handler handler2 = f21653a1;
        handler2.sendMessage(Message.obtain(handler2, 1, i2, 0, this));
    }

    public boolean m18649S(AbstractC9323v4<?> v4Var, Runnable runnable) {
        if (this.f21669M == null || this.f21701c != 8) {
            return false;
        }
        if (v4Var != null && v4Var.mo4348c() == this.f21699b) {
            if ((this.f21679R & 1) != 0) {
                v4Var.mo4348c().m2485dd().m3758O7(v4Var, this.f21669M, null, runnable);
            } else {
                runnable.run();
            }
        }
        return true;
    }

    public void m18648T(boolean z) {
        if (this.f21669M != null && this.f21684T0 == 1) {
            this.f21699b.m2413i5().m3981m(this.f21669M.f25373id, z, false);
        }
    }

    public boolean m18647U(View view) {
        return m18645W(view, false);
    }

    public boolean m18646V(View view, float f, float f2) {
        this.f21661E0 = (int) f;
        this.f21662F0 = (int) f2;
        return m18645W(view, false);
    }

    @Override
    public void mo3953V0(TdApi.File file) {
        boolean z = !this.f21677Q && file.local.isDownloadingCompleted;
        C7321e.m16907u(file, this.f21669M);
        float s1 = C4779t2.m25431s1(file);
        float B = m18682B(s1);
        Handler handler = f21653a1;
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
        if (this.f21699b == q6Var && (file = this.f21669M) != null && file.f25373id == i && (fVar = this.f21715p0) != null) {
            fVar.mo6973V2(q6Var, j, j2, i, f, j3, j4, z);
        }
    }

    public boolean m18645W(View view, boolean z) {
        AbstractC6886c cVar;
        TdApi.Message message;
        AbstractC6886c cVar2;
        if (this.f21693Y && (!m18662L() || !this.f21700b0.contains(this.f21661E0, this.f21662F0))) {
            return !z && (cVar2 = this.f21711l0) != null && cVar2.mo15925e(this, view, this.f21669M, this.f21689W);
        }
        if (this.f21694Y0 || this.f21669M == null || (message = this.f21713n0) == null || ((!C4183a.m28614c(message) || this.f21695Z) && this.f21684T0 != 2)) {
            int i = this.f21684T0;
            if (i != 0) {
                if (i == 1) {
                    TdApi.File file = this.f21669M;
                    if (file != null) {
                        if (file.remote.isUploadingActive || this.f21718s0) {
                            this.f21699b.m2754M4(this.f21687V, new long[]{this.f21689W}, true);
                        } else {
                            this.f21699b.m2413i5().m3981m(this.f21669M.f25373id, false, true);
                        }
                        return true;
                    }
                } else if (i == 2 && ((!z && (cVar = this.f21711l0) != null && cVar.mo15925e(this, view, this.f21669M, this.f21689W)) || m18650R())) {
                    return true;
                }
            } else if (this.f21669M != null) {
                this.f21699b.m2413i5().m3975p(this.f21669M);
                return true;
            }
            return false;
        }
        TdApi.File file2 = this.f21669M;
        if (file2.remote.isUploadingCompleted || file2.f25373id == -1) {
            C10536ab.m4667o1().m4636w2().m7105H0(this.f21699b, this.f21713n0, this.f21714o0);
        }
        return true;
    }

    public boolean m18644X(View view) {
        this.f21660D0 = false;
        return false;
    }

    public void m18643Y(TdApi.File file, TdApi.Message message) {
        m18614n0(file, message);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 1.0f) {
            C3950k kVar2 = this.f21666J0;
            if (kVar2 != null) {
                kVar2.m29541l(0.0f);
            }
            this.f21665I0 = 0.0f;
        }
    }

    public final void m18642Z(float f) {
        if (this.f21668L0 != f) {
            this.f21668L0 = f;
            m18680C();
        }
    }

    public final void m18640a0(float f, boolean z) {
        if (z && m18657N0()) {
            float f2 = this.f21668L0;
            if (!(f2 == f && this.f21670M0 == null)) {
                if (this.f21670M0 == null) {
                    this.f21670M0 = new C3950k(1, this, C2057b.f7280b, 240L, f2);
                }
                this.f21670M0.m29544i(f);
                return;
            }
        }
        C3950k kVar = this.f21670M0;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        m18642Z(f);
    }

    public final float m18639b() {
        if (this.f21684T0 != 2) {
            return 0.0f;
        }
        C3950k kVar = this.f21666J0;
        if (kVar == null || !kVar.m29531v()) {
            return 1.0f;
        }
        float f = this.f21665I0;
        if (f <= 0.5f) {
            return 0.0f;
        }
        return (f - 0.5f) / 0.5f;
    }

    public void m18638b0(int i) {
        this.f21717r0 = false;
        this.f21681S = i;
    }

    public final float m18637c() {
        if (this.f21684T0 == 2) {
            return (1.0f - this.f21690W0) * 1.0f;
        }
        return 0.0f;
    }

    public void m18636c0(int i) {
        this.f21717r0 = true;
        this.f21681S = i;
    }

    public int m18635d() {
        return (this.f21724y0 + this.f21657A0) >> 1;
    }

    public void m18634d0(AbstractC4761s4 s4Var) {
        this.f21688V0 = s4Var;
    }

    public int m18633e() {
        return (this.f21725z0 + this.f21658B0) >> 1;
    }

    public final void m18632e0(float f) {
        if (this.f21665I0 != f) {
            this.f21665I0 = f;
            int i = this.f21664H0;
            if (i != 0 && f >= 0.5f) {
                this.f21663G0 = i;
                this.f21664H0 = 0;
            }
        }
        m18680C();
    }

    public final void m18631f() {
        int i;
        if (this.f21678Q0 != null) {
            boolean z = (C4183a.m28614c(this.f21713n0) && !this.f21695Z) || (m18662L() && this.f21707h0);
            RunnableC6969m2 m2Var = this.f21678Q0;
            float f = 1.5f;
            if (!m18662L() || !m18660M()) {
                if (this.f21718s0 || !z) {
                    i = C1357a0.m37541i(3.0f);
                    m2Var.m18293C(i);
                } else if (this.f21694Y0) {
                    f = 2.0f;
                }
            }
            i = C1357a0.m37541i(f);
            m2Var.m18293C(i);
        }
    }

    public void m18630f0(int i, int i2, int i3, int i4) {
        if (this.f21724y0 != i || this.f21725z0 != i2 || this.f21657A0 != i3 || this.f21658B0 != i4) {
            this.f21724y0 = i;
            this.f21725z0 = i2;
            this.f21657A0 = i3;
            this.f21658B0 = i4;
            m18656O();
        }
    }

    public final void m18629g(boolean z) {
        if (this.f21713n0 != null) {
            if (z) {
                C3950k kVar = this.f21692X0;
                if (kVar == null) {
                    C3950k kVar2 = new C3950k(4, this, C2057b.f7280b, 180L);
                    this.f21692X0 = kVar2;
                    kVar2.m29553F(2000L);
                } else {
                    kVar.m29541l(0.0f);
                }
                this.f21690W0 = 1.0f;
                this.f21692X0.m29544i(1.0f);
                return;
            }
            C3950k kVar3 = this.f21692X0;
            if (kVar3 != null) {
                kVar3.m29541l(0.0f);
            }
            this.f21690W0 = 0.0f;
        }
    }

    public final void m18628g0(float f) {
        if (this.f21690W0 != f) {
            this.f21690W0 = f;
            m18680C();
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
            this.f21699b.m2413i5().m4030D0(this.f21669M.f25373id, this);
        }
        if (this.f21713n0 != null) {
            C10536ab.m4667o1().m4636w2().m7081T0(this.f21699b, this.f21713n0, this);
        }
    }

    public void m18624i0(int i) {
        m18622j0(i, m18657N0());
    }

    public boolean m18623j() {
        return m18619l(null);
    }

    public void m18622j0(int i, boolean z) {
        if (this.f21683T != i) {
            this.f21683T = i;
            if (this.f21684T0 == 2) {
                m18610p0(i, z);
                m18640a0(i != 0 ? 1.0f : 0.0f, z);
            }
        }
    }

    public boolean m18621k(long j) {
        TdApi.Chat U2;
        if (this.f21669M == null || (U2 = this.f21699b.m2632U2(j)) == null) {
            return false;
        }
        return m18619l(U2.type);
    }

    public void m18620k0(TdApi.Document document) {
        boolean a = C4183a.m28616a(document);
        m18624i0(a ? R.drawable.baseline_palette_24 : R.drawable.baseline_insert_drive_file_24);
        this.f21679R = C5063c.m24138h(this.f21679R, 1, a);
    }

    public boolean m18619l(TdApi.ChatType chatType) {
        if (this.f21669M != null) {
            if (this.f21699b.m2413i5().m3977o(this.f21669M, chatType, this.f21701c, this.f21684T0 == 0)) {
                return true;
            }
        }
        return false;
    }

    public void m18618l0(AbstractC6885b bVar) {
        this.f21712m0 = bVar;
    }

    public void m18617m() {
        if (this.f21669M == null) {
            return;
        }
        if (this.f21684T0 == 0 || !this.f21699b.m2413i5().m4016P(this.f21669M.f25373id)) {
            this.f21699b.m2413i5().m3975p(this.f21669M);
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
        C3940f fVar;
        boolean z2;
        boolean z3 = false;
        boolean z4 = C4183a.m28614c(this.f21713n0) && !this.f21695Z;
        float f2 = this.f21668L0 * this.f21710k0;
        if ((this.f21669M == null || f2 == 0.0f || this.f21694Y0) ? false : true) {
            int d = m18635d();
            int e = m18633e();
            if (m18662L()) {
                if (this.f21698a0.width() == 0) {
                    m18651Q0();
                }
                d = this.f21698a0.centerX();
                e = this.f21698a0.centerY();
            }
            int i3 = d;
            int i4 = e;
            if (f2 == 1.0f) {
                i = this.f21717r0 ? C11524j.m228N(this.f21681S) : this.f21681S;
            } else {
                i = C5064d.m24131a(f2, this.f21717r0 ? C11524j.m228N(this.f21681S) : this.f21681S);
            }
            if (m18662L()) {
                canvas.drawCircle(m18635d(), m18633e(), C1357a0.m37541i(28.0f), C1410y.m37039g(i));
                m18609q(canvas, m18635d(), m18633e(), f2, true);
                if (!this.f21702c0.isEmpty()) {
                    canvas.save();
                    canvas.clipRect(this.f21702c0);
                    canvas.translate(this.f21703d0, 0.0f);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f21707h0) {
                    m18611p(canvas, f2);
                }
                z = z2;
            } else {
                canvas.drawCircle(i3, i4, m18593y(), C1410y.m37039g(i));
                z = false;
            }
            if (z4) {
                m18609q(canvas, i3, i4, f2, true);
            } else {
                int i5 = this.f21663G0;
                if (i5 != 0 && ((i5 != this.f21683T || !this.f21716q0) && (!m18662L() || !this.f21707h0))) {
                    boolean z5 = m18662L() && !m18660M() && (fVar = this.f21709j0) != null && fVar.m29582i();
                    Paint W = C1410y.m37055W(-1);
                    float f3 = this.f21665I0;
                    float f4 = f3 <= 0.5f ? f3 / 0.5f : 1.0f - ((f3 - 0.5f) / 0.5f);
                    float f5 = z5 ? 0.0f : f4;
                    float f6 = (1.0f - f4) * f2;
                    int i6 = (f6 > 1.0f ? 1 : (f6 == 1.0f ? 0 : -1));
                    if (i6 != 0) {
                        W.setAlpha((int) (255.0f * f6));
                    }
                    boolean z6 = f5 != 0.0f;
                    if (z6) {
                        int V = C1399s0.m37199V(canvas);
                        float f7 = ((1.0f - f5) * 0.35000002f) + 0.65f;
                        canvas.scale(f7, f7, i3, i4);
                        i2 = V;
                    } else {
                        i2 = -1;
                    }
                    int i7 = this.f21663G0;
                    if (i7 != R.drawable.baseline_play_arrow_36_white || this.f21713n0 == null) {
                        f = f2;
                        canvas2 = canvas;
                        Drawable X = t.mo14042X(i7, 0);
                        C1362c.m37487b(canvas2, X, i3 - (X.getMinimumWidth() / 2), i4 - (X.getMinimumHeight() / 2), W);
                    } else {
                        int i8 = C1357a0.m37541i(13.0f);
                        Path path = this.f21721v0;
                        float f8 = this.f21722w0;
                        float f9 = this.f21720u0;
                        this.f21722w0 = f9;
                        float f10 = this.f21672N0;
                        int a = C5064d.m24131a(f6, -1);
                        f = f2;
                        canvas2 = canvas;
                        C1359b.m37499t(canvas, i3, i4, i8, path, f8, f9, f10, a);
                    }
                    if (i6 != 0) {
                        W.setAlpha(255);
                    }
                    if (z6) {
                        C1399s0.m37201T(canvas2, i2);
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
        RunnableC6969m2 m2Var = this.f21678Q0;
        if (m2Var != null && !this.f21706g0) {
            m2Var.m18286d(m18597w());
            this.f21678Q0.m18287c(canvas2);
        }
        if (z3) {
            canvas.restore();
        }
    }

    public void m18614n0(TdApi.File file, TdApi.Message message) {
        TdApi.LocalFile localFile;
        TdApi.LocalFile localFile2;
        if (this.f21669M != null && !this.f21691X) {
            this.f21699b.m2413i5().m4030D0(this.f21669M.f25373id, this);
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
        if (message != null && this.f21699b.m2595W9(message)) {
            this.f21718s0 = true;
        }
        if (file == null) {
            m18626h0(0, m18657N0());
        } else if (this.f21718s0) {
            m18626h0(1, m18657N0());
            if (m18664K()) {
                m18675E0(1.0f, 1.0f);
            }
        } else if (message != null && C4779t2.m25610R2(message)) {
            m18626h0(3, m18657N0());
        } else if (C4779t2.m25580W2(file)) {
            m18626h0(1, m18657N0());
        } else {
            if (C4779t2.m25586V2(file)) {
                i = 2;
            }
            m18626h0(i, m18657N0());
        }
        if (file != null && !this.f21691X) {
            if (this.f21684T0 == 1 && (localFile = file.local) != null && localFile.isDownloadingActive && !this.f21699b.m2413i5().m4016P(file.f25373id)) {
                this.f21699b.m2413i5().m3975p(file);
            }
            this.f21699b.m2413i5().m4034B0(file, this);
        }
    }

    public <T extends View & AbstractC5143t> void m18613o(T t, Canvas canvas, RectF rectF, float f) {
        this.f21703d0 = f;
        this.f21702c0.set(rectF);
        m18615n(t, canvas);
    }

    public void m18612o0(boolean z) {
        if (this.f21716q0 != z) {
            this.f21716q0 = z;
            m18680C();
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
        float f2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Path path;
        int i17;
        int i18;
        int i19;
        float c = m18637c();
        if (c != 1.0f) {
            int d2 = m18635d();
            int e = m18633e();
            if (this.f21694Y0) {
                int i20 = C1357a0.m37541i(12.0f);
                i4 = (int) (C1357a0.m37541i(7.0f) + ((i20 - i19) * this.f21672N0));
                i = d2;
                i2 = e;
                i3 = 0;
            } else {
                double radians = Math.toRadians(45.0d);
                double d3 = (this.f21657A0 - this.f21724y0) / 2;
                i = d2 + ((int) (Math.sin(radians) * d3));
                i2 = e + ((int) (d3 * Math.cos(radians)));
                i4 = C1357a0.m37541i(5.0f);
                i3 = (int) (C1357a0.m37541i(1.5f) * f * (1.0f - c));
            }
            if (this.f21717r0) {
                d = C11524j.m228N(this.f21681S);
            } else {
                float f3 = this.f21720u0;
                int N = f3 != 0.0f ? C11524j.m228N(R.id.theme_color_file) : 0;
                if (f3 != 1.0f) {
                    AbstractC4761s4 s4Var = this.f21688V0;
                    i5 = s4Var != null ? s4Var.m25833q3() : C11524j.m228N(R.id.theme_color_iconLight);
                } else {
                    i5 = 0;
                }
                d = C5064d.m24128d(i5, N, f3);
            }
            int i21 = d;
            AbstractC4761s4 s4Var2 = this.f21688V0;
            if (s4Var2 != null) {
                i6 = s4Var2.m25985a3();
            } else {
                i6 = C11524j.m148w();
            }
            int i22 = i6;
            boolean z = this.f21694Y0;
            if (!z || this.f21672N0 <= 1.0f) {
                float f4 = 1.0f - c;
                i7 = i21;
                f2 = 0.0f;
                i8 = i2;
                C1359b.m37513f(canvas, i, i2, (int) (i4 * f4), 1.0f - ((f * f4) * (z ? 1.0f - this.f21672N0 : 1.0f)), i7, i3, i22);
                if (this.f21694Y0) {
                    canvas.drawCircle(i, i8, (i18 + C1357a0.m37541i(1.0f)) * this.f21672N0, C1410y.m37039g(C11524j.m148w()));
                }
            } else {
                i7 = i21;
                i8 = i2;
                f2 = 0.0f;
            }
            if (this.f21694Y0) {
                int i23 = (int) (C1357a0.m37541i(6.5f) * this.f21672N0);
                int i24 = i23 / 2;
                int i25 = i - i24;
                int i26 = i8 - i24;
                float f5 = i25;
                float f6 = i26;
                float f7 = i25 + i23;
                float f8 = i26 + i23;
                int i27 = i7;
                canvas.drawLine(f5, f6, f7, f8, C1410y.m37053Y(i27, C1357a0.m37541i(2.0f)));
                canvas.drawLine(f5, f8, f7, f6, C1410y.m37053Y(i27, C1357a0.m37541i(2.0f)));
            }
            float f9 = 1.0f - c;
            float f10 = (1.0f - this.f21672N0) * f9 * f;
            if (f10 != f2) {
                if (this.f21684T0 != 2) {
                    if (this.f21694Y0) {
                        i17 = C5064d.m24131a(f10, C11524j.m148w());
                        if (f21656d1 == null) {
                            int i28 = C1357a0.m37541i(9.0f);
                            int i29 = C1357a0.m37541i(4.0f);
                            Path path2 = new Path();
                            f21656d1 = path2;
                            path2.setFillType(Path.FillType.EVEN_ODD);
                            f21656d1.moveTo((-i28) / 2, f2);
                            f21656d1.lineTo(i28 / 2, f2);
                            f21656d1.lineTo(f2, i29);
                            f21656d1.close();
                        }
                        path = f21656d1;
                        i15 = C1357a0.m37541i(3.5f);
                        i14 = i8 - ((i15 / 2) + C1357a0.m37541i(1.0f));
                        i16 = C1357a0.m37541i(0.2f);
                    } else {
                        i17 = C5064d.m24130b((int) (f10 * 255.0f), -1);
                        if (f21655c1 == null) {
                            int i30 = C1357a0.m37541i(7.0f);
                            int i31 = C1357a0.m37541i(3.0f);
                            Path path3 = new Path();
                            f21655c1 = path3;
                            path3.setFillType(Path.FillType.EVEN_ODD);
                            f21655c1.moveTo((-i30) / 2, f2);
                            f21655c1.lineTo(i30 / 2, f2);
                            f21655c1.lineTo(f2, i31);
                            f21655c1.close();
                        }
                        path = f21655c1;
                        i15 = C1357a0.m37541i(2.5f);
                        i14 = i8 - ((i15 / 2) + C1357a0.m37541i(1.0f));
                        i16 = C1357a0.m37541i(0.2f);
                    }
                    int i32 = i14 + i16;
                    int i33 = i17;
                    Path path4 = path;
                    int i34 = i15 / 2;
                    float f11 = i32 + i15;
                    canvas.drawRect(i - i34, i32, i34 + i, f11, C1410y.m37039g(i33));
                    canvas.save();
                    canvas.translate(i, f11);
                    canvas.drawPath(path4, C1410y.m37039g(i33));
                    canvas.restore();
                    return;
                }
                float b = m18639b();
                if (b != f2) {
                    if (this.f21694Y0) {
                        i10 = C1357a0.m37541i(2.0f);
                        i11 = C1357a0.m37541i(2.5f) + i10;
                        i9 = C1357a0.m37541i(5.5f);
                    } else {
                        i10 = C1357a0.m37541i(2.0f);
                        i11 = C1357a0.m37541i(2.0f) + i10;
                        i9 = C1357a0.m37541i(4.5f);
                    }
                    int i35 = i9;
                    int i36 = i10;
                    int i37 = (int) ((i35 + i11) * b);
                    int i38 = i37 < i11 ? i37 : i11;
                    int i39 = i37 >= i11 ? i37 - i11 : 0;
                    int a = this.f21694Y0 ? C5064d.m24131a(f10, C11524j.m148w()) : (((int) (f10 * 255.0f)) << 24) | 16777215;
                    if (i37 > 0) {
                        canvas.save();
                        int i40 = -C1357a0.m37541i(2.0f);
                        int i41 = C1357a0.m37541i(this.f21694Y0 ? 2.25f : 2.15f);
                        if (f9 != 1.0f) {
                            canvas.scale(f9, f9, i, i8);
                        }
                        canvas.translate(i40, i41);
                        canvas.rotate(-45.0f, i40 + i, i41 + i8);
                        float f12 = i;
                        float f13 = i8;
                        float f14 = i + i36;
                        float f15 = i8 + i38;
                        canvas.drawRect(f12, f13, f14, f15, C1410y.m37039g(a));
                        if (i39 > 0) {
                            canvas.drawRect(f14, i13 - i36, i12 + i39, f15, C1410y.m37039g(a));
                        }
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final void m18610p0(int i, boolean z) {
        if (!z || !m18657N0() || this.f21663G0 == i || this.f21668L0 != 1.0f) {
            C3950k kVar = this.f21666J0;
            if (kVar != null) {
                kVar.m29541l(0.0f);
            }
            this.f21664H0 = 0;
            this.f21665I0 = 0.0f;
            this.f21663G0 = i;
            m18680C();
            return;
        }
        this.f21664H0 = i;
        C3950k kVar2 = this.f21666J0;
        if (kVar2 == null) {
            this.f21666J0 = new C3950k(0, this, f21654b1, 210L, this.f21665I0);
        } else if (kVar2.m29538o() > 0.5f) {
            this.f21666J0.m29541l(0.0f);
            this.f21665I0 = 0.0f;
        }
        this.f21666J0.m29544i(1.0f);
    }

    public void m18609q(Canvas canvas, int i, int i2, float f, boolean z) {
        float f2;
        float f3 = this.f21722w0;
        if (!z) {
            float f4 = this.f21720u0;
            if (f4 <= 0.0f || f4 >= 1.0f) {
                if (f3 == -1.0f) {
                    this.f21722w0 = 1.0f;
                    f2 = 1.0f;
                } else {
                    f2 = f3;
                }
                C1359b.m37499t(canvas, i, i2, C1357a0.m37541i(13.0f), this.f21721v0, f3, f2, this.f21672N0, C5064d.m24131a(f, -1));
            }
        }
        float f5 = this.f21720u0;
        this.f21722w0 = f5;
        f2 = f5;
        C1359b.m37499t(canvas, i, i2, C1357a0.m37541i(13.0f), this.f21721v0, f3, f2, this.f21672N0, C5064d.m24131a(f, -1));
    }

    public void m18608q0(boolean z) {
        this.f21667K0 = z;
    }

    public float m18607r() {
        return this.f21668L0 * this.f21710k0;
    }

    public void m18606r0(boolean z) {
        this.f21693Y = z;
    }

    public final int m18605s() {
        return m18662L() ? m18660M() ? R.drawable.deproko_baseline_close_10 : R.drawable.deproko_baseline_close_18 : R.drawable.deproko_baseline_close_24;
    }

    public final void m18604s0(boolean z, boolean z2) {
        if (this.f21676P0 != z) {
            this.f21676P0 = z;
            if (this.f21678Q0 == null) {
                RunnableC6969m2 m2Var = new RunnableC6969m2(this.f21697a, C1357a0.m37541i(22.0f));
                this.f21678Q0 = m2Var;
                m2Var.m18268v(this.f21680R0, false);
                this.f21678Q0.m18272r();
                this.f21678Q0.m18286d(m18597w());
                m18631f();
                m18656O();
                if (this.f21686U0) {
                    this.f21678Q0.m18292D();
                }
                this.f21678Q0.m18291E(this.f21659C0);
            }
            float f = 1.0f;
            if (!z2 || this.f21668L0 <= 0.0f) {
                C3950k kVar = this.f21674O0;
                if (kVar != null) {
                    kVar.m29541l(z ? 1.0f : 0.0f);
                }
                if (!z) {
                    f = 0.0f;
                }
                m18673F0(f);
                return;
            }
            if (this.f21674O0 == null) {
                this.f21674O0 = new C3950k(2, this, C2057b.f7280b, 210L, this.f21672N0);
            }
            C3950k kVar2 = this.f21674O0;
            if (!z) {
                f = 0.0f;
            }
            kVar2.m29544i(f);
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
        if (this.f21723x0 != z) {
            this.f21723x0 = z;
            m18681B0(z ? 1.0f : 0.0f, z2 && m18657N0());
        }
    }

    public TdApi.Message m18599v() {
        return this.f21713n0;
    }

    public void m18598v0(boolean z) {
        this.f21694Y0 = true;
        m18631f();
        if (z) {
            C10536ab.m4667o1().m4636w2().m7081T0(this.f21699b, this.f21713n0, this);
        }
    }

    public final int m18597w() {
        if (this.f21694Y0) {
            return C5064d.m24131a(this.f21672N0 * this.f21668L0, C11524j.m228N(this.f21681S));
        }
        return (((int) ((this.f21672N0 * 255.0f) * this.f21668L0)) << 24) | 16777215;
    }

    public void m18596w0(boolean z) {
        if (this.f21696Z0 != z) {
            this.f21696Z0 = z;
            if (z) {
                m18681B0(this.f21723x0 ? 1.0f : 0.0f, false);
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
        if (m18662L()) {
            return Math.min(C1357a0.m37541i(this.f21708i0 == 0 ? 18.0f : 12.0f), Math.min(this.f21657A0 - this.f21724y0, this.f21658B0 - this.f21725z0) / 2);
        }
        int i = this.f21701c;
        return Math.min(C1357a0.m37541i((i == 8 || i == 16 || i == 2) ? 25.0f : 28.0f), Math.min(this.f21657A0 - this.f21724y0, this.f21658B0 - this.f21725z0) / 2);
    }

    public void m18592y0() {
        this.f21695Z = true;
    }

    public float m18591z() {
        return this.f21710k0;
    }

    public void m18590z0(int i) {
        if (this.f21685U != i) {
            this.f21685U = i;
            if (this.f21684T0 == 0) {
                m18610p0(i, false);
                m18640a0(i != 0 ? 1.0f : 0.0f, false);
            }
        }
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
        TdApi.File file;
        if (this.f21699b == q6Var && (file = this.f21669M) != null && file.f25373id == i) {
            m18600u0(i2 == 3, true);
            C9773p0.AbstractC9779f fVar = this.f21715p0;
            if (fVar != null) {
                fVar.mo6972z1(q6Var, j, j2, i, i2);
            }
        }
    }
}
