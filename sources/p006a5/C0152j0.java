package p006a5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p020b5.C1186a;

public final class C0152j0 extends AbstractC0139f {
    public final int f537e;
    public final byte[] f538f;
    public final DatagramPacket f539g;
    public Uri f540h;
    public DatagramSocket f541i;
    public MulticastSocket f542j;
    public InetAddress f543k;
    public boolean f544l;
    public int f545m;

    public static final class C0153a extends C0156l {
        public C0153a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C0152j0() {
        this(2000);
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f545m == 0) {
            try {
                ((DatagramSocket) C1186a.m38185e(this.f541i)).receive(this.f539g);
                int length = this.f539g.getLength();
                this.f545m = length;
                m42225s(length);
            } catch (SocketTimeoutException e) {
                throw new C0153a(e, 2002);
            } catch (IOException e2) {
                throw new C0153a(e2, 2001);
            }
        }
        int length2 = this.f539g.getLength();
        int i3 = this.f545m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f538f, length2 - i3, bArr, i, min);
        this.f545m -= min;
        return min;
    }

    @Override
    public long mo4413c(C0159o oVar) {
        Uri uri = oVar.f553a;
        this.f540h = uri;
        String str = (String) C1186a.m38185e(uri.getHost());
        int port = this.f540h.getPort();
        m42223u(oVar);
        try {
            this.f543k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f543k, port);
            if (this.f543k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f542j = multicastSocket;
                multicastSocket.joinGroup(this.f543k);
                this.f541i = this.f542j;
            } else {
                this.f541i = new DatagramSocket(inetSocketAddress);
            }
            this.f541i.setSoTimeout(this.f537e);
            this.f544l = true;
            m42222v(oVar);
            return -1L;
        } catch (IOException e) {
            throw new C0153a(e, 2001);
        } catch (SecurityException e2) {
            throw new C0153a(e2, 2006);
        }
    }

    @Override
    public void close() {
        this.f540h = null;
        MulticastSocket multicastSocket = this.f542j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C1186a.m38185e(this.f543k));
            } catch (IOException unused) {
            }
            this.f542j = null;
        }
        DatagramSocket datagramSocket = this.f541i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f541i = null;
        }
        this.f543k = null;
        this.f545m = 0;
        if (this.f544l) {
            this.f544l = false;
            m42224t();
        }
    }

    @Override
    public Uri mo4412p() {
        return this.f540h;
    }

    public C0152j0(int i) {
        this(i, 8000);
    }

    public C0152j0(int i, int i2) {
        super(true);
        this.f537e = i2;
        byte[] bArr = new byte[i];
        this.f538f = bArr;
        this.f539g = new DatagramPacket(bArr, 0, i);
    }
}
