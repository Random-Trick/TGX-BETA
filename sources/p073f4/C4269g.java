package p073f4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1216l0;
import p073f4.C4260a;
import p174m3.AbstractC6593f;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6701t2;

public final class C4269g extends AbstractC6593f implements Handler.Callback {
    public final AbstractC4265d f14316V;
    public final AbstractC4268f f14317W;
    public final Handler f14318X;
    public final C4267e f14319Y;
    public AbstractC4264c f14320Z;
    public boolean f14321a0;
    public boolean f14322b0;
    public long f14323c0;
    public long f14324d0;
    public C4260a f14325e0;

    public C4269g(AbstractC4268f fVar, Looper looper) {
        this(fVar, looper, AbstractC4265d.f14314a);
    }

    @Override
    public void mo13718I() {
        this.f14325e0 = null;
        this.f14324d0 = -9223372036854775807L;
        this.f14320Z = null;
    }

    @Override
    public void mo13717K(long j, boolean z) {
        this.f14325e0 = null;
        this.f14324d0 = -9223372036854775807L;
        this.f14321a0 = false;
        this.f14322b0 = false;
    }

    @Override
    public void mo13716O(C6600g1[] g1VarArr, long j, long j2) {
        this.f14320Z = this.f14316V.mo28322b(g1VarArr[0]);
    }

    public final void m28321R(C4260a aVar, List<C4260a.AbstractC4262b> list) {
        for (int i = 0; i < aVar.m28329d(); i++) {
            C6600g1 wrappedMetadataFormat = aVar.m28330c(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f14316V.mo28323a(wrappedMetadataFormat)) {
                list.add(aVar.m28330c(i));
            } else {
                AbstractC4264c b = this.f14316V.mo28322b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) C1186a.m38188e(aVar.m28330c(i).getWrappedMetadataBytes());
                this.f14319Y.clear();
                this.f14319Y.m13778f(bArr.length);
                ((ByteBuffer) C1216l0.m37971j(this.f14319Y.f26135c)).put(bArr);
                this.f14319Y.m13777g();
                C4260a a = b.mo28316a(this.f14319Y);
                if (a != null) {
                    m28321R(a, list);
                }
            }
        }
    }

    public final void m28320S(C4260a aVar) {
        Handler handler = this.f14318X;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            m28319T(aVar);
        }
    }

    public final void m28319T(C4260a aVar) {
        this.f14317W.mo19329d(aVar);
    }

    public final boolean m28318U(long j) {
        boolean z;
        C4260a aVar = this.f14325e0;
        if (aVar == null || this.f14324d0 > j) {
            z = false;
        } else {
            m28320S(aVar);
            this.f14325e0 = null;
            this.f14324d0 = -9223372036854775807L;
            z = true;
        }
        if (this.f14321a0 && this.f14325e0 == null) {
            this.f14322b0 = true;
        }
        return z;
    }

    public final void m28317V() {
        if (!this.f14321a0 && this.f14325e0 == null) {
            this.f14319Y.clear();
            C6612h1 E = m19922E();
            int P = m19918P(E, this.f14319Y, 0);
            if (P == -4) {
                if (this.f14319Y.isEndOfStream()) {
                    this.f14321a0 = true;
                    return;
                }
                C4267e eVar = this.f14319Y;
                eVar.f14315R = this.f14323c0;
                eVar.m13777g();
                C4260a a = ((AbstractC4264c) C1216l0.m37971j(this.f14320Z)).mo28316a(this.f14319Y);
                if (a != null) {
                    ArrayList arrayList = new ArrayList(a.m28329d());
                    m28321R(a, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f14325e0 = new C4260a(arrayList);
                        this.f14324d0 = this.f14319Y.f26129N;
                    }
                }
            } else if (P == -5) {
                this.f14323c0 = ((C6600g1) C1186a.m38188e(E.f20668b)).f20579Y;
            }
        }
    }

    @Override
    public int mo11838a(C6600g1 g1Var) {
        if (!this.f14316V.mo28323a(g1Var)) {
            return C6701t2.m19438a(0);
        }
        return C6701t2.m19438a(g1Var.f20597n0 == 0 ? 4 : 2);
    }

    @Override
    public String mo11837b() {
        return "MetadataRenderer";
    }

    @Override
    public boolean mo13705e() {
        return this.f14322b0;
    }

    @Override
    public boolean mo13704f() {
        return true;
    }

    @Override
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m28319T((C4260a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public void mo13703t(long j, long j2) {
        boolean z = true;
        while (z) {
            m28317V();
            z = m28318U(j);
        }
    }

    public C4269g(AbstractC4268f fVar, Looper looper, AbstractC4265d dVar) {
        super(5);
        this.f14317W = (AbstractC4268f) C1186a.m38188e(fVar);
        this.f14318X = looper == null ? null : C1216l0.m37951t(looper, this);
        this.f14316V = (AbstractC4265d) C1186a.m38188e(dVar);
        this.f14319Y = new C4267e();
        this.f14324d0 = -9223372036854775807L;
    }
}
