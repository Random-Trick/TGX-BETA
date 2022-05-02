package p127j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0351e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p127j.AbstractC5814b;

public class C5818e extends AbstractC5814b implements C0351e.AbstractC0352a {
    public ActionBarContextView f18540M;
    public AbstractC5814b.AbstractC5815a f18541N;
    public WeakReference<View> f18542O;
    public boolean f18543P;
    public boolean f18544Q;
    public C0351e f18545R;
    public Context f18546c;

    public C5818e(Context context, ActionBarContextView actionBarContextView, AbstractC5814b.AbstractC5815a aVar, boolean z) {
        this.f18546c = context;
        this.f18540M = actionBarContextView;
        this.f18541N = aVar;
        C0351e S = new C0351e(actionBarContextView.getContext()).m41710S(1);
        this.f18545R = S;
        S.mo41627R(this);
        this.f18544Q = z;
    }

    @Override
    public boolean mo22105a(C0351e eVar, MenuItem menuItem) {
        return this.f18541N.mo22087c(this, menuItem);
    }

    @Override
    public void mo22104b(C0351e eVar) {
        mo22097k();
        this.f18540M.m41614l();
    }

    @Override
    public void mo22103c() {
        if (!this.f18543P) {
            this.f18543P = true;
            this.f18540M.sendAccessibilityEvent(32);
            this.f18541N.mo22088b(this);
        }
    }

    @Override
    public View mo22102d() {
        WeakReference<View> weakReference = this.f18542O;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override
    public Menu mo22101e() {
        return this.f18545R;
    }

    @Override
    public MenuInflater mo22100f() {
        return new C5821g(this.f18540M.getContext());
    }

    @Override
    public CharSequence mo22099g() {
        return this.f18540M.getSubtitle();
    }

    @Override
    public CharSequence mo22098i() {
        return this.f18540M.getTitle();
    }

    @Override
    public void mo22097k() {
        this.f18541N.mo22086d(this, this.f18545R);
    }

    @Override
    public boolean mo22096l() {
        return this.f18540M.m41616j();
    }

    @Override
    public void mo22095m(View view) {
        this.f18540M.setCustomView(view);
        this.f18542O = view != null ? new WeakReference<>(view) : null;
    }

    @Override
    public void mo22094n(int i) {
        mo22093o(this.f18546c.getString(i));
    }

    @Override
    public void mo22093o(CharSequence charSequence) {
        this.f18540M.setSubtitle(charSequence);
    }

    @Override
    public void mo22092q(int i) {
        mo22091r(this.f18546c.getString(i));
    }

    @Override
    public void mo22091r(CharSequence charSequence) {
        this.f18540M.setTitle(charSequence);
    }

    @Override
    public void mo22090s(boolean z) {
        super.mo22090s(z);
        this.f18540M.setTitleOptional(z);
    }
}
