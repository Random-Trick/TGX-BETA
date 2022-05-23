package ud;

import ae.j;
import ae.p;
import ae.z;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.v;
import ce.y;
import de.iq;
import de.o4;
import de.qj;
import de.ra;
import de.wt;
import eb.k;
import gd.w;
import hd.t2;
import he.i;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.f3;
import ne.i;
import ne.m1;
import ne.r3;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.gc;
import zd.hj;
import zd.n1;
import zd.o1;
import zd.o6;
import zd.r0;
import zd.rb;
import zd.s0;
import zd.sb;
import zd.w0;
import zd.w6;
import zd.x6;
import zd.ya;

public class k0 extends v4<Void> implements View.OnClickListener, i.m, s0, w0, i.d, i.c, View.OnLongClickListener, gc.d, sb, o1 {
    public o6 A0;
    public boolean B0;
    public boolean C0;
    public kb.b D0;
    public boolean E0;
    public long F0;
    public String G0;
    public boolean H0;
    public p I0;
    public float J0;
    public int f24229n0;
    public int f24230o0;
    public boolean f24231p0;
    public boolean f24232q0;
    public FrameLayoutFix f24233r0;
    public l0 f24234s0;
    public iq f24235t0;
    public RecyclerView f24236u0;
    public androidx.recyclerview.widget.g f24237v0;
    public boolean f24239x0;
    public int f24240y0;
    public o6.p f24241z0;
    public final ra f24238w0 = new ra(88, R.id.btn_proxy, R.drawable.baseline_security_24, R.string.Proxy);
    public final RecyclerView.m K0 = new tc.d(db.b.f7287b, 160);

    public class a extends t {
        public a(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            k0.this.og();
        }
    }

    public class b extends iq {
        public b(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void i2(ra raVar, o0 o0Var, r3 r3Var, boolean z10) {
            boolean z11 = true;
            int i10 = 0;
            boolean z12 = z10 && k0.this.J0 > 0.0f;
            int j10 = raVar.j();
            if (j10 == R.id.account) {
                w6 w6Var = (w6) raVar.d();
                x6 x10 = w6Var.x();
                if (w6Var.f28608b != w6Var.i().x2()) {
                    z11 = false;
                }
                o0Var.e1(z11, z12);
                o0Var.n1(x10.b(), x10.c(), z12);
                o0Var.b1(w6Var.n(), w6Var.m(false));
                o0Var.setText(w.r0(w6Var.u(), w6Var.G()));
                o0Var.setCustomControllerProvider(k0.this);
                o0Var.setPreviewActionListProvider(k0.this);
            } else if (j10 != R.id.btn_settings) {
                o0Var.f1(false, 0, z12);
            } else {
                if (k0.this.f24240y0 == 0) {
                    z11 = false;
                }
                if (k0.this.f24240y0 != o6.B2) {
                    i10 = k0.this.f24240y0;
                }
                o0Var.f1(z11, i10, z12);
            }
        }
    }

    public class c extends RecyclerView.o {
        public c() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            RecyclerView.c0 l02 = recyclerView.l0(view);
            if (l02 == null || l02.n() != 11) {
                rect.bottom = 0;
                rect.top = 0;
                return;
            }
            int i10 = a0.i(8.0f);
            rect.bottom = i10;
            rect.top = i10;
        }
    }

    public class d extends g.e {
        public Paint f24246f;
        public Paint f24247g;
        public float f24248h;
        public int f24244d = -1;
        public int f24245e = -1;
        public final eb.f f24249i = new eb.f(0, new a(), db.b.f7287b, 280);

        public class a implements k.b {
            public a() {
            }

            @Override
            public void n4(int i10, float f10, float f11, k kVar) {
                d.this.f24248h = f10;
                k0.this.f24236u0.invalidate();
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
            }
        }

        public d() {
        }

        @Override
        public void A(RecyclerView.c0 c0Var, int i10) {
            super.A(c0Var, i10);
            if (i10 == 2) {
                D();
                ((o0) c0Var.f2982a).setIsDragging(true);
                this.f24249i.p(true, true);
            }
        }

        @Override
        public void B(RecyclerView.c0 c0Var, int i10) {
        }

        public final void D() {
            if (this.f24246f == null) {
                this.f24246f = new Paint(5);
                this.f24246f.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f3.q(), f3.r(), (float[]) null, Shader.TileMode.CLAMP));
                this.f24247g = new Paint(5);
                this.f24247g.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f3.p(), f3.a(), (float[]) null, Shader.TileMode.CLAMP));
            }
        }

        @Override
        public void c(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int i10;
            super.c(recyclerView, c0Var);
            int i11 = this.f24244d;
            if (!(i11 == -1 || (i10 = this.f24245e) == -1 || i11 == i10)) {
                ya.o1().M2();
            }
            ((o0) c0Var.f2982a).setIsDragging(false);
            this.f24249i.p(false, true);
            this.f24245e = -1;
            this.f24244d = -1;
        }

        @Override
        public int k(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            if (!k0.this.C0) {
                return 0;
            }
            int k10 = c0Var.k();
            int size = ya.o1().z0().size();
            if (size > 1 && k10 != -1 && k10 >= 1 && k10 < size + 1) {
                return g.e.t(3, 0);
            }
            return 0;
        }

        @Override
        public boolean r() {
            return false;
        }

        @Override
        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f10, float f11, int i10, boolean z10) {
            int q10;
            super.u(canvas, recyclerView, c0Var, f10, f11, i10, z10);
            if (c0Var != null) {
                View view = c0Var.f2982a;
                if (view instanceof o0) {
                    o0 o0Var = (o0) view;
                    if (this.f24248h != 0.0f) {
                        int top = o0Var.getTop();
                        int left = o0Var.getLeft();
                        int right = o0Var.getRight();
                        int i11 = (int) (top + f11);
                        int bottom = (int) (o0Var.getBottom() + f11);
                        int i12 = (int) (left + f10);
                        int i13 = (int) (right + f10);
                        float e02 = j.e0();
                        float d02 = j.d0();
                        float f12 = 1.0f - d02;
                        if (f12 != 0.0f) {
                            int i14 = (int) (e02 * 255.0f * f12 * this.f24248h);
                            this.f24246f.setAlpha(i14);
                            this.f24247g.setAlpha(i14);
                            canvas.save();
                            canvas.translate(i12, i11 - f3.q());
                            float f13 = i13 - i12;
                            canvas.drawRect(0.0f, 0.0f, f13, f3.q(), this.f24246f);
                            canvas.translate(0.0f, bottom - q10);
                            canvas.drawRect(0.0f, 0.0f, f13, f3.p(), this.f24247g);
                            canvas.restore();
                        }
                        if (d02 != 0.0f) {
                            int max = Math.max(1, a0.j(0.5f, 3.0f));
                            int a10 = ib.d.a(d02 * this.f24248h, j.M0());
                            float f14 = i12;
                            float f15 = i13;
                            canvas.drawRect(f14, i11, f15, i11 + max, y.g(a10));
                            canvas.drawRect(f14, bottom - max, f15, bottom, y.g(a10));
                        }
                    }
                }
            }
        }

        @Override
        public boolean y(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            int i10;
            if (!k0.this.C0) {
                return false;
            }
            int k10 = c0Var.k();
            int k11 = c0Var2.k();
            int size = ya.o1().z0().size();
            if (k10 < 1 || k10 >= (i10 = size + 1) || k11 < 1 || k11 >= i10) {
                return false;
            }
            ya.o1().b2(k10 - 1, k11 - 1);
            if (this.f24244d == -1) {
                this.f24244d = k10;
            }
            this.f24245e = k11;
            return true;
        }

        @Override
        public void z(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10, RecyclerView.c0 c0Var2, int i11, int i12, int i13) {
            super.z(recyclerView, c0Var, i10, c0Var2, i11, i12, i13);
            c0Var.f2982a.invalidate();
            c0Var2.f2982a.invalidate();
        }
    }

    public class e implements m1.e {
        public e() {
        }

        @Override
        public void a7(m1.f fVar, int i10, Object obj) {
            if (i10 == R.id.btn_removeAccount) {
                hj.R7(k0.this, (w6) obj);
            }
        }

        @Override
        public void t2(m1.f fVar, int i10, Object obj) {
        }
    }

    public class f implements hj.l {
        public f() {
        }

        @Override
        public void a() {
        }

        @Override
        public void b() {
            k0.this.Ad(null);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            k0.this.gg(1.0f);
            k0.this.f24232q0 = false;
            k0.this.hg(true);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public final Runnable f24255a;

        public h(Runnable runnable) {
            this.f24255a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            k0.this.Cf();
            k0.this.gg(0.0f);
            k0.this.f24232q0 = false;
            Runnable runnable = this.f24255a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public k0(Context context) {
        super(context, null);
    }

    public void Gf(float f10, ValueAnimator valueAnimator) {
        gg(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void Hf(o6 o6Var, o6.p pVar) {
        if (this.A0 == o6Var) {
            this.f24241z0 = pVar;
            of();
        }
    }

    public void If(final o6 o6Var, final o6.p pVar) {
        if (pVar != null && this.f24241z0 != pVar) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    k0.this.Hf(o6Var, pVar);
                }
            });
        }
    }

    public void Jf(TdApi.Text text) {
        if (Ff() && !Sa()) {
            kg(text.text);
        }
    }

    public static void Lf(long j10) {
        hj.L2(false, z.f24655a);
    }

    public void Mf(int i10) {
        if (i10 >= 3) {
            this.f24493a.C0().hd().z2(this.f24493a, true, true);
        }
    }

    public void Nf() {
        if (!Sa()) {
            of();
        }
    }

    public void Of(o6 o6Var) {
        if (this.A0 == o6Var) {
            rf();
        }
    }

    public void Pf() {
        if (!Sa()) {
            of();
        }
    }

    public void Qf(float f10, float f11, ValueAnimator valueAnimator) {
        gg(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void Rf(long j10) {
        this.H0 = false;
        pf(0.0f, null);
    }

    public void Sf() {
        org.thunderdog.challegram.a aVar = this.f24493a;
        qj qjVar = new qj(aVar, aVar.C0());
        qjVar.zg();
        cg(qjVar);
    }

    public void Tf() {
        this.H0 = false;
        pf(0.0f, null);
    }

    public void Uf(o6 o6Var, long j10) {
        this.B0 = false;
        if (this.J0 == 1.0f) {
            ag(o6Var, j10);
        }
    }

    public void Vf(final o6 o6Var, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.B0 = false;
            j0.t0(object);
        } else if (constructor != -1601123095) {
            this.B0 = false;
            Log.unexpectedTdlibResponse(object, TdApi.CreatePrivateChat.class, TdApi.Chat.class);
        } else {
            final long P0 = t2.P0(object);
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    k0.this.Uf(o6Var, P0);
                }
            });
        }
    }

    public float Af() {
        return this.J0;
    }

    public int Bf() {
        return this.f24229n0;
    }

    public final void Cf() {
        p0.Y(this.f24233r0, 0);
        this.f24233r0.setVisibility(8);
        t().y2();
    }

    @Override
    public void D4(w6 w6Var, boolean z10, boolean z11) {
        int J0;
        if (!z10 && this.C0 && (J0 = this.f24235t0.J0(w6Var)) != -1) {
            this.f24235t0.r3(J0);
        }
    }

    public boolean Df() {
        return this.f24232q0;
    }

    @Override
    public void E(TdApi.ChatList chatList, boolean z10) {
        if (z10 && this.C0) {
            ng();
        }
    }

    public boolean Ef() {
        v4<?> F = this.f24493a.Q1().F();
        return F != null && F.Ge();
    }

    @Override
    public void F5(o6 o6Var, TdApi.Session session) {
        n1.c(this, o6Var, session);
    }

    public boolean Ff() {
        return this.f24231p0;
    }

    @Override
    public void G0(boolean z10) {
        rb.a(this, z10);
    }

    @Override
    public void G2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        this.f24493a.C0().hd().post(new Runnable() {
            @Override
            public final void run() {
                k0.this.Pf();
            }
        });
    }

    @Override
    public void H5(o6 o6Var, TdApi.Session session) {
        n1.a(this, o6Var, session);
    }

    @Override
    public void Ia() {
        super.Ia();
        og();
        l0 l0Var = this.f24234s0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    @Override
    public void Ja(int i10, int i11) {
        if (i10 == 0 || i10 == 1) {
            this.f24235t0.w1();
        } else if (i10 == 2) {
            this.f24235t0.z1(i11);
        }
    }

    @Override
    public void N2(o6 o6Var, boolean z10) {
        o6Var.hd().post(new Runnable() {
            @Override
            public final void run() {
                k0.this.Nf();
            }
        });
    }

    @Override
    public void N6(w6 w6Var, int i10) {
        if (this.C0) {
            this.f24235t0.j1(i10 + 1);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_drawer;
    }

    @Override
    public void S(w6 w6Var, int i10) {
        if (this.C0) {
            this.f24235t0.s0(i10 + 1, new ra(81, R.id.account).N(w6Var.f28608b).G(w6Var));
        }
    }

    @Override
    public void T1(o6 o6Var, TdApi.ChatList chatList, int i10, boolean z10) {
        int J0;
        if (this.C0 && (J0 = this.f24235t0.J0(o6Var.A1())) != -1) {
            this.f24235t0.r3(J0);
        }
    }

    @Override
    public boolean V0() {
        return this.J0 > 0.0f;
    }

    @Override
    public void V1(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
        if (w6Var2 != null) {
            this.f24235t0.o3(w6Var2);
        }
        this.f24235t0.o3(w6Var);
        of();
    }

    public float Wf() {
        return this.f24229n0 * (1.0f - this.J0);
    }

    @Override
    public void X0(i.l lVar, boolean z10) {
    }

    public void Xf(o6 o6Var) {
        o6 o6Var2 = this.A0;
        if (o6Var2 != null) {
            o6Var2.tc().c0(this);
            this.A0.O9().V(this);
            this.A0.O9().v0(this);
        }
        this.A0 = o6Var;
        this.f24241z0 = null;
        o6Var.tc().e(this);
        o6Var.O9().n(this);
        o6Var.O9().i0(this);
        of();
        rf();
    }

    public void Yf() {
        v4<?> t10 = j0.t(t());
        if (t10 != null && t10.Ge() && !t10.Va()) {
            fg();
            Zf(0.0f);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        he.i.c2().N3(this);
        ya.o1().b1().x(this);
        ya.o1().b1().z(this);
    }

    public void Zf(float f10) {
        if (!this.f24232q0) {
            this.f24232q0 = true;
            ValueAnimator b10 = db.b.b();
            final float wf = wf();
            final float f11 = 1.0f - wf;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    k0.this.Qf(wf, f11, valueAnimator);
                }
            });
            b10.setDuration(q1.q(Wf(), f10, 300, 180));
            b10.setInterpolator(db.b.f7287b);
            b10.addListener(new g());
            v4<?> t10 = j0.t(t());
            View v92 = t10 != null ? t10.get() : null;
            if (v92 == null || !(v92 instanceof p)) {
                this.I0 = null;
            } else {
                this.I0 = (p) v92;
            }
            b10.setStartDelay(10L);
            b10.start();
        }
    }

    @Override
    public void a3(int i10, String str, int i11, TdApi.ProxyType proxyType, String str2, boolean z10, boolean z11) {
        if (z10) {
            boolean z12 = i10 != 0;
            if (this.f24238w0.D() != z12) {
                ig(z12);
            }
        }
    }

    public final void ag(o6 o6Var, long j10) {
        if (j10 != 0) {
            this.H0 = true;
            o6Var.hd().h7(this.f24493a.Q1().F(), j10, new hj.j().b(new l() {
                @Override
                public final void a(long j11) {
                    k0.this.Rf(j11);
                }
            }));
        }
    }

    public final void bg() {
        this.f24493a.C0().E4().u0(this.f24493a, true, new Runnable() {
            @Override
            public final void run() {
                k0.this.Sf();
            }
        });
    }

    @Override
    public v4<?> c7(ne.i iVar, float f10, float f11) {
        return new o4(this.f24493a, ((w6) ((ra) iVar.getTag()).d()).c());
    }

    public final void cg(v4<?> v4Var) {
        if (v4Var.dc()) {
            this.H0 = true;
            v4Var.gd(new Runnable() {
                @Override
                public final void run() {
                    k0.this.Tf();
                }
            });
        }
        j0.W(v4Var);
    }

    public final void dg() {
        final o6 C0 = this.f24493a.C0();
        long fa2 = C0.fa();
        if (fa2 != 0) {
            TdApi.Chat W2 = C0.W2(ob.a.c(fa2));
            if (W2 != null) {
                ag(C0, W2.f19908id);
            } else if (!this.B0) {
                this.B0 = true;
                C0.v4().o(new TdApi.CreatePrivateChat(fa2, true), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        k0.this.Vf(C0, object);
                    }
                });
            }
        }
    }

    @Override
    public void e(String str, TdApi.LanguagePackInfo languagePackInfo) {
        rb.e(this, str, languagePackInfo);
    }

    public final void eg() {
        org.thunderdog.challegram.a aVar = this.f24493a;
        cg(new wt(aVar, aVar.C0()));
    }

    @Override
    public boolean f(ne.i iVar, float f10, float f11, v4<?> v4Var) {
        RecyclerView.c0 l02;
        if (f11 >= 0.0f) {
            return false;
        }
        if ((v4Var != null && v4Var.Ka()) || (l02 = this.f24236u0.l0(iVar)) == null) {
            return false;
        }
        iVar.S(f10, f11);
        this.f24237v0.H(l02);
        return true;
    }

    @Override
    public void f3(boolean z10) {
        rb.b(this, z10);
    }

    public boolean fg() {
        if ((!Ef() && !this.f24231p0) || this.f24232q0) {
            return false;
        }
        lg();
        if (this.f24231p0) {
            return true;
        }
        t().Y0().setAlpha(0.0f);
        if (w.G2()) {
            this.f24233r0.setTranslationX(xf());
            return true;
        }
        this.f24233r0.setTranslationX(-this.f24229n0);
        return true;
    }

    @Override
    public void g7(boolean z10) {
        if (this.f24239x0 != z10) {
            this.f24239x0 = z10;
            if (z10) {
                this.f24235t0.s0(this.f24235t0.O0(R.id.btn_help), this.f24238w0);
                return;
            }
            this.f24235t0.j1(this.f24235t0.L0(R.id.btn_proxy));
        }
    }

    public void gg(float f10) {
        float f11;
        float f12;
        if (this.J0 != f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0 && this.f24236u0.getItemAnimator() != null) {
                this.f24236u0.setItemAnimator(null);
            } else if (i10 > 0 && this.f24236u0.getItemAnimator() == null) {
                this.f24236u0.setItemAnimator(this.K0);
                of();
            }
            nf();
            if (w.G2()) {
                float xf = xf();
                int i11 = this.f24229n0;
                int i12 = this.f24230o0;
                f11 = xf - ((i11 - i12) * f10);
                f12 = xf - ((i11 - i12) * this.J0);
            } else {
                int i13 = this.f24229n0;
                f11 = (-i13) * (1.0f - f10);
                f12 = (-i13) * (1.0f - this.J0);
            }
            if (i10 == 0 || f10 == 1.0f || Math.abs(f12 - f11) >= 1.0f) {
                this.J0 = f10;
                x1 Y0 = t().Y0();
                this.f24233r0.setTranslationX(f11);
                if (Y0 != null) {
                    Y0.setAlpha(0.6f * f10);
                }
                p pVar = this.I0;
                if (pVar != null) {
                    pVar.setClipLeft((int) (this.f24229n0 * f10));
                }
                if (i10 == 0 && !ib.i.i(this.G0)) {
                    kg(this.G0);
                }
            }
        }
    }

    @Override
    public void h1(final o6 o6Var, boolean z10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                k0.this.Of(o6Var);
            }
        });
    }

    public final void hg(boolean z10) {
        this.f24231p0 = z10;
    }

    @Override
    public boolean i0(ne.i iVar, float f10, float f11) {
        w6 w6Var = (w6) ((ra) iVar.getTag()).d();
        return w6Var.f28608b != w6Var.i().x2();
    }

    @Override
    public void i3(p pVar, p pVar2) {
        int L0 = this.f24235t0.L0(R.id.btn_night);
        if (L0 != -1) {
            this.f24235t0.P2(this.f24235t0.D0().get(L0), pVar2.c());
        }
    }

    public final void ig(boolean z10) {
        if (this.f24238w0.D() != z10) {
            if (!this.f24239x0) {
                this.f24238w0.S(z10);
            } else if (this.J0 > 0.0f) {
                this.f24235t0.P2(this.f24238w0, z10);
            } else {
                this.f24238w0.S(z10);
                this.f24235t0.p3(this.f24238w0.j());
            }
        }
    }

    public void jg(boolean z10) {
        if (this.C0 != z10) {
            this.C0 = z10;
            he.i.c2().c4(z10);
            if (z10) {
                ArrayList arrayList = new ArrayList();
                sf(arrayList);
                this.f24235t0.D0().addAll(1, arrayList);
                this.f24235t0.M(1, arrayList.size());
                return;
            }
            this.f24235t0.R1(1, this.f24235t0.L0(R.id.btn_contacts) - 1);
        }
    }

    @Override
    public void k4(boolean z10) {
        rb.c(this, z10);
    }

    public final void kg(String str) {
        if (this.J0 != 0.0f) {
            this.G0 = str;
            pf(0.0f, null);
            return;
        }
        this.G0 = null;
        v.N(str);
    }

    @Override
    public void l(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        r0.g(this, w6Var, authorizationState, i10);
    }

    public final void lg() {
        q1 q1Var = this.T;
        if (q1Var != null) {
            q1Var.v0();
        }
        p0.Y(this.f24233r0, 2);
        this.f24233r0.setVisibility(0);
        t().A3(-16777216, 2);
        q1 q1Var2 = this.T;
        if (q1Var2 != null) {
            q1Var2.r();
        }
    }

    public void mg(int i10) {
        float f10;
        int i11;
        if (!w.G2()) {
            if (this.f24231p0) {
                i11 = this.f24229n0 + i10;
                f10 = i11;
            }
            f10 = i10;
        } else if (this.f24231p0) {
            i11 = this.f24229n0 - i10;
            f10 = i11;
        } else {
            i10 = -i10;
            f10 = i10;
        }
        gg(ib.h.d(f10 / this.f24229n0));
    }

    public final void nf() {
        kb.b bVar = this.D0;
        if (bVar != null) {
            bVar.c();
            this.D0 = null;
        }
    }

    public final void ng() {
        List<ra> D0 = this.f24235t0.D0();
        int i10 = 0;
        while (true) {
            i10++;
            if (i10 < D0.size() && D0.get(i10).j() == R.id.account) {
                this.f24235t0.r3(i10);
            } else {
                return;
            }
        }
    }

    @Override
    public void o6() {
        super.o6();
        of();
    }

    @Override
    public View oc(Context context) {
        this.f24230o0 = a0.i(7.0f);
        this.f24229n0 = Math.min(a0.B() - a0.i(56.0f), a0.i(300.0f)) + this.f24230o0;
        a aVar = new a(context);
        this.f24233r0 = aVar;
        aVar.setVisibility(8);
        this.f24233r0.setTranslationX(-this.f24229n0);
        this.f24233r0.setLayoutParams(FrameLayoutFix.r1(this.f24229n0, -1, 3));
        f3 f3Var = new f3(context);
        f3Var.setSimpleRightShadow(false);
        f3Var.setLayoutParams(FrameLayoutFix.r1(this.f24230o0, -1, 5));
        t8(f3Var);
        this.f24233r0.addView(f3Var);
        l0 l0Var = new l0(context, this);
        this.f24234s0 = l0Var;
        t8(l0Var);
        this.f24234s0.setLayoutParams(FrameLayoutFix.r1(this.f24229n0 - this.f24230o0, a0.i(148.0f) + d1.getTopOffset(), 48));
        this.f24233r0.addView(this.f24234s0);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(this.f24229n0 - this.f24230o0, -1);
        q12.setMargins(0, a0.i(148.0f) + d1.getTopOffset(), 0, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(78));
        boolean d22 = he.i.c2().d2();
        this.C0 = d22;
        if (d22) {
            sf(arrayList);
            this.f24234s0.getExpanderView().c(true, false);
        }
        arrayList.add(new ra(79, R.id.btn_contacts, R.drawable.baseline_perm_contact_calendar_24, R.string.Contacts));
        arrayList.add(new ra(79, R.id.btn_savedMessages, R.drawable.baseline_bookmark_24, R.string.SavedMessages));
        this.f24240y0 = yf();
        arrayList.add(new ra(79, R.id.btn_settings, R.drawable.baseline_settings_24, R.string.Settings));
        arrayList.add(new ra(79, R.id.btn_invite, R.drawable.baseline_person_add_24, R.string.InviteFriends));
        boolean z10 = he.i.c2().k0() > 0;
        this.f24239x0 = z10;
        if (z10) {
            this.f24238w0.S(he.i.c2().H0() != 0);
            arrayList.add(this.f24238w0);
        }
        arrayList.add(new ra(79, R.id.btn_help, R.drawable.baseline_help_24, R.string.Help));
        arrayList.add(new ra(11));
        arrayList.add(new ra(80, (int) R.id.btn_night, (int) R.drawable.baseline_brightness_2_24, (int) R.string.NightMode, (int) R.id.btn_night, j.x0()));
        if (he.i.c2().Z1()) {
            arrayList.add(new ra(11));
            arrayList.add(new ra(79, (int) R.id.btn_tdlib_clearLogs, (int) R.drawable.baseline_bug_report_24, (CharSequence) "Clear TDLib logs", false));
            arrayList.add(new ra(79, (int) R.id.btn_tdlib_shareLogs, (int) R.drawable.baseline_bug_report_24, (CharSequence) "Send TDLib log", false));
            arrayList.add(new ra(79, (int) R.id.btn_tdlib_viewLogsOld, (int) R.drawable.baseline_bug_report_24, (CharSequence) "Clear Database", false));
        }
        b bVar = new b(this);
        this.f24235t0 = bVar;
        bVar.B2(this);
        this.f24235t0.s2(arrayList, true);
        RecyclerView recyclerView = new RecyclerView(context);
        this.f24236u0 = recyclerView;
        recyclerView.g(new c());
        this.f24236u0.setItemAnimator(null);
        this.f24236u0.setOverScrollMode(1);
        yd.g.i(this.f24236u0, R.id.theme_color_filling, this);
        p8(this.f24236u0);
        this.f24236u0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f24236u0.setAdapter(this.f24235t0);
        this.f24236u0.setLayoutParams(q12);
        this.f24233r0.addView(this.f24236u0);
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g(new d());
        this.f24237v0 = gVar;
        gVar.m(this.f24236u0);
        he.i.c2().r(this);
        ya.o1().b1().a(this);
        ya.o1().b1().d(this);
        return this.f24233r0;
    }

    public void of() {
        int L0;
        int yf = yf();
        if (this.f24240y0 != yf) {
            this.f24240y0 = yf;
            iq iqVar = this.f24235t0;
            if (iqVar != null && (L0 = iqVar.L0(R.id.btn_settings)) != -1) {
                this.f24235t0.I(L0);
            }
        }
    }

    public final void og() {
        float f10 = this.J0;
        if (f10 != 0.0f) {
            this.J0 = 0.0f;
            gg(f10);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.account:
                w6 w6Var = (w6) ((ra) view.getTag()).d();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (w6Var.i().x2() != w6Var.f28608b) {
                    long j10 = this.F0;
                    if (j10 == 0 || uptimeMillis - j10 >= 720) {
                        this.F0 = uptimeMillis;
                        this.E0 = true;
                        w6Var.i().d0(w6Var.f28608b, 2);
                        return;
                    }
                    return;
                }
                return;
            case R.id.btn_addAccount:
                this.f24493a.C0().hd().z2(this.f24493a, true, false);
                return;
            case R.id.btn_bubble:
                t().C0().tc().t0();
                return;
            case R.id.btn_contacts:
                bg();
                return;
            case R.id.btn_help:
                nf();
                this.D0 = this.f24493a.C0().hd().C7(this.f24493a.Q1().F());
                return;
            case R.id.btn_invite:
                this.f24493a.C0().e2().j0(new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        k0.this.Jf((TdApi.Text) obj);
                    }
                });
                return;
            case R.id.btn_night:
                z.u().e0();
                return;
            case R.id.btn_proxy:
                if (view instanceof uc.d) {
                    ig(he.i.c2().f6(1));
                    return;
                } else {
                    this.f24493a.C0().hd().x7(this.f24493a.Q1().F(), false);
                    return;
                }
            case R.id.btn_savedMessages:
                dg();
                return;
            case R.id.btn_settings:
                eg();
                return;
            case R.id.btn_tdlib_clearLogs:
                hj.L2(true, y.f24648a);
                return;
            case R.id.btn_tdlib_shareLogs:
                hj.Z7(this.f24493a.Q1().F(), false, false);
                return;
            case R.id.btn_tdlib_viewLogsOld:
                this.f24493a.C0().hd().T2(this.f24493a.Q1().F(), true, new f());
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        RecyclerView.c0 l02;
        ra raVar;
        if (!(view instanceof ne.i) || (l02 = this.f24236u0.l0(view)) == null || (raVar = (ra) view.getTag()) == null) {
            return false;
        }
        if (raVar.j() != R.id.account) {
            if (raVar.j() == R.id.btn_addAccount) {
                this.f24493a.C0().j6(new kb.k() {
                    @Override
                    public final void a(int i10) {
                        k0.this.Mf(i10);
                    }
                });
            }
            return false;
        } else if (i0((ne.i) view, 0.0f, 0.0f)) {
            return false;
        } else {
            this.f24237v0.H(l02);
            return false;
        }
    }

    public void pf(float f10, Runnable runnable) {
        if (!this.f24232q0 && !this.H0) {
            this.f24232q0 = true;
            if (this.J0 == 0.0f) {
                tf();
                return;
            }
            ValueAnimator b10 = db.b.b();
            final float wf = wf();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    k0.this.Gf(wf, valueAnimator);
                }
            });
            b10.setDuration(q1.q(this.f24229n0 + Wf(), f10, 300, 180));
            b10.setInterpolator(db.b.f7287b);
            b10.addListener(new h(runnable));
            hg(false);
            if (this.E0) {
                this.E0 = false;
                b10.setStartDelay(290L);
            } else {
                b10.setStartDelay(10L);
            }
            b10.start();
        }
    }

    @Override
    public void q7(boolean z10) {
        rb.f(this, z10);
    }

    public void qf() {
        if (this.J0 < 0.4f) {
            hg(true);
            pf(0.0f, null);
            return;
        }
        hg(false);
        Zf(0.0f);
    }

    @Override
    public void r0(o6 o6Var, int i10) {
        n1.b(this, o6Var, i10);
    }

    @Override
    public m1.e r6(View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4<?> v4Var) {
        w6 w6Var = (w6) ((ra) view.getTag()).d();
        cVar.a(R.id.btn_removeAccount);
        cVar2.a(R.drawable.baseline_delete_forever_24);
        u0Var.a(R.string.LogOut);
        fVar.P(w6Var);
        fVar.J(true);
        fVar.Q(w6Var.c());
        fVar.H(w6Var.c().fa());
        return new e();
    }

    @Override
    public void r7(o6 o6Var, TdApi.Session session) {
        n1.d(this, o6Var, session);
    }

    public final void rf() {
        final o6 o6Var = this.A0;
        if (o6Var != null) {
            o6Var.c6(true, new kb.j() {
                @Override
                public final void a(Object obj) {
                    k0.this.If(o6Var, (o6.p) obj);
                }
            });
        }
    }

    public final void sf(List<ra> list) {
        Iterator<w6> it = ya.o1().z0().iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            list.add(new ra(81, R.id.account).N(next.f28608b).G(next));
        }
        list.add(new ra(79, R.id.btn_addAccount, R.drawable.baseline_add_24, R.string.AddAccount));
        list.add(new ra(11));
    }

    public final void tf() {
        hg(false);
        this.f24232q0 = false;
        gg(0.0f);
        Cf();
    }

    public void uf() {
        if (this.J0 < 0.4f) {
            tf();
        } else {
            vf();
        }
    }

    @Override
    public void v0(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
        int J0;
        if (this.C0 && (J0 = this.f24235t0.J0(w6Var)) != -1) {
            this.f24235t0.r3(J0);
        }
    }

    public final void vf() {
        hg(true);
        this.f24232q0 = false;
        gg(1.0f);
    }

    public float wf() {
        return this.J0;
    }

    public final float xf() {
        return this.f24493a.Q1().get().getMeasuredWidth();
    }

    public final int yf() {
        int b12 = this.f24493a.b1();
        o6.p pVar = this.f24241z0;
        boolean z10 = pVar != null && pVar.f28164c.length > 0;
        if (b12 != 0 && z10) {
            return o6.B2;
        }
        if (b12 != 0) {
            return b12;
        }
        if (z10) {
            return o6.B2;
        }
        return 0;
    }

    @Override
    public void z(o6 o6Var, boolean z10) {
        r0.h(this, o6Var, z10);
    }

    @Override
    public void z5(w6 w6Var, int i10, int i11) {
        if (this.C0) {
            this.f24235t0.u1(i10 + 1, i11 + 1);
        }
    }

    public int zf() {
        return this.f24230o0;
    }
}
