package p025bc;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.thunderdog.challegram.Log;
import p025bc.C1311d;
import p095gc.AbstractC4550f;
import p095gc.C4549e;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public final class C1345j implements Closeable {
    public final C1311d.C1313b f4917M;
    public final AbstractC4550f f4918N;
    public final boolean f4919O;
    public final C4549e f4920a;
    public int f4921b = Log.TAG_VIDEO;
    public boolean f4922c;
    public static final C1346a f4916Q = new C1346a(null);
    public static final Logger f4915P = Logger.getLogger(C1314e.class.getName());

    public static final class C1346a {
        public C1346a() {
        }

        public C1346a(C8294g gVar) {
            this();
        }
    }

    public C1345j(AbstractC4550f fVar, boolean z) {
        C8298k.m12934e(fVar, "sink");
        this.f4918N = fVar;
        this.f4919O = z;
        C4549e eVar = new C4549e();
        this.f4920a = eVar;
        this.f4917M = new C1311d.C1313b(0, false, eVar, 3, null);
    }

    public final void m37597A0(int i, int i2, int i3, int i4) {
        Logger logger = f4915P;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C1314e.f4757e.m37745c(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f4921b) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                C9489b.m8524U(this.f4918N, i2);
                this.f4918N.mo27349C(i3 & 255);
                this.f4918N.mo27349C(i4 & 255);
                this.f4918N.mo27341w(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4921b + ": " + i2).toString());
    }

    public final synchronized void m37596B0(int i, EnumC1307b bVar, byte[] bArr) {
        C8298k.m12934e(bVar, "errorCode");
        C8298k.m12934e(bArr, "debugData");
        if (!this.f4922c) {
            boolean z = false;
            if (bVar.m37780a() != -1) {
                m37597A0(0, bArr.length + 8, 7, 0);
                this.f4918N.mo27341w(i);
                this.f4918N.mo27341w(bVar.m37780a());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f4918N.mo27344l0(bArr);
                }
                this.f4918N.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m37595C0(boolean z, int i, List<C1309c> list) {
        C8298k.m12934e(list, "headerBlock");
        if (!this.f4922c) {
            this.f4917M.m37749g(list);
            long size = this.f4920a.size();
            long min = Math.min(this.f4921b, size);
            int i2 = (size > min ? 1 : (size == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            m37597A0(i, (int) min, 1, i3);
            this.f4918N.mo5030h0(this.f4920a, min);
            if (i2 > 0) {
                m37588J0(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int m37594D0() {
        return this.f4921b;
    }

    public final synchronized void m37593E0(boolean z, int i, int i2) {
        if (!this.f4922c) {
            m37597A0(0, 8, 6, z ? 1 : 0);
            this.f4918N.mo27341w(i);
            this.f4918N.mo27341w(i2);
            this.f4918N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m37592F0(int i, int i2, List<C1309c> list) {
        C8298k.m12934e(list, "requestHeaders");
        if (!this.f4922c) {
            this.f4917M.m37749g(list);
            long size = this.f4920a.size();
            int min = (int) Math.min(this.f4921b - 4, size);
            int i3 = min + 4;
            long j = min;
            int i4 = (size > j ? 1 : (size == j ? 0 : -1));
            m37597A0(i, i3, 5, i4 == 0 ? 4 : 0);
            this.f4918N.mo27341w(i2 & Integer.MAX_VALUE);
            this.f4918N.mo5030h0(this.f4920a, j);
            if (i4 > 0) {
                m37588J0(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m37591G0(int i, EnumC1307b bVar) {
        C8298k.m12934e(bVar, "errorCode");
        if (!this.f4922c) {
            if (bVar.m37780a() != -1) {
                m37597A0(i, 4, 3, 0);
                this.f4918N.mo27341w(bVar.m37780a());
                this.f4918N.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m37590H0(C1352m mVar) {
        C8298k.m12934e(mVar, "settings");
        if (!this.f4922c) {
            int i = 0;
            m37597A0(0, mVar.m37564i() * 6, 4, 0);
            while (i < 10) {
                if (mVar.m37567f(i)) {
                    this.f4918N.mo27342r(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f4918N.mo27341w(mVar.m37572a(i));
                }
                i++;
            }
            this.f4918N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m37589I0(int i, long j) {
        if (!this.f4922c) {
            if (j != 0 && j <= 2147483647L) {
                m37597A0(i, 4, 8, 0);
                this.f4918N.mo27341w((int) j);
                this.f4918N.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void m37588J0(int i, long j) {
        while (j > 0) {
            long min = Math.min(this.f4921b, j);
            j -= min;
            m37597A0(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f4918N.mo5030h0(this.f4920a, min);
        }
    }

    @Override
    public synchronized void close() {
        this.f4922c = true;
        this.f4918N.close();
    }

    public final synchronized void flush() {
        if (!this.f4922c) {
            this.f4918N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m37587m(C1352m mVar) {
        C8298k.m12934e(mVar, "peerSettings");
        if (!this.f4922c) {
            this.f4921b = mVar.m37568e(this.f4921b);
            if (mVar.m37571b() != -1) {
                this.f4917M.m37751e(mVar.m37571b());
            }
            m37597A0(0, 0, 4, 1);
            this.f4918N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m37586t() {
        if (this.f4922c) {
            throw new IOException("closed");
        } else if (this.f4919O) {
            Logger logger = f4915P;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C9489b.m8507q(">> CONNECTION " + C1314e.f4753a.mo27312i(), new Object[0]));
            }
            this.f4918N.mo27345k0(C1314e.f4753a);
            this.f4918N.flush();
        }
    }

    public final synchronized void m37585y0(boolean z, int i, C4549e eVar, int i2) {
        if (!this.f4922c) {
            m37584z0(i, z ? 1 : 0, eVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final void m37584z0(int i, int i2, C4549e eVar, int i3) {
        m37597A0(i, i3, 0, i2);
        if (i3 > 0) {
            AbstractC4550f fVar = this.f4918N;
            C8298k.m12936c(eVar);
            fVar.mo5030h0(eVar, i3);
        }
    }
}
