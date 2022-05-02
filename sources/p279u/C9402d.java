package p279u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import p016b1.C1132h;

public class C9402d extends C9400c {

    public static final class C9403a {
        public final OutputConfiguration f30445a;
        public String f30446b;

        public C9403a(OutputConfiguration outputConfiguration) {
            this.f30445a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9403a)) {
                return false;
            }
            C9403a aVar = (C9403a) obj;
            return Objects.equals(this.f30445a, aVar.f30445a) && Objects.equals(this.f30446b, aVar.f30446b);
        }

        public int hashCode() {
            int hashCode = this.f30445a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            String str = this.f30446b;
            return (str == null ? 0 : str.hashCode()) ^ i;
        }
    }

    public C9402d(Surface surface) {
        this(new C9403a(new OutputConfiguration(surface)));
    }

    public static C9402d m8792f(OutputConfiguration outputConfiguration) {
        return new C9402d(new C9403a(outputConfiguration));
    }

    @Override
    public String mo8790a() {
        return ((C9403a) this.f30447a).f30446b;
    }

    @Override
    public void mo8788c(String str) {
        ((C9403a) this.f30447a).f30446b = str;
    }

    @Override
    public Object mo8787d() {
        C1132h.m38329a(this.f30447a instanceof C9403a);
        return ((C9403a) this.f30447a).f30445a;
    }

    public C9402d(Object obj) {
        super(obj);
    }
}
