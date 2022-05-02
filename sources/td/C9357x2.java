package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1410y;
import gd.C4779t2;
import ge.C4868i;
import ie.AbstractC5414n;
import ie.C5406j;
import ie.C5412m;
import ie.C5459x0;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.View$OnClickListenerC6902i;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p028c1.C1489y;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p080fb.AbstractC4345j;
import p080fb.C4343h;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5069h;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5920l;
import p139jb.AbstractRunnableC5910b;
import p154kb.C6227d;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6246h;
import p168ld.C6503j;
import p168ld.RunnableC6507m;
import p337y0.C10327b;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import td.AbstractC9323v4;
import td.C9357x2;

public class C9357x2 extends ViewGroup {
    public final Paint f30320M;
    public C9370l f30322O;
    public boolean f30323P;
    public AbstractC9361d f30324a;
    public final int[] f30325b = new int[2];
    public final AbstractC9362e f30326c = new C9358a();
    public final List<C9370l> f30321N = new ArrayList();

    public class C9358a implements AbstractC9362e {
        public C9358a() {
        }

        @Override
        public int mo8942A0() {
            return C9383y2.m8810g(this);
        }

        @Override
        public int mo8941I() {
            return C9383y2.m8814c(this);
        }

        @Override
        public int mo8940N0() {
            return C5412m.m22768m(this);
        }

        @Override
        public int mo8939P0() {
            return C9383y2.m8813d(this);
        }

        @Override
        public int mo7858Q() {
            return C5406j.m22807d(this);
        }

        @Override
        public long mo7857X0(boolean z) {
            return C5406j.m22808c(this, z);
        }

        @Override
        public int mo8938Z0() {
            return C5412m.m22772i(this);
        }

        @Override
        public int mo7856b1() {
            return C5412m.m22773h(this);
        }

        @Override
        public int mo7855c() {
            return C5412m.m22775f(this);
        }

        @Override
        public int mo7854e(boolean z) {
            return C5412m.m22779b(this, z);
        }

        @Override
        public int mo7853g(boolean z) {
            return C5412m.m22770k(this, z);
        }

        @Override
        public AbstractC11531p mo8937j1() {
            return C5412m.m22776e(this);
        }

        @Override
        public int mo8936k() {
            return C9383y2.m8811f(this);
        }

        @Override
        public int mo8935l1() {
            return C9383y2.m8812e(this);
        }

        @Override
        public int mo7852o0(boolean z) {
            return C5412m.m22778c(this, z);
        }

        @Override
        public int mo7851p0(boolean z) {
            return C5412m.m22780a(this, z);
        }

        @Override
        public int mo8934r(boolean z) {
            return C9383y2.m8816a(this, z);
        }

        @Override
        public int mo7850r0(boolean z) {
            return C5412m.m22771j(this, z);
        }

        @Override
        public int mo8933w() {
            return C9383y2.m8815b(this);
        }

        @Override
        public AbstractC11531p mo8932z() {
            return C5412m.m22774g(this);
        }
    }

    public class C9359b implements AbstractC9362e {
        public final AbstractC11531p f30328a;

        public C9359b(AbstractC11531p pVar) {
            this.f30328a = pVar;
        }

        @Override
        public int mo8942A0() {
            return C9383y2.m8810g(this);
        }

        @Override
        public int mo8941I() {
            return C9383y2.m8814c(this);
        }

        @Override
        public int mo8940N0() {
            return C5412m.m22768m(this);
        }

        @Override
        public int mo8939P0() {
            return C9383y2.m8813d(this);
        }

        @Override
        public int mo7858Q() {
            return C5406j.m22807d(this);
        }

        @Override
        public long mo7857X0(boolean z) {
            return C5406j.m22808c(this, z);
        }

        @Override
        public int mo8938Z0() {
            return C5412m.m22772i(this);
        }

        @Override
        public int mo7856b1() {
            return C5412m.m22773h(this);
        }

        @Override
        public int mo7855c() {
            return C5412m.m22775f(this);
        }

        @Override
        public int mo7854e(boolean z) {
            return C5412m.m22779b(this, z);
        }

        @Override
        public int mo7853g(boolean z) {
            return C5412m.m22770k(this, z);
        }

        @Override
        public AbstractC11531p mo8937j1() {
            return C5412m.m22776e(this);
        }

        @Override
        public int mo8936k() {
            return C9383y2.m8811f(this);
        }

        @Override
        public int mo8935l1() {
            return C9383y2.m8812e(this);
        }

        @Override
        public int mo7852o0(boolean z) {
            return C5412m.m22778c(this, z);
        }

        @Override
        public int mo7851p0(boolean z) {
            return C5412m.m22780a(this, z);
        }

        @Override
        public int mo8934r(boolean z) {
            return C9383y2.m8816a(this, z);
        }

        @Override
        public int mo7850r0(boolean z) {
            return C5412m.m22771j(this, z);
        }

        @Override
        public int mo8933w() {
            return C9383y2.m8815b(this);
        }

        @Override
        public AbstractC11531p mo8932z() {
            return this.f30328a;
        }
    }

    public class View$OnAttachStateChangeListenerC9360c implements View.OnAttachStateChangeListener {
        public final C9370l f30330a;

        public View$OnAttachStateChangeListenerC9360c(C9370l lVar) {
            this.f30330a = lVar;
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            this.f30330a.m8900Y();
            C9357x2.this.removeOnAttachStateChangeListener(this);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface AbstractC9361d {
        void mo8976a(C9357x2 x2Var, boolean z);
    }

    public interface AbstractC9362e extends AbstractC5414n {
        int mo8942A0();

        int mo8939P0();

        int mo8936k();

        int mo8935l1();
    }

    public interface AbstractC9363f {
        void mo8098f1(View view, Rect rect);
    }

    public interface AbstractC9364g {
        void mo8975a(RectF rectF);
    }

    public static abstract class AbstractC9367i {
        public final C9357x2 f30351a;

        public AbstractC9367i(C9357x2 x2Var) {
            this.f30351a = x2Var;
        }

        public abstract void mo8930a(Canvas canvas, AbstractC9362e eVar, int i, int i2, int i3, int i4, float f, C6238b bVar);

        public abstract int mo8929b();

        public abstract int mo8928c();

        public abstract boolean mo8927d(C9370l lVar, int i, int i2, int i3);

        public abstract boolean mo8926e(C9370l lVar, View view, MotionEvent motionEvent);

        public abstract void mo8925f(C6238b bVar);
    }

    public static class C9368j extends AbstractC9367i {
        public final C10930q6 f30352b;
        public final TdApi.FormattedText f30353c;
        public final HandlerC10770jj.C10788q f30354d;
        public final int f30355e;
        public RunnableC5390g f30356f;

        public C9368j(C9357x2 x2Var, C10930q6 q6Var, TdApi.FormattedText formattedText, int i, HandlerC10770jj.C10788q qVar) {
            super(x2Var);
            this.f30352b = q6Var;
            this.f30353c = formattedText;
            this.f30355e = i;
            this.f30354d = qVar;
        }

        @Override
        public void mo8930a(Canvas canvas, AbstractC9362e eVar, int i, int i2, int i3, int i4, float f, C6238b bVar) {
            RunnableC5390g gVar = this.f30356f;
            if (gVar != null) {
                gVar.m22897w(canvas, i, i3, 0, i2, null, f, bVar);
            }
        }

        @Override
        public int mo8929b() {
            RunnableC5390g gVar = this.f30356f;
            if (gVar != null) {
                return gVar.getHeight();
            }
            return 0;
        }

        @Override
        public int mo8928c() {
            RunnableC5390g gVar = this.f30356f;
            if (gVar != null) {
                return gVar.getWidth();
            }
            return 0;
        }

        @Override
        public boolean mo8927d(C9370l lVar, int i, int i2, int i3) {
            RunnableC5390g gVar = this.f30356f;
            if (gVar != null && gVar.m22936h0() == i3) {
                return false;
            }
            this.f30356f = new RunnableC5390g.C5392b(this.f30352b, this.f30353c, this.f30354d, i3, C1410y.m37083A0(lVar.f30381h).m22656l(lVar.f30382i), lVar.f30378e).m22865y(this.f30355e | 8).m22864z(new C4343h(this.f30351a)).m22884f();
            return true;
        }

        @Override
        public boolean mo8926e(C9370l lVar, View view, MotionEvent motionEvent) {
            return this.f30356f.m22965V0(view, motionEvent, lVar.f30383j);
        }

        @Override
        public void mo8925f(C6238b bVar) {
            bVar.m20999d();
        }
    }

    public static class C9369k extends AbstractC9367i {
        public final C5459x0 f30357b;

        public C9369k(C9357x2 x2Var, C5459x0 x0Var) {
            super(x2Var);
            this.f30357b = x0Var;
            x0Var.m22636H(new C4343h(x2Var));
        }

        @Override
        public void mo8930a(Canvas canvas, AbstractC9362e eVar, int i, int i2, int i3, int i4, float f, C6238b bVar) {
            this.f30357b.m22629i(canvas, i, i3, 0, i2, null, f, bVar);
        }

        @Override
        public int mo8929b() {
            return this.f30357b.getHeight();
        }

        @Override
        public int mo8928c() {
            return this.f30357b.getWidth();
        }

        @Override
        public boolean mo8927d(C9370l lVar, int i, int i2, int i3) {
            this.f30357b.m22642B(i3);
            return true;
        }

        @Override
        public boolean mo8926e(C9370l lVar, View view, MotionEvent motionEvent) {
            return this.f30357b.m22613y(view, motionEvent, lVar.f30383j);
        }

        @Override
        public void mo8925f(C6238b bVar) {
            this.f30357b.m22641C(bVar);
        }
    }

    public static class C9370l {
        public C10327b f30358A;
        public boolean f30359B;
        public final AbstractC5911c f30360C;
        public final AbstractC9323v4.AbstractC9335l f30361D;
        public long f30362E;
        public List<AbstractC5920l> f30363F;
        public boolean f30364G;
        public int f30365H;
        public int f30366I;
        public final RectF f30367J;
        public final Path f30368K;
        public View f30369L;
        public boolean f30370M;
        public final View.OnLayoutChangeListener f30371N;
        public final View$OnClickListenerC6902i.AbstractC6909g f30372O;
        public final View.OnAttachStateChangeListener f30373P;
        public final C9357x2 f30374a;
        public final View f30375b;
        public final AbstractC4345j f30376c;
        public final AbstractC9363f f30377d;
        public final AbstractC9362e f30378e;
        public final AbstractC9364g f30379f;
        public final AbstractC9323v4<?> f30380g;
        public final float f30381h;
        public final boolean f30382i;
        public final RunnableC5390g.AbstractC5393c f30383j;
        public Drawable f30384k;
        public final C6246h f30385l;
        public final C6246h f30386m;
        public final C6503j f30387n;
        public final float f30388o;
        public final int f30389p;
        public AbstractC9367i f30390q;
        public final C6238b f30391r;
        public final C6240c f30392s;
        public final RunnableC6507m f30393t;
        public final int[] f30394u;
        public final Rect f30395v;
        public C6227d<AbstractC9374m> f30396w;
        public final C3940f f30397x;
        public AbstractRunnableC5910b f30398y;
        public boolean f30399z;

        public class C9371a implements C3950k.AbstractC3952b {
            public C9371a() {
            }

            @Override
            public void mo45P5(int i, float f, float f2, C3950k kVar) {
                if (C9370l.this.f30396w != null) {
                    Iterator it = C9370l.this.f30396w.iterator();
                    while (it.hasNext()) {
                        ((AbstractC9374m) it.next()).mo8872i(C9370l.this, f);
                    }
                }
                if (C9370l.this.f30359B) {
                    C9370l.this.f30374a.invalidate();
                }
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                if (C9370l.this.f30396w != null) {
                    Iterator it = C9370l.this.f30396w.iterator();
                    while (it.hasNext()) {
                        ((AbstractC9374m) it.next()).mo8871l(C9370l.this, f > 0.0f);
                    }
                }
                if (f == 0.0f) {
                    C9370l.this.m8873z();
                }
            }
        }

        public class C9372b extends AbstractRunnableC5910b {
            public C9372b() {
            }

            @Override
            public void mo1364b() {
                C9370l.this.m8920E(true);
            }
        }

        public class View$OnAttachStateChangeListenerC9373c implements View.OnAttachStateChangeListener {
            public View$OnAttachStateChangeListenerC9373c() {
            }

            @Override
            public void onViewAttachedToWindow(View view) {
                C9370l.this.m8906S(view, true);
            }

            @Override
            public void onViewDetachedFromWindow(View view) {
                C9370l.this.m8906S(view, false);
            }
        }

        public C9370l(C9357x2 x2Var, View view, AbstractC4345j jVar, AbstractC9363f fVar, AbstractC9362e eVar, AbstractC9364g gVar, AbstractC9323v4<?> v4Var, RunnableC5390g.AbstractC5393c cVar, float f, boolean z, int i, C6246h hVar, C6246h hVar2, C6503j jVar2, float f2, int i2, AbstractC9367i iVar) {
            this.f30394u = new int[2];
            this.f30395v = new Rect();
            this.f30397x = new C3940f(0, new C9371a(), C2057b.f7284f, 210L);
            this.f30360C = new AbstractC5911c() {
                @Override
                public final void mo4501a3() {
                    C9357x2.C9370l.this.m8915J();
                }
            };
            this.f30361D = new AbstractC9323v4.AbstractC9335l() {
                @Override
                public final void mo3383a(AbstractC9323v4 v4Var2, boolean z2) {
                    C9357x2.C9370l.this.m8912M(v4Var2, z2);
                }
            };
            this.f30367J = new RectF();
            this.f30368K = new Path();
            this.f30371N = new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    C9357x2.C9370l.this.m8911N(view2, i3, i4, i5, i6, i7, i8, i9, i10);
                }
            };
            this.f30372O = new View$OnClickListenerC6902i.AbstractC6909g() {
                @Override
                public final void mo10015a(View$OnClickListenerC6902i iVar2, float f3, float f4) {
                    C9357x2.C9370l.this.m8910O(iVar2, f3, f4);
                }
            };
            this.f30373P = new View$OnAttachStateChangeListenerC9373c();
            this.f30374a = x2Var;
            this.f30375b = view;
            this.f30376c = jVar;
            this.f30377d = fVar;
            this.f30378e = eVar != null ? eVar : x2Var.f30326c;
            this.f30379f = gVar;
            this.f30380g = v4Var;
            this.f30381h = f;
            this.f30382i = z;
            this.f30383j = cVar;
            this.f30384k = C1362c.m37483f(i);
            this.f30385l = hVar;
            this.f30386m = hVar2;
            this.f30387n = jVar2;
            RunnableC6507m mVar = null;
            this.f30392s = (hVar == null && hVar2 == null) ? null : new C6240c(x2Var, 0);
            this.f30393t = jVar2 != null ? new RunnableC6507m(x2Var) : mVar;
            this.f30391r = new C6238b(x2Var);
            this.f30388o = f2;
            this.f30389p = i2;
            this.f30390q = iVar;
        }

        public void m8912M(AbstractC9323v4 v4Var, boolean z) {
            if (!z) {
                m8915J();
            }
        }

        public void m8911N(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (view.getVisibility() == 8) {
                m8915J();
            } else {
                m8904U();
            }
        }

        public void m8910O(View$OnClickListenerC6902i iVar, float f, float f2) {
            m8904U();
        }

        public void m8909P(C10327b bVar) {
            if (!bVar.m5416b()) {
                m8901X(true, true);
                if (this.f30358A == bVar) {
                    this.f30358A = null;
                }
            }
        }

        public void m8924A(Canvas canvas) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            RunnableC6507m mVar;
            float g = this.f30397x.m29584g();
            float d = C5069h.m24089d(g);
            float f = (g * 0.2f) + 0.8f;
            Rect Z = C1410y.m37052Z();
            int c = this.f30365H - (this.f30390q.mo8928c() / 2);
            Z.left = c;
            Z.right = c + this.f30390q.mo8928c();
            int i10 = 0;
            boolean z = f != 1.0f;
            if (z) {
                int save = canvas.save();
                if (C5063c.m24144b(this.f30389p, 8)) {
                    canvas.scale(f, f, this.f30367J.centerX(), this.f30367J.centerY());
                } else {
                    canvas.scale(f, f, this.f30365H, this.f30366I);
                }
                i = save;
            } else {
                i = -1;
            }
            int a = C5064d.m24131a(d, this.f30378e.mo8936k());
            if (Color.alpha(a) > 0) {
                this.f30374a.f30320M.setStyle(Paint.Style.STROKE);
                this.f30374a.f30320M.setStrokeWidth(C1357a0.m37541i(2.0f));
                this.f30374a.f30320M.setColor(a);
                canvas.drawPath(this.f30368K, this.f30374a.f30320M);
                this.f30374a.f30320M.setStyle(Paint.Style.FILL);
            }
            this.f30374a.f30320M.setColor(C5064d.m24131a(d, this.f30378e.mo8939P0()));
            canvas.drawPath(this.f30368K, this.f30374a.f30320M);
            if (m8921D()) {
                int i11 = C1357a0.m37541i(8.0f);
                int i12 = C1357a0.m37541i(10.0f);
                int i13 = C1357a0.m37541i(11.0f);
                i10 = C1357a0.m37541i(24.0f) + C1357a0.m37541i(8.0f);
                int max = Math.max(0, (C1357a0.m37541i(24.0f) / 2) - (this.f30390q.mo8929b() / 2));
                int i14 = C1357a0.m37541i(24.0f);
                RectF rectF = this.f30367J;
                int i15 = (int) (rectF.left + i11);
                int i16 = (int) (rectF.top + i13);
                int i17 = i14 / 2;
                int i18 = i15 + i17;
                int i19 = i17 + i16;
                int min = i14 + (Math.min(i11, C1357a0.m37541i(8.0f)) / 2);
                if (this.f30392s == null || ((mVar = this.f30393t) != null && !mVar.mo20246c0())) {
                    i9 = i11;
                    i8 = max;
                    i7 = i12;
                    i6 = i13;
                } else {
                    int i20 = min / 2;
                    i9 = i11;
                    i8 = max;
                    i7 = i12;
                    i6 = i13;
                    this.f30392s.mo20256K0(i18 - i20, i19 - i20, i18 + i20, i19 + i20);
                    this.f30392s.mo20250U(d);
                    this.f30392s.draw(canvas);
                    this.f30392s.mo20253P();
                }
                RunnableC6507m mVar2 = this.f30393t;
                if (mVar2 != null) {
                    int i21 = min / 2;
                    mVar2.mo20256K0(i18 - i21, i19 - i21, i18 + i21, i19 + i21);
                    this.f30393t.setAlpha(d);
                    this.f30393t.draw(canvas);
                }
                Drawable drawable = this.f30384k;
                if (drawable != null) {
                    C1362c.m37487b(canvas, drawable, i15, i16, C1410y.m37055W(C5064d.m24131a(d, this.f30378e.mo7855c())));
                }
                C5063c.m24144b(this.f30389p, 16);
                i5 = i9;
                i4 = i8;
                i3 = i7;
                i2 = i6;
            } else {
                i5 = C1357a0.m37541i(8.0f);
                i3 = C1357a0.m37541i(8.0f);
                i2 = C1357a0.m37541i(8.0f);
                i4 = 0;
            }
            AbstractC9367i iVar = this.f30390q;
            AbstractC9362e eVar = this.f30378e;
            RectF rectF2 = this.f30367J;
            float f2 = i2;
            iVar.mo8930a(canvas, eVar, (int) (rectF2.left + i5 + i10), (int) (rectF2.top + f2 + i4), (int) (rectF2.right - i3), (int) (rectF2.bottom - f2), d, this.f30391r);
            if (z) {
                canvas.restoreToCount(i);
            }
        }

        public final View m8923B() {
            AbstractC4345j jVar = this.f30376c;
            if (jVar != null) {
                View view = this.f30375b;
                if (view != null && jVar.mo28229c(view)) {
                    return this.f30375b;
                }
                View f = this.f30376c.mo28226f();
                if (f != null) {
                    return f;
                }
            }
            return this.f30375b;
        }

        public String m8922C() {
            AbstractC9367i iVar = this.f30390q;
            if (iVar instanceof C9368j) {
                return ((C9368j) iVar).f30353c.text;
            }
            return null;
        }

        public final boolean m8921D() {
            return (this.f30384k == null && this.f30385l == null && this.f30386m == null && this.f30387n == null) ? false : true;
        }

        public void m8920E(boolean z) {
            m8875x();
            if (z || this.f30398y == null) {
                m8876w();
                m8901X(false, true);
                return;
            }
            this.f30399z = true;
        }

        public C9370l m8919F() {
            return m8917H(true);
        }

        public C9370l m8918G(long j, TimeUnit timeUnit) {
            return m8916I(true, j, timeUnit);
        }

        public C9370l m8917H(boolean z) {
            return m8916I(z, 2500L, TimeUnit.MILLISECONDS);
        }

        public C9370l m8916I(boolean z, long j, TimeUnit timeUnit) {
            m8876w();
            this.f30399z = z;
            C9372b bVar = new C9372b();
            this.f30398y = bVar;
            bVar.m21855e(C1379j0.m37313o());
            C1379j0.m37332e0(this.f30398y, timeUnit.toMillis(j));
            return this;
        }

        public void m8915J() {
            m8920E(true);
        }

        public boolean m8914K(float f, float f2) {
            RectF rectF = this.f30367J;
            return f >= rectF.left && f < rectF.right && f2 >= rectF.top && f2 < rectF.bottom;
        }

        public boolean m8913L() {
            return this.f30359B && this.f30397x.m29584g() > 0.0f;
        }

        public boolean m8908Q(int i, int i2) {
            float f;
            char c;
            View B = m8923B();
            int i3 = this.f30365H;
            int i4 = this.f30366I;
            boolean z = this.f30364G;
            if (B != null) {
                B.getLocationOnScreen(this.f30394u);
                int[] iArr = this.f30394u;
                iArr[0] = iArr[0] - this.f30374a.f30325b[0];
                int[] iArr2 = this.f30394u;
                iArr2[1] = iArr2[1] - this.f30374a.f30325b[1];
            } else {
                int[] iArr3 = this.f30394u;
                iArr3[1] = 0;
                iArr3[0] = 0;
            }
            C1410y.m37052Z().set(this.f30395v);
            RectF a0 = C1410y.m37050a0();
            a0.set(this.f30367J);
            if (B != null) {
                float scaleX = B.getScaleX();
                float scaleY = B.getScaleY();
                float pivotX = B.getPivotX();
                float pivotY = B.getPivotY();
                int measuredWidth = B.getMeasuredWidth();
                int measuredHeight = B.getMeasuredHeight();
                this.f30395v.set(0, 0, measuredWidth, measuredHeight);
                if (scaleX != 1.0f || scaleY != 1.0f) {
                    float f2 = measuredWidth;
                    int i5 = (int) (scaleX * f2);
                    float f3 = measuredHeight;
                    int i6 = (int) (scaleY * f3);
                    int i7 = (int) ((measuredWidth - i5) * (pivotX / f2));
                    int i8 = (int) ((measuredHeight - i6) * (pivotY / f3));
                    if (!C5063c.m24144b(this.f30389p, 64)) {
                        c = 0;
                        this.f30395v.set(0, 0, i5, i6);
                        this.f30395v.offset(i7, i8);
                    } else {
                        c = 0;
                    }
                    int[] iArr4 = this.f30394u;
                    iArr4[c] = iArr4[c] - i7;
                    iArr4[1] = iArr4[1] - i8;
                }
            } else {
                this.f30395v.set(0, 0, 0, 0);
            }
            AbstractC9363f fVar = this.f30377d;
            if (fVar != null) {
                fVar.mo8098f1(B, this.f30395v);
            } else if (B instanceof AbstractC9363f) {
                ((AbstractC9363f) B).mo8098f1(B, this.f30395v);
            }
            boolean D = m8921D();
            int i9 = C1357a0.m37541i(8.0f);
            int i10 = C1357a0.m37541i(D ? 10.0f : 8.0f);
            int i11 = C1357a0.m37541i(D ? 11.0f : 8.0f);
            int i12 = C1357a0.m37541i(8.0f);
            int i13 = D ? C1357a0.m37541i(24.0f) + C1357a0.m37541i(8.0f) : 0;
            boolean b = C5063c.m24144b(this.f30389p, 4);
            int i14 = i12 * 2;
            int min = Math.min(i - i14, i2 - i14);
            if (!b) {
                float f4 = this.f30388o;
                if (f4 > 0.0f) {
                    min = Math.min(C1357a0.m37541i(f4), min);
                }
            }
            boolean d = this.f30390q.mo8927d(this, i, i2, ((min - i9) - i10) - i13);
            int i15 = i11 * 2;
            int b2 = this.f30390q.mo8929b() + i15 + C1357a0.m37541i(12.0f);
            this.f30364G = (this.f30394u[1] + this.f30395v.top) - b2 < View$OnClickListenerC9170d1.getTopOffset() && (this.f30394u[1] + this.f30395v.bottom) + b2 < i2;
            this.f30365H = this.f30394u[0] + this.f30395v.centerX();
            this.f30366I = this.f30364G ? this.f30394u[1] + this.f30395v.bottom : this.f30394u[1] + this.f30395v.top;
            int i16 = C5063c.m24144b(this.f30389p, 8) ? i12 : C1357a0.m37541i(5.0f);
            int c2 = i10 + i9 + this.f30390q.mo8928c() + i13;
            int b3 = this.f30390q.mo8929b() + i15;
            if (D) {
                c2 = Math.max(c2, (i9 * 2) + C1357a0.m37541i(24.0f));
                b3 = Math.max(b3, i15 + C1357a0.m37541i(24.0f));
            }
            if (b) {
                RectF rectF = this.f30367J;
                int i17 = this.f30365H;
                float f5 = min / 2.0f;
                f = 0.0f;
                rectF.set(i17 - f5, 0.0f, i17 + f5, b3);
            } else {
                f = 0.0f;
                RectF rectF2 = this.f30367J;
                int i18 = this.f30365H;
                float f6 = c2 / 2.0f;
                rectF2.set(i18 - f6, 0.0f, i18 + f6, b3);
            }
            if (this.f30364G) {
                this.f30367J.offset(f, this.f30366I + i16 + 0);
            } else {
                this.f30367J.offset(f, ((this.f30366I - i16) - b3) - 0);
            }
            RectF rectF3 = this.f30367J;
            rectF3.offset(Math.max(f, i12 - rectF3.left), f);
            RectF rectF4 = this.f30367J;
            rectF4.offset(Math.min(f, (i - i12) - rectF4.right), f);
            int i19 = (C1357a0.m37541i(10.0f) / 2) + C1357a0.m37541i(6.0f);
            int i20 = this.f30365H;
            RectF rectF5 = this.f30367J;
            float f7 = rectF5.left;
            if (i20 - i19 < f7) {
                rectF5.offset((i20 - i19) - f7, 0.0f);
            } else {
                float f8 = rectF5.right;
                if (i20 + i19 > f8) {
                    rectF5.offset((i20 + i19) - f8, 0.0f);
                }
            }
            AbstractC9364g gVar = this.f30379f;
            if (gVar != null) {
                gVar.mo8975a(this.f30367J);
            }
            m8878u(B);
            if (!d && this.f30365H == i3 && this.f30366I == i4 && this.f30364G == z && this.f30367J.equals(a0)) {
                return false;
            }
            m8877v(this.f30368K, this.f30367J);
            return true;
        }

        public boolean m8907R(View view, MotionEvent motionEvent) {
            boolean D = m8921D();
            C1357a0.m37541i(8.0f);
            C1357a0.m37541i(D ? 11.0f : 8.0f);
            if (D) {
                C1357a0.m37541i(24.0f);
                C1357a0.m37541i(8.0f);
            }
            return this.f30390q.mo8926e(this, view, motionEvent);
        }

        public final void m8906S(View view, boolean z) {
            if (this.f30369L == view && this.f30370M != z) {
                this.f30370M = z;
                if (z) {
                    m8915J();
                }
            }
        }

        public C9370l m8905T(AbstractC9374m mVar) {
            C6227d<AbstractC9374m> dVar = this.f30396w;
            if (dVar != null) {
                dVar.remove(mVar);
            }
            return this;
        }

        public void m8904U() {
            if (m8908Q(this.f30374a.getMeasuredWidth(), this.f30374a.getMeasuredHeight()) && this.f30397x.m29584g() > 0.0f) {
                this.f30374a.invalidate();
            }
        }

        public void m8903V(AbstractC9367i iVar, int i) {
            this.f30390q = iVar;
            this.f30384k = C1362c.m37483f(i);
            m8908Q(this.f30374a.getMeasuredWidth(), this.f30374a.getMeasuredHeight());
            this.f30374a.invalidate();
        }

        public void m8902W(C10930q6 q6Var, CharSequence charSequence, int i) {
            m8903V(this.f30374a.m8981k(q6Var, charSequence, 0), i);
        }

        public final void m8901X(boolean z, boolean z2) {
            if (this.f30397x.m29583h() != z) {
                if (!z || this.f30397x.m29584g() != 0.0f || C5063c.m24144b(this.f30389p, 8)) {
                    this.f30397x.m29577n(C2057b.f7280b);
                    this.f30397x.m29579l(100L);
                } else {
                    this.f30397x.m29577n(C2057b.f7284f);
                    this.f30397x.m29579l(210L);
                }
                AbstractC9323v4<?> v4Var = this.f30380g;
                if (v4Var != null) {
                    if (z) {
                        v4Var.m9226k8(this.f30360C);
                        this.f30380g.m9219l8(this.f30361D);
                    } else {
                        v4Var.m9200nd(this.f30360C);
                        this.f30380g.m9193od(this.f30361D);
                    }
                }
                if (z) {
                    this.f30362E = SystemClock.uptimeMillis();
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f30362E;
                    List<AbstractC5920l> list = this.f30363F;
                    if (list != null) {
                        for (AbstractC5920l lVar : list) {
                            lVar.mo3050a(uptimeMillis);
                        }
                    }
                }
            }
            if (z) {
                m8879t();
            }
            this.f30397x.m29575p(z, z2);
        }

        public void m8900Y() {
            m8876w();
            m8875x();
            AbstractC9323v4<?> v4Var = this.f30380g;
            if (v4Var == null || v4Var.m9339Ta() || this.f30397x.m29584g() > 0.0f) {
                m8901X(true, true);
                return;
            }
            final C10327b bVar = new C10327b();
            this.f30358A = bVar;
            this.f30380g.m9212m8(new Runnable() {
                @Override
                public final void run() {
                    C9357x2.C9370l.this.m8909P(bVar);
                }
            });
        }

        public boolean m8899Z() {
            AbstractRunnableC5910b bVar;
            return this.f30397x.m29583h() && ((bVar = this.f30398y) == null || !bVar.m21856d());
        }

        public C9370l m8881r(AbstractC9374m mVar) {
            if (this.f30396w == null) {
                this.f30396w = new C6227d<>();
            }
            this.f30396w.add(mVar);
            return this;
        }

        public C9370l m8880s(AbstractC5920l lVar) {
            if (this.f30363F == null) {
                this.f30363F = new ArrayList();
            }
            this.f30363F.add(lVar);
            return this;
        }

        public final void m8879t() {
            if (!this.f30359B) {
                this.f30359B = true;
                this.f30374a.m8986f(this);
                this.f30390q.mo8925f(this.f30391r);
                this.f30391r.m21001b();
                C6240c cVar = this.f30392s;
                if (cVar != null) {
                    cVar.m20977j(this.f30385l, this.f30386m);
                    this.f30392s.mo20245f();
                }
                RunnableC6507m mVar = this.f30393t;
                if (mVar != null) {
                    mVar.m20231r(this.f30387n);
                    this.f30393t.mo20245f();
                }
            }
        }

        public final void m8878u(View view) {
            View view2 = this.f30369L;
            if (view2 != view) {
                if (view2 != null) {
                    view2.removeOnLayoutChangeListener(this.f30371N);
                    this.f30369L.removeOnAttachStateChangeListener(this.f30373P);
                    View view3 = this.f30369L;
                    if (view3 instanceof View$OnClickListenerC6902i) {
                        ((View$OnClickListenerC6902i) view3).m18499q0(this.f30372O);
                    }
                }
                this.f30369L = view;
                if (view != null) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        this.f30370M = view.isAttachedToWindow();
                    } else {
                        this.f30370M = true;
                    }
                    view.addOnLayoutChangeListener(this.f30371N);
                    view.addOnAttachStateChangeListener(this.f30373P);
                    if (view instanceof View$OnClickListenerC6902i) {
                        ((View$OnClickListenerC6902i) view).m18513G(this.f30372O);
                    }
                }
            }
        }

        public final void m8877v(Path path, RectF rectF) {
            int i = C1357a0.m37541i(10.0f);
            int i2 = C1357a0.m37541i(6.0f);
            int i3 = C1357a0.m37541i(5.0f);
            path.reset();
            path.setFillType(Path.FillType.EVEN_ODD);
            RectF a0 = C1410y.m37050a0();
            if (C5063c.m24144b(this.f30389p, 8)) {
                float f = i2;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
            } else if (this.f30364G) {
                float f2 = i2;
                path.moveTo(rectF.left, rectF.top + f2);
                float f3 = rectF.left;
                float f4 = rectF.top;
                float f5 = i2 * 2;
                a0.set(f3, f4, f3 + f5, f4 + f5);
                path.arcTo(a0, -180.0f, 90.0f);
                float f6 = i / 2.0f;
                path.lineTo(this.f30365H - f6, rectF.top);
                path.rLineTo(f6, -i3);
                path.rLineTo(f6, i3);
                path.lineTo(rectF.right - f2, rectF.top);
                float f7 = rectF.right;
                float f8 = rectF.top;
                a0.set(f7 - f5, f8, f7, (2.0f * f2) + f8);
                path.arcTo(a0, -90.0f, 90.0f);
                path.lineTo(rectF.right, rectF.bottom - f2);
                float f9 = rectF.right;
                float f10 = rectF.bottom;
                a0.set(f9 - f5, f10 - f5, f9, f10);
                path.arcTo(a0, 0.0f, 90.0f);
                path.lineTo(rectF.left + f5, rectF.bottom);
                float f11 = rectF.left;
                float f12 = rectF.bottom;
                a0.set(f11, f12 - f5, f5 + f11, f12);
                path.arcTo(a0, 90.0f, 90.0f);
                path.lineTo(rectF.left, rectF.top + f2);
            } else {
                float f13 = i2;
                path.moveTo(rectF.left + f13, rectF.bottom);
                float f14 = i / 2.0f;
                path.lineTo(this.f30365H - f14, rectF.bottom);
                path.rLineTo(f14, i3);
                path.rLineTo(f14, -i3);
                path.lineTo(rectF.right - f13, rectF.bottom);
                float f15 = rectF.right;
                float f16 = i2 * 2;
                float f17 = rectF.bottom;
                a0.set(f15 - f16, f17 - f16, f15, f17);
                path.arcTo(a0, 90.0f, -90.0f);
                path.lineTo(rectF.right, rectF.top + f13);
                float f18 = rectF.right;
                float f19 = rectF.top;
                a0.set(f18 - f16, f19, f18, f19 + f16);
                path.arcTo(a0, 0.0f, -90.0f);
                path.lineTo(rectF.left + f13, rectF.top);
                float f20 = rectF.left;
                float f21 = rectF.top;
                a0.set(f20, f21, f20 + f16, f21 + f16);
                path.arcTo(a0, -90.0f, -90.0f);
                path.lineTo(rectF.left, rectF.bottom - f13);
                float f22 = rectF.left;
                float f23 = rectF.bottom;
                a0.set(f22, f23 - f16, f16 + f22, f23);
                path.arcTo(a0, -180.0f, -90.0f);
            }
            path.close();
        }

        public final void m8876w() {
            this.f30399z = false;
            AbstractRunnableC5910b bVar = this.f30398y;
            if (bVar != null) {
                bVar.m21857c();
                this.f30398y = null;
            }
        }

        public final void m8875x() {
            C10327b bVar = this.f30358A;
            if (bVar != null) {
                bVar.m5417a();
                this.f30358A = null;
            }
        }

        public void m8874y() {
            m8876w();
            m8873z();
            m8901X(false, false);
            this.f30391r.mo4501a3();
            C6240c cVar = this.f30392s;
            if (cVar != null) {
                cVar.mo20249Z();
            }
            RunnableC6507m mVar = this.f30393t;
            if (mVar != null) {
                mVar.mo20249Z();
            }
        }

        public final void m8873z() {
            if (this.f30359B) {
                this.f30359B = false;
                this.f30374a.m8978n(this);
                this.f30391r.m20994i();
                C6240c cVar = this.f30392s;
                if (cVar != null) {
                    cVar.mo20247b();
                }
                RunnableC6507m mVar = this.f30393t;
                if (mVar != null) {
                    mVar.mo20247b();
                }
            }
        }
    }

    public interface AbstractC9374m {
        void mo8872i(C9370l lVar, float f);

        void mo8871l(C9370l lVar, boolean z);
    }

    public C9357x2(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.f30320M = paint;
        paint.setStyle(Paint.Style.FILL);
        setWillNotDraw(true);
    }

    public final void m8986f(C9370l lVar) {
        for (int size = this.f30321N.size() - 1; size >= 0; size--) {
            C9370l lVar2 = this.f30321N.get(size);
            if (lVar2.f30398y != null) {
                lVar2.m8915J();
            }
        }
        getLocationOnScreen(this.f30325b);
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            lVar.m8908Q(getMeasuredWidth(), getMeasuredHeight());
        }
        this.f30321N.add(lVar);
        if (this.f30321N.size() == 1) {
            setWillNotDraw(false);
            addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC9360c(lVar));
            AbstractC9361d dVar = this.f30324a;
            if (dVar != null) {
                dVar.mo8976a(this, true);
                return;
            }
            return;
        }
        lVar.m8900Y();
    }

    public C9365h m8985g(View view) {
        return new C9365h().m8966a(view);
    }

    public C9365h m8984h(View view, AbstractC4345j jVar) {
        return new C9365h().m8965b(view, jVar);
    }

    public C9365h m8983i(AbstractC4345j jVar) {
        return new C9365h().m8964c(jVar);
    }

    public void m8982j(boolean z) {
        for (int size = this.f30321N.size() - 1; size >= 0; size--) {
            this.f30321N.get(size).m8920E(z);
        }
    }

    public AbstractC9367i m8981k(C10930q6 q6Var, CharSequence charSequence, int i) {
        return new C9368j(q6Var, new TdApi.FormattedText(charSequence.toString(), C4779t2.m25392x5(charSequence, false)), i, null);
    }

    public boolean m8980l() {
        for (int size = this.f30321N.size() - 1; size >= 0; size--) {
            C9370l lVar = this.f30321N.get(size);
            boolean Z = lVar.m8899Z();
            lVar.m8920E(true);
            if (Z || C5063c.m24144b(lVar.f30389p, 32)) {
                return true;
            }
        }
        return false;
    }

    public AbstractC9362e m8979m(AbstractC11531p pVar) {
        if (pVar == null) {
            return null;
        }
        return new C9359b(pVar);
    }

    public final void m8978n(C9370l lVar) {
        if (this.f30321N.remove(lVar) && this.f30321N.isEmpty()) {
            setWillNotDraw(true);
            AbstractC9361d dVar = this.f30324a;
            if (dVar != null) {
                dVar.mo8976a(this, false);
            }
        }
    }

    public void m8977o() {
        boolean z;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            loop0: while (true) {
                z = false;
                for (C9370l lVar : this.f30321N) {
                    if (lVar.m8908Q(measuredWidth, measuredHeight) || z) {
                        z = true;
                    }
                }
            }
            if (z) {
                invalidate();
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLocationOnScreen(this.f30325b);
    }

    @Override
    public void onDraw(Canvas canvas) {
        for (C9370l lVar : this.f30321N) {
            lVar.m8924A(canvas);
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m8977o();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m8977o();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f30322O = null;
            this.f30323P = false;
            for (int size = this.f30321N.size() - 1; size >= 0; size--) {
                C9370l lVar = this.f30321N.get(size);
                if (this.f30322O == null && lVar.m8907R(this, motionEvent)) {
                    this.f30322O = this.f30321N.get(size);
                } else if (C5063c.m24144b(lVar.f30389p, 1) && lVar.m8914K(motionEvent.getX(), motionEvent.getY())) {
                    this.f30323P = true;
                } else if (!C5063c.m24144b(lVar.f30389p, 2)) {
                    lVar.m8920E(lVar.f30399z);
                }
            }
            return this.f30322O != null || this.f30323P;
        } else if (action != 3) {
            C9370l lVar2 = this.f30322O;
            return (lVar2 != null && lVar2.m8907R(this, motionEvent)) || this.f30323P;
        } else {
            C9370l lVar3 = this.f30322O;
            if (lVar3 != null && lVar3.m8907R(this, motionEvent)) {
                z = true;
            }
            m8982j(true);
            return z;
        }
    }

    public void setAvailabilityListener(AbstractC9361d dVar) {
        this.f30324a = dVar;
    }

    public static class C9365h implements Cloneable {
        public AbstractC9363f f30332M;
        public AbstractC9362e f30333N;
        public AbstractC9364g f30334O;
        public RunnableC5390g.AbstractC5393c f30335P;
        public AbstractC9323v4<?> f30336Q;
        public float f30337R;
        public boolean f30338S;
        public int f30339T;
        public int f30340U;
        public C6246h f30341V;
        public C6246h f30342W;
        public C6503j f30343X;
        public float f30344Y;
        public HandlerC10770jj.C10788q f30345Z;
        public final C9357x2 f30346a;
        public List<AbstractC5918j<C9370l>> f30347a0;
        public View f30348b;
        public AbstractC4345j f30349c;

        public class C9366a implements AbstractC9362e {
            public C9366a() {
            }

            @Override
            public int mo8942A0() {
                return C9383y2.m8810g(this);
            }

            @Override
            public int mo8941I() {
                return C9383y2.m8814c(this);
            }

            @Override
            public int mo8940N0() {
                return C5412m.m22768m(this);
            }

            @Override
            public int mo8939P0() {
                return C9383y2.m8813d(this);
            }

            @Override
            public int mo7858Q() {
                return C5406j.m22807d(this);
            }

            @Override
            public long mo7857X0(boolean z) {
                return C5406j.m22808c(this, z);
            }

            @Override
            public int mo8938Z0() {
                return C5412m.m22772i(this);
            }

            @Override
            public int mo7856b1() {
                return C5412m.m22773h(this);
            }

            @Override
            public int mo7855c() {
                return C5412m.m22775f(this);
            }

            @Override
            public int mo7854e(boolean z) {
                return C5412m.m22779b(this, z);
            }

            @Override
            public int mo7853g(boolean z) {
                return C5412m.m22770k(this, z);
            }

            @Override
            public AbstractC11531p mo8937j1() {
                return C5412m.m22776e(this);
            }

            @Override
            public int mo8936k() {
                return C9383y2.m8811f(this);
            }

            @Override
            public int mo8935l1() {
                return C9383y2.m8812e(this);
            }

            @Override
            public int mo7852o0(boolean z) {
                return C5412m.m22778c(this, z);
            }

            @Override
            public int mo7851p0(boolean z) {
                return C5412m.m22780a(this, z);
            }

            @Override
            public int mo8934r(boolean z) {
                return C9383y2.m8816a(this, z);
            }

            @Override
            public int mo7850r0(boolean z) {
                return C5412m.m22771j(this, z);
            }

            @Override
            public int mo8933w() {
                return C9383y2.m8815b(this);
            }

            @Override
            public AbstractC11531p mo8932z() {
                return C5412m.m22774g(this);
            }
        }

        public C9365h(C9357x2 x2Var) {
            this.f30337R = 13.0f;
            this.f30338S = true;
            this.f30344Y = 320.0f;
            this.f30346a = x2Var;
        }

        public C9370l m8974A(C5459x0 x0Var) {
            return m8973B(new C9369k(this.f30346a, x0Var));
        }

        public C9370l m8973B(AbstractC9367i iVar) {
            C9370l lVar = new C9370l(this.f30348b, this.f30349c, this.f30332M, this.f30333N, this.f30334O, this.f30336Q, this.f30335P, this.f30337R, this.f30338S, this.f30340U, this.f30341V, this.f30342W, this.f30343X, this.f30344Y, this.f30339T, iVar);
            List<AbstractC5918j<C9370l>> list = this.f30347a0;
            if (list != null) {
                for (AbstractC5918j<C9370l> jVar : list) {
                    jVar.mo1330a(lVar);
                }
            }
            lVar.m8879t();
            return lVar;
        }

        public C9370l m8972C(C10930q6 q6Var, int i) {
            return m8970E(q6Var, new TdApi.FormattedText(C4403w.m27869i1(i), null));
        }

        public C9370l m8971D(C10930q6 q6Var, CharSequence charSequence) {
            return m8970E(q6Var, new TdApi.FormattedText(charSequence.toString(), C4779t2.m25392x5(charSequence, false)));
        }

        public C9370l m8970E(C10930q6 q6Var, TdApi.FormattedText formattedText) {
            return m8973B(new C9368j(q6Var, formattedText, 0, this.f30345Z));
        }

        public void m8969F(AbstractC9323v4<?> v4Var, C10930q6 q6Var, int i, CharSequence charSequence) {
            boolean z = false;
            if (this.f30348b == null && this.f30349c == null && this.f30332M == null) {
                C1379j0.m37290z0(charSequence, 0);
                return;
            }
            C9365h q = m8951q(i);
            if (i == R.drawable.baseline_info_24 || i == R.drawable.baseline_error_24) {
                z = true;
            }
            q.m8947v(z).m8958i(v4Var != null ? v4Var.m9300Z9() : null).m8971D(q6Var, charSequence).m8918G(3500L, TimeUnit.MILLISECONDS);
        }

        public C9365h m8968G(HandlerC10770jj.C10788q qVar) {
            this.f30345Z = qVar;
            return this;
        }

        public C9365h m8967H(float f, boolean z) {
            this.f30337R = Math.max(13.0f, f);
            this.f30338S = z;
            return this;
        }

        public C9365h m8966a(View view) {
            this.f30348b = view;
            return this;
        }

        public C9365h m8965b(View view, AbstractC4345j jVar) {
            this.f30348b = view;
            this.f30349c = jVar;
            return this;
        }

        public C9365h m8964c(AbstractC4345j jVar) {
            this.f30349c = jVar;
            return this;
        }

        public C9365h m8963d() {
            return m8962e(-1.0f);
        }

        public C9365h m8962e(float f) {
            return m8967H(C4868i.m24726c2().m24592t0() + f, C4868i.m24726c2().m24924A2());
        }

        public C9365h m8961f(RunnableC5390g.AbstractC5393c cVar) {
            this.f30335P = cVar;
            return this;
        }

        public C9365h m8960g(AbstractC9362e eVar) {
            this.f30333N = eVar;
            return this;
        }

        public AbstractC9362e m8959h() {
            AbstractC9362e eVar = this.f30333N;
            return eVar != null ? eVar : new C9366a();
        }

        public C9365h m8958i(AbstractC9323v4<?> v4Var) {
            this.f30336Q = v4Var;
            return this;
        }

        public C9365h m8957j(boolean z) {
            return m8956k(4, z);
        }

        public C9365h m8956k(int i, boolean z) {
            this.f30339T = C5063c.m24138h(this.f30339T, i, z);
            return this;
        }

        public C9365h m8955l(C6503j jVar, C6246h hVar) {
            this.f30343X = jVar;
            this.f30341V = hVar;
            return this;
        }

        public C9365h m8954n(boolean z) {
            return m8956k(32, z);
        }

        public boolean m8953o() {
            return this.f30336Q != null;
        }

        public boolean m8952p() {
            AbstractC4345j jVar = this.f30349c;
            if (jVar != null) {
                View f = jVar.mo28226f();
                return f != null && C1489y.m36760J(f);
            }
            AbstractC9323v4<?> v4Var = this.f30336Q;
            if (v4Var != null) {
                return v4Var.m9339Ta();
            }
            View view = this.f30348b;
            if (view != null) {
                return C1489y.m36760J(view);
            }
            return false;
        }

        public C9365h m8951q(int i) {
            this.f30340U = i;
            return this;
        }

        public C9365h m8950r(boolean z) {
            return m8956k(64, z);
        }

        public C9365h m8949s(boolean z) {
            return m8956k(1, z);
        }

        public C9365h m8948u(AbstractC9363f fVar) {
            this.f30332M = fVar;
            return this;
        }

        public C9365h m8947v(boolean z) {
            return m8956k(16, z);
        }

        public C9365h m8946w(boolean z) {
            return m8956k(8, z);
        }

        public C9365h m8945x(AbstractC9364g gVar) {
            this.f30334O = gVar;
            return this;
        }

        public C9365h m8944y(AbstractC5918j<C9370l> jVar) {
            if (this.f30347a0 == null) {
                this.f30347a0 = new ArrayList();
            }
            this.f30347a0.add(jVar);
            return this;
        }

        public C9365h m8943z(boolean z) {
            return m8956k(2, z);
        }

        public C9365h(C9365h hVar) {
            this.f30337R = 13.0f;
            this.f30338S = true;
            this.f30344Y = 320.0f;
            this.f30346a = hVar.f30346a;
            this.f30348b = hVar.f30348b;
            this.f30349c = hVar.f30349c;
            this.f30332M = hVar.f30332M;
            this.f30333N = hVar.f30333N;
            this.f30334O = hVar.f30334O;
            this.f30335P = hVar.f30335P;
            this.f30336Q = hVar.f30336Q;
            this.f30337R = hVar.f30337R;
            this.f30338S = hVar.f30338S;
            this.f30339T = hVar.f30339T;
            this.f30340U = hVar.f30340U;
            this.f30341V = hVar.f30341V;
            this.f30342W = hVar.f30342W;
            this.f30343X = hVar.f30343X;
            this.f30344Y = hVar.f30344Y;
            this.f30345Z = hVar.f30345Z;
            this.f30347a0 = hVar.f30347a0 != null ? new ArrayList(hVar.f30347a0) : null;
        }
    }
}
