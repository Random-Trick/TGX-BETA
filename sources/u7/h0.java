package u7;

import java.util.Locale;

public final class h0 extends Exception {
    public final int f23630a;

    public h0(String str) {
        super(str);
        this.f23630a = a(str);
    }

    public final int a(String str) {
        char c10;
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1) {
            return 1;
        }
        if (c10 == 2) {
            return 2;
        }
        if (c10 != 3) {
            return c10 != 4 ? 0 : 4;
        }
        return 3;
    }
}
