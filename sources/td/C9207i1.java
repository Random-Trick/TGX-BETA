package td;

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
import be.C1357a0;
import be.C1362c;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import me.C6847b2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.AbstractC3937c;
import p082fd.C4403w;
import p335xd.C10189d;
import p335xd.C10192g;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import p364zd.C11537v;

public class C9207i1 extends LinearLayout implements AbstractC3937c {
    public static final Interpolator f29722O = C2057b.f7280b;
    public boolean f29723M;
    public Runnable f29724N;
    public int f29725a;
    public C11537v f29726b;
    public AbstractC11531p f29727c;

    public C9207i1(Context context) {
        super(context);
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f29724N = runnable;
    }

    public TextView m9970a(int i, CharSequence charSequence, int i2, Drawable drawable, View.OnClickListener onClickListener) {
        C6847b2 b2Var = new C6847b2(getContext());
        b2Var.setId(i);
        b2Var.setTypeface(C1389o.m37258k());
        b2Var.setTextSize(1, 16.0f);
        AbstractC11531p pVar = this.f29727c;
        if (pVar != null) {
            b2Var.setTextColor(pVar.mo92e(R.id.theme_color_text));
        } else {
            b2Var.setTextColor(C11524j.m217S0());
            C11537v vVar = this.f29726b;
            if (vVar != null) {
                vVar.m70j(b2Var);
            }
        }
        b2Var.setText(charSequence);
        b2Var.setGravity(C4403w.m27989F1() | 16);
        b2Var.setSingleLine(true);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setOnClickListener(onClickListener);
        b2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, C1357a0.m37541i(48.0f)));
        b2Var.setPadding(C1357a0.m37541i(17.0f), 0, C1357a0.m37541i(17.0f), 0);
        b2Var.setCompoundDrawablePadding(C1357a0.m37541i(18.0f));
        if (i2 != 0) {
            drawable = C1362c.m37482g(getResources(), i2);
        }
        if (drawable != null) {
            AbstractC11531p pVar2 = this.f29727c;
            if (pVar2 != null) {
                drawable.setColorFilter(C1410y.m37001z(pVar2.mo92e(R.id.theme_color_icon)));
            } else {
                drawable.setColorFilter(C1410y.m37001z(C11524j.m228N(R.id.theme_color_icon)));
                C11537v vVar2 = this.f29726b;
                if (vVar2 != null) {
                    vVar2.m75e(drawable, R.id.theme_color_icon);
                }
            }
            C1362c.m37477l(i2);
            if (C4403w.m27984G2()) {
                b2Var.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                b2Var.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        C1399s0.m37193a0(b2Var);
        C10189d.m5794j(b2Var);
        addView(b2Var);
        b2Var.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        b2Var.setTag(Integer.valueOf(b2Var.getMeasuredWidth()));
        return b2Var;
    }

    public void m9969b(C11537v vVar, AbstractC11531p pVar) {
        Drawable drawable;
        this.f29726b = vVar;
        this.f29727c = pVar;
        setMinimumWidth(C1357a0.m37541i(196.0f));
        if (pVar != null) {
            drawable = C10192g.m5787d(getContext(), R.drawable.bg_popup_fixed, new PorterDuffColorFilter(pVar.mo92e(R.id.theme_color_overlayFilling), PorterDuff.Mode.MULTIPLY));
        } else {
            drawable = C10192g.m5787d(getContext(), R.drawable.bg_popup_fixed, new PorterDuffColorFilter(C11524j.m165n0(), PorterDuff.Mode.MULTIPLY));
        }
        C2065g.m35718d(this, drawable);
        if (vVar != null && pVar == null) {
            vVar.m71i(drawable, R.id.theme_color_overlayFilling);
            vVar.m74f(this);
        }
        setOrientation(1);
        setLayerType(2, C1399s0.m37156t());
        setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, (C4403w.m27984G2() ? 3 : 5) | 48));
    }

    public void m9968c(Animator.AnimatorListener animatorListener) {
        C1399s0.m37180h(this, 1.0f, 1.0f, 1.0f, 135L, 10L, C2057b.f7280b, animatorListener);
    }

    public void m9967d(Animator.AnimatorListener animatorListener) {
        C1399s0.m37180h(this, 0.56f, 0.56f, 0.0f, 120L, 0L, C2057b.f7281c, animatorListener);
    }

    public boolean m9966e() {
        return this.f29723M;
    }

    public void m9965f() {
        if (C1399s0.m37189c0(this, (C4403w.m27984G2() ? 3 : 5) | 48)) {
            C1399s0.m37145y0(this);
        }
    }

    public void m9964g(int i, int i2, CharSequence charSequence, int i3, View.OnClickListener onClickListener, C11537v vVar) {
        TextView textView = (TextView) getChildAt(i);
        textView.setId(i2);
        textView.setOnClickListener(onClickListener);
        textView.setText(charSequence);
        Drawable g = i3 != 0 ? C1362c.m37482g(getResources(), i3) : null;
        textView.setGravity(C4403w.m27989F1() | 16);
        textView.setVisibility(0);
        if (g != null) {
            g.setColorFilter(C1410y.m37001z(C11524j.m228N(R.id.theme_color_icon)));
            if (vVar != null) {
                vVar.m75e(g, R.id.theme_color_icon);
            }
            C1362c.m37477l(i3);
            if (C4403w.m27984G2()) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, g, (Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(g, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.setTag(Integer.valueOf(textView.getMeasuredWidth()));
    }

    public int getAnchorMode() {
        return this.f29725a;
    }

    public int getItemsHeight() {
        int i = C1357a0.m37541i(48.0f);
        int i2 = C1357a0.m37541i(8.0f);
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                i3 += i;
            }
        }
        return i3 + i2 + i2;
    }

    public int getItemsWidth() {
        int i = C1357a0.m37541i(8.0f);
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt == null || childAt.getVisibility() == 8 || !(childAt.getTag() instanceof Integer))) {
                i2 = Math.max(i2, ((Integer) childAt.getTag()).intValue());
            }
        }
        return Math.max(getMinimumWidth(), i2 + i + i);
    }

    public float getRevealRadius() {
        return (float) Math.hypot(getItemsWidth(), getItemsHeight());
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f29724N;
        if (runnable != null) {
            runnable.run();
            this.f29724N = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getItemsWidth(), Log.TAG_TDLIB_OPTIONS), i2);
    }

    public void setAnchorMode(int i) {
        if (this.f29725a != i) {
            this.f29725a = i;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            int i2 = 3;
            if (i == 0) {
                if (!C4403w.m27984G2()) {
                    i2 = 5;
                }
                layoutParams.gravity = i2 | 48;
            } else if (i == 1) {
                if (C4403w.m27984G2()) {
                    i2 = 5;
                }
                layoutParams.gravity = i2 | 48;
                setTranslationX(C4403w.m27984G2() ? -C1357a0.m37541i(46.0f) : C1357a0.m37541i(46.0f));
            }
        }
    }

    public void setRightNumber(int i) {
        setTranslationX((-C1357a0.m37541i(49.0f)) * i);
    }

    public void setShouldPivotBottom(boolean z) {
        this.f29723M = z;
    }
}
