package p054e;

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
import androidx.appcompat.widget.C0466l0;
import androidx.fragment.app.ActivityC0761d;
import p127j.AbstractC5814b;
import p213p0.C7941a;
import p213p0.C7954f;
import p213p0.C7988o;

public class ActivityC4073a extends ActivityC0761d implements AbstractC4074b, C7988o.AbstractC7989a {
    public AbstractC4075c f13747d0;
    public Resources f13748e0;

    @Override
    public void mo29044C() {
        m29043D().mo28973m();
    }

    public AbstractC4075c m29043D() {
        if (this.f13747d0 == null) {
            this.f13747d0 = AbstractC4075c.m29033e(this, this);
        }
        return this.f13747d0;
    }

    public ActionBar m29042E() {
        return m29043D().mo28977k();
    }

    public void m29041F(C7988o oVar) {
        oVar.m13831i(this);
    }

    public void m29040G(int i) {
    }

    public void m29039H(C7988o oVar) {
    }

    @Deprecated
    public void m29038I() {
    }

    public boolean m29037J() {
        Intent c = mo13826c();
        if (c == null) {
            return false;
        }
        if (m29034M(c)) {
            C7988o r = C7988o.m13829r(this);
            m29041F(r);
            m29039H(r);
            r.m13828s();
            try {
                C7941a.m14028n(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            m29035L(c);
            return true;
        }
    }

    public final boolean m29036K(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    public void m29035L(Intent intent) {
        C7954f.m14001e(this, intent);
    }

    public boolean m29034M(Intent intent) {
        return C7954f.m14000f(this, intent);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m29043D().mo28990c(view, layoutParams);
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        m29043D().mo28988d(context);
    }

    @Override
    public Intent mo13826c() {
        return C7954f.m14005a(this);
    }

    @Override
    public void closeOptionsMenu() {
        ActionBar E = m29042E();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (E == null || !E.m41857g()) {
            super.closeOptionsMenu();
        }
    }

    @Override
    public void mo28928d(AbstractC5814b bVar) {
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar E = m29042E();
        if (keyCode != 82 || E == null || !E.m41854p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public <T extends View> T findViewById(int i) {
        return (T) m29043D().mo28984g(i);
    }

    @Override
    public MenuInflater getMenuInflater() {
        return m29043D().mo28979j();
    }

    @Override
    public Resources getResources() {
        if (this.f13748e0 == null && C0466l0.m41205b()) {
            this.f13748e0 = new C0466l0(this, super.getResources());
        }
        Resources resources = this.f13748e0;
        return resources == null ? super.getResources() : resources;
    }

    @Override
    public void mo28926h(AbstractC5814b bVar) {
    }

    @Override
    public AbstractC5814b mo28925i(AbstractC5814b.AbstractC5815a aVar) {
        return null;
    }

    @Override
    public void invalidateOptionsMenu() {
        m29043D().mo28973m();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f13748e0 != null) {
            this.f13748e0.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m29043D().mo28969p(configuration);
    }

    @Override
    public void onContentChanged() {
        m29038I();
    }

    @Override
    public void onCreate(Bundle bundle) {
        AbstractC4075c D = m29043D();
        D.mo28975l();
        D.mo28967q(bundle);
        super.onCreate(bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        m29043D().mo28965r();
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m29036K(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar E = m29042E();
        if (menuItem.getItemId() != 16908332 || E == null || (E.mo41769j() & 4) == 0) {
            return false;
        }
        return m29037J();
    }

    @Override
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m29043D().mo28963s(bundle);
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        m29043D().mo28961t();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m29043D().mo28959u(bundle);
    }

    @Override
    public void onStart() {
        super.onStart();
        m29043D().mo28957v();
    }

    @Override
    public void onStop() {
        super.onStop();
        m29043D().mo28955w();
    }

    @Override
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m29043D().mo29021D(charSequence);
    }

    @Override
    public void openOptionsMenu() {
        ActionBar E = m29042E();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (E == null || !E.m41853q()) {
            super.openOptionsMenu();
        }
    }

    @Override
    public void setContentView(int i) {
        m29043D().mo28950z(i);
    }

    @Override
    public void setTheme(int i) {
        super.setTheme(i);
        m29043D().mo29023C(i);
    }

    @Override
    public void setContentView(View view) {
        m29043D().mo29027A(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m29043D().mo29025B(view, layoutParams);
    }
}
