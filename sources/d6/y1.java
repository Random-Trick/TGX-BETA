package d6;

import java.lang.annotation.Annotation;

public final class y1 implements e2 {
    public final int f7129a;
    public final d2 f7130b;

    public y1(int i10, d2 d2Var) {
        this.f7129a = i10;
        this.f7130b = d2Var;
    }

    @Override
    public final Class<? extends Annotation> annotationType() {
        return e2.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f7129a == e2Var.zza() && this.f7130b.equals(e2Var.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f7129a ^ 14552422) + (this.f7130b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7129a + "intEncoding=" + this.f7130b + ')';
    }

    @Override
    public final int zza() {
        return this.f7129a;
    }

    @Override
    public final d2 zzb() {
        return this.f7130b;
    }
}
