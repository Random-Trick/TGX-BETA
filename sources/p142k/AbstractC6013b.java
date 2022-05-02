package p142k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p143k0.C6024a;
import p294v0.AbstractMenuItemC9830b;
import p294v0.AbstractSubMenuC9831c;

public abstract class AbstractC6013b {
    public final Context f19152a;
    public Map<AbstractMenuItemC9830b, MenuItem> f19153b;
    public Map<AbstractSubMenuC9831c, SubMenu> f19154c;

    public AbstractC6013b(Context context) {
        this.f19152a = context;
    }

    public final MenuItem m21569c(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC9830b)) {
            return menuItem;
        }
        AbstractMenuItemC9830b bVar = (AbstractMenuItemC9830b) menuItem;
        if (this.f19153b == null) {
            this.f19153b = new C6024a();
        }
        MenuItem menuItem2 = this.f19153b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC6014c cVar = new MenuItemC6014c(this.f19152a, bVar);
        this.f19153b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu m21568d(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC9831c)) {
            return subMenu;
        }
        AbstractSubMenuC9831c cVar = (AbstractSubMenuC9831c) subMenu;
        if (this.f19154c == null) {
            this.f19154c = new C6024a();
        }
        SubMenu subMenu2 = this.f19154c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC6023g gVar = new SubMenuC6023g(this.f19152a, cVar);
        this.f19154c.put(cVar, gVar);
        return gVar;
    }

    public final void m21567e() {
        Map<AbstractMenuItemC9830b, MenuItem> map = this.f19153b;
        if (map != null) {
            map.clear();
        }
        Map<AbstractSubMenuC9831c, SubMenu> map2 = this.f19154c;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void m21566f(int i) {
        Map<AbstractMenuItemC9830b, MenuItem> map = this.f19153b;
        if (map != null) {
            Iterator<AbstractMenuItemC9830b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    public final void m21565g(int i) {
        Map<AbstractMenuItemC9830b, MenuItem> map = this.f19153b;
        if (map != null) {
            Iterator<AbstractMenuItemC9830b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
