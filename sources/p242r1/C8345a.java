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
    public static final Comparator<C8347b> f27025g = new C8346a();
    public final int[] f27026a;
    public final int[] f27027b;
    public final List<C8348b.C8352d> f27028c;
    public final C8348b.AbstractC8351c[] f27030e;
    public final float[] f27031f = new float[3];
    public final TimingLogger f27029d = null;

    public static class C8346a implements Comparator<C8347b> {
        public int compare(C8347b bVar, C8347b bVar2) {
            return bVar2.m12724g() - bVar.m12724g();
        }
    }

    public class C8347b {
        public int f27032a;
        public int f27033b;
        public int f27034c;
        public int f27035d;
        public int f27036e;
        public int f27037f;
        public int f27038g;
        public int f27039h;
        public int f27040i;

        public C8347b(int i, int i2) {
            this.f27032a = i;
            this.f27033b = i2;
            m12728c();
        }

        public final boolean m12730a() {
            return m12726e() > 1;
        }

        public final int m12729b() {
            int f = m12725f();
            C8345a aVar = C8345a.this;
            int[] iArr = aVar.f27026a;
            int[] iArr2 = aVar.f27027b;
            C8345a.m12742e(iArr, f, this.f27032a, this.f27033b);
            Arrays.sort(iArr, this.f27032a, this.f27033b + 1);
            C8345a.m12742e(iArr, f, this.f27032a, this.f27033b);
            int i = this.f27034c / 2;
            int i2 = this.f27032a;
            int i3 = 0;
            while (true) {
                int i4 = this.f27033b;
                if (i2 > i4) {
                    return this.f27032a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        public final void m12728c() {
            C8345a aVar = C8345a.this;
            int[] iArr = aVar.f27026a;
            int[] iArr2 = aVar.f27027b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f27032a; i8 <= this.f27033b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int k = C8345a.m12736k(i9);
                int j = C8345a.m12737j(i9);
                int i10 = C8345a.m12738i(i9);
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
            this.f27035d = i;
            this.f27036e = i4;
            this.f27037f = i2;
            this.f27038g = i5;
            this.f27039h = i3;
            this.f27040i = i6;
            this.f27034c = i7;
        }

        public final C8348b.C8352d m12727d() {
            C8345a aVar = C8345a.this;
            int[] iArr = aVar.f27026a;
            int[] iArr2 = aVar.f27027b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f27032a; i5 <= this.f27033b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C8345a.m12736k(i6) * i7;
                i3 += C8345a.m12737j(i6) * i7;
                i4 += i7 * C8345a.m12738i(i6);
            }
            float f = i2;
            return new C8348b.C8352d(C8345a.m12745b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        public final int m12726e() {
            return (this.f27033b + 1) - this.f27032a;
        }

        public final int m12725f() {
            int i = this.f27036e - this.f27035d;
            int i2 = this.f27038g - this.f27037f;
            int i3 = this.f27040i - this.f27039h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        public final int m12724g() {
            return ((this.f27036e - this.f27035d) + 1) * ((this.f27038g - this.f27037f) + 1) * ((this.f27040i - this.f27039h) + 1);
        }

        public final C8347b m12723h() {
            if (m12730a()) {
                int b = m12729b();
                C8347b bVar = new C8347b(b + 1, this.f27033b);
                this.f27033b = b;
                m12728c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public C8345a(int[] iArr, int i, C8348b.AbstractC8351c[] cVarArr) {
        this.f27030e = cVarArr;
        int[] iArr2 = new int[Log.TAG_ROUND];
        this.f27027b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = m12740g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m12735l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f27026a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                i5++;
                iArr3[i5] = i6;
            }
        }
        if (i3 <= i) {
            this.f27028c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f27028c.add(new C8348b.C8352d(m12746a(i8), iArr2[i8]));
            }
            return;
        }
        this.f27028c = m12739h(i);
    }

    public static int m12746a(int i) {
        return m12745b(m12736k(i), m12737j(i), m12738i(i));
    }

    public static int m12745b(int i, int i2, int i3) {
        return Color.rgb(m12741f(i, 5, 8), m12741f(i2, 5, 8), m12741f(i3, 5, 8));
    }

    public static void m12742e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m12738i(i4) | (m12737j(i4) << 10) | (m12736k(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m12736k(i5) | (m12738i(i5) << 10) | (m12737j(i5) << 5);
                i2++;
            }
        }
    }

    public static int m12741f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static int m12740g(int i) {
        return m12741f(Color.blue(i), 8, 5) | (m12741f(Color.red(i), 8, 5) << 10) | (m12741f(Color.green(i), 8, 5) << 5);
    }

    public static int m12738i(int i) {
        return i & 31;
    }

    public static int m12737j(int i) {
        return (i >> 5) & 31;
    }

    public static int m12736k(int i) {
        return (i >> 10) & 31;
    }

    public final List<C8348b.C8352d> m12744c(Collection<C8347b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C8347b bVar : collection) {
            C8348b.C8352d d = bVar.m12727d();
            if (!m12733n(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    public List<C8348b.C8352d> m12743d() {
        return this.f27028c;
    }

    public final List<C8348b.C8352d> m12739h(int i) {
        PriorityQueue<C8347b> priorityQueue = new PriorityQueue<>(i, f27025g);
        priorityQueue.offer(new C8347b(0, this.f27026a.length - 1));
        m12732o(priorityQueue, i);
        return m12744c(priorityQueue);
    }

    public final boolean m12735l(int i) {
        int a = m12746a(i);
        C8929a.m10940h(a, this.f27031f);
        return m12734m(a, this.f27031f);
    }

    public final boolean m12734m(int i, float[] fArr) {
        C8348b.AbstractC8351c[] cVarArr = this.f27030e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f27030e[i2].mo12707a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m12733n(C8348b.C8352d dVar) {
        return m12734m(dVar.m12702e(), dVar.m12704c());
    }

    public final void m12732o(PriorityQueue<C8347b> priorityQueue, int i) {
        C8347b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.m12730a()) {
            priorityQueue.offer(poll.m12723h());
            priorityQueue.offer(poll);
        }
    }
}
