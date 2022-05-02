package p124ib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C5321d implements Iterable<Integer> {
    public final ArrayList<Integer> f17498a = new ArrayList<>();

    public boolean m23276h(int i) {
        int binarySearch = Collections.binarySearch(this.f17498a, Integer.valueOf(i));
        if (binarySearch >= 0) {
            return false;
        }
        this.f17498a.add((-binarySearch) - 1, Integer.valueOf(i));
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.f17498a.iterator();
    }

    public int size() {
        return this.f17498a.size();
    }
}
