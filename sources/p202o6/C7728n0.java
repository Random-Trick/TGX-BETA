package p202o6;

import java.util.Arrays;

public final class C7728n0 extends AbstractC7726m3 {
    public final String f24767a;
    public final long f24768b;
    public final int f24769c;
    public final boolean f24770d;
    public final boolean f24771e;
    public final byte[] f24772f;

    public C7728n0(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f24767a = str;
        this.f24768b = j;
        this.f24769c = i;
        this.f24770d = z;
        this.f24771e = z2;
        this.f24772f = bArr;
    }

    @Override
    public final int mo15165a() {
        return this.f24769c;
    }

    @Override
    public final long mo15164b() {
        return this.f24768b;
    }

    @Override
    public final String mo15163c() {
        return this.f24767a;
    }

    @Override
    public final boolean mo15162d() {
        return this.f24771e;
    }

    @Override
    public final boolean mo15161e() {
        return this.f24770d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7726m3) {
            AbstractC7726m3 m3Var = (AbstractC7726m3) obj;
            String str = this.f24767a;
            if (str != null ? str.equals(m3Var.mo15163c()) : m3Var.mo15163c() == null) {
                if (this.f24768b == m3Var.mo15164b() && this.f24769c == m3Var.mo15165a() && this.f24770d == m3Var.mo15161e() && this.f24771e == m3Var.mo15162d()) {
                    if (Arrays.equals(this.f24772f, m3Var instanceof C7728n0 ? ((C7728n0) m3Var).f24772f : m3Var.mo15160f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final byte[] mo15160f() {
        return this.f24772f;
    }

    public final int hashCode() {
        String str = this.f24767a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f24768b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f24769c) * 1000003) ^ (true != this.f24770d ? 1237 : 1231)) * 1000003;
        if (true == this.f24771e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f24772f);
    }

    public final String toString() {
        String str = this.f24767a;
        long j = this.f24768b;
        int i = this.f24769c;
        boolean z = this.f24770d;
        boolean z2 = this.f24771e;
        String arrays = Arrays.toString(this.f24772f);
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
