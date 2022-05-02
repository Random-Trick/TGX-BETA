package p202o6;

import java.util.Arrays;

public final class C7728n0 extends AbstractC7726m3 {
    public final String f24764a;
    public final long f24765b;
    public final int f24766c;
    public final boolean f24767d;
    public final boolean f24768e;
    public final byte[] f24769f;

    public C7728n0(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f24764a = str;
        this.f24765b = j;
        this.f24766c = i;
        this.f24767d = z;
        this.f24768e = z2;
        this.f24769f = bArr;
    }

    @Override
    public final int mo15165a() {
        return this.f24766c;
    }

    @Override
    public final long mo15164b() {
        return this.f24765b;
    }

    @Override
    public final String mo15163c() {
        return this.f24764a;
    }

    @Override
    public final boolean mo15162d() {
        return this.f24768e;
    }

    @Override
    public final boolean mo15161e() {
        return this.f24767d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7726m3) {
            AbstractC7726m3 m3Var = (AbstractC7726m3) obj;
            String str = this.f24764a;
            if (str != null ? str.equals(m3Var.mo15163c()) : m3Var.mo15163c() == null) {
                if (this.f24765b == m3Var.mo15164b() && this.f24766c == m3Var.mo15165a() && this.f24767d == m3Var.mo15161e() && this.f24768e == m3Var.mo15162d()) {
                    if (Arrays.equals(this.f24769f, m3Var instanceof C7728n0 ? ((C7728n0) m3Var).f24769f : m3Var.mo15160f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final byte[] mo15160f() {
        return this.f24769f;
    }

    public final int hashCode() {
        String str = this.f24764a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f24765b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f24766c) * 1000003) ^ (true != this.f24767d ? 1237 : 1231)) * 1000003;
        if (true == this.f24768e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f24769f);
    }

    public final String toString() {
        String str = this.f24764a;
        long j = this.f24765b;
        int i = this.f24766c;
        boolean z = this.f24767d;
        boolean z2 = this.f24768e;
        String arrays = Arrays.toString(this.f24769f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j);
        sb2.append(", compressionMethod=");
        sb2.append(i);
        sb2.append(", isPartial=");
        sb2.append(z);
        sb2.append(", isEndOfArchive=");
        sb2.append(z2);
        sb2.append(", headerBytes=");
        sb2.append(arrays);
        sb2.append("}");
        return sb2.toString();
    }
}
