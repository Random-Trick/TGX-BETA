package c1;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {
    public final Context f4235a;
    public a f4236b;
    public AbstractC0062b f4237c;

    public interface a {
        void a(boolean z10);
    }

    public interface AbstractC0062b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f4235a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f4237c = null;
        this.f4236b = null;
    }

    public void i(a aVar) {
        this.f4236b = aVar;
    }

    public void j(AbstractC0062b bVar) {
        if (!(this.f4237c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f4237c = bVar;
    }

    public void k(boolean z10) {
        a aVar = this.f4236b;
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
