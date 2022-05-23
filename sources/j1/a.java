package j1;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import j$.util.DesugarTimeZone;
import j1.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {
    public static SimpleDateFormat U;
    public static SimpleDateFormat V;
    public static final e[] Z;
    public static final e[] f14980a0;
    public static final e[] f14981b0;
    public static final e[] f14982c0;
    public static final e[] f14983d0;
    public static final e[] f14985f0;
    public static final e[] f14986g0;
    public static final e[] f14987h0;
    public static final e[] f14988i0;
    public static final e[][] f14989j0;
    public static final HashMap<Integer, e>[] f14991l0;
    public static final HashMap<String, e>[] f14992m0;
    public static final Charset f14995p0;
    public static final byte[] f14996q0;
    public static final byte[] f14997r0;
    public static final Pattern f14998s0;
    public static final Pattern f14999t0;
    public static final Pattern f15000u0;
    public static final Pattern f15002v0;
    public String f15007a;
    public FileDescriptor f15008b;
    public AssetManager.AssetInputStream f15009c;
    public int f15010d;
    public boolean f15011e;
    public final HashMap<String, d>[] f15012f;
    public Set<Integer> f15013g;
    public ByteOrder f15014h;
    public boolean f15015i;
    public boolean f15016j;
    public boolean f15017k;
    public int f15018l;
    public int f15019m;
    public byte[] f15020n;
    public int f15021o;
    public int f15022p;
    public int f15023q;
    public int f15024r;
    public int f15025s;
    public boolean f15026t;
    public boolean f15027u;
    public static final boolean f15001v = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> f15003w = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> f15004x = Arrays.asList(2, 7, 4, 5);
    public static final int[] f15005y = {8, 8, 8};
    public static final int[] f15006z = {4};
    public static final int[] A = {8};
    public static final byte[] B = {-1, -40, -1};
    public static final byte[] C = {102, 116, 121, 112};
    public static final byte[] D = {109, 105, 102, 49};
    public static final byte[] E = {104, 101, 105, 99};
    public static final byte[] F = {79, 76, 89, 77, 80, 0};
    public static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] I = {101, 88, 73, 102};
    public static final byte[] J = {73, 72, 68, 82};
    public static final byte[] K = {73, 69, 78, 68};
    public static final byte[] L = {82, 73, 70, 70};
    public static final byte[] M = {87, 69, 66, 80};
    public static final byte[] N = {69, 88, 73, 70};
    public static final byte[] O = {-99, 1, 42};
    public static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final e f14984e0 = new e("StripOffsets", 273, 3);
    public static final e[] f14990k0 = {new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashSet<String> f14993n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    public static final HashMap<Integer, Integer> f14994o0 = new HashMap<>();

    public class C0124a extends MediaDataSource {
        public long f15028a;
        public final g f15029b;

        public C0124a(g gVar) {
            this.f15029b = gVar;
        }

        @Override
        public void close() {
        }

        @Override
        public long getSize() {
            return -1L;
        }

        @Override
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f15028a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f15029b.available()) {
                        return -1;
                    }
                    this.f15029b.A0(j10);
                    this.f15028a = j10;
                }
                if (i11 > this.f15029b.available()) {
                    i11 = this.f15029b.available();
                }
                int read = this.f15029b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f15028a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f15028a = -1L;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {
        public static final ByteOrder N = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder O = ByteOrder.BIG_ENDIAN;
        public byte[] M;
        public final DataInputStream f15031a;
        public ByteOrder f15032b;
        public int f15033c;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override
        public int available() {
            return this.f15031a.available();
        }

        public int m() {
            return this.f15033c;
        }

        @Override
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override
        public int read() {
            this.f15033c++;
            return this.f15031a.read();
        }

        @Override
        public boolean readBoolean() {
            this.f15033c++;
            return this.f15031a.readBoolean();
        }

        @Override
        public byte readByte() {
            this.f15033c++;
            int read = this.f15031a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override
        public char readChar() {
            this.f15033c += 2;
            return this.f15031a.readChar();
        }

        @Override
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f15033c += i11;
            this.f15031a.readFully(bArr, i10, i11);
        }

        @Override
        public int readInt() {
            this.f15033c += 4;
            int read = this.f15031a.read();
            int read2 = this.f15031a.read();
            int read3 = this.f15031a.read();
            int read4 = this.f15031a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f15032b;
                if (byteOrder == N) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == O) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f15032b);
            }
            throw new EOFException();
        }

        @Override
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override
        public long readLong() {
            this.f15033c += 8;
            int read = this.f15031a.read();
            int read2 = this.f15031a.read();
            int read3 = this.f15031a.read();
            int read4 = this.f15031a.read();
            int read5 = this.f15031a.read();
            int read6 = this.f15031a.read();
            int read7 = this.f15031a.read();
            int read8 = this.f15031a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f15032b;
                if (byteOrder == N) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == O) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f15032b);
            }
            throw new EOFException();
        }

        @Override
        public short readShort() {
            this.f15033c += 2;
            int read = this.f15031a.read();
            int read2 = this.f15031a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f15032b;
                if (byteOrder == N) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == O) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f15032b);
            }
            throw new EOFException();
        }

        @Override
        public String readUTF() {
            this.f15033c += 2;
            return this.f15031a.readUTF();
        }

        @Override
        public int readUnsignedByte() {
            this.f15033c++;
            return this.f15031a.readUnsignedByte();
        }

        @Override
        public int readUnsignedShort() {
            this.f15033c += 2;
            int read = this.f15031a.read();
            int read2 = this.f15031a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f15032b;
                if (byteOrder == N) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == O) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f15032b);
            }
            throw new EOFException();
        }

        @Override
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public long s() {
            return readInt() & 4294967295L;
        }

        @Override
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void y0(ByteOrder byteOrder) {
            this.f15032b = byteOrder;
        }

        public void z0(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f15031a.skip(i12);
                if (skip <= 0) {
                    if (this.M == null) {
                        this.M = new byte[org.thunderdog.challegram.Log.TAG_LUX];
                    }
                    skip = this.f15031a.read(this.M, 0, Math.min((int) org.thunderdog.challegram.Log.TAG_LUX, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f15033c += i11;
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f15032b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f15031a = dataInputStream;
            dataInputStream.mark(0);
            this.f15033c = 0;
            this.f15032b = byteOrder;
        }

        @Override
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f15031a.read(bArr, i10, i11);
            this.f15033c += read;
            return read;
        }

        @Override
        public void readFully(byte[] bArr) {
            this.f15033c += bArr.length;
            this.f15031a.readFully(bArr);
        }
    }

    public static class c extends FilterOutputStream {
        public final OutputStream f15034a;
        public ByteOrder f15035b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f15034a = outputStream;
            this.f15035b = byteOrder;
        }

        public void A0(long j10) {
            y0((int) j10);
        }

        public void B0(int i10) {
            z0((short) i10);
        }

        public void m(ByteOrder byteOrder) {
            this.f15035b = byteOrder;
        }

        public void s(int i10) {
            this.f15034a.write(i10);
        }

        @Override
        public void write(byte[] bArr) {
            this.f15034a.write(bArr);
        }

        public void y0(int i10) {
            ByteOrder byteOrder = this.f15035b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f15034a.write((i10 >>> 0) & 255);
                this.f15034a.write((i10 >>> 8) & 255);
                this.f15034a.write((i10 >>> 16) & 255);
                this.f15034a.write((i10 >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f15034a.write((i10 >>> 24) & 255);
                this.f15034a.write((i10 >>> 16) & 255);
                this.f15034a.write((i10 >>> 8) & 255);
                this.f15034a.write((i10 >>> 0) & 255);
            }
        }

        public void z0(short s10) {
            ByteOrder byteOrder = this.f15035b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f15034a.write((s10 >>> 0) & 255);
                this.f15034a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f15034a.write((s10 >>> 8) & 255);
                this.f15034a.write((s10 >>> 0) & 255);
            }
        }

        @Override
        public void write(byte[] bArr, int i10, int i11) {
            this.f15034a.write(bArr, i10, i11);
        }
    }

    public static class d {
        public final int f15036a;
        public final int f15037b;
        public final long f15038c;
        public final byte[] f15039d;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f14995p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f15044a);
                wrap.putInt((int) fVar.f15045b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f14995p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f15044a);
                wrap.putInt((int) fVar.f15045b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o10 instanceof String) {
                return Double.parseDouble((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof double[]) {
                    double[] dArr = (double[]) o10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof f[]) {
                    f[] fVarArr = (f[]) o10;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o10 instanceof String) {
                return Integer.parseInt((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(o10 instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) o10;
                while (i10 < fVarArr.length) {
                    sb2.append(fVarArr[i10].f15044a);
                    sb2.append('/');
                    sb2.append(fVarArr[i10].f15045b);
                    i10++;
                    if (i10 != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        public java.lang.Object o(java.nio.ByteOrder r11) {
            throw new UnsupportedOperationException("Method not decompiled: j1.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.X[this.f15036a] * this.f15037b;
        }

        public String toString() {
            return "(" + a.W[this.f15036a] + ", data length:" + this.f15039d.length + ")";
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f15036a = i10;
            this.f15037b = i11;
            this.f15038c = j10;
            this.f15039d = bArr;
        }
    }

    public static class f {
        public final long f15044a;
        public final long f15045b;

        public f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f15044a / this.f15045b;
        }

        public String toString() {
            return this.f15044a + "/" + this.f15045b;
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f15044a = 0L;
                this.f15045b = 1L;
                return;
            }
            this.f15044a = j10;
            this.f15045b = j11;
        }
    }

    static {
        e[] eVarArr;
        e[] eVarArr2 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", org.thunderdog.challegram.Log.TAG_CRASH, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr2;
        e[] eVarArr3 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f14980a0 = eVarArr3;
        e[] eVarArr4 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f14981b0 = eVarArr4;
        e[] eVarArr5 = {new e("InteroperabilityIndex", 1, 2)};
        f14982c0 = eVarArr5;
        e[] eVarArr6 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", org.thunderdog.challegram.Log.TAG_CRASH, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Xmp", 700, 1), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f14983d0 = eVarArr6;
        e[] eVarArr7 = {new e("ThumbnailImage", org.thunderdog.challegram.Log.TAG_CRASH, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f14985f0 = eVarArr7;
        e[] eVarArr8 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f14986g0 = eVarArr8;
        e[] eVarArr9 = {new e("AspectFrame", 4371, 3)};
        f14987h0 = eVarArr9;
        e[] eVarArr10 = {new e("ColorSpace", 55, 3)};
        f14988i0 = eVarArr10;
        e[][] eVarArr11 = {eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr6, eVarArr2, eVarArr7, eVarArr8, eVarArr9, eVarArr10};
        f14989j0 = eVarArr11;
        f14991l0 = new HashMap[eVarArr11.length];
        f14992m0 = new HashMap[eVarArr11.length];
        Charset forName = Charset.forName("US-ASCII");
        f14995p0 = forName;
        f14996q0 = "Exif\u0000\u0000".getBytes(forName);
        f14997r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr12 = f14989j0;
            if (i10 < eVarArr12.length) {
                f14991l0[i10] = new HashMap<>();
                f14992m0[i10] = new HashMap<>();
                for (e eVar : eVarArr12[i10]) {
                    f14991l0[i10].put(Integer.valueOf(eVar.f15040a), eVar);
                    f14992m0[i10].put(eVar.f15041b, eVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = f14994o0;
                e[] eVarArr13 = f14990k0;
                hashMap.put(Integer.valueOf(eVarArr13[0].f15040a), 5);
                hashMap.put(Integer.valueOf(eVarArr13[1].f15040a), 1);
                hashMap.put(Integer.valueOf(eVarArr13[2].f15040a), 2);
                hashMap.put(Integer.valueOf(eVarArr13[3].f15040a), 3);
                hashMap.put(Integer.valueOf(eVarArr13[4].f15040a), 7);
                hashMap.put(Integer.valueOf(eVarArr13[5].f15040a), 8);
                f14998s0 = Pattern.compile(".*[1-9].*");
                f14999t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f15000u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f15002v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(File file) {
        e[][] eVarArr = f14989j0;
        this.f15012f = new HashMap[eVarArr.length];
        this.f15013g = new HashSet(eVarArr.length);
        this.f15014h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(file, "file cannot be null");
        A(file.getAbsolutePath());
    }

    public static boolean B(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f14996q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f14996q0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean D(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean I(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f15001v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean K(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14 || i10 == 3 || i10 == 0;
    }

    public static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean f0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static Pair<Integer, Integer> x(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> x10 = x(split[0]);
            if (((Integer) x10.first).intValue() == 2) {
                return x10;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> x11 = x(split[i10]);
                int intValue = (((Integer) x11.first).equals(x10.first) || ((Integer) x11.second).equals(x10.first)) ? ((Integer) x10.first).intValue() : -1;
                int intValue2 = (((Integer) x10.second).intValue() == -1 || (!((Integer) x11.first).equals(x10.second) && !((Integer) x11.second).equals(x10.second))) ? -1 : ((Integer) x10.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    x10 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    x10 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return x10;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused3) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
    }

    public final void A(String str) {
        Throwable th;
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.f15009c = null;
        this.f15007a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (I(fileInputStream2.getFD())) {
                    this.f15008b = fileInputStream2.getFD();
                } else {
                    this.f15008b = null;
                }
                N(fileInputStream2);
                j1.b.c(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                j1.b.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean C(byte[] bArr) {
        Throwable th;
        Exception e10;
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e11) {
                e10 = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e12) {
            e10 = e12;
            bVar2 = bVar;
            if (f15001v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e10);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, C)) {
            bVar.close();
            return false;
        }
        long j10 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, D)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, E)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    public final boolean E(byte[] bArr) {
        Throwable th;
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Q2 = Q(bVar2);
                this.f15014h = Q2;
                bVar2.y0(Q2);
                short readShort = bVar2.readShort();
                if (readShort == 20306 || readShort == 21330) {
                    z10 = true;
                }
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean H(byte[] bArr) {
        Throwable th;
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Q2 = Q(bVar2);
                this.f15014h = Q2;
                bVar2.y0(Q2);
                if (bVar2.readShort() == 85) {
                    z10 = true;
                }
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean J(HashMap hashMap) {
        d dVar;
        int m10;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f15014h);
            int[] iArr2 = f15005y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f15010d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f15014h)) == 1 && Arrays.equals(iArr, A)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f15001v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean L(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f15014h) <= 512 && dVar2.m(this.f15014h) <= 512;
    }

    public final boolean M(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    public final void N(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i10 = 0; i10 < f14989j0.length; i10++) {
            try {
                try {
                    this.f15012f[i10] = new HashMap<>();
                } finally {
                    a();
                    if (f15001v) {
                        P();
                    }
                }
            } catch (IOException | UnsupportedOperationException e10) {
                boolean z10 = f15001v;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (!z10) {
                    return;
                }
            }
        }
        if (!this.f15011e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f15010d = n(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (f0(this.f15010d)) {
            g gVar = new g(inputStream);
            if (this.f15011e) {
                t(gVar);
            } else {
                int i11 = this.f15010d;
                if (i11 == 12) {
                    k(gVar);
                } else if (i11 == 7) {
                    o(gVar);
                } else if (i11 == 10) {
                    s(gVar);
                } else {
                    r(gVar);
                }
            }
            gVar.A0(this.f15022p);
            e0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f15010d;
            if (i12 == 4) {
                l(bVar, 0, 0);
            } else if (i12 == 13) {
                p(bVar);
            } else if (i12 == 9) {
                q(bVar);
            } else if (i12 == 14) {
                w(bVar);
            }
        }
    }

    public final void O(b bVar) {
        ByteOrder Q2 = Q(bVar);
        this.f15014h = Q2;
        bVar.y0(Q2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f15010d;
        if (i10 == 7 || i10 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i11 = readInt - 8;
                if (i11 > 0) {
                    bVar.z0(i11);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void P() {
        for (int i10 = 0; i10 < this.f15012f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f15012f[i10].size());
            for (Map.Entry<String, d> entry : this.f15012f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f15014h) + "'");
            }
        }
    }

    public final ByteOrder Q(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f15001v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f15001v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void R(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        O(gVar);
        S(gVar, i10);
    }

    public final void S(j1.a.g r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: j1.a.S(j1.a$g, int):void");
    }

    public final void T(String str) {
        for (int i10 = 0; i10 < f14989j0.length; i10++) {
            this.f15012f[i10].remove(str);
        }
    }

    public final void U(int i10, String str, String str2) {
        if (!this.f15012f[i10].isEmpty() && this.f15012f[i10].get(str) != null) {
            HashMap<String, d>[] hashMapArr = this.f15012f;
            hashMapArr[i10].put(str2, hashMapArr[i10].get(str));
            this.f15012f[i10].remove(str);
        }
    }

    public final void V(g gVar, int i10) {
        d dVar = this.f15012f[i10].get("ImageLength");
        d dVar2 = this.f15012f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f15012f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f15012f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m10 = dVar3.m(this.f15014h);
                int m11 = dVar3.m(this.f15014h);
                gVar.A0(m10);
                byte[] bArr = new byte[m11];
                gVar.read(bArr);
                l(new b(bArr), m10, i10);
            }
        }
    }

    public void W() {
        throw new UnsupportedOperationException("Method not decompiled: j1.a.W():void");
    }

    public final void X(InputStream inputStream, OutputStream outputStream) {
        if (f15001v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.s(-1);
            if (bVar.readByte() == -40) {
                cVar.s(-40);
                d dVar = null;
                if (g("Xmp") != null && this.f15027u) {
                    dVar = this.f15012f[0].remove("Xmp");
                }
                cVar.s(-1);
                cVar.s(-31);
                j0(cVar);
                if (dVar != null) {
                    this.f15012f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[org.thunderdog.challegram.Log.TAG_EMOJI];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.s(-1);
                        cVar.s(readByte);
                        j1.b.e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.s(-1);
                        cVar.s(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.B0(readUnsignedShort);
                        int i10 = readUnsignedShort - 2;
                        if (i10 >= 0) {
                            while (i10 > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i10, (int) org.thunderdog.challegram.Log.TAG_EMOJI));
                                if (read >= 0) {
                                    cVar.write(bArr, 0, read);
                                    i10 -= read;
                                }
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (bVar.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f14996q0)) {
                                    bVar.z0(readUnsignedShort2 - 6);
                                }
                            }
                            cVar.s(-1);
                            cVar.s(readByte);
                            cVar.B0(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, (int) org.thunderdog.challegram.Log.TAG_EMOJI));
                                if (read2 >= 0) {
                                    cVar.write(bArr, 0, read2);
                                    readUnsignedShort2 -= read2;
                                }
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void Y(InputStream inputStream, OutputStream outputStream) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        if (f15001v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        j1.b.f(bVar, cVar, bArr.length);
        int i10 = this.f15022p;
        if (i10 == 0) {
            int readInt = bVar.readInt();
            cVar.y0(readInt);
            j1.b.f(bVar, cVar, readInt + 4 + 4);
        } else {
            j1.b.f(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.z0(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            j0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f15034a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.y0((int) crc32.getValue());
            j1.b.c(byteArrayOutputStream);
            j1.b.e(bVar, cVar);
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            j1.b.c(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void Z(java.io.InputStream r21, java.io.OutputStream r22) {
        throw new UnsupportedOperationException("Method not decompiled: j1.a.Z(java.io.InputStream, java.io.OutputStream):void");
    }

    public final void a() {
        String g10 = g("DateTimeOriginal");
        if (g10 != null && g("DateTime") == null) {
            this.f15012f[0].put("DateTime", d.e(g10));
        }
        if (g("ImageWidth") == null) {
            this.f15012f[0].put("ImageWidth", d.f(0L, this.f15014h));
        }
        if (g("ImageLength") == null) {
            this.f15012f[0].put("ImageLength", d.f(0L, this.f15014h));
        }
        if (g("Orientation") == null) {
            this.f15012f[0].put("Orientation", d.f(0L, this.f15014h));
        }
        if (g("LightSource") == null) {
            this.f15012f[1].put("LightSource", d.f(0L, this.f15014h));
        }
    }

    public void a0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        b0("GPSAltitude", new f(Math.abs(d10)).toString());
        b0("GPSAltitudeRef", str);
    }

    public final String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        long round = Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d);
        return j10 + "/1," + j11 + "/1," + round + "/10000000";
    }

    public void b0(String str, String str2) {
        e eVar;
        int i10;
        Matcher matcher;
        String str3 = str;
        String str4 = str2;
        Objects.requireNonNull(str3, "tag shouldn't be null");
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f15000u0.matcher(str4).find();
            boolean find2 = f15002v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                return;
            } else if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f15001v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i11 = 2;
        int i12 = 1;
        if (str4 != null && f14993n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                if (!f14999t0.matcher(str4).find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            }
        }
        char c10 = 0;
        int i13 = 0;
        while (i13 < f14989j0.length) {
            if ((i13 != 4 || this.f15015i) && (eVar = f14992m0[i13].get(str3)) != null) {
                if (str4 != null) {
                    Pair<Integer, Integer> x10 = x(str4);
                    int i14 = -1;
                    if (eVar.f15042c == ((Integer) x10.first).intValue() || eVar.f15042c == ((Integer) x10.second).intValue()) {
                        i10 = eVar.f15042c;
                    } else {
                        int i15 = eVar.f15043d;
                        if (i15 == -1 || !(i15 == ((Integer) x10.first).intValue() || eVar.f15043d == ((Integer) x10.second).intValue())) {
                            int i16 = eVar.f15042c;
                            if (i16 == i12 || i16 == 7 || i16 == i11) {
                                i10 = i16;
                            } else if (f15001v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = W;
                                sb2.append(strArr[eVar.f15042c]);
                                String str5 = "";
                                sb2.append(eVar.f15043d == -1 ? str5 : ", " + strArr[eVar.f15043d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) x10.first).intValue()]);
                                if (((Integer) x10.second).intValue() != -1) {
                                    str5 = ", " + strArr[((Integer) x10.second).intValue()];
                                }
                                sb2.append(str5);
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i10 = eVar.f15043d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            this.f15012f[i13].put(str3, d.a(str4));
                            continue;
                            i13++;
                            i11 = 2;
                            c10 = 0;
                            i12 = 1;
                        case 2:
                        case 7:
                            this.f15012f[i13].put(str3, d.e(str4));
                            continue;
                            i13++;
                            i11 = 2;
                            c10 = 0;
                            i12 = 1;
                        case 3:
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i17 = 0; i17 < split.length; i17++) {
                                iArr[i17] = Integer.parseInt(split[i17]);
                            }
                            this.f15012f[i13].put(str3, d.k(iArr, this.f15014h));
                            continue;
                            i13++;
                            i11 = 2;
                            c10 = 0;
                            i12 = 1;
                        case 4:
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i18 = 0; i18 < split2.length; i18++) {
                                jArr[i18] = Long.parseLong(split2[i18]);
                            }
                            this.f15012f[i13].put(str3, d.g(jArr, this.f15014h));
                            continue;
                            i13++;
                            i11 = 2;
                            c10 = 0;
                            i12 = 1;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i19 = 0;
                            while (i19 < split3.length) {
                                String[] split4 = split3[i19].split("/", i14);
                                fVarArr[i19] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i19++;
                                i14 = -1;
                            }
                            this.f15012f[i13].put(str3, d.i(fVarArr, this.f15014h));
                            continue;
                            i13++;
                            i11 = 2;
                            c10 = 0;
                            i12 = 1;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f15001v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                            } else {
                                continue;
                            }
                            i13++;
                            i11 = 2;
                            c10 = 0;
                            i12 = 1;
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i20 = 0; i20 < split5.length; i20++) {
                                iArr2[i20] = Integer.parseInt(split5[i20]);
                            }
                            this.f15012f[i13].put(str3, d.c(iArr2, this.f15014h));
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i21 = 0;
                            while (i21 < split6.length) {
                                String[] split7 = split6[i21].split("/", -1);
                                split6 = split6;
                                fVarArr2[i21] = new f((long) Double.parseDouble(split7[c10]), (long) Double.parseDouble(split7[i12]));
                                i21++;
                                c10 = 0;
                                i12 = 1;
                            }
                            this.f15012f[i13].put(str3, d.d(fVarArr2, this.f15014h));
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i22 = 0; i22 < split8.length; i22++) {
                                dArr[i22] = Double.parseDouble(split8[i22]);
                            }
                            this.f15012f[i13].put(str3, d.b(dArr, this.f15014h));
                            break;
                    }
                } else {
                    this.f15012f[i13].remove(str3);
                }
            }
            i13++;
            i11 = 2;
            c10 = 0;
            i12 = 1;
        }
    }

    public void c0(Location location) {
        if (location != null) {
            b0("GPSProcessingMethod", location.getProvider());
            d0(location.getLatitude(), location.getLongitude());
            a0(location.getAltitude());
            b0("GPSSpeedRef", "K");
            b0("GPSSpeed", new f((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
            String[] split = U.format(new Date(location.getTime())).split("\\s+", -1);
            b0("GPSDateStamp", split[0]);
            b0("GPSTimeStamp", split[1]);
        }
    }

    public final void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb2.append(new String(bArr, f14995p0));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public void d0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        } else if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        } else {
            b0("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
            b0("GPSLatitude", b(Math.abs(d10)));
            b0("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
            b0("GPSLongitude", b(Math.abs(d11)));
        }
    }

    public final void e(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.y0(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        j1.b.f(bVar, cVar, readInt);
    }

    public final void e0(b bVar) {
        HashMap<String, d> hashMap = this.f15012f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m10 = dVar.m(this.f15014h);
            this.f15021o = m10;
            if (m10 != 1) {
                if (m10 == 6) {
                    y(bVar, hashMap);
                    return;
                } else if (m10 != 7) {
                    return;
                }
            }
            if (J(hashMap)) {
                z(bVar, hashMap);
                return;
            }
            return;
        }
        this.f15021o = 6;
        y(bVar, hashMap);
    }

    public double f(double d10) {
        double h10 = h("GPSAltitude", -1.0d);
        int i10 = -1;
        int i11 = i("GPSAltitudeRef", -1);
        if (h10 < 0.0d || i11 < 0) {
            return d10;
        }
        if (i11 != 1) {
            i10 = 1;
        }
        return h10 * i10;
    }

    public String g(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j10 = j(str);
        if (j10 != null) {
            if (!f14993n0.contains(str)) {
                return j10.n(this.f15014h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = j10.f15036a;
                if (i10 == 5 || i10 == 10) {
                    f[] fVarArr = (f[]) j10.o(this.f15014h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVarArr[0].f15044a) / ((float) fVarArr[0].f15045b))), Integer.valueOf((int) (((float) fVarArr[1].f15044a) / ((float) fVarArr[1].f15045b))), Integer.valueOf((int) (((float) fVarArr[2].f15044a) / ((float) fVarArr[2].f15045b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j10.f15036a);
                return null;
            }
            try {
                return Double.toString(j10.l(this.f15014h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void g0(int i10, int i11) {
        if (!this.f15012f[i10].isEmpty() && !this.f15012f[i11].isEmpty()) {
            d dVar = this.f15012f[i10].get("ImageLength");
            d dVar2 = this.f15012f[i10].get("ImageWidth");
            d dVar3 = this.f15012f[i11].get("ImageLength");
            d dVar4 = this.f15012f[i11].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f15001v) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m10 = dVar.m(this.f15014h);
                int m11 = dVar2.m(this.f15014h);
                int m12 = dVar3.m(this.f15014h);
                int m13 = dVar4.m(this.f15014h);
                if (m10 < m12 && m11 < m13) {
                    HashMap<String, d>[] hashMapArr = this.f15012f;
                    HashMap<String, d> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            } else if (f15001v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f15001v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public double h(String str, double d10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j10 = j(str);
        if (j10 == null) {
            return d10;
        }
        try {
            return j10.l(this.f15014h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public final void h0(g gVar, int i10) {
        d dVar;
        d dVar2;
        d dVar3 = this.f15012f[i10].get("DefaultCropSize");
        d dVar4 = this.f15012f[i10].get("SensorTopBorder");
        d dVar5 = this.f15012f[i10].get("SensorLeftBorder");
        d dVar6 = this.f15012f[i10].get("SensorBottomBorder");
        d dVar7 = this.f15012f[i10].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f15036a == 5) {
                f[] fVarArr = (f[]) dVar3.o(this.f15014h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
                dVar2 = d.h(fVarArr[0], this.f15014h);
                dVar = d.h(fVarArr[1], this.f15014h);
            } else {
                int[] iArr = (int[]) dVar3.o(this.f15014h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVar2 = d.j(iArr[0], this.f15014h);
                dVar = d.j(iArr[1], this.f15014h);
            }
            this.f15012f[i10].put("ImageWidth", dVar2);
            this.f15012f[i10].put("ImageLength", dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            V(gVar, i10);
        } else {
            int m10 = dVar4.m(this.f15014h);
            int m11 = dVar6.m(this.f15014h);
            int m12 = dVar7.m(this.f15014h);
            int m13 = dVar5.m(this.f15014h);
            if (m11 > m10 && m12 > m13) {
                d j10 = d.j(m11 - m10, this.f15014h);
                d j11 = d.j(m12 - m13, this.f15014h);
                this.f15012f[i10].put("ImageLength", j10);
                this.f15012f[i10].put("ImageWidth", j11);
            }
        }
    }

    public int i(String str, int i10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        d j10 = j(str);
        if (j10 == null) {
            return i10;
        }
        try {
            return j10.m(this.f15014h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public final void i0() {
        g0(0, 5);
        g0(0, 4);
        g0(5, 4);
        d dVar = this.f15012f[1].get("PixelXDimension");
        d dVar2 = this.f15012f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f15012f[0].put("ImageWidth", dVar);
            this.f15012f[0].put("ImageLength", dVar2);
        }
        if (this.f15012f[4].isEmpty() && L(this.f15012f[5])) {
            HashMap<String, d>[] hashMapArr = this.f15012f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!L(this.f15012f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        U(0, "ThumbnailOrientation", "Orientation");
        U(0, "ThumbnailImageLength", "ImageLength");
        U(0, "ThumbnailImageWidth", "ImageWidth");
        U(5, "ThumbnailOrientation", "Orientation");
        U(5, "ThumbnailImageLength", "ImageLength");
        U(5, "ThumbnailImageWidth", "ImageWidth");
        U(4, "Orientation", "ThumbnailOrientation");
        U(4, "ImageLength", "ThumbnailImageLength");
        U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final d j(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f15001v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f14989j0.length; i10++) {
            d dVar = this.f15012f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final int j0(c cVar) {
        e[][] eVarArr = f14989j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f14990k0) {
            T(eVar.f15041b);
        }
        if (this.f15015i) {
            if (this.f15016j) {
                T("StripOffsets");
                T("StripByteCounts");
            } else {
                T("JPEGInterchangeFormat");
                T("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f14989j0.length; i10++) {
            for (Object obj : this.f15012f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f15012f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f15012f[1].isEmpty()) {
            this.f15012f[0].put(f14990k0[1].f15041b, d.f(0L, this.f15014h));
        }
        if (!this.f15012f[2].isEmpty()) {
            this.f15012f[0].put(f14990k0[2].f15041b, d.f(0L, this.f15014h));
        }
        if (!this.f15012f[3].isEmpty()) {
            this.f15012f[1].put(f14990k0[3].f15041b, d.f(0L, this.f15014h));
        }
        if (this.f15015i) {
            if (this.f15016j) {
                this.f15012f[4].put("StripOffsets", d.j(0, this.f15014h));
                this.f15012f[4].put("StripByteCounts", d.j(this.f15019m, this.f15014h));
            } else {
                this.f15012f[4].put("JPEGInterchangeFormat", d.f(0L, this.f15014h));
                this.f15012f[4].put("JPEGInterchangeFormatLength", d.f(this.f15019m, this.f15014h));
            }
        }
        for (int i11 = 0; i11 < f14989j0.length; i11++) {
            int i12 = 0;
            for (Map.Entry<String, d> entry2 : this.f15012f[i11].entrySet()) {
                int p10 = entry2.getValue().p();
                if (p10 > 4) {
                    i12 += p10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f14989j0.length; i14++) {
            if (!this.f15012f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f15012f[i14].size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        if (this.f15015i) {
            if (this.f15016j) {
                this.f15012f[4].put("StripOffsets", d.j(i13, this.f15014h));
            } else {
                this.f15012f[4].put("JPEGInterchangeFormat", d.f(i13, this.f15014h));
            }
            this.f15018l = i13;
            i13 += this.f15019m;
        }
        if (this.f15010d == 4) {
            i13 += 8;
        }
        if (f15001v) {
            for (int i15 = 0; i15 < f14989j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f15012f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)));
            }
        }
        if (!this.f15012f[1].isEmpty()) {
            this.f15012f[0].put(f14990k0[1].f15041b, d.f(iArr[1], this.f15014h));
        }
        if (!this.f15012f[2].isEmpty()) {
            this.f15012f[0].put(f14990k0[2].f15041b, d.f(iArr[2], this.f15014h));
        }
        if (!this.f15012f[3].isEmpty()) {
            this.f15012f[1].put(f14990k0[3].f15041b, d.f(iArr[3], this.f15014h));
        }
        int i16 = this.f15010d;
        if (i16 == 4) {
            cVar.B0(i13);
            cVar.write(f14996q0);
        } else if (i16 == 13) {
            cVar.y0(i13);
            cVar.write(I);
        } else if (i16 == 14) {
            cVar.write(N);
            cVar.y0(i13);
        }
        cVar.z0(this.f15014h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.m(this.f15014h);
        cVar.B0(42);
        cVar.A0(8L);
        for (int i17 = 0; i17 < f14989j0.length; i17++) {
            if (!this.f15012f[i17].isEmpty()) {
                cVar.B0(this.f15012f[i17].size());
                int size = iArr[i17] + 2 + (this.f15012f[i17].size() * 12) + 4;
                for (Map.Entry<String, d> entry3 : this.f15012f[i17].entrySet()) {
                    int i18 = f14992m0[i17].get(entry3.getKey()).f15040a;
                    d value = entry3.getValue();
                    int p11 = value.p();
                    cVar.B0(i18);
                    cVar.B0(value.f15036a);
                    cVar.y0(value.f15037b);
                    if (p11 > 4) {
                        cVar.A0(size);
                        size += p11;
                    } else {
                        cVar.write(value.f15039d);
                        if (p11 < 4) {
                            while (p11 < 4) {
                                cVar.s(0);
                                p11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f15012f[4].isEmpty()) {
                    cVar.A0(0L);
                } else {
                    cVar.A0(iArr[4]);
                }
                for (Map.Entry<String, d> entry4 : this.f15012f[i17].entrySet()) {
                    byte[] bArr = entry4.getValue().f15039d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f15015i) {
            cVar.write(v());
        }
        if (this.f15010d == 14 && i13 % 2 == 1) {
            cVar.s(0);
        }
        cVar.m(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    public final void k(g gVar) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    b.C0125b.a(mediaMetadataRetriever, new C0124a(gVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    String str3 = null;
                    if ("yes".equals(extractMetadata3)) {
                        str3 = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str3 = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str2 = null;
                        str = null;
                    }
                    if (str3 != null) {
                        this.f15012f[0].put("ImageWidth", d.j(Integer.parseInt(str3), this.f15014h));
                    }
                    if (str2 != null) {
                        this.f15012f[0].put("ImageLength", d.j(Integer.parseInt(str2), this.f15014h));
                    }
                    if (str != null) {
                        int i10 = 1;
                        int parseInt = Integer.parseInt(str);
                        if (parseInt == 90) {
                            i10 = 6;
                        } else if (parseInt == 180) {
                            i10 = 3;
                        } else if (parseInt == 270) {
                            i10 = 8;
                        }
                        this.f15012f[0].put("Orientation", d.j(i10, this.f15014h));
                    }
                    if (!(extractMetadata == null || extractMetadata2 == null)) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            gVar.A0(parseInt2);
                            byte[] bArr = new byte[6];
                            if (gVar.read(bArr) == 6) {
                                int i11 = parseInt2 + 6;
                                int i12 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f14996q0)) {
                                    byte[] bArr2 = new byte[i12];
                                    if (gVar.read(bArr2) == i12) {
                                        this.f15022p = i11;
                                        R(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f15001v) {
                        Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
                    }
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        } else {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
    }

    public final void l(j1.a.b r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: j1.a.l(j1.a$b, int, int):void");
    }

    public double[] m() {
        String g10 = g("GPSLatitude");
        String g11 = g("GPSLatitudeRef");
        String g12 = g("GPSLongitude");
        String g13 = g("GPSLongitudeRef");
        if (g10 == null || g11 == null || g12 == null || g13 == null) {
            return null;
        }
        try {
            return new double[]{c(g10, g11), c(g12, g13)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", g10, g11, g12, g13));
            return null;
        }
    }

    public final int n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (D(bArr)) {
            return 4;
        }
        if (G(bArr)) {
            return 9;
        }
        if (C(bArr)) {
            return 12;
        }
        if (E(bArr)) {
            return 7;
        }
        if (H(bArr)) {
            return 10;
        }
        if (F(bArr)) {
            return 13;
        }
        return M(bArr) ? 14 : 0;
    }

    public final void o(g gVar) {
        r(gVar);
        d dVar = this.f15012f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f15039d);
            gVar2.y0(this.f15014h);
            byte[] bArr = F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.A0(0L);
            byte[] bArr3 = G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.A0(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.A0(12L);
            }
            S(gVar2, 6);
            d dVar2 = this.f15012f[7].get("PreviewImageStart");
            d dVar3 = this.f15012f[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f15012f[5].put("JPEGInterchangeFormat", dVar2);
                this.f15012f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f15012f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f15014h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    d j10 = d.j(i10, this.f15014h);
                    d j11 = d.j(i11, this.f15014h);
                    this.f15012f[0].put("ImageWidth", j10);
                    this.f15012f[0].put("ImageLength", j11);
                }
            }
        }
    }

    public final void p(b bVar) {
        if (f15001v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.y0(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.z0(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, J)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, K)) {
                        if (Arrays.equals(bArr2, I)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f15022p = i11;
                                    R(bArr3, 0);
                                    i0();
                                    e0(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + j1.b.a(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.z0(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void q(b bVar) {
        boolean z10 = f15001v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.z0(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.z0(i10 - bVar.m());
        bVar.read(bArr4);
        l(new b(bArr4), i10, 5);
        bVar.z0(i12 - bVar.m());
        bVar.y0(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f14984e0.f15040a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f15014h);
                d j11 = d.j(readShort2, this.f15014h);
                this.f15012f[0].put("ImageLength", j10);
                this.f15012f[0].put("ImageWidth", j11);
                if (f15001v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.z0(readUnsignedShort2);
        }
    }

    public final void r(g gVar) {
        d dVar;
        O(gVar);
        S(gVar, 0);
        h0(gVar, 0);
        h0(gVar, 5);
        h0(gVar, 4);
        i0();
        if (this.f15010d == 8 && (dVar = this.f15012f[1].get("MakerNote")) != null) {
            g gVar2 = new g(dVar.f15039d);
            gVar2.y0(this.f15014h);
            gVar2.z0(6);
            S(gVar2, 9);
            d dVar2 = this.f15012f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f15012f[1].put("ColorSpace", dVar2);
            }
        }
    }

    public final void s(g gVar) {
        if (f15001v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        r(gVar);
        d dVar = this.f15012f[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f15039d), (int) dVar.f15038c, 5);
        }
        d dVar2 = this.f15012f[0].get("ISO");
        d dVar3 = this.f15012f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f15012f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    public final void t(g gVar) {
        byte[] bArr = f14996q0;
        gVar.z0(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f15022p = bArr.length;
        R(bArr2, 0);
    }

    public byte[] u() {
        int i10 = this.f15021o;
        if (i10 == 6 || i10 == 7) {
            return v();
        }
        return null;
    }

    public byte[] v() {
        throw new UnsupportedOperationException("Method not decompiled: j1.a.v():byte[]");
    }

    public final void w(b bVar) {
        if (f15001v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.y0(ByteOrder.LITTLE_ENDIAN);
        bVar.z0(L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.z0(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(N, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f15022p = i10;
                            R(bArr3, 0);
                            e0(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + j1.b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.z0(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void y(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m10 = dVar.m(this.f15014h);
            int m11 = dVar2.m(this.f15014h);
            if (this.f15010d == 7) {
                m10 += this.f15023q;
            }
            if (m10 > 0 && m11 > 0) {
                this.f15015i = true;
                if (this.f15007a == null && this.f15009c == null && this.f15008b == null) {
                    byte[] bArr = new byte[m11];
                    bVar.skip(m10);
                    bVar.read(bArr);
                    this.f15020n = bArr;
                }
                this.f15018l = m10;
                this.f15019m = m11;
            }
            if (f15001v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + m11);
            }
        }
    }

    public final void z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] d10 = j1.b.d(dVar.o(this.f15014h));
            long[] d11 = j1.b.d(dVar2.o(this.f15014h));
            if (d10 == null || d10.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (d11 == null || d11.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (d10.length != d11.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j10 = 0;
                for (long j11 : d11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                int i11 = 1;
                this.f15017k = true;
                this.f15016j = true;
                this.f15015i = true;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i12 < d10.length) {
                    int i15 = (int) d10[i12];
                    int i16 = (int) d11[i12];
                    if (i12 < d10.length - i11 && i15 + i16 != d10[i12 + 1]) {
                        this.f15017k = false;
                    }
                    int i17 = i15 - i13;
                    if (i17 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = i17;
                    if (bVar.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                        return;
                    }
                    int i18 = i13 + i17;
                    byte[] bArr2 = new byte[i16];
                    if (bVar.read(bArr2) != i16) {
                        Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                        return;
                    }
                    i13 = i18 + i16;
                    System.arraycopy(bArr2, 0, bArr, i14, i16);
                    i14 += i16;
                    i12++;
                    i11 = 1;
                }
                this.f15020n = bArr;
                if (this.f15017k) {
                    this.f15018l = (int) d10[0];
                    this.f15019m = i10;
                }
            }
        }
    }

    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f15031a.mark(Integer.MAX_VALUE);
        }

        public void A0(long j10) {
            int i10 = this.f15033c;
            if (i10 > j10) {
                this.f15033c = 0;
                this.f15031a.reset();
            } else {
                j10 -= i10;
            }
            z0((int) j10);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f15031a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class e {
        public final int f15040a;
        public final String f15041b;
        public final int f15042c;
        public final int f15043d;

        public e(String str, int i10, int i11) {
            this.f15041b = str;
            this.f15040a = i10;
            this.f15042c = i11;
            this.f15043d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f15042c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f15043d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public e(String str, int i10, int i11, int i12) {
            this.f15041b = str;
            this.f15040a = i10;
            this.f15042c = i11;
            this.f15043d = i12;
        }
    }

    public a(String str) {
        e[][] eVarArr = f14989j0;
        this.f15012f = new HashMap[eVarArr.length];
        this.f15013g = new HashSet(eVarArr.length);
        this.f15014h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        A(str);
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f14989j0;
        this.f15012f = new HashMap[eVarArr.length];
        this.f15013g = new HashSet(eVarArr.length);
        this.f15014h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f15007a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f14996q0.length);
            if (!B(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f15011e = true;
            this.f15009c = null;
            this.f15008b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f15009c = (AssetManager.AssetInputStream) inputStream;
            this.f15008b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (I(fileInputStream.getFD())) {
                    this.f15009c = null;
                    this.f15008b = fileInputStream.getFD();
                }
            }
            this.f15009c = null;
            this.f15008b = null;
        }
        N(inputStream);
    }
}
