package ee;

import android.graphics.RectF;
import android.media.Image;
import androidx.camera.core.k1;
import ce.j0;
import d8.b;
import d8.c;
import d8.d;
import h8.h;
import h8.k;
import h8.m;
import he.i;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l8.a;
import n6.f;
import n6.g;
import n6.l;
import oc.v0;
import org.thunderdog.challegram.Log;

public class h0 {
    public final l f11641b;
    public final Executor f11642c;
    public b f11644e;
    public boolean f11645f;
    public final ExecutorService f11640a = Executors.newSingleThreadExecutor();
    public final a f11643d = new a();

    public h0(v<?> vVar) {
        this.f11641b = vVar.f11740b;
        this.f11642c = q0.a.g(vVar.f11738a);
        if (v0.l1(j0.n()) && !i.c2().E2()) {
            try {
                this.f11644e = d.a(new c.a().b(Log.TAG_CRASH, new int[0]).a());
            } catch (Exception e10) {
                Log.e((int) Log.TAG_CAMERA, e10);
            }
        }
    }

    public void k(boolean z10, f8.a aVar, List list) {
        if (list.isEmpty()) {
            this.f11641b.j7();
            return;
        }
        d8.a aVar2 = (d8.a) list.get(0);
        if (z10) {
            this.f11641b.C2(aVar2.c(), new RectF(aVar2.a()), aVar.j(), aVar.f(), 0, false);
        } else {
            this.f11641b.C2(aVar2.c(), new RectF(aVar2.a()), aVar.f(), aVar.j(), 0, false);
        }
    }

    public void l(byte[] bArr, f8.a aVar, Runnable runnable, Exception exc) {
        if (exc instanceof x7.a) {
            this.f11645f = true;
            u(bArr, aVar.j(), aVar.f(), aVar.i(), runnable);
            return;
        }
        Log.e((int) Log.TAG_CAMERA, exc);
    }

    public static void m(Runnable runnable, l lVar) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void n(k kVar, RectF rectF, int i10, int i11, int i12) {
        this.f11641b.C2(kVar.b(), rectF, i10, i11, i12, true);
    }

    public void o(k kVar, RectF rectF, int i10, int i11, int i12) {
        this.f11641b.C2(kVar.b(), rectF, i10, i11, i12, true);
    }

    public void p(byte[] bArr, final int i10, final int i11, final int i12, Runnable runnable) {
        try {
            try {
                int v22 = this.f11641b.v2();
                final k v10 = v(bArr, i10, i11, i12);
                if (v10 == null || v10.b() == null || v10.b().isEmpty()) {
                    Executor executor = this.f11642c;
                    final l lVar = this.f11641b;
                    Objects.requireNonNull(lVar);
                    executor.execute(new Runnable() {
                        @Override
                        public final void run() {
                            l.this.j7();
                        }
                    });
                } else if (v22 == i12 || !v0.x1(v22)) {
                    final RectF t10 = t(v10, i12, false, i10, i11);
                    this.f11642c.execute(new Runnable() {
                        @Override
                        public final void run() {
                            h0.this.o(v10, t10, i10, i11, i12);
                        }
                    });
                } else {
                    final RectF t11 = t(v10, i12, true, i10, i11);
                    this.f11642c.execute(new Runnable() {
                        @Override
                        public final void run() {
                            h0.this.n(v10, t11, i11, i10, i12);
                        }
                    });
                }
                if (runnable == null) {
                    return;
                }
            } catch (Exception e10) {
                if (e10 instanceof h) {
                    Executor executor2 = this.f11642c;
                    final l lVar2 = this.f11641b;
                    Objects.requireNonNull(lVar2);
                    executor2.execute(new Runnable() {
                        @Override
                        public final void run() {
                            l.this.j7();
                        }
                    });
                } else {
                    Log.e((int) Log.TAG_CAMERA, e10);
                }
                if (runnable == null) {
                    return;
                }
            }
            runnable.run();
        } catch (Throwable th) {
            if (runnable != null) {
                runnable.run();
            }
            throw th;
        }
    }

    public final byte[] g(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public void h() {
        b bVar = this.f11644e;
        if (bVar != null) {
            bVar.close();
        }
        this.f11640a.shutdown();
        this.f11645f = false;
    }

    public final void i(final f8.a aVar, final byte[] bArr, final boolean z10, final Runnable runnable) {
        this.f11644e.z(aVar).f(this.f11642c, new n6.h() {
            @Override
            public final void a(Object obj) {
                h0.this.k(z10, aVar, (List) obj);
            }
        }).e(new g() {
            @Override
            public final void c(Exception exc) {
                h0.this.l(bArr, aVar, runnable, exc);
            }
        }).c(new f() {
            @Override
            public final void a(l lVar) {
                h0.m(runnable, lVar);
            }
        });
    }

    public boolean j() {
        return this.f11644e != null && !this.f11645f;
    }

    public void q(final k1 k1Var) {
        Image k02 = k1Var.k0();
        if (k02 == null) {
            k1Var.close();
        } else if (j()) {
            i(f8.a.b(k02, k1Var.a0().d()), g(k1Var.j()[0].a()), v0.x1(k1Var.a0().d()), new Runnable() {
                @Override
                public final void run() {
                    k1.this.close();
                }
            });
        } else {
            u(g(k1Var.j()[0].a()), k1Var.getWidth(), k1Var.getHeight(), k1Var.a0().d(), new Runnable() {
                @Override
                public final void run() {
                    k1.this.close();
                }
            });
        }
    }

    public void r(byte[] bArr, int i10, int i11, final fe.h hVar) {
        int G3 = this.f11641b.G3();
        if (j()) {
            f8.a a10 = f8.a.a(bArr, i10, i11, G3, 17);
            boolean x12 = v0.x1(G3);
            Objects.requireNonNull(hVar);
            i(a10, bArr, x12, new Runnable() {
                @Override
                public final void run() {
                    fe.h.this.I0();
                }
            });
            return;
        }
        Objects.requireNonNull(hVar);
        u(bArr, i10, i11, G3, new Runnable() {
            @Override
            public final void run() {
                fe.h.this.I0();
            }
        });
    }

    public final byte[] s(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == 0 || i12 % 90 != 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                if (i12 == 90) {
                    bArr2[(((i14 * i11) + i11) - i13) - 1] = bArr[(i13 * i10) + i14];
                } else if (i12 == 180) {
                    bArr2[(((((i11 - i13) - 1) * i10) + i10) - i14) - 1] = bArr[(i13 * i10) + i14];
                } else if (i12 == 270) {
                    bArr2[(i14 * i11) + i13] = bArr[(((i13 * i10) + i10) - i14) - 1];
                }
            }
        }
        return bArr2;
    }

    public final RectF t(k kVar, int i10, boolean z10, int i11, int i12) {
        m mVar;
        m mVar2;
        m mVar3;
        if (kVar.a().length < 3) {
            return null;
        }
        m[] a10 = kVar.a();
        int i13 = 0;
        if (v0.x1(i10)) {
            mVar2 = a10[2];
            mVar = a10[1];
            mVar3 = a10[0];
        } else {
            mVar2 = a10[0];
            mVar = a10[1];
            mVar3 = a10[2];
        }
        if (mVar2 instanceof n8.d) {
            i13 = ((int) ((n8.d) mVar2).i()) * 2;
        }
        int min = (int) Math.min(Math.min(mVar.c(), mVar3.c()), mVar2.c());
        int max = (int) Math.max(Math.max(mVar.c(), mVar3.c()), mVar2.c());
        int min2 = (int) Math.min(Math.min(mVar.d(), mVar3.d()), mVar2.d());
        int max2 = (int) Math.max(Math.max(mVar.d(), mVar3.d()), mVar2.d());
        if (z10) {
            max = i11 - min;
            min = i11 - max;
        }
        return new RectF(min - i13, min2 - i13, max + i13, max2 + i13);
    }

    public final void u(final byte[] bArr, final int i10, final int i11, final int i12, final Runnable runnable) {
        this.f11640a.submit(new Runnable() {
            @Override
            public final void run() {
                h0.this.p(bArr, i10, i11, i12, runnable);
            }
        });
    }

    public final k v(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (i12 != 0) {
            bArr = s(bArr, i10, i11, i12);
        }
        byte[] bArr2 = bArr;
        if (v0.x1(i12)) {
            i13 = i10;
            i14 = i11;
        } else {
            i14 = i10;
            i13 = i11;
        }
        return this.f11643d.a(new h8.c(new i8.i(new h8.i(bArr2, i14, i13, 0, 0, i14, i13, i12 == 180))));
    }
}
