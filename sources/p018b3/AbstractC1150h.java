package p018b3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p018b3.C1135a;

public abstract class AbstractC1150h {

    public static abstract class AbstractC1151a {
        public final AbstractC1151a m38296a(String str, int i) {
            mo38292e().put(str, String.valueOf(i));
            return this;
        }

        public final AbstractC1151a m38295b(String str, long j) {
            mo38292e().put(str, String.valueOf(j));
            return this;
        }

        public final AbstractC1151a m38294c(String str, String str2) {
            mo38292e().put(str, str2);
            return this;
        }

        public abstract AbstractC1150h mo38293d();

        public abstract Map<String, String> mo38292e();

        public abstract AbstractC1151a mo38291f(Map<String, String> map);

        public abstract AbstractC1151a mo38290g(Integer num);

        public abstract AbstractC1151a mo38289h(C1149g gVar);

        public abstract AbstractC1151a mo38288i(long j);

        public abstract AbstractC1151a mo38287j(String str);

        public abstract AbstractC1151a mo38286k(long j);
    }

    public static AbstractC1151a m38308a() {
        return new C1135a.C1137b().mo38291f(new HashMap());
    }

    public final String m38307b(String str) {
        String str2 = mo38306c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> mo38306c();

    public abstract Integer mo38305d();

    public abstract C1149g mo38304e();

    public abstract long mo38303f();

    public final int m38302g(String str) {
        String str2 = mo38306c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long m38301h(String str) {
        String str2 = mo38306c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> m38300i() {
        return Collections.unmodifiableMap(mo38306c());
    }

    public abstract String mo38299j();

    public abstract long mo38298k();

    public AbstractC1151a m38297l() {
        return new C1135a.C1137b().mo38287j(mo38299j()).mo38290g(mo38305d()).mo38289h(mo38304e()).mo38288i(mo38303f()).mo38286k(mo38298k()).mo38291f(new HashMap(mo38306c()));
    }
}
