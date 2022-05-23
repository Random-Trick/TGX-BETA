package e6;

import java.lang.annotation.Annotation;

public final class d8 implements i8 {
    public final int f10698a;
    public final h8 f10699b;

    public d8(int i10, h8 h8Var) {
        this.f10698a = i10;
        this.f10699b = h8Var;
    }

    @Override
    public final Class<? extends Annotation> annotationType() {
        return i8.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.f10698a == i8Var.zza() && this.f10699b.equals(i8Var.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f10698a ^ 14552422) + (this.f10699b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f10698a + "intEncoding=" + this.f10699b + ')';
    }

    @Override
    public final int zza() {
        return this.f10698a;
    }

    @Override
    public final h8 zzb() {
        return this.f10699b;
    }
}
