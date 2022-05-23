package a4;

import c5.b0;
import c5.s;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class l {

    public static class a {
        public final UUID f346a;
        public final int f347b;
        public final byte[] f348c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f346a = uuid;
            this.f347b = i10;
            this.f348c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
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

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        b0 b0Var = new b0(bArr);
        if (b0Var.f() < 32) {
            return null;
        }
        b0Var.P(0);
        if (b0Var.n() != b0Var.a() + 4 || b0Var.n() != 1886614376) {
            return null;
        }
        int c10 = a4.a.c(b0Var.n());
        if (c10 > 1) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Unsupported pssh version: ");
            sb2.append(c10);
            s.i("PsshAtomUtil", sb2.toString());
            return null;
        }
        UUID uuid = new UUID(b0Var.w(), b0Var.w());
        if (c10 == 1) {
            b0Var.Q(b0Var.H() * 16);
        }
        int H = b0Var.H();
        if (H != b0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[H];
        b0Var.j(bArr2, 0, H);
        return new a(uuid, c10, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f346a)) {
            return d10.f348c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(d10.f346a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
        sb2.append("UUID mismatch. Expected: ");
        sb2.append(valueOf);
        sb2.append(", got: ");
        sb2.append(valueOf2);
        sb2.append(".");
        s.i("PsshAtomUtil", sb2.toString());
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f346a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f347b;
    }
}
