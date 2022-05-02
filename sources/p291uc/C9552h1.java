package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import gd.AbstractC4761s4;
import gd.C4583a5;
import gd.C4656h6;
import gd.C4779t2;
import gd.C4791t4;
import ge.C4868i;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.MessagesRecyclerView;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.C2912q9;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.View$OnClickListenerC3141u7;
import p051db.C3950k;
import p051db.C3953l;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5069h;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p291uc.C9678w2;
import td.AbstractC9323v4;
import td.C9270q1;

public class C9552h1 extends SparseDrawableView implements AbstractC5911c, C9678w2.AbstractC9685g {
    public C6257p f30957N;
    public C6240c f30958O;
    public C6240c f30959P;
    public C6238b f30961R;
    public C9565i1 f30962S;
    public C9678w2 f30963T;
    public float f30965V;
    public float f30966W;
    public AbstractRunnableC5910b f30967a0;
    public AbstractC4761s4 f30968b;
    public int f30969c;
    public boolean f30964U = true;
    public final C6257p f30956M = new C6257p(this, C1357a0.m37541i(20.5f));
    public RunnableC6507m f30960Q = new RunnableC6507m(this);

    public class C9553a extends AbstractRunnableC5910b {
        public C9553a() {
        }

        @Override
        public void mo1364b() {
            C9552h1.this.f30969c &= -9;
            C9552h1.this.f30967a0 = null;
            C9552h1.this.m8360B0();
        }
    }

    public C9552h1(Context context) {
        super(context);
        m8340c1();
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    public static java.lang.Object m8351M(p038ce.View$OnClickListenerC2971rh r21, gd.AbstractC4761s4 r22, org.drinkless.p210td.libcore.telegram.TdApi.ChatMember r23, p124ib.C5320c r24, p124ib.C5320c r25, p111he.C5146u0 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9552h1.m8351M(ce.rh, gd.s4, org.drinkless.td.libcore.telegram.TdApi$ChatMember, ib.c, ib.c, he.u0, boolean):java.lang.Object");
    }

    public static void m8348Q0(View$OnClickListenerC2971rh rhVar, AbstractC4761s4 s4Var, float f, float f2) {
        long t1 = s4Var.m25805t1(f, f2);
        if (t1 == 0) {
            rhVar.m32366ip(s4Var, f, f2);
        } else {
            rhVar.m32353jp(t1, s4Var, f, f2);
        }
    }

    public void m8335f0(boolean z, int i, float f, float f2, C3950k kVar) {
        float f3;
        float f4;
        float f5 = f < 0.5f ? f / 0.5f : 1.0f - ((f - 0.5f) / 0.5f);
        if (z) {
            f3 = (f5 * 0.5f) + 1.0f;
            f4 = 720.0f;
        } else {
            f3 = 1.0f - (f5 * 0.6f);
            f4 = -720.0f;
        }
        setScaleX(f3);
        setScaleY(f3);
        setRotation(f * f4);
    }

    public void m8334g0(float f, float f2, int i, float f3, float f4, C3950k kVar) {
        float interpolation = C2057b.f7280b.getInterpolation(f3);
        float f5 = (f * (interpolation < 0.35f ? interpolation / 0.35f : 1.0f - ((interpolation - 0.35f) / 0.65f))) + 1.0f;
        setScaleX(f5);
        setScaleY(f5);
        setRotation(((float) Math.sin(Math.toRadians((interpolation * 540.0f) % 360.0f))) * f2);
    }

    public boolean m8331j0(View$OnClickListenerC2971rh rhVar, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember, AbstractC4761s4 s4Var, View view, int i) {
        TdApi.FormattedText formattedText;
        switch (view.getId()) {
            case R.id.btn_blockSender:
                rhVar.mo4348c().m2485dd().m3902A3(rhVar, rhVar.mo9464C9(), messageSender, chatMember.status);
                return true;
            case R.id.btn_editRights:
                m8332i1(rhVar, false, messageSender, chatMemberStatus, chatMember);
                return true;
            case R.id.btn_messageCopy:
                if (C4779t2.m25654L(s4Var.m25993Z3())) {
                    formattedText = C7321e.m16899w1(s4Var.m25993Z3().content);
                } else {
                    formattedText = s4Var instanceof C4656h6 ? ((C4656h6) s4Var).m26617ma() : null;
                }
                if (formattedText == null) {
                    return true;
                }
                C1379j0.m37325i(C4779t2.m25427s5(formattedText), R.string.CopiedText);
                return true;
            case R.id.btn_messageViewList:
                C2912q9 q9Var = new C2912q9(rhVar.mo4347s(), rhVar.mo4348c());
                q9Var.m9476Ad(new C2912q9.C2914b(null, rhVar.mo9464C9(), null, messageSender, rhVar.mo4348c().m2784K6(C7321e.m16986Q0(messageSender))));
                rhVar.m9291ac(q9Var);
                return true;
            case R.id.btn_restrictMember:
                m8332i1(rhVar, true, messageSender, chatMemberStatus, chatMember);
                return true;
            default:
                return true;
        }
    }

    public void m8329q0(final View$OnClickListenerC2971rh rhVar, C5320c cVar, C5146u0 u0Var, C5320c cVar2, C5320c cVar3, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus, final AbstractC4761s4 s4Var, final TdApi.ChatMember chatMember) {
        rhVar.m9261ee(null, cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), cVar3.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean j0;
                j0 = C9552h1.this.m8331j0(rhVar, messageSender, chatMemberStatus, chatMember, s4Var, view, i);
                return j0;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
    }

    private void setLongPressed(boolean z) {
        if (z) {
            this.f30969c |= 16;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            performHapticFeedback(0);
            return;
        }
        this.f30969c &= -17;
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
    }

    public static void m8324v0(View$OnClickListenerC2971rh rhVar, AbstractC4761s4 s4Var, C5320c cVar, C5146u0 u0Var, C5320c cVar2, C5320c cVar3, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, final AbstractC5918j jVar, TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            boolean K6 = rhVar.mo4348c().m2784K6(rhVar.mo9464C9());
            if (C4779t2.m25654L(s4Var.m25993Z3()) || ((s4Var instanceof C4656h6) && ((C4656h6) s4Var).m26617ma().text.trim().length() > 0)) {
                cVar.m23284a(R.id.btn_messageCopy);
                u0Var.m23816a(R.string.Copy);
                cVar2.m23284a(R.drawable.baseline_content_copy_24);
                cVar3.m23284a(1);
            }
            if (!K6) {
                cVar.m23284a(R.id.btn_messageViewList);
                if (rhVar.mo4348c().m2379k7(C7321e.m16982S0(messageSender))) {
                    u0Var.m23816a(R.string.ViewMessagesFromYou);
                } else {
                    u0Var.m23815b(C4403w.m27865j1(R.string.ViewMessagesFromUser, rhVar.mo4348c().m2135zb(messageSender, true)));
                }
                cVar2.m23284a(R.drawable.baseline_person_24);
                cVar3.m23284a(1);
            }
            if (chatMemberStatus != null && (!C4779t2.m25623P2(chatMember.status) || !C4779t2.m25623P2(chatMemberStatus))) {
                int P = C4779t2.m25626P(chatMemberStatus, chatMember.status);
                if (!(P == 0 || P == 1)) {
                    cVar.m23284a(R.id.btn_editRights);
                    cVar2.m23284a(R.drawable.baseline_stars_24);
                    cVar3.m23284a(1);
                    if (P == 2) {
                        u0Var.m23816a(R.string.EditAdminRights);
                    } else if (P == 3) {
                        u0Var.m23816a(R.string.ViewAdminRights);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                int R = C4779t2.m25613R(chatMemberStatus, chatMember.status);
                if (!(R == 0 || (messageSender.getConstructor() == -239660751 && C7321e.m16986Q0(messageSender) == rhVar.mo9464C9()))) {
                    if (!K6 || (K6 && R == 2)) {
                        cVar.m23284a(R.id.btn_restrictMember);
                        cVar3.m23284a(R == 1 ? 2 : 1);
                        cVar2.m23284a(R.drawable.baseline_block_24);
                        if (R == 1) {
                            u0Var.m23816a(messageSender.getConstructor() == -239660751 ? rhVar.mo4348c().m2784K6(C7321e.m16986Q0(messageSender)) ? R.string.BanChannel : R.string.BanChat : R.string.RestrictUser);
                        } else if (R == 2) {
                            u0Var.m23816a(messageSender.getConstructor() == -239660751 ? rhVar.mo4348c().m2784K6(C7321e.m16986Q0(messageSender)) ? R.string.EditChannelRestrictions : R.string.EditGroupRestrictions : R.string.EditUserRestrictions);
                        } else if (R == 3) {
                            u0Var.m23816a(R.string.ViewRestrictions);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (messageSender.getConstructor() != -239660751) {
                        cVar.m23284a(R.id.btn_blockSender);
                        cVar2.m23284a(R.drawable.baseline_remove_circle_24);
                        u0Var.m23816a(K6 ? R.string.ChannelRemoveUser : R.string.RemoveFromGroup);
                        cVar3.m23284a(2);
                    }
                }
            }
            rhVar.m9135wd(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5918j.this.mo1330a(chatMember);
                }
            });
        }
    }

    public final void m8360B0() {
        int i = this.f30969c;
        if ((i & 2) != 0) {
            if (m8354J0()) {
                this.f30969c &= -3;
                setLongPressed(true);
            }
        } else if ((i & 4) != 0) {
            this.f30969c = i & (-5);
            if (this.f30968b.mo25295m8(this, this.f30965V, this.f30966W) || m8354J0()) {
                setLongPressed(true);
            }
        }
    }

    public final boolean m8359C0(float f, float f2) {
        C9270q1 bc;
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null && !(s4Var instanceof C4791t4)) {
            View$OnClickListenerC2971rh a7 = s4Var.m25981a7();
            if ((a7.m9339Ta() || a7.m9300Z9().m9339Ta()) && (bc = a7.m9300Z9().m9284bc()) != null && !bc.m9742S() && !bc.m9757I().m10040o3()) {
                if (a7.m9374Oa()) {
                    if (!this.f30968b.m25847p0()) {
                        return false;
                    }
                    m8348Q0(a7, this.f30968b, this.f30965V, this.f30966W);
                    return true;
                } else if (a7.m32553Uk()) {
                    a7.m32731Go(this.f30968b);
                    return true;
                } else if (this.f30968b.mo26059S7(this, a7)) {
                    return true;
                } else {
                    return m8357F0(f, f2, null);
                }
            }
        }
        return false;
    }

    public final boolean m8357F0(float f, float f2, TdApi.ChatMember chatMember) {
        View$OnClickListenerC2971rh a7 = this.f30968b.m25981a7();
        boolean z = !this.f30968b.m25946e6();
        if (this.f30968b.m26002Y5()) {
            m8333g1(a7, this.f30968b);
            return true;
        }
        AbstractC4761s4 s4Var = this.f30968b;
        if (!(s4Var instanceof C4583a5)) {
            C5320c cVar = new C5320c(6);
            C5320c cVar2 = new C5320c(6);
            C5146u0 u0Var = new C5146u0(6);
            Object M = m8351M(a7, this.f30968b, chatMember, cVar, cVar2, u0Var, false);
            if (cVar.m23279f()) {
                return false;
            }
            a7.m32481Zq(this.f30968b, cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), M, chatMember, false);
            return true;
        } else if (z) {
            return m8336e1(a7, (C4583a5) s4Var, chatMember);
        } else {
            a7.m32481Zq(s4Var, new int[]{R.id.btn_messageDelete}, new String[]{C4403w.m27869i1(R.string.Delete)}, new int[]{R.drawable.baseline_delete_24}, null, chatMember, true);
            return true;
        }
    }

    public final boolean m8354J0() {
        AbstractC9323v4<?> q9;
        AbstractC4761s4 s4Var = this.f30968b;
        if (!(s4Var instanceof C4791t4) && !s4Var.m25946e6() && (q9 = AbstractC9323v4.m9183q9(this)) != null && (q9 instanceof View$OnClickListenerC2971rh)) {
            View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) q9;
            AbstractC4761s4 s4Var2 = this.f30968b;
            if (s4Var2 instanceof C4583a5) {
                return m8359C0(0.0f, 0.0f);
            }
            if (s4Var2.m25847p0()) {
                m8348Q0(rhVar, this.f30968b, this.f30965V, this.f30966W);
                return true;
            }
        }
        return false;
    }

    public final void m8352L(C9552h1 h1Var) {
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null) {
            s4Var.m26152J6(h1Var, this.f30956M);
            if ((this.f30969c & 32) != 0) {
                this.f30968b.m26110N8(this.f30959P);
            }
        }
    }

    public final void m8350M0() {
        int i = this.f30969c;
        if ((i & 8) == 0) {
            this.f30969c = i | 8;
            this.f30967a0 = new C9553a();
            cancelLongPress();
            postDelayed(this.f30967a0, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void m8349O0() {
        this.f30969c &= -9;
        AbstractRunnableC5910b bVar = this.f30967a0;
        if (bVar != null) {
            bVar.m21857c();
            removeCallbacks(this.f30967a0);
            this.f30967a0 = null;
        }
    }

    public final MessagesRecyclerView m8347R() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof MessagesRecyclerView) {
                return (MessagesRecyclerView) parent;
            }
        }
        return null;
    }

    public final View m8346S() {
        View view = this;
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof MessagesRecyclerView) {
                return view;
            }
            view = (View) parent;
        }
        return this;
    }

    public void m8345T(long j, long j2, int i) {
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null && j == s4Var.m26145K2()) {
            if ((this.f30969c & Log.TAG_YOUTUBE) != 0) {
                if (this.f30968b.m26050T5(j2)) {
                    this.f30968b.mo25334L8(this.f30961R, true, i);
                }
            } else if (j2 == this.f30968b.m26115N3()) {
                if (this.f30960Q != null && this.f30968b.mo25869m7()) {
                    this.f30968b.mo26160I8(this.f30960Q);
                }
                if (this.f30968b.mo25829q7()) {
                    C6257p pVar = this.f30957N;
                    if (pVar != null) {
                        this.f30968b.mo26150J8(pVar);
                    }
                    C6240c cVar = this.f30958O;
                    if (cVar != null && cVar.isEmpty()) {
                        this.f30968b.mo26121M8(this.f30958O);
                    }
                }
                if ((this.f30969c & 64) != 0 && (getParent() instanceof C9565i1)) {
                    ((C9565i1) getParent()).m8228c(this.f30968b);
                }
            }
        }
    }

    public void m8344U0() {
        this.f30961R = new C6238b(this);
        this.f30969c |= Log.TAG_YOUTUBE;
    }

    public void m8343W0() {
        C6257p pVar = new C6257p(this, 1);
        this.f30957N = pVar;
        pVar.mo20259D0(0);
        C6240c cVar = new C6240c(this, 1);
        this.f30958O = cVar;
        cVar.mo20259D0(0);
        this.f30969c |= 1;
    }

    public void m8342Z() {
        C6257p pVar = this.f30956M;
        if (pVar != null) {
            pVar.mo20249Z();
        }
        C6257p pVar2 = this.f30957N;
        if (pVar2 != null) {
            pVar2.mo20249Z();
        }
        C6240c cVar = this.f30958O;
        if (cVar != null) {
            cVar.mo20249Z();
        }
        C6240c cVar2 = this.f30959P;
        if (cVar2 != null) {
            cVar2.mo20249Z();
        }
        RunnableC6507m mVar = this.f30960Q;
        if (mVar != null) {
            mVar.mo20249Z();
        }
        C6238b bVar = this.f30961R;
        if (bVar != null) {
            bVar.mo4501a3();
        }
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null) {
            s4Var.m26151J7();
        }
    }

    @Override
    public void mo4501a3() {
        m8342Z();
    }

    public void m8341b0(long j, long j2) {
        C6240c cVar;
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null && j == s4Var.m26145K2() && j2 == this.f30968b.m26115N3() && (cVar = this.f30958O) != null) {
            this.f30968b.mo26121M8(cVar);
        }
    }

    public void m8340c1() {
        this.f30959P = new C6240c(this, 0);
        this.f30969c |= 32;
    }

    public void m8339d0() {
        AbstractC4761s4 s4Var;
        if ((this.f30969c & 32) != 0 && (s4Var = this.f30968b) != null) {
            s4Var.m26110N8(this.f30959P);
        }
    }

    public void m8338d1(final boolean z) {
        final float f;
        final float f2;
        C3950k kVar;
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null) {
            if (z) {
                f2 = 0.13f;
                f = 2.0f;
            } else {
                f2 = -0.03f;
                f = 3.0f;
            }
            setPivotX(s4Var.m25745z0());
            setPivotY(this.f30968b.m26251A0());
            if (C4868i.m24726c2().m24663k1(2L) || C5069h.m24079n(0, 1000) == 500) {
                kVar = new C3950k(0, new C3950k.AbstractC3952b() {
                    @Override
                    public final void mo45P5(int i, float f3, float f4, C3950k kVar2) {
                        C9552h1.this.m8335f0(z, i, f3, f4, kVar2);
                    }

                    @Override
                    public void mo35Y0(int i, float f3, C3950k kVar2) {
                        C3953l.m29526a(this, i, f3, kVar2);
                    }
                }, C2057b.f7280b, 900L);
            } else {
                kVar = new C3950k(0, new C3950k.AbstractC3952b() {
                    @Override
                    public final void mo45P5(int i, float f3, float f4, C3950k kVar2) {
                        C9552h1.this.m8334g0(f2, f, i, f3, f4, kVar2);
                    }

                    @Override
                    public void mo35Y0(int i, float f3, C3950k kVar2) {
                        C3953l.m29526a(this, i, f3, kVar2);
                    }
                }, C2057b.f7283e, 600L);
            }
            kVar.m29544i(1.0f);
        }
    }

    public void m8337e0(long j, long j2) {
        AbstractC4761s4 s4Var;
        if (this.f30969c * 32 != 0 && (s4Var = this.f30968b) != null && s4Var.m26145K2() == j && this.f30968b.m26115N3() == j2) {
            this.f30968b.m26110N8(this.f30959P);
        }
    }

    @Deprecated
    public final boolean m8336e1(View$OnClickListenerC2971rh rhVar, C4583a5 a5Var, TdApi.ChatMember chatMember) {
        TdApi.MessageContent messageContent;
        if (!(a5Var.m25993Z3() == null || (messageContent = a5Var.m25993Z3().content) == null)) {
            int constructor = messageContent.getConstructor();
            if (constructor == 104813723) {
                long j = ((TdApi.MessageChatUpgradeTo) messageContent).supergroupId;
                if (j == 0) {
                    return false;
                }
                rhVar.mo4348c().m2485dd().m3888B7(rhVar, j, null);
                return true;
            } else if (constructor == 325954268) {
                long j2 = ((TdApi.MessageChatUpgradeFrom) messageContent).basicGroupId;
                if (j2 == 0) {
                    return false;
                }
                rhVar.mo4348c().m2485dd().m3599e7(rhVar, j2, null);
                return true;
            }
        }
        C5320c cVar = new C5320c(2);
        C5146u0 u0Var = new C5146u0(2);
        C5320c cVar2 = new C5320c(2);
        if (rhVar.m32671Li() && a5Var.mo25806t0()) {
            cVar.m23284a(R.id.btn_messageReply);
            u0Var.m23816a(R.string.Reply);
            cVar2.m23284a(R.drawable.baseline_reply_24);
        }
        if (rhVar.mo4348c().m2272r2(a5Var.m25993Z3())) {
            cVar.m23284a(R.id.btn_messageCopyLink);
            u0Var.m23816a(R.string.CopyLink);
            cVar2.m23284a(R.drawable.baseline_link_24);
        }
        if (this.f30968b.m25895k0()) {
            cVar.m23284a(R.id.btn_messageDelete);
            u0Var.m23816a(R.string.Delete);
            cVar2.m23284a(R.drawable.baseline_delete_24);
        }
        if (cVar.m23279f()) {
            return false;
        }
        rhVar.m32481Zq(a5Var, cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), null, chatMember, true);
        return true;
    }

    public final void m8333g1(final View$OnClickListenerC2971rh rhVar, final AbstractC4761s4 s4Var) {
        final TdApi.MessageSender messageSender = s4Var.m25993Z3().senderId;
        final C5320c cVar = new C5320c(2);
        final C5146u0 u0Var = new C5146u0(2);
        final C5320c cVar2 = new C5320c(2);
        final C5320c cVar3 = new C5320c(2);
        final TdApi.ChatMemberStatus K3 = rhVar.mo4348c().m2787K3(rhVar.mo9464C9());
        final AbstractC5918j f1Var = new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C9552h1.this.m8329q0(rhVar, cVar, u0Var, cVar3, cVar2, messageSender, K3, s4Var, (TdApi.ChatMember) obj);
            }
        };
        rhVar.mo4348c().m2270r4().m14783o(new TdApi.GetChatMember(rhVar.mo9464C9(), messageSender), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C9552h1.m8324v0(View$OnClickListenerC2971rh.this, s4Var, cVar, u0Var, cVar2, cVar3, messageSender, K3, f1Var, object);
            }
        });
    }

    public AbstractC6264v getAnyReceiver() {
        C6257p pVar = this.f30957N;
        return pVar != null ? pVar : this.f30960Q;
    }

    public C6257p getAvatarReceiver() {
        return this.f30956M;
    }

    public C6238b getComplexReceiver() {
        return this.f30961R;
    }

    public C6257p getContentReceiver() {
        return this.f30957N;
    }

    public final int getCurrentHeight() {
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null) {
            return s4Var.mo25354J3();
        }
        return 0;
    }

    public RunnableC6507m getGifReceiver() {
        return this.f30960Q;
    }

    @Override
    public AbstractC4761s4 getMessage() {
        return this.f30968b;
    }

    public final long getMessageId() {
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null) {
            return s4Var.m26115N3();
        }
        return 0L;
    }

    public C9565i1 getParentMessageViewGroup() {
        return this.f30962S;
    }

    public C6240c getPreviewReceiver() {
        return this.f30958O;
    }

    public final void m8332i1(View$OnClickListenerC2971rh rhVar, boolean z, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember) {
        if (z && C4779t2.m25613R(chatMemberStatus, chatMember.status) == 1) {
            chatMember = null;
        }
        TdApi.ChatMember chatMember2 = chatMember;
        View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(rhVar.mo4347s(), rhVar.mo4348c());
        u7Var.m31376sg(new View$OnClickListenerC3141u7.C3145d(rhVar.mo9464C9(), messageSender, z, chatMemberStatus, chatMember2).m31350b());
        rhVar.m9291ac(u7Var);
    }

    public final boolean m8330n1(float f) {
        MessagesRecyclerView R;
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var != null && !s4Var.m25946e6()) {
            AbstractC4761s4 s4Var2 = this.f30968b;
            if (!(s4Var2 instanceof C4791t4) && !(s4Var2 instanceof C4583a5) && !s4Var2.mo25841p6() && !C1379j0.m37307r(getContext()).m14529V0().m6909c0()) {
                View$OnClickListenerC2971rh a7 = this.f30968b.m25981a7();
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if ((i < 0 && !a7.m32671Li()) || (R = m8347R()) == null) {
                    return false;
                }
                C9547g3 messagesTouchHelper = R.getMessagesTouchHelper();
                if (C4403w.m27984G2()) {
                    if (((messagesTouchHelper.m8370M() && f > 0.0f) || (messagesTouchHelper.m8369N() && i < 0)) && this.f30965V < a7.get().getMeasuredWidth() - View$OnClickListenerC2971rh.m32800Bk()) {
                        a7.m32377hr(m8346S());
                        return true;
                    }
                } else if (((messagesTouchHelper.m8370M() && i < 0) || (messagesTouchHelper.m8369N() && f > 0.0f)) && this.f30965V > View$OnClickListenerC2971rh.m32800Bk()) {
                    a7.m32377hr(m8346S());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f30968b.m26055T0(this, canvas, this.f30956M, this.f30959P, this.f30958O, this.f30957N, this.f30960Q, this.f30961R);
    }

    @Override
    public void onMeasure(int i, int i2) {
        if ((this.f30969c & 64) != 0) {
            super.onMeasure(i, i2);
        } else {
            int measuredWidth = ((View) getParent()).getMeasuredWidth();
            AbstractC4761s4 s4Var = this.f30968b;
            if (s4Var != null) {
                s4Var.m25934g0(measuredWidth);
            }
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        }
        m8352L(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC4761s4 s4Var = this.f30968b;
        if (s4Var == null) {
            return false;
        }
        if ((s4Var.m26145K2() == 0 && !(this.f30968b instanceof C4791t4)) || this.f30968b.m25981a7().m9332Ua()) {
            return false;
        }
        if ((this.f30968b.m25981a7().m32566Tk() && !this.f30968b.m26071R6().m7692h1() && !this.f30968b.m26071R6().m7663n1()) || C1379j0.m37307r(getContext()).m14529V0().m6909c0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if ((this.f30969c & 16) != 0) {
                    setLongPressed(false);
                }
                if ((this.f30969c & 8) != 0) {
                    m8349O0();
                }
                int i = this.f30969c;
                if ((i & 4) != 0) {
                    this.f30969c = i & (-5);
                    return this.f30968b.mo25217f8(this, motionEvent);
                }
                if ((i & 2) != 0) {
                    this.f30969c = i & (-3);
                    if (m8359C0(motionEvent.getX(), motionEvent.getY())) {
                        C2065g.m35719c(this);
                        return true;
                    }
                }
                return false;
            } else if (action == 2) {
                float abs = Math.abs(this.f30965V - motionEvent.getX());
                float abs2 = Math.abs(this.f30966W - motionEvent.getY());
                float max = Math.max(abs, abs2);
                if ((this.f30969c & 8) != 0 && max > C1357a0.m37534p()) {
                    m8349O0();
                }
                MessagesRecyclerView R = m8347R();
                if (R == null || R.m14143J1() || abs2 >= C1357a0.m37534p() || abs <= C1357a0.m37534p() || !m8330n1(motionEvent.getX() - this.f30965V)) {
                    int i2 = this.f30969c;
                    if ((i2 & 4) != 0) {
                        return this.f30968b.mo25217f8(this, motionEvent);
                    }
                    if ((i2 & 2) != 0) {
                        if (max <= C1357a0.m37534p()) {
                            return true;
                        }
                        this.f30969c &= -3;
                    }
                    return false;
                }
                if ((this.f30969c & 8) != 0) {
                    m8349O0();
                }
                int i3 = this.f30969c;
                if ((i3 & 2) != 0) {
                    this.f30969c = i3 & (-3);
                }
                return false;
            } else if (action != 3) {
                return false;
            } else {
                if ((this.f30969c & 16) != 0) {
                    setLongPressed(false);
                }
                if ((this.f30969c & 8) != 0) {
                    m8349O0();
                }
                int i4 = this.f30969c;
                if ((i4 & 4) != 0) {
                    this.f30969c = i4 & (-5);
                    return this.f30968b.mo25217f8(this, motionEvent);
                } else if ((i4 & 2) == 0) {
                    return false;
                } else {
                    this.f30969c = i4 & (-3);
                    return true;
                }
            }
        } else if (this.f30968b.m25747y9(motionEvent)) {
            return false;
        } else {
            View$OnClickListenerC2971rh a7 = this.f30968b.m25981a7();
            if (a7.m32448cl()) {
                return false;
            }
            this.f30965V = motionEvent.getX();
            float y = motionEvent.getY();
            this.f30966W = y;
            if (this.f30968b.mo26056T(this.f30965V, y)) {
                m8350M0();
            } else {
                m8349O0();
            }
            if (a7.m9374Oa() || !this.f30968b.mo25217f8(this, motionEvent)) {
                this.f30969c |= 2;
            } else {
                this.f30969c |= 4;
            }
            return true;
        }
    }

    public void setCustomMeasureDisabled(boolean z) {
        this.f30969c = C5063c.m24138h(this.f30969c, 64, z);
    }

    public void setManager(C9678w2 w2Var) {
        this.f30963T = w2Var;
    }

    public void setMessage(AbstractC4761s4 s4Var) {
        int J3 = s4Var.mo25354J3();
        int currentHeight = getCurrentHeight();
        AbstractC4761s4 s4Var2 = this.f30968b;
        if (s4Var2 != null) {
            s4Var2.m26131L7(this);
        }
        if (this.f30968b == null || getMeasuredHeight() != J3 || currentHeight != J3) {
            this.f30968b = s4Var;
            if ((this.f30969c & 64) == 0) {
                requestLayout();
            }
        } else if (this.f30968b.m26164I3() != s4Var.m26164I3()) {
            this.f30968b = s4Var;
            m8352L(this);
        } else {
            this.f30968b = s4Var;
        }
        s4Var.m26090P8();
        s4Var.m26170H8(this.f30956M);
        if ((this.f30969c & 1) != 0) {
            this.f30958O.mo20259D0(s4Var.mo26074R3(true));
            s4Var.mo26121M8(this.f30958O);
            if (s4Var.mo25869m7()) {
                this.f30957N.m20819G(null);
                s4Var.mo26160I8(this.f30960Q);
            } else {
                this.f30960Q.m20231r(null);
                this.f30957N.mo20259D0(s4Var.mo26074R3(false));
                s4Var.mo26150J8(this.f30957N);
            }
        }
        if ((this.f30969c & Log.TAG_YOUTUBE) != 0) {
            s4Var.mo25334L8(this.f30961R, false, -1);
        }
        AbstractC4761s4 s4Var3 = this.f30968b;
        if (s4Var3 != null) {
            s4Var3.m26192F7(this);
            if (Build.VERSION.SDK_INT >= 21 && this.f30963T.m7615x3()) {
                invalidateOutline();
            }
        }
    }

    public void setParentMessageViewGroup(C9565i1 i1Var) {
        this.f30962S = i1Var;
    }

    public void m8323w0() {
        if (!this.f30964U) {
            this.f30964U = true;
            this.f30956M.mo20245f();
            this.f30960Q.mo20245f();
            if ((this.f30969c & 32) != 0) {
                this.f30959P.mo20245f();
            }
            if ((1 & this.f30969c) != 0) {
                this.f30957N.mo20245f();
                this.f30958O.mo20245f();
            }
            if ((this.f30969c & Log.TAG_YOUTUBE) != 0) {
                this.f30961R.m21001b();
            }
        }
    }

    public void m8321x0() {
        if (this.f30964U) {
            this.f30964U = false;
            this.f30956M.mo20247b();
            this.f30960Q.mo20247b();
            if ((this.f30969c & 32) != 0) {
                this.f30959P.mo20247b();
            }
            if ((this.f30969c & 1) != 0) {
                this.f30957N.mo20247b();
                this.f30958O.mo20247b();
            }
            if ((this.f30969c & Log.TAG_YOUTUBE) != 0) {
                this.f30961R.m20994i();
            }
        }
    }
}
