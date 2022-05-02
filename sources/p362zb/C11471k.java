package p362zb;

import java.net.ProtocolException;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public final class C11471k {
    public static final C11472a f36444d = new C11472a(null);
    public final EnumC9064a0 f36445a;
    public final int f36446b;
    public final String f36447c;

    public static final class C11472a {
        public C11472a() {
        }

        public final C11471k m516a(String str) {
            EnumC9064a0 a0Var;
            String str2;
            C8298k.m12934e(str, "statusLine");
            int i = 9;
            if (C11451n.m621x(str, "HTTP/1.", false, 2, null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    a0Var = EnumC9064a0.HTTP_1_0;
                } else if (charAt == 1) {
                    a0Var = EnumC9064a0.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (C11451n.m621x(str, "ICY ", false, 2, null)) {
                a0Var = EnumC9064a0.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C8298k.m12935d(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new C11471k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        public C11472a(C8294g gVar) {
            this();
        }
    }

    public C11471k(EnumC9064a0 a0Var, int i, String str) {
        C8298k.m12934e(a0Var, "protocol");
        C8298k.m12934e(str, "message");
        this.f36445a = a0Var;
        this.f36446b = i;
        this.f36447c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f36445a == EnumC9064a0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f36446b);
        sb2.append(' ');
        sb2.append(this.f36447c);
        String sb3 = sb2.toString();
        C8298k.m12935d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
