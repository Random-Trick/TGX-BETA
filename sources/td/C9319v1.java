package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import gd.C4779t2;
import ie.AbstractC5411l0;
import me.C6847b2;
import me.C6973n0;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p051db.AbstractC3937c;
import p082fd.C4403w;
import p108hb.C5070i;
import p110hd.C5078d;
import p350yd.C10930q6;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import p364zd.C11537v;

public class C9319v1 extends LinearLayout implements AbstractC3937c {
    public final C6973n0 f30146a;
    public Runnable f30147b;

    public class C9320a extends Drawable {
        public final AbstractC11531p f30148a;

        public C9320a(AbstractC11531p pVar) {
            this.f30148a = pVar;
        }

        @Override
        public void draw(Canvas canvas) {
            int i = 0;
            View childAt = C9319v1.this.getChildAt(0);
            if (childAt != null) {
                i = childAt.getMeasuredHeight();
            }
            if (i > 0) {
                float f = i;
                float measuredWidth = C9319v1.this.getMeasuredWidth();
                float measuredHeight = C9319v1.this.getMeasuredHeight();
                AbstractC11531p pVar = this.f30148a;
                canvas.drawRect(0.0f, f, measuredWidth, measuredHeight, C1410y.m37039g(pVar != null ? pVar.mo92e(R.id.theme_color_filling) : C11524j.m228N(R.id.theme_color_filling)));
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

    public C9319v1(Context context, AbstractC9323v4<?> v4Var, AbstractC11531p pVar) {
        super(context);
        setOrientation(1);
        C6973n0 n0Var = new C6973n0(context, v4Var.mo4348c());
        this.f30146a = n0Var;
        n0Var.setPadding(C1357a0.m37541i(16.0f), C1357a0.m37541i(14.0f), C1357a0.m37541i(16.0f), C1357a0.m37541i(6.0f));
        n0Var.setTextColorId(R.id.theme_color_textLight);
        n0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(n0Var);
        C2065g.m35718d(this, new C9320a(pVar));
        if (pVar != null) {
            n0Var.setForcedTheme(pVar);
            return;
        }
        v4Var.m9163t8(n0Var);
        v4Var.m9163t8(this);
    }

    public static TextView m9485a(Context context, int i, CharSequence charSequence, int i2, int i3, View.OnClickListener onClickListener, C11537v vVar, AbstractC11531p pVar) {
        Drawable g;
        C6847b2 b2Var = new C6847b2(context);
        b2Var.setId(i);
        b2Var.setTypeface(C1389o.m37258k());
        b2Var.setTextSize(1, 16.0f);
        int b = m9484b(i2);
        if (pVar != null) {
            b2Var.setTextColor(pVar.mo92e(b));
        } else {
            b2Var.setTextColor(C11524j.m228N(b));
            if (vVar != null) {
                vVar.m77c(b2Var, b);
            }
        }
        b2Var.setOnClickListener(onClickListener);
        b2Var.setSingleLine(true);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setGravity(C4403w.m27984G2() ? 21 : 19);
        b2Var.setPadding(C1357a0.m37541i(17.0f), C1357a0.m37541i(1.0f), C1357a0.m37541i(17.0f), 0);
        b2Var.setCompoundDrawablePadding(C1357a0.m37541i(18.0f));
        if (!(i3 == 0 || (g = C1362c.m37482g(context.getResources(), i3)) == null)) {
            if (i2 == 1) {
                b = R.id.theme_color_icon;
            }
            g.setColorFilter(C1410y.m37001z(pVar != null ? pVar.mo92e(b) : C11524j.m228N(b)));
            if (vVar != null) {
                vVar.m75e(g, b);
            }
            C1362c.m37477l(i3);
            if (C4403w.m27984G2()) {
                b2Var.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, g, (Drawable) null);
            } else {
                b2Var.setCompoundDrawablesWithIntrinsicBounds(g, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        C1399s0.m37193a0(b2Var);
        b2Var.setText(C5078d.m23986z().m24024I(charSequence));
        return b2Var;
    }

    public static int m9484b(int i) {
        if (i == 1) {
            return R.id.theme_color_text;
        }
        if (i == 2) {
            return R.id.theme_color_textNegative;
        }
        if (i == 3) {
            return R.id.theme_color_textNeutral;
        }
        throw new IllegalArgumentException("color == " + i);
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f30147b = runnable;
    }

    public void m9483c(String str, AbstractC5411l0[] l0VarArr, boolean z) {
        if (!C5070i.m24061i(str)) {
            this.f30146a.setVisibility(0);
            if (z) {
                this.f30146a.m18248v(str, l0VarArr, false);
                this.f30146a.setTextSize(19.0f);
                this.f30146a.setTextColorId(R.id.theme_color_text);
                return;
            }
            this.f30146a.m18246y(str, l0VarArr, false);
            this.f30146a.setTextSize(15.0f);
            this.f30146a.setTextColorId(R.id.theme_color_textLight);
            return;
        }
        this.f30146a.setVisibility(8);
    }

    public void m9482d(AbstractC9323v4<?> v4Var, C10930q6 q6Var, CharSequence charSequence, boolean z) {
        if (!C5070i.m24061i(charSequence)) {
            m9483c(charSequence.toString(), C4779t2.m25571Y(v4Var, q6Var, charSequence, false, null), z);
        } else {
            this.f30146a.setVisibility(8);
        }
    }

    public int getTextHeight() {
        if (this.f30146a.getVisibility() == 0) {
            return this.f30146a.m18254n(C1379j0.m37307r(getContext()).m14567L0(this.f30146a));
        }
        return 0;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f30147b;
        if (runnable != null) {
            runnable.run();
            this.f30147b = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                i3 += childAt.getMeasuredHeight();
            }
        }
        int min = Math.min(0, measuredHeight - i3);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2 != null) {
                childAt2.setTranslationY(min);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
