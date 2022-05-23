package fc;

import ja.m;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

public final class a extends ProxySelector {
    public static final a f11878a = new a();

    @Override
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return m.b(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
