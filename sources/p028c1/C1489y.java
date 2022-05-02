package p028c1;

import android.animation.ValueAnimator;
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
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
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
import p028c1.C1432a;
import p028c1.C1458h0;
import p028c1.C1489y;
import p143k0.C6037g;
import p196o0.C7524c;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C1489y {
    public static Field f5357b;
    public static boolean f5358c;
    public static Field f5359d;
    public static boolean f5360e;
    public static WeakHashMap<View, String> f5361f;
    public static Field f5363h;
    public static ThreadLocal<Rect> f5365j;
    public static final AtomicInteger f5356a = new AtomicInteger(1);
    public static WeakHashMap<View, C1446d0> f5362g = null;
    public static boolean f5364i = false;
    public static final int[] f5366k = {C7524c.b_res_0x7f070007, C7524c.c_res_0x7f070008, C7524c.n_res_0x7f070013, C7524c.y_res_0x7f07001e, C7524c.B_res_0x7f070021, C7524c.C_res_0x7f070022, C7524c.D_res_0x7f070023, C7524c.E_res_0x7f070024, C7524c.F_res_0x7f070025, C7524c.G_res_0x7f070026, C7524c.d_res_0x7f070009, C7524c.e_res_0x7f07000a, C7524c.f_res_0x7f07000b, C7524c.g_res_0x7f07000c, C7524c.h_res_0x7f07000d, C7524c.i_res_0x7f07000e, C7524c.j_res_0x7f07000f, C7524c.k_res_0x7f070010, C7524c.l_res_0x7f070011, C7524c.m_res_0x7f070012, C7524c.o_res_0x7f070014, C7524c.p_res_0x7f070015, C7524c.q_res_0x7f070016, C7524c.r_res_0x7f070017, C7524c.s_res_0x7f070018, C7524c.t_res_0x7f070019, C7524c.u_res_0x7f07001a, C7524c.v_res_0x7f07001b, C7524c.w_res_0x7f07001c, C7524c.x_res_0x7f07001d, C7524c.z_res_0x7f07001f, C7524c.A_res_0x7f070020};
    public static final AbstractC1484t f5367l = C1488x.f5355a;
    public static final ViewTreeObserver$OnGlobalLayoutListenerC1494e f5368m = new ViewTreeObserver$OnGlobalLayoutListenerC1494e();

    public class C1490a extends AbstractC1495f<Boolean> {
        public C1490a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        public Boolean mo36695c(View view) {
            return Boolean.valueOf(C1505o.m36604d(view));
        }
    }

    public class C1491b extends AbstractC1495f<CharSequence> {
        public C1491b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        public CharSequence mo36695c(View view) {
            return C1505o.m36606b(view);
        }
    }

    public class C1492c extends AbstractC1495f<CharSequence> {
        public C1492c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        public CharSequence mo36695c(View view) {
            return C1507q.m36594a(view);
        }
    }

    public class C1493d extends AbstractC1495f<Boolean> {
        public C1493d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        public Boolean mo36695c(View view) {
            return Boolean.valueOf(C1505o.m36605c(view));
        }
    }

    public static class ViewTreeObserver$OnGlobalLayoutListenerC1494e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> f5369a = new WeakHashMap<>();

        public final void m36699a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                C1489y.m36759N(view, z2 ? 16 : 32);
                this.f5369a.put(view, Boolean.valueOf(z2));
            }
        }

        public final void m36698b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f5369a.entrySet()) {
                    m36699a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            m36698b(view);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class AbstractC1495f<T> {
        public final int f5370a;
        public final Class<T> f5371b;
        public final int f5372c;
        public final int f5373d;

        public AbstractC1495f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public final boolean m36697a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        public final boolean m36696b() {
            return Build.VERSION.SDK_INT >= this.f5372c;
        }

        public abstract T mo36695c(View view);

        public T m36694d(View view) {
            if (m36696b()) {
                return mo36695c(view);
            }
            if (!m36697a()) {
                return null;
            }
            T t = (T) view.getTag(this.f5370a);
            if (this.f5371b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public AbstractC1495f(int i, Class<T> cls, int i2, int i3) {
            this.f5370a = i;
            this.f5371b = cls;
            this.f5373d = i2;
            this.f5372c = i3;
        }
    }

    public static class C1496g {
        public static boolean m36693a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class C1497h {
        public static AccessibilityNodeProvider m36692a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean m36691b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int m36690c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int m36689d(View view) {
            return view.getMinimumHeight();
        }

        public static int m36688e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent m36687f(View view) {
            return view.getParentForAccessibility();
        }

        public static int m36686g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean m36685h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean m36684i(View view) {
            return view.hasTransientState();
        }

        public static boolean m36683j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        public static void m36682k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void m36681l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public static void m36680m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void m36679n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public static void m36678o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void m36677p(View view) {
            view.requestFitSystemWindows();
        }

        public static void m36676q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void m36675r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void m36674s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    public static class C1498i {
        public static int m36673a() {
            return View.generateViewId();
        }

        public static Display m36672b(View view) {
            return view.getDisplay();
        }

        public static int m36671c(View view) {
            return view.getLabelFor();
        }

        public static int m36670d(View view) {
            return view.getLayoutDirection();
        }

        public static int m36669e(View view) {
            return view.getPaddingEnd();
        }

        public static int m36668f(View view) {
            return view.getPaddingStart();
        }

        public static boolean m36667g(View view) {
            return view.isPaddingRelative();
        }

        public static void m36666h(View view, int i) {
            view.setLabelFor(i);
        }

        public static void m36665i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void m36664j(View view, int i) {
            view.setLayoutDirection(i);
        }

        public static void m36663k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    public static class C1499j {
        public static int m36662a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean m36661b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean m36660c(View view) {
            return view.isLaidOut();
        }

        public static boolean m36659d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void m36658e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        public static void m36657f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        public static void m36656g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static class C1500k {
        public static WindowInsets m36655a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets m36654b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void m36653c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class C1501l {

        public class View$OnApplyWindowInsetsListenerC1502a implements View.OnApplyWindowInsetsListener {
            public C1458h0 f5374a = null;
            public final View f5375b;
            public final AbstractC1483s f5376c;

            public View$OnApplyWindowInsetsListenerC1502a(View view, AbstractC1483s sVar) {
                this.f5375b = view;
                this.f5376c = sVar;
            }

            @Override
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C1458h0 t = C1458h0.m36861t(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C1501l.m36652a(windowInsets, this.f5375b);
                    if (t.equals(this.f5374a)) {
                        return this.f5376c.mo28947a(view, t).m36863r();
                    }
                }
                this.f5374a = t;
                C1458h0 a = this.f5376c.mo28947a(view, t);
                if (i >= 30) {
                    return a.m36863r();
                }
                C1489y.m36750W(view);
                return a.m36863r();
            }
        }

        public static void m36652a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C7524c.R_res_0x7f0704f5);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static C1458h0 m36651b(View view, C1458h0 h0Var, Rect rect) {
            WindowInsets r = h0Var.m36863r();
            if (r != null) {
                return C1458h0.m36861t(view.computeSystemWindowInsets(r, rect), view);
            }
            rect.setEmpty();
            return h0Var;
        }

        public static boolean m36650c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean m36649d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean m36648e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean m36647f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList m36646g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode m36645h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float m36644i(View view) {
            return view.getElevation();
        }

        public static C1458h0 m36643j(View view) {
            return C1458h0.C1459a.m36860a(view);
        }

        public static String m36642k(View view) {
            return view.getTransitionName();
        }

        public static float m36641l(View view) {
            return view.getTranslationZ();
        }

        public static float m36640m(View view) {
            return view.getZ();
        }

        public static boolean m36639n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean m36638o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean m36637p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void m36636q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void m36635r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void m36634s(View view, float f) {
            view.setElevation(f);
        }

        public static void m36633t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void m36632u(View view, AbstractC1483s sVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C7524c.L_res_0x7f0704ed, sVar);
            }
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C7524c.R_res_0x7f0704f5));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC1502a(view, sVar));
            }
        }

        public static void m36631v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void m36630w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void m36629x(View view, float f) {
            view.setZ(f);
        }

        public static boolean m36628y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void m36627z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class C1503m {
        public static C1458h0 m36626a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C1458h0 s = C1458h0.m36862s(rootWindowInsets);
            s.m36865p(s);
            s.m36877d(view.getRootView());
            return s;
        }

        public static int m36625b(View view) {
            return view.getScrollIndicators();
        }

        public static void m36624c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void m36623d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static class C1504n {
        public static void m36622a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static int m36621b(View view) {
            return view.getImportantForAutofill();
        }

        public static int m36620c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean m36619d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean m36618e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean m36617f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean m36616g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View m36615h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean m36614i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void m36613j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void m36612k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void m36611l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void m36610m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void m36609n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void m36608o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class C1505o {
        public static void m36607a(View view, final AbstractC1508r rVar) {
            int i = C7524c.Q_res_0x7f0704f4;
            C6037g gVar = (C6037g) view.getTag(i);
            if (gVar == null) {
                gVar = new C6037g();
                view.setTag(i, gVar);
            }
            Objects.requireNonNull(rVar);
            View.OnUnhandledKeyEventListener zVar = new View.OnUnhandledKeyEventListener() {
                @Override
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C1489y.AbstractC1508r.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(rVar, zVar);
            view.addOnUnhandledKeyEventListener(zVar);
        }

        public static CharSequence m36606b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean m36605c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean m36604d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void m36603e(View view, AbstractC1508r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C6037g gVar = (C6037g) view.getTag(C7524c.Q_res_0x7f0704f4);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(rVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T m36602f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void m36601g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void m36600h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void m36599i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    public static class C1506p {
        public static View.AccessibilityDelegate m36598a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> m36597b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void m36596c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void m36595d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class C1507q {
        public static CharSequence m36594a(View view) {
            return view.getStateDescription();
        }

        public static void m36593b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public interface AbstractC1508r {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static class C1509s {
        public static final ArrayList<WeakReference<View>> f5377d = new ArrayList<>();
        public WeakHashMap<View, Boolean> f5378a = null;
        public SparseArray<WeakReference<View>> f5379b = null;
        public WeakReference<KeyEvent> f5380c = null;

        public static C1509s m36592a(View view) {
            int i = C7524c.P_res_0x7f0704f3;
            C1509s sVar = (C1509s) view.getTag(i);
            if (sVar != null) {
                return sVar;
            }
            C1509s sVar2 = new C1509s();
            view.setTag(i, sVar2);
            return sVar2;
        }

        public boolean m36591b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m36586g();
            }
            View c = m36590c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m36589d().put(keyCode, new WeakReference<>(c));
                }
            }
            return c != null;
        }

        public final View m36590c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f5378a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m36590c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m36588e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> m36589d() {
            if (this.f5379b == null) {
                this.f5379b = new SparseArray<>();
            }
            return this.f5379b;
        }

        public final boolean m36588e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C7524c.Q_res_0x7f0704f4);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((AbstractC1508r) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean m36587f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f5380c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f5380c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d = m36589d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && C1489y.m36763J(view)) {
                m36588e(view, keyEvent);
            }
            return true;
        }

        public final void m36586g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f5378a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f5377d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f5378a == null) {
                        this.f5378a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f5377d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f5378a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f5378a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    public static CharSequence m36772A(View view) {
        return m36717o0().m36694d(view);
    }

    public static String m36771B(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1501l.m36642k(view);
        }
        WeakHashMap<View, String> weakHashMap = f5361f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static float m36770C(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float m36769D(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static int m36768E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1497h.m36686g(view);
        }
        return 0;
    }

    public static float m36767F(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1501l.m36640m(view);
        }
        return 0.0f;
    }

    public static boolean m36766G(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return C1496g.m36693a(view);
        }
        return false;
    }

    public static boolean m36765H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1497h.m36684i(view);
        }
        return false;
    }

    public static boolean m36764I(View view) {
        Boolean d = m36746a().m36694d(view);
        return d != null && d.booleanValue();
    }

    public static boolean m36763J(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1499j.m36661b(view);
        }
        return view.getWindowToken() != null;
    }

    public static boolean m36762K(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1499j.m36660c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean m36761L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1501l.m36637p(view);
        }
        if (view instanceof AbstractC1477m) {
            return ((AbstractC1477m) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean m36760M(View view) {
        Boolean d = m36748Y().m36694d(view);
        return d != null && d.booleanValue();
    }

    public static void m36759N(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m36724l(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (m36726k(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = Log.TAG_VOICE;
                }
                obtain.setEventType(i2);
                C1499j.m36656g(obtain, i);
                if (z) {
                    obtain.getText().add(m36724l(view));
                    m36719n0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C1499j.m36656g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m36724l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C1499j.m36658e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    android.util.Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    public static void m36758O(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect r = m36712r();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                r.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !r.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m36742c(view, i);
            if (z && r.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(r);
            }
        } else {
            m36742c(view, i);
        }
    }

    public static void m36757P(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect r = m36712r();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                r.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !r.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m36740d(view, i);
            if (z && r.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(r);
            }
        } else {
            m36740d(view, i);
        }
    }

    public static C1458h0 m36756Q(View view, C1458h0 h0Var) {
        WindowInsets r;
        if (Build.VERSION.SDK_INT >= 21 && (r = h0Var.m36863r()) != null) {
            WindowInsets b = C1500k.m36654b(view, r);
            if (!b.equals(r)) {
                return C1458h0.m36861t(b, view);
            }
        }
        return h0Var;
    }

    public static AbstractC1495f<CharSequence> m36755R() {
        return new C1491b(C7524c.K_res_0x7f0704ec, CharSequence.class, 8, 28);
    }

    public static void m36754S(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1497h.m36682k(view);
        } else {
            view.postInvalidate();
        }
    }

    public static void m36753T(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1497h.m36681l(view, i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    public static void m36752U(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1497h.m36680m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void m36751V(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1497h.m36679n(view, runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static void m36750W(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            C1500k.m36653c(view);
        } else if (i >= 16) {
            C1497h.m36677p(view);
        }
    }

    public static void m36749X(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1506p.m36596c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static AbstractC1495f<Boolean> m36748Y() {
        return new C1490a(C7524c.M_res_0x7f0704f0, Boolean.class, 28);
    }

    public static void m36747Z(View view, C1432a aVar) {
        if (aVar == null && (m36730i(view) instanceof C1432a.C1433a)) {
            aVar = new C1432a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.m36946d());
    }

    public static AbstractC1495f<Boolean> m36746a() {
        return new C1493d(C7524c.J_res_0x7f0704eb, Boolean.class, 28);
    }

    @Deprecated
    public static void m36745a0(View view, float f) {
        view.setAlpha(f);
    }

    public static C1446d0 m36744b(View view) {
        if (f5362g == null) {
            f5362g = new WeakHashMap<>();
        }
        C1446d0 d0Var = f5362g.get(view);
        if (d0Var != null) {
            return d0Var;
        }
        C1446d0 d0Var2 = new C1446d0(view);
        f5362g.put(view, d0Var2);
        return d0Var2;
    }

    public static void m36743b0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1497h.m36676q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void m36742c(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m36713q0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m36713q0((View) parent);
            }
        }
    }

    public static void m36741c0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C1501l.m36636q(view, colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C1501l.m36646g(view) == null && C1501l.m36645h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    C1497h.m36676q(view, background);
                }
            }
        } else if (view instanceof AbstractC1486v) {
            ((AbstractC1486v) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void m36740d(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m36713q0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m36713q0((View) parent);
            }
        }
    }

    public static void m36739d0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C1501l.m36635r(view, mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C1501l.m36646g(view) == null && C1501l.m36645h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    C1497h.m36676q(view, background);
                }
            }
        } else if (view instanceof AbstractC1486v) {
            ((AbstractC1486v) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static C1458h0 m36738e(View view, C1458h0 h0Var) {
        WindowInsets r;
        if (Build.VERSION.SDK_INT >= 21 && (r = h0Var.m36863r()) != null) {
            WindowInsets a = C1500k.m36655a(view, r);
            if (!a.equals(r)) {
                return C1458h0.m36861t(a, view);
            }
        }
        return h0Var;
    }

    public static void m36737e0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1501l.m36634s(view, f);
        }
    }

    public static boolean m36736f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1509s.m36592a(view).m36591b(view, keyEvent);
    }

    public static void m36735f0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            C1497h.m36674s(view, i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            C1497h.m36674s(view, i);
        }
    }

    public static boolean m36734g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1509s.m36592a(view).m36587f(keyEvent);
    }

    public static void m36733g0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1504n.m36611l(view, i);
        }
    }

    public static C1432a m36732h(View view) {
        View.AccessibilityDelegate i = m36730i(view);
        if (i == null) {
            return null;
        }
        if (i instanceof C1432a.C1433a) {
            return ((C1432a.C1433a) i).f5259a;
        }
        return new C1432a(i);
    }

    public static void m36731h0(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            C1498i.m36665i(view, paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public static View.AccessibilityDelegate m36730i(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1506p.m36598a(view);
        }
        return m36728j(view);
    }

    public static void m36729i0(View view, AbstractC1483s sVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1501l.m36632u(view, sVar);
        }
    }

    public static View.AccessibilityDelegate m36728j(View view) {
        if (f5364i) {
            return null;
        }
        if (f5363h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5363h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5364i = true;
                return null;
            }
        }
        try {
            Object obj = f5363h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5364i = true;
            return null;
        }
    }

    public static void m36727j0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1503m.m36623d(view, i, i2);
        }
    }

    public static int m36726k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1499j.m36662a(view);
        }
        return 0;
    }

    public static void m36725k0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1501l.m36631v(view, str);
            return;
        }
        if (f5361f == null) {
            f5361f = new WeakHashMap<>();
        }
        f5361f.put(view, str);
    }

    public static CharSequence m36724l(View view) {
        return m36755R().m36694d(view);
    }

    @Deprecated
    public static void m36723l0(View view, float f) {
        view.setTranslationX(f);
    }

    @Deprecated
    public static float m36722m(View view) {
        return view.getAlpha();
    }

    @Deprecated
    public static void m36721m0(View view, float f) {
        view.setTranslationY(f);
    }

    public static ColorStateList m36720n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1501l.m36646g(view);
        }
        if (view instanceof AbstractC1486v) {
            return ((AbstractC1486v) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void m36719n0(View view) {
        if (m36710t(view) == 0) {
            m36735f0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m36710t((View) parent) == 4) {
                m36735f0(view, 2);
                return;
            }
        }
    }

    public static PorterDuff.Mode m36718o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1501l.m36645h(view);
        }
        if (view instanceof AbstractC1486v) {
            return ((AbstractC1486v) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static AbstractC1495f<CharSequence> m36717o0() {
        return new C1492c(C7524c.N_res_0x7f0704f1, CharSequence.class, 64, 30);
    }

    public static Display m36716p(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1498i.m36672b(view);
        }
        if (m36763J(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void m36715p0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1501l.m36627z(view);
        } else if (view instanceof AbstractC1477m) {
            ((AbstractC1477m) view).stopNestedScroll();
        }
    }

    public static float m36714q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1501l.m36644i(view);
        }
        return 0.0f;
    }

    public static void m36713q0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static Rect m36712r() {
        if (f5365j == null) {
            f5365j = new ThreadLocal<>();
        }
        Rect rect = f5365j.get();
        if (rect == null) {
            rect = new Rect();
            f5365j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean m36711s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1497h.m36691b(view);
        }
        return false;
    }

    public static int m36710t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1497h.m36690c(view);
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public static int m36709u(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1504n.m36621b(view);
        }
        return 0;
    }

    public static int m36708v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1498i.m36670d(view);
        }
        return 0;
    }

    public static int m36707w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1497h.m36689d(view);
        }
        if (!f5360e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f5359d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5360e = true;
        }
        Field field = f5359d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int m36706x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1497h.m36688e(view);
        }
        if (!f5358c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f5357b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5358c = true;
        }
        Field field = f5357b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static ViewParent m36705y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C1497h.m36687f(view);
        }
        return view.getParent();
    }

    public static C1458h0 m36704z(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C1503m.m36626a(view);
        }
        if (i >= 21) {
            return C1501l.m36643j(view);
        }
        return null;
    }
}
