package p281u1;

import android.content.Context;
import p281u1.AbstractC9421e;

public class C9420d {
    public static <T extends AbstractC9421e> AbstractC9421e.C9422a<T> m8736a(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new AbstractC9421e.C9422a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static <T, C> T m8735b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static <T extends AbstractC9421e> AbstractC9421e.C9422a<T> m8734c(Context context, Class<T> cls) {
        return new AbstractC9421e.C9422a<>(context, cls, null);
    }
}
