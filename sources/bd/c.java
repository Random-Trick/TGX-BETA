package bd;

import ae.v;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import gd.w;
import hd.i;
import hd.t2;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.j2;
import ne.k2;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v1;
import ud.v4;
import yd.d;

public abstract class c extends FrameLayoutFix implements View.OnClickListener, j2.h, j2.f {
    public i M;
    public int N;
    public final v4<?> O;
    public final v P;
    public j2 Q;

    public c(Context context, v4<?> v4Var) {
        super(context);
        v vVar = new v();
        this.P = vVar;
        this.O = v4Var;
        A1(R.id.btn_share, R.string.Share, R.drawable.baseline_forward_24);
        A1(R.id.btn_openLink, R.string.OpenInExternalApp, R.drawable.baseline_open_in_browser_24);
        setLayoutParams(FrameLayoutFix.r1(-1, -2, 80));
        j0.r(context).T(vVar);
    }

    public static boolean E1(v4 v4Var, i iVar, View view, int i10) {
        if (i10 == R.id.btn_openLink) {
            L1(v4Var, iVar, false);
            return true;
        } else if (i10 != R.id.btn_useInAppBrowser) {
            return true;
        } else {
            j0.c0(iVar.f13072b);
            return true;
        }
    }

    private void K1() {
        j2 j2Var = new j2(getContext());
        this.Q = j2Var;
        j2Var.setIgnoreBottom(true);
        this.Q.G2();
        this.Q.I2();
        this.Q.setOverlayStatusBar(true);
        this.Q.setShowListener(this);
        this.Q.setDismissListener(this);
        this.Q.P2(this, getPreviewHeight());
    }

    public static boolean L1(final ud.v4<?> r13, final hd.i r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: bd.c.L1(ud.v4, hd.i, boolean):boolean");
    }

    public static boolean O1(v4<?> v4Var, String str, boolean z10) {
        return L1(v4Var, i.j(str), z10);
    }

    public static boolean P1(v4<?> v4Var, TdApi.WebPage webPage, boolean z10) {
        return L1(v4Var, i.i(webPage), z10);
    }

    public void A1(int i10, int i11, int i12) {
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, a0.i(54.0f), 80);
        int i13 = this.N;
        r12.bottomMargin = i13;
        this.N = i13 + r12.height;
        TextView a10 = v1.a(getContext(), i10, w.i1(i11), 1, i12, this, this.P, null);
        d.g(a10);
        this.P.f(a10);
        a10.setLayoutParams(r12);
        addView(a10);
    }

    public abstract boolean B1();

    public abstract int C1(int i10);

    public abstract void D1(boolean z10);

    public abstract void G1();

    public abstract boolean H1(String str);

    public boolean I1(i iVar) {
        this.M = iVar;
        return B1();
    }

    public abstract int getPreviewHeight();

    @Override
    public final void h3(j2 j2Var) {
        G1();
        j0.r(getContext()).v2(this.P);
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_openLink) {
            this.Q.s2(true);
            j0.c0(this.M.f13072b);
        } else if (id2 == R.id.btn_share) {
            this.Q.s2(true);
            t2.j5(this.O, this.M.f13072b);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(C1(View.MeasureSpec.getSize(i10)), Log.TAG_TDLIB_OPTIONS));
    }

    public void setFooterVisibility(int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof TextView) {
                childAt.setVisibility(i10);
            } else {
                return;
            }
        }
    }

    @Override
    public void w(j2 j2Var) {
        k2.a(this, j2Var);
    }
}
