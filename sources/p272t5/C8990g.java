package p272t5;

import java.util.Iterator;
import java.util.LinkedList;

public final class C8990g implements AbstractC8987e {
    public final AbstractC8982a f28888a;

    public C8990g(AbstractC8982a aVar) {
        this.f28888a = aVar;
    }

    @Override
    public final void mo10760a(AbstractC8985c cVar) {
        LinkedList linkedList;
        LinkedList linkedList2;
        AbstractC8985c cVar2;
        this.f28888a.f28881a = cVar;
        linkedList = this.f28888a.f28883c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            cVar2 = this.f28888a.f28881a;
            ((AbstractC8994k) it.next()).mo10759a(cVar2);
        }
        linkedList2 = this.f28888a.f28883c;
        linkedList2.clear();
        this.f28888a.f28882b = null;
    }
}
