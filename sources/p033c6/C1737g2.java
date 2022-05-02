package p033c6;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.AbstractC4516g;
import p092g7.C4510c;
import p092g7.C4511d;

public final class C1737g2 implements AbstractC4515f {
    public static final C4511d f6292g;
    public static final C4511d f6293h;
    public OutputStream f6295a;
    public final Map<Class<?>, AbstractC4514e<?>> f6296b;
    public final Map<Class<?>, AbstractC4516g<?>> f6297c;
    public final AbstractC4514e<Object> f6298d;
    public final C1797k2 f6299e = new C1797k2(this);
    public static final Charset f6291f = Charset.forName("UTF-8");
    public static final AbstractC4514e<Map.Entry<Object, Object>> f6294i = C1722f2.f6263a;

    static {
        C4511d.C4513b a = C4511d.m27510a("key");
        C2007z1 z1Var = new C2007z1();
        z1Var.m35827a(1);
        f6292g = a.m27505b(z1Var.m35826b()).m27506a();
        C4511d.C4513b a2 = C4511d.m27510a("value");
        C2007z1 z1Var2 = new C2007z1();
        z1Var2.m35827a(2);
        f6293h = a2.m27505b(z1Var2.m35826b()).m27506a();
    }

    public C1737g2(OutputStream outputStream, Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar) {
        this.f6295a = outputStream;
        this.f6296b = map;
        this.f6297c = map2;
        this.f6298d = eVar;
    }

    public static void m36030j(Map.Entry entry, AbstractC4515f fVar) {
        fVar.mo5192a(f6292g, entry.getKey());
        fVar.mo5192a(f6293h, entry.getValue());
    }

    public static int m36029k(C4511d dVar) {
        AbstractC1707e2 e2Var = (AbstractC1707e2) dVar.m27508c(AbstractC1707e2.class);
        if (e2Var != null) {
            return e2Var.zza();
        }
        throw new C4510c("Field has no @Protobuf config");
    }

    public static AbstractC1707e2 m36027m(C4511d dVar) {
        AbstractC1707e2 e2Var = (AbstractC1707e2) dVar.m27508c(AbstractC1707e2.class);
        if (e2Var != null) {
            return e2Var;
        }
        throw new C4510c("Field has no @Protobuf config");
    }

    public static ByteBuffer m36024p(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public final AbstractC4515f mo5192a(C4511d dVar, Object obj) {
        m36034f(dVar, obj, true);
        return this;
    }

    @Override
    public final AbstractC4515f mo5191b(C4511d dVar, long j) {
        m36032h(dVar, j, true);
        return this;
    }

    @Override
    public final AbstractC4515f mo5190c(C4511d dVar, int i) {
        m36033g(dVar, i, true);
        return this;
    }

    public final AbstractC4515f m36036d(C4511d dVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m36023q((m36029k(dVar) << 3) | 1);
        this.f6295a.write(m36024p(8).putDouble(d).array());
        return this;
    }

    public final AbstractC4515f m36035e(C4511d dVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m36023q((m36029k(dVar) << 3) | 5);
        this.f6295a.write(m36024p(4).putFloat(f).array());
        return this;
    }

    public final AbstractC4515f m36034f(C4511d dVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m36023q((m36029k(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6291f);
            m36023q(bytes.length);
            this.f6295a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m36034f(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m36026n(f6294i, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m36036d(dVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m36035e(dVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m36032h(dVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m36033g(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m36023q((m36029k(dVar) << 3) | 2);
            m36023q(bArr.length);
            this.f6295a.write(bArr);
            return this;
        } else {
            AbstractC4514e<?> eVar = this.f6296b.get(obj.getClass());
            if (eVar != null) {
                m36026n(eVar, dVar, obj, z);
                return this;
            }
            AbstractC4516g<?> gVar = this.f6297c.get(obj.getClass());
            if (gVar != null) {
                m36025o(gVar, dVar, obj, z);
                return this;
            } else if (obj instanceof AbstractC1662b2) {
                m36033g(dVar, ((AbstractC1662b2) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m36033g(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m36026n(this.f6298d, dVar, obj, z);
                return this;
            }
        }
    }

    public final C1737g2 m36033g(C4511d dVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        AbstractC1707e2 m = m36027m(dVar);
        EnumC1692d2 d2Var = EnumC1692d2.DEFAULT;
        int ordinal = m.zzb().ordinal();
        if (ordinal == 0) {
            m36023q(m.zza() << 3);
            m36023q(i);
        } else if (ordinal == 1) {
            m36023q(m.zza() << 3);
            m36023q((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m36023q((m.zza() << 3) | 5);
            this.f6295a.write(m36024p(4).putInt(i).array());
        }
        return this;
    }

    public final C1737g2 m36032h(C4511d dVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        AbstractC1707e2 m = m36027m(dVar);
        EnumC1692d2 d2Var = EnumC1692d2.DEFAULT;
        int ordinal = m.zzb().ordinal();
        if (ordinal == 0) {
            m36023q(m.zza() << 3);
            m36022r(j);
        } else if (ordinal == 1) {
            m36023q(m.zza() << 3);
            m36022r((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m36023q((m.zza() << 3) | 1);
            this.f6295a.write(m36024p(8).putLong(j).array());
        }
        return this;
    }

    public final C1737g2 m36031i(Object obj) {
        if (obj == null) {
            return this;
        }
        AbstractC4514e<?> eVar = this.f6296b.get(obj.getClass());
        if (eVar != null) {
            eVar.mo5165a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
        sb2.append("No encoder for ");
        sb2.append(valueOf);
        throw new C4510c(sb2.toString());
    }

    public final <T> long m36028l(AbstractC4514e<T> eVar, T t) {
        C1647a2 a2Var = new C1647a2();
        try {
            OutputStream outputStream = this.f6295a;
            this.f6295a = a2Var;
            eVar.mo5165a(t, this);
            this.f6295a = outputStream;
            long m = a2Var.m36121m();
            a2Var.close();
            return m;
        } catch (Throwable th) {
            try {
                a2Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final <T> C1737g2 m36026n(AbstractC4514e<T> eVar, C4511d dVar, T t, boolean z) {
        long l = m36028l(eVar, t);
        if (z && l == 0) {
            return this;
        }
        m36023q((m36029k(dVar) << 3) | 2);
        m36022r(l);
        eVar.mo5165a(t, this);
        return this;
    }

    public final <T> C1737g2 m36025o(AbstractC4516g<T> gVar, C4511d dVar, T t, boolean z) {
        this.f6299e.m35981a(dVar, z);
        gVar.mo5165a(t, this.f6299e);
        return this;
    }

    public final void m36023q(int i) {
        while ((i & (-128)) != 0) {
            this.f6295a.write((i & 127) | Log.TAG_YOUTUBE);
            i >>>= 7;
        }
        this.f6295a.write(i & 127);
    }

    public final void m36022r(long j) {
        while (((-128) & j) != 0) {
            this.f6295a.write((((int) j) & 127) | Log.TAG_YOUTUBE);
            j >>>= 7;
        }
        this.f6295a.write(((int) j) & 127);
    }
}
