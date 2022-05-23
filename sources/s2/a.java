package s2;

import com.coremedia.iso.boxes.UserBox;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import t2.b;

public abstract class a implements b {
    public static Logger f22458b = Logger.getLogger(a.class.getName());
    public ThreadLocal<ByteBuffer> f22459a = new C0210a();

    public class C0210a extends ThreadLocal<ByteBuffer> {
        public C0210a() {
        }

        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }

    @Override
    public t2.a a(com.googlecode.mp4parser.a aVar, b bVar) {
        int read;
        long j10;
        byte[] bArr;
        long M = aVar.M();
        this.f22459a.get().rewind().limit(8);
        do {
            read = aVar.read(this.f22459a.get());
            if (read == 8) {
                this.f22459a.get().rewind();
                long k10 = e.k(this.f22459a.get());
                if (k10 >= 8 || k10 <= 1) {
                    String b10 = e.b(this.f22459a.get());
                    if (k10 == 1) {
                        this.f22459a.get().limit(16);
                        aVar.read(this.f22459a.get());
                        this.f22459a.get().position(8);
                        j10 = e.m(this.f22459a.get()) - 16;
                    } else {
                        j10 = k10 == 0 ? aVar.size() - aVar.M() : k10 - 8;
                    }
                    if (UserBox.TYPE.equals(b10)) {
                        this.f22459a.get().limit(this.f22459a.get().limit() + 16);
                        aVar.read(this.f22459a.get());
                        bArr = new byte[16];
                        for (int position = this.f22459a.get().position() - 16; position < this.f22459a.get().position(); position++) {
                            bArr[position - (this.f22459a.get().position() - 16)] = this.f22459a.get().get(position);
                        }
                        j10 -= 16;
                    } else {
                        bArr = null;
                    }
                    long j11 = j10;
                    t2.a b11 = b(b10, bArr, bVar instanceof t2.a ? ((t2.a) bVar).getType() : "");
                    b11.setParent(bVar);
                    this.f22459a.get().rewind();
                    b11.parse(aVar, this.f22459a.get(), j11, this);
                    return b11;
                }
                f22458b.severe("Plausibility check failed: size < 8 (size = " + k10 + "). Stop parsing!");
                return null;
            }
        } while (read >= 0);
        aVar.t0(M);
        throw new EOFException();
    }

    public abstract t2.a b(String str, byte[] bArr, String str2);
}
