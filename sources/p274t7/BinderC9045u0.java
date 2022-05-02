package p274t7;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p177m6.AbstractC6763f;
import p177m6.AbstractC6775l;
import p274t7.ServiceConnectionC9052x0;

public class BinderC9045u0 extends Binder {
    public final AbstractC9046a f29019a;

    public interface AbstractC9046a {
        AbstractC6775l<Void> mo10609a(Intent intent);
    }

    public BinderC9045u0(AbstractC9046a aVar) {
        this.f29019a = aVar;
    }

    public void m10610b(final ServiceConnectionC9052x0.C9053a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f29019a.mo10609a(aVar.f29032a).mo19080b(ExecutorC9041s0.f29013a, new AbstractC6763f(aVar) {
                public final ServiceConnectionC9052x0.C9053a f29016a;

                {
                    this.f29016a = aVar;
                }

                @Override
                public void mo10607a(AbstractC6775l lVar) {
                    this.f29016a.m10601b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
