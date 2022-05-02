package p101h4;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.thunderdog.challegram.Log;

public final class C4954c {
    public final ByteArrayOutputStream f16871a;
    public final DataOutputStream f16872b;

    public C4954c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Log.TAG_GIF_LOADER);
        this.f16871a = byteArrayOutputStream;
        this.f16872b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void m24386b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] m24387a(C4951a aVar) {
        this.f16871a.reset();
        try {
            m24386b(this.f16872b, aVar.f16868a);
            String str = aVar.f16869b;
            if (str == null) {
                str = "";
            }
            m24386b(this.f16872b, str);
            this.f16872b.writeLong(aVar.f16870c);
            this.f16872b.writeLong(aVar.f16865M);
            this.f16872b.write(aVar.f16866N);
            this.f16872b.flush();
            return this.f16871a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
