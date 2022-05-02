package p174m3;

import android.content.Context;
import android.os.Looper;
import java.util.List;
import p006a5.AbstractC0134e;
import p006a5.C0164r;
import p020b5.AbstractC1192d;
import p020b5.C1186a;
import p020b5.C1193d0;
import p020b5.C1216l0;
import p174m3.AbstractC6689s;
import p174m3.C6627j;
import p186n3.C7122h1;
import p187n4.AbstractC7164a0;
import p187n4.AbstractC7230t;
import p199o3.C7602e;
import p343y6.AbstractC10444n;
import p356z4.AbstractC11280t;
import p356z4.C11253f;

public interface AbstractC6689s extends AbstractC6618i2 {

    public interface AbstractC6690a {
        void mo19330P(boolean z);

        void mo19325x(boolean z);
    }

    public static final class C6691b {
        public boolean f20920A;
        public final Context f20921a;
        public AbstractC1192d f20922b;
        public long f20923c;
        public AbstractC10444n<AbstractC6713w2> f20924d;
        public AbstractC10444n<AbstractC7164a0> f20925e;
        public AbstractC10444n<AbstractC11280t> f20926f;
        public AbstractC10444n<AbstractC6648m1> f20927g;
        public AbstractC10444n<AbstractC0134e> f20928h;
        public AbstractC10444n<C7122h1> f20929i;
        public Looper f20930j;
        public C1193d0 f20931k;
        public C7602e f20932l;
        public boolean f20933m;
        public int f20934n;
        public boolean f20935o;
        public boolean f20936p;
        public int f20937q;
        public int f20938r;
        public boolean f20939s;
        public C6717x2 f20940t;
        public long f20941u;
        public long f20942v;
        public AbstractC6642l1 f20943w;
        public long f20944x;
        public long f20945y;
        public boolean f20946z;

        public C6691b(Context context, final AbstractC6713w2 w2Var, final AbstractC7164a0 a0Var) {
            this(context, new AbstractC10444n() {
                @Override
                public final Object get() {
                    AbstractC6713w2 m;
                    m = AbstractC6689s.C6691b.m19559m(AbstractC6713w2.this);
                    return m;
                }
            }, new AbstractC10444n() {
                @Override
                public final Object get() {
                    AbstractC7164a0 n;
                    n = AbstractC6689s.C6691b.m19558n(AbstractC7164a0.this);
                    return n;
                }
            });
        }

        public static AbstractC11280t m19562j(Context context) {
            return new C11253f(context);
        }

        public C7122h1 m19560l() {
            return new C7122h1((AbstractC1192d) C1186a.m38185e(this.f20922b));
        }

        public static AbstractC6713w2 m19559m(AbstractC6713w2 w2Var) {
            return w2Var;
        }

        public static AbstractC7164a0 m19558n(AbstractC7164a0 a0Var) {
            return a0Var;
        }

        public static AbstractC6648m1 m19557o(AbstractC6648m1 m1Var) {
            return m1Var;
        }

        public static AbstractC11280t m19556p(AbstractC11280t tVar) {
            return tVar;
        }

        public AbstractC6689s m19564h() {
            return m19563i();
        }

        public C6721y2 m19563i() {
            C1186a.m38184f(!this.f20920A);
            this.f20920A = true;
            return new C6721y2(this);
        }

        public C6691b m19555q(final AbstractC6648m1 m1Var) {
            C1186a.m38184f(!this.f20920A);
            this.f20927g = new AbstractC10444n() {
                @Override
                public final Object get() {
                    AbstractC6648m1 o;
                    o = AbstractC6689s.C6691b.m19557o(AbstractC6648m1.this);
                    return o;
                }
            };
            return this;
        }

        public C6691b m19554r(final AbstractC11280t tVar) {
            C1186a.m38184f(!this.f20920A);
            this.f20926f = new AbstractC10444n() {
                @Override
                public final Object get() {
                    AbstractC11280t p;
                    p = AbstractC6689s.C6691b.m19556p(AbstractC11280t.this);
                    return p;
                }
            };
            return this;
        }

        public C6691b(final Context context, AbstractC10444n<AbstractC6713w2> nVar, AbstractC10444n<AbstractC7164a0> nVar2) {
            this(context, nVar, nVar2, new AbstractC10444n() {
                @Override
                public final Object get() {
                    AbstractC11280t j;
                    j = AbstractC6689s.C6691b.m19562j(context);
                    return j;
                }
            }, C6554a0.f20400a, new AbstractC10444n() {
                @Override
                public final Object get() {
                    AbstractC0134e l;
                    l = C0164r.m42172l(context);
                    return l;
                }
            }, null);
        }

        public C6691b(Context context, AbstractC10444n<AbstractC6713w2> nVar, AbstractC10444n<AbstractC7164a0> nVar2, AbstractC10444n<AbstractC11280t> nVar3, AbstractC10444n<AbstractC6648m1> nVar4, AbstractC10444n<AbstractC0134e> nVar5, AbstractC10444n<C7122h1> nVar6) {
            this.f20921a = context;
            this.f20924d = nVar;
            this.f20925e = nVar2;
            this.f20926f = nVar3;
            this.f20927g = nVar4;
            this.f20928h = nVar5;
            this.f20929i = nVar6 == null ? new AbstractC10444n() {
                @Override
                public final Object get() {
                    C7122h1 l;
                    l = AbstractC6689s.C6691b.this.m19560l();
                    return l;
                }
            } : nVar6;
            this.f20930j = C1216l0.m38003J();
            this.f20932l = C7602e.f24326O;
            this.f20934n = 0;
            this.f20937q = 1;
            this.f20938r = 0;
            this.f20939s = true;
            this.f20940t = C6717x2.f21072g;
            this.f20941u = 5000L;
            this.f20942v = 15000L;
            this.f20943w = new C6627j.C6629b().m19757a();
            this.f20922b = AbstractC1192d.f4481a;
            this.f20944x = 500L;
            this.f20945y = 2000L;
        }
    }

    void mo19393A(int i, AbstractC7230t tVar);

    void mo19391B(C7602e eVar, boolean z);

    void mo19378M(AbstractC7230t tVar);

    void mo19362e(int i, List<AbstractC7230t> list);

    void mo19348p(List<AbstractC7230t> list);

    void mo19344s(List<AbstractC7230t> list);
}
