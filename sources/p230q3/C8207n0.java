package p230q3;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p006a5.C0159o;

public final class C8207n0 extends IOException {
    public final long f26566M;
    public final C0159o f26567a;
    public final Uri f26568b;
    public final Map<String, List<String>> f26569c;

    public C8207n0(C0159o oVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f26567a = oVar;
        this.f26568b = uri;
        this.f26569c = map;
        this.f26566M = j;
    }
}
