package t8;

import java.nio.ByteBuffer;
import java.util.UUID;
import s2.e;
import s2.g;
import z8.i;

public class a extends b {
    public boolean f22977a;
    public byte f22978b;
    public UUID f22979c;

    @Override
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        g.f(allocate, this.f22977a ? 1 : 0);
        if (this.f22977a) {
            g.j(allocate, this.f22978b);
            allocate.put(i.b(this.f22979c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override
    public String b() {
        return "seig";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        boolean z10 = true;
        if (e.j(byteBuffer) != 1) {
            z10 = false;
        }
        this.f22977a = z10;
        this.f22978b = (byte) e.n(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f22979c = i.a(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22977a != aVar.f22977a || this.f22978b != aVar.f22978b) {
            return false;
        }
        UUID uuid = this.f22979c;
        UUID uuid2 = aVar.f22979c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public int hashCode() {
        int i10 = (((this.f22977a ? 7 : 19) * 31) + this.f22978b) * 31;
        UUID uuid = this.f22979c;
        return i10 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.f22977a + ", ivSize=" + ((int) this.f22978b) + ", kid=" + this.f22979c + '}';
    }
}
