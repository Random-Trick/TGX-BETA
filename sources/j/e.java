package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import j.b;
import java.lang.ref.WeakReference;

public class e extends b implements e.a {
    public ActionBarContextView M;
    public b.a N;
    public WeakReference<View> O;
    public boolean P;
    public boolean Q;
    public androidx.appcompat.view.menu.e R;
    public Context f14926c;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f14926c = context;
        this.M = actionBarContextView;
        this.N = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.R = S;
        S.R(this);
        this.Q = z10;
    }

    @Override
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.N.c(this, menuItem);
    }

    @Override
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.M.l();
    }

    @Override
    public void c() {
        if (!this.P) {
            this.P = true;
            this.M.sendAccessibilityEvent(32);
            this.N.b(this);
        }
    }

    @Override
    public View d() {
        WeakReference<View> weakReference = this.O;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override
    public Menu e() {
        return this.R;
    }

    @Override
    public MenuInflater f() {
        return new g(this.M.getContext());
    }

    @Override
    public CharSequence g() {
        return this.M.getSubtitle();
    }

    @Override
    public CharSequence i() {
        return this.M.getTitle();
    }

    @Override
    public void k() {
        this.N.d(this, this.R);
    }

    @Override
    public boolean l() {
        return this.M.j();
    }

    @Override
    public void m(View view) {
        this.M.setCustomView(view);
        this.O = view != null ? new WeakReference<>(view) : null;
    }

    @Override
    public void n(int i10) {
        o(this.f14926c.getString(i10));
    }

    @Override
    public void o(CharSequence charSequence) {
        this.M.setSubtitle(charSequence);
    }

    @Override
    public void q(int i10) {
        r(this.f14926c.getString(i10));
    }

    @Override
    public void r(CharSequence charSequence) {
        this.M.setTitle(charSequence);
    }

    @Override
    public void s(boolean z10) {
        super.s(z10);
        this.M.setTitleOptional(z10);
    }
}
