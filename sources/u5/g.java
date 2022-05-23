package u5;

import java.util.Iterator;
import java.util.LinkedList;

public final class g implements e {
    public final a f23579a;

    public g(a aVar) {
        this.f23579a = aVar;
    }

    @Override
    public final void a(c cVar) {
        LinkedList linkedList;
        LinkedList linkedList2;
        c cVar2;
        this.f23579a.f23572a = cVar;
        linkedList = this.f23579a.f23574c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            cVar2 = this.f23579a.f23572a;
            ((k) it.next()).a(cVar2);
        }
        linkedList2 = this.f23579a.f23574c;
        linkedList2.clear();
        this.f23579a.f23573b = null;
    }
}
