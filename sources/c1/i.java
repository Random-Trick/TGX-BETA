package c1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class i {
    public final Runnable f4278a;
    public final CopyOnWriteArrayList<k> f4279b = new CopyOnWriteArrayList<>();
    public final Map<k, Object> f4280c = new HashMap();

    public i(Runnable runnable) {
        this.f4278a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator<k> it = this.f4279b.iterator();
        while (it.hasNext()) {
            it.next().b(menu, menuInflater);
        }
    }

    public boolean b(MenuItem menuItem) {
        Iterator<k> it = this.f4279b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
