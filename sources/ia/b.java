package ia;

import ra.g;
import ra.k;

public final class b implements Comparable<b> {
    public static final a N = new a(null);
    public static final b O = c.a();
    public final int M;
    public final int f14146a;
    public final int f14147b;
    public final int f14148c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public b(int i10, int i11, int i12) {
        this.f14146a = i10;
        this.f14147b = i11;
        this.f14148c = i12;
        this.M = b(i10, i11, i12);
    }

    public int compareTo(b bVar) {
        k.e(bVar, "other");
        return this.M - bVar.M;
    }

    public final int b(int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: ia.b.b(int, int, int):int");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.M == bVar.M;
    }

    public int hashCode() {
        return this.M;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14146a);
        sb2.append('.');
        sb2.append(this.f14147b);
        sb2.append('.');
        sb2.append(this.f14148c);
        return sb2.toString();
    }
}
