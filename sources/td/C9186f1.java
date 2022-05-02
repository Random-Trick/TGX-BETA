package td;

import android.view.View;
import android.widget.TextView;
import be.C1399s0;
import java.lang.ref.WeakReference;
import p082fd.C4403w;

public class C9186f1 {
    public final int f29650a;
    public final int f29651b;
    public final boolean f29652c;
    public final WeakReference<Object> f29653d;
    public AbstractC9187a f29654e;

    public interface AbstractC9187a {
        void mo8240a(int i);

        int mo8239b();
    }

    public C9186f1(int i, TextView textView, boolean z, boolean z2) {
        this.f29650a = z ? 6 : 5;
        this.f29652c = z2;
        this.f29651b = i;
        this.f29653d = new WeakReference<>(textView);
    }

    public int m10013a() {
        if (this.f29650a != 100) {
            return this.f29651b;
        }
        AbstractC9187a aVar = this.f29654e;
        if (aVar != null) {
            return aVar.mo8239b();
        }
        return 0;
    }

    public final void m10012b() {
        AbstractC9187a aVar;
        Object obj = this.f29653d.get();
        if (obj == null) {
            this.f29654e = null;
            return;
        }
        int i = this.f29650a;
        if (i != 5) {
            if (i == 6) {
                ((TextView) obj).setHint(C4403w.m27871i1(this.f29651b));
            } else if (i == 100 && (aVar = this.f29654e) != null) {
                aVar.mo8240a(this.f29651b);
            }
        } else if (this.f29652c) {
            C1399s0.m37178j0((TextView) obj, C4403w.m27871i1(this.f29651b));
        } else {
            ((TextView) obj).setText(C4403w.m27871i1(this.f29651b));
        }
    }

    public C9186f1(View view, AbstractC9187a aVar) {
        this.f29650a = 100;
        this.f29651b = 0;
        this.f29653d = new WeakReference<>(view);
        this.f29654e = aVar;
        this.f29652c = false;
    }
}
