package p351z;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

public class C11178a extends FilterOutputStream {
    public final OutputStream f35831a;
    public ByteOrder f35832b;

    public C11178a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f35831a = outputStream;
        this.f35832b = byteOrder;
    }

    public void m1320A0(long j) {
        m1316y0((int) j);
    }

    public void m1319B0(int i) {
        m1315z0((short) i);
    }

    public void m1318m(ByteOrder byteOrder) {
        this.f35832b = byteOrder;
    }

    public void m1317t(int i) {
        this.f35831a.write(i);
    }

    @Override
    public void write(byte[] bArr) {
        this.f35831a.write(bArr);
    }

    public void m1316y0(int i) {
        ByteOrder byteOrder = this.f35832b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f35831a.write((i >>> 0) & 255);
            this.f35831a.write((i >>> 8) & 255);
            this.f35831a.write((i >>> 16) & 255);
            this.f35831a.write((i >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f35831a.write((i >>> 24) & 255);
            this.f35831a.write((i >>> 16) & 255);
            this.f35831a.write((i >>> 8) & 255);
            this.f35831a.write((i >>> 0) & 255);
        }
    }

    public void m1315z0(short s) {
        ByteOrder byteOrder = this.f35832b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f35831a.write((s >>> 0) & 255);
            this.f35831a.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f35831a.write((s >>> 8) & 255);
            this.f35831a.write((s >>> 0) & 255);
        }
    }

    @Override
    public void write(byte[] bArr, int i, int i2) {
        this.f35831a.write(bArr, i, i2);
    }
}
