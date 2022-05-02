package p025bc;

import cc.C2083h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.Log;
import p025bc.C1336h;
import p095gc.AbstractC4550f;
import p095gc.AbstractC4551g;
import p095gc.C4549e;
import p095gc.C4552h;
import p107ha.C5060q;
import p290ub.C9489b;
import p333xb.AbstractC10176a;
import p333xb.C10178c;
import p333xb.C10179d;
import p333xb.C10180e;
import pa.AbstractC8077a;
import qa.C8294g;
import qa.C8298k;
import qa.C8305r;
import qa.C8306s;

public final class C1315f implements Closeable {
    public static final C1352m f4758l0;
    public static final C1318c f4759m0 = new C1318c(null);
    public final String f4760M;
    public int f4761N;
    public int f4762O;
    public boolean f4763P;
    public final C10180e f4764Q;
    public final C10179d f4765R;
    public final C10179d f4766S;
    public final C10179d f4767T;
    public final AbstractC1349l f4768U;
    public long f4769V;
    public long f4770W;
    public long f4771X;
    public long f4772Y;
    public long f4773Z;
    public final boolean f4774a;
    public long f4775a0;
    public final AbstractC1319d f4776b;
    public final C1352m f4777b0;
    public final Map<Integer, C1340i> f4778c = new LinkedHashMap();
    public C1352m f4779c0;
    public long f4780d0;
    public long f4781e0;
    public long f4782f0;
    public long f4783g0;
    public final Socket f4784h0;
    public final C1345j f4785i0;
    public final C1322e f4786j0;
    public final Set<Integer> f4787k0;

    public static final class C1316a extends AbstractC10176a {
        public final String f4788e;
        public final C1315f f4789f;
        public final long f4790g;

        public C1316a(String str, String str2, C1315f fVar, long j) {
            super(str2, false, 2, null);
            this.f4788e = str;
            this.f4789f = fVar;
            this.f4790g = j;
        }

        @Override
        public long mo4943f() {
            boolean z;
            synchronized (this.f4789f) {
                if (this.f4789f.f4770W < this.f4789f.f4769V) {
                    z = true;
                } else {
                    this.f4789f.f4769V++;
                    z = false;
                }
            }
            if (z) {
                this.f4789f.m37732P0(null);
                return -1L;
            }
            this.f4789f.m37700t1(false, 1, 0);
            return this.f4790g;
        }
    }

    public static final class C1317b {
        public Socket f4791a;
        public String f4792b;
        public AbstractC4551g f4793c;
        public AbstractC4550f f4794d;
        public AbstractC1319d f4795e = AbstractC1319d.f4800a;
        public AbstractC1349l f4796f = AbstractC1349l.f4930a;
        public int f4797g;
        public boolean f4798h;
        public final C10180e f4799i;

        public C1317b(boolean z, C10180e eVar) {
            C8298k.m12933e(eVar, "taskRunner");
            this.f4798h = z;
            this.f4799i = eVar;
        }

        public final C1315f m37694a() {
            return new C1315f(this);
        }

        public final boolean m37693b() {
            return this.f4798h;
        }

        public final String m37692c() {
            String str = this.f4792b;
            if (str == null) {
                C8298k.m12924n("connectionName");
            }
            return str;
        }

        public final AbstractC1319d m37691d() {
            return this.f4795e;
        }

        public final int m37690e() {
            return this.f4797g;
        }

        public final AbstractC1349l m37689f() {
            return this.f4796f;
        }

        public final AbstractC4550f m37688g() {
            AbstractC4550f fVar = this.f4794d;
            if (fVar == null) {
                C8298k.m12924n("sink");
            }
            return fVar;
        }

        public final Socket m37687h() {
            Socket socket = this.f4791a;
            if (socket == null) {
                C8298k.m12924n("socket");
            }
            return socket;
        }

        public final AbstractC4551g m37686i() {
            AbstractC4551g gVar = this.f4793c;
            if (gVar == null) {
                C8298k.m12924n("source");
            }
            return gVar;
        }

        public final C10180e m37685j() {
            return this.f4799i;
        }

        public final C1317b m37684k(AbstractC1319d dVar) {
            C8298k.m12933e(dVar, "listener");
            this.f4795e = dVar;
            return this;
        }

        public final C1317b m37683l(int i) {
            this.f4797g = i;
            return this;
        }

        public final C1317b m37682m(Socket socket, String str, AbstractC4551g gVar, AbstractC4550f fVar) {
            String str2;
            C8298k.m12933e(socket, "socket");
            C8298k.m12933e(str, "peerName");
            C8298k.m12933e(gVar, "source");
            C8298k.m12933e(fVar, "sink");
            this.f4791a = socket;
            if (this.f4798h) {
                str2 = C9489b.f30730i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.f4792b = str2;
            this.f4793c = gVar;
            this.f4794d = fVar;
            return this;
        }
    }

    public static final class C1318c {
        public C1318c() {
        }

        public final C1352m m37681a() {
            return C1315f.f4758l0;
        }

        public C1318c(C8294g gVar) {
            this();
        }
    }

    public static abstract class AbstractC1319d {
        public static final C1321b f4801b = new C1321b(null);
        public static final AbstractC1319d f4800a = new C1320a();

        public static final class C1320a extends AbstractC1319d {
            @Override
            public void mo4975b(C1340i iVar) {
                C8298k.m12933e(iVar, "stream");
                iVar.m37633d(EnumC1307b.REFUSED_STREAM, null);
            }
        }

        public static final class C1321b {
            public C1321b() {
            }

            public C1321b(C8294g gVar) {
                this();
            }
        }

        public void mo4976a(C1315f fVar, C1352m mVar) {
            C8298k.m12933e(fVar, "connection");
            C8298k.m12933e(mVar, "settings");
        }

        public abstract void mo4975b(C1340i iVar);
    }

    public final class C1322e implements C1336h.AbstractC1339c, AbstractC8077a<C5060q> {
        public final C1336h f4802a;
        public final C1315f f4803b;

        public static final class C1323a extends AbstractC10176a {
            public final String f4804e;
            public final boolean f4805f;
            public final C1322e f4806g;
            public final C8306s f4807h;
            public final boolean f4808i;
            public final C1352m f4809j;
            public final C8305r f4810k;
            public final C8306s f4811l;

            public C1323a(String str, boolean z, String str2, boolean z2, C1322e eVar, C8306s sVar, boolean z3, C1352m mVar, C8305r rVar, C8306s sVar2) {
                super(str2, z2);
                this.f4804e = str;
                this.f4805f = z;
                this.f4806g = eVar;
                this.f4807h = sVar;
                this.f4808i = z3;
                this.f4809j = mVar;
                this.f4810k = rVar;
                this.f4811l = sVar2;
            }

            @Override
            public long mo4943f() {
                this.f4806g.f4803b.m37728T0().mo4976a(this.f4806g.f4803b, (C1352m) this.f4807h.f26791a);
                return -1L;
            }
        }

        public static final class C1324b extends AbstractC10176a {
            public final String f4812e;
            public final boolean f4813f;
            public final C1340i f4814g;
            public final C1322e f4815h;
            public final C1340i f4816i;
            public final int f4817j;
            public final List f4818k;
            public final boolean f4819l;

            public C1324b(String str, boolean z, String str2, boolean z2, C1340i iVar, C1322e eVar, C1340i iVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f4812e = str;
                this.f4813f = z;
                this.f4814g = iVar;
                this.f4815h = eVar;
                this.f4816i = iVar2;
                this.f4817j = i;
                this.f4818k = list;
                this.f4819l = z3;
            }

            @Override
            public long mo4943f() {
                try {
                    this.f4815h.f4803b.m37728T0().mo4975b(this.f4814g);
                    return -1L;
                } catch (IOException e) {
                    C2083h g = C2083h.f7326c.m35677g();
                    g.m35689j("Http2Connection.Listener failure for " + this.f4815h.f4803b.m37730R0(), 4, e);
                    try {
                        this.f4814g.m37633d(EnumC1307b.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class C1325c extends AbstractC10176a {
            public final String f4820e;
            public final boolean f4821f;
            public final C1322e f4822g;
            public final int f4823h;
            public final int f4824i;

            public C1325c(String str, boolean z, String str2, boolean z2, C1322e eVar, int i, int i2) {
                super(str2, z2);
                this.f4820e = str;
                this.f4821f = z;
                this.f4822g = eVar;
                this.f4823h = i;
                this.f4824i = i2;
            }

            @Override
            public long mo4943f() {
                this.f4822g.f4803b.m37700t1(true, this.f4823h, this.f4824i);
                return -1L;
            }
        }

        public static final class C1326d extends AbstractC10176a {
            public final String f4825e;
            public final boolean f4826f;
            public final C1322e f4827g;
            public final boolean f4828h;
            public final C1352m f4829i;

            public C1326d(String str, boolean z, String str2, boolean z2, C1322e eVar, boolean z3, C1352m mVar) {
                super(str2, z2);
                this.f4825e = str;
                this.f4826f = z;
                this.f4827g = eVar;
                this.f4828h = z3;
                this.f4829i = mVar;
            }

            @Override
            public long mo4943f() {
                this.f4827g.m37680l(this.f4828h, this.f4829i);
                return -1L;
            }
        }

        public C1322e(C1315f fVar, C1336h hVar) {
            C8298k.m12933e(hVar, "reader");
            this.f4803b = fVar;
            this.f4802a = hVar;
        }

        @Override
        public void mo37651a() {
        }

        @Override
        public C5060q mo4925b() {
            m37679m();
            return C5060q.f17066a;
        }

        @Override
        public void mo37650c(boolean z, int i, int i2, List<C1309c> list) {
            C8298k.m12933e(list, "headerBlock");
            if (this.f4803b.m37713i1(i)) {
                this.f4803b.m37716f1(i, list, z);
                return;
            }
            synchronized (this.f4803b) {
                C1340i X0 = this.f4803b.m37724X0(i);
                if (X0 != null) {
                    C5060q qVar = C5060q.f17066a;
                    X0.m37613x(C9489b.m8534K(list), z);
                } else if (!this.f4803b.f4763P) {
                    if (i > this.f4803b.m37729S0()) {
                        if (i % 2 != this.f4803b.m37727U0() % 2) {
                            C1340i iVar = new C1340i(i, this.f4803b, false, z, C9489b.m8534K(list));
                            this.f4803b.m37710l1(i);
                            this.f4803b.m37723Y0().put(Integer.valueOf(i), iVar);
                            String str = this.f4803b.m37730R0() + '[' + i + "] onStream";
                            this.f4803b.f4764Q.m5818i().m5832i(new C1324b(str, true, str, true, iVar, this, X0, i, list, z), 0L);
                        }
                    }
                }
            }
        }

        @Override
        public void mo37649d(int i, long j) {
            if (i == 0) {
                synchronized (this.f4803b) {
                    C1315f fVar = this.f4803b;
                    fVar.f4783g0 = fVar.m37722Z0() + j;
                    C1315f fVar2 = this.f4803b;
                    if (fVar2 != null) {
                        fVar2.notifyAll();
                        C5060q qVar = C5060q.f17066a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            C1340i X0 = this.f4803b.m37724X0(i);
            if (X0 != null) {
                synchronized (X0) {
                    X0.m37636a(j);
                    C5060q qVar2 = C5060q.f17066a;
                }
            }
        }

        @Override
        public void mo37648e(int i, EnumC1307b bVar, C4552h hVar) {
            int i2;
            C1340i[] iVarArr;
            C8298k.m12933e(bVar, "errorCode");
            C8298k.m12933e(hVar, "debugData");
            hVar.m27406r();
            synchronized (this.f4803b) {
                Object[] array = this.f4803b.m37723Y0().values().toArray(new C1340i[0]);
                if (array != null) {
                    iVarArr = (C1340i[]) array;
                    this.f4803b.f4763P = true;
                    C5060q qVar = C5060q.f17066a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C1340i iVar : iVarArr) {
                if (iVar.m37627j() > i && iVar.m37617t()) {
                    iVar.m37612y(EnumC1307b.REFUSED_STREAM);
                    this.f4803b.m37712j1(iVar.m37627j());
                }
            }
        }

        @Override
        public void mo37647f(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f4803b) {
                    if (i == 1) {
                        this.f4803b.f4770W++;
                    } else if (i != 2) {
                        if (i == 3) {
                            this.f4803b.f4773Z++;
                            C1315f fVar = this.f4803b;
                            if (fVar != null) {
                                fVar.notifyAll();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        C5060q qVar = C5060q.f17066a;
                    } else {
                        this.f4803b.f4772Y++;
                    }
                }
                return;
            }
            String str = this.f4803b.m37730R0() + " ping";
            this.f4803b.f4765R.m5832i(new C1325c(str, true, str, true, this, i, i2), 0L);
        }

        @Override
        public void mo37646g(int i, int i2, int i3, boolean z) {
        }

        @Override
        public void mo37645h(int i, EnumC1307b bVar) {
            C8298k.m12933e(bVar, "errorCode");
            if (this.f4803b.m37713i1(i)) {
                this.f4803b.m37714h1(i, bVar);
                return;
            }
            C1340i j1 = this.f4803b.m37712j1(i);
            if (j1 != null) {
                j1.m37612y(bVar);
            }
        }

        @Override
        public void mo37644i(boolean z, int i, AbstractC4551g gVar, int i2) {
            C8298k.m12933e(gVar, "source");
            if (this.f4803b.m37713i1(i)) {
                this.f4803b.m37717e1(i, gVar, i2, z);
                return;
            }
            C1340i X0 = this.f4803b.m37724X0(i);
            if (X0 == null) {
                this.f4803b.m37698v1(i, EnumC1307b.PROTOCOL_ERROR);
                long j = i2;
                this.f4803b.m37704q1(j);
                gVar.mo27337a0(j);
                return;
            }
            X0.m37614w(gVar, i2);
            if (z) {
                X0.m37613x(C9489b.f30723b, true);
            }
        }

        @Override
        public void mo37643j(int i, int i2, List<C1309c> list) {
            C8298k.m12933e(list, "requestHeaders");
            this.f4803b.m37715g1(i2, list);
        }

        @Override
        public void mo37642k(boolean z, C1352m mVar) {
            C8298k.m12933e(mVar, "settings");
            String str = this.f4803b.m37730R0() + " applyAndAckSettings";
            this.f4803b.f4765R.m5832i(new C1326d(str, true, str, true, this, z, mVar), 0L);
        }

        public final void m37680l(boolean r22, p025bc.C1352m r23) {
            throw new UnsupportedOperationException("Method not decompiled: p025bc.C1315f.C1322e.m37680l(boolean, bc.m):void");
        }

        public void m37679m() {
            Throwable th;
            EnumC1307b bVar;
            EnumC1307b bVar2 = EnumC1307b.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f4802a.m37662y0(this);
                    while (this.f4802a.m37663t(false, this)) {
                    }
                    EnumC1307b bVar3 = EnumC1307b.NO_ERROR;
                    try {
                        this.f4803b.m37733O0(bVar3, EnumC1307b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e2) {
                        e = e2;
                        EnumC1307b bVar4 = EnumC1307b.PROTOCOL_ERROR;
                        C1315f fVar = this.f4803b;
                        fVar.m37733O0(bVar4, bVar4, e);
                        bVar = fVar;
                        bVar2 = this.f4802a;
                        C9489b.m8514j(bVar2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f4803b.m37733O0(bVar, bVar2, e);
                    C9489b.m8514j(this.f4802a);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f4803b.m37733O0(bVar, bVar2, e);
                C9489b.m8514j(this.f4802a);
                throw th;
            }
            bVar2 = this.f4802a;
            C9489b.m8514j(bVar2);
        }
    }

    public static final class C1327f extends AbstractC10176a {
        public final String f4830e;
        public final boolean f4831f;
        public final C1315f f4832g;
        public final int f4833h;
        public final C4549e f4834i;
        public final int f4835j;
        public final boolean f4836k;

        public C1327f(String str, boolean z, String str2, boolean z2, C1315f fVar, int i, C4549e eVar, int i2, boolean z3) {
            super(str2, z2);
            this.f4830e = str;
            this.f4831f = z;
            this.f4832g = fVar;
            this.f4833h = i;
            this.f4834i = eVar;
            this.f4835j = i2;
            this.f4836k = z3;
        }

        @Override
        public long mo4943f() {
            try {
                boolean a = this.f4832g.f4768U.mo37579a(this.f4833h, this.f4834i, this.f4835j, this.f4836k);
                if (a) {
                    this.f4832g.m37721a1().m37594G0(this.f4833h, EnumC1307b.CANCEL);
                }
                if (!a && !this.f4836k) {
                    return -1L;
                }
                synchronized (this.f4832g) {
                    this.f4832g.f4787k0.remove(Integer.valueOf(this.f4833h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class C1328g extends AbstractC10176a {
        public final String f4837e;
        public final boolean f4838f;
        public final C1315f f4839g;
        public final int f4840h;
        public final List f4841i;
        public final boolean f4842j;

        public C1328g(String str, boolean z, String str2, boolean z2, C1315f fVar, int i, List list, boolean z3) {
            super(str2, z2);
            this.f4837e = str;
            this.f4838f = z;
            this.f4839g = fVar;
            this.f4840h = i;
            this.f4841i = list;
            this.f4842j = z3;
        }

        @Override
        public long mo4943f() {
            boolean c = this.f4839g.f4768U.mo37577c(this.f4840h, this.f4841i, this.f4842j);
            if (c) {
                try {
                    this.f4839g.m37721a1().m37594G0(this.f4840h, EnumC1307b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!c && !this.f4842j) {
                return -1L;
            }
            synchronized (this.f4839g) {
                this.f4839g.f4787k0.remove(Integer.valueOf(this.f4840h));
            }
            return -1L;
        }
    }

    public static final class C1329h extends AbstractC10176a {
        public final String f4843e;
        public final boolean f4844f;
        public final C1315f f4845g;
        public final int f4846h;
        public final List f4847i;

        public C1329h(String str, boolean z, String str2, boolean z2, C1315f fVar, int i, List list) {
            super(str2, z2);
            this.f4843e = str;
            this.f4844f = z;
            this.f4845g = fVar;
            this.f4846h = i;
            this.f4847i = list;
        }

        @Override
        public long mo4943f() {
            if (!this.f4845g.f4768U.mo37578b(this.f4846h, this.f4847i)) {
                return -1L;
            }
            try {
                this.f4845g.m37721a1().m37594G0(this.f4846h, EnumC1307b.CANCEL);
                synchronized (this.f4845g) {
                    this.f4845g.f4787k0.remove(Integer.valueOf(this.f4846h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class C1330i extends AbstractC10176a {
        public final String f4848e;
        public final boolean f4849f;
        public final C1315f f4850g;
        public final int f4851h;
        public final EnumC1307b f4852i;

        public C1330i(String str, boolean z, String str2, boolean z2, C1315f fVar, int i, EnumC1307b bVar) {
            super(str2, z2);
            this.f4848e = str;
            this.f4849f = z;
            this.f4850g = fVar;
            this.f4851h = i;
            this.f4852i = bVar;
        }

        @Override
        public long mo4943f() {
            this.f4850g.f4768U.mo37576d(this.f4851h, this.f4852i);
            synchronized (this.f4850g) {
                this.f4850g.f4787k0.remove(Integer.valueOf(this.f4851h));
                C5060q qVar = C5060q.f17066a;
            }
            return -1L;
        }
    }

    public static final class C1331j extends AbstractC10176a {
        public final String f4853e;
        public final boolean f4854f;
        public final C1315f f4855g;

        public C1331j(String str, boolean z, String str2, boolean z2, C1315f fVar) {
            super(str2, z2);
            this.f4853e = str;
            this.f4854f = z;
            this.f4855g = fVar;
        }

        @Override
        public long mo4943f() {
            this.f4855g.m37700t1(false, 2, 0);
            return -1L;
        }
    }

    public static final class C1332k extends AbstractC10176a {
        public final String f4856e;
        public final boolean f4857f;
        public final C1315f f4858g;
        public final int f4859h;
        public final EnumC1307b f4860i;

        public C1332k(String str, boolean z, String str2, boolean z2, C1315f fVar, int i, EnumC1307b bVar) {
            super(str2, z2);
            this.f4856e = str;
            this.f4857f = z;
            this.f4858g = fVar;
            this.f4859h = i;
            this.f4860i = bVar;
        }

        @Override
        public long mo4943f() {
            try {
                this.f4858g.m37699u1(this.f4859h, this.f4860i);
                return -1L;
            } catch (IOException e) {
                this.f4858g.m37732P0(e);
                return -1L;
            }
        }
    }

    public static final class C1333l extends AbstractC10176a {
        public final String f4861e;
        public final boolean f4862f;
        public final C1315f f4863g;
        public final int f4864h;
        public final long f4865i;

        public C1333l(String str, boolean z, String str2, boolean z2, C1315f fVar, int i, long j) {
            super(str2, z2);
            this.f4861e = str;
            this.f4862f = z;
            this.f4863g = fVar;
            this.f4864h = i;
            this.f4865i = j;
        }

        @Override
        public long mo4943f() {
            try {
                this.f4863g.m37721a1().m37592I0(this.f4864h, this.f4865i);
                return -1L;
            } catch (IOException e) {
                this.f4863g.m37732P0(e);
                return -1L;
            }
        }
    }

    static {
        C1352m mVar = new C1352m();
        mVar.m37568h(7, 65535);
        mVar.m37568h(5, Log.TAG_VIDEO);
        f4758l0 = mVar;
    }

    public C1315f(C1317b bVar) {
        C1352m mVar;
        C8298k.m12933e(bVar, "builder");
        boolean b = bVar.m37693b();
        this.f4774a = b;
        this.f4776b = bVar.m37691d();
        String c = bVar.m37692c();
        this.f4760M = c;
        this.f4762O = bVar.m37693b() ? 3 : 2;
        C10180e j = bVar.m37685j();
        this.f4764Q = j;
        C10179d i = j.m5818i();
        this.f4765R = i;
        this.f4766S = j.m5818i();
        this.f4767T = j.m5818i();
        this.f4768U = bVar.m37689f();
        C1352m mVar2 = new C1352m();
        if (bVar.m37693b()) {
            mVar2.m37568h(7, 16777216);
        }
        C5060q qVar = C5060q.f17066a;
        this.f4777b0 = mVar2;
        this.f4779c0 = f4758l0;
        this.f4783g0 = mVar.m37573c();
        this.f4784h0 = bVar.m37687h();
        this.f4785i0 = new C1345j(bVar.m37688g(), b);
        this.f4786j0 = new C1322e(this, new C1336h(bVar.m37686i(), b));
        this.f4787k0 = new LinkedHashSet();
        if (bVar.m37690e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.m37690e());
            String str = c + " ping";
            i.m5832i(new C1316a(str, str, this, nanos), nanos);
        }
    }

    public static void m37705p1(C1315f fVar, boolean z, C10180e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            eVar = C10180e.f32910h;
        }
        fVar.m37706o1(z, eVar);
    }

    public final void m37733O0(EnumC1307b bVar, EnumC1307b bVar2, IOException iOException) {
        int i;
        C8298k.m12933e(bVar, "connectionCode");
        C8298k.m12933e(bVar2, "streamCode");
        if (!C9489b.f30729h || !Thread.holdsLock(this)) {
            try {
                m37707n1(bVar);
            } catch (IOException unused) {
            }
            C1340i[] iVarArr = null;
            synchronized (this) {
                if (!this.f4778c.isEmpty()) {
                    Object[] array = this.f4778c.values().toArray(new C1340i[0]);
                    if (array != null) {
                        iVarArr = (C1340i[]) array;
                        this.f4778c.clear();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                C5060q qVar = C5060q.f17066a;
            }
            if (iVarArr != null) {
                for (C1340i iVar : iVarArr) {
                    try {
                        iVar.m37633d(bVar2, iOException);
                    } catch (IOException unused2) {
                    }
                }
            }
            try {
                this.f4785i0.close();
            } catch (IOException unused3) {
            }
            try {
                this.f4784h0.close();
            } catch (IOException unused4) {
            }
            this.f4765R.m5827n();
            this.f4766S.m5827n();
            this.f4767T.m5827n();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C8298k.m12934d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void m37732P0(IOException iOException) {
        EnumC1307b bVar = EnumC1307b.PROTOCOL_ERROR;
        m37733O0(bVar, bVar, iOException);
    }

    public final boolean m37731Q0() {
        return this.f4774a;
    }

    public final String m37730R0() {
        return this.f4760M;
    }

    public final int m37729S0() {
        return this.f4761N;
    }

    public final AbstractC1319d m37728T0() {
        return this.f4776b;
    }

    public final int m37727U0() {
        return this.f4762O;
    }

    public final C1352m m37726V0() {
        return this.f4777b0;
    }

    public final C1352m m37725W0() {
        return this.f4779c0;
    }

    public final synchronized C1340i m37724X0(int i) {
        return this.f4778c.get(Integer.valueOf(i));
    }

    public final Map<Integer, C1340i> m37723Y0() {
        return this.f4778c;
    }

    public final long m37722Z0() {
        return this.f4783g0;
    }

    public final C1345j m37721a1() {
        return this.f4785i0;
    }

    public final synchronized boolean m37720b1(long j) {
        if (this.f4763P) {
            return false;
        }
        if (this.f4772Y < this.f4771X) {
            if (j >= this.f4775a0) {
                return false;
            }
        }
        return true;
    }

    public final p025bc.C1340i m37719c1(int r11, java.util.List<p025bc.C1309c> r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: p025bc.C1315f.m37719c1(int, java.util.List, boolean):bc.i");
    }

    @Override
    public void close() {
        m37733O0(EnumC1307b.NO_ERROR, EnumC1307b.CANCEL, null);
    }

    public final C1340i m37718d1(List<C1309c> list, boolean z) {
        C8298k.m12933e(list, "requestHeaders");
        return m37719c1(0, list, z);
    }

    public final void m37717e1(int i, AbstractC4551g gVar, int i2, boolean z) {
        C8298k.m12933e(gVar, "source");
        C4549e eVar = new C4549e();
        long j = i2;
        gVar.mo27331s0(j);
        gVar.mo5028s(eVar, j);
        String str = this.f4760M + '[' + i + "] onData";
        this.f4766S.m5832i(new C1327f(str, true, str, true, this, i, eVar, i2, z), 0L);
    }

    public final void m37716f1(int i, List<C1309c> list, boolean z) {
        C8298k.m12933e(list, "requestHeaders");
        String str = this.f4760M + '[' + i + "] onHeaders";
        this.f4766S.m5832i(new C1328g(str, true, str, true, this, i, list, z), 0L);
    }

    public final void flush() {
        this.f4785i0.flush();
    }

    public final void m37715g1(int i, List<C1309c> list) {
        C8298k.m12933e(list, "requestHeaders");
        synchronized (this) {
            if (this.f4787k0.contains(Integer.valueOf(i))) {
                m37698v1(i, EnumC1307b.PROTOCOL_ERROR);
                return;
            }
            this.f4787k0.add(Integer.valueOf(i));
            String str = this.f4760M + '[' + i + "] onRequest";
            this.f4766S.m5832i(new C1329h(str, true, str, true, this, i, list), 0L);
        }
    }

    public final void m37714h1(int i, EnumC1307b bVar) {
        C8298k.m12933e(bVar, "errorCode");
        String str = this.f4760M + '[' + i + "] onReset";
        this.f4766S.m5832i(new C1330i(str, true, str, true, this, i, bVar), 0L);
    }

    public final boolean m37713i1(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized C1340i m37712j1(int i) {
        C1340i remove;
        remove = this.f4778c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void m37711k1() {
        synchronized (this) {
            long j = this.f4772Y;
            long j2 = this.f4771X;
            if (j >= j2) {
                this.f4771X = j2 + 1;
                this.f4775a0 = System.nanoTime() + 1000000000;
                C5060q qVar = C5060q.f17066a;
                String str = this.f4760M + " ping";
                this.f4765R.m5832i(new C1331j(str, true, str, true, this), 0L);
            }
        }
    }

    public final void m37710l1(int i) {
        this.f4761N = i;
    }

    public final void m37708m1(C1352m mVar) {
        C8298k.m12933e(mVar, "<set-?>");
        this.f4779c0 = mVar;
    }

    public final void m37707n1(EnumC1307b bVar) {
        C8298k.m12933e(bVar, "statusCode");
        synchronized (this.f4785i0) {
            synchronized (this) {
                if (!this.f4763P) {
                    this.f4763P = true;
                    int i = this.f4761N;
                    C5060q qVar = C5060q.f17066a;
                    this.f4785i0.m37599B0(i, bVar, C9489b.f30722a);
                }
            }
        }
    }

    public final void m37706o1(boolean z, C10180e eVar) {
        C8298k.m12933e(eVar, "taskRunner");
        if (z) {
            this.f4785i0.m37589t();
            this.f4785i0.m37593H0(this.f4777b0);
            int c = this.f4777b0.m37573c();
            if (c != 65535) {
                this.f4785i0.m37592I0(0, c - 65535);
            }
        }
        C10179d i = eVar.m5818i();
        String str = this.f4760M;
        i.m5832i(new C10178c(this.f4786j0, str, true, str, true), 0L);
    }

    public final synchronized void m37704q1(long j) {
        long j2 = this.f4780d0 + j;
        this.f4780d0 = j2;
        long j3 = j2 - this.f4781e0;
        if (j3 >= this.f4777b0.m37573c() / 2) {
            m37697w1(0, j3);
            this.f4781e0 += j3;
        }
    }

    public final void m37703r1(int r9, boolean r10, p095gc.C4549e r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: p025bc.C1315f.m37703r1(int, boolean, gc.e, long):void");
    }

    public final void m37702s1(int i, boolean z, List<C1309c> list) {
        C8298k.m12933e(list, "alternating");
        this.f4785i0.m37598C0(z, i, list);
    }

    public final void m37700t1(boolean z, int i, int i2) {
        try {
            this.f4785i0.m37596E0(z, i, i2);
        } catch (IOException e) {
            m37732P0(e);
        }
    }

    public final void m37699u1(int i, EnumC1307b bVar) {
        C8298k.m12933e(bVar, "statusCode");
        this.f4785i0.m37594G0(i, bVar);
    }

    public final void m37698v1(int i, EnumC1307b bVar) {
        C8298k.m12933e(bVar, "errorCode");
        String str = this.f4760M + '[' + i + "] writeSynReset";
        this.f4765R.m5832i(new C1332k(str, true, str, true, this, i, bVar), 0L);
    }

    public final void m37697w1(int i, long j) {
        String str = this.f4760M + '[' + i + "] windowUpdate";
        this.f4765R.m5832i(new C1333l(str, true, str, true, this, i, j), 0L);
    }
}
