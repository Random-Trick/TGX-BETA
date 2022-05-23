package j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {
    public Object f14919a;
    public boolean f14920b;

    public interface a {
        boolean a(b bVar, Menu menu);

        void b(b bVar);

        boolean c(b bVar, MenuItem menuItem);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f14919a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f14920b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f14919a = obj;
    }

    public abstract void q(int i10);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z10) {
        this.f14920b = z10;
    }
}
