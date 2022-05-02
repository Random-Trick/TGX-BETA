package p163l5;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C6374q {

    public static final class C6375a {
        public final List<String> f20009a = new ArrayList();
        public final Object f20010b;

        public C6375a(Object obj, C6401z0 z0Var) {
            C6378r.m20507k(obj);
            this.f20010b = obj;
        }

        @RecentlyNonNull
        public C6375a m20522a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.f20009a;
            C6378r.m20507k(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            list.add(sb2.toString());
            return this;
        }

        @RecentlyNonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f20010b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f20009a.size();
            for (int i = 0; i < size; i++) {
                sb2.append(this.f20009a.get(i));
                if (i < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean m20525a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int m20524b(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    public static C6375a m20523c(@RecentlyNonNull Object obj) {
        return new C6375a(obj, null);
    }
}
