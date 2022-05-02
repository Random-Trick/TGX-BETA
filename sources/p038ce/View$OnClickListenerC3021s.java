package p038ce;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import be.C1363c0;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p082fd.C4403w;
import p350yd.C10930q6;
import p363zc.C11493p;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC3021s extends AbstractC3204vo<C3022a> implements View.OnClickListener {
    public C11493p f10144D0;

    public static class C3022a {
        public final long f10145a;
        public final String f10146b;
        public final AbstractC9323v4<?> f10147c;

        public C3022a(long j, String str, AbstractC9323v4<?> v4Var) {
            this.f10145a = j;
            this.f10146b = str;
            this.f10147c = v4Var;
        }
    }

    public View$OnClickListenerC3021s(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m32121Bg() {
        AbstractC9323v4 v4Var = m9131x9().f10147c;
        if (v4Var instanceof View$OnClickListenerC2855p0) {
            ((View$OnClickListenerC2855p0) v4Var).m33144yh(m9131x9().f10146b);
        }
    }

    @Override
    public void mo420Cc(String str) {
        super.mo420Cc(str);
        this.f10144D0.m460b0(C1363c0.m37420p(str.trim()));
    }

    public void m32120Cg(C3022a aVar) {
        super.m9476Ad(aVar);
        this.f10144D0 = new C11493p(this, aVar.f10145a, aVar.f10146b);
    }

    @Override
    public void mo419J(int i, View view) {
        View$OnClickListenerC9170d1 d1Var;
        if (i == R.id.menu_btn_clear) {
            m9341T8();
        } else if (i == R.id.menu_btn_search && (d1Var = this.f30159R) != null) {
            d1Var.m10018z3();
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_chatJoinRequests;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_search;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.InviteLinkRequests);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f10144D0.m485E();
    }

    @Override
    public boolean mo9270dc() {
        return this.f10144D0.m469U();
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!m9382Na()) {
            return super.mo404jc(z);
        }
        m9320W8(null);
        return true;
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    @Override
    public void onClick(View view) {
        this.f10144D0.m468V(view);
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10090S1(linearLayout, this);
        } else if (i == R.id.menu_search) {
            if (m9131x9().f10146b == null || m9131x9().f10146b.isEmpty()) {
                d1Var.m10053i2(linearLayout, this);
            }
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f10144D0.m467W(context, customRecyclerView);
    }

    @Override
    public void mo409xc() {
        this.f10144D0.m460b0(null);
    }
}
