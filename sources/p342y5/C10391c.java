package p342y5;

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

public final class C10391c implements AbstractC4515f {
    public static final C4511d f33442g;
    public static final C4511d f33443h;
    public OutputStream f33445a;
    public final Map<Class<?>, AbstractC4514e<?>> f33446b;
    public final Map<Class<?>, AbstractC4516g<?>> f33447c;
    public final AbstractC4514e<Object> f33448d;
    public final C10399g f33449e = new C10399g(this);
    public static final Charset f33441f = Charset.forName("UTF-8");
    public static final AbstractC4514e<Map.Entry<Object, Object>> f33444i = C10389b.f33438a;

    static {
        C4511d.C4513b a = C4511d.m27508a("key");
        C10390b0 b0Var = new C10390b0();
        b0Var.m5194a(1);
        f33442g = a.m27503b(b0Var.m5193b()).m27504a();
        C4511d.C4513b a2 = C4511d.m27508a("value");
        C10390b0 b0Var2 = new C10390b0();
        b0Var2.m5194a(2);
        f33443h = a2.m27503b(b0Var2.m5193b()).m27504a();
    }

    public C10391c(OutputStream outputStream, Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar) {
        this.f33445a = outputStream;
        this.f33446b = map;
        this.f33447c = map2;
        this.f33448d = eVar;
    }

    public static final void m5183j(Map.Entry entry, AbstractC4515f fVar) {
        fVar.mo5192a(f33442g, entry.getKey());
        fVar.mo5192a(f33443h, entry.getValue());
    }

    public static ByteBuffer m5179n(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int m5178o(C4511d dVar) {
        AbstractC10398f0 f0Var = (AbstractC10398f0) dVar.m27506c(AbstractC10398f0.class);
        if (f0Var != null) {
            return f0Var.zza();
        }
        throw new C4510c("Field has no @Protobuf config");
    }

    public static AbstractC10398f0 m5177p(C4511d dVar) {
        AbstractC10398f0 f0Var = (AbstractC10398f0) dVar.m27506c(AbstractC10398f0.class);
        if (f0Var != null) {
            return f0Var;
        }
        throw new C4510c("Field has no @Protobuf config");
    }

    @Override
    public final AbstractC4515f mo5192a(C4511d dVar, Object obj) {
        m5189d(dVar, obj, true);
        return this;
    }

    @Override
    public final AbstractC4515f mo5191b(C4511d dVar, long j) {
        m5185h(dVar, j, true);
        return this;
    }

    @Override
    public final AbstractC4515f mo5190c(C4511d dVar, int i) {
        m5186g(dVar, i, true);
        return this;
    }

    public final AbstractC4515f m5189d(C4511d dVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m5176q((m5178o(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f33441f);
            m5176q(bytes.length);
            this.f33445a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m5189d(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m5182k(f33444i, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m5188e(dVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m5187f(dVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m5185h(dVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m5186g(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m5176q((m5178o(dVar) << 3) | 2);
            m5176q(bArr.length);
            this.f33445a.write(bArr);
            return this;
        } else {
            AbstractC4514e<?> eVar = this.f33446b.get(obj.getClass());
            if (eVar != null) {
                m5182k(eVar, dVar, obj, z);
                return this;
            }
            AbstractC4516g<?> gVar = this.f33447c.get(obj.getClass());
            if (gVar != null) {
                m5180m(gVar, dVar, obj, z);
                return this;
            } else if (obj instanceof AbstractC10394d0) {
                m5186g(dVar, ((AbstractC10394d0) obj).mo5173a(), true);
                return this;
            } else if (obj instanceof Enum) {
                m5186g(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m5182k(this.f33448d, dVar, obj, z);
                return this;
            }
        }
    }

    public final AbstractC4515f m5188e(C4511d dVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m5176q((m5178o(dVar) << 3) | 1);
        this.f33445a.write(m5179n(8).putDouble(d).array());
        return this;
    }

    public final AbstractC4515f m5187f(C4511d dVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m5176q((m5178o(dVar) << 3) | 5);
        this.f33445a.write(m5179n(4).putFloat(f).array());
        return this;
    }

    public final C10391c m5186g(C4511d dVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        AbstractC10398f0 p = m5177p(dVar);
        EnumC10396e0 e0Var = EnumC10396e0.DEFAULT;
        int ordinal = p.zzb().ordinal();
        if (ordinal == 0) {
            m5176q(p.zza() << 3);
            m5176q(i);
        } else if (ordinal == 1) {
            m5176q(p.zza() << 3);
            m5176q((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m5176q((p.zza() << 3) | 5);
            this.f33445a.write(m5179n(4).putInt(i).array());
        }
        return this;
    }

    public final C10391c m5185h(C4511d dVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        AbstractC10398f0 p = m5177p(dVar);
        EnumC10396e0 e0Var = EnumC10396e0.DEFAULT;
        int ordinal = p.zzb().ordinal();
        if (ordinal == 0) {
            m5176q(p.zza() << 3);
            m5175r(j);
        } else if (ordinal == 1) {
            m5176q(p.zza() << 3);
            m5175r((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m5176q((p.zza() << 3) | 1);
            this.f33445a.write(m5179n(8).putLong(j).array());
        }
        return this;
    }

    public final C10391c m5184i(Object obj) {
        if (obj == null) {
            return this;
        }
        AbstractC4514e<?> eVar = this.f33446b.get(obj.getClass());
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

    public final <T> C10391c m5182k(AbstractC4514e<T> eVar, C4511d dVar, T t, boolean z) {
        long l = m5181l(eVar, t);
        if (z && l == 0) {
            return this;
        }
        m5176q((m5178o(dVar) << 3) | 2);
        m5175r(l);
        eVar.mo5165a(t, this);
        return this;
    }

    public final <T> long m5181l(AbstractC4514e<T> eVar, T t) {
        C10392c0 c0Var = new C10392c0();
        try {
            OutputStream outputStream = this.f33445a;
            this.f33445a = c0Var;
            eVar.mo5165a(t, this);
            this.f33445a = outputStream;
            long m = c0Var.m5174m();
            c0Var.close();
            return m;
        } catch (Throwable th) {
            try {
                c0Var.close();
            } catch (Throwable th2) {
                C10418z.m5154a(th, th2);
            }
            throw th;
        }
    }

    public final <T> C10391c m5180m(AbstractC4516g<T> gVar, C4511d dVar, T t, boolean z) {
        this.f33449e.m5169a(dVar, z);
        gVar.mo5165a(t, this.f33449e);
        return this;
    }

    public final void m5176q(int i) {
        while ((i & (-128)) != 0) {
            this.f33445a.write((i & 127) | Log.TAG_YOUTUBE);
            i >>>= 7;
        }
        this.f33445a.write(i & 127);
    }

    public final void m5175r(long j) {
        while (((-128) & j) != 0) {
            this.f33445a.write((((int) j) & 127) | Log.TAG_YOUTUBE);
            j >>>= 7;
        }
        this.f33445a.write(((int) j) & 127);
    }
}
