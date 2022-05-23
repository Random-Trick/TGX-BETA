package r5;

import androidx.annotation.RecentlyNonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
import org.thunderdog.challegram.Log;

@Deprecated
public final class j {
    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, boolean z10, int i10) {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i10);
                if (read == -1) {
                    break;
                }
                j10 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z10) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z10) {
            a(inputStream);
            a(outputStream);
        }
        return j10;
    }

    @RecentlyNonNull
    @Deprecated
    public static byte[] c(@RecentlyNonNull InputStream inputStream) {
        return d(inputStream, true);
    }

    @RecentlyNonNull
    @Deprecated
    public static byte[] d(@RecentlyNonNull InputStream inputStream, boolean z10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(inputStream, byteArrayOutputStream, z10, Log.TAG_CAMERA);
        return byteArrayOutputStream.toByteArray();
    }
}
