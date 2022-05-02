package p038ce;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import me.C6942k3;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.C2546iq;
import p038ce.View$OnClickListenerC3038s6;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5920l;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC3038s6 extends AbstractC2420g6<C3041c> implements View.OnClickListener, C2546iq.AbstractC2551e {
    public static final int[] f10199I0;
    public static final String[] f10200J0 = {"1", "10", "50", "100", C4403w.m27869i1(R.string.Infinity)};
    public static final String[] f10201K0;
    public int f10202A0;
    public C2546iq f10203B0;
    public int f10204C0;
    public int f10205D0;
    public boolean f10206E0;
    public boolean f10207F0;
    public TdApi.ChatInviteLink f10209H0;
    public String[] f10210v0;
    public int f10211w0;
    public String[] f10212x0;
    public int f10214z0;
    public int[] f10213y0 = f10199I0;
    public String f10208G0 = "";

    public class C3039a implements AbstractC5117h0 {
        public final AbstractC5920l f10215a;

        public C3039a(AbstractC5920l lVar) {
            this.f10215a = lVar;
        }

        public void m31955b(AbstractC5920l lVar, long j) {
            lVar.mo3050a(j - View$OnClickListenerC3038s6.this.f30167b.m2898D4());
        }

        @Override
        public boolean mo493A3(View view, int i) {
            long j;
            if (i != R.id.btn_sendScheduledCustom) {
                switch (i) {
                    case R.id.btn_expireIn12h:
                        j = TimeUnit.HOURS.toMillis(12L);
                        break;
                    case R.id.btn_expireIn1w:
                        j = TimeUnit.DAYS.toMillis(7L);
                        break;
                    case R.id.btn_expireIn2d:
                        j = TimeUnit.DAYS.toMillis(2L);
                        break;
                    case R.id.btn_expireIn2w:
                        j = TimeUnit.DAYS.toMillis(14L);
                        break;
                    default:
                        return false;
                }
                this.f10215a.mo3050a(j);
                return true;
            }
            View$OnClickListenerC3038s6 s6Var = View$OnClickListenerC3038s6.this;
            String i1 = C4403w.m27869i1(R.string.InviteLinkExpireTitle);
            final AbstractC5920l lVar = this.f10215a;
            s6Var.m9309Xd(i1, R.string.InviteLinkExpireToday, R.string.InviteLinkExpireTomorrow, R.string.InviteLinkExpireFuture, new AbstractC5920l() {
                @Override
                public final void mo3050a(long j2) {
                    View$OnClickListenerC3038s6.C3039a.this.m31955b(lVar, j2);
                }
            }, null);
            return true;
        }

        @Override
        public boolean mo492Q() {
            return C5115g0.m23935a(this);
        }

        @Override
        public Object mo491b2(int i) {
            return C5115g0.m23934b(this, i);
        }
    }

    public class C3040b extends C2546iq {
        public C3040b(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo31467J1(C2964ra raVar, C6942k3 k3Var, int i, int i2) {
            int i3 = 0;
            if (raVar.m32835j() == R.id.btn_inviteLinkDateSlider) {
                View$OnClickListenerC3038s6 s6Var = View$OnClickListenerC3038s6.this;
                if (i != s6Var.f10212x0.length - 1) {
                    i3 = View$OnClickListenerC3038s6.this.f10213y0[i];
                }
                s6Var.f10204C0 = i3;
                View$OnClickListenerC3038s6.this.f10203B0.m34130s3(R.id.btn_inviteLinkDateLimit);
            } else if (raVar.m32835j() == R.id.btn_inviteLinkUserSlider) {
                View$OnClickListenerC3038s6 s6Var2 = View$OnClickListenerC3038s6.this;
                if (i != s6Var2.f10210v0.length - 1) {
                    i3 = Integer.parseInt(View$OnClickListenerC3038s6.this.f10210v0[i]);
                }
                s6Var2.f10205D0 = i3;
                View$OnClickListenerC3038s6.this.f10203B0.m34130s3(R.id.btn_inviteLinkUserLimit);
            }
            View$OnClickListenerC3038s6.this.m31986Ff();
        }

        @Override
        public void mo31465O2(C2964ra raVar, C6942k3 k3Var) {
            k3Var.setPadding(k3Var.getPaddingLeft(), k3Var.getPaddingTop(), C1357a0.m37541i(16.0f), k3Var.getPaddingBottom());
            k3Var.setShowOnlyValue(true);
            if (raVar.m32835j() == R.id.btn_inviteLinkDateSlider) {
                k3Var.m18393j("", View$OnClickListenerC3038s6.this.f10212x0, View$OnClickListenerC3038s6.this.f10214z0);
            } else if (raVar.m32835j() == R.id.btn_inviteLinkUserSlider) {
                k3Var.m18393j("", View$OnClickListenerC3038s6.this.f10210v0, View$OnClickListenerC3038s6.this.f10211w0);
            }
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32835j() == R.id.btn_inviteLinkDateLimit) {
                cVar.setData(View$OnClickListenerC3038s6.this.f10204C0 > 0 ? C4403w.m28001C1(View$OnClickListenerC3038s6.this.f10202A0 + View$OnClickListenerC3038s6.this.f10204C0, TimeUnit.SECONDS) : C4403w.m27869i1(R.string.InviteLinkNoLimitSet));
            } else if (raVar.m32835j() == R.id.btn_inviteLinkUserLimit) {
                int i = View$OnClickListenerC3038s6.this.f10205D0;
                if (View$OnClickListenerC3038s6.this.f10209H0 != null) {
                    i = View$OnClickListenerC3038s6.this.f10205D0 - View$OnClickListenerC3038s6.this.f10209H0.memberCount;
                }
                cVar.setData(View$OnClickListenerC3038s6.this.f10205D0 == 0 ? C4403w.m27869i1(R.string.InviteLinkNoLimitSet) : C4403w.m27844o2(R.string.InviteLinkRemains, i));
            } else if (raVar.m32835j() == R.id.btn_inviteLinkAdminApproval) {
                cVar.getToggler().m10186r(View$OnClickListenerC3038s6.this.f10207F0, false);
            }
        }

        @Override
        public void mo30690v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            y1Var.setText(View$OnClickListenerC3038s6.this.f10208G0);
        }
    }

    public static class C3041c {
        public final TdApi.ChatInviteLink f10218a;
        public final long f10219b;
        public final View$OnClickListenerC2855p0 f10220c;

        public C3041c(TdApi.ChatInviteLink chatInviteLink, long j, View$OnClickListenerC2855p0 p0Var) {
            this.f10218a = chatInviteLink;
            this.f10219b = j;
            this.f10220c = p0Var;
        }
    }

    static {
        int[] iArr = {3600, 86400, 604800};
        f10199I0 = iArr;
        f10201K0 = new String[]{C4403w.m27818v0(iArr[0]), C4403w.m27818v0(iArr[1]), C4403w.m27818v0(iArr[2]), C4403w.m27869i1(R.string.Infinity)};
    }

    public View$OnClickListenerC3038s6(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        String[] strArr = f10200J0;
        this.f10210v0 = strArr;
        this.f10211w0 = strArr.length - 1;
        String[] strArr2 = f10201K0;
        this.f10212x0 = strArr2;
        this.f10214z0 = strArr2.length - 1;
    }

    public void m31980Lf(long j) {
        this.f10204C0 = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        m31974Rf();
        this.f10203B0.m34130s3(R.id.btn_inviteLinkDateLimit);
        this.f10203B0.m34171g3(R.id.btn_inviteLinkDateSlider);
        m31986Ff();
    }

    public boolean m31979Mf(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        int t = C5070i.m24050t(str, -1);
        if (t < 0) {
            return false;
        }
        if (m31983If(t) && t != 0) {
            return false;
        }
        this.f10205D0 = Math.min(t, 99999);
        m31973Sf();
        this.f10203B0.m34171g3(R.id.btn_inviteLinkUserSlider);
        this.f10203B0.m34130s3(R.id.btn_inviteLinkUserLimit);
        m31986Ff();
        return true;
    }

    public void m31978Nf(TdApi.Object object) {
        if (object.getConstructor() == -205812476) {
            m9131x9().f10220c.m33140zh((TdApi.ChatInviteLink) object, m9131x9().f10218a);
            m9298Zb();
        } else if (object.getConstructor() == -1679978726) {
            C1379j0.m37302t0(object);
            m34626ff(false);
        }
    }

    public void m31977Of(final TdApi.Object object) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3038s6.this.m31978Nf(object);
            }
        });
    }

    public final void m31987Ef() {
        int N0 = this.f10203B0.m34224N0(R.id.btn_inviteLinkDateLimit);
        if (N0 != -1) {
            this.f10203B0.m34188b1(N0 + 3, m31985Gf());
        }
    }

    public final void m31986Ff() {
        if (!this.f10206E0) {
            mo31397hf(m31984Hf());
        }
    }

    public final C2964ra[] m31985Gf() {
        return new C2964ra[]{new C2964ra(8, 0, 0, R.string.InviteLinkLimitedByUsers), new C2964ra(2), new C2964ra(30, R.id.btn_inviteLinkUserSlider), new C2964ra(11), new C2964ra(89, R.id.btn_inviteLinkUserLimit, 0, R.string.InviteLinkLimitedByUsersCustom), new C2964ra(3), new C2964ra(9, 0, 0, R.string.InviteLinkLimitedByUsersHint)};
    }

    public final boolean m31984Hf() {
        TdApi.ChatInviteLink chatInviteLink = this.f10209H0;
        if (chatInviteLink == null || this.f10206E0 || this.f10205D0 != chatInviteLink.memberLimit) {
            return true;
        }
        int i = this.f10204C0;
        int i2 = chatInviteLink.expirationDate;
        return (i == (i2 == 0 ? 0 : i2 - this.f10202A0) && this.f10208G0.equals(chatInviteLink.name) && this.f10207F0 == this.f10209H0.createsJoinRequest) ? false : true;
    }

    public final boolean m31983If(int i) {
        TdApi.ChatInviteLink chatInviteLink = this.f10209H0;
        return chatInviteLink != null && i - chatInviteLink.memberCount < 0;
    }

    public final boolean m31982Jf() {
        int i = this.f10204C0;
        if (i != 0) {
            int[] iArr = f10199I0;
            if (i != iArr[0] && i != iArr[1] && i != iArr[2]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void mo30698K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (i == R.id.btn_inviteLinkName) {
            this.f10208G0 = y1Var.getText().toString();
            m31986Ff();
        }
    }

    public final boolean m31981Kf() {
        int i = this.f10205D0;
        return i == 0 || i == 1 || i == 10 || i == 50 || i == 100;
    }

    public final void m31976Pf() {
        int N0 = this.f10203B0.m34224N0(R.id.btn_inviteLinkDateLimit);
        if (N0 != -1) {
            this.f10203B0.m34204V1(N0 + 3, 7);
        }
    }

    public void m31975Qf(C3041c cVar) {
        super.m9476Ad(cVar);
        TdApi.ChatInviteLink chatInviteLink = cVar.f10218a;
        this.f10206E0 = chatInviteLink == null;
        if (chatInviteLink != null) {
            this.f10209H0 = chatInviteLink;
            this.f10204C0 = Math.max(0, (int) (chatInviteLink.expirationDate - this.f30167b.m2914C4(TimeUnit.SECONDS)));
            TdApi.ChatInviteLink chatInviteLink2 = cVar.f10218a;
            this.f10205D0 = chatInviteLink2.memberLimit;
            this.f10207F0 = chatInviteLink2.createsJoinRequest;
            this.f10208G0 = chatInviteLink2.name;
            m31973Sf();
            m31974Rf();
            return;
        }
        this.f10202A0 = (int) this.f30167b.m2914C4(TimeUnit.SECONDS);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_editChatLink;
    }

    @Override
    public int mo31415Re() {
        return R.id.theme_color_background;
    }

    public final void m31974Rf() {
        int[] iArr = m31982Jf() ? new int[]{3600, 86400, 604800, Integer.MAX_VALUE} : new int[]{3600, 86400, 604800, Integer.MAX_VALUE, this.f10204C0};
        Arrays.sort(iArr);
        C5146u0 u0Var = new C5146u0(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            u0Var.m23815b(i2 == Integer.MAX_VALUE ? C4403w.m27869i1(R.string.Infinity) : C4403w.m27818v0(i2));
            if (this.f10204C0 == i2) {
                this.f10214z0 = i;
            }
        }
        if (this.f10214z0 == -1) {
            this.f10214z0 = iArr.length - 1;
        }
        this.f10212x0 = u0Var.m23813d();
        this.f10213y0 = iArr;
        this.f10202A0 = (int) this.f30167b.m2914C4(TimeUnit.SECONDS);
    }

    public final void m31973Sf() {
        int[] iArr = m31981Kf() ? new int[]{1, 10, 50, 100, Integer.MAX_VALUE} : new int[]{1, 10, 50, 100, Integer.MAX_VALUE, this.f10205D0};
        Arrays.sort(iArr);
        C5146u0 u0Var = new C5146u0(iArr.length);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            TdApi.ChatInviteLink chatInviteLink = this.f10209H0;
            if (chatInviteLink == null || i2 >= chatInviteLink.memberCount) {
                u0Var.m23815b(i2 == Integer.MAX_VALUE ? C4403w.m27869i1(R.string.Infinity) : String.valueOf(i2));
            }
        }
        int e = u0Var.m23812e(String.valueOf(this.f10205D0));
        this.f10211w0 = e;
        if (e == -1) {
            this.f10211w0 = u0Var.m23813d().length - 1;
        }
        this.f10210v0 = u0Var.m23813d();
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(this.f10206E0 ? R.string.CreateLink : R.string.InviteLinkEdit);
    }

    @Override
    public void mo30697Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        m34628df(R.drawable.baseline_check_24);
        m34623jf(true);
        C3040b bVar = new C3040b(this);
        this.f10203B0 = bVar;
        bVar.m34211S2(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(7, R.id.btn_inviteLinkAdminApproval, 0, R.string.InviteLinkAdminApproval));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.InviteLinkAdminApprovalHint));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(68, R.id.btn_inviteLinkName, 0, R.string.InviteLinkAdminName));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.InviteLinkAdminNameHint));
        arrayList.add(new C2964ra(8, 0, 0, R.string.InviteLinkLimitedByPeriod));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(30, R.id.btn_inviteLinkDateSlider));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, R.id.btn_inviteLinkDateLimit, 0, R.string.InviteLinkLimitedByPeriodItem));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.InviteLinkLimitedByPeriodHint));
        TdApi.ChatInviteLink chatInviteLink = this.f10209H0;
        if (chatInviteLink == null || !chatInviteLink.createsJoinRequest) {
            arrayList.addAll(Arrays.asList(m31985Gf()));
        }
        this.f10203B0.m34116x2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.f10203B0);
        m31986Ff();
    }

    @Override
    public boolean mo30696af() {
        TdApi.Function function;
        m34626ff(true);
        int i = this.f10204C0;
        int i2 = 0;
        int i3 = i == 0 ? 0 : this.f10202A0 + i;
        Client r4 = this.f30167b.m2270r4();
        if (this.f10206E0) {
            long j = m9131x9().f10219b;
            String str = this.f10208G0;
            boolean z = this.f10207F0;
            if (!z) {
                i2 = this.f10205D0;
            }
            function = new TdApi.CreateChatInviteLink(j, str, i3, i2, z);
        } else {
            long j2 = m9131x9().f10219b;
            String str2 = m9131x9().f10218a.inviteLink;
            String str3 = this.f10208G0;
            boolean z2 = this.f10207F0;
            function = new TdApi.EditChatInviteLink(j2, str2, str3, i3, z2 ? 0 : this.f10205D0, z2);
        }
        r4.m14783o(function, new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3038s6.this.m31977Of(object);
            }
        });
        return true;
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (this.f10206E0 || !m31984Hf()) {
            return false;
        }
        m9179qe(null);
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_inviteLinkDateLimit) {
            C5320c cVar = new C5320c(4);
            C5146u0 u0Var = new C5146u0(4);
            C5320c cVar2 = new C5320c(4);
            AbstractC5920l o6Var = new AbstractC5920l() {
                @Override
                public final void mo3050a(long j) {
                    View$OnClickListenerC3038s6.this.m31980Lf(j);
                }
            };
            cVar.m23284a(R.id.btn_expireIn12h);
            u0Var.m23815b(C4403w.m27844o2(R.string.InviteLinkExpireInHours, 12L));
            cVar2.m23284a(R.drawable.baseline_schedule_24);
            cVar.m23284a(R.id.btn_expireIn2d);
            u0Var.m23815b(C4403w.m27844o2(R.string.InviteLinkExpireInDays, 2L));
            cVar2.m23284a(R.drawable.baseline_schedule_24);
            cVar.m23284a(R.id.btn_expireIn1w);
            u0Var.m23815b(C4403w.m27844o2(R.string.InviteLinkExpireInWeeks, 1L));
            cVar2.m23284a(R.drawable.baseline_schedule_24);
            cVar.m23284a(R.id.btn_expireIn2w);
            u0Var.m23815b(C4403w.m27844o2(R.string.InviteLinkExpireInWeeks, 2L));
            cVar2.m23284a(R.drawable.baseline_schedule_24);
            cVar.m23284a(R.id.btn_sendScheduledCustom);
            u0Var.m23815b(C4403w.m27869i1(R.string.InviteLinkExpireInCustomDate));
            cVar2.m23284a(R.drawable.baseline_date_range_24);
            m9261ee(null, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new C3039a(o6Var));
        } else if (view.getId() == R.id.btn_inviteLinkUserLimit) {
            m9364Pc(C4403w.m27869i1(R.string.InviteLinkLimitedByUsersItem), C4403w.m27869i1(R.string.InviteLinkLimitedByUsersAlertHint), R.string.Done, R.string.Cancel, String.valueOf(this.f10205D0), new AbstractC9323v4.AbstractC9336m() {
                @Override
                public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                    boolean Mf;
                    Mf = View$OnClickListenerC3038s6.this.m31979Mf(y1Var, str);
                    return Mf;
                }
            }, true).getEditText().setInputType(2);
        } else if (view.getId() == R.id.btn_inviteLinkAdminApproval) {
            boolean W2 = this.f10203B0.m34201W2(view);
            this.f10207F0 = W2;
            if (W2) {
                m31976Pf();
            } else {
                m31987Ef();
            }
            m31986Ff();
        }
    }

    @Override
    public boolean mo9134we() {
        return this.f10206E0 || !m31984Hf();
    }
}
