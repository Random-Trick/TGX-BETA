package p045d5;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1203h0;
import p020b5.C1217m;
import p032c5.AbstractC1622l;
import p174m3.C6600g1;

public final class C3611h implements AbstractC1622l, AbstractC3601a {
    public int f12322R;
    public SurfaceTexture f12323S;
    public byte[] f12326V;
    public final AtomicBoolean f12327a = new AtomicBoolean();
    public final AtomicBoolean f12328b = new AtomicBoolean(true);
    public final C3608f f12329c = new C3608f();
    public final C3603c f12317M = new C3603c();
    public final C1203h0<Long> f12318N = new C1203h0<>();
    public final C1203h0<C3604d> f12319O = new C1203h0<>();
    public final float[] f12320P = new float[16];
    public final float[] f12321Q = new float[16];
    public volatile int f12324T = 0;
    public int f12325U = -1;

    public void m29862f(SurfaceTexture surfaceTexture) {
        this.f12327a.set(true);
    }

    @Override
    public void mo19324a(long j, float[] fArr) {
        this.f12317M.m29886e(j, fArr);
    }

    public void m29864c(float[] fArr, boolean z) {
        GLES20.glClear(Log.TAG_VIDEO);
        C1217m.m37936b();
        if (this.f12327a.compareAndSet(true, false)) {
            ((SurfaceTexture) C1186a.m38188e(this.f12323S)).updateTexImage();
            C1217m.m37936b();
            if (this.f12328b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f12320P, 0);
            }
            long timestamp = this.f12323S.getTimestamp();
            Long g = this.f12318N.m38066g(timestamp);
            if (g != null) {
                this.f12317M.m29888c(this.f12320P, g.longValue());
            }
            C3604d j = this.f12319O.m38063j(timestamp);
            if (j != null) {
                this.f12329c.m29870d(j);
            }
        }
        Matrix.multiplyMM(this.f12321Q, 0, fArr, 0, this.f12320P, 0);
        this.f12329c.m29873a(this.f12322R, this.f12321Q, z);
    }

    @Override
    public void mo19323d() {
        this.f12318N.m38070c();
        this.f12317M.m29887d();
        this.f12328b.set(true);
    }

    public SurfaceTexture m29863e() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C1217m.m37936b();
        this.f12329c.m29872b();
        C1217m.m37936b();
        this.f12322R = C1217m.m37933e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12322R);
        this.f12323S = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
            @Override
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C3611h.this.m29862f(surfaceTexture2);
            }
        });
        return this.f12323S;
    }

    @Override
    public void mo19322g(long j, long j2, C6600g1 g1Var, MediaFormat mediaFormat) {
        this.f12318N.m38072a(j2, Long.valueOf(j));
        m29860i(g1Var.f20588e0, g1Var.f20589f0, j2);
    }

    public void m29861h(int i) {
        this.f12324T = i;
    }

    public final void m29860i(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f12326V;
        int i2 = this.f12325U;
        this.f12326V = bArr;
        if (i == -1) {
            i = this.f12324T;
        }
        this.f12325U = i;
        if (i2 != i || !Arrays.equals(bArr2, this.f12326V)) {
            C3604d dVar = null;
            byte[] bArr3 = this.f12326V;
            if (bArr3 != null) {
                dVar = C3607e.m29880a(bArr3, this.f12325U);
            }
            if (dVar == null || !C3608f.m29871c(dVar)) {
                dVar = C3604d.m29884b(this.f12325U);
            }
            this.f12319O.m38072a(j, dVar);
        }
    }
}
