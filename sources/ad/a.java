package ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import de.iq;
import de.ra;
import gd.w;
import hd.c3;
import hd.t2;
import java.util.ArrayList;
import je.l0;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.n0;
import ne.y3;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import tc.o;
import tc.y1;
import ud.d1;
import ud.v4;
import vc.n;
import yd.g;
import zd.hj;

public class a extends o<Void> implements View.OnClickListener {
    public final int I0 = a0.i(16.0f);
    public iq J0;
    public iq K0;
    public final Runnable L0;
    public final TdApi.ChatInviteLinkInfo M0;
    public int N0;

    public class C0020a extends iq {
        public C0020a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void Z1(ra raVar, y3 y3Var) {
            y3Var.setChat((c3) raVar.d());
            y3Var.L();
        }
    }

    public class b extends iq {
        public b(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void D2(ra raVar, RecyclerView recyclerView, boolean z10) {
            recyclerView.setAdapter(a.this.K0);
        }

        @Override
        public void N2(ra raVar, n0 n0Var, boolean z10) {
            if (raVar.j() == R.id.description) {
                n0Var.setPadding(a.this.I0, a.this.I0, a.this.I0, a.this.I0 / 2);
                n0Var.y(raVar.u(), l0.E(a.this.f24495b, raVar.u().toString(), e.E0(raVar.u().toString()), new hj.q().s(a.this.t().I3().g(n0Var))), false);
                n0Var.setTextSize(15.0f);
                return;
            }
            n0Var.setPadding(0, 0, 0, 0);
            super.N2(raVar, n0Var, z10);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_join) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }

        @Override
        public void a2(ra raVar, int i10, n nVar) {
            nVar.v(a.this.f24495b, a.this.M0);
        }
    }

    public class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a.this.f23277x0.removeOnLayoutChangeListener(this);
            a aVar = a.this;
            aVar.N0 = aVar.f23277x0.getMeasuredHeight();
            a.this.Jf();
        }
    }

    public a(y1 y1Var, TdApi.ChatInviteLinkInfo chatInviteLinkInfo, Runnable runnable) {
        super(y1Var, "");
        this.M0 = chatInviteLinkInfo;
        this.L0 = runnable;
    }

    @Override
    public int A9() {
        return 4;
    }

    @Override
    public boolean If() {
        return true;
    }

    @Override
    public int R9() {
        return R.id.controller_joinDialog;
    }

    @Override
    public boolean cf() {
        return false;
    }

    @Override
    public ViewGroup hf() {
        return new FrameLayout(this.f24493a);
    }

    @Override
    public boolean jc(boolean z10) {
        this.f23267n0.p2(false);
        return true;
    }

    @Override
    public View oc(Context context) {
        bf(false);
        jg(new LinearLayoutManager(t(), 1, false));
        this.K0 = new C0020a(this);
        this.J0 = new b(this);
        g.j(this.f23277x0, R.id.theme_color_filling);
        boolean N2 = t2.N2(this.M0.type);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(132));
        String str = this.M0.description;
        if (str != null && str.length() > 0) {
            arrayList.add(new ra(100, (int) R.id.description, 0, (CharSequence) this.M0.description, false));
        }
        long[] jArr = this.M0.memberUserIds;
        if (jArr != null && jArr.length > 0) {
            arrayList.add(new ra(58));
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < this.M0.memberUserIds.length; i10++) {
                arrayList2.add(new ra(59, R.id.user).N(this.M0.memberUserIds[i10]).G(new c3(this.f24495b, this.M0.memberUserIds[i10]).D()));
            }
            this.K0.t2((ra[]) arrayList2.toArray(new ra[0]), false);
        }
        if (this.M0.createsJoinRequest) {
            arrayList.add(new ra(28, (int) R.id.y_res_0x7f07044a, 0, (CharSequence) w.i1(N2 ? R.string.RequestToJoinChannelInfo : R.string.RequestToJoinGroupInfo), false));
        }
        arrayList.add(new ra(4, (int) R.id.btn_join, (int) R.drawable.baseline_person_add_24, (CharSequence) w.i1(this.M0.createsJoinRequest ? N2 ? R.string.RequestJoinChannelBtn : R.string.RequestJoinGroupBtn : N2 ? R.string.JoinChannel : R.string.JoinChat), false).d0(R.id.theme_color_textNeutral));
        arrayList.add(new ra(4, R.id.btn_cancel, R.drawable.baseline_cancel_24, R.string.Cancel));
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -2);
        q12.topMargin = d1.a3(false);
        q12.bottomMargin = d1.getTopOffset();
        this.f23277x0.setLayoutParams(q12);
        this.J0.t2((ra[]) arrayList.toArray(new ra[0]), false);
        Jf();
        this.f23277x0.addOnLayoutChangeListener(new c());
        hg(this.J0);
        return this.f23275v0;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_join) {
            this.f23267n0.p2(false);
            this.L0.run();
        } else if (view.getId() == R.id.btn_cancel) {
            this.f23267n0.p2(false);
        } else if (view.getId() == R.id.user) {
            this.f23267n0.p2(false);
            this.f24495b.hd().v7(this, ((ra) view.getTag()).m(), new hj.q().s(t().I3().g(view)));
        }
    }

    @Override
    public int tf() {
        int i10 = this.N0;
        return i10 != 0 ? i10 : super.tf();
    }
}
