package p142k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p028c1.AbstractC1435b;
import p127j.AbstractC5816c;
import p294v0.AbstractMenuItemC9830b;

public class MenuItemC6014c extends AbstractC6013b implements MenuItem {
    public final AbstractMenuItemC9830b f19155d;
    public Method f19156e;

    public class C6015a extends AbstractC1435b {
        public final ActionProvider f19157d;

        public C6015a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f19157d = actionProvider;
        }

        @Override
        public boolean mo21563a() {
            return this.f19157d.hasSubMenu();
        }

        @Override
        public View mo21562c() {
            return this.f19157d.onCreateActionView();
        }

        @Override
        public boolean mo21561e() {
            return this.f19157d.onPerformDefaultAction();
        }

        @Override
        public void mo21560f(SubMenu subMenu) {
            this.f19157d.onPrepareSubMenu(MenuItemC6014c.this.m21568d(subMenu));
        }
    }

    public class ActionProvider$VisibilityListenerC6016b extends C6015a implements ActionProvider.VisibilityListener {
        public AbstractC1435b.AbstractC1437b f19159f;

        public ActionProvider$VisibilityListenerC6016b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override
        public boolean mo21559b() {
            return this.f19157d.isVisible();
        }

        @Override
        public View mo21558d(MenuItem menuItem) {
            return this.f19157d.onCreateActionView(menuItem);
        }

        @Override
        public boolean mo21557g() {
            return this.f19157d.overridesItemVisibility();
        }

        @Override
        public void mo21556j(AbstractC1435b.AbstractC1437b bVar) {
            this.f19159f = bVar;
            this.f19157d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC1435b.AbstractC1437b bVar = this.f19159f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    public static class C6017c extends FrameLayout implements AbstractC5816c {
        public final CollapsibleActionView f19161a;

        public C6017c(View view) {
            super(view.getContext());
            this.f19161a = (CollapsibleActionView) view;
            addView(view);
        }

        public View m21555a() {
            return (View) this.f19161a;
        }

        @Override
        public void mo21554c() {
            this.f19161a.onActionViewExpanded();
        }

        @Override
        public void mo21553d() {
            this.f19161a.onActionViewCollapsed();
        }
    }

    public class MenuItem$OnActionExpandListenerC6018d implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener f19162a;

        public MenuItem$OnActionExpandListenerC6018d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f19162a = onActionExpandListener;
        }

        @Override
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f19162a.onMenuItemActionCollapse(MenuItemC6014c.this.m21569c(menuItem));
        }

        @Override
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f19162a.onMenuItemActionExpand(MenuItemC6014c.this.m21569c(menuItem));
        }
    }

    public class MenuItem$OnMenuItemClickListenerC6019e implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener f19164a;

        public MenuItem$OnMenuItemClickListenerC6019e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f19164a = onMenuItemClickListener;
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f19164a.onMenuItemClick(MenuItemC6014c.this.m21569c(menuItem));
        }
    }

    public MenuItemC6014c(Context context, AbstractMenuItemC9830b bVar) {
        super(context);
        if (bVar != null) {
            this.f19155d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override
    public boolean collapseActionView() {
        return this.f19155d.collapseActionView();
    }

    @Override
    public boolean expandActionView() {
        return this.f19155d.expandActionView();
    }

    @Override
    public ActionProvider getActionProvider() {
        AbstractC1435b b = this.f19155d.mo6783b();
        if (b instanceof C6015a) {
            return ((C6015a) b).f19157d;
        }
        return null;
    }

    @Override
    public View getActionView() {
        View actionView = this.f19155d.getActionView();
        return actionView instanceof C6017c ? ((C6017c) actionView).m21555a() : actionView;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.f19155d.getAlphabeticModifiers();
    }

    @Override
    public char getAlphabeticShortcut() {
        return this.f19155d.getAlphabeticShortcut();
    }

    @Override
    public CharSequence getContentDescription() {
        return this.f19155d.getContentDescription();
    }

    @Override
    public int getGroupId() {
        return this.f19155d.getGroupId();
    }

    @Override
    public Drawable getIcon() {
        return this.f19155d.getIcon();
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.f19155d.getIconTintList();
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.f19155d.getIconTintMode();
    }

    @Override
    public Intent getIntent() {
        return this.f19155d.getIntent();
    }

    @Override
    public int getItemId() {
        return this.f19155d.getItemId();
    }

    @Override
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f19155d.getMenuInfo();
    }

    @Override
    public int getNumericModifiers() {
        return this.f19155d.getNumericModifiers();
    }

    @Override
    public char getNumericShortcut() {
        return this.f19155d.getNumericShortcut();
    }

    @Override
    public int getOrder() {
        return this.f19155d.getOrder();
    }

    @Override
    public SubMenu getSubMenu() {
        return m21568d(this.f19155d.getSubMenu());
    }

    @Override
    public CharSequence getTitle() {
        return this.f19155d.getTitle();
    }

    @Override
    public CharSequence getTitleCondensed() {
        return this.f19155d.getTitleCondensed();
    }

    @Override
    public CharSequence getTooltipText() {
        return this.f19155d.getTooltipText();
    }

    public void m21564h(boolean z) {
        try {
            if (this.f19156e == null) {
                this.f19156e = this.f19155d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f19156e.invoke(this.f19155d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override
    public boolean hasSubMenu() {
        return this.f19155d.hasSubMenu();
    }

    @Override
    public boolean isActionViewExpanded() {
        return this.f19155d.isActionViewExpanded();
    }

    @Override
    public boolean isCheckable() {
        return this.f19155d.isCheckable();
    }

    @Override
    public boolean isChecked() {
        return this.f19155d.isChecked();
    }

    @Override
    public boolean isEnabled() {
        return this.f19155d.isEnabled();
    }

    @Override
    public boolean isVisible() {
        return this.f19155d.isVisible();
    }

    @Override
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC1435b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new ActionProvider$VisibilityListenerC6016b(this.f19152a, actionProvider);
        } else {
            bVar = new C6015a(this.f19152a, actionProvider);
        }
        AbstractMenuItemC9830b bVar2 = this.f19155d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo6784a(bVar);
        return this;
    }

    @Override
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C6017c(view);
        }
        this.f19155d.setActionView(view);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c) {
        this.f19155d.setAlphabeticShortcut(c);
        return this;
    }

    @Override
    public MenuItem setCheckable(boolean z) {
        this.f19155d.setCheckable(z);
        return this;
    }

    @Override
    public MenuItem setChecked(boolean z) {
        this.f19155d.setChecked(z);
        return this;
    }

    @Override
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f19155d.setContentDescription(charSequence);
        return this;
    }

    @Override
    public MenuItem setEnabled(boolean z) {
        this.f19155d.setEnabled(z);
        return this;
    }

    @Override
    public MenuItem setIcon(Drawable drawable) {
        this.f19155d.setIcon(drawable);
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19155d.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19155d.setIconTintMode(mode);
        return this;
    }

    @Override
    public MenuItem setIntent(Intent intent) {
        this.f19155d.setIntent(intent);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c) {
        this.f19155d.setNumericShortcut(c);
        return this;
    }

    @Override
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19155d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC6018d(onActionExpandListener) : null);
        return this;
    }

    @Override
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19155d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC6019e(onMenuItemClickListener) : null);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c, char c2) {
        this.f19155d.setShortcut(c, c2);
        return this;
    }

    @Override
    public void setShowAsAction(int i) {
        this.f19155d.setShowAsAction(i);
    }

    @Override
    public MenuItem setShowAsActionFlags(int i) {
        this.f19155d.setShowAsActionFlags(i);
        return this;
    }

    @Override
    public MenuItem setTitle(CharSequence charSequence) {
        this.f19155d.setTitle(charSequence);
        return this;
    }

    @Override
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19155d.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f19155d.setTooltipText(charSequence);
        return this;
    }

    @Override
    public MenuItem setVisible(boolean z) {
        return this.f19155d.setVisible(z);
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f19155d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override
    public MenuItem setIcon(int i) {
        this.f19155d.setIcon(i);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c, int i) {
        this.f19155d.setNumericShortcut(c, i);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f19155d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override
    public MenuItem setTitle(int i) {
        this.f19155d.setTitle(i);
        return this;
    }

    @Override
    public MenuItem setActionView(int i) {
        this.f19155d.setActionView(i);
        View actionView = this.f19155d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f19155d.setActionView(new C6017c(actionView));
        }
        return this;
    }
}
