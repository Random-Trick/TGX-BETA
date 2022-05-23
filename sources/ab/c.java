package ab;

import java.nio.charset.Charset;
import ra.k;

public final class c {
    public static final c f694a = new c();
    public static final Charset f695b;
    public static final Charset f696c;
    public static final Charset f697d;
    public static final Charset f698e;
    public static final Charset f699f;
    public static final Charset f700g;

    static {
        Charset forName = Charset.forName("UTF-8");
        k.d(forName, "forName(\"UTF-8\")");
        f695b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        k.d(forName2, "forName(\"UTF-16\")");
        f696c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        k.d(forName3, "forName(\"UTF-16BE\")");
        f697d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        k.d(forName4, "forName(\"UTF-16LE\")");
        f698e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        k.d(forName5, "forName(\"US-ASCII\")");
        f699f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        k.d(forName6, "forName(\"ISO-8859-1\")");
        f700g = forName6;
    }
}
