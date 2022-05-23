package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import db.g;
import eb.k;
import gd.w;
import ib.d;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.c0;
import org.thunderdog.challegram.R;

public class w1 extends FrameLayoutFix implements View.OnClickListener, k.b, kb.c {
    public b M;
    public c0 N;
    public final k O = new k(0, this, db.b.f7287b, 200);
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public k T;
    public boolean U;
    public float V;

    public class a extends b2 {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !(motionEvent.getAction() == 0 && getAlpha() == 0.0f) && super.onTouchEvent(motionEvent);
        }
    }

    public interface b {
        boolean S3(int i10, View view);
    }

    public static class c extends Drawable {
        public final w1 f24552a;

        public c(w1 w1Var) {
            this.f24552a = w1Var;
        }

        @Override
        public void draw(Canvas canvas) {
            int D1 = this.f24552a.D1();
            if (D1 != 0) {
                canvas.drawColor(D1);
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i10) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public w1(Context context) {
        super(context);
        g.d(this, new c(this));
        setLayoutParams(FrameLayoutFix.q1(-1, -1));
    }

    private void setChildrenLayerType(int i10) {
        for (int i11 = 0; i11 < getChildCount() - 1; i11++) {
            p0.Y(getChildAt(i11), i10);
        }
    }

    private void setHideFactor(float f10) {
        float a10 = ce.a.a(f10);
        if (this.S != a10) {
            this.S = a10;
            this.N.setTranslationY(((a0.i(16.0f) * 2) + this.N.getMeasuredHeight()) * a10);
        }
    }

    public final void A1(v4<?> v4Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = a0.i(4.0f);
        int i17 = i16 * 2;
        int i18 = 83;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(40.0f) + i17, a0.i(40.0f) + i17, w.G2() ? 83 : 85);
        r12.bottomMargin = (a0.i(96.0f) + (a0.i(56.0f) * i10)) - i16;
        int i19 = a0.i(24.0f) - i16;
        r12.leftMargin = i19;
        r12.rightMargin = i19;
        c0 c0Var = new c0(getContext());
        c0Var.d(i12, 40.0f, 4.0f, i13, i14);
        v4Var.t8(c0Var);
        c0Var.setId(i11);
        c0Var.setOnClickListener(this);
        c0Var.setLayoutParams(r12);
        if (this.V == 0.0f) {
            c0Var.setEnabled(false);
            c0Var.setScaleX(0.6f);
            c0Var.setScaleY(0.6f);
            c0Var.setAlpha(0.0f);
        }
        int i20 = i10 * 2;
        addView(c0Var, i20);
        int i21 = a0.i(26.0f) + i17;
        if (!w.G2()) {
            i18 = 85;
        }
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-2, i21, i18);
        r13.bottomMargin = (a0.i(103.0f) + (a0.i(56.0f) * i10)) - i16;
        if (w.G2()) {
            r13.leftMargin = a0.i(90.0f) - i16;
            r13.rightMargin = a0.i(26.0f) - i16;
        } else {
            r13.rightMargin = a0.i(90.0f) - i16;
            r13.leftMargin = a0.i(26.0f) - i16;
        }
        TextView P1 = P1(v4Var);
        P1.setId(i11);
        P1.setOnClickListener(this);
        P1.setText(w.i1(v4Var.P8(i15, P1, false, false)));
        P1.setLayoutParams(r13);
        if (this.V == 0.0f) {
            P1.setEnabled(false);
            P1.setScaleX(0.6f);
            P1.setScaleY(0.6f);
            P1.setAlpha(0.0f);
        }
        P1.setTranslationZ(a0.i(2.0f));
        addView(P1, i20 + 1);
    }

    public final void B1(v4<?> v4Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = a0.i(4.0f);
        int i17 = i16 * 2;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(56.0f) + i17, a0.i(56.0f) + i17, w.G2() ? 83 : 85);
        int i18 = a0.i(16.0f) - i16;
        r12.bottomMargin = i18;
        r12.leftMargin = i18;
        r12.rightMargin = i18;
        c0 c0Var = new c0(getContext());
        c0Var.d(i11, 56.0f, 4.0f, i12, i13);
        c0Var.i(i14, i15);
        c0Var.setId(i10);
        c0Var.setOnClickListener(this);
        c0Var.setLayoutParams(r12);
        v4Var.t8(c0Var);
        this.N = c0Var;
        addView(c0Var);
    }

    public final void C1(float f10) {
        if (this.T == null) {
            this.T = new k(1, this, db.b.f7286a, 440L, this.S);
        }
        this.T.i(f10);
    }

    public final int D1() {
        if (this.V != 0.0f) {
            int d10 = d.d(d.b(0, j.C0()), j.C0(), this.V);
            if (Color.alpha(d10) != 0) {
                return d10;
            }
        }
        return 0;
    }

    public void E1() {
        if (this.Q) {
            V1();
        }
    }

    public void G1() {
        if (this.N == null || this.R) {
            this.U = false;
            return;
        }
        H1();
        this.U = true;
    }

    public void H1() {
        if (this.N != null && !this.R) {
            I1();
            this.R = true;
            C1(1.0f);
        }
    }

    public void I1() {
        if (this.Q) {
            V1();
        }
    }

    public void K1(v4<?> v4Var, int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, boolean z10) {
        if (z10) {
            int length = iArr.length - 1;
            int i12 = 0;
            while (length >= 1) {
                A1(v4Var, i12, iArr[length], iArr2[length], iArr3[length], iArr4[length], iArr5[length - 1]);
                length--;
                i12++;
            }
        } else {
            for (int i13 = 1; i13 < iArr.length; i13++) {
                int i14 = i13 - 1;
                A1(v4Var, i14, iArr[i13], iArr2[i13], iArr3[i13], iArr4[i13], iArr5[i14]);
            }
        }
        B1(v4Var, iArr[0], iArr2[0], iArr3[0], iArr4[0], i10, i11);
    }

    public final void L1(int i10, View view) {
        b bVar = this.M;
        if (bVar != null && bVar.S3(i10, view)) {
            E1();
        }
    }

    public boolean O1() {
        return this.O.v() || this.O.o() != 0.0f;
    }

    public final TextView P1(v4<?> v4Var) {
        int i10 = a0.i(4.0f);
        a aVar = new a(getContext());
        aVar.setTextColor(j.R0());
        v4Var.A8(aVar);
        yd.d.e(aVar, 3.0f, 4.0f, R.id.theme_color_filling);
        v4Var.t8(aVar);
        aVar.setTextSize(1, 15.0f);
        aVar.setTypeface(o.g());
        aVar.setSingleLine(true);
        aVar.setEllipsize(TextUtils.TruncateAt.END);
        aVar.setPadding(a0.i(8.0f) + i10, a0.i(2.5f) + i10, a0.i(8.0f) + i10, i10);
        aVar.setOnClickListener(this);
        return aVar;
    }

    @Override
    public void Q2() {
        this.P = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof kb.c) {
                ((kb.c) childAt).Q2();
            }
        }
    }

    public void R1(int i10, int i11) {
        this.N.setId(i10);
        this.N.g(i11);
    }

    public void S1() {
        if (this.N != null && this.R && !this.U) {
            this.R = false;
            C1(0.0f);
        }
    }

    public void T1() {
        if (this.U) {
            this.U = false;
            S1();
        }
    }

    public void V1() {
        if (this.Q || (!this.R && !this.U && !j0.r(getContext()).x1())) {
            boolean z10 = !this.Q;
            this.Q = z10;
            float f10 = 0.0f;
            if (z10 && this.O.o() == 0.0f) {
                setChildrenLayerType(2);
            }
            k kVar = this.O;
            if (this.Q) {
                f10 = 1.0f;
            }
            kVar.i(f10);
        }
    }

    public void W1() {
        int i10;
        int i11;
        boolean z10;
        int i12 = w.G2() ? 83 : 85;
        int i13 = a0.i(4.0f);
        if (w.G2()) {
            i11 = a0.i(90.0f) - i13;
            i10 = a0.i(26.0f) - i13;
        } else {
            i10 = a0.i(90.0f) - i13;
            i11 = a0.i(26.0f) - i13;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                boolean z11 = true;
                if (layoutParams.gravity != i12) {
                    layoutParams.gravity = i12;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 % 2 != 1 || (layoutParams.leftMargin == i11 && layoutParams.rightMargin == i10)) {
                    z11 = z10;
                } else {
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = i10;
                }
                if (z11) {
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 1) {
            setHideFactor(f10);
            return;
        }
        this.V = f10;
        this.N.n(w.G2(), this.V);
        d1 w10 = j0.w(getContext());
        if (w10 != null) {
            w10.setOverlayColor(D1());
        }
        int childCount = getChildCount() - 1;
        float f12 = (1.0f / (childCount / 2)) * 0.8f;
        float f13 = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            float f14 = 1.0f - f13;
            float f15 = f10 < f13 ? 0.0f : f10 > f13 + f14 ? 1.0f : (f10 - f13) / f14;
            View childAt = getChildAt(i11);
            childAt.setEnabled(f10 == 1.0f);
            if (i11 % 2 == 1) {
                childAt.setPivotX(w.G2() ? 0.0f : childAt.getMeasuredWidth());
                f13 += f12;
            }
            childAt.setPivotY(childAt.getMeasuredHeight());
            float f16 = (0.39999998f * f15) + 0.6f;
            childAt.setScaleX(f16);
            childAt.setScaleY(f16);
            childAt.setAlpha(f15);
        }
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (f10 == 0.0f) {
            setChildrenLayerType(0);
        }
    }

    @Override
    public void onClick(View view) {
        if (!this.R) {
            L1(view.getId(), view);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !p0.z(this) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            E1();
        }
        return p0.z(this) && (super.onTouchEvent(motionEvent) || this.O.o() != 0.0f);
    }

    public void setCallback(b bVar) {
        this.M = bVar;
    }
}
