package p331x9;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;
import p078f9.C4330c;
import p122i9.C5272e;
import p152k9.C6218a;
import p316w9.C10007i;

public class C10160a {
    public static final C10007i f32867k = new C10007i("FrameDrawer");
    public SurfaceTexture f32868a;
    public Surface f32869b;
    public C5272e f32870c;
    public boolean f32876i;
    public float f32872e = 1.0f;
    public float f32873f = 1.0f;
    public int f32874g = 0;
    public boolean f32875h = false;
    public final Object f32877j = new Object();
    public C4330c f32871d = new C4330c();

    public class C10161a implements SurfaceTexture.OnFrameAvailableListener {
        public C10161a() {
        }

        @Override
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C10160a.f32867k.m6262h("New frame available");
            synchronized (C10160a.this.f32877j) {
                if (!C10160a.this.f32876i) {
                    C10160a.this.f32876i = true;
                    C10160a.this.f32877j.notifyAll();
                } else {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
            }
        }
    }

    public C10160a() {
        C6218a aVar = new C6218a();
        C5272e eVar = new C5272e();
        this.f32870c = eVar;
        eVar.m23470n(aVar);
        SurfaceTexture surfaceTexture = new SurfaceTexture(aVar.m21047e());
        this.f32868a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C10161a());
        this.f32869b = new Surface(this.f32868a);
    }

    public final void m5873e() {
        synchronized (this.f32877j) {
            while (!this.f32876i) {
                try {
                    this.f32877j.wait(10000L);
                    if (!this.f32876i) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f32876i = false;
        }
        this.f32868a.updateTexImage();
    }

    public void m5872f() {
        m5873e();
        m5871g();
    }

    public final void m5871g() {
        this.f32868a.getTransformMatrix(this.f32870c.m23471m());
        float f = 1.0f / this.f32872e;
        float f2 = 1.0f / this.f32873f;
        Matrix.translateM(this.f32870c.m23471m(), 0, (1.0f - f) / 2.0f, (1.0f - f2) / 2.0f, 0.0f);
        Matrix.scaleM(this.f32870c.m23471m(), 0, f, f2, 1.0f);
        Matrix.translateM(this.f32870c.m23471m(), 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.f32870c.m23471m(), 0, this.f32874g, 0.0f, 0.0f, 1.0f);
        if (this.f32875h) {
            Matrix.scaleM(this.f32870c.m23471m(), 0, 1.0f, -1.0f, 1.0f);
        }
        Matrix.translateM(this.f32870c.m23471m(), 0, -0.5f, -0.5f, 0.0f);
        this.f32870c.m23492c(this.f32871d);
    }

    public Surface m5870h() {
        return this.f32869b;
    }

    public void m5869i() {
        this.f32870c.mo23473k();
        this.f32869b.release();
        this.f32869b = null;
        this.f32868a = null;
        this.f32871d = null;
        this.f32870c = null;
    }

    public void m5868j(boolean z) {
        this.f32875h = z;
    }

    public void m5867k(int i) {
        this.f32874g = i;
    }

    public void m5866l(float f, float f2) {
        this.f32872e = f;
        this.f32873f = f2;
    }
}
