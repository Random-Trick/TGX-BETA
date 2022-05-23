package z5;

import h7.c;
import h7.d;
import h7.h;

public final class g implements h {
    public boolean f26982a = false;
    public boolean f26983b = false;
    public d f26984c;
    public final c f26985d;

    public g(c cVar) {
        this.f26985d = cVar;
    }

    public final void a(d dVar, boolean z10) {
        this.f26982a = false;
        this.f26984c = dVar;
        this.f26983b = z10;
    }

    public final void b() {
        if (!this.f26982a) {
            this.f26982a = true;
            return;
        }
        throw new c("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override
    public final h d(String str) {
        b();
        this.f26985d.d(this.f26984c, str, this.f26983b);
        return this;
    }

    @Override
    public final h e(boolean z10) {
        b();
        this.f26985d.g(this.f26984c, z10 ? 1 : 0, this.f26983b);
        return this;
    }
}
