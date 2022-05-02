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
    public static Map<Integer, Integer> f27144V = new HashMap();
    public static Map<Integer, String> f27145W = new HashMap();
    public int f27146A;
    public boolean f27147B;
    public boolean f27148C;
    public boolean f27149D;
    public int f27150E;
    public boolean f27151F;
    public int f27152G;
    public int f27153H;
    public int f27154I;
    public int f27155J;
    public int f27156K;
    public int f27157L;
    public int f27158M;
    public int f27159N;
    public int f27160O;
    public int f27161P;
    public int f27162Q;
    public int f27163R;
    public int f27164S;
    public int f27165T;
    public boolean f27166U;
    public byte[] f27167d;
    public C8378a f27168e;
    public int f27169f;
    public int f27170g;
    public int f27171h;
    public int f27172i;
    public int f27173j;
    public boolean f27174k;
    public boolean f27175l;
    public int f27176m;
    public int f27177n;
    public int f27178o;
    public int f27179p;
    public int f27180q;
    public int f27181r;
    public int f27182s;
    public int f27183t;
    public int f27184u;
    public int f27185v;
    public int f27186w;
    public int f27187x;
    public int f27188y;
    public int f27189z;

    public class C8378a {
        public boolean f27190a;
        public boolean f27191b;
        public boolean f27192c;
        public boolean f27193d;
        public boolean f27194e;
        public boolean f27195f;
        public boolean f27196g;

        public C8378a(int i, C8381c cVar) {
            int i2;
            this.f27190a = cVar.m12632b();
            this.f27191b = cVar.m12632b();
            this.f27192c = cVar.m12632b();
            this.f27193d = cVar.m12632b();
            boolean b = cVar.m12632b();
            this.f27194e = b;
            if (b) {
                this.f27195f = cVar.m12632b();
                this.f27196g = cVar.m12632b();
                m12638a(i, cVar);
            }
            while (cVar.m12633a(4) != 0) {
                int a = cVar.m12633a(4);
                if (a == 15) {
                    i2 = cVar.m12633a(8);
                    a += i2;
                } else {
                    i2 = 0;
                }
                if (i2 == 255) {
                    a += cVar.m12633a(16);
                }
                for (int i3 = 0; i3 < a; i3++) {
                    cVar.m12633a(8);
                }
            }
        }

        public void m12638a(int i, C8381c cVar) {
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
        public boolean f27198a;
        public int f27199b;
        public int f27200c;
        public int f27201d;
        public int f27202e;
        public boolean f27203f;
        public boolean f27204g;
        public int f27205h;
        public boolean f27206i;
        public int f27207j;
        public int f27208k;
        public int f27209l;
        public boolean f27210m;
        public boolean f27211n;

        public C8379b(C8381c cVar) {
            this.f27198a = cVar.m12632b();
            this.f27199b = cVar.m12633a(4);
            this.f27200c = cVar.m12633a(4);
            this.f27201d = cVar.m12633a(3);
            this.f27202e = cVar.m12633a(2);
            this.f27203f = cVar.m12632b();
            this.f27204g = cVar.m12632b();
            if (this.f27203f) {
                this.f27205h = cVar.m12633a(2);
                this.f27206i = cVar.m12632b();
                this.f27207j = cVar.m12633a(2);
            }
            if (this.f27204g) {
                this.f27208k = cVar.m12633a(2);
                this.f27209l = cVar.m12633a(2);
                this.f27210m = cVar.m12632b();
            }
            this.f27211n = cVar.m12632b();
        }
    }

    static {
        f27144V.put(0, 96000);
        f27144V.put(1, 88200);
        f27144V.put(2, 64000);
        f27144V.put(3, 48000);
        f27144V.put(4, 44100);
        f27144V.put(5, 32000);
        f27144V.put(6, 24000);
        f27144V.put(7, 22050);
        f27144V.put(8, 16000);
        f27144V.put(9, 12000);
        f27144V.put(10, 11025);
        f27144V.put(11, 8000);
        f27145W.put(1, "AAC main");
        f27145W.put(2, "AAC LC");
        f27145W.put(3, "AAC SSR");
        f27145W.put(4, "AAC LTP");
        f27145W.put(5, "SBR");
        f27145W.put(6, "AAC Scalable");
        f27145W.put(7, "TwinVQ");
        f27145W.put(8, "CELP");
        f27145W.put(9, "HVXC");
        f27145W.put(10, "(reserved)");
        f27145W.put(11, "(reserved)");
        f27145W.put(12, "TTSI");
        f27145W.put(13, "Main synthetic");
        f27145W.put(14, "Wavetable synthesis");
        f27145W.put(15, "General MIDI");
        f27145W.put(16, "Algorithmic Synthesis and Audio FX");
        f27145W.put(17, "ER AAC LC");
        f27145W.put(18, "(reserved)");
        f27145W.put(19, "ER AAC LTP");
        f27145W.put(20, "ER AAC Scalable");
        f27145W.put(21, "ER TwinVQ");
        f27145W.put(22, "ER BSAC");
        f27145W.put(23, "ER AAC LD");
        f27145W.put(24, "ER CELP");
        f27145W.put(25, "ER HVXC");
        f27145W.put(26, "ER HILN");
        f27145W.put(27, "ER Parametric");
        f27145W.put(28, "SSC");
        f27145W.put(29, "PS");
        f27145W.put(30, "MPEG Surround");
        f27145W.put(31, "(escape)");
        f27145W.put(32, "Layer-1");
        f27145W.put(33, "Layer-2");
        f27145W.put(34, "Layer-3");
        f27145W.put(35, "DST");
        f27145W.put(36, "ALS");
        f27145W.put(37, "SLS");
        f27145W.put(38, "SLS non-core");
        f27145W.put(39, "ER AAC ELD");
        f27145W.put(40, "SMR Simple");
        f27145W.put(41, "SMR Main");
    }

    @Override
    public void mo12590e(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f27214b);
        byteBuffer.position(byteBuffer.position() + this.f27214b);
        byte[] bArr = new byte[this.f27214b];
        this.f27167d = bArr;
        slice.get(bArr);
        slice.rewind();
        C8381c cVar = new C8381c(slice);
        this.f27169f = m12650g(cVar);
        int a = cVar.m12633a(4);
        this.f27170g = a;
        if (a == 15) {
            this.f27171h = cVar.m12633a(24);
        }
        this.f27172i = cVar.m12633a(4);
        int i = this.f27169f;
        if (i == 5 || i == 29) {
            this.f27173j = 5;
            this.f27174k = true;
            if (i == 29) {
                this.f27175l = true;
            }
            int a2 = cVar.m12633a(4);
            this.f27176m = a2;
            if (a2 == 15) {
                this.f27177n = cVar.m12633a(24);
            }
            int g = m12650g(cVar);
            this.f27169f = g;
            if (g == 22) {
                this.f27178o = cVar.m12633a(4);
            }
        } else {
            this.f27173j = 0;
        }
        int i2 = this.f27169f;
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
                m12648i(this.f27170g, this.f27172i, i2, cVar);
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
                m12644m(this.f27170g, this.f27172i, i2, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f27179p = cVar.m12633a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case Log.TAG_IMAGE_LOADER:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f27180q = cVar.m12633a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.f27168e = new C8378a(this.f27172i, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i3 = this.f27169f;
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
                    if (this.f27173j != 5 && cVar.m12631c() >= 16) {
                        int a3 = cVar.m12633a(11);
                        this.f27183t = a3;
                        if (a3 == 695) {
                            int g2 = m12650g(cVar);
                            this.f27173j = g2;
                            if (g2 == 5) {
                                boolean b = cVar.m12632b();
                                this.f27174k = b;
                                if (b) {
                                    int a4 = cVar.m12633a(4);
                                    this.f27176m = a4;
                                    if (a4 == 15) {
                                        this.f27177n = cVar.m12633a(24);
                                    }
                                    if (cVar.m12631c() >= 12) {
                                        int a5 = cVar.m12633a(11);
                                        this.f27183t = a5;
                                        if (a5 == 1352) {
                                            this.f27175l = cVar.m12632b();
                                        }
                                    }
                                }
                            }
                            if (this.f27173j == 22) {
                                boolean b2 = cVar.m12632b();
                                this.f27174k = b2;
                                if (b2) {
                                    int a6 = cVar.m12633a(4);
                                    this.f27176m = a6;
                                    if (a6 == 15) {
                                        this.f27177n = cVar.m12633a(24);
                                    }
                                }
                                this.f27178o = cVar.m12633a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
            }
        }
        int a7 = cVar.m12633a(2);
        this.f27181r = a7;
        if (a7 == 2 || a7 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a7 == 3) {
            int a8 = cVar.m12633a(1);
            this.f27182s = a8;
            if (a8 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f27173j != 5) {
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
        return this.f27148C == aVar.f27148C && this.f27147B == aVar.f27147B && this.f27149D == aVar.f27149D && this.f27169f == aVar.f27169f && this.f27172i == aVar.f27172i && this.f27186w == aVar.f27186w && this.f27185v == aVar.f27185v && this.f27182s == aVar.f27182s && this.f27181r == aVar.f27181r && this.f27157L == aVar.f27157L && this.f27173j == aVar.f27173j && this.f27178o == aVar.f27178o && this.f27187x == aVar.f27187x && this.f27150E == aVar.f27150E && this.f27177n == aVar.f27177n && this.f27176m == aVar.f27176m && this.f27180q == aVar.f27180q && this.f27184u == aVar.f27184u && this.f27151F == aVar.f27151F && this.f27163R == aVar.f27163R && this.f27164S == aVar.f27164S && this.f27165T == aVar.f27165T && this.f27162Q == aVar.f27162Q && this.f27160O == aVar.f27160O && this.f27159N == aVar.f27159N && this.f27161P == aVar.f27161P && this.f27156K == aVar.f27156K && this.f27155J == aVar.f27155J && this.f27152G == aVar.f27152G && this.f27188y == aVar.f27188y && this.f27146A == aVar.f27146A && this.f27189z == aVar.f27189z && this.f27154I == aVar.f27154I && this.f27153H == aVar.f27153H && this.f27166U == aVar.f27166U && this.f27175l == aVar.f27175l && this.f27179p == aVar.f27179p && this.f27171h == aVar.f27171h && this.f27170g == aVar.f27170g && this.f27174k == aVar.f27174k && this.f27183t == aVar.f27183t && this.f27158M == aVar.f27158M && Arrays.equals(this.f27167d, aVar.f27167d);
    }

    public final int m12651f() {
        return 0;
    }

    public final int m12650g(C8381c cVar) {
        int a = cVar.m12633a(5);
        return a == 31 ? cVar.m12633a(6) + 32 : a;
    }

    public final void m12649h(int i, int i2, int i3, C8381c cVar) {
        this.f27155J = cVar.m12633a(1);
        this.f27156K = cVar.m12633a(2);
        int a = cVar.m12633a(1);
        this.f27157L = a;
        if (a == 1) {
            this.f27158M = cVar.m12633a(1);
        }
    }

    public int hashCode() {
        byte[] bArr = this.f27167d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f27169f) * 31) + this.f27170g) * 31) + this.f27171h) * 31) + this.f27172i) * 31) + this.f27173j) * 31) + (this.f27174k ? 1 : 0)) * 31) + (this.f27175l ? 1 : 0)) * 31) + this.f27176m) * 31) + this.f27177n) * 31) + this.f27178o) * 31) + this.f27179p) * 31) + this.f27180q) * 31) + this.f27181r) * 31) + this.f27182s) * 31) + this.f27183t) * 31) + this.f27184u) * 31) + this.f27185v) * 31) + this.f27186w) * 31) + this.f27187x) * 31) + this.f27188y) * 31) + this.f27189z) * 31) + this.f27146A) * 31) + (this.f27147B ? 1 : 0)) * 31) + (this.f27148C ? 1 : 0)) * 31) + (this.f27149D ? 1 : 0)) * 31) + this.f27150E) * 31) + (this.f27151F ? 1 : 0)) * 31) + this.f27152G) * 31) + this.f27153H) * 31) + this.f27154I) * 31) + this.f27155J) * 31) + this.f27156K) * 31) + this.f27157L) * 31) + this.f27158M) * 31) + this.f27159N) * 31) + this.f27160O) * 31) + this.f27161P) * 31) + this.f27162Q) * 31) + this.f27163R) * 31) + this.f27164S) * 31) + this.f27165T) * 31) + (this.f27166U ? 1 : 0);
    }

    public final void m12648i(int i, int i2, int i3, C8381c cVar) {
        this.f27184u = cVar.m12633a(1);
        int a = cVar.m12633a(1);
        this.f27185v = a;
        if (a == 1) {
            this.f27186w = cVar.m12633a(14);
        }
        this.f27187x = cVar.m12633a(1);
        if (i2 != 0) {
            if (i3 == 6 || i3 == 20) {
                this.f27188y = cVar.m12633a(3);
            }
            if (this.f27187x == 1) {
                if (i3 == 22) {
                    this.f27189z = cVar.m12633a(5);
                    this.f27146A = cVar.m12633a(11);
                }
                if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                    this.f27147B = cVar.m12632b();
                    this.f27148C = cVar.m12632b();
                    this.f27149D = cVar.m12632b();
                }
                this.f27150E = cVar.m12633a(1);
            }
            this.f27151F = true;
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    public final void m12647j(int i, int i2, int i3, C8381c cVar) {
        this.f27159N = cVar.m12633a(1);
        this.f27160O = cVar.m12633a(8);
        this.f27161P = cVar.m12633a(4);
        this.f27162Q = cVar.m12633a(12);
        this.f27163R = cVar.m12633a(2);
    }

    public final void m12646k(int i, int i2, int i3, C8381c cVar) {
        int a = cVar.m12633a(1);
        this.f27164S = a;
        if (a == 1) {
            this.f27165T = cVar.m12633a(2);
        }
    }

    public final void m12645l(int i, int i2, int i3, C8381c cVar) {
        int a = cVar.m12633a(2);
        this.f27153H = a;
        if (a != 1) {
            m12649h(i, i2, i3, cVar);
        }
        if (this.f27153H != 0) {
            m12647j(i, i2, i3, cVar);
        }
        this.f27154I = cVar.m12633a(1);
        this.f27166U = true;
    }

    public final void m12644m(int i, int i2, int i3, C8381c cVar) {
        int a = cVar.m12633a(1);
        this.f27152G = a;
        if (a == 1) {
            m12645l(i, i2, i3, cVar);
        } else {
            m12646k(i, i2, i3, cVar);
        }
    }

    public ByteBuffer m12643n() {
        ByteBuffer allocate = ByteBuffer.allocate(m12642o());
        C8634g.m11851j(allocate, 5);
        C8634g.m11851j(allocate, m12642o() - 2);
        C8382d dVar = new C8382d(allocate);
        dVar.m12630a(this.f27169f, 5);
        dVar.m12630a(this.f27170g, 4);
        if (this.f27170g != 15) {
            dVar.m12630a(this.f27172i, 4);
            return allocate;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public int m12642o() {
        if (this.f27169f == 2) {
            return m12651f() + 4;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public void m12641p(int i) {
        this.f27169f = i;
    }

    public void m12640q(int i) {
        this.f27172i = i;
    }

    public void m12639r(int i) {
        this.f27170g = i;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(C8630c.m11880b(this.f27167d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f27169f);
        sb2.append(" (");
        sb2.append(f27145W.get(Integer.valueOf(this.f27169f)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.f27170g);
        sb2.append(" (");
        sb2.append(f27144V.get(Integer.valueOf(this.f27170g)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.f27171h);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f27172i);
        if (this.f27173j > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f27173j);
            sb2.append(" (");
            sb2.append(f27145W.get(Integer.valueOf(this.f27173j)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.f27174k);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f27175l);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f27176m);
            sb2.append(" (");
            sb2.append(f27144V.get(Integer.valueOf(this.f27176m)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.f27177n);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f27178o);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f27183t);
        if (this.f27151F) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f27184u);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f27185v);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f27186w);
            sb2.append(", extensionFlag=");
            sb2.append(this.f27187x);
            sb2.append(", layerNr=");
            sb2.append(this.f27188y);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f27189z);
            sb2.append(", layer_length=");
            sb2.append(this.f27146A);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.f27147B);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.f27148C);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.f27149D);
            sb2.append(", extensionFlag3=");
            sb2.append(this.f27150E);
        }
        if (this.f27166U) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.f27152G);
            sb2.append(", paraMode=");
            sb2.append(this.f27153H);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.f27154I);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.f27155J);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.f27156K);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.f27157L);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.f27158M);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.f27159N);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.f27160O);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.f27161P);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.f27162Q);
            sb2.append(", hilnContMode=");
            sb2.append(this.f27163R);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.f27164S);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.f27165T);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
