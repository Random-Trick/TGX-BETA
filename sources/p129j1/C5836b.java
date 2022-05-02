package p129j1;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C5836b {

    public static class C5837a {
        public static void m21964a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        public static FileDescriptor m21963b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        public static long m21962c(FileDescriptor fileDescriptor, long j, int i) {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    public static class C5838b {
        public static void m21961a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static String m21971a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb2.toString();
    }

    public static void m21970b(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                C5837a.m21964a(fileDescriptor);
            } catch (Exception unused) {
                Log.e("ExifInterfaceUtils", "Error closing fd.");
            }
        } else {
            Log.e("ExifInterfaceUtils", "closeFileDescriptor is called in API < 21, which must be wrong.");
        }
    }

    public static void m21969c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] m21968d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static int m21967e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[org.thunderdog.challegram.Log.TAG_LUX];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static void m21966f(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[org.thunderdog.challegram.Log.TAG_LUX];
        while (i > 0) {
            int min = Math.min(i, (int) org.thunderdog.challegram.Log.TAG_LUX);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public static boolean m21965g(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
