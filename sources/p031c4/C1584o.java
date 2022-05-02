package p031c4;

import java.util.Arrays;
import java.util.Collections;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1237x;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1584o implements AbstractC1581m {
    public static final float[] f5703l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final C1579k0 f5704a;
    public final C1189b0 f5705b;
    public final C1596u f5708e;
    public C1586b f5709f;
    public long f5710g;
    public String f5711h;
    public AbstractC8974t f5712i;
    public boolean f5713j;
    public final boolean[] f5706c = new boolean[4];
    public final C1585a f5707d = new C1585a(Log.TAG_YOUTUBE);
    public long f5714k = -9223372036854775807L;

    public static final class C1585a {
        public static final byte[] f5715f = {0, 0, 1};
        public boolean f5716a;
        public int f5717b;
        public int f5718c;
        public int f5719d;
        public byte[] f5720e;

        public C1585a(int i) {
            this.f5720e = new byte[i];
        }

        public void m36384a(byte[] bArr, int i, int i2) {
            if (this.f5716a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f5720e;
                int length = bArr2.length;
                int i4 = this.f5718c;
                if (length < i4 + i3) {
                    this.f5720e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f5720e, this.f5718c, i3);
                this.f5718c += i3;
            }
        }

        public boolean m36383b(int i, int i2) {
            int i3 = this.f5717b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            } else if (i == 179 || i == 181) {
                                this.f5718c -= i2;
                                this.f5716a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            C1230s.m37884i("H263Reader", "Unexpected start code value");
                            m36382c();
                        } else {
                            this.f5719d = this.f5718c;
                            this.f5717b = 4;
                        }
                    } else if (i > 31) {
                        C1230s.m37884i("H263Reader", "Unexpected start code value");
                        m36382c();
                    } else {
                        this.f5717b = 3;
                    }
                } else if (i != 181) {
                    C1230s.m37884i("H263Reader", "Unexpected start code value");
                    m36382c();
                } else {
                    this.f5717b = 2;
                }
            } else if (i == 176) {
                this.f5717b = 1;
                this.f5716a = true;
            }
            byte[] bArr = f5715f;
            m36384a(bArr, 0, bArr.length);
            return false;
        }

        public void m36382c() {
            this.f5716a = false;
            this.f5718c = 0;
            this.f5717b = 0;
        }
    }

    public static final class C1586b {
        public final AbstractC8974t f5721a;
        public boolean f5722b;
        public boolean f5723c;
        public boolean f5724d;
        public int f5725e;
        public int f5726f;
        public long f5727g;
        public long f5728h;

        public C1586b(AbstractC8974t tVar) {
            this.f5721a = tVar;
        }

        public void m36381a(byte[] bArr, int i, int i2) {
            if (this.f5723c) {
                int i3 = this.f5726f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.f5724d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f5723c = false;
                    return;
                }
                this.f5726f = i3 + (i2 - i);
            }
        }

        public void m36380b(long j, int i, boolean z) {
            if (this.f5725e == 182 && z && this.f5722b) {
                long j2 = this.f5728h;
                if (j2 != -9223372036854775807L) {
                    this.f5721a.mo10793e(j2, this.f5724d ? 1 : 0, (int) (j - this.f5727g), i, null);
                }
            }
            if (this.f5725e != 179) {
                this.f5727g = j;
            }
        }

        public void m36379c(int i, long j) {
            this.f5725e = i;
            this.f5724d = false;
            boolean z = true;
            this.f5722b = i == 182 || i == 179;
            if (i != 182) {
                z = false;
            }
            this.f5723c = z;
            this.f5726f = 0;
            this.f5728h = j;
        }

        public void m36378d() {
            this.f5722b = false;
            this.f5723c = false;
            this.f5724d = false;
            this.f5725e = -1;
        }
    }

    public C1584o(C1579k0 k0Var) {
        this.f5704a = k0Var;
        if (k0Var != null) {
            this.f5708e = new C1596u(178, Log.TAG_YOUTUBE);
            this.f5705b = new C1189b0();
            return;
        }
        this.f5708e = null;
        this.f5705b = null;
    }

    public static C6600g1 m36385a(C1585a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f5720e, aVar.f5718c);
        C1187a0 a0Var = new C1187a0(copyOf);
        a0Var.m38165s(i);
        a0Var.m38165s(4);
        a0Var.m38167q();
        a0Var.m38166r(8);
        if (a0Var.m38177g()) {
            a0Var.m38166r(4);
            a0Var.m38166r(3);
        }
        int h = a0Var.m38176h(4);
        float f = 1.0f;
        if (h == 15) {
            int h2 = a0Var.m38176h(8);
            int h3 = a0Var.m38176h(8);
            if (h3 == 0) {
                C1230s.m37884i("H263Reader", "Invalid aspect ratio");
            } else {
                f = h2 / h3;
            }
        } else {
            float[] fArr = f5703l;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                C1230s.m37884i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (a0Var.m38177g()) {
            a0Var.m38166r(2);
            a0Var.m38166r(1);
            if (a0Var.m38177g()) {
                a0Var.m38166r(15);
                a0Var.m38167q();
                a0Var.m38166r(15);
                a0Var.m38167q();
                a0Var.m38166r(15);
                a0Var.m38167q();
                a0Var.m38166r(3);
                a0Var.m38166r(11);
                a0Var.m38167q();
                a0Var.m38166r(15);
                a0Var.m38167q();
            }
        }
        if (a0Var.m38176h(2) != 0) {
            C1230s.m37884i("H263Reader", "Unhandled video object layer shape");
        }
        a0Var.m38167q();
        int h4 = a0Var.m38176h(16);
        a0Var.m38167q();
        if (a0Var.m38177g()) {
            if (h4 == 0) {
                C1230s.m37884i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                a0Var.m38166r(i2);
            }
        }
        a0Var.m38167q();
        int h5 = a0Var.m38176h(13);
        a0Var.m38167q();
        int h6 = a0Var.m38176h(13);
        a0Var.m38167q();
        a0Var.m38167q();
        return new C6600g1.C6602b().m19876S(str).m19859e0("video/mp4v-es").m19849j0(h5).m19878Q(h6).m19867a0(f).m19875T(Collections.singletonList(copyOf)).m19890E();
    }

    @Override
    public void mo36336b(C1189b0 b0Var) {
        C1186a.m38185h(this.f5709f);
        C1186a.m38185h(this.f5712i);
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        byte[] d = b0Var.m38142d();
        this.f5710g += b0Var.m38145a();
        this.f5712i.mo10795c(b0Var, b0Var.m38145a());
        while (true) {
            int c = C1237x.m37856c(d, e, f, this.f5706c);
            if (c == f) {
                break;
            }
            int i = c + 3;
            int i2 = b0Var.m38142d()[i] & 255;
            int i3 = c - e;
            int i4 = 0;
            if (!this.f5713j) {
                if (i3 > 0) {
                    this.f5707d.m36384a(d, e, c);
                }
                if (this.f5707d.m36383b(i2, i3 < 0 ? -i3 : 0)) {
                    AbstractC8974t tVar = this.f5712i;
                    C1585a aVar = this.f5707d;
                    tVar.mo10797a(m36385a(aVar, aVar.f5719d, (String) C1186a.m38188e(this.f5711h)));
                    this.f5713j = true;
                }
            }
            this.f5709f.m36381a(d, e, c);
            C1596u uVar = this.f5708e;
            if (uVar != null) {
                if (i3 > 0) {
                    uVar.m36329a(d, e, c);
                } else {
                    i4 = -i3;
                }
                if (this.f5708e.m36328b(i4)) {
                    C1596u uVar2 = this.f5708e;
                    ((C1189b0) C1216l0.m37971j(this.f5705b)).m38149N(this.f5708e.f5847d, C1237x.m37842q(uVar2.f5847d, uVar2.f5848e));
                    ((C1579k0) C1216l0.m37971j(this.f5704a)).m36392a(this.f5714k, this.f5705b);
                }
                if (i2 == 178 && b0Var.m38142d()[c + 2] == 1) {
                    this.f5708e.m36325e(i2);
                }
            }
            int i5 = f - c;
            this.f5709f.m36380b(this.f5710g - i5, i5, this.f5713j);
            this.f5709f.m36379c(i2, this.f5714k);
            e = i;
        }
        if (!this.f5713j) {
            this.f5707d.m36384a(d, e, f);
        }
        this.f5709f.m36381a(d, e, f);
        C1596u uVar3 = this.f5708e;
        if (uVar3 != null) {
            uVar3.m36329a(d, e, f);
        }
    }

    @Override
    public void mo36335c() {
        C1237x.m37858a(this.f5706c);
        this.f5707d.m36382c();
        C1586b bVar = this.f5709f;
        if (bVar != null) {
            bVar.m36378d();
        }
        C1596u uVar = this.f5708e;
        if (uVar != null) {
            uVar.m36326d();
        }
        this.f5710g = 0L;
        this.f5714k = -9223372036854775807L;
    }

    @Override
    public void mo36334d() {
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        this.f5711h = dVar.m36408b();
        AbstractC8974t r = hVar.mo6039r(dVar.m36407c(), 2);
        this.f5712i = r;
        this.f5709f = new C1586b(r);
        C1579k0 k0Var = this.f5704a;
        if (k0Var != null) {
            k0Var.m36391b(hVar, dVar);
        }
    }

    @Override
    public void mo36332f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5714k = j;
        }
    }
}
