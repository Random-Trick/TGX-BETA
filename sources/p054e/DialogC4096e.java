package p054e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p028c1.C1452f;
import p039d.C3554a;
import p127j.AbstractC5814b;

public class DialogC4096e extends Dialog implements AbstractC4074b {
    public AbstractC4075c f13847a;
    public final C1452f.AbstractC1453a f13848b = new C4097a();

    public class C4097a implements C1452f.AbstractC1453a {
        public C4097a() {
        }

        @Override
        public boolean mo14007g(KeyEvent keyEvent) {
            return DialogC4096e.this.m28927c(keyEvent);
        }
    }

    public DialogC4096e(Context context, int i) {
        super(context, m28928b(context, i));
        AbstractC4075c a = m28929a();
        a.mo29021C(m28928b(context, i));
        a.mo28965q(null);
    }

    public static int m28928b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3554a.y, typedValue, true);
        return typedValue.resourceId;
    }

    public AbstractC4075c m28929a() {
        if (this.f13847a == null) {
            this.f13847a = AbstractC4075c.m29030f(this, this);
        }
        return this.f13847a;
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m28929a().mo28988c(view, layoutParams);
    }

    public boolean m28927c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void mo28926d(AbstractC5814b bVar) {
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1452f.m36884e(this.f13848b, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean m28925e(int i) {
        return m28929a().mo28950y(i);
    }

    @Override
    public <T extends View> T findViewById(int i) {
        return (T) m28929a().mo28982g(i);
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
        m28929a().mo28971m();
    }

    @Override
    public void onCreate(Bundle bundle) {
        m28929a().mo28973l();
        super.onCreate(bundle);
        m28929a().mo28965q(bundle);
    }

    @Override
    public void onStop() {
        super.onStop();
        m28929a().mo28953w();
    }

    @Override
    public void setContentView(int i) {
        m28929a().mo28948z(i);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m28929a().mo29019D(charSequence);
    }

    @Override
    public void setContentView(View view) {
        m28929a().mo29025A(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m28929a().mo29023B(view, layoutParams);
    }

    @Override
    public void setTitle(int i) {
        super.setTitle(i);
        m28929a().mo29019D(getContext().getString(i));
    }
}
