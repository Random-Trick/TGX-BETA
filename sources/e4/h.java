package e4;

import c5.a;
import java.nio.ByteBuffer;
import p3.g;

public final class h extends g {
    public long R;
    public int S;
    public int T = 32;

    public h() {
        super(2);
    }

    @Override
    public void clear() {
        super.clear();
        this.S = 0;
    }

    public boolean k(g gVar) {
        a.a(!gVar.h());
        a.a(!gVar.hasSupplementalData());
        a.a(!gVar.isEndOfStream());
        if (!l(gVar)) {
            return false;
        }
        int i10 = this.S;
        this.S = i10 + 1;
        if (i10 == 0) {
            this.N = gVar.N;
            if (gVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (gVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f20488c;
        if (byteBuffer != null) {
            f(byteBuffer.remaining());
            this.f20488c.put(byteBuffer);
        }
        this.R = gVar.N;
        return true;
    }

    public final boolean l(g gVar) {
        ByteBuffer byteBuffer;
        if (!p()) {
            return true;
        }
        if (this.S >= this.T || gVar.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f20488c;
        return byteBuffer2 == null || (byteBuffer = this.f20488c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long m() {
        return this.N;
    }

    public long n() {
        return this.R;
    }

    public int o() {
        return this.S;
    }

    public boolean p() {
        return this.S > 0;
    }

    public void q(int i10) {
        a.a(i10 > 0);
        this.T = i10;
    }
}
