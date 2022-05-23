package ed;

import ae.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import db.g;
import hd.d7;
import java.util.List;
import k0.e;
import oc.v0;
import org.thunderdog.challegram.R;
import tc.f;
import ud.v4;
import zd.o6;

public class l extends RecyclerView.h<b> implements View.OnClickListener, View.OnLongClickListener, f {
    public final v4<?> M;
    public final a N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final v4<?> R;
    public List<d7> S;
    public final e<d7> T;

    public interface a {
        void n0(d7 d7Var);

        void u0(int i10, d7 d7Var, boolean z10);
    }

    public static class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }

        public static b O(Context context, o6 o6Var, int i10, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, v4<?> v4Var) {
            if (i10 == 0) {
                int i11 = a0.i(18.0f);
                o oVar = new o(context, o6Var);
                oVar.setOffsetLeft(i11);
                if (v4Var != null) {
                    v4Var.t8(oVar);
                }
                if (!(onClickListener == null && onLongClickListener == null)) {
                    oVar.setOnClickListener(onClickListener);
                    oVar.setOnLongClickListener(onLongClickListener);
                    g.d(oVar, j.x(R.id.theme_color_chatBackground));
                    p0.T(oVar);
                }
                return new b(oVar);
            } else if (i10 == 1) {
                return null;
            } else {
                throw new IllegalArgumentException("viewType is unknown");
            }
        }

        public void P(d7 d7Var) {
            ((o) this.f2982a).setUser(d7Var);
        }

        public void Q(d7 d7Var, boolean z10) {
            ((o) this.f2982a).setUser(d7Var);
            ((o) this.f2982a).Q0(z10, false);
        }
    }

    public l(v4<?> v4Var, a aVar, int i10, v4<?> v4Var2) {
        this.M = v4Var;
        this.N = aVar;
        boolean z10 = false;
        this.O = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        this.P = z11;
        this.T = z11 ? new e<>() : null;
        this.Q = (i10 & 4) != 0 ? true : z10;
        this.R = v4Var2;
    }

    @Override
    public int D() {
        List<d7> list = this.S;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.S.size() + (this.Q ? 1 : 0);
    }

    @Override
    public int F(int i10) {
        List<d7> list = this.S;
        return (list == null || list.isEmpty() || i10 != this.S.size()) ? 0 : 1;
    }

    public void a0(LinearLayoutManager linearLayoutManager) {
        List<d7> list;
        View C;
        if (!(!this.P || (list = this.S) == null || list.isEmpty())) {
            this.T.b();
            int X1 = linearLayoutManager.X1();
            int a22 = linearLayoutManager.a2();
            for (int i10 = X1; i10 <= a22; i10++) {
                if (F(i10) == 0 && (C = linearLayoutManager.C(i10)) != null) {
                    ((o) C).Q0(false, true);
                }
            }
            if (X1 > 0) {
                L(0, X1);
            }
            if (a22 < this.S.size()) {
                L(a22, this.S.size() - a22);
            }
        }
    }

    public e<d7> b0() {
        return this.T;
    }

    public void Q(b bVar, int i10) {
        d7 d7Var = this.S.get(i10);
        if (this.P) {
            bVar.Q(d7Var, this.T.f(d7Var.s()) != null);
        } else {
            bVar.P(d7Var);
        }
    }

    public b S(ViewGroup viewGroup, int i10) {
        return b.O(this.M.t(), this.M.c(), i10, this.O ? this : null, this.P ? this : null, this.R);
    }

    public void V(b bVar) {
        if (bVar.n() == 0) {
            ((o) bVar.f2982a).C0();
        }
    }

    public void W(b bVar) {
        if (bVar.n() == 0) {
            ((o) bVar.f2982a).G0();
        }
    }

    public void g0(List<d7> list) {
        int D = D();
        this.S = list;
        v0.k2(this, D);
    }

    @Override
    public void onClick(View view) {
        if (!this.P) {
            a aVar = this.N;
            if (aVar != null) {
                aVar.n0(((o) view).getUser());
                return;
            }
            return;
        }
        o oVar = (o) view;
        d7 user = oVar.getUser();
        boolean z10 = false;
        boolean z11 = this.T.p() > 0;
        if (this.T.f(user.s()) != null) {
            z10 = true;
        }
        if (z10) {
            this.T.l(user.s());
        } else if (z11) {
            this.T.k(user.s(), user);
        }
        if (z11) {
            oVar.Q0(!z10, true);
        }
        a aVar2 = this.N;
        if (aVar2 == null) {
            return;
        }
        if (z11) {
            aVar2.u0(this.T.p(), user, !z10);
        } else {
            aVar2.n0(user);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        o oVar = (o) view;
        d7 user = oVar.getUser();
        boolean z10 = this.T.f(user.s()) != null;
        if (z10) {
            this.T.l(user.s());
        } else {
            this.T.k(user.s(), user);
        }
        oVar.Q0(!z10, true);
        a aVar = this.N;
        if (aVar != null) {
            aVar.u0(this.T.p(), user, !z10);
        }
        return true;
    }

    @Override
    public int s(int i10) {
        return a0.i(72.0f) * i10;
    }

    @Override
    public int v(int i10) {
        int i11 = 0;
        if (D() == 0) {
            return 0;
        }
        int i12 = a0.i(72.0f) * this.S.size();
        if (this.Q) {
            i11 = a0.i(42.0f);
        }
        int i13 = i12 + i11;
        return i10 < 0 ? i13 : Math.min(i10, i13);
    }
}
