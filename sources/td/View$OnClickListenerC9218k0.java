package td;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C0962g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1405v;
import be.C1410y;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6879f3;
import me.C6957m1;
import me.C7025s3;
import me.View$OnClickListenerC6902i;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p038ce.View$OnClickListenerC2805o4;
import p038ce.View$OnClickListenerC2928qj;
import p038ce.View$OnClickListenerC3217vt;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5919k;
import p139jb.AbstractC5920l;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7316a;
import p335xd.C10192g;
import p350yd.AbstractC10925q1;
import p350yd.AbstractC11030u0;
import p350yd.AbstractC11041ub;
import p350yd.AbstractC11125y0;
import p350yd.C10536ab;
import p350yd.C10733ic;
import p350yd.C10904p1;
import p350yd.C10930q6;
import p350yd.C11008t0;
import p350yd.C11020tb;
import p350yd.C11131y6;
import p350yd.C11164z6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import p364zd.C11541z;
import sc.C8731d;
import tc.C9139d;

public class View$OnClickListenerC9218k0 extends AbstractC9323v4<Void> implements View.OnClickListener, C4868i.AbstractC4881m, AbstractC11030u0, AbstractC11125y0, View$OnClickListenerC6902i.AbstractC6906d, View$OnClickListenerC6902i.AbstractC6905c, View.OnLongClickListener, C10733ic.AbstractC10737d, AbstractC11041ub, AbstractC10925q1 {
    public C10930q6 f29745A0;
    public boolean f29746B0;
    public boolean f29747C0;
    public AbstractRunnableC5910b f29748D0;
    public boolean f29749E0;
    public long f29750F0;
    public String f29751G0;
    public boolean f29752H0;
    public C9261p f29753I0;
    public float f29754J0;
    public int f29756n0;
    public int f29757o0;
    public boolean f29758p0;
    public boolean f29759q0;
    public FrameLayoutFix f29760r0;
    public C9232l0 f29761s0;
    public C2546iq f29762t0;
    public RecyclerView f29763u0;
    public C0962g f29764v0;
    public boolean f29766x0;
    public int f29767y0;
    public C10930q6.C10946p f29768z0;
    public final C2964ra f29765w0 = new C2964ra(88, R.id.btn_proxy, R.drawable.baseline_security_24, R.string.Proxy);
    public final RecyclerView.AbstractC0896m f29755K0 = new C8731d(C2057b.f7280b, 160);

    public class C9219a extends C9296t {
        public C9219a(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC9218k0.this.m9896og();
        }
    }

    public class C9220b extends C2546iq {
        public C9220b(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo9112n2(C2964ra raVar, C9256o0 o0Var, C7025s3 s3Var, boolean z) {
            boolean z2 = true;
            int i = 0;
            boolean z3 = z && View$OnClickListenerC9218k0.this.f29754J0 > 0.0f;
            int j = raVar.m32838j();
            if (j == R.id.account) {
                C11131y6 y6Var = (C11131y6) raVar.m32847d();
                C11164z6 x = y6Var.m1452x();
                if (y6Var.f35708b != y6Var.m1468i().m4632x2()) {
                    z2 = false;
                }
                o0Var.m9786c1(z2, z3);
                o0Var.m9782i1(x.m1328b(), x.m1327c(), z3);
                o0Var.m9787W0(y6Var.m1462n(), y6Var.m1463m(false));
                o0Var.setText(C4403w.m27836r0(y6Var.m1455u(), y6Var.m1504G()));
                o0Var.setCustomControllerProvider(View$OnClickListenerC9218k0.this);
                o0Var.setPreviewActionListProvider(View$OnClickListenerC9218k0.this);
            } else if (j != R.id.btn_settings) {
                o0Var.m9785d1(false, 0, z3);
            } else {
                if (View$OnClickListenerC9218k0.this.f29767y0 == 0) {
                    z2 = false;
                }
                if (View$OnClickListenerC9218k0.this.f29767y0 != C10930q6.f34960B2) {
                    i = View$OnClickListenerC9218k0.this.f29767y0;
                }
                o0Var.m9785d1(z2, i, z3);
            }
        }
    }

    public class C9221c extends RecyclerView.AbstractC0901o {
        public C9221c() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            RecyclerView.AbstractC0886d0 l0 = recyclerView.m39421l0(view);
            if (l0 == null || l0.m39335n() != 11) {
                rect.bottom = 0;
                rect.top = 0;
                return;
            }
            int i = C1357a0.m37544i(8.0f);
            rect.bottom = i;
            rect.top = i;
        }
    }

    public class C9222d extends C0962g.AbstractC0968f {
        public Paint f29774f;
        public Paint f29775g;
        public float f29776h;
        public int f29772d = -1;
        public int f29773e = -1;
        public final C3940f f29777i = new C3940f(0, new C9223a(), C2057b.f7280b, 280);

        public class C9223a implements C3950k.AbstractC3952b {
            public C9223a() {
            }

            @Override
            public void mo45P5(int i, float f, float f2, C3950k kVar) {
                C9222d.this.f29776h = f;
                View$OnClickListenerC9218k0.this.f29763u0.invalidate();
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
            }
        }

        public C9222d() {
        }

        @Override
        public void mo9884A(RecyclerView.AbstractC0886d0 d0Var, int i) {
            super.mo9884A(d0Var, i);
            if (i == 2) {
                m9881D();
                ((C9256o0) d0Var.f3479a).setIsDragging(true);
                this.f29777i.m29577p(true, true);
            }
        }

        @Override
        public void mo9883B(RecyclerView.AbstractC0886d0 d0Var, int i) {
        }

        public final void m9881D() {
            if (this.f29774f == null) {
                this.f29774f = new Paint(5);
                this.f29774f.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, C6879f3.m18692q(), C6879f3.m18691r(), (float[]) null, Shader.TileMode.CLAMP));
                this.f29775g = new Paint(5);
                this.f29775g.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, C6879f3.m18693p(), C6879f3.m18708a(), (float[]) null, Shader.TileMode.CLAMP));
            }
        }

        @Override
        public void mo9880c(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int i;
            super.mo9880c(recyclerView, d0Var);
            int i2 = this.f29772d;
            if (!(i2 == -1 || (i = this.f29773e) == -1 || i2 == i)) {
                C10536ab.m4667o1().m4774M2();
            }
            ((C9256o0) d0Var.f3479a).setIsDragging(false);
            this.f29777i.m29577p(false, true);
            this.f29773e = -1;
            this.f29772d = -1;
        }

        @Override
        public int mo9879k(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            if (!View$OnClickListenerC9218k0.this.f29747C0) {
                return 0;
            }
            int k = d0Var.m39338k();
            int size = C10536ab.m4667o1().m4626z0().size();
            if (size > 1 && k != -1 && k >= 1 && k < size + 1) {
                return C0962g.AbstractC0968f.m38784t(3, 0);
            }
            return 0;
        }

        @Override
        public boolean mo9878r() {
            return false;
        }

        @Override
        public void mo9877u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z) {
            int q;
            super.mo9877u(canvas, recyclerView, d0Var, f, f2, i, z);
            if (d0Var != null) {
                View view = d0Var.f3479a;
                if (view instanceof C9256o0) {
                    C9256o0 o0Var = (C9256o0) view;
                    if (this.f29776h != 0.0f) {
                        int top = o0Var.getTop();
                        int left = o0Var.getLeft();
                        int right = o0Var.getRight();
                        int i2 = (int) (top + f2);
                        int bottom = (int) (o0Var.getBottom() + f2);
                        int i3 = (int) (left + f);
                        int i4 = (int) (right + f);
                        float g0 = C11524j.m183g0();
                        float f0 = C11524j.m186f0();
                        float f3 = 1.0f - f0;
                        if (f3 != 0.0f) {
                            int i5 = (int) (g0 * 255.0f * f3 * this.f29776h);
                            this.f29774f.setAlpha(i5);
                            this.f29775g.setAlpha(i5);
                            canvas.save();
                            canvas.translate(i3, i2 - C6879f3.m18692q());
                            float f4 = i4 - i3;
                            canvas.drawRect(0.0f, 0.0f, f4, C6879f3.m18692q(), this.f29774f);
                            canvas.translate(0.0f, bottom - q);
                            canvas.drawRect(0.0f, 0.0f, f4, C6879f3.m18693p(), this.f29775g);
                            canvas.restore();
                        }
                        if (f0 != 0.0f) {
                            int max = Math.max(1, C1357a0.m37543j(0.5f, 3.0f));
                            int a = C5064d.m24132a(f0 * this.f29776h, C11524j.m223P0());
                            float f5 = i3;
                            float f6 = i4;
                            canvas.drawRect(f5, i2, f6, i2 + max, C1410y.m37042g(a));
                            canvas.drawRect(f5, bottom - max, f6, bottom, C1410y.m37042g(a));
                        }
                    }
                }
            }
        }

        @Override
        public boolean mo9876y(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int i;
            if (!View$OnClickListenerC9218k0.this.f29747C0) {
                return false;
            }
            int k = d0Var.m39338k();
            int k2 = d0Var2.m39338k();
            int size = C10536ab.m4667o1().m4626z0().size();
            if (k < 1 || k >= (i = size + 1) || k2 < 1 || k2 >= i) {
                return false;
            }
            C10536ab.m4667o1().m4715b2(k - 1, k2 - 1);
            if (this.f29772d == -1) {
                this.f29772d = k;
            }
            this.f29773e = k2;
            return true;
        }

        @Override
        public void mo9875z(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            super.mo9875z(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
            d0Var.f3479a.invalidate();
            d0Var2.f3479a.invalidate();
        }
    }

    public class C9224e implements C6957m1.AbstractC6962e {
        public C9224e() {
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
            if (i == R.id.btn_removeAccount) {
                HandlerC10770jj.m3728R7(View$OnClickListenerC9218k0.this, (C11131y6) obj);
            }
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
        }
    }

    public class C9225f extends AnimatorListenerAdapter {
        public C9225f() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC9218k0.this.m9912gg(1.0f);
            View$OnClickListenerC9218k0.this.f29759q0 = false;
            View$OnClickListenerC9218k0.this.m9910hg(true);
        }
    }

    public class C9226g extends AnimatorListenerAdapter {
        public final Runnable f29782a;

        public C9226g(Runnable runnable) {
            this.f29782a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC9218k0.this.m9960Cf();
            View$OnClickListenerC9218k0.this.m9912gg(0.0f);
            View$OnClickListenerC9218k0.this.f29759q0 = false;
            Runnable runnable = this.f29782a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public View$OnClickListenerC9218k0(Context context) {
        super(context, null);
    }

    public void m9956Gf(float f, ValueAnimator valueAnimator) {
        m9912gg(f - (C2057b.m35738a(valueAnimator) * f));
    }

    public void m9955Hf(C10930q6 q6Var, C10930q6.C10946p pVar) {
        if (this.f29745A0 == q6Var) {
            this.f29768z0 = pVar;
            m9897of();
        }
    }

    public void m9954If(final C10930q6 q6Var, final C10930q6.C10946p pVar) {
        if (pVar != null && this.f29768z0 != pVar) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9218k0.this.m9955Hf(q6Var, pVar);
                }
            });
        }
    }

    public void m9953Jf(TdApi.Text text) {
        if (m9957Ff() && !m9347Sa()) {
            m9904kg(text.text);
        }
    }

    public static void m9951Lf(long j) {
        HandlerC10770jj.m3793L2(false, C9386z.f30429a);
    }

    public void m9950Mf(int i) {
        if (i >= 3) {
            this.f30168a.m14409z0().m2485dd().m3394z2(this.f30168a, true, true);
        }
    }

    public void m9949Nf() {
        if (!m9347Sa()) {
            m9897of();
        }
    }

    public void m9948Of(C10930q6 q6Var) {
        if (this.f29745A0 == q6Var) {
            m9893rf();
        }
    }

    public void m9946Pf() {
        if (!m9347Sa()) {
            m9897of();
        }
    }

    public void m9944Qf(float f, float f2, ValueAnimator valueAnimator) {
        m9912gg(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m9942Rf(long j) {
        this.f29752H0 = false;
        m9895pf(0.0f, null);
    }

    public void m9940Sf() {
        AbstractView$OnTouchListenerC7889a aVar = this.f30168a;
        View$OnClickListenerC2928qj qjVar = new View$OnClickListenerC2928qj(aVar, aVar.m14409z0());
        qjVar.m31292zg();
        m9920cg(qjVar);
    }

    public void m9938Tf() {
        this.f29752H0 = false;
        m9895pf(0.0f, null);
    }

    public void m9936Uf(C10930q6 q6Var, long j) {
        this.f29746B0 = false;
        if (this.f29754J0 == 1.0f) {
            m9924ag(q6Var, j);
        }
    }

    public void m9934Vf(final C10930q6 q6Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.f29746B0 = false;
            C1379j0.m37305t0(object);
        } else if (constructor != -1601123095) {
            this.f29746B0 = false;
            Log.unexpectedTdlibResponse(object, TdApi.CreatePrivateChat.class, TdApi.Chat.class);
        } else {
            final long P0 = C4779t2.m25626P0(object);
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9218k0.this.m9936Uf(q6Var, P0);
                }
            });
        }
    }

    public float m9962Af() {
        return this.f29754J0;
    }

    public int m9961Bf() {
        return this.f29756n0;
    }

    @Override
    public void mo61C4(C11131y6 y6Var, int i, int i2) {
        if (this.f29747C0) {
            this.f29762t0.m34117y1(i + 1, i2 + 1);
        }
    }

    public final void m9960Cf() {
        C1399s0.m37186f0(this.f29760r0, 0);
        this.f29760r0.setVisibility(8);
        mo4347s().m14417x2();
    }

    @Override
    public void mo1513D(TdApi.ChatList chatList, boolean z) {
        if (z && this.f29747C0) {
            m9898ng();
        }
    }

    public boolean m9959Df() {
        return this.f29759q0;
    }

    @Override
    public void mo2957E6(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2961a(this, q6Var, session);
    }

    public boolean m9958Ef() {
        AbstractC9323v4<?> F = this.f30168a.m14551P1().m9762F();
        return F != null && F.mo9431Ge();
    }

    public boolean m9957Ff() {
        return this.f29758p0;
    }

    @Override
    public void mo1779G0(boolean z) {
        C11020tb.m1988a(this, z);
    }

    @Override
    public void mo56G2(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        C11008t0.m1995g(this, y6Var, authorizationState, i);
    }

    @Override
    public C6957m1.AbstractC6962e mo9610I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var) {
        C11131y6 y6Var = (C11131y6) ((C2964ra) view.getTag()).m32847d();
        cVar.m23285a(R.id.btn_removeAccount);
        cVar2.m23285a(R.drawable.baseline_delete_forever_24);
        u0Var.m23817a(R.string.LogOut);
        fVar.m18330P(y6Var);
        fVar.m18336J(true);
        fVar.m18329Q(y6Var.mo1480c());
        fVar.m18338H(y6Var.mo1480c().m2519ba());
        return new C9224e();
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        m9896og();
        C9232l0 l0Var = this.f29761s0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        if (i == 0 || i == 1) {
            this.f29762t0.m34254A1();
        } else if (i == 2) {
            this.f29762t0.m34245E1(i2);
        }
    }

    @Override
    public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
        int L0;
        if (!z && this.f29747C0 && (L0 = this.f29762t0.m34231L0(y6Var)) != -1) {
            this.f29762t0.m34127u3(L0);
        }
    }

    @Override
    public void mo2956O5(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2959c(this, q6Var, session);
    }

    @Override
    public void mo47O6(C10930q6 q6Var, boolean z) {
        C11008t0.m1994h(this, q6Var, z);
    }

    @Override
    public void mo4623P4(C4868i.C4880l lVar, boolean z) {
    }

    @Override
    public void mo1778Q2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        this.f30168a.m14409z0().m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9218k0.this.m9946Pf();
            }
        });
    }

    @Override
    public int mo407R9() {
        return R.id.controller_drawer;
    }

    @Override
    public boolean mo136W0() {
        return this.f29754J0 > 0.0f;
    }

    public float m9932Wf() {
        return this.f29756n0 * (1.0f - this.f29754J0);
    }

    @Override
    public void mo2955X0(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2958d(this, q6Var, session);
    }

    public void m9930Xf(C10930q6 q6Var) {
        C10930q6 q6Var2 = this.f29745A0;
        if (q6Var2 != null) {
            q6Var2.m2294pc().m4128c0(this);
            this.f29745A0.m2781K9().m1898V(this);
            this.f29745A0.m2781K9().m1798v0(this);
        }
        this.f29745A0 = q6Var;
        this.f29768z0 = null;
        q6Var.m2294pc().m4125e(this);
        q6Var.m2781K9().m1831n(this);
        q6Var.m2781K9().m1850i0(this);
        m9897of();
        m9893rf();
    }

    public void m9928Yf() {
        AbstractC9323v4<?> t = C1379j0.m37306t(mo4347s());
        if (t != null && t.mo9431Ge() && !t.mo9325Va()) {
            m9914fg();
            m9926Zf(0.0f);
        }
    }

    @Override
    public AbstractC9323v4<?> mo6637Z3(View$OnClickListenerC6902i iVar, float f, float f2) {
        return new View$OnClickListenerC2805o4(this.f30168a, ((C11131y6) ((C2964ra) iVar.getTag()).m32847d()).mo1480c());
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C4868i.m24727c2().m24833N3(this);
        C10536ab.m4667o1().m4716b1().m1531x(this);
        C10536ab.m4667o1().m4716b1().m1529z(this);
    }

    public void m9926Zf(float f) {
        if (!this.f29759q0) {
            this.f29759q0 = true;
            ValueAnimator b = C2057b.m35737b();
            final float wf = m9888wf();
            final float f2 = 1.0f - wf;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View$OnClickListenerC9218k0.this.m9944Qf(wf, f2, valueAnimator);
                }
            });
            b.setDuration(C9270q1.m9701q(m9932Wf(), f, 300, 180));
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9225f());
            AbstractC9323v4<?> t = C1379j0.m37306t(mo4347s());
            View v9 = t != null ? t.get() : null;
            if (v9 == null || !(v9 instanceof C9261p)) {
                this.f29753I0 = null;
            } else {
                this.f29753I0 = (C9261p) v9;
            }
            b.setStartDelay(10L);
            b.start();
        }
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        int N0 = this.f29762t0.m34227N0(R.id.btn_night);
        if (N0 != -1) {
            this.f29762t0.m34211T2(this.f29762t0.m34243F0().get(N0), pVar2.mo94c());
        }
    }

    public final void m9924ag(C10930q6 q6Var, long j) {
        if (j != 0) {
            this.f29752H0 = true;
            q6Var.m2485dd().m3569h7(this.f30168a.m14551P1().m9762F(), j, new HandlerC10770jj.C10780j().m3374b(new AbstractC5920l() {
                @Override
                public final void mo3050a(long j2) {
                    View$OnClickListenerC9218k0.this.m9942Rf(j2);
                }
            }));
        }
    }

    @Override
    public void mo29b1(C11131y6 y6Var, int i) {
        if (this.f29747C0) {
            this.f29762t0.m34150n1(i + 1);
        }
    }

    public final void m9922bg() {
        this.f30168a.m14409z0().m2946A4().m1370u0(this.f30168a, true, new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9218k0.this.m9940Sf();
            }
        });
    }

    @Override
    public void mo2954c3(C10930q6 q6Var, int i) {
        C10904p1.m2960b(this, q6Var, i);
    }

    @Override
    public void mo2953c7(final C10930q6 q6Var, boolean z) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9218k0.this.m9948Of(q6Var);
            }
        });
    }

    public final void m9920cg(AbstractC9323v4<?> v4Var) {
        if (v4Var.mo9270dc()) {
            this.f29752H0 = true;
            v4Var.m9248gd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9218k0.this.m9938Tf();
                }
            });
        }
        C1379j0.m37348W(v4Var);
    }

    @Override
    public boolean mo6636d(View$OnClickListenerC6902i iVar, float f, float f2, AbstractC9323v4<?> v4Var) {
        RecyclerView.AbstractC0886d0 l0;
        if (f2 >= 0.0f) {
            return false;
        }
        if ((v4Var != null && v4Var.m9405Ka()) || (l0 = this.f29763u0.m39421l0(iVar)) == null) {
            return false;
        }
        iVar.m18508R(f, f2);
        this.f29764v0.m38818H(l0);
        return true;
    }

    public final void m9918dg() {
        final C10930q6 z0 = this.f30168a.m14409z0();
        long ba2 = z0.m2519ba();
        if (ba2 != 0) {
            TdApi.Chat U2 = z0.m2632U2(C7316a.m17058c(ba2));
            if (U2 != null) {
                m9924ag(z0, U2.f25370id);
            } else if (!this.f29746B0) {
                this.f29746B0 = true;
                z0.m2270r4().m14783o(new TdApi.CreatePrivateChat(ba2, true), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC9218k0.this.m9934Vf(z0, object);
                    }
                });
            }
        }
    }

    @Override
    public boolean mo6635e2(View$OnClickListenerC6902i iVar, float f, float f2) {
        C11131y6 y6Var = (C11131y6) ((C2964ra) iVar.getTag()).m32847d();
        return y6Var.f35708b != y6Var.m1468i().m4632x2();
    }

    public final void m9916eg() {
        AbstractView$OnTouchListenerC7889a aVar = this.f30168a;
        m9920cg(new View$OnClickListenerC3217vt(aVar, aVar.m14409z0()));
    }

    public boolean m9914fg() {
        if ((!m9958Ef() && !this.f29758p0) || this.f29759q0) {
            return false;
        }
        m9902lg();
        if (this.f29758p0) {
            return true;
        }
        mo4347s().m14532U0().setAlpha(0.0f);
        if (C4403w.m27986G2()) {
            this.f29760r0.setTranslationX(m9887xf());
            return true;
        }
        this.f29760r0.setTranslationX(-this.f29756n0);
        return true;
    }

    @Override
    public void mo1777g(String str, TdApi.LanguagePackInfo languagePackInfo) {
        C11020tb.m1984e(this, str, languagePackInfo);
    }

    @Override
    public void mo4622g7(boolean z) {
        if (this.f29766x0 != z) {
            this.f29766x0 = z;
            if (z) {
                this.f29762t0.m34132t0(this.f29762t0.m34221Q0(R.id.btn_help), this.f29765w0);
                return;
            }
            this.f29762t0.m34150n1(this.f29762t0.m34227N0(R.id.btn_proxy));
        }
    }

    public void m9912gg(float f) {
        float f2;
        float f3;
        if (this.f29754J0 != f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0 && this.f29763u0.getItemAnimator() != null) {
                this.f29763u0.setItemAnimator(null);
            } else if (i > 0 && this.f29763u0.getItemAnimator() == null) {
                this.f29763u0.setItemAnimator(this.f29755K0);
                m9897of();
            }
            m9899nf();
            if (C4403w.m27986G2()) {
                float xf = m9887xf();
                int i2 = this.f29756n0;
                int i3 = this.f29757o0;
                f2 = xf - ((i2 - i3) * f);
                f3 = xf - ((i2 - i3) * this.f29754J0);
            } else {
                int i4 = this.f29756n0;
                f2 = (-i4) * (1.0f - f);
                f3 = (-i4) * (1.0f - this.f29754J0);
            }
            if (i == 0 || f == 1.0f || Math.abs(f3 - f2) >= 1.0f) {
                this.f29754J0 = f;
                C9356x1 U0 = mo4347s().m14532U0();
                this.f29760r0.setTranslationX(f2);
                if (U0 != null) {
                    U0.setAlpha(0.6f * f);
                }
                C9261p pVar = this.f29753I0;
                if (pVar != null) {
                    pVar.setClipLeft((int) (this.f29756n0 * f));
                }
                if (i == 0 && !C5070i.m24062i(this.f29751G0)) {
                    m9904kg(this.f29751G0);
                }
            }
        }
    }

    public final void m9910hg(boolean z) {
        this.f29758p0 = z;
    }

    public final void m9908ig(boolean z) {
        if (this.f29765w0.m32876D() != z) {
            if (!this.f29766x0) {
                this.f29765w0.m32861S(z);
            } else if (this.f29754J0 > 0.0f) {
                this.f29762t0.m34211T2(this.f29765w0, z);
            } else {
                this.f29765w0.m32861S(z);
                this.f29762t0.m34133s3(this.f29765w0.m32838j());
            }
        }
    }

    public void m9906jg(boolean z) {
        if (this.f29747C0 != z) {
            this.f29747C0 = z;
            C4868i.m24727c2().m24725c4(z);
            if (z) {
                ArrayList arrayList = new ArrayList();
                m9892sf(arrayList);
                this.f29762t0.m34243F0().addAll(1, arrayList);
                this.f29762t0.m39311M(1, arrayList.size());
                return;
            }
            this.f29762t0.m34207V1(1, this.f29762t0.m34227N0(R.id.btn_contacts) - 1);
        }
    }

    @Override
    public void mo4621k3(int i, String str, int i2, TdApi.ProxyType proxyType, String str2, boolean z, boolean z2) {
        if (z) {
            boolean z3 = i != 0;
            if (this.f29765w0.m32876D() != z3) {
                m9908ig(z3);
            }
        }
    }

    public final void m9904kg(String str) {
        if (this.f29754J0 != 0.0f) {
            this.f29751G0 = str;
            m9895pf(0.0f, null);
            return;
        }
        this.f29751G0 = null;
        C1405v.m37131O(str);
    }

    public final void m9902lg() {
        C9270q1 q1Var = this.f30161T;
        if (q1Var != null) {
            q1Var.m9691v0();
        }
        C1399s0.m37186f0(this.f29760r0, 2);
        this.f29760r0.setVisibility(0);
        mo4347s().m14406z3(-16777216, 2);
        C9270q1 q1Var2 = this.f30161T;
        if (q1Var2 != null) {
            q1Var2.m9700r();
        }
    }

    @Override
    public void mo1512m(C10930q6 q6Var, TdApi.ChatList chatList, int i, boolean z) {
        int L0;
        if (this.f29747C0 && (L0 = this.f29762t0.m34231L0(q6Var.m2949A1())) != -1) {
            this.f29762t0.m34127u3(L0);
        }
    }

    public void m9900mg(int i) {
        float f;
        int i2;
        if (!C4403w.m27986G2()) {
            if (this.f29758p0) {
                i2 = this.f29756n0 + i;
                f = i2;
            }
            f = i;
        } else if (this.f29758p0) {
            i2 = this.f29756n0 - i;
            f = i2;
        } else {
            i = -i;
            f = i;
        }
        m9912gg(C5069h.m24090d(f / this.f29756n0));
    }

    public final void m9899nf() {
        AbstractRunnableC5910b bVar = this.f29748D0;
        if (bVar != null) {
            bVar.m21858c();
            this.f29748D0 = null;
        }
    }

    public final void m9898ng() {
        List<C2964ra> F0 = this.f29762t0.m34243F0();
        int i = 0;
        while (true) {
            i++;
            if (i < F0.size() && F0.get(i).m32838j() == R.id.account) {
                this.f29762t0.m34127u3(i);
            } else {
                return;
            }
        }
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        m9897of();
    }

    @Override
    public View mo403oc(Context context) {
        this.f29757o0 = C1357a0.m37544i(7.0f);
        this.f29756n0 = Math.min(C1357a0.m37556B() - C1357a0.m37544i(56.0f), C1357a0.m37544i(300.0f)) + this.f29757o0;
        C9219a aVar = new C9219a(context);
        this.f29760r0 = aVar;
        aVar.setVisibility(8);
        this.f29760r0.setTranslationX(-this.f29756n0);
        this.f29760r0.setLayoutParams(FrameLayoutFix.m18007t1(this.f29756n0, -1, 3));
        C6879f3 f3Var = new C6879f3(context);
        f3Var.setSimpleRightShadow(false);
        f3Var.setLayoutParams(FrameLayoutFix.m18007t1(this.f29757o0, -1, 5));
        m9163t8(f3Var);
        this.f29760r0.addView(f3Var);
        C9232l0 l0Var = new C9232l0(context, this);
        this.f29761s0 = l0Var;
        m9163t8(l0Var);
        this.f29761s0.setLayoutParams(FrameLayoutFix.m18007t1(this.f29756n0 - this.f29757o0, C1357a0.m37544i(148.0f) + View$OnClickListenerC9170d1.getTopOffset(), 48));
        this.f29760r0.addView(this.f29761s0);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(this.f29756n0 - this.f29757o0, -1);
        s1.setMargins(0, C1357a0.m37544i(148.0f) + View$OnClickListenerC9170d1.getTopOffset(), 0, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(78));
        boolean d2 = C4868i.m24727c2().m24719d2();
        this.f29747C0 = d2;
        if (d2) {
            m9892sf(arrayList);
            this.f29761s0.getExpanderView().m18730c(true, false);
        }
        arrayList.add(new C2964ra(79, R.id.btn_contacts, R.drawable.baseline_perm_contact_calendar_24, R.string.Contacts));
        arrayList.add(new C2964ra(79, R.id.btn_savedMessages, R.drawable.baseline_bookmark_24, R.string.SavedMessages));
        this.f29767y0 = m9886yf();
        arrayList.add(new C2964ra(79, R.id.btn_settings, R.drawable.baseline_settings_24, R.string.Settings));
        arrayList.add(new C2964ra(79, R.id.btn_invite, R.drawable.baseline_person_add_24, R.string.InviteFriends));
        boolean z = C4868i.m24727c2().m24665k0() > 0;
        this.f29766x0 = z;
        if (z) {
            this.f29765w0.m32861S(C4868i.m24727c2().m24878H0() != 0);
            arrayList.add(this.f29765w0);
        }
        arrayList.add(new C2964ra(79, R.id.btn_help, R.drawable.baseline_help_24, R.string.Help));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(80, (int) R.id.btn_night, (int) R.drawable.baseline_brightness_2_24, (int) R.string.NightMode, (int) R.id.btn_night, C11524j.m141z0()));
        if (C4868i.m24727c2().m24751Z1()) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(79, (int) R.id.btn_tdlib_clearLogs, (int) R.drawable.baseline_bug_report_24, (CharSequence) "Clear TDLib logs", false));
            arrayList.add(new C2964ra(79, (int) R.id.btn_tdlib_shareLogs, (int) R.drawable.baseline_bug_report_24, (CharSequence) "Send TDLib log", false));
        }
        C9220b bVar = new C9220b(this);
        this.f29762t0 = bVar;
        bVar.m34241F2(this);
        this.f29762t0.m34119x2(arrayList, true);
        RecyclerView recyclerView = new RecyclerView(context);
        this.f29763u0 = recyclerView;
        recyclerView.m39437g(new C9221c());
        this.f29763u0.setItemAnimator(null);
        this.f29763u0.setOverScrollMode(1);
        C10192g.m5782i(this.f29763u0, R.id.theme_color_filling, this);
        m9191p8(this.f29763u0);
        this.f29763u0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f29763u0.setAdapter(this.f29762t0);
        this.f29763u0.setLayoutParams(s1);
        this.f29760r0.addView(this.f29763u0);
        C0962g gVar = new C0962g(new C9222d());
        this.f29764v0 = gVar;
        gVar.m38812m(this.f29763u0);
        C4868i.m24727c2().m24610r(this);
        C10536ab.m4667o1().m4716b1().m1554a(this);
        C10536ab.m4667o1().m4716b1().m1551d(this);
        return this.f29760r0;
    }

    public void m9897of() {
        int N0;
        int yf = m9886yf();
        if (this.f29767y0 != yf) {
            this.f29767y0 = yf;
            C2546iq iqVar = this.f29762t0;
            if (iqVar != null && (N0 = iqVar.m34227N0(R.id.btn_settings)) != -1) {
                this.f29762t0.m39315I(N0);
            }
        }
    }

    public final void m9896og() {
        float f = this.f29754J0;
        if (f != 0.0f) {
            this.f29754J0 = 0.0f;
            m9912gg(f);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.account:
                C11131y6 y6Var = (C11131y6) ((C2964ra) view.getTag()).m32847d();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (y6Var.m1468i().m4632x2() != y6Var.f35708b) {
                    long j = this.f29750F0;
                    if (j == 0 || uptimeMillis - j >= 720) {
                        this.f29750F0 = uptimeMillis;
                        this.f29749E0 = true;
                        y6Var.m1468i().m4709d0(y6Var.f35708b, 2);
                        return;
                    }
                    return;
                }
                return;
            case R.id.btn_addAccount:
                this.f30168a.m14409z0().m2485dd().m3394z2(this.f30168a, true, false);
                return;
            case R.id.btn_bubble:
                mo4347s().m14409z0().m2294pc().m4094t0();
                return;
            case R.id.btn_contacts:
                m9922bg();
                return;
            case R.id.btn_help:
                m9899nf();
                this.f29748D0 = this.f30168a.m14409z0().m2485dd().m3878C7(this.f30168a.m14551P1().m9762F());
                return;
            case R.id.btn_invite:
                this.f30168a.m14409z0().m2480e2().m1632j0(new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC9218k0.this.m9953Jf((TdApi.Text) obj);
                    }
                });
                return;
            case R.id.btn_night:
                C11541z.m7t().m27c0();
                return;
            case R.id.btn_proxy:
                if (view instanceof C9139d) {
                    m9908ig(C4868i.m24727c2().m24699f6(1));
                    return;
                } else {
                    this.f30168a.m14409z0().m2485dd().m3409x7(this.f30168a.m14551P1().m9762F(), false);
                    return;
                }
            case R.id.btn_savedMessages:
                m9918dg();
                return;
            case R.id.btn_settings:
                m9916eg();
                return;
            case R.id.btn_tdlib_clearLogs:
                HandlerC10770jj.m3793L2(true, C9380y.f30417a);
                return;
            case R.id.btn_tdlib_shareLogs:
                HandlerC10770jj.m3648Z7(this.f30168a.m14551P1().m9762F(), false, false);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        RecyclerView.AbstractC0886d0 l0;
        C2964ra raVar;
        if (!(view instanceof View$OnClickListenerC6902i) || (l0 = this.f29763u0.m39421l0(view)) == null || (raVar = (C2964ra) view.getTag()) == null) {
            return false;
        }
        if (raVar.m32838j() != R.id.account) {
            if (raVar.m32838j() == R.id.btn_addAccount) {
                this.f30168a.m14409z0().m2476e6(new AbstractC5919k() {
                    @Override
                    public final void mo3250a(int i) {
                        View$OnClickListenerC9218k0.this.m9950Mf(i);
                    }
                });
            }
            return false;
        } else if (mo6635e2((View$OnClickListenerC6902i) view, 0.0f, 0.0f)) {
            return false;
        } else {
            this.f29764v0.m38818H(l0);
            return false;
        }
    }

    @Override
    public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        int L0;
        if (this.f29747C0 && (L0 = this.f29762t0.m34231L0(y6Var)) != -1) {
            this.f29762t0.m34127u3(L0);
        }
    }

    @Override
    public void mo11p6(C11131y6 y6Var, int i) {
        if (this.f29747C0) {
            this.f29762t0.m34132t0(i + 1, new C2964ra(81, R.id.account).m32866N(y6Var.f35708b).m32873G(y6Var));
        }
    }

    public void m9895pf(float f, Runnable runnable) {
        if (!this.f29759q0 && !this.f29752H0) {
            this.f29759q0 = true;
            if (this.f29754J0 == 0.0f) {
                m9891tf();
                return;
            }
            ValueAnimator b = C2057b.m35737b();
            final float wf = m9888wf();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View$OnClickListenerC9218k0.this.m9956Gf(wf, valueAnimator);
                }
            });
            b.setDuration(C9270q1.m9701q(this.f29756n0 + m9932Wf(), f, 300, 180));
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9226g(runnable));
            m9910hg(false);
            if (this.f29749E0) {
                this.f29749E0 = false;
                b.setStartDelay(290L);
            } else {
                b.setStartDelay(10L);
            }
            b.start();
        }
    }

    @Override
    public void mo1776q3(boolean z) {
        C11020tb.m1987b(this, z);
    }

    public void m9894qf() {
        if (this.f29754J0 < 0.4f) {
            m9910hg(true);
            m9895pf(0.0f, null);
            return;
        }
        m9910hg(false);
        m9926Zf(0.0f);
    }

    @Override
    public void mo4078r3(C10930q6 q6Var, boolean z) {
        q6Var.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9218k0.this.m9949Nf();
            }
        });
    }

    @Override
    public void mo1775r7(boolean z) {
        C11020tb.m1983f(this, z);
    }

    public final void m9893rf() {
        final C10930q6 q6Var = this.f29745A0;
        if (q6Var != null) {
            q6Var.m2569Y5(true, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC9218k0.this.m9954If(q6Var, (C10930q6.C10946p) obj);
                }
            });
        }
    }

    public final void m9892sf(List<C2964ra> list) {
        Iterator<C11131y6> it = C10536ab.m4667o1().m4626z0().iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            list.add(new C2964ra(81, R.id.account).m32866N(next.f35708b).m32873G(next));
        }
        list.add(new C2964ra(79, R.id.btn_addAccount, R.drawable.baseline_add_24, R.string.AddAccount));
        list.add(new C2964ra(11));
    }

    @Override
    public void mo1774t4(boolean z) {
        C11020tb.m1986c(this, z);
    }

    public final void m9891tf() {
        m9910hg(false);
        this.f29759q0 = false;
        m9912gg(0.0f);
        m9960Cf();
    }

    public void m9890uf() {
        if (this.f29754J0 < 0.4f) {
            m9891tf();
        } else {
            m9889vf();
        }
    }

    @Override
    public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        if (y6Var2 != null) {
            this.f29762t0.m34136r3(y6Var2);
        }
        this.f29762t0.m34136r3(y6Var);
        m9897of();
    }

    public final void m9889vf() {
        m9910hg(true);
        this.f29759q0 = false;
        m9912gg(1.0f);
    }

    public float m9888wf() {
        return this.f29754J0;
    }

    public final float m9887xf() {
        return this.f30168a.m14551P1().get().getMeasuredWidth();
    }

    public final int m9886yf() {
        int Z0 = this.f30168a.m14516Z0();
        C10930q6.C10946p pVar = this.f29768z0;
        boolean z = pVar != null && pVar.f35178c.length > 0;
        if (Z0 != 0 && z) {
            return C10930q6.f34960B2;
        }
        if (Z0 != 0) {
            return Z0;
        }
        if (z) {
            return C10930q6.f34960B2;
        }
        return 0;
    }

    public int m9885zf() {
        return this.f29757o0;
    }
}
