package d1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import d1.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;

public class c {
    public static int f6104d;
    public final AccessibilityNodeInfo f6105a;
    public int f6106b = -1;
    public int f6107c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a f6108e = new a(1, null);
        public static final a f6109f = new a(2, null);
        public static final a f6110g = new a(4, null);
        public static final a f6111h = new a(8, null);
        public static final a f6112i = new a(16, null);
        public static final a f6113j = new a(32, null);
        public static final a f6114k = new a(64, null);
        public static final a f6115l = new a(Log.TAG_YOUTUBE, null);
        public static final a f6116m = new a(Log.TAG_CRASH, null, f.b.class);
        public static final a f6117n = new a(Log.TAG_GIF_LOADER, null, f.b.class);
        public static final a f6118o = new a(Log.TAG_CAMERA, null, f.c.class);
        public static final a f6119p = new a(Log.TAG_VOICE, null, f.c.class);
        public static final a f6120q = new a(Log.TAG_EMOJI, null);
        public static final a f6121r = new a(Log.TAG_LUX, null);
        public static final a f6122s = new a(Log.TAG_VIDEO, null);
        public static final a f6123t = new a(Log.TAG_ROUND, null);
        public static final a f6124u = new a(Log.TAG_COMPRESS, null);
        public static final a f6125v = new a(Log.TAG_CONTACT, null, f.g.class);
        public static final a f6126w = new a(Log.TAG_PAINT, null);
        public static final a f6127x = new a(Log.TAG_PLAYER, null);
        public static final a f6128y = new a(Log.TAG_NDK, null);
        public static final a f6129z = new a(Log.TAG_ACCOUNTS, null, f.h.class);
        public final Object f6130a;
        public final int f6131b;
        public final Class<? extends f.a> f6132c;
        public final f f6133d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0079f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (i10 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            Q = new a(accessibilityAction, 16908372, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6130a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6130a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            Exception e10;
            f.a newInstance;
            if (this.f6133d == null) {
                return false;
            }
            f.a aVar = null;
            Class<? extends f.a> cls = this.f6132c;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e11) {
                    e10 = e11;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e12) {
                    e10 = e12;
                    aVar = newInstance;
                    Class<? extends f.a> cls2 = this.f6132c;
                    String name = cls2 == null ? "null" : cls2.getName();
                    android.util.Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e10);
                    return this.f6133d.a(view, aVar);
                }
            }
            return this.f6133d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f6130a;
            return obj2 == null ? aVar.f6130a == null : obj2.equals(aVar.f6130a);
        }

        public int hashCode() {
            Object obj = this.f6130a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f6131b = i10;
            this.f6133d = fVar;
            if (obj == null) {
                this.f6130a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f6130a = obj;
            }
            this.f6132c = cls;
        }
    }

    public static class b {
        public final Object f6134a;

        public b(Object obj) {
            this.f6134a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class C0078c {
        public final Object f6135a;

        public C0078c(Object obj) {
            this.f6135a = obj;
        }

        public static C0078c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new C0078c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f6105a = accessibilityNodeInfo;
    }

    public static c K(c cVar) {
        return p0(AccessibilityNodeInfo.obtain(cVar.f6105a));
    }

    public static String i(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case Log.TAG_IMAGE_LOADER:
                return "ACTION_LONG_CLICK";
            case Log.TAG_SPEED_TEXT:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case Log.TAG_YOUTUBE:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case Log.TAG_CRASH:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case Log.TAG_GIF_LOADER:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case Log.TAG_CAMERA:
                return "ACTION_NEXT_HTML_ELEMENT";
            case Log.TAG_VOICE:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case Log.TAG_EMOJI:
                return "ACTION_SCROLL_FORWARD";
            case Log.TAG_LUX:
                return "ACTION_SCROLL_BACKWARD";
            case Log.TAG_VIDEO:
                return "ACTION_COPY";
            case Log.TAG_ROUND:
                return "ACTION_PASTE";
            case Log.TAG_COMPRESS:
                return "ACTION_CUT";
            case Log.TAG_CONTACT:
                return "ACTION_SET_SELECTION";
            case Log.TAG_PAINT:
                return "ACTION_EXPAND";
            case Log.TAG_PLAYER:
                return "ACTION_COLLAPSE";
            case Log.TAG_ACCOUNTS:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] n(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static c p0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public boolean A() {
        return this.f6105a.isChecked();
    }

    public boolean B() {
        return this.f6105a.isClickable();
    }

    public boolean C() {
        return this.f6105a.isEnabled();
    }

    public boolean D() {
        return this.f6105a.isFocusable();
    }

    public boolean E() {
        return this.f6105a.isFocused();
    }

    public boolean F() {
        return this.f6105a.isLongClickable();
    }

    public boolean G() {
        return this.f6105a.isPassword();
    }

    public boolean H() {
        return this.f6105a.isScrollable();
    }

    public boolean I() {
        return this.f6105a.isSelected();
    }

    public boolean J() {
        return this.f6105a.isVisibleToUser();
    }

    public boolean L(int i10, Bundle bundle) {
        return this.f6105a.performAction(i10, bundle);
    }

    public void M() {
        this.f6105a.recycle();
    }

    public boolean N(a aVar) {
        return this.f6105a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6130a);
    }

    public final void O(View view) {
        SparseArray<WeakReference<ClickableSpan>> t10 = t(view);
        if (t10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < t10.size(); i10++) {
                if (t10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public void P(boolean z10) {
        this.f6105a.setAccessibilityFocused(z10);
    }

    public final void Q(int i10, boolean z10) {
        Bundle p10 = p();
        if (p10 != null) {
            int i11 = p10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            p10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    @Deprecated
    public void R(Rect rect) {
        this.f6105a.setBoundsInParent(rect);
    }

    public void S(Rect rect) {
        this.f6105a.setBoundsInScreen(rect);
    }

    public void T(boolean z10) {
        this.f6105a.setCanOpenPopup(z10);
    }

    public void U(CharSequence charSequence) {
        this.f6105a.setClassName(charSequence);
    }

    public void V(boolean z10) {
        this.f6105a.setClickable(z10);
    }

    public void W(Object obj) {
        this.f6105a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f6134a);
    }

    public void X(Object obj) {
        this.f6105a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0078c) obj).f6135a);
    }

    public void Y(CharSequence charSequence) {
        this.f6105a.setContentDescription(charSequence);
    }

    public void Z(boolean z10) {
        this.f6105a.setEnabled(z10);
    }

    public void a(int i10) {
        this.f6105a.addAction(i10);
    }

    public void a0(boolean z10) {
        this.f6105a.setFocusable(z10);
    }

    public void b(a aVar) {
        this.f6105a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6130a);
    }

    public void b0(boolean z10) {
        this.f6105a.setFocused(z10);
    }

    public void c(View view) {
        this.f6105a.addChild(view);
    }

    public void c0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6105a.setHeading(z10);
        } else {
            Q(2, z10);
        }
    }

    public final void d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public void d0(boolean z10) {
        this.f6105a.setLongClickable(z10);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            O(view);
            ClickableSpan[] n10 = n(charSequence);
            if (n10 != null && n10.length > 0) {
                p().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", o0.c.a_res_0x7f070006);
                SparseArray<WeakReference<ClickableSpan>> r10 = r(view);
                for (int i10 = 0; i10 < n10.length; i10++) {
                    int x10 = x(n10[i10], r10);
                    r10.put(x10, new WeakReference<>(n10[i10]));
                    d(n10[i10], (Spanned) charSequence, x10);
                }
            }
        }
    }

    public void e0(int i10) {
        this.f6105a.setMovementGranularities(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6105a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f6105a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f6105a)) {
            return false;
        }
        return this.f6107c == cVar.f6107c && this.f6106b == cVar.f6106b;
    }

    public final void f() {
        this.f6105a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f6105a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f6105a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f6105a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public void f0(CharSequence charSequence) {
        this.f6105a.setPackageName(charSequence);
    }

    public final List<Integer> g(String str) {
        ArrayList<Integer> integerArrayList = this.f6105a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f6105a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void g0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6105a.setPaneTitle(charSequence);
        } else {
            this.f6105a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f6105a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void h0(View view) {
        this.f6106b = -1;
        this.f6105a.setParent(view);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6105a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6105a.setScreenReaderFocusable(z10);
        } else {
            Q(1, z10);
        }
    }

    public int j() {
        return this.f6105a.getActions();
    }

    public void j0(boolean z10) {
        this.f6105a.setScrollable(z10);
    }

    @Deprecated
    public void k(Rect rect) {
        this.f6105a.getBoundsInParent(rect);
    }

    public void k0(boolean z10) {
        this.f6105a.setSelected(z10);
    }

    public void l(Rect rect) {
        this.f6105a.getBoundsInScreen(rect);
    }

    public void l0(View view) {
        this.f6107c = -1;
        this.f6105a.setSource(view);
    }

    public CharSequence m() {
        return this.f6105a.getClassName();
    }

    public void m0(CharSequence charSequence) {
        if (y0.a.b()) {
            this.f6105a.setStateDescription(charSequence);
        } else {
            this.f6105a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void n0(boolean z10) {
        this.f6105a.setVisibleToUser(z10);
    }

    public CharSequence o() {
        return this.f6105a.getContentDescription();
    }

    public AccessibilityNodeInfo o0() {
        return this.f6105a;
    }

    public Bundle p() {
        return this.f6105a.getExtras();
    }

    public int q() {
        return this.f6105a.getMovementGranularities();
    }

    public final SparseArray<WeakReference<ClickableSpan>> r(View view) {
        SparseArray<WeakReference<ClickableSpan>> t10 = t(view);
        if (t10 != null) {
            return t10;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(o0.c.I_res_0x7f0704ec, sparseArray);
        return sparseArray;
    }

    public CharSequence s() {
        return this.f6105a.getPackageName();
    }

    public final SparseArray<WeakReference<ClickableSpan>> t(View view) {
        return (SparseArray) view.getTag(o0.c.I_res_0x7f0704ec);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb2.append("; boundsInParent: " + rect);
        l(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(s());
        sb2.append("; className: ");
        sb2.append(m());
        sb2.append("; text: ");
        sb2.append(u());
        sb2.append("; contentDescription: ");
        sb2.append(o());
        sb2.append("; viewId: ");
        sb2.append(v());
        sb2.append("; checkable: ");
        sb2.append(z());
        sb2.append("; checked: ");
        sb2.append(A());
        sb2.append("; focusable: ");
        sb2.append(D());
        sb2.append("; focused: ");
        sb2.append(E());
        sb2.append("; selected: ");
        sb2.append(I());
        sb2.append("; clickable: ");
        sb2.append(B());
        sb2.append("; longClickable: ");
        sb2.append(F());
        sb2.append("; enabled: ");
        sb2.append(C());
        sb2.append("; password: ");
        sb2.append(G());
        sb2.append("; scrollable: " + H());
        sb2.append("; [");
        List<a> h10 = h();
        for (int i10 = 0; i10 < h10.size(); i10++) {
            a aVar = h10.get(i10);
            String i11 = i(aVar.a());
            if (i11.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                i11 = aVar.b().toString();
            }
            sb2.append(i11);
            if (i10 != h10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        if (!w()) {
            return this.f6105a.getText();
        }
        List<Integer> g10 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> g11 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> g12 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> g13 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f6105a.getText(), 0, this.f6105a.getText().length()));
        for (int i10 = 0; i10 < g10.size(); i10++) {
            spannableString.setSpan(new d1.a(g13.get(i10).intValue(), this, p().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g10.get(i10).intValue(), g11.get(i10).intValue(), g12.get(i10).intValue());
        }
        return spannableString;
    }

    public String v() {
        return this.f6105a.getViewIdResourceName();
    }

    public final boolean w() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public final int x(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f6104d;
        f6104d = i11 + 1;
        return i11;
    }

    public boolean y() {
        return this.f6105a.isAccessibilityFocused();
    }

    public boolean z() {
        return this.f6105a.isCheckable();
    }
}
