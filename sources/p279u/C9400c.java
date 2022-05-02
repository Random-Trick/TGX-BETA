package p279u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import p016b1.C1132h;

public class C9400c extends C9405f {

    public static final class C9401a {
        public final OutputConfiguration f30442a;
        public String f30443b;
        public boolean f30444c;

        public C9401a(OutputConfiguration outputConfiguration) {
            this.f30442a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9401a)) {
                return false;
            }
            C9401a aVar = (C9401a) obj;
            return Objects.equals(this.f30442a, aVar.f30442a) && this.f30444c == aVar.f30444c && Objects.equals(this.f30443b, aVar.f30443b);
        }

        public int hashCode() {
            int hashCode = this.f30442a.hashCode() ^ 31;
            int i = (this.f30444c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i2 = (i << 5) - i;
            String str = this.f30443b;
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
        return ((C9401a) this.f30447a).f30443b;
    }

    @Override
    public Surface mo8789b() {
        return ((OutputConfiguration) mo8787d()).getSurface();
    }

    @Override
    public void mo8788c(String str) {
        ((C9401a) this.f30447a).f30443b = str;
    }

    @Override
    public Object mo8787d() {
        C1132h.m38329a(this.f30447a instanceof C9401a);
        return ((C9401a) this.f30447a).f30442a;
    }

    public C9400c(Object obj) {
        super(obj);
    }
}
