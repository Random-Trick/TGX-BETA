package p2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f2.e;
import f2.f;
import f2.j;
import f2.s;
import java.util.UUID;
import o2.q;
import q2.c;

public class m implements f {
    public static final String f20441d = j.f("WMFgUpdater");
    public final r2.a f20442a;
    public final n2.a f20443b;
    public final q f20444c;

    public class a implements Runnable {
        public final Context M;
        public final c f20445a;
        public final UUID f20446b;
        public final e f20447c;

        public a(c cVar, UUID uuid, e eVar, Context context) {
            this.f20445a = cVar;
            this.f20446b = uuid;
            this.f20447c = eVar;
            this.M = context;
        }

        @Override
        public void run() {
            try {
                if (!this.f20445a.isCancelled()) {
                    String uuid = this.f20446b.toString();
                    s.a n10 = m.this.f20444c.n(uuid);
                    if (n10 == null || n10.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    m.this.f20443b.a(uuid, this.f20447c);
                    this.M.startService(androidx.work.impl.foreground.a.a(this.M, uuid, this.f20447c));
                }
                this.f20445a.p(null);
            } catch (Throwable th) {
                this.f20445a.q(th);
            }
        }
    }

    public m(WorkDatabase workDatabase, n2.a aVar, r2.a aVar2) {
        this.f20443b = aVar;
        this.f20442a = aVar2;
        this.f20444c = workDatabase.D();
    }

    @Override
    public c7.a<Void> a(Context context, UUID uuid, e eVar) {
        c t10 = c.t();
        this.f20442a.b(new a(t10, uuid, eVar, context));
        return t10;
    }
}
