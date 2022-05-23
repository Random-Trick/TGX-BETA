package e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c1.f;
import j.b;

public class e extends Dialog implements b {
    public c f10411a;
    public final f.a f10412b = new a();

    public class a implements f.a {
        public a() {
        }

        @Override
        public boolean g(KeyEvent keyEvent) {
            return e.this.c(keyEvent);
        }
    }

    public e(Context context, int i10) {
        super(context, b(context, i10));
        c a10 = a();
        a10.C(b(context, i10));
        a10.q(null);
    }

    public static int b(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f5912y, typedValue, true);
        return typedValue.resourceId;
    }

    public c a() {
        if (this.f10411a == null) {
            this.f10411a = c.f(this, this);
        }
        return this.f10411a;
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void d(b bVar) {
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.e(this.f10412b, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i10) {
        return a().y(i10);
    }

    @Override
    public <T extends View> T findViewById(int i10) {
        return (T) a().g(i10);
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
        a().m();
    }

    @Override
    public void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override
    public void onStop() {
        super.onStop();
        a().w();
    }

    @Override
    public void setContentView(int i10) {
        a().z(i10);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().D(charSequence);
    }

    @Override
    public void setContentView(View view) {
        a().A(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().B(view, layoutParams);
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().D(getContext().getString(i10));
    }
}
