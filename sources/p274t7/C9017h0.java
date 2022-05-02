package p274t7;

import java.util.Locale;

public final class C9017h0 extends Exception {
    public final int f28944a;

    public C9017h0(String str) {
        super(str);
        this.f28944a = m10690a(str);
    }

    public final int m10690a(String str) {
        char c;
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        if (c == 2) {
            return 2;
        }
        if (c != 3) {
            return c != 4 ? 0 : 4;
        }
        return 3;
    }
}
