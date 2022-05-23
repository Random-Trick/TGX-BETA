package b3;

import java.util.Set;
import y2.b;
import y2.e;
import y2.f;
import y2.g;

public final class n implements g {
    public final Set<b> f3735a;
    public final m f3736b;
    public final q f3737c;

    public n(Set<b> set, m mVar, q qVar) {
        this.f3735a = set;
        this.f3736b = mVar;
        this.f3737c = qVar;
    }

    @Override
    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f3735a.contains(bVar)) {
            return new p(this.f3736b, str, bVar, eVar, this.f3737c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f3735a));
    }
}
