package p301v7;

import java.util.Iterator;
import java.util.Set;
import p047d7.AbstractC3870e;
import p047d7.C3865d;
import p047d7.C3890q;

public class C9875c implements AbstractC9882i {
    public final String f32158a;
    public final C9876d f32159b;

    public C9875c(Set<AbstractC9878f> set, C9876d dVar) {
        this.f32158a = m6707e(set);
        this.f32159b = dVar;
    }

    public static C3865d<AbstractC9882i> m6709c() {
        return C3865d.m29707c(AbstractC9882i.class).m29692b(C3890q.m29631k(AbstractC9878f.class)).m29689e(C9874b.f32157a).m29690d();
    }

    public static AbstractC9882i m6708d(AbstractC3870e eVar) {
        return new C9875c(eVar.mo29674d(AbstractC9878f.class), C9876d.m6706a());
    }

    public static String m6707e(Set<AbstractC9878f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC9878f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC9878f next = it.next();
            sb2.append(next.mo6702b());
            sb2.append('/');
            sb2.append(next.mo6701c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override
    public String mo6695a() {
        if (this.f32159b.m6705b().isEmpty()) {
            return this.f32158a;
        }
        return this.f32158a + ' ' + m6707e(this.f32159b.m6705b());
    }
}
