package e6;

import h7.c;
import h7.d;
import h7.e;
import h7.f;
import h7.g;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import org.thunderdog.challegram.Log;

public final class k8 implements f {
    public static final d f10889g;
    public static final d f10890h;
    public OutputStream f10892a;
    public final Map<Class<?>, e<?>> f10893b;
    public final Map<Class<?>, g<?>> f10894c;
    public final e<Object> f10895d;
    public final e f10896e = new e(this);
    public static final Charset f10888f = Charset.forName("UTF-8");
    public static final e<Map.Entry<Object, Object>> f10891i = j8.f10869a;

    static {
        d.b a10 = d.a("key");
        e8 e8Var = new e8();
        e8Var.a(1);
        f10889g = a10.b(e8Var.b()).a();
        d.b a11 = d.a("value");
        e8 e8Var2 = new e8();
        e8Var2.a(2);
        f10890h = a11.b(e8Var2.b()).a();
    }

    public k8(OutputStream outputStream, Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f10892a = outputStream;
        this.f10893b = map;
        this.f10894c = map2;
        this.f10895d = eVar;
    }

    public static void j(Map.Entry entry, f fVar) {
        fVar.a(f10889g, entry.getKey());
        fVar.a(f10890h, entry.getValue());
    }

    public static int k(d dVar) {
        i8 i8Var = (i8) dVar.c(i8.class);
        if (i8Var != null) {
            return i8Var.zza();
        }
        throw new c("Field has no @Protobuf config");
    }

    public static i8 m(d dVar) {
        i8 i8Var = (i8) dVar.c(i8.class);
        if (i8Var != null) {
            return i8Var;
        }
        throw new c("Field has no @Protobuf config");
    }

    public static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public final f a(d dVar, Object obj) {
        f(dVar, obj, true);
        return this;
    }

    @Override
    public final f b(d dVar, long j10) {
        h(dVar, j10, true);
        return this;
    }

    @Override
    public final f c(d dVar, int i10) {
        g(dVar, i10, true);
        return this;
    }

    public final f d(d dVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        q((k(dVar) << 3) | 1);
        this.f10892a.write(p(8).putDouble(d10).array());
        return this;
    }

    public final f e(d dVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((k(dVar) << 3) | 5);
        this.f10892a.write(p(4).putFloat(f10).array());
        return this;
    }

    public final f f(d dVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            q((k(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f10888f);
            q(bytes.length);
            this.f10892a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                f(dVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                n(f10891i, dVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            d(dVar, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            e(dVar, ((Float) obj).floatValue(), z10);
            return this;
        } else if (obj instanceof Number) {
            h(dVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            g(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            q((k(dVar) << 3) | 2);
            q(bArr.length);
            this.f10892a.write(bArr);
            return this;
        } else {
            e<?> eVar = this.f10893b.get(obj.getClass());
            if (eVar != null) {
                n(eVar, dVar, obj, z10);
                return this;
            }
            g<?> gVar = this.f10894c.get(obj.getClass());
            if (gVar != null) {
                o(gVar, dVar, obj, z10);
                return this;
            } else if (obj instanceof g8) {
                g(dVar, ((g8) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                g(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                n(this.f10895d, dVar, obj, z10);
                return this;
            }
        }
    }

    public final k8 g(d dVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        i8 m10 = m(dVar);
        h8 h8Var = h8.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            q(i10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            q((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 5);
            this.f10892a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    public final k8 h(d dVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        i8 m10 = m(dVar);
        h8 h8Var = h8.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            r(j10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            r((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 1);
            this.f10892a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    public final k8 i(Object obj) {
        if (obj == null) {
            return this;
        }
        e<?> eVar = this.f10893b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
        sb2.append("No encoder for ");
        sb2.append(valueOf);
        throw new c(sb2.toString());
    }

    public final <T> long l(e<T> eVar, T t10) {
        f8 f8Var = new f8();
        try {
            OutputStream outputStream = this.f10892a;
            this.f10892a = f8Var;
            eVar.a(t10, this);
            this.f10892a = outputStream;
            long m10 = f8Var.m();
            f8Var.close();
            return m10;
        } catch (Throwable th) {
            try {
                f8Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final <T> k8 n(e<T> eVar, d dVar, T t10, boolean z10) {
        long l10 = l(eVar, t10);
        if (z10 && l10 == 0) {
            return this;
        }
        q((k(dVar) << 3) | 2);
        r(l10);
        eVar.a(t10, this);
        return this;
    }

    public final <T> k8 o(g<T> gVar, d dVar, T t10, boolean z10) {
        this.f10896e.a(dVar, z10);
        gVar.a(t10, this.f10896e);
        return this;
    }

    public final void q(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f10892a.write((i10 & 127) | Log.TAG_YOUTUBE);
            i10 >>>= 7;
        }
        this.f10892a.write(i10 & 127);
    }

    public final void r(long j10) {
        while (((-128) & j10) != 0) {
            this.f10892a.write((((int) j10) & 127) | Log.TAG_YOUTUBE);
            j10 >>>= 7;
        }
        this.f10892a.write(((int) j10) & 127);
    }
}
