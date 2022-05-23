package zc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ce.a0;
import ce.j0;
import me.vkryl.android.widget.FrameLayoutFix;
import ud.d1;

public class i extends FrameLayoutFix implements View.OnClickListener, View.OnLongClickListener {
    public a M;
    public boolean N;
    public int O;

    public interface a {
        void C6();

        boolean I1();

        void R5(int i10);
    }

    public i(Context context) {
        super(context);
    }

    private int getButtonHeight() {
        int i10 = 0;
        int e10 = a0.e() - d1.a3(false);
        if (!j0.N()) {
            i10 = a0.i(156.0f) + a0.i(32.0f);
        }
        int i11 = e10 - i10;
        float k10 = a0.k(82.0f);
        return (int) (k10 * Math.min(i11 / (4.0f * k10), 1.2f));
    }

    public void A1(boolean z10) {
        this.N = z10;
        z1();
        setLayoutParams(new ViewGroup.LayoutParams(a0.i(318.0f), -1));
    }

    public void B1() {
        this.O = getButtonHeight();
        int i10 = 0;
        int i11 = 0;
        while (i10 < getChildCount()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getChildAt(i10).getLayoutParams();
            int i12 = this.O;
            layoutParams.height = i12;
            layoutParams.topMargin = i11;
            i10++;
            if (i10 % 3 == 0) {
                i11 += i12;
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (this.M != null) {
            if (view.getId() == -1) {
                this.M.C6();
            } else {
                this.M.R5(view.getId());
            }
            j0.H(view, false);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        a aVar = this.M;
        return aVar != null && aVar.I1();
    }

    public void setCallback(a aVar) {
        this.M = aVar;
    }

    public void setHasFeedback(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt != null && (childAt instanceof h)) {
                    ((h) childAt).setHasFeedback(z10);
                }
            }
        }
    }

    public final void z1() {
        int i10 = a0.i(106.0f);
        this.O = getButtonHeight();
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < 9) {
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(i10, this.O);
            q12.setMargins(i13, i14, 0, 0);
            h hVar = new h(getContext());
            hVar.setHasFeedback(this.N);
            hVar.setId(i11);
            hVar.setNumber(i11);
            hVar.setOnClickListener(this);
            hVar.setLayoutParams(q12);
            addView(hVar);
            i12++;
            if (i12 % 3 == 0) {
                i14 += this.O;
                i13 = 0;
            } else {
                i13 += i10;
            }
            i11++;
        }
        int i15 = i13 + i10;
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(i10, this.O);
        q13.setMargins(i15, i14, 0, 0);
        h hVar2 = new h(getContext());
        hVar2.setHasFeedback(this.N);
        hVar2.setId(0);
        hVar2.setNumber(0);
        hVar2.setOnClickListener(this);
        hVar2.setLayoutParams(q13);
        addView(hVar2);
        int i16 = i15 + i10;
        FrameLayout.LayoutParams q14 = FrameLayoutFix.q1(i10, this.O);
        q14.setMargins(i16, i14, 0, 0);
        h hVar3 = new h(getContext());
        hVar3.setHasFeedback(this.N);
        hVar3.setId(-1);
        hVar3.setNumber(-1);
        hVar3.setOnClickListener(this);
        hVar3.setOnLongClickListener(this);
        hVar3.setLayoutParams(q14);
        addView(hVar3);
    }
}
