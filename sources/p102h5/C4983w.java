package p102h5;

import android.os.Bundle;

public final class C4983w extends AbstractC4981u<Bundle> {
    public C4983w(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override
    public final void mo24342a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m24346c(bundle2);
    }

    @Override
    public final boolean mo24341d() {
        return false;
    }
}
