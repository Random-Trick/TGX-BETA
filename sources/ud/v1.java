package ud;

import ae.j;
import ae.p;
import ae.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import ce.y;
import db.g;
import eb.c;
import gd.w;
import hd.t2;
import ib.i;
import id.d;
import je.l0;
import ne.b2;
import ne.n0;
import org.thunderdog.challegram.R;
import zd.o6;

public class v1 extends LinearLayout implements c {
    public final n0 f24488a;
    public Runnable f24489b;

    public class a extends Drawable {
        public final p f24490a;

        public a(p pVar) {
            this.f24490a = pVar;
        }

        @Override
        public void draw(Canvas canvas) {
            int i10 = 0;
            View childAt = v1.this.getChildAt(0);
            if (childAt != null) {
                i10 = childAt.getMeasuredHeight();
            }
            if (i10 > 0) {
                float f10 = i10;
                float measuredWidth = v1.this.getMeasuredWidth();
                float measuredHeight = v1.this.getMeasuredHeight();
                p pVar = this.f24490a;
                canvas.drawRect(0.0f, f10, measuredWidth, measuredHeight, y.g(pVar != null ? pVar.e(R.id.theme_color_filling) : j.L(R.id.theme_color_filling)));
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

    public v1(Context context, v4<?> v4Var, p pVar) {
        super(context);
        setOrientation(1);
        n0 n0Var = new n0(context, v4Var.c());
        this.f24488a = n0Var;
        n0Var.setPadding(a0.i(16.0f), a0.i(14.0f), a0.i(16.0f), a0.i(6.0f));
        n0Var.setTextColorId(R.id.theme_color_textLight);
        n0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(n0Var);
        g.d(this, new a(pVar));
        if (pVar != null) {
            n0Var.setForcedTheme(pVar);
            return;
        }
        v4Var.t8(n0Var);
        v4Var.t8(this);
    }

    public static TextView a(Context context, int i10, CharSequence charSequence, int i11, int i12, View.OnClickListener onClickListener, v vVar, p pVar) {
        Drawable g10;
        b2 b2Var = new b2(context);
        b2Var.setId(i10);
        b2Var.setTypeface(o.k());
        b2Var.setTextSize(1, 16.0f);
        int b10 = b(i11);
        if (pVar != null) {
            b2Var.setTextColor(pVar.e(b10));
        } else {
            b2Var.setTextColor(j.L(b10));
            if (vVar != null) {
                vVar.c(b2Var, b10);
            }
        }
        b2Var.setOnClickListener(onClickListener);
        b2Var.setSingleLine(true);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setGravity(w.G2() ? 21 : 19);
        b2Var.setPadding(a0.i(17.0f), a0.i(1.0f), a0.i(17.0f), 0);
        b2Var.setCompoundDrawablePadding(a0.i(18.0f));
        if (!(i12 == 0 || (g10 = ce.c.g(context.getResources(), i12)) == null)) {
            if (i11 == 1) {
                b10 = R.id.theme_color_icon;
            }
            g10.setColorFilter(y.z(pVar != null ? pVar.e(b10) : j.L(b10)));
            if (vVar != null) {
                vVar.e(g10, b10);
            }
            ce.c.l(i12);
            if (w.G2()) {
                b2Var.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, g10, (Drawable) null);
            } else {
                b2Var.setCompoundDrawablesWithIntrinsicBounds(g10, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        p0.T(b2Var);
        b2Var.setText(d.z().I(charSequence));
        return b2Var;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return R.id.theme_color_text;
        }
        if (i10 == 2) {
            return R.id.theme_color_textNegative;
        }
        if (i10 == 3) {
            return R.id.theme_color_textNeutral;
        }
        throw new IllegalArgumentException("color == " + i10);
    }

    @Override
    public void S(View view, Runnable runnable) {
        this.f24489b = runnable;
    }

    public void c(String str, l0[] l0VarArr, boolean z10) {
        if (!i.i(str)) {
            this.f24488a.setVisibility(0);
            if (z10) {
                this.f24488a.w(str, l0VarArr, false);
                this.f24488a.setTextSize(19.0f);
                this.f24488a.setTextColorId(R.id.theme_color_text);
                return;
            }
            this.f24488a.y(str, l0VarArr, false);
            this.f24488a.setTextSize(15.0f);
            this.f24488a.setTextColorId(R.id.theme_color_textLight);
            return;
        }
        this.f24488a.setVisibility(8);
    }

    public void d(v4<?> v4Var, o6 o6Var, CharSequence charSequence, boolean z10) {
        if (!i.i(charSequence)) {
            c(charSequence.toString(), t2.Y(v4Var, o6Var, charSequence, false, null), z10);
        } else {
            this.f24488a.setVisibility(8);
        }
    }

    public int getTextHeight() {
        if (this.f24488a.getVisibility() == 0) {
            return this.f24488a.n(j0.r(getContext()).O0(this.f24488a));
        }
        return 0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f24489b;
        if (runnable != null) {
            runnable.run();
            this.f24489b = null;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight();
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null) {
                i12 += childAt.getMeasuredHeight();
            }
        }
        int min = Math.min(0, measuredHeight - i12);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
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
