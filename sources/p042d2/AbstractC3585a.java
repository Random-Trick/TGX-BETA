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

    public abstract void mo29938A(byte[] bArr);

    public void m29962B(byte[] bArr, int i) {
        mo29924w(i);
        mo29938A(bArr);
    }

    public abstract void mo29937C(CharSequence charSequence);

    public void m29961D(CharSequence charSequence, int i) {
        mo29924w(i);
        mo29937C(charSequence);
    }

    public abstract void mo29936E(int i);

    public void m29960F(int i, int i2) {
        mo29924w(i2);
        mo29936E(i);
    }

    public abstract void mo29935G(Parcelable parcelable);

    public void m29959H(Parcelable parcelable, int i) {
        mo29924w(i);
        mo29935G(parcelable);
    }

    public abstract void mo29934I(String str);

    public void m29958J(String str, int i) {
        mo29924w(i);
        mo29934I(str);
    }

    public <T extends AbstractC3587c> void m29957K(T t, AbstractC3585a aVar) {
        try {
            m29951e(t.getClass()).invoke(null, t, aVar);
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

    public void m29956L(AbstractC3587c cVar) {
        if (cVar == null) {
            mo29934I(null);
            return;
        }
        m29954N(cVar);
        AbstractC3585a b = mo29932b();
        m29957K(cVar, b);
        b.mo29933a();
    }

    public void m29955M(AbstractC3587c cVar, int i) {
        mo29924w(i);
        m29956L(cVar);
    }

    public final void m29954N(AbstractC3587c cVar) {
        try {
            mo29934I(m29953c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract void mo29933a();

    public abstract AbstractC3585a mo29932b();

    public final Class m29953c(Class<? extends AbstractC3587c> cls) {
        Class cls2 = this.f12219c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f12219c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method m29952d(String str) {
        Method method = this.f12217a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3585a.class.getClassLoader()).getDeclaredMethod("read", AbstractC3585a.class);
        this.f12217a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method m29951e(Class cls) {
        Method method = this.f12218b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m29953c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", cls, AbstractC3585a.class);
        this.f12218b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean m29950f() {
        return false;
    }

    public abstract boolean mo29931g();

    public boolean m29949h(boolean z, int i) {
        return !mo29928m(i) ? z : mo29931g();
    }

    public abstract byte[] mo29930i();

    public byte[] m29948j(byte[] bArr, int i) {
        return !mo29928m(i) ? bArr : mo29930i();
    }

    public abstract CharSequence mo29929k();

    public CharSequence m29947l(CharSequence charSequence, int i) {
        return !mo29928m(i) ? charSequence : mo29929k();
    }

    public abstract boolean mo29928m(int i);

    public <T extends AbstractC3587c> T m29946n(String str, AbstractC3585a aVar) {
        try {
            return (T) m29952d(str).invoke(null, aVar);
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

    public abstract int mo29927o();

    public int m29945p(int i, int i2) {
        return !mo29928m(i2) ? i : mo29927o();
    }

    public abstract <T extends Parcelable> T mo29926q();

    public <T extends Parcelable> T m29944r(T t, int i) {
        return !mo29928m(i) ? t : (T) mo29926q();
    }

    public abstract String mo29925s();

    public String m29943t(String str, int i) {
        return !mo29928m(i) ? str : mo29925s();
    }

    public <T extends AbstractC3587c> T m29942u() {
        String s = mo29925s();
        if (s == null) {
            return null;
        }
        return (T) m29946n(s, mo29932b());
    }

    public <T extends AbstractC3587c> T m29941v(T t, int i) {
        return !mo29928m(i) ? t : (T) m29942u();
    }

    public abstract void mo29924w(int i);

    public void m29940x(boolean z, boolean z2) {
    }

    public abstract void mo29923y(boolean z);

    public void m29939z(boolean z, int i) {
        mo29924w(i);
        mo29923y(z);
    }
}
