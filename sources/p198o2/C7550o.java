package p198o2;

import androidx.work.C1070b;
import p281u1.AbstractC9418b;
import p281u1.AbstractC9421e;
import p281u1.AbstractC9433k;
import p323x1.AbstractC10074f;

public final class C7550o implements AbstractC7549n {
    public final AbstractC9421e f24131a;
    public final AbstractC9418b<C7548m> f24132b;
    public final AbstractC9433k f24133c;
    public final AbstractC9433k f24134d;

    public class C7551a extends AbstractC9418b<C7548m> {
        public C7551a(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public void mo8741g(AbstractC10074f fVar, C7548m mVar) {
            String str = mVar.f24129a;
            if (str == null) {
                fVar.mo5374d0(1);
            } else {
                fVar.mo5373q(1, str);
            }
            byte[] m = C1070b.m38469m(mVar.f24130b);
            if (m == null) {
                fVar.mo5374d0(2);
            } else {
                fVar.mo5375N(2, m);
            }
        }
    }

    public class C7552b extends AbstractC9433k {
        public C7552b(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class C7553c extends AbstractC9433k {
        public C7553c(AbstractC9421e eVar) {
            super(eVar);
        }

        @Override
        public String mo8674d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C7550o(AbstractC9421e eVar) {
        this.f24131a = eVar;
        this.f24132b = new C7551a(eVar);
        this.f24133c = new C7552b(eVar);
        this.f24134d = new C7553c(eVar);
    }

    @Override
    public void mo15705a(String str) {
        this.f24131a.m8732b();
        AbstractC10074f a = this.f24133c.m8677a();
        if (str == null) {
            a.mo5374d0(1);
        } else {
            a.mo5373q(1, str);
        }
        this.f24131a.m8731c();
        try {
            a.mo5371u();
            this.f24131a.m8714t();
        } finally {
            this.f24131a.m8727g();
            this.f24133c.m8672f(a);
        }
    }

    @Override
    public void mo15704b() {
        this.f24131a.m8732b();
        AbstractC10074f a = this.f24134d.m8677a();
        this.f24131a.m8731c();
        try {
            a.mo5371u();
            this.f24131a.m8714t();
        } finally {
            this.f24131a.m8727g();
            this.f24134d.m8672f(a);
        }
    }
}
