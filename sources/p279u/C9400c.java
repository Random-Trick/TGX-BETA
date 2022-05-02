package p279u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import p016b1.C1132h;

public class C9400c extends C9405f {

    public static final class C9401a {
        public final OutputConfiguration f30439a;
        public String f30440b;
        public boolean f30441c;

        public C9401a(OutputConfiguration outputConfiguration) {
            this.f30439a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9401a)) {
                return false;
            }
            C9401a aVar = (C9401a) obj;
            return Objects.equals(this.f30439a, aVar.f30439a) && this.f30441c == aVar.f30441c && Objects.equals(this.f30440b, aVar.f30440b);
        }

        public int hashCode() {
            int hashCode = this.f30439a.hashCode() ^ 31;
            int i = (this.f30441c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i2 = (i << 5) - i;
            String str = this.f30440b;
            return (str == null ? 0 : str.hashCode()) ^ i2;
        }
    }

    public C9400c(Surface surface) {
        this(new C9401a(new OutputConfiguration(surface)));
    }

    public static C9400c m8793e(OutputConfiguration outputConfiguration) {
        return new C9400c(new C9401a(outputConfiguration));
    }

    @Override
    public String mo8790a() {
        return ((C9401a) this.f30444a).f30440b;
    }

    @Override
    public Surface mo8789b() {
        return ((OutputConfiguration) mo8787d()).getSurface();
    }

    @Override
    public void mo8788c(String str) {
        ((C9401a) this.f30444a).f30440b = str;
    }

    @Override
    public Object mo8787d() {
        C1132h.m38326a(this.f30444a instanceof C9401a);
        return ((C9401a) this.f30444a).f30439a;
    }

    public C9400c(Object obj) {
        super(obj);
    }
}
