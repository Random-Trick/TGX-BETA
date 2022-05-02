package p038ce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1399s0;
import me.C6982o0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p082fd.C4403w;
import p335xd.C10192g;
import p350yd.C10930q6;
import sc.C8731d;
import td.AbstractC9201h1;
import td.AbstractC9299t2;
import td.AbstractC9376x4;
import td.AbstractC9388z1;
import td.View$OnClickListenerC9170d1;

public abstract class AbstractC3204vo<T> extends AbstractC9299t2<T> implements AbstractC9388z1, AbstractC9376x4.AbstractC9378b, AbstractC9201h1 {
    public int f10696A0;
    public int f10697B0;
    public C6982o0 f10698C0;
    public CustomRecyclerView f10699t0;
    public boolean f10700u0;
    public int f10701v0;
    public int f10702w0;
    public int f10704y0;
    public int f10703x0 = -1;
    public int f10705z0 = -1;

    public class C3205a extends RecyclerView.AbstractC0910t {
        public C3205a() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (AbstractC3204vo.this.f10701v0 != i) {
                AbstractC3204vo voVar = AbstractC3204vo.this;
                voVar.f10702w0 = voVar.f10701v0;
                AbstractC3204vo.this.f10701v0 = i;
            }
        }
    }

    public class C3206b extends LinearLayoutManager {
        public C3206b(Context context, int i, boolean z) {
            super(context, i, z);
        }

        @Override
        public int mo31291y1(int i, RecyclerView.C0913v vVar, RecyclerView.C0880a0 a0Var) {
            if (!AbstractC3204vo.this.f10700u0 || AbstractC3204vo.this.f10699t0.getScrollState() != 2 || AbstractC3204vo.this.f10702w0 == 1) {
                return super.mo31291y1(i, vVar, a0Var);
            }
            return 0;
        }
    }

    public AbstractC3204vo(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31303mg(View view) {
        if (this.f10698C0.getIsVisible()) {
            mo31299sg();
        }
    }

    public void m31302ng() {
        if (!m9347Sa()) {
            this.f10699t0.setItemAnimator(null);
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public AbstractC3204vo<T> m31318Ag() {
        this.f10697B0 |= 2;
        return this;
    }

    @Override
    public View mo8868Ga() {
        return this.f10699t0;
    }

    @Override
    public void mo8829I() {
        if (this.f10699t0.getAdapter() != null) {
            try {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m31305kg().getLayoutManager();
                m31305kg().m39499D1();
                int X1 = linearLayoutManager.m39552X1();
                if (X1 != -1) {
                    int r = ((C2546iq) this.f10699t0.getAdapter()).mo11421r(X1);
                    View C = linearLayoutManager.mo39265C(X1);
                    if (C != null) {
                        r -= C.getTop();
                    }
                    m31305kg().mo8024v1(0, -r);
                }
            } catch (Throwable th) {
                Log.m14710w("Cannot scroll to top", th, new Object[0]);
            }
        }
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        C1399s0.m37174l0(this.f10699t0);
    }

    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_clear) {
            m9341T8();
        } else if (i == R.id.menu_btn_more) {
            mo31298tg();
        } else if (i == R.id.menu_btn_search) {
            m9303Yc();
        }
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        CustomRecyclerView customRecyclerView = this.f10699t0;
        C4403w.AbstractC4404a aVar = (customRecyclerView == null || !(customRecyclerView.getAdapter() instanceof C4403w.AbstractC4404a)) ? null : (C4403w.AbstractC4404a) this.f10699t0.getAdapter();
        if (aVar != null) {
            aVar.mo9343T5(i, i2);
        }
    }

    @Override
    public int mo418W9() {
        if (m31300qg()) {
            return R.id.menu_search;
        }
        return 0;
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C1399s0.m37165q(this.f10699t0);
    }

    public void m31309gg() {
        if (this.f10703x0 != -1) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m31305kg().getLayoutManager();
            if (linearLayoutManager != null) {
                linearLayoutManager.m39525z2(this.f10703x0, this.f10704y0);
            }
            this.f10703x0 = -1;
            this.f10704y0 = 0;
        }
    }

    public int m31308hg() {
        return ((LinearLayoutManager) this.f10699t0.getLayoutManager()).m39552X1();
    }

    public final C6982o0 m31307ig() {
        if (this.f10698C0 == null) {
            this.f10698C0 = new C6982o0(this.f30168a);
            int i = C1357a0.m37544i(4.0f);
            int i2 = i * 2;
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f) + i2, C1357a0.m37544i(56.0f) + i2, (C4403w.m27986G2() ? 3 : 5) | 80);
            int i3 = C1357a0.m37544i(16.0f) - i;
            t1.bottomMargin = i3;
            t1.leftMargin = i3;
            t1.rightMargin = i3;
            C6982o0 o0Var = new C6982o0(this.f30168a);
            this.f10698C0 = o0Var;
            o0Var.setId(R.id.btn_done);
            m9163t8(this.f10698C0);
            this.f10698C0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AbstractC3204vo.this.m31303mg(view);
                }
            });
            this.f10698C0.setLayoutParams(t1);
            ((ViewGroup) get()).addView(this.f10698C0);
        }
        return this.f10698C0;
    }

    public int m31306jg() {
        return R.id.theme_color_background;
    }

    public CustomRecyclerView m31305kg() {
        return this.f10699t0;
    }

    @Override
    public int mo415la() {
        return m31300qg() ? R.id.menu_clear : super.mo415la();
    }

    public int m31304lg(int i) {
        View C = this.f10699t0.getLayoutManager().mo39265C(i);
        if (C != null) {
            return C.getTop();
        }
        return 0;
    }

    @Override
    public RecyclerView mo8809n2() {
        return this.f10699t0;
    }

    @Override
    @SuppressLint({"InflateParams"})
    public View mo403oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        if (m31301og()) {
            C10192g.m5782i(frameLayoutFix, m31306jg(), this);
        }
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler_custom, null);
        this.f10699t0 = customRecyclerView;
        C1399s0.m37174l0(customRecyclerView);
        this.f10699t0.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
        this.f10699t0.m39425k(new C3205a());
        this.f10699t0.setLayoutManager(new C3206b(context, 1, false));
        this.f10699t0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        mo30635rg(context, this.f10699t0);
        frameLayoutFix.addView(this.f10699t0);
        if (mo31076pg()) {
            m31296vg();
        }
        if (m31300qg()) {
            m9541qf(frameLayoutFix);
        }
        return frameLayoutFix;
    }

    public boolean m31301og() {
        return true;
    }

    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        switch (i) {
            case R.id.menu_clear:
                d1Var.m10090S1(linearLayout, this);
                return;
            case R.id.menu_help:
                d1Var.m10103N1(linearLayout, R.id.menu_btn_help, R.drawable.baseline_help_outline_24, mo9375O9(), this, C1357a0.m37544i(49.0f));
                return;
            case R.id.menu_more:
                d1Var.m10068b2(linearLayout, this);
                return;
            case R.id.menu_search:
                d1Var.m10053i2(linearLayout, this);
                return;
            default:
                return;
        }
    }

    public boolean mo31076pg() {
        return false;
    }

    public final boolean m31300qg() {
        return (this.f10697B0 & 1) != 0;
    }

    public abstract void mo30635rg(Context context, CustomRecyclerView customRecyclerView);

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        this.f10705z0 = bundle.getInt(str + "base_scroll_position", -1);
        this.f10696A0 = bundle.getInt(str + "base_scroll_offset", 0);
        return super.mo9165sd(bundle, str);
    }

    public void mo31299sg() {
    }

    public void mo31298tg() {
    }

    public void m31297ug() {
        if (this.f10699t0.getItemAnimator() != null) {
            this.f10699t0.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    AbstractC3204vo.this.m31302ng();
                }
            }, 300L);
        }
    }

    public final void m31296vg() {
        CustomRecyclerView customRecyclerView;
        int i;
        if (this.f10705z0 >= 0 && (customRecyclerView = this.f10699t0) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) customRecyclerView.getLayoutManager();
            RecyclerView.AbstractC0890h adapter = this.f10699t0.getAdapter();
            if (linearLayoutManager != null && adapter != null && (i = this.f10705z0) >= 0 && i < adapter.mo6153D()) {
                linearLayoutManager.m39525z2(this.f10705z0, this.f10696A0);
                this.f10705z0 = -1;
                this.f10696A0 = 0;
            }
        }
    }

    public void m31295wg() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m31305kg().getLayoutManager();
        int i = 0;
        if (linearLayoutManager != null) {
            int X1 = linearLayoutManager.m39552X1();
            this.f10703x0 = X1;
            View C = linearLayoutManager.mo39265C(X1);
            if (C != null) {
                i = C.getTop();
            }
            this.f10704y0 = i;
            return;
        }
        this.f10703x0 = -1;
        this.f10704y0 = 0;
    }

    public void m31294xg(boolean z) {
        this.f10700u0 = z;
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        CustomRecyclerView customRecyclerView = this.f10699t0;
        LinearLayoutManager linearLayoutManager = customRecyclerView != null ? (LinearLayoutManager) customRecyclerView.getLayoutManager() : null;
        if (linearLayoutManager != null) {
            int X1 = linearLayoutManager.m39552X1();
            View C = linearLayoutManager.mo39265C(X1);
            int U = C != null ? linearLayoutManager.m39234U(C) : 0;
            bundle.putInt(str + "base_scroll_position", X1);
            bundle.putInt(str + "base_scroll_offset", U);
        }
        return super.mo9122yd(bundle, str);
    }

    public final void m31293yg(boolean z, boolean z2) {
        m31307ig().m18184p(z, z2);
    }

    @Override
    public View mo9532zf() {
        return this.f10699t0;
    }

    public AbstractC3204vo<T> m31292zg() {
        this.f10697B0 |= 1;
        return this;
    }
}
