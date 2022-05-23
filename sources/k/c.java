package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import c1.b;
import java.lang.reflect.Method;

public class c extends k.b implements MenuItem {
    public final v0.b f15548d;
    public Method f15549e;

    public class a extends c1.b {
        public final ActionProvider f15550d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f15550d = actionProvider;
        }

        @Override
        public boolean a() {
            return this.f15550d.hasSubMenu();
        }

        @Override
        public View c() {
            return this.f15550d.onCreateActionView();
        }

        @Override
        public boolean e() {
            return this.f15550d.onPerformDefaultAction();
        }

        @Override
        public void f(SubMenu subMenu) {
            this.f15550d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {
        public b.AbstractC0062b f15552f;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override
        public boolean b() {
            return this.f15550d.isVisible();
        }

        @Override
        public View d(MenuItem menuItem) {
            return this.f15550d.onCreateActionView(menuItem);
        }

        @Override
        public boolean g() {
            return this.f15550d.overridesItemVisibility();
        }

        @Override
        public void j(b.AbstractC0062b bVar) {
            this.f15552f = bVar;
            this.f15550d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override
        public void onActionProviderVisibilityChanged(boolean z10) {
            b.AbstractC0062b bVar = this.f15552f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    public static class C0138c extends FrameLayout implements j.c {
        public final CollapsibleActionView f15554a;

        public C0138c(View view) {
            super(view.getContext());
            this.f15554a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f15554a;
        }

        @Override
        public void c() {
            this.f15554a.onActionViewExpanded();
        }

        @Override
        public void d() {
            this.f15554a.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener f15555a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f15555a = onActionExpandListener;
        }

        @Override
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f15555a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f15555a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener f15557a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f15557a = onMenuItemClickListener;
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f15557a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, v0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f15548d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public boolean collapseActionView() {
        return this.f15548d.collapseActionView();
    }

    @Override
    public boolean expandActionView() {
        return this.f15548d.expandActionView();
    }

    @Override
    public ActionProvider getActionProvider() {
        c1.b b10 = this.f15548d.b();
        if (b10 instanceof a) {
            return ((a) b10).f15550d;
        }
        return null;
    }

    @Override
    public View getActionView() {
        View actionView = this.f15548d.getActionView();
        return actionView instanceof C0138c ? ((C0138c) actionView).a() : actionView;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.f15548d.getAlphabeticModifiers();
    }

    @Override
    public char getAlphabeticShortcut() {
        return this.f15548d.getAlphabeticShortcut();
    }

    @Override
    public CharSequence getContentDescription() {
        return this.f15548d.getContentDescription();
    }

    @Override
    public int getGroupId() {
        return this.f15548d.getGroupId();
    }

    @Override
    public Drawable getIcon() {
        return this.f15548d.getIcon();
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.f15548d.getIconTintList();
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.f15548d.getIconTintMode();
    }

    @Override
    public Intent getIntent() {
        return this.f15548d.getIntent();
    }

    @Override
    public int getItemId() {
        return this.f15548d.getItemId();
    }

    @Override
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15548d.getMenuInfo();
    }

    @Override
    public int getNumericModifiers() {
        return this.f15548d.getNumericModifiers();
    }

    @Override
    public char getNumericShortcut() {
        return this.f15548d.getNumericShortcut();
    }

    @Override
    public int getOrder() {
        return this.f15548d.getOrder();
    }

    @Override
    public SubMenu getSubMenu() {
        return d(this.f15548d.getSubMenu());
    }

    @Override
    public CharSequence getTitle() {
        return this.f15548d.getTitle();
    }

    @Override
    public CharSequence getTitleCondensed() {
        return this.f15548d.getTitleCondensed();
    }

    @Override
    public CharSequence getTooltipText() {
        return this.f15548d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f15549e == null) {
                this.f15549e = this.f15548d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f15549e.invoke(this.f15548d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override
    public boolean hasSubMenu() {
        return this.f15548d.hasSubMenu();
    }

    @Override
    public boolean isActionViewExpanded() {
        return this.f15548d.isActionViewExpanded();
    }

    @Override
    public boolean isCheckable() {
        return this.f15548d.isCheckable();
    }

    @Override
    public boolean isChecked() {
        return this.f15548d.isChecked();
    }

    @Override
    public boolean isEnabled() {
        return this.f15548d.isEnabled();
    }

    @Override
    public boolean isVisible() {
        return this.f15548d.isVisible();
    }

    @Override
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f15545a, actionProvider);
        v0.b bVar2 = this.f15548d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0138c(view);
        }
        this.f15548d.setActionView(view);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f15548d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public MenuItem setCheckable(boolean z10) {
        this.f15548d.setCheckable(z10);
        return this;
    }

    @Override
    public MenuItem setChecked(boolean z10) {
        this.f15548d.setChecked(z10);
        return this;
    }

    @Override
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f15548d.setContentDescription(charSequence);
        return this;
    }

    @Override
    public MenuItem setEnabled(boolean z10) {
        this.f15548d.setEnabled(z10);
        return this;
    }

    @Override
    public MenuItem setIcon(Drawable drawable) {
        this.f15548d.setIcon(drawable);
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15548d.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15548d.setIconTintMode(mode);
        return this;
    }

    @Override
    public MenuItem setIntent(Intent intent) {
        this.f15548d.setIntent(intent);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c10) {
        this.f15548d.setNumericShortcut(c10);
        return this;
    }

    @Override
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15548d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15548d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c10, char c11) {
        this.f15548d.setShortcut(c10, c11);
        return this;
    }

    @Override
    public void setShowAsAction(int i10) {
        this.f15548d.setShowAsAction(i10);
    }

    @Override
    public MenuItem setShowAsActionFlags(int i10) {
        this.f15548d.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15548d.setTitle(charSequence);
        return this;
    }

    @Override
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15548d.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f15548d.setTooltipText(charSequence);
        return this;
    }

    @Override
    public MenuItem setVisible(boolean z10) {
        return this.f15548d.setVisible(z10);
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f15548d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public MenuItem setIcon(int i10) {
        this.f15548d.setIcon(i10);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f15548d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f15548d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public MenuItem setTitle(int i10) {
        this.f15548d.setTitle(i10);
        return this;
    }

    @Override
    public MenuItem setActionView(int i10) {
        this.f15548d.setActionView(i10);
        View actionView = this.f15548d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f15548d.setActionView(new C0138c(actionView));
        }
        return this;
    }
}
