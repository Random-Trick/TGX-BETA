package p071f2;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class C4225c {
    public final Set<C4226a> f14263a = new HashSet();

    public static final class C4226a {
        public final Uri f14264a;
        public final boolean f14265b;

        public C4226a(Uri uri, boolean z) {
            this.f14264a = uri;
            this.f14265b = z;
        }

        public Uri m28373a() {
            return this.f14264a;
        }

        public boolean m28372b() {
            return this.f14265b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4226a.class != obj.getClass()) {
                return false;
            }
            C4226a aVar = (C4226a) obj;
            return this.f14265b == aVar.f14265b && this.f14264a.equals(aVar.f14264a);
        }

        public int hashCode() {
            return (this.f14264a.hashCode() * 31) + (this.f14265b ? 1 : 0);
        }
    }

    public void m28376a(Uri uri, boolean z) {
        this.f14263a.add(new C4226a(uri, z));
    }

    public Set<C4226a> m28375b() {
        return this.f14263a;
    }

    public int m28374c() {
        return this.f14263a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4225c.class != obj.getClass()) {
            return false;
        }
        return this.f14263a.equals(((C4225c) obj).f14263a);
    }

    public int hashCode() {
        return this.f14263a.hashCode();
    }
}
