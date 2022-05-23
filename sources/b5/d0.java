package b5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import c5.l0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class d0 extends f {
    public final Resources f3848e;
    public final String f3849f;
    public Uri f3850g;
    public AssetFileDescriptor f3851h;
    public InputStream f3852i;
    public long f3853j;
    public boolean f3854k;

    public static class a extends l {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public d0(Context context) {
        super(false);
        this.f3848e = context.getResources();
        this.f3849f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(i10);
        return Uri.parse(sb2.toString());
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3853j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int read = ((InputStream) l0.j(this.f3852i)).read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f3853j;
            if (j11 != -1) {
                this.f3853j = j11 - read;
            }
            s(read);
            return read;
        } else if (this.f3853j == -1) {
            return -1;
        } else {
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    @Override
    public void close() {
        this.f3850g = null;
        try {
            try {
                InputStream inputStream = this.f3852i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f3852i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3851h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f3851h = null;
                        if (this.f3854k) {
                            this.f3854k = false;
                            t();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(null, e10, 2000);
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th) {
            this.f3852i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3851h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3851h = null;
                    if (this.f3854k) {
                        this.f3854k = false;
                        t();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f3851h = null;
                if (this.f3854k) {
                    this.f3854k = false;
                    t();
                }
            }
        }
    }

    @Override
    public long d(o oVar) {
        int parseInt;
        Uri uri = oVar.f3904a;
        this.f3850g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) c5.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) c5.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str = (String) c5.a.e(uri.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String host = uri.getHost();
            String valueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
            String valueOf2 = String.valueOf(str);
            parseInt = this.f3848e.getIdentifier(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "raw", this.f3849f);
            if (parseInt == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        } else {
            throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
        }
        u(oVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f3848e.openRawResourceFd(parseInt);
            this.f3851h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f3852i = fileInputStream;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i10 != 0) {
                    try {
                        if (oVar.f3910g > length) {
                            throw new a(null, null, 2008);
                        }
                    } catch (a e10) {
                        throw e10;
                    } catch (IOException e11) {
                        throw new a(null, e11, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(oVar.f3910g + startOffset) - startOffset;
                if (skip == oVar.f3910g) {
                    if (i10 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f3853j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f3853j = size;
                            if (size < 0) {
                                throw new a(null, null, 2008);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f3853j = j10;
                        if (j10 < 0) {
                            throw new l(2008);
                        }
                    }
                    long j11 = oVar.f3911h;
                    if (j11 != -1) {
                        long j12 = this.f3853j;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f3853j = j11;
                    }
                    this.f3854k = true;
                    v(oVar);
                    long j13 = oVar.f3911h;
                    return j13 != -1 ? j13 : this.f3853j;
                }
                throw new a(null, null, 2008);
            } else {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(valueOf3.length() + 24);
                sb2.append("Resource is compressed: ");
                sb2.append(valueOf3);
                throw new a(sb2.toString(), null, 2000);
            }
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }

    @Override
    public Uri p() {
        return this.f3850g;
    }
}
