package h6;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import i6.t;
import j6.f;
import m5.r;
import u5.c;
import u5.d;

public final class m implements c {
    public final ViewGroup f12565a;
    public final i6.c f12566b;
    public View f12567c;

    public m(ViewGroup viewGroup, i6.c cVar) {
        this.f12566b = (i6.c) r.k(cVar);
        this.f12565a = (ViewGroup) r.k(viewGroup);
    }

    public final void a(e eVar) {
        try {
            this.f12566b.n1(new l(this, eVar));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void c() {
        try {
            this.f12566b.c();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void f() {
        try {
            this.f12566b.f();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void g() {
        try {
            this.f12566b.g();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            t.a(bundle, bundle2);
            this.f12566b.i(bundle2);
            t.a(bundle2, bundle);
            this.f12567c = (View) d.t(this.f12566b.s());
            this.f12565a.removeAllViews();
            this.f12565a.addView(this.f12567c);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
