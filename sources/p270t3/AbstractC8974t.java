package p270t3;

import java.util.Arrays;
import p006a5.AbstractC0147h;
import p020b5.C1189b0;
import p174m3.C6600g1;

public interface AbstractC8974t {

    public static final class C8975a {
        public final int f28861a;
        public final byte[] f28862b;
        public final int f28863c;
        public final int f28864d;

        public C8975a(int i, byte[] bArr, int i2, int i3) {
            this.f28861a = i;
            this.f28862b = bArr;
            this.f28863c = i2;
            this.f28864d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8975a.class != obj.getClass()) {
                return false;
            }
            C8975a aVar = (C8975a) obj;
            return this.f28861a == aVar.f28861a && this.f28863c == aVar.f28863c && this.f28864d == aVar.f28864d && Arrays.equals(this.f28862b, aVar.f28862b);
        }

        public int hashCode() {
            return (((((this.f28861a * 31) + Arrays.hashCode(this.f28862b)) * 31) + this.f28863c) * 31) + this.f28864d;
        }
    }

    void mo10798a(C6600g1 g1Var);

    void mo10797b(C1189b0 b0Var, int i, int i2);

    void mo10796c(C1189b0 b0Var, int i);

    int mo10795d(AbstractC0147h hVar, int i, boolean z);

    void mo10794e(long j, int i, int i2, int i3, C8975a aVar);

    int mo10793f(AbstractC0147h hVar, int i, boolean z, int i2);
}
