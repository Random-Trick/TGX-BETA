package p270t3;

public final class C8972r {
    public static final C8972r f28858c = new C8972r(0, 0);
    public final long f28859a;
    public final long f28860b;

    public C8972r(long j, long j2) {
        this.f28859a = j;
        this.f28860b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8972r.class != obj.getClass()) {
            return false;
        }
        C8972r rVar = (C8972r) obj;
        return this.f28859a == rVar.f28859a && this.f28860b == rVar.f28860b;
    }

    public int hashCode() {
        return (((int) this.f28859a) * 31) + ((int) this.f28860b);
    }

    public String toString() {
        long j = this.f28859a;
        long j2 = this.f28860b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j);
        sb2.append(", position=");
        sb2.append(j2);
        sb2.append("]");
        return sb2.toString();
    }
}
