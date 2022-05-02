package p279u;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

public final class C9398b {
    public final AbstractC9399a f30441a;

    public interface AbstractC9399a {
        String mo8790a();

        Surface mo8789b();

        void mo8788c(String str);

        Object mo8787d();
    }

    public C9398b(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f30441a = new C9404e(surface);
        } else if (i >= 26) {
            this.f30441a = new C9402d(surface);
        } else if (i >= 24) {
            this.f30441a = new C9400c(surface);
        } else {
            this.f30441a = new C9405f(surface);
        }
    }

    public static C9398b m8794e(Object obj) {
        AbstractC9399a aVar;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            aVar = C9404e.m8791g((OutputConfiguration) obj);
        } else if (i >= 26) {
            aVar = C9402d.m8792f((OutputConfiguration) obj);
        } else if (i >= 24) {
            aVar = C9400c.m8793e((OutputConfiguration) obj);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return new C9398b(aVar);
    }

    public String m8798a() {
        return this.f30441a.mo8790a();
    }

    public Surface m8797b() {
        return this.f30441a.mo8789b();
    }

    public void m8796c(String str) {
        this.f30441a.mo8788c(str);
    }

    public Object m8795d() {
        return this.f30441a.mo8787d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9398b)) {
            return false;
        }
        return this.f30441a.equals(((C9398b) obj).f30441a);
    }

    public int hashCode() {
        return this.f30441a.hashCode();
    }

    public C9398b(AbstractC9399a aVar) {
        this.f30441a = aVar;
    }
}
