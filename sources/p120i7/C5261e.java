package p120i7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4515f;
import p092g7.AbstractC4516g;
import p092g7.AbstractC4517h;
import p092g7.C4510c;
import p092g7.C4511d;

public final class C5261e implements AbstractC4515f, AbstractC4517h {
    public C5261e f17429a = null;
    public boolean f17430b = true;
    public final JsonWriter f17431c;
    public final Map<Class<?>, AbstractC4514e<?>> f17432d;
    public final Map<Class<?>, AbstractC4516g<?>> f17433e;
    public final AbstractC4514e<Object> f17434f;
    public final boolean f17435g;

    public C5261e(Writer writer, Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar, boolean z) {
        this.f17431c = new JsonWriter(writer);
        this.f17432d = map;
        this.f17433e = map2;
        this.f17434f = eVar;
        this.f17435g = z;
    }

    @Override
    public AbstractC4515f mo5192a(C4511d dVar, Object obj) {
        return m23504l(dVar.m27509b(), obj);
    }

    @Override
    public AbstractC4515f mo5191b(C4511d dVar, long j) {
        return m23505k(dVar.m27509b(), j);
    }

    @Override
    public AbstractC4515f mo5190c(C4511d dVar, int i) {
        return m23506j(dVar.m27509b(), i);
    }

    public C5261e m23510f(int i) {
        m23496t();
        this.f17431c.value(i);
        return this;
    }

    public C5261e m23509g(long j) {
        m23496t();
        this.f17431c.value(j);
        return this;
    }

    public C5261e m23508h(Object obj, boolean z) {
        int[] iArr;
        int i = 0;
        if (z && m23501o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C4510c(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f17431c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f17431c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m23502n((byte[]) obj);
            }
            this.f17431c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f17431c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    m23509g(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f17431c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f17431c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m23508h(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m23508h(obj2, false);
                }
            }
            this.f17431c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f17431c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m23508h(obj3, false);
            }
            this.f17431c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f17431c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m23504l((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C4510c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f17431c.endObject();
            return this;
        } else {
            AbstractC4514e<?> eVar = this.f17432d.get(obj.getClass());
            if (eVar != null) {
                return m23499q(eVar, obj, z);
            }
            AbstractC4516g<?> gVar = this.f17433e.get(obj.getClass());
            if (gVar != null) {
                gVar.mo5165a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return m23499q(this.f17434f, obj, z);
            } else {
                mo5167d(((Enum) obj).name());
                return this;
            }
        }
    }

    public C5261e mo5167d(String str) {
        m23496t();
        this.f17431c.value(str);
        return this;
    }

    public C5261e m23506j(String str, int i) {
        m23496t();
        this.f17431c.name(str);
        return m23510f(i);
    }

    public C5261e m23505k(String str, long j) {
        m23496t();
        this.f17431c.name(str);
        return m23509g(j);
    }

    public C5261e m23504l(String str, Object obj) {
        if (this.f17435g) {
            return m23497s(str, obj);
        }
        return m23498r(str, obj);
    }

    public C5261e mo5166e(boolean z) {
        m23496t();
        this.f17431c.value(z);
        return this;
    }

    public C5261e m23502n(byte[] bArr) {
        m23496t();
        if (bArr == null) {
            this.f17431c.nullValue();
        } else {
            this.f17431c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean m23501o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void m23500p() {
        m23496t();
        this.f17431c.flush();
    }

    public C5261e m23499q(AbstractC4514e<Object> eVar, Object obj, boolean z) {
        if (!z) {
            this.f17431c.beginObject();
        }
        eVar.mo5165a(obj, this);
        if (!z) {
            this.f17431c.endObject();
        }
        return this;
    }

    public final C5261e m23498r(String str, Object obj) {
        m23496t();
        this.f17431c.name(str);
        if (obj != null) {
            return m23508h(obj, false);
        }
        this.f17431c.nullValue();
        return this;
    }

    public final C5261e m23497s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m23496t();
        this.f17431c.name(str);
        return m23508h(obj, false);
    }

    public final void m23496t() {
        if (this.f17430b) {
            C5261e eVar = this.f17429a;
            if (eVar != null) {
                eVar.m23496t();
                this.f17429a.f17430b = false;
                this.f17429a = null;
                this.f17431c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
