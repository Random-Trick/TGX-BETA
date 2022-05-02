package p127j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class AbstractC5814b {
    public Object f18533a;
    public boolean f18534b;

    public interface AbstractC5815a {
        boolean mo22089a(AbstractC5814b bVar, Menu menu);

        void mo22088b(AbstractC5814b bVar);

        boolean mo22087c(AbstractC5814b bVar, MenuItem menuItem);

        boolean mo22086d(AbstractC5814b bVar, Menu menu);
    }

    public abstract void mo22103c();

    public abstract View mo22102d();

    public abstract Menu mo22101e();

    public abstract MenuInflater mo22100f();

    public abstract CharSequence mo22099g();

    public Object m22112h() {
        return this.f18533a;
    }

    public abstract CharSequence mo22098i();

    public boolean m22111j() {
        return this.f18534b;
    }

    public abstract void mo22097k();

    public abstract boolean mo22096l();

    public abstract void mo22095m(View view);

    public abstract void mo22094n(int i);

    public abstract void mo22093o(CharSequence charSequence);

    public void m22110p(Object obj) {
        this.f18533a = obj;
    }

    public abstract void mo22092q(int i);

    public abstract void mo22091r(CharSequence charSequence);

    public void mo22090s(boolean z) {
        this.f18534b = z;
    }
}
