package p6;

public final class m0 extends f3 {
    public final int f20713a;
    public final String f20714b;
    public final long f20715c;
    public final long f20716d;
    public final int f20717e;

    public m0(int i10, String str, long j10, long j11, int i11) {
        this.f20713a = i10;
        this.f20714b = str;
        this.f20715c = j10;
        this.f20716d = j11;
        this.f20717e = i11;
    }

    @Override
    public final int a() {
        return this.f20713a;
    }

    @Override
    public final int b() {
        return this.f20717e;
    }

    @Override
    public final long c() {
        return this.f20715c;
    }

    @Override
    public final long d() {
        return this.f20716d;
    }

    @Override
    public final String e() {
        return this.f20714b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            if (this.f20713a == f3Var.a() && ((str = this.f20714b) != null ? str.equals(f3Var.e()) : f3Var.e() == null) && this.f20715c == f3Var.c() && this.f20716d == f3Var.d() && this.f20717e == f3Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f20713a ^ 1000003) * 1000003;
        String str = this.f20714b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f20715c;
        long j11 = this.f20716d;
        return ((((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f20717e;
    }

    public final String toString() {
        int i10 = this.f20713a;
        String str = this.f20714b;
        long j10 = this.f20715c;
        long j11 = this.f20716d;
        int i11 = this.f20717e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i10);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j10);
        sb2.append(", remainingBytes=");
        sb2.append(j11);
        sb2.append(", previousChunk=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
