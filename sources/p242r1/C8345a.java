package p242r1;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import org.thunderdog.challegram.Log;
import p242r1.C8348b;
import p267t0.C8929a;

public final class C8345a {
    public static final Comparator<C8347b> f27022g = new C8346a();
    public final int[] f27023a;
    public final int[] f27024b;
    public final List<C8348b.C8352d> f27025c;
    public final C8348b.AbstractC8351c[] f27027e;
    public final float[] f27028f = new float[3];
    public final TimingLogger f27026d = null;

    public static class C8346a implements Comparator<C8347b> {
        public int compare(C8347b bVar, C8347b bVar2) {
            return bVar2.m12725g() - bVar.m12725g();
        }
    }

    public class C8347b {
        public int f27029a;
        public int f27030b;
        public int f27031c;
        public int f27032d;
        public int f27033e;
        public int f27034f;
        public int f27035g;
        public int f27036h;
        public int f27037i;

        public C8347b(int i, int i2) {
            this.f27029a = i;
            this.f27030b = i2;
            m12729c();
        }

        public final boolean m12731a() {
            return m12727e() > 1;
        }

        public final int m12730b() {
            int f = m12726f();
            C8345a aVar = C8345a.this;
            int[] iArr = aVar.f27023a;
            int[] iArr2 = aVar.f27024b;
            C8345a.m12743e(iArr, f, this.f27029a, this.f27030b);
            Arrays.sort(iArr, this.f27029a, this.f27030b + 1);
            C8345a.m12743e(iArr, f, this.f27029a, this.f27030b);
            int i = this.f27031c / 2;
            int i2 = this.f27029a;
            int i3 = 0;
            while (true) {
                int i4 = this.f27030b;
                if (i2 > i4) {
                    return this.f27029a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        public final void m12729c() {
            C8345a aVar = C8345a.this;
            int[] iArr = aVar.f27023a;
            int[] iArr2 = aVar.f27024b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f27029a; i8 <= this.f27030b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int k = C8345a.m12737k(i9);
                int j = C8345a.m12738j(i9);
                int i10 = C8345a.m12739i(i9);
                if (k > i4) {
                    i4 = k;
                }
                if (k < i) {
                    i = k;
                }
                if (j > i5) {
                    i5 = j;
                }
                if (j < i2) {
                    i2 = j;
                }
                if (i10 > i6) {
                    i6 = i10;
                }
                if (i10 < i3) {
                    i3 = i10;
                }
            }
            this.f27032d = i;
            this.f27033e = i4;
            this.f27034f = i2;
            this.f27035g = i5;
            this.f27036h = i3;
            this.f27037i = i6;
            this.f27031c = i7;
        }

        public final C8348b.C8352d m12728d() {
            C8345a aVar = C8345a.this;
            int[] iArr = aVar.f27023a;
            int[] iArr2 = aVar.f27024b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f27029a; i5 <= this.f27030b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C8345a.m12737k(i6) * i7;
                i3 += C8345a.m12738j(i6) * i7;
                i4 += i7 * C8345a.m12739i(i6);
            }
            float f = i2;
            return new C8348b.C8352d(C8345a.m12746b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        public final int m12727e() {
            return (this.f27030b + 1) - this.f27029a;
        }

        public final int m12726f() {
            int i = this.f27033e - this.f27032d;
            int i2 = this.f27035g - this.f27034f;
            int i3 = this.f27037i - this.f27036h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        public final int m12725g() {
            return ((this.f27033e - this.f27032d) + 1) * ((this.f27035g - this.f27034f) + 1) * ((this.f27037i - this.f27036h) + 1);
        }

        public final C8347b m12724h() {
            if (m12731a()) {
                int b = m12730b();
                C8347b bVar = new C8347b(b + 1, this.f27030b);
                this.f27030b = b;
                m12729c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public C8345a(int[] iArr, int i, C8348b.AbstractC8351c[] cVarArr) {
        this.f27027e = cVarArr;
        int[] iArr2 = new int[Log.TAG_ROUND];
        this.f27024b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = m12741g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m12736l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f27023a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                i5++;
                iArr3[i5] = i6;
            }
        }
        if (i3 <= i) {
            this.f27025c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f27025c.add(new C8348b.C8352d(m12747a(i8), iArr2[i8]));
            }
            return;
        }
        this.f27025c = m12740h(i);
    }

    public static int m12747a(int i) {
        return m12746b(m12737k(i), m12738j(i), m12739i(i));
    }

    public static int m12746b(int i, int i2, int i3) {
        return Color.rgb(m12742f(i, 5, 8), m12742f(i2, 5, 8), m12742f(i3, 5, 8));
    }

    public static void m12743e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m12739i(i4) | (m12738j(i4) << 10) | (m12737k(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m12737k(i5) | (m12739i(i5) << 10) | (m12738j(i5) << 5);
                i2++;
            }
        }
    }

    public static int m12742f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static int m12741g(int i) {
        return m12742f(Color.blue(i), 8, 5) | (m12742f(Color.red(i), 8, 5) << 10) | (m12742f(Color.green(i), 8, 5) << 5);
    }

    public static int m12739i(int i) {
        return i & 31;
    }

    public static int m12738j(int i) {
        return (i >> 5) & 31;
    }

    public static int m12737k(int i) {
        return (i >> 10) & 31;
    }

    public final List<C8348b.C8352d> m12745c(Collection<C8347b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C8347b bVar : collection) {
            C8348b.C8352d d = bVar.m12728d();
            if (!m12734n(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    public List<C8348b.C8352d> m12744d() {
        return this.f27025c;
    }

    public final List<C8348b.C8352d> m12740h(int i) {
        PriorityQueue<C8347b> priorityQueue = new PriorityQueue<>(i, f27022g);
        priorityQueue.offer(new C8347b(0, this.f27023a.length - 1));
        m12733o(priorityQueue, i);
        return m12745c(priorityQueue);
    }

    public final boolean m12736l(int i) {
        int a = m12747a(i);
        C8929a.m10941h(a, this.f27028f);
        return m12735m(a, this.f27028f);
    }

    public final boolean m12735m(int i, float[] fArr) {
        C8348b.AbstractC8351c[] cVarArr = this.f27027e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f27027e[i2].mo12708a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m12734n(C8348b.C8352d dVar) {
        return m12735m(dVar.m12703e(), dVar.m12705c());
    }

    public final void m12733o(PriorityQueue<C8347b> priorityQueue, int i) {
        C8347b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.m12731a()) {
            priorityQueue.offer(poll.m12724h());
            priorityQueue.offer(poll);
        }
    }
}
