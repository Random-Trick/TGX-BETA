package p005a4;

import java.nio.ByteBuffer;
import java.util.UUID;
import p020b5.C1189b0;
import p020b5.C1230s;

public final class C0106l {

    public static class C0107a {
        public final UUID f405a;
        public final int f406b;
        public final byte[] f407c;

        public C0107a(UUID uuid, int i, byte[] bArr) {
            this.f405a = uuid;
            this.f406b = i;
            this.f407c = bArr;
        }
    }

    public static byte[] m42288a(UUID uuid, byte[] bArr) {
        return m42287b(uuid, null, bArr);
    }

    public static byte[] m42287b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean m42286c(byte[] bArr) {
        return m42285d(bArr) != null;
    }

    public static C0107a m42285d(byte[] bArr) {
        C1189b0 b0Var = new C1189b0(bArr);
        if (b0Var.m38137f() < 32) {
            return null;
        }
        b0Var.m38144P(0);
        if (b0Var.m38129n() != b0Var.m38142a() + 4 || b0Var.m38129n() != 1886614376) {
            return null;
        }
        int c = AbstractC0082a.m42417c(b0Var.m38129n());
        if (c > 1) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Unsupported pssh version: ");
            sb2.append(c);
            C1230s.m37881i("PsshAtomUtil", sb2.toString());
            return null;
        }
        UUID uuid = new UUID(b0Var.m38120w(), b0Var.m38120w());
        if (c == 1) {
            b0Var.m38143Q(b0Var.m38152H() * 16);
        }
        int H = b0Var.m38152H();
        if (H != b0Var.m38142a()) {
            return null;
        }
        byte[] bArr2 = new byte[H];
        b0Var.m38133j(bArr2, 0, H);
        return new C0107a(uuid, c, bArr2);
    }

    public static byte[] m42284e(byte[] bArr, UUID uuid) {
        C0107a d = m42285d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.f405a)) {
            return d.f407c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(d.f405a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
        sb2.append("UUID mismatch. Expected: ");
        sb2.append(valueOf);
        sb2.append(", got: ");
        sb2.append(valueOf2);
        sb2.append(".");
        C1230s.m37881i("PsshAtomUtil", sb2.toString());
        return null;
    }

    public static UUID m42283f(byte[] bArr) {
        C0107a d = m42285d(bArr);
        if (d == null) {
            return null;
        }
        return d.f405a;
    }

    public static int m42282g(byte[] bArr) {
        C0107a d = m42285d(bArr);
        if (d == null) {
            return -1;
        }
        return d.f406b;
    }
}
