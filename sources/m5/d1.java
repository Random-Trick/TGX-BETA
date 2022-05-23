package m5;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class d1 extends w0 {
    public c f17173a;
    public final int f17174b;

    public d1(c cVar, int i10) {
        this.f17173a = cVar;
        this.f17174b = i10;
    }

    @Override
    public final void C0(int i10, IBinder iBinder, Bundle bundle) {
        r.l(this.f17173a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f17173a.Q(i10, iBinder, bundle, this.f17174b);
        this.f17173a = null;
    }

    @Override
    public final void E0(int i10, IBinder iBinder, h1 h1Var) {
        c cVar = this.f17173a;
        r.l(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        r.k(h1Var);
        c.j0(cVar, h1Var);
        C0(i10, iBinder, h1Var.f17210a);
    }

    @Override
    public final void j(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
