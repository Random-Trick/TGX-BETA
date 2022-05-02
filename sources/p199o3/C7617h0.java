package p199o3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class C7617h0 {
    public static List<byte[]> m15471a(byte[] bArr) {
        long e = m15467e(m15468d(bArr));
        long e2 = m15467e(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m15470b(e));
        arrayList.add(m15470b(e2));
        return arrayList;
    }

    public static byte[] m15470b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    public static int m15469c(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static int m15468d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static long m15467e(long j) {
        return (j * 1000000000) / 48000;
    }
}
