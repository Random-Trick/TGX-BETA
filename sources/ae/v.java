package ae;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.R;

public class v {
    public final ArrayList<u> f1064a = new ArrayList<>();

    public void a(u uVar) {
        this.f1064a.add(uVar);
    }

    public void b(v vVar) {
        if (vVar != null && !vVar.f1064a.isEmpty()) {
            this.f1064a.addAll(vVar.f1064a);
        }
    }

    public final u c(Object obj, int i10) {
        u uVar = new u(2, i10, obj);
        h(uVar);
        return uVar;
    }

    public final void d(Object obj, int i10, int i11) {
        h(new u(8, i10, obj).f(i11));
    }

    public final void e(Object obj, int i10) {
        h(new u(6, i10, obj));
    }

    public final void f(View view) {
        h(new u(0, 0, view));
    }

    public final u g(Object obj, int i10, int i11) {
        u uVar = new u(i11, i10, obj);
        h(uVar);
        return uVar;
    }

    public final void h(u uVar) {
        this.f1064a.add(uVar);
    }

    public final void i(Object obj, int i10) {
        h(new u(7, i10, obj));
    }

    public final void j(Object obj) {
        h(new u(2, R.id.theme_color_text, obj));
    }

    public final void k(Object obj) {
        h(new u(2, R.id.theme_color_textLight, obj));
    }

    public u l(Object obj, int i10) {
        Iterator<u> it = this.f1064a.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next.j(obj, i10)) {
                return next;
            }
        }
        return null;
    }

    public ArrayList<u> m() {
        return this.f1064a;
    }

    public final void n(boolean z10) {
        for (int size = this.f1064a.size() - 1; size >= 0; size--) {
            if (!this.f1064a.get(size).a(z10)) {
                this.f1064a.remove(size);
            }
        }
    }

    public final void o(Object obj) {
        if (!this.f1064a.isEmpty()) {
            for (int size = this.f1064a.size() - 1; size >= 0; size--) {
                u uVar = this.f1064a.get(size);
                if (uVar.d() || uVar.i(obj)) {
                    this.f1064a.remove(size);
                }
            }
        }
    }
}
