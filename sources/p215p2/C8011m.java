package p215p2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1097a;
import java.util.UUID;
import p022b7.AbstractFutureC1291a;
import p071f2.AbstractC4229f;
import p071f2.AbstractC4234j;
import p071f2.C4228e;
import p071f2.C4250s;
import p185n2.AbstractC7098a;
import p198o2.AbstractC7558q;
import p229q2.C8154c;
import p243r2.AbstractC8354a;

public class C8011m implements AbstractC4229f {
    public static final String f26079d = AbstractC4234j.m28360f("WMFgUpdater");
    public final AbstractC8354a f26080a;
    public final AbstractC7098a f26081b;
    public final AbstractC7558q f26082c;

    public class RunnableC8012a implements Runnable {
        public final Context f26083M;
        public final C8154c f26085a;
        public final UUID f26086b;
        public final C4228e f26087c;

        public RunnableC8012a(C8154c cVar, UUID uuid, C4228e eVar, Context context) {
            this.f26085a = cVar;
            this.f26086b = uuid;
            this.f26087c = eVar;
            this.f26083M = context;
        }

        @Override
        public void run() {
            try {
                if (!this.f26085a.isCancelled()) {
                    String uuid = this.f26086b.toString();
                    C4250s.EnumC4251a n = C8011m.this.f26082c.mo15681n(uuid);
                    if (n == null || n.m28349a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C8011m.this.f26081b.mo17738a(uuid, this.f26087c);
                    this.f26083M.startService(C1097a.m38402a(this.f26083M, uuid, this.f26087c));
                }
                this.f26085a.mo13349p(null);
            } catch (Throwable th) {
                this.f26085a.mo13348q(th);
            }
        }
    }

    public C8011m(WorkDatabase workDatabase, AbstractC7098a aVar, AbstractC8354a aVar2) {
        this.f26081b = aVar;
        this.f26080a = aVar2;
        this.f26082c = workDatabase.mo38454D();
    }

    @Override
    public AbstractFutureC1291a<Void> mo13793a(Context context, UUID uuid, C4228e eVar) {
        C8154c t = C8154c.m13346t();
        this.f26080a.mo12682b(new RunnableC8012a(t, uuid, eVar, context));
        return t;
    }
}
