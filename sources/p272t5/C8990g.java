package p272t5;

import java.util.Iterator;
import java.util.LinkedList;

public final class C8990g implements AbstractC8987e {
    public final AbstractC8982a f28891a;

    public C8990g(AbstractC8982a aVar) {
        this.f28891a = aVar;
    }

    @Override
    public final void mo10759a(AbstractC8985c cVar) {
        LinkedList linkedList;
        LinkedList linkedList2;
        AbstractC8985c cVar2;
        this.f28891a.f28884a = cVar;
        linkedList = this.f28891a.f28886c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            cVar2 = this.f28891a.f28884a;
            ((AbstractC8994k) it.next()).mo10758a(cVar2);
        }
        linkedList2 = this.f28891a.f28886c;
        linkedList2.clear();
        this.f28891a.f28885b = null;
    }
}
