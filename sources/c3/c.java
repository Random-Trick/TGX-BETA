package c3;

import android.content.Context;
import java.util.Objects;
import k3.a;

public final class c extends h {
    public final Context f4405a;
    public final a f4406b;
    public final a f4407c;
    public final String f4408d;

    public c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f4405a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f4406b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f4407c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f4408d = str;
    }

    @Override
    public Context b() {
        return this.f4405a;
    }

    @Override
    public String c() {
        return this.f4408d;
    }

    @Override
    public a d() {
        return this.f4407c;
    }

    @Override
    public a e() {
        return this.f4406b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4405a.equals(hVar.b()) && this.f4406b.equals(hVar.e()) && this.f4407c.equals(hVar.d()) && this.f4408d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f4405a.hashCode() ^ 1000003) * 1000003) ^ this.f4406b.hashCode()) * 1000003) ^ this.f4407c.hashCode()) * 1000003) ^ this.f4408d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f4405a + ", wallClock=" + this.f4406b + ", monotonicClock=" + this.f4407c + ", backendName=" + this.f4408d + "}";
    }
}
