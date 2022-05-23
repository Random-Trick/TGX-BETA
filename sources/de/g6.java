package de;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import ce.x;
import db.b;
import eb.k;
import gd.w;
import ie.p;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.o0;
import ne.v1;
import org.thunderdog.challegram.R;
import tc.d;
import ud.v4;
import yd.g;
import zd.o6;

public abstract class g6<T> extends v4<T> implements k.b, v1.a, p {
    public FrameLayoutFix f8034n0;
    public RecyclerView f8035o0;
    public o0 f8036p0;
    public RecyclerView.m f8037q0;
    public boolean f8038r0;
    public float f8039s0 = 0.0f;
    public boolean f8040t0;
    public boolean f8041u0;

    public static class a implements TextView.OnEditorActionListener {
        public final int f8042a;
        public final p f8043b;

        public a(int i10, p pVar) {
            this.f8042a = i10;
            this.f8043b = pVar;
        }

        public int a() {
            return this.f8042a;
        }

        public boolean b() {
            return this.f8043b != null;
        }

        @Override
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            return this.f8043b != null && i10 == this.f8042a && (keyEvent == null || keyEvent.getAction() == 0) && this.f8043b.v5(textView);
        }
    }

    public g6(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ve(View view) {
        if (this.f8038r0) {
            v5(null);
        }
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public View Ga() {
        return this.f8034n0;
    }

    @Override
    public void Ia() {
        super.Ia();
        if (p0.V(this.f8036p0, (w.G2() ? 3 : 5) | 80)) {
            p0.r0(this.f8036p0);
        }
    }

    @Override
    public void Ja(int i10, int i11) {
        RecyclerView recyclerView = this.f8035o0;
        if (recyclerView != null && (recyclerView.getAdapter() instanceof iq)) {
            iq iqVar = (iq) this.f8035o0.getAdapter();
            if (i10 == 0) {
                iqVar.w1();
            } else if (i10 == 1) {
                iqVar.w1();
            } else if (i10 == 2) {
                iqVar.z1(i11);
            }
        }
    }

    public final o0 Qe() {
        if (Te()) {
            return this.f8036p0;
        }
        return null;
    }

    public int Re() {
        return R.id.theme_color_filling;
    }

    public final boolean Se() {
        return this.f8036p0.f();
    }

    public boolean Te() {
        return this.f8038r0;
    }

    public final boolean Ue() {
        return this.f8041u0;
    }

    public boolean We() {
        return true;
    }

    public void Xe(int i10, float f10) {
    }

    public void Ye(int i10, float f10, float f11) {
    }

    public abstract void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView);

    @Override
    public boolean a1(v1 v1Var) {
        return v5(v1Var);
    }

    public boolean af() {
        return false;
    }

    @Override
    public int ba() {
        return Re();
    }

    public void bf(boolean z10) {
    }

    public final void cf() {
        if (!S9() || U9() == null) {
            Zb();
            return;
        }
        x.c(U9());
        c().hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                g6.this.Zb();
            }
        }, 120L);
    }

    public void df(int i10) {
        ef(i10, 0);
    }

    public void ef(int i10, int i11) {
        if (this.f8036p0.getAlpha() != 0.0f) {
            this.f8036p0.h(i10, i11);
        } else {
            this.f8036p0.k(i10, i11);
        }
    }

    public final void ff(boolean z10) {
        this.f8036p0.setInProgress(z10);
    }

    public final void gf(float f10) {
        if (this.f8039s0 != f10) {
            this.f8039s0 = f10;
            this.f8036p0.setMaximumAlpha(f10);
        }
    }

    public void hf(boolean z10) {
        if (this.f8038r0 != z10) {
            this.f8038r0 = z10;
            if (this.f8034n0.getParent() == null || this.f8036p0.getMeasuredWidth() == 0 || !Ta()) {
                if (z10) {
                    if (We()) {
                        this.f8039s0 = 0.0f;
                        this.f8036p0.setMaximumAlpha(0.0f);
                        this.f8040t0 = true;
                    } else {
                        this.f8039s0 = 1.0f;
                        this.f8036p0.setMaximumAlpha(1.0f);
                    }
                }
                this.f8036p0.p(z10, false);
                return;
            }
            this.f8039s0 = 1.0f;
            this.f8036p0.setMaximumAlpha(1.0f);
            this.f8036p0.p(z10, true);
        }
    }

    public final void m2if(boolean z10) {
        if (this.f8041u0 != z10) {
            this.f8041u0 = z10;
            ff(z10);
            bf(z10);
        }
    }

    public void jf(boolean z10) {
        if (this.f8038r0 != z10) {
            this.f8038r0 = z10;
            this.f8039s0 = 1.0f;
            this.f8036p0.setMaximumAlpha(1.0f);
            this.f8036p0.p(z10, false);
        }
    }

    @Override
    public final void n4(int i10, float f10, float f11, k kVar) {
        if (i10 != 1) {
            Ye(i10, f10, f11);
        } else {
            gf(f10);
        }
    }

    @Override
    public final void o4(int i10, float f10, k kVar) {
        if (i10 != 0) {
            Xe(i10, f10);
        }
    }

    @Override
    public View oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f8034n0 = frameLayoutFix;
        g.i(frameLayoutFix, Re(), this);
        this.f8034n0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        RecyclerView recyclerView = (RecyclerView) p0.v(t(), R.layout.recycler, this.f8034n0);
        this.f8035o0 = recyclerView;
        d dVar = new d(b.f7287b, 180L);
        this.f8037q0 = dVar;
        recyclerView.setItemAnimator(dVar);
        this.f8035o0.setHasFixedSize(true);
        this.f8035o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f8035o0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f8034n0.addView(this.f8035o0);
        int i10 = a0.i(4.0f);
        int i11 = i10 * 2;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(56.0f) + i11, a0.i(56.0f) + i11, (w.G2() ? 3 : 5) | 80);
        int i12 = a0.i(16.0f) - i10;
        r12.bottomMargin = i12;
        r12.leftMargin = i12;
        r12.rightMargin = i12;
        o0 o0Var = new o0(context);
        this.f8036p0 = o0Var;
        o0Var.setId(R.id.btn_done);
        t8(this.f8036p0);
        this.f8036p0.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                g6.this.Ve(view);
            }
        });
        this.f8036p0.setLayoutParams(r12);
        this.f8036p0.setMaximumAlpha(0.0f);
        this.f8034n0.addView(this.f8036p0);
        Ze(context, this.f8034n0, this.f8035o0);
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        frameLayoutFix2.addView(this.f8034n0);
        return frameLayoutFix2;
    }

    @Override
    public void sc() {
        super.sc();
        if (this.f8040t0) {
            this.f8040t0 = false;
            k kVar = new k(1, this, b.f7287b, 180L);
            kVar.F(120L);
            kVar.i(1.0f);
        }
    }

    @Override
    public boolean v5(View view) {
        return af();
    }
}
