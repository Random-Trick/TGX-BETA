package jb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class f implements Iterable<Long> {
    public final ArrayList<Long> f15188a;

    public f() {
        this.f15188a = new ArrayList<>();
    }

    public boolean f(long j10) {
        int binarySearch = Collections.binarySearch(this.f15188a, Long.valueOf(j10));
        if (binarySearch >= 0) {
            return false;
        }
        this.f15188a.add((-binarySearch) - 1, Long.valueOf(j10));
        return true;
    }

    public void g(int i10) {
        this.f15188a.ensureCapacity(i10);
    }

    @Override
    public Iterator<Long> iterator() {
        return this.f15188a.iterator();
    }

    public boolean m(long j10) {
        return Collections.binarySearch(this.f15188a, Long.valueOf(j10)) >= 0;
    }

    public long[] r() {
        long[] jArr = new long[this.f15188a.size()];
        for (int i10 = 0; i10 < this.f15188a.size(); i10++) {
            jArr[i10] = this.f15188a.get(i10).longValue();
        }
        return jArr;
    }

    public int size() {
        return this.f15188a.size();
    }

    public f(int i10) {
        this.f15188a = new ArrayList<>(i10);
    }
}
