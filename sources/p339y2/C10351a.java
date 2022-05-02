package p339y2;

import java.util.Objects;

public final class C10351a<T> extends AbstractC10353c<T> {
    public final Integer f33227a;
    public final T f33228b;
    public final EnumC10354d f33229c;

    public C10351a(Integer num, T t, EnumC10354d dVar) {
        this.f33227a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f33228b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f33229c = dVar;
    }

    @Override
    public Integer mo5367a() {
        return this.f33227a;
    }

    @Override
    public T mo5366b() {
        return this.f33228b;
    }

    @Override
    public EnumC10354d mo5365c() {
        return this.f33229c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10353c)) {
            return false;
        }
        AbstractC10353c cVar = (AbstractC10353c) obj;
        Integer num = this.f33227a;
        if (num != null ? num.equals(cVar.mo5367a()) : cVar.mo5367a() == null) {
            if (this.f33228b.equals(cVar.mo5366b()) && this.f33229c.equals(cVar.mo5365c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f33227a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f33228b.hashCode()) * 1000003) ^ this.f33229c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f33227a + ", payload=" + this.f33228b + ", priority=" + this.f33229c + "}";
    }
}
