package f2;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class c {
    public final Set<a> f11807a = new HashSet();

    public static final class a {
        public final Uri f11808a;
        public final boolean f11809b;

        public a(Uri uri, boolean z10) {
            this.f11808a = uri;
            this.f11809b = z10;
        }

        public Uri a() {
            return this.f11808a;
        }

        public boolean b() {
            return this.f11809b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11809b == aVar.f11809b && this.f11808a.equals(aVar.f11808a);
        }

        public int hashCode() {
            return (this.f11808a.hashCode() * 31) + (this.f11809b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f11807a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f11807a;
    }

    public int c() {
        return this.f11807a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f11807a.equals(((c) obj).f11807a);
    }

    public int hashCode() {
        return this.f11807a.hashCode();
    }
}
