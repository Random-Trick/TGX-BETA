package fe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ce.j0;
import ee.h0;
import ee.l;
import ee.m0;
import ee.w;
import ib.h;
import org.thunderdog.challegram.Log;
import vd.k0;

public class j extends w {
    public b f11958f0;
    public h0 f11959g0;
    public boolean f11960h0;
    public boolean f11962j0;
    public boolean f11963k0;
    public b f11964l0;
    public volatile boolean f11965m0;
    public boolean f11967o0;
    public volatile int f11961i0 = -1;
    public final a f11966n0 = new a(this);

    public static class a extends Handler {
        public final j f11968a;

        public a(j jVar) {
            super(Looper.getMainLooper());
            this.f11968a = jVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f11968a.M0(message);
        }
    }

    public j(Context context, l lVar) {
        super(context, lVar);
        h hVar = new h(context, this);
        this.f11958f0 = hVar;
        hVar.j0(m());
        if (lVar.W3() && this.f11959g0 == null) {
            this.f11959g0 = new h0(this);
        }
    }

    public void F0(int i10, int i11) {
        ((m0) this.f11742c).a(i10, i11);
    }

    public void A0() {
        throw new UnsupportedOperationException("Method not decompiled: fe.j.A0():void");
    }

    public final boolean B0() {
        try {
            return this.f11958f0.j();
        } catch (Throwable th) {
            Log.w(Log.TAG_CAMERA, "Cannot close preview", th, new Object[0]);
            return false;
        }
    }

    public void C0(String str, boolean z10) {
        this.f11958f0.n(str, z10);
    }

    public int D0() {
        return this.f11958f0.e();
    }

    public int E0() {
        return this.f11958f0.y();
    }

    @Override
    public void F(int i10) {
        b bVar = this.f11958f0;
        if (bVar != null) {
            bVar.j0(i10);
        }
    }

    @Override
    public void G() {
        this.f11958f0.o();
    }

    public void G0(boolean z10, boolean z11, boolean z12) {
        this.f11740b.f7(z10, z11, z12);
    }

    public void H0(int i10) {
        this.f11740b.P6(i10);
    }

    public void I0(boolean z10) {
        this.f11740b.E3(z10);
    }

    @Override
    public void J(float f10) {
        this.f11958f0.Y(h.e(f10, p(), o()));
    }

    public void J0(byte[] bArr, Camera camera) {
        if (this.f11959g0 != null && this.f11958f0.f11934m) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                this.f11959g0.r(bArr, previewSize.width, previewSize.height, (h) this.f11958f0);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public void K() {
        this.f11958f0.a0();
    }

    public void K0() {
        if (!this.f11967o0 && this.f11965m0) {
            Log.i((int) Log.TAG_CAMERA, "onRenderedFirstFrame", new Object[0]);
            this.f11967o0 = true;
            this.f11740b.q();
        }
    }

    public final int L0() {
        try {
            return 1 ^ this.f11958f0.W();
        } catch (Throwable th) {
            Log.w(Log.TAG_CAMERA, "Cannot open preview", th, new Object[0]);
            if (!(this.f11958f0 instanceof h)) {
                return 2;
            }
            U0(th);
            return 1;
        }
    }

    public final void M0(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 == 1) {
                Object obj = message.obj;
                if (obj != null) {
                    ld.l lVar = (ld.l) obj;
                    if (message.arg1 != 1) {
                        z10 = false;
                    }
                    A(lVar, z10);
                    return;
                }
                if (message.arg1 != 1) {
                    z10 = false;
                }
                z(z10);
                return;
            }
            return;
        }
        V0();
    }

    @Override
    public boolean N(int i10) {
        Log.i((int) Log.TAG_CAMERA, "requestVideoCapture, orientation: %d", Integer.valueOf(i10));
        if (!this.f11958f0.F()) {
            return false;
        }
        this.f11958f0.r0(i10);
        return true;
    }

    public boolean N0(String str, k0.b bVar, String str2) {
        Log.i((int) Log.TAG_CAMERA, "requestRoundCapture, key: %s", str);
        if (!this.f11958f0.F()) {
            return false;
        }
        this.f11958f0.q0(str, bVar, str2);
        return true;
    }

    public void O0(boolean z10) {
        if (this.f11967o0) {
            Log.i((int) Log.TAG_CAMERA, "resetRenderState", new Object[0]);
            this.f11967o0 = false;
            this.f11740b.r(z10, null);
        }
    }

    public final void P0(int i10) {
        a aVar = this.f11966n0;
        aVar.sendMessage(Message.obtain(aVar, i10));
    }

    @Override
    public void Q(int i10, int i11, int i12) {
        this.f11958f0.t0(i10, i11, i12);
    }

    public void Q0(final int i10, final int i11) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j.this.F0(i10, i11);
            }
        });
    }

    public void R0(int i10) {
        synchronized (this) {
            if (this.f11961i0 != i10) {
                this.f11961i0 = i10;
                this.f11740b.g1(i10);
            }
        }
    }

    @Override
    public void S() {
        this.f11962j0 = true;
        A0();
    }

    public void S0(boolean z10) {
        synchronized (this) {
            if (this.f11960h0 != z10) {
                this.f11960h0 = z10;
                if (!z10) {
                    this.f11958f0.m();
                }
            }
        }
    }

    public void T0(String str) {
        this.f11740b.Z0(str);
    }

    @Override
    public void U() {
        this.f11963k0 = true;
        A0();
    }

    public void U0(Throwable th) {
        this.f11740b.Z0(Log.toString(th));
    }

    public void V0() {
        if (!j0.K()) {
            P0(0);
        } else if (this.f11958f0 instanceof h) {
            Log.e((int) Log.TAG_CAMERA, "Trying to switch to legacy API, when already using legacy API", new Object[0]);
        } else {
            Log.w((int) Log.TAG_CAMERA, "Switching to legacy API.", new Object[0]);
            i();
            this.f11964l0 = null;
            this.f11958f0 = new h(this.f11738a, this);
            if (q0() != null) {
                this.f11958f0.P(q0(), s0(), r0());
            }
            A0();
        }
    }

    public void W0() {
        if (this.f11961i0 != -1) {
            this.f11958f0.s0();
        }
    }

    public boolean X0() {
        boolean z10;
        synchronized (this) {
            z10 = this.f11960h0;
        }
        return z10;
    }

    @Override
    public void b0() {
        this.f11963k0 = false;
        A0();
    }

    @Override
    public void h() {
        this.f11962j0 = false;
        A0();
    }

    @Override
    public void i() {
        h0 h0Var = this.f11959g0;
        if (h0Var != null) {
            h0Var.h();
            this.f11959g0 = null;
        }
        this.f11964l0 = this.f11958f0;
        A0();
    }

    @Override
    public boolean k(Bitmap bitmap) {
        try {
            if (((m0) this.f11742c).isAvailable()) {
                ((m0) this.f11742c).getBitmap(bitmap);
                return true;
            }
        } catch (Throwable th) {
            Log.e(Log.TAG_CAMERA, "Unable to take camera preview", th, new Object[0]);
        }
        return false;
    }

    @Override
    public float l() {
        return this.f11958f0.z();
    }

    @Override
    public void l0() {
        W0();
    }

    @Override
    public void m0() {
        this.f11958f0.u0();
    }

    @Override
    public float o() {
        return this.f11958f0.u();
    }

    @Override
    public float p() {
        return 0.0f;
    }

    @Override
    public float q() {
        return 1.0f;
    }

    @Override
    public void u0(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f11958f0.P(surfaceTexture, i10, i11);
    }

    @Override
    public void v0(SurfaceTexture surfaceTexture) {
        this.f11958f0.Q(surfaceTexture);
    }

    @Override
    public boolean w() {
        return this.f11965m0;
    }

    @Override
    public void w0(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f11958f0.R(surfaceTexture, i10, i11);
    }

    @Override
    public void x0(int i10, int i11) {
        this.f11958f0.m0(i10, i11);
    }
}
