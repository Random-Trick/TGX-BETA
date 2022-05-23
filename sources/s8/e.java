package s8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import s2.c;
import s2.g;

@g(tags = {4})
public class e extends b {
    public static Logger f22592n = Logger.getLogger(e.class.getName());
    public int f22593d;
    public int f22594e;
    public int f22595f;
    public int f22596g;
    public long f22597h;
    public long f22598i;
    public f f22599j;
    public a f22600k;
    public List<m> f22601l = new ArrayList();
    public byte[] f22602m;

    @Override
    public void e(ByteBuffer byteBuffer) {
        int a10;
        this.f22593d = s2.e.n(byteBuffer);
        int n10 = s2.e.n(byteBuffer);
        this.f22594e = n10 >>> 2;
        this.f22595f = (n10 >> 1) & 1;
        this.f22596g = s2.e.j(byteBuffer);
        this.f22597h = s2.e.k(byteBuffer);
        this.f22598i = s2.e.k(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            b a11 = l.a(this.f22593d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = f22592n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a11);
            sb2.append(" - DecoderConfigDescr1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a11 != null ? Integer.valueOf(a11.a()) : null);
            logger.finer(sb2.toString());
            if (a11 != null && position2 < (a10 = a11.a())) {
                byte[] bArr = new byte[a10 - position2];
                this.f22602m = bArr;
                byteBuffer.get(bArr);
            }
            if (a11 instanceof f) {
                this.f22599j = (f) a11;
            }
            if (a11 instanceof a) {
                this.f22600k = (a) a11;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            b a12 = l.a(this.f22593d, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f22592n;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a12);
            sb3.append(" - DecoderConfigDescr2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a12 != null ? Integer.valueOf(a12.a()) : null);
            logger2.finer(sb3.toString());
            if (a12 instanceof m) {
                this.f22601l.add((m) a12);
            }
        }
    }

    public a f() {
        return this.f22600k;
    }

    public long g() {
        return this.f22598i;
    }

    public int h() {
        return this.f22596g;
    }

    public f i() {
        return this.f22599j;
    }

    public long j() {
        return this.f22597h;
    }

    public int k() {
        return this.f22593d;
    }

    public List<m> l() {
        return this.f22601l;
    }

    public int m() {
        return this.f22594e;
    }

    public int n() {
        return this.f22595f;
    }

    public ByteBuffer o() {
        ByteBuffer allocate = ByteBuffer.allocate(p());
        g.j(allocate, 4);
        g.j(allocate, p() - 2);
        g.j(allocate, this.f22593d);
        g.j(allocate, (this.f22594e << 2) | (this.f22595f << 1) | 1);
        g.f(allocate, this.f22596g);
        g.g(allocate, this.f22597h);
        g.g(allocate, this.f22598i);
        a aVar = this.f22600k;
        if (aVar != null) {
            allocate.put(aVar.n().array());
        }
        return allocate;
    }

    public int p() {
        a aVar = this.f22600k;
        return (aVar == null ? 0 : aVar.o()) + 15;
    }

    public void q(a aVar) {
        this.f22600k = aVar;
    }

    public void r(long j10) {
        this.f22598i = j10;
    }

    public void s(int i10) {
        this.f22596g = i10;
    }

    public void t(long j10) {
        this.f22597h = j10;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.f22593d);
        sb2.append(", streamType=");
        sb2.append(this.f22594e);
        sb2.append(", upStream=");
        sb2.append(this.f22595f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f22596g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f22597h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f22598i);
        sb2.append(", decoderSpecificInfo=");
        sb2.append(this.f22599j);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f22600k);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f22602m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(c.b(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        List<m> list = this.f22601l;
        sb2.append(list == null ? "null" : Arrays.asList(list).toString());
        sb2.append('}');
        return sb2.toString();
    }

    public void u(int i10) {
        this.f22593d = i10;
    }

    public void v(int i10) {
        this.f22594e = i10;
    }
}
