package be;

import android.animation.Animator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ie.RunnableC5390g;
import java.lang.reflect.Field;
import java.util.Iterator;
import me.AbstractC6828a;
import me.C6847b2;
import me.RunnableC6996p3;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p082fd.C4386n;
import p082fd.C4403w;
import p108hb.C5063c;
import p111he.AbstractC5101b1;
import p139jb.AbstractC5911c;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C1399s0 {
    public static int[] f5091a;
    public static final Paint f5092b = new Paint(2);

    public class C1400a extends ViewOutlineProvider {
        public final float f5093a;
        public final float f5094b;

        public C1400a(float f, float f2) {
            this.f5093a = f;
            this.f5094b = f2;
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            int i = C1357a0.m37541i(this.f5093a);
            int i2 = C1357a0.m37541i(this.f5094b) + i;
            outline.setOval(i, i, i2, i2);
        }
    }

    public class C1401b extends ViewOutlineProvider {
        public final float f5095a;
        public final float f5096b;

        public C1401b(float f, float f2) {
            this.f5095a = f;
            this.f5096b = f2;
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            int i = C1357a0.m37541i(this.f5095a);
            outline.setRoundRect(i, i, view.getMeasuredWidth() - i, view.getMeasuredHeight() - i, C1357a0.m37541i(this.f5096b));
        }
    }

    public static class C1402c {
        public static final int[] f5097a;

        static {
            int[] iArr = new int[C4386n.EnumC4390d.values().length];
            f5097a = iArr;
            try {
                iArr[C4386n.EnumC4390d.DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5097a[C4386n.EnumC4390d.INSERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5097a[C4386n.EnumC4390d.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void m37220A(View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            m37163p0(view);
            view.setOutlineProvider(new C1401b(f2, f));
        }
    }

    public static void m37219B(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    childAt.invalidate();
                }
            }
        }
    }

    public static boolean m37218C(View view) {
        return view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f;
    }

    public static void m37217D(View view, float f, float f2, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.setScaleX(f + (f2 * floatValue));
        view.setScaleY(f3 + (f4 * floatValue));
        view.setAlpha(f5 + (f6 * floatValue));
    }

    public static void m37216E(View view, float f, float f2, ValueAnimator valueAnimator) {
        view.setAlpha(f + (f2 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static void m37215F(View view, float f, float f2, ValueAnimator valueAnimator) {
        view.setRotation(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public static void m37214G(View view, int i) {
        view.setLayerType(i, m37156t());
    }

    public static void m37213H(View view, int i) {
        view.setLayerType(i, m37156t());
    }

    public static void m37212I(int i, int i2, View view, ValueAnimator valueAnimator) {
        float a = i + (i2 * C2057b.m35735a(valueAnimator));
        if (a < view.getTranslationZ()) {
            view.setTranslationZ(a);
            if (view.getTag() instanceof View) {
                ((View) view.getTag()).setTranslationZ(a);
                return;
            }
            return;
        }
        if (view.getTag() instanceof View) {
            ((View) view.getTag()).setTranslationZ(a);
        }
        view.setTranslationZ(a);
    }

    public static void m37211J(int i, int i2, View view, ValueAnimator valueAnimator) {
        float a = i - (i2 * C2057b.m35735a(valueAnimator));
        if (a < view.getTranslationZ()) {
            view.setTranslationZ(a);
            if (view.getTag() instanceof View) {
                ((View) view.getTag()).setTranslationZ(a);
                return;
            }
            return;
        }
        if (view.getTag() instanceof View) {
            ((View) view.getTag()).setTranslationZ(a);
        }
        view.setTranslationZ(a);
    }

    public static void m37210K(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (RunnableC5390g.m22983M0(textView.getText())) {
                textView.setTypeface(C1389o.m37258k());
                textView.setPaintFlags(textView.getPaintFlags() | 32);
            }
        }
    }

    public static void m37209L(View view, ViewGroup viewGroup, int i) {
        if (view != null && view.getParent() != viewGroup) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            viewGroup.addView(view, i);
        }
    }

    public static ImageView m37208M(Context context, int i, int i2, AbstractC9323v4<?> v4Var) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(i);
        imageView.setColorFilter(C11524j.m228N(i2));
        m37193a0(imageView);
        if (v4Var != null) {
            v4Var.m9184q8(imageView, i2);
        }
        return imageView;
    }

    public static FrameLayout.LayoutParams m37207N(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return FrameLayoutFix.m18007t1(layoutParams.width, layoutParams.height, i);
    }

    public static TextView m37206O(Context context, float f, int i, int i2, int i3) {
        C6847b2 b2Var = new C6847b2(context);
        b2Var.setTypeface((i3 & 1) != 0 ? C1389o.m37260i() : C1389o.m37258k());
        b2Var.setTextColor(i);
        b2Var.setGravity(i2);
        boolean z = true;
        b2Var.setTextSize(1, f);
        if ((i3 & 2) != 0) {
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
        }
        if ((i3 & 4) == 0) {
            z = false;
        }
        b2Var.setPadding(z ? C1357a0.m37541i(16.0f) : 0, 0, z ? C1357a0.m37541i(16.0f) : 0, 0);
        return b2Var;
    }

    public static boolean m37205P(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || (m37218C(view) && m37218C((View) view.getParent()));
    }

    public static void m37204Q(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void m37203R(RelativeLayout.LayoutParams layoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.removeRule(i);
        } else {
            layoutParams.addRule(i, 0);
        }
    }

    public static void m37202S(Editable editable, String str, String str2) {
        int length;
        Iterator<C4386n.C4388b> it = C4386n.m28031s().m28036n(str, str2).iterator();
        int i = 0;
        while (it.hasNext()) {
            C4386n.C4388b next = it.next();
            int i2 = C1402c.f5097a[next.f14548a.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    editable.insert(i, next.f14549b);
                    length = next.f14549b.length();
                } else if (i2 == 3) {
                    length = next.f14549b.length();
                }
                i += length;
            } else {
                editable.delete(i, next.f14549b.length() + i);
            }
        }
    }

    public static void m37201T(Canvas canvas, int i) {
        try {
            canvas.restoreToCount(i);
        } catch (IllegalArgumentException e) {
            Tracer.m14778b(e, i);
        }
    }

    public static void m37200U(final View view, final float f, long j, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        if (Build.VERSION.SDK_INT >= 12) {
            view.animate().rotationBy(f).setDuration(j).setInterpolator(interpolator).setListener(animatorListener);
            return;
        }
        final float rotation = view.getRotation();
        ValueAnimator b = C2057b.m35734b();
        b.setDuration(j);
        b.setInterpolator(interpolator);
        if (animatorListener != null) {
            b.addListener(animatorListener);
        }
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1399s0.m37215F(view, rotation, f, valueAnimator);
            }
        });
        b.start();
    }

    public static int m37199V(Canvas canvas) {
        return canvas.save();
    }

    public static void m37198W(EditText editText) {
        if (editText != null) {
            try {
                editText.setSelection(0, editText.getText().length());
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean m37197X(View view, int i) {
        if (view == null) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int i2 = 11;
        if (i == 11) {
            i2 = 9;
        }
        int[] rules = layoutParams.getRules();
        if (rules[i] == -1 && rules[i2] != -1) {
            return false;
        }
        m37203R(layoutParams, i2);
        layoutParams.addRule(i);
        return true;
    }

    public static boolean m37196Y(View view, boolean z) {
        return m37197X(view, z ? 11 : 9);
    }

    public static void m37195Z(View view, int i) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void m37193a0(View view) {
        view.setClickable(true);
        view.setFocusableInTouchMode(false);
        view.setFocusable(false);
        if (Build.VERSION.SDK_INT >= 11 && (view instanceof ViewGroup)) {
            ((ViewGroup) view).setMotionEventSplittingEnabled(false);
        }
    }

    public static void m37191b0(EditText editText, int i) {
        if (editText == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(i);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.setInt(editText, i);
        } catch (Throwable th) {
            Log.m14725e("Cannot set cursor drawable", th, new Object[0]);
        }
    }

    public static boolean m37189c0(View view, int i) {
        return view != null && m37187d0((FrameLayout.LayoutParams) view.getLayoutParams(), i);
    }

    public static boolean m37187d0(FrameLayout.LayoutParams layoutParams, int i) {
        if (layoutParams.gravity == i) {
            return false;
        }
        layoutParams.gravity = i;
        return true;
    }

    public static void m37185e0(ImageView imageView, boolean z) {
        imageView.setScaleX(z ? -1.0f : 1.0f);
    }

    public static void m37183f0(final View view, final int i) {
        view.post(new Runnable() {
            @Override
            public final void run() {
                C1399s0.m37214G(view, i);
            }
        });
    }

    public static void m37181g0(final View view, final int i) {
        view.post(new Runnable() {
            @Override
            public final void run() {
                C1399s0.m37213H(view, i);
            }
        });
    }

    public static void m37180h(final View view, float f, float f2, float f3, long j, long j2, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 12) {
            ViewPropertyAnimator listener = view.animate().scaleX(f).scaleY(f2).alpha(f3).setInterpolator(interpolator).setDuration(j).setListener(animatorListener);
            if (i >= 14 && j2 >= 0) {
                listener.setStartDelay(j2);
                return;
            }
            return;
        }
        final float scaleX = view.getScaleX();
        final float f4 = f - scaleX;
        final float scaleY = view.getScaleY();
        final float f5 = f2 - scaleY;
        final float alpha = view.getAlpha();
        final float f6 = f3 - alpha;
        ValueAnimator b = C2057b.m35734b();
        b.setDuration(135L);
        b.setInterpolator(C2057b.f7280b);
        if (animatorListener != null) {
            b.addListener(animatorListener);
        }
        if (j2 > 0) {
            b.setStartDelay(j2);
        }
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1399s0.m37217D(view, scaleX, f4, scaleY, f5, alpha, f6, valueAnimator);
            }
        });
        b.start();
    }

    public static boolean m37179h0(View view, int i, int i2, int i3, int i4) {
        return view != null && m37177i0((ViewGroup.MarginLayoutParams) view.getLayoutParams(), i, i2, i3, i4);
    }

    public static void m37178i(View view, float f, float f2, float f3, long j, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        m37180h(view, f, f2, f3, j, 0L, interpolator, animatorListener);
    }

    public static boolean m37177i0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return false;
        }
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i3;
        marginLayoutParams.bottomMargin = i4;
        return true;
    }

    public static void m37176j(final View view, float f, long j, long j2, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 12) {
            ViewPropertyAnimator listener = view.animate().alpha(f).setDuration(j).setInterpolator(interpolator).setListener(animatorListener);
            if (i >= 14 && j2 > 0) {
                listener.setStartDelay(j2);
                return;
            }
            return;
        }
        ValueAnimator b = C2057b.m35734b();
        b.setInterpolator(interpolator);
        b.setDuration(j);
        if (animatorListener != null) {
            b.addListener(animatorListener);
        }
        if (j2 > 0) {
            b.setStartDelay(j2);
        }
        final float alpha = view.getAlpha();
        final float f2 = f - alpha;
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1399s0.m37216E(view, alpha, f2, valueAnimator);
            }
        });
        b.start();
    }

    public static void m37175j0(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            m37143z0(textView, charSequence);
            textView.setText(charSequence);
        }
    }

    public static void m37174k(View view, float f, long j, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        m37176j(view, f, j, 0L, interpolator, animatorListener);
    }

    public static void m37173k0(View view, int i) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.rightMargin != i) {
                marginLayoutParams.rightMargin = i;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void m37172l(View view) {
        if (view != null && (view instanceof AbstractC6828a)) {
            ((AbstractC6828a) view).mo8225f();
        }
    }

    public static void m37171l0(View view) {
        if (view != null) {
            view.setVerticalScrollbarPosition(C4403w.m27984G2() ? 1 : 2);
        }
    }

    public static void m37170m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof AbstractC6828a) {
                    if (z) {
                        ((AbstractC6828a) childAt).mo8225f();
                    } else {
                        ((AbstractC6828a) childAt).mo8229b();
                    }
                }
                if (childAt instanceof ViewGroup) {
                    m37170m((ViewGroup) childAt, z);
                }
            }
        }
    }

    public static void m37169m0(EditText editText, int i) {
        if (editText != null) {
            try {
                editText.setSelection(i);
            } catch (Throwable unused) {
            }
        }
    }

    public static void m37168n(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            view.animate().cancel();
        }
    }

    public static void m37167n0(EditText editText, int i, int i2) {
        if (editText != null) {
            try {
                editText.setSelection(i, i2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void m37166o(EditText editText) {
        m37191b0(editText, 0);
    }

    public static void m37165o0(TextView textView) {
        textView.setShadowLayer(C1357a0.m37541i(3.0f), 0.0f, C1357a0.m37541i(0.6666667f), 1275068416);
    }

    public static void m37164p(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof AbstractC5911c) {
                    ((AbstractC5911c) childAt).mo4501a3();
                }
                if (childAt instanceof ViewGroup) {
                    m37164p((ViewGroup) childAt);
                }
            }
        }
    }

    public static void m37163p0(final View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            final int i = C1357a0.m37541i(1.5f);
            final int i2 = C1357a0.m37541i(3.0f);
            final int i3 = i2 - i;
            ValueAnimator b = C2057b.m35734b();
            b.setDuration(180L);
            DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
            b.setInterpolator(decelerateInterpolator);
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1399s0.m37212I(i, i3, view, valueAnimator);
                }
            });
            stateListAnimator.addState(new int[]{16842919}, b);
            ValueAnimator b2 = C2057b.m35734b();
            b2.setDuration(180L);
            b2.setInterpolator(decelerateInterpolator);
            b2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1399s0.m37211J(i2, i3, view, valueAnimator);
                }
            });
            stateListAnimator.addState(new int[0], b2);
            view.setStateListAnimator(stateListAnimator);
        }
    }

    public static void m37162q(RecyclerView recyclerView) {
        if (recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.m39549X1();
            int a2 = linearLayoutManager.m39546a2();
            if (!(X1 == -1 || a2 == -1)) {
                while (X1 <= a2) {
                    View C = linearLayoutManager.mo39262C(X1);
                    if (C instanceof AbstractC5101b1) {
                        ((AbstractC5101b1) C).mo18720J();
                    }
                    if (C instanceof AbstractC5911c) {
                        ((AbstractC5911c) C).mo4501a3();
                    } else if (C instanceof RecyclerView) {
                        m37162q((RecyclerView) C);
                    }
                    X1++;
                }
            }
            recyclerView.removeAllViewsInLayout();
        }
    }

    public static void m37161q0(EditText editText, boolean z) {
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        editText.setSingleLine(z);
        if (selectionEnd != 0 || selectionStart != 0) {
            try {
                editText.setSelection(selectionStart, selectionEnd);
            } catch (Throwable th) {
                Log.m14710w("Cannot move cursor", th, new Object[0]);
            }
        }
    }

    public static void m37160r(View view) {
        if (view != null && (view instanceof AbstractC6828a)) {
            ((AbstractC6828a) view).mo8229b();
        }
    }

    public static void m37159r0(EditText editText, String str) {
        if (editText != null) {
            editText.setText(str);
            try {
                editText.setSelection(str.length());
            } catch (Throwable unused) {
            }
        }
    }

    public static int m37158s(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    public static void m37157s0(TextView textView, int i) {
        if (textView != null && textView.getGravity() != i) {
            textView.setGravity(i);
        }
    }

    public static Paint m37156t() {
        return f5092b;
    }

    public static void m37155t0(View view, int i) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static int[] m37154u(View view) {
        if (f5091a == null) {
            f5091a = new int[2];
        }
        view.getLocationInWindow(f5091a);
        return f5091a;
    }

    public static View m37153u0(Context context) {
        return m37151v0(context, FrameLayoutFix.m18007t1(C1357a0.m37541i(48.0f), C1357a0.m37541i(48.0f), 17));
    }

    public static int[] m37152v(View view) {
        if (f5091a == null) {
            f5091a = new int[2];
        }
        view.getLocationOnScreen(f5091a);
        return f5091a;
    }

    public static View m37151v0(Context context, ViewGroup.LayoutParams layoutParams) {
        RunnableC6996p3 p3Var;
        if (Build.VERSION.SDK_INT >= 21) {
            ProgressBar progressBar = new ProgressBar(context);
            progressBar.setIndeterminate(true);
            p3Var = progressBar;
        } else {
            RunnableC6996p3 p3Var2 = new RunnableC6996p3(context);
            p3Var2.setImageResource(R.drawable.spinner_48_inner);
            p3Var = p3Var2;
        }
        if (layoutParams != null) {
            p3Var.setLayoutParams(layoutParams);
        }
        return p3Var;
    }

    public static int m37150w(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return 0;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return layoutParams.width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return layoutParams.width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static void m37149w0(View view) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i != 0 || marginLayoutParams.topMargin != 0 || marginLayoutParams.rightMargin != 0 || marginLayoutParams.bottomMargin != 0) {
                view.setPadding(i, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                marginLayoutParams.width += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                marginLayoutParams.height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                marginLayoutParams.bottomMargin = 0;
                marginLayoutParams.rightMargin = 0;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
            }
        }
    }

    @Deprecated
    public static void m37148x(View view, int[] iArr) {
        int left = view.getLeft();
        int top = view.getTop();
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            left += view.getLeft();
            top += view.getTop();
        }
        iArr[0] = left;
        iArr[1] = top - C1357a0.m37535o();
    }

    public static View m37147x0(Context context, Dialog dialog, String str) {
        if (dialog == null) {
            return null;
        }
        try {
            int identifier = context.getResources().getIdentifier(str, "id", "android");
            if (identifier != 0) {
                return dialog.findViewById(identifier);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static View m37146y(Context context, int i, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    public static void m37145y0(View view) {
        if (view != null) {
            view.setLayoutParams(view.getLayoutParams());
        }
    }

    public static void m37144z(View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            m37163p0(view);
            view.setOutlineProvider(new C1400a(f2, f));
        }
    }

    public static void m37143z0(TextView textView, CharSequence charSequence) {
        Typeface typeface = textView.getTypeface();
        boolean M0 = RunnableC5390g.m22983M0(charSequence);
        Typeface k = M0 ? C1389o.m37258k() : C1389o.m37260i();
        if (k != typeface) {
            textView.setTypeface(k);
        }
        int paintFlags = textView.getPaintFlags();
        int h = C5063c.m24138h(paintFlags, 32, M0);
        if (paintFlags != h) {
            textView.setPaintFlags(h);
        }
    }
}
