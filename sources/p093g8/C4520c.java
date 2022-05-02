package p093g8;

import p105h8.C5022a;

public final class C4520c {
    public final AbstractC4519b f14902a;
    public C5022a f14903b;

    public C4520c(AbstractC4519b bVar) {
        if (bVar != null) {
            this.f14902a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public C5022a m27503a() {
        if (this.f14903b == null) {
            this.f14903b = this.f14902a.mo24255a();
        }
        return this.f14903b;
    }

    public String toString() {
        try {
            return m27503a().toString();
        } catch (C4525h unused) {
            return "";
        }
    }
}
