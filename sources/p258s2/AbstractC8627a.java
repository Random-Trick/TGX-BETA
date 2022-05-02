package p258s2;

import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.AbstractC3539a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p269t2.AbstractC8950a;
import p269t2.AbstractC8951b;

public abstract class AbstractC8627a implements AbstractC8629b {
    public static Logger f27945b = Logger.getLogger(AbstractC8627a.class.getName());
    public ThreadLocal<ByteBuffer> f27946a = new C8628a();

    public class C8628a extends ThreadLocal<ByteBuffer> {
        public C8628a() {
        }

        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }

    @Override
    public AbstractC8950a mo11881a(AbstractC3539a aVar, AbstractC8951b bVar) {
        int read;
        long j;
        byte[] bArr;
        long L = aVar.mo30097L();
        this.f27946a.get().rewind().limit(8);
        do {
            read = aVar.read(this.f27946a.get());
            if (read == 8) {
                this.f27946a.get().rewind();
                long k = C8632e.m11864k(this.f27946a.get());
                if (k >= 8 || k <= 1) {
                    String b = C8632e.m11873b(this.f27946a.get());
                    if (k == 1) {
                        this.f27946a.get().limit(16);
                        aVar.read(this.f27946a.get());
                        this.f27946a.get().position(8);
                        j = C8632e.m11862m(this.f27946a.get()) - 16;
                    } else {
                        j = k == 0 ? aVar.size() - aVar.mo30097L() : k - 8;
                    }
                    if (UserBox.TYPE.equals(b)) {
                        this.f27946a.get().limit(this.f27946a.get().limit() + 16);
                        aVar.read(this.f27946a.get());
                        bArr = new byte[16];
                        for (int position = this.f27946a.get().position() - 16; position < this.f27946a.get().position(); position++) {
                            bArr[position - (this.f27946a.get().position() - 16)] = this.f27946a.get().get(position);
                        }
                        j -= 16;
                    } else {
                        bArr = null;
                    }
                    long j2 = j;
                    AbstractC8950a b2 = mo11846b(b, bArr, bVar instanceof AbstractC8950a ? ((AbstractC8950a) bVar).getType() : "");
                    b2.setParent(bVar);
                    this.f27946a.get().rewind();
                    b2.parse(aVar, this.f27946a.get(), j2, this);
                    return b2;
                }
                f27945b.severe("Plausibility check failed: size < 8 (size = " + k + "). Stop parsing!");
                return null;
            }
        } while (read >= 0);
        aVar.mo30094t0(L);
        throw new EOFException();
    }

    public abstract AbstractC8950a mo11846b(String str, byte[] bArr, String str2);
}
