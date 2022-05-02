package p275t8;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p258s2.C8630c;
import p288u8.C9459a;

public abstract class AbstractC9056a {
    public static Map<UUID, Class<? extends AbstractC9056a>> f29036a = new HashMap();

    public static AbstractC9056a m10596a(UUID uuid, ByteBuffer byteBuffer) {
        AbstractC9056a newInstance;
        Class<? extends AbstractC9056a> cls = f29036a.get(uuid);
        if (cls != null) {
            try {
                newInstance = cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            newInstance = null;
        }
        if (newInstance == null) {
            newInstance = new C9459a();
        }
        newInstance.mo8581c(byteBuffer);
        return newInstance;
    }

    public abstract ByteBuffer mo8582b();

    public abstract void mo8581c(ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ProtectionSpecificHeader");
        sb2.append("{data=");
        ByteBuffer duplicate = mo8582b().duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        sb2.append(C8630c.m11879b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
