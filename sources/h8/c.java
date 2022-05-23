package h8;

import i8.a;

public final class c {
    public final b f12596a;
    public a f12597b;

    public c(b bVar) {
        if (bVar != null) {
            this.f12596a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public a a() {
        if (this.f12597b == null) {
            this.f12597b = this.f12596a.a();
        }
        return this.f12597b;
    }

    public String toString() {
        try {
            return a().toString();
        } catch (h unused) {
            return "";
        }
    }
}
