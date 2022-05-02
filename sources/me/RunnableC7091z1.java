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
    public C6977n2 f22550M;
    public TextView f22551N;
    public LinearLayout f22552O;
    public boolean f22554Q;
    public boolean f22555R;
    public C3950k f22558U;
    public boolean f22559V;
    public boolean f22560W;
    public int f22553P = -1;
    public float f22556S = -1.0f;
    public float f22557T = -1.0f;

    public RunnableC7091z1(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.m18008s1(-1, C1357a0.m37535o()));
        C1357a0.m37549a(this);
        int N = C11524j.m228N(C4183a.f14085c);
        C6977n2 n2Var = new C6977n2(context);
        this.f22550M = n2Var;
        float f = 1.0f;
        n2Var.m18224j(1.0f);
        this.f22550M.setProgressColor(N);
        this.f22550M.setLayoutParams(new LinearLayout.LayoutParams(C1357a0.m37541i(24.0f), -1));
        C6847b2 b2Var = new C6847b2(context);
        this.f22551N = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.m18008s1(-2, -1));
        this.f22551N.setGravity(16);
        this.f22551N.setTextSize(1, 13.0f);
        this.f22551N.setTextColor(N);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f22552O = linearLayout;
        linearLayout.setOrientation(0);
        if (C4403w.m27984G2()) {
            this.f22552O.addView(this.f22551N);
            this.f22552O.addView(this.f22550M);
        } else {
            this.f22552O.addView(this.f22550M);
            this.f22552O.addView(this.f22551N);
        }
        this.f22552O.setLayoutParams(FrameLayoutFix.m18007t1(-2, -1, 1));
        addView(this.f22552O);
        C10192g.m5781j(this, R.id.theme_color_statusBar);
        C10536ab.m4667o1().m4716b1().m1552c(this);
        setNetworkState(C10536ab.m4667o1().m4684j0().m2142z4());
        setFactor(!this.f22555R ? 0.0f : f);
        C1379j0.m37307r(getContext()).m14554P(this);
    }

    private float getVisibilityFactor() {
        if (this.f22554Q) {
            return 1.0f;
        }
        return this.f22556S;
    }

    private void setColorFactor(float f) {
        if (this.f22557T != f) {
            this.f22557T = f;
            invalidate();
        }
    }

    private void setFactor(float f) {
        if (this.f22556S != f) {
            this.f22556S = f;
            this.f22552O.setAlpha(f);
            this.f22552O.setTranslationY((-C1357a0.m37535o()) + ((int) (C1357a0.m37535o() * getVisibilityFactor())));
            m17773E1();
        }
    }

    private void setIsPaused(boolean z) {
        if (this.f22560W != z) {
            this.f22560W = z;
            m17773E1();
        }
    }

    private void setLowProfile(boolean z) {
        if (this.f22559V != z) {
            this.f22559V = z;
            if (z) {
                run();
                return;
            }
            removeCallbacks(this);
            AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(getContext());
            if (!r.m14409z1()) {
                r.m14432u3(0, false);
            }
        }
    }

    private void setNetworkState(int i) {
        if (this.f22553P != i) {
            this.f22553P = i;
            this.f22550M.setVisibility((i == 0 || i == 4) ? 8 : 0);
            this.f22551N.setText(C4403w.m27869i1(HandlerC10770jj.m3707T8(i)));
            m17768L1();
        }
    }

    public void m17775C1(C11537v vVar) {
        TextView textView = this.f22551N;
        int i = C4183a.f14085c;
        vVar.m77c(textView, i);
        vVar.m77c(this.f22550M, i);
    }

    public final void m17774D1(float f, boolean z) {
        if (this.f22558U == null) {
            this.f22558U = new C3950k(0, this, C2057b.f7280b, 180L, this.f22556S);
        }
        C3950k kVar = this.f22558U;
        float f2 = this.f22556S;
        kVar.m29553F(((f2 == 1.0f || f2 == 0.0f) && !z) ? this.f22555R ? 300L : 1200L : 0L);
        this.f22558U.m29544i(f);
    }

    public final void m17773E1() {
        setLowProfile(!this.f22560W && (this.f22555R || this.f22556S != 0.0f));
    }

    public final void m17772F1(float f) {
        C3950k kVar = this.f22558U;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setFactor(f);
    }

    public final void m17771G1(boolean z, boolean z2) {
        if (this.f22555R != z) {
            this.f22555R = z;
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
        this.f22552O.removeView(this.f22551N);
        this.f22552O.removeView(this.f22550M);
        if (C4403w.m27984G2()) {
            this.f22552O.addView(this.f22551N);
            this.f22552O.addView(this.f22550M);
            return;
        }
        this.f22552O.addView(this.f22550M);
        this.f22552O.addView(this.f22551N);
    }

    public void m17769J1(int i) {
        if (this.f22553P != -1 && getVisibilityFactor() > 0.0f) {
            int T8 = HandlerC10770jj.m3707T8(this.f22553P);
            if (i == 0 || i == T8) {
                this.f22551N.setText(C4403w.m27869i1(T8));
            }
        }
    }

    @Override
    public boolean mo16405K1(float f, float f2) {
        return true;
    }

    public void m17768L1() {
        boolean v1 = C1379j0.m37307r(getContext()).m14429v1();
        boolean z = true;
        boolean z2 = this.f22553P != 0 && !v1;
        if (!this.f22554Q && !v1) {
            z = false;
        }
        this.f22554Q = z;
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
            this.f22554Q = false;
        }
    }

    @Override
    public void mo4501a3() {
        C10536ab.m4667o1().m4716b1().m1530y(this);
        C1379j0.m37307r(getContext()).m14446r2(this);
        removeCallbacks(this);
        C1357a0.m37528v(this);
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
    public void mo9612n1(int i) {
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
        if (this.f22559V) {
            AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(getContext());
            if (!r.m14409z1()) {
                r.m14432u3(1, false);
            }
            postDelayed(this, ((1.0f - this.f22556S) * 1000.0f) + 2500);
        }
    }

    @Override
    public void mo1527u(boolean z) {
    }

    @Override
    public void mo1526v6(int i, int i2) {
    }
}
