package p030c3;

import android.content.Context;
import java.util.Objects;
import p146k3.AbstractC6045a;

public final class C1536c extends AbstractC1543h {
    public final Context f5487a;
    public final AbstractC6045a f5488b;
    public final AbstractC6045a f5489c;
    public final String f5490d;

    public C1536c(Context context, AbstractC6045a aVar, AbstractC6045a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f5487a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f5488b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f5489c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f5490d = str;
    }

    @Override
    public Context mo36502b() {
        return this.f5487a;
    }

    @Override
    public String mo36501c() {
        return this.f5490d;
    }

    @Override
    public AbstractC6045a mo36500d() {
        return this.f5489c;
    }

    @Override
    public AbstractC6045a mo36499e() {
        return this.f5488b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1543h)) {
            return false;
        }
        AbstractC1543h hVar = (AbstractC1543h) obj;
        return this.f5487a.equals(hVar.mo36502b()) && this.f5488b.equals(hVar.mo36499e()) && this.f5489c.equals(hVar.mo36500d()) && this.f5490d.equals(hVar.mo36501c());
    }

    public int hashCode() {
        return ((((((this.f5487a.hashCode() ^ 1000003) * 1000003) ^ this.f5488b.hashCode()) * 1000003) ^ this.f5489c.hashCode()) * 1000003) ^ this.f5490d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5487a + ", wallClock=" + this.f5488b + ", monotonicClock=" + this.f5489c + ", backendName=" + this.f5490d + "}";
    }
}
