package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import ce.a0;
import ce.y;
import ce.z;
import de.ap;
import eb.n;
import eb.r;
import gb.h;
import gb.j;
import hd.t2;
import hd.u2;
import java.util.Iterator;
import je.g;
import je.t;
import ne.i;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import yd.d;
import zd.g0;
import zd.g1;
import zd.h0;
import zd.h1;
import zd.hj;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.t7;
import zd.w7;

public class z0 extends i implements ne.a, kb.c, h0, h1, t7.i, t1.a {
    public TdApi.Message f25388l0;
    public String f25389m0;
    public boolean f25390n0;
    public boolean f25391o0;
    public t2.d f25392p0;
    public final r<g> f25393q0;
    public final r<c> f25394r0;
    public final r<b> f25395s0;
    public int f25397u0;
    public int f25398v0;
    public boolean f25399w0;
    public final j f25387k0 = new h(this);
    public float f25396t0 = -1.0f;

    public static class a<T extends n.d> implements n.d {
        public T f25400a;

        public a(T t10) {
            this.f25400a = t10;
        }

        @Override
        public final int d(boolean z10) {
            return this.f25400a.d(z10);
        }

        @Override
        public final int g(boolean z10) {
            return this.f25400a.g(z10);
        }

        @Override
        public final int getHeight() {
            return this.f25400a.getHeight();
        }

        @Override
        public final int getWidth() {
            return this.f25400a.getWidth();
        }
    }

    public static class b extends a<n0> implements kb.c {
        public final ld.b f25401b;

        public b(n0 n0Var, ld.b bVar) {
            super(n0Var);
            this.f25401b = bVar;
        }

        @Override
        public void Q2() {
            this.f25401b.Q2();
        }
    }

    public static class c extends a<g> {
        public Drawable f25402b;

        public c(g gVar, Drawable drawable) {
            super(gVar);
            this.f25402b = drawable;
        }
    }

    public z0(Context context, o6 o6Var) {
        super(context, o6Var);
        r.a q0Var = new r.a() {
            @Override
            public final void a(r rVar) {
                z0.this.s1(rVar);
            }
        };
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.f25393q0 = new r<>(q0Var, decelerateInterpolator, 180L);
        this.f25394r0 = new r<>(new r.a() {
            @Override
            public final void a(r rVar) {
                z0.this.t1(rVar);
            }
        }, decelerateInterpolator, 180L);
        this.f25395s0 = new r<>(new r.a() {
            @Override
            public final void a(r rVar) {
                z0.this.u1(rVar);
            }
        }, decelerateInterpolator, 180L);
        setLayoutParams(new ViewGroup.LayoutParams(-1, ap.W(d.j.L0)));
        d.j(this);
        t1.b().a(this);
    }

    public void A1(TdApi.User user) {
        TdApi.Message message = this.f25388l0;
        if (message != null && message.senderId.getConstructor() == -336109341 && ((TdApi.MessageSenderUser) this.f25388l0.senderId).userId == user.f19979id) {
            G1();
        }
    }

    private TdApi.FormattedText getContentText() {
        t2.d dVar = this.f25392p0;
        if (dVar != null) {
            return dVar.b(true);
        }
        return null;
    }

    private float getLinePadding() {
        float f10 = this.f25396t0;
        if (f10 != -1.0f) {
            return f10;
        }
        return 6.0f;
    }

    private int getTextHorizontalOffset() {
        return ((int) (this.f25395s0.r().k() + (this.f25395s0.r().l() * a0.i(8.0f)))) + a0.i(getLinePadding());
    }

    private String getTitle() {
        if (!ib.i.i(this.f25389m0)) {
            return this.f25389m0;
        }
        TdApi.Message message = this.f25388l0;
        if (message != null) {
            return this.f18085b.Bb(message, true, false);
        }
        return null;
    }

    public static int p1(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return a0.i(2.0f) + a0.i(18.0f);
        }
        return 0;
    }

    public void q1(t2.d dVar, t2.d dVar2) {
        if (this.f25392p0 == dVar) {
            this.f25392p0 = dVar2;
            F1();
            f1(true);
        }
    }

    public void r1(long j10, long j11, final t2.d dVar, final t2.d dVar2) {
        this.f18085b.db(new Runnable() {
            @Override
            public final void run() {
                z0.this.q1(dVar2, dVar);
            }
        });
    }

    public void s1(r rVar) {
        invalidate();
    }

    public void t1(r rVar) {
        invalidate();
    }

    public void u1(r rVar) {
        m1(true);
        invalidate();
    }

    public void v1(long j10) {
        TdApi.Message message = this.f25388l0;
        if (message != null && message.senderId.getConstructor() == -239660751 && ((TdApi.MessageSenderChat) this.f25388l0.senderId).chatId == j10) {
            G1();
        }
    }

    public void z1(long j10, long j11, TdApi.MessageContent messageContent) {
        TdApi.Message message = this.f25388l0;
        if (message != null && message.chatId == j10 && message.f19946id == j11) {
            message.content = messageContent;
            F1();
        }
    }

    public final boolean B1() {
        if (!ib.i.i(this.f25389m0)) {
            return true;
        }
        TdApi.Message message = this.f25388l0;
        return (message == null || e.P0(message, true) == 0) ? false : true;
    }

    @Override
    public void B3(long j10, boolean z10) {
        g0.i(this, j10, z10);
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        g0.x(this, j10, i10, z10);
    }

    public void C1(TdApi.Message message, TdApi.SearchMessagesFilter searchMessagesFilter, String str, boolean z10) {
        this.f25390n0 = z10;
        TdApi.Message message2 = this.f25388l0;
        if (message2 == message) {
            setForcedTitle(str);
            return;
        }
        if (message2 != null) {
            E1(message2);
        }
        this.f25388l0 = message;
        this.f25389m0 = str;
        if (message != null) {
            D1(message);
            l1();
            y0(null, message.chatId, null, new ob.d(message.chatId, message.f19946id), searchMessagesFilter);
        } else {
            L();
            this.f25392p0 = null;
            this.f25395s0.u(null, false);
            this.f25395s0.t(false);
        }
        invalidate();
    }

    public void D1(TdApi.Message message) {
        int constructor = message.senderId.getConstructor();
        if (constructor == -336109341) {
            this.f18085b.e2().L(((TdApi.MessageSenderUser) message.senderId).userId, this);
        } else if (constructor == -239660751) {
            this.f18085b.O9().d0(((TdApi.MessageSenderChat) message.senderId).chatId, this);
        }
        this.f18085b.O9().g0(message.chatId, this);
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    public void E1(TdApi.Message message) {
        int constructor = message.senderId.getConstructor();
        if (constructor == -336109341) {
            this.f18085b.e2().N1(((TdApi.MessageSenderUser) message.senderId).userId, this);
        } else if (constructor == -239660751) {
            this.f18085b.O9().q0(((TdApi.MessageSenderChat) message.senderId).chatId, this);
        }
        this.f18085b.O9().t0(message.chatId, this);
    }

    public final void F1() {
        int i10 = this.f25397u0;
        if (i10 > 0) {
            e1(i10, true);
        }
    }

    public final void G1() {
        int i10 = this.f25397u0;
        if (i10 > 0) {
            n1(i10, true);
            invalidate();
        }
    }

    @Override
    public void H(long j10, long[] jArr) {
        g1.m(this, j10, jArr);
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    @Override
    public void J3(long j10, long j11) {
        g1.i(this, j10, j11);
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f18085b.db(new Runnable() {
            @Override
            public final void run() {
                z0.this.A1(user);
            }
        });
    }

    @Override
    public void N0(long j10, int i10) {
        g0.l(this, j10, i10);
    }

    @Override
    public void N1(long j10, boolean z10) {
        g0.j(this, j10, z10);
    }

    @Override
    public void Q2() {
        C1(null, null, null, false);
        t1.b().d(this);
    }

    @Override
    public void R3(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        g0.o(this, j10, chatPhotoInfo);
    }

    @Override
    public void S1(long j10, long j11, boolean z10) {
        g1.h(this, j10, j11, z10);
    }

    @Override
    public void T0(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        g1.d(this, j10, j11, messageInteractionInfo);
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        g0.q(this, j10, j11, i10, z10);
    }

    @Override
    public void W(long j10, long j11) {
        g1.f(this, j10, j11);
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        g0.a(this, j10, chatActionBar);
    }

    @Override
    public void X1(TdApi.Message message, long j10) {
        g1.k(this, message, j10);
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    @Override
    public void b() {
        this.f25399w0 = false;
        Iterator<n.c<b>> it = this.f25395s0.iterator();
        while (it.hasNext()) {
            it.next().f11479a.f25401b.b();
        }
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    @Override
    public void e() {
        this.f25399w0 = true;
        Iterator<n.c<b>> it = this.f25395s0.iterator();
        while (it.hasNext()) {
            it.next().f11479a.f25401b.b();
        }
    }

    public final void e1(int i10, boolean z10) {
        g gVar;
        t2.f fVar;
        TdApi.FormattedText contentText = getContentText();
        t2.d dVar = this.f25392p0;
        int i11 = (dVar == null || (fVar = dVar.f13567a) == null) ? 0 : fVar.f13582b;
        c cVar = null;
        if (!e.c1(contentText)) {
            gVar = new g.b(this.f18085b, contentText, (hj.q) null, i10, y.A0(14.0f), t.d.C).z(this.f25387k0).n(i11 != 0 ? y0.f25375a : null).v().l().j().a(8).f();
        } else {
            gVar = null;
        }
        r<c> rVar = this.f25394r0;
        if (!(gVar == null && i11 == 0)) {
            cVar = new c(gVar, Z(i11, R.id.theme_color_icon));
        }
        rVar.u(cVar, z10);
    }

    @Override
    public void e2() {
        invalidate();
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    public final void f1(boolean z10) {
        n0 n0Var;
        TdApi.Chat W2;
        TdApi.ChatPhotoInfo chatPhotoInfo;
        TdApi.Message message = this.f25388l0;
        if (message != null) {
            n0Var = n0.o(this.f18085b, message, this.f25392p0, a0.i(40.0f), a0.i(3.0f));
            if (n0Var == null && this.f25391o0 && (W2 = this.f18085b.W2(this.f25388l0.chatId)) != null && (chatPhotoInfo = W2.photo) != null) {
                n0Var = n0.k(this.f18085b, chatPhotoInfo, a0.i(40.0f), a0.i(3.0f));
            }
        } else {
            n0Var = null;
        }
        if (n0Var == null) {
            this.f25395s0.u(null, z10);
        } else if (z10 || this.f25395s0.isEmpty()) {
            ld.b bVar = new ld.b(this);
            if (this.f25399w0) {
                bVar.b();
            } else {
                bVar.i();
            }
            n0Var.f(bVar, false);
            this.f25395s0.u(new b(n0Var, bVar), z10);
        } else {
            b bVar2 = this.f25395s0.v().f11479a;
            bVar2.f25401b.d();
            bVar2.f25400a = n0Var;
            n0Var.f(bVar2.f25401b, false);
        }
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(final long j10, String str) {
        this.f18085b.db(new Runnable() {
            @Override
            public final void run() {
                z0.this.v1(j10);
            }
        });
    }

    @Override
    public void g5(TdApi.Message message, long j10, int i10, String str) {
        g1.j(this, message, j10, i10, str);
    }

    @Override
    public void j0(final long j10, final long j11, final TdApi.MessageContent messageContent) {
        this.f18085b.db(new Runnable() {
            @Override
            public final void run() {
                z0.this.z1(j10, j11, messageContent);
            }
        });
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    public final void l1() {
        o6 o6Var = this.f18085b;
        TdApi.Message message = this.f25388l0;
        t2.d R0 = t2.R0(o6Var, message.chatId, message);
        this.f25392p0 = R0;
        if (R0.e() && (!this.f25390n0 || !this.f25392p0.f())) {
            this.f25392p0.g(new t2.d.a() {
                @Override
                public void a(long j10, long j11, t2.d dVar) {
                    u2.a(this, j10, j11, dVar);
                }

                @Override
                public final void b(long j10, long j11, t2.d dVar, t2.d dVar2) {
                    z0.this.r1(j10, j11, dVar, dVar2);
                }
            });
        }
        m1(false);
        f1(false);
        invalidate();
    }

    @Override
    public void l5(long j10, long j11, int i10, TdApi.ReplyMarkup replyMarkup) {
        g1.c(this, j10, j11, i10, replyMarkup);
    }

    public final void m1(boolean z10) {
        int o12 = o1();
        if (this.f25397u0 != o12 || !z10) {
            this.f25397u0 = o12;
            if (o12 > 0) {
                if (!z10 || this.f25393q0.isEmpty()) {
                    n1(o12, false);
                } else {
                    Iterator<n.c<g>> it = this.f25393q0.iterator();
                    while (it.hasNext()) {
                        it.next().f11479a.q(o12);
                    }
                }
                if (!z10 || this.f25394r0.isEmpty()) {
                    e1(o12, false);
                } else {
                    Iterator<n.c<c>> it2 = this.f25394r0.iterator();
                    while (it2.hasNext()) {
                        ((g) it2.next().f11479a.f25400a).q(o12);
                    }
                }
            } else {
                this.f25393q0.u(null, false);
                this.f25394r0.u(null, false);
            }
            invalidate();
        }
    }

    public final void n1(int i10, boolean z10) {
        String title = getTitle();
        this.f25393q0.u(!ib.i.i(title) ? new g.b(this.f18085b, title, (hj.q) null, i10, y.A0(14.0f), t.d.I).z(this.f25387k0).v().d().c(B1()).f() : null, z10);
    }

    public final int o1() {
        return Math.max(0, (((getMeasuredWidth() - (a0.i(8.0f) * 2)) - getTextHorizontalOffset()) - a0.i(getLinePadding())) - this.f25398v0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f25388l0 != null) {
            int i10 = a0.i(getLinePadding()) + a0.i(8.0f) + getTextHorizontalOffset();
            Iterator<n.c<b>> it = this.f25395s0.iterator();
            while (it.hasNext()) {
                n.c<b> next = it.next();
                b bVar = next.f11479a;
                ((n0) bVar.f25400a).a(this, canvas, bVar.f25401b, (i10 - ((n0) bVar.f25400a).getWidth()) - a0.i(8.0f), (ap.W(d.j.L0) - a0.i(40.0f)) / 2.0f, next.s());
            }
            int i11 = a0.i(7.0f) + a0.i(14.0f) + a0.i(5.0f);
            Iterator<n.c<g>> it2 = this.f25393q0.iterator();
            while (it2.hasNext()) {
                n.c<g> next2 = it2.next();
                next2.f11479a.z(canvas, i10, a0.i(7.0f), null, next2.s());
            }
            Iterator<n.c<c>> it3 = this.f25394r0.iterator();
            while (it3.hasNext()) {
                n.c<c> next3 = it3.next();
                c cVar = next3.f11479a;
                if (cVar.f25402b != null) {
                    ce.c.b(canvas, cVar.f25402b, i10, (i11 + ((cVar.f25400a != 0 ? ((g) cVar.f25400a).a0(false) : a0.i(14.0f)) / 2.0f)) - (next3.f11479a.f25402b.getMinimumHeight() / 2.0f), z.c(R.id.theme_color_icon, next3.s()));
                }
                c cVar2 = next3.f11479a;
                if (cVar2.f25400a != 0) {
                    ((g) cVar2.f25400a).z(canvas, i10, i11, null, next3.s());
                }
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m1(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<n.c<c>> it = this.f25394r0.iterator();
        while (it.hasNext()) {
            c cVar = it.next().f11479a;
            if (cVar.f25400a != 0 && ((g) cVar.f25400a).U0(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
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
    public void s5(long j10, long j11) {
        g1.g(this, j10, j11);
    }

    public void setContentInset(int i10) {
        if (this.f25398v0 != i10) {
            this.f25398v0 = i10;
            m1(true);
        }
    }

    public void setForcedTitle(String str) {
        if (!ib.i.c(this.f25389m0, str)) {
            this.f25389m0 = str;
            G1();
        }
    }

    public void setLinePadding(float f10) {
        this.f25396t0 = f10;
        m1(true);
        f1(false);
        invalidate();
    }

    public void setUseAvatarFallback(boolean z10) {
        this.f25391o0 = z10;
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
    public void x5(long j10, long j11) {
        g0.s(this, j10, j11);
    }

    @Override
    public void y1(long j10, long j11) {
        g0.r(this, j10, j11);
    }

    @Override
    public void y2(TdApi.Message message) {
        g1.n(this, message);
    }
}
