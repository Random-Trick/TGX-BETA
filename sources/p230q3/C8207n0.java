package p230q3;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p006a5.C0159o;

public final class C8207n0 extends IOException {
    public final long f26569M;
    public final C0159o f26570a;
    public final Uri f26571b;
    public final Map<String, List<String>> f26572c;

    public C8207n0(C0159o oVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f26570a = oVar;
        this.f26571b = uri;
        this.f26572c = map;
        this.f26569M = j;
    }
}
