package v0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
    b a(c1.b bVar);

    c1.b b();

    @Override
    boolean collapseActionView();

    @Override
    boolean expandActionView();

    @Override
    View getActionView();

    @Override
    int getAlphabeticModifiers();

    @Override
    CharSequence getContentDescription();

    @Override
    ColorStateList getIconTintList();

    @Override
    PorterDuff.Mode getIconTintMode();

    @Override
    int getNumericModifiers();

    @Override
    CharSequence getTooltipText();

    @Override
    boolean isActionViewExpanded();

    @Override
    MenuItem setActionView(int i10);

    @Override
    MenuItem setActionView(View view);

    @Override
    MenuItem setAlphabeticShortcut(char c10, int i10);

    @Override
    b setContentDescription(CharSequence charSequence);

    @Override
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override
    MenuItem setNumericShortcut(char c10, int i10);

    @Override
    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    @Override
    void setShowAsAction(int i10);

    @Override
    MenuItem setShowAsActionFlags(int i10);

    @Override
    b setTooltipText(CharSequence charSequence);
}
