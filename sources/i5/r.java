package i5;

import android.os.Bundle;

public final class r extends u<Void> {
    public r(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            b(new t(4, "Invalid response to one way request"));
        }
    }

    @Override
    public final boolean d() {
        return true;
    }
}
