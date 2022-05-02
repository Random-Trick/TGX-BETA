package ec;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p123ia.C5303m;

public final class C4182a extends ProxySelector {
    public static final C4182a f14082a = new C4182a();

    @Override
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return C5303m.m23370b(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
