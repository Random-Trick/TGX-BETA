package p041d1;

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import p041d1.AbstractC3576f;
import p196o0.C7524c;
import p337y0.C10326a;

public class C3570c {
    public static int f12166d;
    public final AccessibilityNodeInfo f12167a;
    public int f12168b = -1;
    public int f12169c = -1;

    public static class C3571a {
        public static final C3571a f12170A;
        public static final C3571a f12171B;
        public static final C3571a f12172C;
        public static final C3571a f12173D;
        public static final C3571a f12174E;
        public static final C3571a f12175F;
        public static final C3571a f12176G;
        public static final C3571a f12177H;
        public static final C3571a f12178I;
        public static final C3571a f12179J;
        public static final C3571a f12180K;
        public static final C3571a f12181L;
        public static final C3571a f12182M;
        public static final C3571a f12183N;
        public static final C3571a f12184O;
        public static final C3571a f12185P;
        public static final C3571a f12186Q;
        public static final C3571a f12187e = new C3571a(1, null);
        public static final C3571a f12188f = new C3571a(2, null);
        public static final C3571a f12189g = new C3571a(4, null);
        public static final C3571a f12190h = new C3571a(8, null);
        public static final C3571a f12191i = new C3571a(16, null);
        public static final C3571a f12192j = new C3571a(32, null);
        public static final C3571a f12193k = new C3571a(64, null);
        public static final C3571a f12194l = new C3571a(Log.TAG_YOUTUBE, null);
        public static final C3571a f12195m = new C3571a(Log.TAG_CRASH, null, AbstractC3576f.C3578b.class);
        public static final C3571a f12196n = new C3571a(Log.TAG_GIF_LOADER, null, AbstractC3576f.C3578b.class);
        public static final C3571a f12197o = new C3571a(Log.TAG_CAMERA, null, AbstractC3576f.C3579c.class);
        public static final C3571a f12198p = new C3571a(Log.TAG_VOICE, null, AbstractC3576f.C3579c.class);
        public static final C3571a f12199q = new C3571a(Log.TAG_EMOJI, null);
        public static final C3571a f12200r = new C3571a(Log.TAG_LUX, null);
        public static final C3571a f12201s = new C3571a(Log.TAG_VIDEO, null);
        public static final C3571a f12202t = new C3571a(Log.TAG_ROUND, null);
        public static final C3571a f12203u = new C3571a(Log.TAG_COMPRESS, null);
        public static final C3571a f12204v = new C3571a(Log.TAG_CONTACT, null, AbstractC3576f.C3583g.class);
        public static final C3571a f12205w = new C3571a(Log.TAG_PAINT, null);
        public static final C3571a f12206x = new C3571a(Log.TAG_PLAYER, null);
        public static final C3571a f12207y = new C3571a(Log.TAG_NDK, null);
        public static final C3571a f12208z = new C3571a(Log.TAG_ACCOUNTS, null, AbstractC3576f.C3584h.class);
        public final Object f12209a;
        public final int f12210b;
        public final Class<? extends AbstractC3576f.AbstractC3577a> f12211c;
        public final AbstractC3576f f12212d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            int i = Build.VERSION.SDK_INT;
            f12170A = new C3571a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            f12171B = new C3571a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, AbstractC3576f.C3581e.class);
            f12172C = new C3571a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f12173D = new C3571a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f12174E = new C3571a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f12175F = new C3571a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            f12176G = new C3571a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            f12177H = new C3571a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            f12178I = new C3571a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            f12179J = new C3571a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            f12180K = new C3571a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f12181L = new C3571a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, AbstractC3576f.C3582f.class);
            f12182M = new C3571a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, AbstractC3576f.C3580d.class);
            f12183N = new C3571a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            f12184O = new C3571a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            f12185P = new C3571a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f12186Q = new C3571a(accessibilityAction, 16908372, null, null, null);
        }

        public C3571a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public int m29970a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f12209a).getId();
            }
            return 0;
        }

        public CharSequence m29969b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f12209a).getLabel();
            }
            return null;
        }

        public boolean m29968c(View view, Bundle bundle) {
            Exception e;
            AbstractC3576f.AbstractC3577a newInstance;
            if (this.f12212d == null) {
                return false;
            }
            AbstractC3576f.AbstractC3577a aVar = null;
            Class<? extends AbstractC3576f.AbstractC3577a> cls = this.f12211c;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    newInstance.m29961a(bundle);
                    aVar = newInstance;
                } catch (Exception e3) {
                    e = e3;
                    aVar = newInstance;
                    Class<? extends AbstractC3576f.AbstractC3577a> cls2 = this.f12211c;
                    String name = cls2 == null ? "null" : cls2.getName();
                    android.util.Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    return this.f12212d.m29962a(view, aVar);
                }
            }
            return this.f12212d.m29962a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C3571a)) {
                return false;
            }
            C3571a aVar = (C3571a) obj;
            Object obj2 = this.f12209a;
            return obj2 == null ? aVar.f12209a == null : obj2.equals(aVar.f12209a);
        }

        public int hashCode() {
            Object obj = this.f12209a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C3571a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public C3571a(int i, CharSequence charSequence, Class<? extends AbstractC3576f.AbstractC3577a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public C3571a(Object obj, int i, CharSequence charSequence, AbstractC3576f fVar, Class<? extends AbstractC3576f.AbstractC3577a> cls) {
            this.f12210b = i;
            this.f12212d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f12209a = obj;
            } else {
                this.f12209a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f12211c = cls;
        }
    }

    public static class C3572b {
        public final Object f12213a;

        public C3572b(Object obj) {
            this.f12213a = obj;
        }

        public static C3572b m29967a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C3572b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C3572b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C3572b(null);
        }
    }

    public static class C3573c {
        public final Object f12214a;

        public C3573c(Object obj) {
            this.f12214a = obj;
        }

        public static C3573c m29966a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C3573c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C3573c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C3573c(null);
        }
    }

    public C3570c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f12167a = accessibilityNodeInfo;
    }

    public static C3570c m30028K(C3570c cVar) {
        return m29981p0(AccessibilityNodeInfo.obtain(cVar.f12167a));
    }

    public static String m29996i(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
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
                switch (i) {
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
                        switch (i) {
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

    public static ClickableSpan[] m29986n(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static C3570c m29981p0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3570c(accessibilityNodeInfo);
    }

    public boolean m30038A() {
        return this.f12167a.isChecked();
    }

    public boolean m30037B() {
        return this.f12167a.isClickable();
    }

    public boolean m30036C() {
        return this.f12167a.isEnabled();
    }

    public boolean m30035D() {
        return this.f12167a.isFocusable();
    }

    public boolean m30034E() {
        return this.f12167a.isFocused();
    }

    public boolean m30033F() {
        return this.f12167a.isLongClickable();
    }

    public boolean m30032G() {
        return this.f12167a.isPassword();
    }

    public boolean m30031H() {
        return this.f12167a.isScrollable();
    }

    public boolean m30030I() {
        return this.f12167a.isSelected();
    }

    public boolean m30029J() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f12167a.isVisibleToUser();
        }
        return false;
    }

    public boolean m30027L(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f12167a.performAction(i, bundle);
        }
        return false;
    }

    public void m30026M() {
        this.f12167a.recycle();
    }

    public boolean m30025N(C3571a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f12167a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f12209a);
        }
        return false;
    }

    public final void m30024O(View view) {
        SparseArray<WeakReference<ClickableSpan>> t = m29977t(view);
        if (t != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < t.size(); i++) {
                if (t.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                t.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public void m30023P(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f12167a.setAccessibilityFocused(z);
        }
    }

    public final void m30022Q(int i, boolean z) {
        Bundle p = m29982p();
        if (p != null) {
            int i2 = p.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            p.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    public void m30021R(Rect rect) {
        this.f12167a.setBoundsInParent(rect);
    }

    public void m30020S(Rect rect) {
        this.f12167a.setBoundsInScreen(rect);
    }

    public void m30019T(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f12167a.setCanOpenPopup(z);
        }
    }

    public void m30018U(CharSequence charSequence) {
        this.f12167a.setClassName(charSequence);
    }

    public void m30017V(boolean z) {
        this.f12167a.setClickable(z);
    }

    public void m30016W(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f12167a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C3572b) obj).f12213a);
        }
    }

    public void m30015X(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f12167a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C3573c) obj).f12214a);
        }
    }

    public void m30014Y(CharSequence charSequence) {
        this.f12167a.setContentDescription(charSequence);
    }

    public void m30013Z(boolean z) {
        this.f12167a.setEnabled(z);
    }

    public void m30012a(int i) {
        this.f12167a.addAction(i);
    }

    public void m30011a0(boolean z) {
        this.f12167a.setFocusable(z);
    }

    public void m30010b(C3571a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f12167a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f12209a);
        }
    }

    public void m30009b0(boolean z) {
        this.f12167a.setFocused(z);
    }

    public void m30008c(View view) {
        this.f12167a.addChild(view);
    }

    public void m30007c0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12167a.setHeading(z);
        } else {
            m30022Q(2, z);
        }
    }

    public final void m30006d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public void m30005d0(boolean z) {
        this.f12167a.setLongClickable(z);
    }

    public void m30004e(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m30002f();
            m30024O(view);
            ClickableSpan[] n = m29986n(charSequence);
            if (n != null && n.length > 0) {
                m29982p().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C7524c.a_res_0x7f070006);
                SparseArray<WeakReference<ClickableSpan>> r = m29979r(view);
                for (int i2 = 0; i2 < n.length; i2++) {
                    int x = m29973x(n[i2], r);
                    r.put(x, new WeakReference<>(n[i2]));
                    m30006d(n[i2], (Spanned) charSequence, x);
                }
            }
        }
    }

    public void m30003e0(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f12167a.setMovementGranularities(i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3570c)) {
            return false;
        }
        C3570c cVar = (C3570c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f12167a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f12167a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f12167a)) {
            return false;
        }
        return this.f12169c == cVar.f12169c && this.f12168b == cVar.f12168b;
    }

    public final void m30002f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f12167a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f12167a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f12167a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f12167a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    public void m30001f0(CharSequence charSequence) {
        this.f12167a.setPackageName(charSequence);
    }

    public final List<Integer> m30000g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f12167a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f12167a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void m29999g0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f12167a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f12167a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public List<C3571a> m29998h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f12167a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3571a(actionList.get(i)));
        }
        return arrayList;
    }

    public void m29997h0(View view) {
        this.f12168b = -1;
        this.f12167a.setParent(view);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f12167a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void m29995i0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12167a.setScreenReaderFocusable(z);
        } else {
            m30022Q(1, z);
        }
    }

    public int m29994j() {
        return this.f12167a.getActions();
    }

    public void m29993j0(boolean z) {
        this.f12167a.setScrollable(z);
    }

    @Deprecated
    public void m29992k(Rect rect) {
        this.f12167a.getBoundsInParent(rect);
    }

    public void m29991k0(boolean z) {
        this.f12167a.setSelected(z);
    }

    public void m29990l(Rect rect) {
        this.f12167a.getBoundsInScreen(rect);
    }

    public void m29989l0(View view) {
        this.f12169c = -1;
        this.f12167a.setSource(view);
    }

    public CharSequence m29988m() {
        return this.f12167a.getClassName();
    }

    public void m29987m0(CharSequence charSequence) {
        if (C10326a.m5419b()) {
            this.f12167a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f12167a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void m29985n0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f12167a.setVisibleToUser(z);
        }
    }

    public CharSequence m29984o() {
        return this.f12167a.getContentDescription();
    }

    public AccessibilityNodeInfo m29983o0() {
        return this.f12167a;
    }

    public Bundle m29982p() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f12167a.getExtras();
        }
        return new Bundle();
    }

    public int m29980q() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f12167a.getMovementGranularities();
        }
        return 0;
    }

    public final SparseArray<WeakReference<ClickableSpan>> m29979r(View view) {
        SparseArray<WeakReference<ClickableSpan>> t = m29977t(view);
        if (t != null) {
            return t;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C7524c.I_res_0x7f0704ea, sparseArray);
        return sparseArray;
    }

    public CharSequence m29978s() {
        return this.f12167a.getPackageName();
    }

    public final SparseArray<WeakReference<ClickableSpan>> m29977t(View view) {
        return (SparseArray) view.getTag(C7524c.I_res_0x7f0704ea);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m29992k(rect);
        sb2.append("; boundsInParent: " + rect);
        m29990l(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m29978s());
        sb2.append("; className: ");
        sb2.append(m29988m());
        sb2.append("; text: ");
        sb2.append(m29976u());
        sb2.append("; contentDescription: ");
        sb2.append(m29984o());
        sb2.append("; viewId: ");
        sb2.append(m29975v());
        sb2.append("; checkable: ");
        sb2.append(m29971z());
        sb2.append("; checked: ");
        sb2.append(m30038A());
        sb2.append("; focusable: ");
        sb2.append(m30035D());
        sb2.append("; focused: ");
        sb2.append(m30034E());
        sb2.append("; selected: ");
        sb2.append(m30030I());
        sb2.append("; clickable: ");
        sb2.append(m30037B());
        sb2.append("; longClickable: ");
        sb2.append(m30033F());
        sb2.append("; enabled: ");
        sb2.append(m30036C());
        sb2.append("; password: ");
        sb2.append(m30032G());
        sb2.append("; scrollable: " + m30031H());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C3571a> h = m29998h();
            for (int i = 0; i < h.size(); i++) {
                C3571a aVar = h.get(i);
                String i2 = m29996i(aVar.m29970a());
                if (i2.equals("ACTION_UNKNOWN") && aVar.m29969b() != null) {
                    i2 = aVar.m29969b().toString();
                }
                sb2.append(i2);
                if (i != h.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int j = m29994j();
            while (j != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j);
                j &= ~numberOfTrailingZeros;
                sb2.append(m29996i(numberOfTrailingZeros));
                if (j != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence m29976u() {
        if (!m29974w()) {
            return this.f12167a.getText();
        }
        List<Integer> g = m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> g2 = m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> g3 = m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> g4 = m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f12167a.getText(), 0, this.f12167a.getText().length()));
        for (int i = 0; i < g.size(); i++) {
            spannableString.setSpan(new C3568a(g4.get(i).intValue(), this, m29982p().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g.get(i).intValue(), g2.get(i).intValue(), g3.get(i).intValue());
        }
        return spannableString;
    }

    public String m29975v() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f12167a.getViewIdResourceName();
        }
        return null;
    }

    public final boolean m29974w() {
        return !m30000g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public final int m29973x(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f12166d;
        f12166d = i2 + 1;
        return i2;
    }

    public boolean m29972y() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f12167a.isAccessibilityFocused();
        }
        return false;
    }

    public boolean m29971z() {
        return this.f12167a.isCheckable();
    }
}
