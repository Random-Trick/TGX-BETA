package p032c5;

import android.os.Bundle;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import p174m3.AbstractC6609h;

public final class C1608c implements AbstractC6609h {
    public static final AbstractC6609h.AbstractC6610a<C1608c> f5889O = C1606b.f5882a;
    public final byte[] f5890M;
    public int f5891N;
    public final int f5892a;
    public final int f5893b;
    public final int f5894c;

    public C1608c(int i, int i2, int i3, byte[] bArr) {
        this.f5892a = i;
        this.f5893b = i2;
        this.f5894c = i3;
        this.f5890M = bArr;
    }

    @Pure
    public static int m36291b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int m36290c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String m36289d(int i) {
        return Integer.toString(i, 36);
    }

    public static C1608c m36288e(Bundle bundle) {
        return new C1608c(bundle.getInt(m36289d(0), -1), bundle.getInt(m36289d(1), -1), bundle.getInt(m36289d(2), -1), bundle.getByteArray(m36289d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1608c.class != obj.getClass()) {
            return false;
        }
        C1608c cVar = (C1608c) obj;
        return this.f5892a == cVar.f5892a && this.f5893b == cVar.f5893b && this.f5894c == cVar.f5894c && Arrays.equals(this.f5890M, cVar.f5890M);
    }

    public int hashCode() {
        if (this.f5891N == 0) {
            this.f5891N = ((((((527 + this.f5892a) * 31) + this.f5893b) * 31) + this.f5894c) * 31) + Arrays.hashCode(this.f5890M);
        }
        return this.f5891N;
    }

    public String toString() {
        int i = this.f5892a;
        int i2 = this.f5893b;
        int i3 = this.f5894c;
        boolean z = this.f5890M != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(i3);
        sb2.append(", ");
        sb2.append(z);
        sb2.append(")");
        return sb2.toString();
    }
}
