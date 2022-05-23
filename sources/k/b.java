package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import k0.a;
import v0.c;

public abstract class b {
    public final Context f15545a;
    public Map<v0.b, MenuItem> f15546b;
    public Map<c, SubMenu> f15547c;

    public b(Context context) {
        this.f15545a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof v0.b)) {
            return menuItem;
        }
        v0.b bVar = (v0.b) menuItem;
        if (this.f15546b == null) {
            this.f15546b = new a();
        }
        MenuItem menuItem2 = this.f15546b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f15545a, bVar);
        this.f15546b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f15547c == null) {
            this.f15547c = new a();
        }
        SubMenu subMenu2 = this.f15547c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f15545a, cVar);
        this.f15547c.put(cVar, gVar);
        return gVar;
    }

    public final void e() {
        Map<v0.b, MenuItem> map = this.f15546b;
        if (map != null) {
            map.clear();
        }
        Map<c, SubMenu> map2 = this.f15547c;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void f(int i10) {
        Map<v0.b, MenuItem> map = this.f15546b;
        if (map != null) {
            Iterator<v0.b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i10 == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    public final void g(int i10) {
        Map<v0.b, MenuItem> map = this.f15546b;
        if (map != null) {
            Iterator<v0.b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i10 == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
