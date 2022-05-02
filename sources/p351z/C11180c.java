package p351z;

import android.util.Size;
import java.util.Comparator;

public final class C11180c implements Comparator<Size> {
    public boolean f35836a;

    public C11180c() {
        this(false);
    }

    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f35836a ? signum * (-1) : signum;
    }

    public C11180c(boolean z) {
        this.f35836a = false;
        this.f35836a = z;
    }
}
