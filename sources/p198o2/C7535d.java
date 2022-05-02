package p198o2;

public class C7535d {
    public String f24115a;
    public Long f24116b;

    public C7535d(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7535d)) {
            return false;
        }
        C7535d dVar = (C7535d) obj;
        if (!this.f24115a.equals(dVar.f24115a)) {
            return false;
        }
        Long l = this.f24116b;
        Long l2 = dVar.f24116b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int hashCode = this.f24115a.hashCode() * 31;
        Long l = this.f24116b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public C7535d(String str, long j) {
        this.f24115a = str;
        this.f24116b = Long.valueOf(j);
    }
}
