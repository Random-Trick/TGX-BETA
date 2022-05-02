package p339y2;

import java.util.Objects;

public final class C10352b {
    public final String f33230a;

    public C10352b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f33230a = str;
    }

    public static C10352b m5368b(String str) {
        return new C10352b(str);
    }

    public String m5369a() {
        return this.f33230a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10352b)) {
            return false;
        }
        return this.f33230a.equals(((C10352b) obj).f33230a);
    }

    public int hashCode() {
        return this.f33230a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f33230a + "\"}";
    }
}
