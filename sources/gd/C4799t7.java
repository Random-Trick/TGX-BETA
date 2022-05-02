package gd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1369e0;
import be.C1410y;
import me.C6883g1;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p080fb.AbstractC4345j;
import p080fb.C4335b;
import p080fb.C4336c;
import p108hb.C5064d;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6257p;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import p364zd.C11520h;
import p364zd.C11524j;
import p364zd.C11541z;

public class C4799t7 extends AbstractC4597c implements C4336c.AbstractC4337a {
    public final String f16355P;
    public Path f16356Q;
    public int f16357R;
    public int f16358S;
    public TdApi.Background f16359T;
    public C11520h f16360U;
    public TdApi.File f16361V;
    public C6246h f16363X;
    public C6246h f16364Y;
    public C6883g1 f16365Z;
    public final AbstractC4761s4 f16366b;
    public final C1359b.C1360a f16367c = new C1359b.C1360a();
    public final RectF f16352M = new RectF();
    public final Paint f16353N = new Paint();
    public final C4336c f16354O = new C4336c(this);
    public int f16362W = -1;

    public class C4800a implements C6883g1.AbstractC6886c {
        public final AbstractC4761s4 f16368a;

        public C4800a(AbstractC4761s4 s4Var) {
            this.f16368a = s4Var;
        }

        @Override
        public void mo15929b(TdApi.File file, int i) {
            C4799t7.this.f16362W = i;
            this.f16368a.m25829q8();
        }

        @Override
        public boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j) {
            C4799t7.this.m25226z();
            return true;
        }

        @Override
        public void mo15923f(TdApi.File file, float f) {
            this.f16368a.m25829q8();
        }
    }

    public C4799t7(final AbstractC4761s4 s4Var, TdApi.WebPage webPage, String str) {
        this.f16366b = s4Var;
        this.f16355P = webPage.url;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f16356Q = new Path();
        }
        m25248A(webPage.document);
        AbstractView$OnTouchListenerC7889a s = s4Var.mo4347s();
        C10930q6 c = s4Var.mo4348c();
        TdApi.Document document = webPage.document;
        C6883g1 g1Var = new C6883g1(s, c, 8, document != null && C1369e0.m37399c(document.mimeType), s4Var.m26146K2(), s4Var.m26116N3());
        this.f16365Z = g1Var;
        g1Var.m18634d0(s4Var);
        this.f16365Z.m18668I0(new C4800a(s4Var));
        this.f16365Z.m18638b0(1140850688);
        C6883g1 g1Var2 = this.f16365Z;
        TdApi.Document document2 = webPage.document;
        g1Var2.m18614n0(document2 != null ? document2.document : null, s4Var.m25994Z3());
        AbstractC4345j jVar = this.f15197a;
        if (jVar != null) {
            this.f16365Z.m18658N0(jVar);
        }
        s4Var.f16099O0.m2270r4().m14783o(new TdApi.SearchBackground(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C4799t7.this.m25228x(s4Var, object);
            }
        });
    }

    public void m25229w(AbstractC4761s4 s4Var) {
        TdApi.Background background = this.f16359T;
        if (background != null) {
            this.f16360U = new C11520h(s4Var.f16099O0, background);
        }
        AbstractC4345j jVar = this.f15197a;
        if (jVar != null) {
            jVar.invalidate();
        }
    }

    public void m25228x(final AbstractC4761s4 s4Var, TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            this.f16359T = (TdApi.Background) object;
        }
        s4Var.f16099O0.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C4799t7.this.m25229w(s4Var);
            }
        });
    }

    public final void m25248A(TdApi.Document document) {
        if (document != null) {
            if (document.minithumbnail != null) {
                C6250i iVar = new C6250i(document.minithumbnail);
                this.f16363X = iVar;
                iVar.m20898s0(2);
                this.f16363X.m20931Z(true);
                this.f16363X.mo20768t0(mo25242i());
            } else {
                this.f16363X = null;
            }
            TdApi.File file = document.document;
            if (file != null) {
                this.f16361V = file;
                boolean equals = document.mimeType.equals("application/x-tgwallpattern");
                C6246h hVar = new C6246h(this.f16366b.f16099O0, document.document);
                this.f16364Y = hVar;
                hVar.m20898s0(2);
                this.f16364Y.m20910k0();
                this.f16364Y.m20931Z(true);
                C6246h hVar2 = this.f16364Y;
                int i = mo25242i();
                if (equals) {
                    i *= 2;
                }
                hVar2.mo20768t0(i);
                if (equals) {
                    this.f16364Y.m20922e0();
                    return;
                }
                return;
            }
            this.f16364Y = null;
            this.f16361V = null;
            return;
        }
        this.f16363X = null;
        this.f16364Y = null;
        this.f16361V = null;
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        m25226z();
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    @Override
    public void mo25247a(int i) {
        this.f16357R = i;
    }

    @Override
    public <T extends View & AbstractC5143t> void mo25246c(T t, Canvas canvas, int i, int i2, AbstractC6264v vVar, AbstractC6264v vVar2, int i3, int i4, float f, float f2) {
        int i5;
        int i6;
        int i7;
        float f3;
        float f4;
        float f5;
        float f6;
        int i8;
        int i9;
        int i10;
        Canvas canvas2;
        int i11;
        int u = m25231u();
        int j = i + mo25241j();
        int i12 = i2 + mo25242i();
        this.f16353N.setColor(C11524j.m228N(R.id.theme_color_placeholder));
        float f7 = i;
        float f8 = i2;
        float f9 = j;
        float f10 = i12;
        this.f16352M.set(f7, f8, f9, f10);
        boolean z = Build.VERSION.SDK_INT >= 19 && this.f16356Q != null;
        if (z) {
            if (this.f16358S != u) {
                m25227y(i, i2, u);
            }
            i5 = C10192g.m5789b(canvas, this.f16356Q);
        } else {
            i5 = Integer.MIN_VALUE;
        }
        C11520h hVar = this.f16360U;
        if (hVar != null) {
            i7 = i5;
            f6 = f10;
            f5 = f9;
            f4 = f8;
            f3 = f7;
            i6 = u;
            i8 = i12;
            i9 = j;
            m25232t(canvas, hVar, i, i2, j, i12, f, vVar2);
        } else {
            i7 = i5;
            f6 = f10;
            f5 = f9;
            f4 = f8;
            f3 = f7;
            i9 = j;
            i6 = u;
            i8 = i12;
        }
        int i13 = this.f16362W;
        if (i13 == -1 || i13 == 2) {
            int i14 = i9;
            canvas2 = canvas;
            if (this.f16364Y != null) {
                vVar.mo20251U(vVar.getAlpha() + f);
                vVar2.mo20251U(vVar2.getAlpha() + f);
                i10 = i14;
                C1359b.m37501u(canvas, vVar, vVar2, true, true, i, i2, i14, i8);
                vVar2.mo20254P();
                vVar.mo20254P();
                i11 = i6;
            } else {
                i10 = i14;
                i11 = i6;
                float f11 = i11;
                canvas2.drawRoundRect(this.f16352M, f11, f11, this.f16353N);
            }
        } else {
            vVar.mo20251U(vVar.getAlpha() + f);
            vVar.mo20257K0(i, i2, i9, i8);
            i10 = i9;
            canvas2 = canvas;
            vVar.draw(canvas2);
            vVar.mo20254P();
            i11 = i6;
        }
        this.f16365Z.m18670H0(f);
        this.f16365Z.m18630f0(i, i2, i10, i8);
        this.f16365Z.m18615n(t, canvas2);
        if (z) {
            C10192g.m5785f(canvas2, i7);
            float f12 = i11;
            AbstractC4761s4.m25952e1(canvas, this.f16366b, 1.0f, f3, f4, f5, f6, f12, f12, f12, f12);
        }
    }

    @Override
    public int mo25245d(int i) {
        return i;
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    @Override
    public TdApi.File mo25244g() {
        return this.f16361V;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    @Override
    public C6883g1 mo25243h() {
        return this.f16365Z;
    }

    @Override
    public int mo25242i() {
        return C1357a0.m37544i(200.0f);
    }

    @Override
    public int mo25241j() {
        return this.f16357R;
    }

    @Override
    public boolean mo25240k(View view, MotionEvent motionEvent) {
        if (this.f16365Z.m18653Q(view, motionEvent)) {
            return true;
        }
        return this.f16354O.m28248e(view, motionEvent);
    }

    @Override
    public void mo25239l(C6257p pVar) {
        C6246h hVar = this.f16364Y;
        if (hVar != null) {
            pVar.m20820G(hVar);
        } else {
            pVar.m20820G(null);
        }
    }

    @Override
    public void mo25238m(C6240c cVar) {
        C6246h hVar = this.f16363X;
        if (hVar != null) {
            cVar.m20978j(null, hVar);
        } else {
            cVar.clear();
        }
    }

    @Override
    public void mo25237n(AbstractC4345j jVar) {
        super.mo25237n(jVar);
        this.f16365Z.m18658N0(jVar);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f16352M.contains(f, f2);
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public final void m25232t(Canvas canvas, C11520h hVar, int i, int i2, int i3, int i4, float f, AbstractC6264v vVar) {
        int v = m25230v(C11541z.m7t().m20i());
        if (hVar == null || hVar.m319R()) {
            canvas.drawColor(C5064d.m24132a(f, v));
        } else if (hVar.m315V()) {
            canvas.drawColor(C5064d.m24132a(f, hVar.m292j(v)));
        } else if (hVar.m316U()) {
            C1359b.m37510l(canvas, this.f16367c, i, i2, i3, i4, hVar.m326K(), hVar.m286m(), hVar.m329H(), f);
        } else if (hVar.m317T()) {
            canvas.drawColor(C5064d.m24132a(f, hVar.m292j(v)));
            C1359b.m37506p(canvas, this.f16367c, i, i2, i3, i4, hVar.m276r(), f);
        } else if (hVar.m313X()) {
            if (hVar.m311Z()) {
                C1359b.m37510l(canvas, this.f16367c, i, i2, i3, i4, hVar.m326K(), hVar.m286m(), hVar.m329H(), f);
            } else if (hVar.m312Y()) {
                canvas.drawColor(C5064d.m24132a(f, hVar.m292j(v)));
                C1359b.m37506p(canvas, this.f16367c, i, i2, i3, i4, hVar.m276r(), f);
            } else {
                canvas.drawColor(C5064d.m24132a(f, hVar.m292j(v)));
            }
            vVar.setColorFilter(hVar.m335B());
            vVar.mo20251U(hVar.m331F() * f);
        } else {
            vVar.mo20261D();
            if (f != 1.0f) {
                vVar.mo20251U(f);
            }
        }
    }

    public final int m25231u() {
        return C1357a0.m37544i(C11524j.m238I());
    }

    public final int m25230v(AbstractC11531p pVar) {
        return C5064d.m24130c(pVar.mo92e(R.id.theme_color_background), pVar.mo92e(R.id.theme_color_bubble_chatBackground));
    }

    public final void m25227y(int i, int i2, int i3) {
        Path path;
        this.f16358S = i3;
        if (Build.VERSION.SDK_INT >= 19 && (path = this.f16356Q) != null) {
            path.reset();
            RectF a0 = C1410y.m37053a0();
            a0.set(i, i2, i + mo25241j(), i2 + mo25242i());
            float f = i3;
            C1359b.m37521a(this.f16356Q, a0, f, f, f, f);
        }
    }

    public final void m25226z() {
        this.f16366b.mo4348c().m2485dd().m3858E7(this.f16366b.m26097P0(), this.f16355P, new HandlerC10770jj.C10788q().m3326e());
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
