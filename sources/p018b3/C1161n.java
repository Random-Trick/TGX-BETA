package p018b3;

import java.util.Set;
import p339y2.AbstractC10355e;
import p339y2.AbstractC10356f;
import p339y2.AbstractC10357g;
import p339y2.C10352b;

public final class C1161n implements AbstractC10357g {
    public final Set<C10352b> f4383a;
    public final AbstractC1159m f4384b;
    public final AbstractC1164q f4385c;

    public C1161n(Set<C10352b> set, AbstractC1159m mVar, AbstractC1164q qVar) {
        this.f4383a = set;
        this.f4384b = mVar;
        this.f4385c = qVar;
    }

    @Override
    public <T> AbstractC10356f<T> mo5361a(String str, Class<T> cls, C10352b bVar, AbstractC10355e<T, byte[]> eVar) {
        if (this.f4383a.contains(bVar)) {
            return new C1163p(this.f4384b, str, bVar, eVar, this.f4385c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f4383a));
    }
}
