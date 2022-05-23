package u;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

public final class a {
    public final c f23429a;

    public static class C0220a implements c {
        public final InputConfiguration f23430a;

        public C0220a(Object obj) {
            this.f23430a = (InputConfiguration) obj;
        }

        @Override
        public Object a() {
            return this.f23430a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f23430a, ((c) obj).a());
        }

        public int hashCode() {
            return this.f23430a.hashCode();
        }

        public String toString() {
            return this.f23430a.toString();
        }
    }

    public static final class b extends C0220a {
        public b(Object obj) {
            super(obj);
        }
    }

    public interface c {
        Object a();
    }

    public a(c cVar) {
        this.f23429a = cVar;
    }

    public static a b(Object obj) {
        int i10;
        if (obj == null || (i10 = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        if (i10 >= 31) {
            return new a(new b(obj));
        }
        return new a(new C0220a(obj));
    }

    public Object a() {
        return this.f23429a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f23429a.equals(((a) obj).f23429a);
    }

    public int hashCode() {
        return this.f23429a.hashCode();
    }

    public String toString() {
        return this.f23429a.toString();
    }
}
