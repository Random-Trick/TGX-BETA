package y2;

import java.util.Objects;

public final class a<T> extends c<T> {
    public final Integer f26486a;
    public final T f26487b;
    public final d f26488c;

    public a(Integer num, T t10, d dVar) {
        this.f26486a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f26487b = t10;
        Objects.requireNonNull(dVar, "Null priority");
        this.f26488c = dVar;
    }

    @Override
    public Integer a() {
        return this.f26486a;
    }

    @Override
    public T b() {
        return this.f26487b;
    }

    @Override
    public d c() {
        return this.f26488c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f26486a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f26487b.equals(cVar.b()) && this.f26488c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f26486a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f26487b.hashCode()) * 1000003) ^ this.f26488c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f26486a + ", payload=" + this.f26487b + ", priority=" + this.f26488c + "}";
    }
}
