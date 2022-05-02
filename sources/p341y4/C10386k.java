package p341y4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1216l0;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C10386k implements AbstractC8041f {
    public final List<C10375e> f33417a;
    public final long[] f33418b;
    public final long[] f33419c;

    public C10386k(List<C10375e> list) {
        this.f33417a = Collections.unmodifiableList(new ArrayList(list));
        this.f33418b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            C10375e eVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f33418b;
            jArr[i2] = eVar.f33386b;
            jArr[i2 + 1] = eVar.f33387c;
        }
        long[] jArr2 = this.f33418b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f33419c = copyOf;
        Arrays.sort(copyOf);
    }

    public static int m5195f(C10375e eVar, C10375e eVar2) {
        return Long.compare(eVar.f33386b, eVar2.f33386b);
    }

    @Override
    public int mo5200a(long j) {
        int e = C1216l0.m37978e(this.f33419c, j, false, false);
        if (e < this.f33419c.length) {
            return e;
        }
        return -1;
    }

    @Override
    public long mo5199b(int i) {
        boolean z = true;
        C1186a.m38189a(i >= 0);
        if (i >= this.f33419c.length) {
            z = false;
        }
        C1186a.m38189a(z);
        return this.f33419c[i];
    }

    @Override
    public List<C8032b> mo5198c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f33417a.size(); i++) {
            long[] jArr = this.f33418b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C10375e eVar = this.f33417a.get(i);
                C8032b bVar = eVar.f33385a;
                if (bVar.f26158N == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, C10385j.f33416a);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C10375e) arrayList2.get(i3)).f33385a.m13760b().m13750h((-1) - i3, 1).m13757a());
        }
        return arrayList;
    }

    @Override
    public int mo5197d() {
        return this.f33419c.length;
    }
}
