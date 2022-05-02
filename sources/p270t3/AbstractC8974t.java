package p270t3;

import java.util.Arrays;
import p006a5.AbstractC0147h;
import p020b5.C1189b0;
import p174m3.C6600g1;

public interface AbstractC8974t {

    public static final class C8975a {
        public final int f28864a;
        public final byte[] f28865b;
        public final int f28866c;
        public final int f28867d;

        public C8975a(int i, byte[] bArr, int i2, int i3) {
            this.f28864a = i;
            this.f28865b = bArr;
            this.f28866c = i2;
            this.f28867d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8975a.class != obj.getClass()) {
                return false;
            }
            C8975a aVar = (C8975a) obj;
            return this.f28864a == aVar.f28864a && this.f28866c == aVar.f28866c && this.f28867d == aVar.f28867d && Arrays.equals(this.f28865b, aVar.f28865b);
        }

        public int hashCode() {
            return (((((this.f28864a * 31) + Arrays.hashCode(this.f28865b)) * 31) + this.f28866c) * 31) + this.f28867d;
        }
    }

    void mo10797a(C6600g1 g1Var);

    void mo10796b(C1189b0 b0Var, int i, int i2);

    void mo10795c(C1189b0 b0Var, int i);

    int mo10794d(AbstractC0147h hVar, int i, boolean z);

    void mo10793e(long j, int i, int i2, int i3, C8975a aVar);

    int mo10792f(AbstractC0147h hVar, int i, boolean z, int i2);
}
