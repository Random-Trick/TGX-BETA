package cc;

import cc.d;
import hc.e;
import hc.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.thunderdog.challegram.Log;
import ra.g;
import ra.k;
import vb.b;

public final class j implements Closeable {
    public final d.b M;
    public final f N;
    public final boolean O;
    public final e f5198a;
    public int f5199b = Log.TAG_VIDEO;
    public boolean f5200c;
    public static final a Q = new a(null);
    public static final Logger P = Logger.getLogger(e.class.getName());

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public j(f fVar, boolean z10) {
        k.e(fVar, "sink");
        this.N = fVar;
        this.O = z10;
        e eVar = new e();
        this.f5198a = eVar;
        this.M = new d.b(0, false, eVar, 3, null);
    }

    public final void A0(int i10, int i11, int i12, int i13) {
        Logger logger = P;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f5066e.c(false, i10, i11, i12, i13));
        }
        boolean z10 = true;
        if (i11 <= this.f5199b) {
            if ((((int) 2147483648L) & i10) != 0) {
                z10 = false;
            }
            if (z10) {
                b.U(this.N, i11);
                this.N.D(i12 & 255);
                this.N.D(i13 & 255);
                this.N.v(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f5199b + ": " + i11).toString());
    }

    public final synchronized void B0(int i10, b bVar, byte[] bArr) {
        k.e(bVar, "errorCode");
        k.e(bArr, "debugData");
        if (!this.f5200c) {
            boolean z10 = false;
            if (bVar.a() != -1) {
                A0(0, bArr.length + 8, 7, 0);
                this.N.v(i10);
                this.N.v(bVar.a());
                if (bArr.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    this.N.l0(bArr);
                }
                this.N.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void C0(boolean z10, int i10, List<c> list) {
        k.e(list, "headerBlock");
        if (!this.f5200c) {
            this.M.g(list);
            long size = this.f5198a.size();
            long min = Math.min(this.f5199b, size);
            int i11 = (size > min ? 1 : (size == min ? 0 : -1));
            int i12 = i11 == 0 ? 4 : 0;
            if (z10) {
                i12 |= 1;
            }
            A0(i10, (int) min, 1, i12);
            this.N.c0(this.f5198a, min);
            if (i11 > 0) {
                J0(i10, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int D0() {
        return this.f5199b;
    }

    public final synchronized void E0(boolean z10, int i10, int i11) {
        if (!this.f5200c) {
            A0(0, 8, 6, z10 ? 1 : 0);
            this.N.v(i10);
            this.N.v(i11);
            this.N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void F0(int i10, int i11, List<c> list) {
        k.e(list, "requestHeaders");
        if (!this.f5200c) {
            this.M.g(list);
            long size = this.f5198a.size();
            int min = (int) Math.min(this.f5199b - 4, size);
            int i12 = min + 4;
            long j10 = min;
            int i13 = (size > j10 ? 1 : (size == j10 ? 0 : -1));
            A0(i10, i12, 5, i13 == 0 ? 4 : 0);
            this.N.v(i11 & Integer.MAX_VALUE);
            this.N.c0(this.f5198a, j10);
            if (i13 > 0) {
                J0(i10, size - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void G0(int i10, b bVar) {
        k.e(bVar, "errorCode");
        if (!this.f5200c) {
            if (bVar.a() != -1) {
                A0(i10, 4, 3, 0);
                this.N.v(bVar.a());
                this.N.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void H0(m mVar) {
        k.e(mVar, "settings");
        if (!this.f5200c) {
            int i10 = 0;
            A0(0, mVar.i() * 6, 4, 0);
            while (i10 < 10) {
                if (mVar.f(i10)) {
                    this.N.r(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.N.v(mVar.a(i10));
                }
                i10++;
            }
            this.N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void I0(int i10, long j10) {
        if (!this.f5200c) {
            if (j10 != 0 && j10 <= 2147483647L) {
                A0(i10, 4, 8, 0);
                this.N.v((int) j10);
                this.N.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void J0(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f5199b, j10);
            j10 -= min;
            A0(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.N.c0(this.f5198a, min);
        }
    }

    @Override
    public synchronized void close() {
        this.f5200c = true;
        this.N.close();
    }

    public final synchronized void flush() {
        if (!this.f5200c) {
            this.N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m(m mVar) {
        k.e(mVar, "peerSettings");
        if (!this.f5200c) {
            this.f5199b = mVar.e(this.f5199b);
            if (mVar.b() != -1) {
                this.M.e(mVar.b());
            }
            A0(0, 0, 4, 1);
            this.N.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void s() {
        if (this.f5200c) {
            throw new IOException("closed");
        } else if (this.O) {
            Logger logger = P;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.q(">> CONNECTION " + e.f5062a.i(), new Object[0]));
            }
            this.N.n0(e.f5062a);
            this.N.flush();
        }
    }

    public final synchronized void y0(boolean z10, int i10, e eVar, int i11) {
        if (!this.f5200c) {
            z0(i10, z10 ? 1 : 0, eVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public final void z0(int i10, int i11, e eVar, int i12) {
        A0(i10, i12, 0, i11);
        if (i12 > 0) {
            f fVar = this.N;
            k.c(eVar);
            fVar.c0(eVar, i12);
        }
    }
}
