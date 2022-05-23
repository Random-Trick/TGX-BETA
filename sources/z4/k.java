package z4;

import c5.a;
import c5.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import q4.b;
import q4.f;

public final class k implements f {
    public final List<e> f26936a;
    public final long[] f26937b;
    public final long[] f26938c;

    public k(List<e> list) {
        this.f26936a = Collections.unmodifiableList(new ArrayList(list));
        this.f26937b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f26937b;
            jArr[i11] = eVar.f26905b;
            jArr[i11 + 1] = eVar.f26906c;
        }
        long[] jArr2 = this.f26937b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f26938c = copyOf;
        Arrays.sort(copyOf);
    }

    public static int f(e eVar, e eVar2) {
        return Long.compare(eVar.f26905b, eVar2.f26905b);
    }

    @Override
    public int a(long j10) {
        int e10 = l0.e(this.f26938c, j10, false, false);
        if (e10 < this.f26938c.length) {
            return e10;
        }
        return -1;
    }

    @Override
    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f26938c.length) {
            z10 = false;
        }
        a.a(z10);
        return this.f26938c[i10];
    }

    @Override
    public List<b> c(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f26936a.size(); i10++) {
            long[] jArr = this.f26937b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f26936a.get(i10);
                b bVar = eVar.f26904a;
                if (bVar.N == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, j.f26935a);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f26904a.b().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override
    public int d() {
        return this.f26938c.length;
    }
}
