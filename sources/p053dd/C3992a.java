package p053dd;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import be.C1357a0;
import be.C1399s0;
import gd.C4618d7;
import ge.C4896n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.p211v.HeaderEditText;
import p082fd.C4403w;
import td.AbstractC9165c2;
import td.AbstractC9208i2;
import td.View$OnClickListenerC9170d1;

public class C3992a extends FrameLayoutFix implements AbstractC9165c2, AbstractC9208i2, TextWatcher, View$OnClickListenerC9170d1.AbstractC9173c {
    public HeaderEditText f13369M;
    public ScrollView f13370N;
    public C4004i f13371O;
    public AbstractC3995c f13372P;
    public ArrayList<C4618d7> f13373Q = new ArrayList<>(10);
    public int f13374R;
    public int f13375S;
    public int f13376T;
    public int f13377U;
    public float f13378V;
    public boolean f13379W;
    public int f13380a0;
    public boolean f13381b0;
    public boolean f13382c0;
    public float f13383d0;

    public class C3993a extends ScrollView {
        public C3993a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return motionEvent.getAction() == 0 ? motionEvent.getY() < ((float) C3992a.this.f13376T) && super.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
    }

    public class View$OnLayoutChangeListenerC3994b implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC3994b() {
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C3992a.this.f13370N.scrollTo(0, C3992a.this.f13371O.getMeasuredHeight() - C3992a.this.f13370N.getMeasuredHeight());
            C3992a.this.f13370N.removeOnLayoutChangeListener(this);
        }
    }

    public interface AbstractC3995c {
        void mo29402H3(int i);

        void mo29401T();

        void mo29400Y2(int i);

        View mo29399o();

        void mo29398p3(long j);

        void mo29397q(String str);
    }

    public C3992a(Context context) {
        super(context);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -2);
        C4004i iVar = new C4004i(context);
        this.f13371O = iVar;
        iVar.setHeaderView(this);
        this.f13371O.setLayoutParams(s1);
        int i = C1357a0.m37544i(12.0f) + C1357a0.m37544i(8.0f) + (C1357a0.m37544i(16.0f) * 4);
        this.f13374R = i;
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, i);
        if (C4403w.m27986G2()) {
            s12.rightMargin = C1357a0.m37544i(60.0f);
        } else {
            s12.leftMargin = C1357a0.m37544i(60.0f);
        }
        C3993a aVar = new C3993a(context);
        this.f13370N = aVar;
        aVar.setVerticalScrollBarEnabled(false);
        this.f13370N.addView(this.f13371O);
        this.f13370N.setLayoutParams(s12);
        addView(this.f13370N);
        FrameLayout.LayoutParams s13 = FrameLayoutFix.m18008s1(-1, C4896n.m24479e());
        if (C4403w.m27986G2()) {
            s13.rightMargin = C1357a0.m37544i(68.0f);
        } else {
            s13.leftMargin = C1357a0.m37544i(68.0f);
        }
        HeaderEditText z = HeaderEditText.m14150z(this, false, null);
        this.f13369M = z;
        z.setPadding(C1357a0.m37544i(5.0f), 0, C1357a0.m37544i(5.0f), 0);
        this.f13369M.addTextChangedListener(this);
        this.f13369M.setImeOptions(6);
        this.f13369M.setLayoutParams(s13);
        addView(this.f13369M);
    }

    public void m29412F1(C4618d7 d7Var) {
        this.f13373Q.add(d7Var);
        this.f13371O.m29358i(d7Var);
    }

    public boolean m29411G1() {
        return this.f13371O.m29350q();
    }

    public void m29410I1() {
        this.f13369M.setText("");
    }

    public void m29409J1() {
        AbstractC3995c cVar;
        if (!this.f13379W) {
            this.f13376T += this.f13377U;
            if (this.f13381b0 && (cVar = this.f13372P) != null) {
                cVar.mo29401T();
            }
        }
    }

    public void m29408L1(int i) {
        if (this.f13382c0) {
            this.f13382c0 = false;
            this.f13376T = Math.min(this.f13374R, i);
            this.f13370N.scrollTo(0, i);
            this.f13369M.setTranslationY(this.f13376T);
        } else if (m29406N1(i, false)) {
            setFactor(1.0f);
            m29409J1();
        }
    }

    public void m29407M1(List<C4618d7> list) {
        for (C4618d7 d7Var : list) {
            this.f13373Q.add(d7Var);
            this.f13371O.m29357j(d7Var);
        }
        this.f13371O.m29356k();
        this.f13382c0 = true;
        this.f13370N.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC3994b());
    }

    public boolean m29406N1(int i, boolean z) {
        AbstractC3995c cVar;
        this.f13378V = 0.0f;
        int i2 = this.f13376T;
        if (i2 != this.f13374R || i < i2) {
            this.f13377U = i - i2;
            this.f13379W = false;
            if (i >= i2 || (cVar = this.f13372P) == null) {
                this.f13381b0 = true;
            } else {
                cVar.mo29402H3(i);
                this.f13381b0 = false;
            }
        } else {
            int scrollY = this.f13370N.getScrollY();
            this.f13380a0 = scrollY;
            int i3 = (i - this.f13374R) - scrollY;
            this.f13377U = i3;
            this.f13379W = true;
            if (z && i3 > 0) {
                this.f13377U = 0;
            }
        }
        return this.f13377U != 0;
    }

    public final void m29405O1(int i) {
        this.f13371O.m29345v(this.f13373Q.remove(i));
    }

    public void m29404Q1(C4618d7 d7Var) {
        long s = d7Var.m26871s();
        Iterator<C4618d7> it = this.f13373Q.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m26871s() == s) {
                m29405O1(i);
                return;
            }
            i++;
        }
    }

    public void m29403Z() {
        this.f13371O.m29352o();
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public int getCurrentWrapHeight() {
        return Math.min(this.f13374R, this.f13371O.getCurrentHeight());
    }

    public float getFactor() {
        return this.f13378V;
    }

    public HeaderEditText getInput() {
        return this.f13369M;
    }

    public HeaderEditText getSearchInput() {
        return this.f13369M;
    }

    @Override
    public void mo8402i0(float f, float f2, float f3, boolean z) {
        float a = C4896n.m24483a(f);
        if (this.f13383d0 != a) {
            this.f13383d0 = a;
            int i = this.f13376T;
            if (i != 0) {
                setTranslationY((-this.f13376T) * (1.0f - (a / (i / C4896n.m24478f(false)))));
            }
        }
    }

    @Override
    public void mo9774k0(View$OnClickListenerC9170d1 d1Var, int i) {
        this.f13375S = i;
        C1399s0.m37158t0(this.f13370N, i);
        C1399s0.m37158t0(this.f13369M, i);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AbstractC3995c cVar = this.f13372P;
        if (cVar != null) {
            cVar.mo29397q(charSequence.toString());
        }
    }

    @Override
    public void mo8255s() {
        HeaderEditText headerEditText = this.f13369M;
        if (!(headerEditText == null || headerEditText.getGravity() == (C4403w.m27991F1() | 16))) {
            this.f13369M.mo8255s();
            if (C1399s0.m37180i0((FrameLayout.LayoutParams) this.f13369M.getLayoutParams(), C4403w.m27986G2() ? 0 : C1357a0.m37544i(68.0f), this.f13375S, C4403w.m27986G2() ? C1357a0.m37544i(68.0f) : 0, 0)) {
                C1399s0.m37148y0(this.f13369M);
            }
        }
        C4004i iVar = this.f13371O;
        if (iVar != null) {
            iVar.invalidate();
        }
        ScrollView scrollView = this.f13370N;
        if (scrollView != null) {
            if (C1399s0.m37180i0((FrameLayout.LayoutParams) scrollView.getLayoutParams(), C4403w.m27986G2() ? 0 : C1357a0.m37544i(60.0f), this.f13375S, C4403w.m27986G2() ? C1357a0.m37544i(60.0f) : 0, 0)) {
                C1399s0.m37148y0(this.f13370N);
            }
        }
    }

    public void setCallback(AbstractC3995c cVar) {
        this.f13372P = cVar;
    }

    public void setFactor(float f) {
        if (this.f13378V == f) {
            return;
        }
        if (this.f13379W) {
            this.f13370N.scrollTo(0, this.f13380a0 + ((int) (this.f13377U * f)));
            return;
        }
        int i = this.f13376T + ((int) (this.f13377U * f));
        this.f13369M.setTranslationY(i);
        AbstractC3995c cVar = this.f13372P;
        if (cVar != null) {
            cVar.mo29400Y2(i);
        }
    }

    public void setHint(int i) {
        this.f13369M.setHint(C4403w.m27871i1(i));
    }
}
