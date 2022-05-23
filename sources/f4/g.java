package f4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c5.l0;
import f4.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m3.c3;
import m3.f;
import m3.q1;
import m3.r1;

public final class g extends f implements Handler.Callback {
    public final d W;
    public final f X;
    public final Handler Y;
    public final e Z;
    public c f11849a0;
    public boolean f11850b0;
    public boolean f11851c0;
    public long f11852d0;
    public long f11853e0;
    public a f11854f0;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f11848a);
    }

    @Override
    public void J() {
        this.f11854f0 = null;
        this.f11853e0 = -9223372036854775807L;
        this.f11849a0 = null;
    }

    @Override
    public void L(long j10, boolean z10) {
        this.f11854f0 = null;
        this.f11853e0 = -9223372036854775807L;
        this.f11850b0 = false;
        this.f11851c0 = false;
    }

    @Override
    public void P(q1[] q1VarArr, long j10, long j11) {
        this.f11849a0 = this.W.b(q1VarArr[0]);
    }

    public final void T(a aVar, List<a.b> list) {
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            q1 wrappedMetadataFormat = aVar.c(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.W.a(wrappedMetadataFormat)) {
                list.add(aVar.c(i10));
            } else {
                c b10 = this.W.b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) c5.a.e(aVar.c(i10).getWrappedMetadataBytes());
                this.Z.clear();
                this.Z.f(bArr.length);
                ((ByteBuffer) l0.j(this.Z.f20488c)).put(bArr);
                this.Z.g();
                a a10 = b10.a(this.Z);
                if (a10 != null) {
                    T(a10, list);
                }
            }
        }
    }

    public final void U(a aVar) {
        Handler handler = this.Y;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            V(aVar);
        }
    }

    public final void V(a aVar) {
        this.X.o(aVar);
    }

    public final boolean W(long j10) {
        boolean z10;
        a aVar = this.f11854f0;
        if (aVar == null || this.f11853e0 > j10) {
            z10 = false;
        } else {
            U(aVar);
            this.f11854f0 = null;
            this.f11853e0 = -9223372036854775807L;
            z10 = true;
        }
        if (this.f11850b0 && this.f11854f0 == null) {
            this.f11851c0 = true;
        }
        return z10;
    }

    public final void X() {
        if (!this.f11850b0 && this.f11854f0 == null) {
            this.Z.clear();
            r1 E = E();
            int Q = Q(E, this.Z, 0);
            if (Q == -4) {
                if (this.Z.isEndOfStream()) {
                    this.f11850b0 = true;
                    return;
                }
                e eVar = this.Z;
                eVar.R = this.f11852d0;
                eVar.g();
                a a10 = ((c) l0.j(this.f11849a0)).a(this.Z);
                if (a10 != null) {
                    ArrayList arrayList = new ArrayList(a10.d());
                    T(a10, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f11854f0 = new a(arrayList);
                        this.f11853e0 = this.Z.N;
                    }
                }
            } else if (Q == -5) {
                this.f11852d0 = ((q1) c5.a.e(E.f16947b)).Y;
            }
        }
    }

    @Override
    public int a(q1 q1Var) {
        if (!this.W.a(q1Var)) {
            return c3.a(0);
        }
        return c3.a(q1Var.f16914n0 == 0 ? 4 : 2);
    }

    @Override
    public String b() {
        return "MetadataRenderer";
    }

    @Override
    public boolean e() {
        return this.f11851c0;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            V((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public void r(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            X();
            z10 = W(j10);
        }
    }

    public g(f fVar, Looper looper, d dVar) {
        super(5);
        this.X = (f) c5.a.e(fVar);
        this.Y = looper == null ? null : l0.t(looper, this);
        this.W = (d) c5.a.e(dVar);
        this.Z = new e();
        this.f11853e0 = -9223372036854775807L;
    }
}
