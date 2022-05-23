package z5;

import java.io.OutputStream;
import java.util.Objects;

public final class p extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override
    public final void write(int i10) {
    }

    @Override
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr);
    }
}
