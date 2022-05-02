package p250r9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p123ia.C5304n;
import p123ia.C5312v;
import p316w9.C10007i;
import p317wa.C10027j;
import qa.C8298k;

public final class C8402d {
    public final C10007i f27279a = new C10007i("DecoderDropper");
    public final Map<C10027j, Long> f27280b = new LinkedHashMap();
    public final List<C10027j> f27281c = new ArrayList();
    public C10027j f27282d;
    public Long f27283e;
    public Long f27284f;
    public final boolean f27285g;

    public C8402d(boolean z) {
        this.f27285g = z;
    }

    public static void m12569b(C8402d dVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        dVar.m12570a(str, z);
    }

    public final void m12570a(String str, boolean z) {
    }

    public final void m12568c(long j, boolean z) {
        long j2;
        if (this.f27283e == null) {
            this.f27283e = Long.valueOf(j);
        }
        if (z) {
            m12569b(this, "INPUT: inputUs=" + j, false, 2, null);
            C10027j jVar = this.f27282d;
            if (jVar == null) {
                this.f27282d = new C10027j(j, Long.MAX_VALUE);
                return;
            }
            C8298k.m12936c(jVar);
            this.f27282d = new C10027j(jVar.m6201r(), j);
            return;
        }
        m12569b(this, "INPUT: Got SKIPPING input! inputUs=" + j, false, 2, null);
        C10027j jVar2 = this.f27282d;
        if (jVar2 != null) {
            C8298k.m12936c(jVar2);
            if (jVar2.m6200s() != Long.MAX_VALUE) {
                List<C10027j> list = this.f27281c;
                C10027j jVar3 = this.f27282d;
                C8298k.m12936c(jVar3);
                list.add(jVar3);
                Map<C10027j, Long> map = this.f27280b;
                C10027j jVar4 = this.f27282d;
                C8298k.m12936c(jVar4);
                if (this.f27281c.size() >= 2) {
                    C10027j jVar5 = this.f27282d;
                    C8298k.m12936c(jVar5);
                    long r = jVar5.m6201r();
                    List<C10027j> list2 = this.f27281c;
                    j2 = r - list2.get(C5304n.m23365g(list2) - 1).m6200s();
                } else {
                    j2 = 0;
                }
                map.put(jVar4, Long.valueOf(j2));
            }
        }
        this.f27282d = null;
    }

    public final Long m12567d(long j) {
        if (this.f27284f == null) {
            this.f27284f = Long.valueOf(j);
        }
        Long l = this.f27283e;
        C8298k.m12936c(l);
        long longValue = l.longValue();
        Long l2 = this.f27284f;
        C8298k.m12936c(l2);
        long longValue2 = longValue + (j - l2.longValue());
        long j2 = 0;
        for (C10027j jVar : this.f27281c) {
            Long l3 = this.f27280b.get(jVar);
            C8298k.m12936c(l3);
            j2 += l3.longValue();
            if (jVar.m6197u(longValue2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("OUTPUT: Rendering! outputTimeUs=");
                sb2.append(j);
                sb2.append(" newOutputTimeUs=");
                long j3 = j - j2;
                sb2.append(j3);
                sb2.append(" deltaUs=");
                sb2.append(j2);
                m12569b(this, sb2.toString(), false, 2, null);
                return this.f27285g ? Long.valueOf(j3) : Long.valueOf(j);
            }
        }
        C10027j jVar2 = this.f27282d;
        if (jVar2 != null) {
            C8298k.m12936c(jVar2);
            if (jVar2.m6197u(longValue2)) {
                if (!this.f27281c.isEmpty()) {
                    C10027j jVar3 = this.f27282d;
                    C8298k.m12936c(jVar3);
                    j2 += jVar3.m6201r() - ((C10027j) C5312v.m23339I(this.f27281c)).m6200s();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("OUTPUT: Rendering! outputTimeUs=");
                sb3.append(j);
                sb3.append(" newOutputTimeUs=");
                long j4 = j - j2;
                sb3.append(j4);
                sb3.append(" deltaUs=");
                sb3.append(j2);
                m12569b(this, sb3.toString(), false, 2, null);
                return this.f27285g ? Long.valueOf(j4) : Long.valueOf(j);
            }
        }
        m12570a("OUTPUT: SKIPPING! outputTimeUs=" + j, true);
        return null;
    }
}
