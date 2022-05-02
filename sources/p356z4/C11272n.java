package p356z4;

import java.util.Arrays;

public final class C11272n {
    public final int f36130a;
    public final AbstractC11271m[] f36131b;
    public int f36132c;

    public C11272n(AbstractC11271m... mVarArr) {
        this.f36131b = mVarArr;
        this.f36130a = mVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11272n.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f36131b, ((C11272n) obj).f36131b);
    }

    public int hashCode() {
        if (this.f36132c == 0) {
            this.f36132c = 527 + Arrays.hashCode(this.f36131b);
        }
        return this.f36132c;
    }
}
