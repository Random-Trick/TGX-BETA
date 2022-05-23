package u7;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import n6.f;
import n6.l;
import u7.x0;

public class u0 extends Binder {
    public final a f23699a;

    public interface a {
        l<Void> a(Intent intent);
    }

    public u0(a aVar) {
        this.f23699a = aVar;
    }

    public void b(final x0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f23699a.a(aVar.f23709a).b(s0.f23693a, new f(aVar) {
                public final x0.a f23696a;

                {
                    this.f23696a = aVar;
                }

                @Override
                public void a(l lVar) {
                    this.f23696a.b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
