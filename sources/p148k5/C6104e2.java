package p148k5;

import com.google.android.gms.common.api.Status;
import p133j5.C5861b;
import p177m6.AbstractC6757c;
import p177m6.AbstractC6775l;

public final class C6104e2 implements AbstractC6757c<Boolean, Void> {
    @Override
    public final Void mo10597a(AbstractC6775l<Boolean> lVar) {
        if (lVar.mo19070l().booleanValue()) {
            return null;
        }
        throw new C5861b(new Status(13, "listener already unregistered"));
    }
}
