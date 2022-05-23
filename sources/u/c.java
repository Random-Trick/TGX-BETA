package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import b1.h;
import java.util.Objects;

public class c extends f {

    public static final class a {
        public final OutputConfiguration f23432a;
        public String f23433b;
        public boolean f23434c;

        public a(OutputConfiguration outputConfiguration) {
            this.f23432a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f23432a, aVar.f23432a) && this.f23434c == aVar.f23434c && Objects.equals(this.f23433b, aVar.f23433b);
        }

        public int hashCode() {
            int hashCode = this.f23432a.hashCode() ^ 31;
            int i10 = (this.f23434c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f23433b;
            return (str == null ? 0 : str.hashCode()) ^ i11;
        }
    }

    public c(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    public static c e(OutputConfiguration outputConfiguration) {
        return new c(new a(outputConfiguration));
    }

    @Override
    public String a() {
        return ((a) this.f23437a).f23433b;
    }

    @Override
    public Surface b() {
        return ((OutputConfiguration) d()).getSurface();
    }

    @Override
    public void c(String str) {
        ((a) this.f23437a).f23433b = str;
    }

    @Override
    public Object d() {
        h.a(this.f23437a instanceof a);
        return ((a) this.f23437a).f23432a;
    }

    public c(Object obj) {
        super(obj);
    }
}
