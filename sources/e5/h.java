package e5;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import c5.a;
import c5.h0;
import c5.m;
import d5.l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.q1;
import org.thunderdog.challegram.Log;

public final class h implements l, a {
    public int R;
    public SurfaceTexture S;
    public byte[] V;
    public final AtomicBoolean f10618a = new AtomicBoolean();
    public final AtomicBoolean f10619b = new AtomicBoolean(true);
    public final f f10620c = new f();
    public final c M = new c();
    public final h0<Long> N = new h0<>();
    public final h0<d> O = new h0<>();
    public final float[] P = new float[16];
    public final float[] Q = new float[16];
    public volatile int T = 0;
    public int U = -1;

    public void f(SurfaceTexture surfaceTexture) {
        this.f10618a.set(true);
    }

    @Override
    public void a(long j10, float[] fArr) {
        this.M.e(j10, fArr);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(Log.TAG_VIDEO);
        m.g();
        if (this.f10618a.compareAndSet(true, false)) {
            ((SurfaceTexture) a.e(this.S)).updateTexImage();
            m.g();
            if (this.f10619b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.P, 0);
            }
            long timestamp = this.S.getTimestamp();
            Long g10 = this.N.g(timestamp);
            if (g10 != null) {
                this.M.c(this.P, g10.longValue());
            }
            d j10 = this.O.j(timestamp);
            if (j10 != null) {
                this.f10620c.d(j10);
            }
        }
        Matrix.multiplyMM(this.Q, 0, fArr, 0, this.P, 0);
        this.f10620c.a(this.R, this.Q, z10);
    }

    @Override
    public void d() {
        this.N.c();
        this.M.d();
        this.f10619b.set(true);
    }

    public SurfaceTexture e() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        m.g();
        this.f10620c.b();
        m.g();
        this.R = m.j();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.R);
        this.S = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
            @Override
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                h.this.f(surfaceTexture2);
            }
        });
        return this.S;
    }

    @Override
    public void g(long j10, long j11, q1 q1Var, MediaFormat mediaFormat) {
        this.N.a(j11, Long.valueOf(j10));
        i(q1Var.f16905e0, q1Var.f16906f0, j11);
    }

    public void h(int i10) {
        this.T = i10;
    }

    public final void i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.V;
        int i11 = this.U;
        this.V = bArr;
        if (i10 == -1) {
            i10 = this.T;
        }
        this.U = i10;
        if (i11 != i10 || !Arrays.equals(bArr2, this.V)) {
            d dVar = null;
            byte[] bArr3 = this.V;
            if (bArr3 != null) {
                dVar = e.a(bArr3, this.U);
            }
            if (dVar == null || !f.c(dVar)) {
                dVar = d.b(this.U);
            }
            this.O.a(j10, dVar);
        }
    }
}
