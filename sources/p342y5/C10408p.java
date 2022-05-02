package p342y5;

import java.io.OutputStream;
import java.util.Objects;

public final class C10408p extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override
    public final void write(int i) {
    }

    @Override
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override
    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
    }
}
