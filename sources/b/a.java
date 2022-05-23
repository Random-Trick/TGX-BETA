package b;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {
    public final Set<b> f3664a = new CopyOnWriteArraySet();
    public volatile Context f3665b;

    public void a(b bVar) {
        if (this.f3665b != null) {
            bVar.a(this.f3665b);
        }
        this.f3664a.add(bVar);
    }

    public void b() {
        this.f3665b = null;
    }

    public void c(Context context) {
        this.f3665b = context;
        for (b bVar : this.f3664a) {
            bVar.a(context);
        }
    }
}
