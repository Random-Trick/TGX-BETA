package p227q0;

import android.content.LocusId;
import android.os.Build;
import p016b1.C1132h;

public final class C8125b {
    public final String f26403a;
    public final LocusId f26404b;

    public static class C8126a {
        public static LocusId m13411a(String str) {
            return new LocusId(str);
        }
    }

    public C8125b(String str) {
        this.f26403a = (String) C1132h.m38318i(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26404b = C8126a.m13411a(str);
        } else {
            this.f26404b = null;
        }
    }

    public String m13414a() {
        return this.f26403a;
    }

    public final String m13413b() {
        int length = this.f26403a.length();
        return length + "_chars";
    }

    public LocusId m13412c() {
        return this.f26404b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8125b.class != obj.getClass()) {
            return false;
        }
        C8125b bVar = (C8125b) obj;
        String str = this.f26403a;
        if (str == null) {
            return bVar.f26403a == null;
        }
        return str.equals(bVar.f26403a);
    }

    public int hashCode() {
        String str = this.f26403a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + m13413b() + "]";
    }
}
