package ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ce.c0;
import gd.w;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import tc.o;
import tc.y1;
import ud.d1;
import ud.h1;
import yd.g;

public class r extends o<Void> implements View.OnClickListener, h1 {
    public boolean I0;
    public final TdApi.ChatJoinRequestsInfo J0;
    public final p K0;
    public int L0;

    public r(y1 y1Var, long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        super(y1Var, w.o2(R.string.xJoinRequests, chatJoinRequestsInfo.totalCount));
        this.K0 = new p(this, j10, null);
        this.J0 = chatJoinRequestsInfo;
        this.L0 = chatJoinRequestsInfo.totalCount;
    }

    public void ug() {
        kg(w.o2(R.string.xJoinRequests, this.L0));
    }

    @Override
    public int A9() {
        return 4;
    }

    @Override
    public void Cc(String str) {
        this.K0.b0(c0.p(str.trim()));
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_clear) {
            T8();
        } else if (i10 == R.id.menu_btn_search) {
            this.f23267n0.getHeaderView().C3();
            this.R = this.f23267n0.getHeaderView();
        }
    }

    @Override
    public int R9() {
        return R.id.controller_chatJoinRequests;
    }

    @Override
    public int W9() {
        return R.id.menu_search;
    }

    @Override
    public void Z8() {
        super.Z8();
        this.K0.E();
    }

    @Override
    public boolean cf() {
        return this.I0;
    }

    @Override
    public void gc() {
        vd(new Runnable() {
            @Override
            public final void run() {
                r.this.ug();
            }
        }, 100L);
    }

    @Override
    public ViewGroup hf() {
        return new FrameLayout(this.f24493a);
    }

    @Override
    public boolean jc(boolean z10) {
        if (this.f23267n0.getHeaderView().j3()) {
            this.f23267n0.getHeaderView().n2(true, null);
            this.R = this.f23267n0.getHeaderView();
            return true;
        }
        tg();
        return false;
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    @Override
    public View oc(Context context) {
        boolean z10 = false;
        bf(false);
        this.K0.W(context, this.f23277x0);
        g.j(this.f23277x0, R.id.theme_color_background);
        Jf();
        if (tf() == super.tf()) {
            z10 = true;
        }
        this.I0 = z10;
        if (!z10) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23277x0.getLayoutParams();
            layoutParams.height = tf();
            this.f23277x0.setLayoutParams(layoutParams);
        }
        return this.f23275v0;
    }

    @Override
    public void onClick(View view) {
        this.K0.V(view);
    }

    @Override
    public int tf() {
        TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo = this.J0;
        if (chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount <= 0) {
            return super.tf();
        }
        return Math.min(super.tf(), this.K0.F(this.J0.totalCount));
    }

    public void tg() {
        this.f23267n0.p2(false);
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.P1(linearLayout, this);
        } else if (i10 == R.id.menu_search) {
            d1Var.g2(linearLayout, this);
        }
    }

    public void vg() {
        this.L0--;
        if (!this.f23267n0.getHeaderView().j3()) {
            kg(w.o2(R.string.xJoinRequests, this.L0));
        }
        if (this.L0 == 0) {
            tg();
        }
    }

    @Override
    public void xc() {
        this.K0.b0(null);
    }
}
