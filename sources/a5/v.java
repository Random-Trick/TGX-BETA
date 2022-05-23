package a5;

import java.util.Arrays;

public final class v {
    public final int f540a;
    public final u[] f541b;
    public int f542c;

    public v(u... uVarArr) {
        this.f541b = uVarArr;
        this.f540a = uVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f541b, ((v) obj).f541b);
    }

    public int hashCode() {
        if (this.f542c == 0) {
            this.f542c = 527 + Arrays.hashCode(this.f541b);
        }
        return this.f542c;
    }
}
