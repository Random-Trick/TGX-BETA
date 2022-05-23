package zb;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import ra.k;
import ub.l;
import z.e;

public final class b {
    public int f27068a;
    public boolean f27069b;
    public boolean f27070c;
    public final List<l> f27071d;

    public b(List<l> list) {
        k.e(list, "connectionSpecs");
        this.f27071d = list;
    }

    public final l a(SSLSocket sSLSocket) {
        l lVar;
        k.e(sSLSocket, "sslSocket");
        int i10 = this.f27068a;
        int size = this.f27071d.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = this.f27071d.get(i10);
            if (lVar.e(sSLSocket)) {
                this.f27068a = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f27069b = c(sSLSocket);
            lVar.c(sSLSocket, this.f27070c);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f27070c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f27071d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        k.c(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        k.d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        k.e(iOException, e.f26712c);
        this.f27070c = true;
        return this.f27069b && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }

    public final boolean c(SSLSocket sSLSocket) {
        int size = this.f27071d.size();
        for (int i10 = this.f27068a; i10 < size; i10++) {
            if (this.f27071d.get(i10).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
