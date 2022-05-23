package ee;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import ce.j0;
import j1.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kb.j;
import ld.l;
import ld.q;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.b;
import zd.ya;

public abstract class v<T extends View> {
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Bitmap X;
    public Bitmap Y;
    public int Z;
    public final Context f11738a;
    public int f11739a0;
    public final l f11740b;
    public boolean f11741b0;
    public final ArrayList<Bitmap> W = new ArrayList<>();
    public final T f11742c = E();

    public v(Context context, l lVar) {
        this.f11738a = context;
        this.f11740b = lVar;
        f();
    }

    public void B(l lVar) {
        c0(false);
        this.f11740b.B2(lVar);
    }

    public static int T(int i10) {
        if (i10 == 90) {
            return 6;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 8;
        }
        return 3;
    }

    public static void y(Bitmap bitmap, File file, int i10, l lVar) {
        if (v0.I(bitmap, 100, file.getPath())) {
            if (i10 != 0) {
                int T = T(i10);
                try {
                    a aVar = new a(file.getAbsolutePath());
                    aVar.b0("Orientation", Integer.toString(T));
                    aVar.W();
                } catch (Throwable th) {
                    Log.w(Log.TAG_CAMERA, "Unable to set exif orientation: %d", th, Integer.valueOf(T));
                }
            }
            lVar.m1();
        }
    }

    public final Bitmap D(int i10, int i11) {
        Bitmap bitmap;
        Bitmap bitmap2;
        synchronized (this) {
            bitmap = null;
            if (!this.W.isEmpty()) {
                int i12 = 0;
                Iterator<Bitmap> it = this.W.iterator();
                while (it.hasNext()) {
                    bitmap2 = it.next();
                    if (bitmap2.getWidth() == i10 && bitmap2.getHeight() == i11) {
                        this.W.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
            bitmap2 = null;
        }
        if (bitmap2 != null) {
            try {
                if (!bitmap2.isRecycled()) {
                    if (bitmap2.getWidth() == i10 && bitmap2.getHeight() == i11) {
                        bitmap = bitmap2;
                    } else {
                        bitmap2.recycle();
                    }
                }
            } catch (Throwable th) {
                Log.e(th);
                return null;
            }
        }
        return bitmap == null ? Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888) : bitmap;
    }

    public abstract T E();

    public abstract void F(int i10);

    public abstract void G();

    public boolean H(Bitmap bitmap, int i10, int i11, final int i12) {
        final Bitmap bitmap2;
        int i13 = i10;
        int i14 = i11;
        if (bitmap == null) {
            z(false);
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        final File r10 = r(false);
        if (r10 == null) {
            z(false);
            return false;
        }
        if (i13 > width || i14 > height) {
            float f10 = i13;
            float f11 = i14;
            float min = Math.min(width / f10, height / f11);
            i13 = (int) (f10 * min);
            i14 = (int) (f11 * min);
        }
        int i15 = i13;
        int i16 = i14;
        if (i15 == width && i16 == height) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap, i15 != width ? (width - i15) / 2 : 0, i16 != height ? (height - i16) / 2 : 0, i15, i16, (Matrix) null, false);
        }
        final l lVar = new l(-1L, r10.getPath(), System.currentTimeMillis(), bitmap2.getWidth(), bitmap2.getHeight(), -1L, false);
        lVar.q0(i12);
        lVar.i1();
        lVar.l0();
        lVar.m0();
        q.c().d(lVar, bitmap2);
        b.k().l(new Runnable() {
            @Override
            public final void run() {
                v.y(bitmap2, r10, i12, lVar);
            }
        });
        A(lVar, false);
        return bitmap2 == bitmap;
    }

    public void I(int i10, int i11) {
    }

    public abstract void J(float f10);

    public abstract void K();

    public void L() {
        if (this.f11741b0) {
            this.f11741b0 = false;
            X(this.Z, this.f11739a0);
        }
    }

    public void M(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            L();
        } else if (this.f11741b0) {
            bitmap.eraseColor(0);
            this.f11741b0 = false;
            this.Y = bitmap;
            X(this.Z, this.f11739a0);
        }
    }

    public abstract boolean N(int i10);

    public final void z(final boolean z10) {
        if (!j0.K()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    v.this.z(z10);
                }
            });
        } else if (z10) {
            C(false, -1L);
            j0.y0(R.string.TakeVideoError, 0);
        } else {
            h0(false);
            j0.y0(R.string.TakePhotoError, 0);
        }
    }

    public void A(final l lVar, final boolean z10) {
        if (!j0.K()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    v.this.A(lVar, z10);
                }
            });
        } else if (lVar == null) {
            z(z10);
        } else {
            if (!this.f11740b.C1()) {
                if (Build.VERSION.SDK_INT >= 29) {
                    v0.O(lVar.q(), 0, false, new j() {
                        @Override
                        public final void a(Object obj) {
                            l.this.r1((File) obj);
                        }
                    });
                } else {
                    v0.m(new File(lVar.q()));
                }
            }
            if (z10) {
                c0(true);
                C(false, -1L);
                j0.e0(new Runnable() {
                    @Override
                    public final void run() {
                        v.this.B(lVar);
                    }
                }, 200L);
                return;
            }
            h0(false);
            this.f11740b.B2(lVar);
        }
    }

    public abstract void Q(int i10, int i11, int i12);

    public final void R(float f10) {
        this.f11740b.u2(f10);
    }

    public abstract void S();

    public abstract void U();

    public final boolean V() {
        return this.N;
    }

    public void W(int i10, int i11) {
        this.Z = i10;
        this.f11739a0 = i11;
        if (i10 > 0 && i11 > 0) {
            Y(i10, i11);
            X(i10, i11);
        }
    }

    public final void X(int i10, int i11) {
        Bitmap bitmap;
        if (!this.f11741b0) {
            float f10 = i10;
            float f11 = i11;
            float min = Math.min(1.0f, Math.min(1280.0f / f10, 1280.0f / f11));
            int i12 = (int) (f10 * min);
            int i13 = (int) (f11 * min);
            Bitmap bitmap2 = this.Y;
            if (bitmap2 == null || bitmap2.getWidth() != i12 || this.Y.getHeight() != i13) {
                Bitmap bitmap3 = this.Y;
                boolean z10 = false;
                if (bitmap3 != null && !this.f11741b0) {
                    try {
                        bitmap3.reconfigure(i12, i13, Bitmap.Config.ARGB_8888);
                        z10 = true;
                    } catch (Throwable unused) {
                    }
                }
                if (z10) {
                    bitmap3 = null;
                    bitmap = bitmap3;
                } else {
                    bitmap = D(i12, i13);
                }
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    Z(bitmap3);
                }
                this.Y = bitmap;
            }
        }
    }

    public final void Y(int i10, int i11) {
        float f10 = i10;
        float f11 = i11;
        float min = Math.min(160.0f / f10, 160.0f / f11);
        int i12 = (int) (f10 * min);
        int i13 = (int) (f11 * min);
        Bitmap bitmap = this.X;
        if (bitmap == null || bitmap.isRecycled() || this.X.getWidth() != i12 || this.X.getHeight() != i13) {
            Bitmap D = D(i12, i13);
            Bitmap bitmap2 = this.X;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                Z(this.X);
            }
            this.X = D;
        }
    }

    public void Z(Bitmap bitmap) {
        if (v0.A1(bitmap)) {
            synchronized (this) {
                this.W.add(bitmap);
            }
        }
    }

    public final void a0() {
        g0(false);
        K();
    }

    public abstract void b0();

    public final void c0(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            g();
        }
    }

    public final void d0(int i10) {
        this.M = i10;
    }

    public void e0(boolean z10) {
        this.O = z10;
    }

    public final void f() {
        int c12 = j0.r(this.f11738a).c1();
        if (this.P != c12) {
            this.P = c12;
            this.f11740b.O();
            F(this.P);
        }
    }

    public final void f0(int i10, int i11) {
        if (this.Q != i10 || this.R != i11) {
            this.Q = i10;
            this.R = i11;
            I(i10, i11);
        }
    }

    public final void g() {
        boolean z10 = this.S || this.T || this.U;
        if (this.V != z10) {
            this.V = z10;
            this.f11740b.x3(z10);
        }
    }

    public final void g0(boolean z10) {
        this.N = z10;
    }

    public abstract void h();

    public final void h0(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            g();
        }
    }

    public abstract void i();

    public final void C(final boolean z10, final long j10) {
        if (!j0.K()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    v.this.C(z10, j10);
                }
            });
        } else if (this.T != z10) {
            this.T = z10;
            g();
            if (z10) {
                this.f11740b.u6(j10);
            } else {
                this.f11740b.D0();
            }
        }
    }

    public final void j() {
        G();
    }

    public boolean j0() {
        return this.O;
    }

    public abstract boolean k(Bitmap bitmap);

    public final boolean k0(int i10) {
        if (this.S || this.T || ya.o1().c0().v0()) {
            return false;
        }
        return N(i10);
    }

    public abstract float l();

    public abstract void l0();

    public final int m() {
        return this.P;
    }

    public abstract void m0();

    public final int n() {
        return this.M;
    }

    public final Bitmap n0() {
        if (!v0.A1(this.X)) {
            return null;
        }
        try {
            this.X.eraseColor(0);
            if (k(this.X) && this.X.getPixel(0, 0) != 0 && (j0() || v0.r(this.X, 3, 1))) {
                return this.X;
            }
        } catch (Throwable th) {
            Log.w(Log.TAG_CAMERA, "Cannot take bitmap", th, new Object[0]);
        }
        return null;
    }

    public abstract float o();

    public final void o0(int i10, int i11, int i12) {
        if (!this.S) {
            h0(true);
            Q(i10, i11, i12);
        }
    }

    public abstract float p();

    public Bitmap p0() {
        X(this.Z, this.f11739a0);
        Bitmap bitmap = this.Y;
        if (bitmap == null) {
            return null;
        }
        k(bitmap);
        if (this.Y.getPixel(0, 0) == 0) {
            return null;
        }
        this.f11741b0 = true;
        Bitmap bitmap2 = this.Y;
        this.Y = null;
        return bitmap2;
    }

    public abstract float q();

    public final File r(boolean z10) {
        boolean z11 = Build.VERSION.SDK_INT >= 29 || this.f11740b.C1();
        if (z10) {
            return v0.m0(z11);
        }
        return v0.l0(z11);
    }

    public final int s() {
        return this.R;
    }

    public final int t() {
        return this.Q;
    }

    public final int u() {
        int m10 = m();
        if (m10 == 0) {
            return 0;
        }
        if (m10 == 90) {
            return 1;
        }
        if (m10 == 180) {
            return 2;
        }
        if (m10 == 270) {
            return 3;
        }
        throw new IllegalStateException("displayRotation = " + m());
    }

    public final T v() {
        return this.f11742c;
    }

    public abstract boolean w();

    public final boolean x() {
        return this.T;
    }
}
