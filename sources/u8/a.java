package u8;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import s2.c;

public abstract class a {
    public static Map<UUID, Class<? extends a>> f23713a = new HashMap();

    public static a a(UUID uuid, ByteBuffer byteBuffer) {
        a newInstance;
        Class<? extends a> cls = f23713a.get(uuid);
        if (cls != null) {
            try {
                newInstance = cls.newInstance();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            }
        } else {
            newInstance = null;
        }
        if (newInstance == null) {
            newInstance = new v8.a();
        }
        newInstance.c(byteBuffer);
        return newInstance;
    }

    public abstract ByteBuffer b();

    public abstract void c(ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ProtectionSpecificHeader");
        sb2.append("{data=");
        ByteBuffer duplicate = b().duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        sb2.append(c.b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
