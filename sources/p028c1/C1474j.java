package p028c1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p294v0.AbstractMenuItemC9830b;

public final class C1474j {
    public static MenuItem m36821a(MenuItem menuItem, AbstractC1435b bVar) {
        if (menuItem instanceof AbstractMenuItemC9830b) {
            return ((AbstractMenuItemC9830b) menuItem).mo6784a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void m36820b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC9830b) {
            ((AbstractMenuItemC9830b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static void m36819c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC9830b) {
            ((AbstractMenuItemC9830b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void m36818d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof AbstractMenuItemC9830b) {
            ((AbstractMenuItemC9830b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void m36817e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof AbstractMenuItemC9830b) {
            ((AbstractMenuItemC9830b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void m36816f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC9830b) {
            ((AbstractMenuItemC9830b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void m36815g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC9830b) {
            ((AbstractMenuItemC9830b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
