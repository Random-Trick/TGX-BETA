package z6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;

public final class l {

    public static class b<T> implements k<T>, Serializable {
        public final List<? extends k<? super T>> f27018a;

        @Override
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f27018a.size(); i10++) {
                if (!this.f27018a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof b) {
                return this.f27018a.equals(((b) obj).f27018a);
            }
            return false;
        }

        public int hashCode() {
            return this.f27018a.hashCode() + 306654252;
        }

        public String toString() {
            return l.d("and", this.f27018a);
        }

        public b(List<? extends k<? super T>> list) {
            this.f27018a = list;
        }
    }

    public static <T> k<T> b(k<? super T> kVar, k<? super T> kVar2) {
        return new b(c((k) j.i(kVar), (k) j.i(kVar2)));
    }

    public static <T> List<k<? super T>> c(k<? super T> kVar, k<? super T> kVar2) {
        return Arrays.asList(kVar, kVar2);
    }

    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
