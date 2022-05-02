package p127j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class AbstractC5814b {
    public Object f18533a;
    public boolean f18534b;

    public interface AbstractC5815a {
        boolean mo22090a(AbstractC5814b bVar, Menu menu);

        void mo22089b(AbstractC5814b bVar);

        boolean mo22088c(AbstractC5814b bVar, MenuItem menuItem);

        boolean mo22087d(AbstractC5814b bVar, Menu menu);
    }

    public abstract void mo22104c();

    public abstract View mo22103d();

    public abstract Menu mo22102e();

    public abstract MenuInflater mo22101f();

    public abstract CharSequence mo22100g();

    public Object m22113h() {
        return this.f18533a;
    }

    public abstract CharSequence mo22099i();

    public boolean m22112j() {
        return this.f18534b;
    }

    public abstract void mo22098k();

    public abstract boolean mo22097l();

    public abstract void mo22096m(View view);

    public abstract void mo22095n(int i);

    public abstract void mo22094o(CharSequence charSequence);

    public void m22111p(Object obj) {
        this.f18533a = obj;
    }

    public abstract void mo22093q(int i);

    public abstract void mo22092r(CharSequence charSequence);

    public void mo22091s(boolean z) {
        this.f18534b = z;
    }
}
