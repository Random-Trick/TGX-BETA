package c1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import c1.a;
import c1.e0;
import c1.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.thunderdog.challegram.Log;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class v {
    public static Field f4294c;
    public static ThreadLocal<Rect> f4296e;
    public static final AtomicInteger f4292a = new AtomicInteger(1);
    public static WeakHashMap<View, a0> f4293b = null;
    public static boolean f4295d = false;
    public static final int[] f4297f = {o0.c.b_res_0x7f070007, o0.c.c_res_0x7f070008, o0.c.n_res_0x7f070013, o0.c.y_res_0x7f07001e, o0.c.B_res_0x7f070021, o0.c.C_res_0x7f070022, o0.c.D_res_0x7f070023, o0.c.E_res_0x7f070024, o0.c.F_res_0x7f070025, o0.c.G_res_0x7f070026, o0.c.d_res_0x7f070009, o0.c.e_res_0x7f07000a, o0.c.f_res_0x7f07000b, o0.c.g_res_0x7f07000c, o0.c.h_res_0x7f07000d, o0.c.i_res_0x7f07000e, o0.c.j_res_0x7f07000f, o0.c.k_res_0x7f070010, o0.c.l_res_0x7f070011, o0.c.m_res_0x7f070012, o0.c.o_res_0x7f070014, o0.c.p_res_0x7f070015, o0.c.q_res_0x7f070016, o0.c.r_res_0x7f070017, o0.c.s_res_0x7f070018, o0.c.t_res_0x7f070019, o0.c.u_res_0x7f07001a, o0.c.v_res_0x7f07001b, o0.c.w_res_0x7f07001c, o0.c.x_res_0x7f07001d, o0.c.z_res_0x7f07001f, o0.c.A_res_0x7f070020};
    public static final c1.r f4298g = u.f4291a;
    public static final e f4299h = new e();

    public class a extends f<Boolean> {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        public Boolean c(View view) {
            return Boolean.valueOf(o.d(view));
        }
    }

    public class b extends f<CharSequence> {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        public CharSequence c(View view) {
            return o.b(view);
        }
    }

    public class c extends f<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        public CharSequence c(View view) {
            return q.a(view);
        }
    }

    public class d extends f<Boolean> {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        public Boolean c(View view) {
            return Boolean.valueOf(o.c(view));
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> f4300a = new WeakHashMap<>();

        public final void a(View view, boolean z10) {
            boolean z11 = view.getVisibility() == 0;
            if (z10 != z11) {
                v.N(view, z11 ? 16 : 32);
                this.f4300a.put(view, Boolean.valueOf(z11));
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f4300a.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class f<T> {
        public final int f4301a;
        public final Class<T> f4302b;
        public final int f4303c;
        public final int f4304d;

        public f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f4303c;
        }

        public abstract T c(View view);

        public T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f4301a);
            if (this.f4302b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        public f(int i10, Class<T> cls, int i11, int i12) {
            this.f4301a = i10;
            this.f4302b = cls;
            this.f4304d = i11;
            this.f4303c = i12;
        }
    }

    public static class g {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class h {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    public static class i {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    public static class j {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    public static class k {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class l {

        public class a implements View.OnApplyWindowInsetsListener {
            public e0 f4305a = null;
            public final View f4306b;
            public final c1.q f4307c;

            public a(View view, c1.q qVar) {
                this.f4306b = view;
                this.f4307c = qVar;
            }

            @Override
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                e0 t10 = e0.t(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    l.a(windowInsets, this.f4306b);
                    if (t10.equals(this.f4305a)) {
                        return this.f4307c.a(view, t10).r();
                    }
                }
                this.f4305a = t10;
                e0 a10 = this.f4307c.a(view, t10);
                if (i10 >= 30) {
                    return a10.r();
                }
                v.V(view);
                return a10.r();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(o0.c.Q_res_0x7f0704f7);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static e0 b(View view, e0 e0Var, Rect rect) {
            WindowInsets r10 = e0Var.r();
            if (r10 != null) {
                return e0.t(view.computeSystemWindowInsets(r10, rect), view);
            }
            rect.setEmpty();
            return e0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static e0 j(View view) {
            return e0.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, c1.q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(o0.c.L_res_0x7f0704ef, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(o0.c.Q_res_0x7f0704f7));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, qVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class m {
        public static e0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            e0 s10 = e0.s(rootWindowInsets);
            s10.p(s10);
            s10.d(view.getRootView());
            return s10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    public static class n {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class o {
        public static void a(View view, final r rVar) {
            int i10 = o0.c.P_res_0x7f0704f6;
            k0.g gVar = (k0.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new k0.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(rVar);
            View.OnUnhandledKeyEventListener wVar = new View.OnUnhandledKeyEventListener() {
                @Override
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return v.r.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(rVar, wVar);
            view.addOnUnhandledKeyEventListener(wVar);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            k0.g gVar = (k0.g) view.getTag(o0.c.P_res_0x7f0704f6);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(rVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    public static class p {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class q {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public interface r {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static class s {
        public static final ArrayList<WeakReference<View>> f4308d = new ArrayList<>();
        public WeakHashMap<View, Boolean> f4309a = null;
        public SparseArray<WeakReference<View>> f4310b = null;
        public WeakReference<KeyEvent> f4311c = null;

        public static s a(View view) {
            int i10 = o0.c.O_res_0x7f0704f5;
            s sVar = (s) view.getTag(i10);
            if (sVar != null) {
                return sVar;
            }
            s sVar2 = new s();
            view.setTag(i10, sVar2);
            return sVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            return c10 != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4309a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f4310b == null) {
                this.f4310b = new SparseArray<>();
            }
            return this.f4310b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(o0.c.P_res_0x7f0704f6);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((r) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f4311c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f4311c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && v.J(view)) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4309a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4308d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f4309a == null) {
                        this.f4309a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f4308d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f4309a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f4309a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    public static CharSequence A(View view) {
        return n0().d(view);
    }

    public static String B(View view) {
        return l.k(view);
    }

    @Deprecated
    public static float C(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float D(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static int E(View view) {
        return h.g(view);
    }

    public static float F(View view) {
        return l.m(view);
    }

    public static boolean G(View view) {
        return g.a(view);
    }

    public static boolean H(View view) {
        return h.i(view);
    }

    public static boolean I(View view) {
        Boolean d10 = a().d(view);
        return d10 != null && d10.booleanValue();
    }

    public static boolean J(View view) {
        return j.b(view);
    }

    public static boolean K(View view) {
        return j.c(view);
    }

    public static boolean L(View view) {
        return l.p(view);
    }

    public static boolean M(View view) {
        Boolean d10 = X().d(view);
        return d10 != null && d10.booleanValue();
    }

    public static void N(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = l(view) != null && view.getVisibility() == 0;
            int i11 = 32;
            if (k(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = Log.TAG_VOICE;
                }
                obtain.setEventType(i11);
                j.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(l(view));
                    m0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                j.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    j.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    android.util.Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void O(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect r10 = r();
        boolean z10 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            r10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !r10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        c(view, i10);
        if (z10 && r10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(r10);
        }
    }

    public static void P(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect r10 = r();
        boolean z10 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            r10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !r10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        d(view, i10);
        if (z10 && r10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(r10);
        }
    }

    public static e0 Q(View view, e0 e0Var) {
        WindowInsets r10 = e0Var.r();
        if (r10 != null) {
            WindowInsets b10 = k.b(view, r10);
            if (!b10.equals(r10)) {
                return e0.t(b10, view);
            }
        }
        return e0Var;
    }

    public static f<CharSequence> R() {
        return new b(o0.c.K_res_0x7f0704ee, CharSequence.class, 8, 28);
    }

    public static void S(View view) {
        h.k(view);
    }

    public static void T(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    @SuppressLint({"LambdaLast"})
    public static void U(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    public static void V(View view) {
        k.c(view);
    }

    public static void W(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            p.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static f<Boolean> X() {
        return new a(o0.c.M_res_0x7f0704f2, Boolean.class, 28);
    }

    public static void Y(View view, c1.a aVar) {
        if (aVar == null && (i(view) instanceof a.C0061a)) {
            aVar = new c1.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    @Deprecated
    public static void Z(View view, float f10) {
        view.setAlpha(f10);
    }

    public static f<Boolean> a() {
        return new d(o0.c.J_res_0x7f0704ed, Boolean.class, 28);
    }

    public static void a0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static a0 b(View view) {
        if (f4293b == null) {
            f4293b = new WeakHashMap<>();
        }
        a0 a0Var = f4293b.get(view);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(view);
        f4293b.put(view, a0Var2);
        return a0Var2;
    }

    public static void b0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        l.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background != null && z10) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    public static void c(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            p0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                p0((View) parent);
            }
        }
    }

    public static void c0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        l.r(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background != null && z10) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    public static void d(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            p0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                p0((View) parent);
            }
        }
    }

    public static void d0(View view, float f10) {
        l.s(view, f10);
    }

    public static e0 e(View view, e0 e0Var) {
        WindowInsets r10 = e0Var.r();
        if (r10 != null) {
            WindowInsets a10 = k.a(view, r10);
            if (!a10.equals(r10)) {
                return e0.t(a10, view);
            }
        }
        return e0Var;
    }

    public static void e0(View view, int i10) {
        h.s(view, i10);
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return s.a(view).b(view, keyEvent);
    }

    public static void f0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            n.l(view, i10);
        }
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return s.a(view).f(keyEvent);
    }

    public static void g0(View view, Paint paint) {
        i.i(view, paint);
    }

    public static c1.a h(View view) {
        View.AccessibilityDelegate i10 = i(view);
        if (i10 == null) {
            return null;
        }
        if (i10 instanceof a.C0061a) {
            return ((a.C0061a) i10).f4224a;
        }
        return new c1.a(i10);
    }

    public static void h0(View view, c1.q qVar) {
        l.u(view, qVar);
    }

    public static View.AccessibilityDelegate i(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return p.a(view);
        }
        return j(view);
    }

    public static void i0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.d(view, i10, i11);
        }
    }

    public static View.AccessibilityDelegate j(View view) {
        if (f4295d) {
            return null;
        }
        if (f4294c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4294c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4295d = true;
                return null;
            }
        }
        try {
            Object obj = f4294c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4295d = true;
            return null;
        }
    }

    public static void j0(View view, String str) {
        l.v(view, str);
    }

    public static int k(View view) {
        return j.a(view);
    }

    @Deprecated
    public static void k0(View view, float f10) {
        view.setTranslationX(f10);
    }

    public static CharSequence l(View view) {
        return R().d(view);
    }

    @Deprecated
    public static void l0(View view, float f10) {
        view.setTranslationY(f10);
    }

    @Deprecated
    public static float m(View view) {
        return view.getAlpha();
    }

    public static void m0(View view) {
        if (t(view) == 0) {
            e0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (t((View) parent) == 4) {
                e0(view, 2);
                return;
            }
        }
    }

    public static ColorStateList n(View view) {
        return l.g(view);
    }

    public static f<CharSequence> n0() {
        return new c(o0.c.N_res_0x7f0704f3, CharSequence.class, 64, 30);
    }

    public static PorterDuff.Mode o(View view) {
        return l.h(view);
    }

    public static void o0(View view) {
        l.z(view);
    }

    public static Display p(View view) {
        return i.b(view);
    }

    public static void p0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static float q(View view) {
        return l.i(view);
    }

    public static Rect r() {
        if (f4296e == null) {
            f4296e = new ThreadLocal<>();
        }
        Rect rect = f4296e.get();
        if (rect == null) {
            rect = new Rect();
            f4296e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean s(View view) {
        return h.b(view);
    }

    public static int t(View view) {
        return h.c(view);
    }

    @SuppressLint({"InlinedApi"})
    public static int u(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return n.b(view);
        }
        return 0;
    }

    public static int v(View view) {
        return i.d(view);
    }

    public static int w(View view) {
        return h.d(view);
    }

    public static int x(View view) {
        return h.e(view);
    }

    public static ViewParent y(View view) {
        return h.f(view);
    }

    public static e0 z(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m.a(view);
        }
        return l.j(view);
    }
}
