package o2;

import u1.e;
import u1.k;
import x1.f;

public final class o implements n {
    public final e f18581a;
    public final u1.b<m> f18582b;
    public final k f18583c;
    public final k f18584d;

    public class a extends u1.b<m> {
        public a(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public void g(f fVar, m mVar) {
            String str = mVar.f18579a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.q(1, str);
            }
            byte[] m10 = androidx.work.b.m(mVar.f18580b);
            if (m10 == null) {
                fVar.f0(2);
            } else {
                fVar.O(2, m10);
            }
        }
    }

    public class b extends k {
        public b(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends k {
        public c(e eVar) {
            super(eVar);
        }

        @Override
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(e eVar) {
        this.f18581a = eVar;
        this.f18582b = new a(eVar);
        this.f18583c = new b(eVar);
        this.f18584d = new c(eVar);
    }

    @Override
    public void a(String str) {
        this.f18581a.b();
        f a10 = this.f18583c.a();
        if (str == null) {
            a10.f0(1);
        } else {
            a10.q(1, str);
        }
        this.f18581a.c();
        try {
            a10.t();
            this.f18581a.t();
        } finally {
            this.f18581a.g();
            this.f18583c.f(a10);
        }
    }

    @Override
    public void b() {
        this.f18581a.b();
        f a10 = this.f18584d.a();
        this.f18581a.c();
        try {
            a10.t();
            this.f18581a.t();
        } finally {
            this.f18581a.g();
            this.f18584d.f(a10);
        }
    }
}
