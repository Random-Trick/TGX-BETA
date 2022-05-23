package ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce.a0;
import de.ap;
import de.iq;
import de.ra;
import gd.w;
import hd.d7;
import hd.s4;
import java.util.ArrayList;
import ne.t1;
import org.thunderdog.challegram.R;
import tc.o;
import tc.y1;
import uc.c;
import ud.v4;
import yd.g;
import zd.hj;

public class s extends o<Void> implements View.OnClickListener {
    public iq I0;
    public final s4 J0;
    public final long[] K0;
    public boolean L0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void Q2(ra raVar, int i10, ed.o oVar, boolean z10) {
            oVar.setUser(new d7(s.this.f24495b, s.this.f24495b.e4(raVar.m())));
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_openLink) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }

        @Override
        public void o2(ra raVar, int i10, t1 t1Var) {
            t1Var.B1(s.xg(s.this.J0, s.this.K0.length));
        }
    }

    public s(y1 y1Var, s4 s4Var, long[] jArr) {
        super(y1Var, xg(s4Var, jArr.length).toString());
        this.J0 = s4Var;
        this.K0 = jArr;
    }

    public static String wg(s4 s4Var) {
        int constructor = s4Var.X3().content.getConstructor();
        if (constructor == 527777781) {
            return w.i1(R.string.MessageSeenNobodyListened);
        }
        if (constructor != 963323014) {
            return w.i1(R.string.MessageSeenNobody);
        }
        return w.i1(R.string.MessageSeenNobodyPlayed);
    }

    public static CharSequence xg(s4 s4Var, int i10) {
        int constructor = s4Var.X3().content.getConstructor();
        if (constructor == 527777781) {
            return w.q2(R.string.MessageSeenXListened, i10);
        }
        if (constructor != 963323014) {
            return w.q2(R.string.xViews, i10);
        }
        return w.q2(R.string.MessageSeenXPlayed, i10);
    }

    @Override
    public int A9() {
        return 4;
    }

    @Override
    public int R9() {
        return R.id.controller_messageSeen;
    }

    @Override
    public boolean cf() {
        return this.L0;
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
        boolean z10 = false;
        bf(false);
        jg(new LinearLayoutManager(t(), 1, false));
        this.I0 = new a(this);
        g.j(this.f23277x0, R.id.theme_color_background);
        ArrayList arrayList = new ArrayList();
        for (long j10 : this.K0) {
            arrayList.add(new ra(27, R.id.user).N(j10));
        }
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, R.id.description, 0, R.string.MessageSeenPrivacy));
        arrayList.add(new ra(42));
        this.I0.t2((ra[]) arrayList.toArray(new ra[0]), false);
        Jf();
        if (tf() == super.tf()) {
            z10 = true;
        }
        this.L0 = z10;
        if (z10) {
            iq iqVar = this.I0;
            iqVar.j1(iqVar.D() - 1);
        }
        hg(this.I0);
        return this.f23275v0;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.user) {
            this.f23267n0.p2(false);
            this.f24495b.hd().v7(this, ((ra) view.getTag()).m(), new hj.q().s(t().I3().g(view)));
        }
    }

    @Override
    public int tf() {
        int i10;
        if (this.K0 == null) {
            return super.tf();
        }
        int W = ap.W(27);
        long[] jArr = this.K0;
        int length = W * jArr.length;
        for (int length2 = jArr.length; length2 < this.I0.D(); length2++) {
            ra raVar = this.I0.D0().get(length2);
            if (raVar.A() == 9) {
                i10 = a0.i(24.0f);
            } else {
                i10 = ap.W(raVar.A());
            }
            length += i10;
        }
        return Math.min(super.tf(), length);
    }
}
