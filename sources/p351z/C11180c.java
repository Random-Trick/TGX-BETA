package p351z;

import android.util.Size;
import java.util.Comparator;

public final class C11180c implements Comparator<Size> {
    public boolean f35833a;

    public C11180c() {
        this(false);
    }

    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f35833a ? signum * (-1) : signum;
    }

    public C11180c(boolean z) {
        this.f35833a = false;
        this.f35833a = z;
    }
}
