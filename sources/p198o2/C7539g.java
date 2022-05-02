package p198o2;

public class C7539g {
    public final String f24120a;
    public final int f24121b;

    public C7539g(String str, int i) {
        this.f24120a = str;
        this.f24121b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7539g)) {
            return false;
        }
        C7539g gVar = (C7539g) obj;
        if (this.f24121b != gVar.f24121b) {
            return false;
        }
        return this.f24120a.equals(gVar.f24120a);
    }

    public int hashCode() {
        return (this.f24120a.hashCode() * 31) + this.f24121b;
    }
}
