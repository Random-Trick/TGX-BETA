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
        void mo36928a(boolean z);
    }

    public interface AbstractC1437b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC1435b(Context context) {
        this.f5261a = context;
    }

    public boolean mo21564a() {
        return false;
    }

    public boolean mo21560b() {
        return true;
    }

    public abstract View mo21563c();

    public View mo21559d(MenuItem menuItem) {
        return mo21563c();
    }

    public boolean mo21562e() {
        return false;
    }

    public void mo21561f(SubMenu subMenu) {
    }

    public boolean mo21558g() {
        return false;
    }

    public void m36931h() {
        this.f5263c = null;
        this.f5262b = null;
    }

    public void m36930i(AbstractC1436a aVar) {
        this.f5262b = aVar;
    }

    public void mo21557j(AbstractC1437b bVar) {
        if (!(this.f5263c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f5263c = bVar;
    }

    public void m36929k(boolean z) {
        AbstractC1436a aVar = this.f5262b;
        if (aVar != null) {
            aVar.mo36928a(z);
        }
    }
}
