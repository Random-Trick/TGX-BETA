package o2;

public class g {
    public final String f18567a;
    public final int f18568b;

    public g(String str, int i10) {
        this.f18567a = str;
        this.f18568b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f18568b != gVar.f18568b) {
            return false;
        }
        return this.f18567a.equals(gVar.f18567a);
    }

    public int hashCode() {
        return (this.f18567a.hashCode() * 31) + this.f18568b;
    }
}
