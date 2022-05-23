package fe;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import ee.n;
import gd.m;
import kb.j;
import ld.l;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.voip.VoIPController;
import vd.k0;

public abstract class b {
    public final Context f11922a;
    public final j f11923b;
    public int f11926e;
    public int f11927f;
    public int f11928g;
    public int f11929h;
    public int f11930i;
    public n f11931j;
    public float f11933l;
    public boolean f11934m;
    public boolean f11935n;
    public SurfaceTexture f11936o;
    public int f11939r;
    public int f11940s;
    public long f11941t;
    public boolean f11942u;
    public boolean f11943v;
    public k0 f11944w;
    public int f11932k = Log.TAG_CAMERA;
    public int f11937p = -1;
    public int f11938q = -1;
    public final a f11924c = new a(this, false);
    public final m f11925d = new a(this, true);

    public static class a extends m {
        public final b M;
        public final boolean N;

        public a(b bVar, boolean z10) {
            super("CameraThread");
            this.M = bVar;
            this.N = z10;
        }

        @Override
        public void f(Message message) {
            if (message.what >= 0) {
                if (this.N) {
                    this.M.A(message);
                } else {
                    this.M.D(message);
                }
            } else if (this.N) {
                this.M.B(message);
            } else {
                this.M.C(message);
            }
        }
    }

    public b(Context context, j jVar) {
        this.f11922a = context;
        this.f11923b = jVar;
    }

    public void G(l lVar) {
        if (lVar != null) {
            this.f11923b.A(lVar, true);
        }
    }

    public static int k(int i10, int i11, int i12, int i13, float f10, int i14) {
        if (i14 <= 0) {
            i14 = 1080;
        }
        boolean z10 = Math.max(i10, i11) <= i14;
        if (z10 != (Math.max(i12, i13) <= i14)) {
            return z10 ? -1 : 1;
        }
        float abs = Math.abs((Math.max(i10, i11) / Math.min(i10, i11)) - f10);
        float abs2 = Math.abs((Math.max(i12, i13) / Math.min(i12, i13)) - f10);
        if (abs != abs2) {
            return abs < abs2 ? -1 : 1;
        }
        int i15 = ((i10 * i11) > (i12 * i13) ? 1 : ((i10 * i11) == (i12 * i13) ? 0 : -1));
        if (i15 != 0) {
            return i15 > 0 ? -1 : 1;
        }
        if (i10 != i12) {
            return i10 > i12 ? -1 : 1;
        }
        if (i11 != i13) {
            return i11 > i13 ? -1 : 1;
        }
        return 0;
    }

    public static int l(int i10, int i11, int i12, int i13, long j10, float f10) {
        long j11 = i10 * i11;
        long j12 = i12 * i13;
        int i14 = (Math.abs(j10 - j11) > Math.abs(j10 - j12) ? 1 : (Math.abs(j10 - j11) == Math.abs(j10 - j12) ? 0 : -1));
        if (i14 != 0) {
            return i14 < 0 ? -1 : 1;
        }
        int i15 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
        if (i15 != 0) {
            return i15 > 0 ? -1 : 1;
        }
        float max = Math.max(i10, i11) / Math.min(i10, i11);
        float max2 = Math.max(i12, i13) / Math.min(i12, i13);
        float abs = Math.abs(f10 - max);
        float abs2 = Math.abs(f10 - max2);
        if (abs != abs2) {
            return abs < abs2 ? -1 : 1;
        }
        return 0;
    }

    public void A(Message message) {
    }

    public final void B(Message message) {
    }

    public final void C(Message message) {
        boolean z10 = false;
        switch (message.what) {
            case -17:
                m();
                return;
            case -16:
                V((k0) message.obj);
                return;
            case -15:
                String str = (String) message.obj;
                if (message.arg1 == 1) {
                    z10 = true;
                }
                n(str, z10);
                return;
            case -14:
                Object[] objArr = (Object[]) message.obj;
                q0((String) objArr[0], (k0.b) objArr[1], (String) objArr[2]);
                objArr[0] = null;
                objArr[1] = null;
                objArr[2] = null;
                return;
            case -13:
                if (message.arg1 == 1) {
                    z10 = true;
                }
                o0(z10);
                return;
            case -12:
                p(message.arg1);
                return;
            case -11:
                t0(message.arg1, message.arg2, ((Integer) message.obj).intValue());
                return;
            case -10:
                Y(Float.intBitsToFloat(message.arg1));
                return;
            case -9:
                a0();
                return;
            case -8:
                g();
                return;
            case -7:
                if (message.arg1 == 1) {
                    z10 = true;
                }
                i0(z10);
                return;
            case -6:
                if (message.arg1 == 1) {
                    z10 = true;
                }
                g0(z10);
                return;
            case VoIPController.ERROR_CONNECTION_SERVICE:
            default:
                return;
            case VoIPController.ERROR_INSECURE_UPGRADE:
                u0();
                return;
            case VoIPController.ERROR_LOCALIZED:
                s0();
                return;
            case VoIPController.ERROR_PRIVACY:
                j0(message.arg1);
                return;
            case -1:
                m0(message.arg1, message.arg2);
                return;
        }
    }

    public void D(Message message) {
    }

    public final boolean E(int i10) {
        return this.f11924c.d().hasMessages(i10);
    }

    public abstract boolean F();

    public abstract void H();

    public abstract void I(boolean z10, j<l> jVar);

    public abstract void J(int i10);

    public abstract void K();

    public abstract void L();

    public abstract void M(int i10, int i11);

    public abstract void N();

    public abstract void O();

    public void P(SurfaceTexture surfaceTexture, int i10, int i11) {
        synchronized (this) {
            this.f11936o = surfaceTexture;
            this.f11929h = i10;
            this.f11930i = i11;
        }
        g();
    }

    public void Q(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.f11936o = null;
            this.f11930i = 0;
            this.f11929h = 0;
        }
        g();
    }

    public void R(SurfaceTexture surfaceTexture, int i10, int i11) {
        synchronized (this) {
            this.f11929h = i10;
            this.f11930i = i11;
        }
    }

    public abstract void S(int i10, int i11, int i12);

    public abstract void T(float f10);

    public abstract boolean U(SurfaceTexture surfaceTexture);

    public final void V(k0 k0Var) {
        if (!h()) {
            f0(-16, k0Var);
        } else if (this.f11944w == k0Var && this.f11934m && !this.f11943v) {
            try {
                U(k0Var.S());
                this.f11943v = true;
            } catch (Throwable unused) {
                Log.w((int) Log.TAG_CAMERA, "Cannot open camera lately", new Object[0]);
                g0(false);
            }
        }
    }

    public final boolean W() {
        i0(true);
        return true;
    }

    public abstract boolean X();

    public final void Y(float f10) {
        if (!h()) {
            d0(-10, Float.floatToIntBits(f10), 0);
        } else if (this.f11934m && this.f11931j.d()) {
            p0(f10);
        }
    }

    public final void Z() {
        k0(Log.TAG_CAMERA);
    }

    public void a0() {
        if (!h()) {
            if (!E(-9)) {
                c0(-9);
            }
        } else if (!this.f11934m) {
            k0(Log.TAG_CAMERA);
            p0(0.0f);
            n0(0);
            N();
        }
    }

    public final void b0() {
        p0(0.0f);
    }

    public final void c0(int i10) {
        a aVar = this.f11924c;
        aVar.h(Message.obtain(aVar.d(), i10), 0L);
    }

    public final void d() {
        if (Thread.currentThread() != this.f11924c) {
            throw new RuntimeException();
        }
    }

    public final void d0(int i10, int i11, int i12) {
        a aVar = this.f11924c;
        aVar.h(Message.obtain(aVar.d(), i10, i11, i12), 0L);
    }

    public abstract int e();

    public final void e0(int i10, int i11, int i12, Object obj) {
        a aVar = this.f11924c;
        aVar.h(Message.obtain(aVar.d(), i10, i11, i12, obj), 0L);
    }

    public final boolean f() {
        return Thread.currentThread() == this.f11925d;
    }

    public final void f0(int i10, Object obj) {
        a aVar = this.f11924c;
        aVar.h(Message.obtain(aVar.d(), i10, obj), 0L);
    }

    public final void g() {
        if (!h()) {
            c0(-8);
        } else {
            g0(this.f11935n && this.f11936o != null);
        }
    }

    public final void g0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: fe.b.g0(boolean):void");
    }

    public final boolean h() {
        return Thread.currentThread() == this.f11924c;
    }

    public final void h0(n nVar) {
        synchronized (this.f11923b) {
            if (this.f11931j != nVar) {
                this.f11931j = nVar;
            }
        }
    }

    public abstract void i();

    public final void i0(boolean z10) {
        if (!h()) {
            d0(-7, z10 ? 1 : 0, 0);
        } else if (this.f11935n != z10) {
            this.f11935n = z10;
            g();
        }
    }

    public final boolean j() {
        i0(false);
        return true;
    }

    public final void j0(int i10) {
        if (!h()) {
            d0(-2, i10, 0);
            return;
        }
        synchronized (this) {
            if (this.f11928g != i10) {
                this.f11928g = i10;
                H();
            }
        }
    }

    public final void k0(int i10) {
        d();
        if (this.f11932k != i10) {
            boolean z10 = false;
            try {
                n nVar = this.f11931j;
                if (nVar == null || i10 == 1024 || i10 == 16384 || nVar.b(false)) {
                    J(i10);
                }
                z10 = true;
            } catch (Throwable th) {
                Log.w(Log.TAG_CAMERA, "Cannot change flash mode", th, new Object[0]);
            }
            if (z10) {
                this.f11932k = i10;
                this.f11923b.H0(i10);
            }
        }
    }

    public final void l0(int i10) {
        if (this.f11938q != i10) {
            this.f11938q = i10;
            this.f11923b.R0(i10);
        }
    }

    public final void m() {
        if (!h()) {
            c0(-17);
            return;
        }
        k0 k0Var = this.f11944w;
        if (k0Var != null) {
            k0Var.G();
            this.f11944w = null;
        }
    }

    public final void m0(int i10, int i11) {
        if (!h()) {
            d0(-1, i10, i11);
        } else if (this.f11926e != i10 || this.f11927f != i11) {
            this.f11926e = i10;
            this.f11927f = i11;
            M(i10, i11);
        }
    }

    public final void n(String str, boolean z10) {
        if (!h()) {
            e0(-15, z10 ? 1 : 0, 0, str);
        } else {
            this.f11944w.R(str, z10);
        }
    }

    public final void n0(int i10) {
        if (i10 >= this.f11938q) {
            i10 = 0;
        }
        if (this.f11939r != i10) {
            this.f11939r = i10;
        }
    }

    public final void o() {
        if (this.f11923b.x()) {
            o0(false);
        }
    }

    public final void o0(boolean z10) {
        boolean z11;
        if (!h()) {
            d0(-13, z10 ? 1 : 0, 0);
        } else if (this.f11942u != z10) {
            boolean z12 = true;
            if (z10) {
                try {
                    this.f11941t = 0L;
                    p(this.f11940s);
                    O();
                    this.f11941t = SystemClock.uptimeMillis();
                    z11 = true;
                } catch (Throwable th) {
                    Log.w(Log.TAG_CAMERA, "Cannot start video capture", th, new Object[0]);
                    z11 = false;
                }
                if (z11) {
                    this.f11942u = true;
                    this.f11923b.C(true, this.f11941t);
                    return;
                }
            }
            p(-1);
            if (this.f11941t == 0 || SystemClock.uptimeMillis() - this.f11941t <= 1200) {
                z12 = false;
            }
            this.f11942u = false;
            this.f11923b.C(false, -1L);
            I(z12, new j() {
                @Override
                public final void a(Object obj) {
                    b.this.G((l) obj);
                }
            });
        }
    }

    public final void p(int i10) {
        if (!h()) {
            d0(-12, i10, 0);
        } else if (this.f11937p != i10) {
            this.f11937p = i10;
            K();
        }
    }

    public final void p0(float f10) {
        d();
        if (this.f11933l != f10) {
            boolean z10 = false;
            try {
                n nVar = this.f11931j;
                if (nVar == null || nVar.d()) {
                    T(f10);
                }
                z10 = true;
            } catch (Throwable th) {
                Log.w(Log.TAG_CAMERA, "Cannot zoom", th, new Object[0]);
            }
            if (z10) {
                this.f11933l = f10;
                this.f11923b.R(f10);
            }
        }
    }

    public final Handler q() {
        return this.f11925d.d();
    }

    public final void q0(String str, k0.b bVar, String str2) {
        if (!h()) {
            f0(-14, new Object[]{str, bVar, str2});
        } else {
            this.f11944w.f0(bVar, str, str2);
        }
    }

    public final Handler r() {
        return this.f11924c.d();
    }

    public final void r0(int i10) {
        if (!this.f11923b.x() && this.f11934m) {
            this.f11940s = i10;
            o0(true);
        }
    }

    public abstract int s();

    public final void s0() {
        if (!h()) {
            if (!E(-3)) {
                c0(-3);
            }
        } else if (this.f11934m && this.f11943v) {
            k0 k0Var = this.f11944w;
            if (k0Var == null || k0Var.B()) {
                L();
            }
        }
    }

    public abstract int t();

    public final void t0(int i10, int i11, int i12) {
        if (!h()) {
            if (!E(-11)) {
                e0(-11, i10, i11, Integer.valueOf(i12));
            }
        } else if (this.f11934m) {
            this.f11923b.I0(false);
            try {
                S(i10, i11, i12);
            } catch (Throwable th) {
                Log.w(Log.TAG_CAMERA, "Cannot take photo", th, new Object[0]);
                this.f11923b.z(false);
            }
        }
    }

    public float u() {
        n nVar = this.f11931j;
        if (nVar != null) {
            return nVar.e();
        }
        return 0.0f;
    }

    public final void u0() {
        n nVar;
        if (!h()) {
            if (!E(-4)) {
                c0(-4);
            }
        } else if (this.f11934m && (nVar = this.f11931j) != null && nVar.b(true)) {
            k0(w());
        }
    }

    public final int v() {
        int i10 = this.f11939r + 1;
        if (i10 >= this.f11938q) {
            return 0;
        }
        return i10;
    }

    public final int w() {
        throw new UnsupportedOperationException("Method not decompiled: fe.b.w():int");
    }

    public final int x() {
        int i10 = this.f11939r;
        if (i10 >= this.f11938q || i10 < 0) {
            this.f11939r = 0;
        }
        return this.f11939r;
    }

    public abstract int y();

    public final float z() {
        return this.f11933l;
    }
}
