package p142k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p294v0.AbstractSubMenuC9831c;

public class SubMenuC6023g extends MenuC6021e implements SubMenu {
    public final AbstractSubMenuC9831c f19168e;

    public SubMenuC6023g(Context context, AbstractSubMenuC9831c cVar) {
        super(context, cVar);
        this.f19168e = cVar;
    }

    @Override
    public void clearHeader() {
        this.f19168e.clearHeader();
    }

    @Override
    public MenuItem getItem() {
        return m21570c(this.f19168e.getItem());
    }

    @Override
    public SubMenu setHeaderIcon(int i) {
        this.f19168e.setHeaderIcon(i);
        return this;
    }

    @Override
    public SubMenu setHeaderTitle(int i) {
        this.f19168e.setHeaderTitle(i);
        return this;
    }

    @Override
    public SubMenu setHeaderView(View view) {
        this.f19168e.setHeaderView(view);
        return this;
    }

    @Override
    public SubMenu setIcon(int i) {
        this.f19168e.setIcon(i);
        return this;
    }

    @Override
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f19168e.setHeaderIcon(drawable);
        return this;
    }

    @Override
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f19168e.setHeaderTitle(charSequence);
        return this;
    }

    @Override
    public SubMenu setIcon(Drawable drawable) {
        this.f19168e.setIcon(drawable);
        return this;
    }
}
