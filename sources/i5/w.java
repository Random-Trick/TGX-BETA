package i5;

import android.os.Bundle;

public final class w extends u<Bundle> {
    public w(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    @Override
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    @Override
    public final boolean d() {
        return false;
    }
}
