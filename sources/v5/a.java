package v5;

import dalvik.system.PathClassLoader;

public final class a extends PathClassLoader {
    public a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override
    public final Class<?> loadClass(String str, boolean z10) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z10);
    }
}
