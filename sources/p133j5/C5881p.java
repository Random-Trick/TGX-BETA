package p133j5;

import androidx.annotation.RecentlyNonNull;
import p118i5.C5219c;

public final class C5881p extends UnsupportedOperationException {
    public final C5219c f18762a;

    public C5881p(@RecentlyNonNull C5219c cVar) {
        this.f18762a = cVar;
    }

    @Override
    @RecentlyNonNull
    public String getMessage() {
        String valueOf = String.valueOf(this.f18762a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
        sb2.append("Missing ");
        sb2.append(valueOf);
        return sb2.toString();
    }
}
