package t6;

import java.io.Closeable;
import java.io.InputStream;

public abstract class w implements Closeable {
    public abstract long m();

    public abstract InputStream s(long j10, long j11);

    public final synchronized InputStream y0() {
        return s(0L, m());
    }
}
