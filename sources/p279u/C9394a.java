package p279u;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

public final class C9394a {
    public final AbstractC9397c f30439a;

    public static class C9395a implements AbstractC9397c {
        public final InputConfiguration f30440a;

        public C9395a(Object obj) {
            this.f30440a = (InputConfiguration) obj;
        }

        @Override
        public Object mo8799a() {
            return this.f30440a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AbstractC9397c)) {
                return false;
            }
            return Objects.equals(this.f30440a, ((AbstractC9397c) obj).mo8799a());
        }

        public int hashCode() {
            return this.f30440a.hashCode();
        }

        public String toString() {
            return this.f30440a.toString();
        }
    }

    public static final class C9396b extends C9395a {
        public C9396b(Object obj) {
            super(obj);
        }
    }

    public interface AbstractC9397c {
        Object mo8799a();
    }

    public C9394a(AbstractC9397c cVar) {
        this.f30439a = cVar;
    }

    public static C9394a m8800b(Object obj) {
        int i;
        if (obj == null || (i = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        if (i >= 31) {
            return new C9394a(new C9396b(obj));
        }
        return new C9394a(new C9395a(obj));
    }

    public Object m8801a() {
        return this.f30439a.mo8799a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9394a)) {
            return false;
        }
        return this.f30439a.equals(((C9394a) obj).f30439a);
    }

    public int hashCode() {
        return this.f30439a.hashCode();
    }

    public String toString() {
        return this.f30439a.toString();
    }
}
