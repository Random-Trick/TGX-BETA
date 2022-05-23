package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

public final class b {
    public final a f23431a;

    public interface a {
        String a();

        Surface b();

        void c(String str);

        Object d();
    }

    public b(Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f23431a = new e(surface);
        } else if (i10 >= 26) {
            this.f23431a = new d(surface);
        } else if (i10 >= 24) {
            this.f23431a = new c(surface);
        } else {
            this.f23431a = new f(surface);
        }
    }

    public static b e(Object obj) {
        a aVar;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            aVar = e.g((OutputConfiguration) obj);
        } else if (i10 >= 26) {
            aVar = d.f((OutputConfiguration) obj);
        } else if (i10 >= 24) {
            aVar = c.e((OutputConfiguration) obj);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return new b(aVar);
    }

    public String a() {
        return this.f23431a.a();
    }

    public Surface b() {
        return this.f23431a.b();
    }

    public void c(String str) {
        this.f23431a.c(str);
    }

    public Object d() {
        return this.f23431a.d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f23431a.equals(((b) obj).f23431a);
    }

    public int hashCode() {
        return this.f23431a.hashCode();
    }

    public b(a aVar) {
        this.f23431a = aVar;
    }
}
