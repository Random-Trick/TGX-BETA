package p033c6;

import java.lang.annotation.Annotation;

public final class C1993y1 implements AbstractC1707e2 {
    public final int f7096a;
    public final EnumC1692d2 f7097b;

    public C1993y1(int i, EnumC1692d2 d2Var) {
        this.f7096a = i;
        this.f7097b = d2Var;
    }

    @Override
    public final Class<? extends Annotation> annotationType() {
        return AbstractC1707e2.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1707e2)) {
            return false;
        }
        AbstractC1707e2 e2Var = (AbstractC1707e2) obj;
        return this.f7096a == e2Var.zza() && this.f7097b.equals(e2Var.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f7096a ^ 14552422) + (this.f7097b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7096a + "intEncoding=" + this.f7097b + ')';
    }

    @Override
    public final int zza() {
        return this.f7096a;
    }

    @Override
    public final EnumC1692d2 zzb() {
        return this.f7097b;
    }
}
