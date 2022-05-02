package p324x2;

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

public class C10083i implements Closeable {
    public final int f32760a = 1179403647;
    public final FileChannel f32761b;

    public C10083i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f32761b = new FileInputStream(file).getChannel();
    }

    public short m6066A0(ByteBuffer byteBuffer, long j) {
        m6058z0(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int m6065B0(ByteBuffer byteBuffer, long j) {
        m6058z0(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long m6064C0(ByteBuffer byteBuffer, long j) {
        m6058z0(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public String m6063D0(ByteBuffer byteBuffer, long j) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            j = 1 + j;
            short A0 = m6066A0(byteBuffer, j);
            if (A0 == 0) {
                return sb2.toString();
            }
            sb2.append((char) A0);
        }
    }

    public long m6062E0(ByteBuffer byteBuffer, long j) {
        m6058z0(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }

    @Override
    public void close() {
        this.f32761b.close();
    }

    public final long m6061m(AbstractC10078d dVar, long j, long j2) {
        for (long j3 = 0; j3 < j; j3++) {
            AbstractC10079e b = dVar.mo6068b(j3);
            if (b.f32753a == 1) {
                long j4 = b.f32755c;
                if (j4 <= j2 && j2 <= b.f32756d + j4) {
                    return (j2 - j4) + b.f32754b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public AbstractC10078d m6060t() {
        this.f32761b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m6062E0(allocate, 0L) == 1179403647) {
            short A0 = m6066A0(allocate, 4L);
            boolean z = m6066A0(allocate, 5L) == 2;
            if (A0 == 1) {
                return new C10081g(z, this);
            }
            if (A0 == 2) {
                return new C10082h(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public List<String> m6059y0() {
        long j;
        this.f32761b.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC10078d t = m6060t();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(t.f32744a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = t.f32749f;
        int i = 0;
        if (j2 == 65535) {
            j2 = t.mo6067c(0).f32757a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            AbstractC10079e b = t.mo6068b(j3);
            if (b.f32753a == 2) {
                j = b.f32754b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        long j4 = 0;
        while (true) {
            AbstractC10077c a = t.mo6069a(j, i);
            j = j;
            long j5 = a.f32742a;
            if (j5 == 1) {
                arrayList2.add(Long.valueOf(a.f32743b));
            } else if (j5 == 5) {
                j4 = a.f32743b;
            }
            i++;
            if (a.f32742a == 0) {
                break;
            }
        }
        if (j4 != 0) {
            long m = m6061m(t, j2, j4);
            for (Long l : arrayList2) {
                arrayList.add(m6063D0(allocate, l.longValue() + m));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public void m6058z0(ByteBuffer byteBuffer, long j, int i) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.f32761b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
