package p033c6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4510c;

public final class C1752h2 implements AbstractC4514e {
    public static final C1752h2 f6316a = new C1752h2();

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        int i = C1767i2.f6357e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new C4510c(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
