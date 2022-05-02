package p340y3;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.AbstractC3470g;
import com.google.android.exoplayer2.extractor.C3464b;
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
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1231t;
import p020b5.C1237x;
import p032c5.C1608c;
import p039d.C3563j;
import p174m3.C6556a2;
import p174m3.C6615i;
import p230q3.C8201m;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8971q;
import p270t3.C8976u;

public class C10365e implements AbstractC8958f {
    public static final AbstractC8965l f33248b0 = C10364d.f33247b;
    public static final byte[] f33249c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f33250d0 = C1216l0.m37980e0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] f33251e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final UUID f33252f0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map<String, Integer> f33253g0;
    public long f33254A;
    public long f33255B;
    public C1231t f33256C;
    public C1231t f33257D;
    public boolean f33258E;
    public boolean f33259F;
    public int f33260G;
    public long f33261H;
    public long f33262I;
    public int f33263J;
    public int f33264K;
    public int[] f33265L;
    public int f33266M;
    public int f33267N;
    public int f33268O;
    public int f33269P;
    public boolean f33270Q;
    public int f33271R;
    public int f33272S;
    public int f33273T;
    public boolean f33274U;
    public boolean f33275V;
    public boolean f33276W;
    public int f33277X;
    public byte f33278Y;
    public boolean f33279Z;
    public final AbstractC10363c f33280a;
    public AbstractC8960h f33281a0;
    public final C10370g f33282b;
    public final SparseArray<C10368c> f33283c;
    public final boolean f33284d;
    public final C1189b0 f33285e;
    public final C1189b0 f33286f;
    public final C1189b0 f33287g;
    public final C1189b0 f33288h;
    public final C1189b0 f33289i;
    public final C1189b0 f33290j;
    public final C1189b0 f33291k;
    public final C1189b0 f33292l;
    public final C1189b0 f33293m;
    public final C1189b0 f33294n;
    public ByteBuffer f33295o;
    public long f33296p;
    public long f33297q;
    public long f33298r;
    public long f33299s;
    public long f33300t;
    public C10368c f33301u;
    public boolean f33302v;
    public int f33303w;
    public long f33304x;
    public boolean f33305y;
    public long f33306z;

    public final class C10367b implements AbstractC10362b {
        public C10367b() {
        }

        @Override
        public void mo5316a(int i) {
            C10365e.this.m5327p(i);
        }

        @Override
        public int mo5315b(int i) {
            return C10365e.this.m5321v(i);
        }

        @Override
        public boolean mo5314c(int i) {
            return C10365e.this.m5350A(i);
        }

        @Override
        public void mo5313d(int i, int i2, AbstractC8959g gVar) {
            C10365e.this.m5330m(i, i2, gVar);
        }

        @Override
        public void mo5312e(int i, String str) {
            C10365e.this.m5342I(i, str);
        }

        @Override
        public void mo5311f(int i, double d) {
            C10365e.this.m5324s(i, d);
        }

        @Override
        public void mo5310g(int i, long j, long j2) {
            C10365e.this.m5343H(i, j, j2);
        }

        @Override
        public void mo5309h(int i, long j) {
            C10365e.this.m5318y(i, j);
        }
    }

    public static final class C10368c {
        public int f33308A;
        public int f33309B;
        public int f33310C;
        public float f33311D;
        public float f33312E;
        public float f33313F;
        public float f33314G;
        public float f33315H;
        public float f33316I;
        public float f33317J;
        public float f33318K;
        public float f33319L;
        public float f33320M;
        public byte[] f33321N;
        public int f33322O;
        public int f33323P;
        public int f33324Q;
        public long f33325R;
        public long f33326S;
        public C8976u f33327T;
        public boolean f33328U;
        public boolean f33329V;
        public String f33330W;
        public AbstractC8974t f33331X;
        public int f33332Y;
        public String f33333a;
        public String f33334b;
        public int f33335c;
        public int f33336d;
        public int f33337e;
        public int f33338f;
        public int f33339g;
        public boolean f33340h;
        public byte[] f33341i;
        public AbstractC8974t.C8975a f33342j;
        public byte[] f33343k;
        public C8201m f33344l;
        public int f33345m;
        public int f33346n;
        public int f33347o;
        public int f33348p;
        public int f33349q;
        public int f33350r;
        public float f33351s;
        public float f33352t;
        public float f33353u;
        public byte[] f33354v;
        public int f33355w;
        public boolean f33356x;
        public int f33357y;
        public int f33358z;

        public C10368c() {
            this.f33345m = -1;
            this.f33346n = -1;
            this.f33347o = -1;
            this.f33348p = -1;
            this.f33349q = 0;
            this.f33350r = -1;
            this.f33351s = 0.0f;
            this.f33352t = 0.0f;
            this.f33353u = 0.0f;
            this.f33354v = null;
            this.f33355w = -1;
            this.f33356x = false;
            this.f33357y = -1;
            this.f33358z = -1;
            this.f33308A = -1;
            this.f33309B = 1000;
            this.f33310C = 200;
            this.f33311D = -1.0f;
            this.f33312E = -1.0f;
            this.f33313F = -1.0f;
            this.f33314G = -1.0f;
            this.f33315H = -1.0f;
            this.f33316I = -1.0f;
            this.f33317J = -1.0f;
            this.f33318K = -1.0f;
            this.f33319L = -1.0f;
            this.f33320M = -1.0f;
            this.f33322O = 1;
            this.f33323P = -1;
            this.f33324Q = 8000;
            this.f33325R = 0L;
            this.f33326S = 0L;
            this.f33329V = true;
            this.f33330W = "eng";
        }

        public static Pair<String, List<byte[]>> m5299j(C1189b0 b0Var) {
            try {
                b0Var.m38146Q(16);
                long t = b0Var.m38126t();
                if (t == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (t == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (t == 826496599) {
                    byte[] d = b0Var.m38142d();
                    for (int e = b0Var.m38141e() + 20; e < d.length - 4; e++) {
                        if (d[e] == 0 && d[e + 1] == 0 && d[e + 2] == 1 && d[e + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d, e, d.length)));
                        }
                    }
                    throw C6556a2.m20113a("Failed to find FourCC VC1 initialization data", null);
                }
                C1230s.m37884i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6556a2.m20113a("Error parsing FourCC private data", null);
            }
        }

        public static boolean m5298k(C1189b0 b0Var) {
            try {
                int v = b0Var.m38124v();
                if (v == 1) {
                    return true;
                }
                if (v != 65534) {
                    return false;
                }
                b0Var.m38147P(24);
                if (b0Var.m38123w() == C10365e.f33252f0.getMostSignificantBits()) {
                    if (b0Var.m38123w() == C10365e.f33252f0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6556a2.m20113a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List<byte[]> m5297l(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while ((bArr[i] & 255) == 255) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + (bArr[i] & 255);
                    int i5 = 0;
                    while ((bArr[i3] & 255) == 255) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (bArr[i3] & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i9];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw C6556a2.m20113a("Error parsing vorbis codec private", null);
                        }
                        throw C6556a2.m20113a("Error parsing vorbis codec private", null);
                    }
                    throw C6556a2.m20113a("Error parsing vorbis codec private", null);
                }
                throw C6556a2.m20113a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6556a2.m20113a("Error parsing vorbis codec private", null);
            }
        }

        @EnsuresNonNull({"output"})
        public final void m5304e() {
            C1186a.m38188e(this.f33331X);
        }

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] m5303f(String str) {
            byte[] bArr = this.f33343k;
            if (bArr != null) {
                return bArr;
            }
            String valueOf = String.valueOf(str);
            throw C6556a2.m20113a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
        }

        public final byte[] m5302g() {
            if (this.f33311D == -1.0f || this.f33312E == -1.0f || this.f33313F == -1.0f || this.f33314G == -1.0f || this.f33315H == -1.0f || this.f33316I == -1.0f || this.f33317J == -1.0f || this.f33318K == -1.0f || this.f33319L == -1.0f || this.f33320M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f33311D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f33312E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f33313F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f33314G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f33315H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f33316I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f33317J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f33318K * 50000.0f) + 0.5f));
            order.putShort((short) (this.f33319L + 0.5f));
            order.putShort((short) (this.f33320M + 0.5f));
            order.putShort((short) this.f33309B);
            order.putShort((short) this.f33310C);
            return bArr;
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        public void m5301h(p270t3.AbstractC8960h r20, int r21) {
            throw new UnsupportedOperationException("Method not decompiled: p340y3.C10365e.C10368c.m5301h(t3.h, int):void");
        }

        @RequiresNonNull({"output"})
        public void m5300i() {
            C8976u uVar = this.f33327T;
            if (uVar != null) {
                uVar.m10791a(this.f33331X, this.f33342j);
            }
        }

        public void m5296m() {
            C8976u uVar = this.f33327T;
            if (uVar != null) {
                uVar.m10790b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f33253g0 = Collections.unmodifiableMap(hashMap);
    }

    public C10365e() {
        this(0);
    }

    public static AbstractC8958f[] m5349B() {
        return new AbstractC8958f[]{new C10365e()};
    }

    public static void m5344G(String str, long j, byte[] bArr) {
        int i;
        byte[] bArr2;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArr2 = m5323t(j, "%01d:%02d:%02d:%02d", 10000L);
            i = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArr2 = m5323t(j, "%02d:%02d:%02d,%03d", 1000L);
            i = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    public static int[] m5326q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    public static byte[] m5323t(long j, String str, long j2) {
        C1186a.m38192a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return C1216l0.m37980e0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    public static boolean m5317z(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 31;
                    break;
                }
                break;
        }
        switch (c) {
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
            case C3563j.f11955K3:
            case 25:
            case 26:
            case 27:
            case 28:
            case C3563j.f11980P3:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    public boolean m5350A(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public final boolean m5348C(C8971q qVar, long j) {
        if (this.f33305y) {
            this.f33254A = j;
            qVar.f28860a = this.f33306z;
            this.f33305y = false;
            return true;
        }
        if (this.f33302v) {
            long j2 = this.f33254A;
            if (j2 != -1) {
                qVar.f28860a = j2;
                this.f33254A = -1L;
                return true;
            }
        }
        return false;
    }

    public final void m5347D(AbstractC8959g gVar, int i) {
        if (this.f33287g.m38140f() < i) {
            if (this.f33287g.m38144b() < i) {
                C1189b0 b0Var = this.f33287g;
                b0Var.m38143c(Math.max(b0Var.m38144b() * 2, i));
            }
            gVar.readFully(this.f33287g.m38142d(), this.f33287g.m38140f(), i - this.f33287g.m38140f());
            this.f33287g.m38148O(i);
        }
    }

    public final void m5346E() {
        this.f33271R = 0;
        this.f33272S = 0;
        this.f33273T = 0;
        this.f33274U = false;
        this.f33275V = false;
        this.f33276W = false;
        this.f33277X = 0;
        this.f33278Y = (byte) 0;
        this.f33279Z = false;
        this.f33290j.m38151L(0);
    }

    public final long m5345F(long j) {
        long j2 = this.f33298r;
        if (j2 != -9223372036854775807L) {
            return C1216l0.m37940y0(j, j2, 1000L);
        }
        throw C6556a2.m20113a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void m5343H(int i, long j, long j2) {
        m5331l();
        if (i == 160) {
            this.f33270Q = false;
        } else if (i == 174) {
            this.f33301u = new C10368c();
        } else if (i == 187) {
            this.f33258E = false;
        } else if (i == 19899) {
            this.f33303w = -1;
            this.f33304x = -1L;
        } else if (i == 20533) {
            m5322u(i).f33340h = true;
        } else if (i == 21968) {
            m5322u(i).f33356x = true;
        } else if (i == 408125543) {
            long j3 = this.f33297q;
            if (j3 == -1 || j3 == j) {
                this.f33297q = j;
                this.f33296p = j2;
                return;
            }
            throw C6556a2.m20113a("Multiple Segment elements not supported", null);
        } else if (i == 475249515) {
            this.f33256C = new C1231t();
            this.f33257D = new C1231t();
        } else if (i != 524531317 || this.f33302v) {
        } else {
            if (!this.f33284d || this.f33306z == -1) {
                this.f33281a0.mo6042a(new AbstractC3470g.C3472b(this.f33300t));
                this.f33302v = true;
                return;
            }
            this.f33305y = true;
        }
    }

    public void m5342I(int i, String str) {
        if (i == 134) {
            m5322u(i).f33334b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m5322u(i).f33333a = str;
            } else if (i == 2274716) {
                m5322u(i).f33330W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw C6556a2.m20113a(sb2.toString(), null);
        }
    }

    @RequiresNonNull({"#2.output"})
    public final int m5341J(AbstractC8959g gVar, C10368c cVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f33334b)) {
            m5340K(gVar, f33249c0, i);
            return m5325r();
        } else if ("S_TEXT/ASS".equals(cVar.f33334b)) {
            m5340K(gVar, f33251e0, i);
            return m5325r();
        } else {
            AbstractC8974t tVar = cVar.f33331X;
            boolean z = true;
            if (!this.f33274U) {
                if (cVar.f33340h) {
                    this.f33268O &= -1073741825;
                    boolean z2 = this.f33275V;
                    int i3 = Log.TAG_YOUTUBE;
                    if (!z2) {
                        gVar.readFully(this.f33287g.m38142d(), 0, 1);
                        this.f33271R++;
                        if ((this.f33287g.m38142d()[0] & 128) != 128) {
                            this.f33278Y = this.f33287g.m38142d()[0];
                            this.f33275V = true;
                        } else {
                            throw C6556a2.m20113a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b = this.f33278Y;
                    if ((b & 1) == 1) {
                        boolean z3 = (b & 2) == 2;
                        this.f33268O |= Log.TAG_TDLIB_OPTIONS;
                        if (!this.f33279Z) {
                            gVar.readFully(this.f33292l.m38142d(), 0, 8);
                            this.f33271R += 8;
                            this.f33279Z = true;
                            byte[] d = this.f33287g.m38142d();
                            if (!z3) {
                                i3 = 0;
                            }
                            d[0] = (byte) (i3 | 8);
                            this.f33287g.m38147P(0);
                            tVar.mo10796b(this.f33287g, 1, 1);
                            this.f33272S++;
                            this.f33292l.m38147P(0);
                            tVar.mo10796b(this.f33292l, 8, 1);
                            this.f33272S += 8;
                        }
                        if (z3) {
                            if (!this.f33276W) {
                                gVar.readFully(this.f33287g.m38142d(), 0, 1);
                                this.f33271R++;
                                this.f33287g.m38147P(0);
                                this.f33277X = this.f33287g.m38159D();
                                this.f33276W = true;
                            }
                            int i4 = this.f33277X * 4;
                            this.f33287g.m38151L(i4);
                            gVar.readFully(this.f33287g.m38142d(), 0, i4);
                            this.f33271R += i4;
                            short s = (short) ((this.f33277X / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f33295o;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f33295o = ByteBuffer.allocate(i5);
                            }
                            this.f33295o.position(0);
                            this.f33295o.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f33277X;
                                if (i6 >= i2) {
                                    break;
                                }
                                int H = this.f33287g.m38155H();
                                if (i6 % 2 == 0) {
                                    this.f33295o.putShort((short) (H - i7));
                                } else {
                                    this.f33295o.putInt(H - i7);
                                }
                                i6++;
                                i7 = H;
                            }
                            int i8 = (i - this.f33271R) - i7;
                            if (i2 % 2 == 1) {
                                this.f33295o.putInt(i8);
                            } else {
                                this.f33295o.putShort((short) i8);
                                this.f33295o.putInt(0);
                            }
                            this.f33293m.m38149N(this.f33295o.array(), i5);
                            tVar.mo10796b(this.f33293m, i5, 1);
                            this.f33272S += i5;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f33341i;
                    if (bArr != null) {
                        this.f33290j.m38149N(bArr, bArr.length);
                    }
                }
                if (cVar.f33338f > 0) {
                    this.f33268O |= 268435456;
                    this.f33294n.m38151L(0);
                    this.f33287g.m38151L(4);
                    this.f33287g.m38142d()[0] = (byte) ((i >> 24) & 255);
                    this.f33287g.m38142d()[1] = (byte) ((i >> 16) & 255);
                    this.f33287g.m38142d()[2] = (byte) ((i >> 8) & 255);
                    this.f33287g.m38142d()[3] = (byte) (i & 255);
                    tVar.mo10796b(this.f33287g, 4, 2);
                    this.f33272S += 4;
                }
                this.f33274U = true;
            }
            int f = i + this.f33290j.m38140f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f33334b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f33334b)) {
                if (cVar.f33327T != null) {
                    if (this.f33290j.m38140f() != 0) {
                        z = false;
                    }
                    C1186a.m38187f(z);
                    cVar.f33327T.m10788d(gVar);
                }
                while (true) {
                    int i9 = this.f33271R;
                    if (i9 >= f) {
                        break;
                    }
                    int L = m5339L(gVar, tVar, f - i9);
                    this.f33271R += L;
                    this.f33272S += L;
                }
            } else {
                byte[] d2 = this.f33286f.m38142d();
                d2[0] = 0;
                d2[1] = 0;
                d2[2] = 0;
                int i10 = cVar.f33332Y;
                int i11 = 4 - i10;
                while (this.f33271R < f) {
                    int i12 = this.f33273T;
                    if (i12 == 0) {
                        m5338M(gVar, d2, i11, i10);
                        this.f33271R += i10;
                        this.f33286f.m38147P(0);
                        this.f33273T = this.f33286f.m38155H();
                        this.f33285e.m38147P(0);
                        tVar.mo10795c(this.f33285e, 4);
                        this.f33272S += 4;
                    } else {
                        int L2 = m5339L(gVar, tVar, i12);
                        this.f33271R += L2;
                        this.f33272S += L2;
                        this.f33273T -= L2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f33334b)) {
                this.f33288h.m38147P(0);
                tVar.mo10795c(this.f33288h, 4);
                this.f33272S += 4;
            }
            return m5325r();
        }
    }

    public final void m5340K(AbstractC8959g gVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.f33291k.m38144b() < length) {
            this.f33291k.m38150M(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f33291k.m38142d(), 0, bArr.length);
        }
        gVar.readFully(this.f33291k.m38142d(), bArr.length, i);
        this.f33291k.m38147P(0);
        this.f33291k.m38148O(length);
    }

    public final int m5339L(AbstractC8959g gVar, AbstractC8974t tVar, int i) {
        int a = this.f33290j.m38145a();
        if (a <= 0) {
            return tVar.mo10794d(gVar, i, false);
        }
        int min = Math.min(i, a);
        tVar.mo10795c(this.f33290j, min);
        return min;
    }

    public final void m5338M(AbstractC8959g gVar, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f33290j.m38145a());
        gVar.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f33290j.m38136j(bArr, i, min);
        }
    }

    @Override
    public final void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f33255B = -9223372036854775807L;
        this.f33260G = 0;
        this.f33280a.mo5351c();
        this.f33282b.m5289e();
        m5346E();
        for (int i = 0; i < this.f33283c.size(); i++) {
            this.f33283c.valueAt(i).m5296m();
        }
    }

    @Override
    public final int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        this.f33259F = false;
        boolean z = true;
        while (z && !this.f33259F) {
            z = this.f33280a.mo5353a(gVar);
            if (z && m5348C(qVar, gVar.mo6043r())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f33283c.size(); i++) {
            C10368c valueAt = this.f33283c.valueAt(i);
            valueAt.m5304e();
            valueAt.m5300i();
        }
        return -1;
    }

    @Override
    public final void mo1148f(AbstractC8960h hVar) {
        this.f33281a0 = hVar;
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void m5333i(int i) {
        if (this.f33256C == null || this.f33257D == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i);
            sb2.append(" must be in a Cues");
            throw C6556a2.m20113a(sb2.toString(), null);
        }
    }

    @Override
    public final boolean mo1144j(AbstractC8959g gVar) {
        return new C10369f().m5294b(gVar);
    }

    @EnsuresNonNull({"currentTrack"})
    public final void m5332k(int i) {
        if (this.f33301u == null) {
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Element ");
            sb2.append(i);
            sb2.append(" must be in a TrackEntry");
            throw C6556a2.m20113a(sb2.toString(), null);
        }
    }

    @EnsuresNonNull({"extractorOutput"})
    public final void m5331l() {
        C1186a.m38185h(this.f33281a0);
    }

    public void m5330m(int r22, int r23, p270t3.AbstractC8959g r24) {
        throw new UnsupportedOperationException("Method not decompiled: p340y3.C10365e.m5330m(int, int, t3.g):void");
    }

    public final AbstractC3470g m5329n(C1231t tVar, C1231t tVar2) {
        int i;
        if (this.f33297q == -1 || this.f33300t == -9223372036854775807L || tVar == null || tVar.m37880c() == 0 || tVar2 == null || tVar2.m37880c() != tVar.m37880c()) {
            return new AbstractC3470g.C3472b(this.f33300t);
        }
        int c = tVar.m37880c();
        int[] iArr = new int[c];
        long[] jArr = new long[c];
        long[] jArr2 = new long[c];
        long[] jArr3 = new long[c];
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            jArr3[i3] = tVar.m37881b(i3);
            jArr[i3] = this.f33297q + tVar2.m37881b(i3);
        }
        while (true) {
            i = c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.f33297q + this.f33296p) - jArr[i]);
        jArr2[i] = this.f33300t - jArr3[i];
        long j = jArr2[i];
        if (j <= 0) {
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("Discarding last cue point with unexpected duration: ");
            sb2.append(j);
            C1230s.m37884i("MatroskaExtractor", sb2.toString());
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new C3464b(iArr, jArr, jArr2, jArr3);
    }

    @RequiresNonNull({"#1.output"})
    public final void m5328o(C10368c cVar, long j, int i, int i2, int i3) {
        C8976u uVar = cVar.f33327T;
        if (uVar != null) {
            uVar.m10789c(cVar.f33331X, j, i, i2, i3, cVar.f33342j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f33334b) || "S_TEXT/ASS".equals(cVar.f33334b)) {
                if (this.f33264K > 1) {
                    C1230s.m37884i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f33262I;
                    if (j2 == -9223372036854775807L) {
                        C1230s.m37884i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m5344G(cVar.f33334b, j2, this.f33291k.m38142d());
                        int e = this.f33291k.m38141e();
                        while (true) {
                            if (e >= this.f33291k.m38140f()) {
                                break;
                            } else if (this.f33291k.m38142d()[e] == 0) {
                                this.f33291k.m38148O(e);
                                break;
                            } else {
                                e++;
                            }
                        }
                        AbstractC8974t tVar = cVar.f33331X;
                        C1189b0 b0Var = this.f33291k;
                        tVar.mo10795c(b0Var, b0Var.m38140f());
                        i2 += this.f33291k.m38140f();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f33264K > 1) {
                    i &= -268435457;
                } else {
                    int f = this.f33294n.m38140f();
                    cVar.f33331X.mo10796b(this.f33294n, f, 2);
                    i2 += f;
                }
            }
            cVar.f33331X.mo10793e(j, i, i2, i3, cVar.f33342j);
        }
        this.f33259F = true;
    }

    public void m5327p(int i) {
        m5331l();
        if (i != 160) {
            if (i == 174) {
                C10368c cVar = (C10368c) C1186a.m38185h(this.f33301u);
                String str = cVar.f33334b;
                if (str != null) {
                    if (m5317z(str)) {
                        cVar.m5301h(this.f33281a0, cVar.f33335c);
                        this.f33283c.put(cVar.f33335c, cVar);
                    }
                    this.f33301u = null;
                    return;
                }
                throw C6556a2.m20113a("CodecId is missing in TrackEntry element", null);
            } else if (i == 19899) {
                int i2 = this.f33303w;
                if (i2 != -1) {
                    long j = this.f33304x;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f33306z = j;
                            return;
                        }
                        return;
                    }
                }
                throw C6556a2.m20113a("Mandatory element SeekID or SeekPosition not found", null);
            } else if (i == 25152) {
                m5332k(i);
                C10368c cVar2 = this.f33301u;
                if (!cVar2.f33340h) {
                    return;
                }
                if (cVar2.f33342j != null) {
                    cVar2.f33344l = new C8201m(new C8201m.C8203b(C6615i.f20675a, "video/webm", this.f33301u.f33342j.f28865b));
                    return;
                }
                throw C6556a2.m20113a("Encrypted Track found but ContentEncKeyID was not found", null);
            } else if (i == 28032) {
                m5332k(i);
                C10368c cVar3 = this.f33301u;
                if (cVar3.f33340h && cVar3.f33341i != null) {
                    throw C6556a2.m20113a("Combining encryption and compression is not supported", null);
                }
            } else if (i == 357149030) {
                if (this.f33298r == -9223372036854775807L) {
                    this.f33298r = 1000000L;
                }
                long j2 = this.f33299s;
                if (j2 != -9223372036854775807L) {
                    this.f33300t = m5345F(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515) {
                    if (!this.f33302v) {
                        this.f33281a0.mo6042a(m5329n(this.f33256C, this.f33257D));
                        this.f33302v = true;
                    }
                    this.f33256C = null;
                    this.f33257D = null;
                }
            } else if (this.f33283c.size() != 0) {
                this.f33281a0.mo6040m();
            } else {
                throw C6556a2.m20113a("No valid tracks were found", null);
            }
        } else if (this.f33260G == 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f33264K; i4++) {
                i3 += this.f33265L[i4];
            }
            C10368c cVar4 = this.f33283c.get(this.f33266M);
            cVar4.m5304e();
            for (int i5 = 0; i5 < this.f33264K; i5++) {
                long j3 = ((cVar4.f33337e * i5) / 1000) + this.f33261H;
                int i6 = this.f33268O;
                if (i5 == 0 && !this.f33270Q) {
                    i6 |= 1;
                }
                int i7 = this.f33265L[i5];
                i3 -= i7;
                m5328o(cVar4, j3, i6, i7, i3);
            }
            this.f33260G = 0;
        }
    }

    public final int m5325r() {
        int i = this.f33272S;
        m5346E();
        return i;
    }

    public void m5324s(int i, double d) {
        if (i == 181) {
            m5322u(i).f33324Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m5322u(i).f33311D = (float) d;
                    return;
                case 21970:
                    m5322u(i).f33312E = (float) d;
                    return;
                case 21971:
                    m5322u(i).f33313F = (float) d;
                    return;
                case 21972:
                    m5322u(i).f33314G = (float) d;
                    return;
                case 21973:
                    m5322u(i).f33315H = (float) d;
                    return;
                case 21974:
                    m5322u(i).f33316I = (float) d;
                    return;
                case 21975:
                    m5322u(i).f33317J = (float) d;
                    return;
                case 21976:
                    m5322u(i).f33318K = (float) d;
                    return;
                case 21977:
                    m5322u(i).f33319L = (float) d;
                    return;
                case 21978:
                    m5322u(i).f33320M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m5322u(i).f33351s = (float) d;
                            return;
                        case 30324:
                            m5322u(i).f33352t = (float) d;
                            return;
                        case 30325:
                            m5322u(i).f33353u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f33299s = (long) d;
        }
    }

    public final C10368c m5322u(int i) {
        m5332k(i);
        return this.f33301u;
    }

    public int m5321v(int i) {
        switch (i) {
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

    public void m5320w(C10368c cVar, AbstractC8959g gVar, int i) {
        if (cVar.f33339g == 1685485123 || cVar.f33339g == 1685480259) {
            byte[] bArr = new byte[i];
            cVar.f33321N = bArr;
            gVar.readFully(bArr, 0, i);
            return;
        }
        gVar.mo10807n(i);
    }

    public void m5319x(C10368c cVar, int i, AbstractC8959g gVar, int i2) {
        if (i != 4 || !"V_VP9".equals(cVar.f33334b)) {
            gVar.mo10807n(i2);
            return;
        }
        this.f33294n.m38151L(i2);
        gVar.readFully(this.f33294n.m38142d(), 0, i2);
    }

    public void m5318y(int i, long j) {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m5322u(i).f33336d = (int) j;
                        return;
                    case 136:
                        C10368c u = m5322u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u.f33329V = z;
                        return;
                    case 155:
                        this.f33262I = m5345F(j);
                        return;
                    case 159:
                        m5322u(i).f33322O = (int) j;
                        return;
                    case 176:
                        m5322u(i).f33345m = (int) j;
                        return;
                    case 179:
                        m5333i(i);
                        this.f33256C.m37882a(m5345F(j));
                        return;
                    case 186:
                        m5322u(i).f33346n = (int) j;
                        return;
                    case 215:
                        m5322u(i).f33335c = (int) j;
                        return;
                    case 231:
                        this.f33255B = m5345F(j);
                        return;
                    case 238:
                        this.f33269P = (int) j;
                        return;
                    case 241:
                        if (!this.f33258E) {
                            m5333i(i);
                            this.f33257D.m37882a(j);
                            this.f33258E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f33270Q = true;
                        return;
                    case 16871:
                        m5322u(i).f33339g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb2 = new StringBuilder(50);
                            sb2.append("ContentCompAlgo ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw C6556a2.m20113a(sb2.toString(), null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb3 = new StringBuilder(53);
                            sb3.append("DocTypeReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw C6556a2.m20113a(sb3.toString(), null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb4 = new StringBuilder(50);
                            sb4.append("EBMLReadVersion ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw C6556a2.m20113a(sb4.toString(), null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb5 = new StringBuilder(49);
                            sb5.append("ContentEncAlgo ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw C6556a2.m20113a(sb5.toString(), null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb6 = new StringBuilder(56);
                            sb6.append("AESSettingsCipherMode ");
                            sb6.append(j);
                            sb6.append(" not supported");
                            throw C6556a2.m20113a(sb6.toString(), null);
                        }
                        return;
                    case 21420:
                        this.f33304x = j + this.f33297q;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        m5332k(i);
                        if (i2 == 0) {
                            this.f33301u.f33355w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f33301u.f33355w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f33301u.f33355w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f33301u.f33355w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m5322u(i).f33347o = (int) j;
                        return;
                    case 21682:
                        m5322u(i).f33349q = (int) j;
                        return;
                    case 21690:
                        m5322u(i).f33348p = (int) j;
                        return;
                    case 21930:
                        C10368c u2 = m5322u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u2.f33328U = z;
                        return;
                    case 21998:
                        m5322u(i).f33338f = (int) j;
                        return;
                    case 22186:
                        m5322u(i).f33325R = j;
                        return;
                    case 22203:
                        m5322u(i).f33326S = j;
                        return;
                    case 25188:
                        m5322u(i).f33323P = (int) j;
                        return;
                    case 30321:
                        m5332k(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f33301u.f33350r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f33301u.f33350r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f33301u.f33350r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f33301u.f33350r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m5322u(i).f33337e = (int) j;
                        return;
                    case 2807729:
                        this.f33298r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m5332k(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f33301u.f33308A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f33301u.f33308A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m5332k(i);
                                int c = C1608c.m36290c((int) j);
                                if (c != -1) {
                                    this.f33301u.f33358z = c;
                                    return;
                                }
                                return;
                            case 21947:
                                m5332k(i);
                                this.f33301u.f33356x = true;
                                int b = C1608c.m36291b((int) j);
                                if (b != -1) {
                                    this.f33301u.f33357y = b;
                                    return;
                                }
                                return;
                            case 21948:
                                m5322u(i).f33309B = (int) j;
                                return;
                            case 21949:
                                m5322u(i).f33310C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb7 = new StringBuilder(55);
                sb7.append("ContentEncodingScope ");
                sb7.append(j);
                sb7.append(" not supported");
                throw C6556a2.m20113a(sb7.toString(), null);
            }
        } else if (j != 0) {
            StringBuilder sb8 = new StringBuilder(55);
            sb8.append("ContentEncodingOrder ");
            sb8.append(j);
            sb8.append(" not supported");
            throw C6556a2.m20113a(sb8.toString(), null);
        }
    }

    public C10365e(int i) {
        this(new C10359a(), i);
    }

    public C10365e(AbstractC10363c cVar, int i) {
        this.f33297q = -1L;
        this.f33298r = -9223372036854775807L;
        this.f33299s = -9223372036854775807L;
        this.f33300t = -9223372036854775807L;
        this.f33306z = -1L;
        this.f33254A = -1L;
        this.f33255B = -9223372036854775807L;
        this.f33280a = cVar;
        cVar.mo5352b(new C10367b());
        this.f33284d = (i & 1) == 0;
        this.f33282b = new C10370g();
        this.f33283c = new SparseArray<>();
        this.f33287g = new C1189b0(4);
        this.f33288h = new C1189b0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f33289i = new C1189b0(4);
        this.f33285e = new C1189b0(C1237x.f4572a);
        this.f33286f = new C1189b0(4);
        this.f33290j = new C1189b0();
        this.f33291k = new C1189b0();
        this.f33292l = new C1189b0(8);
        this.f33293m = new C1189b0();
        this.f33294n = new C1189b0();
        this.f33265L = new int[1];
    }
}
