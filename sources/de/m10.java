package de;

import android.content.Context;
import android.view.View;
import ce.a0;
import gd.w;
import hd.h;
import java.util.ArrayList;
import java.util.Iterator;
import ob.a;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.MediaRecyclerView;
import zd.g0;
import zd.h0;
import zd.o6;
import zd.t7;

public class m10 extends j10<h> implements t7.h, t7.b, h0 {
    public m10(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Rg(long j10) {
        ArrayList<T> arrayList;
        if (!Sa() && (arrayList = this.A0) != 0 && !arrayList.isEmpty()) {
            Iterator it = this.A0.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (j10 == hVar.m()) {
                    hVar.z();
                    return;
                }
            }
        }
    }

    public void Sg(long j10) {
        ArrayList<T> arrayList;
        if (!Sa() && (arrayList = this.A0) != 0 && !arrayList.isEmpty()) {
            Iterator it = this.A0.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (j10 == hVar.m()) {
                    hVar.y();
                    return;
                }
            }
        }
    }

    @Override
    public long Af(ArrayList<h> arrayList, long j10) {
        return (arrayList == null || arrayList.isEmpty()) ? j10 : arrayList.get(arrayList.size() - 1).m();
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
    public int Df() {
        return 6;
    }

    @Override
    public String Ef() {
        return w.i1(R.string.GroupsInCommon);
    }

    @Override
    public int Gf() {
        return a0.i(62.0f);
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    @Override
    public void K2(TdApi.BasicGroup basicGroup, boolean z10) {
        Vg(a.a(basicGroup.f19904id));
    }

    @Override
    public boolean Kg() {
        return false;
    }

    @Override
    public boolean Lg() {
        return false;
    }

    @Override
    public void N0(long j10, int i10) {
        Vg(j10);
    }

    @Override
    public void N1(long j10, boolean z10) {
        g0.j(this, j10, z10);
    }

    @Override
    public void R3(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        Ug(j10);
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        g0.q(this, j10, j11, i10, z10);
    }

    public h rg(TdApi.Object object) {
        return new h(this.f24495b, (TdApi.Chat) object);
    }

    public final void Ug(final long j10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                m10.this.Rg(j10);
            }
        });
    }

    @Override
    public void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        Vg(a.a(j10));
    }

    public final void Vg(final long j10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                m10.this.Sg(j10);
            }
        });
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        g0.a(this, j10, chatActionBar);
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.TabSharedGroups);
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.e2().l2(this);
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
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
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    @Override
    public void f0(long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        Vg(a.b(j10));
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        Ug(j10);
    }

    @Override
    public TdApi.Function hf(long j10, long j11, String str, long j12, String str2, int i10) {
        return new TdApi.GetGroupsInCommon(this.f24495b.h4(j10), j12, i10);
    }

    @Override
    public CharSequence mo1if(ArrayList<h> arrayList) {
        return w.q2(R.string.xGroups, arrayList.size());
    }

    @Override
    public boolean ig() {
        return false;
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    @Override
    public boolean lg() {
        return false;
    }

    @Override
    public void ng(Context context, MediaRecyclerView mediaRecyclerView, iq iqVar) {
        super.ng(context, mediaRecyclerView, iqVar);
        this.f24495b.e2().X1(this);
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar != null && raVar.A() == 63) {
            this.f24495b.hd().h7(this, ((h) raVar.d()).m(), null);
        }
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
    public boolean rf() {
        return false;
    }

    @Override
    public void s0(TdApi.Supergroup supergroup) {
        Vg(a.b(supergroup.f19965id));
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
    public boolean tg() {
        return true;
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
    public int xg() {
        return 63;
    }

    @Override
    public void y1(long j10, long j11) {
        g0.r(this, j10, j11);
    }
}
