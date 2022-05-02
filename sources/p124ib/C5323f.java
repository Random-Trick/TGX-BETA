package p124ib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C5323f implements Iterable<Long> {
    public final ArrayList<Long> f17501a;

    public C5323f() {
        this.f17501a = new ArrayList<>();
    }

    public boolean m23262h(long j) {
        int binarySearch = Collections.binarySearch(this.f17501a, Long.valueOf(j));
        if (binarySearch >= 0) {
            return false;
        }
        this.f17501a.add((-binarySearch) - 1, Long.valueOf(j));
        return true;
    }

    public void m23261i(int i) {
        this.f17501a.ensureCapacity(i);
    }

    @Override
    public Iterator<Long> iterator() {
        return this.f17501a.iterator();
    }

    public boolean m23260m(long j) {
        return Collections.binarySearch(this.f17501a, Long.valueOf(j)) >= 0;
    }

    public long[] m23259r() {
        long[] jArr = new long[this.f17501a.size()];
        for (int i = 0; i < this.f17501a.size(); i++) {
            jArr[i] = this.f17501a.get(i).longValue();
        }
        return jArr;
    }

    public int size() {
        return this.f17501a.size();
    }

    public C5323f(int i) {
        this.f17501a = new ArrayList<>(i);
    }
}
