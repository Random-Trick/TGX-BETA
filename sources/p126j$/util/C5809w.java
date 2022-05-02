package p126j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

public class C5809w extends C5480T {
    final SortedSet f18529f;

    public C5809w(SortedSet sortedSet, Collection collection, int i) {
        super(collection, i);
        this.f18529f = sortedSet;
    }

    @Override
    public Comparator getComparator() {
        return this.f18529f.comparator();
    }
}
