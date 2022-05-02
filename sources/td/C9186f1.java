package td;

import android.view.View;
import android.widget.TextView;
import be.C1399s0;
import java.lang.ref.WeakReference;
import p082fd.C4403w;

public class C9186f1 {
    public final int f29647a;
    public final int f29648b;
    public final boolean f29649c;
    public final WeakReference<Object> f29650d;
    public AbstractC9187a f29651e;

    public interface AbstractC9187a {
        void mo8240a(int i);

        int mo8239b();
    }

    public C9186f1(int i, TextView textView, boolean z, boolean z2) {
        this.f29647a = z ? 6 : 5;
        this.f29649c = z2;
        this.f29648b = i;
        this.f29650d = new WeakReference<>(textView);
    }

    public int m10014a() {
        if (this.f29647a != 100) {
            return this.f29648b;
        }
        AbstractC9187a aVar = this.f29651e;
        if (aVar != null) {
            return aVar.mo8239b();
        }
        return 0;
    }

    public final void m10013b() {
        AbstractC9187a aVar;
        Object obj = this.f29650d.get();
        if (obj == null) {
            this.f29651e = null;
            return;
        }
        int i = this.f29647a;
        if (i != 5) {
            if (i == 6) {
                ((TextView) obj).setHint(C4403w.m27869i1(this.f29648b));
            } else if (i == 100 && (aVar = this.f29651e) != null) {
                aVar.mo8240a(this.f29648b);
            }
        } else if (this.f29649c) {
            C1399s0.m37175j0((TextView) obj, C4403w.m27869i1(this.f29648b));
        } else {
            ((TextView) obj).setText(C4403w.m27869i1(this.f29648b));
        }
    }

    public C9186f1(View view, AbstractC9187a aVar) {
        this.f29647a = 100;
        this.f29648b = 0;
        this.f29650d = new WeakReference<>(view);
        this.f29651e = aVar;
        this.f29649c = false;
    }
}
