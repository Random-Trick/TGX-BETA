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
    public C10930q6 f29742A0;
    public boolean f29743B0;
    public boolean f29744C0;
    public AbstractRunnableC5910b f29745D0;
    public boolean f29746E0;
    public long f29747F0;
    public String f29748G0;
    public boolean f29749H0;
    public C9261p f29750I0;
    public float f29751J0;
    public int f29753n0;
    public int f29754o0;
    public boolean f29755p0;
    public boolean f29756q0;
    public FrameLayoutFix f29757r0;
    public C9232l0 f29758s0;
    public C2546iq f29759t0;
    public RecyclerView f29760u0;
    public C0962g f29761v0;
    public boolean f29763x0;
    public int f29764y0;
    public C10930q6.C10946p f29765z0;
    public final C2964ra f29762w0 = new C2964ra(88, R.id.btn_proxy, R.drawable.baseline_security_24, R.string.Proxy);
    public final RecyclerView.AbstractC0896m f29752K0 = new C8731d(C2057b.f7280b, 160);

    public class C9219a extends C9296t {
        public C9219a(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC9218k0.this.m9897og();
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
            boolean z3 = z && View$OnClickListenerC9218k0.this.f29751J0 > 0.0f;
            int j = raVar.m32835j();
            if (j == R.id.account) {
                C11131y6 y6Var = (C11131y6) raVar.m32844d();
                C11164z6 x = y6Var.m1452x();
                if (y6Var.f35705b != y6Var.m1468i().m4632x2()) {
                    z2 = false;
                }
                o0Var.m9787c1(z2, z3);
                o0Var.m9783i1(x.m1328b(), x.m1327c(), z3);
                o0Var.m9788W0(y6Var.m1462n(), y6Var.m1463m(false));
                o0Var.setText(C4403w.m27834r0(y6Var.m1455u(), y6Var.m1504G()));
                o0Var.setCustomControllerProvider(View$OnClickListenerC9218k0.this);
                o0Var.setPreviewActionListProvider(View$OnClickListenerC9218k0.this);
            } else if (j != R.id.btn_settings) {
                o0Var.m9786d1(false, 0, z3);
            } else {
                if (View$OnClickListenerC9218k0.this.f29764y0 == 0) {
                    z2 = false;
                }
                if (View$OnClickListenerC9218k0.this.f29764y0 != C10930q6.f34957B2) {
                    i = View$OnClickListenerC9218k0.this.f29764y0;
                }
                o0Var.m9786d1(z2, i, z3);
            }
        }
    }

    public class C9221c extends RecyclerView.AbstractC0901o {
        public C9221c() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            RecyclerView.AbstractC0886d0 l0 = recyclerView.m39418l0(view);
            if (l0 == null || l0.m39332n() != 11) {
                rect.bottom = 0;
                rect.top = 0;
                return;
            }
            int i = C1357a0.m37541i(8.0f);
            rect.bottom = i;
            rect.top = i;
        }
    }

    public class C9222d extends C0962g.AbstractC0968f {
        public Paint f29771f;
        public Paint f29772g;
        public float f29773h;
        public int f29769d = -1;
        public int f29770e = -1;
        public final C3940f f29774i = new C3940f(0, new C9223a(), C2057b.f7280b, 280);

        public class C9223a implements C3950k.AbstractC3952b {
            public C9223a() {
            }

            @Override
            public void mo45P5(int i, float f, float f2, C3950k kVar) {
                C9222d.this.f29773h = f;
                View$OnClickListenerC9218k0.this.f29760u0.invalidate();
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
            }
        }

        public C9222d() {
        }

        @Override
        public void mo9885A(RecyclerView.AbstractC0886d0 d0Var, int i) {
            super.mo9885A(d0Var, i);
            if (i == 2) {
                m9882D();
                ((C9256o0) d0Var.f3479a).setIsDragging(true);
                this.f29774i.m29575p(true, true);
            }
        }

        @Override
        public void mo9884B(RecyclerView.AbstractC0886d0 d0Var, int i) {
        }

        public final void m9882D() {
            if (this.f29771f == null) {
                this.f29771f = new Paint(5);
                this.f29771f.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, C6879f3.m18691q(), C6879f3.m18690r(), (float[]) null, Shader.TileMode.CLAMP));
                this.f29772g = new Paint(5);
                this.f29772g.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, C6879f3.m18692p(), C6879f3.m18707a(), (float[]) null, Shader.TileMode.CLAMP));
            }
        }

        @Override
        public void mo9881c(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int i;
            super.mo9881c(recyclerView, d0Var);
            int i2 = this.f29769d;
            if (!(i2 == -1 || (i = this.f29770e) == -1 || i2 == i)) {
                C10536ab.m4667o1().m4774M2();
            }
            ((C9256o0) d0Var.f3479a).setIsDragging(false);
            this.f29774i.m29575p(false, true);
            this.f29770e = -1;
            this.f29769d = -1;
        }

        @Override
        public int mo9880k(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            if (!View$OnClickListenerC9218k0.this.f29744C0) {
                return 0;
            }
            int k = d0Var.m39335k();
            int size = C10536ab.m4667o1().m4626z0().size();
            if (size > 1 && k != -1 && k >= 1 && k < size + 1) {
                return C0962g.AbstractC0968f.m38781t(3, 0);
            }
            return 0;
        }

        @Override
        public boolean mo9879r() {
            return false;
        }

        @Override
        public void mo9878u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z) {
            int q;
            super.mo9878u(canvas, recyclerView, d0Var, f, f2, i, z);
            if (d0Var != null) {
                View view = d0Var.f3479a;
                if (view instanceof C9256o0) {
                    C9256o0 o0Var = (C9256o0) view;
                    if (this.f29773h != 0.0f) {
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
                            int i5 = (int) (g0 * 255.0f * f3 * this.f29773h);
                            this.f29771f.setAlpha(i5);
                            this.f29772g.setAlpha(i5);
                            canvas.save();
                            canvas.translate(i3, i2 - C6879f3.m18691q());
                            float f4 = i4 - i3;
                            canvas.drawRect(0.0f, 0.0f, f4, C6879f3.m18691q(), this.f29771f);
                            canvas.translate(0.0f, bottom - q);
                            canvas.drawRect(0.0f, 0.0f, f4, C6879f3.m18692p(), this.f29772g);
                            canvas.restore();
                        }
                        if (f0 != 0.0f) {
                            int max = Math.max(1, C1357a0.m37540j(0.5f, 3.0f));
                            int a = C5064d.m24131a(f0 * this.f29773h, C11524j.m223P0());
                            float f5 = i3;
                            float f6 = i4;
                            canvas.drawRect(f5, i2, f6, i2 + max, C1410y.m37039g(a));
                            canvas.drawRect(f5, bottom - max, f6, bottom, C1410y.m37039g(a));
                        }
                    }
                }
            }
        }

        @Override
        public boolean mo9877y(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int i;
            if (!View$OnClickListenerC9218k0.this.f29744C0) {
                return false;
            }
            int k = d0Var.m39335k();
            int k2 = d0Var2.m39335k();
            int size = C10536ab.m4667o1().m4626z0().size();
            if (k < 1 || k >= (i = size + 1) || k2 < 1 || k2 >= i) {
                return false;
            }
            C10536ab.m4667o1().m4715b2(k - 1, k2 - 1);
            if (this.f29769d == -1) {
                this.f29769d = k;
            }
            this.f29770e = k2;
            return true;
        }

        @Override
        public void mo9876z(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            super.mo9876z(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
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
            View$OnClickListenerC9218k0.this.m9913gg(1.0f);
            View$OnClickListenerC9218k0.this.f29756q0 = false;
            View$OnClickListenerC9218k0.this.m9911hg(true);
        }
    }

    public class C9226g extends AnimatorListenerAdapter {
        public final Runnable f29779a;

        public C9226g(Runnable runnable) {
            this.f29779a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC9218k0.this.m9961Cf();
            View$OnClickListenerC9218k0.this.m9913gg(0.0f);
            View$OnClickListenerC9218k0.this.f29756q0 = false;
            Runnable runnable = this.f29779a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public View$OnClickListenerC9218k0(Context context) {
        super(context, null);
    }

    public void m9957Gf(float f, ValueAnimator valueAnimator) {
        m9913gg(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public void m9956Hf(C10930q6 q6Var, C10930q6.C10946p pVar) {
        if (this.f29742A0 == q6Var) {
            this.f29765z0 = pVar;
            m9898of();
        }
    }

    public void m9955If(final C10930q6 q6Var, final C10930q6.C10946p pVar) {
        if (pVar != null && this.f29765z0 != pVar) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9218k0.this.m9956Hf(q6Var, pVar);
                }
            });
        }
    }

    public void m9954Jf(TdApi.Text text) {
        if (m9958Ff() && !m9347Sa()) {
            m9905kg(text.text);
        }
    }

    public static void m9952Lf(long j) {
        HandlerC10770jj.m3793L2(false, C9386z.f30426a);
    }

    public void m9951Mf(int i) {
        if (i >= 3) {
            this.f30165a.m14410z0().m2485dd().m3394z2(this.f30165a, true, true);
        }
    }

    public void m9950Nf() {
        if (!m9347Sa()) {
            m9898of();
        }
    }

    public void m9949Of(C10930q6 q6Var) {
        if (this.f29742A0 == q6Var) {
            m9894rf();
        }
    }

    public void m9947Pf() {
        if (!m9347Sa()) {
            m9898of();
        }
    }

    public void m9945Qf(float f, float f2, ValueAnimator valueAnimator) {
        m9913gg(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m9943Rf(long j) {
        this.f29749H0 = false;
        m9896pf(0.0f, null);
    }

    public void m9941Sf() {
        AbstractView$OnTouchListenerC7889a aVar = this.f30165a;
        View$OnClickListenerC2928qj qjVar = new View$OnClickListenerC2928qj(aVar, aVar.m14410z0());
        qjVar.m31290zg();
        m9921cg(qjVar);
    }

    public void m9939Tf() {
        this.f29749H0 = false;
        m9896pf(0.0f, null);
    }

    public void m9937Uf(C10930q6 q6Var, long j) {
        this.f29743B0 = false;
        if (this.f29751J0 == 1.0f) {
            m9925ag(q6Var, j);
        }
    }

    public void m9935Vf(final C10930q6 q6Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.f29743B0 = false;
            C1379j0.m37302t0(object);
        } else if (constructor != -1601123095) {
            this.f29743B0 = false;
            Log.unexpectedTdlibResponse(object, TdApi.CreatePrivateChat.class, TdApi.Chat.class);
        } else {
            final long P0 = C4779t2.m25625P0(object);
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9218k0.this.m9937Uf(q6Var, P0);
                }
            });
        }
    }

    public float m9963Af() {
        return this.f29751J0;
    }

    public int m9962Bf() {
        return this.f29753n0;
    }

    @Override
    public void mo61C4(C11131y6 y6Var, int i, int i2) {
        if (this.f29744C0) {
            this.f29759t0.m34114y1(i + 1, i2 + 1);
        }
    }

    public final void m9961Cf() {
        C1399s0.m37183f0(this.f29757r0, 0);
        this.f29757r0.setVisibility(8);
        mo4347s().m14418x2();
    }

    @Override
    public void mo1513D(TdApi.ChatList chatList, boolean z) {
        if (z && this.f29744C0) {
            m9899ng();
        }
    }

    public boolean m9960Df() {
        return this.f29756q0;
    }

    @Override
    public void mo2957E6(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2961a(this, q6Var, session);
    }

    public boolean m9959Ef() {
        AbstractC9323v4<?> F = this.f30165a.m14552P1().m9763F();
        return F != null && F.mo9431Ge();
    }

    public boolean m9958Ff() {
        return this.f29755p0;
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
    public C6957m1.AbstractC6962e mo9611I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var) {
        C11131y6 y6Var = (C11131y6) ((C2964ra) view.getTag()).m32844d();
        cVar.m23284a(R.id.btn_removeAccount);
        cVar2.m23284a(R.drawable.baseline_delete_forever_24);
        u0Var.m23816a(R.string.LogOut);
        fVar.m18330P(y6Var);
        fVar.m18336J(true);
        fVar.m18329Q(y6Var.mo1480c());
        fVar.m18338H(y6Var.mo1480c().m2519ba());
        return new C9224e();
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        m9897og();
        C9232l0 l0Var = this.f29758s0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        if (i == 0 || i == 1) {
            this.f29759t0.m34251A1();
        } else if (i == 2) {
            this.f29759t0.m34242E1(i2);
        }
    }

    @Override
    public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
        int L0;
        if (!z && this.f29744C0 && (L0 = this.f29759t0.m34228L0(y6Var)) != -1) {
            this.f29759t0.m34124u3(L0);
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
        this.f30165a.m14410z0().m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9218k0.this.m9947Pf();
            }
        });
    }

    @Override
    public int mo407R9() {
        return R.id.controller_drawer;
    }

    @Override
    public boolean mo136W0() {
        return this.f29751J0 > 0.0f;
    }

    public float m9933Wf() {
        return this.f29753n0 * (1.0f - this.f29751J0);
    }

    @Override
    public void mo2955X0(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2958d(this, q6Var, session);
    }

    public void m9931Xf(C10930q6 q6Var) {
        C10930q6 q6Var2 = this.f29742A0;
        if (q6Var2 != null) {
            q6Var2.m2294pc().m4128c0(this);
            this.f29742A0.m2781K9().m1898V(this);
            this.f29742A0.m2781K9().m1798v0(this);
        }
        this.f29742A0 = q6Var;
        this.f29765z0 = null;
        q6Var.m2294pc().m4125e(this);
        q6Var.m2781K9().m1831n(this);
        q6Var.m2781K9().m1850i0(this);
        m9898of();
        m9894rf();
    }

    public void m9929Yf() {
        AbstractC9323v4<?> t = C1379j0.m37303t(mo4347s());
        if (t != null && t.mo9431Ge() && !t.mo9325Va()) {
            m9915fg();
            m9927Zf(0.0f);
        }
    }

    @Override
    public AbstractC9323v4<?> mo6637Z3(View$OnClickListenerC6902i iVar, float f, float f2) {
        return new View$OnClickListenerC2805o4(this.f30165a, ((C11131y6) ((C2964ra) iVar.getTag()).m32844d()).mo1480c());
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C4868i.m24726c2().m24832N3(this);
        C10536ab.m4667o1().m4716b1().m1531x(this);
        C10536ab.m4667o1().m4716b1().m1529z(this);
    }

    public void m9927Zf(float f) {
        if (!this.f29756q0) {
            this.f29756q0 = true;
            ValueAnimator b = C2057b.m35734b();
            final float wf = m9889wf();
            final float f2 = 1.0f - wf;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View$OnClickListenerC9218k0.this.m9945Qf(wf, f2, valueAnimator);
                }
            });
            b.setDuration(C9270q1.m9702q(m9933Wf(), f, 300, 180));
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9225f());
            AbstractC9323v4<?> t = C1379j0.m37303t(mo4347s());
            View v9 = t != null ? t.get() : null;
            if (v9 == null || !(v9 instanceof C9261p)) {
                this.f29750I0 = null;
            } else {
                this.f29750I0 = (C9261p) v9;
            }
            b.setStartDelay(10L);
            b.start();
        }
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        int N0 = this.f29759t0.m34224N0(R.id.btn_night);
        if (N0 != -1) {
            this.f29759t0.m34208T2(this.f29759t0.m34240F0().get(N0), pVar2.mo94c());
        }
    }

    public final void m9925ag(C10930q6 q6Var, long j) {
        if (j != 0) {
            this.f29749H0 = true;
            q6Var.m2485dd().m3569h7(this.f30165a.m14552P1().m9763F(), j, new HandlerC10770jj.C10780j().m3374b(new AbstractC5920l() {
                @Override
                public final void mo3050a(long j2) {
                    View$OnClickListenerC9218k0.this.m9943Rf(j2);
                }
            }));
        }
    }

    @Override
    public void mo29b1(C11131y6 y6Var, int i) {
        if (this.f29744C0) {
            this.f29759t0.m34147n1(i + 1);
        }
    }

    public final void m9923bg() {
        this.f30165a.m14410z0().m2946A4().m1370u0(this.f30165a, true, new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9218k0.this.m9941Sf();
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
                View$OnClickListenerC9218k0.this.m9949Of(q6Var);
            }
        });
    }

    public final void m9921cg(AbstractC9323v4<?> v4Var) {
        if (v4Var.mo9270dc()) {
            this.f29749H0 = true;
            v4Var.m9248gd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9218k0.this.m9939Tf();
                }
            });
        }
        C1379j0.m37345W(v4Var);
    }

    @Override
    public boolean mo6636d(View$OnClickListenerC6902i iVar, float f, float f2, AbstractC9323v4<?> v4Var) {
        RecyclerView.AbstractC0886d0 l0;
        if (f2 >= 0.0f) {
            return false;
        }
        if ((v4Var != null && v4Var.m9405Ka()) || (l0 = this.f29760u0.m39418l0(iVar)) == null) {
            return false;
        }
        iVar.m18508R(f, f2);
        this.f29761v0.m38815H(l0);
        return true;
    }

    public final void m9919dg() {
        final C10930q6 z0 = this.f30165a.m14410z0();
        long ba2 = z0.m2519ba();
        if (ba2 != 0) {
            TdApi.Chat U2 = z0.m2632U2(C7316a.m17058c(ba2));
            if (U2 != null) {
                m9925ag(z0, U2.f25367id);
            } else if (!this.f29743B0) {
                this.f29743B0 = true;
                z0.m2270r4().m14783o(new TdApi.CreatePrivateChat(ba2, true), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC9218k0.this.m9935Vf(z0, object);
                    }
                });
            }
        }
    }

    @Override
    public boolean mo6635e2(View$OnClickListenerC6902i iVar, float f, float f2) {
        C11131y6 y6Var = (C11131y6) ((C2964ra) iVar.getTag()).m32844d();
        return y6Var.f35705b != y6Var.m1468i().m4632x2();
    }

    public final void m9917eg() {
        AbstractView$OnTouchListenerC7889a aVar = this.f30165a;
        m9921cg(new View$OnClickListenerC3217vt(aVar, aVar.m14410z0()));
    }

    public boolean m9915fg() {
        if ((!m9959Ef() && !this.f29755p0) || this.f29756q0) {
            return false;
        }
        m9903lg();
        if (this.f29755p0) {
            return true;
        }
        mo4347s().m14533U0().setAlpha(0.0f);
        if (C4403w.m27984G2()) {
            this.f29757r0.setTranslationX(m9888xf());
            return true;
        }
        this.f29757r0.setTranslationX(-this.f29753n0);
        return true;
    }

    @Override
    public void mo1777g(String str, TdApi.LanguagePackInfo languagePackInfo) {
        C11020tb.m1984e(this, str, languagePackInfo);
    }

    @Override
    public void mo4622g7(boolean z) {
        if (this.f29763x0 != z) {
            this.f29763x0 = z;
            if (z) {
                this.f29759t0.m34129t0(this.f29759t0.m34218Q0(R.id.btn_help), this.f29762w0);
                return;
            }
            this.f29759t0.m34147n1(this.f29759t0.m34224N0(R.id.btn_proxy));
        }
    }

    public void m9913gg(float f) {
        float f2;
        float f3;
        if (this.f29751J0 != f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0 && this.f29760u0.getItemAnimator() != null) {
                this.f29760u0.setItemAnimator(null);
            } else if (i > 0 && this.f29760u0.getItemAnimator() == null) {
                this.f29760u0.setItemAnimator(this.f29752K0);
                m9898of();
            }
            m9900nf();
            if (C4403w.m27984G2()) {
                float xf = m9888xf();
                int i2 = this.f29753n0;
                int i3 = this.f29754o0;
                f2 = xf - ((i2 - i3) * f);
                f3 = xf - ((i2 - i3) * this.f29751J0);
            } else {
                int i4 = this.f29753n0;
                f2 = (-i4) * (1.0f - f);
                f3 = (-i4) * (1.0f - this.f29751J0);
            }
            if (i == 0 || f == 1.0f || Math.abs(f3 - f2) >= 1.0f) {
                this.f29751J0 = f;
                C9356x1 U0 = mo4347s().m14533U0();
                this.f29757r0.setTranslationX(f2);
                if (U0 != null) {
                    U0.setAlpha(0.6f * f);
                }
                C9261p pVar = this.f29750I0;
                if (pVar != null) {
                    pVar.setClipLeft((int) (this.f29753n0 * f));
                }
                if (i == 0 && !C5070i.m24061i(this.f29748G0)) {
                    m9905kg(this.f29748G0);
                }
            }
        }
    }

    public final void m9911hg(boolean z) {
        this.f29755p0 = z;
    }

    public final void m9909ig(boolean z) {
        if (this.f29762w0.m32873D() != z) {
            if (!this.f29763x0) {
                this.f29762w0.m32858S(z);
            } else if (this.f29751J0 > 0.0f) {
                this.f29759t0.m34208T2(this.f29762w0, z);
            } else {
                this.f29762w0.m32858S(z);
                this.f29759t0.m34130s3(this.f29762w0.m32835j());
            }
        }
    }

    public void m9907jg(boolean z) {
        if (this.f29744C0 != z) {
            this.f29744C0 = z;
            C4868i.m24726c2().m24724c4(z);
            if (z) {
                ArrayList arrayList = new ArrayList();
                m9893sf(arrayList);
                this.f29759t0.m34240F0().addAll(1, arrayList);
                this.f29759t0.m39308M(1, arrayList.size());
                return;
            }
            this.f29759t0.m34204V1(1, this.f29759t0.m34224N0(R.id.btn_contacts) - 1);
        }
    }

    @Override
    public void mo4621k3(int i, String str, int i2, TdApi.ProxyType proxyType, String str2, boolean z, boolean z2) {
        if (z) {
            boolean z3 = i != 0;
            if (this.f29762w0.m32873D() != z3) {
                m9909ig(z3);
            }
        }
    }

    public final void m9905kg(String str) {
        if (this.f29751J0 != 0.0f) {
            this.f29748G0 = str;
            m9896pf(0.0f, null);
            return;
        }
        this.f29748G0 = null;
        C1405v.m37128O(str);
    }

    public final void m9903lg() {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            q1Var.m9692v0();
        }
        C1399s0.m37183f0(this.f29757r0, 2);
        this.f29757r0.setVisibility(0);
        mo4347s().m14407z3(-16777216, 2);
        C9270q1 q1Var2 = this.f30158T;
        if (q1Var2 != null) {
            q1Var2.m9701r();
        }
    }

    @Override
    public void mo1512m(C10930q6 q6Var, TdApi.ChatList chatList, int i, boolean z) {
        int L0;
        if (this.f29744C0 && (L0 = this.f29759t0.m34228L0(q6Var.m2949A1())) != -1) {
            this.f29759t0.m34124u3(L0);
        }
    }

    public void m9901mg(int i) {
        float f;
        int i2;
        if (!C4403w.m27984G2()) {
            if (this.f29755p0) {
                i2 = this.f29753n0 + i;
                f = i2;
            }
            f = i;
        } else if (this.f29755p0) {
            i2 = this.f29753n0 - i;
            f = i2;
        } else {
            i = -i;
            f = i;
        }
        m9913gg(C5069h.m24089d(f / this.f29753n0));
    }

    public final void m9900nf() {
        AbstractRunnableC5910b bVar = this.f29745D0;
        if (bVar != null) {
            bVar.m21857c();
            this.f29745D0 = null;
        }
    }

    public final void m9899ng() {
        List<C2964ra> F0 = this.f29759t0.m34240F0();
        int i = 0;
        while (true) {
            i++;
            if (i < F0.size() && F0.get(i).m32835j() == R.id.account) {
                this.f29759t0.m34124u3(i);
            } else {
                return;
            }
        }
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        m9898of();
    }

    @Override
    public View mo403oc(Context context) {
        this.f29754o0 = C1357a0.m37541i(7.0f);
        this.f29753n0 = Math.min(C1357a0.m37553B() - C1357a0.m37541i(56.0f), C1357a0.m37541i(300.0f)) + this.f29754o0;
        C9219a aVar = new C9219a(context);
        this.f29757r0 = aVar;
        aVar.setVisibility(8);
        this.f29757r0.setTranslationX(-this.f29753n0);
        this.f29757r0.setLayoutParams(FrameLayoutFix.m18007t1(this.f29753n0, -1, 3));
        C6879f3 f3Var = new C6879f3(context);
        f3Var.setSimpleRightShadow(false);
        f3Var.setLayoutParams(FrameLayoutFix.m18007t1(this.f29754o0, -1, 5));
        m9163t8(f3Var);
        this.f29757r0.addView(f3Var);
        C9232l0 l0Var = new C9232l0(context, this);
        this.f29758s0 = l0Var;
        m9163t8(l0Var);
        this.f29758s0.setLayoutParams(FrameLayoutFix.m18007t1(this.f29753n0 - this.f29754o0, C1357a0.m37541i(148.0f) + View$OnClickListenerC9170d1.getTopOffset(), 48));
        this.f29757r0.addView(this.f29758s0);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(this.f29753n0 - this.f29754o0, -1);
        s1.setMargins(0, C1357a0.m37541i(148.0f) + View$OnClickListenerC9170d1.getTopOffset(), 0, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(78));
        boolean d2 = C4868i.m24726c2().m24718d2();
        this.f29744C0 = d2;
        if (d2) {
            m9893sf(arrayList);
            this.f29758s0.getExpanderView().m18729c(true, false);
        }
        arrayList.add(new C2964ra(79, R.id.btn_contacts, R.drawable.baseline_perm_contact_calendar_24, R.string.Contacts));
        arrayList.add(new C2964ra(79, R.id.btn_savedMessages, R.drawable.baseline_bookmark_24, R.string.SavedMessages));
        this.f29764y0 = m9887yf();
        arrayList.add(new C2964ra(79, R.id.btn_settings, R.drawable.baseline_settings_24, R.string.Settings));
        arrayList.add(new C2964ra(79, R.id.btn_invite, R.drawable.baseline_person_add_24, R.string.InviteFriends));
        boolean z = C4868i.m24726c2().m24664k0() > 0;
        this.f29763x0 = z;
        if (z) {
            this.f29762w0.m32858S(C4868i.m24726c2().m24877H0() != 0);
            arrayList.add(this.f29762w0);
        }
        arrayList.add(new C2964ra(79, R.id.btn_help, R.drawable.baseline_help_24, R.string.Help));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(80, (int) R.id.btn_night, (int) R.drawable.baseline_brightness_2_24, (int) R.string.NightMode, (int) R.id.btn_night, C11524j.m141z0()));
        if (C4868i.m24726c2().m24750Z1()) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(79, (int) R.id.btn_tdlib_clearLogs, (int) R.drawable.baseline_bug_report_24, (CharSequence) "Clear TDLib logs", false));
            arrayList.add(new C2964ra(79, (int) R.id.btn_tdlib_shareLogs, (int) R.drawable.baseline_bug_report_24, (CharSequence) "Send TDLib log", false));
        }
        C9220b bVar = new C9220b(this);
        this.f29759t0 = bVar;
        bVar.m34238F2(this);
        this.f29759t0.m34116x2(arrayList, true);
        RecyclerView recyclerView = new RecyclerView(context);
        this.f29760u0 = recyclerView;
        recyclerView.m39434g(new C9221c());
        this.f29760u0.setItemAnimator(null);
        this.f29760u0.setOverScrollMode(1);
        C10192g.m5782i(this.f29760u0, R.id.theme_color_filling, this);
        m9191p8(this.f29760u0);
        this.f29760u0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f29760u0.setAdapter(this.f29759t0);
        this.f29760u0.setLayoutParams(s1);
        this.f29757r0.addView(this.f29760u0);
        C0962g gVar = new C0962g(new C9222d());
        this.f29761v0 = gVar;
        gVar.m38809m(this.f29760u0);
        C4868i.m24726c2().m24609r(this);
        C10536ab.m4667o1().m4716b1().m1554a(this);
        C10536ab.m4667o1().m4716b1().m1551d(this);
        return this.f29757r0;
    }

    public void m9898of() {
        int N0;
        int yf = m9887yf();
        if (this.f29764y0 != yf) {
            this.f29764y0 = yf;
            C2546iq iqVar = this.f29759t0;
            if (iqVar != null && (N0 = iqVar.m34224N0(R.id.btn_settings)) != -1) {
                this.f29759t0.m39312I(N0);
            }
        }
    }

    public final void m9897og() {
        float f = this.f29751J0;
        if (f != 0.0f) {
            this.f29751J0 = 0.0f;
            m9913gg(f);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.account:
                C11131y6 y6Var = (C11131y6) ((C2964ra) view.getTag()).m32844d();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (y6Var.m1468i().m4632x2() != y6Var.f35705b) {
                    long j = this.f29747F0;
                    if (j == 0 || uptimeMillis - j >= 720) {
                        this.f29747F0 = uptimeMillis;
                        this.f29746E0 = true;
                        y6Var.m1468i().m4709d0(y6Var.f35705b, 2);
                        return;
                    }
                    return;
                }
                return;
            case R.id.btn_addAccount:
                this.f30165a.m14410z0().m2485dd().m3394z2(this.f30165a, true, false);
                return;
            case R.id.btn_bubble:
                mo4347s().m14410z0().m2294pc().m4094t0();
                return;
            case R.id.btn_contacts:
                m9923bg();
                return;
            case R.id.btn_help:
                m9900nf();
                this.f29745D0 = this.f30165a.m14410z0().m2485dd().m3878C7(this.f30165a.m14552P1().m9763F());
                return;
            case R.id.btn_invite:
                this.f30165a.m14410z0().m2480e2().m1632j0(new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC9218k0.this.m9954Jf((TdApi.Text) obj);
                    }
                });
                return;
            case R.id.btn_night:
                C11541z.m7t().m27c0();
                return;
            case R.id.btn_proxy:
                if (view instanceof C9139d) {
                    m9909ig(C4868i.m24726c2().m24698f6(1));
                    return;
                } else {
                    this.f30165a.m14410z0().m2485dd().m3409x7(this.f30165a.m14552P1().m9763F(), false);
                    return;
                }
            case R.id.btn_savedMessages:
                m9919dg();
                return;
            case R.id.btn_settings:
                m9917eg();
                return;
            case R.id.btn_tdlib_clearLogs:
                HandlerC10770jj.m3793L2(true, C9380y.f30414a);
                return;
            case R.id.btn_tdlib_shareLogs:
                HandlerC10770jj.m3648Z7(this.f30165a.m14552P1().m9763F(), false, false);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        RecyclerView.AbstractC0886d0 l0;
        C2964ra raVar;
        if (!(view instanceof View$OnClickListenerC6902i) || (l0 = this.f29760u0.m39418l0(view)) == null || (raVar = (C2964ra) view.getTag()) == null) {
            return false;
        }
        if (raVar.m32835j() != R.id.account) {
            if (raVar.m32835j() == R.id.btn_addAccount) {
                this.f30165a.m14410z0().m2476e6(new AbstractC5919k() {
                    @Override
                    public final void mo3250a(int i) {
                        View$OnClickListenerC9218k0.this.m9951Mf(i);
                    }
                });
            }
            return false;
        } else if (mo6635e2((View$OnClickListenerC6902i) view, 0.0f, 0.0f)) {
            return false;
        } else {
            this.f29761v0.m38815H(l0);
            return false;
        }
    }

    @Override
    public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        int L0;
        if (this.f29744C0 && (L0 = this.f29759t0.m34228L0(y6Var)) != -1) {
            this.f29759t0.m34124u3(L0);
        }
    }

    @Override
    public void mo11p6(C11131y6 y6Var, int i) {
        if (this.f29744C0) {
            this.f29759t0.m34129t0(i + 1, new C2964ra(81, R.id.account).m32863N(y6Var.f35705b).m32870G(y6Var));
        }
    }

    public void m9896pf(float f, Runnable runnable) {
        if (!this.f29756q0 && !this.f29749H0) {
            this.f29756q0 = true;
            if (this.f29751J0 == 0.0f) {
                m9892tf();
                return;
            }
            ValueAnimator b = C2057b.m35734b();
            final float wf = m9889wf();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View$OnClickListenerC9218k0.this.m9957Gf(wf, valueAnimator);
                }
            });
            b.setDuration(C9270q1.m9702q(this.f29753n0 + m9933Wf(), f, 300, 180));
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9226g(runnable));
            m9911hg(false);
            if (this.f29746E0) {
                this.f29746E0 = false;
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

    public void m9895qf() {
        if (this.f29751J0 < 0.4f) {
            m9911hg(true);
            m9896pf(0.0f, null);
            return;
        }
        m9911hg(false);
        m9927Zf(0.0f);
    }

    @Override
    public void mo4078r3(C10930q6 q6Var, boolean z) {
        q6Var.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9218k0.this.m9950Nf();
            }
        });
    }

    @Override
    public void mo1775r7(boolean z) {
        C11020tb.m1983f(this, z);
    }

    public final void m9894rf() {
        final C10930q6 q6Var = this.f29742A0;
        if (q6Var != null) {
            q6Var.m2569Y5(true, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC9218k0.this.m9955If(q6Var, (C10930q6.C10946p) obj);
                }
            });
        }
    }

    public final void m9893sf(List<C2964ra> list) {
        Iterator<C11131y6> it = C10536ab.m4667o1().m4626z0().iterator();
        while (it.hasNext()) {
            C11131y6 next = it.next();
            list.add(new C2964ra(81, R.id.account).m32863N(next.f35705b).m32870G(next));
        }
        list.add(new C2964ra(79, R.id.btn_addAccount, R.drawable.baseline_add_24, R.string.AddAccount));
        list.add(new C2964ra(11));
    }

    @Override
    public void mo1774t4(boolean z) {
        C11020tb.m1986c(this, z);
    }

    public final void m9892tf() {
        m9911hg(false);
        this.f29756q0 = false;
        m9913gg(0.0f);
        m9961Cf();
    }

    public void m9891uf() {
        if (this.f29751J0 < 0.4f) {
            m9892tf();
        } else {
            m9890vf();
        }
    }

    @Override
    public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        if (y6Var2 != null) {
            this.f29759t0.m34133r3(y6Var2);
        }
        this.f29759t0.m34133r3(y6Var);
        m9898of();
    }

    public final void m9890vf() {
        m9911hg(true);
        this.f29756q0 = false;
        m9913gg(1.0f);
    }

    public float m9889wf() {
        return this.f29751J0;
    }

    public final float m9888xf() {
        return this.f30165a.m14552P1().get().getMeasuredWidth();
    }

    public final int m9887yf() {
        int Z0 = this.f30165a.m14517Z0();
        C10930q6.C10946p pVar = this.f29765z0;
        boolean z = pVar != null && pVar.f35175c.length > 0;
        if (Z0 != 0 && z) {
            return C10930q6.f34957B2;
        }
        if (Z0 != 0) {
            return Z0;
        }
        if (z) {
            return C10930q6.f34957B2;
        }
        return 0;
    }

    public int m9886zf() {
        return this.f29754o0;
    }
}
