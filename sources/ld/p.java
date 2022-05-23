package ld;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import ce.j0;
import ce.y;
import db.b;
import ib.i;
import ld.h;
import oc.v0;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.ImageLoader;
import pd.c;
import sd.f;

public class p implements x, ValueAnimator.AnimatorUpdateListener, v, h.b {
    public static boolean f16397s0;
    public static m f16398t0;
    public View M;
    public Bitmap N;
    public float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final Rect Y;
    public final Rect Z;
    public h f16399a;
    public final Paint f16400a0;
    public h f16401b;
    public Matrix f16402b0;
    public final y f16403c;
    public Paint f16404c0;
    public Paint f16405d0;
    public BitmapShader f16406e0;
    public RectF f16407f0;
    public RectF f16408g0;
    public Matrix f16409h0;
    public c f16410i0;
    public Rect f16411j0;
    public a f16413l0;
    public Object f16414m0;
    public boolean f16415n0;
    public int f16416o0;
    public d f16417p0;
    public ValueAnimator f16418q0;
    public int f16419r0;
    public float O = 1.0f;
    public float f16412k0 = 1.0f;

    public interface a {
        void a(p pVar, h hVar);
    }

    public p(View view, int i10) {
        if (f16398t0 == null) {
            f16398t0 = new m();
            f16397s0 = j0.B().getDisplayMetrics().density >= 2.0f;
        }
        this.f16400a0 = new Paint(7);
        this.M = view;
        this.f16403c = new y(this);
        this.Y = new Rect();
        this.Z = new Rect();
        if (i10 != 0) {
            E0(i10);
        }
    }

    public static boolean H(h hVar, h hVar2) {
        if (hVar != hVar2) {
            if ((hVar != null ? hVar.C() : (byte) 0) != (hVar2 != null ? hVar2.C() : (byte) 0)) {
                return false;
            }
            String str = null;
            String hVar3 = hVar != null ? hVar.toString() : null;
            if (hVar2 != null) {
                str = hVar2.toString();
            }
            if (!i.c(hVar3, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(h hVar, h hVar2) {
        if (hVar == null || hVar2 == null) {
            return false;
        }
        if (hVar == hVar2) {
            return true;
        }
        byte C = hVar.C();
        byte C2 = hVar2.C();
        String str = null;
        String w10 = hVar instanceof j ? hVar.w() : null;
        if (hVar2 instanceof j) {
            str = hVar2.w();
        }
        return C == C2 && (w10 == null ? hVar.s() : 0) == (str == null ? hVar2.s() : 0) && i.c(w10, str);
    }

    public static void h(Canvas canvas, Bitmap bitmap, float f10, float f11, Paint paint) {
        try {
            canvas.drawBitmap(bitmap, f10, f11, paint);
        } catch (Throwable th) {
            Log.e(32, "Unable to draw bitmap", th, new Object[0]);
            Tracer.h(th);
        }
    }

    public static void i(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        try {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } catch (Throwable th) {
            Log.e(32, "Unable to draw bitmap", th, new Object[0]);
            Tracer.h(th);
        }
    }

    public static void j(Canvas canvas, RectF rectF, float f10, float f11, Paint paint) {
        try {
            canvas.drawRoundRect(rectF, f10, f11, paint);
        } catch (Throwable th) {
            Log.e(32, "Unable to draw bitmap", th, new Object[0]);
            Tracer.h(th);
        }
    }

    public final void A() {
        throw new UnsupportedOperationException("Method not decompiled: ld.p.A():void");
    }

    public final void B() {
        float f10;
        this.Y.set(this.U, this.V, this.W, this.X);
        if (v0.A1(this.N)) {
            this.f16407f0.set(this.Y);
            this.f16409h0.reset();
            RectF rectF = this.f16408g0;
            Rect rect = this.Z;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            h hVar = this.f16399a;
            if (hVar != null) {
                int y10 = hVar.y();
                if (y10 != 1) {
                    f10 = y10 != 2 ? -1.0f : Math.max(this.f16407f0.width() / this.Z.width(), this.f16407f0.height() / this.Z.height());
                } else {
                    f10 = Math.min(this.f16407f0.width() / this.Z.width(), this.f16407f0.height() / this.Z.height());
                }
                if (f10 != -1.0f) {
                    int height = (int) (this.Z.height() * f10);
                    float centerX = this.f16407f0.centerX();
                    float centerY = this.f16407f0.centerY();
                    float width = ((int) (this.Z.width() * f10)) / 2.0f;
                    float f11 = height / 2.0f;
                    this.f16407f0.set(centerX - width, centerY - f11, centerX + width, centerY + f11);
                }
            }
            this.f16409h0.setRectToRect(this.f16408g0, this.f16407f0, Matrix.ScaleToFit.FILL);
            BitmapShader bitmapShader = this.f16406e0;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f16409h0);
            }
        }
    }

    public void C() {
        if (!f16397s0 || this.S) {
            f16398t0.c(this);
        } else {
            f16398t0.a(this);
        }
    }

    @Override
    public void D() {
        if (this.f16415n0) {
            this.f16415n0 = false;
            this.f16400a0.setColorFilter(null);
            Paint paint = this.f16405d0;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            invalidate();
        }
    }

    public void E() {
        f16398t0.c(this);
    }

    @Override
    public void E0(int i10) {
        if (this.T != i10) {
            this.T = i10;
            if (this.f16404c0 == null) {
                Paint paint = new Paint(5);
                this.f16404c0 = paint;
                paint.setAlpha(this.f16400a0.getAlpha());
                this.f16409h0 = new Matrix();
                this.f16408g0 = new RectF();
                this.f16407f0 = new RectF();
            }
            this.f16407f0.set(this.U, this.V, this.W, this.X);
            if (!v0.A1(this.N)) {
                return;
            }
            if (i10 > 0) {
                boolean z10 = this.f16406e0 == null;
                if (z10) {
                    Bitmap bitmap = this.N;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f16406e0 = new BitmapShader(bitmap, tileMode, tileMode);
                }
                B();
                if (z10) {
                    this.f16404c0.setShader(this.f16406e0);
                    return;
                }
                return;
            }
            A();
        }
    }

    public void F() {
        if (this.f16410i0 == null) {
            this.f16410i0 = new c();
            this.f16411j0 = new Rect();
        }
    }

    @Override
    public void F0(Canvas canvas, Path path, float f10) {
        u.c(this, canvas, path, f10);
    }

    public void G(h hVar) {
        Bitmap bitmap;
        if (this.Q) {
            this.f16401b = hVar;
        } else if (!H(this.f16399a, hVar) || ((bitmap = this.N) != null && bitmap.isRecycled())) {
            if (this.f16399a != null) {
                ImageLoader.e().k(this.f16403c);
            }
            Bitmap bitmap2 = null;
            if (hVar != null) {
                Bitmap b10 = q.c().b(hVar);
                if (!v0.A1(b10)) {
                    b10 = g.k().e(hVar);
                }
                boolean z10 = false;
                if (!v0.A1(b10)) {
                    if (this.O != 0.0f) {
                        z10 = true;
                    }
                    k(0.0f);
                    if (hVar.A0() && v0.A1(this.N)) {
                        bitmap2 = this.N;
                    }
                    if (!J(hVar, bitmap2, true) && z10) {
                        invalidate();
                    }
                    if (!hVar.F()) {
                        ImageLoader.e().l(hVar, this.f16403c);
                        return;
                    }
                    return;
                }
                if (this.O != 1.0f) {
                    z10 = true;
                }
                k(1.0f);
                if (!J(hVar, b10, true) && z10) {
                    invalidate();
                }
                g();
                return;
            }
            J(null, null, true);
        } else if (this.f16399a != hVar) {
            J(hVar, this.N, true);
            if (v0.A1(this.N)) {
                if (this.T > 0) {
                    B();
                } else {
                    A();
                }
                invalidate();
            }
        }
    }

    public final void I(Bitmap bitmap) {
        if (this.N != bitmap) {
            this.N = bitmap;
            if (this.f16406e0 != null) {
                this.f16406e0 = null;
                Paint paint = this.f16404c0;
                if (paint != null) {
                    paint.setShader(null);
                }
                Paint paint2 = this.f16405d0;
                if (paint2 != null) {
                    paint2.setShader(null);
                }
            }
        }
        if (v0.A1(bitmap)) {
            this.Z.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            this.Z.set(0, 0, 1, 1);
        }
    }

    public boolean J(ld.h r10, android.graphics.Bitmap r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ld.p.J(ld.h, android.graphics.Bitmap, boolean):boolean");
    }

    @Override
    public int J0() {
        return (int) ((this.U + this.W) * 0.5f);
    }

    public void K(h hVar, Bitmap bitmap) {
        h hVar2 = this.f16399a;
        if (d(hVar2, hVar)) {
            g();
            J(hVar2, bitmap, true);
        }
    }

    @Override
    public boolean K0(int i10, int i11, int i12, int i13) {
        if (this.U == i10 && this.V == i11 && this.W == i12 && this.X == i13) {
            return false;
        }
        this.U = i10;
        this.V = i11;
        this.W = i12;
        this.X = i13;
        if (this.T > 0) {
            B();
            return true;
        }
        A();
        return true;
    }

    public void L(float f10) {
        if (this.f16412k0 != f10) {
            this.f16412k0 = f10;
            l();
            invalidate();
        }
    }

    public void M(float f10) {
        if (this.P != f10) {
            this.P = f10;
            invalidate();
        }
    }

    @Override
    public void O(Canvas canvas) {
        u0(canvas, this.T);
    }

    @Override
    public void P(Canvas canvas, Path path) {
        u.b(this, canvas, path);
    }

    @Override
    public void Q() {
        Paint paint = this.f16405d0;
        if (paint != null) {
            paint.setAlpha(Color.red(this.f16419r0));
        }
        Paint paint2 = this.f16404c0;
        if (paint2 != null) {
            paint2.setAlpha(Color.green(this.f16419r0));
        }
        this.f16400a0.setAlpha(Color.blue(this.f16419r0));
        this.f16419r0 = 0;
    }

    @Override
    public float R0() {
        Paint paint = this.f16405d0;
        if (paint == null && (paint = this.f16404c0) == null) {
            paint = this.f16400a0;
        }
        return paint.getAlpha() / 255.0f;
    }

    @Override
    public void S0(boolean z10) {
        if (f16397s0 && this.S != z10) {
            this.S = z10;
            if (z10) {
                this.O = 1.0f;
            } else if (v0.A1(this.N)) {
                this.O = 1.0f;
            } else {
                this.O = 0.0f;
            }
            if (this.f16419r0 == 0) {
                Paint paint = this.f16404c0;
                if (paint != null) {
                    paint.setAlpha((int) (this.O * 255.0f));
                }
                Paint paint2 = this.f16405d0;
                if (paint2 != null) {
                    paint2.setAlpha((int) (this.O * 255.0f));
                }
                this.f16400a0.setAlpha((int) (this.O * 255.0f));
            }
            invalidate();
        }
    }

    @Override
    public void V(float f10) {
        Paint paint = this.f16405d0;
        int i10 = 0;
        int alpha = paint != null ? paint.getAlpha() : 0;
        Paint paint2 = this.f16404c0;
        if (paint2 != null) {
            i10 = paint2.getAlpha();
        }
        this.f16419r0 = Color.rgb(alpha, i10, this.f16400a0.getAlpha());
        int d10 = (int) (ib.h.d(f10) * 255.0f);
        Paint paint3 = this.f16404c0;
        if (paint3 != null) {
            paint3.setAlpha(d10);
        }
        Paint paint4 = this.f16405d0;
        if (paint4 != null) {
            paint4.setAlpha(d10);
        }
        this.f16400a0.setAlpha(d10);
    }

    @Override
    public void Z0(Rect rect) {
        u.i(this, rect);
    }

    @Override
    public void a(h hVar, c cVar) {
        if (!this.f16410i0.a(cVar)) {
            this.f16410i0.p(cVar);
            l();
            v();
        }
    }

    @Override
    public void b() {
        if (!this.Q) {
            this.Q = true;
            h hVar = this.f16399a;
            if (hVar != null) {
                this.f16401b = hVar;
                this.Q = false;
                G(null);
                this.Q = true;
            }
        }
    }

    @Override
    public void b0() {
        clear();
    }

    public void c() {
        if (f16397s0 && !this.S) {
            d dVar = this.f16417p0;
            if (dVar != null) {
                dVar.a();
            }
            ValueAnimator valueAnimator = this.f16418q0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            setAlpha(0.0f);
            h hVar = this.f16399a;
            if (hVar == null || !(hVar instanceof o)) {
                if (this.f16417p0 == null) {
                    if (hVar != null) {
                        this.f16417p0 = new d(this, this.f16399a instanceof l);
                    } else {
                        this.f16417p0 = new d(this);
                    }
                }
                this.f16417p0.c();
                return;
            }
            ValueAnimator valueAnimator2 = this.f16418q0;
            if (valueAnimator2 == null) {
                ValueAnimator b10 = b.b();
                this.f16418q0 = b10;
                b10.addUpdateListener(this);
                this.f16418q0.setDuration(120L);
                this.f16418q0.setInterpolator(b.f7287b);
            } else {
                valueAnimator2.setFloatValues(0.0f, 1.0f);
            }
            this.f16418q0.start();
        }
    }

    @Override
    public void clear() {
        G(null);
    }

    @Override
    public void d0(h hVar, boolean z10, Bitmap bitmap) {
        h hVar2 = this.f16399a;
        if (!d(hVar2, hVar)) {
            return;
        }
        if (z10) {
            f16398t0.b(this, hVar2, bitmap);
        } else {
            J(hVar2, null, false);
        }
    }

    @Override
    public void d1(View view, Rect rect) {
        u.f(this, view, rect);
    }

    @Override
    public void draw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        if (v0.A1(this.N)) {
            int u10 = u();
            if (this.T != 0) {
                if (u10 != 0) {
                    canvas.save();
                    canvas.rotate(u10, this.U + ((this.W - i10) / 2.0f), this.V + ((this.X - i11) / 2.0f));
                }
                RectF rectF = this.f16407f0;
                int i12 = this.T;
                j(canvas, rectF, i12, i12, this.f16404c0);
                if (u10 != 0) {
                    canvas.restore();
                }
            } else if (this.f16399a.y() == 3) {
                canvas.save();
                canvas.drawRect(this.U, this.V, this.W, this.X, this.f16405d0);
                canvas.restore();
            } else {
                f t10 = this.f16399a.t();
                float y10 = this.f16399a.y();
                if (y10 == 2.0f || y10 == 1.0f) {
                    c cVar = this.f16410i0;
                    boolean z10 = true;
                    boolean z11 = cVar != null;
                    if (z11) {
                        f10 = cVar.c();
                        if (f10 == 0.0f && this.f16410i0.m()) {
                            z10 = false;
                        }
                        z11 = z10;
                    } else {
                        f10 = 0.0f;
                    }
                    canvas.save();
                    canvas.clipRect(this.U, this.V, this.W, this.X);
                    int i13 = this.U;
                    if (!(i13 == 0 && this.V == 0)) {
                        canvas.translate(i13, this.V);
                    }
                    if (u10 != 0) {
                        canvas.rotate(u10, (this.W - this.U) / 2.0f, (this.X - this.V) / 2.0f);
                    }
                    if (z11) {
                        canvas.concat(this.f16402b0);
                        Rect Z = y.Z();
                        if (!(this.f16412k0 >= 1.0f && f10 == 0.0f && t10 == null)) {
                            Rect rect = this.f16411j0;
                            int i14 = rect.left;
                            Rect rect2 = this.Z;
                            int i15 = i14 - rect2.left;
                            int i16 = rect.top - rect2.top;
                            canvas.clipRect(i15, i16, rect.width() + i15, this.f16411j0.height() + i16);
                        }
                        Z.set(0, 0, this.Z.width(), this.Z.height());
                        if (f10 != 0.0f) {
                            Rect rect3 = this.Z;
                            canvas.translate(-rect3.left, -rect3.top);
                            float width = this.N.getWidth();
                            float height = this.N.getHeight();
                            double radians = Math.toRadians(f10);
                            float abs = (float) Math.abs(Math.sin(radians));
                            float abs2 = (float) Math.abs(Math.cos(radians));
                            float max = Math.max(((width * abs2) + (height * abs)) / width, ((abs * width) + (abs2 * height)) / height);
                            float f11 = width / 2.0f;
                            float f12 = height / 2.0f;
                            canvas.rotate(f10, f11, f12);
                            canvas.scale(max, max, f11, f12);
                            h(canvas, this.N, 0.0f, 0.0f, this.f16400a0);
                            if (t10 != null) {
                                t10.g(canvas, 0, 0, this.N.getWidth(), this.N.getHeight());
                            }
                        } else {
                            i(canvas, this.N, this.Z, Z, this.f16400a0);
                            if (t10 != null) {
                                canvas.clipRect(Z);
                                ce.b.s(canvas, this.N, this.Z, Z, t10);
                            }
                        }
                    } else {
                        canvas.concat(this.f16402b0);
                        h(canvas, this.N, 0.0f, 0.0f, this.f16400a0);
                        if (t10 != null) {
                            canvas.clipRect(0, 0, this.N.getWidth(), this.N.getHeight());
                            t10.g(canvas, 0, 0, this.N.getWidth(), this.N.getHeight());
                        }
                    }
                    canvas.restore();
                    return;
                }
                i(canvas, this.N, this.Z, this.Y, this.f16400a0);
                if (t10 != null) {
                    canvas.save();
                    canvas.clipRect(this.Y);
                    ce.b.s(canvas, this.N, this.Z, this.Y, t10);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public void e() {
        if (this.Q) {
            this.Q = false;
            h hVar = this.f16401b;
            if (hVar != null) {
                G(hVar);
                this.f16401b = null;
            }
        }
    }

    @Override
    public boolean e0() {
        return !x() || (this.O != 1.0f && f16397s0 && !this.S);
    }

    public void f(p pVar) {
        K0(pVar.U, pVar.V, pVar.W, pVar.X);
        E0(pVar.T);
    }

    public final void g() {
        a aVar = this.f16413l0;
        if (aVar != null) {
            aVar.a(this, this.f16399a);
        }
    }

    @Override
    public float getAlpha() {
        return this.O;
    }

    @Override
    public int getBottom() {
        return this.X;
    }

    @Override
    public int getHeight() {
        return this.X - this.V;
    }

    @Override
    public int getLeft() {
        return this.U;
    }

    @Override
    public int getRight() {
        return this.W;
    }

    @Override
    public Object getTag() {
        return this.f16414m0;
    }

    @Override
    public int getTop() {
        return this.V;
    }

    @Override
    public int getWidth() {
        return this.W - this.U;
    }

    @Override
    public boolean h1(float f10, float f11, int i10, int i11) {
        float f12;
        float min;
        h hVar = this.f16399a;
        if (!(hVar == null && (i10 == 0 || i11 == 0))) {
            if (hVar != null) {
                if (!v0.A1(this.N)) {
                    h hVar2 = this.f16399a;
                    if (!(hVar2 instanceof l)) {
                        return false;
                    }
                    i10 = p(((l) hVar2).Y0());
                    i11 = o(((l) this.f16399a).L0());
                } else if (y()) {
                    i10 = p(this.Z.height());
                    i11 = o(this.Z.width());
                } else {
                    i10 = p(this.Z.width());
                    i11 = o(this.Z.height());
                }
            }
            h hVar3 = this.f16399a;
            if ((hVar3 != null ? hVar3.y() : 1) == 1) {
                float f13 = i11;
                int min2 = (int) (f13 * Math.min((this.W - this.U) / i10, (this.X - this.V) / f13));
                int i12 = (this.V + this.X) / 2;
                float f14 = (this.U + this.W) / 2;
                float f15 = ((int) (f12 * min)) / 2.0f;
                if (f10 < f14 - f15 || f10 > f14 + f15) {
                    return false;
                }
                float f16 = i12;
                float f17 = min2 / 2.0f;
                return f11 >= f16 - f17 && f11 <= f16 + f17;
            }
        }
        return false;
    }

    @Override
    public void invalidate() {
        View view = this.M;
        if (view != null) {
            Rect rect = this.Y;
            view.invalidate(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public boolean isEmpty() {
        return r() == null;
    }

    @Override
    public void j1(Canvas canvas, int i10, int i11) {
        u.e(this, canvas, i10, i11);
    }

    public void k(float f10) {
        if (f16397s0 && !this.S) {
            d dVar = this.f16417p0;
            if (dVar != null) {
                dVar.a();
            }
            this.O = f10;
            Paint paint = this.f16404c0;
            if (paint != null) {
                paint.setAlpha((int) (f10 * 255.0f));
            }
            Paint paint2 = this.f16405d0;
            if (paint2 != null) {
                paint2.setAlpha((int) (f10 * 255.0f));
            }
            this.f16400a0.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public void l() {
        if (this.T > 0) {
            B();
        } else {
            A();
        }
    }

    public int m() {
        return (this.U + this.W) / 2;
    }

    public int n() {
        return (this.V + this.X) / 2;
    }

    @Override
    public void n5(h hVar, float f10) {
        h hVar2 = this.f16399a;
        if (this.R && d(hVar2, hVar)) {
            M(f10);
        }
    }

    public final int o(int i10) {
        return i10;
    }

    @Override
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        setAlpha(b.a(valueAnimator));
    }

    public final int p(int i10) {
        return i10;
    }

    public Bitmap q() {
        return this.N;
    }

    public h r() {
        return this.Q ? this.f16401b : this.f16399a;
    }

    public float s() {
        if (x()) {
            return getAlpha();
        }
        return 0.0f;
    }

    @Override
    public void setAlpha(float f10) {
        if (f16397s0 && !this.S && this.O != f10) {
            this.O = f10;
            if (this.f16419r0 == 0) {
                Paint paint = this.f16404c0;
                if (paint != null) {
                    paint.setAlpha((int) (f10 * 255.0f));
                }
                Paint paint2 = this.f16405d0;
                if (paint2 != null) {
                    paint2.setAlpha((int) (f10 * 255.0f));
                }
                this.f16400a0.setAlpha((int) (f10 * 255.0f));
            }
            invalidate();
        }
    }

    @Override
    public void setColorFilter(int i10) {
        if (!this.f16415n0 || this.f16416o0 != i10) {
            this.f16415n0 = true;
            this.f16416o0 = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.f16400a0.setColorFilter(porterDuffColorFilter);
            Paint paint = this.f16405d0;
            if (paint != null) {
                paint.setColorFilter(porterDuffColorFilter);
            }
            invalidate();
        }
    }

    @Override
    public void setTag(Object obj) {
        this.f16414m0 = obj;
    }

    public int t() {
        return this.T;
    }

    public final int u() {
        h hVar = this.f16399a;
        int i10 = 0;
        if (hVar == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 29 || !(hVar instanceof l) || !((l) hVar).f1()) {
            i10 = this.f16399a.D();
        }
        c cVar = this.f16410i0;
        return cVar != null ? ib.h.l(i10 + cVar.h(), 360) : i10;
    }

    @Override
    public void u0(Canvas canvas, int i10) {
        u.d(this, canvas, i10);
    }

    public void v() {
        View view = this.M;
        if (view != null) {
            view.invalidate();
        }
    }

    public boolean w(float f10, float f11) {
        return u.g(this, f10, f11);
    }

    public boolean x() {
        return v0.A1(this.N);
    }

    @Override
    public int x0() {
        return (int) ((this.X + this.V) * 0.5f);
    }

    public final boolean y() {
        h hVar = this.f16399a;
        if (hVar == null) {
            return false;
        }
        int x10 = hVar.x();
        c cVar = this.f16410i0;
        if (cVar != null) {
            x10 += cVar.h();
        }
        return v0.x1(x10);
    }

    public final boolean z(Matrix matrix) {
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        if (this.f16399a == null || !v0.A1(this.N)) {
            return false;
        }
        int y10 = this.f16399a.y();
        if (y10 == 1) {
            matrix.reset();
            boolean x12 = v0.x1(u());
            if (x12) {
                i11 = this.Z.height();
                i10 = this.Z.width();
            } else {
                i11 = this.Z.width();
                i10 = this.Z.height();
            }
            int width = this.Y.width();
            int height = this.Y.height();
            float f13 = i11;
            float f14 = i10;
            float min = Math.min(width / f13, height / f14);
            int i13 = (int) (f13 * min);
            int i14 = (int) (f14 * min);
            if (x12) {
                f10 = (width - i14) / 2.0f;
                i12 = height - i13;
            } else {
                f10 = (width - i13) / 2.0f;
                i12 = height - i14;
            }
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f10 + 0.5f), (int) ((i12 / 2.0f) + 0.5f));
            return true;
        } else if (y10 != 2) {
            return false;
        } else {
            matrix.reset();
            int width2 = this.Z.width();
            int height2 = this.Z.height();
            int width3 = this.Y.width();
            int height3 = this.Y.height();
            float f15 = 0.0f;
            if (width2 * height3 > width3 * height2) {
                f11 = height3 / height2;
                f15 = (width3 - (width2 * f11)) * 0.5f;
                f12 = 0.0f;
            } else {
                float f16 = width3 / width2;
                f12 = (height3 - (height2 * f16)) * 0.5f;
                f11 = f16;
            }
            matrix.setScale(f11, f11);
            matrix.postTranslate((int) (f15 + 0.5f), (int) (f12 + 0.5f));
            return true;
        }
    }
}
