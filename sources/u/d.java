package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import b1.h;
import java.util.Objects;

public class d extends c {

    public static final class a {
        public final OutputConfiguration f23435a;
        public String f23436b;

        public a(OutputConfiguration outputConfiguration) {
            this.f23435a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f23435a, aVar.f23435a) && Objects.equals(this.f23436b, aVar.f23436b);
        }

        public int hashCode() {
            int hashCode = this.f23435a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f23436b;
            return (str == null ? 0 : str.hashCode()) ^ i10;
        }
    }

    public d(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    public static d f(OutputConfiguration outputConfiguration) {
        return new d(new a(outputConfiguration));
    }

    @Override
    public String a() {
        return ((a) this.f23437a).f23436b;
    }

    @Override
    public void c(String str) {
        ((a) this.f23437a).f23436b = str;
    }

    @Override
    public Object d() {
        h.a(this.f23437a instanceof a);
        return ((a) this.f23437a).f23435a;
    }

    public d(Object obj) {
        super(obj);
    }
}
