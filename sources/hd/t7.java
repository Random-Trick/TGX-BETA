package hd;

import ae.h;
import ae.z;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.b;
import ce.e0;
import ce.y;
import gb.c;
import gb.j;
import ib.d;
import ie.t;
import ld.i;
import ld.p;
import ld.v;
import ne.g1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import yd.g;
import zd.hj;
import zd.o6;

public class t7 extends c implements c.a {
    public final String P;
    public int R;
    public int S;
    public TdApi.Background T;
    public h U;
    public TdApi.File V;
    public ld.h X;
    public ld.h Y;
    public g1 Z;
    public final s4 f13631b;
    public final b.a f13632c = new b.a();
    public final RectF M = new RectF();
    public final Paint N = new Paint();
    public final c O = new c(this);
    public int W = -1;
    public Path Q = new Path();

    public class a implements g1.c {
        public final s4 f13633a;

        public a(s4 s4Var) {
            this.f13633a = s4Var;
        }

        @Override
        public void e(TdApi.File file, int i10) {
            t7.this.W = i10;
            this.f13633a.q8();
        }

        @Override
        public void g(TdApi.File file, float f10) {
            this.f13633a.q8();
        }

        @Override
        public boolean k(g1 g1Var, View view, TdApi.File file, long j10) {
            t7.this.A();
            return true;
        }
    }

    public t7(final s4 s4Var, TdApi.WebPage webPage, String str) {
        this.f13631b = s4Var;
        this.P = webPage.url;
        D(webPage.document);
        org.thunderdog.challegram.a t10 = s4Var.t();
        o6 c10 = s4Var.c();
        TdApi.Document document = webPage.document;
        g1 g1Var = new g1(t10, c10, 8, document != null && e0.c(document.mimeType), s4Var.I2(), s4Var.K3());
        this.Z = g1Var;
        g1Var.f0(s4Var);
        this.Z.L0(new a(s4Var));
        this.Z.d0(1140850688);
        g1 g1Var2 = this.Z;
        TdApi.Document document2 = webPage.document;
        g1Var2.p0(document2 != null ? document2.document : null, s4Var.X3());
        j jVar = this.f12825a;
        if (jVar != null) {
            this.Z.R0(jVar);
        }
        s4Var.O0.v4().o(new TdApi.SearchBackground(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                t7.this.y(s4Var, object);
            }
        });
    }

    public void x(s4 s4Var) {
        TdApi.Background background = this.T;
        if (background != null) {
            this.U = new h(s4Var.O0, background);
        }
        j jVar = this.f12825a;
        if (jVar != null) {
            jVar.invalidate();
        }
    }

    public void y(final s4 s4Var, TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            this.T = (TdApi.Background) object;
        }
        s4Var.O0.hd().post(new Runnable() {
            @Override
            public final void run() {
                t7.this.x(s4Var);
            }
        });
    }

    public final void A() {
        this.f13631b.c().hd().E7(this.f13631b.Q0(), this.P, new hj.q().e());
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        A();
    }

    public final void D(TdApi.Document document) {
        if (document != null) {
            if (document.minithumbnail != null) {
                i iVar = new i(document.minithumbnail);
                this.X = iVar;
                iVar.s0(2);
                this.X.Z(true);
                this.X.t0(h());
            } else {
                this.X = null;
            }
            TdApi.File file = document.document;
            if (file != null) {
                this.V = file;
                boolean equals = document.mimeType.equals("application/x-tgwallpattern");
                ld.h hVar = new ld.h(this.f13631b.O0, document.document);
                this.Y = hVar;
                hVar.s0(2);
                this.Y.k0();
                this.Y.Z(true);
                ld.h hVar2 = this.Y;
                int h10 = h();
                if (equals) {
                    h10 *= 2;
                }
                hVar2.t0(h10);
                if (equals) {
                    this.Y.e0();
                    return;
                }
                return;
            }
            this.Y = null;
            this.V = null;
            return;
        }
        this.X = null;
        this.Y = null;
        this.V = null;
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    @Override
    public void a(int i10) {
        this.R = i10;
    }

    @Override
    public <T extends View & t> void b(T t10, Canvas canvas, int i10, int i11, v vVar, v vVar2, int i12, int i13, float f10, float f11) {
        int i14;
        int i15;
        int i16;
        float f12;
        float f13;
        float f14;
        float f15;
        int i17;
        int i18;
        int i19;
        Canvas canvas2;
        int i20;
        int v10 = v();
        int j10 = i10 + j();
        int h10 = i11 + h();
        this.N.setColor(ae.j.L(R.id.theme_color_placeholder));
        float f16 = i10;
        float f17 = i11;
        float f18 = j10;
        float f19 = h10;
        this.M.set(f16, f17, f18, f19);
        boolean z10 = this.Q != null;
        if (z10) {
            if (this.S != v10) {
                z(i10, i11, v10);
            }
            i14 = g.b(canvas, this.Q);
        } else {
            i14 = Integer.MIN_VALUE;
        }
        h hVar = this.U;
        if (hVar != null) {
            i16 = i14;
            f15 = f19;
            f14 = f18;
            f13 = f17;
            f12 = f16;
            i15 = v10;
            i17 = h10;
            i18 = j10;
            u(canvas, hVar, i10, i11, j10, h10, f10, vVar2);
        } else {
            i16 = i14;
            f15 = f19;
            f14 = f18;
            f13 = f17;
            f12 = f16;
            i18 = j10;
            i15 = v10;
            i17 = h10;
        }
        int i21 = this.W;
        if (i21 == -1 || i21 == 2) {
            int i22 = i18;
            canvas2 = canvas;
            if (this.Y != null) {
                vVar.V(vVar.getAlpha() + f10);
                vVar2.V(vVar2.getAlpha() + f10);
                i19 = i22;
                b.u(canvas, vVar, vVar2, true, true, i10, i11, i22, i17);
                vVar2.Q();
                vVar.Q();
                i20 = i15;
            } else {
                i19 = i22;
                i20 = i15;
                float f20 = i20;
                canvas2.drawRoundRect(this.M, f20, f20, this.N);
            }
        } else {
            vVar.V(vVar.getAlpha() + f10);
            vVar.K0(i10, i11, i18, i17);
            i19 = i18;
            canvas2 = canvas;
            vVar.draw(canvas2);
            vVar.Q();
            i20 = i15;
        }
        this.Z.J0(f10);
        this.Z.h0(i10, i11, i19, i17);
        this.Z.o(t10, canvas2);
        if (z10) {
            g.f(canvas2, i16);
            float f21 = i20;
            s4.d1(canvas, this.f13631b, 1.0f, f12, f13, f14, f15, f21, f21, f21, f21);
        }
    }

    @Override
    public int c(int i10) {
        return i10;
    }

    @Override
    public TdApi.File d() {
        return this.V;
    }

    @Override
    public g1 f() {
        return this.Z;
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    @Override
    public int h() {
        return a0.i(200.0f);
    }

    @Override
    public int j() {
        return this.R;
    }

    @Override
    public boolean l(View view, MotionEvent motionEvent) {
        if (this.Z.S(view, motionEvent)) {
            return true;
        }
        return this.O.e(view, motionEvent);
    }

    @Override
    public void m(p pVar) {
        ld.h hVar = this.Y;
        if (hVar != null) {
            pVar.G(hVar);
        } else {
            pVar.G(null);
        }
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return this.M.contains(f10, f11);
    }

    @Override
    public void n(ld.c cVar) {
        ld.h hVar = this.X;
        if (hVar != null) {
            cVar.j(null, hVar);
        } else {
            cVar.clear();
        }
    }

    @Override
    public void o(View view, float f10, float f11) {
        gb.b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void p(j jVar) {
        super.p(jVar);
        this.Z.R0(jVar);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    public final void u(Canvas canvas, h hVar, int i10, int i11, int i12, int i13, float f10, v vVar) {
        int w10 = w(z.u().i());
        if (hVar == null || hVar.R()) {
            canvas.drawColor(d.a(f10, w10));
        } else if (hVar.V()) {
            canvas.drawColor(d.a(f10, hVar.j(w10)));
        } else if (hVar.U()) {
            b.l(canvas, this.f13632c, i10, i11, i12, i13, hVar.K(), hVar.m(), hVar.H(), f10);
        } else if (hVar.T()) {
            canvas.drawColor(d.a(f10, hVar.j(w10)));
            b.p(canvas, this.f13632c, i10, i11, i12, i13, hVar.r(), f10);
        } else if (hVar.X()) {
            if (hVar.Z()) {
                b.l(canvas, this.f13632c, i10, i11, i12, i13, hVar.K(), hVar.m(), hVar.H(), f10);
            } else if (hVar.Y()) {
                canvas.drawColor(d.a(f10, hVar.j(w10)));
                b.p(canvas, this.f13632c, i10, i11, i12, i13, hVar.r(), f10);
            } else {
                canvas.drawColor(d.a(f10, hVar.j(w10)));
            }
            vVar.setColorFilter(hVar.B());
            vVar.V(hVar.F() * f10);
        } else {
            vVar.D();
            if (f10 != 1.0f) {
                vVar.V(f10);
            }
        }
    }

    public final int v() {
        return a0.i(ae.j.G());
    }

    public final int w(ae.p pVar) {
        return d.c(pVar.e(R.id.theme_color_background), pVar.e(R.id.theme_color_bubble_chatBackground));
    }

    public final void z(int i10, int i11, int i12) {
        this.S = i12;
        Path path = this.Q;
        if (path != null) {
            path.reset();
            RectF a02 = y.a0();
            a02.set(i10, i11, i10 + j(), i11 + h());
            float f10 = i12;
            b.a(this.Q, a02, f10, f10, f10, f10);
        }
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
