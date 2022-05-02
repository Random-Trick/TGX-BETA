package p285u5;

import dalvik.system.PathClassLoader;

public final class C9445a extends PathClassLoader {
    public C9445a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override
    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
