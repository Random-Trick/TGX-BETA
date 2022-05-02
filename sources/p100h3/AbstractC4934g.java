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

        public C4935a m24426a(EnumC10354d dVar, AbstractC4936b bVar) {
            this.f16819b.put(dVar, bVar);
            return this;
        }

        public AbstractC4934g m24425b() {
            Objects.requireNonNull(this.f16818a, "missing required property: clock");
            if (this.f16819b.keySet().size() >= EnumC10354d.values().length) {
                Map<EnumC10354d, AbstractC4936b> map = this.f16819b;
                this.f16819b = new HashMap();
                return AbstractC4934g.m24433d(this.f16818a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public C4935a m24424c(AbstractC6045a aVar) {
            this.f16818a = aVar;
            return this;
        }
    }

    public static abstract class AbstractC4936b {

        public static abstract class AbstractC4937a {
            public abstract AbstractC4936b mo24419a();

            public abstract AbstractC4937a mo24418b(long j);

            public abstract AbstractC4937a mo24417c(Set<EnumC4938c> set);

            public abstract AbstractC4937a mo24416d(long j);
        }

        public static AbstractC4937a m24423a() {
            return new C4929d.C4931b().mo24417c(Collections.emptySet());
        }

        public abstract long mo24422b();

        public abstract Set<EnumC4938c> mo24421c();

        public abstract long mo24420d();
    }

    public enum EnumC4938c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static C4935a m24435b() {
        return new C4935a();
    }

    public static AbstractC4934g m24433d(AbstractC6045a aVar, Map<EnumC10354d, AbstractC4936b> map) {
        return new C4928c(aVar, map);
    }

    public static AbstractC4934g m24431f(AbstractC6045a aVar) {
        return m24435b().m24426a(EnumC10354d.DEFAULT, AbstractC4936b.m24423a().mo24418b(30000L).mo24416d(86400000L).mo24419a()).m24426a(EnumC10354d.HIGHEST, AbstractC4936b.m24423a().mo24418b(1000L).mo24416d(86400000L).mo24419a()).m24426a(EnumC10354d.VERY_LOW, AbstractC4936b.m24423a().mo24418b(86400000L).mo24416d(86400000L).mo24417c(m24428i(EnumC4938c.NETWORK_UNMETERED, EnumC4938c.DEVICE_IDLE)).mo24419a()).m24424c(aVar).m24425b();
    }

    public static <T> Set<T> m24428i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long m24436a(int i, long j) {
        int i2;
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2)));
    }

    public JobInfo.Builder m24434c(JobInfo.Builder builder, EnumC10354d dVar, long j, int i) {
        builder.setMinimumLatency(m24430g(dVar, j, i));
        m24427j(builder, mo24429h().get(dVar).mo24421c());
        return builder;
    }

    public abstract AbstractC6045a mo24432e();

    public long m24430g(EnumC10354d dVar, long j, int i) {
        long a = j - mo24432e().mo21443a();
        AbstractC4936b bVar = mo24429h().get(dVar);
        return Math.min(Math.max(m24436a(i, bVar.mo24422b()), a), bVar.mo24420d());
    }

    public abstract Map<EnumC10354d, AbstractC4936b> mo24429h();

    public final void m24427j(JobInfo.Builder builder, Set<EnumC4938c> set) {
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
