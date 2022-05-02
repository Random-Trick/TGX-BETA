package p046d6;

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

public final class C3723k8 implements AbstractC4515f {
    public static final C4511d f12628g;
    public static final C4511d f12629h;
    public OutputStream f12631a;
    public final Map<Class<?>, AbstractC4514e<?>> f12632b;
    public final Map<Class<?>, AbstractC4516g<?>> f12633c;
    public final AbstractC4514e<Object> f12634d;
    public final C3654e f12635e = new C3654e(this);
    public static final Charset f12627f = Charset.forName("UTF-8");
    public static final AbstractC4514e<Map.Entry<Object, Object>> f12630i = C3713j8.f12608a;

    static {
        C4511d.C4513b a = C4511d.m27510a("key");
        C3663e8 e8Var = new C3663e8();
        e8Var.m29843a(1);
        f12628g = a.m27505b(e8Var.m29842b()).m27506a();
        C4511d.C4513b a2 = C4511d.m27510a("value");
        C3663e8 e8Var2 = new C3663e8();
        e8Var2.m29843a(2);
        f12629h = a2.m27505b(e8Var2.m29842b()).m27506a();
    }

    public C3723k8(OutputStream outputStream, Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar) {
        this.f12631a = outputStream;
        this.f12632b = map;
        this.f12633c = map2;
        this.f12634d = eVar;
    }

    public static void m29818j(Map.Entry entry, AbstractC4515f fVar) {
        fVar.mo5192a(f12628g, entry.getKey());
        fVar.mo5192a(f12629h, entry.getValue());
    }

    public static int m29817k(C4511d dVar) {
        AbstractC3703i8 i8Var = (AbstractC3703i8) dVar.m27508c(AbstractC3703i8.class);
        if (i8Var != null) {
            return i8Var.zza();
        }
        throw new C4510c("Field has no @Protobuf config");
    }

    public static AbstractC3703i8 m29815m(C4511d dVar) {
        AbstractC3703i8 i8Var = (AbstractC3703i8) dVar.m27508c(AbstractC3703i8.class);
        if (i8Var != null) {
            return i8Var;
        }
        throw new C4510c("Field has no @Protobuf config");
    }

    public static ByteBuffer m29812p(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public final AbstractC4515f mo5192a(C4511d dVar, Object obj) {
        m29822f(dVar, obj, true);
        return this;
    }

    @Override
    public final AbstractC4515f mo5191b(C4511d dVar, long j) {
        m29820h(dVar, j, true);
        return this;
    }

    @Override
    public final AbstractC4515f mo5190c(C4511d dVar, int i) {
        m29821g(dVar, i, true);
        return this;
    }

    public final AbstractC4515f m29824d(C4511d dVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m29811q((m29817k(dVar) << 3) | 1);
        this.f12631a.write(m29812p(8).putDouble(d).array());
        return this;
    }

    public final AbstractC4515f m29823e(C4511d dVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m29811q((m29817k(dVar) << 3) | 5);
        this.f12631a.write(m29812p(4).putFloat(f).array());
        return this;
    }

    public final AbstractC4515f m29822f(C4511d dVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m29811q((m29817k(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f12627f);
            m29811q(bytes.length);
            this.f12631a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m29822f(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m29814n(f12630i, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m29824d(dVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m29823e(dVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m29820h(dVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m29821g(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m29811q((m29817k(dVar) << 3) | 2);
            m29811q(bArr.length);
            this.f12631a.write(bArr);
            return this;
        } else {
            AbstractC4514e<?> eVar = this.f12632b.get(obj.getClass());
            if (eVar != null) {
                m29814n(eVar, dVar, obj, z);
                return this;
            }
            AbstractC4516g<?> gVar = this.f12633c.get(obj.getClass());
            if (gVar != null) {
                m29813o(gVar, dVar, obj, z);
                return this;
            } else if (obj instanceof AbstractC3683g8) {
                m29821g(dVar, ((AbstractC3683g8) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m29821g(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m29814n(this.f12634d, dVar, obj, z);
                return this;
            }
        }
    }

    public final C3723k8 m29821g(C4511d dVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        AbstractC3703i8 m = m29815m(dVar);
        EnumC3693h8 h8Var = EnumC3693h8.DEFAULT;
        int ordinal = m.zzb().ordinal();
        if (ordinal == 0) {
            m29811q(m.zza() << 3);
            m29811q(i);
        } else if (ordinal == 1) {
            m29811q(m.zza() << 3);
            m29811q((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m29811q((m.zza() << 3) | 5);
            this.f12631a.write(m29812p(4).putInt(i).array());
        }
        return this;
    }

    public final C3723k8 m29820h(C4511d dVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        AbstractC3703i8 m = m29815m(dVar);
        EnumC3693h8 h8Var = EnumC3693h8.DEFAULT;
        int ordinal = m.zzb().ordinal();
        if (ordinal == 0) {
            m29811q(m.zza() << 3);
            m29810r(j);
        } else if (ordinal == 1) {
            m29811q(m.zza() << 3);
            m29810r((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m29811q((m.zza() << 3) | 1);
            this.f12631a.write(m29812p(8).putLong(j).array());
        }
        return this;
    }

    public final C3723k8 m29819i(Object obj) {
        if (obj == null) {
            return this;
        }
        AbstractC4514e<?> eVar = this.f12632b.get(obj.getClass());
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

    public final <T> long m29816l(AbstractC4514e<T> eVar, T t) {
        C3673f8 f8Var = new C3673f8();
        try {
            OutputStream outputStream = this.f12631a;
            this.f12631a = f8Var;
            eVar.mo5165a(t, this);
            this.f12631a = outputStream;
            long m = f8Var.m29834m();
            f8Var.close();
            return m;
        } catch (Throwable th) {
            try {
                f8Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final <T> C3723k8 m29814n(AbstractC4514e<T> eVar, C4511d dVar, T t, boolean z) {
        long l = m29816l(eVar, t);
        if (z && l == 0) {
            return this;
        }
        m29811q((m29817k(dVar) << 3) | 2);
        m29810r(l);
        eVar.mo5165a(t, this);
        return this;
    }

    public final <T> C3723k8 m29813o(AbstractC4516g<T> gVar, C4511d dVar, T t, boolean z) {
        this.f12635e.m29846a(dVar, z);
        gVar.mo5165a(t, this.f12635e);
        return this;
    }

    public final void m29811q(int i) {
        while ((i & (-128)) != 0) {
            this.f12631a.write((i & 127) | Log.TAG_YOUTUBE);
            i >>>= 7;
        }
        this.f12631a.write(i & 127);
    }

    public final void m29810r(long j) {
        while (((-128) & j) != 0) {
            this.f12631a.write((((int) j) & 127) | Log.TAG_YOUTUBE);
            j >>>= 7;
        }
        this.f12631a.write(((int) j) & 127);
    }
}
