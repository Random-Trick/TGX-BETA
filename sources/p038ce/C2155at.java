package p038ce;

import android.content.Context;
import ge.C4868i;
import java.util.List;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p139jb.AbstractC5918j;
import p350yd.C10930q6;

public class C2155at extends AbstractView$OnClickListenerC3371ys<C4868i.C4876h> {
    public C2155at(Context context, C10930q6 q6Var) {
        super(context, q6Var, 0L, 0, R.string.IconsCurrent, R.string.IconsBuiltIn, R.string.IconsLoaded, R.string.IconsUpdate, R.string.IconsInstalling);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_iconSets;
    }

    @Override
    public void mo30659Ug(AbstractC5918j<List<C4868i.C4876h>> jVar) {
        this.f30170b.m2929B5(jVar);
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.Icons);
    }

    public void mo30661Pg(C4868i.C4876h hVar) {
        if (m30674Vg() != null) {
            m30674Vg().m34814gi();
        }
    }

    public C4868i.C4876h mo30660Tg() {
        return C4868i.m24727c2().m24801S0();
    }
}
