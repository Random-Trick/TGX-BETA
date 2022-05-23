package e8;

import android.os.SystemClock;
import b8.f;
import d6.ab;
import d6.b1;
import d6.b9;
import d6.cb;
import d6.d8;
import d6.eb;
import d6.fb;
import d6.m8;
import d6.n8;
import d6.o8;
import d6.p8;
import d6.q2;
import d6.r2;
import d6.t2;
import d6.v7;
import d6.y7;
import d6.z7;
import d8.a;
import d8.c;
import g8.d;
import java.util.List;
import m5.r;

public final class i extends f<List<a>, f8.a> {
    public static final d f11370j = d.b();
    public static boolean f11371k = true;
    public final c f11372d;
    public final j f11373e;
    public final cb f11374f;
    public final eb f11375g;
    public final g8.a f11376h = new g8.a();
    public boolean f11377i;

    public i(b8.i iVar, c cVar, j jVar, cb cbVar) {
        r.l(iVar, "MlKitContext can not be null");
        r.l(cVar, "BarcodeScannerOptions can not be null");
        this.f11372d = cVar;
        this.f11373e = jVar;
        this.f11374f = cbVar;
        this.f11375g = eb.a(iVar.b());
    }

    @Override
    public final synchronized void b() {
        this.f11377i = this.f11373e.h();
    }

    @Override
    public final synchronized void d() {
        this.f11373e.zzb();
        f11371k = true;
    }

    public final synchronized List<a> h(f8.a aVar) {
        n8 n8Var;
        List<a> a10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f11376h.a(aVar);
        try {
            a10 = this.f11373e.a(aVar);
            l(n8.NO_ERROR, elapsedRealtime, aVar, a10);
            f11371k = false;
        } catch (x7.a e10) {
            if (e10.a() == 14) {
                n8Var = n8.MODEL_NOT_DOWNLOADED;
            } else {
                n8Var = n8.UNKNOWN_ERROR;
            }
            l(n8Var, elapsedRealtime, aVar, null);
            throw e10;
        }
        return a10;
    }

    public final fb j(long j10, n8 n8Var, b1 b1Var, b1 b1Var2, f8.a aVar) {
        z7 z7Var;
        b9 b9Var = new b9();
        d8 d8Var = new d8();
        d8Var.c(Long.valueOf(j10));
        d8Var.d(n8Var);
        d8Var.e(Boolean.valueOf(f11371k));
        Boolean bool = Boolean.TRUE;
        d8Var.a(bool);
        d8Var.b(bool);
        b9Var.h(d8Var.f());
        b9Var.i(b.c(this.f11372d));
        b9Var.e(b1Var.g());
        b9Var.f(b1Var2.g());
        int e10 = aVar.e();
        int c10 = f11370j.c(aVar);
        y7 y7Var = new y7();
        if (e10 == -1) {
            z7Var = z7.BITMAP;
        } else if (e10 == 35) {
            z7Var = z7.YUV_420_888;
        } else if (e10 == 842094169) {
            z7Var = z7.YV12;
        } else if (e10 == 16) {
            z7Var = z7.NV16;
        } else if (e10 != 17) {
            z7Var = z7.UNKNOWN_FORMAT;
        } else {
            z7Var = z7.NV21;
        }
        y7Var.a(z7Var);
        y7Var.b(Integer.valueOf(c10));
        b9Var.g(y7Var.d());
        p8 p8Var = new p8();
        p8Var.e(this.f11377i ? m8.TYPE_THICK : m8.TYPE_THIN);
        p8Var.g(b9Var.j());
        return fb.d(p8Var);
    }

    public final fb k(t2 t2Var, int i10, v7 v7Var) {
        p8 p8Var = new p8();
        p8Var.e(this.f11377i ? m8.TYPE_THICK : m8.TYPE_THIN);
        q2 q2Var = new q2();
        q2Var.a(Integer.valueOf(i10));
        q2Var.c(t2Var);
        q2Var.b(v7Var);
        p8Var.d(q2Var.e());
        return fb.d(p8Var);
    }

    public final void l(final n8 n8Var, long j10, final f8.a aVar, List<a> list) {
        final b1 b1Var = new b1();
        final b1 b1Var2 = new b1();
        if (list != null) {
            for (a aVar2 : list) {
                b1Var.e(b.a(aVar2.b()));
                b1Var2.e(b.b(aVar2.d()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f11374f.b(new ab() {
            @Override
            public final fb zza() {
                return i.this.j(elapsedRealtime, n8Var, b1Var, b1Var2, aVar);
            }
        }, o8.ON_DEVICE_BARCODE_DETECT);
        r2 r2Var = new r2();
        r2Var.e(n8Var);
        r2Var.f(Boolean.valueOf(f11371k));
        r2Var.g(b.c(this.f11372d));
        r2Var.c(b1Var.g());
        r2Var.d(b1Var2.g());
        this.f11374f.f(r2Var.h(), elapsedRealtime, o8.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, new g(this));
        long currentTimeMillis = System.currentTimeMillis();
        this.f11375g.c(true != this.f11377i ? 24301 : 24302, n8Var.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }
}
