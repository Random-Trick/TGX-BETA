package p028c1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class C1473i {
    public final Runnable f5342a;
    public final CopyOnWriteArrayList<AbstractC1475k> f5343b = new CopyOnWriteArrayList<>();
    public final Map<AbstractC1475k, Object> f5344c = new HashMap();

    public C1473i(Runnable runnable) {
        this.f5342a = runnable;
    }

    public void m36823a(Menu menu, MenuInflater menuInflater) {
        Iterator<AbstractC1475k> it = this.f5343b.iterator();
        while (it.hasNext()) {
            it.next().m36813b(menu, menuInflater);
        }
    }

    public boolean m36822b(MenuItem menuItem) {
        Iterator<AbstractC1475k> it = this.f5343b.iterator();
        while (it.hasNext()) {
            if (it.next().m36814a(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
