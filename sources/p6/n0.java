package p6;

import java.util.Arrays;

public final class n0 extends m3 {
    public final String f20721a;
    public final long f20722b;
    public final int f20723c;
    public final boolean f20724d;
    public final boolean f20725e;
    public final byte[] f20726f;

    public n0(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this.f20721a = str;
        this.f20722b = j10;
        this.f20723c = i10;
        this.f20724d = z10;
        this.f20725e = z11;
        this.f20726f = bArr;
    }

    @Override
    public final int a() {
        return this.f20723c;
    }

    @Override
    public final long b() {
        return this.f20722b;
    }

    @Override
    public final String c() {
        return this.f20721a;
    }

    @Override
    public final boolean d() {
        return this.f20725e;
    }

    @Override
    public final boolean e() {
        return this.f20724d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m3) {
            m3 m3Var = (m3) obj;
            String str = this.f20721a;
            if (str != null ? str.equals(m3Var.c()) : m3Var.c() == null) {
                if (this.f20722b == m3Var.b() && this.f20723c == m3Var.a() && this.f20724d == m3Var.e() && this.f20725e == m3Var.d()) {
                    if (Arrays.equals(this.f20726f, m3Var instanceof n0 ? ((n0) m3Var).f20726f : m3Var.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final byte[] f() {
        return this.f20726f;
    }

    public final int hashCode() {
        String str = this.f20721a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f20722b;
        int i10 = 1237;
        int i11 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f20723c) * 1000003) ^ (true != this.f20724d ? 1237 : 1231)) * 1000003;
        if (true == this.f20725e) {
            i10 = 1231;
        }
        return ((i11 ^ i10) * 1000003) ^ Arrays.hashCode(this.f20726f);
    }

    public final String toString() {
        String str = this.f20721a;
        long j10 = this.f20722b;
        int i10 = this.f20723c;
        boolean z10 = this.f20724d;
        boolean z11 = this.f20725e;
        String arrays = Arrays.toString(this.f20726f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", compressionMethod=");
        sb2.append(i10);
        sb2.append(", isPartial=");
        sb2.append(z10);
        sb2.append(", isEndOfArchive=");
        sb2.append(z11);
        sb2.append(", headerBytes=");
        sb2.append(arrays);
        sb2.append("}");
        return sb2.toString();
    }
}
