package h4;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.thunderdog.challegram.Log;

public final class c {
    public final ByteArrayOutputStream f12521a;
    public final DataOutputStream f12522b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Log.TAG_GIF_LOADER);
        this.f12521a = byteArrayOutputStream;
        this.f12522b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f12521a.reset();
        try {
            b(this.f12522b, aVar.f12518a);
            String str = aVar.f12519b;
            if (str == null) {
                str = "";
            }
            b(this.f12522b, str);
            this.f12522b.writeLong(aVar.f12520c);
            this.f12522b.writeLong(aVar.M);
            this.f12522b.write(aVar.N);
            this.f12522b.flush();
            return this.f12521a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
