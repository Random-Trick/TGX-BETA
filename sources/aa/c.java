package aa;

import java.util.ArrayList;
import java.util.List;
import o9.b;

public class c implements d {
    public final List<d> f693a = new ArrayList();

    @Override
    public b a(b bVar) {
        for (d dVar : this.f693a) {
            bVar = dVar.a(bVar);
        }
        return bVar;
    }

    public void b(d dVar) {
        this.f693a.add(dVar);
    }
}
