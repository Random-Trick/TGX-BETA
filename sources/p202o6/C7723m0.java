package p202o6;

public final class C7723m0 extends AbstractC7691f3 {
    public final int f24756a;
    public final String f24757b;
    public final long f24758c;
    public final long f24759d;
    public final int f24760e;

    public C7723m0(int i, String str, long j, long j2, int i2) {
        this.f24756a = i;
        this.f24757b = str;
        this.f24758c = j;
        this.f24759d = j2;
        this.f24760e = i2;
    }

    @Override
    public final int mo15172a() {
        return this.f24756a;
    }

    @Override
    public final int mo15171b() {
        return this.f24760e;
    }

    @Override
    public final long mo15170c() {
        return this.f24758c;
    }

    @Override
    public final long mo15169d() {
        return this.f24759d;
    }

    @Override
    public final String mo15168e() {
        return this.f24757b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7691f3) {
            AbstractC7691f3 f3Var = (AbstractC7691f3) obj;
            if (this.f24756a == f3Var.mo15172a() && ((str = this.f24757b) != null ? str.equals(f3Var.mo15168e()) : f3Var.mo15168e() == null) && this.f24758c == f3Var.mo15170c() && this.f24759d == f3Var.mo15169d() && this.f24760e == f3Var.mo15171b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f24756a ^ 1000003) * 1000003;
        String str = this.f24757b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f24758c;
        long j2 = this.f24759d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f24760e;
    }

    public final String toString() {
        int i = this.f24756a;
        String str = this.f24757b;
        long j = this.f24758c;
        long j2 = this.f24759d;
        int i2 = this.f24760e;
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
