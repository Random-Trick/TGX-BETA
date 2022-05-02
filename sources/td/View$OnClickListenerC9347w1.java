package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1356a;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import me.C6847b2;
import me.C6851c0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p139jb.AbstractC5911c;
import p335xd.C10189d;
import p364zd.C11524j;

public class View$OnClickListenerC9347w1 extends FrameLayoutFix implements View.OnClickListener, C3950k.AbstractC3952b, AbstractC5911c {
    public AbstractC9349b f30224M;
    public C6851c0 f30225N;
    public final C3950k f30226O = new C3950k(0, this, C2057b.f7280b, 200);
    public boolean f30227P;
    public boolean f30228Q;
    public boolean f30229R;
    public float f30230S;
    public C3950k f30231T;
    public boolean f30232U;
    public float f30233V;

    public class C9348a extends C6847b2 {
        public C9348a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !(motionEvent.getAction() == 0 && getAlpha() == 0.0f) && super.onTouchEvent(motionEvent);
        }
    }

    public interface AbstractC9349b {
        boolean mo9070f4(int i, View view);
    }

    public static class C9350c extends Drawable {
        public final View$OnClickListenerC9347w1 f30235a;

        public C9350c(View$OnClickListenerC9347w1 w1Var) {
            this.f30235a = w1Var;
        }

        @Override
        public void draw(Canvas canvas) {
            int G1 = this.f30235a.m9084G1();
            if (G1 != 0) {
                canvas.drawColor(G1);
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public View$OnClickListenerC9347w1(Context context) {
        super(context);
        C2065g.m35718d(this, new C9350c(this));
        setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
    }

    private void setChildrenLayerType(int i) {
        for (int i2 = 0; i2 < getChildCount() - 1; i2++) {
            C1399s0.m37183f0(getChildAt(i2), i);
        }
    }

    private void setHideFactor(float f) {
        float a = C1356a.m37555a(f);
        if (this.f30230S != a) {
            this.f30230S = a;
            this.f30225N.setTranslationY(((C1357a0.m37541i(16.0f) * 2) + this.f30225N.getMeasuredHeight()) * a);
        }
    }

    public final void m9087D1(AbstractC9323v4<?> v4Var, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = C1357a0.m37541i(4.0f);
        int i8 = i7 * 2;
        int i9 = 83;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37541i(40.0f) + i8, C1357a0.m37541i(40.0f) + i8, C4403w.m27984G2() ? 83 : 85);
        t1.bottomMargin = (C1357a0.m37541i(96.0f) + (C1357a0.m37541i(56.0f) * i)) - i7;
        int i10 = C1357a0.m37541i(24.0f) - i7;
        t1.leftMargin = i10;
        t1.rightMargin = i10;
        C6851c0 c0Var = new C6851c0(getContext());
        c0Var.m18789d(i3, 40.0f, 4.0f, i4, i5);
        v4Var.m9163t8(c0Var);
        c0Var.setId(i2);
        c0Var.setOnClickListener(this);
        c0Var.setLayoutParams(t1);
        if (this.f30233V == 0.0f) {
            c0Var.setEnabled(false);
            c0Var.setScaleX(0.6f);
            c0Var.setScaleY(0.6f);
            c0Var.setAlpha(0.0f);
        }
        int i11 = i * 2;
        addView(c0Var, i11);
        int i12 = C1357a0.m37541i(26.0f) + i8;
        if (!C4403w.m27984G2()) {
            i9 = 85;
        }
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-2, i12, i9);
        t12.bottomMargin = (C1357a0.m37541i(103.0f) + (C1357a0.m37541i(56.0f) * i)) - i7;
        if (C4403w.m27984G2()) {
            t12.leftMargin = C1357a0.m37541i(90.0f) - i7;
            t12.rightMargin = C1357a0.m37541i(26.0f) - i7;
        } else {
            t12.rightMargin = C1357a0.m37541i(90.0f) - i7;
            t12.leftMargin = C1357a0.m37541i(26.0f) - i7;
        }
        TextView S1 = m9076S1(v4Var);
        S1.setId(i2);
        S1.setOnClickListener(this);
        S1.setText(C4403w.m27869i1(v4Var.m9368P8(i6, S1, false, false)));
        S1.setLayoutParams(t12);
        if (this.f30233V == 0.0f) {
            S1.setEnabled(false);
            S1.setScaleX(0.6f);
            S1.setScaleY(0.6f);
            S1.setAlpha(0.0f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            S1.setTranslationZ(C1357a0.m37541i(2.0f));
        }
        addView(S1, i11 + 1);
    }

    public final void m9086E1(AbstractC9323v4<?> v4Var, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = C1357a0.m37541i(4.0f);
        int i8 = i7 * 2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f) + i8, C1357a0.m37541i(56.0f) + i8, C4403w.m27984G2() ? 83 : 85);
        int i9 = C1357a0.m37541i(16.0f) - i7;
        t1.bottomMargin = i9;
        t1.leftMargin = i9;
        t1.rightMargin = i9;
        C6851c0 c0Var = new C6851c0(getContext());
        c0Var.m18789d(i2, 56.0f, 4.0f, i3, i4);
        c0Var.m18784i(i5, i6);
        c0Var.setId(i);
        c0Var.setOnClickListener(this);
        c0Var.setLayoutParams(t1);
        v4Var.m9163t8(c0Var);
        this.f30225N = c0Var;
        addView(c0Var);
    }

    public final void m9085F1(float f) {
        if (this.f30231T == null) {
            this.f30231T = new C3950k(1, this, C2057b.f7279a, 440L, this.f30230S);
        }
        this.f30231T.m29544i(f);
    }

    public final int m9084G1() {
        if (this.f30233V != 0.0f) {
            int d = C5064d.m24128d(C5064d.m24130b(0, C11524j.m245E0()), C11524j.m245E0(), this.f30233V);
            if (Color.alpha(d) != 0) {
                return d;
            }
        }
        return 0;
    }

    public void m9083I1() {
        if (this.f30228Q) {
            m9072W1();
        }
    }

    public void m9082J1() {
        if (this.f30225N == null || this.f30229R) {
            this.f30232U = false;
            return;
        }
        m9081L1();
        this.f30232U = true;
    }

    public void m9081L1() {
        if (this.f30225N != null && !this.f30229R) {
            m9080M1();
            this.f30229R = true;
            m9085F1(1.0f);
        }
    }

    public void m9080M1() {
        if (this.f30228Q) {
            m9072W1();
        }
    }

    public void m9079N1(AbstractC9323v4<?> v4Var, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, boolean z) {
        if (z) {
            int length = iArr.length - 1;
            int i3 = 0;
            while (length >= 1) {
                m9087D1(v4Var, i3, iArr[length], iArr2[length], iArr3[length], iArr4[length], iArr5[length - 1]);
                length--;
                i3++;
            }
        } else {
            for (int i4 = 1; i4 < iArr.length; i4++) {
                int i5 = i4 - 1;
                m9087D1(v4Var, i5, iArr[i4], iArr2[i4], iArr3[i4], iArr4[i4], iArr5[i5]);
            }
        }
        m9086E1(v4Var, iArr[0], iArr2[0], iArr3[0], iArr4[0], i, i2);
    }

    public final void m9078O1(int i, View view) {
        AbstractC9349b bVar = this.f30224M;
        if (bVar != null && bVar.mo9070f4(i, view)) {
            m9083I1();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            setHideFactor(f);
            return;
        }
        this.f30233V = f;
        this.f30225N.m18779n(C4403w.m27984G2(), this.f30233V);
        View$OnClickListenerC9170d1 w = C1379j0.m37297w(getContext());
        if (w != null) {
            w.setOverlayColor(m9084G1());
        }
        int childCount = getChildCount() - 1;
        float f3 = (1.0f / (childCount / 2)) * 0.8f;
        float f4 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            float f5 = 1.0f - f4;
            float f6 = f < f4 ? 0.0f : f > f4 + f5 ? 1.0f : (f - f4) / f5;
            View childAt = getChildAt(i2);
            childAt.setEnabled(f == 1.0f);
            if (i2 % 2 == 1) {
                childAt.setPivotX(C4403w.m27984G2() ? 0.0f : childAt.getMeasuredWidth());
                f4 += f3;
            }
            childAt.setPivotY(childAt.getMeasuredHeight());
            float f7 = (0.39999998f * f6) + 0.6f;
            childAt.setScaleX(f7);
            childAt.setScaleY(f7);
            childAt.setAlpha(f6);
        }
        invalidate();
    }

    public boolean m9077Q1() {
        return this.f30226O.m29531v() || this.f30226O.m29538o() != 0.0f;
    }

    public final TextView m9076S1(AbstractC9323v4<?> v4Var) {
        int i = C1357a0.m37541i(4.0f);
        C9348a aVar = new C9348a(getContext());
        aVar.setTextColor(C11524j.m213U0());
        v4Var.m9480A8(aVar);
        C10189d.m5799e(aVar, 3.0f, 4.0f, R.id.theme_color_filling);
        v4Var.m9163t8(aVar);
        aVar.setTextSize(1, 15.0f);
        aVar.setTypeface(C1389o.m37262g());
        aVar.setSingleLine(true);
        aVar.setEllipsize(TextUtils.TruncateAt.END);
        aVar.setPadding(C1357a0.m37541i(8.0f) + i, C1357a0.m37541i(2.5f) + i, C1357a0.m37541i(8.0f) + i, i);
        aVar.setOnClickListener(this);
        return aVar;
    }

    public void m9075T1(int i, int i2) {
        this.f30225N.setId(i);
        this.f30225N.m18786g(i2);
    }

    public void m9074U1() {
        if (this.f30225N != null && this.f30229R && !this.f30232U) {
            this.f30229R = false;
            m9085F1(0.0f);
        }
    }

    public void m9073V1() {
        if (this.f30232U) {
            this.f30232U = false;
            m9074U1();
        }
    }

    public void m9072W1() {
        if (this.f30228Q || (!this.f30229R && !this.f30232U && !C1379j0.m37307r(getContext()).m14424w1())) {
            boolean z = !this.f30228Q;
            this.f30228Q = z;
            float f = 0.0f;
            if (z && this.f30226O.m29538o() == 0.0f) {
                setChildrenLayerType(2);
            }
            C3950k kVar = this.f30226O;
            if (this.f30228Q) {
                f = 1.0f;
            }
            kVar.m29544i(f);
        }
    }

    public void m9071X1() {
        int i;
        int i2;
        boolean z;
        int i3 = C4403w.m27984G2() ? 83 : 85;
        int i4 = C1357a0.m37541i(4.0f);
        if (C4403w.m27984G2()) {
            i2 = C1357a0.m37541i(90.0f) - i4;
            i = C1357a0.m37541i(26.0f) - i4;
        } else {
            i = C1357a0.m37541i(90.0f) - i4;
            i2 = C1357a0.m37541i(26.0f) - i4;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                boolean z2 = true;
                if (layoutParams.gravity != i3) {
                    layoutParams.gravity = i3;
                    z = true;
                } else {
                    z = false;
                }
                if (i5 % 2 != 1 || (layoutParams.leftMargin == i2 && layoutParams.rightMargin == i)) {
                    z2 = z;
                } else {
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i;
                }
                if (z2) {
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (f == 0.0f) {
            setChildrenLayerType(0);
        }
    }

    @Override
    public void mo4501a3() {
        this.f30227P = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AbstractC5911c) {
                ((AbstractC5911c) childAt).mo4501a3();
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (!this.f30229R) {
            m9078O1(view.getId(), view);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !C1399s0.m37218C(this) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m9083I1();
        }
        return C1399s0.m37218C(this) && (super.onTouchEvent(motionEvent) || this.f30226O.m29538o() != 0.0f);
    }

    public void setCallback(AbstractC9349b bVar) {
        this.f30224M = bVar;
    }
}
