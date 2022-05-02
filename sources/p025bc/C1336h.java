package p025bc;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.thunderdog.challegram.Log;
import p025bc.C1311d;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4551g;
import p095gc.C4539b0;
import p095gc.C4549e;
import p095gc.C4552h;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public final class C1336h implements Closeable {
    public static final Logger f4875N;
    public static final C1337a f4876O = new C1337a(null);
    public final boolean f4877M;
    public final C1338b f4878a;
    public final C1311d.C1312a f4879b;
    public final AbstractC4551g f4880c;

    public static final class C1337a {
        public C1337a() {
        }

        public final Logger m37660a() {
            return C1336h.f4875N;
        }

        public final int m37659b(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }

        public C1337a(C8294g gVar) {
            this();
        }
    }

    public static final class C1338b implements AbstractC4537a0 {
        public int f4881M;
        public int f4882N;
        public final AbstractC4551g f4883O;
        public int f4884a;
        public int f4885b;
        public int f4886c;

        public C1338b(AbstractC4551g gVar) {
            C8298k.m12933e(gVar, "source");
            this.f4883O = gVar;
        }

        public final void m37658A0(int i) {
            this.f4884a = i;
        }

        public final void m37657B0(int i) {
            this.f4882N = i;
        }

        public final void m37656C0(int i) {
            this.f4886c = i;
        }

        @Override
        public C4539b0 mo27336c() {
            return this.f4883O.mo27336c();
        }

        @Override
        public void close() {
        }

        public final int m37655m() {
            return this.f4881M;
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "sink");
            while (true) {
                int i = this.f4881M;
                if (i == 0) {
                    this.f4883O.mo27337a0(this.f4882N);
                    this.f4882N = 0;
                    if ((this.f4885b & 4) != 0) {
                        return -1L;
                    }
                    m37654t();
                } else {
                    long s = this.f4883O.mo5028s(eVar, Math.min(j, i));
                    if (s == -1) {
                        return -1L;
                    }
                    this.f4881M -= (int) s;
                    return s;
                }
            }
        }

        public final void m37654t() {
            int i = this.f4886c;
            int F = C9489b.m8539F(this.f4883O);
            this.f4881M = F;
            this.f4884a = F;
            int b = C9489b.m8522b(this.f4883O.readByte(), 255);
            this.f4885b = C9489b.m8522b(this.f4883O.readByte(), 255);
            C1337a aVar = C1336h.f4876O;
            if (aVar.m37660a().isLoggable(Level.FINE)) {
                aVar.m37660a().fine(C1314e.f4757e.m37748c(true, this.f4886c, this.f4884a, b, this.f4885b));
            }
            int readInt = this.f4883O.readInt() & Integer.MAX_VALUE;
            this.f4886c = readInt;
            if (b != 9) {
                throw new IOException(b + " != TYPE_CONTINUATION");
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final void m37653y0(int i) {
            this.f4885b = i;
        }

        public final void m37652z0(int i) {
            this.f4881M = i;
        }
    }

    public interface AbstractC1339c {
        void mo37651a();

        void mo37650c(boolean z, int i, int i2, List<C1309c> list);

        void mo37649d(int i, long j);

        void mo37648e(int i, EnumC1307b bVar, C4552h hVar);

        void mo37647f(boolean z, int i, int i2);

        void mo37646g(int i, int i2, int i3, boolean z);

        void mo37645h(int i, EnumC1307b bVar);

        void mo37644i(boolean z, int i, AbstractC4551g gVar, int i2);

        void mo37643j(int i, int i2, List<C1309c> list);

        void mo37642k(boolean z, C1352m mVar);
    }

    static {
        Logger logger = Logger.getLogger(C1314e.class.getName());
        C8298k.m12934d(logger, "Logger.getLogger(Http2::class.java.name)");
        f4875N = logger;
    }

    public C1336h(AbstractC4551g gVar, boolean z) {
        C8298k.m12933e(gVar, "source");
        this.f4880c = gVar;
        this.f4877M = z;
        C1338b bVar = new C1338b(gVar);
        this.f4878a = bVar;
        this.f4879b = new C1311d.C1312a(bVar, Log.TAG_EMOJI, 0, 4, null);
    }

    public final void m37674A0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f4880c.readInt();
            int readInt2 = this.f4880c.readInt();
            int i4 = i - 8;
            EnumC1307b a = EnumC1307b.f4718Z.m37782a(readInt2);
            if (a != null) {
                C4552h hVar = C4552h.f14972M;
                if (i4 > 0) {
                    hVar = this.f4880c.mo27332o(i4);
                }
                cVar.mo37648e(readInt, a, hVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    public final List<C1309c> m37673B0(int i, int i2, int i3, int i4) {
        this.f4878a.m37652z0(i);
        C1338b bVar = this.f4878a;
        bVar.m37658A0(bVar.m37655m());
        this.f4878a.m37657B0(i2);
        this.f4878a.m37653y0(i3);
        this.f4878a.m37656C0(i4);
        this.f4879b.m37765k();
        return this.f4879b.m37771e();
    }

    public final void m37672C0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                i4 = C9489b.m8522b(this.f4880c.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                m37670E0(cVar, i3);
                i -= 5;
            }
            cVar.mo37650c(z, i3, -1, m37673B0(f4876O.m37659b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void m37671D0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f4880c.readInt();
            int readInt2 = this.f4880c.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            cVar.mo37647f(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public final void m37670E0(AbstractC1339c cVar, int i) {
        int readInt = this.f4880c.readInt();
        cVar.mo37646g(i, readInt & Integer.MAX_VALUE, C9489b.m8522b(this.f4880c.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    public final void m37669F0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        } else if (i3 != 0) {
            m37670E0(cVar, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    public final void m37668G0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int b = (i2 & 8) != 0 ? C9489b.m8522b(this.f4880c.readByte(), 255) : 0;
            cVar.mo37643j(i3, this.f4880c.readInt() & Integer.MAX_VALUE, m37673B0(f4876O.m37659b(i - 4, i2, b), b, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    public final void m37667H0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.f4880c.readInt();
            EnumC1307b a = EnumC1307b.f4718Z.m37782a(readInt);
            if (a != null) {
                cVar.mo37645h(i3, a);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    public final void m37666I0(p025bc.C1336h.AbstractC1339c r8, int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p025bc.C1336h.m37666I0(bc.h$c, int, int, int):void");
    }

    public final void m37665J0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i == 4) {
            long d = C9489b.m8520d(this.f4880c.readInt(), 2147483647L);
            if (d != 0) {
                cVar.mo37649d(i3, d);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
    }

    @Override
    public void close() {
        this.f4880c.close();
    }

    public final boolean m37663t(boolean z, AbstractC1339c cVar) {
        C8298k.m12933e(cVar, "handler");
        try {
            this.f4880c.mo27331s0(9L);
            int F = C9489b.m8539F(this.f4880c);
            if (F <= 16384) {
                int b = C9489b.m8522b(this.f4880c.readByte(), 255);
                int b2 = C9489b.m8522b(this.f4880c.readByte(), 255);
                int readInt = this.f4880c.readInt() & Integer.MAX_VALUE;
                Logger logger = f4875N;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C1314e.f4757e.m37748c(true, readInt, F, b, b2));
                }
                if (!z || b == 4) {
                    switch (b) {
                        case 0:
                            m37661z0(cVar, F, b2, readInt);
                            return true;
                        case 1:
                            m37672C0(cVar, F, b2, readInt);
                            return true;
                        case 2:
                            m37669F0(cVar, F, b2, readInt);
                            return true;
                        case 3:
                            m37667H0(cVar, F, b2, readInt);
                            return true;
                        case 4:
                            m37666I0(cVar, F, b2, readInt);
                            return true;
                        case 5:
                            m37668G0(cVar, F, b2, readInt);
                            return true;
                        case 6:
                            m37671D0(cVar, F, b2, readInt);
                            return true;
                        case 7:
                            m37674A0(cVar, F, b2, readInt);
                            return true;
                        case 8:
                            m37665J0(cVar, F, b2, readInt);
                            return true;
                        default:
                            this.f4880c.mo27337a0(F);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + C1314e.f4757e.m37749b(b));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + F);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void m37662y0(AbstractC1339c cVar) {
        C8298k.m12933e(cVar, "handler");
        if (!this.f4877M) {
            AbstractC4551g gVar = this.f4880c;
            C4552h hVar = C1314e.f4753a;
            C4552h o = gVar.mo27332o(hVar.m27406r());
            Logger logger = f4875N;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C9489b.m8507q("<< CONNECTION " + o.mo27314i(), new Object[0]));
            }
            if (!C8298k.m12936b(hVar, o)) {
                throw new IOException("Expected a connection header but was " + o.m27404u());
            }
        } else if (!m37663t(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void m37661z0(AbstractC1339c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((i2 & 8) != 0) {
                    i4 = C9489b.m8522b(this.f4880c.readByte(), 255);
                }
                cVar.mo37644i(z2, i3, this.f4880c, f4876O.m37659b(i, i2, i4));
                this.f4880c.mo27337a0(i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }
}
