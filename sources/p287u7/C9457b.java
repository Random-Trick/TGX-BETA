package p287u7;

import p342y5.AbstractC10398f0;
import p342y5.AbstractC10403k;

public final class C9457b {
    public static final C9457b f30679b = new C9458a().m8584a();
    public final C9452a f30680a;

    public static final class C9458a {
        public C9452a f30681a = null;

        public C9457b m8584a() {
            return new C9457b(this.f30681a);
        }

        public C9458a m8583b(C9452a aVar) {
            this.f30681a = aVar;
            return this;
        }
    }

    public C9457b(C9452a aVar) {
        this.f30680a = aVar;
    }

    public static C9458a m8586b() {
        return new C9458a();
    }

    @AbstractC10398f0(zza = 1)
    public C9452a m8587a() {
        return this.f30680a;
    }

    public byte[] m8585c() {
        return AbstractC10403k.m5163a(this);
    }
}
