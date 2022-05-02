package gd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import ie.AbstractC5408k;
import ie.AbstractC5411l0;
import ie.C5428t;
import ie.C5457w0;
import ie.C5459x0;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5067f;
import p126j$.util.DesugarTimeZone;
import p139jb.AbstractC5918j;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6257p;
import p193nb.C7316a;
import p193nb.C7321e;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9323v4;
import vc.C9903a;

public class C4699m1 extends AbstractC4576a1 {
    public static C5457w0 f15762A0;
    public static C5457w0 f15763B0;
    public static C5457w0 f15764p0;
    public static C5457w0 f15765q0;
    public static C5457w0 f15766r0;
    public static C5457w0 f15767s0;
    public static C5457w0 f15768t0;
    public static C5457w0 f15769u0;
    public static C5457w0 f15770v0;
    public static C5457w0 f15771w0;
    public static C5457w0 f15772x0;
    public static C5457w0 f15773y0;
    public static C5457w0 f15774z0;
    public int f15775W;
    public boolean f15776X;
    public boolean f15777Y;
    public float f15778Z;
    public C4336c f15779a0;
    public float f15780b0;
    public float f15781c0;
    public C3940f f15782d0;
    public boolean f15783e0;
    public C3940f f15784f0;
    public C6246h f15785g0;
    public C4587b f15786h0;
    public C6246h f15787i0;
    public C6246h f15788j0;
    public C6246h f15789k0;
    public boolean f15790l0;
    public int f15791m0;
    public C5459x0 f15792n0;
    public C5459x0 f15793o0;

    public class C4700a implements C4336c.AbstractC4337a {
        public final AbstractC9323v4 f15795a;
        public final TdApi.PageBlockChatLink f15796b;
        public final HandlerC10770jj.C10788q f15797c;

        public C4700a(AbstractC9323v4 v4Var, TdApi.PageBlockChatLink pageBlockChatLink, HandlerC10770jj.C10788q qVar) {
            this.f15795a = v4Var;
            this.f15796b = pageBlockChatLink;
            this.f15797c = qVar;
        }

        @Override
        public boolean mo7429B(float f, float f2) {
            return C4335b.m28260d(this, f, f2);
        }

        @Override
        public void mo7428C(View view, float f, float f2) {
            this.f15795a.mo4348c().m2485dd().m3399y7(this.f15795a, this.f15796b.username, this.f15797c);
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
        public void mo7419f3(View view, float f, float f2) {
            C4335b.m28259e(this, view, f, f2);
        }

        @Override
        public long getLongPressDuration() {
            return C4335b.m28262b(this);
        }

        @Override
        public boolean mo7418n0(View view, float f, float f2) {
            return f2 >= 0.0f && f2 < ((float) C4699m1.this.m27280o());
        }

        @Override
        public void mo7417o2(View view, float f, float f2) {
            C4335b.m28257g(this, view, f, f2);
        }

        @Override
        public void mo7416p(View view, float f, float f2) {
            C4335b.m28255i(this, view, f, f2);
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

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockTitle pageBlockTitle, boolean z, boolean z2, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockTitle);
        this.f15775W = R.id.theme_color_filling;
        float f = 16.0f;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26465B0(new TdApi.RichTextBold(pageBlockTitle.title), m26434u0(), C5428t.AbstractC5435c.f17867x, qVar);
        if (z2) {
            f = 10.0f;
        } else if (z) {
            f = 20.0f;
        }
        this.f15780b0 = f;
    }

    public static String m26452d0(C10930q6 q6Var, int i) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(i);
        calendar.setTimeInMillis(millis);
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        int i4 = calendar.get(13);
        if (i2 != 0 || i3 != 0 || i4 != 0) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            return C4403w.m27907a1(millis, timeUnit2, q6Var.m2898D4(), timeUnit2, false, 0);
        } else if (C5067f.m24108m(millis, timeUnit)) {
            return C4403w.m27871i1(R.string.Today);
        } else {
            if (C5067f.m24105p(millis, timeUnit)) {
                return C4403w.m27871i1(R.string.Yesterday);
            }
            return C4403w.m27848o0(millis, TimeUnit.MILLISECONDS);
        }
    }

    public static C5457w0 m26451e0() {
        if (f15766r0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15766r0 = w0Var;
            w0Var.m22656m(14.0f);
        }
        return f15766r0;
    }

    public static C5457w0 m26450f0() {
        if (f15773y0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15773y0 = w0Var;
            w0Var.m22656m(16.0f);
        }
        return f15773y0;
    }

    public static C5457w0 m26449g0() {
        if (f15762A0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15762A0 = w0Var;
            w0Var.m22656m(14.0f);
        }
        return f15762A0;
    }

    public static C5457w0 m26448h0() {
        if (f15763B0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15763B0 = w0Var;
            w0Var.m22656m(12.0f);
        }
        return f15763B0;
    }

    public static C5457w0 m26447i0() {
        if (f15767s0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15767s0 = w0Var;
            w0Var.m22656m(14.0f);
        }
        return f15767s0;
    }

    public static C5457w0 m26446j0() {
        if (f15769u0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15769u0 = w0Var;
            w0Var.m22656m(21.0f);
        }
        return f15769u0;
    }

    public static C5457w0 m26445k0() {
        if (f15772x0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15772x0 = w0Var;
            w0Var.m22656m(16.0f);
        }
        return f15772x0;
    }

    public static C5457w0 m26444l0() {
        if (f15768t0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15768t0 = w0Var;
            w0Var.m22656m(16.0f);
        }
        return f15768t0;
    }

    public static C5457w0 m26443m0() {
        if (f15771w0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15771w0 = w0Var;
            w0Var.m22656m(14.0f);
        }
        return f15771w0;
    }

    public static C5457w0 m26441n0() {
        if (f15774z0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15774z0 = w0Var;
            w0Var.m22656m(19.0f);
        }
        return f15774z0;
    }

    public static C5457w0 m26440o0() {
        if (f15770v0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15770v0 = w0Var;
            w0Var.m22656m(19.0f);
        }
        return f15770v0;
    }

    public static C5457w0 m26439p0() {
        if (f15765q0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15765q0 = w0Var;
            w0Var.m22656m(21.0f);
        }
        return f15765q0;
    }

    public static C5457w0 m26434u0() {
        if (f15764p0 == null) {
            C5457w0 w0Var = new C5457w0(C1389o.m37248x());
            f15764p0 = w0Var;
            w0Var.m22656m(24.0f);
        }
        return f15764p0;
    }

    public void m26433v0(int i, float f, float f2, C3950k kVar) {
        this.f15038c.invalidate();
    }

    public void m26432w0(TdApi.Chat chat, long j, HandlerC10770jj.C10788q qVar, TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (supergroupFullInfo.memberCount > 1) {
            m26464C0(chat, j, qVar);
        }
    }

    public void m26431x0(AbstractC9323v4 v4Var, final long j, final HandlerC10770jj.C10788q qVar, TdApi.Object object) {
        if (object.getConstructor() == -1601123095) {
            final TdApi.Chat chat = (TdApi.Chat) object;
            if (!C7316a.m17049l(chat.f25370id)) {
                if (v4Var.mo4348c().m2303p3(chat.f25370id) > 1 || v4Var.mo4348c().m2816I6(chat)) {
                    m26464C0(chat, j, qVar);
                } else if (chat.type.getConstructor() == -1472570774) {
                    v4Var.mo4348c().m2480e2().m1627k2(C7316a.m17045p(chat.f25370id), new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            C4699m1.this.m26432w0(chat, j, qVar, (TdApi.SupergroupFullInfo) obj);
                        }
                    });
                }
            }
        }
    }

    public void m26430y0(int i, float f, float f2, C3950k kVar) {
        this.f15038c.invalidate();
    }

    public void m26429z0(TdApi.Chat chat, HandlerC10770jj.C10788q qVar, long j) {
        int o = m27280o() - (C1357a0.m37544i(8.0f) * 2);
        this.f15785g0 = this.f15036a.mo4348c().m2526b3(chat.f25370id);
        int i = 0;
        this.f15786h0 = this.f15036a.mo4348c().m2947A3(chat, false, C1357a0.m37532u(o / 2.0f), null);
        mo13518a();
        CharSequence n = this.f15036a.mo4348c().m2166xc().m3295n(chat);
        C5459x0 E = new C5459x0(n.toString(), m26448h0(), this.f15792n0.m22616w(), AbstractC5411l0.m22791E(this.f15036a.mo4348c(), n.toString(), C4779t2.m25393x5(n, false), qVar)).m22640E(1);
        this.f15793o0 = E;
        int w = (m27277w() - m26437r0()) - m26436s0();
        if (this.f15777Y) {
            i = C1357a0.m37544i(12.0f);
        }
        E.m22643B((w - i) - o);
        if (!this.f15038c.mo28227g() || !this.f15036a.m9353Ra() || SystemClock.uptimeMillis() - j <= 50) {
            this.f15038c.invalidate();
            return;
        }
        C3940f fVar = new C3940f(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i2, float f, float f2, C3950k kVar) {
                C4699m1.this.m26430y0(i2, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i2, float f, C3950k kVar) {
                C3953l.m29528a(this, i2, f, kVar);
            }
        }, C2057b.f7280b, 180L);
        this.f15784f0 = fVar;
        fVar.m29577p(true, true);
    }

    public final void m26466A0(TdApi.RichText richText, C5457w0 w0Var, AbstractC5408k kVar, int i, HandlerC10770jj.C10788q qVar) {
        AbstractC9323v4<?> v4Var = this.f15036a;
        C5459x0 z = C5459x0.m22613z(v4Var, v4Var instanceof RunnableC5390g.AbstractC5393c ? (RunnableC5390g.AbstractC5393c) v4Var : null, richText, w0Var, kVar, qVar);
        this.f15792n0 = z;
        z.m22637H(this.f15038c);
        if (i != 0) {
            this.f15792n0.m22636a(i);
        }
    }

    public final void m26465B0(TdApi.RichText richText, C5457w0 w0Var, AbstractC5408k kVar, HandlerC10770jj.C10788q qVar) {
        m26466A0(richText, w0Var, kVar, 0, qVar);
    }

    @Override
    public boolean mo26326C(View view, MotionEvent motionEvent) {
        C5459x0 x0Var;
        C4336c cVar = this.f15779a0;
        return (cVar != null && cVar.m28248e(view, motionEvent)) || ((x0Var = this.f15792n0) != null && x0Var.m22615x(view, motionEvent));
    }

    public final void m26464C0(final TdApi.Chat chat, final long j, final HandlerC10770jj.C10788q qVar) {
        TdApi.ChatMemberStatus K3 = this.f15036a.mo4348c().m2787K3(chat.f25370id);
        if (K3 != null) {
            C4779t2.m25507h3(K3);
        }
        this.f15036a.m9135wd(new Runnable() {
            @Override
            public final void run() {
                C4699m1.this.m26429z0(chat, qVar, j);
            }
        });
    }

    @Override
    public boolean mo26463D(String str) {
        AbstractC5411l0[] m;
        C5459x0 x0Var = this.f15792n0;
        if (!(x0Var == null || (m = x0Var.m22626m()) == null)) {
            for (AbstractC5411l0 l0Var : m) {
                if (l0Var.mo22741m(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m26462D0() {
        return this.f15782d0.m29575r(true);
    }

    @Override
    public boolean mo26461H() {
        return this.f15782d0 != null;
    }

    @Override
    public void mo26460K(AbstractC4576a1 a1Var) {
        super.mo26460K(a1Var);
        if (a1Var instanceof C4699m1) {
            this.f15777Y = ((C4699m1) a1Var).f15777Y;
        }
    }

    @Override
    public void mo26325R(C6238b bVar) {
        C5459x0 x0Var = this.f15792n0;
        if (x0Var != null) {
            x0Var.m22642C(bVar);
        } else {
            bVar.m21000d();
        }
        if (this.f15785g0 != null) {
            bVar.m20993k(2147483647L).m20820G(this.f15785g0);
        }
    }

    @Override
    public void mo26459S(C6257p pVar) {
        pVar.m20820G(this.f15789k0);
    }

    @Override
    public void mo26458T(C6240c cVar) {
        C6246h hVar = this.f15789k0;
        if (hVar == null || !C4779t2.m25599T2(hVar.m20911k())) {
            cVar.m20978j(this.f15787i0, this.f15788j0);
        } else {
            cVar.clear();
        }
    }

    @Override
    public int mo26324f(View view, int i) {
        int i2 = 0;
        if (this.f15792n0 == null) {
            return 0;
        }
        int r0 = (i - m26437r0()) - m26436s0();
        if (this.f15777Y) {
            i2 = C1357a0.m37544i(12.0f);
        }
        int i3 = r0 - i2;
        RunnableC5390g B = this.f15792n0.m22643B(i3);
        C5459x0 x0Var = this.f15793o0;
        if (x0Var != null) {
            x0Var.m22643B(i3);
        }
        this.f15776X = B.m22891z0();
        return this.f15792n0.getHeight() + mo26321q() + m26438q0();
    }

    @Override
    public void mo26323i(View view, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f15792n0 != null) {
            int measuredWidth = view.getMeasuredWidth();
            int r0 = m26437r0();
            int q = mo26321q();
            if (this.f15783e0 && this.f15775W != 0) {
                canvas.drawRect(0.0f, 0.0f, measuredWidth, m27280o(), C1410y.m37042g(C11524j.m228N(this.f15775W)));
            }
            if (this.f15790l0) {
                int i5 = C1357a0.m37544i(40.0f);
                int i6 = (r0 - i5) - C1357a0.m37544i(14.0f);
                int i7 = q - C1357a0.m37544i(4.0f);
                if (this.f15788j0 != null) {
                    if (vVar2.mo20247c0()) {
                        if (vVar.mo20247c0()) {
                            canvas.drawCircle(i6 + i4, i7 + i4, i5 / 2, C1410y.m37042g(C11524j.m241G0()));
                        }
                        vVar.mo20257K0(i6, i7, i6 + i5, i7 + i5);
                        vVar.draw(canvas);
                    }
                    vVar2.mo20257K0(i6, i7, i6 + i5, i5 + i7);
                    vVar2.draw(canvas);
                } else {
                    canvas.drawCircle(i6 + i3, i7 + i3, i5 / 2, C1410y.m37042g(C11524j.m228N(this.f15791m0)));
                }
            }
            if (this.f15777Y) {
                int N = C11524j.m228N(R.id.theme_color_iv_blockQuoteLine);
                RectF a0 = C1410y.m37053a0();
                int i8 = C1357a0.m37544i(3.0f);
                int i9 = C1357a0.m37544i(8.0f) / 2;
                a0.top = q - i9;
                a0.bottom = i9 + q + this.f15792n0.getHeight();
                if (this.f15776X) {
                    a0.right = measuredWidth - r0;
                    a0.left = i2 - i8;
                } else {
                    a0.left = r0;
                    a0.right = r0 + i8;
                }
                float f = i8 / 2;
                canvas.drawRoundRect(a0, f, f, C1410y.m37042g(N));
                if (this.f15027N) {
                    canvas.drawRect(a0.left, 0.0f, a0.right, i8 + a0.top, C1410y.m37042g(N));
                }
                if (this.f15026M) {
                    canvas.drawRect(a0.left, a0.bottom - i8, a0.right, view.getMeasuredHeight(), C1410y.m37042g(N));
                }
            }
            if (!this.f15777Y) {
                i = measuredWidth - r0;
            } else if (this.f15776X) {
                i = (measuredWidth - r0) - C1357a0.m37544i(12.0f);
            } else {
                i = C1357a0.m37544i(12.0f) + r0 + this.f15792n0.getWidth();
            }
            int i10 = i;
            if (this.f15777Y) {
                r0 += C1357a0.m37544i(12.0f);
            }
            if (this.f15782d0 != null) {
                C1359b.m37515g(canvas, r0 - C1357a0.m37544i(18.0f), this.f15792n0.m22622q() + q, C11524j.m228N(R.id.theme_color_iv_icon), this.f15782d0.m29586g(), 0.0f);
                canvas.drawRect(0.0f, view.getMeasuredHeight() - C1357a0.m37529x(), measuredWidth, view.getMeasuredHeight(), C1410y.m37042g(C11524j.m228N(R.id.theme_color_iv_separator)));
            }
            if (this.f15793o0 != null) {
                C3940f fVar = this.f15784f0;
                float g = fVar != null ? fVar.m29586g() : 1.0f;
                q = (int) (q - ((this.f15793o0.getHeight() * g) / 2.0f));
                int V = C1399s0.m37202V(canvas);
                int i11 = C1357a0.m37544i(8.0f);
                int o = m27280o() - (i11 * 2);
                float f2 = r0;
                float f3 = o / 2.0f;
                int i12 = (int) (((f2 + f3) - (this.f15783e0 ? i11 / 2 : 0)) - ((o + i11) * (1.0f - g)));
                int o2 = m27280o() / 2;
                float f4 = i12;
                float f5 = o2;
                canvas.drawCircle(f4, f5, f3, C1410y.m37042g(C5064d.m24132a(g, C11524j.m241G0())));
                if (this.f15785g0 == null || bVar == null) {
                    C4587b bVar2 = this.f15786h0;
                    if (bVar2 != null) {
                        bVar2.m27216b(canvas, f4, f5, g);
                    }
                } else {
                    C6257p k = bVar.m20993k(2147483647L);
                    int i13 = o / 2;
                    k.mo20257K0(i12 - i13, o2 - i13, i12 + i13, o2 + i13);
                    k.mo20260D0(i13);
                    k.mo20251U(k.mo20253R0() * g);
                    k.draw(canvas);
                    k.mo20254P();
                }
                if (this.f15783e0) {
                    i11 /= 2;
                }
                r0 = (int) (f2 + ((o + i11) * g));
                C1399s0.m37204T(canvas, V);
            }
            this.f15792n0.m22630i(canvas, r0, i10, 0, q, null, 1.0f, bVar);
            C5459x0 x0Var = this.f15793o0;
            if (x0Var != null) {
                int height = q + this.f15792n0.getHeight();
                C3940f fVar2 = this.f15784f0;
                x0Var.m22631h(canvas, r0, i10, 0, height, null, fVar2 != null ? fVar2.m29586g() * 0.8f : 0.8f);
            }
        }
    }

    @Override
    public int mo26386l() {
        return this.f15775W;
    }

    @Override
    public int mo26442n(String str, int i) {
        int F;
        C5459x0 x0Var = this.f15792n0;
        RunnableC5390g k = x0Var != null ? x0Var.m22628k(i) : null;
        if (k == null || (F = k.m22999F(str)) <= 0) {
            return 0;
        }
        return mo26321q() + (k.m22961Y() * F);
    }

    @Override
    public int mo26322p() {
        C5459x0 x0Var = this.f15792n0;
        if (x0Var != null) {
            return x0Var.getHeight();
        }
        return 0;
    }

    @Override
    public int mo26321q() {
        return m26435t0();
    }

    public final int m26438q0() {
        return C1357a0.m37544i(this.f15781c0);
    }

    public final int m26437r0() {
        int i = 0;
        int max = Math.max(m27276x(true), (this.f15031R || this.f15032S == null) ? C1357a0.m37544i(this.f15778Z) : 0) + (this.f15790l0 ? C1357a0.m37544i(40.0f) + C1357a0.m37544i(14.0f) : 0);
        if (this.f15782d0 != null) {
            i = C1357a0.m37544i(24.0f);
        }
        return max + i;
    }

    public final int m26436s0() {
        return Math.max(m27276x(false), C1357a0.m37544i(this.f15778Z));
    }

    public final int m26435t0() {
        return C1357a0.m37544i(this.f15780b0);
    }

    @Override
    public int mo26320z() {
        return (!this.f15790l0 || this.f15788j0 == null) ? 48 : 52;
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockSubtitle pageBlockSubtitle, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockSubtitle);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        this.f15780b0 = 0.0f;
        m26465B0(pageBlockSubtitle.subtitle, m26439p0(), C5428t.AbstractC5435c.f17868y, qVar);
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockHeader pageBlockHeader, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockHeader);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26466A0(new TdApi.RichTextBold(pageBlockHeader.header), m26446j0(), C5428t.AbstractC5435c.f17869z, 32, qVar);
        this.f15780b0 = 14.0f;
        this.f15781c0 = 8.0f;
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockSubheader pageBlockSubheader, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockSubheader);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26466A0(new TdApi.RichTextBold(pageBlockSubheader.subheader), m26440o0(), C5428t.AbstractC5435c.f17858A, 32, qVar);
        this.f15780b0 = 8.0f;
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockKicker pageBlockKicker, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockKicker);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        this.f15780b0 = 16.0f;
        this.f15781c0 = 3.0f;
        m26466A0(new TdApi.RichTextBold(pageBlockKicker.kicker), m26449g0(), C5428t.AbstractC5435c.f17864u, 32, qVar);
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockAuthorDate pageBlockAuthorDate, int i, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockAuthorDate);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        String trim = C4779t2.m25508h2(pageBlockAuthorDate.author).trim();
        this.f15781c0 = 8.0f;
        this.f15780b0 = 8.0f;
        if (!trim.isEmpty() || pageBlockAuthorDate.publishDate != 0) {
            ArrayList arrayList = new ArrayList();
            if (!trim.isEmpty()) {
                arrayList.add(pageBlockAuthorDate.author);
            }
            if (pageBlockAuthorDate.publishDate != 0) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new TdApi.RichTextPlain(C4403w.m27871i1(R.string.format_ivAuthorDateSeparator)));
                }
                arrayList.add(new TdApi.RichTextPlain(m26452d0(v4Var.mo4348c(), pageBlockAuthorDate.publishDate)));
            }
            if (i != 0) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new TdApi.RichTextPlain(C4403w.m27871i1(R.string.format_ivAuthorDateSeparator)));
                }
                arrayList.add(new TdApi.RichTextPlain(C4403w.m27846o2(R.string.xViews, i)));
            }
            m26465B0(arrayList.size() == 1 ? (TdApi.RichText) arrayList.get(0) : new TdApi.RichTexts((TdApi.RichText[]) arrayList.toArray(new TdApi.RichText[0])), m26451e0(), C5428t.AbstractC5435c.f17859B, qVar);
        }
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockParagraph pageBlockParagraph, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockParagraph);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26466A0(pageBlockParagraph.text, m26444l0(), C5428t.AbstractC5435c.f17860q, 32, qVar);
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockPreformatted pageBlockPreformatted, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockPreformatted);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26466A0(pageBlockPreformatted.text, m26443m0(), C5428t.AbstractC5435c.f17860q, 32, qVar);
        this.f15775W = R.id.theme_color_iv_preBlockBackground;
        this.f15778Z = 14.0f;
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockRelatedArticles pageBlockRelatedArticles, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockRelatedArticles);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26465B0(new TdApi.RichTextBold(pageBlockRelatedArticles.header), m26444l0(), C5428t.AbstractC5435c.f17864u, qVar);
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockTable pageBlockTable, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockTable);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        this.f15780b0 = 15.0f;
        this.f15781c0 = 2.0f;
        m26466A0(pageBlockTable.caption, m26449g0(), C5428t.AbstractC5435c.f17864u, 34, qVar);
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockDetails pageBlockDetails, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockDetails);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        this.f15782d0 = new C3940f(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C4699m1.this.m26433v0(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29528a(this, i, f, kVar);
            }
        }, C2057b.f7280b, 180L, pageBlockDetails.isOpen);
        this.f15780b0 = 15.0f;
        this.f15781c0 = 12.0f;
        m26466A0(pageBlockDetails.header, m26444l0(), C5428t.AbstractC5435c.f17860q, 32, qVar);
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockList pageBlockList, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockList);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26465B0(new TdApi.RichTextPlain(""), m26444l0(), C5428t.AbstractC5435c.f17860q, qVar);
    }

    public C4699m1(final AbstractC9323v4<?> v4Var, TdApi.PageBlockChatLink pageBlockChatLink, boolean z, int i, final HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockChatLink);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        this.f15781c0 = 16.0f;
        this.f15780b0 = 16.0f;
        m26465B0(new TdApi.RichTextBold(new TdApi.RichTextPlain(pageBlockChatLink.title)), m26444l0(), z ? C5428t.AbstractC5435c.f17861r : C5428t.AbstractC5435c.f17860q, qVar);
        this.f15783e0 = z;
        this.f15775W = z ? R.id.theme_color_iv_chatLinkOverlayBackground : R.id.theme_color_iv_chatLinkBackground;
        this.f15779a0 = new C4336c(new C4700a(v4Var, pageBlockChatLink, qVar));
        if (this.f15037b.getConstructor() == -202091253) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            v4Var.mo4348c().m2270r4().m14783o(new TdApi.SearchPublicChat(((TdApi.PageBlockChatLink) this.f15037b).username), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C4699m1.this.m26431x0(v4Var, uptimeMillis, qVar, object);
                }
            });
        }
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockFooter pageBlockFooter, boolean z, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockFooter);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26465B0(pageBlockFooter.footer, m26447i0(), C5428t.AbstractC5435c.f17863t, qVar);
        if (!z) {
            this.f15775W = 0;
        } else {
            this.f15780b0 = 3.0f;
        }
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockBlockQuote pageBlockBlockQuote, boolean z, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockBlockQuote);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        if (z) {
            m26466A0(pageBlockBlockQuote.credit, m26449g0(), C5428t.AbstractC5435c.f17864u, 32, qVar);
            if (!C7321e.m16962b1(pageBlockBlockQuote.text)) {
                this.f15780b0 = 3.0f;
            } else {
                this.f15780b0 = 12.0f;
            }
            this.f15781c0 = 12.0f;
        } else {
            m26466A0(pageBlockBlockQuote.text, m26450f0(), C5428t.AbstractC5435c.f17866w, 32, qVar);
            if (!C7321e.m16962b1(pageBlockBlockQuote.credit)) {
                this.f15781c0 = 3.0f;
            } else {
                this.f15781c0 = 12.0f;
            }
            this.f15780b0 = 12.0f;
        }
        this.f15777Y = true;
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockPullQuote pageBlockPullQuote, boolean z, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockPullQuote);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        if (z) {
            m26466A0(pageBlockPullQuote.credit, m26449g0(), C5428t.AbstractC5435c.f17864u, 34, qVar);
            this.f15780b0 = 3.0f;
        } else {
            m26466A0(pageBlockPullQuote.text, m26441n0(), C5428t.AbstractC5435c.f17865v, 34, qVar);
            if (!C7321e.m16962b1(pageBlockPullQuote.credit)) {
                this.f15781c0 = 3.0f;
            }
        }
        this.f15778Z = 22.0f;
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlock pageBlock, TdApi.PageBlockCaption pageBlockCaption, boolean z, boolean z2, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlock);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        float f = 8.0f;
        if (z) {
            if (!C7321e.m16962b1(pageBlockCaption.text)) {
                this.f15780b0 = 2.0f;
            } else {
                this.f15780b0 = 10.0f;
            }
            m26466A0(pageBlockCaption.credit, m26448h0(), C5428t.AbstractC5435c.f17864u, 32, qVar);
            this.f15781c0 = z2 ? 2.0f : f;
            return;
        }
        if (!C7321e.m16962b1(pageBlockCaption.credit)) {
            this.f15781c0 = 2.0f;
        } else {
            this.f15781c0 = z2 ? 2.0f : f;
        }
        this.f15780b0 = 10.0f;
        m26466A0(pageBlockCaption.text, m26449g0(), C5428t.AbstractC5435c.f17864u, 32, qVar);
    }

    public C4699m1(AbstractC9323v4<?> v4Var, TdApi.PageBlockEmbeddedPost pageBlockEmbeddedPost, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockEmbeddedPost);
        this.f15775W = R.id.theme_color_filling;
        this.f15778Z = 16.0f;
        this.f15780b0 = 6.0f;
        this.f15781c0 = 6.0f;
        m26466A0(new TdApi.RichTexts(new TdApi.RichText[]{new TdApi.RichTextPlain(pageBlockEmbeddedPost.author), new TdApi.RichTextPlain("\n"), new TdApi.RichTextPlain(m26452d0(v4Var.mo4348c(), pageBlockEmbeddedPost.date))}), m26447i0(), C5428t.AbstractC5435c.f17859B, 32, qVar);
        this.f15790l0 = true;
        TdApi.PhotoSize H0 = C7321e.m17004H0(pageBlockEmbeddedPost.authorPhoto);
        if (H0 != null) {
            if (pageBlockEmbeddedPost.authorPhoto.minithumbnail != null) {
                this.f15787i0 = new C6250i(pageBlockEmbeddedPost.authorPhoto.minithumbnail);
            } else {
                this.f15787i0 = null;
            }
            C6246h hVar = new C6246h(v4Var.mo4348c(), H0.photo);
            this.f15788j0 = hVar;
            hVar.mo20768t0(C9903a.getDefaultAvatarCacheSize());
            TdApi.PhotoSize s0 = C4779t2.m25433s0(pageBlockEmbeddedPost.authorPhoto, H0);
            if (s0 != null) {
                C6246h hVar2 = new C6246h(v4Var.mo4348c(), s0.photo);
                this.f15789k0 = hVar2;
                hVar2.mo20768t0(C9903a.getDefaultAvatarCacheSize());
                this.f15789k0.m20910k0();
                return;
            }
            this.f15788j0.m20910k0();
            return;
        }
        this.f15791m0 = C4779t2.m25682H0(pageBlockEmbeddedPost.author.hashCode(), 0L);
    }
}
