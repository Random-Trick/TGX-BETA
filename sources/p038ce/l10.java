package p038ce;

import android.content.Context;
import android.view.View;
import be.C1357a0;
import gd.C4649h;
import java.util.ArrayList;
import java.util.Iterator;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.MediaRecyclerView;
import p082fd.C4403w;
import p193nb.C7316a;
import p350yd.AbstractC10747j0;
import p350yd.C10721i0;
import p350yd.C10930q6;
import p350yd.C11059v7;

public class l10 extends i10<C4649h> implements C11059v7.AbstractC11067h, C11059v7.AbstractC11061b, AbstractC10747j0 {
    public l10(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34013Rg(long j) {
        ArrayList<T> arrayList;
        if (!m9347Sa() && (arrayList = this.f8577A0) != 0 && !arrayList.isEmpty()) {
            Iterator it = this.f8577A0.iterator();
            while (it.hasNext()) {
                C4649h hVar = (C4649h) it.next();
                if (j == hVar.m26642m()) {
                    hVar.m26629z();
                    return;
                }
            }
        }
    }

    public void m34012Sg(long j) {
        ArrayList<T> arrayList;
        if (!m9347Sa() && (arrayList = this.f8577A0) != 0 && !arrayList.isEmpty()) {
            Iterator it = this.f8577A0.iterator();
            while (it.hasNext()) {
                C4649h hVar = (C4649h) it.next();
                if (j == hVar.m26642m()) {
                    hVar.m26630y();
                    return;
                }
            }
        }
    }

    @Override
    public long mo34019Af(ArrayList<C4649h> arrayList, long j) {
        return (arrayList == null || arrayList.isEmpty()) ? j : arrayList.get(arrayList.size() - 1).m26642m();
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
    public int mo34018Df() {
        return 6;
    }

    @Override
    public String mo34017Ef() {
        return C4403w.m27871i1(R.string.GroupsInCommon);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public int mo34016Gf() {
        return C1357a0.m37544i(62.0f);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public boolean mo33062Kg() {
        return false;
    }

    @Override
    public void mo4071L0(long j, int i) {
        m34009Vg(j);
    }

    @Override
    public boolean mo33061Lg() {
        return false;
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    public C4649h mo33047rg(TdApi.Object object) {
        return new C4649h(this.f30170b, (TdApi.Chat) object);
    }

    public final void m34010Ug(final long j) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                l10.this.m34013Rg(j);
            }
        });
    }

    @Override
    public void mo4069V5(long j, long j2, int i, boolean z) {
        C10721i0.m4180q(this, j, j2, i, z);
    }

    public final void m34009Vg(final long j) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                l10.this.m34012Sg(j);
            }
        });
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public void mo1566W2(TdApi.BasicGroup basicGroup, boolean z) {
        m34009Vg(C7316a.m17060a(basicGroup.f25366id));
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.TabSharedGroups);
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2480e2().m1619m2(this);
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        m34010Ug(j);
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    @Override
    public void mo1556h0(long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        m34009Vg(C7316a.m17059b(j));
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    @Override
    public TdApi.Function mo34008hf(long j, long j2, String str, long j3, String str2, int i) {
        return new TdApi.GetGroupsInCommon(this.f30170b.m2494d4(j), j3, i);
    }

    @Override
    public void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        m34009Vg(C7316a.m17060a(j));
    }

    @Override
    public void mo4061i5(long j, String str) {
        m34010Ug(j);
    }

    @Override
    public CharSequence mo33054if(ArrayList<C4649h> arrayList) {
        return C4403w.m27838q2(R.string.xGroups, arrayList.size());
    }

    @Override
    public boolean mo34007ig() {
        return false;
    }

    @Override
    public boolean mo33051lg() {
        return false;
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    @Override
    public void mo33048ng(Context context, MediaRecyclerView mediaRecyclerView, C2546iq iqVar) {
        super.mo33048ng(context, mediaRecyclerView, iqVar);
        this.f30170b.m2480e2().m1668Z1(this);
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar != null && raVar.m32879A() == 63) {
            this.f30170b.m2485dd().m3569h7(this, ((C4649h) raVar.m32847d()).m26642m(), null);
        }
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public boolean mo33503rf() {
        return false;
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    @Override
    public void mo1555t0(TdApi.Supergroup supergroup) {
        m34009Vg(C7316a.m17059b(supergroup.f25428id));
    }

    @Override
    public void mo4056t7(long j, TdApi.ChatPermissions chatPermissions) {
        C10721i0.m4183n(this, j, chatPermissions);
    }

    @Override
    public boolean mo33046tg() {
        return true;
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
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
    public int mo33044xg() {
        return 63;
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }
}
