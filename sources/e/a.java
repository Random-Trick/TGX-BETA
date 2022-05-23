package e;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.l0;
import androidx.fragment.app.d;
import j.b;
import p0.f;
import p0.o;

public class a extends d implements b, o.a {
    public c f10342d0;
    public Resources f10343e0;

    @Override
    public void E() {
        F().m();
    }

    public c F() {
        if (this.f10342d0 == null) {
            this.f10342d0 = c.e(this, this);
        }
        return this.f10342d0;
    }

    public ActionBar G() {
        return F().k();
    }

    public void H(o oVar) {
        oVar.g(this);
    }

    public void I(int i10) {
    }

    public void J(o oVar) {
    }

    @Deprecated
    public void K() {
    }

    public boolean L() {
        Intent c10 = c();
        if (c10 == null) {
            return false;
        }
        if (O(c10)) {
            o r10 = o.r(this);
            H(r10);
            J(r10);
            r10.s();
            try {
                p0.a.l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            N(c10);
            return true;
        }
    }

    public final boolean M(int i10, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    public void N(Intent intent) {
        f.e(this, intent);
    }

    public boolean O(Intent intent) {
        return f.f(this, intent);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F().c(view, layoutParams);
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        F().d(context);
    }

    @Override
    public Intent c() {
        return f.a(this);
    }

    @Override
    public void closeOptionsMenu() {
        ActionBar G = G();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (G == null || !G.g()) {
            super.closeOptionsMenu();
        }
    }

    @Override
    public void d(b bVar) {
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar G = G();
        if (keyCode != 82 || G == null || !G.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public <T extends View> T findViewById(int i10) {
        return (T) F().g(i10);
    }

    @Override
    public MenuInflater getMenuInflater() {
        return F().j();
    }

    @Override
    public Resources getResources() {
        if (this.f10343e0 == null && l0.b()) {
            this.f10343e0 = new l0(this, super.getResources());
        }
        Resources resources = this.f10343e0;
        return resources == null ? super.getResources() : resources;
    }

    @Override
    public void h(b bVar) {
    }

    @Override
    public b i(b.a aVar) {
        return null;
    }

    @Override
    public void invalidateOptionsMenu() {
        F().m();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f10343e0 != null) {
            this.f10343e0.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        F().p(configuration);
    }

    @Override
    public void onContentChanged() {
        K();
    }

    @Override
    public void onCreate(Bundle bundle) {
        c F = F();
        F.l();
        F.q(bundle);
        super.onCreate(bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        F().r();
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (M(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        ActionBar G = G();
        if (menuItem.getItemId() != 16908332 || G == null || (G.j() & 4) == 0) {
            return false;
        }
        return L();
    }

    @Override
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        F().s(bundle);
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        F().t();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        F().u(bundle);
    }

    @Override
    public void onStart() {
        super.onStart();
        F().v();
    }

    @Override
    public void onStop() {
        super.onStop();
        F().w();
    }

    @Override
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        F().D(charSequence);
    }

    @Override
    public void openOptionsMenu() {
        ActionBar G = G();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (G == null || !G.q()) {
            super.openOptionsMenu();
        }
    }

    @Override
    public void setContentView(int i10) {
        F().z(i10);
    }

    @Override
    public void setTheme(int i10) {
        super.setTheme(i10);
        F().C(i10);
    }

    @Override
    public void setContentView(View view) {
        F().A(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F().B(view, layoutParams);
    }
}
