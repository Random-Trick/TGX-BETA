package c5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i<E> implements Iterable<E> {
    public final Object f4827a = new Object();
    public final Map<E, Integer> f4828b = new HashMap();
    public Set<E> f4829c = Collections.emptySet();
    public List<E> M = Collections.emptyList();

    public Set<E> d() {
        Set<E> set;
        synchronized (this.f4827a) {
            set = this.f4829c;
        }
        return set;
    }

    public void f(E e10) {
        synchronized (this.f4827a) {
            ArrayList arrayList = new ArrayList(this.M);
            arrayList.add(e10);
            this.M = Collections.unmodifiableList(arrayList);
            Integer num = this.f4828b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f4829c);
                hashSet.add(e10);
                this.f4829c = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f4828b;
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            map.put(e10, Integer.valueOf(i10));
        }
    }

    public int g(E e10) {
        int intValue;
        synchronized (this.f4827a) {
            intValue = this.f4828b.containsKey(e10) ? this.f4828b.get(e10).intValue() : 0;
        }
        return intValue;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f4827a) {
            it = this.M.iterator();
        }
        return it;
    }

    public void m(E e10) {
        synchronized (this.f4827a) {
            Integer num = this.f4828b.get(e10);
            if (num != null) {
                ArrayList arrayList = new ArrayList(this.M);
                arrayList.remove(e10);
                this.M = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f4828b.remove(e10);
                    HashSet hashSet = new HashSet(this.f4829c);
                    hashSet.remove(e10);
                    this.f4829c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f4828b.put(e10, Integer.valueOf(num.intValue() - 1));
                }
            }
        }
    }
}
