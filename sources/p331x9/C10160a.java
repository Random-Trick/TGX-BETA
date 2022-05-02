package p331x9;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;
import p078f9.C4330c;
import p122i9.C5272e;
import p152k9.C6218a;
import p316w9.C10007i;

public class C10160a {
    public static final C10007i f32864k = new C10007i("FrameDrawer");
    public SurfaceTexture f32865a;
    public Surface f32866b;
    public C5272e f32867c;
    public boolean f32873i;
    public float f32869e = 1.0f;
    public float f32870f = 1.0f;
    public int f32871g = 0;
    public boolean f32872h = false;
    public final Object f32874j = new Object();
    public C4330c f32868d = new C4330c();

    public class C10161a implements SurfaceTexture.OnFrameAvailableListener {
        public C10161a() {
        }

        @Override
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C10160a.f32864k.m6262h("New frame available");
            synchronized (C10160a.this.f32874j) {
                if (!C10160a.this.f32873i) {
                    C10160a.this.f32873i = true;
                    C10160a.this.f32874j.notifyAll();
                } else {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
            }
        }
    }

    public C10160a() {
        C6218a aVar = new C6218a();
        C5272e eVar = new C5272e();
        this.f32867c = eVar;
        eVar.m23469n(aVar);
        SurfaceTexture surfaceTexture = new SurfaceTexture(aVar.m21046e());
        this.f32865a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C10161a());
        this.f32866b = new Surface(this.f32865a);
    }

    public final void m5873e() {
        synchronized (this.f32874j) {
            while (!this.f32873i) {
                try {
                    this.f32874j.wait(10000L);
                    if (!this.f32873i) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f32873i = false;
        }
        this.f32865a.updateTexImage();
    }

    public void m5872f() {
        m5873e();
        m5871g();
    }

    public final void m5871g() {
        this.f32865a.getTransformMatrix(this.f32867c.m23470m());
        float f = 1.0f / this.f32869e;
        float f2 = 1.0f / this.f32870f;
        Matrix.translateM(this.f32867c.m23470m(), 0, (1.0f - f) / 2.0f, (1.0f - f2) / 2.0f, 0.0f);
        Matrix.scaleM(this.f32867c.m23470m(), 0, f, f2, 1.0f);
        Matrix.translateM(this.f32867c.m23470m(), 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.f32867c.m23470m(), 0, this.f32871g, 0.0f, 0.0f, 1.0f);
        if (this.f32872h) {
            Matrix.scaleM(this.f32867c.m23470m(), 0, 1.0f, -1.0f, 1.0f);
        }
        Matrix.translateM(this.f32867c.m23470m(), 0, -0.5f, -0.5f, 0.0f);
        this.f32867c.m23491c(this.f32868d);
    }

    public Surface m5870h() {
        return this.f32866b;
    }

    public void m5869i() {
        this.f32867c.mo23472k();
        this.f32866b.release();
        this.f32866b = null;
        this.f32865a = null;
        this.f32868d = null;
        this.f32867c = null;
    }

    public void m5868j(boolean z) {
        this.f32872h = z;
    }

    public void m5867k(int i) {
        this.f32871g = i;
    }

    public void m5866l(float f, float f2) {
        this.f32869e = f;
        this.f32870f = f2;
    }
}
