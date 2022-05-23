package de;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import de.u7;
import gd.w;
import hd.c3;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kb.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.o;
import ne.y1;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.f2;
import ud.v4;
import ud.x2;
import yd.g;
import zd.hj;
import zd.o6;
import zd.t7;

public class u7 extends g6<d> implements View.OnClickListener, t7.b {
    public TdApi.ChatMemberStatusAdministrator f9708v0;
    public TdApi.ChatMemberStatusRestricted f9709w0;
    public boolean f9710x0;
    public iq f9711y0;
    public ra f9712z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(de.ra r8, uc.c r9, boolean r10) {
            throw new UnsupportedOperationException("Method not decompiled: de.u7.a.R2(de.ra, uc.c, boolean):void");
        }

        @Override
        public void Y1(ra raVar, int i10, o oVar) {
            oVar.setChat((c3) raVar.d());
        }

        @Override
        public void p4(y1 y1Var, CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            if (u7.this.f9712z0.c0(charSequence2)) {
                if (u7.this.f9708v0 != null) {
                    u7.this.f9708v0.customTitle = charSequence2;
                }
                u7.this.Sf();
            }
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            d x92 = u7.this.x9();
            boolean z10 = true;
            y1Var.getEditText().setInputType(1);
            TdApi.ChatMember chatMember = x92.f9720d;
            y1Var.setEmptyHint((chatMember == null || !t2.P2(chatMember.status)) ? R.string.message_adminSignPlain : R.string.message_ownerSign);
            y1Var.setText(raVar.x());
            if (!t2.P2(x92.f9719c) && !u7.this.Zf() && !u7.this.Nf()) {
                z10 = false;
            }
            y1Var.setInputEnabled(z10);
            y1Var.setMaxLength(16);
            if (viewGroup.getBackground() == null) {
                g.i(viewGroup, R.id.theme_color_filling, u7.this);
            }
        }
    }

    public class b extends RecyclerView.o {
        public b() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.bottom = ((ra) view.getTag()).A() == 73 ? a0.i(56.0f) + (a0.i(16.0f) * 2) : 0;
        }
    }

    public class c implements hj.n {
        public final long f9715a;

        public c(long j10) {
            this.f9715a = j10;
        }

        public void h(boolean r4, org.drinkless.td.libcore.telegram.TdApi.Error r5) {
            throw new UnsupportedOperationException("Method not decompiled: de.u7.c.h(boolean, org.drinkless.td.libcore.telegram.TdApi$Error):void");
        }

        public void i(final boolean z10, final TdApi.Error error) {
            u7.this.wd(new Runnable() {
                @Override
                public final void run() {
                    u7.c.this.h(z10, error);
                }
            });
        }

        public void j(long j10, String str) {
            u7.this.f24495b.gd(u7.this.x9().f9717a, j10, str, new o6.i() {
                @Override
                public final void a(boolean z10, TdApi.Error error) {
                    u7.c.this.i(z10, error);
                }
            });
        }

        public void k(TdApi.Error error) {
            u7.this.ff(false);
            if (error != null) {
                u7.this.wg(t2.z5(error));
            }
        }

        public void l(Runnable runnable, long j10, long j11, final TdApi.Error error) {
            if (j11 != 0) {
                u7.this.x9().f9717a = j11;
                runnable.run();
                return;
            }
            u7.this.wd(new Runnable() {
                @Override
                public final void run() {
                    u7.c.this.k(error);
                }
            });
        }

        @Override
        public void a(TdApi.Object object) {
            u7.this.ff(false);
            if (object.getConstructor() == -1679978726) {
                u7.this.wg(t2.z5(object));
            }
        }

        @Override
        public void b(final String str) {
            if (!u7.this.Se()) {
                u7.this.ff(true);
                final long j10 = this.f9715a;
                final Runnable v7Var = new Runnable() {
                    @Override
                    public final void run() {
                        u7.c.this.j(j10, str);
                    }
                };
                if (ob.a.g(u7.this.x9().f9717a)) {
                    u7.this.f24495b.Qe(u7.this.x9().f9717a, new o6.r() {
                        @Override
                        public final void a(long j11, long j12, TdApi.Error error) {
                            u7.c.this.l(v7Var, j11, j12, error);
                        }
                    });
                } else {
                    v7Var.run();
                }
            }
        }
    }

    public u7(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void ag(TdApi.BasicGroup basicGroup) {
        if (!Sa()) {
            this.f24495b.e2().n2(basicGroup.f19904id, this);
            x9().f9717a = ob.a.b(basicGroup.upgradedToSupergroupId);
        }
    }

    public void bg() {
        ug(true);
        e.r(this.f24495b.B3(x9().f9717a), this.f9709w0.permissions);
        Ag();
        ff(true);
        hf(true);
        rg(true);
    }

    public static boolean cg(Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_blockSender) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void dg(Runnable runnable, int i10, SparseIntArray sparseIntArray) {
        if (sparseIntArray.get(R.id.right_readMessages) != 0) {
            this.f9709w0.isMember = true;
        }
        runnable.run();
    }

    public boolean eg(View view, int i10) {
        if (i10 == R.id.btn_dismissAdmin && !Se()) {
            TdApi.ChatAdministratorRights chatAdministratorRights = this.f9708v0.rights;
            chatAdministratorRights.canChangeInfo = false;
            chatAdministratorRights.canManageChat = false;
            chatAdministratorRights.canPostMessages = false;
            chatAdministratorRights.canEditMessages = false;
            chatAdministratorRights.canDeleteMessages = false;
            chatAdministratorRights.canInviteUsers = false;
            chatAdministratorRights.canRestrictMembers = false;
            chatAdministratorRights.canPinMessages = false;
            chatAdministratorRights.canManageVideoChats = false;
            chatAdministratorRights.isAnonymous = false;
            chatAdministratorRights.canPromoteMembers = false;
            Ag();
            ff(true);
            hf(true);
            rg(true);
        }
        return true;
    }

    public void fg(long j10) {
        vg((int) (j10 / 1000));
    }

    public void gg(long j10) {
        vg((int) (j10 / 1000));
    }

    public boolean hg(View view, int i10) {
        switch (i10) {
            case R.id.btn_1day:
                tg(86520);
                return true;
            case R.id.btn_1month:
                tg(2592120);
                return true;
            case R.id.btn_1week:
                tg(604920);
                return true;
            case R.id.btn_custom:
                if (this.f9710x0) {
                    Xd(w.i1(R.string.RestrictUser), R.string.RestrictUntilToday, R.string.RestrictUntilTomorrow, R.string.RestrictUntilFuture, new l() {
                        @Override
                        public final void a(long j10) {
                            u7.this.fg(j10);
                        }
                    }, null);
                    return true;
                }
                Xd(w.i1(R.string.BlockUser), R.string.BlockUntilToday, R.string.BlockUntilTomorrow, R.string.BlockUntilFuture, new l() {
                    @Override
                    public final void a(long j10) {
                        u7.this.gg(j10);
                    }
                }, null);
                return true;
            case R.id.btn_forever:
                tg(0);
                return true;
            default:
                return true;
        }
    }

    public Object ig(long j10, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 1) {
            return w.h2(this, j10);
        }
        return null;
    }

    public void jg(final boolean z10, final TdApi.Error error) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                u7.this.ng(z10, error);
            }
        });
    }

    public void kg(d dVar, TdApi.ChatMemberStatus chatMemberStatus) {
        ff(true);
        Md(true);
        o6 o6Var = this.f24495b;
        long j10 = dVar.f9717a;
        TdApi.MessageSender messageSender = dVar.f9718b;
        int i10 = dVar.f9722f;
        TdApi.ChatMember chatMember = dVar.f9720d;
        o6Var.Lb(j10, messageSender, chatMemberStatus, i10, chatMember != null ? chatMember.status : null, new o6.i() {
            @Override
            public final void a(boolean z10, TdApi.Error error) {
                u7.this.jg(z10, error);
            }
        });
    }

    public void lg(boolean z10) {
        if (!Sa()) {
            Md(false);
            ff(false);
            if (z10) {
                cf();
            }
        }
    }

    public void mg(final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                u7.this.lg(z10);
            }
        });
    }

    public void ng(boolean z10, TdApi.Error error) {
        String str;
        if (!Sa()) {
            Md(false);
            ff(false);
            if (z10) {
                if (kd() instanceof f5) {
                    b9(te() - 2);
                }
                cf();
                return;
            }
            if (error == null || !"USER_PRIVACY_RESTRICTED".equals(error.message)) {
                str = t2.z5(error);
            } else {
                str = w.i1(R.string.errorPrivacyAddMember);
            }
            wg(str);
        }
    }

    public static ra pg(boolean z10) {
        return new ra(4, R.id.btn_transferOwnership, 0, z10 ? R.string.TransferOwnershipChannel : R.string.TransferOwnershipGroup).d0(R.id.theme_color_textNegative);
    }

    public final void Ag() {
        boolean Wf;
        int i10 = 0;
        for (ra raVar : this.f9711y0.D0()) {
            int A = raVar.A();
            if ((A == 67 || A == 92) && (Wf = Wf(raVar.j())) != raVar.b()) {
                raVar.E(Wf);
                this.f9711y0.r3(i10);
            }
            i10++;
        }
    }

    @Override
    public void K2(final TdApi.BasicGroup basicGroup, boolean z10) {
        if (z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    u7.this.ag(basicGroup);
                }
            });
        }
    }

    public final void Lf(List<ra> list) {
        TdApi.ChatMember chatMember;
        d x92 = x9();
        boolean z10 = false;
        list.add(new ra(8, 0, 0, R.string.CustomTitle));
        list.add(new ra(2));
        ra raVar = new ra(96, (int) R.id.input_customTitle, 0, 0, false);
        TdApi.ChatMember chatMember2 = x92.f9720d;
        ra b02 = raVar.b0(chatMember2 != null ? e.M0(chatMember2.status) : null);
        this.f9712z0 = b02;
        list.add(b02);
        list.add(new ra(3));
        Object[] objArr = new Object[1];
        TdApi.ChatMember chatMember3 = x92.f9720d;
        objArr[0] = w.i1((chatMember3 == null || !t2.P2(chatMember3.status)) ? R.string.message_adminSignPlain : R.string.message_ownerSign);
        list.add(new ra(9, 0, 0, w.m1(R.string.CustomTitleHint, objArr), false));
        iq iqVar = this.f9711y0;
        if (!x92.f9723g && (chatMember = x92.f9720d) != null && t2.P2(chatMember.status) && t2.P2(x92.f9719c)) {
            z10 = true;
        }
        iqVar.v2(this, z10);
    }

    public final void Mf() {
        int i10;
        int[] iArr;
        int i11;
        int constructor;
        c3 c3Var;
        d dVar = (d) x9();
        ArrayList arrayList = new ArrayList();
        TdApi.MessageSender messageSender = dVar.f9718b;
        if (messageSender != null) {
            if (messageSender.getConstructor() == -336109341) {
                c3Var = new c3(this.f24495b, e.U0(dVar.f9718b));
            } else {
                c3Var = new c3(this.f24495b, (TdApi.ChatList) null, e.S0(dVar.f9718b), true);
            }
            TdApi.ChatMember chatMember = dVar.f9720d;
            c3Var.B((chatMember == null || !t2.P2(chatMember.status)) ? null : w.i1(R.string.ChannelOwner));
            arrayList.add(new ra(57).G(c3Var));
            arrayList.add(new ra(3));
        }
        int i12 = dVar.f9718b != null ? 8 : 70;
        if (dVar.f9721e == 3) {
            i10 = R.string.WhatMembersCanDo;
        } else if (this.f24495b.e2().T1(dVar.f9718b)) {
            i10 = R.string.WhatThisBotCanDo;
        } else if (dVar.f9721e != 2) {
            i10 = R.string.WhatThisAdminCanDo;
        } else if (dVar.f9718b.getConstructor() == -239660751) {
            i10 = this.f24495b.O6(((TdApi.MessageSenderChat) dVar.f9718b).chatId) ? R.string.WhatThisChannelCanDo : R.string.WhatThisGroupCanDo;
        } else {
            i10 = R.string.WhatThisUserCanDo;
        }
        arrayList.add(new ra(i12, 0, 0, i10));
        arrayList.add(new ra(2));
        boolean O6 = this.f24495b.O6(dVar.f9717a);
        int i13 = dVar.f9721e;
        if (i13 == 3) {
            iArr = new int[]{R.id.right_sendMessages, R.id.right_sendMedia, R.id.right_sendStickersAndGifs, R.id.right_sendPolls, R.id.right_embedLinks, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_changeChatInfo};
        } else if (i13 == 2) {
            iArr = dVar.f9718b.getConstructor() == -239660751 ? new int[]{R.id.right_sendMessages, R.id.right_sendMedia, R.id.right_sendStickersAndGifs, R.id.right_sendPolls, R.id.right_embedLinks, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_changeChatInfo} : new int[]{R.id.right_readMessages, R.id.right_sendMessages, R.id.right_sendMedia, R.id.right_sendStickersAndGifs, R.id.right_sendPolls, R.id.right_embedLinks, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_changeChatInfo};
        } else {
            iArr = O6 ? new int[]{R.id.right_changeChatInfo, R.id.right_sendMessages, R.id.right_editMessages, R.id.right_deleteMessages, R.id.right_inviteUsers, R.id.right_manageVideoChats, R.id.right_addNewAdmins} : new int[]{R.id.right_changeChatInfo, R.id.right_deleteMessages, R.id.right_banUsers, R.id.right_inviteUsers, R.id.right_pinMessages, R.id.right_manageVideoChats, R.id.right_remainAnonymous, R.id.right_addNewAdmins};
        }
        int i14 = dVar.f9721e == 3 ? 92 : 67;
        boolean z10 = true;
        for (int i15 : iArr) {
            if (z10) {
                z10 = false;
            } else {
                arrayList.add(new ra(11));
            }
            arrayList.add(new ra(i14, i15, 0, xg(i15, O6)).E(Wf(i15)));
        }
        if (dVar.f9721e == 2) {
            arrayList.add(new ra(11));
            arrayList.add(new ra(5, R.id.btn_date, 0, R.string.BlockFor));
        }
        arrayList.add(new ra(3));
        if (dVar.f9721e != 3) {
            if (Zf()) {
                arrayList.add(new ra(9, (int) R.id.description, 0, w.m1(Uf(), this.f24495b.Cb(dVar.f9718b)), false));
            } else if (!t2.P2(dVar.f9720d.status) && ((constructor = dVar.f9720d.status.getConstructor()) == -1653518666 || constructor == -70024163 || constructor == 1661432998)) {
                CharSequence J1 = t2.J1(this, dVar.f9720d, true);
                if (!i.i(J1)) {
                    arrayList.add(new ra(9, 0, 0, J1, false));
                }
            }
        }
        if (Qf()) {
            Lf(arrayList);
        }
        boolean Of = Of();
        boolean Nf = Nf();
        if (Of && Nf) {
            arrayList.add(new ra(2));
            arrayList.add(pg(O6));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, R.id.btn_dismissAdmin, 0, R.string.DismissAdmin).d0(R.id.theme_color_textNegative));
            arrayList.add(new ra(3));
        } else if (Of) {
            arrayList.add(new ra(2));
            arrayList.add(pg(O6));
            arrayList.add(new ra(3));
        } else if (Nf) {
            arrayList.add(new ra(2));
            arrayList.add(new ra(4, R.id.btn_dismissAdmin, 0, R.string.DismissAdmin).d0(R.id.theme_color_textNegative));
            arrayList.add(new ra(3));
        }
        if (Pf()) {
            arrayList.add(new ra(2));
            if (dVar.f9720d.status.getConstructor() != -1653518666) {
                i11 = R.string.RemoveRestrictions;
            } else if (this.f24495b.e2().T1(dVar.f9720d.memberId)) {
                i11 = R.string.UnbanMemberBot;
            } else if (dVar.f9720d.memberId.getConstructor() == -239660751) {
                i11 = this.f24495b.O6(e.S0(dVar.f9720d.memberId)) ? R.string.UnbanMemberChannel : R.string.UnbanMemberGroup;
            } else {
                i11 = R.string.UnbanMember;
            }
            arrayList.add(new ra(4, R.id.btn_unblockSender, 0, i11).d0(R.id.theme_color_textNegative));
            arrayList.add(new ra(3));
        }
        arrayList.add(new ra(73));
        this.f9711y0.s2(arrayList, false);
    }

    public final boolean Nf() {
        TdApi.ChatMember chatMember;
        d x92 = x9();
        if (Zf() || x92.f9721e != 1 || (chatMember = x92.f9720d) == null || chatMember.status.getConstructor() != -70024163 || !((TdApi.ChatMemberStatusAdministrator) x92.f9720d.status).canBeEdited) {
            return false;
        }
        TdApi.ChatMemberStatus chatMemberStatus = x92.f9719c;
        int constructor = chatMemberStatus.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != -70024163) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).rights.canPromoteMembers;
    }

    public final boolean Of() {
        if (this.f9708v0 == null || this.f24495b.e2().T1(x9().f9718b) || !this.f9708v0.canBeEdited || x9().f9721e != 1 || x9().f9719c.getConstructor() != -160019714) {
            return false;
        }
        boolean O6 = this.f24495b.O6(x9().f9717a);
        TdApi.ChatAdministratorRights chatAdministratorRights = this.f9708v0.rights;
        return O6 ? chatAdministratorRights.canChangeInfo && chatAdministratorRights.canPostMessages && chatAdministratorRights.canEditMessages && chatAdministratorRights.canDeleteMessages && chatAdministratorRights.canInviteUsers && chatAdministratorRights.canManageVideoChats && chatAdministratorRights.canPromoteMembers : chatAdministratorRights.canChangeInfo && chatAdministratorRights.canDeleteMessages && chatAdministratorRights.canRestrictMembers && chatAdministratorRights.canInviteUsers && chatAdministratorRights.canPinMessages && chatAdministratorRights.canManageVideoChats && chatAdministratorRights.canPromoteMembers;
    }

    public final boolean Pf() {
        TdApi.ChatMember chatMember;
        d x92 = x9();
        if (Zf() || x92.f9721e != 2 || (chatMember = x92.f9720d) == null || (chatMember.status.getConstructor() != -1653518666 && x92.f9720d.status.getConstructor() != 1661432998)) {
            return false;
        }
        TdApi.ChatMemberStatus chatMemberStatus = x92.f9719c;
        int constructor = chatMemberStatus.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != -70024163) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).rights.canRestrictMembers;
    }

    public final boolean Qf() {
        d x92 = x9();
        if (this.f24495b.O6(x92.f9717a) || x92.f9721e != 1) {
            return false;
        }
        TdApi.ChatMember chatMember = x92.f9720d;
        int P = chatMember == null ? 1 : t2.P(x92.f9719c, chatMember.status);
        return P == 1 || P == 2 || !i.i(e.M0(x92.f9720d.status)) || t2.P2(x92.f9719c);
    }

    @Override
    public int R9() {
        return R.id.controller_memberRights;
    }

    @Override
    public int Re() {
        return R.id.theme_color_background;
    }

    public final boolean Rf(int i10) {
        return !this.f24495b.e2().T1(x9().f9718b) && t2.X(this.f24495b.B3(x9().f9717a), i10);
    }

    public final void Sf() {
        if (!Zf()) {
            hf(Yf());
        }
    }

    public final void Tf() {
        boolean O6 = this.f24495b.O6(x9().f9717a);
        if (Of()) {
            int L0 = this.f9711y0.L0(R.id.btn_transferOwnership);
            int L02 = this.f9711y0.L0(R.id.btn_dismissAdmin);
            if (L02 != -1 && L0 == -1) {
                this.f9711y0.D0().add(L02, new ra(11));
                this.f9711y0.D0().add(L02, pg(O6));
                this.f9711y0.M(L02, 2);
            } else if (L0 == -1) {
                int D = this.f9711y0.D() - 1;
                this.f9711y0.D0().addAll(D, Arrays.asList(new ra(2), pg(O6), new ra(3)));
                this.f9711y0.M(D, 3);
            }
        } else {
            int L03 = this.f9711y0.L0(R.id.btn_transferOwnership);
            if (L03 != -1) {
                ra C0 = this.f9711y0.C0(L03 + 2);
                if (C0 == null || C0.j() != R.id.btn_dismissAdmin) {
                    this.f9711y0.R1(L03 - 1, 3);
                } else {
                    this.f9711y0.R1(L03, 2);
                }
            }
        }
    }

    public final int Uf() {
        boolean z10;
        d x92 = x9();
        if (x92.f9721e == 2) {
            return this.f24495b.O6(x92.f9717a) ? this.f9710x0 ? R.string.RestrictXChannel : R.string.BanXChannel : this.f9710x0 ? R.string.RestrictXGroup : R.string.BanXGroup;
        }
        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = this.f9708v0;
        if (chatMemberStatusAdministrator != null) {
            z10 = chatMemberStatusAdministrator.rights.canPromoteMembers;
        } else {
            int L0 = this.f9711y0.L0(R.id.right_addNewAdmins);
            z10 = L0 != -1 && this.f9711y0.D0().get(L0).b();
        }
        return z10 ? R.string.XCanAssignAdmins : R.string.XCannotAssignAdmins;
    }

    @Override
    public void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        zd.u7.a(this, j10, basicGroupFullInfo);
    }

    public final CharSequence Vf(int i10, boolean z10) {
        d x92 = x9();
        int i11 = x92.f9721e;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3 || !this.f24495b.I2(x92.f9717a) || z10) {
                    return null;
                }
                TdApi.Chat P3 = this.f24495b.P3(x92.f9717a);
                if (i10 != R.id.right_changeChatInfo) {
                    if (i10 == R.id.right_pinMessages) {
                        if (!this.f24495b.E2(P3)) {
                            return w.H0(this, R.string.NoRightAllowPin, new Object[0]);
                        }
                        if (this.f24495b.H3(x92.f9717a)) {
                            return w.H0(this, R.string.NoRightAllowPinPublic, new Object[0]);
                        }
                    }
                } else if (!this.f24495b.m2(P3)) {
                    return w.H0(this, R.string.NoRightAllowChangeInfo, new Object[0]);
                } else {
                    if (this.f24495b.H3(x92.f9717a)) {
                        return w.H0(this, R.string.NoRightAllowChangeInfoPublic, new Object[0]);
                    }
                }
            } else if (x92.f9718b.getConstructor() == -239660751) {
                return w.i1(this.f24495b.O6(e.S0(x92.f9718b)) ? R.string.BanChannelHint : R.string.BanChatHint);
            } else if (i10 != R.id.btn_date && !t2.X(this.f24495b.B3(x92.f9717a), i10)) {
                return w.i1(R.string.ChatPermissionsRestrictHint);
            }
        } else if (!this.f24495b.e2().T1(x92.f9718b) && ((i10 == R.id.right_inviteUsers || i10 == R.id.right_changeChatInfo || i10 == R.id.right_pinMessages) && t2.X(this.f24495b.B3(x92.f9717a), i10) && z10)) {
            TdApi.ChatMember chatMember = x92.f9720d;
            int P = chatMember == null ? 1 : t2.P(x92.f9719c, chatMember.status);
            if (P != 1 && P != 2) {
                return null;
            }
            if (i10 == R.id.right_changeChatInfo) {
                return w.H0(this, R.string.NoRightDisallowChangeInfo, new Object[0]);
            }
            if (i10 == R.id.right_inviteUsers) {
                return w.H0(this, R.string.NoRightDisallowInvite, new Object[0]);
            }
            if (i10 == R.id.right_pinMessages) {
                return w.H0(this, R.string.NoRightDisallowPin, new Object[0]);
            }
        }
        return null;
    }

    @Override
    public boolean We() {
        return false;
    }

    public final boolean Wf(int i10) {
        if (x9().f9721e == 2) {
            if (x9().f9718b.getConstructor() == -239660751 && i10 == R.id.right_readMessages) {
                return true;
            }
            if (!t2.X(this.f24495b.B3(x9().f9717a), i10)) {
                return false;
            }
        }
        switch (i10) {
            case R.id.right_addNewAdmins:
                return this.f9708v0.rights.canPromoteMembers;
            case R.id.right_banUsers:
                return this.f9708v0.rights.canRestrictMembers;
            case R.id.right_changeChatInfo:
                if (x9().f9721e == 1) {
                    if (!this.f9708v0.rights.canChangeInfo && !Rf(i10)) {
                        return false;
                    }
                } else if (!this.f9710x0 || !this.f9709w0.permissions.canChangeInfo) {
                    return false;
                }
                return true;
            case R.id.right_deleteMessages:
                return this.f9708v0.rights.canDeleteMessages;
            case R.id.right_editMessages:
                return this.f9708v0.rights.canEditMessages;
            case R.id.right_embedLinks:
                if (!this.f9710x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions = this.f9709w0.permissions;
                return chatPermissions.canSendMessages && chatPermissions.canAddWebPagePreviews;
            case R.id.right_icon:
            default:
                throw new IllegalArgumentException("id == " + j0.B().getResourceName(i10));
            case R.id.right_inviteUsers:
                if (x9().f9721e == 1) {
                    if (!this.f9708v0.rights.canInviteUsers && !Rf(i10)) {
                        return false;
                    }
                } else if (!this.f9710x0 || !this.f9709w0.permissions.canInviteUsers) {
                    return false;
                }
                return true;
            case R.id.right_manageVideoChats:
                return this.f9708v0.rights.canManageVideoChats;
            case R.id.right_pinMessages:
                if (x9().f9721e == 1) {
                    if (!this.f9708v0.rights.canPinMessages && !Rf(i10)) {
                        return false;
                    }
                } else if (!this.f9710x0 || !this.f9709w0.permissions.canPinMessages) {
                    return false;
                }
                return true;
            case R.id.right_readMessages:
                return this.f9710x0;
            case R.id.right_remainAnonymous:
                return this.f9708v0.rights.isAnonymous;
            case R.id.right_sendMedia:
                if (!this.f9710x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions2 = this.f9709w0.permissions;
                return chatPermissions2.canSendMessages && chatPermissions2.canSendMediaMessages;
            case R.id.right_sendMessages:
                return x9().f9721e == 1 ? this.f9708v0.rights.canPostMessages : this.f9710x0 && this.f9709w0.permissions.canSendMessages;
            case R.id.right_sendPolls:
                if (!this.f9710x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions3 = this.f9709w0.permissions;
                return chatPermissions3.canSendMessages && chatPermissions3.canSendPolls;
            case R.id.right_sendStickersAndGifs:
                if (!this.f9710x0) {
                    return false;
                }
                TdApi.ChatPermissions chatPermissions4 = this.f9709w0.permissions;
                return chatPermissions4.canSendMessages && chatPermissions4.canSendOtherMessages;
        }
    }

    @Override
    public CharSequence X9() {
        d x92 = x9();
        int i10 = x92.f9721e;
        if (i10 == 1) {
            TdApi.ChatMember chatMember = x92.f9720d;
            int P = chatMember == null ? 1 : t2.P(x92.f9719c, chatMember.status);
            if (P == 1) {
                return w.i1(R.string.SetAsAdmin);
            }
            if (P != 2) {
                return w.i1(R.string.AdminRights);
            }
            return w.i1(R.string.EditAdmin);
        } else if (i10 != 2) {
            if (i10 == 3) {
                return w.i1(R.string.ChatPermissions);
            }
            throw new AssertionError();
        } else if (x9().f9718b.getConstructor() != -239660751) {
            return w.i1(R.string.UserRestrictions);
        } else {
            return w.i1(this.f24495b.O6(e.S0(x9().f9718b)) ? R.string.ChannelRestrictions : R.string.GroupRestrictions);
        }
    }

    public final boolean Xf(int i10) {
        d x92 = x9();
        if (i10 == R.id.btn_date && x92.f9718b.getConstructor() == -239660751) {
            return false;
        }
        int i11 = x92.f9721e;
        if (i11 == 3) {
            if (this.f24495b.I2(x92.f9717a)) {
                TdApi.Chat P3 = this.f24495b.P3(x92.f9717a);
                if (i10 != R.id.right_changeChatInfo) {
                    if (i10 == R.id.right_pinMessages) {
                        o6 o6Var = this.f24495b;
                        if (!o6Var.E2(o6Var.P3(x92.f9717a)) || this.f24495b.H3(x92.f9717a)) {
                            return false;
                        }
                    }
                } else if (!this.f24495b.m2(P3) || this.f24495b.H3(x92.f9717a)) {
                }
                return true;
            }
            return false;
        } else if (i11 == 2 && t2.J3(i10) && (x92.f9718b.getConstructor() == -239660751 || !t2.X(this.f24495b.B3(x92.f9717a), i10))) {
            return false;
        } else {
            if (x92.f9721e == 1 && !this.f24495b.e2().T1(x92.f9718b) && ((i10 == R.id.right_inviteUsers || i10 == R.id.right_changeChatInfo || i10 == R.id.right_pinMessages) && t2.X(this.f24495b.B3(x92.f9717a), i10))) {
                return false;
            }
            if (!Zf()) {
                switch (x92.f9720d.status.getConstructor()) {
                    case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                    case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                        int constructor = x92.f9719c.getConstructor();
                        if (constructor == -160019714) {
                            return true;
                        }
                        if (constructor == -70024163) {
                            return ((TdApi.ChatMemberStatusAdministrator) x92.f9719c).rights.canRestrictMembers;
                        }
                        break;
                    case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                        return i10 == R.id.right_remainAnonymous && x92.f9719c.getConstructor() == -160019714;
                    case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                        if (!((TdApi.ChatMemberStatusAdministrator) x92.f9720d.status).canBeEdited) {
                            return false;
                        }
                        break;
                    default:
                        return true;
                }
            }
            int constructor2 = x92.f9719c.getConstructor();
            if (constructor2 == -160019714) {
                return true;
            }
            if (constructor2 == -70024163) {
                TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) x92.f9719c;
                if (x92.f9721e == 2) {
                    return chatMemberStatusAdministrator.rights.canRestrictMembers;
                }
                switch (i10) {
                    case R.id.right_addNewAdmins:
                        return chatMemberStatusAdministrator.rights.canPromoteMembers;
                    case R.id.right_banUsers:
                        return chatMemberStatusAdministrator.rights.canRestrictMembers;
                    case R.id.right_changeChatInfo:
                        return chatMemberStatusAdministrator.rights.canChangeInfo;
                    case R.id.right_deleteMessages:
                        return chatMemberStatusAdministrator.rights.canDeleteMessages;
                    case R.id.right_editMessages:
                        return chatMemberStatusAdministrator.rights.canEditMessages;
                    case R.id.right_embedLinks:
                    case R.id.right_readMessages:
                    case R.id.right_sendMedia:
                    case R.id.right_sendPolls:
                    case R.id.right_sendStickersAndGifs:
                        return true;
                    case R.id.right_inviteUsers:
                        return chatMemberStatusAdministrator.rights.canInviteUsers;
                    case R.id.right_manageVideoChats:
                        return chatMemberStatusAdministrator.rights.canManageVideoChats;
                    case R.id.right_pinMessages:
                        return chatMemberStatusAdministrator.rights.canPinMessages;
                    case R.id.right_remainAnonymous:
                        return chatMemberStatusAdministrator.rights.isAnonymous;
                    case R.id.right_sendMessages:
                        return chatMemberStatusAdministrator.rights.canPostMessages;
                }
            }
            return false;
        }
    }

    public final boolean Yf() {
        d x92 = x9();
        if (Zf()) {
            return false;
        }
        int i10 = x92.f9721e;
        if (i10 == 3) {
            return !e.G(this.f24495b.B3(x92.f9717a), this.f9709w0.permissions);
        }
        if (i10 == 2) {
            boolean z10 = x92.f9720d.status.getConstructor() == 1661432998;
            if (this.f9710x0 != z10) {
                return true;
            }
            if (!z10) {
                return ((TdApi.ChatMemberStatusBanned) x92.f9720d.status).bannedUntilDate != this.f9709w0.restrictedUntilDate;
            }
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) x92.f9720d.status;
            int i11 = chatMemberStatusRestricted.restrictedUntilDate;
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted2 = this.f9709w0;
            return i11 != chatMemberStatusRestricted2.restrictedUntilDate || !e.H(chatMemberStatusRestricted2.permissions, chatMemberStatusRestricted.permissions, this.f24495b.B3(x92.f9717a));
        } else if (this.f9712z0 != null && !i.c(e.M0(x92.f9720d.status), this.f9712z0.x())) {
            return true;
        } else {
            if (x92.f9720d.status.getConstructor() == -70024163) {
                return !e.F((TdApi.ChatMemberStatusAdministrator) x92.f9720d.status, this.f9708v0);
            }
            return x92.f9720d.status.getConstructor() == -160019714 && ((TdApi.ChatMemberStatusCreator) x92.f9720d.status).isAnonymous != this.f9708v0.rights.isAnonymous;
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        if (ob.a.g(x9().f9717a)) {
            this.f24495b.e2().n2(ob.a.m(x9().f9717a), this);
        }
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        this.f9711y0 = new a(this);
        Mf();
        recyclerView.setAdapter(this.f9711y0);
        recyclerView.g(new b());
        if (Zf()) {
            hf(true);
        }
        df(R.drawable.baseline_check_24);
        if (ob.a.g(x9().f9717a)) {
            this.f24495b.e2().Z1(ob.a.m(x9().f9717a), this);
        }
    }

    public final boolean Zf() {
        d x92 = x9();
        int i10 = x92.f9721e;
        if (i10 == 3) {
            return false;
        }
        TdApi.ChatMember chatMember = x92.f9720d;
        if (chatMember == null) {
            return true;
        }
        if (i10 == 2) {
            int constructor = chatMember.status.getConstructor();
            if (constructor == -1653518666 || constructor == 1661432998) {
                return false;
            }
        } else {
            int constructor2 = chatMember.status.getConstructor();
            if (constructor2 == -160019714 || constructor2 == -70024163) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean af() {
        if (x9().f9721e == 1) {
            this.f9708v0.rights.canManageChat = true;
        }
        rg(false);
        return true;
    }

    @Override
    public void hf(boolean z10) {
        if (z10 != Te()) {
            super.hf(z10);
            this.f8035o0.A0();
            iq iqVar = this.f9711y0;
            iqVar.I(iqVar.D() - 1);
        }
    }

    @Override
    public boolean jc(boolean z10) {
        if (!Yf()) {
            return false;
        }
        qe(null);
        return true;
    }

    public final TdApi.ChatMemberStatusAdministrator og() {
        d x92 = x9();
        if (x92.f9719c.getConstructor() != -70024163) {
            return new TdApi.ChatMemberStatusAdministrator(null, true, new TdApi.ChatAdministratorRights(true, true, true, true, true, true, true, true, false, true, false));
        }
        return new TdApi.ChatMemberStatusAdministrator(null, true, e.k(((TdApi.ChatMemberStatusAdministrator) x92.f9719c).rights));
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        if (!Se()) {
            int A = raVar.A();
            if (A == 57) {
                c3 c3Var = (c3) raVar.d();
                long p10 = c3Var.p();
                hj.q s10 = new hj.q().s(t().I3().g(view).i(this));
                if (p10 != 0) {
                    this.f24495b.hd().v7(this, p10, s10);
                } else {
                    this.f24495b.hd().h7(this, c3Var.e(), new hj.j().h().s(s10));
                }
            } else if (A == 67 || A == 92) {
                int j10 = raVar.j();
                if (Xf(j10)) {
                    yg(j10);
                    return;
                }
                CharSequence Vf = Vf(j10, raVar.b());
                if (Vf != null) {
                    t().I3().g(((uc.c) view).getToggler()).F(this, this.f24495b, R.drawable.baseline_info_24, Vf);
                }
            } else {
                switch (raVar.j()) {
                    case R.id.btn_date:
                        if (x9().f9721e == 2 && x9().f9718b.getConstructor() == -239660751) {
                            x2.h g10 = this.f24493a.I3().g(view);
                            o6 o6Var = this.f24495b;
                            g10.C(o6Var, o6Var.O6(e.S0(x9().f9718b)) ? R.string.BanChannelHint : R.string.BanChatHint).F();
                            return;
                        }
                        ee(null, new int[]{R.id.btn_1day, R.id.btn_1week, R.id.btn_1month, R.id.btn_forever, R.id.btn_custom}, new String[]{w.o2(R.string.xDays, 1L), w.o2(R.string.xWeeks, 1L), w.o2(R.string.xMonths, 1L), w.i1(R.string.UserRestrictionsUntilForever), w.i1(R.string.CustomDate)}, null, null, new h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i10) {
                                return g0.b(this, i10);
                            }

                            @Override
                            public final boolean r3(View view2, int i10) {
                                boolean hg;
                                hg = u7.this.hg(view2, i10);
                                return hg;
                            }
                        });
                        return;
                    case R.id.btn_dismissAdmin:
                        ee(null, new int[]{R.id.btn_dismissAdmin, R.id.btn_cancel}, new String[]{w.i1(R.string.DismissAdmin), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i10) {
                                return g0.b(this, i10);
                            }

                            @Override
                            public final boolean r3(View view2, int i10) {
                                boolean eg;
                                eg = u7.this.eg(view2, i10);
                                return eg;
                            }
                        });
                        return;
                    case R.id.btn_transferOwnership:
                        if (ob.a.g(x9().f9717a)) {
                            Vd(w.H0(this, R.string.UpgradeChatPrompt, new Object[0]), w.i1(R.string.Proceed), new Runnable() {
                                @Override
                                public final void run() {
                                    u7.this.qg();
                                }
                            });
                            return;
                        } else {
                            qg();
                            return;
                        }
                    case R.id.btn_unblockSender:
                        final Runnable o7Var = new Runnable() {
                            @Override
                            public final void run() {
                                u7.this.bg();
                            }
                        };
                        d x92 = x9();
                        this.f9709w0.isMember = t2.h3(x92.f9720d.status);
                        if (this.f9709w0.isMember || x92.f9718b.getConstructor() == -239660751) {
                            ee(w.m1(R.string.QUnblockX, this.f24495b.Cb(x92.f9718b)), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{w.i1(R.string.RemoveRestrictions), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                                @Override
                                public boolean P() {
                                    return g0.a(this);
                                }

                                @Override
                                public Object a2(int i10) {
                                    return g0.b(this, i10);
                                }

                                @Override
                                public final boolean r3(View view2, int i10) {
                                    boolean cg;
                                    cg = u7.cg(o7Var, view2, i10);
                                    return cg;
                                }
                            });
                            return;
                        }
                        f2 j11 = new f2(R.id.btn_unblockSender).i(new ra(28, 0, 0, w.m1(R.string.QUnblockX, this.f24495b.Cb(x92.f9718b)), false)).j(new v4.r() {
                            @Override
                            public final void l6(int i10, SparseIntArray sparseIntArray) {
                                u7.this.dg(o7Var, i10, sparseIntArray);
                            }
                        });
                        ra[] raVarArr = new ra[1];
                        raVarArr[0] = new ra(12, (int) R.id.right_readMessages, 0, this.f24495b.O6(x92.f9717a) ? R.string.InviteBackToChannel : R.string.InviteBackToGroup, false);
                        me(j11.p(raVarArr).r(R.string.Unban).q(R.id.theme_color_textNegative));
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void qg() {
        if (!Se()) {
            long j10 = x9().f9717a;
            TdApi.MessageSender messageSender = x9().f9718b;
            final long U0 = e.U0(messageSender);
            if (U0 != 0) {
                boolean O6 = this.f24495b.O6(j10);
                w.f f7Var = new w.f() {
                    @Override
                    public final Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
                        Object ig;
                        ig = u7.this.ig(U0, charSequence, i10, i11, i12, z10);
                        return ig;
                    }
                };
                CharSequence G0 = O6 ? w.G0(this, R.string.TransferOwnershipAlertChannel, f7Var, this.f24495b.U3(j10), this.f24495b.Cb(messageSender)) : w.G0(this, R.string.TransferOwnershipAlertGroup, f7Var, this.f24495b.U3(j10), this.f24495b.Cb(messageSender));
                ff(true);
                this.f24495b.hd().W7(this, G0, new c(U0));
            }
        }
    }

    public final void rg(boolean z10) {
        final TdApi.ChatMemberStatus chatMemberStatus;
        if (!Se() || z10) {
            final d x92 = x9();
            int i10 = x92.f9721e;
            if (i10 != 3) {
                if (i10 != 2) {
                    TdApi.ChatMember chatMember = x92.f9720d;
                    if (chatMember == null || chatMember.status.getConstructor() != -160019714) {
                        chatMemberStatus = this.f9708v0;
                    } else {
                        TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = this.f9708v0;
                        chatMemberStatus = new TdApi.ChatMemberStatusCreator(chatMemberStatusAdministrator.customTitle, chatMemberStatusAdministrator.rights.isAnonymous, ((TdApi.ChatMemberStatusCreator) x92.f9720d.status).isMember);
                    }
                } else if (!this.f9710x0) {
                    chatMemberStatus = new TdApi.ChatMemberStatusBanned(this.f9709w0.restrictedUntilDate);
                } else if (!t2.B2(this.f9709w0.permissions, this.f24495b.B3(x92.f9717a))) {
                    TdApi.ChatMember chatMember2 = x92.f9720d;
                    if (chatMember2 == null || !t2.y3(chatMember2.status)) {
                        j0.y0(R.string.NoRestrictionsHint, 0);
                        return;
                    }
                    chatMemberStatus = this.f9709w0.isMember ? new TdApi.ChatMemberStatusMember() : new TdApi.ChatMemberStatusLeft();
                } else {
                    chatMemberStatus = this.f9709w0;
                }
                String M0 = e.M0(chatMemberStatus);
                if (i.i(M0) || M0.length() <= 16) {
                    Runnable q7Var = new Runnable() {
                        @Override
                        public final void run() {
                            u7.this.kg(x92, chatMemberStatus);
                        }
                    };
                    if (!ob.a.g(x92.f9717a) || !t2.z4(chatMemberStatus)) {
                        q7Var.run();
                    } else {
                        Vd(w.H0(this, R.string.UpgradeChatPrompt, new Object[0]), w.i1(R.string.Proceed), q7Var);
                    }
                } else {
                    j0.y0(R.string.CustomTitleTooBig, 0);
                }
            } else if (e.G(this.f9709w0.permissions, this.f24495b.B3(x92.f9717a))) {
                Zb();
            } else {
                ff(true);
                Md(true);
                this.f24495b.Qb(x92.f9717a, this.f9709w0.permissions, new kb.i() {
                    @Override
                    public final void a(boolean z11) {
                        u7.this.mg(z11);
                    }
                });
            }
        }
    }

    public void sg(d dVar) {
        super.Ad(dVar);
        this.f9710x0 = this.f24495b.O6(dVar.f9717a);
        int i10 = dVar.f9721e;
        if (i10 == 1) {
            TdApi.ChatMember chatMember = dVar.f9720d;
            if (chatMember == null) {
                this.f9708v0 = og();
            } else if (chatMember.status.getConstructor() == -160019714) {
                TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) dVar.f9720d.status;
                this.f9708v0 = new TdApi.ChatMemberStatusAdministrator(chatMemberStatusCreator.customTitle, true, new TdApi.ChatAdministratorRights(true, true, true, true, true, true, true, true, true, true, chatMemberStatusCreator.isAnonymous));
            } else if (dVar.f9720d.status.getConstructor() == -70024163) {
                this.f9708v0 = (TdApi.ChatMemberStatusAdministrator) e.l((TdApi.ChatMemberStatusAdministrator) dVar.f9720d.status);
            } else {
                this.f9708v0 = og();
            }
        } else if (i10 == 2) {
            TdApi.ChatMember chatMember2 = dVar.f9720d;
            if (chatMember2 == null || chatMember2.status.getConstructor() != 1661432998) {
                this.f9710x0 = false;
                this.f9709w0 = new TdApi.ChatMemberStatusRestricted(false, 0, new TdApi.ChatPermissions());
                TdApi.ChatMember chatMember3 = dVar.f9720d;
                if (chatMember3 != null && chatMember3.status.getConstructor() == -1653518666) {
                    this.f9709w0.restrictedUntilDate = ((TdApi.ChatMemberStatusBanned) dVar.f9720d.status).bannedUntilDate;
                    return;
                }
                return;
            }
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) dVar.f9720d.status;
            this.f9710x0 = true;
            this.f9709w0 = new TdApi.ChatMemberStatusRestricted(true, chatMemberStatusRestricted.restrictedUntilDate, e.m(chatMemberStatusRestricted.permissions));
        } else if (i10 == 3) {
            this.f9710x0 = true;
            this.f9709w0 = new TdApi.ChatMemberStatusRestricted(true, 0, e.m(this.f24495b.B3(dVar.f9717a)));
        }
    }

    public final void tg(int i10) {
        vg(i10 != 0 ? (int) ((this.f24495b.H4() / 1000) + i10) : 0);
    }

    public final void ug(boolean z10) {
        if (this.f9710x0 != z10) {
            this.f9710x0 = z10;
            zg();
            this.f9711y0.p3(R.id.btn_date);
        }
    }

    public final void vg(int i10) {
        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = this.f9709w0;
        if (chatMemberStatusRestricted.restrictedUntilDate != i10) {
            chatMemberStatusRestricted.restrictedUntilDate = i10;
            this.f9711y0.p3(R.id.btn_date);
            Sf();
        }
    }

    public final void wg(CharSequence charSequence) {
        this.f24493a.I3().g(Qe()).F(this, this.f24495b, R.drawable.baseline_error_24, charSequence);
    }

    public final int xg(int i10, boolean z10) {
        switch (i10) {
            case R.id.right_addNewAdmins:
                return R.string.RightAddNewAdmins;
            case R.id.right_banUsers:
                return R.string.RightBanUsers;
            case R.id.right_changeChatInfo:
                return z10 ? R.string.RightChangeChannelInfo : R.string.RightChangeGroupInfo;
            case R.id.right_deleteMessages:
                return R.string.EditAdminGroupDeleteMessages;
            case R.id.right_editMessages:
                return R.string.RightEditMessages;
            case R.id.right_embedLinks:
                return R.string.UserRestrictionsEmbedLinks;
            case R.id.right_icon:
            default:
                throw new IllegalArgumentException("id == " + j0.B().getResourceName(i10));
            case R.id.right_inviteUsers:
                return R.string.RightInviteViaLink;
            case R.id.right_manageVideoChats:
                return z10 ? R.string.RightLiveStreams : R.string.RightVoiceChats;
            case R.id.right_pinMessages:
                return R.string.RightPinMessages;
            case R.id.right_readMessages:
                return R.string.UserRestrictionsRead;
            case R.id.right_remainAnonymous:
                return R.string.RightAnonymous;
            case R.id.right_sendMedia:
                return R.string.RightSendMedia;
            case R.id.right_sendMessages:
                return x9().f9721e == 1 ? R.string.EditAdminPostMessages : R.string.UserRestrictionsSend;
            case R.id.right_sendPolls:
                return R.string.UserRestrictionsSendPolls;
            case R.id.right_sendStickersAndGifs:
                return R.string.UserRestrictionsSendStickers;
        }
    }

    public final void yg(int i10) {
        boolean z10 = true;
        boolean z11 = !Wf(i10);
        switch (i10) {
            case R.id.right_addNewAdmins:
                this.f9708v0.rights.canPromoteMembers = z11;
                zg();
                break;
            case R.id.right_banUsers:
                this.f9708v0.rights.canRestrictMembers = z11;
                break;
            case R.id.right_changeChatInfo:
                if (x9().f9721e != 1) {
                    if (!this.f9710x0 && !z11) {
                        z10 = false;
                    }
                    ug(z10);
                    this.f9709w0.permissions.canChangeInfo = z11;
                    break;
                } else {
                    this.f9708v0.rights.canChangeInfo = z11;
                    break;
                }
            case R.id.right_deleteMessages:
                this.f9708v0.rights.canDeleteMessages = z11;
                break;
            case R.id.right_editMessages:
                this.f9708v0.rights.canEditMessages = z11;
                break;
            case R.id.right_embedLinks:
                ug(this.f9710x0 || z11);
                TdApi.ChatPermissions chatPermissions = this.f9709w0.permissions;
                if (!chatPermissions.canSendMessages && !z11) {
                    z10 = false;
                }
                chatPermissions.canSendMessages = z10;
                chatPermissions.canAddWebPagePreviews = z11;
                break;
            case R.id.right_inviteUsers:
                if (x9().f9721e != 1) {
                    if (!this.f9710x0 && !z11) {
                        z10 = false;
                    }
                    ug(z10);
                    this.f9709w0.permissions.canInviteUsers = z11;
                    break;
                } else {
                    this.f9708v0.rights.canInviteUsers = z11;
                    break;
                }
            case R.id.right_manageVideoChats:
                this.f9708v0.rights.canManageVideoChats = z11;
                break;
            case R.id.right_pinMessages:
                if (x9().f9721e != 1) {
                    if (!this.f9710x0 && !z11) {
                        z10 = false;
                    }
                    ug(z10);
                    this.f9709w0.permissions.canPinMessages = z11;
                    break;
                } else {
                    this.f9708v0.rights.canPinMessages = z11;
                    break;
                }
            case R.id.right_readMessages:
                ug(z11);
                break;
            case R.id.right_remainAnonymous:
                this.f9708v0.rights.isAnonymous = z11;
                break;
            case R.id.right_sendMedia:
                ug(this.f9710x0 || z11);
                TdApi.ChatPermissions chatPermissions2 = this.f9709w0.permissions;
                if (!chatPermissions2.canSendMessages && !z11) {
                    z10 = false;
                }
                chatPermissions2.canSendMessages = z10;
                chatPermissions2.canSendMediaMessages = z11;
                break;
            case R.id.right_sendMessages:
                if (x9().f9721e != 1) {
                    if (!this.f9710x0 && !z11) {
                        z10 = false;
                    }
                    ug(z10);
                    this.f9709w0.permissions.canSendMessages = z11;
                    break;
                } else {
                    this.f9708v0.rights.canPostMessages = z11;
                    break;
                }
            case R.id.right_sendPolls:
                ug(this.f9710x0 || z11);
                TdApi.ChatPermissions chatPermissions3 = this.f9709w0.permissions;
                if (!chatPermissions3.canSendMessages && !z11) {
                    z10 = false;
                }
                chatPermissions3.canSendMessages = z10;
                chatPermissions3.canSendPolls = z11;
                break;
            case R.id.right_sendStickersAndGifs:
                ug(this.f9710x0 || z11);
                TdApi.ChatPermissions chatPermissions4 = this.f9709w0.permissions;
                if (!chatPermissions4.canSendMessages && !z11) {
                    z10 = false;
                }
                chatPermissions4.canSendMessages = z10;
                chatPermissions4.canSendOtherMessages = z11;
                break;
        }
        if (x9().f9721e == 3 || x9().f9721e == 2) {
            TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = this.f9709w0;
            chatMemberStatusRestricted.isMember = this.f9710x0;
            chatMemberStatusRestricted.permissions.canSendMessages = Wf(R.id.right_sendMessages);
            this.f9709w0.permissions.canSendMediaMessages = Wf(R.id.right_sendMedia);
            this.f9709w0.permissions.canSendOtherMessages = Wf(R.id.right_sendStickersAndGifs);
            this.f9709w0.permissions.canSendPolls = Wf(R.id.right_sendPolls);
            this.f9709w0.permissions.canAddWebPagePreviews = Wf(R.id.right_embedLinks);
        }
        Ag();
        Sf();
        Tf();
    }

    public final void zg() {
        int L0 = this.f9711y0.L0(R.id.description);
        if (L0 != -1) {
            this.f9711y0.D0().get(L0).X(w.m1(Uf(), this.f24495b.Cb(x9().f9718b)));
            this.f9711y0.I(L0);
        }
    }

    public static class d {
        public long f9717a;
        public final TdApi.MessageSender f9718b;
        public final TdApi.ChatMemberStatus f9719c;
        public final TdApi.ChatMember f9720d;
        public final int f9721e;
        public int f9722f;
        public boolean f9723g;

        public d(long j10, TdApi.MessageSender messageSender, boolean z10, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember) {
            this.f9717a = j10;
            this.f9718b = messageSender;
            this.f9721e = z10 ? 2 : 1;
            this.f9719c = chatMemberStatus;
            this.f9720d = chatMember;
        }

        public d a(int i10) {
            this.f9722f = i10;
            return this;
        }

        public d b() {
            this.f9723g = true;
            return this;
        }

        public d(long j10) {
            this.f9717a = j10;
            this.f9718b = null;
            this.f9721e = 3;
            this.f9719c = null;
            this.f9720d = null;
        }
    }
}
