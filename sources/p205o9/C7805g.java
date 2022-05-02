package p205o9;

import android.media.MediaFormat;
import ba.AbstractC1296b;
import java.util.Collection;
import java.util.List;
import p107ha.C5046f;
import p123ia.C5304n;
import p123ia.C5312v;
import p192n9.EnumC7311c;
import p192n9.EnumC7313d;
import p289u9.C9464d;
import p316w9.AbstractC10008j;
import p316w9.C10007i;
import p316w9.C10014m;
import pa.AbstractC8094r;
import qa.C8298k;

public final class C7805g {
    public final C10007i f24997a = new C10007i("Segments");
    public final AbstractC10008j<C7803e> f24998b = C10014m.m6222b(null, null);
    public final AbstractC10008j<Integer> f24999c = C10014m.m6222b(-1, -1);
    public final AbstractC10008j<Integer> f25000d = C10014m.m6222b(0, 0);
    public final C7802d f25001e;
    public final C7811i f25002f;
    public final AbstractC8094r<EnumC7313d, Integer, EnumC7311c, MediaFormat, C9464d> f25003g;

    public C7805g(C7802d dVar, C7811i iVar, AbstractC8094r<? super EnumC7313d, ? super Integer, ? super EnumC7311c, ? super MediaFormat, C9464d> rVar) {
        C8298k.m12934e(dVar, "sources");
        C8298k.m12934e(iVar, "tracks");
        C8298k.m12934e(rVar, "factory");
        this.f25001e = dVar;
        this.f25002f = iVar;
        this.f25003g = rVar;
    }

    public final void m15030a(C7803e eVar) {
        eVar.m15031e();
        AbstractC1296b bVar = this.f25001e.mo6239d(eVar.m15032d()).get(eVar.m15033c());
        if (this.f25002f.m14990a().mo6237g(eVar.m15032d())) {
            bVar.mo6283l(eVar.m15032d());
        }
        this.f25000d.mo6256p(eVar.m15032d(), Integer.valueOf(eVar.m15033c() + 1));
    }

    public final AbstractC10008j<Integer> m15029b() {
        return this.f24999c;
    }

    public final boolean m15028c() {
        return m15027d(EnumC7313d.VIDEO) || m15027d(EnumC7313d.AUDIO);
    }

    public final boolean m15027d(EnumC7313d dVar) {
        C8298k.m12934e(dVar, "type");
        if (!this.f25001e.mo6237g(dVar)) {
            return false;
        }
        C10007i iVar = this.f24997a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hasNext(");
        sb2.append(dVar);
        sb2.append("): segment=");
        sb2.append(this.f24998b.mo6238f(dVar));
        sb2.append(" lastIndex=");
        List<? extends AbstractC1296b> f = this.f25001e.mo6238f(dVar);
        Boolean bool = null;
        sb2.append(f != null ? Integer.valueOf(C5304n.m23365g(f)) : null);
        sb2.append(" canAdvance=");
        C7803e f2 = this.f24998b.mo6238f(dVar);
        if (f2 != null) {
            bool = Boolean.valueOf(f2.m15034b());
        }
        sb2.append(bool);
        iVar.m6262h(sb2.toString());
        C7803e f3 = this.f24998b.mo6238f(dVar);
        if (f3 == null) {
            return true;
        }
        List<? extends AbstractC1296b> f4 = this.f25001e.mo6238f(dVar);
        if (f4 == null) {
            return false;
        }
        return f3.m15034b() || f3.m15033c() < C5304n.m23365g(f4);
    }

    public final C7803e m15026e(EnumC7313d dVar) {
        C8298k.m12934e(dVar, "type");
        int intValue = this.f24999c.mo6239d(dVar).intValue();
        int intValue2 = this.f25000d.mo6239d(dVar).intValue();
        if (intValue2 < intValue) {
            throw new IllegalStateException(("Requested index " + intValue2 + " smaller than " + intValue + '.').toString());
        } else if (intValue2 > intValue) {
            return m15024g(dVar, intValue2);
        } else {
            if (this.f24998b.mo6239d(dVar).m15034b()) {
                return this.f24998b.mo6239d(dVar);
            }
            m15030a(this.f24998b.mo6239d(dVar));
            return m15026e(dVar);
        }
    }

    public final void m15025f() {
        C7803e l = this.f24998b.mo6235l();
        if (l != null) {
            m15030a(l);
        }
        C7803e n = this.f24998b.mo6234n();
        if (n != null) {
            m15030a(n);
        }
    }

    public final C7803e m15024g(EnumC7313d dVar, int i) {
        EnumC7313d dVar2;
        boolean z;
        AbstractC1296b bVar = (AbstractC1296b) C5312v.m23344D(this.f25001e.mo6239d(dVar), i);
        if (bVar == null) {
            return null;
        }
        C10007i iVar = this.f24997a;
        iVar.m6267c("tryCreateSegment(" + dVar + ", " + i + "): created!");
        if (this.f25002f.m14990a().mo6237g(dVar)) {
            bVar.mo6287h(dVar);
            int i2 = C7804f.f24996a[dVar.ordinal()];
            boolean z2 = true;
            if (i2 == 1) {
                dVar2 = EnumC7313d.VIDEO;
            } else if (i2 == 2) {
                dVar2 = EnumC7313d.AUDIO;
            } else {
                throw new C5046f();
            }
            if (this.f25002f.m14990a().mo6237g(dVar2)) {
                List<AbstractC1296b> s = this.f25001e.mo6239d(dVar2);
                if (!(s instanceof Collection) || !s.isEmpty()) {
                    for (AbstractC1296b bVar2 : s) {
                        if (bVar2 == bVar) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    bVar.mo6287h(dVar2);
                }
            }
        }
        this.f24999c.mo6256p(dVar, Integer.valueOf(i));
        C7803e eVar = new C7803e(dVar, i, this.f25003g.mo6684c(dVar, Integer.valueOf(i), this.f25002f.m14989b().mo6239d(dVar), this.f25002f.m14988c().mo6239d(dVar)));
        this.f24998b.mo6256p(dVar, eVar);
        return eVar;
    }
}
