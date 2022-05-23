package h3;

import android.app.job.JobInfo;
import h3.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y2.d;

public abstract class f {

    public static class a {
        public k3.a f12475a;
        public Map<d, b> f12476b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f12476b.put(dVar, bVar);
            return this;
        }

        public f b() {
            Objects.requireNonNull(this.f12475a, "missing required property: clock");
            if (this.f12476b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f12476b;
                this.f12476b = new HashMap();
                return f.d(this.f12475a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(k3.a aVar) {
            this.f12475a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static f d(k3.a aVar, Map<d, b> map) {
        return new h3.b(aVar, map);
    }

    public static f f(k3.a aVar) {
        return b().a(d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i10, long j10) {
        int i11;
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * i11)));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    public abstract k3.a e();

    public long g(d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    public abstract Map<d, b> h();

    public final void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
