package p148k5;

import com.google.android.gms.common.api.Status;
import p118i5.C5217a;
import p133j5.C5861b;
import p163l5.AbstractC6325c;
import p163l5.C6340f;
import p163l5.C6371p;
import p163l5.C6381s;
import p163l5.C6384t;
import p177m6.AbstractC6763f;
import p177m6.AbstractC6775l;
import p232q5.C8242b;

public final class C6140m1<T> implements AbstractC6763f<T> {
    public final C6106f f19469a;
    public final int f19470b;
    public final C6085b<?> f19471c;
    public final long f19472d;

    public C6140m1(C6106f fVar, int i, C6085b<?> bVar, long j, String str, String str2) {
        this.f19469a = fVar;
        this.f19470b = i;
        this.f19471c = bVar;
        this.f19472d = j;
    }

    public static <T> C6140m1<T> m21198b(C6106f fVar, int i, C6085b<?> bVar) {
        boolean z;
        if (!fVar.m21289t()) {
            return null;
        }
        C6384t a = C6381s.m20497b().m20498a();
        if (a == null) {
            z = true;
        } else if (!a.m20489d()) {
            return null;
        } else {
            z = a.m20488e();
            C6093c1 p = fVar.m21293p(bVar);
            if (p != null) {
                if (!(p.m21340v() instanceof AbstractC6325c)) {
                    return null;
                }
                AbstractC6325c cVar = (AbstractC6325c) p.m21340v();
                if (cVar.m20662M() && !cVar.m20640g()) {
                    C6340f c = m21197c(p, cVar, i);
                    if (c == null) {
                        return null;
                    }
                    p.m21366I();
                    z = c.m20589f();
                }
            }
        }
        return new C6140m1<>(fVar, i, bVar, z ? System.currentTimeMillis() : 0L, null, null);
    }

    public static C6340f m21197c(C6093c1<?> c1Var, AbstractC6325c<?> cVar, int i) {
        int[] c;
        int[] d;
        C6340f K = cVar.m20663K();
        if (K == null || !K.m20590e() || ((c = K.m20592c()) != null ? !C8242b.m13056a(c, i) : !((d = K.m20591d()) == null || !C8242b.m13056a(d, i))) || c1Var.m21367H() >= K.m20593b()) {
            return null;
        }
        return K;
    }

    @Override
    public final void mo10608a(AbstractC6775l<T> lVar) {
        C6093c1 p;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        if (this.f19469a.m21289t()) {
            C6384t a = C6381s.m20497b().m20498a();
            if ((a == null || a.m20489d()) && (p = this.f19469a.m21293p(this.f19471c)) != null && (p.m21340v() instanceof AbstractC6325c)) {
                AbstractC6325c cVar = (AbstractC6325c) p.m21340v();
                boolean z = true;
                boolean z2 = this.f19472d > 0;
                int C = cVar.m20667C();
                if (a != null) {
                    z2 &= a.m20488e();
                    int b = a.m20491b();
                    int c = a.m20490c();
                    i3 = a.m20487f();
                    if (cVar.m20662M() && !cVar.m20640g()) {
                        C6340f c2 = m21197c(p, cVar, this.f19470b);
                        if (c2 != null) {
                            if (!c2.m20589f() || this.f19472d <= 0) {
                                z = false;
                            }
                            c = c2.m20593b();
                            z2 = z;
                        } else {
                            return;
                        }
                    }
                    i2 = b;
                    i = c;
                } else {
                    i3 = 0;
                    i2 = 5000;
                    i = 100;
                }
                C6106f fVar = this.f19469a;
                if (lVar.mo19065p()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (lVar.mo19067n()) {
                        i5 = 100;
                    } else {
                        Exception k = lVar.mo19070k();
                        if (k instanceof C5861b) {
                            Status a2 = ((C5861b) k).m21929a();
                            int c3 = a2.m30396c();
                            C5217a b2 = a2.m30397b();
                            i4 = b2 == null ? -1 : b2.m23615b();
                            i5 = c3;
                        } else {
                            i5 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.f19472d;
                    j = System.currentTimeMillis();
                    j2 = j3;
                } else {
                    j2 = 0;
                    j = 0;
                }
                fVar.m21284y(new C6371p(this.f19470b, i5, i4, j2, j, null, null, C), i3, i2, i);
            }
        }
    }
}
