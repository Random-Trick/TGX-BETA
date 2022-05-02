package p339y2;

import java.util.Objects;

public final class C10351a<T> extends AbstractC10353c<T> {
    public final Integer f33230a;
    public final T f33231b;
    public final EnumC10354d f33232c;

    public C10351a(Integer num, T t, EnumC10354d dVar) {
        this.f33230a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f33231b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f33232c = dVar;
    }

    @Override
    public Integer mo5367a() {
        return this.f33230a;
    }

    @Override
    public T mo5366b() {
        return this.f33231b;
    }

    @Override
    public EnumC10354d mo5365c() {
        return this.f33232c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10353c)) {
            return false;
        }
        AbstractC10353c cVar = (AbstractC10353c) obj;
        Integer num = this.f33230a;
        if (num != null ? num.equals(cVar.mo5367a()) : cVar.mo5367a() == null) {
            if (this.f33231b.equals(cVar.mo5366b()) && this.f33232c.equals(cVar.mo5365c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f33230a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f33231b.hashCode()) * 1000003) ^ this.f33232c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f33230a + ", payload=" + this.f33231b + ", priority=" + this.f33232c + "}";
    }
}
