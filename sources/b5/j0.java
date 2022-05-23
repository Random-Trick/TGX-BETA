package b5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class j0 extends f {
    public final int f3891e;
    public final byte[] f3892f;
    public final DatagramPacket f3893g;
    public Uri f3894h;
    public DatagramSocket f3895i;
    public MulticastSocket f3896j;
    public InetAddress f3897k;
    public boolean f3898l;
    public int f3899m;

    public static final class a extends l {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public j0() {
        this(2000);
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f3899m == 0) {
            try {
                ((DatagramSocket) c5.a.e(this.f3895i)).receive(this.f3893g);
                int length = this.f3893g.getLength();
                this.f3899m = length;
                s(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f3893g.getLength();
        int i12 = this.f3899m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f3892f, length2 - i12, bArr, i10, min);
        this.f3899m -= min;
        return min;
    }

    @Override
    public void close() {
        this.f3894h = null;
        MulticastSocket multicastSocket = this.f3896j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) c5.a.e(this.f3897k));
            } catch (IOException unused) {
            }
            this.f3896j = null;
        }
        DatagramSocket datagramSocket = this.f3895i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f3895i = null;
        }
        this.f3897k = null;
        this.f3899m = 0;
        if (this.f3898l) {
            this.f3898l = false;
            t();
        }
    }

    @Override
    public long d(o oVar) {
        Uri uri = oVar.f3904a;
        this.f3894h = uri;
        String str = (String) c5.a.e(uri.getHost());
        int port = this.f3894h.getPort();
        u(oVar);
        try {
            this.f3897k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f3897k, port);
            if (this.f3897k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f3896j = multicastSocket;
                multicastSocket.joinGroup(this.f3897k);
                this.f3895i = this.f3896j;
            } else {
                this.f3895i = new DatagramSocket(inetSocketAddress);
            }
            this.f3895i.setSoTimeout(this.f3891e);
            this.f3898l = true;
            v(oVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override
    public Uri p() {
        return this.f3894h;
    }

    public j0(int i10) {
        this(i10, 8000);
    }

    public j0(int i10, int i11) {
        super(true);
        this.f3891e = i11;
        byte[] bArr = new byte[i10];
        this.f3892f = bArr;
        this.f3893g = new DatagramPacket(bArr, 0, i10);
    }
}
