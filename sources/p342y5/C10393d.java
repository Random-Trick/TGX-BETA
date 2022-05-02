package p342y5;

import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.C4510c;

public final class C10393d implements AbstractC4514e {
    public static final AbstractC4514e f33451a = new C10393d();

    @Override
    public final void mo5165a(Object obj, AbstractC4515f fVar) {
        int i = C10395e.f33453e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new C4510c(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
