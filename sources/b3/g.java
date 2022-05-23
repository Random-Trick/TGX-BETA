package b3;

import java.util.Arrays;
import java.util.Objects;
import y2.b;

public final class g {
    public final b f3730a;
    public final byte[] f3731b;

    public g(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f3730a = bVar;
        this.f3731b = bArr;
    }

    public byte[] a() {
        return this.f3731b;
    }

    public b b() {
        return this.f3730a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f3730a.equals(gVar.f3730a)) {
            return false;
        }
        return Arrays.equals(this.f3731b, gVar.f3731b);
    }

    public int hashCode() {
        return ((this.f3730a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3731b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f3730a + ", bytes=[...]}";
    }
}
