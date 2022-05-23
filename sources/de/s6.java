package de;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import de.iq;
import de.s6;
import gd.w;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kb.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.k3;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class s6 extends g6<c> implements View.OnClickListener, iq.e {
    public static final int[] I0;
    public static final String[] J0 = {"1", "10", "50", "100", w.i1(R.string.Infinity)};
    public static final String[] K0;
    public int A0;
    public iq B0;
    public int C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public TdApi.ChatInviteLink H0;
    public String[] f9456v0;
    public int f9457w0;
    public String[] f9458x0;
    public int f9460z0;
    public int[] f9459y0 = I0;
    public String G0 = "";

    public class a implements h0 {
        public final l f9461a;

        public a(l lVar) {
            this.f9461a = lVar;
        }

        public void b(l lVar, long j10) {
            lVar.a(j10 - s6.this.f24495b.H4());
        }

        @Override
        public boolean P() {
            return g0.a(this);
        }

        @Override
        public Object a2(int i10) {
            return g0.b(this, i10);
        }

        @Override
        public boolean r3(View view, int i10) {
            long j10;
            if (i10 != R.id.btn_sendScheduledCustom) {
                switch (i10) {
                    case R.id.btn_expireIn12h:
                        j10 = TimeUnit.HOURS.toMillis(12L);
                        break;
                    case R.id.btn_expireIn1w:
                        j10 = TimeUnit.DAYS.toMillis(7L);
                        break;
                    case R.id.btn_expireIn2d:
                        j10 = TimeUnit.DAYS.toMillis(2L);
                        break;
                    case R.id.btn_expireIn2w:
                        j10 = TimeUnit.DAYS.toMillis(14L);
                        break;
                    default:
                        return false;
                }
                this.f9461a.a(j10);
                return true;
            }
            s6 s6Var = s6.this;
            String i12 = w.i1(R.string.InviteLinkExpireTitle);
            final l lVar = this.f9461a;
            s6Var.Xd(i12, R.string.InviteLinkExpireToday, R.string.InviteLinkExpireTomorrow, R.string.InviteLinkExpireFuture, new l() {
                @Override
                public final void a(long j11) {
                    s6.a.this.b(lVar, j11);
                }
            }, null);
            return true;
        }
    }

    public class b extends iq {
        public b(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void D1(ra raVar, k3 k3Var, int i10, int i11) {
            int i12 = 0;
            if (raVar.j() == R.id.btn_inviteLinkDateSlider) {
                s6 s6Var = s6.this;
                if (i10 != s6Var.f9458x0.length - 1) {
                    i12 = s6.this.f9459y0[i10];
                }
                s6Var.C0 = i12;
                s6.this.B0.p3(R.id.btn_inviteLinkDateLimit);
            } else if (raVar.j() == R.id.btn_inviteLinkUserSlider) {
                s6 s6Var2 = s6.this;
                if (i10 != s6Var2.f9456v0.length - 1) {
                    i12 = Integer.parseInt(s6.this.f9456v0[i10]);
                }
                s6Var2.D0 = i12;
                s6.this.B0.p3(R.id.btn_inviteLinkUserLimit);
            }
            s6.this.Ff();
        }

        @Override
        public void K2(ra raVar, k3 k3Var) {
            k3Var.setPadding(k3Var.getPaddingLeft(), k3Var.getPaddingTop(), a0.i(16.0f), k3Var.getPaddingBottom());
            k3Var.setShowOnlyValue(true);
            if (raVar.j() == R.id.btn_inviteLinkDateSlider) {
                k3Var.j("", s6.this.f9458x0, s6.this.f9460z0);
            } else if (raVar.j() == R.id.btn_inviteLinkUserSlider) {
                k3Var.j("", s6.this.f9456v0, s6.this.f9457w0);
            }
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_inviteLinkDateLimit) {
                cVar.setData(s6.this.C0 > 0 ? w.C1(s6.this.A0 + s6.this.C0, TimeUnit.SECONDS) : w.i1(R.string.InviteLinkNoLimitSet));
            } else if (raVar.j() == R.id.btn_inviteLinkUserLimit) {
                int i10 = s6.this.D0;
                if (s6.this.H0 != null) {
                    i10 = s6.this.D0 - s6.this.H0.memberCount;
                }
                cVar.setData(s6.this.D0 == 0 ? w.i1(R.string.InviteLinkNoLimitSet) : w.o2(R.string.InviteLinkRemains, i10));
            } else if (raVar.j() == R.id.btn_inviteLinkAdminApproval) {
                cVar.getToggler().r(s6.this.F0, false);
            }
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            y1Var.setText(s6.this.G0);
        }
    }

    public static class c {
        public final TdApi.ChatInviteLink f9464a;
        public final long f9465b;
        public final p0 f9466c;

        public c(TdApi.ChatInviteLink chatInviteLink, long j10, p0 p0Var) {
            this.f9464a = chatInviteLink;
            this.f9465b = j10;
            this.f9466c = p0Var;
        }
    }

    static {
        int[] iArr = {3600, 86400, 604800};
        I0 = iArr;
        K0 = new String[]{w.v0(iArr[0]), w.v0(iArr[1]), w.v0(iArr[2]), w.i1(R.string.Infinity)};
    }

    public s6(Context context, o6 o6Var) {
        super(context, o6Var);
        String[] strArr = J0;
        this.f9456v0 = strArr;
        this.f9457w0 = strArr.length - 1;
        String[] strArr2 = K0;
        this.f9458x0 = strArr2;
        this.f9460z0 = strArr2.length - 1;
    }

    public void Lf(long j10) {
        this.C0 = (int) TimeUnit.MILLISECONDS.toSeconds(j10);
        Rf();
        this.B0.p3(R.id.btn_inviteLinkDateLimit);
        this.B0.d3(R.id.btn_inviteLinkDateSlider);
        Ff();
    }

    public boolean Mf(y1 y1Var, String str) {
        int t10 = i.t(str, -1);
        if (t10 < 0) {
            return false;
        }
        if (If(t10) && t10 != 0) {
            return false;
        }
        this.D0 = Math.min(t10, 99999);
        Sf();
        this.B0.d3(R.id.btn_inviteLinkUserSlider);
        this.B0.p3(R.id.btn_inviteLinkUserLimit);
        Ff();
        return true;
    }

    public void Nf(TdApi.Object object) {
        if (object.getConstructor() == -205812476) {
            x9().f9466c.zh((TdApi.ChatInviteLink) object, x9().f9464a);
            Zb();
        } else if (object.getConstructor() == -1679978726) {
            j0.t0(object);
            ff(false);
        }
    }

    public void Of(final TdApi.Object object) {
        wd(new Runnable() {
            @Override
            public final void run() {
                s6.this.Nf(object);
            }
        });
    }

    public final void Ef() {
        int L0 = this.B0.L0(R.id.btn_inviteLinkDateLimit);
        if (L0 != -1) {
            this.B0.Y0(L0 + 3, Gf());
        }
    }

    public final void Ff() {
        if (!this.E0) {
            hf(Hf());
        }
    }

    public final ra[] Gf() {
        return new ra[]{new ra(8, 0, 0, R.string.InviteLinkLimitedByUsers), new ra(2), new ra(30, R.id.btn_inviteLinkUserSlider), new ra(11), new ra(89, R.id.btn_inviteLinkUserLimit, 0, R.string.InviteLinkLimitedByUsersCustom), new ra(3), new ra(9, 0, 0, R.string.InviteLinkLimitedByUsersHint)};
    }

    public final boolean Hf() {
        TdApi.ChatInviteLink chatInviteLink = this.H0;
        if (chatInviteLink == null || this.E0 || this.D0 != chatInviteLink.memberLimit) {
            return true;
        }
        int i10 = this.C0;
        int i11 = chatInviteLink.expirationDate;
        return (i10 == (i11 == 0 ? 0 : i11 - this.A0) && this.G0.equals(chatInviteLink.name) && this.F0 == this.H0.createsJoinRequest) ? false : true;
    }

    public final boolean If(int i10) {
        TdApi.ChatInviteLink chatInviteLink = this.H0;
        return chatInviteLink != null && i10 - chatInviteLink.memberCount < 0;
    }

    public final boolean Jf() {
        int i10 = this.C0;
        if (i10 != 0) {
            int[] iArr = I0;
            if (i10 != iArr[0] && i10 != iArr[1] && i10 != iArr[2]) {
                return false;
            }
        }
        return true;
    }

    public final boolean Kf() {
        int i10 = this.D0;
        return i10 == 0 || i10 == 1 || i10 == 10 || i10 == 50 || i10 == 100;
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        if (i10 == R.id.btn_inviteLinkName) {
            this.G0 = y1Var.getText().toString();
            Ff();
        }
    }

    public final void Pf() {
        int L0 = this.B0.L0(R.id.btn_inviteLinkDateLimit);
        if (L0 != -1) {
            this.B0.R1(L0 + 3, 7);
        }
    }

    public void Qf(c cVar) {
        super.Ad(cVar);
        TdApi.ChatInviteLink chatInviteLink = cVar.f9464a;
        this.E0 = chatInviteLink == null;
        if (chatInviteLink != null) {
            this.H0 = chatInviteLink;
            this.C0 = Math.max(0, (int) (chatInviteLink.expirationDate - this.f24495b.G4(TimeUnit.SECONDS)));
            TdApi.ChatInviteLink chatInviteLink2 = cVar.f9464a;
            this.D0 = chatInviteLink2.memberLimit;
            this.F0 = chatInviteLink2.createsJoinRequest;
            this.G0 = chatInviteLink2.name;
            Sf();
            Rf();
            return;
        }
        this.A0 = (int) this.f24495b.G4(TimeUnit.SECONDS);
    }

    @Override
    public int R9() {
        return R.id.controller_editChatLink;
    }

    @Override
    public int Re() {
        return R.id.theme_color_background;
    }

    public final void Rf() {
        int[] iArr = Jf() ? new int[]{3600, 86400, 604800, Integer.MAX_VALUE} : new int[]{3600, 86400, 604800, Integer.MAX_VALUE, this.C0};
        Arrays.sort(iArr);
        u0 u0Var = new u0(iArr.length);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            u0Var.b(i11 == Integer.MAX_VALUE ? w.i1(R.string.Infinity) : w.v0(i11));
            if (this.C0 == i11) {
                this.f9460z0 = i10;
            }
        }
        if (this.f9460z0 == -1) {
            this.f9460z0 = iArr.length - 1;
        }
        this.f9458x0 = u0Var.d();
        this.f9459y0 = iArr;
        this.A0 = (int) this.f24495b.G4(TimeUnit.SECONDS);
    }

    public final void Sf() {
        int[] iArr = Kf() ? new int[]{1, 10, 50, 100, Integer.MAX_VALUE} : new int[]{1, 10, 50, 100, Integer.MAX_VALUE, this.D0};
        Arrays.sort(iArr);
        u0 u0Var = new u0(iArr.length);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            TdApi.ChatInviteLink chatInviteLink = this.H0;
            if (chatInviteLink == null || i11 >= chatInviteLink.memberCount) {
                u0Var.b(i11 == Integer.MAX_VALUE ? w.i1(R.string.Infinity) : String.valueOf(i11));
            }
        }
        int e10 = u0Var.e(String.valueOf(this.D0));
        this.f9457w0 = e10;
        if (e10 == -1) {
            this.f9457w0 = u0Var.d().length - 1;
        }
        this.f9456v0 = u0Var.d();
    }

    @Override
    public CharSequence X9() {
        return w.i1(this.E0 ? R.string.CreateLink : R.string.InviteLinkEdit);
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        df(R.drawable.baseline_check_24);
        jf(true);
        b bVar = new b(this);
        this.B0 = bVar;
        bVar.O2(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(7, R.id.btn_inviteLinkAdminApproval, 0, R.string.InviteLinkAdminApproval));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.InviteLinkAdminApprovalHint));
        arrayList.add(new ra(2));
        arrayList.add(new ra(68, R.id.btn_inviteLinkName, 0, R.string.InviteLinkAdminName));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.InviteLinkAdminNameHint));
        arrayList.add(new ra(8, 0, 0, R.string.InviteLinkLimitedByPeriod));
        arrayList.add(new ra(2));
        arrayList.add(new ra(30, R.id.btn_inviteLinkDateSlider));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, R.id.btn_inviteLinkDateLimit, 0, R.string.InviteLinkLimitedByPeriodItem));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.InviteLinkLimitedByPeriodHint));
        TdApi.ChatInviteLink chatInviteLink = this.H0;
        if (chatInviteLink == null || !chatInviteLink.createsJoinRequest) {
            arrayList.addAll(Arrays.asList(Gf()));
        }
        this.B0.s2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.B0);
        Ff();
    }

    @Override
    public boolean af() {
        TdApi.Function function;
        ff(true);
        int i10 = this.C0;
        int i11 = 0;
        int i12 = i10 == 0 ? 0 : this.A0 + i10;
        Client v42 = this.f24495b.v4();
        if (this.E0) {
            long j10 = x9().f9465b;
            String str = this.G0;
            boolean z10 = this.F0;
            if (!z10) {
                i11 = this.D0;
            }
            function = new TdApi.CreateChatInviteLink(j10, str, i12, i11, z10);
        } else {
            long j11 = x9().f9465b;
            String str2 = x9().f9464a.inviteLink;
            String str3 = this.G0;
            boolean z11 = this.F0;
            function = new TdApi.EditChatInviteLink(j11, str2, str3, i12, z11 ? 0 : this.D0, z11);
        }
        v42.o(function, new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                s6.this.Of(object);
            }
        });
        return true;
    }

    @Override
    public boolean jc(boolean z10) {
        if (this.E0 || !Hf()) {
            return false;
        }
        qe(null);
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_inviteLinkDateLimit) {
            jb.c cVar = new jb.c(4);
            u0 u0Var = new u0(4);
            jb.c cVar2 = new jb.c(4);
            l o6Var = new l() {
                @Override
                public final void a(long j10) {
                    s6.this.Lf(j10);
                }
            };
            cVar.a(R.id.btn_expireIn12h);
            u0Var.b(w.o2(R.string.InviteLinkExpireInHours, 12L));
            cVar2.a(R.drawable.baseline_schedule_24);
            cVar.a(R.id.btn_expireIn2d);
            u0Var.b(w.o2(R.string.InviteLinkExpireInDays, 2L));
            cVar2.a(R.drawable.baseline_schedule_24);
            cVar.a(R.id.btn_expireIn1w);
            u0Var.b(w.o2(R.string.InviteLinkExpireInWeeks, 1L));
            cVar2.a(R.drawable.baseline_schedule_24);
            cVar.a(R.id.btn_expireIn2w);
            u0Var.b(w.o2(R.string.InviteLinkExpireInWeeks, 2L));
            cVar2.a(R.drawable.baseline_schedule_24);
            cVar.a(R.id.btn_sendScheduledCustom);
            u0Var.b(w.i1(R.string.InviteLinkExpireInCustomDate));
            cVar2.a(R.drawable.baseline_date_range_24);
            ee(null, cVar.e(), u0Var.d(), null, cVar2.e(), new a(o6Var));
        } else if (view.getId() == R.id.btn_inviteLinkUserLimit) {
            Pc(w.i1(R.string.InviteLinkLimitedByUsersItem), w.i1(R.string.InviteLinkLimitedByUsersAlertHint), R.string.Done, R.string.Cancel, String.valueOf(this.D0), new v4.m() {
                @Override
                public final boolean a(y1 y1Var, String str) {
                    boolean Mf;
                    Mf = s6.this.Mf(y1Var, str);
                    return Mf;
                }
            }, true).getEditText().setInputType(2);
        } else if (view.getId() == R.id.btn_inviteLinkAdminApproval) {
            boolean S2 = this.B0.S2(view);
            this.F0 = S2;
            if (S2) {
                Pf();
            } else {
                Ef();
            }
            Ff();
        }
    }

    @Override
    public boolean we() {
        return this.E0 || !Hf();
    }
}
