package me;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import me.C6924j2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p067ed.C4183a;
import p082fd.C4403w;
import p139jb.AbstractC5911c;
import p335xd.C10192g;
import p350yd.AbstractC11083w0;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import p364zd.C11537v;

public class RunnableC7091z1 extends FrameLayoutFix implements AbstractC5911c, C1357a0.AbstractC1358a, AbstractC11083w0, C3950k.AbstractC3952b, C6924j2.AbstractC6934j, Runnable, AbstractView$OnTouchListenerC7889a.AbstractC7897h {
    public C6977n2 f22553M;
    public TextView f22554N;
    public LinearLayout f22555O;
    public boolean f22557Q;
    public boolean f22558R;
    public C3950k f22561U;
    public boolean f22562V;
    public boolean f22563W;
    public int f22556P = -1;
    public float f22559S = -1.0f;
    public float f22560T = -1.0f;

    public RunnableC7091z1(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.m18008s1(-1, C1357a0.m37538o()));
        C1357a0.m37552a(this);
        int N = C11524j.m228N(C4183a.f14085c);
        C6977n2 n2Var = new C6977n2(context);
        this.f22553M = n2Var;
        float f = 1.0f;
        n2Var.m18224j(1.0f);
        this.f22553M.setProgressColor(N);
        this.f22553M.setLayoutParams(new LinearLayout.LayoutParams(C1357a0.m37544i(24.0f), -1));
        C6847b2 b2Var = new C6847b2(context);
        this.f22554N = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.m18008s1(-2, -1));
        this.f22554N.setGravity(16);
        this.f22554N.setTextSize(1, 13.0f);
        this.f22554N.setTextColor(N);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f22555O = linearLayout;
        linearLayout.setOrientation(0);
        if (C4403w.m27986G2()) {
            this.f22555O.addView(this.f22554N);
            this.f22555O.addView(this.f22553M);
        } else {
            this.f22555O.addView(this.f22553M);
            this.f22555O.addView(this.f22554N);
        }
        this.f22555O.setLayoutParams(FrameLayoutFix.m18007t1(-2, -1, 1));
        addView(this.f22555O);
        C10192g.m5781j(this, R.id.theme_color_statusBar);
        C10536ab.m4667o1().m4716b1().m1552c(this);
        setNetworkState(C10536ab.m4667o1().m4684j0().m2142z4());
        setFactor(!this.f22558R ? 0.0f : f);
        C1379j0.m37310r(getContext()).m14553P(this);
    }

    private float getVisibilityFactor() {
        if (this.f22557Q) {
            return 1.0f;
        }
        return this.f22559S;
    }

    private void setColorFactor(float f) {
        if (this.f22560T != f) {
            this.f22560T = f;
            invalidate();
        }
    }

    private void setFactor(float f) {
        if (this.f22559S != f) {
            this.f22559S = f;
            this.f22555O.setAlpha(f);
            this.f22555O.setTranslationY((-C1357a0.m37538o()) + ((int) (C1357a0.m37538o() * getVisibilityFactor())));
            m17773E1();
        }
    }

    private void setIsPaused(boolean z) {
        if (this.f22563W != z) {
            this.f22563W = z;
            m17773E1();
        }
    }

    private void setLowProfile(boolean z) {
        if (this.f22562V != z) {
            this.f22562V = z;
            if (z) {
                run();
                return;
            }
            removeCallbacks(this);
            AbstractView$OnTouchListenerC7889a r = C1379j0.m37310r(getContext());
            if (!r.m14408z1()) {
                r.m14431u3(0, false);
            }
        }
    }

    private void setNetworkState(int i) {
        if (this.f22556P != i) {
            this.f22556P = i;
            this.f22553M.setVisibility((i == 0 || i == 4) ? 8 : 0);
            this.f22554N.setText(C4403w.m27871i1(HandlerC10770jj.m3707T8(i)));
            m17768L1();
        }
    }

    public void m17775C1(C11537v vVar) {
        TextView textView = this.f22554N;
        int i = C4183a.f14085c;
        vVar.m77c(textView, i);
        vVar.m77c(this.f22553M, i);
    }

    public final void m17774D1(float f, boolean z) {
        if (this.f22561U == null) {
            this.f22561U = new C3950k(0, this, C2057b.f7280b, 180L, this.f22559S);
        }
        C3950k kVar = this.f22561U;
        float f2 = this.f22559S;
        kVar.m29555F(((f2 == 1.0f || f2 == 0.0f) && !z) ? this.f22558R ? 300L : 1200L : 0L);
        this.f22561U.m29546i(f);
    }

    public final void m17773E1() {
        setLowProfile(!this.f22563W && (this.f22558R || this.f22559S != 0.0f));
    }

    public final void m17772F1(float f) {
        C3950k kVar = this.f22561U;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setFactor(f);
    }

    public final void m17771G1(boolean z, boolean z2) {
        if (this.f22558R != z) {
            this.f22558R = z;
            float f = 1.0f;
            if (getParent() == null || getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
                if (!z) {
                    f = 0.0f;
                }
                m17772F1(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m17774D1(f, z2);
        }
    }

    public void m17770I1() {
        this.f22555O.removeView(this.f22554N);
        this.f22555O.removeView(this.f22553M);
        if (C4403w.m27986G2()) {
            this.f22555O.addView(this.f22554N);
            this.f22555O.addView(this.f22553M);
            return;
        }
        this.f22555O.addView(this.f22553M);
        this.f22555O.addView(this.f22554N);
    }

    public void m17769J1(int i) {
        if (this.f22556P != -1 && getVisibilityFactor() > 0.0f) {
            int T8 = HandlerC10770jj.m3707T8(this.f22556P);
            if (i == 0 || i == T8) {
                this.f22554N.setText(C4403w.m27871i1(T8));
            }
        }
    }

    @Override
    public boolean mo16405K1(float f, float f2) {
        return true;
    }

    public void m17768L1() {
        boolean v1 = C1379j0.m37310r(getContext()).m14428v1();
        boolean z = true;
        boolean z2 = this.f22556P != 0 && !v1;
        if (!this.f22557Q && !v1) {
            z = false;
        }
        this.f22557Q = z;
        m17771G1(z2, z);
    }

    @Override
    public void mo6938O0(int i, boolean z) {
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setFactor(f);
        } else if (i == 1) {
            setColorFactor(f);
        }
    }

    @Override
    public void mo6929S4() {
        setIsPaused(true);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 1.0f) {
            this.f22557Q = false;
        }
    }

    @Override
    public void mo4501a3() {
        C10536ab.m4667o1().m4716b1().m1530y(this);
        C1379j0.m37310r(getContext()).m14445r2(this);
        removeCallbacks(this);
        C1357a0.m37531v(this);
    }

    @Override
    public void mo6904d6() {
        setIsPaused(true);
    }

    @Override
    public void mo1528h5(C10930q6 q6Var, int i, boolean z) {
        if (z) {
            setNetworkState(i);
            m17768L1();
        }
    }

    @Override
    public void mo9611n1(int i) {
        Log.m14719i("new height: %d", Integer.valueOf(i));
        if (getLayoutParams() != null && getLayoutParams().height != i) {
            getLayoutParams().height = i;
            setLayoutParams(getLayoutParams());
        }
    }

    @Override
    public void mo6871o6() {
        setIsPaused(false);
    }

    @Override
    public void run() {
        if (this.f22562V) {
            AbstractView$OnTouchListenerC7889a r = C1379j0.m37310r(getContext());
            if (!r.m14408z1()) {
                r.m14431u3(1, false);
            }
            postDelayed(this, ((1.0f - this.f22559S) * 1000.0f) + 2500);
        }
    }

    @Override
    public void mo1527u(boolean z) {
    }

    @Override
    public void mo1526v6(int i, int i2) {
    }
}
