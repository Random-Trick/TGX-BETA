package z5;

import java.lang.annotation.Annotation;

public final class a0 implements f0 {
    public final int f26955a;
    public final e0 f26956b;

    public a0(int i10, e0 e0Var) {
        this.f26955a = i10;
        this.f26956b = e0Var;
    }

    @Override
    public final Class<? extends Annotation> annotationType() {
        return f0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f26955a == f0Var.zza() && this.f26956b.equals(f0Var.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f26955a ^ 14552422) + (this.f26956b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f26955a + "intEncoding=" + this.f26956b + ')';
    }

    @Override
    public final int zza() {
        return this.f26955a;
    }

    @Override
    public final e0 zzb() {
        return this.f26956b;
    }
}
