package p046d6;

import java.lang.annotation.Annotation;

public final class C3653d8 implements AbstractC3703i8 {
    public final int f12410a;
    public final EnumC3693h8 f12411b;

    public C3653d8(int i, EnumC3693h8 h8Var) {
        this.f12410a = i;
        this.f12411b = h8Var;
    }

    @Override
    public final Class<? extends Annotation> annotationType() {
        return AbstractC3703i8.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3703i8)) {
            return false;
        }
        AbstractC3703i8 i8Var = (AbstractC3703i8) obj;
        return this.f12410a == i8Var.zza() && this.f12411b.equals(i8Var.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f12410a ^ 14552422) + (this.f12411b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f12410a + "intEncoding=" + this.f12411b + ')';
    }

    @Override
    public final int zza() {
        return this.f12410a;
    }

    @Override
    public final EnumC3693h8 zzb() {
        return this.f12411b;
    }
}
