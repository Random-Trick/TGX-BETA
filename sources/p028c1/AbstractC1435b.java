package p028c1;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class AbstractC1435b {
    public final Context f5261a;
    public AbstractC1436a f5262b;
    public AbstractC1437b f5263c;

    public interface AbstractC1436a {
        void mo36925a(boolean z);
    }

    public interface AbstractC1437b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC1435b(Context context) {
        this.f5261a = context;
    }

    public boolean mo21563a() {
        return false;
    }

    public boolean mo21559b() {
        return true;
    }

    public abstract View mo21562c();

    public View mo21558d(MenuItem menuItem) {
        return mo21562c();
    }

    public boolean mo21561e() {
        return false;
    }

    public void mo21560f(SubMenu subMenu) {
    }

    public boolean mo21557g() {
        return false;
    }

    public void m36928h() {
        this.f5263c = null;
        this.f5262b = null;
    }

    public void m36927i(AbstractC1436a aVar) {
        this.f5262b = aVar;
    }

    public void mo21556j(AbstractC1437b bVar) {
        if (!(this.f5263c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f5263c = bVar;
    }

    public void m36926k(boolean z) {
        AbstractC1436a aVar = this.f5262b;
        if (aVar != null) {
            aVar.mo36925a(z);
        }
    }
}
