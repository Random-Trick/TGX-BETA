package t3;

public final class r {
    public static final r f22900c = new r(0, 0);
    public final long f22901a;
    public final long f22902b;

    public r(long j10, long j11) {
        this.f22901a = j10;
        this.f22902b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f22901a == rVar.f22901a && this.f22902b == rVar.f22902b;
    }

    public int hashCode() {
        return (((int) this.f22901a) * 31) + ((int) this.f22902b);
    }

    public String toString() {
        long j10 = this.f22901a;
        long j11 = this.f22902b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j10);
        sb2.append(", position=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}
