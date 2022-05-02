package p227q0;

import android.content.LocusId;
import android.os.Build;
import p016b1.C1132h;

public final class C8125b {
    public final String f26406a;
    public final LocusId f26407b;

    public static class C8126a {
        public static LocusId m13410a(String str) {
            return new LocusId(str);
        }
    }

    public C8125b(String str) {
        this.f26406a = (String) C1132h.m38321i(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26407b = C8126a.m13410a(str);
        } else {
            this.f26407b = null;
        }
    }

    public String m13413a() {
        return this.f26406a;
    }

    public final String m13412b() {
        int length = this.f26406a.length();
        return length + "_chars";
    }

    public LocusId m13411c() {
        return this.f26407b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8125b.class != obj.getClass()) {
            return false;
        }
        C8125b bVar = (C8125b) obj;
        String str = this.f26406a;
        if (str == null) {
            return bVar.f26406a == null;
        }
        return str.equals(bVar.f26406a);
    }

    public int hashCode() {
        String str = this.f26406a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + m13412b() + "]";
    }
}
