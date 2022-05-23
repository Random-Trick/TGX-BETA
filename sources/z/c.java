package z;

import android.util.Size;
import java.util.Comparator;

public final class c implements Comparator<Size> {
    public boolean f26711a;

    public c() {
        this(false);
    }

    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f26711a ? signum * (-1) : signum;
    }

    public c(boolean z10) {
        this.f26711a = z10;
    }
}
