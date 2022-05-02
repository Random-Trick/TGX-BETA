package ee;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import de.C4059n;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.voip.VoIPController;
import p082fd.C4384m;
import p139jb.AbstractC5918j;
import p156kd.C6253l;
import p292ud.C9758l0;

public abstract class AbstractC4186b {
    public final Context f14126a;
    public final C4195j f14127b;
    public int f14130e;
    public int f14131f;
    public int f14132g;
    public int f14133h;
    public int f14134i;
    public C4059n f14135j;
    public float f14137l;
    public boolean f14138m;
    public boolean f14139n;
    public SurfaceTexture f14140o;
    public int f14143r;
    public int f14144s;
    public long f14145t;
    public boolean f14146u;
    public boolean f14147v;
    public C9758l0 f14148w;
    public int f14136k = Log.TAG_CAMERA;
    public int f14141p = -1;
    public int f14142q = -1;
    public final C4187a f14128c = new C4187a(this, false);
    public final C4384m f14129d = new C4187a(this, true);

    public static class C4187a extends C4384m {
        public final AbstractC4186b f14149M;
        public final boolean f14150N;

        public C4187a(AbstractC4186b bVar, boolean z) {
            super("CameraThread");
            this.f14149M = bVar;
            this.f14150N = z;
        }

        @Override
        public void mo3052f(Message message) {
            if (message.what >= 0) {
                if (this.f14150N) {
                    this.f14149M.m28611A(message);
                } else {
                    this.f14149M.m28608D(message);
                }
            } else if (this.f14150N) {
                this.f14149M.m28610B(message);
            } else {
                this.f14149M.m28609C(message);
            }
        }
    }

    public AbstractC4186b(Context context, C4195j jVar) {
        this.f14126a = context;
        this.f14127b = jVar;
    }

    public void m28606G(C6253l lVar) {
        if (lVar != null) {
            this.f14127b.m29102A(lVar, true);
        }
    }

    public static int m28580k(int i, int i2, int i3, int i4, float f, int i5) {
        if (i5 <= 0) {
            i5 = 1080;
        }
        boolean z = Math.max(i, i2) <= i5;
        if (z != (Math.max(i3, i4) <= i5)) {
            return z ? -1 : 1;
        }
        float abs = Math.abs((Math.max(i, i2) / Math.min(i, i2)) - f);
        float abs2 = Math.abs((Math.max(i3, i4) / Math.min(i3, i4)) - f);
        if (abs != abs2) {
            return abs < abs2 ? -1 : 1;
        }
        int i6 = ((i * i2) > (i3 * i4) ? 1 : ((i * i2) == (i3 * i4) ? 0 : -1));
        if (i6 != 0) {
            return i6 > 0 ? -1 : 1;
        }
        if (i != i3) {
            return i > i3 ? -1 : 1;
        }
        if (i2 != i4) {
            return i2 > i4 ? -1 : 1;
        }
        return 0;
    }

    public static int m28578l(int i, int i2, int i3, int i4, long j, float f) {
        long j2 = i * i2;
        long j3 = i3 * i4;
        int i5 = (Math.abs(j - j2) > Math.abs(j - j3) ? 1 : (Math.abs(j - j2) == Math.abs(j - j3) ? 0 : -1));
        if (i5 != 0) {
            return i5 < 0 ? -1 : 1;
        }
        int i6 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i6 != 0) {
            return i6 > 0 ? -1 : 1;
        }
        float max = Math.max(i, i2) / Math.min(i, i2);
        float max2 = Math.max(i3, i4) / Math.min(i3, i4);
        float abs = Math.abs(f - max);
        float abs2 = Math.abs(f - max2);
        if (abs != abs2) {
            return abs < abs2 ? -1 : 1;
        }
        return 0;
    }

    public void m28611A(Message message) {
    }

    public final void m28610B(Message message) {
    }

    public final void m28609C(Message message) {
        boolean z = false;
        switch (message.what) {
            case -17:
                m28576m();
                return;
            case -16:
                m28602V((C9758l0) message.obj);
                return;
            case -15:
                String str = (String) message.obj;
                if (message.arg1 == 1) {
                    z = true;
                }
                m28574n(str, z);
                return;
            case -14:
                Object[] objArr = (Object[]) message.obj;
                m28567q0((String) objArr[0], (C9758l0.AbstractC9760b) objArr[1], (String) objArr[2]);
                objArr[0] = null;
                objArr[1] = null;
                objArr[2] = null;
                return;
            case -13:
                if (message.arg1 == 1) {
                    z = true;
                }
                m28571o0(z);
                return;
            case -12:
                m28570p(message.arg1);
                return;
            case -11:
                m28563t0(message.arg1, message.arg2, ((Integer) message.obj).intValue());
                return;
            case -10:
                m28600Y(Float.intBitsToFloat(message.arg1));
                return;
            case -9:
                m28597a0();
                return;
            case -8:
                m28587g();
                return;
            case -7:
                if (message.arg1 == 1) {
                    z = true;
                }
                m28583i0(z);
                return;
            case -6:
                if (message.arg1 == 1) {
                    z = true;
                }
                m28586g0(z);
                return;
            case VoIPController.ERROR_CONNECTION_SERVICE:
            default:
                return;
            case VoIPController.ERROR_INSECURE_UPGRADE:
                m28561u0();
                return;
            case VoIPController.ERROR_LOCALIZED:
                m28564s0();
                return;
            case VoIPController.ERROR_PRIVACY:
                m28581j0(message.arg1);
                return;
            case -1:
                m28575m0(message.arg1, message.arg2);
                return;
        }
    }

    public void m28608D(Message message) {
    }

    public final boolean m28607E(int i) {
        return this.f14128c.m28053d().hasMessages(i);
    }

    public abstract boolean mo28551F();

    public abstract void mo28548H();

    public abstract void mo28546I(boolean z, AbstractC5918j<C6253l> jVar);

    public abstract void mo28544J(int i);

    public abstract void mo28542K();

    public abstract void mo28540L();

    public abstract void mo28538M(int i, int i2);

    public abstract void mo28536N();

    public abstract void mo28534O();

    public void m28605P(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this) {
            this.f14140o = surfaceTexture;
            this.f14133h = i;
            this.f14134i = i2;
        }
        m28587g();
    }

    public void m28604Q(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.f14140o = null;
            this.f14134i = 0;
            this.f14133h = 0;
        }
        m28587g();
    }

    public void m28603R(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this) {
            this.f14133h = i;
            this.f14134i = i2;
        }
    }

    public abstract void mo28531S(int i, int i2, int i3);

    public abstract void mo28530T(float f);

    public abstract boolean mo28529U(SurfaceTexture surfaceTexture);

    public final void m28602V(C9758l0 l0Var) {
        if (!m28585h()) {
            m28588f0(-16, l0Var);
        } else if (this.f14148w == l0Var && this.f14138m && !this.f14147v) {
            try {
                mo28529U(l0Var.m7185S());
                this.f14147v = true;
            } catch (Throwable unused) {
                Log.m14711w((int) Log.TAG_CAMERA, "Cannot open camera lately", new Object[0]);
                m28586g0(false);
            }
        }
    }

    public final boolean m28601W() {
        m28583i0(true);
        return true;
    }

    public abstract boolean mo28528X();

    public final void m28600Y(float f) {
        if (!m28585h()) {
            m28591d0(-10, Float.floatToIntBits(f), 0);
        } else if (this.f14138m && this.f14135j.m29106d()) {
            m28569p0(f);
        }
    }

    public final void m28599Z() {
        m28579k0(Log.TAG_CAMERA);
    }

    public void m28597a0() {
        if (!m28585h()) {
            if (!m28607E(-9)) {
                m28593c0(-9);
            }
        } else if (!this.f14138m) {
            m28579k0(Log.TAG_CAMERA);
            m28569p0(0.0f);
            m28573n0(0);
            mo28536N();
        }
    }

    public final void m28595b0() {
        m28569p0(0.0f);
    }

    public final void m28593c0(int i) {
        C4187a aVar = this.f14128c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), i), 0L);
    }

    public final void m28592d() {
        if (Thread.currentThread() != this.f14128c) {
            throw new RuntimeException();
        }
    }

    public final void m28591d0(int i, int i2, int i3) {
        C4187a aVar = this.f14128c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), i, i2, i3), 0L);
    }

    public abstract int mo28527e();

    public final void m28590e0(int i, int i2, int i3, Object obj) {
        C4187a aVar = this.f14128c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), i, i2, i3, obj), 0L);
    }

    public final boolean m28589f() {
        return Thread.currentThread() == this.f14129d;
    }

    public final void m28588f0(int i, Object obj) {
        C4187a aVar = this.f14128c;
        aVar.m28050h(Message.obtain(aVar.m28053d(), i, obj), 0L);
    }

    public final void m28587g() {
        if (!m28585h()) {
            m28593c0(-8);
        } else {
            m28586g0(this.f14139n && this.f14140o != null);
        }
    }

    public final void m28586g0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: ee.AbstractC4186b.m28586g0(boolean):void");
    }

    public final boolean m28585h() {
        return Thread.currentThread() == this.f14128c;
    }

    public final void m28584h0(C4059n nVar) {
        synchronized (this.f14127b) {
            if (this.f14135j != nVar) {
                this.f14135j = nVar;
            }
        }
    }

    public abstract void mo28526i();

    public final void m28583i0(boolean z) {
        if (!m28585h()) {
            m28591d0(-7, z ? 1 : 0, 0);
        } else if (this.f14139n != z) {
            this.f14139n = z;
            m28587g();
        }
    }

    public final boolean m28582j() {
        m28583i0(false);
        return true;
    }

    public final void m28581j0(int i) {
        if (!m28585h()) {
            m28591d0(-2, i, 0);
            return;
        }
        synchronized (this) {
            if (this.f14132g != i) {
                this.f14132g = i;
                mo28548H();
            }
        }
    }

    public final void m28579k0(int i) {
        m28592d();
        if (this.f14136k != i) {
            boolean z = false;
            try {
                C4059n nVar = this.f14135j;
                if (nVar == null || i == 1024 || i == 16384 || nVar.m29108b(false)) {
                    mo28544J(i);
                }
                z = true;
            } catch (Throwable th) {
                Log.m14712w(Log.TAG_CAMERA, "Cannot change flash mode", th, new Object[0]);
            }
            if (z) {
                this.f14136k = i;
                this.f14127b.m28510H0(i);
            }
        }
    }

    public final void m28577l0(int i) {
        if (this.f14142q != i) {
            this.f14142q = i;
            this.f14127b.m28500R0(i);
        }
    }

    public final void m28576m() {
        if (!m28585h()) {
            m28593c0(-17);
            return;
        }
        C9758l0 l0Var = this.f14148w;
        if (l0Var != null) {
            l0Var.m7197G();
            this.f14148w = null;
        }
    }

    public final void m28575m0(int i, int i2) {
        if (!m28585h()) {
            m28591d0(-1, i, i2);
        } else if (this.f14130e != i || this.f14131f != i2) {
            this.f14130e = i;
            this.f14131f = i2;
            mo28538M(i, i2);
        }
    }

    public final void m28574n(String str, boolean z) {
        if (!m28585h()) {
            m28590e0(-15, z ? 1 : 0, 0, str);
        } else {
            this.f14148w.m7186R(str, z);
        }
    }

    public final void m28573n0(int i) {
        if (i >= this.f14142q) {
            i = 0;
        }
        if (this.f14143r != i) {
            this.f14143r = i;
        }
    }

    public final void m28572o() {
        if (this.f14127b.m29058x()) {
            m28571o0(false);
        }
    }

    public final void m28571o0(boolean z) {
        boolean z2;
        if (!m28585h()) {
            m28591d0(-13, z ? 1 : 0, 0);
        } else if (this.f14146u != z) {
            boolean z3 = true;
            if (z) {
                try {
                    this.f14145t = 0L;
                    m28570p(this.f14144s);
                    mo28534O();
                    this.f14145t = SystemClock.uptimeMillis();
                    z2 = true;
                } catch (Throwable th) {
                    Log.m14712w(Log.TAG_CAMERA, "Cannot start video capture", th, new Object[0]);
                    z2 = false;
                }
                if (z2) {
                    this.f14146u = true;
                    this.f14127b.m29100C(true, this.f14145t);
                    return;
                }
            }
            m28570p(-1);
            if (this.f14145t == 0 || SystemClock.uptimeMillis() - this.f14145t <= 1200) {
                z3 = false;
            }
            this.f14146u = false;
            this.f14127b.m29100C(false, -1L);
            mo28546I(z3, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    AbstractC4186b.this.m28606G((C6253l) obj);
                }
            });
        }
    }

    public final void m28570p(int i) {
        if (!m28585h()) {
            m28591d0(-12, i, 0);
        } else if (this.f14141p != i) {
            this.f14141p = i;
            mo28542K();
        }
    }

    public final void m28569p0(float f) {
        m28592d();
        if (this.f14137l != f) {
            boolean z = false;
            try {
                C4059n nVar = this.f14135j;
                if (nVar == null || nVar.m29106d()) {
                    mo28530T(f);
                }
                z = true;
            } catch (Throwable th) {
                Log.m14712w(Log.TAG_CAMERA, "Cannot zoom", th, new Object[0]);
            }
            if (z) {
                this.f14137l = f;
                this.f14127b.m29093R(f);
            }
        }
    }

    public final Handler m28568q() {
        return this.f14129d.m28053d();
    }

    public final void m28567q0(String str, C9758l0.AbstractC9760b bVar, String str2) {
        if (!m28585h()) {
            m28588f0(-14, new Object[]{str, bVar, str2});
        } else {
            this.f14148w.m7166f0(bVar, str, str2);
        }
    }

    public final Handler m28566r() {
        return this.f14128c.m28053d();
    }

    public final void m28565r0(int i) {
        if (!this.f14127b.m29058x() && this.f14138m) {
            this.f14144s = i;
            m28571o0(true);
        }
    }

    public abstract int mo28525s();

    public final void m28564s0() {
        if (!m28585h()) {
            if (!m28607E(-3)) {
                m28593c0(-3);
            }
        } else if (this.f14138m && this.f14147v) {
            C9758l0 l0Var = this.f14148w;
            if (l0Var == null || l0Var.m7202B()) {
                mo28540L();
            }
        }
    }

    public abstract int mo28524t();

    public final void m28563t0(int i, int i2, int i3) {
        if (!m28585h()) {
            if (!m28607E(-11)) {
                m28590e0(-11, i, i2, Integer.valueOf(i3));
            }
        } else if (this.f14138m) {
            this.f14127b.m28509I0(false);
            try {
                mo28531S(i, i2, i3);
            } catch (Throwable th) {
                Log.m14712w(Log.TAG_CAMERA, "Cannot take photo", th, new Object[0]);
                this.f14127b.m29056z(false);
            }
        }
    }

    public float m28562u() {
        C4059n nVar = this.f14135j;
        if (nVar != null) {
            return nVar.m29105e();
        }
        return 0.0f;
    }

    public final void m28561u0() {
        C4059n nVar;
        if (!m28585h()) {
            if (!m28607E(-4)) {
                m28593c0(-4);
            }
        } else if (this.f14138m && (nVar = this.f14135j) != null && nVar.m29108b(true)) {
            m28579k0(m28559w());
        }
    }

    public final int m28560v() {
        int i = this.f14143r + 1;
        if (i >= this.f14142q) {
            return 0;
        }
        return i;
    }

    public final int m28559w() {
        throw new UnsupportedOperationException("Method not decompiled: ee.AbstractC4186b.m28559w():int");
    }

    public final int m28558x() {
        int i = this.f14143r;
        if (i >= this.f14142q || i < 0) {
            this.f14143r = 0;
        }
        return this.f14143r;
    }

    public abstract int mo28520y();

    public final float m28557z() {
        return this.f14137l;
    }
}
