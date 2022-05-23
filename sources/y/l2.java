package y;

import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import y.b2;

public final class l2 {
    public final String f26351a;
    public final Map<String, b> f26352b = new LinkedHashMap();

    public interface a {
        boolean a(b bVar);
    }

    public static final class b {
        public final b2 f26353a;
        public boolean f26354b = false;
        public boolean f26355c = false;

        public b(b2 b2Var) {
            this.f26353a = b2Var;
        }

        public boolean a() {
            return this.f26355c;
        }

        public boolean b() {
            return this.f26354b;
        }

        public b2 c() {
            return this.f26353a;
        }

        public void d(boolean z10) {
            this.f26355c = z10;
        }

        public void e(boolean z10) {
            this.f26354b = z10;
        }
    }

    public l2(String str) {
        this.f26351a = str;
    }

    public static boolean j(b bVar) {
        return bVar.a() && bVar.b();
    }

    public b2.f c() {
        b2.f fVar = new b2.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f26352b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                fVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        t1.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f26351a);
        return fVar;
    }

    public Collection<b2> d() {
        return Collections.unmodifiableCollection(h(k2.f26344a));
    }

    public b2.f e() {
        b2.f fVar = new b2.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f26352b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                fVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        t1.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f26351a);
        return fVar;
    }

    public Collection<b2> f() {
        return Collections.unmodifiableCollection(h(j2.f26337a));
    }

    public final b g(String str, b2 b2Var) {
        b bVar = this.f26352b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(b2Var);
        this.f26352b.put(str, bVar2);
        return bVar2;
    }

    public final Collection<b2> h(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f26352b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().c());
            }
        }
        return arrayList;
    }

    public boolean i(String str) {
        if (!this.f26352b.containsKey(str)) {
            return false;
        }
        return this.f26352b.get(str).b();
    }

    public void l(String str) {
        this.f26352b.remove(str);
    }

    public void m(String str, b2 b2Var) {
        g(str, b2Var).d(true);
    }

    public void n(String str, b2 b2Var) {
        g(str, b2Var).e(true);
    }

    public void o(String str) {
        if (this.f26352b.containsKey(str)) {
            b bVar = this.f26352b.get(str);
            bVar.e(false);
            if (!bVar.a()) {
                this.f26352b.remove(str);
            }
        }
    }

    public void p(String str) {
        if (this.f26352b.containsKey(str)) {
            b bVar = this.f26352b.get(str);
            bVar.d(false);
            if (!bVar.b()) {
                this.f26352b.remove(str);
            }
        }
    }

    public void q(String str, b2 b2Var) {
        if (this.f26352b.containsKey(str)) {
            b bVar = new b(b2Var);
            b bVar2 = this.f26352b.get(str);
            bVar.e(bVar2.b());
            bVar.d(bVar2.a());
            this.f26352b.put(str, bVar);
        }
    }
}
