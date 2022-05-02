package p028c1;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p041d1.C3570c;
import p041d1.C3574d;
import p196o0.C7524c;

public class C1432a {
    public static final View.AccessibilityDelegate f5256c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate f5257a;
    public final View.AccessibilityDelegate f5258b;

    public static final class C1433a extends View.AccessibilityDelegate {
        public final C1432a f5259a;

        public C1433a(C1432a aVar) {
            this.f5259a = aVar;
        }

        @Override
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5259a.mo36946a(view, accessibilityEvent);
        }

        @Override
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3574d b = this.f5259a.mo36945b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.m29965a();
            }
            return null;
        }

        @Override
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5259a.mo36941f(view, accessibilityEvent);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3570c p0 = C3570c.m29981p0(accessibilityNodeInfo);
            p0.m29995i0(C1489y.m36757M(view));
            p0.m30007c0(C1489y.m36761I(view));
            p0.m29999g0(C1489y.m36721l(view));
            p0.m29987m0(C1489y.m36769A(view));
            this.f5259a.mo36940g(view, p0);
            p0.m30004e(accessibilityNodeInfo.getText(), view);
            List<C3570c.C3571a> c = C1432a.m36944c(view);
            for (int i = 0; i < c.size(); i++) {
                p0.m30010b(c.get(i));
            }
        }

        @Override
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5259a.mo36939h(view, accessibilityEvent);
        }

        @Override
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5259a.mo36938i(viewGroup, view, accessibilityEvent);
        }

        @Override
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f5259a.mo36937j(view, i, bundle);
        }

        @Override
        public void sendAccessibilityEvent(View view, int i) {
            this.f5259a.mo36935l(view, i);
        }

        @Override
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5259a.mo36934m(view, accessibilityEvent);
        }
    }

    public C1432a() {
        this(f5256c);
    }

    public static List<C3570c.C3571a> m36944c(View view) {
        List<C3570c.C3571a> list = (List) view.getTag(C7524c.H_res_0x7f0704e9);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean mo36946a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5257a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C3574d mo36945b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f5257a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C3574d(accessibilityNodeProvider);
    }

    public View.AccessibilityDelegate m36943d() {
        return this.f5258b;
    }

    public final boolean m36942e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] n = C3570c.m29986n(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; n != null && i < n.length; i++) {
                if (clickableSpan.equals(n[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void mo36941f(View view, AccessibilityEvent accessibilityEvent) {
        this.f5257a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void mo36940g(View view, C3570c cVar) {
        this.f5257a.onInitializeAccessibilityNodeInfo(view, cVar.m29983o0());
    }

    public void mo36939h(View view, AccessibilityEvent accessibilityEvent) {
        this.f5257a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean mo36938i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5257a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean mo36937j(View view, int i, Bundle bundle) {
        List<C3570c.C3571a> c = m36944c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C3570c.C3571a aVar = c.get(i2);
            if (aVar.m29970a() == i) {
                z = aVar.m29968c(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f5257a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C7524c.a_res_0x7f070006) ? z : m36936k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean m36936k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C7524c.I_res_0x7f0704ea);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m36942e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void mo36935l(View view, int i) {
        this.f5257a.sendAccessibilityEvent(view, i);
    }

    public void mo36934m(View view, AccessibilityEvent accessibilityEvent) {
        this.f5257a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1432a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5257a = accessibilityDelegate;
        this.f5258b = new C1433a(this);
    }
}
