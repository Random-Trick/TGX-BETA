package ud;

import android.view.View;
import android.widget.TextView;
import ce.p0;
import gd.w;
import java.lang.ref.WeakReference;

public class f1 {
    public final int f24144a;
    public final int f24145b;
    public final boolean f24146c;
    public final WeakReference<Object> f24147d;
    public a f24148e;

    public interface a {
        void a(int i10);

        int b();
    }

    public f1(int i10, TextView textView, boolean z10, boolean z11) {
        this.f24144a = z10 ? 6 : 5;
        this.f24146c = z11;
        this.f24145b = i10;
        this.f24147d = new WeakReference<>(textView);
    }

    public int a() {
        if (this.f24144a != 100) {
            return this.f24145b;
        }
        a aVar = this.f24148e;
        if (aVar != null) {
            return aVar.b();
        }
        return 0;
    }

    public final void b() {
        a aVar;
        Object obj = this.f24147d.get();
        if (obj == null) {
            this.f24148e = null;
            return;
        }
        int i10 = this.f24144a;
        if (i10 != 5) {
            if (i10 == 6) {
                ((TextView) obj).setHint(w.i1(this.f24145b));
            } else if (i10 == 100 && (aVar = this.f24148e) != null) {
                aVar.a(this.f24145b);
            }
        } else if (this.f24146c) {
            p0.c0((TextView) obj, w.i1(this.f24145b));
        } else {
            ((TextView) obj).setText(w.i1(this.f24145b));
        }
    }

    public f1(View view, a aVar) {
        this.f24144a = 100;
        this.f24145b = 0;
        this.f24147d = new WeakReference<>(view);
        this.f24148e = aVar;
        this.f24146c = false;
    }
}
