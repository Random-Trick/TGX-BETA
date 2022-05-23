package ge;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Rational;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.b2;
import androidx.camera.core.d1;
import androidx.camera.core.g1;
import androidx.camera.core.h3;
import androidx.camera.core.k;
import androidx.camera.core.k1;
import androidx.camera.core.l3;
import androidx.camera.core.s;
import androidx.camera.lifecycle.e;
import androidx.camera.view.PreviewView;
import ce.j0;
import ee.h0;
import ee.v;
import ge.h;
import he.i;
import java.io.File;
import java.util.concurrent.ExecutionException;
import kb.j;
import ld.l;
import oc.v0;
import org.thunderdog.challegram.Log;

@TargetApi(21)
public class h extends v<PreviewView> {
    public boolean f12373c0;
    public e f12374d0;
    public d1 f12375e0;
    public h3 f12376f0;
    public b2 f12377g0;
    public int f12378h0;
    public k f12379i0;
    public int f12380j0 = 2;
    public boolean f12381k0;
    public int f12382l0;
    public Rational f12383m0;
    public h0 f12384n0;
    public boolean f12385o0;
    public boolean f12386p0;

    public class a implements d1.n {
        public final File f12387a;

        public a(File file) {
            this.f12387a = file;
        }

        public void d(l lVar) {
            if (lVar != null) {
                h.this.A(lVar, false);
                return;
            }
            Log.e((int) Log.TAG_CAMERA, "Output file still does not exist!", new Object[0]);
            h.this.z(false);
        }

        @Override
        public void a(d1.p pVar) {
            v0.R2(this.f12387a, false, new j() {
                @Override
                public final void a(Object obj) {
                    h.a.this.d((l) obj);
                }
            });
        }

        @Override
        public void b(g1 g1Var) {
            Log.e(Log.TAG_CAMERA, "Cannot take photo", g1Var, new Object[0]);
            h.this.z(false);
        }
    }

    public class b implements h3.g {
        public final File f12389a;

        public b(File file) {
            this.f12389a = file;
        }

        public void d(l lVar) {
            h.this.C(false, -1L);
            h.this.A(lVar, true);
        }

        @Override
        public void a(int i10, String str, Throwable th) {
            h.this.C(false, -1L);
            Log.e(Log.TAG_CAMERA, "Failed to capture video: %d, message: %s", th, Integer.valueOf(i10), str);
            h.this.z(true);
        }

        @Override
        public void b(h3.i iVar) {
            v0.R2(this.f12389a, true, new j() {
                @Override
                public final void a(Object obj) {
                    h.b.this.d((l) obj);
                }
            });
        }
    }

    public h(Context context, ee.l lVar) {
        super(context, lVar);
    }

    public void A0() {
        v0();
        this.f11740b.f7(true, this.f12381k0 != V(), V());
        this.f12385o0 = false;
    }

    public static Size D0(Rational rational, int i10) {
        int doubleValue = (int) (rational.doubleValue() * 1920.0d);
        return new Size((int) 1920.0d, doubleValue - (doubleValue % 2));
    }

    public void w0(k1 k1Var) {
        this.f12384n0.q(k1Var);
    }

    public void x0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        W(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void y0() {
        C(true, SystemClock.uptimeMillis());
    }

    public void z0(c7.a aVar) {
        try {
            e eVar = (e) aVar.get();
            if (this.f12373c0) {
                this.f12374d0 = eVar;
                v0();
            } else {
                eVar.n();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public PreviewView E() {
        PreviewView previewView = new PreviewView(this.f11738a);
        previewView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                h.this.x0(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        previewView.setImplementationMode(PreviewView.c.COMPATIBLE);
        return previewView;
    }

    public final void C0() {
        k kVar = this.f12379i0;
        if (kVar != null) {
            boolean f10 = kVar.a().f();
            int i10 = Log.TAG_CAMERA;
            if (f10) {
                int i11 = this.f12380j0;
                if (i11 == 0) {
                    i10 = Log.TAG_EMOJI;
                } else if (i11 == 1) {
                    i10 = Log.TAG_VOICE;
                } else if (i11 != 2) {
                    return;
                }
            } else if (V() && this.f12380j0 != 2) {
                i10 = Log.TAG_VIDEO;
            }
            this.f11740b.P6(i10);
        }
    }

    @Override
    public void F(int i10) {
        if (this.f12374d0 != null) {
            v0();
        }
    }

    @Override
    public void G() {
        h3 h3Var = this.f12376f0;
        if (h3Var != null) {
            h3Var.f0();
            if (this.f12380j0 == 1 && this.f12379i0.a().f()) {
                this.f12379i0.b().e(false);
            }
            this.f11740b.D0();
        }
    }

    @Override
    public void I(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ge.h.I(int, int):void");
    }

    @Override
    public void J(float f10) {
        if (this.f12379i0 != null && l() != f10) {
            this.f12379i0.b().b(f10);
            R(f10);
        }
    }

    @Override
    public void K() {
        this.f12380j0 = 2;
    }

    @Override
    public boolean N(int i10) {
        boolean z10;
        if (this.f12376f0 != null) {
            try {
                File r10 = r(true);
                this.f12376f0.a0(new h3.h.a(r10).a(), q0.a.g(this.f11738a), new b(r10));
                z10 = true;
            } catch (Throwable th) {
                Log.e("Cannot start recording video", th, new Object[0]);
                z10 = false;
            }
            if (z10) {
                if (this.f12380j0 == 1 && this.f12379i0.a().f()) {
                    this.f12379i0.b().e(true);
                }
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        h.this.y0();
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override
    public void Q(int i10, int i11, int i12) {
        if (this.f12375e0 != null) {
            File r10 = r(false);
            if (r10 == null) {
                z(false);
                return;
            }
            boolean z10 = true;
            try {
                d1.o.a aVar = new d1.o.a(r10);
                if (V() && !i.c2().k1(1024L)) {
                    d1.l lVar = new d1.l();
                    lVar.d(true);
                    aVar.b(lVar);
                }
                this.f12375e0.l0(aVar.a(), q0.a.g(this.f11738a), new a(r10));
            } catch (Throwable th) {
                Log.e(Log.TAG_CAMERA, "Unable to take photo", th, new Object[0]);
                z(false);
                z10 = false;
            }
            if (z10) {
                this.f11740b.E3(false);
            }
        }
    }

    @Override
    public void S() {
        this.f12373c0 = true;
        this.f12381k0 = V();
        final c7.a<e> f10 = e.f(this.f11738a);
        f10.a(new Runnable() {
            @Override
            public final void run() {
                h.this.z0(f10);
            }
        }, q0.a.g(this.f11738a));
    }

    @Override
    public void U() {
        this.f12386p0 = true;
        e eVar = this.f12374d0;
        if (eVar != null) {
            eVar.n();
        }
    }

    @Override
    public void b0() {
        this.f12386p0 = false;
        if (this.f12373c0) {
            v0();
        }
    }

    @Override
    public void h() {
        if (this.f12373c0) {
            e eVar = this.f12374d0;
            if (eVar != null) {
                eVar.n();
                this.f12377g0 = null;
                this.f12376f0 = null;
                this.f12375e0 = null;
                this.f12374d0 = null;
                this.f12379i0 = null;
            }
            this.f12373c0 = false;
        }
    }

    @Override
    public void i() {
        h0 h0Var = this.f12384n0;
        if (h0Var != null) {
            h0Var.h();
            this.f12384n0 = null;
        }
    }

    @Override
    public boolean k(Bitmap bitmap) {
        for (int i10 = 0; i10 < ((PreviewView) this.f11742c).getChildCount(); i10++) {
            View childAt = ((PreviewView) this.f11742c).getChildAt(i10);
            if (childAt instanceof TextureView) {
                TextureView textureView = (TextureView) childAt;
                if (!textureView.isAvailable()) {
                    return false;
                }
                textureView.getBitmap(bitmap);
                return true;
            }
        }
        return false;
    }

    @Override
    public float l() {
        k kVar = this.f12379i0;
        l3 e10 = kVar != null ? kVar.a().i().e() : null;
        if (e10 != null) {
            return e10.c();
        }
        return 0.0f;
    }

    @Override
    public void l0() {
        if (!this.f12385o0 && this.f12374d0 != null) {
            ?? V = V();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!this.f12374d0.h(new s.a().d(V == true ? 1 : 0).b())) {
                Log.w((int) Log.TAG_CAMERA, "Camera is not available, facing: %d", Integer.valueOf((int) V));
                return;
            }
            Log.w("checked camera availability in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            this.f12385o0 = true;
            g0(!V());
            this.f11740b.f7(false, this.f12381k0 != V(), V());
            this.f11740b.r(true, new Runnable() {
                @Override
                public final void run() {
                    h.this.A0();
                }
            });
        }
    }

    @Override
    public void m0() {
        k kVar = this.f12379i0;
        if (kVar != null) {
            int i10 = 1;
            if (kVar.a().f()) {
                int i11 = this.f12380j0;
                if (i11 == 0) {
                    this.f12380j0 = 1;
                } else if (i11 == 1) {
                    this.f12380j0 = 2;
                } else if (i11 == 2) {
                    this.f12380j0 = x() ? 1 : 0;
                } else {
                    return;
                }
                this.f12375e0.s0(this.f12380j0);
                C0();
            } else if (V()) {
                if (this.f12380j0 != 2) {
                    i10 = 2;
                }
                this.f12380j0 = i10;
                C0();
            }
        }
    }

    @Override
    public float o() {
        k kVar = this.f12379i0;
        l3 e10 = kVar != null ? kVar.a().i().e() : null;
        if (e10 != null) {
            return e10.a();
        }
        return 0.0f;
    }

    @Override
    public float p() {
        k kVar = this.f12379i0;
        l3 e10 = kVar != null ? kVar.a().i().e() : null;
        if (e10 != null) {
            return e10.b();
        }
        return 0.0f;
    }

    @Override
    public float q() {
        return 0.1f;
    }

    public final void v0() {
        throw new UnsupportedOperationException("Method not decompiled: ge.h.v0():void");
    }

    @Override
    public boolean w() {
        return this.f12373c0 && this.f12374d0 != null;
    }
}
