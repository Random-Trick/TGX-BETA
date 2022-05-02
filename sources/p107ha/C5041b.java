package p107ha;

import qa.C8294g;
import qa.C8298k;

public final class C5041b implements Comparable<C5041b> {
    public static final C5042a f17050N = new C5042a(null);
    public static final C5041b f17051O = C5043c.m24199a();
    public final int f17052M;
    public final int f17053a;
    public final int f17054b;
    public final int f17055c;

    public static final class C5042a {
        public C5042a() {
        }

        public C5042a(C8294g gVar) {
            this();
        }
    }

    public C5041b(int i, int i2, int i3) {
        this.f17053a = i;
        this.f17054b = i2;
        this.f17055c = i3;
        this.f17052M = m24200b(i, i2, i3);
    }

    public int compareTo(C5041b bVar) {
        C8298k.m12933e(bVar, "other");
        return this.f17052M - bVar.f17052M;
    }

    public final int m24200b(int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: p107ha.C5041b.m24200b(int, int, int):int");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5041b bVar = obj instanceof C5041b ? (C5041b) obj : null;
        return bVar != null && this.f17052M == bVar.f17052M;
    }

    public int hashCode() {
        return this.f17052M;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17053a);
        sb2.append('.');
        sb2.append(this.f17054b);
        sb2.append('.');
        sb2.append(this.f17055c);
        return sb2.toString();
    }
}
