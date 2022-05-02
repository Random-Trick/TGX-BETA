package p301v7;

import java.util.Iterator;
import java.util.Set;
import p047d7.AbstractC3870e;
import p047d7.C3865d;
import p047d7.C3890q;

public class C9875c implements AbstractC9882i {
    public final String f32161a;
    public final C9876d f32162b;

    public C9875c(Set<AbstractC9878f> set, C9876d dVar) {
        this.f32161a = m6707e(set);
        this.f32162b = dVar;
    }

    public static C3865d<AbstractC9882i> m6709c() {
        return C3865d.m29709c(AbstractC9882i.class).m29694b(C3890q.m29633k(AbstractC9878f.class)).m29691e(C9874b.f32160a).m29692d();
    }

    public static AbstractC9882i m6708d(AbstractC3870e eVar) {
        return new C9875c(eVar.mo29676d(AbstractC9878f.class), C9876d.m6706a());
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
        if (this.f32162b.m6705b().isEmpty()) {
            return this.f32161a;
        }
        return this.f32161a + ' ' + m6707e(this.f32162b.m6705b());
    }
}
