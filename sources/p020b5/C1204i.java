package p020b5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C1204i<E> implements Iterable<E> {
    public final Object f4507a = new Object();
    public final Map<E, Integer> f4508b = new HashMap();
    public Set<E> f4509c = Collections.emptySet();
    public List<E> f4506M = Collections.emptyList();

    public Set<E> m38057e() {
        Set<E> set;
        synchronized (this.f4507a) {
            set = this.f4509c;
        }
        return set;
    }

    public void m38056h(E e) {
        synchronized (this.f4507a) {
            ArrayList arrayList = new ArrayList(this.f4506M);
            arrayList.add(e);
            this.f4506M = Collections.unmodifiableList(arrayList);
            Integer num = this.f4508b.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f4509c);
                hashSet.add(e);
                this.f4509c = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f4508b;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    public int m38055i(E e) {
        int intValue;
        synchronized (this.f4507a) {
            intValue = this.f4508b.containsKey(e) ? this.f4508b.get(e).intValue() : 0;
        }
        return intValue;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f4507a) {
            it = this.f4506M.iterator();
        }
        return it;
    }

    public void m38054m(E e) {
        synchronized (this.f4507a) {
            Integer num = this.f4508b.get(e);
            if (num != null) {
                ArrayList arrayList = new ArrayList(this.f4506M);
                arrayList.remove(e);
                this.f4506M = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f4508b.remove(e);
                    HashSet hashSet = new HashSet(this.f4509c);
                    hashSet.remove(e);
                    this.f4509c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f4508b.put(e, Integer.valueOf(num.intValue() - 1));
                }
            }
        }
    }
}
