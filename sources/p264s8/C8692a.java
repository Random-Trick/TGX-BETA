package p264s8;

import java.nio.ByteBuffer;
import java.util.UUID;
import p258s2.C8632e;
import p258s2.C8634g;
import p345y8.C10455i;

public class C8692a extends AbstractC8693b {
    public boolean f28020a;
    public byte f28021b;
    public UUID f28022c;

    @Override
    public ByteBuffer mo11722a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        C8634g.m11854f(allocate, this.f28020a ? 1 : 0);
        if (this.f28020a) {
            C8634g.m11850j(allocate, this.f28021b);
            allocate.put(C10455i.m5082b(this.f28022c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11721b() {
        return "seig";
    }

    @Override
    public void mo11720c(ByteBuffer byteBuffer) {
        boolean z = true;
        if (C8632e.m11865j(byteBuffer) != 1) {
            z = false;
        }
        this.f28020a = z;
        this.f28021b = (byte) C8632e.m11861n(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f28022c = C10455i.m5083a(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8692a aVar = (C8692a) obj;
        if (this.f28020a != aVar.f28020a || this.f28021b != aVar.f28021b) {
            return false;
        }
        UUID uuid = this.f28022c;
        UUID uuid2 = aVar.f28022c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public int hashCode() {
        int i = (((this.f28020a ? 7 : 19) * 31) + this.f28021b) * 31;
        UUID uuid = this.f28022c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.f28020a + ", ivSize=" + ((int) this.f28021b) + ", kid=" + this.f28022c + '}';
    }
}
