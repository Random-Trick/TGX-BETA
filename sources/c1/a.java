package c1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import d1.c;
import d1.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {
    public static final View.AccessibilityDelegate f4221c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate f4222a;
    public final View.AccessibilityDelegate f4223b;

    public static final class C0061a extends View.AccessibilityDelegate {
        public final a f4224a;

        public C0061a(a aVar) {
            this.f4224a = aVar;
        }

        @Override
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4224a.a(view, accessibilityEvent);
        }

        @Override
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d b10 = this.f4224a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.a();
            }
            return null;
        }

        @Override
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4224a.f(view, accessibilityEvent);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c p02 = c.p0(accessibilityNodeInfo);
            p02.i0(v.M(view));
            p02.c0(v.I(view));
            p02.g0(v.l(view));
            p02.m0(v.A(view));
            this.f4224a.g(view, p02);
            p02.e(accessibilityNodeInfo.getText(), view);
            List<c.a> c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                p02.b(c10.get(i10));
            }
        }

        @Override
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4224a.h(view, accessibilityEvent);
        }

        @Override
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4224a.i(viewGroup, view, accessibilityEvent);
        }

        @Override
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f4224a.j(view, i10, bundle);
        }

        @Override
        public void sendAccessibilityEvent(View view, int i10) {
            this.f4224a.l(view, i10);
        }

        @Override
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4224a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f4221c);
    }

    public static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(o0.c.H_res_0x7f0704eb);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4222a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4222a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new d(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f4223b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] n10 = c.n(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; n10 != null && i10 < n10.length; i10++) {
                if (clickableSpan.equals(n10[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f4222a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, c cVar) {
        this.f4222a.onInitializeAccessibilityNodeInfo(view, cVar.o0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f4222a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4222a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<c.a> c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            c.a aVar = c10.get(i11);
            if (aVar.a() == i10) {
                z10 = aVar.c(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = this.f4222a.performAccessibilityAction(view, i10, bundle);
        }
        return (z10 || i10 != o0.c.a_res_0x7f070006) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(o0.c.I_res_0x7f0704ec);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i10) {
        this.f4222a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f4222a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4222a = accessibilityDelegate;
        this.f4223b = new C0061a(this);
    }
}
