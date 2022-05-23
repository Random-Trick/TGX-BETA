package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import v0.a;

public class e extends b implements Menu {
    public final a f15560d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f15560d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public MenuItem add(CharSequence charSequence) {
        return c(this.f15560d.add(charSequence));
    }

    @Override
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f15560d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f15560d.addSubMenu(charSequence));
    }

    @Override
    public void clear() {
        e();
        this.f15560d.clear();
    }

    @Override
    public void close() {
        this.f15560d.close();
    }

    @Override
    public MenuItem findItem(int i10) {
        return c(this.f15560d.findItem(i10));
    }

    @Override
    public MenuItem getItem(int i10) {
        return c(this.f15560d.getItem(i10));
    }

    @Override
    public boolean hasVisibleItems() {
        return this.f15560d.hasVisibleItems();
    }

    @Override
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f15560d.isShortcutKey(i10, keyEvent);
    }

    @Override
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f15560d.performIdentifierAction(i10, i11);
    }

    @Override
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f15560d.performShortcut(i10, keyEvent, i11);
    }

    @Override
    public void removeGroup(int i10) {
        f(i10);
        this.f15560d.removeGroup(i10);
    }

    @Override
    public void removeItem(int i10) {
        g(i10);
        this.f15560d.removeItem(i10);
    }

    @Override
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f15560d.setGroupCheckable(i10, z10, z11);
    }

    @Override
    public void setGroupEnabled(int i10, boolean z10) {
        this.f15560d.setGroupEnabled(i10, z10);
    }

    @Override
    public void setGroupVisible(int i10, boolean z10) {
        this.f15560d.setGroupVisible(i10, z10);
    }

    @Override
    public void setQwertyMode(boolean z10) {
        this.f15560d.setQwertyMode(z10);
    }

    @Override
    public int size() {
        return this.f15560d.size();
    }

    @Override
    public MenuItem add(int i10) {
        return c(this.f15560d.add(i10));
    }

    @Override
    public SubMenu addSubMenu(int i10) {
        return d(this.f15560d.addSubMenu(i10));
    }

    @Override
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f15560d.add(i10, i11, i12, charSequence));
    }

    @Override
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f15560d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f15560d.add(i10, i11, i12, i13));
    }

    @Override
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f15560d.addSubMenu(i10, i11, i12, i13));
    }
}
