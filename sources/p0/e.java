package p0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.q;
import c1.f;

public class e extends Activity implements g, f.a {
    public k0.g<Class<Object>, Object> f20256a = new k0.g<>();
    public h f20257b = new h(this);

    public d a() {
        return this.f20257b;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.d(decorView, keyEvent)) {
            return f.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override
    public boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q.f(this);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        this.f20257b.j(d.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
