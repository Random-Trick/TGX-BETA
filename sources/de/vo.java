package de;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.o0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import tc.d;
import ud.d1;
import ud.h1;
import ud.t2;
import ud.x4;
import ud.z1;
import yd.g;
import zd.o6;

public abstract class vo<T> extends t2<T> implements z1, x4.b, h1 {
    public int A0;
    public int B0;
    public o0 C0;
    public CustomRecyclerView f9854t0;
    public boolean f9855u0;
    public int f9856v0;
    public int f9857w0;
    public int f9859y0;
    public int f9858x0 = -1;
    public int f9860z0 = -1;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (vo.this.f9856v0 != i10) {
                vo voVar = vo.this;
                voVar.f9857w0 = voVar.f9856v0;
                vo.this.f9856v0 = i10;
            }
        }
    }

    public class b extends LinearLayoutManager {
        public b(Context context, int i10, boolean z10) {
            super(context, i10, z10);
        }

        @Override
        public int y1(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
            if (!vo.this.f9855u0 || vo.this.f9854t0.getScrollState() != 2 || vo.this.f9857w0 == 1) {
                return super.y1(i10, vVar, zVar);
            }
            return 0;
        }
    }

    public vo(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void mg(View view) {
        if (this.C0.getIsVisible()) {
            sg();
        }
    }

    public void ng() {
        if (!Sa()) {
            this.f9854t0.setItemAnimator(null);
        }
    }

    @Override
    public int A9() {
        return 3;
    }

    public vo<T> Ag() {
        this.B0 |= 2;
        return this;
    }

    @Override
    public View Ga() {
        return this.f9854t0;
    }

    @Override
    public void I() {
        if (this.f9854t0.getAdapter() != null) {
            try {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kg().getLayoutManager();
                kg().C1();
                int X1 = linearLayoutManager.X1();
                if (X1 != -1) {
                    int s10 = ((iq) this.f9854t0.getAdapter()).s(X1);
                    View C = linearLayoutManager.C(X1);
                    if (C != null) {
                        s10 -= C.getTop();
                    }
                    kg().u1(0, -s10);
                }
            } catch (Throwable th) {
                Log.w("Cannot scroll to top", th, new Object[0]);
            }
        }
    }

    @Override
    public void Ia() {
        super.Ia();
        p0.e0(this.f9854t0);
    }

    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_clear) {
            T8();
        } else if (i10 == R.id.menu_btn_more) {
            tg();
        } else if (i10 == R.id.menu_btn_search) {
            Yc();
        }
    }

    @Override
    public void Ja(int i10, int i11) {
        CustomRecyclerView customRecyclerView = this.f9854t0;
        w.a aVar = (customRecyclerView == null || !(customRecyclerView.getAdapter() instanceof w.a)) ? null : (w.a) this.f9854t0.getAdapter();
        if (aVar != null) {
            aVar.Q5(i10, i11);
        }
    }

    @Override
    public int W9() {
        if (qg()) {
            return R.id.menu_search;
        }
        return 0;
    }

    @Override
    public void Z8() {
        super.Z8();
        p0.n(this.f9854t0);
    }

    public void gg() {
        if (this.f9858x0 != -1) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kg().getLayoutManager();
            if (linearLayoutManager != null) {
                linearLayoutManager.z2(this.f9858x0, this.f9859y0);
            }
            this.f9858x0 = -1;
            this.f9859y0 = 0;
        }
    }

    public int hg() {
        return ((LinearLayoutManager) this.f9854t0.getLayoutManager()).X1();
    }

    public final o0 ig() {
        if (this.C0 == null) {
            this.C0 = new o0(this.f24493a);
            int i10 = a0.i(4.0f);
            int i11 = i10 * 2;
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(56.0f) + i11, a0.i(56.0f) + i11, (w.G2() ? 3 : 5) | 80);
            int i12 = a0.i(16.0f) - i10;
            r12.bottomMargin = i12;
            r12.leftMargin = i12;
            r12.rightMargin = i12;
            o0 o0Var = new o0(this.f24493a);
            this.C0 = o0Var;
            o0Var.setId(R.id.btn_done);
            t8(this.C0);
            this.C0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    vo.this.mg(view);
                }
            });
            this.C0.setLayoutParams(r12);
            ((ViewGroup) get()).addView(this.C0);
        }
        return this.C0;
    }

    public int jg() {
        return R.id.theme_color_background;
    }

    public CustomRecyclerView kg() {
        return this.f9854t0;
    }

    @Override
    public int la() {
        return qg() ? R.id.menu_clear : super.la();
    }

    public int lg(int i10) {
        View C = this.f9854t0.getLayoutManager().C(i10);
        if (C != null) {
            return C.getTop();
        }
        return 0;
    }

    @Override
    public RecyclerView m2() {
        return this.f9854t0;
    }

    @Override
    @SuppressLint({"InflateParams"})
    public View oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        if (og()) {
            g.i(frameLayoutFix, jg(), this);
        }
        frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) p0.v(t(), R.layout.recycler_custom, null);
        this.f9854t0 = customRecyclerView;
        p0.e0(customRecyclerView);
        this.f9854t0.setItemAnimator(new d(db.b.f7287b, 180L));
        this.f9854t0.k(new a());
        this.f9854t0.setLayoutManager(new b(context, 1, false));
        this.f9854t0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        rg(context, this.f9854t0);
        frameLayoutFix.addView(this.f9854t0);
        if (pg()) {
            vg();
        }
        if (qg()) {
            qf(frameLayoutFix);
        }
        return frameLayoutFix;
    }

    public boolean og() {
        return true;
    }

    public boolean pg() {
        return false;
    }

    public final boolean qg() {
        return (this.B0 & 1) != 0;
    }

    public abstract void rg(Context context, CustomRecyclerView customRecyclerView);

    @Override
    public boolean sd(Bundle bundle, String str) {
        this.f9860z0 = bundle.getInt(str + "base_scroll_position", -1);
        this.A0 = bundle.getInt(str + "base_scroll_offset", 0);
        return super.sd(bundle, str);
    }

    public void sg() {
    }

    public void tg() {
    }

    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        switch (i10) {
            case R.id.menu_clear:
                d1Var.P1(linearLayout, this);
                return;
            case R.id.menu_help:
                d1Var.K1(linearLayout, R.id.menu_btn_help, R.drawable.baseline_help_outline_24, O9(), this, a0.i(49.0f));
                return;
            case R.id.menu_more:
                d1Var.a2(linearLayout, this);
                return;
            case R.id.menu_search:
                d1Var.g2(linearLayout, this);
                return;
            default:
                return;
        }
    }

    public void ug() {
        if (this.f9854t0.getItemAnimator() != null) {
            this.f9854t0.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    vo.this.ng();
                }
            }, 300L);
        }
    }

    public final void vg() {
        CustomRecyclerView customRecyclerView;
        int i10;
        if (this.f9860z0 >= 0 && (customRecyclerView = this.f9854t0) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) customRecyclerView.getLayoutManager();
            RecyclerView.h adapter = this.f9854t0.getAdapter();
            if (linearLayoutManager != null && adapter != null && (i10 = this.f9860z0) >= 0 && i10 < adapter.D()) {
                linearLayoutManager.z2(this.f9860z0, this.A0);
                this.f9860z0 = -1;
                this.A0 = 0;
            }
        }
    }

    public void wg() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kg().getLayoutManager();
        int i10 = 0;
        if (linearLayoutManager != null) {
            int X1 = linearLayoutManager.X1();
            this.f9858x0 = X1;
            View C = linearLayoutManager.C(X1);
            if (C != null) {
                i10 = C.getTop();
            }
            this.f9859y0 = i10;
            return;
        }
        this.f9858x0 = -1;
        this.f9859y0 = 0;
    }

    public void xg(boolean z10) {
        this.f9855u0 = z10;
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        CustomRecyclerView customRecyclerView = this.f9854t0;
        LinearLayoutManager linearLayoutManager = customRecyclerView != null ? (LinearLayoutManager) customRecyclerView.getLayoutManager() : null;
        if (linearLayoutManager != null) {
            int X1 = linearLayoutManager.X1();
            View C = linearLayoutManager.C(X1);
            int U = C != null ? linearLayoutManager.U(C) : 0;
            bundle.putInt(str + "base_scroll_position", X1);
            bundle.putInt(str + "base_scroll_offset", U);
        }
        return super.yd(bundle, str);
    }

    public final void yg(boolean z10, boolean z11) {
        ig().p(z10, z11);
    }

    @Override
    public View zf() {
        return this.f9854t0;
    }

    public vo<T> zg() {
        this.B0 |= 1;
        return this;
    }
}
