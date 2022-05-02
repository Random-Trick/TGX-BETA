package p213p0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0840d;
import androidx.lifecycle.AbstractC0846g;
import androidx.lifecycle.C0847h;
import androidx.lifecycle.FragmentC0858q;
import p028c1.C1452f;
import p143k0.C6037g;

public class ActivityC7953e extends Activity implements AbstractC0846g, C1452f.AbstractC1453a {
    public C6037g<Class<Object>, Object> f25856a = new C6037g<>();
    public C0847h f25857b = new C0847h(this);

    public AbstractC0840d mo14008a() {
        return this.f25857b;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1452f.m36885d(decorView, keyEvent)) {
            return C1452f.m36884e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1452f.m36885d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override
    public boolean mo14007g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0858q.m39628f(this);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        this.f25857b.m39652j(AbstractC0840d.EnumC0843c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
