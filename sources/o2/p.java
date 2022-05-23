package o2;

import f2.j;
import f2.n;
import f2.s;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class p {
    public static final String f18588s = j.f("WorkSpec");
    public static final n.a<List<c>, List<s>> f18589t = new a();
    public String f18590a;
    public s.a f18591b;
    public String f18592c;
    public String f18593d;
    public androidx.work.b f18594e;
    public androidx.work.b f18595f;
    public long f18596g;
    public long f18597h;
    public long f18598i;
    public f2.b f18599j;
    public int f18600k;
    public f2.a f18601l;
    public long f18602m;
    public long f18603n;
    public long f18604o;
    public long f18605p;
    public boolean f18606q;
    public n f18607r;

    public class a implements n.a<List<c>, List<s>> {
        public List<s> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c cVar : list) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    public static class b {
        public String f18608a;
        public s.a f18609b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f18609b != bVar.f18609b) {
                return false;
            }
            return this.f18608a.equals(bVar.f18608a);
        }

        public int hashCode() {
            return (this.f18608a.hashCode() * 31) + this.f18609b.hashCode();
        }
    }

    public static class c {
        public String f18610a;
        public s.a f18611b;
        public androidx.work.b f18612c;
        public int f18613d;
        public List<String> f18614e;
        public List<androidx.work.b> f18615f;

        public s a() {
            androidx.work.b bVar;
            List<androidx.work.b> list = this.f18615f;
            if (list == null || list.isEmpty()) {
                bVar = androidx.work.b.f3588c;
            } else {
                bVar = this.f18615f.get(0);
            }
            return new s(UUID.fromString(this.f18610a), this.f18611b, this.f18612c, this.f18614e, bVar, this.f18613d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f18613d != cVar.f18613d) {
                return false;
            }
            String str = this.f18610a;
            if (str == null ? cVar.f18610a != null : !str.equals(cVar.f18610a)) {
                return false;
            }
            if (this.f18611b != cVar.f18611b) {
                return false;
            }
            androidx.work.b bVar = this.f18612c;
            if (bVar == null ? cVar.f18612c != null : !bVar.equals(cVar.f18612c)) {
                return false;
            }
            List<String> list = this.f18614e;
            if (list == null ? cVar.f18614e != null : !list.equals(cVar.f18614e)) {
                return false;
            }
            List<androidx.work.b> list2 = this.f18615f;
            List<androidx.work.b> list3 = cVar.f18615f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f18610a;
            int i10 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            s.a aVar = this.f18611b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.b bVar = this.f18612c;
            int hashCode3 = (((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f18613d) * 31;
            List<String> list = this.f18614e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.b> list2 = this.f18615f;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return hashCode4 + i10;
        }
    }

    public p(String str, String str2) {
        this.f18591b = s.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f3588c;
        this.f18594e = bVar;
        this.f18595f = bVar;
        this.f18599j = f2.b.f11790i;
        this.f18601l = f2.a.EXPONENTIAL;
        this.f18602m = 30000L;
        this.f18605p = -1L;
        this.f18607r = n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f18590a = str;
        this.f18592c = str2;
    }

    public long a() {
        long j10;
        boolean z10 = false;
        if (c()) {
            if (this.f18601l == f2.a.LINEAR) {
                z10 = true;
            }
            if (z10) {
                j10 = this.f18602m * this.f18600k;
            } else {
                j10 = Math.scalb((float) this.f18602m, this.f18600k - 1);
            }
            return this.f18603n + Math.min(18000000L, j10);
        }
        long j11 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j12 = this.f18603n;
            long j13 = j12 == 0 ? currentTimeMillis + this.f18596g : j12;
            long j14 = this.f18598i;
            long j15 = this.f18597h;
            if (j14 != j15) {
                z10 = true;
            }
            if (z10) {
                if (j12 == 0) {
                    j11 = j14 * (-1);
                }
                return j13 + j15 + j11;
            }
            if (j12 != 0) {
                j11 = j15;
            }
            return j13 + j11;
        }
        long j16 = this.f18603n;
        if (j16 == 0) {
            j16 = System.currentTimeMillis();
        }
        return j16 + this.f18596g;
    }

    public boolean b() {
        return !f2.b.f11790i.equals(this.f18599j);
    }

    public boolean c() {
        return this.f18591b == s.a.ENQUEUED && this.f18600k > 0;
    }

    public boolean d() {
        return this.f18597h != 0;
    }

    public void e(long j10) {
        if (j10 > 18000000) {
            j.c().h(f18588s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j10 = 18000000;
        }
        if (j10 < 10000) {
            j.c().h(f18588s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j10 = 10000;
        }
        this.f18602m = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f18596g != pVar.f18596g || this.f18597h != pVar.f18597h || this.f18598i != pVar.f18598i || this.f18600k != pVar.f18600k || this.f18602m != pVar.f18602m || this.f18603n != pVar.f18603n || this.f18604o != pVar.f18604o || this.f18605p != pVar.f18605p || this.f18606q != pVar.f18606q || !this.f18590a.equals(pVar.f18590a) || this.f18591b != pVar.f18591b || !this.f18592c.equals(pVar.f18592c)) {
            return false;
        }
        String str = this.f18593d;
        if (str == null ? pVar.f18593d == null : str.equals(pVar.f18593d)) {
            return this.f18594e.equals(pVar.f18594e) && this.f18595f.equals(pVar.f18595f) && this.f18599j.equals(pVar.f18599j) && this.f18601l == pVar.f18601l && this.f18607r == pVar.f18607r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f18590a.hashCode() * 31) + this.f18591b.hashCode()) * 31) + this.f18592c.hashCode()) * 31;
        String str = this.f18593d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f18596g;
        long j11 = this.f18597h;
        long j12 = this.f18598i;
        long j13 = this.f18602m;
        long j14 = this.f18603n;
        long j15 = this.f18604o;
        long j16 = this.f18605p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f18594e.hashCode()) * 31) + this.f18595f.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f18599j.hashCode()) * 31) + this.f18600k) * 31) + this.f18601l.hashCode()) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f18606q ? 1 : 0)) * 31) + this.f18607r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f18590a + "}";
    }

    public p(p pVar) {
        this.f18591b = s.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f3588c;
        this.f18594e = bVar;
        this.f18595f = bVar;
        this.f18599j = f2.b.f11790i;
        this.f18601l = f2.a.EXPONENTIAL;
        this.f18602m = 30000L;
        this.f18605p = -1L;
        this.f18607r = n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f18590a = pVar.f18590a;
        this.f18592c = pVar.f18592c;
        this.f18591b = pVar.f18591b;
        this.f18593d = pVar.f18593d;
        this.f18594e = new androidx.work.b(pVar.f18594e);
        this.f18595f = new androidx.work.b(pVar.f18595f);
        this.f18596g = pVar.f18596g;
        this.f18597h = pVar.f18597h;
        this.f18598i = pVar.f18598i;
        this.f18599j = new f2.b(pVar.f18599j);
        this.f18600k = pVar.f18600k;
        this.f18601l = pVar.f18601l;
        this.f18602m = pVar.f18602m;
        this.f18603n = pVar.f18603n;
        this.f18604o = pVar.f18604o;
        this.f18605p = pVar.f18605p;
        this.f18606q = pVar.f18606q;
        this.f18607r = pVar.f18607r;
    }
}
