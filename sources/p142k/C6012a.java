package p142k;

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
import p028c1.AbstractC1435b;
import p227q0.C8117a;
import p280u0.C9411a;
import p294v0.AbstractMenuItemC9830b;

public class C6012a implements AbstractMenuItemC9830b {
    public final int f19130a;
    public final int f19131b;
    public final int f19132c;
    public final int f19133d;
    public CharSequence f19134e;
    public CharSequence f19135f;
    public Intent f19136g;
    public char f19137h;
    public char f19139j;
    public Drawable f19141l;
    public Context f19143n;
    public MenuItem.OnMenuItemClickListener f19144o;
    public CharSequence f19145p;
    public CharSequence f19146q;
    public int f19138i = Log.TAG_EMOJI;
    public int f19140k = Log.TAG_EMOJI;
    public int f19142m = 0;
    public ColorStateList f19147r = null;
    public PorterDuff.Mode f19148s = null;
    public boolean f19149t = false;
    public boolean f19150u = false;
    public int f19151v = 16;

    public C6012a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f19143n = context;
        this.f19130a = i2;
        this.f19131b = i;
        this.f19132c = i3;
        this.f19133d = i4;
        this.f19134e = charSequence;
    }

    @Override
    public AbstractMenuItemC9830b mo6784a(AbstractC1435b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractC1435b mo6783b() {
        return null;
    }

    public final void m21573c() {
        Drawable drawable = this.f19141l;
        if (drawable == null) {
            return;
        }
        if (this.f19149t || this.f19150u) {
            Drawable q = C9411a.m8751q(drawable);
            this.f19141l = q;
            Drawable mutate = q.mutate();
            this.f19141l = mutate;
            if (this.f19149t) {
                C9411a.m8754n(mutate, this.f19147r);
            }
            if (this.f19150u) {
                C9411a.m8753o(this.f19141l, this.f19148s);
            }
        }
    }

    @Override
    public boolean collapseActionView() {
        return false;
    }

    public AbstractMenuItemC9830b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public AbstractMenuItemC9830b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean expandActionView() {
        return false;
    }

    public AbstractMenuItemC9830b setShowAsActionFlags(int i) {
        setShowAsAction(i);
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
        return this.f19140k;
    }

    @Override
    public char getAlphabeticShortcut() {
        return this.f19139j;
    }

    @Override
    public CharSequence getContentDescription() {
        return this.f19145p;
    }

    @Override
    public int getGroupId() {
        return this.f19131b;
    }

    @Override
    public Drawable getIcon() {
        return this.f19141l;
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.f19147r;
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.f19148s;
    }

    @Override
    public Intent getIntent() {
        return this.f19136g;
    }

    @Override
    public int getItemId() {
        return this.f19130a;
    }

    @Override
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public int getNumericModifiers() {
        return this.f19138i;
    }

    @Override
    public char getNumericShortcut() {
        return this.f19137h;
    }

    @Override
    public int getOrder() {
        return this.f19133d;
    }

    @Override
    public SubMenu getSubMenu() {
        return null;
    }

    @Override
    public CharSequence getTitle() {
        return this.f19134e;
    }

    @Override
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19135f;
        return charSequence != null ? charSequence : this.f19134e;
    }

    @Override
    public CharSequence getTooltipText() {
        return this.f19146q;
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
        return (this.f19151v & 1) != 0;
    }

    @Override
    public boolean isChecked() {
        return (this.f19151v & 2) != 0;
    }

    @Override
    public boolean isEnabled() {
        return (this.f19151v & 16) != 0;
    }

    @Override
    public boolean isVisible() {
        return (this.f19151v & 8) == 0;
    }

    @Override
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c) {
        this.f19139j = Character.toLowerCase(c);
        return this;
    }

    @Override
    public MenuItem setCheckable(boolean z) {
        this.f19151v = (z ? 1 : 0) | (this.f19151v & (-2));
        return this;
    }

    @Override
    public MenuItem setChecked(boolean z) {
        this.f19151v = (z ? 2 : 0) | (this.f19151v & (-3));
        return this;
    }

    @Override
    public MenuItem setEnabled(boolean z) {
        this.f19151v = (z ? 16 : 0) | (this.f19151v & (-17));
        return this;
    }

    @Override
    public MenuItem setIcon(Drawable drawable) {
        this.f19141l = drawable;
        this.f19142m = 0;
        m21573c();
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19147r = colorStateList;
        this.f19149t = true;
        m21573c();
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19148s = mode;
        this.f19150u = true;
        m21573c();
        return this;
    }

    @Override
    public MenuItem setIntent(Intent intent) {
        this.f19136g = intent;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c) {
        this.f19137h = c;
        return this;
    }

    @Override
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19144o = onMenuItemClickListener;
        return this;
    }

    @Override
    public MenuItem setShortcut(char c, char c2) {
        this.f19137h = c;
        this.f19139j = Character.toLowerCase(c2);
        return this;
    }

    @Override
    public void setShowAsAction(int i) {
    }

    @Override
    public MenuItem setTitle(CharSequence charSequence) {
        this.f19134e = charSequence;
        return this;
    }

    @Override
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19135f = charSequence;
        return this;
    }

    @Override
    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f19151v & 8;
        if (z) {
            i = 0;
        }
        this.f19151v = i2 | i;
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f19139j = Character.toLowerCase(c);
        this.f19140k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override
    public AbstractMenuItemC9830b setContentDescription(CharSequence charSequence) {
        this.f19145p = charSequence;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c, int i) {
        this.f19137h = c;
        this.f19138i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override
    public MenuItem setTitle(int i) {
        this.f19134e = this.f19143n.getResources().getString(i);
        return this;
    }

    @Override
    public AbstractMenuItemC9830b setTooltipText(CharSequence charSequence) {
        this.f19146q = charSequence;
        return this;
    }

    @Override
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f19137h = c;
        this.f19138i = KeyEvent.normalizeMetaState(i);
        this.f19139j = Character.toLowerCase(c2);
        this.f19140k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override
    public MenuItem setIcon(int i) {
        this.f19142m = i;
        this.f19141l = C8117a.m13438f(this.f19143n, i);
        m21573c();
        return this;
    }
}
