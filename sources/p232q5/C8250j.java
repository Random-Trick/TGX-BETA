package p232q5;

import androidx.annotation.RecentlyNonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
import org.thunderdog.challegram.Log;

@Deprecated
public final class C8250j {
    public static void m13041a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long m13040b(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m13041a(inputStream);
                    m13041a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m13041a(inputStream);
            m13041a(outputStream);
        }
        return j;
    }

    @RecentlyNonNull
    @Deprecated
    public static byte[] m13039c(@RecentlyNonNull InputStream inputStream) {
        return m13038d(inputStream, true);
    }

    @RecentlyNonNull
    @Deprecated
    public static byte[] m13038d(@RecentlyNonNull InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m13040b(inputStream, byteArrayOutputStream, z, Log.TAG_CAMERA);
        return byteArrayOutputStream.toByteArray();
    }
}
