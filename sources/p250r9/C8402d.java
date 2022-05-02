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
    public final C10007i f27282a = new C10007i("DecoderDropper");
    public final Map<C10027j, Long> f27283b = new LinkedHashMap();
    public final List<C10027j> f27284c = new ArrayList();
    public C10027j f27285d;
    public Long f27286e;
    public Long f27287f;
    public final boolean f27288g;

    public C8402d(boolean z) {
        this.f27288g = z;
    }

    public static void m12568b(C8402d dVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        dVar.m12569a(str, z);
    }

    public final void m12569a(String str, boolean z) {
    }

    public final void m12567c(long j, boolean z) {
        long j2;
        if (this.f27286e == null) {
            this.f27286e = Long.valueOf(j);
        }
        if (z) {
            m12568b(this, "INPUT: inputUs=" + j, false, 2, null);
            C10027j jVar = this.f27285d;
            if (jVar == null) {
                this.f27285d = new C10027j(j, Long.MAX_VALUE);
                return;
            }
            C8298k.m12935c(jVar);
            this.f27285d = new C10027j(jVar.m6201r(), j);
            return;
        }
        m12568b(this, "INPUT: Got SKIPPING input! inputUs=" + j, false, 2, null);
        C10027j jVar2 = this.f27285d;
        if (jVar2 != null) {
            C8298k.m12935c(jVar2);
            if (jVar2.m6200s() != Long.MAX_VALUE) {
                List<C10027j> list = this.f27284c;
                C10027j jVar3 = this.f27285d;
                C8298k.m12935c(jVar3);
                list.add(jVar3);
                Map<C10027j, Long> map = this.f27283b;
                C10027j jVar4 = this.f27285d;
                C8298k.m12935c(jVar4);
                if (this.f27284c.size() >= 2) {
                    C10027j jVar5 = this.f27285d;
                    C8298k.m12935c(jVar5);
                    long r = jVar5.m6201r();
                    List<C10027j> list2 = this.f27284c;
                    j2 = r - list2.get(C5304n.m23366g(list2) - 1).m6200s();
                } else {
                    j2 = 0;
                }
                map.put(jVar4, Long.valueOf(j2));
            }
        }
        this.f27285d = null;
    }

    public final Long m12566d(long j) {
        if (this.f27287f == null) {
            this.f27287f = Long.valueOf(j);
        }
        Long l = this.f27286e;
        C8298k.m12935c(l);
        long longValue = l.longValue();
        Long l2 = this.f27287f;
        C8298k.m12935c(l2);
        long longValue2 = longValue + (j - l2.longValue());
        long j2 = 0;
        for (C10027j jVar : this.f27284c) {
            Long l3 = this.f27283b.get(jVar);
            C8298k.m12935c(l3);
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
                m12568b(this, sb2.toString(), false, 2, null);
                return this.f27288g ? Long.valueOf(j3) : Long.valueOf(j);
            }
        }
        C10027j jVar2 = this.f27285d;
        if (jVar2 != null) {
            C8298k.m12935c(jVar2);
            if (jVar2.m6197u(longValue2)) {
                if (!this.f27284c.isEmpty()) {
                    C10027j jVar3 = this.f27285d;
                    C8298k.m12935c(jVar3);
                    j2 += jVar3.m6201r() - ((C10027j) C5312v.m23340I(this.f27284c)).m6200s();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("OUTPUT: Rendering! outputTimeUs=");
                sb3.append(j);
                sb3.append(" newOutputTimeUs=");
                long j4 = j - j2;
                sb3.append(j4);
                sb3.append(" deltaUs=");
                sb3.append(j2);
                m12568b(this, sb3.toString(), false, 2, null);
                return this.f27288g ? Long.valueOf(j4) : Long.valueOf(j);
            }
        }
        m12569a("OUTPUT: SKIPPING! outputTimeUs=" + j, true);
        return null;
    }
}
