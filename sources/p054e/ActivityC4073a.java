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
    public void mo29042C() {
        m29041D().mo28971m();
    }

    public AbstractC4075c m29041D() {
        if (this.f13747d0 == null) {
            this.f13747d0 = AbstractC4075c.m29031e(this, this);
        }
        return this.f13747d0;
    }

    public ActionBar m29040E() {
        return m29041D().mo28975k();
    }

    public void m29039F(C7988o oVar) {
        oVar.m13832i(this);
    }

    public void m29038G(int i) {
    }

    public void m29037H(C7988o oVar) {
    }

    @Deprecated
    public void m29036I() {
    }

    public boolean m29035J() {
        Intent c = mo13827c();
        if (c == null) {
            return false;
        }
        if (m29032M(c)) {
            C7988o r = C7988o.m13830r(this);
            m29039F(r);
            m29037H(r);
            r.m13829s();
            try {
                C7941a.m14029n(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            m29033L(c);
            return true;
        }
    }

    public final boolean m29034K(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    public void m29033L(Intent intent) {
        C7954f.m14002e(this, intent);
    }

    public boolean m29032M(Intent intent) {
        return C7954f.m14001f(this, intent);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m29041D().mo28988c(view, layoutParams);
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        m29041D().mo28986d(context);
    }

    @Override
    public Intent mo13827c() {
        return C7954f.m14006a(this);
    }

    @Override
    public void closeOptionsMenu() {
        ActionBar E = m29040E();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (E == null || !E.m41854g()) {
            super.closeOptionsMenu();
        }
    }

    @Override
    public void mo28926d(AbstractC5814b bVar) {
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar E = m29040E();
        if (keyCode != 82 || E == null || !E.m41851p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public <T extends View> T findViewById(int i) {
        return (T) m29041D().mo28982g(i);
    }

    @Override
    public MenuInflater getMenuInflater() {
        return m29041D().mo28977j();
    }

    @Override
    public Resources getResources() {
        if (this.f13748e0 == null && C0466l0.m41202b()) {
            this.f13748e0 = new C0466l0(this, super.getResources());
        }
        Resources resources = this.f13748e0;
        return resources == null ? super.getResources() : resources;
    }

    @Override
    public void mo28924h(AbstractC5814b bVar) {
    }

    @Override
    public AbstractC5814b mo28923i(AbstractC5814b.AbstractC5815a aVar) {
        return null;
    }

    @Override
    public void invalidateOptionsMenu() {
        m29041D().mo28971m();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f13748e0 != null) {
            this.f13748e0.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m29041D().mo28967p(configuration);
    }

    @Override
    public void onContentChanged() {
        m29036I();
    }

    @Override
    public void onCreate(Bundle bundle) {
        AbstractC4075c D = m29041D();
        D.mo28973l();
        D.mo28965q(bundle);
        super.onCreate(bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        m29041D().mo28963r();
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m29034K(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar E = m29040E();
        if (menuItem.getItemId() != 16908332 || E == null || (E.mo41766j() & 4) == 0) {
            return false;
        }
        return m29035J();
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
        m29041D().mo28961s(bundle);
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        m29041D().mo28959t();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m29041D().mo28957u(bundle);
    }

    @Override
    public void onStart() {
        super.onStart();
        m29041D().mo28955v();
    }

    @Override
    public void onStop() {
        super.onStop();
        m29041D().mo28953w();
    }

    @Override
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m29041D().mo29019D(charSequence);
    }

    @Override
    public void openOptionsMenu() {
        ActionBar E = m29040E();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (E == null || !E.m41850q()) {
            super.openOptionsMenu();
        }
    }

    @Override
    public void setContentView(int i) {
        m29041D().mo28948z(i);
    }

    @Override
    public void setTheme(int i) {
        super.setTheme(i);
        m29041D().mo29021C(i);
    }

    @Override
    public void setContentView(View view) {
        m29041D().mo29025A(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m29041D().mo29023B(view, layoutParams);
    }
}
