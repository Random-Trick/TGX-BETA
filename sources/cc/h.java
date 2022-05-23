package cc;

import cc.d;
import hc.a0;
import hc.b0;
import hc.e;
import hc.g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.thunderdog.challegram.Log;
import ra.k;

public final class h implements Closeable {
    public static final Logger N;
    public static final a O = new a(null);
    public final boolean M;
    public final b f5170a;
    public final d.a f5171b;
    public final g f5172c;

    public static final class a {
        public a() {
        }

        public a(ra.g gVar) {
            this();
        }

        public final Logger a() {
            return h.N;
        }

        public final int b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    public static final class b implements a0 {
        public int M;
        public int N;
        public final g O;
        public int f5173a;
        public int f5174b;
        public int f5175c;

        public b(g gVar) {
            k.e(gVar, "source");
            this.O = gVar;
        }

        @Override
        public long A(e eVar, long j10) {
            k.e(eVar, "sink");
            while (true) {
                int i10 = this.M;
                if (i10 == 0) {
                    this.O.b0(this.N);
                    this.N = 0;
                    if ((this.f5174b & 4) != 0) {
                        return -1L;
                    }
                    s();
                } else {
                    long A = this.O.A(eVar, Math.min(j10, i10));
                    if (A == -1) {
                        return -1L;
                    }
                    this.M -= (int) A;
                    return A;
                }
            }
        }

        public final void A0(int i10) {
            this.f5173a = i10;
        }

        public final void B0(int i10) {
            this.N = i10;
        }

        public final void C0(int i10) {
            this.f5175c = i10;
        }

        @Override
        public b0 c() {
            return this.O.c();
        }

        @Override
        public void close() {
        }

        public final int m() {
            return this.M;
        }

        public final void s() {
            int i10 = this.f5175c;
            int F = vb.b.F(this.O);
            this.M = F;
            this.f5173a = F;
            int b10 = vb.b.b(this.O.readByte(), 255);
            this.f5174b = vb.b.b(this.O.readByte(), 255);
            a aVar = h.O;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f5066e.c(true, this.f5175c, this.f5173a, b10, this.f5174b));
            }
            int readInt = this.O.readInt() & Integer.MAX_VALUE;
            this.f5175c = readInt;
            if (b10 != 9) {
                throw new IOException(b10 + " != TYPE_CONTINUATION");
            } else if (readInt != i10) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final void y0(int i10) {
            this.f5174b = i10;
        }

        public final void z0(int i10) {
            this.M = i10;
        }
    }

    public interface c {
        void a();

        void c(boolean z10, int i10, int i11, List<cc.c> list);

        void d(boolean z10, m mVar);

        void e(int i10, long j10);

        void f(int i10, cc.b bVar);

        void g(int i10, cc.b bVar, hc.h hVar);

        void h(boolean z10, int i10, int i11);

        void i(int i10, int i11, int i12, boolean z10);

        void j(boolean z10, int i10, g gVar, int i11);

        void k(int i10, int i11, List<cc.c> list);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        k.d(logger, "Logger.getLogger(Http2::class.java.name)");
        N = logger;
    }

    public h(g gVar, boolean z10) {
        k.e(gVar, "source");
        this.f5172c = gVar;
        this.M = z10;
        b bVar = new b(gVar);
        this.f5170a = bVar;
        this.f5171b = new d.a(bVar, Log.TAG_EMOJI, 0, 4, null);
    }

    public final void A0(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f5172c.readInt();
            int readInt2 = this.f5172c.readInt();
            int i13 = i10 - 8;
            cc.b a10 = cc.b.Z.a(readInt2);
            if (a10 != null) {
                hc.h hVar = hc.h.M;
                if (i13 > 0) {
                    hVar = this.f5172c.o(i13);
                }
                cVar.g(readInt, a10, hVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    public final List<cc.c> B0(int i10, int i11, int i12, int i13) {
        this.f5170a.z0(i10);
        b bVar = this.f5170a;
        bVar.A0(bVar.m());
        this.f5170a.B0(i11);
        this.f5170a.y0(i12);
        this.f5170a.C0(i13);
        this.f5171b.k();
        return this.f5171b.e();
    }

    public final void C0(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = (i11 & 1) != 0;
            if ((i11 & 8) != 0) {
                i13 = vb.b.b(this.f5172c.readByte(), 255);
            }
            if ((i11 & 32) != 0) {
                E0(cVar, i12);
                i10 -= 5;
            }
            cVar.c(z10, i12, -1, B0(O.b(i10, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void D0(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f5172c.readInt();
            int readInt2 = this.f5172c.readInt();
            boolean z10 = true;
            if ((i11 & 1) == 0) {
                z10 = false;
            }
            cVar.h(z10, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public final void E0(c cVar, int i10) {
        int readInt = this.f5172c.readInt();
        cVar.i(i10, readInt & Integer.MAX_VALUE, vb.b.b(this.f5172c.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    public final void F0(c cVar, int i10, int i11, int i12) {
        if (i10 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        } else if (i12 != 0) {
            E0(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    public final void G0(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int b10 = (i11 & 8) != 0 ? vb.b.b(this.f5172c.readByte(), 255) : 0;
            cVar.k(i12, this.f5172c.readInt() & Integer.MAX_VALUE, B0(O.b(i10 - 4, i11, b10), b10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    public final void H0(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        } else if (i12 != 0) {
            int readInt = this.f5172c.readInt();
            cc.b a10 = cc.b.Z.a(readInt);
            if (a10 != null) {
                cVar.f(i12, a10);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    public final void I0(cc.h.c r8, int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: cc.h.I0(cc.h$c, int, int, int):void");
    }

    public final void J0(c cVar, int i10, int i11, int i12) {
        if (i10 == 4) {
            long d10 = vb.b.d(this.f5172c.readInt(), 2147483647L);
            if (d10 != 0) {
                cVar.e(i12, d10);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
    }

    @Override
    public void close() {
        this.f5172c.close();
    }

    public final boolean s(boolean z10, c cVar) {
        k.e(cVar, "handler");
        try {
            this.f5172c.s0(9L);
            int F = vb.b.F(this.f5172c);
            if (F <= 16384) {
                int b10 = vb.b.b(this.f5172c.readByte(), 255);
                int b11 = vb.b.b(this.f5172c.readByte(), 255);
                int readInt = this.f5172c.readInt() & Integer.MAX_VALUE;
                Logger logger = N;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.f5066e.c(true, readInt, F, b10, b11));
                }
                if (!z10 || b10 == 4) {
                    switch (b10) {
                        case 0:
                            z0(cVar, F, b11, readInt);
                            return true;
                        case 1:
                            C0(cVar, F, b11, readInt);
                            return true;
                        case 2:
                            F0(cVar, F, b11, readInt);
                            return true;
                        case 3:
                            H0(cVar, F, b11, readInt);
                            return true;
                        case 4:
                            I0(cVar, F, b11, readInt);
                            return true;
                        case 5:
                            G0(cVar, F, b11, readInt);
                            return true;
                        case 6:
                            D0(cVar, F, b11, readInt);
                            return true;
                        case 7:
                            A0(cVar, F, b11, readInt);
                            return true;
                        case 8:
                            J0(cVar, F, b11, readInt);
                            return true;
                        default:
                            this.f5172c.b0(F);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + e.f5066e.b(b10));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + F);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void y0(c cVar) {
        k.e(cVar, "handler");
        if (!this.M) {
            g gVar = this.f5172c;
            hc.h hVar = e.f5062a;
            hc.h o10 = gVar.o(hVar.r());
            Logger logger = N;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(vb.b.q("<< CONNECTION " + o10.i(), new Object[0]));
            }
            if (!k.b(hVar, o10)) {
                throw new IOException("Expected a connection header but was " + o10.u());
            }
        } else if (!s(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void z0(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = true;
            boolean z11 = (i11 & 1) != 0;
            if ((i11 & 32) == 0) {
                z10 = false;
            }
            if (!z10) {
                if ((i11 & 8) != 0) {
                    i13 = vb.b.b(this.f5172c.readByte(), 255);
                }
                cVar.j(z11, i12, this.f5172c, O.b(i10, i11, i13));
                this.f5172c.b0(i13);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }
}
