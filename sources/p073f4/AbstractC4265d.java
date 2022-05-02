package p073f4;

import p089g4.C4474b;
import p101h4.C4953b;
import p132j4.C5845a;
import p147k4.C6066h;
import p174m3.C6600g1;
import p175m4.C6737c;

public interface AbstractC4265d {
    public static final AbstractC4265d f14314a = new C4266a();

    public class C4266a implements AbstractC4265d {
        @Override
        public boolean mo28323a(C6600g1 g1Var) {
            String str = g1Var.f20575U;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override
        public AbstractC4264c mo28322b(C6600g1 g1Var) {
            String str = g1Var.f20575U;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C4474b();
                    case 1:
                        return new C5845a();
                    case 2:
                        return new C6066h();
                    case 3:
                        return new C4953b();
                    case 4:
                        return new C6737c();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean mo28323a(C6600g1 g1Var);

    AbstractC4264c mo28322b(C6600g1 g1Var);
}
