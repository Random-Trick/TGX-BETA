package de;

import ad.p;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import ce.c0;
import gd.w;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.d1;
import ud.v4;
import zd.o6;

public class s extends vo<a> implements View.OnClickListener {
    public p D0;

    public static class a {
        public final long f9432a;
        public final String f9433b;
        public final v4<?> f9434c;

        public a(long j10, String str, v4<?> v4Var) {
            this.f9432a = j10;
            this.f9433b = str;
            this.f9434c = v4Var;
        }
    }

    public s(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Bg() {
        v4 v4Var = x9().f9434c;
        if (v4Var instanceof p0) {
            ((p0) v4Var).yh(x9().f9433b);
        }
    }

    @Override
    public void Cc(String str) {
        super.Cc(str);
        this.D0.b0(c0.p(str.trim()));
    }

    public void Cg(a aVar) {
        super.Ad(aVar);
        this.D0 = new p(this, aVar.f9432a, aVar.f9433b);
    }

    @Override
    public void J(int i10, View view) {
        d1 d1Var;
        if (i10 == R.id.menu_btn_clear) {
            T8();
        } else if (i10 == R.id.menu_btn_search && (d1Var = this.R) != null) {
            d1Var.C3();
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
    public CharSequence X9() {
        return w.i1(R.string.InviteLinkRequests);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.D0.E();
    }

    @Override
    public boolean dc() {
        return this.D0.U();
    }

    @Override
    public boolean jc(boolean z10) {
        if (!Na()) {
            return super.jc(z10);
        }
        W8(null);
        return true;
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    @Override
    public void onClick(View view) {
        this.D0.V(view);
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.D0.W(context, customRecyclerView);
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.P1(linearLayout, this);
        } else if (i10 == R.id.menu_search) {
            if (x9().f9433b == null || x9().f9433b.isEmpty()) {
                d1Var.g2(linearLayout, this);
            }
        }
    }

    @Override
    public void xc() {
        this.D0.b0(null);
    }
}
