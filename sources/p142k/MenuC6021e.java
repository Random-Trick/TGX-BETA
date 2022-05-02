package p142k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p294v0.AbstractMenuC9829a;

public class MenuC6021e extends AbstractC6013b implements Menu {
    public final AbstractMenuC9829a f19167d;

    public MenuC6021e(Context context, AbstractMenuC9829a aVar) {
        super(context);
        if (aVar != null) {
            this.f19167d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public MenuItem add(CharSequence charSequence) {
        return m21569c(this.f19167d.add(charSequence));
    }

    @Override
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f19167d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m21569c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m21568d(this.f19167d.addSubMenu(charSequence));
    }

    @Override
    public void clear() {
        m21567e();
        this.f19167d.clear();
    }

    @Override
    public void close() {
        this.f19167d.close();
    }

    @Override
    public MenuItem findItem(int i) {
        return m21569c(this.f19167d.findItem(i));
    }

    @Override
    public MenuItem getItem(int i) {
        return m21569c(this.f19167d.getItem(i));
    }

    @Override
    public boolean hasVisibleItems() {
        return this.f19167d.hasVisibleItems();
    }

    @Override
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f19167d.isShortcutKey(i, keyEvent);
    }

    @Override
    public boolean performIdentifierAction(int i, int i2) {
        return this.f19167d.performIdentifierAction(i, i2);
    }

    @Override
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f19167d.performShortcut(i, keyEvent, i2);
    }

    @Override
    public void removeGroup(int i) {
        m21566f(i);
        this.f19167d.removeGroup(i);
    }

    @Override
    public void removeItem(int i) {
        m21565g(i);
        this.f19167d.removeItem(i);
    }

    @Override
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f19167d.setGroupCheckable(i, z, z2);
    }

    @Override
    public void setGroupEnabled(int i, boolean z) {
        this.f19167d.setGroupEnabled(i, z);
    }

    @Override
    public void setGroupVisible(int i, boolean z) {
        this.f19167d.setGroupVisible(i, z);
    }

    @Override
    public void setQwertyMode(boolean z) {
        this.f19167d.setQwertyMode(z);
    }

    @Override
    public int size() {
        return this.f19167d.size();
    }

    @Override
    public MenuItem add(int i) {
        return m21569c(this.f19167d.add(i));
    }

    @Override
    public SubMenu addSubMenu(int i) {
        return m21568d(this.f19167d.addSubMenu(i));
    }

    @Override
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m21569c(this.f19167d.add(i, i2, i3, charSequence));
    }

    @Override
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m21568d(this.f19167d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m21569c(this.f19167d.add(i, i2, i3, i4));
    }

    @Override
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m21568d(this.f19167d.addSubMenu(i, i2, i3, i4));
    }
}
