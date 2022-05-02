package p006a5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C0120c extends AbstractC0139f {
    public final AssetManager f465e;
    public Uri f466f;
    public InputStream f467g;
    public long f468h;
    public boolean f469i;

    public static final class C0121a extends C0156l {
        public C0121a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C0120c(Context context) {
        super(false);
        this.f465e = context.getAssets();
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f468h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0121a(e, 2000);
            }
        }
        int read = ((InputStream) C1216l0.m37971j(this.f467g)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f468h;
        if (j2 != -1) {
            this.f468h = j2 - read;
        }
        m42228s(read);
        return read;
    }

    @Override
    public long mo4413c(C0159o oVar) {
        try {
            Uri uri = oVar.f553a;
            this.f466f = uri;
            String str = (String) C1186a.m38188e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            m42226u(oVar);
            InputStream open = this.f465e.open(str, 1);
            this.f467g = open;
            if (open.skip(oVar.f559g) >= oVar.f559g) {
                long j = oVar.f560h;
                if (j != -1) {
                    this.f468h = j;
                } else {
                    long available = this.f467g.available();
                    this.f468h = available;
                    if (available == 2147483647L) {
                        this.f468h = -1L;
                    }
                }
                this.f469i = true;
                m42225v(oVar);
                return this.f468h;
            }
            throw new C0121a(null, 2008);
        } catch (C0121a e) {
            throw e;
        } catch (IOException e2) {
            throw new C0121a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override
    public void close() {
        this.f466f = null;
        try {
            try {
                InputStream inputStream = this.f467g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C0121a(e, 2000);
            }
        } finally {
            this.f467g = null;
            if (this.f469i) {
                this.f469i = false;
                m42227t();
            }
        }
    }

    @Override
    public Uri mo4412p() {
        return this.f466f;
    }
}
