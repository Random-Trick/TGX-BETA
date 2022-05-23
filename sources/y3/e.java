package y3;

import a7.q;
import android.util.Pair;
import android.util.SparseArray;
import c5.b0;
import c5.l0;
import c5.s;
import c5.t;
import c5.w;
import c5.x;
import com.google.android.exoplayer2.extractor.g;
import d.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m3.i;
import m3.k2;
import m3.q1;
import o3.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import q3.m;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.t;
import t3.u;

public class e implements f {
    public static final l f26503b0 = d.f26502b;
    public static final byte[] f26504c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f26505d0 = l0.f0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] f26506e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] f26507f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID f26508g0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map<String, Integer> f26509h0;
    public long A;
    public long B;
    public t C;
    public t D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;
    public final y3.c f26510a;
    public h f26511a0;
    public final g f26512b;
    public final SparseArray<c> f26513c;
    public final boolean f26514d;
    public final b0 f26515e;
    public final b0 f26516f;
    public final b0 f26517g;
    public final b0 f26518h;
    public final b0 f26519i;
    public final b0 f26520j;
    public final b0 f26521k;
    public final b0 f26522l;
    public final b0 f26523m;
    public final b0 f26524n;
    public ByteBuffer f26525o;
    public long f26526p;
    public long f26527q;
    public long f26528r;
    public long f26529s;
    public long f26530t;
    public c f26531u;
    public boolean f26532v;
    public int f26533w;
    public long f26534x;
    public boolean f26535y;
    public long f26536z;

    public final class b implements y3.b {
        public b() {
        }

        @Override
        public void a(int i10) {
            e.this.p(i10);
        }

        @Override
        public int b(int i10) {
            return e.this.v(i10);
        }

        @Override
        public boolean c(int i10) {
            return e.this.A(i10);
        }

        @Override
        public void d(int i10, int i11, g gVar) {
            e.this.m(i10, i11, gVar);
        }

        @Override
        public void e(int i10, String str) {
            e.this.I(i10, str);
        }

        @Override
        public void f(int i10, double d10) {
            e.this.s(i10, d10);
        }

        @Override
        public void g(int i10, long j10, long j11) {
            e.this.H(i10, j10, j11);
        }

        @Override
        public void h(int i10, long j10) {
            e.this.y(i10, j10);
        }
    }

    public static final class c {
        public byte[] N;
        public u T;
        public boolean U;
        public t3.t X;
        public int Y;
        public String f26538a;
        public String f26539b;
        public int f26540c;
        public int f26541d;
        public int f26542e;
        public int f26543f;
        public int f26544g;
        public boolean f26545h;
        public byte[] f26546i;
        public t.a f26547j;
        public byte[] f26548k;
        public m f26549l;
        public int f26550m = -1;
        public int f26551n = -1;
        public int f26552o = -1;
        public int f26553p = -1;
        public int f26554q = 0;
        public int f26555r = -1;
        public float f26556s = 0.0f;
        public float f26557t = 0.0f;
        public float f26558u = 0.0f;
        public byte[] f26559v = null;
        public int f26560w = -1;
        public boolean f26561x = false;
        public int f26562y = -1;
        public int f26563z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public static Pair<String, List<byte[]>> j(b0 b0Var) {
            try {
                b0Var.Q(16);
                long t10 = b0Var.t();
                if (t10 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (t10 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (t10 == 826496599) {
                    byte[] d10 = b0Var.d();
                    for (int e10 = b0Var.e() + 20; e10 < d10.length - 4; e10++) {
                        if (d10[e10] == 0 && d10[e10 + 1] == 0 && d10[e10 + 2] == 1 && d10[e10 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d10, e10, d10.length)));
                        }
                    }
                    throw k2.a("Failed to find FourCC VC1 initialization data", null);
                }
                s.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw k2.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean k(b0 b0Var) {
            try {
                int v10 = b0Var.v();
                if (v10 == 1) {
                    return true;
                }
                if (v10 != 65534) {
                    return false;
                }
                b0Var.P(24);
                if (b0Var.w() == e.f26508g0.getMostSignificantBits()) {
                    if (b0Var.w() == e.f26508g0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw k2.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List<byte[]> l(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i10 = 1;
                    int i11 = 0;
                    while ((bArr[i10] & 255) == 255) {
                        i11 += 255;
                        i10++;
                    }
                    int i12 = i10 + 1;
                    int i13 = i11 + (bArr[i10] & 255);
                    int i14 = 0;
                    while ((bArr[i12] & 255) == 255) {
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (bArr[i12] & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i18];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw k2.a("Error parsing vorbis codec private", null);
                        }
                        throw k2.a("Error parsing vorbis codec private", null);
                    }
                    throw k2.a("Error parsing vorbis codec private", null);
                }
                throw k2.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw k2.a("Error parsing vorbis codec private", null);
            }
        }

        @EnsuresNonNull({"output"})
        public final void e() {
            c5.a.e(this.X);
        }

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] f(String str) {
            byte[] bArr = this.f26548k;
            if (bArr != null) {
                return bArr;
            }
            String valueOf = String.valueOf(str);
            throw k2.a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
        }

        public final byte[] g() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) (this.L + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        public void h(h hVar, int i10) {
            char c10;
            int i11;
            int i12;
            String str;
            List<byte[]> list;
            int i13;
            int i14;
            int i15;
            int i16;
            d5.e a10;
            int V;
            List<byte[]> list2;
            String str2;
            String str3 = this.f26539b;
            str3.hashCode();
            switch (str3.hashCode()) {
                case -2095576542:
                    if (str3.equals("V_MPEG4/ISO/AP")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -2095575984:
                    if (str3.equals("V_MPEG4/ISO/SP")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1985379776:
                    if (str3.equals("A_MS/ACM")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1784763192:
                    if (str3.equals("A_TRUEHD")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1730367663:
                    if (str3.equals("A_VORBIS")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1482641358:
                    if (str3.equals("A_MPEG/L2")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1482641357:
                    if (str3.equals("A_MPEG/L3")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1373388978:
                    if (str3.equals("V_MS/VFW/FOURCC")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -933872740:
                    if (str3.equals("S_DVBSUB")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -538363189:
                    if (str3.equals("V_MPEG4/ISO/ASP")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -538363109:
                    if (str3.equals("V_MPEG4/ISO/AVC")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -425012669:
                    if (str3.equals("S_VOBSUB")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -356037306:
                    if (str3.equals("A_DTS/LOSSLESS")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62923557:
                    if (str3.equals("A_AAC")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62923603:
                    if (str3.equals("A_AC3")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62927045:
                    if (str3.equals("A_DTS")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82318131:
                    if (str3.equals("V_AV1")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82338133:
                    if (str3.equals("V_VP8")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82338134:
                    if (str3.equals("V_VP9")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99146302:
                    if (str3.equals("S_HDMV/PGS")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 444813526:
                    if (str3.equals("V_THEORA")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 542569478:
                    if (str3.equals("A_DTS/EXPRESS")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 635596514:
                    if (str3.equals("A_PCM/FLOAT/IEEE")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 725948237:
                    if (str3.equals("A_PCM/INT/BIG")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 725957860:
                    if (str3.equals("A_PCM/INT/LIT")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 738597099:
                    if (str3.equals("S_TEXT/ASS")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 855502857:
                    if (str3.equals("V_MPEGH/ISO/HEVC")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1045209816:
                    if (str3.equals("S_TEXT/WEBVTT")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1422270023:
                    if (str3.equals("S_TEXT/UTF8")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1809237540:
                    if (str3.equals("V_MPEG2")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1950749482:
                    if (str3.equals("A_EAC3")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1950789798:
                    if (str3.equals("A_FLAC")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951062397:
                    if (str3.equals("A_OPUS")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str4 = "audio/raw";
            d5.c cVar = null;
            switch (c10) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.f26548k;
                    list = bArr == null ? null : Collections.singletonList(bArr);
                    str4 = "video/mp4v-es";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 2:
                    if (k(new b0(f(this.f26539b)))) {
                        V = l0.V(this.P);
                        if (V == 0) {
                            int i17 = this.P;
                            StringBuilder sb2 = new StringBuilder("audio/x-unknown".length() + 60);
                            sb2.append("Unsupported PCM bit depth: ");
                            sb2.append(i17);
                            sb2.append(". Setting mimeType to ");
                            sb2.append("audio/x-unknown");
                            s.i("MatroskaExtractor", sb2.toString());
                        }
                        i12 = V;
                        list = null;
                        str = null;
                        i11 = -1;
                        break;
                    } else {
                        s.i("MatroskaExtractor", "audio/x-unknown".length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown") : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                    }
                    list = null;
                    str = null;
                    str4 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                case 3:
                    this.T = new u();
                    str4 = "audio/true-hd";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 4:
                    list = l(f(this.f26539b));
                    str4 = "audio/vorbis";
                    str = null;
                    i12 = -1;
                    i11 = Log.TAG_LUX;
                    break;
                case 5:
                    str4 = "audio/mpeg-L2";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = Log.TAG_EMOJI;
                    break;
                case 6:
                    str4 = "audio/mpeg";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = Log.TAG_EMOJI;
                    break;
                case 7:
                    Pair<String, List<byte[]>> j10 = j(new b0(f(this.f26539b)));
                    str4 = (String) j10.first;
                    list = (List) j10.second;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(f(this.f26539b), 0, bArr2, 0, 4);
                    list = q.E(bArr2);
                    str4 = "application/dvbsubs";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case '\n':
                    d5.a b10 = d5.a.b(new b0(f(this.f26539b)));
                    list2 = b10.f6199a;
                    this.Y = b10.f6200b;
                    str2 = b10.f6204f;
                    str4 = "video/avc";
                    i12 = -1;
                    i11 = -1;
                    list = list2;
                    str = str2;
                    break;
                case 11:
                    list = q.E(f(this.f26539b));
                    str = null;
                    str4 = "application/vobsub";
                    i12 = -1;
                    i11 = -1;
                    break;
                case '\f':
                    str4 = "audio/vnd.dts.hd";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case '\r':
                    list = Collections.singletonList(f(this.f26539b));
                    a.b e10 = o3.a.e(this.f26548k);
                    this.Q = e10.f18648a;
                    this.O = e10.f18649b;
                    str = e10.f18650c;
                    str4 = "audio/mp4a-latm";
                    i12 = -1;
                    i11 = -1;
                    break;
                case 14:
                    str4 = "audio/ac3";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 15:
                case 21:
                    str4 = "audio/vnd.dts";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 16:
                    str4 = "video/av01";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 17:
                    str4 = "video/x-vnd.on2.vp8";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 18:
                    str4 = "video/x-vnd.on2.vp9";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 19:
                    list = null;
                    str = null;
                    str4 = "application/pgs";
                    i12 = -1;
                    i11 = -1;
                    break;
                case 20:
                    str4 = "video/x-unknown";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 22:
                    int i18 = this.P;
                    if (i18 == 32) {
                        list = null;
                        str = null;
                        i12 = 4;
                        i11 = -1;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder("audio/x-unknown".length() + 75);
                        sb3.append("Unsupported floating point PCM bit depth: ");
                        sb3.append(i18);
                        sb3.append(". Setting mimeType to ");
                        sb3.append("audio/x-unknown");
                        s.i("MatroskaExtractor", sb3.toString());
                        list = null;
                        str = null;
                        str4 = "audio/x-unknown";
                        i12 = -1;
                        i11 = -1;
                    }
                case 23:
                    int i19 = this.P;
                    if (i19 == 8) {
                        list = null;
                        str = null;
                        i12 = 3;
                    } else if (i19 == 16) {
                        list = null;
                        str = null;
                        i12 = 268435456;
                    } else {
                        StringBuilder sb4 = new StringBuilder("audio/x-unknown".length() + 71);
                        sb4.append("Unsupported big endian PCM bit depth: ");
                        sb4.append(i19);
                        sb4.append(". Setting mimeType to ");
                        sb4.append("audio/x-unknown");
                        s.i("MatroskaExtractor", sb4.toString());
                        list = null;
                        str = null;
                        str4 = "audio/x-unknown";
                        i12 = -1;
                    }
                    i11 = -1;
                    break;
                case j.K3:
                    V = l0.V(this.P);
                    if (V == 0) {
                        int i20 = this.P;
                        StringBuilder sb5 = new StringBuilder("audio/x-unknown".length() + 74);
                        sb5.append("Unsupported little endian PCM bit depth: ");
                        sb5.append(i20);
                        sb5.append(". Setting mimeType to ");
                        sb5.append("audio/x-unknown");
                        s.i("MatroskaExtractor", sb5.toString());
                        list = null;
                        str = null;
                        str4 = "audio/x-unknown";
                        i12 = -1;
                        i11 = -1;
                        break;
                    }
                    i12 = V;
                    list = null;
                    str = null;
                    i11 = -1;
                case 25:
                    list = q.F(e.f26505d0, f(this.f26539b));
                    str = null;
                    str4 = "text/x-ssa";
                    i12 = -1;
                    i11 = -1;
                    break;
                case 26:
                    d5.h a11 = d5.h.a(new b0(f(this.f26539b)));
                    list2 = a11.f6262a;
                    this.Y = a11.f6263b;
                    str2 = a11.f6267f;
                    str4 = "video/hevc";
                    i12 = -1;
                    i11 = -1;
                    list = list2;
                    str = str2;
                    break;
                case 27:
                    list = null;
                    str = null;
                    str4 = "text/vtt";
                    i12 = -1;
                    i11 = -1;
                    break;
                case 28:
                    str4 = "application/x-subrip";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case j.P3:
                    str4 = "video/mpeg2";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 30:
                    str4 = "audio/eac3";
                    list = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case 31:
                    list = Collections.singletonList(f(this.f26539b));
                    str4 = "audio/flac";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    break;
                case Log.TAG_IMAGE_LOADER:
                    list = new ArrayList<>(3);
                    list.add(f(this.f26539b));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    list.add(allocate.order(byteOrder).putLong(this.R).array());
                    list.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str4 = "audio/opus";
                    str = null;
                    i12 = -1;
                    i11 = 5760;
                    break;
                default:
                    throw k2.a("Unrecognized codec identifier.", null);
            }
            byte[] bArr3 = this.N;
            if (!(bArr3 == null || (a10 = d5.e.a(new b0(bArr3))) == null)) {
                str = a10.f6241c;
                str4 = "video/dolby-vision";
            }
            String str5 = str4;
            int i21 = (this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
            q1.b bVar = new q1.b();
            if (w.h(str5)) {
                bVar.H(this.O).f0(this.Q).Y(i12);
                i13 = 1;
            } else if (w.k(str5)) {
                if (this.f26554q == 0) {
                    int i22 = this.f26552o;
                    i14 = -1;
                    if (i22 == -1) {
                        i22 = this.f26550m;
                    }
                    this.f26552o = i22;
                    int i23 = this.f26553p;
                    if (i23 == -1) {
                        i23 = this.f26551n;
                    }
                    this.f26553p = i23;
                } else {
                    i14 = -1;
                }
                float f10 = -1.0f;
                if (!(this.f26552o == i14 || (i16 = this.f26553p) == i14)) {
                    f10 = (this.f26551n * i15) / (this.f26550m * i16);
                }
                if (this.f26561x) {
                    cVar = new d5.c(this.f26562y, this.A, this.f26563z, g());
                }
                if (this.f26538a != null && e.f26509h0.containsKey(this.f26538a)) {
                    i14 = ((Integer) e.f26509h0.get(this.f26538a)).intValue();
                }
                if (this.f26555r == 0 && Float.compare(this.f26556s, 0.0f) == 0 && Float.compare(this.f26557t, 0.0f) == 0) {
                    if (Float.compare(this.f26558u, 0.0f) == 0) {
                        i14 = 0;
                    } else if (Float.compare(this.f26557t, 90.0f) == 0) {
                        i14 = 90;
                    } else if (Float.compare(this.f26557t, -180.0f) == 0 || Float.compare(this.f26557t, 180.0f) == 0) {
                        i14 = 180;
                    } else if (Float.compare(this.f26557t, -90.0f) == 0) {
                        i14 = 270;
                    }
                }
                bVar.j0(this.f26550m).Q(this.f26551n).a0(f10).d0(i14).b0(this.f26559v).h0(this.f26560w).J(cVar);
                i13 = 2;
            } else if ("application/x-subrip".equals(str5) || "text/x-ssa".equals(str5) || "text/vtt".equals(str5) || "application/vobsub".equals(str5) || "application/pgs".equals(str5) || "application/dvbsubs".equals(str5)) {
                i13 = 3;
            } else {
                throw k2.a("Unexpected MIME type.", null);
            }
            if (this.f26538a != null && !e.f26509h0.containsKey(this.f26538a)) {
                bVar.U(this.f26538a);
            }
            q1 E = bVar.R(i10).e0(str5).W(i11).V(this.W).g0(i21).T(list).I(str).M(this.f26549l).E();
            t3.t q10 = hVar.q(this.f26540c, i13);
            this.X = q10;
            q10.a(E);
        }

        @RequiresNonNull({"output"})
        public void i() {
            u uVar = this.T;
            if (uVar != null) {
                uVar.a(this.X, this.f26547j);
            }
        }

        public void m() {
            u uVar = this.T;
            if (uVar != null) {
                uVar.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f26509h0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    public static f[] B() {
        return new f[]{new e()};
    }

    public static void G(String str, long j10, byte[] bArr) {
        int i10;
        byte[] bArr2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bArr2 = t(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                bArr2 = t(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                bArr2 = t(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    public static int[] q(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static byte[] t(long j10, String str, long j11) {
        c5.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return l0.f0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    public static boolean z(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case j.K3:
            case 25:
            case 26:
            case 27:
            case 28:
            case j.P3:
            case 30:
            case 31:
            case Log.TAG_IMAGE_LOADER:
                return true;
            default:
                return false;
        }
    }

    public boolean A(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public final boolean C(t3.q qVar, long j10) {
        if (this.f26535y) {
            this.A = j10;
            qVar.f22899a = this.f26536z;
            this.f26535y = false;
            return true;
        }
        if (this.f26532v) {
            long j11 = this.A;
            if (j11 != -1) {
                qVar.f22899a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    public final void D(g gVar, int i10) {
        if (this.f26517g.f() < i10) {
            if (this.f26517g.b() < i10) {
                b0 b0Var = this.f26517g;
                b0Var.c(Math.max(b0Var.b() * 2, i10));
            }
            gVar.readFully(this.f26517g.d(), this.f26517g.f(), i10 - this.f26517g.f());
            this.f26517g.O(i10);
        }
    }

    public final void E() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f26520j.L(0);
    }

    public final long F(long j10) {
        long j11 = this.f26528r;
        if (j11 != -9223372036854775807L) {
            return l0.z0(j10, j11, 1000L);
        }
        throw k2.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void H(int i10, long j10, long j11) {
        l();
        if (i10 == 160) {
            this.Q = false;
        } else if (i10 == 174) {
            this.f26531u = new c();
        } else if (i10 == 187) {
            this.E = false;
        } else if (i10 == 19899) {
            this.f26533w = -1;
            this.f26534x = -1L;
        } else if (i10 == 20533) {
            u(i10).f26545h = true;
        } else if (i10 == 21968) {
            u(i10).f26561x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f26527q;
            if (j12 == -1 || j12 == j10) {
                this.f26527q = j10;
                this.f26526p = j11;
                return;
            }
            throw k2.a("Multiple Segment elements not supported", null);
        } else if (i10 == 475249515) {
            this.C = new c5.t();
            this.D = new c5.t();
        } else if (i10 != 524531317 || this.f26532v) {
        } else {
            if (!this.f26514d || this.f26536z == -1) {
                this.f26511a0.a(new g.b(this.f26530t));
                this.f26532v = true;
                return;
            }
            this.f26535y = true;
        }
    }

    public void I(int i10, String str) {
        if (i10 == 134) {
            u(i10).f26539b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                u(i10).f26538a = str;
            } else if (i10 == 2274716) {
                u(i10).W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw k2.a(sb2.toString(), null);
        }
    }

    @RequiresNonNull({"#2.output"})
    public final int J(t3.g gVar, c cVar, int i10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f26539b)) {
            K(gVar, f26504c0, i10);
            return r();
        } else if ("S_TEXT/ASS".equals(cVar.f26539b)) {
            K(gVar, f26506e0, i10);
            return r();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f26539b)) {
            K(gVar, f26507f0, i10);
            return r();
        } else {
            t3.t tVar = cVar.X;
            boolean z10 = true;
            if (!this.U) {
                if (cVar.f26545h) {
                    this.O &= -1073741825;
                    boolean z11 = this.V;
                    int i12 = Log.TAG_YOUTUBE;
                    if (!z11) {
                        gVar.readFully(this.f26517g.d(), 0, 1);
                        this.R++;
                        if ((this.f26517g.d()[0] & 128) != 128) {
                            this.Y = this.f26517g.d()[0];
                            this.V = true;
                        } else {
                            throw k2.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.Y;
                    if ((b10 & 1) == 1) {
                        boolean z12 = (b10 & 2) == 2;
                        this.O |= Log.TAG_TDLIB_OPTIONS;
                        if (!this.Z) {
                            gVar.readFully(this.f26522l.d(), 0, 8);
                            this.R += 8;
                            this.Z = true;
                            byte[] d10 = this.f26517g.d();
                            if (!z12) {
                                i12 = 0;
                            }
                            d10[0] = (byte) (i12 | 8);
                            this.f26517g.P(0);
                            tVar.e(this.f26517g, 1, 1);
                            this.S++;
                            this.f26522l.P(0);
                            tVar.e(this.f26522l, 8, 1);
                            this.S += 8;
                        }
                        if (z12) {
                            if (!this.W) {
                                gVar.readFully(this.f26517g.d(), 0, 1);
                                this.R++;
                                this.f26517g.P(0);
                                this.X = this.f26517g.D();
                                this.W = true;
                            }
                            int i13 = this.X * 4;
                            this.f26517g.L(i13);
                            gVar.readFully(this.f26517g.d(), 0, i13);
                            this.R += i13;
                            short s10 = (short) ((this.X / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f26525o;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f26525o = ByteBuffer.allocate(i14);
                            }
                            this.f26525o.position(0);
                            this.f26525o.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.X;
                                if (i15 >= i11) {
                                    break;
                                }
                                int H = this.f26517g.H();
                                if (i15 % 2 == 0) {
                                    this.f26525o.putShort((short) (H - i16));
                                } else {
                                    this.f26525o.putInt(H - i16);
                                }
                                i15++;
                                i16 = H;
                            }
                            int i17 = (i10 - this.R) - i16;
                            if (i11 % 2 == 1) {
                                this.f26525o.putInt(i17);
                            } else {
                                this.f26525o.putShort((short) i17);
                                this.f26525o.putInt(0);
                            }
                            this.f26523m.N(this.f26525o.array(), i14);
                            tVar.e(this.f26523m, i14, 1);
                            this.S += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f26546i;
                    if (bArr != null) {
                        this.f26520j.N(bArr, bArr.length);
                    }
                }
                if (cVar.f26543f > 0) {
                    this.O |= 268435456;
                    this.f26524n.L(0);
                    this.f26517g.L(4);
                    this.f26517g.d()[0] = (byte) ((i10 >> 24) & 255);
                    this.f26517g.d()[1] = (byte) ((i10 >> 16) & 255);
                    this.f26517g.d()[2] = (byte) ((i10 >> 8) & 255);
                    this.f26517g.d()[3] = (byte) (i10 & 255);
                    tVar.e(this.f26517g, 4, 2);
                    this.S += 4;
                }
                this.U = true;
            }
            int f10 = i10 + this.f26520j.f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f26539b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f26539b)) {
                if (cVar.T != null) {
                    if (this.f26520j.f() != 0) {
                        z10 = false;
                    }
                    c5.a.f(z10);
                    cVar.T.d(gVar);
                }
                while (true) {
                    int i18 = this.R;
                    if (i18 >= f10) {
                        break;
                    }
                    int L = L(gVar, tVar, f10 - i18);
                    this.R += L;
                    this.S += L;
                }
            } else {
                byte[] d11 = this.f26516f.d();
                d11[0] = 0;
                d11[1] = 0;
                d11[2] = 0;
                int i19 = cVar.Y;
                int i20 = 4 - i19;
                while (this.R < f10) {
                    int i21 = this.T;
                    if (i21 == 0) {
                        M(gVar, d11, i20, i19);
                        this.R += i19;
                        this.f26516f.P(0);
                        this.T = this.f26516f.H();
                        this.f26515e.P(0);
                        tVar.d(this.f26515e, 4);
                        this.S += 4;
                    } else {
                        int L2 = L(gVar, tVar, i21);
                        this.R += L2;
                        this.S += L2;
                        this.T -= L2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f26539b)) {
                this.f26518h.P(0);
                tVar.d(this.f26518h, 4);
                this.S += 4;
            }
            return r();
        }
    }

    public final void K(t3.g gVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f26521k.b() < length) {
            this.f26521k.M(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f26521k.d(), 0, bArr.length);
        }
        gVar.readFully(this.f26521k.d(), bArr.length, i10);
        this.f26521k.P(0);
        this.f26521k.O(length);
    }

    public final int L(t3.g gVar, t3.t tVar, int i10) {
        int a10 = this.f26520j.a();
        if (a10 <= 0) {
            return tVar.b(gVar, i10, false);
        }
        int min = Math.min(i10, a10);
        tVar.d(this.f26520j, min);
        return min;
    }

    public final void M(t3.g gVar, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f26520j.a());
        gVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f26520j.j(bArr, i10, min);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f26510a.c();
        this.f26512b.e();
        E();
        for (int i10 = 0; i10 < this.f26513c.size(); i10++) {
            this.f26513c.valueAt(i10).m();
        }
    }

    @Override
    public final int e(t3.g gVar, t3.q qVar) {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f26510a.a(gVar);
            if (z10 && C(qVar, gVar.r())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f26513c.size(); i10++) {
            c valueAt = this.f26513c.valueAt(i10);
            valueAt.e();
            valueAt.i();
        }
        return -1;
    }

    @Override
    public final void f(h hVar) {
        this.f26511a0 = hVar;
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void i(int i10) {
        if (this.C == null || this.D == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i10);
            sb2.append(" must be in a Cues");
            throw k2.a(sb2.toString(), null);
        }
    }

    @Override
    public final boolean j(t3.g gVar) {
        return new f().b(gVar);
    }

    @EnsuresNonNull({"currentTrack"})
    public final void k(int i10) {
        if (this.f26531u == null) {
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Element ");
            sb2.append(i10);
            sb2.append(" must be in a TrackEntry");
            throw k2.a(sb2.toString(), null);
        }
    }

    @EnsuresNonNull({"extractorOutput"})
    public final void l() {
        c5.a.h(this.f26511a0);
    }

    public void m(int r22, int r23, t3.g r24) {
        throw new UnsupportedOperationException("Method not decompiled: y3.e.m(int, int, t3.g):void");
    }

    public final com.google.android.exoplayer2.extractor.g n(c5.t tVar, c5.t tVar2) {
        int i10;
        if (this.f26527q == -1 || this.f26530t == -9223372036854775807L || tVar == null || tVar.c() == 0 || tVar2 == null || tVar2.c() != tVar.c()) {
            return new g.b(this.f26530t);
        }
        int c10 = tVar.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            jArr3[i12] = tVar.b(i12);
            jArr[i12] = this.f26527q + tVar2.b(i12);
        }
        while (true) {
            i10 = c10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f26527q + this.f26526p) - jArr[i10]);
        jArr2[i10] = this.f26530t - jArr3[i10];
        long j10 = jArr2[i10];
        if (j10 <= 0) {
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("Discarding last cue point with unexpected duration: ");
            sb2.append(j10);
            s.i("MatroskaExtractor", sb2.toString());
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new com.google.android.exoplayer2.extractor.b(iArr, jArr, jArr2, jArr3);
    }

    @RequiresNonNull({"#1.output"})
    public final void o(c cVar, long j10, int i10, int i11, int i12) {
        u uVar = cVar.T;
        if (uVar != null) {
            uVar.c(cVar.X, j10, i10, i11, i12, cVar.f26547j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f26539b) || "S_TEXT/ASS".equals(cVar.f26539b) || "S_TEXT/WEBVTT".equals(cVar.f26539b)) {
                if (this.K > 1) {
                    s.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        s.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        G(cVar.f26539b, j11, this.f26521k.d());
                        int e10 = this.f26521k.e();
                        while (true) {
                            if (e10 >= this.f26521k.f()) {
                                break;
                            } else if (this.f26521k.d()[e10] == 0) {
                                this.f26521k.O(e10);
                                break;
                            } else {
                                e10++;
                            }
                        }
                        t3.t tVar = cVar.X;
                        b0 b0Var = this.f26521k;
                        tVar.d(b0Var, b0Var.f());
                        i11 += this.f26521k.f();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    i10 &= -268435457;
                } else {
                    int f10 = this.f26524n.f();
                    cVar.X.e(this.f26524n, f10, 2);
                    i11 += f10;
                }
            }
            cVar.X.f(j10, i10, i11, i12, cVar.f26547j);
        }
        this.F = true;
    }

    public void p(int i10) {
        l();
        if (i10 != 160) {
            if (i10 == 174) {
                c cVar = (c) c5.a.h(this.f26531u);
                String str = cVar.f26539b;
                if (str != null) {
                    if (z(str)) {
                        cVar.h(this.f26511a0, cVar.f26540c);
                        this.f26513c.put(cVar.f26540c, cVar);
                    }
                    this.f26531u = null;
                    return;
                }
                throw k2.a("CodecId is missing in TrackEntry element", null);
            } else if (i10 == 19899) {
                int i11 = this.f26533w;
                if (i11 != -1) {
                    long j10 = this.f26534x;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.f26536z = j10;
                            return;
                        }
                        return;
                    }
                }
                throw k2.a("Mandatory element SeekID or SeekPosition not found", null);
            } else if (i10 == 25152) {
                k(i10);
                c cVar2 = this.f26531u;
                if (!cVar2.f26545h) {
                    return;
                }
                if (cVar2.f26547j != null) {
                    cVar2.f26549l = new m(new m.b(i.f16676a, "video/webm", this.f26531u.f26547j.f22904b));
                    return;
                }
                throw k2.a("Encrypted Track found but ContentEncKeyID was not found", null);
            } else if (i10 == 28032) {
                k(i10);
                c cVar3 = this.f26531u;
                if (cVar3.f26545h && cVar3.f26546i != null) {
                    throw k2.a("Combining encryption and compression is not supported", null);
                }
            } else if (i10 == 357149030) {
                if (this.f26528r == -9223372036854775807L) {
                    this.f26528r = 1000000L;
                }
                long j11 = this.f26529s;
                if (j11 != -9223372036854775807L) {
                    this.f26530t = F(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515) {
                    if (!this.f26532v) {
                        this.f26511a0.a(n(this.C, this.D));
                        this.f26532v = true;
                    }
                    this.C = null;
                    this.D = null;
                }
            } else if (this.f26513c.size() != 0) {
                this.f26511a0.k();
            } else {
                throw k2.a("No valid tracks were found", null);
            }
        } else if (this.G == 2) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.K; i13++) {
                i12 += this.L[i13];
            }
            c cVar4 = this.f26513c.get(this.M);
            cVar4.e();
            for (int i14 = 0; i14 < this.K; i14++) {
                long j12 = ((cVar4.f26542e * i14) / 1000) + this.H;
                int i15 = this.O;
                if (i14 == 0 && !this.Q) {
                    i15 |= 1;
                }
                int i16 = this.L[i14];
                i12 -= i16;
                o(cVar4, j12, i15, i16, i12);
            }
            this.G = 0;
        }
    }

    public final int r() {
        int i10 = this.S;
        E();
        return i10;
    }

    public void s(int i10, double d10) {
        if (i10 == 181) {
            u(i10).Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    u(i10).D = (float) d10;
                    return;
                case 21970:
                    u(i10).E = (float) d10;
                    return;
                case 21971:
                    u(i10).F = (float) d10;
                    return;
                case 21972:
                    u(i10).G = (float) d10;
                    return;
                case 21973:
                    u(i10).H = (float) d10;
                    return;
                case 21974:
                    u(i10).I = (float) d10;
                    return;
                case 21975:
                    u(i10).J = (float) d10;
                    return;
                case 21976:
                    u(i10).K = (float) d10;
                    return;
                case 21977:
                    u(i10).L = (float) d10;
                    return;
                case 21978:
                    u(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            u(i10).f26556s = (float) d10;
                            return;
                        case 30324:
                            u(i10).f26557t = (float) d10;
                            return;
                        case 30325:
                            u(i10).f26558u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f26529s = (long) d10;
        }
    }

    public c u(int i10) {
        k(i10);
        return this.f26531u;
    }

    public int v(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void w(c cVar, t3.g gVar, int i10) {
        if (cVar.f26544g == 1685485123 || cVar.f26544g == 1685480259) {
            byte[] bArr = new byte[i10];
            cVar.N = bArr;
            gVar.readFully(bArr, 0, i10);
            return;
        }
        gVar.n(i10);
    }

    public void x(c cVar, int i10, t3.g gVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f26539b)) {
            gVar.n(i11);
            return;
        }
        this.f26524n.L(i11);
        gVar.readFully(this.f26524n.d(), 0, i11);
    }

    public void y(int i10, long j10) {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        u(i10).f26541d = (int) j10;
                        return;
                    case 136:
                        c u10 = u(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        u10.V = z10;
                        return;
                    case 155:
                        this.I = F(j10);
                        return;
                    case 159:
                        u(i10).O = (int) j10;
                        return;
                    case 176:
                        u(i10).f26550m = (int) j10;
                        return;
                    case 179:
                        i(i10);
                        this.C.a(F(j10));
                        return;
                    case 186:
                        u(i10).f26551n = (int) j10;
                        return;
                    case 215:
                        u(i10).f26540c = (int) j10;
                        return;
                    case 231:
                        this.B = F(j10);
                        return;
                    case 238:
                        this.P = (int) j10;
                        return;
                    case 241:
                        if (!this.E) {
                            i(i10);
                            this.D.a(j10);
                            this.E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.Q = true;
                        return;
                    case 16871:
                        u(i10).f26544g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            StringBuilder sb2 = new StringBuilder(50);
                            sb2.append("ContentCompAlgo ");
                            sb2.append(j10);
                            sb2.append(" not supported");
                            throw k2.a(sb2.toString(), null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            StringBuilder sb3 = new StringBuilder(53);
                            sb3.append("DocTypeReadVersion ");
                            sb3.append(j10);
                            sb3.append(" not supported");
                            throw k2.a(sb3.toString(), null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            StringBuilder sb4 = new StringBuilder(50);
                            sb4.append("EBMLReadVersion ");
                            sb4.append(j10);
                            sb4.append(" not supported");
                            throw k2.a(sb4.toString(), null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            StringBuilder sb5 = new StringBuilder(49);
                            sb5.append("ContentEncAlgo ");
                            sb5.append(j10);
                            sb5.append(" not supported");
                            throw k2.a(sb5.toString(), null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            StringBuilder sb6 = new StringBuilder(56);
                            sb6.append("AESSettingsCipherMode ");
                            sb6.append(j10);
                            sb6.append(" not supported");
                            throw k2.a(sb6.toString(), null);
                        }
                        return;
                    case 21420:
                        this.f26534x = j10 + this.f26527q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        k(i10);
                        if (i11 == 0) {
                            this.f26531u.f26560w = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f26531u.f26560w = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f26531u.f26560w = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f26531u.f26560w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        u(i10).f26552o = (int) j10;
                        return;
                    case 21682:
                        u(i10).f26554q = (int) j10;
                        return;
                    case 21690:
                        u(i10).f26553p = (int) j10;
                        return;
                    case 21930:
                        c u11 = u(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        u11.U = z10;
                        return;
                    case 21998:
                        u(i10).f26543f = (int) j10;
                        return;
                    case 22186:
                        u(i10).R = j10;
                        return;
                    case 22203:
                        u(i10).S = j10;
                        return;
                    case 25188:
                        u(i10).P = (int) j10;
                        return;
                    case 30321:
                        k(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f26531u.f26555r = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f26531u.f26555r = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f26531u.f26555r = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f26531u.f26555r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        u(i10).f26542e = (int) j10;
                        return;
                    case 2807729:
                        this.f26528r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                k(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f26531u.A = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f26531u.A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                k(i10);
                                int c10 = d5.c.c((int) j10);
                                if (c10 != -1) {
                                    this.f26531u.f26563z = c10;
                                    return;
                                }
                                return;
                            case 21947:
                                k(i10);
                                this.f26531u.f26561x = true;
                                int b10 = d5.c.b((int) j10);
                                if (b10 != -1) {
                                    this.f26531u.f26562y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                u(i10).B = (int) j10;
                                return;
                            case 21949:
                                u(i10).C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                StringBuilder sb7 = new StringBuilder(55);
                sb7.append("ContentEncodingScope ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw k2.a(sb7.toString(), null);
            }
        } else if (j10 != 0) {
            StringBuilder sb8 = new StringBuilder(55);
            sb8.append("ContentEncodingOrder ");
            sb8.append(j10);
            sb8.append(" not supported");
            throw k2.a(sb8.toString(), null);
        }
    }

    public e(int i10) {
        this(new y3.a(), i10);
    }

    public e(y3.c cVar, int i10) {
        this.f26527q = -1L;
        this.f26528r = -9223372036854775807L;
        this.f26529s = -9223372036854775807L;
        this.f26530t = -9223372036854775807L;
        this.f26536z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f26510a = cVar;
        cVar.b(new b());
        this.f26514d = (i10 & 1) == 0;
        this.f26512b = new g();
        this.f26513c = new SparseArray<>();
        this.f26517g = new b0(4);
        this.f26518h = new b0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f26519i = new b0(4);
        this.f26515e = new b0(x.f4901a);
        this.f26516f = new b0(4);
        this.f26520j = new b0();
        this.f26521k = new b0();
        this.f26522l = new b0(8);
        this.f26523m = new b0();
        this.f26524n = new b0();
        this.L = new int[1];
    }
}
