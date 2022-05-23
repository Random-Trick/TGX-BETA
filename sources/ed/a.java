package ed;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import ce.a0;
import ce.p0;
import gd.w;
import hd.d7;
import he.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.v.HeaderEditText;
import ud.c2;
import ud.d1;
import ud.i2;

public class a extends FrameLayoutFix implements c2, i2, TextWatcher, d1.c {
    public HeaderEditText M;
    public ScrollView N;
    public i O;
    public c P;
    public ArrayList<d7> Q = new ArrayList<>(10);
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public boolean W;
    public int f11526a0;
    public boolean f11527b0;
    public boolean f11528c0;
    public float f11529d0;

    public class C0098a extends ScrollView {
        public C0098a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return motionEvent.getAction() == 0 ? motionEvent.getY() < ((float) a.this.T) && super.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
    }

    public class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a.this.N.scrollTo(0, a.this.O.getMeasuredHeight() - a.this.N.getMeasuredHeight());
            a.this.N.removeOnLayoutChangeListener(this);
        }
    }

    public interface c {
        void M2(int i10);

        void U();

        void e3(long j10);

        View n();

        void p(String str);

        void y3(int i10);
    }

    public a(Context context) {
        super(context);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -2);
        i iVar = new i(context);
        this.O = iVar;
        iVar.setHeaderView(this);
        this.O.setLayoutParams(q12);
        int i10 = a0.i(12.0f) + a0.i(8.0f) + (a0.i(16.0f) * 4);
        this.R = i10;
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, i10);
        if (w.G2()) {
            q13.rightMargin = a0.i(60.0f);
        } else {
            q13.leftMargin = a0.i(60.0f);
        }
        C0098a aVar = new C0098a(context);
        this.N = aVar;
        aVar.setVerticalScrollBarEnabled(false);
        this.N.addView(this.O);
        this.N.setLayoutParams(q13);
        addView(this.N);
        FrameLayout.LayoutParams q14 = FrameLayoutFix.q1(-1, n.e());
        if (w.G2()) {
            q14.rightMargin = a0.i(68.0f);
        } else {
            q14.leftMargin = a0.i(68.0f);
        }
        HeaderEditText z10 = HeaderEditText.z(this, false, null);
        this.M = z10;
        z10.setPadding(a0.i(5.0f), 0, a0.i(5.0f), 0);
        this.M.addTextChangedListener(this);
        this.M.setImeOptions(6);
        this.M.setLayoutParams(q14);
        addView(this.M);
    }

    public void C1(d7 d7Var) {
        this.Q.add(d7Var);
        this.O.i(d7Var);
    }

    public boolean D1() {
        return this.O.q();
    }

    public void E1() {
        this.M.setText("");
    }

    public void G1() {
        c cVar;
        if (!this.W) {
            this.T += this.U;
            if (this.f11527b0 && (cVar = this.P) != null) {
                cVar.U();
            }
        }
    }

    public void H1(int i10) {
        if (this.f11528c0) {
            this.f11528c0 = false;
            this.T = Math.min(this.R, i10);
            this.N.scrollTo(0, i10);
            this.M.setTranslationY(this.T);
        } else if (K1(i10, false)) {
            setFactor(1.0f);
            G1();
        }
    }

    public void I1(List<d7> list) {
        for (d7 d7Var : list) {
            this.Q.add(d7Var);
            this.O.j(d7Var);
        }
        this.O.k();
        this.f11528c0 = true;
        this.N.addOnLayoutChangeListener(new b());
    }

    public boolean K1(int i10, boolean z10) {
        c cVar;
        this.V = 0.0f;
        int i11 = this.T;
        if (i11 != this.R || i10 < i11) {
            this.U = i10 - i11;
            this.W = false;
            if (i10 >= i11 || (cVar = this.P) == null) {
                this.f11527b0 = true;
            } else {
                cVar.y3(i10);
                this.f11527b0 = false;
            }
        } else {
            int scrollY = this.N.getScrollY();
            this.f11526a0 = scrollY;
            int i12 = (i10 - this.R) - scrollY;
            this.U = i12;
            this.W = true;
            if (z10 && i12 > 0) {
                this.U = 0;
            }
        }
        return this.U != 0;
    }

    public final void L1(int i10) {
        this.O.v(this.Q.remove(i10));
    }

    public void O1(d7 d7Var) {
        long s10 = d7Var.s();
        Iterator<d7> it = this.Q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().s() == s10) {
                L1(i10);
                return;
            }
            i10++;
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    public void b0() {
        this.O.o();
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public int getCurrentWrapHeight() {
        return Math.min(this.R, this.O.getCurrentHeight());
    }

    public float getFactor() {
        return this.V;
    }

    public HeaderEditText getInput() {
        return this.M;
    }

    public HeaderEditText getSearchInput() {
        return this.M;
    }

    @Override
    public void k0(float f10, float f11, float f12, boolean z10) {
        float a10 = n.a(f10);
        if (this.f11529d0 != a10) {
            this.f11529d0 = a10;
            int i10 = this.T;
            if (i10 != 0) {
                setTranslationY((-this.T) * (1.0f - (a10 / (i10 / n.f(false)))));
            }
        }
    }

    @Override
    public void m(d1 d1Var, int i10) {
        this.S = i10;
        p0.m0(this.N, i10);
        p0.m0(this.M, i10);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        c cVar = this.P;
        if (cVar != null) {
            cVar.p(charSequence.toString());
        }
    }

    @Override
    public void s() {
        HeaderEditText headerEditText = this.M;
        if (!(headerEditText == null || headerEditText.getGravity() == (w.F1() | 16))) {
            this.M.s();
            if (p0.b0((FrameLayout.LayoutParams) this.M.getLayoutParams(), w.G2() ? 0 : a0.i(68.0f), this.S, w.G2() ? a0.i(68.0f) : 0, 0)) {
                p0.r0(this.M);
            }
        }
        i iVar = this.O;
        if (iVar != null) {
            iVar.invalidate();
        }
        ScrollView scrollView = this.N;
        if (scrollView != null) {
            if (p0.b0((FrameLayout.LayoutParams) scrollView.getLayoutParams(), w.G2() ? 0 : a0.i(60.0f), this.S, w.G2() ? a0.i(60.0f) : 0, 0)) {
                p0.r0(this.N);
            }
        }
    }

    public void setCallback(c cVar) {
        this.P = cVar;
    }

    public void setFactor(float f10) {
        if (this.V == f10) {
            return;
        }
        if (this.W) {
            this.N.scrollTo(0, this.f11526a0 + ((int) (this.U * f10)));
            return;
        }
        int i10 = this.T + ((int) (this.U * f10));
        this.M.setTranslationY(i10);
        c cVar = this.P;
        if (cVar != null) {
            cVar.M2(i10);
        }
    }

    public void setHint(int i10) {
        this.M.setHint(w.i1(i10));
    }
}
