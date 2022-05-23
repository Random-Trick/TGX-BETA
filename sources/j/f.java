package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import j.b;
import java.util.ArrayList;
import k.c;
import k.e;
import k0.g;

public class f extends ActionMode {
    public final Context f14927a;
    public final b f14928b;

    public static class a implements b.a {
        public final ActionMode.Callback f14929a;
        public final Context f14930b;
        public final ArrayList<f> f14931c = new ArrayList<>();
        public final g<Menu, Menu> f14932d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f14930b = context;
            this.f14929a = callback;
        }

        @Override
        public boolean a(b bVar, Menu menu) {
            return this.f14929a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override
        public void b(b bVar) {
            this.f14929a.onDestroyActionMode(e(bVar));
        }

        @Override
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f14929a.onActionItemClicked(e(bVar), new c(this.f14930b, (v0.b) menuItem));
        }

        @Override
        public boolean d(b bVar, Menu menu) {
            return this.f14929a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f14931c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f14931c.get(i10);
                if (fVar != null && fVar.f14928b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f14930b, bVar);
            this.f14931c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f14932d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            e eVar = new e(this.f14930b, (v0.a) menu);
            this.f14932d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, b bVar) {
        this.f14927a = context;
        this.f14928b = bVar;
    }

    @Override
    public void finish() {
        this.f14928b.c();
    }

    @Override
    public View getCustomView() {
        return this.f14928b.d();
    }

    @Override
    public Menu getMenu() {
        return new e(this.f14927a, (v0.a) this.f14928b.e());
    }

    @Override
    public MenuInflater getMenuInflater() {
        return this.f14928b.f();
    }

    @Override
    public CharSequence getSubtitle() {
        return this.f14928b.g();
    }

    @Override
    public Object getTag() {
        return this.f14928b.h();
    }

    @Override
    public CharSequence getTitle() {
        return this.f14928b.i();
    }

    @Override
    public boolean getTitleOptionalHint() {
        return this.f14928b.j();
    }

    @Override
    public void invalidate() {
        this.f14928b.k();
    }

    @Override
    public boolean isTitleOptional() {
        return this.f14928b.l();
    }

    @Override
    public void setCustomView(View view) {
        this.f14928b.m(view);
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
        this.f14928b.o(charSequence);
    }

    @Override
    public void setTag(Object obj) {
        this.f14928b.p(obj);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.f14928b.r(charSequence);
    }

    @Override
    public void setTitleOptionalHint(boolean z10) {
        this.f14928b.s(z10);
    }

    @Override
    public void setSubtitle(int i10) {
        this.f14928b.n(i10);
    }

    @Override
    public void setTitle(int i10) {
        this.f14928b.q(i10);
    }
}
