package o2;

public class d {
    public String f18562a;
    public Long f18563b;

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f18562a.equals(dVar.f18562a)) {
            return false;
        }
        Long l10 = this.f18563b;
        Long l11 = dVar.f18563b;
        return l10 != null ? l10.equals(l11) : l11 == null;
    }

    public int hashCode() {
        int hashCode = this.f18562a.hashCode() * 31;
        Long l10 = this.f18563b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f18562a = str;
        this.f18563b = Long.valueOf(j10);
    }
}
