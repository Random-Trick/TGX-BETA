package z;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

public class a extends FilterOutputStream {
    public final OutputStream f26709a;
    public ByteOrder f26710b;

    public a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f26709a = outputStream;
        this.f26710b = byteOrder;
    }

    public void A0(long j10) {
        y0((int) j10);
    }

    public void B0(int i10) {
        z0((short) i10);
    }

    public void m(ByteOrder byteOrder) {
        this.f26710b = byteOrder;
    }

    public void s(int i10) {
        this.f26709a.write(i10);
    }

    @Override
    public void write(byte[] bArr) {
        this.f26709a.write(bArr);
    }

    public void y0(int i10) {
        ByteOrder byteOrder = this.f26710b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f26709a.write((i10 >>> 0) & 255);
            this.f26709a.write((i10 >>> 8) & 255);
            this.f26709a.write((i10 >>> 16) & 255);
            this.f26709a.write((i10 >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f26709a.write((i10 >>> 24) & 255);
            this.f26709a.write((i10 >>> 16) & 255);
            this.f26709a.write((i10 >>> 8) & 255);
            this.f26709a.write((i10 >>> 0) & 255);
        }
    }

    public void z0(short s10) {
        ByteOrder byteOrder = this.f26710b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f26709a.write((s10 >>> 0) & 255);
            this.f26709a.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f26709a.write((s10 >>> 8) & 255);
            this.f26709a.write((s10 >>> 0) & 255);
        }
    }

    @Override
    public void write(byte[] bArr, int i10, int i11) {
        this.f26709a.write(bArr, i10, i11);
    }
}
