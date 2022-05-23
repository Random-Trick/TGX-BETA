package q3;

import android.net.Uri;
import b5.o;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class o0 extends IOException {
    public final long M;
    public final o f21349a;
    public final Uri f21350b;
    public final Map<String, List<String>> f21351c;

    public o0(o oVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f21349a = oVar;
        this.f21350b = uri;
        this.f21351c = map;
        this.M = j10;
    }
}
