package p025bc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4551g;
import p095gc.AbstractC4572y;
import p095gc.C4539b0;
import p095gc.C4544d;
import p095gc.C4549e;
import p107ha.C5060q;
import p278tb.C9122v;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public final class C1340i {
    public static final C1341a f4887o = new C1341a(null);
    public long f4888a;
    public long f4889b;
    public long f4890c;
    public long f4891d;
    public final ArrayDeque<C9122v> f4892e;
    public boolean f4893f;
    public final C1343c f4894g;
    public final C1342b f4895h;
    public final C1344d f4896i = new C1344d();
    public final C1344d f4897j = new C1344d();
    public EnumC1307b f4898k;
    public IOException f4899l;
    public final int f4900m;
    public final C1315f f4901n;

    public static final class C1341a {
        public C1341a() {
        }

        public C1341a(C8294g gVar) {
            this();
        }
    }

    public final class C1342b implements AbstractC4572y {
        public boolean f4902M;
        public final C4549e f4904a = new C4549e();
        public C9122v f4905b;
        public boolean f4906c;

        public C1342b(boolean z) {
            this.f4902M = z;
        }

        @Override
        public C4539b0 mo27303c() {
            return C1340i.this.m37618s();
        }

        @Override
        public void close() {
            C1340i iVar = C1340i.this;
            if (!C9489b.f30729h || !Thread.holdsLock(iVar)) {
                synchronized (C1340i.this) {
                    if (!this.f4906c) {
                        boolean z = C1340i.this.m37629h() == null;
                        C5060q qVar = C5060q.f17066a;
                        if (!C1340i.this.m37622o().f4902M) {
                            boolean z2 = this.f4904a.size() > 0;
                            if (this.f4905b != null) {
                                while (this.f4904a.size() > 0) {
                                    m37610m(false);
                                }
                                C1315f g = C1340i.this.m37630g();
                                int j = C1340i.this.m37627j();
                                C9122v vVar = this.f4905b;
                                C8298k.m12935c(vVar);
                                g.m37702s1(j, z, C9489b.m8535J(vVar));
                            } else if (z2) {
                                while (this.f4904a.size() > 0) {
                                    m37610m(true);
                                }
                            } else if (z) {
                                C1340i.this.m37630g().m37703r1(C1340i.this.m37627j(), true, null, 0L);
                            }
                        }
                        synchronized (C1340i.this) {
                            this.f4906c = true;
                            C5060q qVar2 = C5060q.f17066a;
                        }
                        C1340i.this.m37630g().flush();
                        C1340i.this.m37635b();
                        return;
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override
        public void flush() {
            C1340i iVar = C1340i.this;
            if (!C9489b.f30729h || !Thread.holdsLock(iVar)) {
                synchronized (C1340i.this) {
                    C1340i.this.m37634c();
                    C5060q qVar = C5060q.f17066a;
                }
                while (this.f4904a.size() > 0) {
                    m37610m(false);
                    C1340i.this.m37630g().flush();
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override
        public void mo5030h0(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "source");
            C1340i iVar = C1340i.this;
            if (!C9489b.f30729h || !Thread.holdsLock(iVar)) {
                this.f4904a.mo5030h0(eVar, j);
                while (this.f4904a.size() >= 16384) {
                    m37610m(false);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        public final void m37610m(boolean z) {
            long min;
            boolean z2;
            synchronized (C1340i.this) {
                C1340i.this.m37618s().m27461r();
                while (C1340i.this.m37619r() >= C1340i.this.m37620q() && !this.f4902M && !this.f4906c && C1340i.this.m37629h() == null) {
                    C1340i.this.m37638D();
                }
                C1340i.this.m37618s().m37601y();
                C1340i.this.m37634c();
                min = Math.min(C1340i.this.m37620q() - C1340i.this.m37619r(), this.f4904a.size());
                C1340i iVar = C1340i.this;
                iVar.m37640B(iVar.m37619r() + min);
                z2 = z && min == this.f4904a.size();
                C5060q qVar = C5060q.f17066a;
            }
            C1340i.this.m37618s().m27461r();
            try {
                C1340i.this.m37630g().m37703r1(C1340i.this.m37627j(), z2, this.f4904a, min);
            } finally {
                C1340i.this.m37618s().m37601y();
            }
        }

        public final boolean m37609t() {
            return this.f4906c;
        }

        public final boolean m37608y0() {
            return this.f4902M;
        }
    }

    public final class C1343c implements AbstractC4537a0 {
        public boolean f4907M;
        public final long f4908N;
        public boolean f4909O;
        public final C4549e f4911a = new C4549e();
        public final C4549e f4912b = new C4549e();
        public C9122v f4913c;

        public C1343c(long j, boolean z) {
            this.f4908N = j;
            this.f4909O = z;
        }

        public final void m37607A0(C9122v vVar) {
            this.f4913c = vVar;
        }

        public final void m37606B0(long j) {
            C1340i iVar = C1340i.this;
            if (!C9489b.f30729h || !Thread.holdsLock(iVar)) {
                C1340i.this.m37630g().m37704q1(j);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        @Override
        public C4539b0 mo27336c() {
            return C1340i.this.m37624m();
        }

        @Override
        public void close() {
            long size;
            synchronized (C1340i.this) {
                this.f4907M = true;
                size = this.f4912b.size();
                this.f4912b.m27417y0();
                C1340i iVar = C1340i.this;
                if (iVar != null) {
                    iVar.notifyAll();
                    C5060q qVar = C5060q.f17066a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (size > 0) {
                m37606B0(size);
            }
            C1340i.this.m37635b();
        }

        public final boolean m37605m() {
            return this.f4907M;
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            IOException iOException;
            long j2;
            boolean z;
            C8298k.m12933e(eVar, "sink");
            if (j >= 0) {
                do {
                    iOException = null;
                    synchronized (C1340i.this) {
                        C1340i.this.m37624m().m27461r();
                        if (C1340i.this.m37629h() != null && (iOException = C1340i.this.m37628i()) == null) {
                            EnumC1307b h = C1340i.this.m37629h();
                            C8298k.m12935c(h);
                            iOException = new C1354n(h);
                        }
                        if (!this.f4907M) {
                            if (this.f4912b.size() > 0) {
                                C4549e eVar2 = this.f4912b;
                                j2 = eVar2.mo5028s(eVar, Math.min(j, eVar2.size()));
                                C1340i iVar = C1340i.this;
                                iVar.m37641A(iVar.m37625l() + j2);
                                long l = C1340i.this.m37625l() - C1340i.this.m37626k();
                                if (iOException == null && l >= C1340i.this.m37630g().m37726V0().m37573c() / 2) {
                                    C1340i.this.m37630g().m37697w1(C1340i.this.m37627j(), l);
                                    C1340i iVar2 = C1340i.this;
                                    iVar2.m37611z(iVar2.m37625l());
                                }
                            } else if (this.f4909O || iOException != null) {
                                j2 = -1;
                            } else {
                                C1340i.this.m37638D();
                                j2 = -1;
                                z = true;
                                C1340i.this.m37624m().m37601y();
                                C5060q qVar = C5060q.f17066a;
                            }
                            z = false;
                            C1340i.this.m37624m().m37601y();
                            C5060q qVar2 = C5060q.f17066a;
                        } else {
                            throw new IOException("stream closed");
                        }
                    }
                } while (z);
                if (j2 != -1) {
                    m37606B0(j2);
                    return j2;
                } else if (iOException == null) {
                    return -1L;
                } else {
                    C8298k.m12935c(iOException);
                    throw iOException;
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
        }

        public final boolean m37604t() {
            return this.f4909O;
        }

        public final void m37603y0(AbstractC4551g gVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C8298k.m12933e(gVar, "source");
            C1340i iVar = C1340i.this;
            if (!C9489b.f30729h || !Thread.holdsLock(iVar)) {
                while (j > 0) {
                    synchronized (C1340i.this) {
                        z = this.f4909O;
                        z2 = true;
                        z3 = this.f4912b.size() + j > this.f4908N;
                        C5060q qVar = C5060q.f17066a;
                    }
                    if (z3) {
                        gVar.mo27337a0(j);
                        C1340i.this.m37631f(EnumC1307b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        gVar.mo27337a0(j);
                        return;
                    } else {
                        long s = gVar.mo5028s(this.f4911a, j);
                        if (s != -1) {
                            j -= s;
                            synchronized (C1340i.this) {
                                if (this.f4907M) {
                                    j2 = this.f4911a.size();
                                    this.f4911a.m27417y0();
                                } else {
                                    if (this.f4912b.size() != 0) {
                                        z2 = false;
                                    }
                                    this.f4912b.m27426X0(this.f4911a);
                                    if (z2) {
                                        C1340i iVar2 = C1340i.this;
                                        if (iVar2 != null) {
                                            iVar2.notifyAll();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                m37606B0(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        public final void m37602z0(boolean z) {
            this.f4909O = z;
        }
    }

    public final class C1344d extends C4544d {
        public C1344d() {
        }

        @Override
        public IOException mo27302t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override
        public void mo4984x() {
            C1340i.this.m37631f(EnumC1307b.CANCEL);
            C1340i.this.m37630g().m37711k1();
        }

        public final void m37601y() {
            if (m27460s()) {
                throw mo27302t(null);
            }
        }
    }

    public C1340i(int i, C1315f fVar, boolean z, boolean z2, C9122v vVar) {
        C8298k.m12933e(fVar, "connection");
        this.f4900m = i;
        this.f4901n = fVar;
        this.f4891d = fVar.m37725W0().m37573c();
        ArrayDeque<C9122v> arrayDeque = new ArrayDeque<>();
        this.f4892e = arrayDeque;
        this.f4894g = new C1343c(fVar.m37726V0().m37573c(), z2);
        this.f4895h = new C1342b(z);
        if (vVar != null) {
            if (!m37617t()) {
                arrayDeque.add(vVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!m37617t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void m37641A(long j) {
        this.f4888a = j;
    }

    public final void m37640B(long j) {
        this.f4890c = j;
    }

    public final synchronized C9122v m37639C() {
        C9122v removeFirst;
        this.f4896i.m27461r();
        while (this.f4892e.isEmpty() && this.f4898k == null) {
            m37638D();
        }
        this.f4896i.m37601y();
        if (!this.f4892e.isEmpty()) {
            removeFirst = this.f4892e.removeFirst();
            C8298k.m12934d(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.f4899l;
            if (iOException != null) {
                throw iOException;
            }
            EnumC1307b bVar = this.f4898k;
            C8298k.m12935c(bVar);
            throw new C1354n(bVar);
        }
        return removeFirst;
    }

    public final void m37638D() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final C4539b0 m37637E() {
        return this.f4897j;
    }

    public final void m37636a(long j) {
        this.f4891d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void m37635b() {
        boolean z;
        boolean u;
        if (!C9489b.f30729h || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f4894g.m37604t() && this.f4894g.m37605m() && (this.f4895h.m37608y0() || this.f4895h.m37609t());
                u = m37616u();
                C5060q qVar = C5060q.f17066a;
            }
            if (z) {
                m37633d(EnumC1307b.CANCEL, null);
            } else if (!u) {
                this.f4901n.m37712j1(this.f4900m);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C8298k.m12934d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    public final void m37634c() {
        if (this.f4895h.m37609t()) {
            throw new IOException("stream closed");
        } else if (this.f4895h.m37608y0()) {
            throw new IOException("stream finished");
        } else if (this.f4898k != null) {
            IOException iOException = this.f4899l;
            if (iOException == null) {
                EnumC1307b bVar = this.f4898k;
                C8298k.m12935c(bVar);
                throw new C1354n(bVar);
            }
        }
    }

    public final void m37633d(EnumC1307b bVar, IOException iOException) {
        C8298k.m12933e(bVar, "rstStatusCode");
        if (m37632e(bVar, iOException)) {
            this.f4901n.m37699u1(this.f4900m, bVar);
        }
    }

    public final boolean m37632e(EnumC1307b bVar, IOException iOException) {
        if (!C9489b.f30729h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f4898k != null) {
                    return false;
                }
                if (this.f4894g.m37604t() && this.f4895h.m37608y0()) {
                    return false;
                }
                this.f4898k = bVar;
                this.f4899l = iOException;
                notifyAll();
                C5060q qVar = C5060q.f17066a;
                this.f4901n.m37712j1(this.f4900m);
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void m37631f(EnumC1307b bVar) {
        C8298k.m12933e(bVar, "errorCode");
        if (m37632e(bVar, null)) {
            this.f4901n.m37698v1(this.f4900m, bVar);
        }
    }

    public final C1315f m37630g() {
        return this.f4901n;
    }

    public final synchronized EnumC1307b m37629h() {
        return this.f4898k;
    }

    public final IOException m37628i() {
        return this.f4899l;
    }

    public final int m37627j() {
        return this.f4900m;
    }

    public final long m37626k() {
        return this.f4889b;
    }

    public final long m37625l() {
        return this.f4888a;
    }

    public final C1344d m37624m() {
        return this.f4896i;
    }

    public final p095gc.AbstractC4572y m37623n() {
        throw new UnsupportedOperationException("Method not decompiled: p025bc.C1340i.m37623n():gc.y");
    }

    public final C1342b m37622o() {
        return this.f4895h;
    }

    public final C1343c m37621p() {
        return this.f4894g;
    }

    public final long m37620q() {
        return this.f4891d;
    }

    public final long m37619r() {
        return this.f4890c;
    }

    public final C1344d m37618s() {
        return this.f4897j;
    }

    public final boolean m37617t() {
        return this.f4901n.m37731Q0() == ((this.f4900m & 1) == 1);
    }

    public final synchronized boolean m37616u() {
        if (this.f4898k != null) {
            return false;
        }
        if ((this.f4894g.m37604t() || this.f4894g.m37605m()) && (this.f4895h.m37608y0() || this.f4895h.m37609t())) {
            if (this.f4893f) {
                return false;
            }
        }
        return true;
    }

    public final C4539b0 m37615v() {
        return this.f4896i;
    }

    public final void m37614w(AbstractC4551g gVar, int i) {
        C8298k.m12933e(gVar, "source");
        if (!C9489b.f30729h || !Thread.holdsLock(this)) {
            this.f4894g.m37603y0(gVar, i);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void m37613x(p278tb.C9122v r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: p025bc.C1340i.m37613x(tb.v, boolean):void");
    }

    public final synchronized void m37612y(EnumC1307b bVar) {
        C8298k.m12933e(bVar, "errorCode");
        if (this.f4898k == null) {
            this.f4898k = bVar;
            notifyAll();
        }
    }

    public final void m37611z(long j) {
        this.f4889b = j;
    }
}
