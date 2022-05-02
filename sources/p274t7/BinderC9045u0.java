package p274t7;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p177m6.AbstractC6763f;
import p177m6.AbstractC6775l;
import p274t7.ServiceConnectionC9052x0;

public class BinderC9045u0 extends Binder {
    public final AbstractC9046a f29016a;

    public interface AbstractC9046a {
        AbstractC6775l<Void> mo10610a(Intent intent);
    }

    public BinderC9045u0(AbstractC9046a aVar) {
        this.f29016a = aVar;
    }

    public void m10611b(final ServiceConnectionC9052x0.C9053a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f29016a.mo10610a(aVar.f29029a).mo19079b(ExecutorC9041s0.f29010a, new AbstractC6763f(aVar) {
                public final ServiceConnectionC9052x0.C9053a f29013a;

                {
                    this.f29013a = aVar;
                }

                @Override
                public void mo10608a(AbstractC6775l lVar) {
                    this.f29013a.m10602b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
