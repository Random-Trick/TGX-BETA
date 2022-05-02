package p202o6;

public final class C7723m0 extends AbstractC7691f3 {
    public final int f24759a;
    public final String f24760b;
    public final long f24761c;
    public final long f24762d;
    public final int f24763e;

    public C7723m0(int i, String str, long j, long j2, int i2) {
        this.f24759a = i;
        this.f24760b = str;
        this.f24761c = j;
        this.f24762d = j2;
        this.f24763e = i2;
    }

    @Override
    public final int mo15172a() {
        return this.f24759a;
    }

    @Override
    public final int mo15171b() {
        return this.f24763e;
    }

    @Override
    public final long mo15170c() {
        return this.f24761c;
    }

    @Override
    public final long mo15169d() {
        return this.f24762d;
    }

    @Override
    public final String mo15168e() {
        return this.f24760b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7691f3) {
            AbstractC7691f3 f3Var = (AbstractC7691f3) obj;
            if (this.f24759a == f3Var.mo15172a() && ((str = this.f24760b) != null ? str.equals(f3Var.mo15168e()) : f3Var.mo15168e() == null) && this.f24761c == f3Var.mo15170c() && this.f24762d == f3Var.mo15169d() && this.f24763e == f3Var.mo15171b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f24759a ^ 1000003) * 1000003;
        String str = this.f24760b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f24761c;
        long j2 = this.f24762d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f24763e;
    }

    public final String toString() {
        int i = this.f24759a;
        String str = this.f24760b;
        long j = this.f24761c;
        long j2 = this.f24762d;
        int i2 = this.f24763e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j);
        sb2.append(", remainingBytes=");
        sb2.append(j2);
        sb2.append(", previousChunk=");
        sb2.append(i2);
        sb2.append("}");
        return sb2.toString();
    }
}
