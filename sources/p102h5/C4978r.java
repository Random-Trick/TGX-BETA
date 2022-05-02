package p102h5;

import android.os.Bundle;

public final class C4978r extends AbstractC4981u<Void> {
    public C4978r(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override
    public final void mo24342a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m24346c(null);
        } else {
            m24347b(new C4980t(4, "Invalid response to one way request"));
        }
    }

    @Override
    public final boolean mo24341d() {
        return true;
    }
}
