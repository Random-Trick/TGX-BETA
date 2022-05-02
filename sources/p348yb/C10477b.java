package p348yb;

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
import p278tb.C9099l;
import p351z.C11183e;
import qa.C8298k;

public final class C10477b {
    public int f33562a;
    public boolean f33563b;
    public boolean f33564c;
    public final List<C9099l> f33565d;

    public C10477b(List<C9099l> list) {
        C8298k.m12933e(list, "connectionSpecs");
        this.f33565d = list;
    }

    public final C9099l m5053a(SSLSocket sSLSocket) {
        C9099l lVar;
        C8298k.m12933e(sSLSocket, "sslSocket");
        int i = this.f33562a;
        int size = this.f33565d.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.f33565d.get(i);
            if (lVar.m10448e(sSLSocket)) {
                this.f33562a = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            this.f33563b = m5051c(sSLSocket);
            lVar.m10450c(sSLSocket, this.f33564c);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f33564c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f33565d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C8298k.m12935c(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C8298k.m12934d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean m5052b(IOException iOException) {
        C8298k.m12933e(iOException, C11183e.f35837c);
        this.f33564c = true;
        return this.f33563b && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }

    public final boolean m5051c(SSLSocket sSLSocket) {
        int size = this.f33565d.size();
        for (int i = this.f33562a; i < size; i++) {
            if (this.f33565d.get(i).m10448e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
