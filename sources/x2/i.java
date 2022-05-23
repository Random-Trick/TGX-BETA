package x2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class i implements Closeable {
    public final int f25959a = 1179403647;
    public final FileChannel f25960b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f25960b = new FileInputStream(file).getChannel();
    }

    public short A0(ByteBuffer byteBuffer, long j10) {
        z0(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int B0(ByteBuffer byteBuffer, long j10) {
        z0(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long C0(ByteBuffer byteBuffer, long j10) {
        z0(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    public String D0(ByteBuffer byteBuffer, long j10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            j10 = 1 + j10;
            short A0 = A0(byteBuffer, j10);
            if (A0 == 0) {
                return sb2.toString();
            }
            sb2.append((char) A0);
        }
    }

    public long E0(ByteBuffer byteBuffer, long j10) {
        z0(byteBuffer, j10, 4);
        return byteBuffer.getInt() & 4294967295L;
    }

    @Override
    public void close() {
        this.f25960b.close();
    }

    public final long m(d dVar, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            e b10 = dVar.b(j12);
            if (b10.f25952a == 1) {
                long j13 = b10.f25954c;
                if (j13 <= j11 && j11 <= b10.f25955d + j13) {
                    return (j11 - j13) + b10.f25953b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d s() {
        this.f25960b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (E0(allocate, 0L) == 1179403647) {
            short A0 = A0(allocate, 4L);
            boolean z10 = A0(allocate, 5L) == 2;
            if (A0 == 1) {
                return new g(z10, this);
            }
            if (A0 == 2) {
                return new h(z10, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public List<String> y0() {
        long j10;
        this.f25960b.position(0L);
        ArrayList arrayList = new ArrayList();
        d s10 = s();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(s10.f25943a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = s10.f25948f;
        int i10 = 0;
        if (j11 == 65535) {
            j11 = s10.c(0).f25956a;
        }
        long j12 = 0;
        while (true) {
            if (j12 >= j11) {
                j10 = 0;
                break;
            }
            e b10 = s10.b(j12);
            if (b10.f25952a == 2) {
                j10 = b10.f25953b;
                break;
            }
            j12++;
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        long j13 = 0;
        while (true) {
            c a10 = s10.a(j10, i10);
            j10 = j10;
            long j14 = a10.f25941a;
            if (j14 == 1) {
                arrayList2.add(Long.valueOf(a10.f25942b));
            } else if (j14 == 5) {
                j13 = a10.f25942b;
            }
            i10++;
            if (a10.f25941a == 0) {
                break;
            }
        }
        if (j13 != 0) {
            long m10 = m(s10, j11, j13);
            for (Long l10 : arrayList2) {
                arrayList.add(D0(allocate, l10.longValue() + m10));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public void z0(ByteBuffer byteBuffer, long j10, int i10) {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int read = this.f25960b.read(byteBuffer, j10 + j11);
            if (read != -1) {
                j11 += read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
