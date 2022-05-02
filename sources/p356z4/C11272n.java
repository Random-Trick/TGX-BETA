package p356z4;

import java.util.Arrays;

public final class C11272n {
    public final int f36127a;
    public final AbstractC11271m[] f36128b;
    public int f36129c;

    public C11272n(AbstractC11271m... mVarArr) {
        this.f36128b = mVarArr;
        this.f36127a = mVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11272n.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f36128b, ((C11272n) obj).f36128b);
    }

    public int hashCode() {
        if (this.f36129c == 0) {
            this.f36129c = 527 + Arrays.hashCode(this.f36128b);
        }
        return this.f36129c;
    }
}
