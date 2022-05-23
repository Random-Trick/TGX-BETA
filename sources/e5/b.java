package e5;

import c5.b0;
import c5.l0;
import java.nio.ByteBuffer;
import m3.c3;
import m3.f;
import m3.q1;
import p3.g;

public final class b extends f {
    public final g W = new g(1);
    public final b0 X = new b0();
    public long Y;
    public a Z;
    public long f10585a0;

    public b() {
        super(6);
    }

    @Override
    public void J() {
        U();
    }

    @Override
    public void L(long j10, boolean z10) {
        this.f10585a0 = Long.MIN_VALUE;
        U();
    }

    @Override
    public void P(q1[] q1VarArr, long j10, long j11) {
        this.Y = j11;
    }

    public final float[] T(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.X.N(byteBuffer.array(), byteBuffer.limit());
        this.X.P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.X.q());
        }
        return fArr;
    }

    public final void U() {
        a aVar = this.Z;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override
    public int a(q1 q1Var) {
        if ("application/x-camera-motion".equals(q1Var.U)) {
            return c3.a(4);
        }
        return c3.a(0);
    }

    @Override
    public String b() {
        return "CameraMotionRenderer";
    }

    @Override
    public boolean e() {
        return l();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void r(long j10, long j11) {
        while (!l() && this.f10585a0 < 100000 + j10) {
            this.W.clear();
            if (Q(E(), this.W, 0) == -4 && !this.W.isEndOfStream()) {
                g gVar = this.W;
                this.f10585a0 = gVar.N;
                if (this.Z != null && !gVar.isDecodeOnly()) {
                    this.W.g();
                    float[] T = T((ByteBuffer) l0.j(this.W.f20488c));
                    if (T != null) {
                        ((a) l0.j(this.Z)).a(this.f10585a0 - this.Y, T);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override
    public void t(int i10, Object obj) {
        if (i10 == 8) {
            this.Z = (a) obj;
        } else {
            super.t(i10, obj);
        }
    }
}
