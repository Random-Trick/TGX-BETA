package h3;

import h3.f;
import java.util.Map;
import java.util.Objects;
import k3.a;
import y2.d;

public final class b extends f {
    public final a f12462a;
    public final Map<d, f.b> f12463b;

    public b(a aVar, Map<d, f.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f12462a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f12463b = map;
    }

    @Override
    public a e() {
        return this.f12462a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f12462a.equals(fVar.e()) && this.f12463b.equals(fVar.h());
    }

    @Override
    public Map<d, f.b> h() {
        return this.f12463b;
    }

    public int hashCode() {
        return ((this.f12462a.hashCode() ^ 1000003) * 1000003) ^ this.f12463b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f12462a + ", values=" + this.f12463b + "}";
    }
}
