package ne;

import ae.p;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import ce.j0;
import ce.o;
import eb.n;
import eb.r;
import gd.l;
import gd.w;
import hd.t2;
import ib.i;
import java.util.Iterator;
import je.g;
import je.h;
import je.j;
import je.k;
import je.l0;
import je.m;
import je.n;
import je.o0;
import je.v0;
import je.w0;
import kb.c;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.c2;
import zd.hj;
import zd.o6;
import zd.s1;
import zd.t1;

public class n0 extends View implements t1.a, c2, n, ne.a, c {
    public p M;
    public final o6 Q;
    public String R;
    public l0[] S;
    public int V;
    public long f18263a0;
    public int f18265b0;
    public b f18267c0;
    public k f18268d0;
    public int f18262a = R.id.theme_color_text;
    public int f18264b = R.id.theme_color_textLink;
    public int f18266c = R.id.theme_color_textLinkPressHighlight;
    public final g.c N = new a();
    public int O = 0;
    public int P = -1;
    public final r<g> T = new r<>(new r.a() {
        @Override
        public final void a(r rVar) {
            n0.this.q(rVar);
        }
    }, db.b.f7287b, 180);
    public final ld.b W = new ld.b(this);
    public w0 U = new w0(new o.a(o.k(), o.i(), o.h(), null, o.j(), 0)).m(15.0f);

    public class a implements g.c {
        public a() {
        }

        @Override
        public boolean A(String str) {
            return h.i(this, str);
        }

        @Override
        public boolean C5(String str) {
            return h.m(this, str);
        }

        @Override
        public boolean D3(View view, g gVar, v0 v0Var, String str, boolean z10) {
            return h.f(this, view, gVar, v0Var, str, z10);
        }

        @Override
        public boolean H3(long j10) {
            return h.l(this, j10);
        }

        @Override
        public TdApi.WebPage J2(String str) {
            return h.a(this, str);
        }

        @Override
        public p O1(View view, g gVar) {
            return n0.this.M;
        }

        @Override
        public boolean O4(String str) {
            return h.g(this, str);
        }

        @Override
        public boolean R6(View view, String str) {
            return h.d(this, view, str);
        }

        @Override
        public boolean a5(String str) {
            return h.e(this, str);
        }

        @Override
        public boolean d5(View view, String str, boolean z10, hj.q qVar) {
            return h.k(this, view, str, z10, qVar);
        }

        @Override
        public boolean l2(String str) {
            return h.b(this, str);
        }

        @Override
        public boolean l7(View view, String str, String str2, hj.q qVar) {
            return h.j(this, view, str, str2, qVar);
        }

        @Override
        public boolean z3(String str) {
            return h.h(this, str);
        }
    }

    public interface b {
        void a(n0 n0Var, int i10);
    }

    public n0(Context context, o6 o6Var) {
        super(context);
        this.Q = o6Var;
        t1.b().a(this);
    }

    private int getCurrentHeight() {
        if (this.T == null) {
            return getPaddingTop() + getPaddingBottom();
        }
        int i10 = getLayoutParams() != null ? getLayoutParams().height : -2;
        if (i10 == -2) {
            return getPaddingTop() + Math.round(this.T.r().j()) + getPaddingBottom();
        }
        return this.T != null ? Math.max(getPaddingTop() + Math.round(this.T.r().j()) + getPaddingBottom(), i10) : i10;
    }

    public void o(long j10, g gVar, int i10, boolean z10) {
        if (this.f18263a0 == j10) {
            v(gVar, i10, z10);
        }
    }

    public void p(String str, final int i10, w0 w0Var, int i11, int i12, l0[] l0VarArr, final long j10, final boolean z10) {
        final g gVar = new g(str, i10, w0Var, this, i11, (w.G2() ? Log.TAG_CRASH : 0) | 524376, g.I0(str, i12, l0VarArr, this.Q, null));
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                n0.this.o(j10, gVar, i10, z10);
            }
        });
    }

    public void q(r rVar) {
        if (getMeasuredHeight() != getCurrentHeight()) {
            requestLayout();
        }
        invalidate();
    }

    @Override
    public int I() {
        return this.f18266c;
    }

    @Override
    public int M0() {
        return m.m(this);
    }

    @Override
    public void Q2() {
        this.W.Q2();
    }

    @Override
    public int R() {
        return j.d(this);
    }

    @Override
    public long W0(boolean z10) {
        return j.c(this, z10);
    }

    @Override
    public int X0() {
        return m.i(this);
    }

    @Override
    public int a1() {
        return m.h(this);
    }

    @Override
    public void b() {
        this.W.i();
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public int c() {
        return m.f(this);
    }

    @Override
    public int d(boolean z10) {
        return m.b(this, z10);
    }

    @Override
    public void e() {
        this.W.b();
    }

    @Override
    public void e2() {
        invalidate();
    }

    @Override
    public int g(boolean z10) {
        return m.k(this, z10);
    }

    @Override
    public p g1() {
        return m.e(this);
    }

    public String getText() {
        return this.R;
    }

    public final int j() {
        return Math.max((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 0);
    }

    public final void l() {
        long j10 = this.f18263a0;
        if (j10 == Long.MAX_VALUE) {
            this.f18263a0 = 0L;
        } else {
            this.f18263a0 = j10 + 1;
        }
    }

    public final void m(final String str, final int i10, final boolean z10, final w0 w0Var, final int i11, final int i12, final l0[] l0VarArr) {
        final long j10 = this.f18263a0;
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                n0.this.p(str, i10, w0Var, i11, i12, l0VarArr, j10, z10);
            }
        });
    }

    public int n(int i10) {
        if (this.T.isEmpty() || getMeasuredWidth() == 0) {
            u(i10, false, true, false);
        }
        return getCurrentHeight();
    }

    @Override
    public int o0(boolean z10) {
        return m.c(this, z10);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Iterator<n.c<g>> it = this.T.iterator();
        while (it.hasNext()) {
            n.c<g> next = it.next();
            next.f11479a.w(canvas, getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), 0, getPaddingTop(), this.f18268d0, next.s(), this.W);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0 || getVisibility() == 8) {
            super.onMeasure(i10, i11);
        } else {
            u(size, false, true, false);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f18265b0 != measuredHeight) {
            this.f18265b0 = measuredHeight;
            b bVar = this.f18267c0;
            if (bVar != null) {
                bVar.a(this, measuredHeight);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g w10 = this.T.w();
        if (w10 == null || (this.O == 0 && this.S == null)) {
            return super.onTouchEvent(motionEvent);
        }
        return w10.V0(this, motionEvent, this.N);
    }

    @Override
    public int r(boolean z10) {
        return this.f18264b;
    }

    @Override
    public int r0(boolean z10) {
        return m.a(this, z10);
    }

    @Override
    public void s() {
        invalidate();
    }

    public void setForcedTheme(p pVar) {
        this.M = pVar;
    }

    public void setHeightChangeListener(b bVar) {
        this.f18267c0 = bVar;
    }

    public void setLinkFlags(int i10) {
        this.O = i10;
    }

    public void setMaxLineCount(int i10) {
        this.P = i10;
    }

    public void setTextColorId(int i10) {
        if (this.f18262a != i10) {
            this.f18262a = i10;
            invalidate();
        }
    }

    public void setTextColorSet(k kVar) {
        if (this.f18268d0 != kVar) {
            this.f18268d0 = kVar;
            invalidate();
        }
    }

    public void setTextSize(float f10) {
        if (this.U.h() != f10) {
            this.U.m(f10);
            int i10 = this.V;
            if (i10 > 0 && this.T != null) {
                u(i10, false, false, false);
            }
        }
    }

    public void setTextStyleProvider(w0 w0Var) {
        if (w0Var != null) {
            this.U = w0Var;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public int t() {
        return this.f18262a;
    }

    @Override
    public int t0(boolean z10) {
        return m.j(this, z10);
    }

    public final void u(int i10, boolean z10, boolean z11, boolean z12) {
        if (i10 != this.V || !z11) {
            g w10 = this.T.w();
            this.V = i10;
            if (w10 != null) {
                w10.p();
            }
            if (i.i(this.R)) {
                this.T.m(z10);
            } else if (i10 > 0) {
                int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                int i11 = 0;
                boolean z13 = !z11 && z12;
                l();
                if (z13) {
                    m(this.R, paddingLeft, z10, this.U, this.P, this.O, this.S);
                } else {
                    String str = this.R;
                    w0 w0Var = this.U;
                    int i12 = this.P;
                    if (w.G2()) {
                        i11 = Log.TAG_CRASH;
                    }
                    g gVar = new g(str, paddingLeft, w0Var, this, i12, i11 | 524376, g.I0(this.R, this.O, this.S, this.Q, null));
                    gVar.o1(new gb.h(this));
                    this.T.u(gVar, z10);
                }
                if (!z11) {
                    if (!(measuredHeight == 0 || measuredHeight == getCurrentHeight())) {
                        requestLayout();
                    }
                    invalidate();
                }
            }
        }
    }

    public final void v(g gVar, int i10, boolean z10) {
        if (j() == i10) {
            g w10 = this.T.w();
            if (w10 != null) {
                w10.p();
            }
            this.T.u(gVar, z10);
            gVar.o1(new gb.h(this));
            if (getMeasuredHeight() != getCurrentHeight()) {
                requestLayout();
            }
            invalidate();
            return;
        }
        u(getMeasuredWidth(), z10, false, false);
    }

    public void w(CharSequence charSequence, l0[] l0VarArr, boolean z10) {
        y(charSequence, new l0[]{new o0(null, this.Q, charSequence.toString(), 0, charSequence.length(), 1, null)}, z10);
    }

    public void x(int i10, int i11) {
        this.f18264b = i10;
        this.f18266c = i11;
    }

    public void y(CharSequence charSequence, l0[] l0VarArr, boolean z10) {
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        if ((charSequence instanceof Spannable) && (l0VarArr == null || l0VarArr.length == 0)) {
            l0VarArr = t2.Y(null, this.Q, charSequence, false, null);
        }
        String str = this.R;
        if ((str == null && charSequence2 != null) || (str != null && !str.equals(charSequence2))) {
            this.R = charSequence2;
            this.S = l0VarArr;
            l();
            int i10 = this.V;
            if (i10 > 0) {
                u(i10, z10, false, true);
            }
            invalidate();
        }
    }

    @Override
    public p z() {
        return this.M;
    }
}
