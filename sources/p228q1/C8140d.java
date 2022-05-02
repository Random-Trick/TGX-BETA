package p228q1;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.thunderdog.challegram.Log;

public final class C8140d {

    public static class C8141a {
        public long f26420a;
        public long f26421b;
    }

    public static long m13375a(RandomAccessFile randomAccessFile, C8141a aVar) {
        CRC32 crc32 = new CRC32();
        long j = aVar.f26421b;
        randomAccessFile.seek(aVar.f26420a);
        int min = (int) Math.min(16384L, j);
        byte[] bArr = new byte[Log.TAG_VIDEO];
        int read = randomAccessFile.read(bArr, 0, min);
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }

    public static C8141a m13374b(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C8141a aVar = new C8141a();
                    aVar.f26421b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    aVar.f26420a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    public static long m13373c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m13375a(randomAccessFile, m13374b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
