package r1;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import org.thunderdog.challegram.Log;
import r1.b;

public final class a {
    public static final Comparator<b> f21597g = new C0202a();
    public final int[] f21598a;
    public final int[] f21599b;
    public final List<b.d> f21600c;
    public final b.c[] f21602e;
    public final float[] f21603f = new float[3];
    public final TimingLogger f21601d = null;

    public static class C0202a implements Comparator<b> {
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    public class b {
        public int f21604a;
        public int f21605b;
        public int f21606c;
        public int f21607d;
        public int f21608e;
        public int f21609f;
        public int f21610g;
        public int f21611h;
        public int f21612i;

        public b(int i10, int i11) {
            this.f21604a = i10;
            this.f21605b = i11;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int f10 = f();
            a aVar = a.this;
            int[] iArr = aVar.f21598a;
            int[] iArr2 = aVar.f21599b;
            a.e(iArr, f10, this.f21604a, this.f21605b);
            Arrays.sort(iArr, this.f21604a, this.f21605b + 1);
            a.e(iArr, f10, this.f21604a, this.f21605b);
            int i10 = this.f21606c / 2;
            int i11 = this.f21604a;
            int i12 = 0;
            while (true) {
                int i13 = this.f21605b;
                if (i11 > i13) {
                    return this.f21604a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i13 - 1, i11);
                }
                i11++;
            }
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f21598a;
            int[] iArr2 = aVar.f21599b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = 0;
            for (int i17 = this.f21604a; i17 <= this.f21605b; i17++) {
                int i18 = iArr[i17];
                i16 += iArr2[i18];
                int k10 = a.k(i18);
                int j10 = a.j(i18);
                int i19 = a.i(i18);
                if (k10 > i13) {
                    i13 = k10;
                }
                if (k10 < i10) {
                    i10 = k10;
                }
                if (j10 > i14) {
                    i14 = j10;
                }
                if (j10 < i11) {
                    i11 = j10;
                }
                if (i19 > i15) {
                    i15 = i19;
                }
                if (i19 < i12) {
                    i12 = i19;
                }
            }
            this.f21607d = i10;
            this.f21608e = i13;
            this.f21609f = i11;
            this.f21610g = i14;
            this.f21611h = i12;
            this.f21612i = i15;
            this.f21606c = i16;
        }

        public final b.d d() {
            a aVar = a.this;
            int[] iArr = aVar.f21598a;
            int[] iArr2 = aVar.f21599b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = this.f21604a; i14 <= this.f21605b; i14++) {
                int i15 = iArr[i14];
                int i16 = iArr2[i15];
                i11 += i16;
                i10 += a.k(i15) * i16;
                i12 += a.j(i15) * i16;
                i13 += i16 * a.i(i15);
            }
            float f10 = i11;
            return new b.d(a.b(Math.round(i10 / f10), Math.round(i12 / f10), Math.round(i13 / f10)), i11);
        }

        public final int e() {
            return (this.f21605b + 1) - this.f21604a;
        }

        public final int f() {
            int i10 = this.f21608e - this.f21607d;
            int i11 = this.f21610g - this.f21609f;
            int i12 = this.f21612i - this.f21611h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.f21608e - this.f21607d) + 1) * ((this.f21610g - this.f21609f) + 1) * ((this.f21612i - this.f21611h) + 1);
        }

        public final b h() {
            if (a()) {
                int b10 = b();
                b bVar = new b(b10 + 1, this.f21605b);
                this.f21605b = b10;
                c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public a(int[] iArr, int i10, b.c[] cVarArr) {
        this.f21602e = cVarArr;
        int[] iArr2 = new int[Log.TAG_ROUND];
        this.f21599b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int g10 = g(iArr[i11]);
            iArr[i11] = g10;
            iArr2[g10] = iArr2[g10] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0 && l(i13)) {
                iArr2[i13] = 0;
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f21598a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                i14++;
                iArr3[i14] = i15;
            }
        }
        if (i12 <= i10) {
            this.f21600c = new ArrayList();
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = iArr3[i16];
                this.f21600c.add(new b.d(a(i17), iArr2[i17]));
            }
            return;
        }
        this.f21600c = h(i10);
    }

    public static int a(int i10) {
        return b(k(i10), j(i10), i(i10));
    }

    public static int b(int i10, int i11, int i12) {
        return Color.rgb(f(i10, 5, 8), f(i11, 5, 8), f(i12, 5, 8));
    }

    public static void e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = i(i13) | (j(i13) << 10) | (k(i13) << 5);
                i11++;
            }
        } else if (i10 == -1) {
            while (i11 <= i12) {
                int i14 = iArr[i11];
                iArr[i11] = k(i14) | (i(i14) << 10) | (j(i14) << 5);
                i11++;
            }
        }
    }

    public static int f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public static int g(int i10) {
        return f(Color.blue(i10), 8, 5) | (f(Color.red(i10), 8, 5) << 10) | (f(Color.green(i10), 8, 5) << 5);
    }

    public static int i(int i10) {
        return i10 & 31;
    }

    public static int j(int i10) {
        return (i10 >> 5) & 31;
    }

    public static int k(int i10) {
        return (i10 >> 10) & 31;
    }

    public final List<b.d> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (b bVar : collection) {
            b.d d10 = bVar.d();
            if (!n(d10)) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public List<b.d> d() {
        return this.f21600c;
    }

    public final List<b.d> h(int i10) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i10, f21597g);
        priorityQueue.offer(new b(0, this.f21598a.length - 1));
        o(priorityQueue, i10);
        return c(priorityQueue);
    }

    public final boolean l(int i10) {
        int a10 = a(i10);
        t0.a.h(a10, this.f21603f);
        return m(a10, this.f21603f);
    }

    public final boolean m(int i10, float[] fArr) {
        b.c[] cVarArr = this.f21602e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.f21602e[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(b.d dVar) {
        return m(dVar.e(), dVar.c());
    }

    public final void o(PriorityQueue<b> priorityQueue, int i10) {
        b poll;
        while (priorityQueue.size() < i10 && (poll = priorityQueue.poll()) != null && poll.a()) {
            priorityQueue.offer(poll.h());
            priorityQueue.offer(poll);
        }
    }
}
