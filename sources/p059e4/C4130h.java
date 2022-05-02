package p059e4;

import java.nio.ByteBuffer;
import p020b5.C1186a;
import p216p3.C8026g;

public final class C4130h extends C8026g {
    public long f13929R;
    public int f13930S;
    public int f13931T = 32;

    public C4130h() {
        super(2);
    }

    @Override
    public void clear() {
        super.clear();
        this.f13930S = 0;
    }

    public boolean m28828k(C8026g gVar) {
        C1186a.m38189a(!gVar.m13777h());
        C1186a.m38189a(!gVar.hasSupplementalData());
        C1186a.m38189a(!gVar.isEndOfStream());
        if (!m28827l(gVar)) {
            return false;
        }
        int i = this.f13930S;
        this.f13930S = i + 1;
        if (i == 0) {
            this.f26126N = gVar.f26126N;
            if (gVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (gVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f26132c;
        if (byteBuffer != null) {
            m13779f(byteBuffer.remaining());
            this.f26132c.put(byteBuffer);
        }
        this.f13929R = gVar.f26126N;
        return true;
    }

    public final boolean m28827l(C8026g gVar) {
        ByteBuffer byteBuffer;
        if (!m28823p()) {
            return true;
        }
        if (this.f13930S >= this.f13931T || gVar.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f26132c;
        return byteBuffer2 == null || (byteBuffer = this.f26132c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long m28826m() {
        return this.f26126N;
    }

    public long m28825n() {
        return this.f13929R;
    }

    public int m28824o() {
        return this.f13930S;
    }

    public boolean m28823p() {
        return this.f13930S > 0;
    }

    public void m28822q(int i) {
        C1186a.m38189a(i > 0);
        this.f13931T = i;
    }
}
