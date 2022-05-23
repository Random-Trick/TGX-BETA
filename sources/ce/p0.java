package ce;

import ae.j;
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
import gd.n;
import gd.w;
import ie.b1;
import java.lang.reflect.Field;
import java.util.Iterator;
import je.g;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import ud.v4;

public class p0 {
    public static int[] f5336a;
    public static final Paint f5337b = new Paint(2);

    public class a extends ViewOutlineProvider {
        public final float f5338a;
        public final float f5339b;

        public a(float f10, float f11) {
            this.f5338a = f10;
            this.f5339b = f11;
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            int i10 = a0.i(this.f5338a);
            int i11 = a0.i(this.f5339b) + i10;
            outline.setOval(i10, i10, i11, i11);
        }
    }

    public class b extends ViewOutlineProvider {
        public final float f5340a;
        public final float f5341b;

        public b(float f10, float f11) {
            this.f5340a = f10;
            this.f5341b = f11;
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            int i10 = a0.i(this.f5340a);
            outline.setRoundRect(i10, i10, view.getMeasuredWidth() - i10, view.getMeasuredHeight() - i10, a0.i(this.f5341b));
        }
    }

    public static class c {
        public static final int[] f5342a;

        static {
            int[] iArr = new int[n.d.values().length];
            f5342a = iArr;
            try {
                iArr[n.d.DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5342a[n.d.INSERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5342a[n.d.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void A(View view, int i10) {
        view.setLayerType(i10, q());
    }

    public static void B(View view, int i10) {
        view.setLayerType(i10, q());
    }

    public static void C(int i10, int i11, View view, ValueAnimator valueAnimator) {
        float a10 = i10 + (i11 * db.b.a(valueAnimator));
        if (a10 < view.getTranslationZ()) {
            view.setTranslationZ(a10);
            if (view.getTag() instanceof View) {
                ((View) view.getTag()).setTranslationZ(a10);
                return;
            }
            return;
        }
        if (view.getTag() instanceof View) {
            ((View) view.getTag()).setTranslationZ(a10);
        }
        view.setTranslationZ(a10);
    }

    public static void D(int i10, int i11, View view, ValueAnimator valueAnimator) {
        float a10 = i10 - (i11 * db.b.a(valueAnimator));
        if (a10 < view.getTranslationZ()) {
            view.setTranslationZ(a10);
            if (view.getTag() instanceof View) {
                ((View) view.getTag()).setTranslationZ(a10);
                return;
            }
            return;
        }
        if (view.getTag() instanceof View) {
            ((View) view.getTag()).setTranslationZ(a10);
        }
        view.setTranslationZ(a10);
    }

    public static void E(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (g.M0(textView.getText())) {
                textView.setTypeface(o.k());
                textView.setPaintFlags(textView.getPaintFlags() | 32);
            }
        }
    }

    public static void F(View view, ViewGroup viewGroup, int i10) {
        if (view != null && view.getParent() != viewGroup) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            viewGroup.addView(view, i10);
        }
    }

    public static ImageView G(Context context, int i10, int i11, v4<?> v4Var) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(i10);
        imageView.setColorFilter(j.L(i11));
        T(imageView);
        if (v4Var != null) {
            v4Var.q8(imageView, i11);
        }
        return imageView;
    }

    public static FrameLayout.LayoutParams H(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return FrameLayoutFix.r1(layoutParams.width, layoutParams.height, i10);
    }

    public static TextView I(Context context, float f10, int i10, int i11, int i12) {
        b2 b2Var = new b2(context);
        b2Var.setTypeface((i12 & 1) != 0 ? o.i() : o.k());
        b2Var.setTextColor(i10);
        b2Var.setGravity(i11);
        boolean z10 = true;
        b2Var.setTextSize(1, f10);
        if ((i12 & 2) != 0) {
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
        }
        if ((i12 & 4) == 0) {
            z10 = false;
        }
        b2Var.setPadding(z10 ? a0.i(16.0f) : 0, 0, z10 ? a0.i(16.0f) : 0, 0);
        return b2Var;
    }

    public static boolean J(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || (z(view) && z((View) view.getParent()));
    }

    public static void K(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void L(RelativeLayout.LayoutParams layoutParams, int i10) {
        layoutParams.removeRule(i10);
    }

    public static void M(Editable editable, String str, String str2) {
        int length;
        Iterator<n.b> it = n.s().n(str, str2).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            n.b next = it.next();
            int i11 = c.f5342a[next.f12314a.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    editable.insert(i10, next.f12315b);
                    length = next.f12315b.length();
                } else if (i11 == 3) {
                    length = next.f12315b.length();
                }
                i10 += length;
            } else {
                editable.delete(i10, next.f12315b.length() + i10);
            }
        }
    }

    public static void N(Canvas canvas, int i10) {
        try {
            canvas.restoreToCount(i10);
        } catch (IllegalArgumentException e10) {
            Tracer.b(e10, i10);
        }
    }

    public static int O(Canvas canvas) {
        return canvas.save();
    }

    public static void P(EditText editText) {
        if (editText != null) {
            try {
                editText.setSelection(0, editText.getText().length());
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean Q(View view, int i10) {
        if (view == null) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int i11 = 11;
        if (i10 == 11) {
            i11 = 9;
        }
        int[] rules = layoutParams.getRules();
        if (rules[i10] == -1 && rules[i11] != -1) {
            return false;
        }
        L(layoutParams, i11);
        layoutParams.addRule(i10);
        return true;
    }

    public static boolean R(View view, boolean z10) {
        return Q(view, z10 ? 11 : 9);
    }

    public static void S(View view, int i10) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void T(View view) {
        view.setClickable(true);
        view.setFocusableInTouchMode(false);
        view.setFocusable(false);
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setMotionEventSplittingEnabled(false);
        }
    }

    public static void U(EditText editText, int i10) {
        if (editText == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(i10);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.setInt(editText, i10);
        } catch (Throwable th) {
            Log.e("Cannot set cursor drawable", th, new Object[0]);
        }
    }

    public static boolean V(View view, int i10) {
        return view != null && W((FrameLayout.LayoutParams) view.getLayoutParams(), i10);
    }

    public static boolean W(FrameLayout.LayoutParams layoutParams, int i10) {
        if (layoutParams.gravity == i10) {
            return false;
        }
        layoutParams.gravity = i10;
        return true;
    }

    public static void X(ImageView imageView, boolean z10) {
        imageView.setScaleX(z10 ? -1.0f : 1.0f);
    }

    public static void Y(final View view, final int i10) {
        view.post(new Runnable() {
            @Override
            public final void run() {
                p0.A(view, i10);
            }
        });
    }

    public static void Z(final View view, final int i10) {
        view.post(new Runnable() {
            @Override
            public final void run() {
                p0.B(view, i10);
            }
        });
    }

    public static boolean a0(View view, int i10, int i11, int i12, int i13) {
        return view != null && b0((ViewGroup.MarginLayoutParams) view.getLayoutParams(), i10, i11, i12, i13);
    }

    public static boolean b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return false;
        }
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.rightMargin = i12;
        marginLayoutParams.bottomMargin = i13;
        return true;
    }

    public static void c0(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            s0(textView, charSequence);
            textView.setText(charSequence);
        }
    }

    public static void d0(View view, int i10) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.rightMargin != i10) {
                marginLayoutParams.rightMargin = i10;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void e(View view, float f10, float f11, float f12, long j10, long j11, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        ViewPropertyAnimator listener = view.animate().scaleX(f10).scaleY(f11).alpha(f12).setInterpolator(interpolator).setDuration(j10).setListener(animatorListener);
        if (j11 >= 0) {
            listener.setStartDelay(j11);
        }
    }

    public static void e0(View view) {
        if (view != null) {
            view.setVerticalScrollbarPosition(w.G2() ? 1 : 2);
        }
    }

    public static void f(View view, float f10, float f11, float f12, long j10, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        e(view, f10, f11, f12, j10, 0L, interpolator, animatorListener);
    }

    public static void f0(EditText editText, int i10) {
        if (editText != null) {
            try {
                editText.setSelection(i10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void g(View view, float f10, long j10, long j11, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        ViewPropertyAnimator listener = view.animate().alpha(f10).setDuration(j10).setInterpolator(interpolator).setListener(animatorListener);
        if (j11 > 0) {
            listener.setStartDelay(j11);
        }
    }

    public static void g0(EditText editText, int i10, int i11) {
        if (editText != null) {
            try {
                editText.setSelection(i10, i11);
            } catch (Throwable unused) {
            }
        }
    }

    public static void h(View view, float f10, long j10, Interpolator interpolator, Animator.AnimatorListener animatorListener) {
        g(view, f10, j10, 0L, interpolator, animatorListener);
    }

    public static void h0(TextView textView) {
        textView.setShadowLayer(a0.i(3.0f), 0.0f, a0.i(0.6666667f), 1275068416);
    }

    public static void i(View view) {
        if (view != null && (view instanceof ne.a)) {
            ((ne.a) view).e();
        }
    }

    public static void i0(final View view) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        final int i10 = a0.i(1.5f);
        final int i11 = a0.i(3.0f);
        final int i12 = i11 - i10;
        ValueAnimator b10 = db.b.b();
        b10.setDuration(180L);
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        b10.setInterpolator(decelerateInterpolator);
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p0.C(i10, i12, view, valueAnimator);
            }
        });
        stateListAnimator.addState(new int[]{16842919}, b10);
        ValueAnimator b11 = db.b.b();
        b11.setDuration(180L);
        b11.setInterpolator(decelerateInterpolator);
        b11.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p0.D(i11, i12, view, valueAnimator);
            }
        });
        stateListAnimator.addState(new int[0], b11);
        view.setStateListAnimator(stateListAnimator);
    }

    public static void j(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                if (childAt instanceof ne.a) {
                    if (z10) {
                        ((ne.a) childAt).e();
                    } else {
                        ((ne.a) childAt).b();
                    }
                }
                if (childAt instanceof ViewGroup) {
                    j((ViewGroup) childAt, z10);
                }
            }
        }
    }

    public static void j0(EditText editText, boolean z10) {
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        editText.setSingleLine(z10);
        if (selectionEnd != 0 || selectionStart != 0) {
            try {
                editText.setSelection(selectionStart, selectionEnd);
            } catch (Throwable th) {
                Log.w("Cannot move cursor", th, new Object[0]);
            }
        }
    }

    public static void k(View view) {
        view.animate().cancel();
    }

    public static void k0(EditText editText, String str) {
        if (editText != null) {
            editText.setText(str);
            try {
                editText.setSelection(str.length());
            } catch (Throwable unused) {
            }
        }
    }

    public static void l(EditText editText) {
        U(editText, 0);
    }

    public static void l0(TextView textView, int i10) {
        if (textView != null && textView.getGravity() != i10) {
            textView.setGravity(i10);
        }
    }

    public static void m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                if (childAt instanceof kb.c) {
                    ((kb.c) childAt).Q2();
                }
                if (childAt instanceof ViewGroup) {
                    m((ViewGroup) childAt);
                }
            }
        }
    }

    public static void m0(View view, int i10) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i10) {
                marginLayoutParams.topMargin = i10;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void n(RecyclerView recyclerView) {
        if (recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            int a22 = linearLayoutManager.a2();
            if (!(X1 == -1 || a22 == -1)) {
                while (X1 <= a22) {
                    View C = linearLayoutManager.C(X1);
                    if (C instanceof b1) {
                        ((b1) C).J();
                    }
                    if (C instanceof kb.c) {
                        ((kb.c) C).Q2();
                    } else if (C instanceof RecyclerView) {
                        n((RecyclerView) C);
                    }
                    X1++;
                }
            }
            recyclerView.removeAllViewsInLayout();
        }
    }

    public static View n0(Context context) {
        return o0(context, FrameLayoutFix.r1(a0.i(48.0f), a0.i(48.0f), 17));
    }

    public static void o(View view) {
        if (view != null && (view instanceof ne.a)) {
            ((ne.a) view).b();
        }
    }

    public static View o0(Context context, ViewGroup.LayoutParams layoutParams) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        if (layoutParams != null) {
            progressBar.setLayoutParams(layoutParams);
        }
        return progressBar;
    }

    public static int p(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    public static void p0(View view) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i10 = marginLayoutParams.leftMargin;
            if (i10 != 0 || marginLayoutParams.topMargin != 0 || marginLayoutParams.rightMargin != 0 || marginLayoutParams.bottomMargin != 0) {
                view.setPadding(i10, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                marginLayoutParams.width += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                marginLayoutParams.height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                marginLayoutParams.bottomMargin = 0;
                marginLayoutParams.rightMargin = 0;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
            }
        }
    }

    public static Paint q() {
        return f5337b;
    }

    public static View q0(Context context, Dialog dialog, String str) {
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

    public static int[] r(View view) {
        if (f5336a == null) {
            f5336a = new int[2];
        }
        view.getLocationInWindow(f5336a);
        return f5336a;
    }

    public static void r0(View view) {
        if (view != null) {
            view.setLayoutParams(view.getLayoutParams());
        }
    }

    public static int[] s(View view) {
        if (f5336a == null) {
            f5336a = new int[2];
        }
        view.getLocationOnScreen(f5336a);
        return f5336a;
    }

    public static void s0(TextView textView, CharSequence charSequence) {
        Typeface typeface = textView.getTypeface();
        boolean M0 = g.M0(charSequence);
        Typeface k10 = M0 ? o.k() : o.i();
        if (k10 != typeface) {
            textView.setTypeface(k10);
        }
        int paintFlags = textView.getPaintFlags();
        int h10 = ib.c.h(paintFlags, 32, M0);
        if (paintFlags != h10) {
            textView.setPaintFlags(h10);
        }
    }

    public static int t(View view) {
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

    @Deprecated
    public static void u(View view, int[] iArr) {
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
        iArr[1] = top - a0.o();
    }

    public static View v(Context context, int i10, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i10, viewGroup, false);
    }

    public static void w(View view, float f10, float f11) {
        i0(view);
        view.setOutlineProvider(new a(f11, f10));
    }

    public static void x(View view, float f10, float f11) {
        i0(view);
        view.setOutlineProvider(new b(f11, f10));
    }

    public static void y(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    childAt.invalidate();
                }
            }
        }
    }

    public static boolean z(View view) {
        return view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f;
    }
}
