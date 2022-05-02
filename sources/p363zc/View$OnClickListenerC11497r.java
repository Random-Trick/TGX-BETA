package p363zc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import be.C1363c0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p335xd.C10192g;
import sc.AbstractC8809o;
import sc.View$OnClickListenerC8851y1;
import td.AbstractC9201h1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC11497r extends AbstractC8809o<Void> implements View.OnClickListener, AbstractC9201h1 {
    public boolean f36507I0;
    public final TdApi.ChatJoinRequestsInfo f36508J0;
    public final C11493p f36509K0;
    public int f36510L0;

    public View$OnClickListenerC11497r(View$OnClickListenerC8851y1 y1Var, long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        super(y1Var, C4403w.m27846o2(R.string.xJoinRequests, chatJoinRequestsInfo.totalCount));
        this.f36509K0 = new C11493p(this, j, null);
        this.f36508J0 = chatJoinRequestsInfo;
        this.f36510L0 = chatJoinRequestsInfo.totalCount;
    }

    public void m411ug() {
        m11286kg(C4403w.m27846o2(R.string.xJoinRequests, this.f36510L0));
    }

    @Override
    public int mo408A9() {
        return 4;
    }

    @Override
    public void mo420Cc(String str) {
        this.f36509K0.m460b0(C1363c0.m37420p(str.trim()));
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_clear) {
            m9341T8();
        } else if (i == R.id.menu_btn_search) {
            this.f28443n0.getHeaderView().m10018z3();
            this.f30159R = this.f28443n0.getHeaderView();
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
    public void mo417Z8() {
        super.mo417Z8();
        this.f36509K0.m485E();
    }

    @Override
    public boolean mo406cf() {
        return this.f36507I0;
    }

    @Override
    public void mo416gc() {
        m9143vd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC11497r.this.m411ug();
            }
        }, 100L);
    }

    @Override
    public ViewGroup mo405hf() {
        return new FrameLayout(this.f30168a);
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (this.f28443n0.getHeaderView().m10051j3()) {
            this.f28443n0.getHeaderView().m10029t2(true, null);
            this.f30159R = this.f28443n0.getHeaderView();
            return true;
        }
        m412tg();
        return false;
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    @Override
    public View mo403oc(Context context) {
        boolean z = false;
        m11300bf(false);
        this.f36509K0.m467W(context, this.f28453x0);
        C10192g.m5781j(this.f28453x0, R.id.theme_color_background);
        m11326Jf();
        if (mo401tf() == super.mo401tf()) {
            z = true;
        }
        this.f36507I0 = z;
        if (!z) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28453x0.getLayoutParams();
            layoutParams.height = mo401tf();
            this.f28453x0.setLayoutParams(layoutParams);
        }
        return this.f28451v0;
    }

    @Override
    public void onClick(View view) {
        this.f36509K0.m468V(view);
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10090S1(linearLayout, this);
        } else if (i == R.id.menu_search) {
            d1Var.m10053i2(linearLayout, this);
        }
    }

    @Override
    public int mo401tf() {
        TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo = this.f36508J0;
        if (chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount <= 0) {
            return super.mo401tf();
        }
        return Math.min(super.mo401tf(), this.f36509K0.m484F(this.f36508J0.totalCount));
    }

    public void m412tg() {
        this.f28443n0.m11111u2(false);
    }

    public void m410vg() {
        this.f36510L0--;
        if (!this.f28443n0.getHeaderView().m10051j3()) {
            m11286kg(C4403w.m27846o2(R.string.xJoinRequests, this.f36510L0));
        }
        if (this.f36510L0 == 0) {
            m412tg();
        }
    }

    @Override
    public void mo409xc() {
        this.f36509K0.m460b0(null);
    }
}
