package p342y5;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import org.thunderdog.challegram.Log;

public final class C10410r {
    public static final OutputStream f33481a = new C10408p();

    public static byte[] m5160a(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = Log.TAG_LUX;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m5158c(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = i;
            long j2 = j + j;
            i = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (inputStream.read() == -1) {
            return m5158c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream m5159b(InputStream inputStream, long j) {
        return new C10409q(inputStream, 1048577L);
    }

    public static byte[] m5158c(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
