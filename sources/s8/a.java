package s8;

import d.j;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.thunderdog.challegram.Log;
import s2.c;
import s2.g;

@g(objectTypeIndication = Log.TAG_SPEED_TEXT, tags = {5})
public class a extends s8.b {
    public static Map<Integer, Integer> V = new HashMap();
    public static Map<Integer, String> W = new HashMap();
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public byte[] f22537d;
    public C0212a f22538e;
    public int f22539f;
    public int f22540g;
    public int f22541h;
    public int f22542i;
    public int f22543j;
    public boolean f22544k;
    public boolean f22545l;
    public int f22546m;
    public int f22547n;
    public int f22548o;
    public int f22549p;
    public int f22550q;
    public int f22551r;
    public int f22552s;
    public int f22553t;
    public int f22554u;
    public int f22555v;
    public int f22556w;
    public int f22557x;
    public int f22558y;
    public int f22559z;

    public class C0212a {
        public boolean f22560a;
        public boolean f22561b;
        public boolean f22562c;
        public boolean f22563d;
        public boolean f22564e;
        public boolean f22565f;
        public boolean f22566g;

        public C0212a(int i10, c cVar) {
            int i11;
            this.f22560a = cVar.b();
            this.f22561b = cVar.b();
            this.f22562c = cVar.b();
            this.f22563d = cVar.b();
            boolean b10 = cVar.b();
            this.f22564e = b10;
            if (b10) {
                this.f22565f = cVar.b();
                this.f22566g = cVar.b();
                a(i10, cVar);
            }
            while (cVar.a(4) != 0) {
                int a10 = cVar.a(4);
                if (a10 == 15) {
                    i11 = cVar.a(8);
                    a10 += i11;
                } else {
                    i11 = 0;
                }
                if (i11 == 255) {
                    a10 += cVar.a(16);
                }
                for (int i12 = 0; i12 < a10; i12++) {
                    cVar.a(8);
                }
            }
        }

        public void a(int i10, c cVar) {
            int i11;
            switch (i10) {
                case 1:
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i11 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i11 = 3;
                    break;
                case 7:
                    i11 = 4;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                new b(cVar);
            }
        }
    }

    public class b {
        public boolean f22568a;
        public int f22569b;
        public int f22570c;
        public int f22571d;
        public int f22572e;
        public boolean f22573f;
        public boolean f22574g;
        public int f22575h;
        public boolean f22576i;
        public int f22577j;
        public int f22578k;
        public int f22579l;
        public boolean f22580m;
        public boolean f22581n;

        public b(c cVar) {
            this.f22568a = cVar.b();
            this.f22569b = cVar.a(4);
            this.f22570c = cVar.a(4);
            this.f22571d = cVar.a(3);
            this.f22572e = cVar.a(2);
            this.f22573f = cVar.b();
            this.f22574g = cVar.b();
            if (this.f22573f) {
                this.f22575h = cVar.a(2);
                this.f22576i = cVar.b();
                this.f22577j = cVar.a(2);
            }
            if (this.f22574g) {
                this.f22578k = cVar.a(2);
                this.f22579l = cVar.a(2);
                this.f22580m = cVar.b();
            }
            this.f22581n = cVar.b();
        }
    }

    static {
        V.put(0, 96000);
        V.put(1, 88200);
        V.put(2, 64000);
        V.put(3, 48000);
        V.put(4, 44100);
        V.put(5, 32000);
        V.put(6, 24000);
        V.put(7, 22050);
        V.put(8, 16000);
        V.put(9, 12000);
        V.put(10, 11025);
        V.put(11, 8000);
        W.put(1, "AAC main");
        W.put(2, "AAC LC");
        W.put(3, "AAC SSR");
        W.put(4, "AAC LTP");
        W.put(5, "SBR");
        W.put(6, "AAC Scalable");
        W.put(7, "TwinVQ");
        W.put(8, "CELP");
        W.put(9, "HVXC");
        W.put(10, "(reserved)");
        W.put(11, "(reserved)");
        W.put(12, "TTSI");
        W.put(13, "Main synthetic");
        W.put(14, "Wavetable synthesis");
        W.put(15, "General MIDI");
        W.put(16, "Algorithmic Synthesis and Audio FX");
        W.put(17, "ER AAC LC");
        W.put(18, "(reserved)");
        W.put(19, "ER AAC LTP");
        W.put(20, "ER AAC Scalable");
        W.put(21, "ER TwinVQ");
        W.put(22, "ER BSAC");
        W.put(23, "ER AAC LD");
        W.put(24, "ER CELP");
        W.put(25, "ER HVXC");
        W.put(26, "ER HILN");
        W.put(27, "ER Parametric");
        W.put(28, "SSC");
        W.put(29, "PS");
        W.put(30, "MPEG Surround");
        W.put(31, "(escape)");
        W.put(32, "Layer-1");
        W.put(33, "Layer-2");
        W.put(34, "Layer-3");
        W.put(35, "DST");
        W.put(36, "ALS");
        W.put(37, "SLS");
        W.put(38, "SLS non-core");
        W.put(39, "ER AAC ELD");
        W.put(40, "SMR Simple");
        W.put(41, "SMR Main");
    }

    @Override
    public void e(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f22584b);
        byteBuffer.position(byteBuffer.position() + this.f22584b);
        byte[] bArr = new byte[this.f22584b];
        this.f22537d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(slice);
        this.f22539f = g(cVar);
        int a10 = cVar.a(4);
        this.f22540g = a10;
        if (a10 == 15) {
            this.f22541h = cVar.a(24);
        }
        this.f22542i = cVar.a(4);
        int i10 = this.f22539f;
        if (i10 == 5 || i10 == 29) {
            this.f22543j = 5;
            this.f22544k = true;
            if (i10 == 29) {
                this.f22545l = true;
            }
            int a11 = cVar.a(4);
            this.f22546m = a11;
            if (a11 == 15) {
                this.f22547n = cVar.a(24);
            }
            int g10 = g(cVar);
            this.f22539f = g10;
            if (g10 == 22) {
                this.f22548o = cVar.a(4);
            }
        } else {
            this.f22543j = 0;
        }
        int i11 = this.f22539f;
        switch (i11) {
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
                i(this.f22540g, this.f22542i, i11, cVar);
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
            case j.K3:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                m(this.f22540g, this.f22542i, i11, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f22549p = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case Log.TAG_IMAGE_LOADER:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f22550q = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.f22538e = new C0212a(this.f22542i, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i12 = this.f22539f;
        if (!(i12 == 17 || i12 == 39)) {
            switch (i12) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case j.K3:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    if (this.f22543j != 5 && cVar.c() >= 16) {
                        int a12 = cVar.a(11);
                        this.f22553t = a12;
                        if (a12 == 695) {
                            int g11 = g(cVar);
                            this.f22543j = g11;
                            if (g11 == 5) {
                                boolean b10 = cVar.b();
                                this.f22544k = b10;
                                if (b10) {
                                    int a13 = cVar.a(4);
                                    this.f22546m = a13;
                                    if (a13 == 15) {
                                        this.f22547n = cVar.a(24);
                                    }
                                    if (cVar.c() >= 12) {
                                        int a14 = cVar.a(11);
                                        this.f22553t = a14;
                                        if (a14 == 1352) {
                                            this.f22545l = cVar.b();
                                        }
                                    }
                                }
                            }
                            if (this.f22543j == 22) {
                                boolean b11 = cVar.b();
                                this.f22544k = b11;
                                if (b11) {
                                    int a15 = cVar.a(4);
                                    this.f22546m = a15;
                                    if (a15 == 15) {
                                        this.f22547n = cVar.a(24);
                                    }
                                }
                                this.f22548o = cVar.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
            }
        }
        int a16 = cVar.a(2);
        this.f22551r = a16;
        if (a16 == 2 || a16 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a16 == 3) {
            int a17 = cVar.a(1);
            this.f22552s = a17;
            if (a17 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f22543j != 5) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.C == aVar.C && this.B == aVar.B && this.D == aVar.D && this.f22539f == aVar.f22539f && this.f22542i == aVar.f22542i && this.f22556w == aVar.f22556w && this.f22555v == aVar.f22555v && this.f22552s == aVar.f22552s && this.f22551r == aVar.f22551r && this.L == aVar.L && this.f22543j == aVar.f22543j && this.f22548o == aVar.f22548o && this.f22557x == aVar.f22557x && this.E == aVar.E && this.f22547n == aVar.f22547n && this.f22546m == aVar.f22546m && this.f22550q == aVar.f22550q && this.f22554u == aVar.f22554u && this.F == aVar.F && this.R == aVar.R && this.S == aVar.S && this.T == aVar.T && this.Q == aVar.Q && this.O == aVar.O && this.N == aVar.N && this.P == aVar.P && this.K == aVar.K && this.J == aVar.J && this.G == aVar.G && this.f22558y == aVar.f22558y && this.A == aVar.A && this.f22559z == aVar.f22559z && this.I == aVar.I && this.H == aVar.H && this.U == aVar.U && this.f22545l == aVar.f22545l && this.f22549p == aVar.f22549p && this.f22541h == aVar.f22541h && this.f22540g == aVar.f22540g && this.f22544k == aVar.f22544k && this.f22553t == aVar.f22553t && this.M == aVar.M && Arrays.equals(this.f22537d, aVar.f22537d);
    }

    public final int f() {
        return 0;
    }

    public final int g(c cVar) {
        int a10 = cVar.a(5);
        return a10 == 31 ? cVar.a(6) + 32 : a10;
    }

    public final void h(int i10, int i11, int i12, c cVar) {
        this.J = cVar.a(1);
        this.K = cVar.a(2);
        int a10 = cVar.a(1);
        this.L = a10;
        if (a10 == 1) {
            this.M = cVar.a(1);
        }
    }

    public int hashCode() {
        byte[] bArr = this.f22537d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f22539f) * 31) + this.f22540g) * 31) + this.f22541h) * 31) + this.f22542i) * 31) + this.f22543j) * 31) + (this.f22544k ? 1 : 0)) * 31) + (this.f22545l ? 1 : 0)) * 31) + this.f22546m) * 31) + this.f22547n) * 31) + this.f22548o) * 31) + this.f22549p) * 31) + this.f22550q) * 31) + this.f22551r) * 31) + this.f22552s) * 31) + this.f22553t) * 31) + this.f22554u) * 31) + this.f22555v) * 31) + this.f22556w) * 31) + this.f22557x) * 31) + this.f22558y) * 31) + this.f22559z) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + this.E) * 31) + (this.F ? 1 : 0)) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + (this.U ? 1 : 0);
    }

    public final void i(int i10, int i11, int i12, c cVar) {
        this.f22554u = cVar.a(1);
        int a10 = cVar.a(1);
        this.f22555v = a10;
        if (a10 == 1) {
            this.f22556w = cVar.a(14);
        }
        this.f22557x = cVar.a(1);
        if (i11 != 0) {
            if (i12 == 6 || i12 == 20) {
                this.f22558y = cVar.a(3);
            }
            if (this.f22557x == 1) {
                if (i12 == 22) {
                    this.f22559z = cVar.a(5);
                    this.A = cVar.a(11);
                }
                if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                    this.B = cVar.b();
                    this.C = cVar.b();
                    this.D = cVar.b();
                }
                this.E = cVar.a(1);
            }
            this.F = true;
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    public final void j(int i10, int i11, int i12, c cVar) {
        this.N = cVar.a(1);
        this.O = cVar.a(8);
        this.P = cVar.a(4);
        this.Q = cVar.a(12);
        this.R = cVar.a(2);
    }

    public final void k(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(1);
        this.S = a10;
        if (a10 == 1) {
            this.T = cVar.a(2);
        }
    }

    public final void l(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(2);
        this.H = a10;
        if (a10 != 1) {
            h(i10, i11, i12, cVar);
        }
        if (this.H != 0) {
            j(i10, i11, i12, cVar);
        }
        this.I = cVar.a(1);
        this.U = true;
    }

    public final void m(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(1);
        this.G = a10;
        if (a10 == 1) {
            l(i10, i11, i12, cVar);
        } else {
            k(i10, i11, i12, cVar);
        }
    }

    public ByteBuffer n() {
        ByteBuffer allocate = ByteBuffer.allocate(o());
        g.j(allocate, 5);
        g.j(allocate, o() - 2);
        d dVar = new d(allocate);
        dVar.a(this.f22539f, 5);
        dVar.a(this.f22540g, 4);
        if (this.f22540g != 15) {
            dVar.a(this.f22542i, 4);
            return allocate;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public int o() {
        if (this.f22539f == 2) {
            return f() + 4;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public void p(int i10) {
        this.f22539f = i10;
    }

    public void q(int i10) {
        this.f22542i = i10;
    }

    public void r(int i10) {
        this.f22540g = i10;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(c.b(this.f22537d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f22539f);
        sb2.append(" (");
        sb2.append(W.get(Integer.valueOf(this.f22539f)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.f22540g);
        sb2.append(" (");
        sb2.append(V.get(Integer.valueOf(this.f22540g)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.f22541h);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f22542i);
        if (this.f22543j > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f22543j);
            sb2.append(" (");
            sb2.append(W.get(Integer.valueOf(this.f22543j)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.f22544k);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f22545l);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f22546m);
            sb2.append(" (");
            sb2.append(V.get(Integer.valueOf(this.f22546m)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.f22547n);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f22548o);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f22553t);
        if (this.F) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f22554u);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f22555v);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f22556w);
            sb2.append(", extensionFlag=");
            sb2.append(this.f22557x);
            sb2.append(", layerNr=");
            sb2.append(this.f22558y);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f22559z);
            sb2.append(", layer_length=");
            sb2.append(this.A);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.B);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.C);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.D);
            sb2.append(", extensionFlag3=");
            sb2.append(this.E);
        }
        if (this.U) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.G);
            sb2.append(", paraMode=");
            sb2.append(this.H);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.I);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.J);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.K);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.L);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.M);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.N);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.O);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.P);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.Q);
            sb2.append(", hilnContMode=");
            sb2.append(this.R);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.S);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.T);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
