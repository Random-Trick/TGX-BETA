package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import ce.a0;
import ce.p0;
import ce.y;
import gd.w;
import he.n;
import ie.g0;
import ie.h0;
import k0.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.v2;
import org.thunderdog.challegram.R;
import ud.b5;
import zd.o6;

public abstract class x4<T> extends t2<T> implements ViewPager.i, b5.c, h0, d2, h1, j1 {
    public v2 f24643t0;
    public c f24644u0;
    public y1 f24645v0;
    public int f24646w0;

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), n.c(), y.g(j.L(x4.this.eg())));
        }
    }

    public interface b {
        void I();
    }

    public static class c extends e2.a {
        public final x4<?> M;
        public final h<v4<?>> N;
        public final Context f24647c;

        public c(Context context, x4<?> x4Var) {
            this.f24647c = context;
            this.M = x4Var;
            this.N = new h<>(x4Var.gg());
        }

        public v4<?> A(int i10) {
            v4<?> e10 = this.N.e(i10);
            if (e10 != null) {
                return e10;
            }
            v4<?> mg = this.M.mg(this.f24647c, i10);
            mg.Id(this.M);
            mg.R8(this.M);
            this.N.j(i10, mg);
            return mg;
        }

        public final int B(int i10) {
            return i10;
        }

        @Override
        public void b(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView(((v4) obj).get());
        }

        @Override
        public int e() {
            return this.M.gg();
        }

        @Override
        public int f(Object obj) {
            int n10 = this.N.n();
            for (int i10 = 0; i10 < n10; i10++) {
                if (this.N.o(i10) == obj) {
                    return B(this.N.i(i10));
                }
            }
            return -2;
        }

        @Override
        public Object j(ViewGroup viewGroup, int i10) {
            v4<?> A = A(B(i10));
            viewGroup.addView(A.get());
            return A;
        }

        @Override
        public boolean k(View view, Object obj) {
            return (obj instanceof v4) && ((v4) obj).Ha() == view;
        }

        public void x() {
            int n10 = this.N.n();
            for (int i10 = 0; i10 < n10; i10++) {
                v4<?> o10 = this.N.o(i10);
                if (!o10.Sa()) {
                    o10.Z8();
                }
            }
            this.N.b();
        }

        public v4<?> y(int i10) {
            int n10 = this.N.n();
            for (int i11 = 0; i11 < n10; i11++) {
                v4<?> o10 = this.N.o(i11);
                if (o10.R9() == i10) {
                    return o10;
                }
            }
            return null;
        }

        public v4<?> z(int i10) {
            return this.N.e(i10);
        }
    }

    public x4(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    private void vg() {
        if (this.f24645v0 != null) {
            String[] hg = hg();
            if (hg == null || hg.length == gg()) {
                this.f24645v0.getTopView().setItems(hg);
                return;
            }
            throw new IllegalArgumentException("sections.length != " + gg());
        }
    }

    @Override
    public int Ea() {
        return M9();
    }

    @Override
    public View G9() {
        return (View) this.f24645v0;
    }

    @Override
    public View Ga() {
        if (jg() != 1) {
            return null;
        }
        return this.f24643t0;
    }

    @Override
    public void Ia() {
        super.Ia();
        v2 v2Var = this.f24643t0;
        if (v2Var != null) {
            v2Var.s();
        }
        int i10 = 3;
        if (jg() == 3) {
            y1 y1Var = this.f24645v0;
            TextView textView = (TextView) ((ViewGroup) y1Var).getChildAt(((ViewGroup) y1Var).getChildCount() - 1);
            if (w.G2()) {
                i10 = 5;
            }
            if (p0.V(textView, i10 | 48)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                if (w.G2()) {
                    layoutParams.rightMargin = a0.i(68.0f);
                    layoutParams.leftMargin = 0;
                } else {
                    layoutParams.leftMargin = a0.i(68.0f);
                    layoutParams.rightMargin = 0;
                }
                p0.r0(textView);
            }
        }
    }

    public void J(int i10, View view) {
        v4<?> cg = cg();
        if (cg instanceof h1) {
            ((h1) cg).J(i10, view);
        }
    }

    @Override
    public void Ja(int i10, int i11) {
        if (i10 == 0) {
            vg();
        } else if (i10 == 2) {
            vg();
        }
    }

    @Override
    public final int M9() {
        int jg = jg();
        if (jg == 1) {
            return n.e();
        }
        if (jg == 2 || jg == 3) {
            return n.e() + n.c();
        }
        return super.M9();
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    public void P0(int i10) {
        v4<?> cg = cg();
        if (cg instanceof j1) {
            ((j1) cg).P0(i10);
        }
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        return f11 <= ((float) ((d1.getTopOffset() + M9()) - n.c())) || (this.f24643t0 != null && lg() && this.f24646w0 == 0);
    }

    @Override
    public final void U3(int i10) {
        this.f24646w0 = i10;
    }

    public final void Yf(CharSequence charSequence) {
        y1 y1Var;
        TextView textView;
        if (jg() == 3 && (y1Var = this.f24645v0) != null && (textView = (TextView) ((View) y1Var).findViewById(R.id.text_title)) != null) {
            p0.c0(textView, charSequence);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        c cVar = this.f24644u0;
        if (cVar != null) {
            cVar.x();
        }
    }

    public final h<v4<?>> Zf() {
        c cVar = this.f24644u0;
        if (cVar != null) {
            return cVar.N;
        }
        return null;
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    public final v4<?> ag(int i10) {
        c cVar = this.f24644u0;
        if (cVar != null) {
            return cVar.y(i10);
        }
        return null;
    }

    public final v4<?> bg(int i10) {
        c cVar = this.f24644u0;
        if (cVar != null) {
            return cVar.z(i10);
        }
        return null;
    }

    public final v4<?> cg() {
        return bg(dg());
    }

    public final int dg() {
        return this.f24644u0.B(this.f24643t0.getCurrentItem());
    }

    public int eg() {
        return R.id.theme_color_filling;
    }

    public int fg() {
        return 0;
    }

    public abstract int gg();

    public abstract String[] hg();

    public final v4<?> ig(int i10) {
        if (this.f24644u0 == null) {
            get();
        }
        v4<?> A = this.f24644u0.A(i10);
        A.get();
        return A;
    }

    @Override
    public void j2(int i10) {
        if (dg() == i10) {
            v4<?> z10 = this.f24644u0.z(this.f24643t0.getCurrentItem());
            if (z10 instanceof b) {
                ((b) z10).I();
            }
        } else if (this.f24643t0.T()) {
            ug(i10, true);
        }
    }

    public int jg() {
        return 1;
    }

    public final org.thunderdog.challegram.widget.ViewPager kg() {
        return this.f24643t0;
    }

    public final boolean lg() {
        return this.f24644u0.B(this.f24643t0.getCurrentItem()) == 0;
    }

    public abstract v4<?> mg(Context context, int i10);

    public abstract void ng(Context context, FrameLayoutFix frameLayoutFix, org.thunderdog.challegram.widget.ViewPager viewPager);

    @Override
    public final android.view.View oc(android.content.Context r10) {
        throw new UnsupportedOperationException("Method not decompiled: ud.x4.oc(android.content.Context):android.view.View");
    }

    public void og(int i10, int i11, float f10, int i12) {
    }

    @Override
    public void p5(int i10) {
        v4<?> cg = cg();
        if (cg instanceof d2) {
            ((d2) cg).p5(i10);
        }
    }

    public void pg(int i10, int i11) {
    }

    @Override
    public void qc() {
        super.qc();
        kg().setPagingEnabled(false);
        cg().qc();
    }

    public boolean qg() {
        return false;
    }

    @Override
    public boolean r3(View view, int i10) {
        v4<?> z10 = this.f24644u0.z(this.f24643t0.getCurrentItem());
        return (z10 instanceof h0) && ((h0) z10).r3(view, i10);
    }

    @Override
    public final void r4(int i10) {
        pg(this.f24644u0.B(i10), i10);
    }

    public final void rg(int i10, Runnable runnable) {
        v4<?> A;
        c cVar = this.f24644u0;
        if (cVar != null) {
            h hVar = cVar.N;
            int B = this.f24644u0.B(i10);
            if (hVar.e(B) == null && (A = this.f24644u0.A(B)) != null) {
                if (runnable != null) {
                    A.fd(runnable);
                }
                A.get();
                return;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void sg(int i10, v4<?> v4Var) {
        v4<?> z10 = this.f24644u0.z(i10);
        if (z10 != null) {
            this.f24644u0.N.k(i10);
            z10.Z8();
            v4Var.Id(this);
            v4Var.R8(this);
            this.f24644u0.N.j(i10, v4Var);
            this.f24644u0.l();
        }
    }

    public final boolean tg() {
        if (lg()) {
            return false;
        }
        this.f24643t0.N(this.f24644u0.B(0), true);
        return true;
    }

    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        v4<?> cg = cg();
        if (cg instanceof h1) {
            ((h1) cg).u1(i10, d1Var, linearLayout);
        }
    }

    public final void ug(int i10, boolean z10) {
        y1 y1Var = this.f24645v0;
        if (y1Var != null && z10) {
            y1Var.getTopView().V1(this.f24643t0.getCurrentItem(), i10);
        }
        this.f24643t0.N(i10, z10);
    }

    public boolean wg() {
        return false;
    }

    @Override
    public final void x(int i10, float f10, int i11) {
        y1 y1Var = this.f24645v0;
        if (y1Var != null) {
            y1Var.getTopView().setSelectionFactor(i10 + f10);
        }
        og(this.f24644u0.B(i10), i10, f10, i11);
        if (S9()) {
            La();
        }
    }

    @Override
    public int xa() {
        v4<?> cg = cg();
        return cg != null ? cg.xa() : super.xa();
    }

    @Override
    public void yc() {
        super.yc();
        kg().setPagingEnabled(true);
        cg().yc();
    }
}
