package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import v0.c;

public class g extends e implements SubMenu {
    public final c f15561e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.f15561e = cVar;
    }

    @Override
    public void clearHeader() {
        this.f15561e.clearHeader();
    }

    @Override
    public MenuItem getItem() {
        return c(this.f15561e.getItem());
    }

    @Override
    public SubMenu setHeaderIcon(int i10) {
        this.f15561e.setHeaderIcon(i10);
        return this;
    }

    @Override
    public SubMenu setHeaderTitle(int i10) {
        this.f15561e.setHeaderTitle(i10);
        return this;
    }

    @Override
    public SubMenu setHeaderView(View view) {
        this.f15561e.setHeaderView(view);
        return this;
    }

    @Override
    public SubMenu setIcon(int i10) {
        this.f15561e.setIcon(i10);
        return this;
    }

    @Override
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f15561e.setHeaderIcon(drawable);
        return this;
    }

    @Override
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f15561e.setHeaderTitle(charSequence);
        return this;
    }

    @Override
    public SubMenu setIcon(Drawable drawable) {
        this.f15561e.setIcon(drawable);
        return this;
    }
}
