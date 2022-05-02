package p042d2;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p143k0.C6024a;

public abstract class AbstractC3585a {
    public final C6024a<String, Method> f12217a;
    public final C6024a<String, Method> f12218b;
    public final C6024a<String, Class> f12219c;

    public AbstractC3585a(C6024a<String, Method> aVar, C6024a<String, Method> aVar2, C6024a<String, Class> aVar3) {
        this.f12217a = aVar;
        this.f12218b = aVar2;
        this.f12219c = aVar3;
    }

    public abstract void mo29936A(byte[] bArr);

    public void m29960B(byte[] bArr, int i) {
        mo29922w(i);
        mo29936A(bArr);
    }

    public abstract void mo29935C(CharSequence charSequence);

    public void m29959D(CharSequence charSequence, int i) {
        mo29922w(i);
        mo29935C(charSequence);
    }

    public abstract void mo29934E(int i);

    public void m29958F(int i, int i2) {
        mo29922w(i2);
        mo29934E(i);
    }

    public abstract void mo29933G(Parcelable parcelable);

    public void m29957H(Parcelable parcelable, int i) {
        mo29922w(i);
        mo29933G(parcelable);
    }

    public abstract void mo29932I(String str);

    public void m29956J(String str, int i) {
        mo29922w(i);
        mo29932I(str);
    }

    public <T extends AbstractC3587c> void m29955K(T t, AbstractC3585a aVar) {
        try {
            m29949e(t.getClass()).invoke(null, t, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public void m29954L(AbstractC3587c cVar) {
        if (cVar == null) {
            mo29932I(null);
            return;
        }
        m29952N(cVar);
        AbstractC3585a b = mo29930b();
        m29955K(cVar, b);
        b.mo29931a();
    }

    public void m29953M(AbstractC3587c cVar, int i) {
        mo29922w(i);
        m29954L(cVar);
    }

    public final void m29952N(AbstractC3587c cVar) {
        try {
            mo29932I(m29951c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract void mo29931a();

    public abstract AbstractC3585a mo29930b();

    public final Class m29951c(Class<? extends AbstractC3587c> cls) {
        Class cls2 = this.f12219c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f12219c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method m29950d(String str) {
        Method method = this.f12217a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3585a.class.getClassLoader()).getDeclaredMethod("read", AbstractC3585a.class);
        this.f12217a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method m29949e(Class cls) {
        Method method = this.f12218b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m29951c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", cls, AbstractC3585a.class);
        this.f12218b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean m29948f() {
        return false;
    }

    public abstract boolean mo29929g();

    public boolean m29947h(boolean z, int i) {
        return !mo29926m(i) ? z : mo29929g();
    }

    public abstract byte[] mo29928i();

    public byte[] m29946j(byte[] bArr, int i) {
        return !mo29926m(i) ? bArr : mo29928i();
    }

    public abstract CharSequence mo29927k();

    public CharSequence m29945l(CharSequence charSequence, int i) {
        return !mo29926m(i) ? charSequence : mo29927k();
    }

    public abstract boolean mo29926m(int i);

    public <T extends AbstractC3587c> T m29944n(String str, AbstractC3585a aVar) {
        try {
            return (T) m29950d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract int mo29925o();

    public int m29943p(int i, int i2) {
        return !mo29926m(i2) ? i : mo29925o();
    }

    public abstract <T extends Parcelable> T mo29924q();

    public <T extends Parcelable> T m29942r(T t, int i) {
        return !mo29926m(i) ? t : (T) mo29924q();
    }

    public abstract String mo29923s();

    public String m29941t(String str, int i) {
        return !mo29926m(i) ? str : mo29923s();
    }

    public <T extends AbstractC3587c> T m29940u() {
        String s = mo29923s();
        if (s == null) {
            return null;
        }
        return (T) m29944n(s, mo29930b());
    }

    public <T extends AbstractC3587c> T m29939v(T t, int i) {
        return !mo29926m(i) ? t : (T) m29940u();
    }

    public abstract void mo29922w(int i);

    public void m29938x(boolean z, boolean z2) {
    }

    public abstract void mo29921y(boolean z);

    public void m29937z(boolean z, int i) {
        mo29922w(i);
        mo29921y(z);
    }
}
