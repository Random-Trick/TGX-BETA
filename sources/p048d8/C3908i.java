package p048d8;

import android.os.SystemClock;
import java.util.List;
import p009a8.AbstractC0213f;
import p009a8.C0218i;
import p033c6.AbstractC1656ab;
import p033c6.C1661b1;
import p033c6.C1669b9;
import p033c6.C1686cb;
import p033c6.C1698d8;
import p033c6.C1716eb;
import p033c6.C1731fb;
import p033c6.C1874p8;
import p033c6.C1882q2;
import p033c6.C1896r2;
import p033c6.C1924t2;
import p033c6.C1957v7;
import p033c6.C1999y7;
import p033c6.EnumC1832m8;
import p033c6.EnumC1846n8;
import p033c6.EnumC1860o8;
import p033c6.EnumC2013z7;
import p035c8.C2033a;
import p035c8.C2035c;
import p063e8.C4164a;
import p077f8.C4321a;
import p077f8.C4324d;
import p163l5.C6378r;
import p314w7.C9987a;

public final class C3908i extends AbstractC0213f<List<C2033a>, C4164a> {
    public static final C4324d f13197j = C4324d.m28272b();
    public static boolean f13198k = true;
    public final C2035c f13199d;
    public final AbstractC3909j f13200e;
    public final C1686cb f13201f;
    public final C1716eb f13202g;
    public final C4321a f13203h = new C4321a();
    public boolean f13204i;

    public C3908i(C0218i iVar, C2035c cVar, AbstractC3909j jVar, C1686cb cbVar) {
        C6378r.m20505l(iVar, "MlKitContext can not be null");
        C6378r.m20505l(cVar, "BarcodeScannerOptions can not be null");
        this.f13199d = cVar;
        this.f13200e = jVar;
        this.f13201f = cbVar;
        this.f13202g = C1716eb.m36063a(iVar.m42078b());
    }

    @Override
    public final synchronized void mo29612b() {
        this.f13204i = this.f13200e.mo29601h();
    }

    @Override
    public final synchronized void mo29611d() {
        this.f13200e.zzb();
        f13198k = true;
    }

    public final synchronized List<C2033a> mo29610h(C4164a aVar) {
        EnumC1846n8 n8Var;
        List<C2033a> i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f13203h.m28283a(aVar);
        try {
            i = this.f13200e.mo29600i(aVar);
            m29606l(EnumC1846n8.NO_ERROR, elapsedRealtime, aVar, i);
            f13198k = false;
        } catch (C9987a e) {
            if (e.m6307a() == 14) {
                n8Var = EnumC1846n8.MODEL_NOT_DOWNLOADED;
            } else {
                n8Var = EnumC1846n8.UNKNOWN_ERROR;
            }
            m29606l(n8Var, elapsedRealtime, aVar, null);
            throw e;
        }
        return i;
    }

    public final C1731fb m29608j(long j, EnumC1846n8 n8Var, C1661b1 b1Var, C1661b1 b1Var2, C4164a aVar) {
        EnumC2013z7 z7Var;
        C1669b9 b9Var = new C1669b9();
        C1698d8 d8Var = new C1698d8();
        d8Var.m36084c(Long.valueOf(j));
        d8Var.m36083d(n8Var);
        d8Var.m36082e(Boolean.valueOf(f13198k));
        Boolean bool = Boolean.TRUE;
        d8Var.m36086a(bool);
        d8Var.m36085b(bool);
        b9Var.m36105h(d8Var.m36081f());
        b9Var.m36104i(C3901b.m29618c(this.f13199d));
        b9Var.m36108e(b1Var.m36115g());
        b9Var.m36107f(b1Var2.m36115g());
        int e = aVar.m28641e();
        int c = f13197j.m28271c(aVar);
        C1999y7 y7Var = new C1999y7();
        if (e == -1) {
            z7Var = EnumC2013z7.BITMAP;
        } else if (e == 35) {
            z7Var = EnumC2013z7.YUV_420_888;
        } else if (e == 842094169) {
            z7Var = EnumC2013z7.YV12;
        } else if (e == 16) {
            z7Var = EnumC2013z7.NV16;
        } else if (e != 17) {
            z7Var = EnumC2013z7.UNKNOWN_FORMAT;
        } else {
            z7Var = EnumC2013z7.NV21;
        }
        y7Var.m35834a(z7Var);
        y7Var.m35833b(Integer.valueOf(c));
        b9Var.m36106g(y7Var.m35831d());
        C1874p8 p8Var = new C1874p8();
        p8Var.m35957e(this.f13204i ? EnumC1832m8.TYPE_THICK : EnumC1832m8.TYPE_THIN);
        p8Var.m35955g(b9Var.m36103j());
        return C1731fb.m36048d(p8Var);
    }

    public final C1731fb m29607k(C1924t2 t2Var, int i, C1957v7 v7Var) {
        C1874p8 p8Var = new C1874p8();
        p8Var.m35957e(this.f13204i ? EnumC1832m8.TYPE_THICK : EnumC1832m8.TYPE_THIN);
        C1882q2 q2Var = new C1882q2();
        q2Var.m35943a(Integer.valueOf(i));
        q2Var.m35941c(t2Var);
        q2Var.m35942b(v7Var);
        p8Var.m35958d(q2Var.m35939e());
        return C1731fb.m36048d(p8Var);
    }

    public final void m29606l(final EnumC1846n8 n8Var, long j, final C4164a aVar, List<C2033a> list) {
        final C1661b1 b1Var = new C1661b1();
        final C1661b1 b1Var2 = new C1661b1();
        if (list != null) {
            for (C2033a aVar2 : list) {
                b1Var.m36117e(C3901b.m29620a(aVar2.m35789b()));
                b1Var2.m36117e(C3901b.m29619b(aVar2.m35787d()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f13201f.m36097b(new AbstractC1656ab() {
            @Override
            public final C1731fb zza() {
                return C3908i.this.m29608j(elapsedRealtime, n8Var, b1Var, b1Var2, aVar);
            }
        }, EnumC1860o8.ON_DEVICE_BARCODE_DETECT);
        C1896r2 r2Var = new C1896r2();
        r2Var.m35926e(n8Var);
        r2Var.m35925f(Boolean.valueOf(f13198k));
        r2Var.m35924g(C3901b.m29618c(this.f13199d));
        r2Var.m35928c(b1Var.m36115g());
        r2Var.m35927d(b1Var2.m36115g());
        this.f13201f.m36093f(r2Var.m35923h(), elapsedRealtime, EnumC1860o8.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, new C3906g(this));
        long currentTimeMillis = System.currentTimeMillis();
        this.f13202g.m36061c(true != this.f13204i ? 24301 : 24302, n8Var.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }
}
