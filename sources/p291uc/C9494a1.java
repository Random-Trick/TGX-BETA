package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import be.C1411z;
import gd.C4779t2;
import gd.C4804u2;
import ie.C5428t;
import ie.RunnableC5390g;
import java.util.Iterator;
import me.AbstractC6828a;
import me.View$OnClickListenerC6902i;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.C2139ap;
import p039d.C3563j;
import p051db.C3955n;
import p051db.C3965r;
import p080fb.AbstractC4345j;
import p080fb.C4343h;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6238b;
import p193nb.C7319d;
import p193nb.C7321e;
import p335xd.C10189d;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10748j1;
import p350yd.C10721i0;
import p350yd.C10722i1;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p350yd.HandlerC10770jj;

public class C9494a1 extends View$OnClickListenerC6902i implements AbstractC6828a, AbstractC5911c, AbstractC10747j0, AbstractC10748j1, C11059v7.AbstractC11068i, C11052v1.AbstractC11053a {
    public TdApi.Message f30736l0;
    public String f30737m0;
    public boolean f30738n0;
    public boolean f30739o0;
    public C4779t2.C4783d f30740p0;
    public final C3965r<RunnableC5390g> f30741q0;
    public final C3965r<C9497c> f30742r0;
    public final C3965r<C9496b> f30743s0;
    public int f30745u0;
    public int f30746v0;
    public boolean f30747w0;
    public final AbstractC4345j f30735k0 = new C4343h(this);
    public float f30744t0 = -1.0f;

    public static class C9495a<T extends C3955n.AbstractC3959d> implements C3955n.AbstractC3959d {
        public T f30748a;

        public C9495a(T t) {
            this.f30748a = t;
        }

        @Override
        public final int mo7991d(boolean z) {
            return this.f30748a.mo7991d(z);
        }

        @Override
        public final int mo7990g(boolean z) {
            return this.f30748a.mo7990g(z);
        }

        @Override
        public final int getHeight() {
            return this.f30748a.getHeight();
        }

        @Override
        public final int getWidth() {
            return this.f30748a.getWidth();
        }
    }

    public static class C9496b extends C9495a<AbstractC9622o0> implements AbstractC5911c {
        public final C6238b f30749b;

        public C9496b(AbstractC9622o0 o0Var, C6238b bVar) {
            super(o0Var);
            this.f30749b = bVar;
        }

        @Override
        public void mo4501a3() {
            this.f30749b.mo4501a3();
        }
    }

    public static class C9497c extends C9495a<RunnableC5390g> {
        public Drawable f30750b;

        public C9497c(RunnableC5390g gVar, Drawable drawable) {
            super(gVar);
            this.f30750b = drawable;
        }
    }

    public C9494a1(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        C3965r.AbstractC3966a r0Var = new C3965r.AbstractC3966a() {
            @Override
            public final void mo7848a(C3965r rVar) {
                C9494a1.this.m8469s1(rVar);
            }
        };
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f30741q0 = new C3965r<>(r0Var, decelerateInterpolator, 180L);
        this.f30742r0 = new C3965r<>(new C3965r.AbstractC3966a() {
            @Override
            public final void mo7848a(C3965r rVar) {
                C9494a1.this.m8468u1(rVar);
            }
        }, decelerateInterpolator, 180L);
        this.f30743s0 = new C3965r<>(new C3965r.AbstractC3966a() {
            @Override
            public final void mo7848a(C3965r rVar) {
                C9494a1.this.m8467v1(rVar);
            }
        }, decelerateInterpolator, 180L);
        setLayoutParams(new ViewGroup.LayoutParams(-1, C2139ap.m35482W(C3563j.f11957L0)));
        C10189d.m5794j(this);
        C11052v1.m1768b().m1769a(this);
    }

    public void m8494B1(long j, long j2, TdApi.MessageContent messageContent) {
        TdApi.Message message = this.f30736l0;
        if (message != null && message.chatId == j && message.f25409id == j2) {
            message.content = messageContent;
            m8486H1();
        }
    }

    public void m8492C1(TdApi.User user) {
        TdApi.Message message = this.f30736l0;
        if (message != null && message.senderId.getConstructor() == -336109341 && ((TdApi.MessageSenderUser) this.f30736l0.senderId).userId == user.f25442id) {
            m8485I1();
        }
    }

    private TdApi.FormattedText getContentText() {
        C4779t2.C4783d dVar = this.f30740p0;
        if (dVar != null) {
            return dVar.m25377b(true);
        }
        return null;
    }

    private float getLinePadding() {
        float f = this.f30744t0;
        if (f != -1.0f) {
            return f;
        }
        return 6.0f;
    }

    private int getTextHorizontalOffset() {
        return ((int) (this.f30743s0.m29467r().m29477k() + (this.f30743s0.m29467r().m29476l() * C1357a0.m37544i(8.0f)))) + C1357a0.m37544i(getLinePadding());
    }

    private String getTitle() {
        if (!C5070i.m24062i(this.f30737m0)) {
            return this.f30737m0;
        }
        TdApi.Message message = this.f30736l0;
        if (message != null) {
            return this.f21823b.m2167xb(message, true, false);
        }
        return null;
    }

    public static int m8472o1(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return C1357a0.m37544i(2.0f) + C1357a0.m37544i(18.0f);
        }
        return 0;
    }

    public void m8471q1(C4779t2.C4783d dVar, C4779t2.C4783d dVar2) {
        if (this.f30740p0 == dVar) {
            this.f30740p0 = dVar2;
            m8486H1();
            m8477d1(true);
        }
    }

    public void m8470r1(long j, long j2, final C4779t2.C4783d dVar, final C4779t2.C4783d dVar2) {
        this.f21823b.m2549Za(new Runnable() {
            @Override
            public final void run() {
                C9494a1.this.m8471q1(dVar2, dVar);
            }
        });
    }

    public void m8469s1(C3965r rVar) {
        invalidate();
    }

    public void m8468u1(C3965r rVar) {
        invalidate();
    }

    public void m8467v1(C3965r rVar) {
        m8475g1(true);
        invalidate();
    }

    public void m8466z1(long j) {
        TdApi.Message message = this.f30736l0;
        if (message != null && message.senderId.getConstructor() == -239660751 && ((TdApi.MessageSenderChat) this.f30736l0.senderId).chatId == j) {
            m8485I1();
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

    public final boolean m8491D1() {
        if (!C5070i.m24062i(this.f30737m0)) {
            return true;
        }
        TdApi.Message message = this.f30736l0;
        return (message == null || C7321e.m16992N0(message, true) == 0) ? false : true;
    }

    public void m8490E1(TdApi.Message message, TdApi.SearchMessagesFilter searchMessagesFilter, String str, boolean z) {
        this.f30738n0 = z;
        TdApi.Message message2 = this.f30736l0;
        if (message2 == message) {
            setForcedTitle(str);
            return;
        }
        if (message2 != null) {
            m8487G1(message2);
        }
        this.f30736l0 = message;
        this.f30737m0 = str;
        if (message != null) {
            m8488F1(message);
            m8476e1();
            m18493w0(null, message.chatId, null, new C7319d(message.chatId, message.f25409id), searchMessagesFilter);
        } else {
            m18511K();
            this.f30740p0 = null;
            this.f30743s0.m29464u(null, false);
            this.f30743s0.m29465t(false);
        }
        invalidate();
    }

    @Override
    public void mo4051E2(TdApi.Message message) {
        C10722i1.m4158n(this, message);
    }

    public void m8488F1(TdApi.Message message) {
        int constructor = message.senderId.getConstructor();
        if (constructor == -336109341) {
            this.f21823b.m2480e2().m1720L(((TdApi.MessageSenderUser) message.senderId).userId, this);
        } else if (constructor == -239660751) {
            this.f21823b.m2781K9().m1870d0(((TdApi.MessageSenderChat) message.senderId).chatId, this);
        }
        this.f21823b.m2781K9().m1858g0(message.chatId, this);
    }

    public void m8487G1(TdApi.Message message) {
        int constructor = message.senderId.getConstructor();
        if (constructor == -336109341) {
            this.f21823b.m2480e2().m1702P1(((TdApi.MessageSenderUser) message.senderId).userId, this);
        } else if (constructor == -239660751) {
            this.f21823b.m2781K9().m1818q0(((TdApi.MessageSenderChat) message.senderId).chatId, this);
        }
        this.f21823b.m2781K9().m1806t0(message.chatId, this);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public void mo4050H(long j, long[] jArr) {
        C10722i1.m4159m(this, j, jArr);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    public final void m8486H1() {
        int i = this.f30745u0;
        if (i > 0) {
            m8478c1(i, true);
        }
    }

    public final void m8485I1() {
        int i = this.f30745u0;
        if (i > 0) {
            m8474i1(i, true);
            invalidate();
        }
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo4071L0(long j, int i) {
        C10721i0.m4185l(this, j, i);
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f21823b.m2549Za(new Runnable() {
            @Override
            public final void run() {
                C9494a1.this.m8492C1(user);
            }
        });
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    @Override
    public void mo4048R3(long j, long j2) {
        C10722i1.m4163i(this, j, j2);
    }

    @Override
    public void mo4047T0(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        C10722i1.m4168d(this, j, j2, messageInteractionInfo);
    }

    @Override
    public void mo4046V(long j, long j2) {
        C10722i1.m4166f(this, j, j2);
    }

    @Override
    public void mo4045V1(long j, long j2, boolean z) {
        C10722i1.m4164h(this, j, j2, z);
    }

    @Override
    public void mo4069V5(long j, long j2, int i, boolean z) {
        C10721i0.m4180q(this, j, j2, i, z);
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public void mo4044X1(TdApi.Message message, long j) {
        C10722i1.m4161k(this, message, j);
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    @Override
    public void mo4501a3() {
        m8490E1(null, null, null, false);
        C11052v1.m1768b().m1766d(this);
    }

    @Override
    public void mo8229b() {
        this.f30747w0 = false;
        Iterator<C3955n.C3958c<C9496b>> it = this.f30743s0.iterator();
        while (it.hasNext()) {
            it.next().f13320a.f30749b.m21002b();
        }
    }

    public final void m8478c1(int i, boolean z) {
        RunnableC5390g gVar;
        C4779t2.C4787f fVar;
        TdApi.FormattedText contentText = getContentText();
        C4779t2.C4783d dVar = this.f30740p0;
        int i2 = (dVar == null || (fVar = dVar.f16269a) == null) ? 0 : fVar.f16284b;
        C9497c cVar = null;
        if (!C7321e.m16965a1(contentText)) {
            gVar = new RunnableC5390g.C5392b(this.f21823b, contentText, (HandlerC10770jj.C10788q) null, i, C1410y.m37086A0(14.0f), C5428t.AbstractC5441d.f17872C).m22865z(this.f30735k0).m22877n(i2 != 0 ? C9671v0.f31397a : null).m22869v().m22879l().m22881j().m22890a(8).m22885f();
        } else {
            gVar = null;
        }
        C3965r<C9497c> rVar = this.f30742r0;
        if (!(gVar == null && i2 == 0)) {
            cVar = new C9497c(gVar, mo14041X(i2, R.id.theme_color_icon));
        }
        rVar.m29464u(cVar, z);
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        C10721i0.m4182o(this, j, chatPhotoInfo);
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    public final void m8477d1(boolean z) {
        AbstractC9622o0 o0Var;
        TdApi.Chat U2;
        TdApi.ChatPhotoInfo chatPhotoInfo;
        TdApi.Message message = this.f30736l0;
        if (message != null) {
            o0Var = AbstractC9622o0.m7982o(this.f21823b, message, this.f30740p0, C1357a0.m37544i(40.0f), C1357a0.m37544i(3.0f));
            if (o0Var == null && this.f30739o0 && (U2 = this.f21823b.m2632U2(this.f30736l0.chatId)) != null && (chatPhotoInfo = U2.photo) != null) {
                o0Var = AbstractC9622o0.m7986k(this.f21823b, chatPhotoInfo, C1357a0.m37544i(40.0f), C1357a0.m37544i(3.0f));
            }
        } else {
            o0Var = null;
        }
        if (o0Var == null) {
            this.f30743s0.m29464u(null, z);
        } else if (z || this.f30743s0.isEmpty()) {
            C6238b bVar = new C6238b(this);
            if (this.f30747w0) {
                bVar.m21002b();
            } else {
                bVar.m20995i();
            }
            o0Var.mo7955f(bVar, false);
            this.f30743s0.m29464u(new C9496b(o0Var, bVar), z);
        } else {
            C9496b bVar2 = this.f30743s0.m29463v().f13320a;
            bVar2.f30749b.m21000d();
            bVar2.f30748a = o0Var;
            o0Var.mo7955f(bVar2.f30749b, false);
        }
    }

    public final void m8476e1() {
        C10930q6 q6Var = this.f21823b;
        TdApi.Message message = this.f30736l0;
        C4779t2.C4783d R0 = C4779t2.m25613R0(q6Var, message.chatId, message);
        this.f30740p0 = R0;
        if (R0.m25374e() && (!this.f30738n0 || !this.f30740p0.m25373f())) {
            this.f30740p0.m25372g(new C4779t2.C4783d.AbstractC4784a() {
                @Override
                public void mo7829a(long j, long j2, C4779t2.C4783d dVar) {
                    C4804u2.m25224a(this, j, j2, dVar);
                }

                @Override
                public final void mo7828b(long j, long j2, C4779t2.C4783d dVar, C4779t2.C4783d dVar2) {
                    C9494a1.this.m8470r1(j, j2, dVar, dVar2);
                }
            });
        }
        m8475g1(false);
        m8477d1(false);
        invalidate();
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    @Override
    public void mo8225f() {
        this.f30747w0 = true;
        Iterator<C3955n.C3958c<C9496b>> it = this.f30743s0.iterator();
        while (it.hasNext()) {
            it.next().f13320a.f30749b.m21002b();
        }
    }

    public final void m8475g1(boolean z) {
        int n1 = m8473n1();
        if (this.f30745u0 != n1 || !z) {
            this.f30745u0 = n1;
            if (n1 > 0) {
                if (!z || this.f30741q0.isEmpty()) {
                    m8474i1(n1, false);
                } else {
                    Iterator<C3955n.C3958c<RunnableC5390g>> it = this.f30741q0.iterator();
                    while (it.hasNext()) {
                        it.next().f13320a.m22911q(n1);
                    }
                }
                if (!z || this.f30742r0.isEmpty()) {
                    m8478c1(n1, false);
                } else {
                    Iterator<C3955n.C3958c<C9497c>> it2 = this.f30742r0.iterator();
                    while (it2.hasNext()) {
                        ((RunnableC5390g) it2.next().f13320a.f30748a).m22911q(n1);
                    }
                }
            } else {
                this.f30741q0.m29464u(null, false);
                this.f30742r0.m29464u(null, false);
            }
            invalidate();
        }
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    public final void m8474i1(int i, boolean z) {
        String title = getTitle();
        this.f30741q0.m29464u(!C5070i.m24062i(title) ? new RunnableC5390g.C5392b(this.f21823b, title, (HandlerC10770jj.C10788q) null, i, C1410y.m37086A0(14.0f), C5428t.AbstractC5441d.f17878I).m22865z(this.f30735k0).m22869v().m22887d().m22888c(m8491D1()).m22885f() : null, z);
    }

    @Override
    public void mo4061i5(final long j, String str) {
        this.f21823b.m2549Za(new Runnable() {
            @Override
            public final void run() {
                C9494a1.this.m8466z1(j);
            }
        });
    }

    @Override
    public void mo4042k5(TdApi.Message message, long j, int i, String str) {
        C10722i1.m4162j(this, message, j, i, str);
    }

    @Override
    public void mo4041l0(final long j, final long j2, final TdApi.MessageContent messageContent) {
        this.f21823b.m2549Za(new Runnable() {
            @Override
            public final void run() {
                C9494a1.this.m8494B1(j, j2, messageContent);
            }
        });
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    public final int m8473n1() {
        return Math.max(0, (((getMeasuredWidth() - (C1357a0.m37544i(8.0f) * 2)) - getTextHorizontalOffset()) - C1357a0.m37544i(getLinePadding())) - this.f30746v0);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f30736l0 != null) {
            int i = C1357a0.m37544i(getLinePadding()) + C1357a0.m37544i(8.0f) + getTextHorizontalOffset();
            Iterator<C3955n.C3958c<C9496b>> it = this.f30743s0.iterator();
            while (it.hasNext()) {
                C3955n.C3958c<C9496b> next = it.next();
                C9496b bVar = next.f13320a;
                ((AbstractC9622o0) bVar.f30748a).m7993a(this, canvas, bVar.f30749b, (i - ((AbstractC9622o0) bVar.f30748a).getWidth()) - C1357a0.m37544i(8.0f), (C2139ap.m35482W(C3563j.f11957L0) - C1357a0.m37544i(40.0f)) / 2.0f, next.m29493s());
            }
            int i2 = C1357a0.m37544i(7.0f) + C1357a0.m37544i(14.0f) + C1357a0.m37544i(5.0f);
            Iterator<C3955n.C3958c<RunnableC5390g>> it2 = this.f30741q0.iterator();
            while (it2.hasNext()) {
                C3955n.C3958c<RunnableC5390g> next2 = it2.next();
                next2.f13320a.m22892z(canvas, i, C1357a0.m37544i(7.0f), null, next2.m29493s());
            }
            Iterator<C3955n.C3958c<C9497c>> it3 = this.f30742r0.iterator();
            while (it3.hasNext()) {
                C3955n.C3958c<C9497c> next3 = it3.next();
                C9497c cVar = next3.f13320a;
                if (cVar.f30750b != null) {
                    C1362c.m37490b(canvas, cVar.f30750b, i, (i2 + ((cVar.f30748a != 0 ? ((RunnableC5390g) cVar.f30748a).m22956a0(false) : C1357a0.m37544i(14.0f)) / 2.0f)) - (next3.f13320a.f30750b.getMinimumHeight() / 2.0f), C1411z.m37000c(R.id.theme_color_icon, next3.m29493s()));
                }
                C9497c cVar2 = next3.f13320a;
                if (cVar2.f30748a != 0) {
                    ((RunnableC5390g) cVar2.f30748a).m22892z(canvas, i, i2, null, next3.m29493s());
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m8475g1(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<C3955n.C3958c<C9497c>> it = this.f30742r0.iterator();
        while (it.hasNext()) {
            C9497c cVar = it.next().f13320a;
            if (cVar.f30748a != 0 && ((RunnableC5390g) cVar.f30748a).m22968U0(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public void mo4039r5(long j, long j2, int i, TdApi.ReplyMarkup replyMarkup) {
        C10722i1.m4169c(this, j, j2, i, replyMarkup);
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    public void setContentInset(int i) {
        if (this.f30746v0 != i) {
            this.f30746v0 = i;
            m8475g1(true);
        }
    }

    public void setForcedTitle(String str) {
        if (!C5070i.m24068c(this.f30737m0, str)) {
            this.f30737m0 = str;
            m8485I1();
        }
    }

    public void setLinePadding(float f) {
        this.f30744t0 = f;
        m8475g1(true);
        m8477d1(false);
        invalidate();
    }

    public void setUseAvatarFallback(boolean z) {
        this.f30739o0 = z;
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
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }

    @Override
    public void mo4038z5(long j, long j2) {
        C10722i1.m4165g(this, j, j2);
    }
}
