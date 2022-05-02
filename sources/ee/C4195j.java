package ee;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import be.C1379j0;
import de.AbstractC4055l;
import de.AbstractTextureView$SurfaceTextureListenerC4068w;
import de.C4040h0;
import de.C4058m0;
import org.thunderdog.challegram.Log;
import p108hb.C5069h;
import p156kd.C6253l;
import p292ud.C9758l0;

public class C4195j extends AbstractTextureView$SurfaceTextureListenerC4068w {
    public AbstractC4186b f14179f0;
    public C4040h0 f14180g0;
    public boolean f14181h0;
    public boolean f14183j0;
    public boolean f14184k0;
    public AbstractC4186b f14185l0;
    public volatile boolean f14186m0;
    public boolean f14188o0;
    public volatile int f14182i0 = -1;
    public final HandlerC4196a f14187n0 = new HandlerC4196a(this);

    public static class HandlerC4196a extends Handler {
        public final C4195j f14189a;

        public HandlerC4196a(C4195j jVar) {
            super(Looper.getMainLooper());
            this.f14189a = jVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f14189a.m28505M0(message);
        }
    }

    public C4195j(Context context, AbstractC4055l lVar) {
        super(context, lVar);
        C4193h hVar = new C4193h(context, this);
        this.f14179f0 = hVar;
        hVar.m28581j0(m29068m());
        if (lVar.mo29122j4() && this.f14180g0 == null) {
            this.f14180g0 = new C4040h0(this);
        }
    }

    public void m28512F0(int i, int i2) {
        ((C4058m0) this.f13728c).m29110a(i, i2);
    }

    public void m28517A0() {
        throw new UnsupportedOperationException("Method not decompiled: ee.C4195j.m28517A0():void");
    }

    public final boolean m28516B0() {
        try {
            return this.f14179f0.m28582j();
        } catch (Throwable th) {
            Log.m14712w(Log.TAG_CAMERA, "Cannot close preview", th, new Object[0]);
            return false;
        }
    }

    public void m28515C0(String str, boolean z) {
        this.f14179f0.m28574n(str, z);
    }

    public int m28514D0() {
        return this.f14179f0.mo28527e();
    }

    public int m28513E0() {
        return this.f14179f0.mo28520y();
    }

    @Override
    public void mo27772F(int i) {
        AbstractC4186b bVar = this.f14179f0;
        if (bVar != null) {
            bVar.m28581j0(i);
        }
    }

    @Override
    public void mo27771G() {
        this.f14179f0.m28572o();
    }

    public void m28511G0(boolean z, boolean z2, boolean z3) {
        this.f13726b.mo29123f7(z, z2, z3);
    }

    public void m28510H0(int i) {
        this.f13726b.mo29127P6(i);
    }

    public void m28509I0(boolean z) {
        this.f13726b.mo29130L3(z);
    }

    @Override
    public void mo27769J(float f) {
        this.f14179f0.m28600Y(C5069h.m24088e(f, mo27755p(), mo27756o()));
    }

    public void m28508J0(byte[] bArr, Camera camera) {
        if (this.f14180g0 != null && this.f14179f0.f14138m) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                this.f14180g0.m29242r(bArr, previewSize.width, previewSize.height, (C4193h) this.f14179f0);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public void mo27768K() {
        this.f14179f0.m28597a0();
    }

    public void m28507K0() {
        if (!this.f14188o0 && this.f14186m0) {
            Log.m14721i((int) Log.TAG_CAMERA, "onRenderedFirstFrame", new Object[0]);
            this.f14188o0 = true;
            this.f13726b.mo29124e();
        }
    }

    public final int m28506L0() {
        try {
            return 1 ^ this.f14179f0.m28601W();
        } catch (Throwable th) {
            Log.m14712w(Log.TAG_CAMERA, "Cannot open preview", th, new Object[0]);
            if (!(this.f14179f0 instanceof C4193h)) {
                return 2;
            }
            m28497U0(th);
            return 1;
        }
    }

    public final void m28505M0(Message message) {
        int i = message.what;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                Object obj = message.obj;
                if (obj != null) {
                    C6253l lVar = (C6253l) obj;
                    if (message.arg1 != 1) {
                        z = false;
                    }
                    m29102A(lVar, z);
                    return;
                }
                if (message.arg1 != 1) {
                    z = false;
                }
                m29056z(z);
                return;
            }
            return;
        }
        m28496V0();
    }

    @Override
    public boolean mo27767N(int i) {
        Log.m14721i((int) Log.TAG_CAMERA, "requestVideoCapture, orientation: %d", Integer.valueOf(i));
        if (!this.f14179f0.mo28551F()) {
            return false;
        }
        this.f14179f0.m28565r0(i);
        return true;
    }

    public boolean m28504N0(String str, C9758l0.AbstractC9760b bVar, String str2) {
        Log.m14721i((int) Log.TAG_CAMERA, "requestRoundCapture, key: %s", str);
        if (!this.f14179f0.mo28551F()) {
            return false;
        }
        this.f14179f0.m28567q0(str, bVar, str2);
        return true;
    }

    public void m28503O0(boolean z) {
        if (this.f14188o0) {
            Log.m14721i((int) Log.TAG_CAMERA, "resetRenderState", new Object[0]);
            this.f14188o0 = false;
            this.f13726b.mo29119n(z, null);
        }
    }

    public final void m28502P0(int i) {
        HandlerC4196a aVar = this.f14187n0;
        aVar.sendMessage(Message.obtain(aVar, i));
    }

    @Override
    public void mo27766Q(int i, int i2, int i3) {
        this.f14179f0.m28563t0(i, i2, i3);
    }

    public void m28501Q0(final int i, final int i2) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C4195j.this.m28512F0(i, i2);
            }
        });
    }

    public void m28500R0(int i) {
        synchronized (this) {
            if (this.f14182i0 != i) {
                this.f14182i0 = i;
                this.f13726b.mo29120m1(i);
            }
        }
    }

    @Override
    public void mo27765S() {
        this.f14183j0 = true;
        m28517A0();
    }

    public void m28499S0(boolean z) {
        synchronized (this) {
            if (this.f14181h0 != z) {
                this.f14181h0 = z;
                if (!z) {
                    this.f14179f0.m28576m();
                }
            }
        }
    }

    public void m28498T0(String str) {
        this.f13726b.mo29126c1(str);
    }

    @Override
    public void mo27764U() {
        this.f14184k0 = true;
        m28517A0();
    }

    public void m28497U0(Throwable th) {
        this.f13726b.mo29126c1(Log.toString(th));
    }

    public void m28496V0() {
        if (!C1379j0.m37357K()) {
            m28502P0(0);
        } else if (this.f14179f0 instanceof C4193h) {
            Log.m14727e((int) Log.TAG_CAMERA, "Trying to switch to legacy API, when already using legacy API", new Object[0]);
        } else {
            Log.m14711w((int) Log.TAG_CAMERA, "Switching to legacy API.", new Object[0]);
            mo27761i();
            this.f14185l0 = null;
            this.f14179f0 = new C4193h(this.f13724a, this);
            if (m29055q0() != null) {
                this.f14179f0.m28605P(m29055q0(), m29053s0(), m29054r0());
            }
            m28517A0();
        }
    }

    public void m28495W0() {
        if (this.f14182i0 != -1) {
            this.f14179f0.m28564s0();
        }
    }

    public boolean m28494X0() {
        boolean z;
        synchronized (this) {
            z = this.f14181h0;
        }
        return z;
    }

    @Override
    public void mo27763b0() {
        this.f14184k0 = false;
        m28517A0();
    }

    @Override
    public void mo27762h() {
        this.f14183j0 = false;
        m28517A0();
    }

    @Override
    public void mo27761i() {
        C4040h0 h0Var = this.f14180g0;
        if (h0Var != null) {
            h0Var.m29252h();
            this.f14180g0 = null;
        }
        this.f14185l0 = this.f14179f0;
        m28517A0();
    }

    @Override
    public boolean mo27760k(Bitmap bitmap) {
        try {
            if (((C4058m0) this.f13728c).isAvailable()) {
                ((C4058m0) this.f13728c).getBitmap(bitmap);
                return true;
            }
        } catch (Throwable th) {
            Log.m14728e(Log.TAG_CAMERA, "Unable to take camera preview", th, new Object[0]);
        }
        return false;
    }

    @Override
    public float mo27759l() {
        return this.f14179f0.m28557z();
    }

    @Override
    public void mo27758l0() {
        m28495W0();
    }

    @Override
    public void mo27757m0() {
        this.f14179f0.m28561u0();
    }

    @Override
    public float mo27756o() {
        return this.f14179f0.m28562u();
    }

    @Override
    public float mo27755p() {
        return 0.0f;
    }

    @Override
    public float mo27754q() {
        return 1.0f;
    }

    @Override
    public void mo28493u0(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14179f0.m28605P(surfaceTexture, i, i2);
    }

    @Override
    public void mo28492v0(SurfaceTexture surfaceTexture) {
        this.f14179f0.m28604Q(surfaceTexture);
    }

    @Override
    public boolean mo27747w() {
        return this.f14186m0;
    }

    @Override
    public void mo28491w0(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14179f0.m28603R(surfaceTexture, i, i2);
    }

    @Override
    public void mo28490x0(int i, int i2) {
        this.f14179f0.m28575m0(i, i2);
    }
}
