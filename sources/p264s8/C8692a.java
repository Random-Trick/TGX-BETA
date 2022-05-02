package p264s8;

import java.nio.ByteBuffer;
import java.util.UUID;
import p258s2.C8632e;
import p258s2.C8634g;
import p345y8.C10455i;

public class C8692a extends AbstractC8693b {
    public boolean f28017a;
    public byte f28018b;
    public UUID f28019c;

    @Override
    public ByteBuffer mo11723a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        C8634g.m11855f(allocate, this.f28017a ? 1 : 0);
        if (this.f28017a) {
            C8634g.m11851j(allocate, this.f28018b);
            allocate.put(C10455i.m5082b(this.f28019c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11722b() {
        return "seig";
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        boolean z = true;
        if (C8632e.m11866j(byteBuffer) != 1) {
            z = false;
        }
        this.f28017a = z;
        this.f28018b = (byte) C8632e.m11862n(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f28019c = C10455i.m5083a(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8692a aVar = (C8692a) obj;
        if (this.f28017a != aVar.f28017a || this.f28018b != aVar.f28018b) {
            return false;
        }
        UUID uuid = this.f28019c;
        UUID uuid2 = aVar.f28019c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public int hashCode() {
        int i = (((this.f28017a ? 7 : 19) * 31) + this.f28018b) * 31;
        UUID uuid = this.f28019c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.f28017a + ", ivSize=" + ((int) this.f28018b) + ", kid=" + this.f28019c + '}';
    }
}
