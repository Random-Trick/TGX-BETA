package ie;

import ae.p;
import ae.v;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ce.p0;
import he.i;
import ie.c0;
import java.util.Iterator;
import java.util.List;
import ne.j2;
import ne.k2;
import org.drinkless.td.libcore.telegram.TdApi;
import ud.i1;
import zd.o6;
import zd.t7;
import zd.x7;

public class c0 implements View.OnTouchListener, View.OnLongClickListener {
    public final v M;
    public final p N;
    public j2 f14229a;
    public final c f14230b;
    public final b f14231c;

    public interface b {
        void I0(View view, View view2);
    }

    public interface c {
        List<a> F3(View view);
    }

    public c0(c cVar, b bVar, v vVar, p pVar) {
        this.f14230b = cVar;
        this.f14231c = bVar;
        this.M = vVar;
        this.N = pVar;
    }

    public static void h(View view, View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ViewParent parent = view2.getParent();
        if (parent != null) {
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = view2.getMeasuredHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            ViewGroup viewGroup = (ViewGroup) parent;
            int measuredWidth3 = viewGroup.getMeasuredWidth();
            int measuredHeight3 = viewGroup.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0 && measuredWidth3 > 0 && measuredHeight3 > 0) {
                int[] r10 = p0.r(view);
                int i18 = r10[0] + (measuredWidth2 / 2);
                int i19 = measuredHeight2 / 2;
                int[] r11 = p0.r(view2);
                r11[0] = (int) (r11[0] - view2.getTranslationX());
                r11[1] = (int) (r11[1] - view2.getTranslationY());
                int i20 = measuredWidth / 2;
                int i21 = r11[0] + i20;
                int i22 = measuredHeight / 2;
                int i23 = ((r10[1] + i19) - i19) - i22;
                view2.setTranslationX(Math.max(i20, Math.min(measuredWidth3 - i20, i18)) - i21);
                view2.setTranslationY(i23 - (r11[1] + i22));
            }
        }
    }

    public void j(List list, j2 j2Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).Q2();
        }
        if (this.f14229a == j2Var) {
            this.f14229a = null;
        }
    }

    public c0 d(View view) {
        view.setOnLongClickListener(this);
        return this;
    }

    public c0 e(View view) {
        view.setOnLongClickListener(null);
        return this;
    }

    public final void f(View view, float f10, float f11, boolean z10) {
    }

    public void g() {
        j2 j2Var = this.f14229a;
        if (j2Var != null) {
            j2Var.s2(true);
            this.f14229a = null;
        }
    }

    public final void i(a aVar, View view, View view2) {
        j2 j2Var = this.f14229a;
        if (j2Var != null && !j2Var.u2()) {
            this.f14231c.I0(view, view2);
            if (aVar.Q != null) {
                aVar.Q.onClick(view);
            }
            g();
        }
    }

    public final void l(final View view, final List<a> list) {
        j2 j2Var = this.f14229a;
        if (j2Var != null) {
            j2Var.s2(false);
        }
        i1 i1Var = new i1(view.getContext());
        i1Var.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                c0.h(view, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        i1Var.b(this.M, this.N);
        for (final a aVar : list) {
            aVar.S = i1Var.a(aVar.f14232a, aVar.f14233b, aVar.f14234c, aVar.M, new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    c0.this.i(aVar, view, view2);
                }
            });
            aVar.S.setVisibility(aVar.h() ? 0 : 8);
            if (aVar.R != 0) {
                i.c2().u2(aVar.R);
            }
        }
        i1Var.setAnchorMode(0);
        i1Var.setShouldPivotBottom(true);
        i1Var.setRightNumber(0);
        j2 j2Var2 = new j2(view.getContext());
        this.f14229a = j2Var2;
        j2Var2.L1(false);
        this.f14229a.I2();
        this.f14229a.setOverlayStatusBar(true);
        this.f14229a.setDismissListener(new j2.f() {
            @Override
            public final void h3(j2 j2Var3) {
                c0.this.j(list, j2Var3);
            }

            @Override
            public void w(j2 j2Var3) {
                k2.a(this, j2Var3);
            }
        });
        this.f14229a.N2(i1Var);
    }

    public final void m(View view, float f10, float f11) {
    }

    @Override
    public boolean onLongClick(View view) {
        List<a> F3 = this.f14230b.F3(view);
        if (F3 == null || F3.isEmpty()) {
            return false;
        }
        l(view, F3);
        return true;
    }

    @Override
    public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ie.c0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static class a implements kb.c {
        public final Drawable M;
        public o6 N;
        public long O;
        public t7.j P;
        public View.OnClickListener Q;
        public long R;
        public View S;
        public final int f14232a;
        public final CharSequence f14233b;
        public final int f14234c;

        public a(int i10, CharSequence charSequence, int i11) {
            this.f14232a = i10;
            this.f14233b = charSequence;
            this.f14234c = i11;
            this.M = null;
        }

        public void i(long j10, long j11, TdApi.UserStatus userStatus, boolean z10) {
            if (j11 == j10) {
                int i10 = 0;
                boolean z11 = (userStatus == null || userStatus.getConstructor() != -759984891 || ((TdApi.UserStatusOffline) userStatus).wasOnline == 0) ? false : true;
                View view = this.S;
                if (view != null) {
                    if (!z11) {
                        i10 = 8;
                    }
                    view.setVisibility(i10);
                }
            }
        }

        @Override
        public void Q2() {
            o6 o6Var = this.N;
            if (o6Var != null && this.P != null) {
                o6Var.e2().q2(this.O, this.P);
                this.N = null;
                this.P = null;
                this.S = null;
            }
        }

        public a f(o6 o6Var, final long j10) {
            if (!(o6Var == null || j10 == 0)) {
                this.N = o6Var;
                this.O = j10;
                this.P = new t7.j() {
                    @Override
                    public final void A3(long j11, TdApi.UserStatus userStatus, boolean z10) {
                        c0.a.this.i(j10, j11, userStatus, z10);
                    }

                    @Override
                    public boolean u3() {
                        return x7.a(this);
                    }
                };
                o6Var.e2().c2(j10, this.P);
            }
            return this;
        }

        public a g(long j10) {
            this.R = j10;
            return this;
        }

        public boolean h() {
            o6 o6Var;
            return this.O == 0 || (o6Var = this.N) == null || o6Var.e2().H2(this.O);
        }

        public a j(View.OnClickListener onClickListener) {
            this.Q = onClickListener;
            return this;
        }

        public a(int i10, CharSequence charSequence, Drawable drawable) {
            this.f14232a = i10;
            this.f14233b = charSequence;
            this.f14234c = 0;
            this.M = drawable;
        }
    }
}
