package p100h3;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p100h3.C4929d;
import p146k3.AbstractC6045a;
import p339y2.EnumC10354d;

public abstract class AbstractC4934g {

    public static class C4935a {
        public AbstractC6045a f16818a;
        public Map<EnumC10354d, AbstractC4936b> f16819b = new HashMap();

        public C4935a m24425a(EnumC10354d dVar, AbstractC4936b bVar) {
            this.f16819b.put(dVar, bVar);
            return this;
        }

        public AbstractC4934g m24424b() {
            Objects.requireNonNull(this.f16818a, "missing required property: clock");
            if (this.f16819b.keySet().size() >= EnumC10354d.values().length) {
                Map<EnumC10354d, AbstractC4936b> map = this.f16819b;
                this.f16819b = new HashMap();
                return AbstractC4934g.m24432d(this.f16818a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public C4935a m24423c(AbstractC6045a aVar) {
            this.f16818a = aVar;
            return this;
        }
    }

    public static abstract class AbstractC4936b {

        public static abstract class AbstractC4937a {
            public abstract AbstractC4936b mo24418a();

            public abstract AbstractC4937a mo24417b(long j);

            public abstract AbstractC4937a mo24416c(Set<EnumC4938c> set);

            public abstract AbstractC4937a mo24415d(long j);
        }

        public static AbstractC4937a m24422a() {
            return new C4929d.C4931b().mo24416c(Collections.emptySet());
        }

        public abstract long mo24421b();

        public abstract Set<EnumC4938c> mo24420c();

        public abstract long mo24419d();
    }

    public enum EnumC4938c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static C4935a m24434b() {
        return new C4935a();
    }

    public static AbstractC4934g m24432d(AbstractC6045a aVar, Map<EnumC10354d, AbstractC4936b> map) {
        return new C4928c(aVar, map);
    }

    public static AbstractC4934g m24430f(AbstractC6045a aVar) {
        return m24434b().m24425a(EnumC10354d.DEFAULT, AbstractC4936b.m24422a().mo24417b(30000L).mo24415d(86400000L).mo24418a()).m24425a(EnumC10354d.HIGHEST, AbstractC4936b.m24422a().mo24417b(1000L).mo24415d(86400000L).mo24418a()).m24425a(EnumC10354d.VERY_LOW, AbstractC4936b.m24422a().mo24417b(86400000L).mo24415d(86400000L).mo24416c(m24427i(EnumC4938c.NETWORK_UNMETERED, EnumC4938c.DEVICE_IDLE)).mo24418a()).m24423c(aVar).m24424b();
    }

    public static <T> Set<T> m24427i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long m24435a(int i, long j) {
        int i2;
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2)));
    }

    public JobInfo.Builder m24433c(JobInfo.Builder builder, EnumC10354d dVar, long j, int i) {
        builder.setMinimumLatency(m24429g(dVar, j, i));
        m24426j(builder, mo24428h().get(dVar).mo24420c());
        return builder;
    }

    public abstract AbstractC6045a mo24431e();

    public long m24429g(EnumC10354d dVar, long j, int i) {
        long a = j - mo24431e().mo21442a();
        AbstractC4936b bVar = mo24428h().get(dVar);
        return Math.min(Math.max(m24435a(i, bVar.mo24421b()), a), bVar.mo24419d());
    }

    public abstract Map<EnumC10354d, AbstractC4936b> mo24428h();

    public final void m24426j(JobInfo.Builder builder, Set<EnumC4938c> set) {
        if (set.contains(EnumC4938c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC4938c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC4938c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
