package jb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class d implements Iterable<Integer> {
    public final ArrayList<Integer> f15185a = new ArrayList<>();

    public boolean f(int i10) {
        int binarySearch = Collections.binarySearch(this.f15185a, Integer.valueOf(i10));
        if (binarySearch >= 0) {
            return false;
        }
        this.f15185a.add((-binarySearch) - 1, Integer.valueOf(i10));
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.f15185a.iterator();
    }

    public int size() {
        return this.f15185a.size();
    }
}
