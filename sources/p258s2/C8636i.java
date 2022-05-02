package p258s2;

import com.coremedia.iso.boxes.UserBox;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p269t2.AbstractC8950a;

public class C8636i extends AbstractC8627a {
    public static String[] f27950h = new String[0];
    public Properties f27951c;
    public Pattern f27952d = Pattern.compile("(.*)\\((.*?)\\)");
    public StringBuilder f27953e = new StringBuilder();
    public String f27954f;
    public String[] f27955g;

    public C8636i(String... strArr) {
        InputStream resourceAsStream = getClass().getResourceAsStream("/isoparser-default.properties");
        try {
            Properties properties = new Properties();
            this.f27951c = properties;
            try {
                properties.load(resourceAsStream);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Enumeration<URL> resources = (contextClassLoader == null ? ClassLoader.getSystemClassLoader() : contextClassLoader).getResources("isoparser-custom.properties");
                while (resources.hasMoreElements()) {
                    resourceAsStream = resources.nextElement().openStream();
                    try {
                        this.f27951c.load(resourceAsStream);
                        resourceAsStream.close();
                    } finally {
                        resourceAsStream.close();
                    }
                }
                for (String str : strArr) {
                    this.f27951c.load(getClass().getResourceAsStream(str));
                }
                try {
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            try {
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }

    @Override
    public AbstractC8950a mo11846b(String str, byte[] bArr, String str2) {
        m11845c(str, bArr, str2);
        try {
            Class<?> cls = Class.forName(this.f27954f);
            String[] strArr = this.f27955g;
            if (strArr.length <= 0) {
                return (AbstractC8950a) cls.newInstance();
            }
            Class<?>[] clsArr = new Class[strArr.length];
            Object[] objArr = new Object[strArr.length];
            int i = 0;
            while (true) {
                String[] strArr2 = this.f27955g;
                if (i >= strArr2.length) {
                    return (AbstractC8950a) cls.getConstructor(clsArr).newInstance(objArr);
                }
                if ("userType".equals(strArr2[i])) {
                    objArr[i] = bArr;
                    clsArr[i] = byte[].class;
                } else if ("type".equals(this.f27955g[i])) {
                    objArr[i] = str;
                    clsArr[i] = String.class;
                } else if ("parent".equals(this.f27955g[i])) {
                    objArr[i] = str2;
                    clsArr[i] = String.class;
                } else {
                    throw new InternalError("No such param: " + this.f27955g[i]);
                }
                i++;
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public void m11845c(String str, byte[] bArr, String str2) {
        String str3;
        if (bArr == null) {
            str3 = this.f27951c.getProperty(str);
            if (str3 == null) {
                StringBuilder sb2 = this.f27953e;
                sb2.append(str2);
                sb2.append('-');
                sb2.append(str);
                String sb3 = sb2.toString();
                this.f27953e.setLength(0);
                str3 = this.f27951c.getProperty(sb3);
            }
        } else if (UserBox.TYPE.equals(str)) {
            Properties properties = this.f27951c;
            str3 = properties.getProperty("uuid[" + C8630c.m11879b(bArr).toUpperCase() + "]");
            if (str3 == null) {
                Properties properties2 = this.f27951c;
                str3 = properties2.getProperty(String.valueOf(str2) + "-uuid[" + C8630c.m11879b(bArr).toUpperCase() + "]");
            }
            if (str3 == null) {
                str3 = this.f27951c.getProperty(UserBox.TYPE);
            }
        } else {
            throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
        }
        if (str3 == null) {
            str3 = this.f27951c.getProperty("default");
        }
        if (str3 == null) {
            throw new RuntimeException("No box object found for " + str);
        } else if (!str3.endsWith(")")) {
            this.f27955g = f27950h;
            this.f27954f = str3;
        } else {
            Matcher matcher = this.f27952d.matcher(str3);
            if (matcher.matches()) {
                this.f27954f = matcher.group(1);
                if (matcher.group(2).length() == 0) {
                    this.f27955g = f27950h;
                } else {
                    this.f27955g = matcher.group(2).length() > 0 ? matcher.group(2).split(",") : new String[0];
                }
            } else {
                throw new RuntimeException("Cannot work with that constructor: " + str3);
            }
        }
    }
}
