package p9;

import android.media.MediaFormat;
import ca.b;
import ia.f;
import ja.n;
import ja.v;
import java.util.Collection;
import java.util.List;
import o9.c;
import o9.d;
import qa.r;
import ra.k;
import x9.i;
import x9.j;
import x9.m;

public final class g {
    public final i f20947a = new i("Segments");
    public final j<e> f20948b = m.b(null, null);
    public final j<Integer> f20949c = m.b(-1, -1);
    public final j<Integer> f20950d = m.b(0, 0);
    public final d f20951e;
    public final i f20952f;
    public final r<d, Integer, c, MediaFormat, v9.d> f20953g;

    public g(d dVar, i iVar, r<? super d, ? super Integer, ? super c, ? super MediaFormat, v9.d> rVar) {
        k.e(dVar, "sources");
        k.e(iVar, "tracks");
        k.e(rVar, "factory");
        this.f20951e = dVar;
        this.f20952f = iVar;
        this.f20953g = rVar;
    }

    public final void a(e eVar) {
        eVar.e();
        b bVar = this.f20951e.n(eVar.d()).get(eVar.c());
        if (this.f20952f.a().q(eVar.d())) {
            bVar.n(eVar.d());
        }
        this.f20950d.e(eVar.d(), Integer.valueOf(eVar.c() + 1));
    }

    public final j<Integer> b() {
        return this.f20949c;
    }

    public final boolean c() {
        return d(d.VIDEO) || d(d.AUDIO);
    }

    public final boolean d(d dVar) {
        k.e(dVar, "type");
        if (!this.f20951e.q(dVar)) {
            return false;
        }
        i iVar = this.f20947a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hasNext(");
        sb2.append(dVar);
        sb2.append("): segment=");
        sb2.append(this.f20948b.o(dVar));
        sb2.append(" lastIndex=");
        List<? extends b> o10 = this.f20951e.o(dVar);
        Boolean bool = null;
        sb2.append(o10 != null ? Integer.valueOf(n.g(o10)) : null);
        sb2.append(" canAdvance=");
        e o11 = this.f20948b.o(dVar);
        if (o11 != null) {
            bool = Boolean.valueOf(o11.b());
        }
        sb2.append(bool);
        iVar.h(sb2.toString());
        e o12 = this.f20948b.o(dVar);
        if (o12 == null) {
            return true;
        }
        List<? extends b> o13 = this.f20951e.o(dVar);
        if (o13 == null) {
            return false;
        }
        return o12.b() || o12.c() < n.g(o13);
    }

    public final e e(d dVar) {
        k.e(dVar, "type");
        int intValue = this.f20949c.n(dVar).intValue();
        int intValue2 = this.f20950d.n(dVar).intValue();
        if (intValue2 < intValue) {
            throw new IllegalStateException(("Requested index " + intValue2 + " smaller than " + intValue + '.').toString());
        } else if (intValue2 > intValue) {
            return g(dVar, intValue2);
        } else {
            if (this.f20948b.n(dVar).b()) {
                return this.f20948b.n(dVar);
            }
            a(this.f20948b.n(dVar));
            return e(dVar);
        }
    }

    public final void f() {
        e j10 = this.f20948b.j();
        if (j10 != null) {
            a(j10);
        }
        e k10 = this.f20948b.k();
        if (k10 != null) {
            a(k10);
        }
    }

    public final e g(d dVar, int i10) {
        d dVar2;
        boolean z10;
        b bVar = (b) v.D(this.f20951e.n(dVar), i10);
        if (bVar == null) {
            return null;
        }
        i iVar = this.f20947a;
        iVar.c("tryCreateSegment(" + dVar + ", " + i10 + "): created!");
        if (this.f20952f.a().q(dVar)) {
            bVar.f(dVar);
            int i11 = f.f20946a[dVar.ordinal()];
            boolean z11 = true;
            if (i11 == 1) {
                dVar2 = d.VIDEO;
            } else if (i11 == 2) {
                dVar2 = d.AUDIO;
            } else {
                throw new f();
            }
            if (this.f20952f.a().q(dVar2)) {
                List<b> s10 = this.f20951e.n(dVar2);
                if (!(s10 instanceof Collection) || !s10.isEmpty()) {
                    for (b bVar2 : s10) {
                        if (bVar2 == bVar) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    bVar.f(dVar2);
                }
            }
        }
        this.f20949c.e(dVar, Integer.valueOf(i10));
        e eVar = new e(dVar, i10, this.f20953g.c(dVar, Integer.valueOf(i10), this.f20952f.b().n(dVar), this.f20952f.c().n(dVar)));
        this.f20948b.e(dVar, eVar);
        return eVar;
    }
}
