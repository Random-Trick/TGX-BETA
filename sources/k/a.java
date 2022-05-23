package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import org.thunderdog.challegram.Log;
import v0.b;

public class a implements b {
    public final int f15523a;
    public final int f15524b;
    public final int f15525c;
    public final int f15526d;
    public CharSequence f15527e;
    public CharSequence f15528f;
    public Intent f15529g;
    public char f15530h;
    public char f15532j;
    public Drawable f15534l;
    public Context f15536n;
    public MenuItem.OnMenuItemClickListener f15537o;
    public CharSequence f15538p;
    public CharSequence f15539q;
    public int f15531i = Log.TAG_EMOJI;
    public int f15533k = Log.TAG_EMOJI;
    public int f15535m = 0;
    public ColorStateList f15540r = null;
    public PorterDuff.Mode f15541s = null;
    public boolean f15542t = false;
    public boolean f15543u = false;
    public int f15544v = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f15536n = context;
        this.f15523a = i11;
        this.f15524b = i10;
        this.f15525c = i12;
        this.f15526d = i13;
        this.f15527e = charSequence;
    }

    @Override
    public b a(c1.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public c1.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f15534l;
        if (drawable == null) {
            return;
        }
        if (this.f15542t || this.f15543u) {
            Drawable q10 = u0.a.q(drawable);
            this.f15534l = q10;
            Drawable mutate = q10.mutate();
            this.f15534l = mutate;
            if (this.f15542t) {
                u0.a.n(mutate, this.f15540r);
            }
            if (this.f15543u) {
                u0.a.o(this.f15534l, this.f15541s);
            }
        }
    }

    @Override
    public boolean collapseActionView() {
        return false;
    }

    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean expandActionView() {
        return false;
    }

    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public View getActionView() {
        return null;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.f15533k;
    }

    @Override
    public char getAlphabeticShortcut() {
        return this.f15532j;
    }

    @Override
    public CharSequence getContentDescription() {
        return this.f15538p;
    }

    @Override
    public int getGroupId() {
        return this.f15524b;
    }

    @Override
    public Drawable getIcon() {
        return this.f15534l;
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.f15540r;
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.f15541s;
    }

    @Override
    public Intent getIntent() {
        return this.f15529g;
    }

    @Override
    public int getItemId() {
        return this.f15523a;
    }

    @Override
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public int getNumericModifiers() {
        return this.f15531i;
    }

    @Override
    public char getNumericShortcut() {
        return this.f15530h;
    }

    @Override
    public int getOrder() {
        return this.f15526d;
    }

    @Override
    public SubMenu getSubMenu() {
        return null;
    }

    @Override
    public CharSequence getTitle() {
        return this.f15527e;
    }

    @Override
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f15528f;
        return charSequence != null ? charSequence : this.f15527e;
    }

    @Override
    public CharSequence getTooltipText() {
        return this.f15539q;
    }

    @Override
    public boolean hasSubMenu() {
        return false;
    }

    @Override
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override
    public boolean isCheckable() {
        return (this.f15544v & 1) != 0;
    }

    @Override
    public boolean isChecked() {
        return (this.f15544v & 2) != 0;
    }

    @Override
    public boolean isEnabled() {
        return (this.f15544v & 16) != 0;
    }

    @Override
    public boolean isVisible() {
        return (this.f15544v & 8) == 0;
    }

    @Override
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f15532j = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public MenuItem setCheckable(boolean z10) {
        this.f15544v = (z10 ? 1 : 0) | (this.f15544v & (-2));
        return this;
    }

    @Override
    public MenuItem setChecked(boolean z10) {
        this.f15544v = (z10 ? 2 : 0) | (this.f15544v & (-3));
        return this;
    }

    @Override
    public MenuItem setEnabled(boolean z10) {
        this.f15544v = (z10 ? 16 : 0) | (this.f15544v & (-17));
        return this;
    }

    @Override
    public MenuItem setIcon(Drawable drawable) {
        this.f15534l = drawable;
        this.f15535m = 0;
        c();
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15540r = colorStateList;
        this.f15542t = true;
        c();
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15541s = mode;
        this.f15543u = true;
        c();
        return this;
    }

    @Override
    public MenuItem setIntent(Intent intent) {
        this.f15529g = intent;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c10) {
        this.f15530h = c10;
        return this;
    }

    @Override
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15537o = onMenuItemClickListener;
        return this;
    }

    @Override
    public MenuItem setShortcut(char c10, char c11) {
        this.f15530h = c10;
        this.f15532j = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public void setShowAsAction(int i10) {
    }

    @Override
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15527e = charSequence;
        return this;
    }

    @Override
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15528f = charSequence;
        return this;
    }

    @Override
    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f15544v & 8;
        if (z10) {
            i10 = 0;
        }
        this.f15544v = i11 | i10;
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15532j = Character.toLowerCase(c10);
        this.f15533k = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public b setContentDescription(CharSequence charSequence) {
        this.f15538p = charSequence;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f15530h = c10;
        this.f15531i = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public MenuItem setTitle(int i10) {
        this.f15527e = this.f15536n.getResources().getString(i10);
        return this;
    }

    @Override
    public b setTooltipText(CharSequence charSequence) {
        this.f15539q = charSequence;
        return this;
    }

    @Override
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15530h = c10;
        this.f15531i = KeyEvent.normalizeMetaState(i10);
        this.f15532j = Character.toLowerCase(c11);
        this.f15533k = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override
    public MenuItem setIcon(int i10) {
        this.f15535m = i10;
        this.f15534l = q0.a.d(this.f15536n, i10);
        c();
        return this;
    }
}
