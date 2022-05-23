package d5;

import android.os.Bundle;
import java.util.Arrays;
import m3.h;
import org.checkerframework.dataflow.qual.Pure;

public final class c implements h {
    public static final h.a<c> O = b.f6206a;
    public final byte[] M;
    public int N;
    public final int f6210a;
    public final int f6211b;
    public final int f6212c;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f6210a = i10;
        this.f6211b = i11;
        this.f6212c = i12;
        this.M = bArr;
    }

    @Pure
    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public static c e(Bundle bundle) {
        return new c(bundle.getInt(d(0), -1), bundle.getInt(d(1), -1), bundle.getInt(d(2), -1), bundle.getByteArray(d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6210a == cVar.f6210a && this.f6211b == cVar.f6211b && this.f6212c == cVar.f6212c && Arrays.equals(this.M, cVar.M);
    }

    public int hashCode() {
        if (this.N == 0) {
            this.N = ((((((527 + this.f6210a) * 31) + this.f6211b) * 31) + this.f6212c) * 31) + Arrays.hashCode(this.M);
        }
        return this.N;
    }

    public String toString() {
        int i10 = this.f6210a;
        int i11 = this.f6211b;
        int i12 = this.f6212c;
        boolean z10 = this.M != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
