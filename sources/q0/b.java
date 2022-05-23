package q0;

import android.content.LocusId;
import android.os.Build;
import b1.h;

public final class b {
    public final String f21198a;
    public final LocusId f21199b;

    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }
    }

    public b(String str) {
        this.f21198a = (String) h.i(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21199b = a.a(str);
        } else {
            this.f21199b = null;
        }
    }

    public String a() {
        return this.f21198a;
    }

    public final String b() {
        int length = this.f21198a.length();
        return length + "_chars";
    }

    public LocusId c() {
        return this.f21199b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f21198a;
        if (str == null) {
            return bVar.f21198a == null;
        }
        return str.equals(bVar.f21198a);
    }

    public int hashCode() {
        String str = this.f21198a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
