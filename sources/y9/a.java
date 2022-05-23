package y9;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;
import g9.c;
import j9.e;
import x9.i;

public class a {
    public static final i f26648k = new i("FrameDrawer");
    public SurfaceTexture f26649a;
    public Surface f26650b;
    public e f26651c;
    public boolean f26657i;
    public float f26653e = 1.0f;
    public float f26654f = 1.0f;
    public int f26655g = 0;
    public boolean f26656h = false;
    public final Object f26658j = new Object();
    public c f26652d = new c();

    public class C0253a implements SurfaceTexture.OnFrameAvailableListener {
        public C0253a() {
        }

        @Override
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            a.f26648k.h("New frame available");
            synchronized (a.this.f26658j) {
                if (!a.this.f26657i) {
                    a.this.f26657i = true;
                    a.this.f26658j.notifyAll();
                } else {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
            }
        }
    }

    public a() {
        l9.a aVar = new l9.a();
        e eVar = new e();
        this.f26651c = eVar;
        eVar.n(aVar);
        SurfaceTexture surfaceTexture = new SurfaceTexture(aVar.e());
        this.f26649a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C0253a());
        this.f26650b = new Surface(this.f26649a);
    }

    public final void e() {
        synchronized (this.f26658j) {
            while (!this.f26657i) {
                try {
                    this.f26658j.wait(10000L);
                    if (!this.f26657i) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.f26657i = false;
        }
        this.f26649a.updateTexImage();
    }

    public void f() {
        e();
        g();
    }

    public final void g() {
        this.f26649a.getTransformMatrix(this.f26651c.m());
        float f10 = 1.0f / this.f26653e;
        float f11 = 1.0f / this.f26654f;
        Matrix.translateM(this.f26651c.m(), 0, (1.0f - f10) / 2.0f, (1.0f - f11) / 2.0f, 0.0f);
        Matrix.scaleM(this.f26651c.m(), 0, f10, f11, 1.0f);
        Matrix.translateM(this.f26651c.m(), 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.f26651c.m(), 0, this.f26655g, 0.0f, 0.0f, 1.0f);
        if (this.f26656h) {
            Matrix.scaleM(this.f26651c.m(), 0, 1.0f, -1.0f, 1.0f);
        }
        Matrix.translateM(this.f26651c.m(), 0, -0.5f, -0.5f, 0.0f);
        this.f26651c.c(this.f26652d);
    }

    public Surface h() {
        return this.f26650b;
    }

    public void i() {
        this.f26651c.k();
        this.f26650b.release();
        this.f26650b = null;
        this.f26649a = null;
        this.f26652d = null;
        this.f26651c = null;
    }

    public void j(boolean z10) {
        this.f26656h = z10;
    }

    public void k(int i10) {
        this.f26655g = i10;
    }

    public void l(float f10, float f11) {
        this.f26653e = f10;
        this.f26654f = f11;
    }
}
