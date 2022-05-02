package p053dd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1399s0;
import gd.C4618d7;
import java.util.List;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p143k0.C6035e;
import p350yd.C10930q6;
import p364zd.C11524j;
import sc.AbstractC8749f;
import td.AbstractC9323v4;

public class View$OnClickListenerC4013l extends RecyclerView.AbstractC0890h<C4015b> implements View.OnClickListener, View.OnLongClickListener, AbstractC8749f {
    public final AbstractC9323v4<?> f13449M;
    public final AbstractC4014a f13450N;
    public final boolean f13451O;
    public final boolean f13452P;
    public final boolean f13453Q;
    public final AbstractC9323v4<?> f13454R;
    public List<C4618d7> f13455S;
    public final C6035e<C4618d7> f13456T;

    public interface AbstractC4014a {
        void mo11097O1(C4618d7 d7Var);

        void mo11096f0(int i, C4618d7 d7Var, boolean z);
    }

    public static class C4015b extends RecyclerView.AbstractC0886d0 {
        public C4015b(View view) {
            super(view);
        }

        public static C4015b m29323O(Context context, C10930q6 q6Var, int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, AbstractC9323v4<?> v4Var) {
            if (i == 0) {
                int i2 = C1357a0.m37544i(18.0f);
                C4022o oVar = new C4022o(context, q6Var);
                oVar.setOffsetLeft(i2);
                if (v4Var != null) {
                    v4Var.m9163t8(oVar);
                }
                if (!(onClickListener == null && onLongClickListener == null)) {
                    oVar.setOnClickListener(onClickListener);
                    oVar.setOnLongClickListener(onLongClickListener);
                    C2065g.m35721d(oVar, C11524j.m142z(R.id.theme_color_chatBackground));
                    C1399s0.m37196a0(oVar);
                }
                return new C4015b(oVar);
            } else if (i == 1) {
                return null;
            } else {
                throw new IllegalArgumentException("viewType is unknown");
            }
        }

        public void m29322P(C4618d7 d7Var) {
            ((C4022o) this.f3479a).setUser(d7Var);
        }

        public void m29321Q(C4618d7 d7Var, boolean z) {
            ((C4022o) this.f3479a).setUser(d7Var);
            ((C4022o) this.f3479a).m29282O0(z, false);
        }
    }

    public View$OnClickListenerC4013l(AbstractC9323v4<?> v4Var, AbstractC4014a aVar, int i, AbstractC9323v4<?> v4Var2) {
        this.f13449M = v4Var;
        this.f13450N = aVar;
        boolean z = false;
        this.f13451O = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.f13452P = z2;
        this.f13456T = z2 ? new C6035e<>() : null;
        this.f13453Q = (i & 4) != 0 ? true : z;
        this.f13454R = v4Var2;
    }

    @Override
    public int mo6153D() {
        List<C4618d7> list = this.f13455S;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f13455S.size() + (this.f13453Q ? 1 : 0);
    }

    @Override
    public int mo6150F(int i) {
        List<C4618d7> list = this.f13455S;
        return (list == null || list.isEmpty() || i != this.f13455S.size()) ? 0 : 1;
    }

    public void m29330a0(LinearLayoutManager linearLayoutManager) {
        List<C4618d7> list;
        View C;
        if (!(!this.f13452P || (list = this.f13455S) == null || list.isEmpty())) {
            this.f13456T.m21510b();
            int X1 = linearLayoutManager.m39552X1();
            int a2 = linearLayoutManager.m39549a2();
            for (int i = X1; i <= a2; i++) {
                if (mo6150F(i) == 0 && (C = linearLayoutManager.mo39265C(i)) != null) {
                    ((C4022o) C).m29282O0(false, true);
                }
            }
            if (X1 > 0) {
                m39312L(0, X1);
            }
            if (a2 < this.f13455S.size()) {
                m39312L(a2, this.f13455S.size() - a2);
            }
        }
    }

    public C6035e<C4618d7> m29329c0() {
        return this.f13456T;
    }

    public void mo6146Q(C4015b bVar, int i) {
        C4618d7 d7Var = this.f13455S.get(i);
        if (this.f13452P) {
            bVar.m29321Q(d7Var, this.f13456T.m21506f(d7Var.m26871s()) != null);
        } else {
            bVar.m29322P(d7Var);
        }
    }

    public C4015b mo6145S(ViewGroup viewGroup, int i) {
        return C4015b.m29323O(this.f13449M.mo4347s(), this.f13449M.mo4348c(), i, this.f13451O ? this : null, this.f13452P ? this : null, this.f13454R);
    }

    public void mo6144V(C4015b bVar) {
        if (bVar.m39335n() == 0) {
            ((C4022o) bVar.f3479a).m29287B0();
        }
    }

    public void mo6143W(C4015b bVar) {
        if (bVar.m39335n() == 0) {
            ((C4022o) bVar.f3479a).m29285F0();
        }
    }

    public void m29324h0(List<C4618d7> list) {
        int D = mo6153D();
        this.f13455S = list;
        C7389v0.m16615k2(this, D);
    }

    @Override
    public void onClick(View view) {
        if (!this.f13452P) {
            AbstractC4014a aVar = this.f13450N;
            if (aVar != null) {
                aVar.mo11097O1(((C4022o) view).getUser());
                return;
            }
            return;
        }
        C4022o oVar = (C4022o) view;
        C4618d7 user = oVar.getUser();
        boolean z = false;
        boolean z2 = this.f13456T.m21497p() > 0;
        if (this.f13456T.m21506f(user.m26871s()) != null) {
            z = true;
        }
        if (z) {
            this.f13456T.m21500l(user.m26871s());
        } else if (z2) {
            this.f13456T.m21501k(user.m26871s(), user);
        }
        if (z2) {
            oVar.m29282O0(!z, true);
        }
        AbstractC4014a aVar2 = this.f13450N;
        if (aVar2 == null) {
            return;
        }
        if (z2) {
            aVar2.mo11096f0(this.f13456T.m21497p(), user, !z);
        } else {
            aVar2.mo11097O1(user);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        C4022o oVar = (C4022o) view;
        C4618d7 user = oVar.getUser();
        boolean z = this.f13456T.m21506f(user.m26871s()) != null;
        if (z) {
            this.f13456T.m21500l(user.m26871s());
        } else {
            this.f13456T.m21501k(user.m26871s(), user);
        }
        oVar.m29282O0(!z, true);
        AbstractC4014a aVar = this.f13450N;
        if (aVar != null) {
            aVar.mo11096f0(this.f13456T.m21497p(), user, !z);
        }
        return true;
    }

    @Override
    public int mo11421r(int i) {
        return C1357a0.m37544i(72.0f) * i;
    }

    @Override
    public int mo11420v(int i) {
        int i2 = 0;
        if (mo6153D() == 0) {
            return 0;
        }
        int i3 = C1357a0.m37544i(72.0f) * this.f13455S.size();
        if (this.f13453Q) {
            i2 = C1357a0.m37544i(42.0f);
        }
        int i4 = i3 + i2;
        return i < 0 ? i4 : Math.min(i, i4);
    }
}
