package p045d5;

import java.nio.ByteBuffer;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p174m3.AbstractC6593f;
import p174m3.C6600g1;
import p174m3.C6701t2;
import p216p3.C8026g;

public final class C3602b extends AbstractC6593f {
    public final C8026g f12278V = new C8026g(1);
    public final C1189b0 f12279W = new C1189b0();
    public long f12280X;
    public AbstractC3601a f12281Y;
    public long f12282Z;

    public C3602b() {
        super(6);
    }

    @Override
    public void mo13718I() {
        m29891S();
    }

    @Override
    public void mo13717K(long j, boolean z) {
        this.f12282Z = Long.MIN_VALUE;
        m29891S();
    }

    @Override
    public void mo13716O(C6600g1[] g1VarArr, long j, long j2) {
        this.f12280X = j2;
    }

    public final float[] m29892R(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f12279W.m38149N(byteBuffer.array(), byteBuffer.limit());
        this.f12279W.m38147P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f12279W.m38129q());
        }
        return fArr;
    }

    public final void m29891S() {
        AbstractC3601a aVar = this.f12281Y;
        if (aVar != null) {
            aVar.mo19323d();
        }
    }

    @Override
    public int mo11838a(C6600g1 g1Var) {
        if ("application/x-camera-motion".equals(g1Var.f20575U)) {
            return C6701t2.m19438a(4);
        }
        return C6701t2.m19438a(0);
    }

    @Override
    public String mo11837b() {
        return "CameraMotionRenderer";
    }

    @Override
    public boolean mo13705e() {
        return mo19478m();
    }

    @Override
    public boolean mo13704f() {
        return true;
    }

    @Override
    public void mo13703t(long j, long j2) {
        while (!mo19478m() && this.f12282Z < 100000 + j) {
            this.f12278V.clear();
            if (m19918P(m19922E(), this.f12278V, 0) == -4 && !this.f12278V.isEndOfStream()) {
                C8026g gVar = this.f12278V;
                this.f12282Z = gVar.f26129N;
                if (this.f12281Y != null && !gVar.isDecodeOnly()) {
                    this.f12278V.m13777g();
                    float[] R = m29892R((ByteBuffer) C1216l0.m37971j(this.f12278V.f26135c));
                    if (R != null) {
                        ((AbstractC3601a) C1216l0.m37971j(this.f12281Y)).mo19324a(this.f12282Z - this.f12280X, R);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override
    public void mo15492u(int i, Object obj) {
        if (i == 8) {
            this.f12281Y = (AbstractC3601a) obj;
        } else {
            super.mo15492u(i, obj);
        }
    }
}
