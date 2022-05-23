package b5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import c5.l0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class c extends f {
    public final AssetManager f3827e;
    public Uri f3828f;
    public InputStream f3829g;
    public long f3830h;
    public boolean f3831i;

    public static final class a extends l {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f3827e = context.getAssets();
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3830h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((InputStream) l0.j(this.f3829g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f3830h;
        if (j11 != -1) {
            this.f3830h = j11 - read;
        }
        s(read);
        return read;
    }

    @Override
    public void close() {
        this.f3828f = null;
        try {
            try {
                InputStream inputStream = this.f3829g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f3829g = null;
            if (this.f3831i) {
                this.f3831i = false;
                t();
            }
        }
    }

    @Override
    public long d(o oVar) {
        try {
            Uri uri = oVar.f3904a;
            this.f3828f = uri;
            String str = (String) c5.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            u(oVar);
            InputStream open = this.f3827e.open(str, 1);
            this.f3829g = open;
            if (open.skip(oVar.f3910g) >= oVar.f3910g) {
                long j10 = oVar.f3911h;
                if (j10 != -1) {
                    this.f3830h = j10;
                } else {
                    long available = this.f3829g.available();
                    this.f3830h = available;
                    if (available == 2147483647L) {
                        this.f3830h = -1L;
                    }
                }
                this.f3831i = true;
                v(oVar);
                return this.f3830h;
            }
            throw new a(null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override
    public Uri p() {
        return this.f3828f;
    }
}
