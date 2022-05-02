package p006a5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C0132d0 extends AbstractC0139f {
    public final Resources f494e;
    public final String f495f;
    public Uri f496g;
    public AssetFileDescriptor f497h;
    public InputStream f498i;
    public long f499j;
    public boolean f500k;

    public static class C0133a extends C0156l {
        public C0133a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C0132d0(Context context) {
        super(false);
        this.f494e = context.getResources();
        this.f495f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(i);
        return Uri.parse(sb2.toString());
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f499j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0133a(null, e, 2000);
            }
        }
        int read = ((InputStream) C1216l0.m37971j(this.f498i)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f499j;
            if (j2 != -1) {
                this.f499j = j2 - read;
            }
            m42228s(read);
            return read;
        } else if (this.f499j == -1) {
            return -1;
        } else {
            throw new C0133a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    @Override
    public long mo4413c(C0159o oVar) {
        int parseInt;
        Uri uri = oVar.f553a;
        this.f496g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C1186a.m38188e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) C1186a.m38188e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C0133a("Resource identifier must be an integer.", null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str = (String) C1186a.m38188e(uri.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String host = uri.getHost();
            String valueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
            String valueOf2 = String.valueOf(str);
            parseInt = this.f494e.getIdentifier(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "raw", this.f495f);
            if (parseInt == 0) {
                throw new C0133a("Resource not found.", null, 2005);
            }
        } else {
            throw new C0133a("URI must either use scheme rawresource or android.resource", null, 1004);
        }
        m42226u(oVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f494e.openRawResourceFd(parseInt);
            this.f497h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f498i = fileInputStream;
                int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i != 0) {
                    try {
                        if (oVar.f559g > length) {
                            throw new C0133a(null, null, 2008);
                        }
                    } catch (C0133a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new C0133a(null, e2, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(oVar.f559g + startOffset) - startOffset;
                if (skip == oVar.f559g) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f499j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f499j = size;
                            if (size < 0) {
                                throw new C0133a(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f499j = j;
                        if (j < 0) {
                            throw new C0156l(2008);
                        }
                    }
                    long j2 = oVar.f560h;
                    if (j2 != -1) {
                        long j3 = this.f499j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f499j = j2;
                    }
                    this.f500k = true;
                    m42225v(oVar);
                    long j4 = oVar.f560h;
                    return j4 != -1 ? j4 : this.f499j;
                }
                throw new C0133a(null, null, 2008);
            } else {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(valueOf3.length() + 24);
                sb2.append("Resource is compressed: ");
                sb2.append(valueOf3);
                throw new C0133a(sb2.toString(), null, 2000);
            }
        } catch (Resources.NotFoundException e3) {
            throw new C0133a(null, e3, 2005);
        }
    }

    @Override
    public void close() {
        this.f496g = null;
        try {
            try {
                InputStream inputStream = this.f498i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f498i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f497h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f497h = null;
                        if (this.f500k) {
                            this.f500k = false;
                            m42227t();
                        }
                    }
                } catch (IOException e) {
                    throw new C0133a(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new C0133a(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.f498i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f497h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f497h = null;
                    if (this.f500k) {
                        this.f500k = false;
                        m42227t();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C0133a(null, e3, 2000);
                }
            } finally {
                this.f497h = null;
                if (this.f500k) {
                    this.f500k = false;
                    m42227t();
                }
            }
        }
    }

    @Override
    public Uri mo4412p() {
        return this.f496g;
    }
}
