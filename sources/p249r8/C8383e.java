package p249r8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p258s2.C8630c;
import p258s2.C8632e;
import p258s2.C8634g;

@AbstractC8385g(tags = {4})
public class C8383e extends AbstractC8380b {
    public static Logger f27225n = Logger.getLogger(C8383e.class.getName());
    public int f27226d;
    public int f27227e;
    public int f27228f;
    public int f27229g;
    public long f27230h;
    public long f27231i;
    public C8384f f27232j;
    public C8377a f27233k;
    public List<C8391m> f27234l = new ArrayList();
    public byte[] f27235m;

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        int a;
        this.f27226d = C8632e.m11861n(byteBuffer);
        int n = C8632e.m11861n(byteBuffer);
        this.f27227e = n >>> 2;
        this.f27228f = (n >> 1) & 1;
        this.f27229g = C8632e.m11865j(byteBuffer);
        this.f27230h = C8632e.m11864k(byteBuffer);
        this.f27231i = C8632e.m11864k(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            AbstractC8380b a2 = C8390l.m12593a(this.f27226d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = f27225n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a2);
            sb2.append(" - DecoderConfigDescr1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a2 != null ? Integer.valueOf(a2.m12636a()) : null);
            logger.finer(sb2.toString());
            if (a2 != null && position2 < (a = a2.m12636a())) {
                byte[] bArr = new byte[a - position2];
                this.f27235m = bArr;
                byteBuffer.get(bArr);
            }
            if (a2 instanceof C8384f) {
                this.f27232j = (C8384f) a2;
            }
            if (a2 instanceof C8377a) {
                this.f27233k = (C8377a) a2;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            AbstractC8380b a3 = C8390l.m12593a(this.f27226d, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f27225n;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a3);
            sb3.append(" - DecoderConfigDescr2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a3 != null ? Integer.valueOf(a3.m12636a()) : null);
            logger2.finer(sb3.toString());
            if (a3 instanceof C8391m) {
                this.f27234l.add((C8391m) a3);
            }
        }
    }

    public C8377a m12628f() {
        return this.f27233k;
    }

    public long m12627g() {
        return this.f27231i;
    }

    public int m12626h() {
        return this.f27229g;
    }

    public C8384f m12625i() {
        return this.f27232j;
    }

    public long m12624j() {
        return this.f27230h;
    }

    public int m12623k() {
        return this.f27226d;
    }

    public List<C8391m> m12622l() {
        return this.f27234l;
    }

    public int m12621m() {
        return this.f27227e;
    }

    public int m12620n() {
        return this.f27228f;
    }

    public ByteBuffer m12619o() {
        ByteBuffer allocate = ByteBuffer.allocate(m12618p());
        C8634g.m11850j(allocate, 4);
        C8634g.m11850j(allocate, m12618p() - 2);
        C8634g.m11850j(allocate, this.f27226d);
        C8634g.m11850j(allocate, (this.f27227e << 2) | (this.f27228f << 1) | 1);
        C8634g.m11854f(allocate, this.f27229g);
        C8634g.m11853g(allocate, this.f27230h);
        C8634g.m11853g(allocate, this.f27231i);
        C8377a aVar = this.f27233k;
        if (aVar != null) {
            allocate.put(aVar.m12642n().array());
        }
        return allocate;
    }

    public int m12618p() {
        C8377a aVar = this.f27233k;
        return (aVar == null ? 0 : aVar.m12641o()) + 15;
    }

    public void m12617q(C8377a aVar) {
        this.f27233k = aVar;
    }

    public void m12616r(long j) {
        this.f27231i = j;
    }

    public void m12615s(int i) {
        this.f27229g = i;
    }

    public void m12614t(long j) {
        this.f27230h = j;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.f27226d);
        sb2.append(", streamType=");
        sb2.append(this.f27227e);
        sb2.append(", upStream=");
        sb2.append(this.f27228f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f27229g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f27230h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f27231i);
        sb2.append(", decoderSpecificInfo=");
        sb2.append(this.f27232j);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f27233k);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f27235m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(C8630c.m11879b(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        List<C8391m> list = this.f27234l;
        sb2.append(list == null ? "null" : Arrays.asList(list).toString());
        sb2.append('}');
        return sb2.toString();
    }

    public void m12613u(int i) {
        this.f27226d = i;
    }

    public void m12612v(int i) {
        this.f27227e = i;
    }
}
