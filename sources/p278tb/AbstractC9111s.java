package p278tb;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p123ia.C5296i;
import qa.C8294g;
import qa.C8298k;

public interface AbstractC9111s {
    public static final C9112a f29322b = new C9112a(null);
    public static final AbstractC9111s f29321a = new C9112a.C9113a();

    public static final class C9112a {

        public static final class C9113a implements AbstractC9111s {
            @Override
            public List<InetAddress> mo10411a(String str) {
                C8298k.m12934e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C8298k.m12935d(allByName, "InetAddress.getAllByName(hostname)");
                    return C5296i.m23401L(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        public C9112a() {
        }

        public C9112a(C8294g gVar) {
            this();
        }
    }

    List<InetAddress> mo10411a(String str);
}
