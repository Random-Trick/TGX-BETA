package de;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import be.C1379j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.C7907b;
import p129j1.C5828a;
import p139jb.AbstractC5918j;
import p156kd.C6253l;
import p156kd.C6259q;
import p350yd.C10536ab;

public abstract class AbstractC4067v<T extends View> {
    public int f13710M;
    public boolean f13711N;
    public boolean f13712O;
    public int f13713P;
    public int f13714Q;
    public int f13715R;
    public boolean f13716S;
    public boolean f13717T;
    public boolean f13718U;
    public boolean f13719V;
    public Bitmap f13721X;
    public Bitmap f13722Y;
    public int f13723Z;
    public final Context f13724a;
    public int f13725a0;
    public final AbstractC4055l f13726b;
    public boolean f13727b0;
    public final ArrayList<Bitmap> f13720W = new ArrayList<>();
    public final T f13728c = mo27773E();

    public AbstractC4067v(Context context, AbstractC4055l lVar) {
        this.f13724a = context;
        this.f13726b = lVar;
        m29077f();
    }

    public void m29101B(C6253l lVar) {
        m29082c0(false);
        this.f13726b.mo29125d3(lVar);
    }

    public static int m29092T(int i) {
        if (i == 90) {
            return 6;
        }
        if (i != 180) {
            return i != 270 ? 0 : 8;
        }
        return 3;
    }

    public static void m29057y(Bitmap bitmap, File file, int i, C6253l lVar) {
        if (C7389v0.m16726I(bitmap, 100, file.getPath())) {
            if (i != 0) {
                int T = m29092T(i);
                try {
                    C5828a aVar = new C5828a(file.getAbsolutePath());
                    aVar.m22032b0("Orientation", Integer.toString(T));
                    aVar.m22039W();
                } catch (Throwable th) {
                    Log.m14712w(Log.TAG_CAMERA, "Unable to set exif orientation: %d", th, Integer.valueOf(T));
                }
            }
            lVar.m20835m1();
        }
    }

    public final Bitmap m29099D(int i, int i2) {
        Bitmap bitmap;
        Bitmap bitmap2;
        synchronized (this) {
            bitmap = null;
            if (!this.f13720W.isEmpty()) {
                int i3 = 0;
                Iterator<Bitmap> it = this.f13720W.iterator();
                while (it.hasNext()) {
                    bitmap2 = it.next();
                    if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
                        this.f13720W.remove(i3);
                        break;
                    }
                    i3++;
                }
            }
            bitmap2 = null;
        }
        if (bitmap2 != null) {
            try {
                if (!bitmap2.isRecycled()) {
                    if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
                        bitmap = bitmap2;
                    } else {
                        bitmap2.recycle();
                    }
                }
            } catch (Throwable th) {
                Log.m14723e(th);
                return null;
            }
        }
        return bitmap == null ? Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888) : bitmap;
    }

    public abstract T mo27773E();

    public abstract void mo27772F(int i);

    public abstract void mo27771G();

    public boolean m29098H(Bitmap bitmap, int i, int i2, final int i3) {
        final Bitmap bitmap2;
        int i4 = i;
        int i5 = i2;
        if (bitmap == null) {
            m29056z(false);
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        final File r = m29063r(false);
        if (r == null) {
            m29056z(false);
            return false;
        }
        if (i4 > width || i5 > height) {
            float f = i4;
            float f2 = i5;
            float min = Math.min(width / f, height / f2);
            i4 = (int) (f * min);
            i5 = (int) (f2 * min);
        }
        int i6 = i4;
        int i7 = i5;
        if (i6 == width && i7 == height) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap, i6 != width ? (width - i6) / 2 : 0, i7 != height ? (height - i7) / 2 : 0, i6, i7, (Matrix) null, false);
        }
        final C6253l lVar = new C6253l(-1L, r.getPath(), System.currentTimeMillis(), bitmap2.getWidth(), bitmap2.getHeight(), -1L, false);
        lVar.mo20874q0(i3);
        lVar.m20839i1();
        lVar.m20908l0();
        lVar.m20906m0();
        C6259q.m20786c().m20785d(lVar, bitmap2);
        C7907b.m14362k().m14361l(new Runnable() {
            @Override
            public final void run() {
                AbstractC4067v.m29057y(bitmap2, r, i3, lVar);
            }
        });
        m29102A(lVar, false);
        return bitmap2 == bitmap;
    }

    public void mo27770I(int i, int i2) {
    }

    public abstract void mo27769J(float f);

    public abstract void mo27768K();

    public void m29097L() {
        if (this.f13727b0) {
            this.f13727b0 = false;
            m29089X(this.f13723Z, this.f13725a0);
        }
    }

    public void m29096M(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            m29097L();
        } else if (this.f13727b0) {
            bitmap.eraseColor(0);
            this.f13727b0 = false;
            this.f13722Y = bitmap;
            m29089X(this.f13723Z, this.f13725a0);
        }
    }

    public abstract boolean mo27767N(int i);

    public final void m29056z(final boolean z) {
        if (!C1379j0.m37357K()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    AbstractC4067v.this.m29056z(z);
                }
            });
        } else if (z) {
            m29100C(false, -1L);
            C1379j0.m37292y0(R.string.TakeVideoError, 0);
        } else {
            m29073h0(false);
            C1379j0.m37292y0(R.string.TakePhotoError, 0);
        }
    }

    public void m29102A(final C6253l lVar, final boolean z) {
        if (!C1379j0.m37357K()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    AbstractC4067v.this.m29102A(lVar, z);
                }
            });
        } else if (lVar == null) {
            m29056z(z);
        } else {
            if (!this.f13726b.mo29133E1()) {
                if (Build.VERSION.SDK_INT >= 29) {
                    C7389v0.m16702O(lVar.mo20875q(), 0, false, new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            C6253l.this.m20830r1((File) obj);
                        }
                    });
                } else {
                    C7389v0.m16610m(new File(lVar.mo20875q()));
                }
            }
            if (z) {
                m29082c0(true);
                m29100C(false, -1L);
                C1379j0.m37332e0(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC4067v.this.m29101B(lVar);
                    }
                }, 200L);
                return;
            }
            m29073h0(false);
            this.f13726b.mo29125d3(lVar);
        }
    }

    public abstract void mo27766Q(int i, int i2, int i3);

    public final void m29093R(float f) {
        this.f13726b.mo29136A2(f);
    }

    public abstract void mo27765S();

    public abstract void mo27764U();

    public final boolean m29091V() {
        return this.f13711N;
    }

    public void m29090W(int i, int i2) {
        this.f13723Z = i;
        this.f13725a0 = i2;
        if (i > 0 && i2 > 0) {
            m29088Y(i, i2);
            m29089X(i, i2);
        }
    }

    public final void m29089X(int i, int i2) {
        Bitmap bitmap;
        if (!this.f13727b0) {
            float f = i;
            float f2 = i2;
            float min = Math.min(1.0f, Math.min(1280.0f / f, 1280.0f / f2));
            int i3 = (int) (f * min);
            int i4 = (int) (f2 * min);
            Bitmap bitmap2 = this.f13722Y;
            if (bitmap2 == null || bitmap2.getWidth() != i3 || this.f13722Y.getHeight() != i4) {
                Bitmap bitmap3 = this.f13722Y;
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 19 && bitmap3 != null && !this.f13727b0) {
                    try {
                        bitmap3.reconfigure(i3, i4, Bitmap.Config.ARGB_8888);
                        z = true;
                    } catch (Throwable unused) {
                    }
                }
                if (z) {
                    bitmap3 = null;
                    bitmap = bitmap3;
                } else {
                    bitmap = m29099D(i3, i4);
                }
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    m29087Z(bitmap3);
                }
                this.f13722Y = bitmap;
            }
        }
    }

    public final void m29088Y(int i, int i2) {
        float f = i;
        float f2 = i2;
        float min = Math.min(160.0f / f, 160.0f / f2);
        int i3 = (int) (f * min);
        int i4 = (int) (f2 * min);
        Bitmap bitmap = this.f13721X;
        if (bitmap == null || bitmap.isRecycled() || this.f13721X.getWidth() != i3 || this.f13721X.getHeight() != i4) {
            Bitmap D = m29099D(i3, i4);
            Bitmap bitmap2 = this.f13721X;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                m29087Z(this.f13721X);
            }
            this.f13721X = D;
        }
    }

    public void m29087Z(Bitmap bitmap) {
        if (C7389v0.m16756A1(bitmap)) {
            synchronized (this) {
                this.f13720W.add(bitmap);
            }
        }
    }

    public final void m29085a0() {
        m29074g0(false);
        mo27768K();
    }

    public abstract void mo27763b0();

    public final void m29082c0(boolean z) {
        if (this.f13718U != z) {
            this.f13718U = z;
            m29075g();
        }
    }

    public final void m29080d0(int i) {
        this.f13710M = i;
    }

    public void m29078e0(boolean z) {
        this.f13712O = z;
    }

    public final void m29077f() {
        int a1 = C1379j0.m37307r(this.f13724a).m14513a1();
        if (this.f13713P != a1) {
            this.f13713P = a1;
            this.f13726b.mo29129N();
            mo27772F(this.f13713P);
        }
    }

    public final void m29076f0(int i, int i2) {
        if (this.f13714Q != i || this.f13715R != i2) {
            this.f13714Q = i;
            this.f13715R = i2;
            mo27770I(i, i2);
        }
    }

    public final void m29075g() {
        boolean z = this.f13716S || this.f13717T || this.f13718U;
        if (this.f13719V != z) {
            this.f13719V = z;
            this.f13726b.mo29132F3(z);
        }
    }

    public final void m29074g0(boolean z) {
        this.f13711N = z;
    }

    public abstract void mo27762h();

    public final void m29073h0(boolean z) {
        if (this.f13716S != z) {
            this.f13716S = z;
            m29075g();
        }
    }

    public abstract void mo27761i();

    public final void m29100C(final boolean z, final long j) {
        if (!C1379j0.m37357K()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    AbstractC4067v.this.m29100C(z, j);
                }
            });
        } else if (this.f13717T != z) {
            this.f13717T = z;
            m29075g();
            if (z) {
                this.f13726b.mo29118u6(j);
            } else {
                this.f13726b.mo29134D0();
            }
        }
    }

    public final void m29071j() {
        mo27771G();
    }

    public boolean m29070j0() {
        return this.f13712O;
    }

    public abstract boolean mo27760k(Bitmap bitmap);

    public final boolean m29069k0(int i) {
        if (this.f13716S || this.f13717T || C10536ab.m4667o1().m4713c0().m4537z0()) {
            return false;
        }
        return mo27767N(i);
    }

    public abstract float mo27759l();

    public abstract void mo27758l0();

    public final int m29068m() {
        return this.f13713P;
    }

    public abstract void mo27757m0();

    public final int m29067n() {
        return this.f13710M;
    }

    public final Bitmap m29066n0() {
        if (!C7389v0.m16756A1(this.f13721X)) {
            return null;
        }
        try {
            this.f13721X.eraseColor(0);
            if (mo27760k(this.f13721X) && this.f13721X.getPixel(0, 0) != 0 && (m29070j0() || C7389v0.m16590r(this.f13721X, 3, 1))) {
                return this.f13721X;
            }
        } catch (Throwable th) {
            Log.m14712w(Log.TAG_CAMERA, "Cannot take bitmap", th, new Object[0]);
        }
        return null;
    }

    public abstract float mo27756o();

    public final void m29065o0(int i, int i2, int i3) {
        if (!this.f13716S) {
            m29073h0(true);
            mo27766Q(i, i2, i3);
        }
    }

    public abstract float mo27755p();

    public Bitmap m29064p0() {
        m29089X(this.f13723Z, this.f13725a0);
        Bitmap bitmap = this.f13722Y;
        if (bitmap == null) {
            return null;
        }
        mo27760k(bitmap);
        if (this.f13722Y.getPixel(0, 0) == 0) {
            return null;
        }
        this.f13727b0 = true;
        Bitmap bitmap2 = this.f13722Y;
        this.f13722Y = null;
        return bitmap2;
    }

    public abstract float mo27754q();

    public final File m29063r(boolean z) {
        boolean z2 = Build.VERSION.SDK_INT >= 29 || this.f13726b.mo29133E1();
        if (z) {
            return C7389v0.m16609m0(z2);
        }
        return C7389v0.m16613l0(z2);
    }

    public final int m29062s() {
        return this.f13715R;
    }

    public final int m29061t() {
        return this.f13714Q;
    }

    public final int m29060u() {
        int m = m29068m();
        if (m == 0) {
            return 0;
        }
        if (m == 90) {
            return 1;
        }
        if (m == 180) {
            return 2;
        }
        if (m == 270) {
            return 3;
        }
        throw new IllegalStateException("displayRotation = " + m29068m());
    }

    public final T m29059v() {
        return this.f13728c;
    }

    public abstract boolean mo27747w();

    public final boolean m29058x() {
        return this.f13717T;
    }
}
