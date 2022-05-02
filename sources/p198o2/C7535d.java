package p198o2;

public class C7535d {
    public String f24112a;
    public Long f24113b;

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
        if (!this.f24112a.equals(dVar.f24112a)) {
            return false;
        }
        Long l = this.f24113b;
        Long l2 = dVar.f24113b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int hashCode = this.f24112a.hashCode() * 31;
        Long l = this.f24113b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public C7535d(String str, long j) {
        this.f24112a = str;
        this.f24113b = Long.valueOf(j);
    }
}
