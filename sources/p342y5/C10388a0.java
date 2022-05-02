package p342y5;

import java.lang.annotation.Annotation;

public final class C10388a0 implements AbstractC10398f0 {
    public final int f33436a;
    public final EnumC10396e0 f33437b;

    public C10388a0(int i, EnumC10396e0 e0Var) {
        this.f33436a = i;
        this.f33437b = e0Var;
    }

    @Override
    public final Class<? extends Annotation> annotationType() {
        return AbstractC10398f0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10398f0)) {
            return false;
        }
        AbstractC10398f0 f0Var = (AbstractC10398f0) obj;
        return this.f33436a == f0Var.zza() && this.f33437b.equals(f0Var.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f33436a ^ 14552422) + (this.f33437b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f33436a + "intEncoding=" + this.f33437b + ')';
    }

    @Override
    public final int zza() {
        return this.f33436a;
    }

    @Override
    public final EnumC10396e0 zzb() {
        return this.f33437b;
    }
}
