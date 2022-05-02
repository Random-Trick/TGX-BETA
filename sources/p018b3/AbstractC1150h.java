package p018b3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p018b3.C1135a;

public abstract class AbstractC1150h {

    public static abstract class AbstractC1151a {
        public final AbstractC1151a m38293a(String str, int i) {
            mo38289e().put(str, String.valueOf(i));
            return this;
        }

        public final AbstractC1151a m38292b(String str, long j) {
            mo38289e().put(str, String.valueOf(j));
            return this;
        }

        public final AbstractC1151a m38291c(String str, String str2) {
            mo38289e().put(str, str2);
            return this;
        }

        public abstract AbstractC1150h mo38290d();

        public abstract Map<String, String> mo38289e();

        public abstract AbstractC1151a mo38288f(Map<String, String> map);

        public abstract AbstractC1151a mo38287g(Integer num);

        public abstract AbstractC1151a mo38286h(C1149g gVar);

        public abstract AbstractC1151a mo38285i(long j);

        public abstract AbstractC1151a mo38284j(String str);

        public abstract AbstractC1151a mo38283k(long j);
    }

    public static AbstractC1151a m38305a() {
        return new C1135a.C1137b().mo38288f(new HashMap());
    }

    public final String m38304b(String str) {
        String str2 = mo38303c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> mo38303c();

    public abstract Integer mo38302d();

    public abstract C1149g mo38301e();

    public abstract long mo38300f();

    public final int m38299g(String str) {
        String str2 = mo38303c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long m38298h(String str) {
        String str2 = mo38303c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> m38297i() {
        return Collections.unmodifiableMap(mo38303c());
    }

    public abstract String mo38296j();

    public abstract long mo38295k();

    public AbstractC1151a m38294l() {
        return new C1135a.C1137b().mo38284j(mo38296j()).mo38287g(mo38302d()).mo38286h(mo38301e()).mo38285i(mo38300f()).mo38283k(mo38295k()).mo38288f(new HashMap(mo38303c()));
    }
}
