package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import ce.a0;
import ce.p0;
import ce.y;
import eb.k;
import eb.l;
import gd.w;
import hd.b;
import hd.c3;
import hd.t2;
import ib.i;
import je.a;
import je.g;
import je.j;
import kb.c;
import ld.h;
import ld.p;
import ne.j3;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import ud.x2;
import yd.d;
import zd.g0;
import zd.h0;
import zd.i1;
import zd.j1;
import zd.o6;
import zd.t7;
import zd.w7;
import zd.x7;

public class y3 extends i implements c, h0, k.b, t7.i, t7.j, j1, a, j3.a, je.k, x2.f {
    public final p f18463k0 = new p(this, a0.i(25.0f));
    public final a f18464l0 = new a.b().c(this).h(R.id.theme_color_filling).b();
    public j3 f18465m0;
    public v4<?> f18466n0;
    public h f18467o0;
    public b f18468p0;
    public c3 f18469q0;
    public String f18470r0;
    public g f18471s0;
    public float f18472t0;
    public boolean f18473u0;
    public k f18474v0;

    public y3(Context context, o6 o6Var) {
        super(context, o6Var);
        p0.T(this);
        d.j(this);
    }

    public void Y0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (this.f18469q0 != null && e.l1(this.f18085b.d4(getChatId()), notificationSettingsScope)) {
            this.f18469q0.K();
            this.f18464l0.w(!this.f18469q0.x(), true);
        }
    }

    public void b1(long j10) {
        c3 c3Var;
        if (j10 == getChatId() && (c3Var = this.f18469q0) != null) {
            c3Var.K();
            this.f18464l0.w(!this.f18469q0.x(), true);
        }
    }

    public void e1(TdApi.User user) {
        if (getUserId() == user.f19979id && this.f18469q0 != null) {
            o1(true);
        }
    }

    public void f1(long j10) {
        if (getChatId() == j10 && this.f18469q0 != null) {
            o1(true);
        }
    }

    private static TextPaint getTextPaint() {
        return y.e0();
    }

    private void setAvatar(h hVar) {
        this.f18467o0 = hVar;
        this.f18463k0.G(hVar);
        invalidate();
    }

    private void setAvatarPlaceholder(b.a aVar) {
        if (aVar != null) {
            this.f18468p0 = new b(25.0f, aVar, null);
        } else {
            this.f18468p0 = null;
        }
        invalidate();
    }

    private void setOnlineFactor(float f10) {
        if (this.f18472t0 != f10) {
            this.f18472t0 = f10;
            invalidate();
        }
    }

    private void setTitle(String str) {
        if (!i.c(this.f18470r0, str)) {
            this.f18470r0 = str;
            Q0();
        }
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        if (!z10 && getUserId() == j10) {
            m1(t2.r3(userStatus), true);
        }
    }

    @Override
    public void A5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        i1.b(this, notificationSettingsScope);
    }

    @Override
    public void B3(long j10, boolean z10) {
        g0.i(this, j10, z10);
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        g0.x(this, j10, i10, z10);
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f18085b.hd().post(new Runnable() {
            @Override
            public final void run() {
                y3.this.e1(user);
            }
        });
    }

    @Override
    public void N0(long j10, int i10) {
        g0.l(this, j10, i10);
    }

    @Override
    public void N1(long j10, boolean z10) {
        n1(j10);
    }

    public final void P0(boolean z10) {
        if (this.f18474v0 == null) {
            this.f18474v0 = new k(1, this, db.b.f7287b, 180L);
        }
        this.f18474v0.k();
        float f10 = 0.0f;
        if (!z10 || this.f18472t0 != 0.0f) {
            this.f18474v0.B(db.b.f7287b);
            this.f18474v0.y(100L);
        } else {
            this.f18474v0.B(db.b.f7291f);
            this.f18474v0.y(210L);
        }
        k kVar = this.f18474v0;
        if (z10) {
            f10 = 1.0f;
        }
        kVar.i(f10);
    }

    public final void Q0() {
        int measuredWidth = getMeasuredWidth() - a0.i(6.0f);
        c3 c3Var = this.f18469q0;
        if (c3Var != null && c3Var.t()) {
            measuredWidth -= a0.i(12.0f);
        }
        if (measuredWidth <= 0 || i.i(this.f18470r0)) {
            this.f18471s0 = null;
        } else {
            this.f18471s0 = new g.b(this.f18470r0, measuredWidth, y.A0(13.0f), this).v().f();
        }
    }

    @Override
    public void Q2() {
        this.f18463k0.b0();
        setChat(null);
    }

    @Override
    public int R() {
        return j.d(this);
    }

    @Override
    public void R3(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        n1(j10);
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        n1(j10);
    }

    public final void V0(boolean z10) {
        k kVar = this.f18474v0;
        float f10 = 1.0f;
        if (kVar != null) {
            kVar.l(z10 ? 1.0f : 0.0f);
        }
        if (!z10) {
            f10 = 0.0f;
        }
        setOnlineFactor(f10);
    }

    @Override
    public long W0(boolean z10) {
        return j.c(this, z10);
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        g0.a(this, j10, chatActionBar);
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    @Override
    public void Y3(final long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        this.f18085b.hd().post(new Runnable() {
            @Override
            public final void run() {
                y3.this.b1(j10);
            }
        });
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    @Override
    public int a1() {
        return j.f(this);
    }

    @Override
    public void b() {
        this.f18463k0.b();
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    @Override
    public int c() {
        c3 c3Var = this.f18469q0;
        boolean z10 = c3Var != null && c3Var.t();
        j3 j3Var = this.f18465m0;
        float a10 = j3Var != null ? j3Var.a() : 0.0f;
        if (z10) {
            return ae.j.L(R.id.theme_color_textSecure);
        }
        return a10 == 0.0f ? ae.j.P0() : ib.d.d(ae.j.P0(), ae.j.L(R.id.theme_color_textSearchQueryHighlight), a10);
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    @Override
    public int d(boolean z10) {
        return j.b(this, z10);
    }

    @Override
    public void d1(View view, Rect rect) {
        this.f18463k0.Z0(rect);
    }

    @Override
    public void e() {
        this.f18463k0.e();
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        n1(j10);
    }

    @Override
    public int g(boolean z10) {
        return j.h(this, z10);
    }

    public long getChatId() {
        c3 c3Var = this.f18469q0;
        if (c3Var != null) {
            return c3Var.i();
        }
        return 0L;
    }

    public long getUserId() {
        c3 c3Var = this.f18469q0;
        if (c3Var == null || c3Var.u()) {
            return 0L;
        }
        return this.f18469q0.p();
    }

    @Override
    public void i(float f10) {
        p1();
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    public void l1(boolean z10, boolean z11) {
        j3 j3Var = this.f18465m0;
        if (z10 != (j3Var != null && j3Var.b())) {
            if (this.f18465m0 == null) {
                this.f18465m0 = new j3(this, this.f18463k0);
            }
            this.f18465m0.d(z10, z11);
        }
    }

    public final void m1(boolean z10, boolean z11) {
        if (this.f18473u0 != z10) {
            this.f18473u0 = z10;
            if (!z11 || !T()) {
                V0(z10);
            } else {
                P0(z10);
            }
        }
    }

    public final void n1(final long j10) {
        if (getChatId() == j10) {
            this.f18085b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    y3.this.f1(j10);
                }
            });
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 1) {
            setOnlineFactor(f10);
        }
    }

    @Override
    public int o0(boolean z10) {
        return j.e(this, z10);
    }

    public final void o1(boolean z10) {
        this.f18469q0.I();
        setAvatarPlaceholder(this.f18469q0.c());
        setAvatar(this.f18469q0.b());
        setTitle(this.f18469q0.m().toString());
        a aVar = this.f18464l0;
        int o10 = this.f18469q0.o();
        boolean z11 = true;
        boolean z12 = !this.f18469q0.x();
        if (!z10 || !T()) {
            z11 = false;
        }
        aVar.v(o10, z12, z11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        l.a(this, i10, f10, kVar);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        if (this.f18467o0 != null) {
            if (this.f18463k0.e0()) {
                this.f18463k0.u0(canvas, a0.i(25.0f));
            }
            this.f18463k0.draw(canvas);
        } else {
            b bVar = this.f18468p0;
            if (bVar != null) {
                bVar.a(canvas, this.f18463k0.J0(), this.f18463k0.x0());
            }
        }
        j3 j3Var = this.f18465m0;
        float a10 = j3Var != null ? j3Var.a() : 0.0f;
        double radians = Math.toRadians(w.G2() ? 225.0d : 135.0d);
        float J0 = this.f18463k0.J0() + ((float) ((this.f18463k0.getWidth() / 2) * Math.sin(radians)));
        float x02 = this.f18463k0.x0() + ((float) ((this.f18463k0.getHeight() / 2) * Math.cos(radians)));
        float f10 = 1.0f - a10;
        this.f18464l0.e(canvas, J0, x02, w.G2() ? 3 : 5, f10);
        ce.b.r(canvas, this.f18463k0, this.f18472t0 * f10);
        if (a10 > 0.0f) {
            ce.b.y(canvas, this.f18463k0, a10);
        }
        if (this.f18471s0 != null) {
            TextPaint textPaint = getTextPaint();
            int color = textPaint.getColor();
            c3 c3Var = this.f18469q0;
            boolean z10 = c3Var != null && c3Var.t();
            int measuredHeight = (getMeasuredHeight() / 2) + a0.i(22.0f);
            if (z10) {
                Drawable k10 = ce.p.k();
                int measuredWidth = (getMeasuredWidth() / 2) - ((this.f18471s0.getWidth() + k10.getMinimumWidth()) / 2);
                ce.c.b(canvas, k10, measuredWidth, ((this.f18471s0.getHeight() / 2) + measuredHeight) - (k10.getMinimumHeight() / 2), y.F());
                i10 = measuredWidth + k10.getMinimumWidth();
            } else {
                i10 = (getMeasuredWidth() / 2) - (this.f18471s0.getWidth() / 2);
            }
            this.f18471s0.t(canvas, i10, measuredHeight);
            textPaint.setColor(color);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = a0.i(25.0f);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = (getMeasuredHeight() / 2) - a0.i(11.0f);
        this.f18463k0.K0(measuredWidth - i12, measuredHeight - i12, measuredWidth + i12, measuredHeight + i12);
        Q0();
    }

    public final void p1() {
    }

    @Override
    public void p6(long j10, boolean z10) {
        g0.h(this, j10, z10);
    }

    @Override
    public void q2(long j10, boolean z10) {
        g0.e(this, j10, z10);
    }

    @Override
    public int r0(boolean z10) {
        return j.a(this, z10);
    }

    public void setChat(c3 c3Var) {
        c3 c3Var2 = this.f18469q0;
        long f10 = c3Var2 != null ? c3Var2.f() : 0L;
        long f11 = c3Var != null ? c3Var.f() : 0L;
        if (f10 != f11) {
            if (f10 != 0 && !this.f18469q0.w()) {
                this.f18085b.O9().q0(f10, this);
                this.f18085b.O9().w0(f10, this);
            }
            long userId = getUserId();
            if (userId != 0) {
                this.f18085b.e2().r2(userId, this);
            }
            this.f18469q0 = c3Var;
            w0(c3Var != null ? c3Var.j() : null, f11, null);
            if (c3Var != null) {
                p1();
                o1(false);
                long userId2 = getUserId();
                m1(!c3Var.u() && userId2 != 0 && this.f18085b.e2().m0(userId2), false);
                if (!c3Var.w()) {
                    this.f18085b.O9().d0(f11, this);
                    this.f18085b.O9().j0(f11, this);
                }
                if (userId2 != 0) {
                    this.f18085b.e2().d2(userId2, this);
                    return;
                }
                return;
            }
            setAvatar(null);
            setTitle("");
        }
    }

    public void setThemeProvider(v4<?> v4Var) {
        this.f18466n0 = v4Var;
        if (v4Var != null) {
            v4Var.t8(this);
        }
    }

    @Override
    public int t0(boolean z10) {
        return j.g(this, z10);
    }

    @Override
    public void t4(long j10, String[] strArr) {
        g0.b(this, j10, strArr);
    }

    @Override
    public void t7(long j10, TdApi.ChatPermissions chatPermissions) {
        g0.n(this, j10, chatPermissions);
    }

    @Override
    public boolean u3() {
        return x7.a(this);
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    @Override
    public void w1(long j10, boolean z10) {
        g0.c(this, j10, z10);
    }

    @Override
    public void w6(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        g0.p(this, j10, chatPosition, z10, z11, z12);
    }

    @Override
    public void x1(long j10) {
        i1.a(this, j10);
    }

    @Override
    public void x2(final TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        if (e.l1(this.f18085b.d4(getChatId()), notificationSettingsScope)) {
            this.f18085b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    y3.this.Y0(notificationSettingsScope);
                }
            });
        }
    }

    @Override
    public void x5(long j10, long j11) {
        g0.s(this, j10, j11);
    }

    @Override
    public void y1(long j10, long j11) {
        g0.r(this, j10, j11);
    }

    @Override
    public void z0() {
        i1.c(this);
    }
}
