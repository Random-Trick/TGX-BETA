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
        public boolean mo14006g(KeyEvent keyEvent) {
            return DialogC4096e.this.m28929c(keyEvent);
        }
    }

    public DialogC4096e(Context context, int i) {
        super(context, m28930b(context, i));
        AbstractC4075c a = m28931a();
        a.mo29023C(m28930b(context, i));
        a.mo28967q(null);
    }

    public static int m28930b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3554a.y, typedValue, true);
        return typedValue.resourceId;
    }

    public AbstractC4075c m28931a() {
        if (this.f13847a == null) {
            this.f13847a = AbstractC4075c.m29032f(this, this);
        }
        return this.f13847a;
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m28931a().mo28990c(view, layoutParams);
    }

    public boolean m28929c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void mo28928d(AbstractC5814b bVar) {
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1452f.m36887e(this.f13848b, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean m28927e(int i) {
        return m28931a().mo28952y(i);
    }

    @Override
    public <T extends View> T findViewById(int i) {
        return (T) m28931a().mo28984g(i);
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
        m28931a().mo28973m();
    }

    @Override
    public void onCreate(Bundle bundle) {
        m28931a().mo28975l();
        super.onCreate(bundle);
        m28931a().mo28967q(bundle);
    }

    @Override
    public void onStop() {
        super.onStop();
        m28931a().mo28955w();
    }

    @Override
    public void setContentView(int i) {
        m28931a().mo28950z(i);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m28931a().mo29021D(charSequence);
    }

    @Override
    public void setContentView(View view) {
        m28931a().mo29027A(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m28931a().mo29025B(view, layoutParams);
    }

    @Override
    public void setTitle(int i) {
        super.setTitle(i);
        m28931a().mo29021D(getContext().getString(i));
    }
}
