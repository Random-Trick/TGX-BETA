package n0;

import b1.e;
import b1.f;
import java.util.ArrayList;
import java.util.HashSet;
import k0.g;

public final class a<T> {
    public final e<ArrayList<T>> f17525a = new f(10);
    public final g<T, ArrayList<T>> f17526b = new g<>();
    public final ArrayList<T> f17527c = new ArrayList<>();
    public final HashSet<T> f17528d = new HashSet<>();

    public void a(T t10, T t11) {
        if (!this.f17526b.containsKey(t10) || !this.f17526b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f17526b.get(t10);
        if (arrayList == null) {
            arrayList = f();
            this.f17526b.put(t10, arrayList);
        }
        arrayList.add(t11);
    }

    public void b(T t10) {
        if (!this.f17526b.containsKey(t10)) {
            this.f17526b.put(t10, null);
        }
    }

    public void c() {
        int size = this.f17526b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> l10 = this.f17526b.l(i10);
            if (l10 != null) {
                i(l10);
            }
        }
        this.f17526b.clear();
    }

    public boolean d(T t10) {
        return this.f17526b.containsKey(t10);
    }

    public final void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t10)) {
            if (!hashSet.contains(t10)) {
                hashSet.add(t10);
                ArrayList<T> arrayList2 = this.f17526b.get(t10);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(t10);
                arrayList.add(t10);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final ArrayList<T> f() {
        ArrayList<T> b10 = this.f17525a.b();
        return b10 == null ? new ArrayList<>() : b10;
    }

    public ArrayList<T> g() {
        this.f17527c.clear();
        this.f17528d.clear();
        int size = this.f17526b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f17526b.i(i10), this.f17527c, this.f17528d);
        }
        return this.f17527c;
    }

    public boolean h(T t10) {
        int size = this.f17526b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> l10 = this.f17526b.l(i10);
            if (l10 != null && l10.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    public final void i(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f17525a.a(arrayList);
    }
}
