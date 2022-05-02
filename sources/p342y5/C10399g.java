package p342y5;

import p092g7.AbstractC4517h;
import p092g7.C4510c;
import p092g7.C4511d;

public final class C10399g implements AbstractC4517h {
    public boolean f33467a = false;
    public boolean f33468b = false;
    public C4511d f33469c;
    public final C10391c f33470d;

    public C10399g(C10391c cVar) {
        this.f33470d = cVar;
    }

    public final void m5169a(C4511d dVar, boolean z) {
        this.f33467a = false;
        this.f33469c = dVar;
        this.f33468b = z;
    }

    public final void m5168b() {
        if (!this.f33467a) {
            this.f33467a = true;
            return;
        }
        throw new C4510c("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override
    public final AbstractC4517h mo5167d(String str) {
        m5168b();
        this.f33470d.m5189d(this.f33469c, str, this.f33468b);
        return this;
    }

    @Override
    public final AbstractC4517h mo5166e(boolean z) {
        m5168b();
        this.f33470d.m5186g(this.f33469c, z ? 1 : 0, this.f33468b);
        return this;
    }
}
