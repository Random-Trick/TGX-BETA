package p361z9;

import java.util.ArrayList;
import java.util.List;
import p192n9.C7310b;

public class C11432c implements AbstractC11433d {
    public final List<AbstractC11433d> f36397a = new ArrayList();

    @Override
    public C7310b mo662a(C7310b bVar) {
        for (AbstractC11433d dVar : this.f36397a) {
            bVar = dVar.mo662a(bVar);
        }
        return bVar;
    }

    public void m663b(AbstractC11433d dVar) {
        this.f36397a.add(dVar);
    }
}
