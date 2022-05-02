package de;

import android.graphics.RectF;
import android.media.Image;
import androidx.camera.core.AbstractC0610l1;
import be.C1379j0;
import ee.C4193h;
import ge.C4868i;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import p035c8.AbstractC2034b;
import p035c8.C2033a;
import p035c8.C2035c;
import p035c8.C2037d;
import p063e8.C4164a;
import p093g8.C4520c;
import p093g8.C4525h;
import p093g8.C4526i;
import p093g8.C4528k;
import p093g8.C4530m;
import p105h8.C5030i;
import p151k8.C6217a;
import p177m6.AbstractC6763f;
import p177m6.AbstractC6765g;
import p177m6.AbstractC6767h;
import p177m6.AbstractC6775l;
import p179m8.C6798d;
import p227q0.C8117a;
import p314w7.C9987a;

public class C4040h0 {
    public final AbstractC4055l f13565b;
    public final Executor f13566c;
    public AbstractC2034b f13568e;
    public boolean f13569f;
    public final ExecutorService f13564a = Executors.newSingleThreadExecutor();
    public final C6217a f13567d = new C6217a();

    public C4040h0(AbstractC4067v<?> vVar) {
        this.f13565b = vVar.f13726b;
        this.f13566c = C8117a.m13435i(vVar.f13724a);
        if (C7389v0.m16612l1(C1379j0.m37315n()) && !C4868i.m24726c2().m24896E2()) {
            try {
                this.f13568e = C2037d.m35782a(new C2035c.C2036a().m35783b(Log.TAG_CRASH, new int[0]).m35784a());
            } catch (Exception e) {
                Log.m14726e((int) Log.TAG_CAMERA, e);
            }
        }
    }

    public void m29249k(boolean z, C4164a aVar, List list) {
        if (list.isEmpty()) {
            this.f13565b.mo29121j7();
            return;
        }
        C2033a aVar2 = (C2033a) list.get(0);
        if (z) {
            this.f13565b.mo29131L2(aVar2.m35788c(), new RectF(aVar2.m35790a()), aVar.m28636j(), aVar.m28640f(), 0, false);
        } else {
            this.f13565b.mo29131L2(aVar2.m35788c(), new RectF(aVar2.m35790a()), aVar.m28640f(), aVar.m28636j(), 0, false);
        }
    }

    public void m29248l(byte[] bArr, C4164a aVar, Runnable runnable, Exception exc) {
        if (exc instanceof C9987a) {
            this.f13569f = true;
            m29239u(bArr, aVar.m28636j(), aVar.m28640f(), aVar.m28637i(), runnable);
            return;
        }
        Log.m14726e((int) Log.TAG_CAMERA, exc);
    }

    public static void m29247m(Runnable runnable, AbstractC6775l lVar) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void m29246n(C4528k kVar, RectF rectF, int i, int i2, int i3) {
        this.f13565b.mo29131L2(kVar.m27491b(), rectF, i, i2, i3, true);
    }

    public void m29245o(C4528k kVar, RectF rectF, int i, int i2, int i3) {
        this.f13565b.mo29131L2(kVar.m27491b(), rectF, i, i2, i3, true);
    }

    public void m29244p(byte[] bArr, final int i, final int i2, final int i3, Runnable runnable) {
        try {
            try {
                int C2 = this.f13565b.mo29135C2();
                final C4528k v = m29238v(bArr, i, i2, i3);
                if (v == null || v.m27491b() == null || v.m27491b().isEmpty()) {
                    Executor executor = this.f13566c;
                    final AbstractC4055l lVar = this.f13565b;
                    Objects.requireNonNull(lVar);
                    executor.execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC4055l.this.mo29121j7();
                        }
                    });
                } else if (C2 == i3 || !C7389v0.m16564x1(C2)) {
                    final RectF t = m29240t(v, i3, false, i, i2);
                    this.f13566c.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C4040h0.this.m29245o(v, t, i, i2, i3);
                        }
                    });
                } else {
                    final RectF t2 = m29240t(v, i3, true, i, i2);
                    this.f13566c.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C4040h0.this.m29246n(v, t2, i2, i, i3);
                        }
                    });
                }
                if (runnable == null) {
                    return;
                }
            } catch (Exception e) {
                if (e instanceof C4525h) {
                    Executor executor2 = this.f13566c;
                    final AbstractC4055l lVar2 = this.f13565b;
                    Objects.requireNonNull(lVar2);
                    executor2.execute(new Runnable() {
                        @Override
                        public final void run() {
                            AbstractC4055l.this.mo29121j7();
                        }
                    });
                } else {
                    Log.m14726e((int) Log.TAG_CAMERA, e);
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

    public final byte[] m29253g(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public void m29252h() {
        AbstractC2034b bVar = this.f13568e;
        if (bVar != null) {
            bVar.close();
        }
        this.f13564a.shutdown();
        this.f13569f = false;
    }

    public final void m29251i(final C4164a aVar, final byte[] bArr, final boolean z, final Runnable runnable) {
        this.f13568e.mo30125n0(aVar).mo19075f(this.f13566c, new AbstractC6767h() {
            @Override
            public final void mo3951a(Object obj) {
                C4040h0.this.m29249k(z, aVar, (List) obj);
            }
        }).mo19076e(new AbstractC6765g() {
            @Override
            public final void mo4157c(Exception exc) {
                C4040h0.this.m29248l(bArr, aVar, runnable, exc);
            }
        }).mo19078c(new AbstractC6763f() {
            @Override
            public final void mo10608a(AbstractC6775l lVar) {
                C4040h0.m29247m(runnable, lVar);
            }
        });
    }

    public boolean m29250j() {
        return this.f13568e != null && !this.f13569f;
    }

    public void m29243q(final AbstractC0610l1 l1Var) {
        Image j0 = l1Var.mo40757j0();
        if (j0 == null) {
            l1Var.close();
        } else if (m29250j()) {
            m29251i(C4164a.m28644b(j0, l1Var.mo40736Z().mo36992d()), m29253g(l1Var.mo40758j()[0].mo40755a()), C7389v0.m16564x1(l1Var.mo40736Z().mo36992d()), new Runnable() {
                @Override
                public final void run() {
                    AbstractC0610l1.this.close();
                }
            });
        } else {
            m29239u(m29253g(l1Var.mo40758j()[0].mo40755a()), l1Var.getWidth(), l1Var.getHeight(), l1Var.mo40736Z().mo36992d(), new Runnable() {
                @Override
                public final void run() {
                    AbstractC0610l1.this.close();
                }
            });
        }
    }

    public void m29242r(byte[] bArr, int i, int i2, final C4193h hVar) {
        int O3 = this.f13565b.mo29128O3();
        if (m29250j()) {
            C4164a a = C4164a.m28645a(bArr, i, i2, O3, 17);
            boolean x1 = C7389v0.m16564x1(O3);
            Objects.requireNonNull(hVar);
            m29251i(a, bArr, x1, new Runnable() {
                @Override
                public final void run() {
                    C4193h.this.m28545I0();
                }
            });
            return;
        }
        Objects.requireNonNull(hVar);
        m29239u(bArr, i, i2, O3, new Runnable() {
            @Override
            public final void run() {
                C4193h.this.m28545I0();
            }
        });
    }

    public final byte[] m29241s(byte[] bArr, int i, int i2, int i3) {
        if (i3 == 0 || i3 % 90 != 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                if (i3 == 90) {
                    bArr2[(((i5 * i2) + i2) - i4) - 1] = bArr[(i4 * i) + i5];
                } else if (i3 == 180) {
                    bArr2[(((((i2 - i4) - 1) * i) + i) - i5) - 1] = bArr[(i4 * i) + i5];
                } else if (i3 == 270) {
                    bArr2[(i5 * i2) + i4] = bArr[(((i4 * i) + i) - i5) - 1];
                }
            }
        }
        return bArr2;
    }

    public final RectF m29240t(C4528k kVar, int i, boolean z, int i2, int i3) {
        C4530m mVar;
        C4530m mVar2;
        C4530m mVar3;
        if (kVar.m27492a().length < 3) {
            return null;
        }
        C4530m[] a = kVar.m27492a();
        int i4 = 0;
        if (C7389v0.m16564x1(i)) {
            mVar2 = a[2];
            mVar = a[1];
            mVar3 = a[0];
        } else {
            mVar2 = a[0];
            mVar = a[1];
            mVar3 = a[2];
        }
        if (mVar2 instanceof C6798d) {
            i4 = ((int) ((C6798d) mVar2).m19012i()) * 2;
        }
        int min = (int) Math.min(Math.min(mVar.m27487c(), mVar3.m27487c()), mVar2.m27487c());
        int max = (int) Math.max(Math.max(mVar.m27487c(), mVar3.m27487c()), mVar2.m27487c());
        int min2 = (int) Math.min(Math.min(mVar.m27486d(), mVar3.m27486d()), mVar2.m27486d());
        int max2 = (int) Math.max(Math.max(mVar.m27486d(), mVar3.m27486d()), mVar2.m27486d());
        if (z) {
            max = i2 - min;
            min = i2 - max;
        }
        return new RectF(min - i4, min2 - i4, max + i4, max2 + i4);
    }

    public final void m29239u(final byte[] bArr, final int i, final int i2, final int i3, final Runnable runnable) {
        this.f13564a.submit(new Runnable() {
            @Override
            public final void run() {
                C4040h0.this.m29244p(bArr, i, i2, i3, runnable);
            }
        });
    }

    public final C4528k m29238v(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5;
        if (i3 != 0) {
            bArr = m29241s(bArr, i, i2, i3);
        }
        byte[] bArr2 = bArr;
        if (C7389v0.m16564x1(i3)) {
            i4 = i;
            i5 = i2;
        } else {
            i5 = i;
            i4 = i2;
        }
        return this.f13567d.m21054a(new C4520c(new C5030i(new C4526i(bArr2, i5, i4, 0, 0, i5, i4, i3 == 180))));
    }
}
