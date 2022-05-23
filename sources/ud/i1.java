package ud;

import ae.j;
import ae.p;
import ae.v;
import android.animation.Animator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.o;
import ce.p0;
import ce.y;
import db.b;
import eb.c;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import yd.d;
import yd.g;

public class i1 extends LinearLayout implements c {
    public static final Interpolator O = b.f7287b;
    public boolean M;
    public Runnable N;
    public int f24212a;
    public v f24213b;
    public p f24214c;

    public i1(Context context) {
        super(context);
    }

    @Override
    public void S(View view, Runnable runnable) {
        this.N = runnable;
    }

    public TextView a(int i10, CharSequence charSequence, int i11, Drawable drawable, View.OnClickListener onClickListener) {
        b2 b2Var = new b2(getContext());
        b2Var.setId(i10);
        b2Var.setTypeface(o.k());
        b2Var.setTextSize(1, 16.0f);
        p pVar = this.f24214c;
        if (pVar != null) {
            b2Var.setTextColor(pVar.e(R.id.theme_color_text));
        } else {
            b2Var.setTextColor(j.P0());
            v vVar = this.f24213b;
            if (vVar != null) {
                vVar.j(b2Var);
            }
        }
        b2Var.setText(charSequence);
        b2Var.setGravity(w.F1() | 16);
        b2Var.setSingleLine(true);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setOnClickListener(onClickListener);
        b2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, a0.i(48.0f)));
        b2Var.setPadding(a0.i(17.0f), 0, a0.i(17.0f), 0);
        b2Var.setCompoundDrawablePadding(a0.i(18.0f));
        if (i11 != 0) {
            drawable = ce.c.g(getResources(), i11);
        }
        if (drawable != null) {
            p pVar2 = this.f24214c;
            if (pVar2 != null) {
                drawable.setColorFilter(y.z(pVar2.e(R.id.theme_color_icon)));
            } else {
                drawable.setColorFilter(y.z(j.L(R.id.theme_color_icon)));
                v vVar2 = this.f24213b;
                if (vVar2 != null) {
                    vVar2.e(drawable, R.id.theme_color_icon);
                }
            }
            ce.c.l(i11);
            if (w.G2()) {
                b2Var.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                b2Var.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        p0.T(b2Var);
        d.j(b2Var);
        addView(b2Var);
        b2Var.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        b2Var.setTag(Integer.valueOf(b2Var.getMeasuredWidth()));
        return b2Var;
    }

    public void b(v vVar, p pVar) {
        Drawable drawable;
        this.f24213b = vVar;
        this.f24214c = pVar;
        setMinimumWidth(a0.i(196.0f));
        if (pVar != null) {
            drawable = g.d(getContext(), R.drawable.bg_popup_fixed, new PorterDuffColorFilter(pVar.e(R.id.theme_color_overlayFilling), PorterDuff.Mode.MULTIPLY));
        } else {
            drawable = g.d(getContext(), R.drawable.bg_popup_fixed, new PorterDuffColorFilter(j.l0(), PorterDuff.Mode.MULTIPLY));
        }
        db.g.d(this, drawable);
        if (vVar != null && pVar == null) {
            vVar.i(drawable, R.id.theme_color_overlayFilling);
            vVar.f(this);
        }
        setOrientation(1);
        setLayerType(2, p0.q());
        setLayoutParams(FrameLayoutFix.r1(-2, -2, (w.G2() ? 3 : 5) | 48));
    }

    public void c(Animator.AnimatorListener animatorListener) {
        p0.e(this, 1.0f, 1.0f, 1.0f, 135L, 10L, b.f7287b, animatorListener);
    }

    public void d(Animator.AnimatorListener animatorListener) {
        p0.e(this, 0.56f, 0.56f, 0.0f, 120L, 0L, b.f7288c, animatorListener);
    }

    public boolean e() {
        return this.M;
    }

    public void f() {
        if (p0.V(this, (w.G2() ? 3 : 5) | 48)) {
            p0.r0(this);
        }
    }

    public void g(int i10, int i11, CharSequence charSequence, int i12, View.OnClickListener onClickListener, v vVar) {
        TextView textView = (TextView) getChildAt(i10);
        textView.setId(i11);
        textView.setOnClickListener(onClickListener);
        textView.setText(charSequence);
        Drawable g10 = i12 != 0 ? ce.c.g(getResources(), i12) : null;
        textView.setGravity(w.F1() | 16);
        textView.setVisibility(0);
        if (g10 != null) {
            g10.setColorFilter(y.z(j.L(R.id.theme_color_icon)));
            if (vVar != null) {
                vVar.e(g10, R.id.theme_color_icon);
            }
            ce.c.l(i12);
            if (w.G2()) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, g10, (Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(g10, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.setTag(Integer.valueOf(textView.getMeasuredWidth()));
    }

    public int getAnchorMode() {
        return this.f24212a;
    }

    public int getItemsHeight() {
        int i10 = a0.i(48.0f);
        int i11 = a0.i(8.0f);
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                i12 += i10;
            }
        }
        return i12 + i11 + i11;
    }

    public int getItemsWidth() {
        int i10 = a0.i(8.0f);
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!(childAt == null || childAt.getVisibility() == 8 || !(childAt.getTag() instanceof Integer))) {
                i11 = Math.max(i11, ((Integer) childAt.getTag()).intValue());
            }
        }
        return Math.max(getMinimumWidth(), i11 + i10 + i10);
    }

    public float getRevealRadius() {
        return (float) Math.hypot(getItemsWidth(), getItemsHeight());
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.N;
        if (runnable != null) {
            runnable.run();
            this.N = null;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getItemsWidth(), Log.TAG_TDLIB_OPTIONS), i11);
    }

    public void setAnchorMode(int i10) {
        if (this.f24212a != i10) {
            this.f24212a = i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            int i11 = 3;
            if (i10 == 0) {
                if (!w.G2()) {
                    i11 = 5;
                }
                layoutParams.gravity = i11 | 48;
            } else if (i10 == 1) {
                if (w.G2()) {
                    i11 = 5;
                }
                layoutParams.gravity = i11 | 48;
                setTranslationX(w.G2() ? -a0.i(46.0f) : a0.i(46.0f));
            }
        }
    }

    public void setRightNumber(int i10) {
        setTranslationX((-a0.i(49.0f)) * i10);
    }

    public void setShouldPivotBottom(boolean z10) {
        this.M = z10;
    }
}
