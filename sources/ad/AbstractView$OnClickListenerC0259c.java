package ad;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import gd.C4658i;
import gd.C4779t2;
import me.C6924j2;
import me.C6941k2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p335xd.C10189d;
import p364zd.C11537v;
import td.AbstractC9323v4;
import td.C9319v1;

public abstract class AbstractView$OnClickListenerC0259c extends FrameLayoutFix implements View.OnClickListener, C6924j2.AbstractC6932h, C6924j2.AbstractC6930f {
    public C4658i f782M;
    public int f783N;
    public final AbstractC9323v4<?> f784O;
    public final C11537v f785P;
    public C6924j2 f786Q;

    public AbstractView$OnClickListenerC0259c(Context context, AbstractC9323v4<?> v4Var) {
        super(context);
        C11537v vVar = new C11537v();
        this.f785P = vVar;
        this.f784O = v4Var;
        m41992D1(R.id.btn_share, R.string.Share, R.drawable.baseline_forward_24);
        m41992D1(R.id.btn_openLink, R.string.OpenInExternalApp, R.drawable.baseline_open_in_browser_24);
        setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 80));
        C1379j0.m37307r(context).m14546R(vVar);
    }

    public static boolean m41991I1(AbstractC9323v4 v4Var, C4658i iVar, View view, int i) {
        if (i == R.id.btn_openLink) {
            m41989O1(v4Var, iVar, false);
            return true;
        } else if (i != R.id.btn_useInAppBrowser) {
            return true;
        } else {
            C1379j0.m37336c0(iVar.f15549b);
            return true;
        }
    }

    private void m41990N1() {
        C6924j2 j2Var = new C6924j2(getContext());
        this.f786Q = j2Var;
        j2Var.setIgnoreBottom(true);
        this.f786Q.m18436M2();
        this.f786Q.m18435N2();
        this.f786Q.setOverlayStatusBar(true);
        this.f786Q.setShowListener(this);
        this.f786Q.setDismissListener(this);
        this.f786Q.m18430T2(this, getPreviewHeight());
    }

    public static boolean m41989O1(final td.AbstractC9323v4<?> r13, final gd.C4658i r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: ad.AbstractView$OnClickListenerC0259c.m41989O1(td.v4, gd.i, boolean):boolean");
    }

    public static boolean m41988Q1(AbstractC9323v4<?> v4Var, String str, boolean z) {
        return m41989O1(v4Var, C4658i.m26602j(str), z);
    }

    public static boolean m41987S1(AbstractC9323v4<?> v4Var, TdApi.WebPage webPage, boolean z) {
        return m41989O1(v4Var, C4658i.m26603i(webPage), z);
    }

    public void m41992D1(int i, int i2, int i3) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(54.0f), 80);
        int i4 = this.f783N;
        t1.bottomMargin = i4;
        this.f783N = i4 + t1.height;
        TextView a = C9319v1.m9485a(getContext(), i, C4403w.m27869i1(i2), 1, i3, this, this.f785P, null);
        C10189d.m5797g(a);
        this.f785P.m74f(a);
        a.setLayoutParams(t1);
        addView(a);
    }

    public abstract boolean mo41915E1();

    public abstract int mo41913F1(int i);

    public abstract void mo41912G1(boolean z);

    public abstract void mo41910J1();

    public abstract boolean mo41909L1(String str);

    public boolean mo41908M1(C4658i iVar) {
        this.f782M = iVar;
        return mo41915E1();
    }

    public abstract int getPreviewHeight();

    @Override
    public void mo3000j2(C6924j2 j2Var) {
        C6941k2.m18400a(this, j2Var);
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_openLink) {
            this.f786Q.m18408y2(true);
            C1379j0.m37336c0(this.f782M.f15549b);
        } else if (id2 == R.id.btn_share) {
            this.f786Q.m18408y2(true);
            C4779t2.m25490j5(this.f784O, this.f782M.f15549b);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(mo41913F1(View.MeasureSpec.getSize(i)), Log.TAG_TDLIB_OPTIONS));
    }

    public void setFooterVisibility(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof TextView) {
                childAt.setVisibility(i);
            } else {
                return;
            }
        }
    }

    @Override
    public final void mo2999y4(C6924j2 j2Var) {
        mo41910J1();
        C1379j0.m37307r(getContext()).m14433u2(this.f785P);
    }
}
