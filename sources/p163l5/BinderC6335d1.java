package p163l5;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class BinderC6335d1 extends AbstractBinderC6394w0 {
    public AbstractC6325c f19902a;
    public final int f19903b;

    public BinderC6335d1(AbstractC6325c cVar, int i) {
        this.f19902a = cVar;
        this.f19903b = i;
    }

    @Override
    public final void mo20547Q0(int i, IBinder iBinder, C6348h1 h1Var) {
        AbstractC6325c cVar = this.f19902a;
        C6378r.m20505l(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C6378r.m20506k(h1Var);
        AbstractC6325c.m20634j0(cVar, h1Var);
        mo20545z0(i, iBinder, h1Var.f19954a);
    }

    @Override
    public final void mo20546j(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override
    public final void mo20545z0(int i, IBinder iBinder, Bundle bundle) {
        C6378r.m20505l(this.f19902a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f19902a.m20658Q(i, iBinder, bundle, this.f19903b);
        this.f19902a = null;
    }
}
