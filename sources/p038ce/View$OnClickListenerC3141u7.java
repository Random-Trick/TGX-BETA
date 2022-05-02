package p038ce;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import gd.C4601c3;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.C6981o;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.View$OnClickListenerC3141u7;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5920l;
import p193nb.C7316a;
import p193nb.C7321e;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11090w7;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9188f2;
import td.C9357x2;

public class View$OnClickListenerC3141u7 extends AbstractC2420g6<C3145d> implements View.OnClickListener, C11059v7.AbstractC11061b {
    public TdApi.ChatMemberStatusAdministrator f10528v0;
    public TdApi.ChatMemberStatusRestricted f10529w0;
    public boolean f10530x0;
    public C2546iq f10531y0;
    public C2964ra f10532z0;

    public class C3142a extends C2546iq {
        public C3142a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(p038ce.C2964ra r8, tc.C9137c r9, boolean r10) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC3141u7.C3142a.mo394V2(ce.ra, tc.c, boolean):void");
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setChat((C4601c3) raVar.m32844d());
        }

        @Override
        public void mo17889i2(View$OnFocusChangeListenerC7069y1 y1Var, CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            if (View$OnClickListenerC3141u7.this.f10532z0.m32845c0(charSequence2)) {
                if (View$OnClickListenerC3141u7.this.f10528v0 != null) {
                    View$OnClickListenerC3141u7.this.f10528v0.customTitle = charSequence2;
                }
                View$OnClickListenerC3141u7.this.m31413Sf();
            }
        }

        @Override
        public void mo30690v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            C3145d x9 = View$OnClickListenerC3141u7.this.m9131x9();
            boolean z = true;
            y1Var.getEditText().setInputType(1);
            TdApi.ChatMember chatMember = x9.f10540d;
            y1Var.setEmptyHint((chatMember == null || !C4779t2.m25623P2(chatMember.status)) ? R.string.message_adminSignPlain : R.string.message_ownerSign);
            y1Var.setText(raVar.m32821x());
            if (!C4779t2.m25623P2(x9.f10539c) && !View$OnClickListenerC3141u7.this.m31405Zf() && !View$OnClickListenerC3141u7.this.m31419Nf()) {
                z = false;
            }
            y1Var.setInputEnabled(z);
            y1Var.setMaxLength(16);
            if (viewGroup.getBackground() == null) {
                C10192g.m5782i(viewGroup, R.id.theme_color_filling, View$OnClickListenerC3141u7.this);
            }
        }
    }

    public class C3143b extends RecyclerView.AbstractC0901o {
        public C3143b() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            rect.bottom = ((C2964ra) view.getTag()).m32876A() == 73 ? C1357a0.m37541i(56.0f) + (C1357a0.m37541i(16.0f) * 2) : 0;
        }
    }

    public class C3144c implements HandlerC10770jj.AbstractC10785n {
        public final long f10535a;

        public C3144c(long j) {
            this.f10535a = j;
        }

        public void m31356h(boolean r4, org.drinkless.p210td.libcore.telegram.TdApi.Error r5) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC3141u7.C3144c.m31356h(boolean, org.drinkless.td.libcore.telegram.TdApi$Error):void");
        }

        public void m31355i(final boolean z, final TdApi.Error error) {
            View$OnClickListenerC3141u7.this.m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3141u7.C3144c.this.m31356h(z, error);
                }
            });
        }

        public void m31354j(long j, String str) {
            View$OnClickListenerC3141u7.this.f30167b.m2501cd(View$OnClickListenerC3141u7.this.m9131x9().f10537a, j, str, new C10930q6.AbstractC10939i() {
                @Override
                public final void mo1765a(boolean z, TdApi.Error error) {
                    View$OnClickListenerC3141u7.C3144c.this.m31355i(z, error);
                }
            });
        }

        public void m31353k(TdApi.Error error) {
            View$OnClickListenerC3141u7.this.m34626ff(false);
            if (error != null) {
                View$OnClickListenerC3141u7.this.m31368wg(C4779t2.m25378z5(error));
            }
        }

        public void m31352l(Runnable runnable, long j, long j2, final TdApi.Error error) {
            if (j2 != 0) {
                View$OnClickListenerC3141u7.this.m9131x9().f10537a = j2;
                runnable.run();
                return;
            }
            View$OnClickListenerC3141u7.this.m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3141u7.C3144c.this.m31353k(error);
                }
            });
        }

        @Override
        public void mo3335a(TdApi.Object object) {
            View$OnClickListenerC3141u7.this.m34626ff(false);
            if (object.getConstructor() == -1679978726) {
                View$OnClickListenerC3141u7.this.m31368wg(C4779t2.m25378z5(object));
            }
        }

        @Override
        public void mo3334b(final String str) {
            if (!View$OnClickListenerC3141u7.this.m34635Se()) {
                View$OnClickListenerC3141u7.this.m34626ff(true);
                final long j = this.f10535a;
                final Runnable v7Var = new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3141u7.C3144c.this.m31354j(j, str);
                    }
                };
                if (C7316a.m17054g(View$OnClickListenerC3141u7.this.m9131x9().f10537a)) {
                    View$OnClickListenerC3141u7.this.f30167b.m2776Ke(View$OnClickListenerC3141u7.this.m9131x9().f10537a, new C10930q6.AbstractC10948r() {
                        @Override
                        public final void mo1525a(long j2, long j3, TdApi.Error error) {
                            View$OnClickListenerC3141u7.C3144c.this.m31352l(v7Var, j2, j3, error);
                        }
                    });
                } else {
                    v7Var.run();
                }
            }
        }
    }

    public View$OnClickListenerC3141u7(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31404ag(TdApi.BasicGroup basicGroup) {
        if (!m9347Sa()) {
            this.f30167b.m2480e2().m1611o2(basicGroup.f25363id, this);
            m9131x9().f10537a = C7316a.m17059b(basicGroup.upgradedToSupergroupId);
        }
    }

    public void m31403bg() {
        m31372ug(true);
        C7321e.m16919q(this.f30167b.m2159y3(m9131x9().f10537a), this.f10529w0.permissions);
        m31432Ag();
        m34626ff(true);
        mo31397hf(true);
        m31378rg(true);
    }

    public static boolean m31402cg(Runnable runnable, View view, int i) {
        if (i != R.id.btn_blockSender) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void m31401dg(Runnable runnable, int i, SparseIntArray sparseIntArray) {
        if (sparseIntArray.get(R.id.right_readMessages) != 0) {
            this.f10529w0.isMember = true;
        }
        runnable.run();
    }

    public boolean m31400eg(View view, int i) {
        if (i == R.id.btn_dismissAdmin && !m34635Se()) {
            TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = this.f10528v0;
            chatMemberStatusAdministrator.canChangeInfo = false;
            chatMemberStatusAdministrator.canManageChat = false;
            chatMemberStatusAdministrator.canPostMessages = false;
            chatMemberStatusAdministrator.canEditMessages = false;
            chatMemberStatusAdministrator.canDeleteMessages = false;
            chatMemberStatusAdministrator.canInviteUsers = false;
            chatMemberStatusAdministrator.canRestrictMembers = false;
            chatMemberStatusAdministrator.canPinMessages = false;
            chatMemberStatusAdministrator.canManageVideoChats = false;
            chatMemberStatusAdministrator.isAnonymous = false;
            chatMemberStatusAdministrator.canPromoteMembers = false;
            m31432Ag();
            m34626ff(true);
            mo31397hf(true);
            m31378rg(true);
        }
        return true;
    }

    public void m31399fg(long j) {
        m31370vg((int) (j / 1000));
    }

    public void m31398gg(long j) {
        m31370vg((int) (j / 1000));
    }

    public boolean m31396hg(View view, int i) {
        switch (i) {
            case R.id.btn_1day:
                m31374tg(86520);
                return true;
            case R.id.btn_1month:
                m31374tg(2592120);
                return true;
            case R.id.btn_1week:
                m31374tg(604920);
                return true;
            case R.id.btn_custom:
                if (this.f10530x0) {
                    m9309Xd(C4403w.m27869i1(R.string.RestrictUser), R.string.RestrictUntilToday, R.string.RestrictUntilTomorrow, R.string.RestrictUntilFuture, new AbstractC5920l() {
                        @Override
                        public final void mo3050a(long j) {
                            View$OnClickListenerC3141u7.this.m31399fg(j);
                        }
                    }, null);
                    return true;
                }
                m9309Xd(C4403w.m27869i1(R.string.BlockUser), R.string.BlockUntilToday, R.string.BlockUntilTomorrow, R.string.BlockUntilFuture, new AbstractC5920l() {
                    @Override
                    public final void mo3050a(long j) {
                        View$OnClickListenerC3141u7.this.m31398gg(j);
                    }
                }, null);
                return true;
            case R.id.btn_forever:
                m31374tg(0);
                return true;
            default:
                return true;
        }
    }

    public Object m31395ig(long j, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 1) {
            return C4403w.m27872h2(this, j);
        }
        return null;
    }

    public void m31394jg(final boolean z, final TdApi.Error error) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3141u7.this.m31386ng(z, error);
            }
        });
    }

    public void m31392kg(C3145d dVar, TdApi.ChatMemberStatus chatMemberStatus) {
        m34626ff(true);
        m9387Md(true);
        C10930q6 q6Var = this.f30167b;
        long j = dVar.f10537a;
        TdApi.MessageSender messageSender = dVar.f10538b;
        int i = dVar.f10542f;
        TdApi.ChatMember chatMember = dVar.f10540d;
        q6Var.m2827Hb(j, messageSender, chatMemberStatus, i, chatMember != null ? chatMember.status : null, new C10930q6.AbstractC10939i() {
            @Override
            public final void mo1765a(boolean z, TdApi.Error error) {
                View$OnClickListenerC3141u7.this.m31394jg(z, error);
            }
        });
    }

    public void m31390lg(boolean z) {
        if (!m9347Sa()) {
            m9387Md(false);
            m34626ff(false);
            if (z) {
                m34629cf();
            }
        }
    }

    public void m31388mg(final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3141u7.this.m31390lg(z);
            }
        });
    }

    public void m31386ng(boolean z, TdApi.Error error) {
        String str;
        if (!m9347Sa()) {
            m9387Md(false);
            m34626ff(false);
            if (z) {
                if (m9221kd() instanceof RunnableC2374f5) {
                    m9287b9(m9157te() - 2);
                }
                m34629cf();
                return;
            }
            if (error == null || !"USER_PRIVACY_RESTRICTED".equals(error.message)) {
                str = C4779t2.m25378z5(error);
            } else {
                str = C4403w.m27869i1(R.string.errorPrivacyAddMember);
            }
            m31368wg(str);
        }
    }

    public static C2964ra m31382pg(boolean z) {
        return new C2964ra(4, R.id.btn_transferOwnership, 0, z ? R.string.TransferOwnershipChannel : R.string.TransferOwnershipGroup).m32843d0(R.id.theme_color_textNegative);
    }

    public final void m31432Ag() {
        boolean Wf;
        int i = 0;
        for (C2964ra raVar : this.f10531y0.m34240F0()) {
            int A = raVar.m32876A();
            if ((A == 67 || A == 92) && (Wf = m31408Wf(raVar.m32835j())) != raVar.m32848b()) {
                raVar.m32872E(Wf);
                this.f10531y0.m34124u3(i);
            }
            i++;
        }
    }

    public final void m31421Lf(List<C2964ra> list) {
        TdApi.ChatMember chatMember;
        C3145d x9 = m9131x9();
        boolean z = false;
        list.add(new C2964ra(8, 0, 0, R.string.CustomTitle));
        list.add(new C2964ra(2));
        C2964ra raVar = new C2964ra(96, (int) R.id.input_customTitle, 0, 0, false);
        TdApi.ChatMember chatMember2 = x9.f10540d;
        C2964ra b0 = raVar.m32847b0(chatMember2 != null ? C7321e.m16998K0(chatMember2.status) : null);
        this.f10532z0 = b0;
        list.add(b0);
        list.add(new C2964ra(3));
        Object[] objArr = new Object[1];
        TdApi.ChatMember chatMember3 = x9.f10540d;
        objArr[0] = C4403w.m27869i1((chatMember3 == null || !C4779t2.m25623P2(chatMember3.status)) ? R.string.message_adminSignPlain : R.string.message_ownerSign);
        list.add(new C2964ra(9, 0, 0, C4403w.m27853m1(R.string.CustomTitleHint, objArr), false));
        C2546iq iqVar = this.f10531y0;
        if (!x9.f10543g && (chatMember = x9.f10540d) != null && C4779t2.m25623P2(chatMember.status) && C4779t2.m25623P2(x9.f10539c)) {
            z = true;
        }
        iqVar.m34250A2(this, z);
    }

    public final void m31420Mf() {
        int i;
        int[] iArr;
        int i2;
        int constructor;
        C4601c3 c3Var;
        C3145d dVar = (C3145d) m9131x9();
        ArrayList arrayList = new ArrayList();
        TdApi.MessageSender messageSender = dVar.f10538b;
        if (messageSender != null) {
            if (messageSender.getConstructor() == -336109341) {
                c3Var = new C4601c3(this.f30167b, C7321e.m16982S0(dVar.f10538b));
            } else {
                c3Var = new C4601c3(this.f30167b, (TdApi.ChatList) null, C7321e.m16986Q0(dVar.f10538b), true);
            }
            TdApi.ChatMember chatMember = dVar.f10540d;
            c3Var.m27063B((chatMember == null || !C4779t2.m25623P2(chatMember.status)) ? null : C4403w.m27869i1(R.string.ChannelOwner));
            arrayList.add(new C2964ra(57).m32870G(c3Var));
            arrayList.add(new C2964ra(3));
        }
        int i3 = dVar.f10538b != null ? 8 : 70;
        if (dVar.f10541e == 3) {
            i = R.string.WhatMembersCanDo;
        } else if (this.f30167b.m2480e2().m1680V1(dVar.f10538b)) {
            i = R.string.WhatThisBotCanDo;
        } else if (dVar.f10541e != 2) {
            i = R.string.WhatThisAdminCanDo;
        } else if (dVar.f10538b.getConstructor() == -239660751) {
            i = this.f30167b.m2784K6(((TdApi.MessageSenderChat) dVar.f10538b).chatId) ? R.string.WhatThisChannelCanDo : R.string.WhatThisGroupCanDo;
        } else {
            i = R.string.WhatThisUserCanDo;
        }
        arrayList.add(new C2964ra(i3, 0, 0, i));
        arrayList.add(new C2964ra(2));
        boolean K6 = this.f30167b.m2784K6(dVar.f10537a);
        int i4 = dVar.f10541e;
        if (i4 == 3) {
            iArr = new int[]{R.id.right_sendMessages, R.id.right_sendMedia, R.id.right_sendStickersAndGifs, R.id.right_sendPolls, R.id.right_embedLinks, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_changeChatInfo};
        } else if (i4 == 2) {
            iArr = dVar.f10538b.getConstructor() == -239660751 ? new int[]{R.id.right_sendMessages, R.id.right_sendMedia, R.id.right_sendStickersAndGifs, R.id.right_sendPolls, R.id.right_embedLinks, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_changeChatInfo} : new int[]{R.id.right_readMessages, R.id.right_sendMessages, R.id.right_sendMedia, R.id.right_sendStickersAndGifs, R.id.right_sendPolls, R.id.right_embedLinks, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_changeChatInfo};
        } else {
            iArr = K6 ? new int[]{R.id.right_changeChatInfo, R.id.right_sendMessages, R.id.right_editMessages, R.id.right_deleteMessages, R.id.right_inviteUsers, R.id.right_manageVideoChats, R.id.right_addNewAdmins} : new int[]{R.id.right_changeChatInfo, R.id.right_deleteMessages, R.id.right_banUsers, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_manageVideoChats, R.id.right_remainAnonymous, R.id.right_addNewAdmins};
        }
        int i5 = dVar.f10541e == 3 ? 92 : 67;
        boolean z = true;
        for (int i6 : iArr) {
            if (z) {
                z = false;
            } else {
                arrayList.add(new C2964ra(11));
            }
            arrayList.add(new C2964ra(i5, i6, 0, m31366xg(i6, K6)).m32872E(m31408Wf(i6)));
        }
        if (dVar.f10541e == 2) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(5, R.id.btn_date, 0, R.string.BlockFor));
        }
        arrayList.add(new C2964ra(3));
        if (dVar.f10541e != 3) {
            if (m31405Zf()) {
                arrayList.add(new C2964ra(9, (int) R.id.description, 0, C4403w.m27853m1(m31411Uf(), this.f30167b.m2151yb(dVar.f10538b)), false));
            } else if (!C4779t2.m25623P2(dVar.f10540d.status) && ((constructor = dVar.f10540d.status.getConstructor()) == -1653518666 || constructor == 82243562 || constructor == 1661432998)) {
                CharSequence J1 = C4779t2.m25666J1(this, dVar.f10540d, true);
                if (!C5070i.m24061i(J1)) {
                    arrayList.add(new C2964ra(9, 0, 0, J1, false));
                }
            }
        }
        if (m31416Qf()) {
            m31421Lf(arrayList);
        }
        boolean Of = m31418Of();
        boolean Nf = m31419Nf();
        if (Of && Nf) {
            arrayList.add(new C2964ra(2));
            arrayList.add(m31382pg(K6));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_dismissAdmin, 0, R.string.DismissAdmin).m32843d0(R.id.theme_color_textNegative));
            arrayList.add(new C2964ra(3));
        } else if (Of) {
            arrayList.add(new C2964ra(2));
            arrayList.add(m31382pg(K6));
            arrayList.add(new C2964ra(3));
        } else if (Nf) {
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(4, R.id.btn_dismissAdmin, 0, R.string.DismissAdmin).m32843d0(R.id.theme_color_textNegative));
            arrayList.add(new C2964ra(3));
        }
        if (m31417Pf()) {
            arrayList.add(new C2964ra(2));
            if (dVar.f10540d.status.getConstructor() != -1653518666) {
                i2 = R.string.RemoveRestrictions;
            } else if (this.f30167b.m2480e2().m1680V1(dVar.f10540d.memberId)) {
                i2 = R.string.UnbanMemberBot;
            } else if (dVar.f10540d.memberId.getConstructor() == -239660751) {
                i2 = this.f30167b.m2784K6(C7321e.m16986Q0(dVar.f10540d.memberId)) ? R.string.UnbanMemberChannel : R.string.UnbanMemberGroup;
            } else {
                i2 = R.string.UnbanMember;
            }
            arrayList.add(new C2964ra(4, R.id.btn_unblockSender, 0, i2).m32843d0(R.id.theme_color_textNegative));
            arrayList.add(new C2964ra(3));
        }
        arrayList.add(new C2964ra(73));
        this.f10531y0.m34116x2(arrayList, false);
    }

    public final boolean m31419Nf() {
        TdApi.ChatMember chatMember;
        C3145d x9 = m9131x9();
        if (m31405Zf() || x9.f10541e != 1 || (chatMember = x9.f10540d) == null || chatMember.status.getConstructor() != 82243562 || !((TdApi.ChatMemberStatusAdministrator) x9.f10540d.status).canBeEdited) {
            return false;
        }
        TdApi.ChatMemberStatus chatMemberStatus = x9.f10539c;
        int constructor = chatMemberStatus.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != 82243562) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).canPromoteMembers;
    }

    public final boolean m31418Of() {
        if (this.f10528v0 == null || this.f30167b.m2480e2().m1680V1(m9131x9().f10538b) || !this.f10528v0.canBeEdited || m9131x9().f10541e != 1 || m9131x9().f10539c.getConstructor() != -160019714) {
            return false;
        }
        if (this.f30167b.m2784K6(m9131x9().f10537a)) {
            TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = this.f10528v0;
            return chatMemberStatusAdministrator.canChangeInfo && chatMemberStatusAdministrator.canPostMessages && chatMemberStatusAdministrator.canEditMessages && chatMemberStatusAdministrator.canDeleteMessages && chatMemberStatusAdministrator.canInviteUsers && chatMemberStatusAdministrator.canManageVideoChats && chatMemberStatusAdministrator.canPromoteMembers;
        }
        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator2 = this.f10528v0;
        return chatMemberStatusAdministrator2.canChangeInfo && chatMemberStatusAdministrator2.canDeleteMessages && chatMemberStatusAdministrator2.canRestrictMembers && chatMemberStatusAdministrator2.canInviteUsers && chatMemberStatusAdministrator2.canPinMessages && chatMemberStatusAdministrator2.canManageVideoChats && chatMemberStatusAdministrator2.canPromoteMembers;
    }

    public final boolean m31417Pf() {
        TdApi.ChatMember chatMember;
        C3145d x9 = m9131x9();
        if (m31405Zf() || x9.f10541e != 2 || (chatMember = x9.f10540d) == null || (chatMember.status.getConstructor() != -1653518666 && x9.f10540d.status.getConstructor() != 1661432998)) {
            return false;
        }
        TdApi.ChatMemberStatus chatMemberStatus = x9.f10539c;
        int constructor = chatMemberStatus.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != 82243562) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).canRestrictMembers;
    }

    public final boolean m31416Qf() {
        C3145d x9 = m9131x9();
        if (this.f30167b.m2784K6(x9.f10537a) || x9.f10541e != 1) {
            return false;
        }
        TdApi.ChatMember chatMember = x9.f10540d;
        int P = chatMember == null ? 1 : C4779t2.m25626P(x9.f10539c, chatMember.status);
        return P == 1 || P == 2 || !C5070i.m24061i(C7321e.m16998K0(x9.f10540d.status)) || C4779t2.m25623P2(x9.f10539c);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_memberRights;
    }

    @Override
    public int mo31415Re() {
        return R.id.theme_color_background;
    }

    public final boolean m31414Rf(int i) {
        return !this.f30167b.m2480e2().m1680V1(m9131x9().f10538b) && C4779t2.m25577X(this.f30167b.m2159y3(m9131x9().f10537a), i);
    }

    public final void m31413Sf() {
        if (!m31405Zf()) {
            mo31397hf(m31406Yf());
        }
    }

    public final void m31412Tf() {
        boolean K6 = this.f30167b.m2784K6(m9131x9().f10537a);
        if (m31418Of()) {
            int N0 = this.f10531y0.m34224N0(R.id.btn_transferOwnership);
            int N02 = this.f10531y0.m34224N0(R.id.btn_dismissAdmin);
            if (N02 != -1 && N0 == -1) {
                this.f10531y0.m34240F0().add(N02, new C2964ra(11));
                this.f10531y0.m34240F0().add(N02, m31382pg(K6));
                this.f10531y0.m39308M(N02, 2);
            } else if (N0 == -1) {
                int D = this.f10531y0.mo6153D() - 1;
                this.f10531y0.m34240F0().addAll(D, Arrays.asList(new C2964ra(2), m31382pg(K6), new C2964ra(3)));
                this.f10531y0.m39308M(D, 3);
            }
        } else {
            int N03 = this.f10531y0.m34224N0(R.id.btn_transferOwnership);
            if (N03 != -1) {
                C2964ra E0 = this.f10531y0.m34243E0(N03 + 2);
                if (E0 == null || E0.m32835j() != R.id.btn_dismissAdmin) {
                    this.f10531y0.m34204V1(N03 - 1, 3);
                } else {
                    this.f10531y0.m34204V1(N03, 2);
                }
            }
        }
    }

    public final int m31411Uf() {
        boolean z;
        C3145d x9 = m9131x9();
        if (x9.f10541e == 2) {
            return this.f30167b.m2784K6(x9.f10537a) ? this.f10530x0 ? R.string.RestrictXChannel : R.string.BanXChannel : this.f10530x0 ? R.string.RestrictXGroup : R.string.BanXGroup;
        }
        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = this.f10528v0;
        if (chatMemberStatusAdministrator != null) {
            z = chatMemberStatusAdministrator.canPromoteMembers;
        } else {
            int N0 = this.f10531y0.m34224N0(R.id.right_addNewAdmins);
            z = N0 != -1 && this.f10531y0.m34240F0().get(N0).m32848b();
        }
        return z ? R.string.XCanAssignAdmins : R.string.XCannotAssignAdmins;
    }

    public final CharSequence m31410Vf(int i, boolean z) {
        C3145d x9 = m9131x9();
        int i2 = x9.f10541e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 || !this.f30167b.m2852G2(x9.f10537a) || z) {
                    return null;
                }
                TdApi.Chat L3 = this.f30167b.m2771L3(x9.f10537a);
                if (i != R.id.right_changeChatInfo) {
                    if (i == R.id.right_pinMessages) {
                        if (!this.f30167b.m2916C2(L3)) {
                            return C4403w.m27982H0(this, R.string.NoRightAllowPin, new Object[0]);
                        }
                        if (this.f30167b.m2883E3(x9.f10537a)) {
                            return C4403w.m27982H0(this, R.string.NoRightAllowPinPublic, new Object[0]);
                        }
                    }
                } else if (!this.f30167b.m2352m2(L3)) {
                    return C4403w.m27982H0(this, R.string.NoRightAllowChangeInfo, new Object[0]);
                } else {
                    if (this.f30167b.m2883E3(x9.f10537a)) {
                        return C4403w.m27982H0(this, R.string.NoRightAllowChangeInfoPublic, new Object[0]);
                    }
                }
            } else if (x9.f10538b.getConstructor() == -239660751) {
                return C4403w.m27869i1(this.f30167b.m2784K6(C7321e.m16986Q0(x9.f10538b)) ? R.string.BanChannelHint : R.string.BanChatHint);
            } else if (i != R.id.btn_date && !C4779t2.m25577X(this.f30167b.m2159y3(x9.f10537a), i)) {
                return C4403w.m27869i1(R.string.ChatPermissionsRestrictHint);
            }
        } else if (!this.f30167b.m2480e2().m1680V1(x9.f10538b) && ((i == R.id.right_inviteUsers || i == R.id.right_changeChatInfo || i == R.id.right_pinMessages) && C4779t2.m25577X(this.f30167b.m2159y3(x9.f10537a), i) && z)) {
            TdApi.ChatMember chatMember = x9.f10540d;
            int P = chatMember == null ? 1 : C4779t2.m25626P(x9.f10539c, chatMember.status);
            if (P != 1 && P != 2) {
                return null;
            }
            if (i == R.id.right_changeChatInfo) {
                return C4403w.m27982H0(this, R.string.NoRightDisallowChangeInfo, new Object[0]);
            }
            if (i == R.id.right_inviteUsers) {
                return C4403w.m27982H0(this, R.string.NoRightDisallowInvite, new Object[0]);
            }
            if (i == R.id.right_pinMessages) {
                return C4403w.m27982H0(this, R.string.NoRightDisallowPin, new Object[0]);
            }
        }
        return null;
    }

    @Override
    public void mo1566W2(final TdApi.BasicGroup basicGroup, boolean z) {
        if (z) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3141u7.this.m31404ag(basicGroup);
                }
            });
        }
    }

    @Override
    public boolean mo31409We() {
        return false;
    }

    public final boolean m31408Wf(int i) {
        if (m9131x9().f10541e == 2) {
            if (m9131x9().f10538b.getConstructor() == -239660751 && i == R.id.right_readMessages) {
                return true;
            }
            if (!C4779t2.m25577X(this.f30167b.m2159y3(m9131x9().f10537a), i)) {
                return false;
            }
        }
        switch (i) {
            case R.id.right_addNewAdmins:
                return this.f10528v0.canPromoteMembers;
            case R.id.right_banUsers:
                return this.f10528v0.canRestrictMembers;
            case R.id.right_changeChatInfo:
                if (m9131x9().f10541e == 1) {
                    if (!this.f10528v0.canChangeInfo && !m31414Rf(i)) {
                        return false;
                    }
                } else if (!this.f10530x0 || !this.f10529w0.permissions.canChangeInfo) {
                    return false;
                }
                return true;
            case R.id.right_deleteMessages:
                return this.f10528v0.canDeleteMessages;
            case R.id.right_editMessages:
                return this.f10528v0.canEditMessages;
            case R.id.right_embedLinks:
                if (!this.f10530x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions = this.f10529w0.permissions;
                return chatPermissions.canSendMessages && chatPermissions.canAddWebPagePreviews;
            case R.id.right_icon:
            default:
                throw new IllegalArgumentException("id == " + C1379j0.m37372B().getResourceName(i));
            case R.id.right_inviteUsers:
                if (m9131x9().f10541e == 1) {
                    if (!this.f10528v0.canInviteUsers && !m31414Rf(i)) {
                        return false;
                    }
                } else if (!this.f10530x0 || !this.f10529w0.permissions.canInviteUsers) {
                    return false;
                }
                return true;
            case R.id.right_manageVideoChats:
                return this.f10528v0.canManageVideoChats;
            case R.id.right_pinMessages:
                if (m9131x9().f10541e == 1) {
                    if (!this.f10528v0.canPinMessages && !m31414Rf(i)) {
                        return false;
                    }
                } else if (!this.f10530x0 || !this.f10529w0.permissions.canPinMessages) {
                    return false;
                }
                return true;
            case R.id.right_readMessages:
                return this.f10530x0;
            case R.id.right_remainAnonymous:
                return this.f10528v0.isAnonymous;
            case R.id.right_sendMedia:
                if (!this.f10530x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions2 = this.f10529w0.permissions;
                return chatPermissions2.canSendMessages && chatPermissions2.canSendMediaMessages;
            case R.id.right_sendMessages:
                return m9131x9().f10541e == 1 ? this.f10528v0.canPostMessages : this.f10530x0 && this.f10529w0.permissions.canSendMessages;
            case R.id.right_sendPolls:
                if (!this.f10530x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions3 = this.f10529w0.permissions;
                return chatPermissions3.canSendMessages && chatPermissions3.canSendPolls;
            case R.id.right_sendStickersAndGifs:
                if (!this.f10530x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions4 = this.f10529w0.permissions;
                return chatPermissions4.canSendMessages && chatPermissions4.canSendOtherMessages;
        }
    }

    @Override
    public CharSequence mo9313X9() {
        C3145d x9 = m9131x9();
        int i = x9.f10541e;
        if (i == 1) {
            TdApi.ChatMember chatMember = x9.f10540d;
            int P = chatMember == null ? 1 : C4779t2.m25626P(x9.f10539c, chatMember.status);
            if (P == 1) {
                return C4403w.m27869i1(R.string.SetAsAdmin);
            }
            if (P != 2) {
                return C4403w.m27869i1(R.string.AdminRights);
            }
            return C4403w.m27869i1(R.string.EditAdmin);
        } else if (i != 2) {
            if (i == 3) {
                return C4403w.m27869i1(R.string.ChatPermissions);
            }
            throw new AssertionError();
        } else if (m9131x9().f10538b.getConstructor() != -239660751) {
            return C4403w.m27869i1(R.string.UserRestrictions);
        } else {
            return C4403w.m27869i1(this.f30167b.m2784K6(C7321e.m16986Q0(m9131x9().f10538b)) ? R.string.ChannelRestrictions : R.string.GroupRestrictions);
        }
    }

    public final boolean m31407Xf(int i) {
        C3145d x9 = m9131x9();
        if (i == R.id.btn_date && x9.f10538b.getConstructor() == -239660751) {
            return false;
        }
        int i2 = x9.f10541e;
        if (i2 == 3) {
            if (this.f30167b.m2852G2(x9.f10537a)) {
                TdApi.Chat L3 = this.f30167b.m2771L3(x9.f10537a);
                if (i != R.id.right_changeChatInfo) {
                    if (i == R.id.right_pinMessages) {
                        C10930q6 q6Var = this.f30167b;
                        if (!q6Var.m2916C2(q6Var.m2771L3(x9.f10537a)) || this.f30167b.m2883E3(x9.f10537a)) {
                            return false;
                        }
                    }
                } else if (!this.f30167b.m2352m2(L3) || this.f30167b.m2883E3(x9.f10537a)) {
                }
                return true;
            }
            return false;
        } else if (i2 == 2 && C4779t2.m25664J3(i) && (x9.f10538b.getConstructor() == -239660751 || !C4779t2.m25577X(this.f30167b.m2159y3(x9.f10537a), i))) {
            return false;
        } else {
            if (x9.f10541e == 1 && !this.f30167b.m2480e2().m1680V1(x9.f10538b) && ((i == R.id.right_inviteUsers || i == R.id.right_changeChatInfo || i == R.id.right_pinMessages) && C4779t2.m25577X(this.f30167b.m2159y3(x9.f10537a), i))) {
                return false;
            }
            if (!m31405Zf()) {
                switch (x9.f10540d.status.getConstructor()) {
                    case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                    case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                        int constructor = x9.f10539c.getConstructor();
                        if (constructor == -160019714) {
                            return true;
                        }
                        if (constructor == 82243562) {
                            return ((TdApi.ChatMemberStatusAdministrator) x9.f10539c).canRestrictMembers;
                        }
                        break;
                    case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                        return i == R.id.right_remainAnonymous && x9.f10539c.getConstructor() == -160019714;
                    case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                        if (!((TdApi.ChatMemberStatusAdministrator) x9.f10540d.status).canBeEdited) {
                            return false;
                        }
                        break;
                    default:
                        return true;
                }
            }
            int constructor2 = x9.f10539c.getConstructor();
            if (constructor2 == -160019714) {
                return true;
            }
            if (constructor2 == 82243562) {
                TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) x9.f10539c;
                if (x9.f10541e == 2) {
                    return chatMemberStatusAdministrator.canRestrictMembers;
                }
                switch (i) {
                    case R.id.right_addNewAdmins:
                        return chatMemberStatusAdministrator.canPromoteMembers;
                    case R.id.right_banUsers:
                        return chatMemberStatusAdministrator.canRestrictMembers;
                    case R.id.right_changeChatInfo:
                        return chatMemberStatusAdministrator.canChangeInfo;
                    case R.id.right_deleteMessages:
                        return chatMemberStatusAdministrator.canDeleteMessages;
                    case R.id.right_editMessages:
                        return chatMemberStatusAdministrator.canEditMessages;
                    case R.id.right_embedLinks:
                    case R.id.right_readMessages:
                    case R.id.right_sendMedia:
                    case R.id.right_sendPolls:
                    case R.id.right_sendStickersAndGifs:
                        return true;
                    case R.id.right_inviteUsers:
                        return chatMemberStatusAdministrator.canInviteUsers;
                    case R.id.right_manageVideoChats:
                        return chatMemberStatusAdministrator.canManageVideoChats;
                    case R.id.right_pinMessages:
                        return chatMemberStatusAdministrator.canPinMessages;
                    case R.id.right_remainAnonymous:
                        return chatMemberStatusAdministrator.isAnonymous;
                    case R.id.right_sendMessages:
                        return chatMemberStatusAdministrator.canPostMessages;
                }
            }
            return false;
        }
    }

    public final boolean m31406Yf() {
        C3145d x9 = m9131x9();
        if (m31405Zf()) {
            return false;
        }
        int i = x9.f10541e;
        if (i == 3) {
            return !C7321e.m17011E(this.f30167b.m2159y3(x9.f10537a), this.f10529w0.permissions);
        }
        if (i == 2) {
            boolean z = x9.f10540d.status.getConstructor() == 1661432998;
            if (this.f10530x0 != z) {
                return true;
            }
            if (!z) {
                return ((TdApi.ChatMemberStatusBanned) x9.f10540d.status).bannedUntilDate != this.f10529w0.restrictedUntilDate;
            }
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) x9.f10540d.status;
            int i2 = chatMemberStatusRestricted.restrictedUntilDate;
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted2 = this.f10529w0;
            return i2 != chatMemberStatusRestricted2.restrictedUntilDate || !C7321e.m17009F(chatMemberStatusRestricted2.permissions, chatMemberStatusRestricted.permissions, this.f30167b.m2159y3(x9.f10537a));
        } else if (this.f10532z0 != null && !C5070i.m24067c(C7321e.m16998K0(x9.f10540d.status), this.f10532z0.m32821x())) {
            return true;
        } else {
            if (x9.f10540d.status.getConstructor() == 82243562) {
                return !C7321e.m17013D((TdApi.ChatMemberStatusAdministrator) x9.f10540d.status, this.f10528v0);
            }
            return x9.f10540d.status.getConstructor() == -160019714 && ((TdApi.ChatMemberStatusCreator) x9.f10540d.status).isAnonymous != this.f10528v0.isAnonymous;
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (C7316a.m17054g(m9131x9().f10537a)) {
            this.f30167b.m2480e2().m1611o2(C7316a.m17048m(m9131x9().f10537a), this);
        }
    }

    @Override
    public void mo30697Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        this.f10531y0 = new C3142a(this);
        m31420Mf();
        recyclerView.setAdapter(this.f10531y0);
        recyclerView.m39434g(new C3143b());
        if (m31405Zf()) {
            mo31397hf(true);
        }
        m34628df(R.drawable.baseline_check_24);
        if (C7316a.m17054g(m9131x9().f10537a)) {
            this.f30167b.m2480e2().m1662b2(C7316a.m17048m(m9131x9().f10537a), this);
        }
    }

    public final boolean m31405Zf() {
        C3145d x9 = m9131x9();
        int i = x9.f10541e;
        if (i == 3) {
            return false;
        }
        TdApi.ChatMember chatMember = x9.f10540d;
        if (chatMember == null) {
            return true;
        }
        if (i == 2) {
            int constructor = chatMember.status.getConstructor();
            if (constructor == -1653518666 || constructor == 1661432998) {
                return false;
            }
        } else {
            int constructor2 = chatMember.status.getConstructor();
            if (constructor2 == -160019714 || constructor2 == 82243562) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean mo30696af() {
        if (m9131x9().f10541e == 1) {
            this.f10528v0.canManageChat = true;
        }
        m31378rg(false);
        return true;
    }

    @Override
    public void mo31397hf(boolean z) {
        if (z != m34634Te()) {
            super.mo31397hf(z);
            this.f8298o0.m39504A0();
            C2546iq iqVar = this.f10531y0;
            iqVar.m39312I(iqVar.mo6153D() - 1);
        }
    }

    @Override
    public void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        C11090w7.m1524a(this, j, basicGroupFullInfo);
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!m31406Yf()) {
            return false;
        }
        m9179qe(null);
        return true;
    }

    public final TdApi.ChatMemberStatusAdministrator m31384og() {
        C3145d x9 = m9131x9();
        if (x9.f10539c.getConstructor() != 82243562) {
            return new TdApi.ChatMemberStatusAdministrator(null, true, true, true, true, true, true, true, true, true, false, true, false);
        }
        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) x9.f10539c;
        return new TdApi.ChatMemberStatusAdministrator(null, true, chatMemberStatusAdministrator.canManageChat, chatMemberStatusAdministrator.canChangeInfo, chatMemberStatusAdministrator.canPostMessages, chatMemberStatusAdministrator.canEditMessages, chatMemberStatusAdministrator.canDeleteMessages, chatMemberStatusAdministrator.canInviteUsers, chatMemberStatusAdministrator.canRestrictMembers, chatMemberStatusAdministrator.canPinMessages, false, chatMemberStatusAdministrator.canManageVideoChats, chatMemberStatusAdministrator.isAnonymous);
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (!m34635Se()) {
            int A = raVar.m32876A();
            if (A == 57) {
                C4601c3 c3Var = (C4601c3) raVar.m32844d();
                long p = c3Var.m27036p();
                HandlerC10770jj.C10788q s = new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view).m8958i(this));
                if (p != 0) {
                    this.f30167b.m2485dd().m3429v7(this, p, s);
                } else {
                    this.f30167b.m2485dd().m3569h7(this, c3Var.m27047e(), new HandlerC10770jj.C10780j().m3368h().m3357s(s));
                }
            } else if (A == 67 || A == 92) {
                int j = raVar.m32835j();
                if (m31407Xf(j)) {
                    m31364yg(j);
                    return;
                }
                CharSequence Vf = m31410Vf(j, raVar.m32848b());
                if (Vf != null) {
                    mo4347s().m14584H3().m8985g(((C9137c) view).getToggler()).m8969F(this, this.f30167b, R.drawable.baseline_info_24, Vf);
                }
            } else {
                switch (raVar.m32835j()) {
                    case R.id.btn_date:
                        if (m9131x9().f10541e == 2 && m9131x9().f10538b.getConstructor() == -239660751) {
                            C9357x2.C9365h g = this.f30165a.m14584H3().m8985g(view);
                            C10930q6 q6Var = this.f30167b;
                            g.m8972C(q6Var, q6Var.m2784K6(C7321e.m16986Q0(m9131x9().f10538b)) ? R.string.BanChannelHint : R.string.BanChatHint).m8919F();
                            return;
                        }
                        m9261ee(null, new int[]{R.id.btn_1day, R.id.btn_1week, R.id.btn_1month, R.id.btn_forever, R.id.btn_custom}, new String[]{C4403w.m27844o2(R.string.xDays, 1L), C4403w.m27844o2(R.string.xWeeks, 1L), C4403w.m27844o2(R.string.xMonths, 1L), C4403w.m27869i1(R.string.UserRestrictionsUntilForever), C4403w.m27869i1(R.string.CustomDate)}, null, null, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i) {
                                boolean hg;
                                hg = View$OnClickListenerC3141u7.this.m31396hg(view2, i);
                                return hg;
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
                        return;
                    case R.id.btn_dismissAdmin:
                        m9261ee(null, new int[]{R.id.btn_dismissAdmin, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.DismissAdmin), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i) {
                                boolean eg;
                                eg = View$OnClickListenerC3141u7.this.m31400eg(view2, i);
                                return eg;
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
                        return;
                    case R.id.btn_transferOwnership:
                        if (C7316a.m17054g(m9131x9().f10537a)) {
                            m9322Vd(C4403w.m27982H0(this, R.string.UpgradeChatPrompt, new Object[0]), C4403w.m27869i1(R.string.Proceed), new Runnable() {
                                @Override
                                public final void run() {
                                    View$OnClickListenerC3141u7.this.m31380qg();
                                }
                            });
                            return;
                        } else {
                            m31380qg();
                            return;
                        }
                    case R.id.btn_unblockSender:
                        final Runnable o7Var = new Runnable() {
                            @Override
                            public final void run() {
                                View$OnClickListenerC3141u7.this.m31403bg();
                            }
                        };
                        C3145d x9 = m9131x9();
                        this.f10529w0.isMember = C4779t2.m25506h3(x9.f10540d.status);
                        if (this.f10529w0.isMember || x9.f10538b.getConstructor() == -239660751) {
                            m9261ee(C4403w.m27853m1(R.string.QUnblockX, this.f30167b.m2151yb(x9.f10538b)), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.RemoveRestrictions), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                                @Override
                                public final boolean mo493A3(View view2, int i) {
                                    boolean cg;
                                    cg = View$OnClickListenerC3141u7.m31402cg(o7Var, view2, i);
                                    return cg;
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
                            return;
                        }
                        C9188f2 j2 = new C9188f2(R.id.btn_unblockSender).m10004i(new C2964ra(28, 0, 0, C4403w.m27853m1(R.string.QUnblockX, this.f30167b.m2151yb(x9.f10538b)), false)).m10003j(new AbstractC9323v4.AbstractC9343r() {
                            @Override
                            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                                View$OnClickListenerC3141u7.this.m31401dg(o7Var, i, sparseIntArray);
                            }
                        });
                        C2964ra[] raVarArr = new C2964ra[1];
                        raVarArr[0] = new C2964ra(12, (int) R.id.right_readMessages, 0, this.f30167b.m2784K6(x9.f10537a) ? R.string.InviteBackToChannel : R.string.InviteBackToGroup, false);
                        m9206me(j2.m9997p(raVarArr).m9995r(R.string.Unban).m9996q(R.id.theme_color_textNegative));
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void m31380qg() {
        if (!m34635Se()) {
            long j = m9131x9().f10537a;
            TdApi.MessageSender messageSender = m9131x9().f10538b;
            final long S0 = C7321e.m16982S0(messageSender);
            if (S0 != 0) {
                boolean K6 = this.f30167b.m2784K6(j);
                C4403w.AbstractC4409f f7Var = new C4403w.AbstractC4409f() {
                    @Override
                    public final Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
                        Object ig;
                        ig = View$OnClickListenerC3141u7.this.m31395ig(S0, charSequence, i, i2, i3, z);
                        return ig;
                    }
                };
                CharSequence G0 = K6 ? C4403w.m27986G0(this, R.string.TransferOwnershipAlertChannel, f7Var, this.f30167b.m2691Q3(j), this.f30167b.m2151yb(messageSender)) : C4403w.m27986G0(this, R.string.TransferOwnershipAlertGroup, f7Var, this.f30167b.m2691Q3(j), this.f30167b.m2151yb(messageSender));
                m34626ff(true);
                this.f30167b.m2485dd().m3678W7(this, G0, new C3144c(S0));
            }
        }
    }

    public final void m31378rg(boolean z) {
        final TdApi.ChatMemberStatus chatMemberStatus;
        if (!m34635Se() || z) {
            final C3145d x9 = m9131x9();
            int i = x9.f10541e;
            if (i != 3) {
                if (i != 2) {
                    TdApi.ChatMember chatMember = x9.f10540d;
                    if (chatMember == null || chatMember.status.getConstructor() != -160019714) {
                        chatMemberStatus = this.f10528v0;
                    } else {
                        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = this.f10528v0;
                        chatMemberStatus = new TdApi.ChatMemberStatusCreator(chatMemberStatusAdministrator.customTitle, chatMemberStatusAdministrator.isAnonymous, ((TdApi.ChatMemberStatusCreator) x9.f10540d.status).isMember);
                    }
                } else if (!this.f10530x0) {
                    chatMemberStatus = new TdApi.ChatMemberStatusBanned(this.f10529w0.restrictedUntilDate);
                } else if (!C4779t2.m25721B2(this.f10529w0.permissions, this.f30167b.m2159y3(x9.f10537a))) {
                    TdApi.ChatMember chatMember2 = x9.f10540d;
                    if (chatMember2 == null || !C4779t2.m25387y3(chatMember2.status)) {
                        C1379j0.m37292y0(R.string.NoRestrictionsHint, 0);
                        return;
                    }
                    chatMemberStatus = this.f10529w0.isMember ? new TdApi.ChatMemberStatusMember() : new TdApi.ChatMemberStatusLeft();
                } else {
                    chatMemberStatus = this.f10529w0;
                }
                String K0 = C7321e.m16998K0(chatMemberStatus);
                if (C5070i.m24061i(K0) || K0.length() <= 16) {
                    Runnable q7Var = new Runnable() {
                        @Override
                        public final void run() {
                            View$OnClickListenerC3141u7.this.m31392kg(x9, chatMemberStatus);
                        }
                    };
                    if (!C7316a.m17054g(x9.f10537a) || !C4779t2.m25379z4(chatMemberStatus)) {
                        q7Var.run();
                    } else {
                        m9322Vd(C4403w.m27982H0(this, R.string.UpgradeChatPrompt, new Object[0]), C4403w.m27869i1(R.string.Proceed), q7Var);
                    }
                } else {
                    C1379j0.m37292y0(R.string.CustomTitleTooBig, 0);
                }
            } else if (C7321e.m17011E(this.f10529w0.permissions, this.f30167b.m2159y3(x9.f10537a))) {
                m9298Zb();
            } else {
                m34626ff(true);
                m9387Md(true);
                this.f30167b.m2747Mb(x9.f10537a, this.f10529w0.permissions, new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z2) {
                        View$OnClickListenerC3141u7.this.m31388mg(z2);
                    }
                });
            }
        }
    }

    public void m31376sg(C3145d dVar) {
        super.m9476Ad(dVar);
        this.f10530x0 = this.f30167b.m2784K6(dVar.f10537a);
        int i = dVar.f10541e;
        if (i == 1) {
            TdApi.ChatMember chatMember = dVar.f10540d;
            if (chatMember == null) {
                this.f10528v0 = m31384og();
            } else if (chatMember.status.getConstructor() == -160019714) {
                TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) dVar.f10540d.status;
                this.f10528v0 = new TdApi.ChatMemberStatusAdministrator(chatMemberStatusCreator.customTitle, false, true, true, true, true, true, true, true, true, true, true, chatMemberStatusCreator.isAnonymous);
            } else if (dVar.f10540d.status.getConstructor() == 82243562) {
                TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) dVar.f10540d.status;
                this.f10528v0 = new TdApi.ChatMemberStatusAdministrator(chatMemberStatusAdministrator.customTitle, chatMemberStatusAdministrator.canBeEdited, chatMemberStatusAdministrator.canManageChat, chatMemberStatusAdministrator.canChangeInfo, chatMemberStatusAdministrator.canPostMessages, chatMemberStatusAdministrator.canEditMessages, chatMemberStatusAdministrator.canDeleteMessages, chatMemberStatusAdministrator.canInviteUsers, chatMemberStatusAdministrator.canRestrictMembers, chatMemberStatusAdministrator.canPinMessages, chatMemberStatusAdministrator.canPromoteMembers, chatMemberStatusAdministrator.canManageVideoChats, chatMemberStatusAdministrator.isAnonymous);
            } else {
                this.f10528v0 = m31384og();
            }
        } else if (i == 2) {
            TdApi.ChatMember chatMember2 = dVar.f10540d;
            if (chatMember2 == null || chatMember2.status.getConstructor() != 1661432998) {
                this.f10530x0 = false;
                this.f10529w0 = new TdApi.ChatMemberStatusRestricted(false, 0, new TdApi.ChatPermissions());
                TdApi.ChatMember chatMember3 = dVar.f10540d;
                if (chatMember3 != null && chatMember3.status.getConstructor() == -1653518666) {
                    this.f10529w0.restrictedUntilDate = ((TdApi.ChatMemberStatusBanned) dVar.f10540d.status).bannedUntilDate;
                    return;
                }
                return;
            }
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) dVar.f10540d.status;
            this.f10530x0 = true;
            this.f10529w0 = new TdApi.ChatMemberStatusRestricted(true, chatMemberStatusRestricted.restrictedUntilDate, C7321e.m16934l(chatMemberStatusRestricted.permissions));
        } else if (i == 3) {
            this.f10530x0 = true;
            this.f10529w0 = new TdApi.ChatMemberStatusRestricted(true, 0, C7321e.m16934l(this.f30167b.m2159y3(dVar.f10537a)));
        }
    }

    public final void m31374tg(int i) {
        m31370vg(i != 0 ? (int) ((this.f30167b.m2898D4() / 1000) + i) : 0);
    }

    public final void m31372ug(boolean z) {
        if (this.f10530x0 != z) {
            this.f10530x0 = z;
            m31362zg();
            this.f10531y0.m34130s3(R.id.btn_date);
        }
    }

    public final void m31370vg(int i) {
        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = this.f10529w0;
        if (chatMemberStatusRestricted.restrictedUntilDate != i) {
            chatMemberStatusRestricted.restrictedUntilDate = i;
            this.f10531y0.m34130s3(R.id.btn_date);
            m31413Sf();
        }
    }

    public final void m31368wg(CharSequence charSequence) {
        this.f30165a.m14584H3().m8985g(m34636Qe()).m8969F(this, this.f30167b, R.drawable.baseline_error_24, charSequence);
    }

    public final int m31366xg(int i, boolean z) {
        switch (i) {
            case R.id.right_addNewAdmins:
                return R.string.RightAddNewAdmins;
            case R.id.right_banUsers:
                return R.string.RightBanUsers;
            case R.id.right_changeChatInfo:
                return z ? R.string.RightChangeChannelInfo : R.string.RightChangeGroupInfo;
            case R.id.right_deleteMessages:
                return R.string.EditAdminGroupDeleteMessages;
            case R.id.right_editMessages:
                return R.string.RightEditMessages;
            case R.id.right_embedLinks:
                return R.string.UserRestrictionsEmbedLinks;
            case R.id.right_icon:
            default:
                throw new IllegalArgumentException("id == " + C1379j0.m37372B().getResourceName(i));
            case R.id.right_inviteUsers:
                return R.string.RightInviteViaLink;
            case R.id.right_manageVideoChats:
                return z ? R.string.RightLiveStreams : R.string.RightVoiceChats;
            case R.id.right_pinMessages:
                return R.string.RightPinMessages;
            case R.id.right_readMessages:
                return R.string.UserRestrictionsRead;
            case R.id.right_remainAnonymous:
                return R.string.RightAnonymous;
            case R.id.right_sendMedia:
                return R.string.RightSendMedia;
            case R.id.right_sendMessages:
                return m9131x9().f10541e == 1 ? R.string.EditAdminPostMessages : R.string.UserRestrictionsSend;
            case R.id.right_sendPolls:
                return R.string.UserRestrictionsSendPolls;
            case R.id.right_sendStickersAndGifs:
                return R.string.UserRestrictionsSendStickers;
        }
    }

    public final void m31364yg(int i) {
        boolean z = true;
        boolean z2 = !m31408Wf(i);
        switch (i) {
            case R.id.right_addNewAdmins:
                this.f10528v0.canPromoteMembers = z2;
                m31362zg();
                break;
            case R.id.right_banUsers:
                this.f10528v0.canRestrictMembers = z2;
                break;
            case R.id.right_changeChatInfo:
                if (m9131x9().f10541e != 1) {
                    if (!this.f10530x0 && !z2) {
                        z = false;
                    }
                    m31372ug(z);
                    this.f10529w0.permissions.canChangeInfo = z2;
                    break;
                } else {
                    this.f10528v0.canChangeInfo = z2;
                    break;
                }
            case R.id.right_deleteMessages:
                this.f10528v0.canDeleteMessages = z2;
                break;
            case R.id.right_editMessages:
                this.f10528v0.canEditMessages = z2;
                break;
            case R.id.right_embedLinks:
                m31372ug(this.f10530x0 || z2);
                TdApi.ChatPermissions chatPermissions = this.f10529w0.permissions;
                if (!chatPermissions.canSendMessages && !z2) {
                    z = false;
                }
                chatPermissions.canSendMessages = z;
                chatPermissions.canAddWebPagePreviews = z2;
                break;
            case R.id.right_inviteUsers:
                if (m9131x9().f10541e != 1) {
                    if (!this.f10530x0 && !z2) {
                        z = false;
                    }
                    m31372ug(z);
                    this.f10529w0.permissions.canInviteUsers = z2;
                    break;
                } else {
                    this.f10528v0.canInviteUsers = z2;
                    break;
                }
            case R.id.right_manageVideoChats:
                this.f10528v0.canManageVideoChats = z2;
                break;
            case R.id.right_pinMessages:
                if (m9131x9().f10541e != 1) {
                    if (!this.f10530x0 && !z2) {
                        z = false;
                    }
                    m31372ug(z);
                    this.f10529w0.permissions.canPinMessages = z2;
                    break;
                } else {
                    this.f10528v0.canPinMessages = z2;
                    break;
                }
            case R.id.right_readMessages:
                m31372ug(z2);
                break;
            case R.id.right_remainAnonymous:
                this.f10528v0.isAnonymous = z2;
                break;
            case R.id.right_sendMedia:
                m31372ug(this.f10530x0 || z2);
                TdApi.ChatPermissions chatPermissions2 = this.f10529w0.permissions;
                if (!chatPermissions2.canSendMessages && !z2) {
                    z = false;
                }
                chatPermissions2.canSendMessages = z;
                chatPermissions2.canSendMediaMessages = z2;
                break;
            case R.id.right_sendMessages:
                if (m9131x9().f10541e != 1) {
                    if (!this.f10530x0 && !z2) {
                        z = false;
                    }
                    m31372ug(z);
                    this.f10529w0.permissions.canSendMessages = z2;
                    break;
                } else {
                    this.f10528v0.canPostMessages = z2;
                    break;
                }
            case R.id.right_sendPolls:
                m31372ug(this.f10530x0 || z2);
                TdApi.ChatPermissions chatPermissions3 = this.f10529w0.permissions;
                if (!chatPermissions3.canSendMessages && !z2) {
                    z = false;
                }
                chatPermissions3.canSendMessages = z;
                chatPermissions3.canSendPolls = z2;
                break;
            case R.id.right_sendStickersAndGifs:
                m31372ug(this.f10530x0 || z2);
                TdApi.ChatPermissions chatPermissions4 = this.f10529w0.permissions;
                if (!chatPermissions4.canSendMessages && !z2) {
                    z = false;
                }
                chatPermissions4.canSendMessages = z;
                chatPermissions4.canSendOtherMessages = z2;
                break;
        }
        if (m9131x9().f10541e == 3 || m9131x9().f10541e == 2) {
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = this.f10529w0;
            chatMemberStatusRestricted.isMember = this.f10530x0;
            chatMemberStatusRestricted.permissions.canSendMessages = m31408Wf(R.id.right_sendMessages);
            this.f10529w0.permissions.canSendMediaMessages = m31408Wf(R.id.right_sendMedia);
            this.f10529w0.permissions.canSendOtherMessages = m31408Wf(R.id.right_sendStickersAndGifs);
            this.f10529w0.permissions.canSendPolls = m31408Wf(R.id.right_sendPolls);
            this.f10529w0.permissions.canAddWebPagePreviews = m31408Wf(R.id.right_embedLinks);
        }
        m31432Ag();
        m31413Sf();
        m31412Tf();
    }

    public final void m31362zg() {
        int N0 = this.f10531y0.m34224N0(R.id.description);
        if (N0 != -1) {
            this.f10531y0.m34240F0().get(N0).m32853X(C4403w.m27853m1(m31411Uf(), this.f30167b.m2151yb(m9131x9().f10538b)));
            this.f10531y0.m39312I(N0);
        }
    }

    public static class C3145d {
        public long f10537a;
        public final TdApi.MessageSender f10538b;
        public final TdApi.ChatMemberStatus f10539c;
        public final TdApi.ChatMember f10540d;
        public final int f10541e;
        public int f10542f;
        public boolean f10543g;

        public C3145d(long j, TdApi.MessageSender messageSender, boolean z, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember) {
            this.f10537a = j;
            this.f10538b = messageSender;
            this.f10541e = z ? 2 : 1;
            this.f10539c = chatMemberStatus;
            this.f10540d = chatMember;
        }

        public C3145d m31351a(int i) {
            this.f10542f = i;
            return this;
        }

        public C3145d m31350b() {
            this.f10543g = true;
            return this;
        }

        public C3145d(long j) {
            this.f10537a = j;
            this.f10538b = null;
            this.f10541e = 3;
            this.f10539c = null;
            this.f10540d = null;
        }
    }
}
