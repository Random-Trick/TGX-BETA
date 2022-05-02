package p014b;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class C1102a {
    public final Set<AbstractC1103b> f4296a = new CopyOnWriteArraySet();
    public volatile Context f4297b;

    public void m38370a(AbstractC1103b bVar) {
        if (this.f4297b != null) {
            bVar.mo38367a(this.f4297b);
        }
        this.f4296a.add(bVar);
    }

    public void m38369b() {
        this.f4297b = null;
    }

    public void m38368c(Context context) {
        this.f4297b = context;
        for (AbstractC1103b bVar : this.f4296a) {
            bVar.mo38367a(context);
        }
    }
}
