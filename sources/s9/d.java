package s9;

import ja.n;
import ja.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ra.k;
import x9.i;
import xa.j;

public final class d {
    public final i f22649a = new i("DecoderDropper");
    public final Map<j, Long> f22650b = new LinkedHashMap();
    public final List<j> f22651c = new ArrayList();
    public j f22652d;
    public Long f22653e;
    public Long f22654f;
    public final boolean f22655g;

    public d(boolean z10) {
        this.f22655g = z10;
    }

    public static void b(d dVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        dVar.a(str, z10);
    }

    public final void a(String str, boolean z10) {
    }

    public final void c(long j10, boolean z10) {
        long j11;
        if (this.f22653e == null) {
            this.f22653e = Long.valueOf(j10);
        }
        if (z10) {
            b(this, "INPUT: inputUs=" + j10, false, 2, null);
            j jVar = this.f22652d;
            if (jVar == null) {
                this.f22652d = new j(j10, Long.MAX_VALUE);
                return;
            }
            k.c(jVar);
            this.f22652d = new j(jVar.r(), j10);
            return;
        }
        b(this, "INPUT: Got SKIPPING input! inputUs=" + j10, false, 2, null);
        j jVar2 = this.f22652d;
        if (jVar2 != null) {
            k.c(jVar2);
            if (jVar2.s() != Long.MAX_VALUE) {
                List<j> list = this.f22651c;
                j jVar3 = this.f22652d;
                k.c(jVar3);
                list.add(jVar3);
                Map<j, Long> map = this.f22650b;
                j jVar4 = this.f22652d;
                k.c(jVar4);
                if (this.f22651c.size() >= 2) {
                    j jVar5 = this.f22652d;
                    k.c(jVar5);
                    long r10 = jVar5.r();
                    List<j> list2 = this.f22651c;
                    j11 = r10 - list2.get(n.g(list2) - 1).s();
                } else {
                    j11 = 0;
                }
                map.put(jVar4, Long.valueOf(j11));
            }
        }
        this.f22652d = null;
    }

    public final Long d(long j10) {
        if (this.f22654f == null) {
            this.f22654f = Long.valueOf(j10);
        }
        Long l10 = this.f22653e;
        k.c(l10);
        long longValue = l10.longValue();
        Long l11 = this.f22654f;
        k.c(l11);
        long longValue2 = longValue + (j10 - l11.longValue());
        long j11 = 0;
        for (j jVar : this.f22651c) {
            Long l12 = this.f22650b.get(jVar);
            k.c(l12);
            j11 += l12.longValue();
            if (jVar.u(longValue2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("OUTPUT: Rendering! outputTimeUs=");
                sb2.append(j10);
                sb2.append(" newOutputTimeUs=");
                long j12 = j10 - j11;
                sb2.append(j12);
                sb2.append(" deltaUs=");
                sb2.append(j11);
                b(this, sb2.toString(), false, 2, null);
                return this.f22655g ? Long.valueOf(j12) : Long.valueOf(j10);
            }
        }
        j jVar2 = this.f22652d;
        if (jVar2 != null) {
            k.c(jVar2);
            if (jVar2.u(longValue2)) {
                if (!this.f22651c.isEmpty()) {
                    j jVar3 = this.f22652d;
                    k.c(jVar3);
                    j11 += jVar3.r() - ((j) v.I(this.f22651c)).s();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("OUTPUT: Rendering! outputTimeUs=");
                sb3.append(j10);
                sb3.append(" newOutputTimeUs=");
                long j13 = j10 - j11;
                sb3.append(j13);
                sb3.append(" deltaUs=");
                sb3.append(j11);
                b(this, sb3.toString(), false, 2, null);
                return this.f22655g ? Long.valueOf(j13) : Long.valueOf(j10);
            }
        }
        a("OUTPUT: SKIPPING! outputTimeUs=" + j10, true);
        return null;
    }
}
