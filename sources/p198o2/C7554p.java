package p198o2;

import androidx.work.C1070b;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p071f2.AbstractC4234j;
import p071f2.C4223b;
import p071f2.C4250s;
import p071f2.EnumC4222a;
import p071f2.EnumC4245n;
import p182n.AbstractC7094a;

public final class C7554p {
    public static final String f24138s = AbstractC4234j.m28360f("WorkSpec");
    public static final AbstractC7094a<List<C7557c>, List<C4250s>> f24139t = new C7555a();
    public String f24140a;
    public C4250s.EnumC4251a f24141b;
    public String f24142c;
    public String f24143d;
    public C1070b f24144e;
    public C1070b f24145f;
    public long f24146g;
    public long f24147h;
    public long f24148i;
    public C4223b f24149j;
    public int f24150k;
    public EnumC4222a f24151l;
    public long f24152m;
    public long f24153n;
    public long f24154o;
    public long f24155p;
    public boolean f24156q;
    public EnumC4245n f24157r;

    public class C7555a implements AbstractC7094a<List<C7557c>, List<C4250s>> {
        public List<C4250s> apply(List<C7557c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C7557c cVar : list) {
                arrayList.add(cVar.m15696a());
            }
            return arrayList;
        }
    }

    public static class C7556b {
        public String f24158a;
        public C4250s.EnumC4251a f24159b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7556b)) {
                return false;
            }
            C7556b bVar = (C7556b) obj;
            if (this.f24159b != bVar.f24159b) {
                return false;
            }
            return this.f24158a.equals(bVar.f24158a);
        }

        public int hashCode() {
            return (this.f24158a.hashCode() * 31) + this.f24159b.hashCode();
        }
    }

    public static class C7557c {
        public String f24160a;
        public C4250s.EnumC4251a f24161b;
        public C1070b f24162c;
        public int f24163d;
        public List<String> f24164e;
        public List<C1070b> f24165f;

        public C4250s m15696a() {
            C1070b bVar;
            List<C1070b> list = this.f24165f;
            if (list == null || list.isEmpty()) {
                bVar = C1070b.f4180c;
            } else {
                bVar = this.f24165f.get(0);
            }
            return new C4250s(UUID.fromString(this.f24160a), this.f24161b, this.f24162c, this.f24164e, bVar, this.f24163d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7557c)) {
                return false;
            }
            C7557c cVar = (C7557c) obj;
            if (this.f24163d != cVar.f24163d) {
                return false;
            }
            String str = this.f24160a;
            if (str == null ? cVar.f24160a != null : !str.equals(cVar.f24160a)) {
                return false;
            }
            if (this.f24161b != cVar.f24161b) {
                return false;
            }
            C1070b bVar = this.f24162c;
            if (bVar == null ? cVar.f24162c != null : !bVar.equals(cVar.f24162c)) {
                return false;
            }
            List<String> list = this.f24164e;
            if (list == null ? cVar.f24164e != null : !list.equals(cVar.f24164e)) {
                return false;
            }
            List<C1070b> list2 = this.f24165f;
            List<C1070b> list3 = cVar.f24165f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f24160a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C4250s.EnumC4251a aVar = this.f24161b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C1070b bVar = this.f24162c;
            int hashCode3 = (((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f24163d) * 31;
            List<String> list = this.f24164e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<C1070b> list2 = this.f24165f;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode4 + i;
        }
    }

    public C7554p(String str, String str2) {
        this.f24141b = C4250s.EnumC4251a.ENQUEUED;
        C1070b bVar = C1070b.f4180c;
        this.f24144e = bVar;
        this.f24145f = bVar;
        this.f24149j = C4223b.f14246i;
        this.f24151l = EnumC4222a.EXPONENTIAL;
        this.f24152m = 30000L;
        this.f24155p = -1L;
        this.f24157r = EnumC4245n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24140a = str;
        this.f24142c = str2;
    }

    public long m15702a() {
        long j;
        boolean z = false;
        if (m15700c()) {
            if (this.f24151l == EnumC4222a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f24152m * this.f24150k;
            } else {
                j = Math.scalb((float) this.f24152m, this.f24150k - 1);
            }
            return this.f24153n + Math.min(18000000L, j);
        }
        long j2 = 0;
        if (m15699d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f24153n;
            long j4 = j3 == 0 ? currentTimeMillis + this.f24146g : j3;
            long j5 = this.f24148i;
            long j6 = this.f24147h;
            if (j5 != j6) {
                z = true;
            }
            if (z) {
                if (j3 == 0) {
                    j2 = j5 * (-1);
                }
                return j4 + j6 + j2;
            }
            if (j3 != 0) {
                j2 = j6;
            }
            return j4 + j2;
        }
        long j7 = this.f24153n;
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        return j7 + this.f24146g;
    }

    public boolean m15701b() {
        return !C4223b.f14246i.equals(this.f24149j);
    }

    public boolean m15700c() {
        return this.f24141b == C4250s.EnumC4251a.ENQUEUED && this.f24150k > 0;
    }

    public boolean m15699d() {
        return this.f24147h != 0;
    }

    public void m15698e(long j) {
        if (j > 18000000) {
            AbstractC4234j.m28362c().mo28355h(f24138s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j = 18000000;
        }
        if (j < 10000) {
            AbstractC4234j.m28362c().mo28355h(f24138s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j = 10000;
        }
        this.f24152m = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7554p.class != obj.getClass()) {
            return false;
        }
        C7554p pVar = (C7554p) obj;
        if (this.f24146g != pVar.f24146g || this.f24147h != pVar.f24147h || this.f24148i != pVar.f24148i || this.f24150k != pVar.f24150k || this.f24152m != pVar.f24152m || this.f24153n != pVar.f24153n || this.f24154o != pVar.f24154o || this.f24155p != pVar.f24155p || this.f24156q != pVar.f24156q || !this.f24140a.equals(pVar.f24140a) || this.f24141b != pVar.f24141b || !this.f24142c.equals(pVar.f24142c)) {
            return false;
        }
        String str = this.f24143d;
        if (str == null ? pVar.f24143d == null : str.equals(pVar.f24143d)) {
            return this.f24144e.equals(pVar.f24144e) && this.f24145f.equals(pVar.f24145f) && this.f24149j.equals(pVar.f24149j) && this.f24151l == pVar.f24151l && this.f24157r == pVar.f24157r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f24140a.hashCode() * 31) + this.f24141b.hashCode()) * 31) + this.f24142c.hashCode()) * 31;
        String str = this.f24143d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f24146g;
        long j2 = this.f24147h;
        long j3 = this.f24148i;
        long j4 = this.f24152m;
        long j5 = this.f24153n;
        long j6 = this.f24154o;
        long j7 = this.f24155p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f24144e.hashCode()) * 31) + this.f24145f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f24149j.hashCode()) * 31) + this.f24150k) * 31) + this.f24151l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f24156q ? 1 : 0)) * 31) + this.f24157r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f24140a + "}";
    }

    public C7554p(C7554p pVar) {
        this.f24141b = C4250s.EnumC4251a.ENQUEUED;
        C1070b bVar = C1070b.f4180c;
        this.f24144e = bVar;
        this.f24145f = bVar;
        this.f24149j = C4223b.f14246i;
        this.f24151l = EnumC4222a.EXPONENTIAL;
        this.f24152m = 30000L;
        this.f24155p = -1L;
        this.f24157r = EnumC4245n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24140a = pVar.f24140a;
        this.f24142c = pVar.f24142c;
        this.f24141b = pVar.f24141b;
        this.f24143d = pVar.f24143d;
        this.f24144e = new C1070b(pVar.f24144e);
        this.f24145f = new C1070b(pVar.f24145f);
        this.f24146g = pVar.f24146g;
        this.f24147h = pVar.f24147h;
        this.f24148i = pVar.f24148i;
        this.f24149j = new C4223b(pVar.f24149j);
        this.f24150k = pVar.f24150k;
        this.f24151l = pVar.f24151l;
        this.f24152m = pVar.f24152m;
        this.f24153n = pVar.f24153n;
        this.f24154o = pVar.f24154o;
        this.f24155p = pVar.f24155p;
        this.f24156q = pVar.f24156q;
        this.f24157r = pVar.f24157r;
    }
}
