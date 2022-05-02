package p156kd;

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
import be.C1359b;
import be.C1379j0;
import be.C1410y;
import nc.C7389v0;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.ImageLoader;
import p037cb.C2057b;
import p108hb.C5069h;
import p108hb.C5070i;
import p156kd.C6246h;
import p209od.C7856c;
import p254rd.C8431f;

public class C6257p implements AbstractC6266x, ValueAnimator.AnimatorUpdateListener, AbstractC6264v, C6246h.AbstractC6248b {
    public static boolean f19740s0;
    public static HandlerC6254m f19741t0;
    public View f19742M;
    public Bitmap f19743N;
    public float f19745P;
    public boolean f19746Q;
    public boolean f19747R;
    public boolean f19748S;
    public int f19749T;
    public int f19750U;
    public int f19751V;
    public int f19752W;
    public int f19753X;
    public final Rect f19754Y;
    public final Rect f19755Z;
    public C6246h f19756a;
    public final Paint f19757a0;
    public C6246h f19758b;
    public Matrix f19759b0;
    public final C6267y f19760c;
    public Paint f19761c0;
    public Paint f19762d0;
    public BitmapShader f19763e0;
    public RectF f19764f0;
    public RectF f19765g0;
    public Matrix f19766h0;
    public C7856c f19767i0;
    public Rect f19768j0;
    public AbstractC6258a f19770l0;
    public Object f19771m0;
    public boolean f19772n0;
    public int f19773o0;
    public C6241d f19774p0;
    public ValueAnimator f19775q0;
    public int f19776r0;
    public float f19744O = 1.0f;
    public float f19769k0 = 1.0f;

    public interface AbstractC6258a {
        void m20789a(C6257p pVar, C6246h hVar);
    }

    public C6257p(View view, int i) {
        if (f19741t0 == null) {
            f19741t0 = new HandlerC6254m();
            f19740s0 = C1379j0.m37372B().getDisplayMetrics().density >= 2.0f;
        }
        this.f19757a0 = new Paint(7);
        this.f19742M = view;
        this.f19760c = new C6267y(this);
        this.f19754Y = new Rect();
        this.f19755Z = new Rect();
        if (i != 0) {
            mo20259D0(i);
        }
    }

    public static boolean m20818H(C6246h hVar, C6246h hVar2) {
        if (hVar != hVar2) {
            if ((hVar != null ? hVar.mo20777C() : (byte) 0) != (hVar2 != null ? hVar2.mo20777C() : (byte) 0)) {
                return false;
            }
            String str = null;
            String hVar3 = hVar != null ? hVar.toString() : null;
            if (hVar2 != null) {
                str = hVar2.toString();
            }
            if (!C5070i.m24067c(hVar3, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean m20810d(C6246h hVar, C6246h hVar2) {
        if (hVar == null || hVar2 == null) {
            return false;
        }
        if (hVar == hVar2) {
            return true;
        }
        byte C = hVar.mo20777C();
        byte C2 = hVar2.mo20777C();
        String str = null;
        String w = hVar instanceof C6251j ? hVar.m20891w() : null;
        if (hVar2 instanceof C6251j) {
            str = hVar2.m20891w();
        }
        return C == C2 && (w == null ? hVar.mo20825s() : 0) == (str == null ? hVar2.mo20825s() : 0) && C5070i.m24067c(w, str);
    }

    public static void m20807h(Canvas canvas, Bitmap bitmap, float f, float f2, Paint paint) {
        try {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } catch (Throwable th) {
            Log.m14728e(32, "Unable to draw bitmap", th, new Object[0]);
            Tracer.m14772h(th);
        }
    }

    public static void m20806i(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        try {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } catch (Throwable th) {
            Log.m14728e(32, "Unable to draw bitmap", th, new Object[0]);
            Tracer.m14772h(th);
        }
    }

    public static void m20805j(Canvas canvas, RectF rectF, float f, float f2, Paint paint) {
        try {
            canvas.drawRoundRect(rectF, f, f2, paint);
        } catch (Throwable th) {
            Log.m14728e(32, "Unable to draw bitmap", th, new Object[0]);
            Tracer.m14772h(th);
        }
    }

    public final void m20824A() {
        throw new UnsupportedOperationException("Method not decompiled: p156kd.C6257p.m20824A():void");
    }

    public final void m20823B() {
        float f;
        this.f19754Y.set(this.f19750U, this.f19751V, this.f19752W, this.f19753X);
        if (C7389v0.m16756A1(this.f19743N)) {
            this.f19764f0.set(this.f19754Y);
            this.f19766h0.reset();
            RectF rectF = this.f19765g0;
            Rect rect = this.f19755Z;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            C6246h hVar = this.f19756a;
            if (hVar != null) {
                int y = hVar.m20888y();
                if (y != 1) {
                    f = y != 2 ? -1.0f : Math.max(this.f19764f0.width() / this.f19755Z.width(), this.f19764f0.height() / this.f19755Z.height());
                } else {
                    f = Math.min(this.f19764f0.width() / this.f19755Z.width(), this.f19764f0.height() / this.f19755Z.height());
                }
                if (f != -1.0f) {
                    int height = (int) (this.f19755Z.height() * f);
                    float centerX = this.f19764f0.centerX();
                    float centerY = this.f19764f0.centerY();
                    float width = ((int) (this.f19755Z.width() * f)) / 2.0f;
                    float f2 = height / 2.0f;
                    this.f19764f0.set(centerX - width, centerY - f2, centerX + width, centerY + f2);
                }
            }
            this.f19766h0.setRectToRect(this.f19765g0, this.f19764f0, Matrix.ScaleToFit.FILL);
            BitmapShader bitmapShader = this.f19763e0;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f19766h0);
            }
        }
    }

    public void m20822C() {
        if (!f19740s0 || this.f19748S) {
            f19741t0.m20827c(this);
        } else {
            f19741t0.m20829a(this);
        }
    }

    @Override
    public void mo20260D() {
        if (this.f19772n0) {
            this.f19772n0 = false;
            this.f19757a0.setColorFilter(null);
            Paint paint = this.f19762d0;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            invalidate();
        }
    }

    @Override
    public void mo20259D0(int i) {
        if (this.f19749T != i) {
            this.f19749T = i;
            if (this.f19761c0 == null) {
                Paint paint = new Paint(5);
                this.f19761c0 = paint;
                paint.setAlpha(this.f19757a0.getAlpha());
                this.f19766h0 = new Matrix();
                this.f19765g0 = new RectF();
                this.f19764f0 = new RectF();
            }
            this.f19764f0.set(this.f19750U, this.f19751V, this.f19752W, this.f19753X);
            if (!C7389v0.m16756A1(this.f19743N)) {
                return;
            }
            if (i > 0) {
                boolean z = this.f19763e0 == null;
                if (z) {
                    Bitmap bitmap = this.f19743N;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f19763e0 = new BitmapShader(bitmap, tileMode, tileMode);
                }
                m20823B();
                if (z) {
                    this.f19761c0.setShader(this.f19763e0);
                    return;
                }
                return;
            }
            m20824A();
        }
    }

    public void m20821E() {
        f19741t0.m20827c(this);
    }

    @Override
    public void mo20258E0(Canvas canvas, Path path, float f) {
        C6263u.m20758c(this, canvas, path, f);
    }

    public void m20820F() {
        if (this.f19767i0 == null) {
            this.f19767i0 = new C7856c();
            this.f19768j0 = new Rect();
        }
    }

    public void m20819G(C6246h hVar) {
        Bitmap bitmap;
        if (this.f19746Q) {
            this.f19758b = hVar;
        } else if (!m20818H(this.f19756a, hVar) || ((bitmap = this.f19743N) != null && bitmap.isRecycled())) {
            if (this.f19756a != null) {
                ImageLoader.m14392e().m14386k(this.f19760c);
            }
            Bitmap bitmap2 = null;
            if (hVar != null) {
                Bitmap b = C6259q.m20786c().m20787b(hVar);
                if (!C7389v0.m16756A1(b)) {
                    b = C6244g.m20960k().m20966e(hVar);
                }
                boolean z = false;
                if (!C7389v0.m16756A1(b)) {
                    if (this.f19744O != 0.0f) {
                        z = true;
                    }
                    m20804k(0.0f);
                    if (hVar.m20954A0() && C7389v0.m16756A1(this.f19743N)) {
                        bitmap2 = this.f19743N;
                    }
                    if (!m20816J(hVar, bitmap2, true) && z) {
                        invalidate();
                    }
                    if (!hVar.m20949F()) {
                        ImageLoader.m14392e().m14385l(hVar, this.f19760c);
                        return;
                    }
                    return;
                }
                if (this.f19744O != 1.0f) {
                    z = true;
                }
                m20804k(1.0f);
                if (!m20816J(hVar, b, true) && z) {
                    invalidate();
                }
                m20808g();
                return;
            }
            m20816J(null, null, true);
        } else if (this.f19756a != hVar) {
            m20816J(hVar, this.f19743N, true);
            if (C7389v0.m16756A1(this.f19743N)) {
                if (this.f19749T > 0) {
                    m20823B();
                } else {
                    m20824A();
                }
                invalidate();
            }
        }
    }

    public final void m20817I(Bitmap bitmap) {
        if (this.f19743N != bitmap) {
            this.f19743N = bitmap;
            if (this.f19763e0 != null) {
                this.f19763e0 = null;
                Paint paint = this.f19761c0;
                if (paint != null) {
                    paint.setShader(null);
                }
                Paint paint2 = this.f19762d0;
                if (paint2 != null) {
                    paint2.setShader(null);
                }
            }
        }
        if (C7389v0.m16756A1(bitmap)) {
            this.f19755Z.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            this.f19755Z.set(0, 0, 1, 1);
        }
    }

    @Override
    public int mo20257I0() {
        return (int) ((this.f19750U + this.f19752W) * 0.5f);
    }

    public boolean m20816J(p156kd.C6246h r10, android.graphics.Bitmap r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: p156kd.C6257p.m20816J(kd.h, android.graphics.Bitmap, boolean):boolean");
    }

    public void m20815K(C6246h hVar, Bitmap bitmap) {
        C6246h hVar2 = this.f19756a;
        if (m20810d(hVar2, hVar)) {
            m20808g();
            m20816J(hVar2, bitmap, true);
        }
    }

    @Override
    public boolean mo20256K0(int i, int i2, int i3, int i4) {
        if (this.f19750U == i && this.f19751V == i2 && this.f19752W == i3 && this.f19753X == i4) {
            return false;
        }
        this.f19750U = i;
        this.f19751V = i2;
        this.f19752W = i3;
        this.f19753X = i4;
        if (this.f19749T > 0) {
            m20823B();
            return true;
        }
        m20824A();
        return true;
    }

    public void m20814L(float f) {
        if (this.f19769k0 != f) {
            this.f19769k0 = f;
            mo20238l();
            invalidate();
        }
    }

    public void m20813M(float f) {
        if (this.f19745P != f) {
            this.f19745P = f;
            invalidate();
        }
    }

    @Override
    public void mo20255N(Canvas canvas) {
        mo20228u0(canvas, this.f19749T);
    }

    @Override
    public void mo20254O(Canvas canvas, Path path) {
        C6263u.m20759b(this, canvas, path);
    }

    @Override
    public void mo20253P() {
        Paint paint = this.f19762d0;
        if (paint != null) {
            paint.setAlpha(Color.red(this.f19776r0));
        }
        Paint paint2 = this.f19761c0;
        if (paint2 != null) {
            paint2.setAlpha(Color.green(this.f19776r0));
        }
        this.f19757a0.setAlpha(Color.blue(this.f19776r0));
        this.f19776r0 = 0;
    }

    @Override
    public float mo20252R0() {
        Paint paint = this.f19762d0;
        if (paint == null && (paint = this.f19761c0) == null) {
            paint = this.f19757a0;
        }
        return paint.getAlpha() / 255.0f;
    }

    @Override
    public void mo20251S0(boolean z) {
        if (f19740s0 && this.f19748S != z) {
            this.f19748S = z;
            if (z) {
                this.f19744O = 1.0f;
            } else if (C7389v0.m16756A1(this.f19743N)) {
                this.f19744O = 1.0f;
            } else {
                this.f19744O = 0.0f;
            }
            if (this.f19776r0 == 0) {
                Paint paint = this.f19761c0;
                if (paint != null) {
                    paint.setAlpha((int) (this.f19744O * 255.0f));
                }
                Paint paint2 = this.f19762d0;
                if (paint2 != null) {
                    paint2.setAlpha((int) (this.f19744O * 255.0f));
                }
                this.f19757a0.setAlpha((int) (this.f19744O * 255.0f));
            }
            invalidate();
        }
    }

    @Override
    public void mo20250U(float f) {
        Paint paint = this.f19762d0;
        int i = 0;
        int alpha = paint != null ? paint.getAlpha() : 0;
        Paint paint2 = this.f19761c0;
        if (paint2 != null) {
            i = paint2.getAlpha();
        }
        this.f19776r0 = Color.rgb(alpha, i, this.f19757a0.getAlpha());
        int d = (int) (C5069h.m24089d(f) * 255.0f);
        Paint paint3 = this.f19761c0;
        if (paint3 != null) {
            paint3.setAlpha(d);
        }
        Paint paint4 = this.f19762d0;
        if (paint4 != null) {
            paint4.setAlpha(d);
        }
        this.f19757a0.setAlpha(d);
    }

    @Override
    public void mo20249Z() {
        clear();
    }

    @Override
    public void mo20812a(C6246h hVar, C7856c cVar) {
        if (!this.f19767i0.m14829a(cVar)) {
            this.f19767i0.m14814p(cVar);
            mo20238l();
            m20794v();
        }
    }

    @Override
    public void mo20248a1(Rect rect) {
        C6263u.m20752i(this, rect);
    }

    @Override
    public void mo20247b() {
        if (!this.f19746Q) {
            this.f19746Q = true;
            C6246h hVar = this.f19756a;
            if (hVar != null) {
                this.f19758b = hVar;
                this.f19746Q = false;
                m20819G(null);
                this.f19746Q = true;
            }
        }
    }

    public void m20811c() {
        if (f19740s0 && !this.f19748S) {
            C6241d dVar = this.f19774p0;
            if (dVar != null) {
                dVar.m20976a();
            }
            ValueAnimator valueAnimator = this.f19775q0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            setAlpha(0.0f);
            C6246h hVar = this.f19756a;
            if (hVar == null || !(hVar instanceof C6256o)) {
                if (this.f19774p0 == null) {
                    if (hVar != null) {
                        this.f19774p0 = new C6241d(this, this.f19756a instanceof C6253l);
                    } else {
                        this.f19774p0 = new C6241d(this);
                    }
                }
                this.f19774p0.m20974c();
                return;
            }
            ValueAnimator valueAnimator2 = this.f19775q0;
            if (valueAnimator2 == null) {
                ValueAnimator b = C2057b.m35734b();
                this.f19775q0 = b;
                b.addUpdateListener(this);
                this.f19775q0.setDuration(120L);
                this.f19775q0.setInterpolator(C2057b.f7280b);
            } else {
                valueAnimator2.setFloatValues(0.0f, 1.0f);
            }
            this.f19775q0.start();
        }
    }

    @Override
    public boolean mo20246c0() {
        return !m20792x() || (this.f19744O != 1.0f && f19740s0 && !this.f19748S);
    }

    @Override
    public void clear() {
        m20819G(null);
    }

    @Override
    public void draw(Canvas canvas) {
        float f;
        int i;
        int i2;
        if (C7389v0.m16756A1(this.f19743N)) {
            int u = m20795u();
            if (this.f19749T != 0) {
                if (u != 0) {
                    canvas.save();
                    canvas.rotate(u, this.f19750U + ((this.f19752W - i) / 2.0f), this.f19751V + ((this.f19753X - i2) / 2.0f));
                }
                RectF rectF = this.f19764f0;
                int i3 = this.f19749T;
                m20805j(canvas, rectF, i3, i3, this.f19761c0);
                if (u != 0) {
                    canvas.restore();
                }
            } else if (this.f19756a.m20888y() == 3) {
                canvas.save();
                canvas.drawRect(this.f19750U, this.f19751V, this.f19752W, this.f19753X, this.f19762d0);
                canvas.restore();
            } else {
                C8431f t = this.f19756a.m20896t();
                float y = this.f19756a.m20888y();
                if (y == 2.0f || y == 1.0f) {
                    C7856c cVar = this.f19767i0;
                    boolean z = true;
                    boolean z2 = cVar != null;
                    if (z2) {
                        f = cVar.m14827c();
                        if (f == 0.0f && this.f19767i0.m14817m()) {
                            z = false;
                        }
                        z2 = z;
                    } else {
                        f = 0.0f;
                    }
                    canvas.save();
                    canvas.clipRect(this.f19750U, this.f19751V, this.f19752W, this.f19753X);
                    int i4 = this.f19750U;
                    if (!(i4 == 0 && this.f19751V == 0)) {
                        canvas.translate(i4, this.f19751V);
                    }
                    if (u != 0) {
                        canvas.rotate(u, (this.f19752W - this.f19750U) / 2.0f, (this.f19753X - this.f19751V) / 2.0f);
                    }
                    if (z2) {
                        canvas.concat(this.f19759b0);
                        Rect Z = C1410y.m37052Z();
                        if (!(this.f19769k0 >= 1.0f && f == 0.0f && t == null)) {
                            Rect rect = this.f19768j0;
                            int i5 = rect.left;
                            Rect rect2 = this.f19755Z;
                            int i6 = i5 - rect2.left;
                            int i7 = rect.top - rect2.top;
                            canvas.clipRect(i6, i7, rect.width() + i6, this.f19768j0.height() + i7);
                        }
                        Z.set(0, 0, this.f19755Z.width(), this.f19755Z.height());
                        if (f != 0.0f) {
                            Rect rect3 = this.f19755Z;
                            canvas.translate(-rect3.left, -rect3.top);
                            float width = this.f19743N.getWidth();
                            float height = this.f19743N.getHeight();
                            double radians = Math.toRadians(f);
                            float abs = (float) Math.abs(Math.sin(radians));
                            float abs2 = (float) Math.abs(Math.cos(radians));
                            float max = Math.max(((width * abs2) + (height * abs)) / width, ((abs * width) + (abs2 * height)) / height);
                            float f2 = width / 2.0f;
                            float f3 = height / 2.0f;
                            canvas.rotate(f, f2, f3);
                            canvas.scale(max, max, f2, f3);
                            m20807h(canvas, this.f19743N, 0.0f, 0.0f, this.f19757a0);
                            if (t != null) {
                                t.m12496g(canvas, 0, 0, this.f19743N.getWidth(), this.f19743N.getHeight());
                            }
                        } else {
                            m20806i(canvas, this.f19743N, this.f19755Z, Z, this.f19757a0);
                            if (t != null) {
                                canvas.clipRect(Z);
                                C1359b.m37500s(canvas, this.f19743N, this.f19755Z, Z, t);
                            }
                        }
                    } else {
                        canvas.concat(this.f19759b0);
                        m20807h(canvas, this.f19743N, 0.0f, 0.0f, this.f19757a0);
                        if (t != null) {
                            canvas.clipRect(0, 0, this.f19743N.getWidth(), this.f19743N.getHeight());
                            t.m12496g(canvas, 0, 0, this.f19743N.getWidth(), this.f19743N.getHeight());
                        }
                    }
                    canvas.restore();
                    return;
                }
                m20806i(canvas, this.f19743N, this.f19755Z, this.f19754Y, this.f19757a0);
                if (t != null) {
                    canvas.save();
                    canvas.clipRect(this.f19754Y);
                    C1359b.m37500s(canvas, this.f19743N, this.f19755Z, this.f19754Y, t);
                    canvas.restore();
                }
            }
        }
    }

    public void m20809e(C6257p pVar) {
        mo20256K0(pVar.f19750U, pVar.f19751V, pVar.f19752W, pVar.f19753X);
        mo20259D0(pVar.f19749T);
    }

    @Override
    public void mo20245f() {
        if (this.f19746Q) {
            this.f19746Q = false;
            C6246h hVar = this.f19758b;
            if (hVar != null) {
                m20819G(hVar);
                this.f19758b = null;
            }
        }
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        C6263u.m20755f(this, view, rect);
    }

    public final void m20808g() {
        AbstractC6258a aVar = this.f19770l0;
        if (aVar != null) {
            aVar.m20789a(this, this.f19756a);
        }
    }

    @Override
    public float getAlpha() {
        return this.f19744O;
    }

    @Override
    public int getBottom() {
        return this.f19753X;
    }

    @Override
    public int getHeight() {
        return this.f19753X - this.f19751V;
    }

    @Override
    public int getLeft() {
        return this.f19750U;
    }

    @Override
    public int getRight() {
        return this.f19752W;
    }

    @Override
    public Object getTag() {
        return this.f19771m0;
    }

    @Override
    public int getTop() {
        return this.f19751V;
    }

    @Override
    public int getWidth() {
        return this.f19752W - this.f19750U;
    }

    @Override
    public void invalidate() {
        View view = this.f19742M;
        if (view != null) {
            Rect rect = this.f19754Y;
            view.invalidate(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public boolean isEmpty() {
        return m20798r() == null;
    }

    public void m20804k(float f) {
        if (f19740s0 && !this.f19748S) {
            C6241d dVar = this.f19774p0;
            if (dVar != null) {
                dVar.m20976a();
            }
            this.f19744O = f;
            Paint paint = this.f19761c0;
            if (paint != null) {
                paint.setAlpha((int) (f * 255.0f));
            }
            Paint paint2 = this.f19762d0;
            if (paint2 != null) {
                paint2.setAlpha((int) (f * 255.0f));
            }
            this.f19757a0.setAlpha((int) (f * 255.0f));
        }
    }

    @Override
    public void mo14384k0(C6246h hVar, boolean z, Bitmap bitmap) {
        C6246h hVar2 = this.f19756a;
        if (!m20810d(hVar2, hVar)) {
            return;
        }
        if (z) {
            f19741t0.m20828b(this, hVar2, bitmap);
        } else {
            m20816J(hVar2, null, false);
        }
    }

    @Override
    public boolean mo20239k1(float f, float f2, int i, int i2) {
        float f3;
        float min;
        C6246h hVar = this.f19756a;
        if (!(hVar == null && (i == 0 || i2 == 0))) {
            if (hVar != null) {
                if (!C7389v0.m16756A1(this.f19743N)) {
                    C6246h hVar2 = this.f19756a;
                    if (!(hVar2 instanceof C6253l)) {
                        return false;
                    }
                    i = m20800p(((C6253l) hVar2).m20849Y0());
                    i2 = m20801o(((C6253l) this.f19756a).m20862L0());
                } else if (m20791y()) {
                    i = m20800p(this.f19755Z.height());
                    i2 = m20801o(this.f19755Z.width());
                } else {
                    i = m20800p(this.f19755Z.width());
                    i2 = m20801o(this.f19755Z.height());
                }
            }
            C6246h hVar3 = this.f19756a;
            if ((hVar3 != null ? hVar3.m20888y() : 1) == 1) {
                float f4 = i2;
                int min2 = (int) (f4 * Math.min((this.f19752W - this.f19750U) / i, (this.f19753X - this.f19751V) / f4));
                int i3 = (this.f19751V + this.f19753X) / 2;
                float f5 = (this.f19750U + this.f19752W) / 2;
                float f6 = ((int) (f3 * min)) / 2.0f;
                if (f < f5 - f6 || f > f5 + f6) {
                    return false;
                }
                float f7 = i3;
                float f8 = min2 / 2.0f;
                return f2 >= f7 - f8 && f2 <= f7 + f8;
            }
        }
        return false;
    }

    @Override
    public void mo20238l() {
        if (this.f19749T > 0) {
            m20823B();
        } else {
            m20824A();
        }
    }

    public int m20803m() {
        return (this.f19750U + this.f19752W) / 2;
    }

    @Override
    public void mo20236m1(Canvas canvas, int i, int i2) {
        C6263u.m20756e(this, canvas, i, i2);
    }

    public int m20802n() {
        return (this.f19751V + this.f19753X) / 2;
    }

    public final int m20801o(int i) {
        return i;
    }

    @Override
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        setAlpha(C2057b.m35735a(valueAnimator));
    }

    public final int m20800p(int i) {
        return i;
    }

    public Bitmap m20799q() {
        return this.f19743N;
    }

    @Override
    public void mo14383q5(C6246h hVar, float f) {
        C6246h hVar2 = this.f19756a;
        if (this.f19747R && m20810d(hVar2, hVar)) {
            m20813M(f);
        }
    }

    public C6246h m20798r() {
        return this.f19746Q ? this.f19758b : this.f19756a;
    }

    public float m20797s() {
        if (m20792x()) {
            return getAlpha();
        }
        return 0.0f;
    }

    @Override
    public void setAlpha(float f) {
        if (f19740s0 && !this.f19748S && this.f19744O != f) {
            this.f19744O = f;
            if (this.f19776r0 == 0) {
                Paint paint = this.f19761c0;
                if (paint != null) {
                    paint.setAlpha((int) (f * 255.0f));
                }
                Paint paint2 = this.f19762d0;
                if (paint2 != null) {
                    paint2.setAlpha((int) (f * 255.0f));
                }
                this.f19757a0.setAlpha((int) (f * 255.0f));
            }
            invalidate();
        }
    }

    @Override
    public void setColorFilter(int i) {
        if (!this.f19772n0 || this.f19773o0 != i) {
            this.f19772n0 = true;
            this.f19773o0 = i;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.f19757a0.setColorFilter(porterDuffColorFilter);
            Paint paint = this.f19762d0;
            if (paint != null) {
                paint.setColorFilter(porterDuffColorFilter);
            }
            invalidate();
        }
    }

    @Override
    public void setTag(Object obj) {
        this.f19771m0 = obj;
    }

    public int m20796t() {
        return this.f19749T;
    }

    public final int m20795u() {
        C6246h hVar = this.f19756a;
        int i = 0;
        if (hVar == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 29 || !(hVar instanceof C6253l) || !((C6253l) hVar).m20842f1()) {
            i = this.f19756a.mo20872D();
        }
        C7856c cVar = this.f19767i0;
        return cVar != null ? C5069h.m24081l(i + cVar.m14822h(), 360) : i;
    }

    @Override
    public void mo20228u0(Canvas canvas, int i) {
        C6263u.m20757d(this, canvas, i);
    }

    public void m20794v() {
        View view = this.f19742M;
        if (view != null) {
            view.invalidate();
        }
    }

    public boolean m20793w(float f, float f2) {
        return C6263u.m20754g(this, f, f2);
    }

    public boolean m20792x() {
        return C7389v0.m16756A1(this.f19743N);
    }

    public final boolean m20791y() {
        C6246h hVar = this.f19756a;
        if (hVar == null) {
            return false;
        }
        int x = hVar.mo20873x();
        C7856c cVar = this.f19767i0;
        if (cVar != null) {
            x += cVar.m14822h();
        }
        return C7389v0.m16564x1(x);
    }

    @Override
    public int mo20227y0() {
        return (int) ((this.f19753X + this.f19751V) * 0.5f);
    }

    public final boolean m20790z(Matrix matrix) {
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        if (this.f19756a == null || !C7389v0.m16756A1(this.f19743N)) {
            return false;
        }
        int y = this.f19756a.m20888y();
        if (y == 1) {
            matrix.reset();
            boolean x1 = C7389v0.m16564x1(m20795u());
            if (x1) {
                i2 = this.f19755Z.height();
                i = this.f19755Z.width();
            } else {
                i2 = this.f19755Z.width();
                i = this.f19755Z.height();
            }
            int width = this.f19754Y.width();
            int height = this.f19754Y.height();
            float f4 = i2;
            float f5 = i;
            float min = Math.min(width / f4, height / f5);
            int i4 = (int) (f4 * min);
            int i5 = (int) (f5 * min);
            if (x1) {
                f = (width - i5) / 2.0f;
                i3 = height - i4;
            } else {
                f = (width - i4) / 2.0f;
                i3 = height - i5;
            }
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f + 0.5f), (int) ((i3 / 2.0f) + 0.5f));
            return true;
        } else if (y != 2) {
            return false;
        } else {
            matrix.reset();
            int width2 = this.f19755Z.width();
            int height2 = this.f19755Z.height();
            int width3 = this.f19754Y.width();
            int height3 = this.f19754Y.height();
            float f6 = 0.0f;
            if (width2 * height3 > width3 * height2) {
                f2 = height3 / height2;
                f6 = (width3 - (width2 * f2)) * 0.5f;
                f3 = 0.0f;
            } else {
                float f7 = width3 / width2;
                f3 = (height3 - (height2 * f7)) * 0.5f;
                f2 = f7;
            }
            matrix.setScale(f2, f2);
            matrix.postTranslate((int) (f6 + 0.5f), (int) (f3 + 0.5f));
            return true;
        }
    }
}
