package p046d6;

import p092g7.AbstractC4517h;
import p092g7.C4510c;
import p092g7.C4511d;

public final class C3654e implements AbstractC4517h {
    public boolean f12412a = false;
    public boolean f12413b = false;
    public C4511d f12414c;
    public final C3723k8 f12415d;

    public C3654e(C3723k8 k8Var) {
        this.f12415d = k8Var;
    }

    public final void m29844a(C4511d dVar, boolean z) {
        this.f12412a = false;
        this.f12414c = dVar;
        this.f12413b = z;
    }

    public final void m29843b() {
        if (!this.f12412a) {
            this.f12412a = true;
            return;
        }
        throw new C4510c("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override
    public final AbstractC4517h mo5167d(String str) {
        m29843b();
        this.f12415d.m29820f(this.f12414c, str, this.f12413b);
        return this;
    }

    @Override
    public final AbstractC4517h mo5166e(boolean z) {
        m29843b();
        this.f12415d.m29819g(this.f12414c, z ? 1 : 0, this.f12413b);
        return this;
    }
}
