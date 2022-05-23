package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

public final class C0416x extends U {
    final SortedSet f14916f;

    public C0416x(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f14916f = sortedSet;
    }

    @Override
    public final Comparator getComparator() {
        return this.f14916f.comparator();
    }
}
