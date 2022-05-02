package p127j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p127j.AbstractC5814b;
import p142k.MenuC6021e;
import p142k.MenuItemC6014c;
import p143k0.C6037g;
import p294v0.AbstractMenuC9829a;
import p294v0.AbstractMenuItemC9830b;

public class C5819f extends ActionMode {
    public final Context f18547a;
    public final AbstractC5814b f18548b;

    public static class C5820a implements AbstractC5814b.AbstractC5815a {
        public final ActionMode.Callback f18549a;
        public final Context f18550b;
        public final ArrayList<C5819f> f18551c = new ArrayList<>();
        public final C6037g<Menu, Menu> f18552d = new C6037g<>();

        public C5820a(Context context, ActionMode.Callback callback) {
            this.f18550b = context;
            this.f18549a = callback;
        }

        @Override
        public boolean mo22090a(AbstractC5814b bVar, Menu menu) {
            return this.f18549a.onCreateActionMode(m22086e(bVar), m22085f(menu));
        }

        @Override
        public void mo22089b(AbstractC5814b bVar) {
            this.f18549a.onDestroyActionMode(m22086e(bVar));
        }

        @Override
        public boolean mo22088c(AbstractC5814b bVar, MenuItem menuItem) {
            return this.f18549a.onActionItemClicked(m22086e(bVar), new MenuItemC6014c(this.f18550b, (AbstractMenuItemC9830b) menuItem));
        }

        @Override
        public boolean mo22087d(AbstractC5814b bVar, Menu menu) {
            return this.f18549a.onPrepareActionMode(m22086e(bVar), m22085f(menu));
        }

        public ActionMode m22086e(AbstractC5814b bVar) {
            int size = this.f18551c.size();
            for (int i = 0; i < size; i++) {
                C5819f fVar = this.f18551c.get(i);
                if (fVar != null && fVar.f18548b == bVar) {
                    return fVar;
                }
            }
            C5819f fVar2 = new C5819f(this.f18550b, bVar);
            this.f18551c.add(fVar2);
            return fVar2;
        }

        public final Menu m22085f(Menu menu) {
            Menu menu2 = this.f18552d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC6021e eVar = new MenuC6021e(this.f18550b, (AbstractMenuC9829a) menu);
            this.f18552d.put(menu, eVar);
            return eVar;
        }
    }

    public C5819f(Context context, AbstractC5814b bVar) {
        this.f18547a = context;
        this.f18548b = bVar;
    }

    @Override
    public void finish() {
        this.f18548b.mo22104c();
    }

    @Override
    public View getCustomView() {
        return this.f18548b.mo22103d();
    }

    @Override
    public Menu getMenu() {
        return new MenuC6021e(this.f18547a, (AbstractMenuC9829a) this.f18548b.mo22102e());
    }

    @Override
    public MenuInflater getMenuInflater() {
        return this.f18548b.mo22101f();
    }

    @Override
    public CharSequence getSubtitle() {
        return this.f18548b.mo22100g();
    }

    @Override
    public Object getTag() {
        return this.f18548b.m22113h();
    }

    @Override
    public CharSequence getTitle() {
        return this.f18548b.mo22099i();
    }

    @Override
    public boolean getTitleOptionalHint() {
        return this.f18548b.m22112j();
    }

    @Override
    public void invalidate() {
        this.f18548b.mo22098k();
    }

    @Override
    public boolean isTitleOptional() {
        return this.f18548b.mo22097l();
    }

    @Override
    public void setCustomView(View view) {
        this.f18548b.mo22096m(view);
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
        this.f18548b.mo22094o(charSequence);
    }

    @Override
    public void setTag(Object obj) {
        this.f18548b.m22111p(obj);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.f18548b.mo22092r(charSequence);
    }

    @Override
    public void setTitleOptionalHint(boolean z) {
        this.f18548b.mo22091s(z);
    }

    @Override
    public void setSubtitle(int i) {
        this.f18548b.mo22095n(i);
    }

    @Override
    public void setTitle(int i) {
        this.f18548b.mo22093q(i);
    }
}
