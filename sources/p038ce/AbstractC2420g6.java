package p038ce;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1399s0;
import be.C1408x;
import me.C6982o0;
import me.C7043v1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4403w;
import p111he.AbstractC5135p;
import p335xd.C10192g;
import p350yd.C10930q6;
import sc.C8731d;
import td.AbstractC9323v4;

public abstract class AbstractC2420g6<T> extends AbstractC9323v4<T> implements C3950k.AbstractC3952b, C7043v1.AbstractC7044a, AbstractC5135p {
    public FrameLayoutFix f8297n0;
    public RecyclerView f8298o0;
    public C6982o0 f8299p0;
    public RecyclerView.AbstractC0896m f8300q0;
    public boolean f8301r0;
    public float f8302s0 = 0.0f;
    public boolean f8303t0;
    public boolean f8304u0;

    public static class C2421a implements TextView.OnEditorActionListener {
        public final int f8305a;
        public final AbstractC5135p f8306b;

        public C2421a(int i, AbstractC5135p pVar) {
            this.f8305a = i;
            this.f8306b = pVar;
        }

        public int m34625a() {
            return this.f8305a;
        }

        public boolean m34624b() {
            return this.f8306b != null;
        }

        @Override
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return this.f8306b != null && i == this.f8305a && (keyEvent == null || keyEvent.getAction() == 0) && this.f8306b.mo23840B5(textView);
        }
    }

    public AbstractC2420g6(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34635Ve(View view) {
        if (this.f8301r0) {
            mo23840B5(null);
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public boolean mo23840B5(View view) {
        return mo30698af();
    }

    @Override
    public View mo8868Ga() {
        return this.f8297n0;
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        if (C1399s0.m37192c0(this.f8299p0, (C4403w.m27986G2() ? 3 : 5) | 80)) {
            C1399s0.m37148y0(this.f8299p0);
        }
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        RecyclerView recyclerView = this.f8298o0;
        if (recyclerView != null && (recyclerView.getAdapter() instanceof C2546iq)) {
            C2546iq iqVar = (C2546iq) this.f8298o0.getAdapter();
            if (i == 0) {
                iqVar.m34254A1();
            } else if (i == 1) {
                iqVar.m34254A1();
            } else if (i == 2) {
                iqVar.m34245E1(i2);
            }
        }
    }

    @Override
    public final void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i != 1) {
            m34633Ye(i, f, f2);
        } else {
            m34628gf(f);
        }
    }

    public final C6982o0 m34639Qe() {
        if (m34637Te()) {
            return this.f8299p0;
        }
        return null;
    }

    public int mo31417Re() {
        return R.id.theme_color_filling;
    }

    public final boolean m34638Se() {
        return this.f8299p0.m18788f();
    }

    public boolean m34637Te() {
        return this.f8301r0;
    }

    public final boolean m34636Ue() {
        return this.f8304u0;
    }

    public boolean mo31411We() {
        return true;
    }

    public void m34634Xe(int i, float f) {
    }

    @Override
    public final void mo35Y0(int i, float f, C3950k kVar) {
        if (i != 0) {
            m34634Xe(i, f);
        }
    }

    public void m34633Ye(int i, float f, float f2) {
    }

    public abstract void mo30699Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView);

    public boolean mo30698af() {
        return false;
    }

    @Override
    public int mo9286ba() {
        return mo31417Re();
    }

    public void mo30697bf(boolean z) {
    }

    public final void m34632cf() {
        if (!m9348S9() || m9333U9() == null) {
            m9298Zb();
            return;
        }
        C1408x.m37091c(m9333U9());
        mo4348c().m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                AbstractC2420g6.this.m9298Zb();
            }
        }, 120L);
    }

    public void m34631df(int i) {
        m34630ef(i, 0);
    }

    public void m34630ef(int i, int i2) {
        if (this.f8299p0.getAlpha() != 0.0f) {
            this.f8299p0.m18786h(i, i2);
        } else {
            this.f8299p0.m18783k(i, i2);
        }
    }

    public final void m34629ff(boolean z) {
        this.f8299p0.setInProgress(z);
    }

    public final void m34628gf(float f) {
        if (this.f8302s0 != f) {
            this.f8302s0 = f;
            this.f8299p0.setMaximumAlpha(f);
        }
    }

    public void mo31399hf(boolean z) {
        if (this.f8301r0 != z) {
            this.f8301r0 = z;
            if (this.f8297n0.getParent() == null || this.f8299p0.getMeasuredWidth() == 0 || !m9339Ta()) {
                if (z) {
                    if (mo31411We()) {
                        this.f8302s0 = 0.0f;
                        this.f8299p0.setMaximumAlpha(0.0f);
                        this.f8303t0 = true;
                    } else {
                        this.f8302s0 = 1.0f;
                        this.f8299p0.setMaximumAlpha(1.0f);
                    }
                }
                this.f8299p0.m18184p(z, false);
                return;
            }
            this.f8302s0 = 1.0f;
            this.f8299p0.setMaximumAlpha(1.0f);
            this.f8299p0.m18184p(z, true);
        }
    }

    public final void m34627if(boolean z) {
        if (this.f8304u0 != z) {
            this.f8304u0 = z;
            m34629ff(z);
            mo30697bf(z);
        }
    }

    public void m34626jf(boolean z) {
        if (this.f8301r0 != z) {
            this.f8301r0 = z;
            this.f8302s0 = 1.0f;
            this.f8299p0.setMaximumAlpha(1.0f);
            this.f8299p0.m18184p(z, false);
        }
    }

    @Override
    public View mo403oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f8297n0 = frameLayoutFix;
        C10192g.m5782i(frameLayoutFix, mo31417Re(), this);
        this.f8297n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        RecyclerView recyclerView = (RecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler, this.f8297n0);
        this.f8298o0 = recyclerView;
        C8731d dVar = new C8731d(C2057b.f7280b, 180L);
        this.f8300q0 = dVar;
        recyclerView.setItemAnimator(dVar);
        this.f8298o0.setHasFixedSize(true);
        this.f8298o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f8298o0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f8297n0.addView(this.f8298o0);
        int i = C1357a0.m37544i(4.0f);
        int i2 = i * 2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f) + i2, C1357a0.m37544i(56.0f) + i2, (C4403w.m27986G2() ? 3 : 5) | 80);
        int i3 = C1357a0.m37544i(16.0f) - i;
        t1.bottomMargin = i3;
        t1.leftMargin = i3;
        t1.rightMargin = i3;
        C6982o0 o0Var = new C6982o0(context);
        this.f8299p0 = o0Var;
        o0Var.setId(R.id.btn_done);
        m9163t8(this.f8299p0);
        this.f8299p0.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AbstractC2420g6.this.m34635Ve(view);
            }
        });
        this.f8299p0.setLayoutParams(t1);
        this.f8299p0.setMaximumAlpha(0.0f);
        this.f8297n0.addView(this.f8299p0);
        mo30699Ze(context, this.f8297n0, this.f8298o0);
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        frameLayoutFix2.addView(this.f8297n0);
        return frameLayoutFix2;
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (this.f8303t0) {
            this.f8303t0 = false;
            C3950k kVar = new C3950k(1, this, C2057b.f7280b, 180L);
            kVar.m29555F(120L);
            kVar.m29546i(1.0f);
        }
    }

    @Override
    public boolean mo18028z3(C7043v1 v1Var) {
        return mo23840B5(v1Var);
    }
}
