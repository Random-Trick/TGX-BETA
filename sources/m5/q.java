package m5;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class q {

    public static final class a {
        public final List<String> f17249a = new ArrayList();
        public final Object f17250b;

        public a(Object obj, z0 z0Var) {
            r.k(obj);
            this.f17250b = obj;
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.f17249a;
            r.k(str);
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
            sb2.append(this.f17250b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f17249a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.f17249a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    public static a c(@RecentlyNonNull Object obj) {
        return new a(obj, null);
    }
}
