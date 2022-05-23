package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import db.g;
import de.q9;
import de.rh;
import de.u7;
import eb.k;
import eb.l;
import gd.w;
import hd.a5;
import hd.h6;
import hd.s4;
import hd.t2;
import hd.t4;
import he.i;
import ib.h;
import ie.g0;
import ie.h0;
import ie.u0;
import kb.c;
import kb.j;
import ld.b;
import ld.p;
import ld.v;
import md.m;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.MessagesRecyclerView;
import org.thunderdog.challegram.widget.SparseDrawableView;
import ud.q1;
import ud.v4;
import vc.v2;

public class g1 extends SparseDrawableView implements c, v2.g {
    public p N;
    public ld.c O;
    public ld.c P;
    public b R;
    public h1 S;
    public v2 T;
    public float V;
    public float W;
    public kb.b f24955a0;
    public s4 f24956b;
    public int f24957c;
    public boolean U = true;
    public final p M = new p(this, a0.i(20.5f));
    public m Q = new m(this);

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            g1.this.f24957c &= -9;
            g1.this.f24955a0 = null;
            g1.this.C0();
        }
    }

    public g1(Context context) {
        super(context);
        e1();
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    public static java.lang.Object N(de.rh r21, hd.s4 r22, org.drinkless.td.libcore.telegram.TdApi.ChatMember r23, jb.c r24, jb.c r25, ie.u0 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: vc.g1.N(de.rh, hd.s4, org.drinkless.td.libcore.telegram.TdApi$ChatMember, jb.c, jb.c, ie.u0, boolean):java.lang.Object");
    }

    public static void V0(rh rhVar, s4 s4Var, float f10, float f11) {
        long r12 = s4Var.r1(f10, f11);
        if (r12 == 0) {
            rhVar.ip(s4Var, f10, f11);
        } else {
            rhVar.jp(r12, s4Var, f10, f11);
        }
    }

    public void h0(boolean z10, int i10, float f10, float f11, k kVar) {
        float f12;
        float f13;
        float f14 = f10 < 0.5f ? f10 / 0.5f : 1.0f - ((f10 - 0.5f) / 0.5f);
        if (z10) {
            f12 = (f14 * 0.5f) + 1.0f;
            f13 = 720.0f;
        } else {
            f12 = 1.0f - (f14 * 0.6f);
            f13 = -720.0f;
        }
        setScaleX(f12);
        setScaleY(f12);
        setRotation(f10 * f13);
    }

    public void n0(float f10, float f11, int i10, float f12, float f13, k kVar) {
        float interpolation = db.b.f7287b.getInterpolation(f12);
        float f14 = (f10 * (interpolation < 0.35f ? interpolation / 0.35f : 1.0f - ((interpolation - 0.35f) / 0.65f))) + 1.0f;
        setScaleX(f14);
        setScaleY(f14);
        setRotation(((float) Math.sin(Math.toRadians((interpolation * 540.0f) % 360.0f))) * f11);
    }

    public boolean p0(rh rhVar, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember, s4 s4Var, View view, int i10) {
        TdApi.FormattedText formattedText;
        switch (view.getId()) {
            case R.id.btn_blockSender:
                rhVar.c().hd().A3(rhVar, rhVar.C9(), messageSender, chatMember.status);
                return true;
            case R.id.btn_editRights:
                n1(rhVar, false, messageSender, chatMemberStatus, chatMember);
                return true;
            case R.id.btn_messageCopy:
                if (t2.L(s4Var.X3())) {
                    formattedText = e.y1(s4Var.X3().content);
                } else {
                    formattedText = s4Var instanceof h6 ? ((h6) s4Var).ma() : null;
                }
                if (formattedText == null) {
                    return true;
                }
                j0.i(t2.s5(formattedText), R.string.CopiedText);
                return true;
            case R.id.btn_messageViewList:
                q9 q9Var = new q9(rhVar.t(), rhVar.c());
                q9Var.Ad(new q9.b(null, rhVar.C9(), null, messageSender, rhVar.c().O6(e.S0(messageSender))));
                rhVar.ac(q9Var);
                return true;
            case R.id.btn_restrictMember:
                n1(rhVar, true, messageSender, chatMemberStatus, chatMember);
                return true;
            default:
                return true;
        }
    }

    public void q0(final rh rhVar, jb.c cVar, u0 u0Var, jb.c cVar2, jb.c cVar3, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus, final s4 s4Var, final TdApi.ChatMember chatMember) {
        rhVar.ee(null, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean p02;
                p02 = g1.this.p0(rhVar, messageSender, chatMemberStatus, chatMember, s4Var, view, i10);
                return p02;
            }
        });
    }

    private void setLongPressed(boolean z10) {
        if (z10) {
            this.f24957c |= 16;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            performHapticFeedback(0);
            return;
        }
        this.f24957c &= -17;
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
    }

    public static void w0(rh rhVar, s4 s4Var, jb.c cVar, u0 u0Var, jb.c cVar2, jb.c cVar3, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, final j jVar, TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            boolean O6 = rhVar.c().O6(rhVar.C9());
            if (t2.L(s4Var.X3()) || ((s4Var instanceof h6) && ((h6) s4Var).ma().text.trim().length() > 0)) {
                cVar.a(R.id.btn_messageCopy);
                u0Var.a(R.string.Copy);
                cVar2.a(R.drawable.baseline_content_copy_24);
                cVar3.a(1);
            }
            if (!O6) {
                cVar.a(R.id.btn_messageViewList);
                if (rhVar.c().o7(e.U0(messageSender))) {
                    u0Var.a(R.string.ViewMessagesFromYou);
                } else {
                    u0Var.b(w.j1(R.string.ViewMessagesFromUser, rhVar.c().Db(messageSender, true)));
                }
                cVar2.a(R.drawable.baseline_person_24);
                cVar3.a(1);
            }
            if (chatMemberStatus != null && (!t2.P2(chatMember.status) || !t2.P2(chatMemberStatus))) {
                int P = t2.P(chatMemberStatus, chatMember.status);
                if (!(P == 0 || P == 1)) {
                    cVar.a(R.id.btn_editRights);
                    cVar2.a(R.drawable.baseline_stars_24);
                    cVar3.a(1);
                    if (P == 2) {
                        u0Var.a(R.string.EditAdminRights);
                    } else if (P == 3) {
                        u0Var.a(R.string.ViewAdminRights);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                int R = t2.R(chatMemberStatus, chatMember.status);
                if (!(R == 0 || (messageSender.getConstructor() == -239660751 && e.S0(messageSender) == rhVar.C9()))) {
                    if (!O6 || (O6 && R == 2)) {
                        cVar.a(R.id.btn_restrictMember);
                        cVar3.a(R == 1 ? 2 : 1);
                        cVar2.a(R.drawable.baseline_block_24);
                        if (R == 1) {
                            u0Var.a(messageSender.getConstructor() == -239660751 ? rhVar.c().O6(e.S0(messageSender)) ? R.string.BanChannel : R.string.BanChat : R.string.RestrictUser);
                        } else if (R == 2) {
                            u0Var.a(messageSender.getConstructor() == -239660751 ? rhVar.c().O6(e.S0(messageSender)) ? R.string.EditChannelRestrictions : R.string.EditGroupRestrictions : R.string.EditUserRestrictions);
                        } else if (R == 3) {
                            u0Var.a(R.string.ViewRestrictions);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (messageSender.getConstructor() != -239660751) {
                        cVar.a(R.id.btn_blockSender);
                        cVar2.a(R.drawable.baseline_remove_circle_24);
                        u0Var.a(O6 ? R.string.ChannelRemoveUser : R.string.RemoveFromGroup);
                        cVar3.a(2);
                    }
                }
            }
            rhVar.wd(new Runnable() {
                @Override
                public final void run() {
                    j.this.a(chatMember);
                }
            });
        }
    }

    public void B0() {
        if (this.U) {
            this.U = false;
            this.M.b();
            this.Q.b();
            if ((this.f24957c & 32) != 0) {
                this.P.b();
            }
            if ((this.f24957c & 1) != 0) {
                this.N.b();
                this.O.b();
            }
            if ((this.f24957c & Log.TAG_YOUTUBE) != 0) {
                this.R.i();
            }
        }
    }

    public final void C0() {
        int i10 = this.f24957c;
        if ((i10 & 2) != 0) {
            if (L0()) {
                this.f24957c &= -3;
                setLongPressed(true);
            }
        } else if ((i10 & 4) != 0) {
            this.f24957c = i10 & (-5);
            if (this.f24956b.m8(this, this.V, this.W) || L0()) {
                setLongPressed(true);
            }
        }
    }

    public final boolean D0(float f10, float f11) {
        q1 bc2;
        s4 s4Var = this.f24956b;
        if (s4Var != null && !(s4Var instanceof t4)) {
            rh a72 = s4Var.a7();
            if ((a72.Ta() || a72.Z9().Ta()) && (bc2 = a72.Z9().bc()) != null && !bc2.S() && !bc2.I().p3()) {
                if (a72.Oa()) {
                    if (!this.f24956b.q0()) {
                        return false;
                    }
                    V0(a72, this.f24956b, this.V, this.W);
                    return true;
                } else if (a72.Uk()) {
                    a72.Go(this.f24956b);
                    return true;
                } else if (this.f24956b.S7(this, a72)) {
                    return true;
                } else {
                    return G0(f10, f11, null);
                }
            }
        }
        return false;
    }

    public final boolean G0(float f10, float f11, TdApi.ChatMember chatMember) {
        rh a72 = this.f24956b.a7();
        boolean z10 = !this.f24956b.d6();
        if (this.f24956b.X5()) {
            m1(a72, this.f24956b);
            return true;
        }
        s4 s4Var = this.f24956b;
        if (!(s4Var instanceof a5)) {
            jb.c cVar = new jb.c(6);
            jb.c cVar2 = new jb.c(6);
            u0 u0Var = new u0(6);
            Object N = N(a72, this.f24956b, chatMember, cVar, cVar2, u0Var, false);
            if (cVar.f()) {
                return false;
            }
            a72.Zq(this.f24956b, cVar.e(), u0Var.d(), cVar2.e(), N, chatMember, false);
            return true;
        } else if (z10) {
            return l1(a72, (a5) s4Var, chatMember);
        } else {
            a72.Zq(s4Var, new int[]{R.id.btn_messageDelete}, new String[]{w.i1(R.string.Delete)}, new int[]{R.drawable.baseline_delete_24}, null, chatMember, true);
            return true;
        }
    }

    public final boolean L0() {
        v4<?> q92;
        s4 s4Var = this.f24956b;
        if (!(s4Var instanceof t4) && !s4Var.d6() && (q92 = v4.q9(this)) != null && (q92 instanceof rh)) {
            rh rhVar = (rh) q92;
            s4 s4Var2 = this.f24956b;
            if (s4Var2 instanceof a5) {
                return D0(0.0f, 0.0f);
            }
            if (s4Var2.q0()) {
                V0(rhVar, this.f24956b, this.V, this.W);
                return true;
            }
        }
        return false;
    }

    public final void M(g1 g1Var) {
        s4 s4Var = this.f24956b;
        if (s4Var != null) {
            s4Var.J6(g1Var, this.M);
            if ((this.f24957c & 32) != 0) {
                this.f24956b.N8(this.P);
            }
        }
    }

    public final void P0() {
        int i10 = this.f24957c;
        if ((i10 & 8) == 0) {
            this.f24957c = i10 | 8;
            this.f24955a0 = new a();
            cancelLongPress();
            postDelayed(this.f24955a0, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void Q0() {
        this.f24957c &= -9;
        kb.b bVar = this.f24955a0;
        if (bVar != null) {
            bVar.c();
            removeCallbacks(this.f24955a0);
            this.f24955a0 = null;
        }
    }

    @Override
    public void Q2() {
        b0();
    }

    public final MessagesRecyclerView S() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof MessagesRecyclerView) {
                return (MessagesRecyclerView) parent;
            }
        }
        return null;
    }

    public final View T() {
        View view = this;
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof MessagesRecyclerView) {
                return view;
            }
            view = (View) parent;
        }
        return this;
    }

    public void U(long j10, long j11, int i10) {
        s4 s4Var = this.f24956b;
        if (s4Var != null && j10 == s4Var.I2()) {
            if ((this.f24957c & Log.TAG_YOUTUBE) != 0) {
                if (this.f24956b.S5(j11)) {
                    this.f24956b.L8(this.R, true, i10);
                }
            } else if (j11 == this.f24956b.K3()) {
                if (this.Q != null && this.f24956b.m7()) {
                    this.f24956b.I8(this.Q);
                }
                if (this.f24956b.q7()) {
                    p pVar = this.N;
                    if (pVar != null) {
                        this.f24956b.J8(pVar);
                    }
                    ld.c cVar = this.O;
                    if (cVar != null && cVar.isEmpty()) {
                        this.f24956b.M8(this.O);
                    }
                }
                if ((this.f24957c & 64) != 0 && (getParent() instanceof h1)) {
                    ((h1) getParent()).c(this.f24956b);
                }
            }
        }
    }

    public void Y0() {
        this.R = new b(this);
        this.f24957c |= Log.TAG_YOUTUBE;
    }

    public void b0() {
        p pVar = this.M;
        if (pVar != null) {
            pVar.b0();
        }
        p pVar2 = this.N;
        if (pVar2 != null) {
            pVar2.b0();
        }
        ld.c cVar = this.O;
        if (cVar != null) {
            cVar.b0();
        }
        ld.c cVar2 = this.P;
        if (cVar2 != null) {
            cVar2.b0();
        }
        m mVar = this.Q;
        if (mVar != null) {
            mVar.b0();
        }
        b bVar = this.R;
        if (bVar != null) {
            bVar.Q2();
        }
        s4 s4Var = this.f24956b;
        if (s4Var != null) {
            s4Var.J7();
        }
    }

    public void b1() {
        p pVar = new p(this, 1);
        this.N = pVar;
        pVar.E0(0);
        ld.c cVar = new ld.c(this, 1);
        this.O = cVar;
        cVar.E0(0);
        this.f24957c |= 1;
    }

    public void c0(long j10, long j11) {
        ld.c cVar;
        s4 s4Var = this.f24956b;
        if (s4Var != null && j10 == s4Var.I2() && j11 == this.f24956b.K3() && (cVar = this.O) != null) {
            this.f24956b.M8(cVar);
        }
    }

    public void d0() {
        s4 s4Var;
        if ((this.f24957c & 32) != 0 && (s4Var = this.f24956b) != null) {
            s4Var.N8(this.P);
        }
    }

    public void e1() {
        this.P = new ld.c(this, 0);
        this.f24957c |= 32;
    }

    public void f1(final boolean z10) {
        final float f10;
        final float f11;
        k kVar;
        s4 s4Var = this.f24956b;
        if (s4Var != null) {
            if (z10) {
                f11 = 0.13f;
                f10 = 2.0f;
            } else {
                f11 = -0.03f;
                f10 = 3.0f;
            }
            setPivotX(s4Var.A0());
            setPivotY(this.f24956b.B0());
            if (i.c2().k1(2L) || h.n(0, 1000) == 500) {
                kVar = new k(0, new k.b() {
                    @Override
                    public final void n4(int i10, float f12, float f13, k kVar2) {
                        g1.this.h0(z10, i10, f12, f13, kVar2);
                    }

                    @Override
                    public void o4(int i10, float f12, k kVar2) {
                        l.a(this, i10, f12, kVar2);
                    }
                }, db.b.f7287b, 900L);
            } else {
                kVar = new k(0, new k.b() {
                    @Override
                    public final void n4(int i10, float f12, float f13, k kVar2) {
                        g1.this.n0(f11, f10, i10, f12, f13, kVar2);
                    }

                    @Override
                    public void o4(int i10, float f12, k kVar2) {
                        l.a(this, i10, f12, kVar2);
                    }
                }, db.b.f7290e, 600L);
            }
            kVar.i(1.0f);
        }
    }

    public void g0(long j10, long j11) {
        s4 s4Var;
        if (this.f24957c * 32 != 0 && (s4Var = this.f24956b) != null && s4Var.I2() == j10 && this.f24956b.K3() == j11) {
            this.f24956b.N8(this.P);
        }
    }

    public v getAnyReceiver() {
        p pVar = this.N;
        return pVar != null ? pVar : this.Q;
    }

    public p getAvatarReceiver() {
        return this.M;
    }

    public b getComplexReceiver() {
        return this.R;
    }

    public p getContentReceiver() {
        return this.N;
    }

    public final int getCurrentHeight() {
        s4 s4Var = this.f24956b;
        if (s4Var != null) {
            return s4Var.G3();
        }
        return 0;
    }

    public m getGifReceiver() {
        return this.Q;
    }

    @Override
    public s4 getMessage() {
        return this.f24956b;
    }

    public final long getMessageId() {
        s4 s4Var = this.f24956b;
        if (s4Var != null) {
            return s4Var.K3();
        }
        return 0L;
    }

    public h1 getParentMessageViewGroup() {
        return this.S;
    }

    public ld.c getPreviewReceiver() {
        return this.O;
    }

    @Deprecated
    public final boolean l1(rh rhVar, a5 a5Var, TdApi.ChatMember chatMember) {
        TdApi.MessageContent messageContent;
        if (!(a5Var.X3() == null || (messageContent = a5Var.X3().content) == null)) {
            int constructor = messageContent.getConstructor();
            if (constructor == 104813723) {
                long j10 = ((TdApi.MessageChatUpgradeTo) messageContent).supergroupId;
                if (j10 == 0) {
                    return false;
                }
                rhVar.c().hd().B7(rhVar, j10, null);
                return true;
            } else if (constructor == 325954268) {
                long j11 = ((TdApi.MessageChatUpgradeFrom) messageContent).basicGroupId;
                if (j11 == 0) {
                    return false;
                }
                rhVar.c().hd().e7(rhVar, j11, null);
                return true;
            }
        }
        jb.c cVar = new jb.c(2);
        u0 u0Var = new u0(2);
        jb.c cVar2 = new jb.c(2);
        if (rhVar.Li() && a5Var.u0()) {
            cVar.a(R.id.btn_messageReply);
            u0Var.a(R.string.Reply);
            cVar2.a(R.drawable.baseline_reply_24);
        }
        if (rhVar.c().t2(a5Var.X3())) {
            cVar.a(R.id.btn_messageCopyLink);
            u0Var.a(R.string.CopyLink);
            cVar2.a(R.drawable.baseline_link_24);
        }
        if (this.f24956b.l0()) {
            cVar.a(R.id.btn_messageDelete);
            u0Var.a(R.string.Delete);
            cVar2.a(R.drawable.baseline_delete_24);
        }
        if (cVar.f()) {
            return false;
        }
        rhVar.Zq(a5Var, cVar.e(), u0Var.d(), cVar2.e(), null, chatMember, true);
        return true;
    }

    public final void m1(final rh rhVar, final s4 s4Var) {
        final TdApi.MessageSender messageSender = s4Var.X3().senderId;
        final jb.c cVar = new jb.c(2);
        final u0 u0Var = new u0(2);
        final jb.c cVar2 = new jb.c(2);
        final jb.c cVar3 = new jb.c(2);
        final TdApi.ChatMemberStatus O3 = rhVar.c().O3(rhVar.C9());
        final j e1Var = new j() {
            @Override
            public final void a(Object obj) {
                g1.this.q0(rhVar, cVar, u0Var, cVar3, cVar2, messageSender, O3, s4Var, (TdApi.ChatMember) obj);
            }
        };
        rhVar.c().v4().o(new TdApi.GetChatMember(rhVar.C9(), messageSender), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                g1.w0(rh.this, s4Var, cVar, u0Var, cVar2, cVar3, messageSender, O3, e1Var, object);
            }
        });
    }

    public final void n1(rh rhVar, boolean z10, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember) {
        if (z10 && t2.R(chatMemberStatus, chatMember.status) == 1) {
            chatMember = null;
        }
        TdApi.ChatMember chatMember2 = chatMember;
        u7 u7Var = new u7(rhVar.t(), rhVar.c());
        u7Var.sg(new u7.d(rhVar.C9(), messageSender, z10, chatMemberStatus, chatMember2).b());
        rhVar.ac(u7Var);
    }

    public final boolean o1(float f10) {
        MessagesRecyclerView S;
        s4 s4Var = this.f24956b;
        if (s4Var != null && !s4Var.d6()) {
            s4 s4Var2 = this.f24956b;
            if (!(s4Var2 instanceof t4) && !(s4Var2 instanceof a5) && !s4Var2.o6() && !j0.r(getContext()).Z0().c0()) {
                rh a72 = this.f24956b.a7();
                int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if ((i10 < 0 && !a72.Li()) || (S = S()) == null) {
                    return false;
                }
                f3 messagesTouchHelper = S.getMessagesTouchHelper();
                if (w.G2()) {
                    if (((messagesTouchHelper.M() && f10 > 0.0f) || (messagesTouchHelper.N() && i10 < 0)) && this.V < a72.get().getMeasuredWidth() - rh.Bk()) {
                        a72.hr(T());
                        return true;
                    }
                } else if (((messagesTouchHelper.M() && i10 < 0) || (messagesTouchHelper.N() && f10 > 0.0f)) && this.V > rh.Bk()) {
                    a72.hr(T());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f24956b.T0(this, canvas, this.M, this.P, this.O, this.N, this.Q, this.R);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if ((this.f24957c & 64) != 0) {
            super.onMeasure(i10, i11);
        } else {
            int measuredWidth = ((View) getParent()).getMeasuredWidth();
            s4 s4Var = this.f24956b;
            if (s4Var != null) {
                s4Var.h0(measuredWidth);
            }
            setMeasuredDimension(i10, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        }
        M(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        s4 s4Var = this.f24956b;
        if (s4Var == null) {
            return false;
        }
        if ((s4Var.I2() == 0 && !(this.f24956b instanceof t4)) || this.f24956b.a7().Ua()) {
            return false;
        }
        if ((this.f24956b.a7().Tk() && !this.f24956b.R6().h1() && !this.f24956b.R6().o1()) || j0.r(getContext()).Z0().c0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if ((this.f24957c & 16) != 0) {
                    setLongPressed(false);
                }
                if ((this.f24957c & 8) != 0) {
                    Q0();
                }
                int i10 = this.f24957c;
                if ((i10 & 4) != 0) {
                    this.f24957c = i10 & (-5);
                    return this.f24956b.f8(this, motionEvent);
                }
                if ((i10 & 2) != 0) {
                    this.f24957c = i10 & (-3);
                    if (D0(motionEvent.getX(), motionEvent.getY())) {
                        g.c(this);
                        return true;
                    }
                }
                return false;
            } else if (action == 2) {
                float abs = Math.abs(this.V - motionEvent.getX());
                float abs2 = Math.abs(this.W - motionEvent.getY());
                float max = Math.max(abs, abs2);
                if ((this.f24957c & 8) != 0 && max > a0.p()) {
                    Q0();
                }
                MessagesRecyclerView S = S();
                if (S == null || S.I1() || abs2 >= a0.p() || abs <= a0.p() || !o1(motionEvent.getX() - this.V)) {
                    int i11 = this.f24957c;
                    if ((i11 & 4) != 0) {
                        return this.f24956b.f8(this, motionEvent);
                    }
                    if ((i11 & 2) != 0) {
                        if (max <= a0.p()) {
                            return true;
                        }
                        this.f24957c &= -3;
                    }
                    return false;
                }
                if ((this.f24957c & 8) != 0) {
                    Q0();
                }
                int i12 = this.f24957c;
                if ((i12 & 2) != 0) {
                    this.f24957c = i12 & (-3);
                }
                return false;
            } else if (action != 3) {
                return false;
            } else {
                if ((this.f24957c & 16) != 0) {
                    setLongPressed(false);
                }
                if ((this.f24957c & 8) != 0) {
                    Q0();
                }
                int i13 = this.f24957c;
                if ((i13 & 4) != 0) {
                    this.f24957c = i13 & (-5);
                    return this.f24956b.f8(this, motionEvent);
                } else if ((i13 & 2) == 0) {
                    return false;
                } else {
                    this.f24957c = i13 & (-3);
                    return true;
                }
            }
        } else if (this.f24956b.y9(motionEvent)) {
            return false;
        } else {
            rh a72 = this.f24956b.a7();
            if (a72.cl()) {
                return false;
            }
            this.V = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.W = y10;
            if (this.f24956b.U(this.V, y10)) {
                P0();
            } else {
                Q0();
            }
            if (a72.Oa() || !this.f24956b.f8(this, motionEvent)) {
                this.f24957c |= 2;
            } else {
                this.f24957c |= 4;
            }
            return true;
        }
    }

    public void setCustomMeasureDisabled(boolean z10) {
        this.f24957c = ib.c.h(this.f24957c, 64, z10);
    }

    public void setManager(v2 v2Var) {
        this.T = v2Var;
    }

    public void setMessage(s4 s4Var) {
        int G3 = s4Var.G3();
        int currentHeight = getCurrentHeight();
        s4 s4Var2 = this.f24956b;
        if (s4Var2 != null) {
            s4Var2.L7(this);
        }
        if (this.f24956b == null || getMeasuredHeight() != G3 || currentHeight != G3) {
            this.f24956b = s4Var;
            if ((this.f24957c & 64) == 0) {
                requestLayout();
            }
        } else if (this.f24956b.F3() != s4Var.F3()) {
            this.f24956b = s4Var;
            M(this);
        } else {
            this.f24956b = s4Var;
        }
        s4Var.P8();
        s4Var.H8(this.M);
        if ((this.f24957c & 1) != 0) {
            this.O.E0(s4Var.O3(true));
            s4Var.M8(this.O);
            if (s4Var.m7()) {
                this.N.G(null);
                s4Var.I8(this.Q);
            } else {
                this.Q.r(null);
                this.N.E0(s4Var.O3(false));
                s4Var.J8(this.N);
            }
        }
        if ((this.f24957c & Log.TAG_YOUTUBE) != 0) {
            s4Var.L8(this.R, false, -1);
        }
        s4 s4Var3 = this.f24956b;
        if (s4Var3 != null) {
            s4Var3.F7(this);
            if (this.T.x3()) {
                invalidateOutline();
            }
        }
    }

    public void setParentMessageViewGroup(h1 h1Var) {
        this.S = h1Var;
    }

    public void y0() {
        if (!this.U) {
            this.U = true;
            this.M.e();
            this.Q.e();
            if ((this.f24957c & 32) != 0) {
                this.P.e();
            }
            if ((1 & this.f24957c) != 0) {
                this.N.e();
                this.O.e();
            }
            if ((this.f24957c & Log.TAG_YOUTUBE) != 0) {
                this.R.b();
            }
        }
    }
}
