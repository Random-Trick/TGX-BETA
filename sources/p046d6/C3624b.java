package p046d6;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4510c;

public final class C3624b implements AbstractC4514e {
    public static final C3624b f12353a = new C3624b();

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        int i = C3634c.f12375e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new C4510c(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
