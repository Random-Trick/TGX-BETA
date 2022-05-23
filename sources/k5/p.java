package k5;

import androidx.annotation.RecentlyNonNull;
import j5.c;

public final class p extends UnsupportedOperationException {
    public final c f15698a;

    public p(@RecentlyNonNull c cVar) {
        this.f15698a = cVar;
    }

    @Override
    @RecentlyNonNull
    public String getMessage() {
        String valueOf = String.valueOf(this.f15698a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
        sb2.append("Missing ");
        sb2.append(valueOf);
        return sb2.toString();
    }
}
