package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ce.a0;
import ce.y;
import ce.z;
import ed.j;
import gd.w;
import hd.b;
import hd.c3;
import hd.d3;
import hd.t2;
import ib.i;
import java.util.concurrent.TimeUnit;
import je.a;
import je.b;
import je.g;
import kb.c;
import ld.h;
import ld.p;
import ob.d;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.x2;
import zd.g0;
import zd.h0;
import zd.i1;
import zd.ic;
import zd.j1;
import zd.o6;
import zd.t7;
import zd.w7;

public class o extends i implements c, j.d, h0, t7.i, t7.h, t7.b, j1, t7.j, x2.f {
    public Drawable A0;
    public int B0;
    public int C0;
    public c3 D0;
    public boolean E0;
    public j F0;
    public d3 G0;
    public int f18278k0;
    public final p f18279l0;
    public CharSequence f18280m0;
    public CharSequence f18281n0;
    public float f18282o0;
    public Layout f18283p0;
    public CharSequence f18284q0;
    public CharSequence f18285r0;
    public float f18286s0;
    public Layout f18287t0;
    public String f18288u0;
    public float f18289v0;
    public final a f18290w0 = new a.b().d(new a.c() {
        @Override
        public boolean d(a aVar) {
            return b.a(this, aVar);
        }

        @Override
        public final void m(a aVar, boolean z10) {
            o.this.Y0(aVar, z10);
        }
    }).b();
    public h f18291x0;
    public hd.b f18292y0;
    public int f18293z0;

    public o(Context context, o6 o6Var) {
        super(context, o6Var);
        p pVar = new p(this, wc.a.L0(1));
        this.f18279l0 = pVar;
        pVar.K0(a0.i(11.0f), a0.i(10.0f), a0.i(11.0f) + a0.i(52.0f), a0.i(10.0f) + a0.i(52.0f));
    }

    public void Y0(a aVar, boolean z10) {
        if (z10) {
            r1();
            q1();
        }
        invalidate();
    }

    public void b1(TdApi.User user) {
        c3 c3Var = this.D0;
        if (c3Var != null && c3Var.p() == user.f19979id) {
            u1(true);
        }
    }

    public void e1(long j10) {
        c3 c3Var = this.D0;
        if (c3Var != null && c3Var.i() == j10) {
            u1(true);
        }
    }

    public void f1(long j10) {
        c3 c3Var = this.D0;
        if (c3Var != null && c3Var.e() == j10) {
            v1();
        }
    }

    private void setChatImpl(c3 c3Var) {
        c3 c3Var2 = this.D0;
        boolean z10 = false;
        long j10 = 0;
        if (c3Var2 != null) {
            if (c3Var2.d() != null) {
                Q0(this.D0.d(), false, this.E0);
            } else if (this.D0.p() != 0) {
                P0(this.D0.p(), false, this.E0);
            }
        }
        this.D0 = c3Var;
        int i10 = this.f18278k0;
        if (c3Var != null && c3Var.u()) {
            z10 = true;
        }
        this.f18278k0 = ib.c.h(i10, 8, z10);
        if (c3Var != null) {
            setIsSecret(c3Var.t());
            if (c3Var.d() != null) {
                Q0(c3Var.d(), true, !c3Var.s());
                j10 = c3Var.d().f19908id;
            } else if (c3Var.p() != 0) {
                P0(this.D0.p(), true, !c3Var.s());
                j10 = ob.a.c(this.D0.p());
            }
            w0(c3Var.j(), j10, null);
            return;
        }
        w0(null, 0L, null);
    }

    private void setMessageImpl(d3 d3Var) {
        if (this.G0 != null) {
            this.f18085b.O9().q0(this.G0.c().i(), this);
        }
        this.G0 = d3Var;
        if (d3Var != null) {
            long i10 = d3Var.c().i();
            setIsSecret(d3Var.c().t());
            y0(d3Var.c().j(), i10, null, new d(i10, d3Var.d()), null);
            this.f18085b.O9().d0(i10, this);
            return;
        }
        L();
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        c3 c3Var = this.D0;
        if (c3Var != null && c3Var.p() == j10) {
            v1();
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
    public void K2(TdApi.BasicGroup basicGroup, boolean z10) {
        z1(ob.a.a(basicGroup.f19904id));
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f18085b.id(new Runnable() {
            @Override
            public final void run() {
                o.this.b1(user);
            }
        });
    }

    @Override
    public void N0(long j10, int i10) {
        z1(j10);
    }

    @Override
    public void N1(long j10, boolean z10) {
        t1(j10);
    }

    public final void P0(long j10, boolean z10, boolean z11) {
        if (z10) {
            this.E0 = z11;
            this.f18085b.e2().d2(j10, this);
            return;
        }
        this.f18085b.e2().r2(j10, this);
    }

    public final void Q0(TdApi.Chat chat, boolean z10, boolean z11) {
        if (z10) {
            this.f18085b.O9().d0(chat.f19908id, this);
            this.f18085b.O9().j0(chat.f19908id, this);
        } else {
            this.f18085b.O9().q0(chat.f19908id, this);
            this.f18085b.O9().w0(chat.f19908id, this);
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (z10) {
                    this.f18085b.e2().b2(ob.a.p(chat.f19908id), this);
                    return;
                } else {
                    this.f18085b.e2().p2(ob.a.p(chat.f19908id), this);
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                if (z10) {
                    this.E0 = z11;
                    this.f18085b.e2().d2(t2.o2(chat.type), this);
                    return;
                }
                this.f18085b.e2().r2(t2.o2(chat.type), this);
                return;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                if (z10) {
                    this.f18085b.e2().Z1(ob.a.m(chat.f19908id), this);
                    return;
                } else {
                    this.f18085b.e2().n2(ob.a.m(chat.f19908id), this);
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void Q2() {
        this.f18279l0.b0();
        setChatImpl(null);
        setMessageImpl(null);
    }

    @Override
    public void R3(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        t1(j10);
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        t1(j10);
    }

    @Override
    public void U0() {
        if (this.F0 == null) {
            this.F0 = new j(this, R.drawable.baseline_delete_24);
        }
        this.F0.c();
    }

    public boolean V0() {
        return this.f18287t0 != null;
    }

    @Override
    public void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        z1(ob.a.a(j10));
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
    public void Y3(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        t1(j10);
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    public void b() {
        this.f18279l0.b();
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    @Override
    public void d1(View view, Rect rect) {
        if (this.f18281n0 != null) {
            int i10 = a0.i(72.0f);
            int i11 = (a0.i(28.0f) + a0.i(1.0f)) - a0.i(16.0f);
            boolean z10 = true;
            if ((this.f18278k0 & 1) == 0) {
                z10 = false;
            }
            int E0 = v0.E0(wc.a.o1(z10).getFontMetricsInt()) + i11;
            Layout layout = this.f18283p0;
            rect.set(i10, i11, ((int) (layout != null ? layout.getLineCount() > 0 ? this.f18283p0.getLineWidth(0) : 0.0f : this.f18282o0)) + i10, E0);
        }
    }

    public void e() {
        this.f18279l0.e();
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    @Override
    public void f0(long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        z1(ob.a.b(j10));
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        t1(j10);
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    public final void l1(int i10) {
        if (w.G2()) {
            int i11 = a0.i(11.0f);
            int i12 = i10 - i11;
            this.f18279l0.K0(i12 - a0.i(52.0f), a0.i(10.0f), i12, a0.i(10.0f) + a0.i(52.0f));
            return;
        }
        this.f18279l0.K0(a0.i(11.0f), a0.i(10.0f), a0.i(11.0f) + a0.i(52.0f), a0.i(10.0f) + a0.i(52.0f));
    }

    public void m1(h hVar, b.a aVar) {
        hd.b bVar = null;
        if (aVar != null) {
            bVar = new hd.b(wc.a.Q0(1) / 2.0f, aVar, null);
        }
        n1(hVar, bVar);
    }

    public void n1(h hVar, hd.b bVar) {
        this.f18291x0 = hVar;
        this.f18292y0 = bVar;
        this.f18279l0.G(hVar);
    }

    public void o1(TdApi.File file, hd.b bVar) {
        h hVar;
        if (file != null) {
            h hVar2 = this.f18291x0;
            if (hVar2 == null || e.N0(hVar2.k()) != file.f19913id) {
                h hVar3 = new h(this.f18085b, file);
                hVar3.t0(wc.a.getDefaultAvatarCacheSize());
                hVar = hVar3;
            } else {
                hVar = this.f18291x0;
            }
        } else {
            hVar = null;
        }
        n1(hVar, bVar);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int timePaddingRight;
        float f10;
        float f11;
        TextPaint textPaint;
        float f12;
        float f13;
        j jVar = this.F0;
        if (jVar != null) {
            jVar.e(canvas);
        }
        int measuredWidth = getMeasuredWidth();
        boolean G2 = w.G2();
        l1(measuredWidth);
        boolean z10 = true;
        if (this.f18291x0 != null) {
            if (this.f18279l0.e0()) {
                this.f18279l0.u0(canvas, wc.a.L0(1));
            }
            this.f18279l0.draw(canvas);
        } else {
            hd.b bVar = this.f18292y0;
            if (bVar != null) {
                bVar.a(canvas, this.f18279l0.J0(), this.f18279l0.x0());
            }
        }
        if (this.f18281n0 != null) {
            int i10 = this.f18278k0;
            boolean z11 = (i10 & 2) != 0;
            if ((i10 & 1) == 0) {
                z10 = false;
            }
            TextPaint o12 = wc.a.o1(z10);
            int i11 = a0.i(72.0f);
            if (z11) {
                textPaint = o12;
                ce.c.d(canvas, ce.p.j(), i11 - a0.i(6.0f), a0.i(12.0f), y.F(), measuredWidth, G2);
                i11 += a0.i(15.0f);
                textPaint.setColor(ae.j.L(R.id.theme_color_textSecure));
            } else {
                textPaint = o12;
            }
            int i12 = i11;
            int i13 = a0.i(28.0f) + a0.i(1.0f);
            Layout layout = this.f18283p0;
            if (layout != null) {
                int color = layout.getPaint().getColor();
                this.f18283p0.getPaint().setColor(textPaint.getColor());
                canvas.save();
                if (G2) {
                    f13 = measuredWidth - i12;
                    if (this.f18283p0.getLineCount() > 0) {
                        f12 = this.f18283p0.getLineLeft(0) + this.f18283p0.getLineWidth(0);
                        canvas.translate(f13 - f12, i13 - a0.i(16.0f));
                        this.f18283p0.draw(canvas);
                        canvas.restore();
                        this.f18283p0.getPaint().setColor(color);
                    }
                    f12 = 0.0f;
                    canvas.translate(f13 - f12, i13 - a0.i(16.0f));
                    this.f18283p0.draw(canvas);
                    canvas.restore();
                    this.f18283p0.getPaint().setColor(color);
                } else {
                    f13 = i12;
                    if (this.f18283p0.getLineCount() > 0) {
                        f12 = this.f18283p0.getLineLeft(0);
                        canvas.translate(f13 - f12, i13 - a0.i(16.0f));
                        this.f18283p0.draw(canvas);
                        canvas.restore();
                        this.f18283p0.getPaint().setColor(color);
                    }
                    f12 = 0.0f;
                    canvas.translate(f13 - f12, i13 - a0.i(16.0f));
                    this.f18283p0.draw(canvas);
                    canvas.restore();
                    this.f18283p0.getPaint().setColor(color);
                }
            } else {
                canvas.drawText((String) this.f18281n0, G2 ? (measuredWidth - i12) - this.f18282o0 : i12, i13, textPaint);
            }
            if (z11 || this.f18283p0 != null) {
                textPaint.setColor(ae.j.P0());
            }
        }
        int i14 = -a0.i(1.0f);
        if (this.f18285r0 != null) {
            int i15 = a0.i(72.0f);
            if (this.f18293z0 != 0) {
                i15 += a0.i(20.0f);
            }
            int i16 = a0.i(54.0f) + i14;
            if (this.f18287t0 != null) {
                int i17 = i16 - a0.i(14.5f);
                canvas.save();
                if (G2) {
                    f11 = measuredWidth - i15;
                    if (this.f18287t0.getLineCount() > 0) {
                        f10 = this.f18287t0.getLineLeft(0) + this.f18287t0.getLineWidth(0);
                        canvas.translate(f11 - f10, i17);
                        y.k0(ae.j.L(R.id.theme_color_textLight));
                        this.f18287t0.draw(canvas);
                        canvas.restore();
                        y.k0(ae.j.L(R.id.theme_color_textLight));
                    }
                    f10 = 0.0f;
                    canvas.translate(f11 - f10, i17);
                    y.k0(ae.j.L(R.id.theme_color_textLight));
                    this.f18287t0.draw(canvas);
                    canvas.restore();
                    y.k0(ae.j.L(R.id.theme_color_textLight));
                } else {
                    f11 = i15;
                    if (this.f18287t0.getLineCount() > 0) {
                        f10 = this.f18287t0.getLineLeft(0);
                        canvas.translate(f11 - f10, i17);
                        y.k0(ae.j.L(R.id.theme_color_textLight));
                        this.f18287t0.draw(canvas);
                        canvas.restore();
                        y.k0(ae.j.L(R.id.theme_color_textLight));
                    }
                    f10 = 0.0f;
                    canvas.translate(f11 - f10, i17);
                    y.k0(ae.j.L(R.id.theme_color_textLight));
                    this.f18287t0.draw(canvas);
                    canvas.restore();
                    y.k0(ae.j.L(R.id.theme_color_textLight));
                }
            } else {
                canvas.drawText((String) this.f18285r0, G2 ? (measuredWidth - i15) - this.f18286s0 : i15, i16, y.k0((this.f18278k0 & 4) != 0 ? ae.j.L(R.id.theme_color_textNeutral) : ae.j.R0()));
            }
        }
        if (this.f18293z0 != 0) {
            ce.c.d(canvas, this.A0, a0.i(72.0f), a0.i(this.f18293z0 == R.drawable.baseline_call_missed_18 ? 40.0f : 39.0f) + i14, z.b(this.B0), measuredWidth, G2);
        }
        String str = this.f18288u0;
        if (str != null) {
            canvas.drawText(str, G2 ? wc.a.getTimePaddingRight() : (measuredWidth - timePaddingRight) - this.f18289v0, a0.i(28.0f), wc.a.getTimePaint());
        }
        a aVar = this.f18290w0;
        int timePaddingRight2 = wc.a.getTimePaddingRight();
        aVar.e(canvas, G2 ? timePaddingRight2 + a0.i(11.5f) : (measuredWidth - timePaddingRight2) - a0.i(11.5f), getMeasuredHeight() / 2.0f, G2 ? 3 : 5, 1.0f);
        j jVar2 = this.F0;
        if (jVar2 != null) {
            jVar2.d(canvas);
            this.F0.b(canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        if (this.C0 != measuredWidth) {
            this.C0 = measuredWidth;
            l1(measuredWidth);
            r1();
            q1();
        }
    }

    public void p1(int i10, int i11) {
        int i12 = this.f18293z0;
        if (i12 != i10 || this.B0 != i11) {
            this.B0 = i11;
            if (i12 != i10) {
                boolean z10 = true;
                boolean z11 = i12 != 0;
                this.f18293z0 = i10;
                this.A0 = Z(i10, 0);
                if (i10 == 0) {
                    z10 = false;
                }
                if (z11 != z10) {
                    q1();
                }
            }
            invalidate();
        }
    }

    @Override
    public void p6(long j10, boolean z10) {
        g0.h(this, j10, z10);
    }

    public final void q1() {
        Layout Q;
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0 || i.i(this.f18284q0)) {
            this.f18285r0 = null;
            this.f18286s0 = 0.0f;
            return;
        }
        float i10 = (measuredWidth - a0.i(72.0f)) - wc.a.getTimePaddingRight();
        if (this.f18293z0 != 0) {
            i10 -= a0.i(18.0f);
        }
        float j10 = i10 - this.f18290w0.j(a0.i(8.0f) + a0.i(23.0f));
        CharSequence ellipsize = TextUtils.ellipsize(id.d.z().I(this.f18284q0), y.j0(), j10, TextUtils.TruncateAt.END);
        this.f18285r0 = ellipsize;
        if (!(ellipsize instanceof String)) {
            this.f18287t0 = v0.Q(this.f18285r0, (int) Math.max(a0.D(), j10), y.j0());
            this.f18286s0 = Q.getWidth();
            return;
        }
        this.f18287t0 = null;
        this.f18286s0 = v0.T1(ellipsize, y.j0());
    }

    @Override
    public void q2(long j10, boolean z10) {
        g0.e(this, j10, z10);
    }

    public final void r1() {
        Layout Q;
        int measuredWidth = getMeasuredWidth();
        CharSequence charSequence = this.f18280m0;
        if (measuredWidth <= 0 || i.i(charSequence)) {
            this.f18281n0 = null;
            this.f18282o0 = 0.0f;
            return;
        }
        float i10 = (measuredWidth - a0.i(72.0f)) - wc.a.getTimePaddingRight();
        float f10 = this.f18289v0;
        if (f10 != 0.0f) {
            i10 -= f10 + wc.a.getTimePaddingLeft();
        }
        if ((this.f18278k0 & 2) != 0) {
            i10 -= a0.i(15.0f);
        }
        float j10 = i10 - this.f18290w0.j(a0.i(8.0f) + a0.i(23.0f));
        boolean z10 = (this.f18278k0 & 2) != 0;
        CharSequence ellipsize = TextUtils.ellipsize(id.d.z().I(charSequence), wc.a.o1(z10), j10, TextUtils.TruncateAt.END);
        this.f18281n0 = ellipsize;
        if (!(ellipsize instanceof String)) {
            this.f18283p0 = v0.Q(this.f18281n0, a0.D(), wc.a.o1(z10));
            this.f18282o0 = Q.getWidth();
            return;
        }
        this.f18283p0 = null;
        this.f18282o0 = v0.T1(ellipsize, wc.a.o1(z10));
    }

    @Override
    public void s0(TdApi.Supergroup supergroup) {
        z1(ob.a.b(supergroup.f19965id));
    }

    public void s1(int i10, boolean z10, boolean z11) {
        this.f18290w0.v(i10, z10, z11);
    }

    public void setCallItem(hd.e eVar) {
        long m10 = eVar.m();
        TdApi.User u22 = this.f18085b.e2().u2(m10);
        y0(null, eVar.c(), null, new d(eVar.c(), eVar.e()), null);
        setTime(w.T2(eVar.d(), TimeUnit.SECONDS));
        setTitle(t2.p2(m10, u22));
        p1(eVar.i(), eVar.k());
        setSubtitle(eVar.g());
        boolean z10 = (u22 == null || u22.profilePhoto == null) ? false : true;
        hd.b bVar = null;
        TdApi.File file = z10 ? u22.profilePhoto.small : null;
        if (!z10 && u22 != null) {
            bVar = this.f18085b.e2().M2(u22, true, wc.a.Q0(1) / 2.0f, null);
        }
        o1(file, bVar);
        invalidate();
    }

    public void setChat(c3 c3Var) {
        if (c3Var == this.D0) {
            this.f18279l0.G(this.f18291x0);
            return;
        }
        if (this.G0 != null) {
            setMessageImpl(null);
        }
        setChatImpl(c3Var);
        if (c3Var != null) {
            u1(false);
        }
    }

    public void setIsOnline(boolean z10) {
        int h10 = ib.c.h(this.f18278k0, 4, z10);
        if (this.f18278k0 != h10) {
            this.f18278k0 = h10;
            invalidate();
        }
    }

    public void setIsSecret(boolean z10) {
        int h10 = ib.c.h(this.f18278k0, 2, z10);
        if (this.f18278k0 != h10) {
            this.f18278k0 = h10;
            r1();
            invalidate();
        }
    }

    public void setMessage(d3 d3Var) {
        hd.b bVar = null;
        h hVar = null;
        if (this.D0 != null) {
            setChatImpl(null);
        } else if (this.G0 == d3Var) {
            p pVar = this.f18279l0;
            if (d3Var != null) {
                hVar = d3Var.a();
            }
            pVar.G(hVar);
            return;
        }
        setMessageImpl(d3Var);
        if (d3Var != null) {
            TdApi.Message e10 = d3Var.e();
            this.f18278k0 = ib.c.h(this.f18278k0, 8, d3Var.c().u());
            setTime(w.V2(e10.date, TimeUnit.SECONDS));
            setTitle(d3Var.c().n());
            setSubtitle(d3Var.f());
            s1(0, this.f18290w0.p(), false);
            h a10 = d3Var.a();
            if (d3Var.b() != null) {
                bVar = new hd.b(wc.a.Q0(1) / 2.0f, d3Var.b(), null);
            }
            n1(a10, bVar);
            invalidate();
        }
    }

    @Override
    public void setRemoveDx(float f10) {
        if (this.F0 == null) {
            this.F0 = new j(this, R.drawable.baseline_delete_24);
        }
        this.F0.f(f10);
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!i.c(this.f18284q0, charSequence)) {
            this.f18284q0 = charSequence;
            q1();
        }
    }

    public void setTime(String str) {
        if (!i.c(this.f18288u0, str)) {
            this.f18288u0 = str;
            float T1 = v0.T1(str, wc.a.getTimePaint());
            if (this.f18289v0 != T1) {
                this.f18289v0 = T1;
                r1();
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!i.c(this.f18280m0, charSequence)) {
            this.f18280m0 = charSequence;
            this.f18278k0 = ib.c.h(this.f18278k0, 1, charSequence != null && g.M0(charSequence.toString()));
            r1();
        }
    }

    public final void t1(final long j10) {
        this.f18085b.id(new Runnable() {
            @Override
            public final void run() {
                o.this.e1(j10);
            }
        });
    }

    @Override
    public void t4(long j10, String[] strArr) {
        g0.b(this, j10, strArr);
    }

    @Override
    public void t7(long j10, TdApi.ChatPermissions chatPermissions) {
        g0.n(this, j10, chatPermissions);
    }

    public final void u1(boolean z10) {
        if (z10) {
            this.D0.I();
        }
        setTitle(this.D0.n());
        v1();
        m1(this.D0.b(), this.D0.c());
        setTime(null);
        s1(this.D0.o(), !this.D0.x(), z10);
    }

    @Override
    public boolean u3() {
        return this.E0;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    public final void v1() {
        c3 c3Var = this.D0;
        if (c3Var != null) {
            boolean z10 = false;
            if (i.i(c3Var.g())) {
                long p10 = this.D0.p();
                if (this.D0.s()) {
                    setSubtitle(this.D0.q());
                } else {
                    int i10 = (p10 > 0L ? 1 : (p10 == 0L ? 0 : -1));
                    ic Bc = this.f18085b.Bc();
                    String charSequence = (i10 != 0 ? Bc.q(p10) : Bc.m(this.D0.i())).toString();
                    if (this.D0.v()) {
                        String Q2 = i10 != 0 ? this.f18085b.e2().Q2(p10) : this.f18085b.j4(this.D0.i());
                        if (!i.i(Q2)) {
                            charSequence = "@" + Q2 + ", " + charSequence;
                        }
                    }
                    setSubtitle(charSequence);
                }
                if (!this.f18085b.o7(p10) && this.f18085b.e2().m0(p10)) {
                    z10 = true;
                }
                setIsOnline(z10);
            } else {
                setSubtitle(this.D0.g());
                setIsOnline(false);
            }
            invalidate();
        }
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
    public void x2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
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

    public final void z1(final long j10) {
        this.f18085b.id(new Runnable() {
            @Override
            public final void run() {
                o.this.f1(j10);
            }
        });
    }
}
