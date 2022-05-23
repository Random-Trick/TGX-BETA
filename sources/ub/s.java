package ub;

import ja.i;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import ra.g;
import ra.k;

public interface s {
    public static final a f23926b = new a(null);
    public static final s f23925a = new a.C0226a();

    public static final class a {

        public static final class C0226a implements s {
            @Override
            public List<InetAddress> a(String str) {
                k.e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    k.d(allByName, "InetAddress.getAllByName(hostname)");
                    return i.L(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    List<InetAddress> a(String str);
}
