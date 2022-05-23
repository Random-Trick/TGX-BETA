package f2;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.b;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o2.p;

public abstract class u {
    public UUID f11838a;
    public p f11839b;
    public Set<String> f11840c;

    public static abstract class a<B extends a<?, ?>, W extends u> {
        public p f11843c;
        public Class<? extends ListenableWorker> f11845e;
        public boolean f11841a = false;
        public Set<String> f11844d = new HashSet();
        public UUID f11842b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f11845e = cls;
            this.f11843c = new p(this.f11842b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f11844d.add(str);
            return d();
        }

        public final W b() {
            W c10 = c();
            b bVar = this.f11843c.f18599j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && bVar.e()) || bVar.f() || bVar.g() || (i10 >= 23 && bVar.h());
            p pVar = this.f11843c;
            if (pVar.f18606q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (pVar.f18596g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f11842b = UUID.randomUUID();
            p pVar2 = new p(this.f11843c);
            this.f11843c = pVar2;
            pVar2.f18590a = this.f11842b.toString();
            return c10;
        }

        public abstract W c();

        public abstract B d();

        public final B e(f2.a aVar, long j10, TimeUnit timeUnit) {
            this.f11841a = true;
            p pVar = this.f11843c;
            pVar.f18601l = aVar;
            pVar.e(timeUnit.toMillis(j10));
            return d();
        }

        public final B f(b bVar) {
            this.f11843c.f18599j = bVar;
            return d();
        }

        public final B g(b bVar) {
            this.f11843c.f18594e = bVar;
            return d();
        }
    }

    public u(UUID uuid, p pVar, Set<String> set) {
        this.f11838a = uuid;
        this.f11839b = pVar;
        this.f11840c = set;
    }

    public String a() {
        return this.f11838a.toString();
    }

    public Set<String> b() {
        return this.f11840c;
    }

    public p c() {
        return this.f11839b;
    }
}
