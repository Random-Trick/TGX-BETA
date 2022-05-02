package p129j1;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
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
import p126j$.util.DesugarTimeZone;
import p129j1.C5836b;

public class C5828a {
    public static SimpleDateFormat f18626U;
    public static SimpleDateFormat f18627V;
    public static final C5833e[] f18631Z;
    public static final C5833e[] f18632a0;
    public static final C5833e[] f18633b0;
    public static final C5833e[] f18634c0;
    public static final C5833e[] f18635d0;
    public static final C5833e[] f18637f0;
    public static final C5833e[] f18638g0;
    public static final C5833e[] f18639h0;
    public static final C5833e[] f18640i0;
    public static final C5833e[][] f18641j0;
    public static final HashMap<Integer, C5833e>[] f18643l0;
    public static final HashMap<String, C5833e>[] f18644m0;
    public static final Charset f18647p0;
    public static final byte[] f18648q0;
    public static final byte[] f18649r0;
    public static final Pattern f18650s0;
    public static final Pattern f18651t0;
    public static final Pattern f18652u0;
    public static final Pattern f18654v0;
    public String f18659a;
    public FileDescriptor f18660b;
    public AssetManager.AssetInputStream f18661c;
    public int f18662d;
    public boolean f18663e;
    public final HashMap<String, C5832d>[] f18664f;
    public Set<Integer> f18665g;
    public ByteOrder f18666h;
    public boolean f18667i;
    public boolean f18668j;
    public boolean f18669k;
    public int f18670l;
    public int f18671m;
    public byte[] f18672n;
    public int f18673o;
    public int f18674p;
    public int f18675q;
    public int f18676r;
    public int f18677s;
    public boolean f18678t;
    public boolean f18679u;
    public static final boolean f18653v = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> f18655w = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> f18656x = Arrays.asList(2, 7, 4, 5);
    public static final int[] f18657y = {8, 8, 8};
    public static final int[] f18658z = {4};
    public static final int[] f18606A = {8};
    public static final byte[] f18607B = {-1, -40, -1};
    public static final byte[] f18608C = {102, 116, 121, 112};
    public static final byte[] f18609D = {109, 105, 102, 49};
    public static final byte[] f18610E = {104, 101, 105, 99};
    public static final byte[] f18611F = {79, 76, 89, 77, 80, 0};
    public static final byte[] f18612G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] f18613H = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] f18614I = {101, 88, 73, 102};
    public static final byte[] f18615J = {73, 72, 68, 82};
    public static final byte[] f18616K = {73, 69, 78, 68};
    public static final byte[] f18617L = {82, 73, 70, 70};
    public static final byte[] f18618M = {87, 69, 66, 80};
    public static final byte[] f18619N = {69, 88, 73, 70};
    public static final byte[] f18620O = {-99, 1, 42};
    public static final byte[] f18621P = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] f18622Q = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] f18623R = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] f18624S = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] f18625T = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] f18628W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f18629X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] f18630Y = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final C5833e f18636e0 = new C5833e("StripOffsets", 273, 3);
    public static final C5833e[] f18642k0 = {new C5833e("SubIFDPointer", 330, 4), new C5833e("ExifIFDPointer", 34665, 4), new C5833e("GPSInfoIFDPointer", 34853, 4), new C5833e("InteroperabilityIFDPointer", 40965, 4), new C5833e("CameraSettingsIFDPointer", 8224, 1), new C5833e("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashSet<String> f18645n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    public static final HashMap<Integer, Integer> f18646o0 = new HashMap<>();

    public class C5829a extends MediaDataSource {
        public long f18680a;
        public final C5835g f18681b;

        public C5829a(C5835g gVar) {
            this.f18681b = gVar;
        }

        @Override
        public void close() {
        }

        @Override
        public long getSize() {
            return -1L;
        }

        @Override
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f18680a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.f18681b.available()) {
                        return -1;
                    }
                    this.f18681b.m21971A0(j);
                    this.f18680a = j;
                }
                if (i2 > this.f18681b.available()) {
                    i2 = this.f18681b.available();
                }
                int read = this.f18681b.read(bArr, i, i2);
                if (read >= 0) {
                    this.f18680a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f18680a = -1L;
            return -1;
        }
    }

    public static class C5830b extends InputStream implements DataInput {
        public static final ByteOrder f18683N = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder f18684O = ByteOrder.BIG_ENDIAN;
        public byte[] f18685M;
        public final DataInputStream f18686a;
        public ByteOrder f18687b;
        public int f18688c;

        public C5830b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override
        public int available() {
            return this.f18686a.available();
        }

        public int m21999m() {
            return this.f18688c;
        }

        @Override
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override
        public int read() {
            this.f18688c++;
            return this.f18686a.read();
        }

        @Override
        public boolean readBoolean() {
            this.f18688c++;
            return this.f18686a.readBoolean();
        }

        @Override
        public byte readByte() {
            this.f18688c++;
            int read = this.f18686a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override
        public char readChar() {
            this.f18688c += 2;
            return this.f18686a.readChar();
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
        public void readFully(byte[] bArr, int i, int i2) {
            this.f18688c += i2;
            this.f18686a.readFully(bArr, i, i2);
        }

        @Override
        public int readInt() {
            this.f18688c += 4;
            int read = this.f18686a.read();
            int read2 = this.f18686a.read();
            int read3 = this.f18686a.read();
            int read4 = this.f18686a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f18687b;
                if (byteOrder == f18683N) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f18684O) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f18687b);
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
            this.f18688c += 8;
            int read = this.f18686a.read();
            int read2 = this.f18686a.read();
            int read3 = this.f18686a.read();
            int read4 = this.f18686a.read();
            int read5 = this.f18686a.read();
            int read6 = this.f18686a.read();
            int read7 = this.f18686a.read();
            int read8 = this.f18686a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f18687b;
                if (byteOrder == f18683N) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f18684O) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f18687b);
            }
            throw new EOFException();
        }

        @Override
        public short readShort() {
            this.f18688c += 2;
            int read = this.f18686a.read();
            int read2 = this.f18686a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f18687b;
                if (byteOrder == f18683N) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f18684O) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f18687b);
            }
            throw new EOFException();
        }

        @Override
        public String readUTF() {
            this.f18688c += 2;
            return this.f18686a.readUTF();
        }

        @Override
        public int readUnsignedByte() {
            this.f18688c++;
            return this.f18686a.readUnsignedByte();
        }

        @Override
        public int readUnsignedShort() {
            this.f18688c += 2;
            int read = this.f18686a.read();
            int read2 = this.f18686a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f18687b;
                if (byteOrder == f18683N) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f18684O) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f18687b);
            }
            throw new EOFException();
        }

        @Override
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override
        public int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public long m21998t() {
            return readInt() & 4294967295L;
        }

        public void m21997y0(ByteOrder byteOrder) {
            this.f18687b = byteOrder;
        }

        public void m21996z0(int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f18686a.skip(i3);
                if (skip <= 0) {
                    if (this.f18685M == null) {
                        this.f18685M = new byte[org.thunderdog.challegram.Log.TAG_LUX];
                    }
                    skip = this.f18686a.read(this.f18685M, 0, Math.min((int) org.thunderdog.challegram.Log.TAG_LUX, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.f18688c += i2;
        }

        public C5830b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C5830b(InputStream inputStream, ByteOrder byteOrder) {
            this.f18687b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f18686a = dataInputStream;
            dataInputStream.mark(0);
            this.f18688c = 0;
            this.f18687b = byteOrder;
        }

        @Override
        public int read(byte[] bArr, int i, int i2) {
            int read = this.f18686a.read(bArr, i, i2);
            this.f18688c += read;
            return read;
        }

        @Override
        public void readFully(byte[] bArr) {
            this.f18688c += bArr.length;
            this.f18686a.readFully(bArr);
        }
    }

    public static class C5831c extends FilterOutputStream {
        public final OutputStream f18689a;
        public ByteOrder f18690b;

        public C5831c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f18689a = outputStream;
            this.f18690b = byteOrder;
        }

        public void m21995A0(long j) {
            m21991y0((int) j);
        }

        public void m21994B0(int i) {
            m21990z0((short) i);
        }

        public void m21993m(ByteOrder byteOrder) {
            this.f18690b = byteOrder;
        }

        public void m21992t(int i) {
            this.f18689a.write(i);
        }

        @Override
        public void write(byte[] bArr) {
            this.f18689a.write(bArr);
        }

        public void m21991y0(int i) {
            ByteOrder byteOrder = this.f18690b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f18689a.write((i >>> 0) & 255);
                this.f18689a.write((i >>> 8) & 255);
                this.f18689a.write((i >>> 16) & 255);
                this.f18689a.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f18689a.write((i >>> 24) & 255);
                this.f18689a.write((i >>> 16) & 255);
                this.f18689a.write((i >>> 8) & 255);
                this.f18689a.write((i >>> 0) & 255);
            }
        }

        public void m21990z0(short s) {
            ByteOrder byteOrder = this.f18690b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f18689a.write((s >>> 0) & 255);
                this.f18689a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f18689a.write((s >>> 8) & 255);
                this.f18689a.write((s >>> 0) & 255);
            }
        }

        @Override
        public void write(byte[] bArr, int i, int i2) {
            this.f18689a.write(bArr, i, i2);
        }
    }

    public static class C5832d {
        public final int f18691a;
        public final int f18692b;
        public final long f18693c;
        public final byte[] f18694d;

        public C5832d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static C5832d m21989a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C5832d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C5828a.f18647p0);
            return new C5832d(1, bytes.length, bytes);
        }

        public static C5832d m21988b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5828a.f18629X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new C5832d(12, dArr.length, wrap.array());
        }

        public static C5832d m21987c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5828a.f18629X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new C5832d(9, iArr.length, wrap.array());
        }

        public static C5832d m21986d(C5834f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5828a.f18629X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (C5834f fVar : fVarArr) {
                wrap.putInt((int) fVar.f18699a);
                wrap.putInt((int) fVar.f18700b);
            }
            return new C5832d(10, fVarArr.length, wrap.array());
        }

        public static C5832d m21985e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C5828a.f18647p0);
            return new C5832d(2, bytes.length, bytes);
        }

        public static C5832d m21984f(long j, ByteOrder byteOrder) {
            return m21983g(new long[]{j}, byteOrder);
        }

        public static C5832d m21983g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5828a.f18629X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C5832d(4, jArr.length, wrap.array());
        }

        public static C5832d m21982h(C5834f fVar, ByteOrder byteOrder) {
            return m21981i(new C5834f[]{fVar}, byteOrder);
        }

        public static C5832d m21981i(C5834f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5828a.f18629X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (C5834f fVar : fVarArr) {
                wrap.putInt((int) fVar.f18699a);
                wrap.putInt((int) fVar.f18700b);
            }
            return new C5832d(5, fVarArr.length, wrap.array());
        }

        public static C5832d m21980j(int i, ByteOrder byteOrder) {
            return m21979k(new int[]{i}, byteOrder);
        }

        public static C5832d m21979k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5828a.f18629X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C5832d(3, iArr.length, wrap.array());
        }

        public double m21978l(ByteOrder byteOrder) {
            Object o = m21975o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o instanceof String) {
                return Double.parseDouble((String) o);
            } else {
                if (o instanceof long[]) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof double[]) {
                    double[] dArr = (double[]) o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof C5834f[]) {
                    C5834f[] fVarArr = (C5834f[]) o;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].m21972a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int m21977m(ByteOrder byteOrder) {
            Object o = m21975o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o instanceof String) {
                return Integer.parseInt((String) o);
            } else {
                if (o instanceof long[]) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String m21976n(ByteOrder byteOrder) {
            Object o = m21975o(byteOrder);
            if (o == null) {
                return null;
            }
            if (o instanceof String) {
                return (String) o;
            }
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            if (o instanceof long[]) {
                long[] jArr = (long[]) o;
                while (i < jArr.length) {
                    sb2.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                while (i < iArr.length) {
                    sb2.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o instanceof double[]) {
                double[] dArr = (double[]) o;
                while (i < dArr.length) {
                    sb2.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(o instanceof C5834f[])) {
                return null;
            } else {
                C5834f[] fVarArr = (C5834f[]) o;
                while (i < fVarArr.length) {
                    sb2.append(fVarArr[i].f18699a);
                    sb2.append('/');
                    sb2.append(fVarArr[i].f18700b);
                    i++;
                    if (i != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        public java.lang.Object m21975o(java.nio.ByteOrder r11) {
            throw new UnsupportedOperationException("Method not decompiled: p129j1.C5828a.C5832d.m21975o(java.nio.ByteOrder):java.lang.Object");
        }

        public int m21974p() {
            return C5828a.f18629X[this.f18691a] * this.f18692b;
        }

        public String toString() {
            return "(" + C5828a.f18628W[this.f18691a] + ", data length:" + this.f18694d.length + ")";
        }

        public C5832d(int i, int i2, long j, byte[] bArr) {
            this.f18691a = i;
            this.f18692b = i2;
            this.f18693c = j;
            this.f18694d = bArr;
        }
    }

    public static class C5834f {
        public final long f18699a;
        public final long f18700b;

        public C5834f(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        public double m21972a() {
            return this.f18699a / this.f18700b;
        }

        public String toString() {
            return this.f18699a + "/" + this.f18700b;
        }

        public C5834f(long j, long j2) {
            if (j2 == 0) {
                this.f18699a = 0L;
                this.f18700b = 1L;
                return;
            }
            this.f18699a = j;
            this.f18700b = j2;
        }
    }

    static {
        C5833e[] eVarArr;
        C5833e[] eVarArr2 = {new C5833e("NewSubfileType", 254, 4), new C5833e("SubfileType", 255, 4), new C5833e("ImageWidth", org.thunderdog.challegram.Log.TAG_CRASH, 3, 4), new C5833e("ImageLength", 257, 3, 4), new C5833e("BitsPerSample", 258, 3), new C5833e("Compression", 259, 3), new C5833e("PhotometricInterpretation", 262, 3), new C5833e("ImageDescription", 270, 2), new C5833e("Make", 271, 2), new C5833e("Model", 272, 2), new C5833e("StripOffsets", 273, 3, 4), new C5833e("Orientation", 274, 3), new C5833e("SamplesPerPixel", 277, 3), new C5833e("RowsPerStrip", 278, 3, 4), new C5833e("StripByteCounts", 279, 3, 4), new C5833e("XResolution", 282, 5), new C5833e("YResolution", 283, 5), new C5833e("PlanarConfiguration", 284, 3), new C5833e("ResolutionUnit", 296, 3), new C5833e("TransferFunction", 301, 3), new C5833e("Software", 305, 2), new C5833e("DateTime", 306, 2), new C5833e("Artist", 315, 2), new C5833e("WhitePoint", 318, 5), new C5833e("PrimaryChromaticities", 319, 5), new C5833e("SubIFDPointer", 330, 4), new C5833e("JPEGInterchangeFormat", 513, 4), new C5833e("JPEGInterchangeFormatLength", 514, 4), new C5833e("YCbCrCoefficients", 529, 5), new C5833e("YCbCrSubSampling", 530, 3), new C5833e("YCbCrPositioning", 531, 3), new C5833e("ReferenceBlackWhite", 532, 5), new C5833e("Copyright", 33432, 2), new C5833e("ExifIFDPointer", 34665, 4), new C5833e("GPSInfoIFDPointer", 34853, 4), new C5833e("SensorTopBorder", 4, 4), new C5833e("SensorLeftBorder", 5, 4), new C5833e("SensorBottomBorder", 6, 4), new C5833e("SensorRightBorder", 7, 4), new C5833e("ISO", 23, 3), new C5833e("JpgFromRaw", 46, 7), new C5833e("Xmp", 700, 1)};
        f18631Z = eVarArr2;
        C5833e[] eVarArr3 = {new C5833e("ExposureTime", 33434, 5), new C5833e("FNumber", 33437, 5), new C5833e("ExposureProgram", 34850, 3), new C5833e("SpectralSensitivity", 34852, 2), new C5833e("PhotographicSensitivity", 34855, 3), new C5833e("OECF", 34856, 7), new C5833e("SensitivityType", 34864, 3), new C5833e("StandardOutputSensitivity", 34865, 4), new C5833e("RecommendedExposureIndex", 34866, 4), new C5833e("ISOSpeed", 34867, 4), new C5833e("ISOSpeedLatitudeyyy", 34868, 4), new C5833e("ISOSpeedLatitudezzz", 34869, 4), new C5833e("ExifVersion", 36864, 2), new C5833e("DateTimeOriginal", 36867, 2), new C5833e("DateTimeDigitized", 36868, 2), new C5833e("OffsetTime", 36880, 2), new C5833e("OffsetTimeOriginal", 36881, 2), new C5833e("OffsetTimeDigitized", 36882, 2), new C5833e("ComponentsConfiguration", 37121, 7), new C5833e("CompressedBitsPerPixel", 37122, 5), new C5833e("ShutterSpeedValue", 37377, 10), new C5833e("ApertureValue", 37378, 5), new C5833e("BrightnessValue", 37379, 10), new C5833e("ExposureBiasValue", 37380, 10), new C5833e("MaxApertureValue", 37381, 5), new C5833e("SubjectDistance", 37382, 5), new C5833e("MeteringMode", 37383, 3), new C5833e("LightSource", 37384, 3), new C5833e("Flash", 37385, 3), new C5833e("FocalLength", 37386, 5), new C5833e("SubjectArea", 37396, 3), new C5833e("MakerNote", 37500, 7), new C5833e("UserComment", 37510, 7), new C5833e("SubSecTime", 37520, 2), new C5833e("SubSecTimeOriginal", 37521, 2), new C5833e("SubSecTimeDigitized", 37522, 2), new C5833e("FlashpixVersion", 40960, 7), new C5833e("ColorSpace", 40961, 3), new C5833e("PixelXDimension", 40962, 3, 4), new C5833e("PixelYDimension", 40963, 3, 4), new C5833e("RelatedSoundFile", 40964, 2), new C5833e("InteroperabilityIFDPointer", 40965, 4), new C5833e("FlashEnergy", 41483, 5), new C5833e("SpatialFrequencyResponse", 41484, 7), new C5833e("FocalPlaneXResolution", 41486, 5), new C5833e("FocalPlaneYResolution", 41487, 5), new C5833e("FocalPlaneResolutionUnit", 41488, 3), new C5833e("SubjectLocation", 41492, 3), new C5833e("ExposureIndex", 41493, 5), new C5833e("SensingMethod", 41495, 3), new C5833e("FileSource", 41728, 7), new C5833e("SceneType", 41729, 7), new C5833e("CFAPattern", 41730, 7), new C5833e("CustomRendered", 41985, 3), new C5833e("ExposureMode", 41986, 3), new C5833e("WhiteBalance", 41987, 3), new C5833e("DigitalZoomRatio", 41988, 5), new C5833e("FocalLengthIn35mmFilm", 41989, 3), new C5833e("SceneCaptureType", 41990, 3), new C5833e("GainControl", 41991, 3), new C5833e("Contrast", 41992, 3), new C5833e("Saturation", 41993, 3), new C5833e("Sharpness", 41994, 3), new C5833e("DeviceSettingDescription", 41995, 7), new C5833e("SubjectDistanceRange", 41996, 3), new C5833e("ImageUniqueID", 42016, 2), new C5833e("CameraOwnerName", 42032, 2), new C5833e("BodySerialNumber", 42033, 2), new C5833e("LensSpecification", 42034, 5), new C5833e("LensMake", 42035, 2), new C5833e("LensModel", 42036, 2), new C5833e("Gamma", 42240, 5), new C5833e("DNGVersion", 50706, 1), new C5833e("DefaultCropSize", 50720, 3, 4)};
        f18632a0 = eVarArr3;
        C5833e[] eVarArr4 = {new C5833e("GPSVersionID", 0, 1), new C5833e("GPSLatitudeRef", 1, 2), new C5833e("GPSLatitude", 2, 5, 10), new C5833e("GPSLongitudeRef", 3, 2), new C5833e("GPSLongitude", 4, 5, 10), new C5833e("GPSAltitudeRef", 5, 1), new C5833e("GPSAltitude", 6, 5), new C5833e("GPSTimeStamp", 7, 5), new C5833e("GPSSatellites", 8, 2), new C5833e("GPSStatus", 9, 2), new C5833e("GPSMeasureMode", 10, 2), new C5833e("GPSDOP", 11, 5), new C5833e("GPSSpeedRef", 12, 2), new C5833e("GPSSpeed", 13, 5), new C5833e("GPSTrackRef", 14, 2), new C5833e("GPSTrack", 15, 5), new C5833e("GPSImgDirectionRef", 16, 2), new C5833e("GPSImgDirection", 17, 5), new C5833e("GPSMapDatum", 18, 2), new C5833e("GPSDestLatitudeRef", 19, 2), new C5833e("GPSDestLatitude", 20, 5), new C5833e("GPSDestLongitudeRef", 21, 2), new C5833e("GPSDestLongitude", 22, 5), new C5833e("GPSDestBearingRef", 23, 2), new C5833e("GPSDestBearing", 24, 5), new C5833e("GPSDestDistanceRef", 25, 2), new C5833e("GPSDestDistance", 26, 5), new C5833e("GPSProcessingMethod", 27, 7), new C5833e("GPSAreaInformation", 28, 7), new C5833e("GPSDateStamp", 29, 2), new C5833e("GPSDifferential", 30, 3), new C5833e("GPSHPositioningError", 31, 5)};
        f18633b0 = eVarArr4;
        C5833e[] eVarArr5 = {new C5833e("InteroperabilityIndex", 1, 2)};
        f18634c0 = eVarArr5;
        C5833e[] eVarArr6 = {new C5833e("NewSubfileType", 254, 4), new C5833e("SubfileType", 255, 4), new C5833e("ThumbnailImageWidth", org.thunderdog.challegram.Log.TAG_CRASH, 3, 4), new C5833e("ThumbnailImageLength", 257, 3, 4), new C5833e("BitsPerSample", 258, 3), new C5833e("Compression", 259, 3), new C5833e("PhotometricInterpretation", 262, 3), new C5833e("ImageDescription", 270, 2), new C5833e("Make", 271, 2), new C5833e("Model", 272, 2), new C5833e("StripOffsets", 273, 3, 4), new C5833e("ThumbnailOrientation", 274, 3), new C5833e("SamplesPerPixel", 277, 3), new C5833e("RowsPerStrip", 278, 3, 4), new C5833e("StripByteCounts", 279, 3, 4), new C5833e("XResolution", 282, 5), new C5833e("YResolution", 283, 5), new C5833e("PlanarConfiguration", 284, 3), new C5833e("ResolutionUnit", 296, 3), new C5833e("TransferFunction", 301, 3), new C5833e("Software", 305, 2), new C5833e("DateTime", 306, 2), new C5833e("Artist", 315, 2), new C5833e("WhitePoint", 318, 5), new C5833e("PrimaryChromaticities", 319, 5), new C5833e("SubIFDPointer", 330, 4), new C5833e("JPEGInterchangeFormat", 513, 4), new C5833e("JPEGInterchangeFormatLength", 514, 4), new C5833e("YCbCrCoefficients", 529, 5), new C5833e("YCbCrSubSampling", 530, 3), new C5833e("YCbCrPositioning", 531, 3), new C5833e("ReferenceBlackWhite", 532, 5), new C5833e("Xmp", 700, 1), new C5833e("Copyright", 33432, 2), new C5833e("ExifIFDPointer", 34665, 4), new C5833e("GPSInfoIFDPointer", 34853, 4), new C5833e("DNGVersion", 50706, 1), new C5833e("DefaultCropSize", 50720, 3, 4)};
        f18635d0 = eVarArr6;
        C5833e[] eVarArr7 = {new C5833e("ThumbnailImage", org.thunderdog.challegram.Log.TAG_CRASH, 7), new C5833e("CameraSettingsIFDPointer", 8224, 4), new C5833e("ImageProcessingIFDPointer", 8256, 4)};
        f18637f0 = eVarArr7;
        C5833e[] eVarArr8 = {new C5833e("PreviewImageStart", 257, 4), new C5833e("PreviewImageLength", 258, 4)};
        f18638g0 = eVarArr8;
        C5833e[] eVarArr9 = {new C5833e("AspectFrame", 4371, 3)};
        f18639h0 = eVarArr9;
        C5833e[] eVarArr10 = {new C5833e("ColorSpace", 55, 3)};
        f18640i0 = eVarArr10;
        C5833e[][] eVarArr11 = {eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr6, eVarArr2, eVarArr7, eVarArr8, eVarArr9, eVarArr10};
        f18641j0 = eVarArr11;
        f18643l0 = new HashMap[eVarArr11.length];
        f18644m0 = new HashMap[eVarArr11.length];
        Charset forName = Charset.forName("US-ASCII");
        f18647p0 = forName;
        f18648q0 = "Exif\u0000\u0000".getBytes(forName);
        f18649r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f18626U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f18627V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C5833e[][] eVarArr12 = f18641j0;
            if (i < eVarArr12.length) {
                f18643l0[i] = new HashMap<>();
                f18644m0[i] = new HashMap<>();
                for (C5833e eVar : eVarArr12[i]) {
                    f18643l0[i].put(Integer.valueOf(eVar.f18695a), eVar);
                    f18644m0[i].put(eVar.f18696b, eVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f18646o0;
                C5833e[] eVarArr13 = f18642k0;
                hashMap.put(Integer.valueOf(eVarArr13[0].f18695a), 5);
                hashMap.put(Integer.valueOf(eVarArr13[1].f18695a), 1);
                hashMap.put(Integer.valueOf(eVarArr13[2].f18695a), 2);
                hashMap.put(Integer.valueOf(eVarArr13[3].f18695a), 3);
                hashMap.put(Integer.valueOf(eVarArr13[4].f18695a), 7);
                hashMap.put(Integer.valueOf(eVarArr13[5].f18695a), 8);
                f18650s0 = Pattern.compile(".*[1-9].*");
                f18651t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f18652u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f18654v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C5828a(File file) {
        C5833e[][] eVarArr = f18641j0;
        this.f18664f = new HashMap[eVarArr.length];
        this.f18665g = new HashSet(eVarArr.length);
        this.f18666h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(file, "file cannot be null");
        m22061A(file.getAbsolutePath());
    }

    public static boolean m22060B(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f18648q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f18648q0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean m22058D(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f18607B;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean m22053I(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                C5836b.C5837a.m21961c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f18653v) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    public static boolean m22051K(int i) {
        return i == 4 || i == 13 || i == 14 || i == 3 || i == 0;
    }

    public static double m22031c(String str, String str2) {
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

    public static boolean m22024f0(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    public static Pair<Integer, Integer> m22002x(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> x = m22002x(split[0]);
            if (((Integer) x.first).intValue() == 2) {
                return x;
            }
            for (int i = 1; i < split.length; i++) {
                Pair<Integer, Integer> x2 = m22002x(split[i]);
                int intValue = (((Integer) x2.first).equals(x.first) || ((Integer) x2.second).equals(x.first)) ? ((Integer) x.first).intValue() : -1;
                int intValue2 = (((Integer) x.second).intValue() == -1 || (!((Integer) x2.first).equals(x.second) && !((Integer) x2.second).equals(x.second))) ? -1 : ((Integer) x.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    x = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    x = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return x;
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

    public final void m22061A(String str) {
        Throwable th;
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.f18661c = null;
        this.f18659a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (m22053I(fileInputStream2.getFD())) {
                    this.f18660b = fileInputStream2.getFD();
                } else {
                    this.f18660b = null;
                }
                m22048N(fileInputStream2);
                C5836b.m21968c(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C5836b.m21968c(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean m22059C(byte[] bArr) {
        Throwable th;
        Exception e;
        C5830b bVar;
        long readInt;
        byte[] bArr2;
        C5830b bVar2 = null;
        try {
            try {
                bVar = new C5830b(bArr);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e3) {
            e = e3;
            bVar2 = bVar;
            if (f18653v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
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
        if (!Arrays.equals(bArr2, f18608C)) {
            bVar.close();
            return false;
        }
        long j = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, f18609D)) {
                    z = true;
                } else if (Arrays.equals(bArr3, f18610E)) {
                    z2 = true;
                }
                if (z && z2) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    public final boolean m22057E(byte[] bArr) {
        Throwable th;
        boolean z = false;
        C5830b bVar = null;
        try {
            C5830b bVar2 = new C5830b(bArr);
            try {
                ByteOrder Q = m22045Q(bVar2);
                this.f18666h = Q;
                bVar2.m21997y0(Q);
                short readShort = bVar2.readShort();
                if (readShort == 20306 || readShort == 21330) {
                    z = true;
                }
                bVar2.close();
                return z;
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

    public final boolean m22056F(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f18613H;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public final boolean m22055G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean m22054H(byte[] bArr) {
        Throwable th;
        boolean z = false;
        C5830b bVar = null;
        try {
            C5830b bVar2 = new C5830b(bArr);
            try {
                ByteOrder Q = m22045Q(bVar2);
                this.f18666h = Q;
                bVar2.m21997y0(Q);
                if (bVar2.readShort() == 85) {
                    z = true;
                }
                bVar2.close();
                return z;
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

    public final boolean m22052J(HashMap hashMap) {
        C5832d dVar;
        int m;
        C5832d dVar2 = (C5832d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.m21975o(this.f18666h);
            int[] iArr2 = f18657y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f18662d == 3 && (dVar = (C5832d) hashMap.get("PhotometricInterpretation")) != null && (((m = dVar.m21977m(this.f18666h)) == 1 && Arrays.equals(iArr, f18606A)) || (m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f18653v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean m22050L(HashMap hashMap) {
        C5832d dVar = (C5832d) hashMap.get("ImageLength");
        C5832d dVar2 = (C5832d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m21977m(this.f18666h) <= 512 && dVar2.m21977m(this.f18666h) <= 512;
    }

    public final boolean m22049M(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f18617L;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f18618M;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f18617L.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    public final void m22048N(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i = 0; i < f18641j0.length; i++) {
            try {
                try {
                    this.f18664f[i] = new HashMap<>();
                } finally {
                    m22035a();
                    if (f18653v) {
                        m22046P();
                    }
                }
            } catch (IOException | UnsupportedOperationException e) {
                boolean z = f18653v;
                if (z) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m22035a();
                if (!z) {
                    return;
                }
            }
        }
        if (!this.f18663e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f18662d = m22012n(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m22024f0(this.f18662d)) {
            C5835g gVar = new C5835g(inputStream);
            if (this.f18663e) {
                m22006t(gVar);
            } else {
                int i2 = this.f18662d;
                if (i2 == 12) {
                    m22015k(gVar);
                } else if (i2 == 7) {
                    m22011o(gVar);
                } else if (i2 == 10) {
                    m22007s(gVar);
                } else {
                    m22008r(gVar);
                }
            }
            gVar.m21971A0(this.f18674p);
            m22026e0(gVar);
        } else {
            C5830b bVar = new C5830b(inputStream);
            int i3 = this.f18662d;
            if (i3 == 4) {
                m22014l(bVar, 0, 0);
            } else if (i3 == 13) {
                m22010p(bVar);
            } else if (i3 == 9) {
                m22009q(bVar);
            } else if (i3 == 14) {
                m22003w(bVar);
            }
        }
    }

    public final void m22047O(C5830b bVar) {
        ByteOrder Q = m22045Q(bVar);
        this.f18666h = Q;
        bVar.m21997y0(Q);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.f18662d;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    bVar.m21996z0(i2);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void m22046P() {
        for (int i = 0; i < this.f18664f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f18664f[i].size());
            for (Map.Entry<String, C5832d> entry : this.f18664f[i].entrySet()) {
                C5832d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m21976n(this.f18666h) + "'");
            }
        }
    }

    public final ByteOrder m22045Q(C5830b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f18653v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f18653v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void m22044R(byte[] bArr, int i) {
        C5835g gVar = new C5835g(bArr);
        m22047O(gVar);
        m22043S(gVar, i);
    }

    public final void m22043S(p129j1.C5828a.C5835g r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5828a.m22043S(j1.a$g, int):void");
    }

    public final void m22042T(String str) {
        for (int i = 0; i < f18641j0.length; i++) {
            this.f18664f[i].remove(str);
        }
    }

    public final void m22041U(int i, String str, String str2) {
        if (!this.f18664f[i].isEmpty() && this.f18664f[i].get(str) != null) {
            HashMap<String, C5832d>[] hashMapArr = this.f18664f;
            hashMapArr[i].put(str2, hashMapArr[i].get(str));
            this.f18664f[i].remove(str);
        }
    }

    public final void m22040V(C5835g gVar, int i) {
        C5832d dVar = this.f18664f[i].get("ImageLength");
        C5832d dVar2 = this.f18664f[i].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            C5832d dVar3 = this.f18664f[i].get("JPEGInterchangeFormat");
            C5832d dVar4 = this.f18664f[i].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m = dVar3.m21977m(this.f18666h);
                int m2 = dVar3.m21977m(this.f18666h);
                gVar.m21971A0(m);
                byte[] bArr = new byte[m2];
                gVar.read(bArr);
                m22014l(new C5830b(bArr), m, i);
            }
        }
    }

    public void m22039W() {
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5828a.m22039W():void");
    }

    public final void m22038X(InputStream inputStream, OutputStream outputStream) {
        if (f18653v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C5830b bVar = new C5830b(inputStream);
        C5831c cVar = new C5831c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.m21992t(-1);
            if (bVar.readByte() == -40) {
                cVar.m21992t(-40);
                C5832d dVar = null;
                if (m22023g("Xmp") != null && this.f18679u) {
                    dVar = this.f18664f[0].remove("Xmp");
                }
                cVar.m21992t(-1);
                cVar.m21992t(-31);
                m22016j0(cVar);
                if (dVar != null) {
                    this.f18664f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[org.thunderdog.challegram.Log.TAG_EMOJI];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.m21992t(-1);
                        cVar.m21992t(readByte);
                        C5836b.m21966e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.m21992t(-1);
                        cVar.m21992t(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.m21994B0(readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i, (int) org.thunderdog.challegram.Log.TAG_EMOJI));
                                if (read >= 0) {
                                    cVar.write(bArr, 0, read);
                                    i -= read;
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
                                } else if (Arrays.equals(bArr2, f18648q0)) {
                                    bVar.m21996z0(readUnsignedShort2 - 6);
                                }
                            }
                            cVar.m21992t(-1);
                            cVar.m21992t(readByte);
                            cVar.m21994B0(readUnsignedShort2 + 2);
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

    public final void m22037Y(InputStream inputStream, OutputStream outputStream) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        if (f18653v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C5830b bVar = new C5830b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C5831c cVar = new C5831c(outputStream, byteOrder);
        byte[] bArr = f18613H;
        C5836b.m21965f(bVar, cVar, bArr.length);
        int i = this.f18674p;
        if (i == 0) {
            int readInt = bVar.readInt();
            cVar.m21991y0(readInt);
            C5836b.m21965f(bVar, cVar, readInt + 4 + 4);
        } else {
            C5836b.m21965f(bVar, cVar, ((i - bArr.length) - 4) - 4);
            bVar.m21996z0(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            C5831c cVar2 = new C5831c(byteArrayOutputStream, byteOrder);
            m22016j0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f18689a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.m21991y0((int) crc32.getValue());
            C5836b.m21968c(byteArrayOutputStream);
            C5836b.m21966e(bVar, cVar);
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C5836b.m21968c(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void m22036Z(java.io.InputStream r21, java.io.OutputStream r22) {
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5828a.m22036Z(java.io.InputStream, java.io.OutputStream):void");
    }

    public final void m22035a() {
        String g = m22023g("DateTimeOriginal");
        if (g != null && m22023g("DateTime") == null) {
            this.f18664f[0].put("DateTime", C5832d.m21985e(g));
        }
        if (m22023g("ImageWidth") == null) {
            this.f18664f[0].put("ImageWidth", C5832d.m21984f(0L, this.f18666h));
        }
        if (m22023g("ImageLength") == null) {
            this.f18664f[0].put("ImageLength", C5832d.m21984f(0L, this.f18666h));
        }
        if (m22023g("Orientation") == null) {
            this.f18664f[0].put("Orientation", C5832d.m21984f(0L, this.f18666h));
        }
        if (m22023g("LightSource") == null) {
            this.f18664f[1].put("LightSource", C5832d.m21984f(0L, this.f18666h));
        }
    }

    public void m22034a0(double d) {
        String str = d >= 0.0d ? "0" : "1";
        m22032b0("GPSAltitude", new C5834f(Math.abs(d)).toString());
        m22032b0("GPSAltitudeRef", str);
    }

    public final String m22033b(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    public void m22032b0(String str, String str2) {
        C5833e eVar;
        int i;
        Matcher matcher;
        String str3 = str;
        String str4 = str2;
        Objects.requireNonNull(str3, "tag shouldn't be null");
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f18652u0.matcher(str4).find();
            boolean find2 = f18654v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                return;
            } else if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f18653v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i2 = 2;
        int i3 = 1;
        if (str4 != null && f18645n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                if (!f18651t0.matcher(str4).find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new C5834f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            }
        }
        char c = 0;
        int i4 = 0;
        while (i4 < f18641j0.length) {
            if ((i4 != 4 || this.f18667i) && (eVar = f18644m0[i4].get(str3)) != null) {
                if (str4 != null) {
                    Pair<Integer, Integer> x = m22002x(str4);
                    int i5 = -1;
                    if (eVar.f18697c == ((Integer) x.first).intValue() || eVar.f18697c == ((Integer) x.second).intValue()) {
                        i = eVar.f18697c;
                    } else {
                        int i6 = eVar.f18698d;
                        if (i6 == -1 || !(i6 == ((Integer) x.first).intValue() || eVar.f18698d == ((Integer) x.second).intValue())) {
                            int i7 = eVar.f18697c;
                            if (i7 == i3 || i7 == 7 || i7 == i2) {
                                i = i7;
                            } else if (f18653v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f18628W;
                                sb2.append(strArr[eVar.f18697c]);
                                String str5 = "";
                                sb2.append(eVar.f18698d == -1 ? str5 : ", " + strArr[eVar.f18698d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) x.first).intValue()]);
                                if (((Integer) x.second).intValue() != -1) {
                                    str5 = ", " + strArr[((Integer) x.second).intValue()];
                                }
                                sb2.append(str5);
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i = eVar.f18698d;
                        }
                    }
                    switch (i) {
                        case 1:
                            this.f18664f[i4].put(str3, C5832d.m21989a(str4));
                            continue;
                            i4++;
                            i2 = 2;
                            c = 0;
                            i3 = 1;
                        case 2:
                        case 7:
                            this.f18664f[i4].put(str3, C5832d.m21985e(str4));
                            continue;
                            i4++;
                            i2 = 2;
                            c = 0;
                            i3 = 1;
                        case 3:
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i8 = 0; i8 < split.length; i8++) {
                                iArr[i8] = Integer.parseInt(split[i8]);
                            }
                            this.f18664f[i4].put(str3, C5832d.m21979k(iArr, this.f18666h));
                            continue;
                            i4++;
                            i2 = 2;
                            c = 0;
                            i3 = 1;
                        case 4:
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i9 = 0; i9 < split2.length; i9++) {
                                jArr[i9] = Long.parseLong(split2[i9]);
                            }
                            this.f18664f[i4].put(str3, C5832d.m21983g(jArr, this.f18666h));
                            continue;
                            i4++;
                            i2 = 2;
                            c = 0;
                            i3 = 1;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            C5834f[] fVarArr = new C5834f[split3.length];
                            int i10 = 0;
                            while (i10 < split3.length) {
                                String[] split4 = split3[i10].split("/", i5);
                                fVarArr[i10] = new C5834f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i10++;
                                i5 = -1;
                            }
                            this.f18664f[i4].put(str3, C5832d.m21981i(fVarArr, this.f18666h));
                            continue;
                            i4++;
                            i2 = 2;
                            c = 0;
                            i3 = 1;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f18653v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i);
                            } else {
                                continue;
                            }
                            i4++;
                            i2 = 2;
                            c = 0;
                            i3 = 1;
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i11 = 0; i11 < split5.length; i11++) {
                                iArr2[i11] = Integer.parseInt(split5[i11]);
                            }
                            this.f18664f[i4].put(str3, C5832d.m21987c(iArr2, this.f18666h));
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            C5834f[] fVarArr2 = new C5834f[split6.length];
                            int i12 = 0;
                            while (i12 < split6.length) {
                                String[] split7 = split6[i12].split("/", -1);
                                split6 = split6;
                                fVarArr2[i12] = new C5834f((long) Double.parseDouble(split7[c]), (long) Double.parseDouble(split7[i3]));
                                i12++;
                                c = 0;
                                i3 = 1;
                            }
                            this.f18664f[i4].put(str3, C5832d.m21986d(fVarArr2, this.f18666h));
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i13 = 0; i13 < split8.length; i13++) {
                                dArr[i13] = Double.parseDouble(split8[i13]);
                            }
                            this.f18664f[i4].put(str3, C5832d.m21988b(dArr, this.f18666h));
                            break;
                    }
                } else {
                    this.f18664f[i4].remove(str3);
                }
            }
            i4++;
            i2 = 2;
            c = 0;
            i3 = 1;
        }
    }

    public void m22030c0(Location location) {
        if (location != null) {
            m22032b0("GPSProcessingMethod", location.getProvider());
            m22028d0(location.getLatitude(), location.getLongitude());
            m22034a0(location.getAltitude());
            m22032b0("GPSSpeedRef", "K");
            m22032b0("GPSSpeed", new C5834f((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
            String[] split = f18626U.format(new Date(location.getTime())).split("\\s+", -1);
            m22032b0("GPSDateStamp", split[0]);
            m22032b0("GPSTimeStamp", split[1]);
        }
    }

    public final void m22029d(C5830b bVar, C5831c cVar, byte[] bArr, byte[] bArr2) {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb2.append(new String(bArr, f18647p0));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            m22027e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public void m22028d0(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        } else {
            m22032b0("GPSLatitudeRef", d >= 0.0d ? "N" : "S");
            m22032b0("GPSLatitude", m22033b(Math.abs(d)));
            m22032b0("GPSLongitudeRef", d2 >= 0.0d ? "E" : "W");
            m22032b0("GPSLongitude", m22033b(Math.abs(d2)));
        }
    }

    public final void m22027e(C5830b bVar, C5831c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.m21991y0(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C5836b.m21965f(bVar, cVar, readInt);
    }

    public final void m22026e0(C5830b bVar) {
        HashMap<String, C5832d> hashMap = this.f18664f[4];
        C5832d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m = dVar.m21977m(this.f18666h);
            this.f18673o = m;
            if (m != 1) {
                if (m == 6) {
                    m22001y(bVar, hashMap);
                    return;
                } else if (m != 7) {
                    return;
                }
            }
            if (m22052J(hashMap)) {
                m22000z(bVar, hashMap);
                return;
            }
            return;
        }
        this.f18673o = 6;
        m22001y(bVar, hashMap);
    }

    public double m22025f(double d) {
        double h = m22021h("GPSAltitude", -1.0d);
        int i = -1;
        int i2 = m22019i("GPSAltitudeRef", -1);
        if (h < 0.0d || i2 < 0) {
            return d;
        }
        if (i2 != 1) {
            i = 1;
        }
        return h * i;
    }

    public String m22023g(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C5832d j = m22017j(str);
        if (j != null) {
            if (!f18645n0.contains(str)) {
                return j.m21976n(this.f18666h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = j.f18691a;
                if (i == 5 || i == 10) {
                    C5834f[] fVarArr = (C5834f[]) j.m21975o(this.f18666h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVarArr[0].f18699a) / ((float) fVarArr[0].f18700b))), Integer.valueOf((int) (((float) fVarArr[1].f18699a) / ((float) fVarArr[1].f18700b))), Integer.valueOf((int) (((float) fVarArr[2].f18699a) / ((float) fVarArr[2].f18700b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j.f18691a);
                return null;
            }
            try {
                return Double.toString(j.m21978l(this.f18666h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void m22022g0(int i, int i2) {
        if (!this.f18664f[i].isEmpty() && !this.f18664f[i2].isEmpty()) {
            C5832d dVar = this.f18664f[i].get("ImageLength");
            C5832d dVar2 = this.f18664f[i].get("ImageWidth");
            C5832d dVar3 = this.f18664f[i2].get("ImageLength");
            C5832d dVar4 = this.f18664f[i2].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f18653v) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m = dVar.m21977m(this.f18666h);
                int m2 = dVar2.m21977m(this.f18666h);
                int m3 = dVar3.m21977m(this.f18666h);
                int m4 = dVar4.m21977m(this.f18666h);
                if (m < m3 && m2 < m4) {
                    HashMap<String, C5832d>[] hashMapArr = this.f18664f;
                    HashMap<String, C5832d> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            } else if (f18653v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f18653v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public double m22021h(String str, double d) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C5832d j = m22017j(str);
        if (j == null) {
            return d;
        }
        try {
            return j.m21978l(this.f18666h);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public final void m22020h0(C5835g gVar, int i) {
        C5832d dVar;
        C5832d dVar2;
        C5832d dVar3 = this.f18664f[i].get("DefaultCropSize");
        C5832d dVar4 = this.f18664f[i].get("SensorTopBorder");
        C5832d dVar5 = this.f18664f[i].get("SensorLeftBorder");
        C5832d dVar6 = this.f18664f[i].get("SensorBottomBorder");
        C5832d dVar7 = this.f18664f[i].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f18691a == 5) {
                C5834f[] fVarArr = (C5834f[]) dVar3.m21975o(this.f18666h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
                dVar2 = C5832d.m21982h(fVarArr[0], this.f18666h);
                dVar = C5832d.m21982h(fVarArr[1], this.f18666h);
            } else {
                int[] iArr = (int[]) dVar3.m21975o(this.f18666h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVar2 = C5832d.m21980j(iArr[0], this.f18666h);
                dVar = C5832d.m21980j(iArr[1], this.f18666h);
            }
            this.f18664f[i].put("ImageWidth", dVar2);
            this.f18664f[i].put("ImageLength", dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            m22040V(gVar, i);
        } else {
            int m = dVar4.m21977m(this.f18666h);
            int m2 = dVar6.m21977m(this.f18666h);
            int m3 = dVar7.m21977m(this.f18666h);
            int m4 = dVar5.m21977m(this.f18666h);
            if (m2 > m && m3 > m4) {
                C5832d j = C5832d.m21980j(m2 - m, this.f18666h);
                C5832d j2 = C5832d.m21980j(m3 - m4, this.f18666h);
                this.f18664f[i].put("ImageLength", j);
                this.f18664f[i].put("ImageWidth", j2);
            }
        }
    }

    public int m22019i(String str, int i) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C5832d j = m22017j(str);
        if (j == null) {
            return i;
        }
        try {
            return j.m21977m(this.f18666h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final void m22018i0() {
        m22022g0(0, 5);
        m22022g0(0, 4);
        m22022g0(5, 4);
        C5832d dVar = this.f18664f[1].get("PixelXDimension");
        C5832d dVar2 = this.f18664f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f18664f[0].put("ImageWidth", dVar);
            this.f18664f[0].put("ImageLength", dVar2);
        }
        if (this.f18664f[4].isEmpty() && m22050L(this.f18664f[5])) {
            HashMap<String, C5832d>[] hashMapArr = this.f18664f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m22050L(this.f18664f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m22041U(0, "ThumbnailOrientation", "Orientation");
        m22041U(0, "ThumbnailImageLength", "ImageLength");
        m22041U(0, "ThumbnailImageWidth", "ImageWidth");
        m22041U(5, "ThumbnailOrientation", "Orientation");
        m22041U(5, "ThumbnailImageLength", "ImageLength");
        m22041U(5, "ThumbnailImageWidth", "ImageWidth");
        m22041U(4, "Orientation", "ThumbnailOrientation");
        m22041U(4, "ImageLength", "ThumbnailImageLength");
        m22041U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final C5832d m22017j(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f18653v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f18641j0.length; i++) {
            C5832d dVar = this.f18664f[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final int m22016j0(C5831c cVar) {
        C5833e[][] eVarArr = f18641j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (C5833e eVar : f18642k0) {
            m22042T(eVar.f18696b);
        }
        if (this.f18667i) {
            if (this.f18668j) {
                m22042T("StripOffsets");
                m22042T("StripByteCounts");
            } else {
                m22042T("JPEGInterchangeFormat");
                m22042T("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < f18641j0.length; i++) {
            for (Object obj : this.f18664f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f18664f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f18664f[1].isEmpty()) {
            this.f18664f[0].put(f18642k0[1].f18696b, C5832d.m21984f(0L, this.f18666h));
        }
        if (!this.f18664f[2].isEmpty()) {
            this.f18664f[0].put(f18642k0[2].f18696b, C5832d.m21984f(0L, this.f18666h));
        }
        if (!this.f18664f[3].isEmpty()) {
            this.f18664f[1].put(f18642k0[3].f18696b, C5832d.m21984f(0L, this.f18666h));
        }
        if (this.f18667i) {
            if (this.f18668j) {
                this.f18664f[4].put("StripOffsets", C5832d.m21980j(0, this.f18666h));
                this.f18664f[4].put("StripByteCounts", C5832d.m21980j(this.f18671m, this.f18666h));
            } else {
                this.f18664f[4].put("JPEGInterchangeFormat", C5832d.m21984f(0L, this.f18666h));
                this.f18664f[4].put("JPEGInterchangeFormatLength", C5832d.m21984f(this.f18671m, this.f18666h));
            }
        }
        for (int i2 = 0; i2 < f18641j0.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C5832d> entry2 : this.f18664f[i2].entrySet()) {
                int p = entry2.getValue().m21974p();
                if (p > 4) {
                    i3 += p;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f18641j0.length; i5++) {
            if (!this.f18664f[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f18664f[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f18667i) {
            if (this.f18668j) {
                this.f18664f[4].put("StripOffsets", C5832d.m21980j(i4, this.f18666h));
            } else {
                this.f18664f[4].put("JPEGInterchangeFormat", C5832d.m21984f(i4, this.f18666h));
            }
            this.f18670l = i4;
            i4 += this.f18671m;
        }
        if (this.f18662d == 4) {
            i4 += 8;
        }
        if (f18653v) {
            for (int i6 = 0; i6 < f18641j0.length; i6++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f18664f[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)));
            }
        }
        if (!this.f18664f[1].isEmpty()) {
            this.f18664f[0].put(f18642k0[1].f18696b, C5832d.m21984f(iArr[1], this.f18666h));
        }
        if (!this.f18664f[2].isEmpty()) {
            this.f18664f[0].put(f18642k0[2].f18696b, C5832d.m21984f(iArr[2], this.f18666h));
        }
        if (!this.f18664f[3].isEmpty()) {
            this.f18664f[1].put(f18642k0[3].f18696b, C5832d.m21984f(iArr[3], this.f18666h));
        }
        int i7 = this.f18662d;
        if (i7 == 4) {
            cVar.m21994B0(i4);
            cVar.write(f18648q0);
        } else if (i7 == 13) {
            cVar.m21991y0(i4);
            cVar.write(f18614I);
        } else if (i7 == 14) {
            cVar.write(f18619N);
            cVar.m21991y0(i4);
        }
        cVar.m21990z0(this.f18666h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.m21993m(this.f18666h);
        cVar.m21994B0(42);
        cVar.m21995A0(8L);
        for (int i8 = 0; i8 < f18641j0.length; i8++) {
            if (!this.f18664f[i8].isEmpty()) {
                cVar.m21994B0(this.f18664f[i8].size());
                int size = iArr[i8] + 2 + (this.f18664f[i8].size() * 12) + 4;
                for (Map.Entry<String, C5832d> entry3 : this.f18664f[i8].entrySet()) {
                    int i9 = f18644m0[i8].get(entry3.getKey()).f18695a;
                    C5832d value = entry3.getValue();
                    int p2 = value.m21974p();
                    cVar.m21994B0(i9);
                    cVar.m21994B0(value.f18691a);
                    cVar.m21991y0(value.f18692b);
                    if (p2 > 4) {
                        cVar.m21995A0(size);
                        size += p2;
                    } else {
                        cVar.write(value.f18694d);
                        if (p2 < 4) {
                            while (p2 < 4) {
                                cVar.m21992t(0);
                                p2++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f18664f[4].isEmpty()) {
                    cVar.m21995A0(0L);
                } else {
                    cVar.m21995A0(iArr[4]);
                }
                for (Map.Entry<String, C5832d> entry4 : this.f18664f[i8].entrySet()) {
                    byte[] bArr = entry4.getValue().f18694d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f18667i) {
            cVar.write(m22004v());
        }
        if (this.f18662d == 14 && i4 % 2 == 1) {
            cVar.m21992t(0);
        }
        cVar.m21993m(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    public final void m22015k(C5835g gVar) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    C5836b.C5838b.m21960a(mediaMetadataRetriever, new C5829a(gVar));
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
                        this.f18664f[0].put("ImageWidth", C5832d.m21980j(Integer.parseInt(str3), this.f18666h));
                    }
                    if (str2 != null) {
                        this.f18664f[0].put("ImageLength", C5832d.m21980j(Integer.parseInt(str2), this.f18666h));
                    }
                    if (str != null) {
                        int i = 1;
                        int parseInt = Integer.parseInt(str);
                        if (parseInt == 90) {
                            i = 6;
                        } else if (parseInt == 180) {
                            i = 3;
                        } else if (parseInt == 270) {
                            i = 8;
                        }
                        this.f18664f[0].put("Orientation", C5832d.m21980j(i, this.f18666h));
                    }
                    if (!(extractMetadata == null || extractMetadata2 == null)) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            gVar.m21971A0(parseInt2);
                            byte[] bArr = new byte[6];
                            if (gVar.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f18648q0)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (gVar.read(bArr2) == i3) {
                                        this.f18674p = i2;
                                        m22044R(bArr2, 0);
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
                    if (f18653v) {
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

    public final void m22014l(p129j1.C5828a.C5830b r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5828a.m22014l(j1.a$b, int, int):void");
    }

    public double[] m22013m() {
        String g = m22023g("GPSLatitude");
        String g2 = m22023g("GPSLatitudeRef");
        String g3 = m22023g("GPSLongitude");
        String g4 = m22023g("GPSLongitudeRef");
        if (g == null || g2 == null || g3 == null || g4 == null) {
            return null;
        }
        try {
            return new double[]{m22031c(g, g2), m22031c(g3, g4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", g, g2, g3, g4));
            return null;
        }
    }

    public final int m22012n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m22058D(bArr)) {
            return 4;
        }
        if (m22055G(bArr)) {
            return 9;
        }
        if (m22059C(bArr)) {
            return 12;
        }
        if (m22057E(bArr)) {
            return 7;
        }
        if (m22054H(bArr)) {
            return 10;
        }
        if (m22056F(bArr)) {
            return 13;
        }
        return m22049M(bArr) ? 14 : 0;
    }

    public final void m22011o(C5835g gVar) {
        m22008r(gVar);
        C5832d dVar = this.f18664f[1].get("MakerNote");
        if (dVar != null) {
            C5835g gVar2 = new C5835g(dVar.f18694d);
            gVar2.m21997y0(this.f18666h);
            byte[] bArr = f18611F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.m21971A0(0L);
            byte[] bArr3 = f18612G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.m21971A0(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.m21971A0(12L);
            }
            m22043S(gVar2, 6);
            C5832d dVar2 = this.f18664f[7].get("PreviewImageStart");
            C5832d dVar3 = this.f18664f[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f18664f[5].put("JPEGInterchangeFormat", dVar2);
                this.f18664f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            C5832d dVar4 = this.f18664f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.m21975o(this.f18666h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C5832d j = C5832d.m21980j(i, this.f18666h);
                    C5832d j2 = C5832d.m21980j(i2, this.f18666h);
                    this.f18664f[0].put("ImageWidth", j);
                    this.f18664f[0].put("ImageLength", j2);
                }
            }
        }
    }

    public final void m22010p(C5830b bVar) {
        if (f18653v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m21997y0(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f18613H;
        bVar.m21996z0(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, f18615J)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f18616K)) {
                        if (Arrays.equals(bArr2, f18614I)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f18674p = i2;
                                    m22044R(bArr3, 0);
                                    m22018i0();
                                    m22026e0(new C5830b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + C5836b.m21970a(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.m21996z0(i3);
                        length = i2 + i3;
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

    public final void m22009q(C5830b bVar) {
        boolean z = f18653v;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m21996z0(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.m21996z0(i - bVar.m21999m());
        bVar.read(bArr4);
        m22014l(new C5830b(bArr4), i, 5);
        bVar.m21996z0(i3 - bVar.m21999m());
        bVar.m21997y0(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f18636e0.f18695a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C5832d j = C5832d.m21980j(readShort, this.f18666h);
                C5832d j2 = C5832d.m21980j(readShort2, this.f18666h);
                this.f18664f[0].put("ImageLength", j);
                this.f18664f[0].put("ImageWidth", j2);
                if (f18653v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.m21996z0(readUnsignedShort2);
        }
    }

    public final void m22008r(C5835g gVar) {
        C5832d dVar;
        m22047O(gVar);
        m22043S(gVar, 0);
        m22020h0(gVar, 0);
        m22020h0(gVar, 5);
        m22020h0(gVar, 4);
        m22018i0();
        if (this.f18662d == 8 && (dVar = this.f18664f[1].get("MakerNote")) != null) {
            C5835g gVar2 = new C5835g(dVar.f18694d);
            gVar2.m21997y0(this.f18666h);
            gVar2.m21996z0(6);
            m22043S(gVar2, 9);
            C5832d dVar2 = this.f18664f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f18664f[1].put("ColorSpace", dVar2);
            }
        }
    }

    public final void m22007s(C5835g gVar) {
        if (f18653v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m22008r(gVar);
        C5832d dVar = this.f18664f[0].get("JpgFromRaw");
        if (dVar != null) {
            m22014l(new C5830b(dVar.f18694d), (int) dVar.f18693c, 5);
        }
        C5832d dVar2 = this.f18664f[0].get("ISO");
        C5832d dVar3 = this.f18664f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f18664f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    public final void m22006t(C5835g gVar) {
        byte[] bArr = f18648q0;
        gVar.m21996z0(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f18674p = bArr.length;
        m22044R(bArr2, 0);
    }

    public byte[] m22005u() {
        int i = this.f18673o;
        if (i == 6 || i == 7) {
            return m22004v();
        }
        return null;
    }

    public byte[] m22004v() {
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5828a.m22004v():byte[]");
    }

    public final void m22003w(C5830b bVar) {
        if (f18653v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m21997y0(ByteOrder.LITTLE_ENDIAN);
        bVar.m21996z0(f18617L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f18618M;
        bVar.m21996z0(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(f18619N, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f18674p = i;
                            m22044R(bArr3, 0);
                            m22026e0(new C5830b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C5836b.m21970a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.m21996z0(readInt2);
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

    public final void m22001y(C5830b bVar, HashMap hashMap) {
        C5832d dVar = (C5832d) hashMap.get("JPEGInterchangeFormat");
        C5832d dVar2 = (C5832d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m = dVar.m21977m(this.f18666h);
            int m2 = dVar2.m21977m(this.f18666h);
            if (this.f18662d == 7) {
                m += this.f18675q;
            }
            if (m > 0 && m2 > 0) {
                this.f18667i = true;
                if (this.f18659a == null && this.f18661c == null && this.f18660b == null) {
                    byte[] bArr = new byte[m2];
                    bVar.skip(m);
                    bVar.read(bArr);
                    this.f18672n = bArr;
                }
                this.f18670l = m;
                this.f18671m = m2;
            }
            if (f18653v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m + ", length: " + m2);
            }
        }
    }

    public final void m22000z(C5830b bVar, HashMap hashMap) {
        C5832d dVar = (C5832d) hashMap.get("StripOffsets");
        C5832d dVar2 = (C5832d) hashMap.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] d = C5836b.m21967d(dVar.m21975o(this.f18666h));
            long[] d2 = C5836b.m21967d(dVar2.m21975o(this.f18666h));
            if (d == null || d.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (d2 == null || d2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (d.length != d2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j = 0;
                for (long j2 : d2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 1;
                this.f18669k = true;
                this.f18668j = true;
                this.f18667i = true;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < d.length) {
                    int i6 = (int) d[i3];
                    int i7 = (int) d2[i3];
                    if (i3 < d.length - i2 && i6 + i7 != d[i3 + 1]) {
                        this.f18669k = false;
                    }
                    int i8 = i6 - i4;
                    if (i8 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i8;
                    if (bVar.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i8 + " bytes.");
                        return;
                    }
                    int i9 = i4 + i8;
                    byte[] bArr2 = new byte[i7];
                    if (bVar.read(bArr2) != i7) {
                        Log.d("ExifInterface", "Failed to read " + i7 + " bytes.");
                        return;
                    }
                    i4 = i9 + i7;
                    System.arraycopy(bArr2, 0, bArr, i5, i7);
                    i5 += i7;
                    i3++;
                    i2 = 1;
                }
                this.f18672n = bArr;
                if (this.f18669k) {
                    this.f18670l = (int) d[0];
                    this.f18671m = i;
                }
            }
        }
    }

    public static class C5835g extends C5830b {
        public C5835g(byte[] bArr) {
            super(bArr);
            this.f18686a.mark(Integer.MAX_VALUE);
        }

        public void m21971A0(long j) {
            int i = this.f18688c;
            if (i > j) {
                this.f18688c = 0;
                this.f18686a.reset();
            } else {
                j -= i;
            }
            m21996z0((int) j);
        }

        public C5835g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f18686a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class C5833e {
        public final int f18695a;
        public final String f18696b;
        public final int f18697c;
        public final int f18698d;

        public C5833e(String str, int i, int i2) {
            this.f18696b = str;
            this.f18695a = i;
            this.f18697c = i2;
            this.f18698d = -1;
        }

        public boolean m21973a(int i) {
            int i2;
            int i3 = this.f18697c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f18698d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public C5833e(String str, int i, int i2, int i3) {
            this.f18696b = str;
            this.f18695a = i;
            this.f18697c = i2;
            this.f18698d = i3;
        }
    }

    public C5828a(String str) {
        C5833e[][] eVarArr = f18641j0;
        this.f18664f = new HashMap[eVarArr.length];
        this.f18665g = new HashSet(eVarArr.length);
        this.f18666h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        m22061A(str);
    }

    public C5828a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public C5828a(InputStream inputStream, int i) {
        C5833e[][] eVarArr = f18641j0;
        this.f18664f = new HashMap[eVarArr.length];
        this.f18665g = new HashSet(eVarArr.length);
        this.f18666h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f18659a = null;
        if (i == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f18648q0.length);
            if (!m22060B(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f18663e = true;
            this.f18661c = null;
            this.f18660b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f18661c = (AssetManager.AssetInputStream) inputStream;
            this.f18660b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m22053I(fileInputStream.getFD())) {
                    this.f18661c = null;
                    this.f18660b = fileInputStream.getFD();
                }
            }
            this.f18661c = null;
            this.f18660b = null;
        }
        m22048N(inputStream);
    }
}
