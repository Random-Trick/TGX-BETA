package p018b3;

import java.util.Arrays;
import java.util.Objects;
import p339y2.C10352b;

public final class C1149g {
    public final C10352b f4378a;
    public final byte[] f4379b;

    public C1149g(C10352b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f4378a = bVar;
        this.f4379b = bArr;
    }

    public byte[] m38307a() {
        return this.f4379b;
    }

    public C10352b m38306b() {
        return this.f4378a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1149g)) {
            return false;
        }
        C1149g gVar = (C1149g) obj;
        if (!this.f4378a.equals(gVar.f4378a)) {
            return false;
        }
        return Arrays.equals(this.f4379b, gVar.f4379b);
    }

    public int hashCode() {
        return ((this.f4378a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4379b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f4378a + ", bytes=[...]}";
    }
}
