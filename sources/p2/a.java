package p2;

import androidx.work.impl.WorkDatabase;
import f2.m;
import f2.s;
import g2.e;
import g2.f;
import g2.i;
import java.util.LinkedList;
import java.util.UUID;
import o2.q;

public abstract class a implements Runnable {
    public final g2.c f20400a = new g2.c();

    public class C0181a extends a {
        public final i f20401b;
        public final UUID f20402c;

        public C0181a(i iVar, UUID uuid) {
            this.f20401b = iVar;
            this.f20402c = uuid;
        }

        @Override
        public void h() {
            WorkDatabase s10 = this.f20401b.s();
            s10.c();
            try {
                a(this.f20401b, this.f20402c.toString());
                s10.t();
                s10.g();
                g(this.f20401b);
            } catch (Throwable th) {
                s10.g();
                throw th;
            }
        }
    }

    public class b extends a {
        public final i f20403b;
        public final String f20404c;

        public b(i iVar, String str) {
            this.f20403b = iVar;
            this.f20404c = str;
        }

        @Override
        public void h() {
            WorkDatabase s10 = this.f20403b.s();
            s10.c();
            try {
                for (String str : s10.D().q(this.f20404c)) {
                    a(this.f20403b, str);
                }
                s10.t();
                s10.g();
                g(this.f20403b);
            } catch (Throwable th) {
                s10.g();
                throw th;
            }
        }
    }

    public class c extends a {
        public final boolean M;
        public final i f20405b;
        public final String f20406c;

        public c(i iVar, String str, boolean z10) {
            this.f20405b = iVar;
            this.f20406c = str;
            this.M = z10;
        }

        @Override
        public void h() {
            WorkDatabase s10 = this.f20405b.s();
            s10.c();
            try {
                for (String str : s10.D().m(this.f20406c)) {
                    a(this.f20405b, str);
                }
                s10.t();
                s10.g();
                if (this.M) {
                    g(this.f20405b);
                }
            } catch (Throwable th) {
                s10.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, i iVar) {
        return new C0181a(iVar, uuid);
    }

    public static a c(String str, i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, i iVar) {
        return new b(iVar, str);
    }

    public void a(i iVar, String str) {
        f(iVar.s(), str);
        iVar.q().l(str);
        for (e eVar : iVar.r()) {
            eVar.e(str);
        }
    }

    public m e() {
        return this.f20400a;
    }

    public final void f(WorkDatabase workDatabase, String str) {
        q D = workDatabase.D();
        o2.b v10 = workDatabase.v();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s.a n10 = D.n(str2);
            if (!(n10 == s.a.SUCCEEDED || n10 == s.a.FAILED)) {
                D.j(s.a.CANCELLED, str2);
            }
            linkedList.addAll(v10.a(str2));
        }
    }

    public void g(i iVar) {
        f.b(iVar.m(), iVar.s(), iVar.r());
    }

    public abstract void h();

    @Override
    public void run() {
        try {
            h();
            this.f20400a.a(m.f11823a);
        } catch (Throwable th) {
            this.f20400a.a(new m.b.a(th));
        }
    }
}
