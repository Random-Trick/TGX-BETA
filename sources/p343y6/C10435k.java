package p343y6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C10435k {

    public static class C10437b<T> implements AbstractC10434j<T>, Serializable {
        public final List<? extends AbstractC10434j<? super T>> f33502a;

        @Override
        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.f33502a.size(); i++) {
                if (!this.f33502a.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C10437b) {
                return this.f33502a.equals(((C10437b) obj).f33502a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33502a.hashCode() + 306654252;
        }

        public String toString() {
            return C10435k.m5119d("and", this.f33502a);
        }

        public C10437b(List<? extends AbstractC10434j<? super T>> list) {
            this.f33502a = list;
        }
    }

    public static <T> AbstractC10434j<T> m5121b(AbstractC10434j<? super T> jVar, AbstractC10434j<? super T> jVar2) {
        return new C10437b(m5120c((AbstractC10434j) C10433i.m5129i(jVar), (AbstractC10434j) C10433i.m5129i(jVar2)));
    }

    public static <T> List<AbstractC10434j<? super T>> m5120c(AbstractC10434j<? super T> jVar, AbstractC10434j<? super T> jVar2) {
        return Arrays.asList(jVar, jVar2);
    }

    public static String m5119d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb2.append(',');
            }
            sb2.append(obj);
            z = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
