package l5;

import com.google.android.gms.common.api.Status;
import k5.b;
import n6.c;
import n6.l;

public final class e2 implements c<Boolean, Void> {
    @Override
    public final Void a(l<Boolean> lVar) {
        if (lVar.l().booleanValue()) {
            return null;
        }
        throw new b(new Status(13, "listener already unregistered"));
    }
}
