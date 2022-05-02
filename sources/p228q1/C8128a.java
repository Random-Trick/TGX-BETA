package p228q1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

public final class C8128a {
    public static final Set<File> f26408a = new HashSet();
    public static final boolean f26409b = m13394n(System.getProperty("java.vm.version"));

    public static final class C8129a {
        public static final int f26410b = 4;
        public final AbstractC8130a f26411a;

        public interface AbstractC8130a {
            Object mo13389a(File file, DexFile dexFile);
        }

        public static class C8131b implements AbstractC8130a {
            public final Constructor<?> f26412a;

            public C8131b(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f26412a = constructor;
                constructor.setAccessible(true);
            }

            @Override
            public Object mo13389a(File file, DexFile dexFile) {
                return this.f26412a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        public static class C8132c implements AbstractC8130a {
            public final Constructor<?> f26413a;

            public C8132c(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f26413a = constructor;
                constructor.setAccessible(true);
            }

            @Override
            public Object mo13389a(File file, DexFile dexFile) {
                return this.f26413a.newInstance(file, file, dexFile);
            }
        }

        public static class C8133d implements AbstractC8130a {
            public final Constructor<?> f26414a;

            public C8133d(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f26414a = constructor;
                constructor.setAccessible(true);
            }

            @Override
            public Object mo13389a(File file, DexFile dexFile) {
                return this.f26414a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        public C8129a() {
            AbstractC8130a aVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    aVar = new C8131b(cls);
                } catch (NoSuchMethodException unused) {
                    aVar = new C8132c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                aVar = new C8133d(cls);
            }
            this.f26411a = aVar;
        }

        public static void m13392a(ClassLoader classLoader, List<? extends File> list) {
            Object obj = C8128a.m13401g(classLoader, "pathList").get(classLoader);
            Object[] b = new C8129a().m13391b(list);
            try {
                C8128a.m13402f(obj, "dexElements", b);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                C8128a.m13402f(obj, "pathElements", b);
            }
        }

        public static String m13390c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f26410b) + ".dex").getPath();
        }

        public final Object[] m13391b(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = list.get(i);
                objArr[i] = this.f26411a.mo13389a(file, DexFile.loadDex(file.getPath(), m13390c(file), 0));
            }
            return objArr;
        }
    }

    public static final class C8134b {
        public static void m13388a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = C8128a.m13401g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C8128a.m13402f(obj, "dexElements", m13387b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field g = C8128a.m13401g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                g.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        public static Object[] m13387b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) C8128a.m13400h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static final class C8135c {
        public static void m13386a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field g = C8128a.m13401g(classLoader, "path");
            StringBuilder sb2 = new StringBuilder((String) g.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb2.append(':');
                sb2.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new ZipFile(next);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            g.set(classLoader, sb2.toString());
            C8128a.m13402f(classLoader, "mPaths", strArr);
            C8128a.m13402f(classLoader, "mFiles", fileArr);
            C8128a.m13402f(classLoader, "mZips", zipFileArr);
            C8128a.m13402f(classLoader, "mDexs", dexFileArr);
        }
    }

    public static void m13404d(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
        }
    }

    public static void m13403e(Context context, File file, File file2, String str, String str2, boolean z) {
        Set<File> set = f26408a;
        synchronized (set) {
            if (!set.contains(file)) {
                set.add(file);
                int i = Build.VERSION.SDK_INT;
                if (i > 20) {
                    Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                }
                ClassLoader j = m13398j(context);
                if (j != null) {
                    m13404d(context);
                    File k = m13397k(context, file2, str);
                    C8137c cVar = new C8137c(file, k);
                    IOException e = null;
                    try {
                        m13395m(j, k, cVar.m13382D0(context, str2, false));
                    } catch (IOException e2) {
                        if (z) {
                            Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                            m13395m(j, k, cVar.m13382D0(context, str2, true));
                        } else {
                            throw e2;
                        }
                    }
                    try {
                        cVar.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
            }
        }
    }

    public static void m13402f(Object obj, String str, Object[] objArr) {
        Field g = m13401g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    public static Field m13401g(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method m13400h(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static ApplicationInfo m13399i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    public static ClassLoader m13398j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (Build.VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    public static File m13397k(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            m13393o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m13393o(file2);
        }
        File file3 = new File(file2, str);
        m13393o(file3);
        return file3;
    }

    public static void m13396l(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f26409b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 4) {
            try {
                ApplicationInfo i2 = m13399i(context);
                if (i2 == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                m13403e(context, new File(i2.sourceDir), new File(i2.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            } catch (Exception e) {
                Log.e("MultiDex", "MultiDex installation failure", e);
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + i + " is unsupported. Min SDK version is 4.");
        }
    }

    public static void m13395m(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                C8134b.m13388a(classLoader, list, file);
            } else if (i >= 14) {
                C8129a.m13392a(classLoader, list);
            } else {
                C8135c.m13386a(classLoader, list);
            }
        }
    }

    public static boolean m13394n(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VM with version ");
        sb2.append(str);
        sb2.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb2.toString());
        return z;
    }

    public static void m13393o(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
