package hc;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g extends a0, ReadableByteChannel {
    boolean C();

    String I(long j10);

    String U(Charset charset);

    e a();

    void b0(long j10);

    String g0();

    byte[] i0(long j10);

    h o(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void s0(long j10);

    long v0();
}
