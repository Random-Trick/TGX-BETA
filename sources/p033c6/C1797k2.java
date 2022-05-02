package p033c6;

import p092g7.AbstractC4517h;
import p092g7.C4510c;
import p092g7.C4511d;

public final class C1797k2 implements AbstractC4517h {
    public boolean f6419a = false;
    public boolean f6420b = false;
    public C4511d f6421c;
    public final C1737g2 f6422d;

    public C1797k2(C1737g2 g2Var) {
        this.f6422d = g2Var;
    }

    public final void m35981a(C4511d dVar, boolean z) {
        this.f6419a = false;
        this.f6421c = dVar;
        this.f6420b = z;
    }

    public final void m35980b() {
        if (!this.f6419a) {
            this.f6419a = true;
            return;
        }
        throw new C4510c("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override
    public final AbstractC4517h mo5167d(String str) {
        m35980b();
        this.f6422d.m36034f(this.f6421c, str, this.f6420b);
        return this;
    }

    @Override
    public final AbstractC4517h mo5166e(boolean z) {
        m35980b();
        this.f6422d.m36033g(this.f6421c, z ? 1 : 0, this.f6420b);
        return this;
    }
}
