package p363zc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import be.C1357a0;
import gd.AbstractC4761s4;
import gd.C4618d7;
import java.util.ArrayList;
import me.C7030t1;
import org.thunderdog.challegram.R;
import p038ce.C2139ap;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p053dd.C4022o;
import p082fd.C4403w;
import p335xd.C10192g;
import p350yd.HandlerC10770jj;
import sc.AbstractC8809o;
import sc.View$OnClickListenerC8851y1;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC11498s extends AbstractC8809o<Void> implements View.OnClickListener {
    public C2546iq f36509I0;
    public final AbstractC4761s4 f36510J0;
    public final long[] f36511K0;
    public boolean f36512L0;

    public class C11499a extends C2546iq {
        public C11499a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo395U2(C2964ra raVar, int i, C4022o oVar, boolean z) {
            oVar.setUser(new C4618d7(View$OnClickListenerC11498s.this.f30167b, View$OnClickListenerC11498s.this.f30167b.m2541a4(raVar.m32832m())));
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32835j() == R.id.btn_openLink) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            t1Var.m18058E1(View$OnClickListenerC11498s.m396xg(View$OnClickListenerC11498s.this.f36510J0, View$OnClickListenerC11498s.this.f36511K0.length));
        }
    }

    public View$OnClickListenerC11498s(View$OnClickListenerC8851y1 y1Var, AbstractC4761s4 s4Var, long[] jArr) {
        super(y1Var, m396xg(s4Var, jArr.length).toString());
        this.f36510J0 = s4Var;
        this.f36511K0 = jArr;
    }

    public static String m397wg(AbstractC4761s4 s4Var) {
        int constructor = s4Var.m25993Z3().content.getConstructor();
        if (constructor == 527777781) {
            return C4403w.m27869i1(R.string.MessageSeenNobodyListened);
        }
        if (constructor != 963323014) {
            return C4403w.m27869i1(R.string.MessageSeenNobody);
        }
        return C4403w.m27869i1(R.string.MessageSeenNobodyPlayed);
    }

    public static CharSequence m396xg(AbstractC4761s4 s4Var, int i) {
        int constructor = s4Var.m25993Z3().content.getConstructor();
        if (constructor == 527777781) {
            return C4403w.m27836q2(R.string.MessageSeenXListened, i);
        }
        if (constructor != 963323014) {
            return C4403w.m27836q2(R.string.xViews, i);
        }
        return C4403w.m27836q2(R.string.MessageSeenXPlayed, i);
    }

    @Override
    public int mo408A9() {
        return 4;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_messageSeen;
    }

    @Override
    public boolean mo406cf() {
        return this.f36512L0;
    }

    @Override
    public ViewGroup mo405hf() {
        return new FrameLayout(this.f30165a);
    }

    @Override
    public boolean mo404jc(boolean z) {
        this.f28440n0.m11112u2(false);
        return true;
    }

    @Override
    public View mo403oc(Context context) {
        boolean z = false;
        m11301bf(false);
        m11289jg(new LinearLayoutManager(mo4347s(), 1, false));
        this.f36509I0 = new C11499a(this);
        C10192g.m5781j(this.f28450x0, R.id.theme_color_background);
        ArrayList arrayList = new ArrayList();
        for (long j : this.f36511K0) {
            arrayList.add(new C2964ra(27, R.id.user).m32863N(j));
        }
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, R.id.description, 0, R.string.MessageSeenPrivacy));
        arrayList.add(new C2964ra(42));
        this.f36509I0.m34113y2((C2964ra[]) arrayList.toArray(new C2964ra[0]), false);
        m11327Jf();
        if (mo401tf() == super.mo401tf()) {
            z = true;
        }
        this.f36512L0 = z;
        if (z) {
            C2546iq iqVar = this.f36509I0;
            iqVar.m34147n1(iqVar.mo6153D() - 1);
        }
        m11293hg(this.f36509I0);
        return this.f28448v0;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.user) {
            this.f28440n0.m11112u2(false);
            this.f30167b.m2485dd().m3429v7(this, ((C2964ra) view.getTag()).m32832m(), new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view)));
        }
    }

    @Override
    public int mo401tf() {
        int i;
        if (this.f36511K0 == null) {
            return super.mo401tf();
        }
        int W = C2139ap.m35479W(27);
        long[] jArr = this.f36511K0;
        int length = W * jArr.length;
        for (int length2 = jArr.length; length2 < this.f36509I0.mo6153D(); length2++) {
            C2964ra raVar = this.f36509I0.m34240F0().get(length2);
            if (raVar.m32876A() == 9) {
                i = C1357a0.m37541i(24.0f);
            } else {
                i = C2139ap.m35479W(raVar.m32876A());
            }
            length += i;
        }
        return Math.min(super.mo401tf(), length);
    }
}
