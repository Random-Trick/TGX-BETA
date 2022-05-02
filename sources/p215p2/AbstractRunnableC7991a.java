package p215p2;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import p071f2.AbstractC4239m;
import p071f2.C4250s;
import p087g2.AbstractC4454e;
import p087g2.C4451c;
import p087g2.C4455f;
import p087g2.C4458i;
import p198o2.AbstractC7532b;
import p198o2.AbstractC7558q;

public abstract class AbstractRunnableC7991a implements Runnable {
    public final C4451c f26031a = new C4451c();

    public class C7992a extends AbstractRunnableC7991a {
        public final C4458i f26032b;
        public final UUID f26033c;

        public C7992a(C4458i iVar, UUID uuid) {
            this.f26032b = iVar;
            this.f26033c = uuid;
        }

        @Override
        public void mo13819h() {
            WorkDatabase s = this.f26032b.m27587s();
            s.m8731c();
            try {
                m13826a(this.f26032b, this.f26033c.toString());
                s.m8714t();
                s.m8727g();
                m13820g(this.f26032b);
            } catch (Throwable th) {
                s.m8727g();
                throw th;
            }
        }
    }

    public class C7993b extends AbstractRunnableC7991a {
        public final C4458i f26034b;
        public final String f26035c;

        public C7993b(C4458i iVar, String str) {
            this.f26034b = iVar;
            this.f26035c = str;
        }

        @Override
        public void mo13819h() {
            WorkDatabase s = this.f26034b.m27587s();
            s.m8731c();
            try {
                for (String str : s.mo38454D().mo15678q(this.f26035c)) {
                    m13826a(this.f26034b, str);
                }
                s.m8714t();
                s.m8727g();
                m13820g(this.f26034b);
            } catch (Throwable th) {
                s.m8727g();
                throw th;
            }
        }
    }

    public class C7994c extends AbstractRunnableC7991a {
        public final boolean f26036M;
        public final C4458i f26037b;
        public final String f26038c;

        public C7994c(C4458i iVar, String str, boolean z) {
            this.f26037b = iVar;
            this.f26038c = str;
            this.f26036M = z;
        }

        @Override
        public void mo13819h() {
            WorkDatabase s = this.f26037b.m27587s();
            s.m8731c();
            try {
                for (String str : s.mo38454D().mo15682m(this.f26038c)) {
                    m13826a(this.f26037b, str);
                }
                s.m8714t();
                s.m8727g();
                if (this.f26036M) {
                    m13820g(this.f26037b);
                }
            } catch (Throwable th) {
                s.m8727g();
                throw th;
            }
        }
    }

    public static AbstractRunnableC7991a m13825b(UUID uuid, C4458i iVar) {
        return new C7992a(iVar, uuid);
    }

    public static AbstractRunnableC7991a m13824c(String str, C4458i iVar, boolean z) {
        return new C7994c(iVar, str, z);
    }

    public static AbstractRunnableC7991a m13823d(String str, C4458i iVar) {
        return new C7993b(iVar, str);
    }

    public void m13826a(C4458i iVar, String str) {
        m13821f(iVar.m27587s(), str);
        iVar.m27589q().m27629l(str);
        for (AbstractC4454e eVar : iVar.m27588r()) {
            eVar.mo21951e(str);
        }
    }

    public AbstractC4239m m13822e() {
        return this.f26031a;
    }

    public final void m13821f(WorkDatabase workDatabase, String str) {
        AbstractC7558q D = workDatabase.mo38454D();
        AbstractC7532b v = workDatabase.mo38441v();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C4250s.EnumC4251a n = D.mo15681n(str2);
            if (!(n == C4250s.EnumC4251a.SUCCEEDED || n == C4250s.EnumC4251a.FAILED)) {
                D.mo15685j(C4250s.EnumC4251a.CANCELLED, str2);
            }
            linkedList.addAll(v.mo15721a(str2));
        }
    }

    public void m13820g(C4458i iVar) {
        C4455f.m27624b(iVar.m27593m(), iVar.m27587s(), iVar.m27588r());
    }

    public abstract void mo13819h();

    @Override
    public void run() {
        try {
            mo13819h();
            this.f26031a.m27638a(AbstractC4239m.f14285a);
        } catch (Throwable th) {
            this.f26031a.m27638a(new AbstractC4239m.AbstractC4241b.C4242a(th));
        }
    }
}
