package ud;

import ae.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c1.v;
import ce.a0;
import ce.j0;
import ce.y;
import eb.k;
import gd.w;
import hd.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import je.g;
import je.n;
import je.x0;
import ne.i;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import ud.x2;
import zd.hj;
import zd.o6;

public class x2 extends ViewGroup {
    public final Paint M;
    public l O;
    public boolean P;
    public d f24592a;
    public final int[] f24593b = new int[2];
    public final e f24594c = new a();
    public final List<l> N = new ArrayList();

    public class a implements e {
        public a() {
        }

        @Override
        public int A0() {
            return y2.g(this);
        }

        @Override
        public int I() {
            return y2.c(this);
        }

        @Override
        public int M0() {
            return je.m.m(this);
        }

        @Override
        public int O0() {
            return y2.d(this);
        }

        @Override
        public int R() {
            return je.j.d(this);
        }

        @Override
        public long W0(boolean z10) {
            return je.j.c(this, z10);
        }

        @Override
        public int X0() {
            return je.m.i(this);
        }

        @Override
        public int a1() {
            return je.m.h(this);
        }

        @Override
        public int c() {
            return je.m.f(this);
        }

        @Override
        public int d(boolean z10) {
            return je.m.b(this, z10);
        }

        @Override
        public int g(boolean z10) {
            return je.m.k(this, z10);
        }

        @Override
        public p g1() {
            return je.m.e(this);
        }

        @Override
        public int i1() {
            return y2.e(this);
        }

        @Override
        public int k() {
            return y2.f(this);
        }

        @Override
        public int o0(boolean z10) {
            return je.m.c(this, z10);
        }

        @Override
        public int r(boolean z10) {
            return y2.a(this, z10);
        }

        @Override
        public int r0(boolean z10) {
            return je.m.a(this, z10);
        }

        @Override
        public int t() {
            return y2.b(this);
        }

        @Override
        public int t0(boolean z10) {
            return je.m.j(this, z10);
        }

        @Override
        public p z() {
            return je.m.g(this);
        }
    }

    public class b implements e {
        public final p f24596a;

        public b(p pVar) {
            this.f24596a = pVar;
        }

        @Override
        public int A0() {
            return y2.g(this);
        }

        @Override
        public int I() {
            return y2.c(this);
        }

        @Override
        public int M0() {
            return je.m.m(this);
        }

        @Override
        public int O0() {
            return y2.d(this);
        }

        @Override
        public int R() {
            return je.j.d(this);
        }

        @Override
        public long W0(boolean z10) {
            return je.j.c(this, z10);
        }

        @Override
        public int X0() {
            return je.m.i(this);
        }

        @Override
        public int a1() {
            return je.m.h(this);
        }

        @Override
        public int c() {
            return je.m.f(this);
        }

        @Override
        public int d(boolean z10) {
            return je.m.b(this, z10);
        }

        @Override
        public int g(boolean z10) {
            return je.m.k(this, z10);
        }

        @Override
        public p g1() {
            return je.m.e(this);
        }

        @Override
        public int i1() {
            return y2.e(this);
        }

        @Override
        public int k() {
            return y2.f(this);
        }

        @Override
        public int o0(boolean z10) {
            return je.m.c(this, z10);
        }

        @Override
        public int r(boolean z10) {
            return y2.a(this, z10);
        }

        @Override
        public int r0(boolean z10) {
            return je.m.a(this, z10);
        }

        @Override
        public int t() {
            return y2.b(this);
        }

        @Override
        public int t0(boolean z10) {
            return je.m.j(this, z10);
        }

        @Override
        public p z() {
            return this.f24596a;
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public final l f24598a;

        public c(l lVar) {
            this.f24598a = lVar;
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            this.f24598a.Y();
            x2.this.removeOnAttachStateChangeListener(this);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        void a(x2 x2Var, boolean z10);
    }

    public interface e extends n {
        int A0();

        int O0();

        int i1();

        int k();
    }

    public interface f {
        void d1(View view, Rect rect);
    }

    public interface g {
        void a(RectF rectF);
    }

    public static abstract class i {
        public final x2 f24605a;

        public i(x2 x2Var) {
            this.f24605a = x2Var;
        }

        public abstract void a(Canvas canvas, e eVar, int i10, int i11, int i12, int i13, float f10, ld.b bVar);

        public abstract int b();

        public abstract int c();

        public abstract boolean d(l lVar, int i10, int i11, int i12);

        public abstract boolean e(l lVar, View view, MotionEvent motionEvent);

        public abstract void f(ld.b bVar);
    }

    public static class j extends i {
        public final o6 f24606b;
        public final TdApi.FormattedText f24607c;
        public final hj.q f24608d;
        public final int f24609e;
        public je.g f24610f;

        public j(x2 x2Var, o6 o6Var, TdApi.FormattedText formattedText, int i10, hj.q qVar) {
            super(x2Var);
            this.f24606b = o6Var;
            this.f24607c = formattedText;
            this.f24609e = i10;
            this.f24608d = qVar;
        }

        @Override
        public void a(Canvas canvas, e eVar, int i10, int i11, int i12, int i13, float f10, ld.b bVar) {
            je.g gVar = this.f24610f;
            if (gVar != null) {
                gVar.w(canvas, i10, i12, 0, i11, null, f10, bVar);
            }
        }

        @Override
        public int b() {
            je.g gVar = this.f24610f;
            if (gVar != null) {
                return gVar.getHeight();
            }
            return 0;
        }

        @Override
        public int c() {
            je.g gVar = this.f24610f;
            if (gVar != null) {
                return gVar.getWidth();
            }
            return 0;
        }

        @Override
        public boolean d(l lVar, int i10, int i11, int i12) {
            je.g gVar = this.f24610f;
            if (gVar != null && gVar.h0() == i12) {
                return false;
            }
            this.f24610f = new g.b(this.f24606b, this.f24607c, this.f24608d, i12, y.A0(lVar.f24619h).l(lVar.f24620i), lVar.f24616e).y(this.f24609e | 8).z(new gb.h(this.f24605a)).f();
            return true;
        }

        @Override
        public boolean e(l lVar, View view, MotionEvent motionEvent) {
            return this.f24610f.V0(view, motionEvent, lVar.f24621j);
        }

        @Override
        public void f(ld.b bVar) {
            bVar.d();
        }
    }

    public static class k extends i {
        public final x0 f24611b;

        public k(x2 x2Var, x0 x0Var) {
            super(x2Var);
            this.f24611b = x0Var;
            x0Var.H(new gb.h(x2Var));
        }

        @Override
        public void a(Canvas canvas, e eVar, int i10, int i11, int i12, int i13, float f10, ld.b bVar) {
            this.f24611b.i(canvas, i10, i12, 0, i11, null, f10, bVar);
        }

        @Override
        public int b() {
            return this.f24611b.getHeight();
        }

        @Override
        public int c() {
            return this.f24611b.getWidth();
        }

        @Override
        public boolean d(l lVar, int i10, int i11, int i12) {
            this.f24611b.B(i12);
            return true;
        }

        @Override
        public boolean e(l lVar, View view, MotionEvent motionEvent) {
            return this.f24611b.y(view, motionEvent, lVar.f24621j);
        }

        @Override
        public void f(ld.b bVar) {
            this.f24611b.C(bVar);
        }
    }

    public static class l {
        public y0.b A;
        public boolean B;
        public final kb.c C;
        public final v4.l D;
        public long E;
        public List<kb.l> F;
        public boolean G;
        public int H;
        public int I;
        public final RectF J;
        public final Path K;
        public View L;
        public boolean M;
        public final View.OnLayoutChangeListener N;
        public final i.g O;
        public final View.OnAttachStateChangeListener P;
        public final x2 f24612a;
        public final View f24613b;
        public final gb.j f24614c;
        public final f f24615d;
        public final e f24616e;
        public final g f24617f;
        public final v4<?> f24618g;
        public final float f24619h;
        public final boolean f24620i;
        public final g.c f24621j;
        public Drawable f24622k;
        public final ld.h f24623l;
        public final ld.h f24624m;
        public final md.j f24625n;
        public final float f24626o;
        public final int f24627p;
        public i f24628q;
        public final ld.b f24629r;
        public final ld.c f24630s;
        public final md.m f24631t;
        public final int[] f24632u;
        public final Rect f24633v;
        public lb.d<m> f24634w;
        public final eb.f f24635x;
        public kb.b f24636y;
        public boolean f24637z;

        public class a implements k.b {
            public a() {
            }

            @Override
            public void n4(int i10, float f10, float f11, eb.k kVar) {
                if (l.this.f24634w != null) {
                    Iterator it = l.this.f24634w.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).l(l.this, f10);
                    }
                }
                if (l.this.B) {
                    l.this.f24612a.invalidate();
                }
            }

            @Override
            public void o4(int i10, float f10, eb.k kVar) {
                if (l.this.f24634w != null) {
                    Iterator it = l.this.f24634w.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).b(l.this, f10 > 0.0f);
                    }
                }
                if (f10 == 0.0f) {
                    l.this.z();
                }
            }
        }

        public class b extends kb.b {
            public b() {
            }

            @Override
            public void b() {
                l.this.E(true);
            }
        }

        public class c implements View.OnAttachStateChangeListener {
            public c() {
            }

            @Override
            public void onViewAttachedToWindow(View view) {
                l.this.S(view, true);
            }

            @Override
            public void onViewDetachedFromWindow(View view) {
                l.this.S(view, false);
            }
        }

        public l(x2 x2Var, View view, gb.j jVar, f fVar, e eVar, g gVar, v4<?> v4Var, g.c cVar, float f10, boolean z10, int i10, ld.h hVar, ld.h hVar2, md.j jVar2, float f11, int i11, i iVar) {
            this.f24632u = new int[2];
            this.f24633v = new Rect();
            this.f24635x = new eb.f(0, new a(), db.b.f7291f, 210L);
            this.C = new kb.c() {
                @Override
                public final void Q2() {
                    x2.l.this.J();
                }
            };
            this.D = new v4.l() {
                @Override
                public final void a(v4 v4Var2, boolean z11) {
                    x2.l.this.M(v4Var2, z11);
                }
            };
            this.J = new RectF();
            this.K = new Path();
            this.N = new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    x2.l.this.N(view2, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            };
            this.O = new i.g() {
                @Override
                public final void a(i iVar2, float f12, float f13) {
                    x2.l.this.O(iVar2, f12, f13);
                }
            };
            this.P = new c();
            this.f24612a = x2Var;
            this.f24613b = view;
            this.f24614c = jVar;
            this.f24615d = fVar;
            this.f24616e = eVar != null ? eVar : x2Var.f24594c;
            this.f24617f = gVar;
            this.f24618g = v4Var;
            this.f24619h = f10;
            this.f24620i = z10;
            this.f24621j = cVar;
            this.f24622k = ce.c.f(i10);
            this.f24623l = hVar;
            this.f24624m = hVar2;
            this.f24625n = jVar2;
            md.m mVar = null;
            this.f24630s = (hVar == null && hVar2 == null) ? null : new ld.c(x2Var, 0);
            this.f24631t = jVar2 != null ? new md.m(x2Var) : mVar;
            this.f24629r = new ld.b(x2Var);
            this.f24626o = f11;
            this.f24627p = i11;
            this.f24628q = iVar;
        }

        public void M(v4 v4Var, boolean z10) {
            if (!z10) {
                J();
            }
        }

        public void N(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (view.getVisibility() == 8) {
                J();
            } else {
                U();
            }
        }

        public void O(ne.i iVar, float f10, float f11) {
            U();
        }

        public void P(y0.b bVar) {
            if (!bVar.b()) {
                X(true, true);
                if (this.A == bVar) {
                    this.A = null;
                }
            }
        }

        public void A(Canvas canvas) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            md.m mVar;
            float g10 = this.f24635x.g();
            float d10 = ib.h.d(g10);
            float f10 = (g10 * 0.2f) + 0.8f;
            Rect Z = y.Z();
            int c10 = this.H - (this.f24628q.c() / 2);
            Z.left = c10;
            Z.right = c10 + this.f24628q.c();
            int i19 = 0;
            boolean z10 = f10 != 1.0f;
            if (z10) {
                int save = canvas.save();
                if (ib.c.b(this.f24627p, 8)) {
                    canvas.scale(f10, f10, this.J.centerX(), this.J.centerY());
                } else {
                    canvas.scale(f10, f10, this.H, this.I);
                }
                i10 = save;
            } else {
                i10 = -1;
            }
            int a10 = ib.d.a(d10, this.f24616e.k());
            if (Color.alpha(a10) > 0) {
                this.f24612a.M.setStyle(Paint.Style.STROKE);
                this.f24612a.M.setStrokeWidth(a0.i(2.0f));
                this.f24612a.M.setColor(a10);
                canvas.drawPath(this.K, this.f24612a.M);
                this.f24612a.M.setStyle(Paint.Style.FILL);
            }
            this.f24612a.M.setColor(ib.d.a(d10, this.f24616e.O0()));
            canvas.drawPath(this.K, this.f24612a.M);
            if (D()) {
                int i20 = a0.i(8.0f);
                int i21 = a0.i(10.0f);
                int i22 = a0.i(11.0f);
                i19 = a0.i(24.0f) + a0.i(8.0f);
                int max = Math.max(0, (a0.i(24.0f) / 2) - (this.f24628q.b() / 2));
                int i23 = a0.i(24.0f);
                RectF rectF = this.J;
                int i24 = (int) (rectF.left + i20);
                int i25 = (int) (rectF.top + i22);
                int i26 = i23 / 2;
                int i27 = i24 + i26;
                int i28 = i26 + i25;
                int min = i23 + (Math.min(i20, a0.i(8.0f)) / 2);
                if (this.f24630s == null || ((mVar = this.f24631t) != null && !mVar.e0())) {
                    i18 = i20;
                    i17 = max;
                    i16 = i21;
                    i15 = i22;
                } else {
                    int i29 = min / 2;
                    i18 = i20;
                    i17 = max;
                    i16 = i21;
                    i15 = i22;
                    this.f24630s.K0(i27 - i29, i28 - i29, i27 + i29, i28 + i29);
                    this.f24630s.V(d10);
                    this.f24630s.draw(canvas);
                    this.f24630s.Q();
                }
                md.m mVar2 = this.f24631t;
                if (mVar2 != null) {
                    int i30 = min / 2;
                    mVar2.K0(i27 - i30, i28 - i30, i27 + i30, i28 + i30);
                    this.f24631t.setAlpha(d10);
                    this.f24631t.draw(canvas);
                }
                Drawable drawable = this.f24622k;
                if (drawable != null) {
                    ce.c.b(canvas, drawable, i24, i25, y.W(ib.d.a(d10, this.f24616e.c())));
                }
                ib.c.b(this.f24627p, 16);
                i14 = i18;
                i13 = i17;
                i12 = i16;
                i11 = i15;
            } else {
                i14 = a0.i(8.0f);
                i12 = a0.i(8.0f);
                i11 = a0.i(8.0f);
                i13 = 0;
            }
            i iVar = this.f24628q;
            e eVar = this.f24616e;
            RectF rectF2 = this.J;
            float f11 = i11;
            iVar.a(canvas, eVar, (int) (rectF2.left + i14 + i19), (int) (rectF2.top + f11 + i13), (int) (rectF2.right - i12), (int) (rectF2.bottom - f11), d10, this.f24629r);
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }

        public final View B() {
            gb.j jVar = this.f24614c;
            if (jVar != null) {
                View view = this.f24613b;
                if (view != null && jVar.c(view)) {
                    return this.f24613b;
                }
                View f10 = this.f24614c.f();
                if (f10 != null) {
                    return f10;
                }
            }
            return this.f24613b;
        }

        public String C() {
            i iVar = this.f24628q;
            if (iVar instanceof j) {
                return ((j) iVar).f24607c.text;
            }
            return null;
        }

        public final boolean D() {
            return (this.f24622k == null && this.f24623l == null && this.f24624m == null && this.f24625n == null) ? false : true;
        }

        public void E(boolean z10) {
            x();
            if (z10 || this.f24636y == null) {
                w();
                X(false, true);
                return;
            }
            this.f24637z = true;
        }

        public l F() {
            return H(true);
        }

        public l G(long j10, TimeUnit timeUnit) {
            return I(true, j10, timeUnit);
        }

        public l H(boolean z10) {
            return I(z10, 2500L, TimeUnit.MILLISECONDS);
        }

        public l I(boolean z10, long j10, TimeUnit timeUnit) {
            w();
            this.f24637z = z10;
            b bVar = new b();
            this.f24636y = bVar;
            bVar.e(j0.o());
            j0.e0(this.f24636y, timeUnit.toMillis(j10));
            return this;
        }

        public void J() {
            E(true);
        }

        public boolean K(float f10, float f11) {
            RectF rectF = this.J;
            return f10 >= rectF.left && f10 < rectF.right && f11 >= rectF.top && f11 < rectF.bottom;
        }

        public boolean L() {
            return this.B && this.f24635x.g() > 0.0f;
        }

        public boolean Q(int i10, int i11) {
            float f10;
            char c10;
            View B = B();
            int i12 = this.H;
            int i13 = this.I;
            boolean z10 = this.G;
            if (B != null) {
                B.getLocationOnScreen(this.f24632u);
                int[] iArr = this.f24632u;
                iArr[0] = iArr[0] - this.f24612a.f24593b[0];
                int[] iArr2 = this.f24632u;
                iArr2[1] = iArr2[1] - this.f24612a.f24593b[1];
            } else {
                int[] iArr3 = this.f24632u;
                iArr3[1] = 0;
                iArr3[0] = 0;
            }
            y.Z().set(this.f24633v);
            RectF a02 = y.a0();
            a02.set(this.J);
            if (B != null) {
                float scaleX = B.getScaleX();
                float scaleY = B.getScaleY();
                float pivotX = B.getPivotX();
                float pivotY = B.getPivotY();
                int measuredWidth = B.getMeasuredWidth();
                int measuredHeight = B.getMeasuredHeight();
                this.f24633v.set(0, 0, measuredWidth, measuredHeight);
                if (scaleX != 1.0f || scaleY != 1.0f) {
                    float f11 = measuredWidth;
                    int i14 = (int) (scaleX * f11);
                    float f12 = measuredHeight;
                    int i15 = (int) (scaleY * f12);
                    int i16 = (int) ((measuredWidth - i14) * (pivotX / f11));
                    int i17 = (int) ((measuredHeight - i15) * (pivotY / f12));
                    if (!ib.c.b(this.f24627p, 64)) {
                        c10 = 0;
                        this.f24633v.set(0, 0, i14, i15);
                        this.f24633v.offset(i16, i17);
                    } else {
                        c10 = 0;
                    }
                    int[] iArr4 = this.f24632u;
                    iArr4[c10] = iArr4[c10] - i16;
                    iArr4[1] = iArr4[1] - i17;
                }
            } else {
                this.f24633v.set(0, 0, 0, 0);
            }
            f fVar = this.f24615d;
            if (fVar != null) {
                fVar.d1(B, this.f24633v);
            } else if (B instanceof f) {
                ((f) B).d1(B, this.f24633v);
            }
            boolean D = D();
            int i18 = a0.i(8.0f);
            int i19 = a0.i(D ? 10.0f : 8.0f);
            int i20 = a0.i(D ? 11.0f : 8.0f);
            int i21 = a0.i(8.0f);
            int i22 = D ? a0.i(24.0f) + a0.i(8.0f) : 0;
            boolean b10 = ib.c.b(this.f24627p, 4);
            int i23 = i21 * 2;
            int min = Math.min(i10 - i23, i11 - i23);
            if (!b10) {
                float f13 = this.f24626o;
                if (f13 > 0.0f) {
                    min = Math.min(a0.i(f13), min);
                }
            }
            boolean d10 = this.f24628q.d(this, i10, i11, ((min - i18) - i19) - i22);
            int i24 = i20 * 2;
            int b11 = this.f24628q.b() + i24 + a0.i(12.0f);
            this.G = (this.f24632u[1] + this.f24633v.top) - b11 < d1.getTopOffset() && (this.f24632u[1] + this.f24633v.bottom) + b11 < i11;
            this.H = this.f24632u[0] + this.f24633v.centerX();
            this.I = this.G ? this.f24632u[1] + this.f24633v.bottom : this.f24632u[1] + this.f24633v.top;
            int i25 = ib.c.b(this.f24627p, 8) ? i21 : a0.i(5.0f);
            int c11 = i19 + i18 + this.f24628q.c() + i22;
            int b12 = this.f24628q.b() + i24;
            if (D) {
                c11 = Math.max(c11, (i18 * 2) + a0.i(24.0f));
                b12 = Math.max(b12, i24 + a0.i(24.0f));
            }
            if (b10) {
                RectF rectF = this.J;
                int i26 = this.H;
                float f14 = min / 2.0f;
                f10 = 0.0f;
                rectF.set(i26 - f14, 0.0f, i26 + f14, b12);
            } else {
                f10 = 0.0f;
                RectF rectF2 = this.J;
                int i27 = this.H;
                float f15 = c11 / 2.0f;
                rectF2.set(i27 - f15, 0.0f, i27 + f15, b12);
            }
            if (this.G) {
                this.J.offset(f10, this.I + i25 + 0);
            } else {
                this.J.offset(f10, ((this.I - i25) - b12) - 0);
            }
            RectF rectF3 = this.J;
            rectF3.offset(Math.max(f10, i21 - rectF3.left), f10);
            RectF rectF4 = this.J;
            rectF4.offset(Math.min(f10, (i10 - i21) - rectF4.right), f10);
            int i28 = (a0.i(10.0f) / 2) + a0.i(6.0f);
            int i29 = this.H;
            RectF rectF5 = this.J;
            float f16 = rectF5.left;
            if (i29 - i28 < f16) {
                rectF5.offset((i29 - i28) - f16, 0.0f);
            } else {
                float f17 = rectF5.right;
                if (i29 + i28 > f17) {
                    rectF5.offset((i29 + i28) - f17, 0.0f);
                }
            }
            g gVar = this.f24617f;
            if (gVar != null) {
                gVar.a(this.J);
            }
            u(B);
            if (!d10 && this.H == i12 && this.I == i13 && this.G == z10 && this.J.equals(a02)) {
                return false;
            }
            v(this.K, this.J);
            return true;
        }

        public boolean R(View view, MotionEvent motionEvent) {
            boolean D = D();
            a0.i(8.0f);
            a0.i(D ? 11.0f : 8.0f);
            if (D) {
                a0.i(24.0f);
                a0.i(8.0f);
            }
            return this.f24628q.e(this, view, motionEvent);
        }

        public final void S(View view, boolean z10) {
            if (this.L == view && this.M != z10) {
                this.M = z10;
                if (z10) {
                    J();
                }
            }
        }

        public l T(m mVar) {
            lb.d<m> dVar = this.f24634w;
            if (dVar != null) {
                dVar.remove(mVar);
            }
            return this;
        }

        public void U() {
            if (Q(this.f24612a.getMeasuredWidth(), this.f24612a.getMeasuredHeight()) && this.f24635x.g() > 0.0f) {
                this.f24612a.invalidate();
            }
        }

        public void V(i iVar, int i10) {
            this.f24628q = iVar;
            this.f24622k = ce.c.f(i10);
            Q(this.f24612a.getMeasuredWidth(), this.f24612a.getMeasuredHeight());
            this.f24612a.invalidate();
        }

        public void W(o6 o6Var, CharSequence charSequence, int i10) {
            V(this.f24612a.k(o6Var, charSequence, 0), i10);
        }

        public final void X(boolean z10, boolean z11) {
            if (this.f24635x.h() != z10) {
                if (!z10 || this.f24635x.g() != 0.0f || ib.c.b(this.f24627p, 8)) {
                    this.f24635x.n(db.b.f7287b);
                    this.f24635x.l(100L);
                } else {
                    this.f24635x.n(db.b.f7291f);
                    this.f24635x.l(210L);
                }
                v4<?> v4Var = this.f24618g;
                if (v4Var != null) {
                    if (z10) {
                        v4Var.k8(this.C);
                        this.f24618g.l8(this.D);
                    } else {
                        v4Var.nd(this.C);
                        this.f24618g.od(this.D);
                    }
                }
                if (z10) {
                    this.E = SystemClock.uptimeMillis();
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis() - this.E;
                    List<kb.l> list = this.F;
                    if (list != null) {
                        for (kb.l lVar : list) {
                            lVar.a(uptimeMillis);
                        }
                    }
                }
            }
            if (z10) {
                t();
            }
            this.f24635x.p(z10, z11);
        }

        public void Y() {
            w();
            x();
            v4<?> v4Var = this.f24618g;
            if (v4Var == null || v4Var.Ta() || this.f24635x.g() > 0.0f) {
                X(true, true);
                return;
            }
            final y0.b bVar = new y0.b();
            this.A = bVar;
            this.f24618g.m8(new Runnable() {
                @Override
                public final void run() {
                    x2.l.this.P(bVar);
                }
            });
        }

        public boolean Z() {
            kb.b bVar;
            return this.f24635x.h() && ((bVar = this.f24636y) == null || !bVar.d());
        }

        public l r(m mVar) {
            if (this.f24634w == null) {
                this.f24634w = new lb.d<>();
            }
            this.f24634w.add(mVar);
            return this;
        }

        public l s(kb.l lVar) {
            if (this.F == null) {
                this.F = new ArrayList();
            }
            this.F.add(lVar);
            return this;
        }

        public final void t() {
            if (!this.B) {
                this.B = true;
                this.f24612a.f(this);
                this.f24628q.f(this.f24629r);
                this.f24629r.b();
                ld.c cVar = this.f24630s;
                if (cVar != null) {
                    cVar.j(this.f24623l, this.f24624m);
                    this.f24630s.e();
                }
                md.m mVar = this.f24631t;
                if (mVar != null) {
                    mVar.r(this.f24625n);
                    this.f24631t.e();
                }
            }
        }

        public final void u(View view) {
            View view2 = this.L;
            if (view2 != view) {
                if (view2 != null) {
                    view2.removeOnLayoutChangeListener(this.N);
                    this.L.removeOnAttachStateChangeListener(this.P);
                    View view3 = this.L;
                    if (view3 instanceof ne.i) {
                        ((ne.i) view3).q0(this.O);
                    }
                }
                this.L = view;
                if (view != null) {
                    this.M = view.isAttachedToWindow();
                    view.addOnLayoutChangeListener(this.N);
                    view.addOnAttachStateChangeListener(this.P);
                    if (view instanceof ne.i) {
                        ((ne.i) view).J(this.O);
                    }
                }
            }
        }

        public final void v(Path path, RectF rectF) {
            int i10 = a0.i(10.0f);
            int i11 = a0.i(6.0f);
            int i12 = a0.i(5.0f);
            path.reset();
            path.setFillType(Path.FillType.EVEN_ODD);
            RectF a02 = y.a0();
            if (ib.c.b(this.f24627p, 8)) {
                float f10 = i11;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            } else if (this.G) {
                float f11 = i11;
                path.moveTo(rectF.left, rectF.top + f11);
                float f12 = rectF.left;
                float f13 = rectF.top;
                float f14 = i11 * 2;
                a02.set(f12, f13, f12 + f14, f13 + f14);
                path.arcTo(a02, -180.0f, 90.0f);
                float f15 = i10 / 2.0f;
                path.lineTo(this.H - f15, rectF.top);
                path.rLineTo(f15, -i12);
                path.rLineTo(f15, i12);
                path.lineTo(rectF.right - f11, rectF.top);
                float f16 = rectF.right;
                float f17 = rectF.top;
                a02.set(f16 - f14, f17, f16, (2.0f * f11) + f17);
                path.arcTo(a02, -90.0f, 90.0f);
                path.lineTo(rectF.right, rectF.bottom - f11);
                float f18 = rectF.right;
                float f19 = rectF.bottom;
                a02.set(f18 - f14, f19 - f14, f18, f19);
                path.arcTo(a02, 0.0f, 90.0f);
                path.lineTo(rectF.left + f14, rectF.bottom);
                float f20 = rectF.left;
                float f21 = rectF.bottom;
                a02.set(f20, f21 - f14, f14 + f20, f21);
                path.arcTo(a02, 90.0f, 90.0f);
                path.lineTo(rectF.left, rectF.top + f11);
            } else {
                float f22 = i11;
                path.moveTo(rectF.left + f22, rectF.bottom);
                float f23 = i10 / 2.0f;
                path.lineTo(this.H - f23, rectF.bottom);
                path.rLineTo(f23, i12);
                path.rLineTo(f23, -i12);
                path.lineTo(rectF.right - f22, rectF.bottom);
                float f24 = rectF.right;
                float f25 = i11 * 2;
                float f26 = rectF.bottom;
                a02.set(f24 - f25, f26 - f25, f24, f26);
                path.arcTo(a02, 90.0f, -90.0f);
                path.lineTo(rectF.right, rectF.top + f22);
                float f27 = rectF.right;
                float f28 = rectF.top;
                a02.set(f27 - f25, f28, f27, f28 + f25);
                path.arcTo(a02, 0.0f, -90.0f);
                path.lineTo(rectF.left + f22, rectF.top);
                float f29 = rectF.left;
                float f30 = rectF.top;
                a02.set(f29, f30, f29 + f25, f30 + f25);
                path.arcTo(a02, -90.0f, -90.0f);
                path.lineTo(rectF.left, rectF.bottom - f22);
                float f31 = rectF.left;
                float f32 = rectF.bottom;
                a02.set(f31, f32 - f25, f25 + f31, f32);
                path.arcTo(a02, -180.0f, -90.0f);
            }
            path.close();
        }

        public final void w() {
            this.f24637z = false;
            kb.b bVar = this.f24636y;
            if (bVar != null) {
                bVar.c();
                this.f24636y = null;
            }
        }

        public final void x() {
            y0.b bVar = this.A;
            if (bVar != null) {
                bVar.a();
                this.A = null;
            }
        }

        public void y() {
            w();
            z();
            X(false, false);
            this.f24629r.Q2();
            ld.c cVar = this.f24630s;
            if (cVar != null) {
                cVar.b0();
            }
            md.m mVar = this.f24631t;
            if (mVar != null) {
                mVar.b0();
            }
        }

        public final void z() {
            if (this.B) {
                this.B = false;
                this.f24612a.n(this);
                this.f24629r.i();
                ld.c cVar = this.f24630s;
                if (cVar != null) {
                    cVar.b();
                }
                md.m mVar = this.f24631t;
                if (mVar != null) {
                    mVar.b();
                }
            }
        }
    }

    public interface m {
        void b(l lVar, boolean z10);

        void l(l lVar, float f10);
    }

    public x2(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.M = paint;
        paint.setStyle(Paint.Style.FILL);
        setWillNotDraw(true);
    }

    public final void f(l lVar) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            l lVar2 = this.N.get(size);
            if (lVar2.f24636y != null) {
                lVar2.J();
            }
        }
        getLocationOnScreen(this.f24593b);
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            lVar.Q(getMeasuredWidth(), getMeasuredHeight());
        }
        this.N.add(lVar);
        if (this.N.size() == 1) {
            setWillNotDraw(false);
            addOnAttachStateChangeListener(new c(lVar));
            d dVar = this.f24592a;
            if (dVar != null) {
                dVar.a(this, true);
                return;
            }
            return;
        }
        lVar.Y();
    }

    public h g(View view) {
        return new h().a(view);
    }

    public h h(View view, gb.j jVar) {
        return new h().b(view, jVar);
    }

    public h i(gb.j jVar) {
        return new h().c(jVar);
    }

    public void j(boolean z10) {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            this.N.get(size).E(z10);
        }
    }

    public i k(o6 o6Var, CharSequence charSequence, int i10) {
        return new j(o6Var, new TdApi.FormattedText(charSequence.toString(), t2.x5(charSequence, false)), i10, null);
    }

    public boolean l() {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            l lVar = this.N.get(size);
            boolean Z = lVar.Z();
            lVar.E(true);
            if (Z || ib.c.b(lVar.f24627p, 32)) {
                return true;
            }
        }
        return false;
    }

    public e m(p pVar) {
        if (pVar == null) {
            return null;
        }
        return new b(pVar);
    }

    public final void n(l lVar) {
        if (this.N.remove(lVar) && this.N.isEmpty()) {
            setWillNotDraw(true);
            d dVar = this.f24592a;
            if (dVar != null) {
                dVar.a(this, false);
            }
        }
    }

    public void o() {
        boolean z10;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            loop0: while (true) {
                z10 = false;
                for (l lVar : this.N) {
                    if (lVar.Q(measuredWidth, measuredHeight) || z10) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                invalidate();
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLocationOnScreen(this.f24593b);
    }

    @Override
    public void onDraw(Canvas canvas) {
        for (l lVar : this.N) {
            lVar.A(canvas);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        o();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = false;
        if (action == 0) {
            this.O = null;
            this.P = false;
            for (int size = this.N.size() - 1; size >= 0; size--) {
                l lVar = this.N.get(size);
                if (this.O == null && lVar.R(this, motionEvent)) {
                    this.O = this.N.get(size);
                } else if (ib.c.b(lVar.f24627p, 1) && lVar.K(motionEvent.getX(), motionEvent.getY())) {
                    this.P = true;
                } else if (!ib.c.b(lVar.f24627p, 2)) {
                    lVar.E(lVar.f24637z);
                }
            }
            return this.O != null || this.P;
        } else if (action != 3) {
            l lVar2 = this.O;
            return (lVar2 != null && lVar2.R(this, motionEvent)) || this.P;
        } else {
            l lVar3 = this.O;
            if (lVar3 != null && lVar3.R(this, motionEvent)) {
                z10 = true;
            }
            j(true);
            return z10;
        }
    }

    public void setAvailabilityListener(d dVar) {
        this.f24592a = dVar;
    }

    public static class h implements Cloneable {
        public f M;
        public e N;
        public g O;
        public g.c P;
        public v4<?> Q;
        public float R;
        public boolean S;
        public int T;
        public int U;
        public ld.h V;
        public ld.h W;
        public md.j X;
        public float Y;
        public hj.q Z;
        public final x2 f24600a;
        public List<kb.j<l>> f24601a0;
        public View f24602b;
        public gb.j f24603c;

        public class a implements e {
            public a() {
            }

            @Override
            public int A0() {
                return y2.g(this);
            }

            @Override
            public int I() {
                return y2.c(this);
            }

            @Override
            public int M0() {
                return je.m.m(this);
            }

            @Override
            public int O0() {
                return y2.d(this);
            }

            @Override
            public int R() {
                return je.j.d(this);
            }

            @Override
            public long W0(boolean z10) {
                return je.j.c(this, z10);
            }

            @Override
            public int X0() {
                return je.m.i(this);
            }

            @Override
            public int a1() {
                return je.m.h(this);
            }

            @Override
            public int c() {
                return je.m.f(this);
            }

            @Override
            public int d(boolean z10) {
                return je.m.b(this, z10);
            }

            @Override
            public int g(boolean z10) {
                return je.m.k(this, z10);
            }

            @Override
            public p g1() {
                return je.m.e(this);
            }

            @Override
            public int i1() {
                return y2.e(this);
            }

            @Override
            public int k() {
                return y2.f(this);
            }

            @Override
            public int o0(boolean z10) {
                return je.m.c(this, z10);
            }

            @Override
            public int r(boolean z10) {
                return y2.a(this, z10);
            }

            @Override
            public int r0(boolean z10) {
                return je.m.a(this, z10);
            }

            @Override
            public int t() {
                return y2.b(this);
            }

            @Override
            public int t0(boolean z10) {
                return je.m.j(this, z10);
            }

            @Override
            public p z() {
                return je.m.g(this);
            }
        }

        public h(x2 x2Var) {
            this.R = 13.0f;
            this.S = true;
            this.Y = 320.0f;
            this.f24600a = x2Var;
        }

        public l A(x0 x0Var) {
            return B(new k(this.f24600a, x0Var));
        }

        public l B(i iVar) {
            l lVar = new l(this.f24602b, this.f24603c, this.M, this.N, this.O, this.Q, this.P, this.R, this.S, this.U, this.V, this.W, this.X, this.Y, this.T, iVar);
            List<kb.j<l>> list = this.f24601a0;
            if (list != null) {
                for (kb.j<l> jVar : list) {
                    jVar.a(lVar);
                }
            }
            lVar.t();
            return lVar;
        }

        public l C(o6 o6Var, int i10) {
            return E(o6Var, new TdApi.FormattedText(w.i1(i10), null));
        }

        public l D(o6 o6Var, CharSequence charSequence) {
            return E(o6Var, new TdApi.FormattedText(charSequence.toString(), t2.x5(charSequence, false)));
        }

        public l E(o6 o6Var, TdApi.FormattedText formattedText) {
            return B(new j(o6Var, formattedText, 0, this.Z));
        }

        public void F(v4<?> v4Var, o6 o6Var, int i10, CharSequence charSequence) {
            boolean z10 = false;
            if (this.f24602b == null && this.f24603c == null && this.M == null) {
                j0.z0(charSequence, 0);
                return;
            }
            h q10 = q(i10);
            if (i10 == R.drawable.baseline_info_24 || i10 == R.drawable.baseline_error_24) {
                z10 = true;
            }
            q10.v(z10).i(v4Var != null ? v4Var.Z9() : null).D(o6Var, charSequence).G(3500L, TimeUnit.MILLISECONDS);
        }

        public h G(hj.q qVar) {
            this.Z = qVar;
            return this;
        }

        public h H(float f10, boolean z10) {
            this.R = Math.max(13.0f, f10);
            this.S = z10;
            return this;
        }

        public h a(View view) {
            this.f24602b = view;
            return this;
        }

        public h b(View view, gb.j jVar) {
            this.f24602b = view;
            this.f24603c = jVar;
            return this;
        }

        public h c(gb.j jVar) {
            this.f24603c = jVar;
            return this;
        }

        public h d() {
            return e(-1.0f);
        }

        public h e(float f10) {
            return H(he.i.c2().t0() + f10, he.i.c2().A2());
        }

        public h f(g.c cVar) {
            this.P = cVar;
            return this;
        }

        public h g(e eVar) {
            this.N = eVar;
            return this;
        }

        public e h() {
            e eVar = this.N;
            return eVar != null ? eVar : new a();
        }

        public h i(v4<?> v4Var) {
            this.Q = v4Var;
            return this;
        }

        public h j(boolean z10) {
            return k(4, z10);
        }

        public h k(int i10, boolean z10) {
            this.T = ib.c.h(this.T, i10, z10);
            return this;
        }

        public h l(md.j jVar, ld.h hVar) {
            this.X = jVar;
            this.V = hVar;
            return this;
        }

        public h n(boolean z10) {
            return k(32, z10);
        }

        public boolean o() {
            return this.Q != null;
        }

        public boolean p() {
            gb.j jVar = this.f24603c;
            if (jVar != null) {
                View f10 = jVar.f();
                return f10 != null && v.J(f10);
            }
            v4<?> v4Var = this.Q;
            if (v4Var != null) {
                return v4Var.Ta();
            }
            View view = this.f24602b;
            if (view != null) {
                return v.J(view);
            }
            return false;
        }

        public h q(int i10) {
            this.U = i10;
            return this;
        }

        public h r(boolean z10) {
            return k(64, z10);
        }

        public h t(boolean z10) {
            return k(1, z10);
        }

        public h u(f fVar) {
            this.M = fVar;
            return this;
        }

        public h v(boolean z10) {
            return k(16, z10);
        }

        public h w(boolean z10) {
            return k(8, z10);
        }

        public h x(g gVar) {
            this.O = gVar;
            return this;
        }

        public h y(kb.j<l> jVar) {
            if (this.f24601a0 == null) {
                this.f24601a0 = new ArrayList();
            }
            this.f24601a0.add(jVar);
            return this;
        }

        public h z(boolean z10) {
            return k(2, z10);
        }

        public h(h hVar) {
            this.R = 13.0f;
            this.S = true;
            this.Y = 320.0f;
            this.f24600a = hVar.f24600a;
            this.f24602b = hVar.f24602b;
            this.f24603c = hVar.f24603c;
            this.M = hVar.M;
            this.N = hVar.N;
            this.O = hVar.O;
            this.P = hVar.P;
            this.Q = hVar.Q;
            this.R = hVar.R;
            this.S = hVar.S;
            this.T = hVar.T;
            this.U = hVar.U;
            this.V = hVar.V;
            this.W = hVar.W;
            this.X = hVar.X;
            this.Y = hVar.Y;
            this.Z = hVar.Z;
            this.f24601a0 = hVar.f24601a0 != null ? new ArrayList(hVar.f24601a0) : null;
        }
    }
}
