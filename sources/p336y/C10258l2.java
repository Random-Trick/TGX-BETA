package p336y;

import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p336y.C10200b2;

public final class C10258l2 {
    public final String f33060a;
    public final Map<String, C10260b> f33061b = new LinkedHashMap();

    public interface AbstractC10259a {
        boolean mo5610a(C10260b bVar);
    }

    public static final class C10260b {
        public final C10200b2 f33062a;
        public boolean f33063b = false;
        public boolean f33064c = false;

        public C10260b(C10200b2 b2Var) {
            this.f33062a = b2Var;
        }

        public boolean m5609a() {
            return this.f33064c;
        }

        public boolean m5608b() {
            return this.f33063b;
        }

        public C10200b2 m5607c() {
            return this.f33062a;
        }

        public void m5606d(boolean z) {
            this.f33064c = z;
        }

        public void m5605e(boolean z) {
            this.f33063b = z;
        }
    }

    public C10258l2(String str) {
        this.f33060a = str;
    }

    public static boolean m5618j(C10260b bVar) {
        return bVar.m5609a() && bVar.m5608b();
    }

    public C10200b2.C10206f m5625c() {
        C10200b2.C10206f fVar = new C10200b2.C10206f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C10260b> entry : this.f33061b.entrySet()) {
            C10260b value = entry.getValue();
            if (value.m5609a() && value.m5608b()) {
                fVar.m5739a(value.m5607c());
                arrayList.add(entry.getKey());
            }
        }
        C0662u1.m40653a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f33060a);
        return fVar;
    }

    public Collection<C10200b2> m5624d() {
        return Collections.unmodifiableCollection(m5620h(C10253k2.f33051a));
    }

    public C10200b2.C10206f m5623e() {
        C10200b2.C10206f fVar = new C10200b2.C10206f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C10260b> entry : this.f33061b.entrySet()) {
            C10260b value = entry.getValue();
            if (value.m5608b()) {
                fVar.m5739a(value.m5607c());
                arrayList.add(entry.getKey());
            }
        }
        C0662u1.m40653a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f33060a);
        return fVar;
    }

    public Collection<C10200b2> m5622f() {
        return Collections.unmodifiableCollection(m5620h(C10249j2.f33040a));
    }

    public final C10260b m5621g(String str, C10200b2 b2Var) {
        C10260b bVar = this.f33061b.get(str);
        if (bVar != null) {
            return bVar;
        }
        C10260b bVar2 = new C10260b(b2Var);
        this.f33061b.put(str, bVar2);
        return bVar2;
    }

    public final Collection<C10200b2> m5620h(AbstractC10259a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C10260b> entry : this.f33061b.entrySet()) {
            if (aVar == null || aVar.mo5610a(entry.getValue())) {
                arrayList.add(entry.getValue().m5607c());
            }
        }
        return arrayList;
    }

    public boolean m5619i(String str) {
        if (!this.f33061b.containsKey(str)) {
            return false;
        }
        return this.f33061b.get(str).m5608b();
    }

    public void m5616l(String str) {
        this.f33061b.remove(str);
    }

    public void m5615m(String str, C10200b2 b2Var) {
        m5621g(str, b2Var).m5606d(true);
    }

    public void m5614n(String str, C10200b2 b2Var) {
        m5621g(str, b2Var).m5605e(true);
    }

    public void m5613o(String str) {
        if (this.f33061b.containsKey(str)) {
            C10260b bVar = this.f33061b.get(str);
            bVar.m5605e(false);
            if (!bVar.m5609a()) {
                this.f33061b.remove(str);
            }
        }
    }

    public void m5612p(String str) {
        if (this.f33061b.containsKey(str)) {
            C10260b bVar = this.f33061b.get(str);
            bVar.m5606d(false);
            if (!bVar.m5608b()) {
                this.f33061b.remove(str);
            }
        }
    }

    public void m5611q(String str, C10200b2 b2Var) {
        if (this.f33061b.containsKey(str)) {
            C10260b bVar = new C10260b(b2Var);
            C10260b bVar2 = this.f33061b.get(str);
            bVar.m5605e(bVar2.m5608b());
            bVar.m5606d(bVar2.m5609a());
            this.f33061b.put(str, bVar);
        }
    }
}
