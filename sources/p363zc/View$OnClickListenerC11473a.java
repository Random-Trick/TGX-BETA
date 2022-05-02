package p363zc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import gd.C4601c3;
import gd.C4779t2;
import ie.AbstractC5411l0;
import java.util.ArrayList;
import me.C6973n0;
import me.C7093z3;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p082fd.C4403w;
import p193nb.C7321e;
import p291uc.C9621o;
import p335xd.C10192g;
import p350yd.HandlerC10770jj;
import sc.AbstractC8809o;
import sc.View$OnClickListenerC8851y1;
import tc.C9137c;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC11473a extends AbstractC8809o<Void> implements View.OnClickListener {
    public final int f36451I0 = C1357a0.m37544i(16.0f);
    public C2546iq f36452J0;
    public C2546iq f36453K0;
    public final Runnable f36454L0;
    public final TdApi.ChatInviteLinkInfo f36455M0;
    public int f36456N0;

    public class C11474a extends C2546iq {
        public C11474a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo505d2(C2964ra raVar, C7093z3 z3Var) {
            z3Var.setChat((C4601c3) raVar.m32847d());
            z3Var.m18511K();
        }
    }

    public class C11475b extends C2546iq {
        public C11475b(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo504H2(C2964ra raVar, RecyclerView recyclerView, boolean z) {
            recyclerView.setAdapter(View$OnClickListenerC11473a.this.f36453K0);
        }

        @Override
        public void mo503R2(C2964ra raVar, C6973n0 n0Var, boolean z) {
            if (raVar.m32838j() == R.id.description) {
                n0Var.setPadding(View$OnClickListenerC11473a.this.f36451I0, View$OnClickListenerC11473a.this.f36451I0, View$OnClickListenerC11473a.this.f36451I0, View$OnClickListenerC11473a.this.f36451I0 / 2);
                n0Var.m18246y(raVar.m32827u(), AbstractC5411l0.m22791E(View$OnClickListenerC11473a.this.f30170b, raVar.m32827u().toString(), C7321e.m17014C0(raVar.m32827u().toString()), new HandlerC10770jj.C10788q().m3312s(View$OnClickListenerC11473a.this.mo4347s().m14584H3().m8985g(n0Var))), false);
                n0Var.setTextSize(15.0f);
                return;
            }
            n0Var.setPadding(0, 0, 0, 0);
            super.mo503R2(raVar, n0Var, z);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32838j() == R.id.btn_join) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }

        @Override
        public void mo502e2(C2964ra raVar, int i, C9621o oVar) {
            oVar.m7994t(View$OnClickListenerC11473a.this.f30170b, View$OnClickListenerC11473a.this.f36455M0);
        }
    }

    public class View$OnLayoutChangeListenerC11476c implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC11476c() {
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View$OnClickListenerC11473a.this.f28453x0.removeOnLayoutChangeListener(this);
            View$OnClickListenerC11473a aVar = View$OnClickListenerC11473a.this;
            aVar.f36456N0 = aVar.f28453x0.getMeasuredHeight();
            View$OnClickListenerC11473a.this.m11326Jf();
        }
    }

    public View$OnClickListenerC11473a(View$OnClickListenerC8851y1 y1Var, TdApi.ChatInviteLinkInfo chatInviteLinkInfo, Runnable runnable) {
        super(y1Var, "");
        this.f36455M0 = chatInviteLinkInfo;
        this.f36454L0 = runnable;
    }

    @Override
    public int mo408A9() {
        return 4;
    }

    @Override
    public boolean mo514If() {
        return true;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_joinDialog;
    }

    @Override
    public boolean mo406cf() {
        return false;
    }

    @Override
    public ViewGroup mo405hf() {
        return new FrameLayout(this.f30168a);
    }

    @Override
    public boolean mo404jc(boolean z) {
        this.f28443n0.m11111u2(false);
        return true;
    }

    @Override
    public View mo403oc(Context context) {
        m11300bf(false);
        m11288jg(new LinearLayoutManager(mo4347s(), 1, false));
        this.f36453K0 = new C11474a(this);
        this.f36452J0 = new C11475b(this);
        C10192g.m5781j(this.f28453x0, R.id.theme_color_filling);
        boolean N2 = C4779t2.m25638N2(this.f36455M0.type);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(132));
        String str = this.f36455M0.description;
        if (str != null && str.length() > 0) {
            arrayList.add(new C2964ra(100, (int) R.id.description, 0, (CharSequence) this.f36455M0.description, false));
        }
        long[] jArr = this.f36455M0.memberUserIds;
        if (jArr != null && jArr.length > 0) {
            arrayList.add(new C2964ra(58));
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < this.f36455M0.memberUserIds.length; i++) {
                arrayList2.add(new C2964ra(59, R.id.user).m32866N(this.f36455M0.memberUserIds[i]).m32873G(new C4601c3(this.f30170b, this.f36455M0.memberUserIds[i]).m27063D()));
            }
            this.f36453K0.m34116y2((C2964ra[]) arrayList2.toArray(new C2964ra[0]), false);
        }
        if (this.f36455M0.createsJoinRequest) {
            arrayList.add(new C2964ra(28, (int) R.id.y_res_0x7f070448, 0, (CharSequence) C4403w.m27871i1(N2 ? R.string.RequestToJoinChannelInfo : R.string.RequestToJoinGroupInfo), false));
        }
        arrayList.add(new C2964ra(4, (int) R.id.btn_join, (int) R.drawable.baseline_person_add_24, (CharSequence) C4403w.m27871i1(this.f36455M0.createsJoinRequest ? N2 ? R.string.RequestJoinChannelBtn : R.string.RequestJoinGroupBtn : N2 ? R.string.JoinChannel : R.string.JoinChat), false).m32846d0(R.id.theme_color_textNeutral));
        arrayList.add(new C2964ra(4, R.id.btn_cancel, R.drawable.baseline_cancel_24, R.string.Cancel));
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -2);
        s1.topMargin = View$OnClickListenerC9170d1.m10065c3(false);
        s1.bottomMargin = View$OnClickListenerC9170d1.getTopOffset();
        this.f28453x0.setLayoutParams(s1);
        this.f36452J0.m34116y2((C2964ra[]) arrayList.toArray(new C2964ra[0]), false);
        m11326Jf();
        this.f28453x0.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC11476c());
        m11292hg(this.f36452J0);
        return this.f28451v0;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_join) {
            this.f28443n0.m11111u2(false);
            this.f36454L0.run();
        } else if (view.getId() == R.id.btn_cancel) {
            this.f28443n0.m11111u2(false);
        } else if (view.getId() == R.id.user) {
            this.f28443n0.m11111u2(false);
            this.f30170b.m2485dd().m3429v7(this, ((C2964ra) view.getTag()).m32835m(), new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view)));
        }
    }

    @Override
    public int mo401tf() {
        int i = this.f36456N0;
        return i != 0 ? i : super.mo401tf();
    }
}
