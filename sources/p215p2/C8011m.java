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
    public static final String f26082d = AbstractC4234j.m28362f("WMFgUpdater");
    public final AbstractC8354a f26083a;
    public final AbstractC7098a f26084b;
    public final AbstractC7558q f26085c;

    public class RunnableC8012a implements Runnable {
        public final Context f26086M;
        public final C8154c f26088a;
        public final UUID f26089b;
        public final C4228e f26090c;

        public RunnableC8012a(C8154c cVar, UUID uuid, C4228e eVar, Context context) {
            this.f26088a = cVar;
            this.f26089b = uuid;
            this.f26090c = eVar;
            this.f26086M = context;
        }

        @Override
        public void run() {
            try {
                if (!this.f26088a.isCancelled()) {
                    String uuid = this.f26089b.toString();
                    C4250s.EnumC4251a n = C8011m.this.f26085c.mo15681n(uuid);
                    if (n == null || n.m28351a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C8011m.this.f26084b.mo17738a(uuid, this.f26090c);
                    this.f26086M.startService(C1097a.m38405a(this.f26086M, uuid, this.f26090c));
                }
                this.f26088a.mo13348p(null);
            } catch (Throwable th) {
                this.f26088a.mo13347q(th);
            }
        }
    }

    public C8011m(WorkDatabase workDatabase, AbstractC7098a aVar, AbstractC8354a aVar2) {
        this.f26084b = aVar;
        this.f26083a = aVar2;
        this.f26085c = workDatabase.mo38457D();
    }

    @Override
    public AbstractFutureC1291a<Void> mo13792a(Context context, UUID uuid, C4228e eVar) {
        C8154c t = C8154c.m13345t();
        this.f26083a.mo12681b(new RunnableC8012a(t, uuid, eVar, context));
        return t;
    }
}
