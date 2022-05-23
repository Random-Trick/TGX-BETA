package y2;

import java.util.Objects;

public final class b {
    public final String f26489a;

    public b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f26489a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f26489a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f26489a.equals(((b) obj).f26489a);
    }

    public int hashCode() {
        return this.f26489a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f26489a + "\"}";
    }
}
