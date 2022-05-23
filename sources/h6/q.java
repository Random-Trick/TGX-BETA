package h6;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import i6.e;
import i6.t;
import j6.f;
import m5.r;
import u5.c;
import u5.d;

public final class q implements c {
    public final ViewGroup f12574a;
    public final e f12575b;
    public View f12576c;

    public q(ViewGroup viewGroup, e eVar) {
        this.f12575b = (e) r.k(eVar);
        this.f12574a = (ViewGroup) r.k(viewGroup);
    }

    public final void a(f fVar) {
        try {
            this.f12575b.B(new p(this, fVar));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void c() {
        try {
            this.f12575b.c();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void f() {
        try {
            this.f12575b.f();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void g() {
        try {
            this.f12575b.g();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @Override
    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            t.a(bundle, bundle2);
            this.f12575b.i(bundle2);
            t.a(bundle2, bundle);
            this.f12576c = (View) d.t(this.f12575b.s());
            this.f12574a.removeAllViews();
            this.f12574a.addView(this.f12576c);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
