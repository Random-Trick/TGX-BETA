package t3;

import b5.h;
import c5.b0;
import java.util.Arrays;
import m3.q1;

public interface t {

    public static final class a {
        public final int f22903a;
        public final byte[] f22904b;
        public final int f22905c;
        public final int f22906d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f22903a = i10;
            this.f22904b = bArr;
            this.f22905c = i11;
            this.f22906d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22903a == aVar.f22903a && this.f22905c == aVar.f22905c && this.f22906d == aVar.f22906d && Arrays.equals(this.f22904b, aVar.f22904b);
        }

        public int hashCode() {
            return (((((this.f22903a * 31) + Arrays.hashCode(this.f22904b)) * 31) + this.f22905c) * 31) + this.f22906d;
        }
    }

    void a(q1 q1Var);

    int b(h hVar, int i10, boolean z10);

    int c(h hVar, int i10, boolean z10, int i11);

    void d(b0 b0Var, int i10);

    void e(b0 b0Var, int i10, int i11);

    void f(long j10, int i10, int i11, int i12, a aVar);
}
