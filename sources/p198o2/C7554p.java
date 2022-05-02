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
    public static final String f24141s = AbstractC4234j.m28362f("WorkSpec");
    public static final AbstractC7094a<List<C7557c>, List<C4250s>> f24142t = new C7555a();
    public String f24143a;
    public C4250s.EnumC4251a f24144b;
    public String f24145c;
    public String f24146d;
    public C1070b f24147e;
    public C1070b f24148f;
    public long f24149g;
    public long f24150h;
    public long f24151i;
    public C4223b f24152j;
    public int f24153k;
    public EnumC4222a f24154l;
    public long f24155m;
    public long f24156n;
    public long f24157o;
    public long f24158p;
    public boolean f24159q;
    public EnumC4245n f24160r;

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
        public String f24161a;
        public C4250s.EnumC4251a f24162b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7556b)) {
                return false;
            }
            C7556b bVar = (C7556b) obj;
            if (this.f24162b != bVar.f24162b) {
                return false;
            }
            return this.f24161a.equals(bVar.f24161a);
        }

        public int hashCode() {
            return (this.f24161a.hashCode() * 31) + this.f24162b.hashCode();
        }
    }

    public static class C7557c {
        public String f24163a;
        public C4250s.EnumC4251a f24164b;
        public C1070b f24165c;
        public int f24166d;
        public List<String> f24167e;
        public List<C1070b> f24168f;

        public C4250s m15696a() {
            C1070b bVar;
            List<C1070b> list = this.f24168f;
            if (list == null || list.isEmpty()) {
                bVar = C1070b.f4180c;
            } else {
                bVar = this.f24168f.get(0);
            }
            return new C4250s(UUID.fromString(this.f24163a), this.f24164b, this.f24165c, this.f24167e, bVar, this.f24166d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7557c)) {
                return false;
            }
            C7557c cVar = (C7557c) obj;
            if (this.f24166d != cVar.f24166d) {
                return false;
            }
            String str = this.f24163a;
            if (str == null ? cVar.f24163a != null : !str.equals(cVar.f24163a)) {
                return false;
            }
            if (this.f24164b != cVar.f24164b) {
                return false;
            }
            C1070b bVar = this.f24165c;
            if (bVar == null ? cVar.f24165c != null : !bVar.equals(cVar.f24165c)) {
                return false;
            }
            List<String> list = this.f24167e;
            if (list == null ? cVar.f24167e != null : !list.equals(cVar.f24167e)) {
                return false;
            }
            List<C1070b> list2 = this.f24168f;
            List<C1070b> list3 = cVar.f24168f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f24163a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C4250s.EnumC4251a aVar = this.f24164b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C1070b bVar = this.f24165c;
            int hashCode3 = (((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f24166d) * 31;
            List<String> list = this.f24167e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<C1070b> list2 = this.f24168f;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode4 + i;
        }
    }

    public C7554p(String str, String str2) {
        this.f24144b = C4250s.EnumC4251a.ENQUEUED;
        C1070b bVar = C1070b.f4180c;
        this.f24147e = bVar;
        this.f24148f = bVar;
        this.f24152j = C4223b.f14246i;
        this.f24154l = EnumC4222a.EXPONENTIAL;
        this.f24155m = 30000L;
        this.f24158p = -1L;
        this.f24160r = EnumC4245n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24143a = str;
        this.f24145c = str2;
    }

    public long m15702a() {
        long j;
        boolean z = false;
        if (m15700c()) {
            if (this.f24154l == EnumC4222a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f24155m * this.f24153k;
            } else {
                j = Math.scalb((float) this.f24155m, this.f24153k - 1);
            }
            return this.f24156n + Math.min(18000000L, j);
        }
        long j2 = 0;
        if (m15699d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f24156n;
            long j4 = j3 == 0 ? currentTimeMillis + this.f24149g : j3;
            long j5 = this.f24151i;
            long j6 = this.f24150h;
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
        long j7 = this.f24156n;
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        return j7 + this.f24149g;
    }

    public boolean m15701b() {
        return !C4223b.f14246i.equals(this.f24152j);
    }

    public boolean m15700c() {
        return this.f24144b == C4250s.EnumC4251a.ENQUEUED && this.f24153k > 0;
    }

    public boolean m15699d() {
        return this.f24150h != 0;
    }

    public void m15698e(long j) {
        if (j > 18000000) {
            AbstractC4234j.m28364c().mo28357h(f24141s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j = 18000000;
        }
        if (j < 10000) {
            AbstractC4234j.m28364c().mo28357h(f24141s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j = 10000;
        }
        this.f24155m = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7554p.class != obj.getClass()) {
            return false;
        }
        C7554p pVar = (C7554p) obj;
        if (this.f24149g != pVar.f24149g || this.f24150h != pVar.f24150h || this.f24151i != pVar.f24151i || this.f24153k != pVar.f24153k || this.f24155m != pVar.f24155m || this.f24156n != pVar.f24156n || this.f24157o != pVar.f24157o || this.f24158p != pVar.f24158p || this.f24159q != pVar.f24159q || !this.f24143a.equals(pVar.f24143a) || this.f24144b != pVar.f24144b || !this.f24145c.equals(pVar.f24145c)) {
            return false;
        }
        String str = this.f24146d;
        if (str == null ? pVar.f24146d == null : str.equals(pVar.f24146d)) {
            return this.f24147e.equals(pVar.f24147e) && this.f24148f.equals(pVar.f24148f) && this.f24152j.equals(pVar.f24152j) && this.f24154l == pVar.f24154l && this.f24160r == pVar.f24160r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f24143a.hashCode() * 31) + this.f24144b.hashCode()) * 31) + this.f24145c.hashCode()) * 31;
        String str = this.f24146d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f24149g;
        long j2 = this.f24150h;
        long j3 = this.f24151i;
        long j4 = this.f24155m;
        long j5 = this.f24156n;
        long j6 = this.f24157o;
        long j7 = this.f24158p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f24147e.hashCode()) * 31) + this.f24148f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f24152j.hashCode()) * 31) + this.f24153k) * 31) + this.f24154l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f24159q ? 1 : 0)) * 31) + this.f24160r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f24143a + "}";
    }

    public C7554p(C7554p pVar) {
        this.f24144b = C4250s.EnumC4251a.ENQUEUED;
        C1070b bVar = C1070b.f4180c;
        this.f24147e = bVar;
        this.f24148f = bVar;
        this.f24152j = C4223b.f14246i;
        this.f24154l = EnumC4222a.EXPONENTIAL;
        this.f24155m = 30000L;
        this.f24158p = -1L;
        this.f24160r = EnumC4245n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24143a = pVar.f24143a;
        this.f24145c = pVar.f24145c;
        this.f24144b = pVar.f24144b;
        this.f24146d = pVar.f24146d;
        this.f24147e = new C1070b(pVar.f24147e);
        this.f24148f = new C1070b(pVar.f24148f);
        this.f24149g = pVar.f24149g;
        this.f24150h = pVar.f24150h;
        this.f24151i = pVar.f24151i;
        this.f24152j = new C4223b(pVar.f24152j);
        this.f24153k = pVar.f24153k;
        this.f24154l = pVar.f24154l;
        this.f24155m = pVar.f24155m;
        this.f24156n = pVar.f24156n;
        this.f24157o = pVar.f24157o;
        this.f24158p = pVar.f24158p;
        this.f24159q = pVar.f24159q;
        this.f24160r = pVar.f24160r;
    }
}
