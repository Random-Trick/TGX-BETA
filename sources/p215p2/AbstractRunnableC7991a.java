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
    public final C4451c f26034a = new C4451c();

    public class C7992a extends AbstractRunnableC7991a {
        public final C4458i f26035b;
        public final UUID f26036c;

        public C7992a(C4458i iVar, UUID uuid) {
            this.f26035b = iVar;
            this.f26036c = uuid;
        }

        @Override
        public void mo13818h() {
            WorkDatabase s = this.f26035b.m27589s();
            s.m8731c();
            try {
                m13825a(this.f26035b, this.f26036c.toString());
                s.m8714t();
                s.m8727g();
                m13819g(this.f26035b);
            } catch (Throwable th) {
                s.m8727g();
                throw th;
            }
        }
    }

    public class C7993b extends AbstractRunnableC7991a {
        public final C4458i f26037b;
        public final String f26038c;

        public C7993b(C4458i iVar, String str) {
            this.f26037b = iVar;
            this.f26038c = str;
        }

        @Override
        public void mo13818h() {
            WorkDatabase s = this.f26037b.m27589s();
            s.m8731c();
            try {
                for (String str : s.mo38457D().mo15678q(this.f26038c)) {
                    m13825a(this.f26037b, str);
                }
                s.m8714t();
                s.m8727g();
                m13819g(this.f26037b);
            } catch (Throwable th) {
                s.m8727g();
                throw th;
            }
        }
    }

    public class C7994c extends AbstractRunnableC7991a {
        public final boolean f26039M;
        public final C4458i f26040b;
        public final String f26041c;

        public C7994c(C4458i iVar, String str, boolean z) {
            this.f26040b = iVar;
            this.f26041c = str;
            this.f26039M = z;
        }

        @Override
        public void mo13818h() {
            WorkDatabase s = this.f26040b.m27589s();
            s.m8731c();
            try {
                for (String str : s.mo38457D().mo15682m(this.f26041c)) {
                    m13825a(this.f26040b, str);
                }
                s.m8714t();
                s.m8727g();
                if (this.f26039M) {
                    m13819g(this.f26040b);
                }
            } catch (Throwable th) {
                s.m8727g();
                throw th;
            }
        }
    }

    public static AbstractRunnableC7991a m13824b(UUID uuid, C4458i iVar) {
        return new C7992a(iVar, uuid);
    }

    public static AbstractRunnableC7991a m13823c(String str, C4458i iVar, boolean z) {
        return new C7994c(iVar, str, z);
    }

    public static AbstractRunnableC7991a m13822d(String str, C4458i iVar) {
        return new C7993b(iVar, str);
    }

    public void m13825a(C4458i iVar, String str) {
        m13820f(iVar.m27589s(), str);
        iVar.m27591q().m27631l(str);
        for (AbstractC4454e eVar : iVar.m27590r()) {
            eVar.mo21952e(str);
        }
    }

    public AbstractC4239m m13821e() {
        return this.f26034a;
    }

    public final void m13820f(WorkDatabase workDatabase, String str) {
        AbstractC7558q D = workDatabase.mo38457D();
        AbstractC7532b v = workDatabase.mo38444v();
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

    public void m13819g(C4458i iVar) {
        C4455f.m27626b(iVar.m27595m(), iVar.m27589s(), iVar.m27590r());
    }

    public abstract void mo13818h();

    @Override
    public void run() {
        try {
            mo13818h();
            this.f26034a.m27640a(AbstractC4239m.f14285a);
        } catch (Throwable th) {
            this.f26034a.m27640a(new AbstractC4239m.AbstractC4241b.C4242a(th));
        }
    }
}
