package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1392p;
import be.C1399s0;
import be.C1410y;
import gd.C4587b;
import gd.C4601c3;
import gd.C4779t2;
import ie.AbstractC5408k;
import ie.C5375a;
import ie.C5406j;
import ie.RunnableC5390g;
import me.C6935j3;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p051db.C3953l;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p193nb.C7321e;
import p335xd.C10189d;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10817l1;
import p350yd.C10721i0;
import p350yd.C10791k1;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p350yd.C11165z7;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9357x2;

public class C7093z3 extends View$OnClickListenerC6902i implements AbstractC5911c, AbstractC10747j0, C3950k.AbstractC3952b, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j, AbstractC10817l1, AbstractC6828a, C6935j3.AbstractC6936a, AbstractC5408k, C9357x2.AbstractC9363f {
    public final C6257p f22567k0 = new C6257p(this, C1357a0.m37544i(25.0f));
    public final C5375a f22568l0 = new C5375a.C5377b().m23021c(this).m23016h(R.id.theme_color_filling).m23022b();
    public C6935j3 f22569m0;
    public AbstractC9323v4<?> f22570n0;
    public C6246h f22571o0;
    public C4587b f22572p0;
    public C4601c3 f22573q0;
    public String f22574r0;
    public RunnableC5390g f22575s0;
    public float f22576t0;
    public boolean f22577u0;
    public C3950k f22578v0;

    public C7093z3(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        C1399s0.m37196a0(this);
        C10189d.m5794j(this);
    }

    public void m17760U0(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (this.f22573q0 != null && C7321e.m16938j1(this.f21823b.m2556Z3(getChatId()), notificationSettingsScope)) {
            this.f22573q0.m27056K();
            this.f22568l0.m23026v(!this.f22573q0.m27030x(), true);
        }
    }

    public void m17759W0(long j) {
        C4601c3 c3Var;
        if (j == getChatId() && (c3Var = this.f22573q0) != null) {
            c3Var.m27056K();
            this.f22568l0.m23026v(!this.f22573q0.m27030x(), true);
        }
    }

    public void m17758c1(TdApi.User user) {
        if (getUserId() == user.f25442id && this.f22573q0 != null) {
            m17752n1(true);
        }
    }

    public void m17757d1(long j) {
        if (getChatId() == j && this.f22573q0 != null) {
            m17752n1(true);
        }
    }

    private static TextPaint getTextPaint() {
        return C1410y.m37045e0();
    }

    private void setAvatar(C6246h hVar) {
        this.f22571o0 = hVar;
        this.f22567k0.m20820G(hVar);
        invalidate();
    }

    private void setAvatarPlaceholder(C4587b.C4588a aVar) {
        if (aVar != null) {
            this.f22572p0 = new C4587b(25.0f, aVar, null);
        } else {
            this.f22572p0 = null;
        }
        invalidate();
    }

    private void setOnlineFactor(float f) {
        if (this.f22576t0 != f) {
            this.f22576t0 = f;
            invalidate();
        }
    }

    private void setTitle(String str) {
        if (!C5070i.m24068c(this.f22574r0, str)) {
            this.f22574r0 = str;
            m17762O0();
        }
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public void mo3249D2(final TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        if (C7321e.m16938j1(this.f21823b.m2556Z3(getChatId()), notificationSettingsScope)) {
            this.f21823b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C7093z3.this.m17760U0(notificationSettingsScope);
                }
            });
        }
    }

    @Override
    public boolean mo1350D3() {
        return C11165z7.m1323a(this);
    }

    @Override
    public void mo3248E5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        C10791k1.m3309b(this, notificationSettingsScope);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        if (!z && getUserId() == j) {
            m17755g1(C4779t2.m25437r3(userStatus), true);
        }
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo4071L0(long j, int i) {
        C10721i0.m4185l(this, j, i);
    }

    public final void m17763M0(boolean z) {
        if (this.f22578v0 == null) {
            this.f22578v0 = new C3950k(1, this, C2057b.f7280b, 180L);
        }
        this.f22578v0.m29544k();
        float f = 0.0f;
        if (!z || this.f22576t0 != 0.0f) {
            this.f22578v0.m29559B(C2057b.f7280b);
            this.f22578v0.m29530y(100L);
        } else {
            this.f22578v0.m29559B(C2057b.f7284f);
            this.f22578v0.m29530y(210L);
        }
        C3950k kVar = this.f22578v0;
        if (z) {
            f = 1.0f;
        }
        kVar.m29546i(f);
    }

    public final void m17762O0() {
        int measuredWidth = getMeasuredWidth() - C1357a0.m37544i(6.0f);
        C4601c3 c3Var = this.f22573q0;
        if (c3Var != null && c3Var.m27034t()) {
            measuredWidth -= C1357a0.m37544i(12.0f);
        }
        if (measuredWidth <= 0 || C5070i.m24062i(this.f22574r0)) {
            this.f22575s0 = null;
        } else {
            this.f22575s0 = new RunnableC5390g.C5392b(this.f22574r0, measuredWidth, C1410y.m37086A0(13.0f), this).m22869v().m22885f();
        }
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f21823b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C7093z3.this.m17758c1(user);
            }
        });
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            setOnlineFactor(f);
        }
    }

    @Override
    public int mo7858Q() {
        return C5406j.m22808d(this);
    }

    public final void m17761Q0(boolean z) {
        C3950k kVar = this.f22578v0;
        float f = 1.0f;
        if (kVar != null) {
            kVar.m29543l(z ? 1.0f : 0.0f);
        }
        if (!z) {
            f = 0.0f;
        }
        setOnlineFactor(f);
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        m17754i1(j);
    }

    @Override
    public void mo4069V5(long j, long j2, int i, boolean z) {
        m17754i1(j);
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public long mo7857X0(boolean z) {
        return C5406j.m22809c(this, z);
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C3953l.m29528a(this, i, f, kVar);
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    @Override
    public void mo4501a3() {
        this.f22567k0.mo20250Z();
        setChat(null);
    }

    @Override
    public void mo8229b() {
        this.f22567k0.mo20248b();
    }

    @Override
    public int mo7856b1() {
        return C5406j.m22806f(this);
    }

    @Override
    public int mo7855c() {
        C4601c3 c3Var = this.f22573q0;
        boolean z = c3Var != null && c3Var.m27034t();
        C6935j3 j3Var = this.f22569m0;
        float a = j3Var != null ? j3Var.m18405a() : 0.0f;
        if (z) {
            return C11524j.m228N(R.id.theme_color_textSecure);
        }
        return a == 0.0f ? C11524j.m217S0() : C5064d.m24129d(C11524j.m217S0(), C11524j.m228N(R.id.theme_color_textSearchQueryHighlight), a);
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        m17754i1(j);
    }

    @Override
    public int mo7854e(boolean z) {
        return C5406j.m22810b(this, z);
    }

    public void m17756e1(boolean z, boolean z2) {
        C6935j3 j3Var = this.f22569m0;
        if (z != (j3Var != null && j3Var.m18404b())) {
            if (this.f22569m0 == null) {
                this.f22569m0 = new C6935j3(this, this.f22567k0);
            }
            this.f22569m0.m18402d(z, z2);
        }
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    @Override
    public void mo8225f() {
        this.f22567k0.mo20246f();
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        this.f22567k0.mo20249a1(rect);
    }

    @Override
    public int mo7853g(boolean z) {
        return C5406j.m22804h(this, z);
    }

    public final void m17755g1(boolean z, boolean z2) {
        if (this.f22577u0 != z) {
            this.f22577u0 = z;
            if (!z2 || !m18507S()) {
                m17761Q0(z);
            } else {
                m17763M0(z);
            }
        }
    }

    public long getChatId() {
        C4601c3 c3Var = this.f22573q0;
        if (c3Var != null) {
            return c3Var.m27045i();
        }
        return 0L;
    }

    public long getUserId() {
        C4601c3 c3Var = this.f22573q0;
        if (c3Var == null || c3Var.m27033u()) {
            return 0L;
        }
        return this.f22573q0.m27038p();
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    public final void m17754i1(final long j) {
        if (getChatId() == j) {
            this.f21823b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C7093z3.this.m17757d1(j);
                }
            });
        }
    }

    @Override
    public void mo4061i5(long j, String str) {
        m17754i1(j);
    }

    @Override
    public void mo17753j(float f) {
        m17751o1();
    }

    @Override
    public void mo3247l4(final long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        this.f21823b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C7093z3.this.m17759W0(j);
            }
        });
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    public final void m17752n1(boolean z) {
        this.f22573q0.m27058I();
        setAvatarPlaceholder(this.f22573q0.m27051c());
        setAvatar(this.f22573q0.m27052b());
        setTitle(this.f22573q0.m27041m().toString());
        C5375a aVar = this.f22568l0;
        int o = this.f22573q0.m27039o();
        boolean z2 = true;
        boolean z3 = !this.f22573q0.m27030x();
        if (!z || !m18507S()) {
            z2 = false;
        }
        aVar.m23027u(o, z3, z2);
    }

    @Override
    public int mo7852o0(boolean z) {
        return C5406j.m22807e(this, z);
    }

    public final void m17751o1() {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        if (this.f22571o0 != null) {
            if (this.f22567k0.mo20247c0()) {
                this.f22567k0.mo20229u0(canvas, C1357a0.m37544i(25.0f));
            }
            this.f22567k0.draw(canvas);
        } else {
            C4587b bVar = this.f22572p0;
            if (bVar != null) {
                bVar.m27217a(canvas, this.f22567k0.mo20258I0(), this.f22567k0.mo20228y0());
            }
        }
        C6935j3 j3Var = this.f22569m0;
        float a = j3Var != null ? j3Var.m18405a() : 0.0f;
        double radians = Math.toRadians(C4403w.m27986G2() ? 225.0d : 135.0d);
        float I0 = this.f22567k0.mo20258I0() + ((float) ((this.f22567k0.getWidth() / 2) * Math.sin(radians)));
        float y0 = this.f22567k0.mo20228y0() + ((float) ((this.f22567k0.getHeight() / 2) * Math.cos(radians)));
        float f = 1.0f - a;
        this.f22568l0.m23040d(canvas, I0, y0, C4403w.m27986G2() ? 3 : 5, f);
        C1359b.m37504r(canvas, this.f22567k0, this.f22576t0 * f);
        if (a > 0.0f) {
            C1359b.m37497y(canvas, this.f22567k0, a);
        }
        if (this.f22575s0 != null) {
            TextPaint textPaint = getTextPaint();
            int color = textPaint.getColor();
            C4601c3 c3Var = this.f22573q0;
            boolean z = c3Var != null && c3Var.m27034t();
            int measuredHeight = (getMeasuredHeight() / 2) + C1357a0.m37544i(22.0f);
            if (z) {
                Drawable k = C1392p.m37228k();
                int measuredWidth = (getMeasuredWidth() / 2) - ((this.f22575s0.getWidth() + k.getMinimumWidth()) / 2);
                C1362c.m37490b(canvas, k, measuredWidth, ((this.f22575s0.getHeight() / 2) + measuredHeight) - (k.getMinimumHeight() / 2), C1410y.m37077F());
                i = measuredWidth + k.getMinimumWidth();
            } else {
                i = (getMeasuredWidth() / 2) - (this.f22575s0.getWidth() / 2);
            }
            this.f22575s0.m22904t(canvas, i, measuredHeight);
            textPaint.setColor(color);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = C1357a0.m37544i(25.0f);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = (getMeasuredHeight() / 2) - C1357a0.m37544i(11.0f);
        this.f22567k0.mo20257K0(measuredWidth - i3, measuredHeight - i3, measuredWidth + i3, measuredHeight + i3);
        m17762O0();
    }

    @Override
    public int mo7851p0(boolean z) {
        return C5406j.m22811a(this, z);
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public int mo7850r0(boolean z) {
        return C5406j.m22805g(this, z);
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    public void setChat(C4601c3 c3Var) {
        C4601c3 c3Var2 = this.f22573q0;
        long f = c3Var2 != null ? c3Var2.m27048f() : 0L;
        long f2 = c3Var != null ? c3Var.m27048f() : 0L;
        if (f != f2) {
            if (f != 0 && !this.f22573q0.m27031w()) {
                this.f21823b.m2781K9().m1818q0(f, this);
                this.f21823b.m2781K9().m1794w0(f, this);
            }
            long userId = getUserId();
            if (userId != 0) {
                this.f21823b.m2480e2().m1595s2(userId, this);
            }
            this.f22573q0 = c3Var;
            m18494v0(c3Var != null ? c3Var.m27044j() : null, f2, null);
            if (c3Var != null) {
                m17751o1();
                m17752n1(false);
                long userId2 = getUserId();
                m17755g1(!c3Var.m27033u() && userId2 != 0 && this.f21823b.m2480e2().m1621m0(userId2), false);
                if (!c3Var.m27031w()) {
                    this.f21823b.m2781K9().m1870d0(f2, this);
                    this.f21823b.m2781K9().m1846j0(f2, this);
                }
                if (userId2 != 0) {
                    this.f21823b.m2480e2().m1646f2(userId2, this);
                    return;
                }
                return;
            }
            setAvatar(null);
            setTitle("");
        }
    }

    public void setThemeProvider(AbstractC9323v4<?> v4Var) {
        this.f22570n0 = v4Var;
        if (v4Var != null) {
            v4Var.m9163t8(this);
        }
    }

    @Override
    public void mo4056t7(long j, TdApi.ChatPermissions chatPermissions) {
        C10721i0.m4183n(this, j, chatPermissions);
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    @Override
    public void mo3246x1(long j) {
        C10791k1.m3310a(this, j);
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }

    @Override
    public void mo3245z0() {
        C10791k1.m3308c(this);
    }
}
