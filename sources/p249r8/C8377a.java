package p249r8;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p039d.C3563j;
import p258s2.C8630c;
import p258s2.C8634g;

@AbstractC8385g(objectTypeIndication = Log.TAG_SPEED_TEXT, tags = {5})
public class C8377a extends AbstractC8380b {
    public static Map<Integer, Integer> f27147V = new HashMap();
    public static Map<Integer, String> f27148W = new HashMap();
    public int f27149A;
    public boolean f27150B;
    public boolean f27151C;
    public boolean f27152D;
    public int f27153E;
    public boolean f27154F;
    public int f27155G;
    public int f27156H;
    public int f27157I;
    public int f27158J;
    public int f27159K;
    public int f27160L;
    public int f27161M;
    public int f27162N;
    public int f27163O;
    public int f27164P;
    public int f27165Q;
    public int f27166R;
    public int f27167S;
    public int f27168T;
    public boolean f27169U;
    public byte[] f27170d;
    public C8378a f27171e;
    public int f27172f;
    public int f27173g;
    public int f27174h;
    public int f27175i;
    public int f27176j;
    public boolean f27177k;
    public boolean f27178l;
    public int f27179m;
    public int f27180n;
    public int f27181o;
    public int f27182p;
    public int f27183q;
    public int f27184r;
    public int f27185s;
    public int f27186t;
    public int f27187u;
    public int f27188v;
    public int f27189w;
    public int f27190x;
    public int f27191y;
    public int f27192z;

    public class C8378a {
        public boolean f27193a;
        public boolean f27194b;
        public boolean f27195c;
        public boolean f27196d;
        public boolean f27197e;
        public boolean f27198f;
        public boolean f27199g;

        public C8378a(int i, C8381c cVar) {
            int i2;
            this.f27193a = cVar.m12631b();
            this.f27194b = cVar.m12631b();
            this.f27195c = cVar.m12631b();
            this.f27196d = cVar.m12631b();
            boolean b = cVar.m12631b();
            this.f27197e = b;
            if (b) {
                this.f27198f = cVar.m12631b();
                this.f27199g = cVar.m12631b();
                m12637a(i, cVar);
            }
            while (cVar.m12632a(4) != 0) {
                int a = cVar.m12632a(4);
                if (a == 15) {
                    i2 = cVar.m12632a(8);
                    a += i2;
                } else {
                    i2 = 0;
                }
                if (i2 == 255) {
                    a += cVar.m12632a(16);
                }
                for (int i3 = 0; i3 < a; i3++) {
                    cVar.m12632a(8);
                }
            }
        }

        public void m12637a(int i, C8381c cVar) {
            int i2;
            switch (i) {
                case 1:
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i2 = 3;
                    break;
                case 7:
                    i2 = 4;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                new C8379b(cVar);
            }
        }
    }

    public class C8379b {
        public boolean f27201a;
        public int f27202b;
        public int f27203c;
        public int f27204d;
        public int f27205e;
        public boolean f27206f;
        public boolean f27207g;
        public int f27208h;
        public boolean f27209i;
        public int f27210j;
        public int f27211k;
        public int f27212l;
        public boolean f27213m;
        public boolean f27214n;

        public C8379b(C8381c cVar) {
            this.f27201a = cVar.m12631b();
            this.f27202b = cVar.m12632a(4);
            this.f27203c = cVar.m12632a(4);
            this.f27204d = cVar.m12632a(3);
            this.f27205e = cVar.m12632a(2);
            this.f27206f = cVar.m12631b();
            this.f27207g = cVar.m12631b();
            if (this.f27206f) {
                this.f27208h = cVar.m12632a(2);
                this.f27209i = cVar.m12631b();
                this.f27210j = cVar.m12632a(2);
            }
            if (this.f27207g) {
                this.f27211k = cVar.m12632a(2);
                this.f27212l = cVar.m12632a(2);
                this.f27213m = cVar.m12631b();
            }
            this.f27214n = cVar.m12631b();
        }
    }

    static {
        f27147V.put(0, 96000);
        f27147V.put(1, 88200);
        f27147V.put(2, 64000);
        f27147V.put(3, 48000);
        f27147V.put(4, 44100);
        f27147V.put(5, 32000);
        f27147V.put(6, 24000);
        f27147V.put(7, 22050);
        f27147V.put(8, 16000);
        f27147V.put(9, 12000);
        f27147V.put(10, 11025);
        f27147V.put(11, 8000);
        f27148W.put(1, "AAC main");
        f27148W.put(2, "AAC LC");
        f27148W.put(3, "AAC SSR");
        f27148W.put(4, "AAC LTP");
        f27148W.put(5, "SBR");
        f27148W.put(6, "AAC Scalable");
        f27148W.put(7, "TwinVQ");
        f27148W.put(8, "CELP");
        f27148W.put(9, "HVXC");
        f27148W.put(10, "(reserved)");
        f27148W.put(11, "(reserved)");
        f27148W.put(12, "TTSI");
        f27148W.put(13, "Main synthetic");
        f27148W.put(14, "Wavetable synthesis");
        f27148W.put(15, "General MIDI");
        f27148W.put(16, "Algorithmic Synthesis and Audio FX");
        f27148W.put(17, "ER AAC LC");
        f27148W.put(18, "(reserved)");
        f27148W.put(19, "ER AAC LTP");
        f27148W.put(20, "ER AAC Scalable");
        f27148W.put(21, "ER TwinVQ");
        f27148W.put(22, "ER BSAC");
        f27148W.put(23, "ER AAC LD");
        f27148W.put(24, "ER CELP");
        f27148W.put(25, "ER HVXC");
        f27148W.put(26, "ER HILN");
        f27148W.put(27, "ER Parametric");
        f27148W.put(28, "SSC");
        f27148W.put(29, "PS");
        f27148W.put(30, "MPEG Surround");
        f27148W.put(31, "(escape)");
        f27148W.put(32, "Layer-1");
        f27148W.put(33, "Layer-2");
        f27148W.put(34, "Layer-3");
        f27148W.put(35, "DST");
        f27148W.put(36, "ALS");
        f27148W.put(37, "SLS");
        f27148W.put(38, "SLS non-core");
        f27148W.put(39, "ER AAC ELD");
        f27148W.put(40, "SMR Simple");
        f27148W.put(41, "SMR Main");
    }

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f27217b);
        byteBuffer.position(byteBuffer.position() + this.f27217b);
        byte[] bArr = new byte[this.f27217b];
        this.f27170d = bArr;
        slice.get(bArr);
        slice.rewind();
        C8381c cVar = new C8381c(slice);
        this.f27172f = m12649g(cVar);
        int a = cVar.m12632a(4);
        this.f27173g = a;
        if (a == 15) {
            this.f27174h = cVar.m12632a(24);
        }
        this.f27175i = cVar.m12632a(4);
        int i = this.f27172f;
        if (i == 5 || i == 29) {
            this.f27176j = 5;
            this.f27177k = true;
            if (i == 29) {
                this.f27178l = true;
            }
            int a2 = cVar.m12632a(4);
            this.f27179m = a2;
            if (a2 == 15) {
                this.f27180n = cVar.m12632a(24);
            }
            int g = m12649g(cVar);
            this.f27172f = g;
            if (g == 22) {
                this.f27181o = cVar.m12632a(4);
            }
        } else {
            this.f27176j = 0;
        }
        int i2 = this.f27172f;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                m12647i(this.f27173g, this.f27175i, i2, cVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case C3563j.f11955K3:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                m12643m(this.f27173g, this.f27175i, i2, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f27182p = cVar.m12632a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case Log.TAG_IMAGE_LOADER:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f27183q = cVar.m12632a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.f27171e = new C8378a(this.f27175i, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i3 = this.f27172f;
        if (!(i3 == 17 || i3 == 39)) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case C3563j.f11955K3:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    if (this.f27176j != 5 && cVar.m12630c() >= 16) {
                        int a3 = cVar.m12632a(11);
                        this.f27186t = a3;
                        if (a3 == 695) {
                            int g2 = m12649g(cVar);
                            this.f27176j = g2;
                            if (g2 == 5) {
                                boolean b = cVar.m12631b();
                                this.f27177k = b;
                                if (b) {
                                    int a4 = cVar.m12632a(4);
                                    this.f27179m = a4;
                                    if (a4 == 15) {
                                        this.f27180n = cVar.m12632a(24);
                                    }
                                    if (cVar.m12630c() >= 12) {
                                        int a5 = cVar.m12632a(11);
                                        this.f27186t = a5;
                                        if (a5 == 1352) {
                                            this.f27178l = cVar.m12631b();
                                        }
                                    }
                                }
                            }
                            if (this.f27176j == 22) {
                                boolean b2 = cVar.m12631b();
                                this.f27177k = b2;
                                if (b2) {
                                    int a6 = cVar.m12632a(4);
                                    this.f27179m = a6;
                                    if (a6 == 15) {
                                        this.f27180n = cVar.m12632a(24);
                                    }
                                }
                                this.f27181o = cVar.m12632a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
            }
        }
        int a7 = cVar.m12632a(2);
        this.f27184r = a7;
        if (a7 == 2 || a7 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a7 == 3) {
            int a8 = cVar.m12632a(1);
            this.f27185s = a8;
            if (a8 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f27176j != 5) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8377a aVar = (C8377a) obj;
        return this.f27151C == aVar.f27151C && this.f27150B == aVar.f27150B && this.f27152D == aVar.f27152D && this.f27172f == aVar.f27172f && this.f27175i == aVar.f27175i && this.f27189w == aVar.f27189w && this.f27188v == aVar.f27188v && this.f27185s == aVar.f27185s && this.f27184r == aVar.f27184r && this.f27160L == aVar.f27160L && this.f27176j == aVar.f27176j && this.f27181o == aVar.f27181o && this.f27190x == aVar.f27190x && this.f27153E == aVar.f27153E && this.f27180n == aVar.f27180n && this.f27179m == aVar.f27179m && this.f27183q == aVar.f27183q && this.f27187u == aVar.f27187u && this.f27154F == aVar.f27154F && this.f27166R == aVar.f27166R && this.f27167S == aVar.f27167S && this.f27168T == aVar.f27168T && this.f27165Q == aVar.f27165Q && this.f27163O == aVar.f27163O && this.f27162N == aVar.f27162N && this.f27164P == aVar.f27164P && this.f27159K == aVar.f27159K && this.f27158J == aVar.f27158J && this.f27155G == aVar.f27155G && this.f27191y == aVar.f27191y && this.f27149A == aVar.f27149A && this.f27192z == aVar.f27192z && this.f27157I == aVar.f27157I && this.f27156H == aVar.f27156H && this.f27169U == aVar.f27169U && this.f27178l == aVar.f27178l && this.f27182p == aVar.f27182p && this.f27174h == aVar.f27174h && this.f27173g == aVar.f27173g && this.f27177k == aVar.f27177k && this.f27186t == aVar.f27186t && this.f27161M == aVar.f27161M && Arrays.equals(this.f27170d, aVar.f27170d);
    }

    public final int m12650f() {
        return 0;
    }

    public final int m12649g(C8381c cVar) {
        int a = cVar.m12632a(5);
        return a == 31 ? cVar.m12632a(6) + 32 : a;
    }

    public final void m12648h(int i, int i2, int i3, C8381c cVar) {
        this.f27158J = cVar.m12632a(1);
        this.f27159K = cVar.m12632a(2);
        int a = cVar.m12632a(1);
        this.f27160L = a;
        if (a == 1) {
            this.f27161M = cVar.m12632a(1);
        }
    }

    public int hashCode() {
        byte[] bArr = this.f27170d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f27172f) * 31) + this.f27173g) * 31) + this.f27174h) * 31) + this.f27175i) * 31) + this.f27176j) * 31) + (this.f27177k ? 1 : 0)) * 31) + (this.f27178l ? 1 : 0)) * 31) + this.f27179m) * 31) + this.f27180n) * 31) + this.f27181o) * 31) + this.f27182p) * 31) + this.f27183q) * 31) + this.f27184r) * 31) + this.f27185s) * 31) + this.f27186t) * 31) + this.f27187u) * 31) + this.f27188v) * 31) + this.f27189w) * 31) + this.f27190x) * 31) + this.f27191y) * 31) + this.f27192z) * 31) + this.f27149A) * 31) + (this.f27150B ? 1 : 0)) * 31) + (this.f27151C ? 1 : 0)) * 31) + (this.f27152D ? 1 : 0)) * 31) + this.f27153E) * 31) + (this.f27154F ? 1 : 0)) * 31) + this.f27155G) * 31) + this.f27156H) * 31) + this.f27157I) * 31) + this.f27158J) * 31) + this.f27159K) * 31) + this.f27160L) * 31) + this.f27161M) * 31) + this.f27162N) * 31) + this.f27163O) * 31) + this.f27164P) * 31) + this.f27165Q) * 31) + this.f27166R) * 31) + this.f27167S) * 31) + this.f27168T) * 31) + (this.f27169U ? 1 : 0);
    }

    public final void m12647i(int i, int i2, int i3, C8381c cVar) {
        this.f27187u = cVar.m12632a(1);
        int a = cVar.m12632a(1);
        this.f27188v = a;
        if (a == 1) {
            this.f27189w = cVar.m12632a(14);
        }
        this.f27190x = cVar.m12632a(1);
        if (i2 != 0) {
            if (i3 == 6 || i3 == 20) {
                this.f27191y = cVar.m12632a(3);
            }
            if (this.f27190x == 1) {
                if (i3 == 22) {
                    this.f27192z = cVar.m12632a(5);
                    this.f27149A = cVar.m12632a(11);
                }
                if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                    this.f27150B = cVar.m12631b();
                    this.f27151C = cVar.m12631b();
                    this.f27152D = cVar.m12631b();
                }
                this.f27153E = cVar.m12632a(1);
            }
            this.f27154F = true;
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    public final void m12646j(int i, int i2, int i3, C8381c cVar) {
        this.f27162N = cVar.m12632a(1);
        this.f27163O = cVar.m12632a(8);
        this.f27164P = cVar.m12632a(4);
        this.f27165Q = cVar.m12632a(12);
        this.f27166R = cVar.m12632a(2);
    }

    public final void m12645k(int i, int i2, int i3, C8381c cVar) {
        int a = cVar.m12632a(1);
        this.f27167S = a;
        if (a == 1) {
            this.f27168T = cVar.m12632a(2);
        }
    }

    public final void m12644l(int i, int i2, int i3, C8381c cVar) {
        int a = cVar.m12632a(2);
        this.f27156H = a;
        if (a != 1) {
            m12648h(i, i2, i3, cVar);
        }
        if (this.f27156H != 0) {
            m12646j(i, i2, i3, cVar);
        }
        this.f27157I = cVar.m12632a(1);
        this.f27169U = true;
    }

    public final void m12643m(int i, int i2, int i3, C8381c cVar) {
        int a = cVar.m12632a(1);
        this.f27155G = a;
        if (a == 1) {
            m12644l(i, i2, i3, cVar);
        } else {
            m12645k(i, i2, i3, cVar);
        }
    }

    public ByteBuffer m12642n() {
        ByteBuffer allocate = ByteBuffer.allocate(m12641o());
        C8634g.m11850j(allocate, 5);
        C8634g.m11850j(allocate, m12641o() - 2);
        C8382d dVar = new C8382d(allocate);
        dVar.m12629a(this.f27172f, 5);
        dVar.m12629a(this.f27173g, 4);
        if (this.f27173g != 15) {
            dVar.m12629a(this.f27175i, 4);
            return allocate;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public int m12641o() {
        if (this.f27172f == 2) {
            return m12650f() + 4;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public void m12640p(int i) {
        this.f27172f = i;
    }

    public void m12639q(int i) {
        this.f27175i = i;
    }

    public void m12638r(int i) {
        this.f27173g = i;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(C8630c.m11879b(this.f27170d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f27172f);
        sb2.append(" (");
        sb2.append(f27148W.get(Integer.valueOf(this.f27172f)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.f27173g);
        sb2.append(" (");
        sb2.append(f27147V.get(Integer.valueOf(this.f27173g)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.f27174h);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f27175i);
        if (this.f27176j > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f27176j);
            sb2.append(" (");
            sb2.append(f27148W.get(Integer.valueOf(this.f27176j)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.f27177k);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f27178l);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f27179m);
            sb2.append(" (");
            sb2.append(f27147V.get(Integer.valueOf(this.f27179m)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.f27180n);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f27181o);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f27186t);
        if (this.f27154F) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f27187u);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f27188v);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f27189w);
            sb2.append(", extensionFlag=");
            sb2.append(this.f27190x);
            sb2.append(", layerNr=");
            sb2.append(this.f27191y);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f27192z);
            sb2.append(", layer_length=");
            sb2.append(this.f27149A);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.f27150B);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.f27151C);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.f27152D);
            sb2.append(", extensionFlag3=");
            sb2.append(this.f27153E);
        }
        if (this.f27169U) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.f27155G);
            sb2.append(", paraMode=");
            sb2.append(this.f27156H);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.f27157I);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.f27158J);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.f27159K);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.f27160L);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.f27161M);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.f27162N);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.f27163O);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.f27164P);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.f27165Q);
            sb2.append(", hilnContMode=");
            sb2.append(this.f27166R);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.f27167S);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.f27168T);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
