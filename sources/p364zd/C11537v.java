package p364zd;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.R;

public class C11537v {
    public final ArrayList<C11536u> f36981a = new ArrayList<>();

    public void m79a(C11536u uVar) {
        this.f36981a.add(uVar);
    }

    public void m78b(C11537v vVar) {
        if (vVar != null && !vVar.f36981a.isEmpty()) {
            this.f36981a.addAll(vVar.f36981a);
        }
    }

    public final C11536u m77c(Object obj, int i) {
        C11536u uVar = new C11536u(2, i, obj);
        m72h(uVar);
        return uVar;
    }

    public final void m76d(Object obj, int i, int i2) {
        m72h(new C11536u(8, i, obj).m84f(i2));
    }

    public final void m75e(Object obj, int i) {
        m72h(new C11536u(6, i, obj));
    }

    public final void m74f(View view) {
        m72h(new C11536u(0, 0, view));
    }

    public final C11536u m73g(Object obj, int i, int i2) {
        C11536u uVar = new C11536u(i2, i, obj);
        m72h(uVar);
        return uVar;
    }

    public final void m72h(C11536u uVar) {
        this.f36981a.add(uVar);
    }

    public final void m71i(Object obj, int i) {
        m72h(new C11536u(7, i, obj));
    }

    public final void m70j(Object obj) {
        m72h(new C11536u(2, R.id.theme_color_text, obj));
    }

    public final void m69k(Object obj) {
        m72h(new C11536u(2, R.id.theme_color_textLight, obj));
    }

    public C11536u m68l(Object obj, int i) {
        Iterator<C11536u> it = this.f36981a.iterator();
        while (it.hasNext()) {
            C11536u next = it.next();
            if (next.m80j(obj, i)) {
                return next;
            }
        }
        return null;
    }

    public ArrayList<C11536u> m67m() {
        return this.f36981a;
    }

    public final void m66n(boolean z) {
        for (int size = this.f36981a.size() - 1; size >= 0; size--) {
            if (!this.f36981a.get(size).m89a(z)) {
                this.f36981a.remove(size);
            }
        }
    }

    public final void m65o(Object obj) {
        if (!this.f36981a.isEmpty()) {
            for (int size = this.f36981a.size() - 1; size >= 0; size--) {
                C11536u uVar = this.f36981a.get(size);
                if (uVar.m86d() || uVar.m81i(obj)) {
                    this.f36981a.remove(size);
                }
            }
        }
    }
}
