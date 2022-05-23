package ac;

import ab.n;
import java.net.ProtocolException;
import ra.g;
import ub.a0;

public final class k {
    public static final a f739d = new a(null);
    public final a0 f740a;
    public final int f741b;
    public final String f742c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final k a(String str) {
            a0 a0Var;
            String str2;
            ra.k.e(str, "statusLine");
            int i10 = 9;
            if (n.x(str, "HTTP/1.", false, 2, null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    a0Var = a0.HTTP_1_0;
                } else if (charAt == 1) {
                    a0Var = a0.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (n.x(str, "ICY ", false, 2, null)) {
                a0Var = a0.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    ra.k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = "";
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        ra.k.d(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }

    public k(a0 a0Var, int i10, String str) {
        ra.k.e(a0Var, "protocol");
        ra.k.e(str, "message");
        this.f740a = a0Var;
        this.f741b = i10;
        this.f742c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f740a == a0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f741b);
        sb2.append(' ');
        sb2.append(this.f742c);
        String sb3 = sb2.toString();
        ra.k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
