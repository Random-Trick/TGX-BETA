package p071f2;

import android.os.Build;
import androidx.work.C1070b;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p198o2.C7554p;

public abstract class AbstractC4253u {
    public UUID f14304a;
    public C7554p f14305b;
    public Set<String> f14306c;

    public static abstract class AbstractC4254a<B extends AbstractC4254a<?, ?>, W extends AbstractC4253u> {
        public C7554p f14309c;
        public Class<? extends ListenableWorker> f14311e;
        public boolean f14307a = false;
        public Set<String> f14310d = new HashSet();
        public UUID f14308b = UUID.randomUUID();

        public AbstractC4254a(Class<? extends ListenableWorker> cls) {
            this.f14311e = cls;
            this.f14309c = new C7554p(this.f14308b.toString(), cls.getName());
            m28341a(cls.getName());
        }

        public final B m28341a(String str) {
            this.f14310d.add(str);
            return mo28338d();
        }

        public final W m28340b() {
            W c = mo28339c();
            C4223b bVar = this.f14309c.f24149j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && bVar.m28391e()) || bVar.m28390f() || bVar.m28389g() || (i >= 23 && bVar.m28388h());
            C7554p pVar = this.f14309c;
            if (pVar.f24156q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (pVar.f24146g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f14308b = UUID.randomUUID();
            C7554p pVar2 = new C7554p(this.f14309c);
            this.f14309c = pVar2;
            pVar2.f24140a = this.f14308b.toString();
            return c;
        }

        public abstract W mo28339c();

        public abstract B mo28338d();

        public final B m28337e(EnumC4222a aVar, long j, TimeUnit timeUnit) {
            this.f14307a = true;
            C7554p pVar = this.f14309c;
            pVar.f24151l = aVar;
            pVar.m15698e(timeUnit.toMillis(j));
            return mo28338d();
        }

        public final B m28336f(C4223b bVar) {
            this.f14309c.f24149j = bVar;
            return mo28338d();
        }

        public final B m28335g(C1070b bVar) {
            this.f14309c.f24144e = bVar;
            return mo28338d();
        }
    }

    public AbstractC4253u(UUID uuid, C7554p pVar, Set<String> set) {
        this.f14304a = uuid;
        this.f14305b = pVar;
        this.f14306c = set;
    }

    public String m28344a() {
        return this.f14304a.toString();
    }

    public Set<String> m28343b() {
        return this.f14306c;
    }

    public C7554p m28342c() {
        return this.f14305b;
    }
}