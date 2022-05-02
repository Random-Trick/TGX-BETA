package p198o2;

public class C7539g {
    public final String f24117a;
    public final int f24118b;

    public C7539g(String str, int i) {
        this.f24117a = str;
        this.f24118b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7539g)) {
            return false;
        }
        C7539g gVar = (C7539g) obj;
        if (this.f24118b != gVar.f24118b) {
            return false;
        }
        return this.f24117a.equals(gVar.f24117a);
    }

    public int hashCode() {
        return (this.f24117a.hashCode() * 31) + this.f24118b;
    }
}
