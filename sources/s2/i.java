package s2;

import com.coremedia.iso.boxes.UserBox;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t2.a;

public class i extends a {
    public static String[] f22463h = new String[0];
    public Properties f22464c;
    public Pattern f22465d = Pattern.compile("(.*)\\((.*?)\\)");
    public StringBuilder f22466e = new StringBuilder();
    public String f22467f;
    public String[] f22468g;

    public i(String... strArr) {
        InputStream resourceAsStream = getClass().getResourceAsStream("/isoparser-default.properties");
        try {
            Properties properties = new Properties();
            this.f22464c = properties;
            try {
                properties.load(resourceAsStream);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Enumeration<URL> resources = (contextClassLoader == null ? ClassLoader.getSystemClassLoader() : contextClassLoader).getResources("isoparser-custom.properties");
                while (resources.hasMoreElements()) {
                    resourceAsStream = resources.nextElement().openStream();
                    try {
                        this.f22464c.load(resourceAsStream);
                        resourceAsStream.close();
                    } finally {
                        resourceAsStream.close();
                    }
                }
                for (String str : strArr) {
                    this.f22464c.load(getClass().getResourceAsStream(str));
                }
                try {
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th) {
            try {
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            throw th;
        }
    }

    @Override
    public a b(String str, byte[] bArr, String str2) {
        c(str, bArr, str2);
        try {
            Class<?> cls = Class.forName(this.f22467f);
            String[] strArr = this.f22468g;
            if (strArr.length <= 0) {
                return (a) cls.newInstance();
            }
            Class<?>[] clsArr = new Class[strArr.length];
            Object[] objArr = new Object[strArr.length];
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f22468g;
                if (i10 >= strArr2.length) {
                    return (a) cls.getConstructor(clsArr).newInstance(objArr);
                }
                if ("userType".equals(strArr2[i10])) {
                    objArr[i10] = bArr;
                    clsArr[i10] = byte[].class;
                } else if ("type".equals(this.f22468g[i10])) {
                    objArr[i10] = str;
                    clsArr[i10] = String.class;
                } else if ("parent".equals(this.f22468g[i10])) {
                    objArr[i10] = str2;
                    clsArr[i10] = String.class;
                } else {
                    throw new InternalError("No such param: " + this.f22468g[i10]);
                }
                i10++;
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException(e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(e14);
        }
    }

    public void c(String str, byte[] bArr, String str2) {
        String str3;
        if (bArr == null) {
            str3 = this.f22464c.getProperty(str);
            if (str3 == null) {
                StringBuilder sb2 = this.f22466e;
                sb2.append(str2);
                sb2.append('-');
                sb2.append(str);
                String sb3 = sb2.toString();
                this.f22466e.setLength(0);
                str3 = this.f22464c.getProperty(sb3);
            }
        } else if (UserBox.TYPE.equals(str)) {
            Properties properties = this.f22464c;
            str3 = properties.getProperty("uuid[" + c.b(bArr).toUpperCase() + "]");
            if (str3 == null) {
                Properties properties2 = this.f22464c;
                str3 = properties2.getProperty(String.valueOf(str2) + "-uuid[" + c.b(bArr).toUpperCase() + "]");
            }
            if (str3 == null) {
                str3 = this.f22464c.getProperty(UserBox.TYPE);
            }
        } else {
            throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
        }
        if (str3 == null) {
            str3 = this.f22464c.getProperty("default");
        }
        if (str3 == null) {
            throw new RuntimeException("No box object found for " + str);
        } else if (!str3.endsWith(")")) {
            this.f22468g = f22463h;
            this.f22467f = str3;
        } else {
            Matcher matcher = this.f22465d.matcher(str3);
            if (matcher.matches()) {
                this.f22467f = matcher.group(1);
                if (matcher.group(2).length() == 0) {
                    this.f22468g = f22463h;
                } else {
                    this.f22468g = matcher.group(2).length() > 0 ? matcher.group(2).split(",") : new String[0];
                }
            } else {
                throw new RuntimeException("Cannot work with that constructor: " + str3);
            }
        }
    }
}
