package b5;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import b5.k;
import c5.l0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class x extends f {
    public RandomAccessFile f4001e;
    public Uri f4002f;
    public long f4003g;
    public boolean f4004h;

    public static final class a {
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements k.a {
        public i0 f4005a;

        public x a() {
            x xVar = new x();
            i0 i0Var = this.f4005a;
            if (i0Var != null) {
                xVar.i(i0Var);
            }
            return xVar;
        }
    }

    public static class c extends l {
        public c(Throwable th, int i10) {
            super(th, i10);
        }

        public c(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public x() {
        super(false);
    }

    public static RandomAccessFile w(Uri uri) {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) c5.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new c(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (l0.f4841a < 21 || !a.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new c(e10, i10);
        } catch (SecurityException e11) {
            throw new c(e11, 2006);
        } catch (RuntimeException e12) {
            throw new c(e12, 2000);
        }
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f4003g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) l0.j(this.f4001e)).read(bArr, i10, (int) Math.min(this.f4003g, i11));
            if (read > 0) {
                this.f4003g -= read;
                s(read);
            }
            return read;
        } catch (IOException e10) {
            throw new c(e10, 2000);
        }
    }

    @Override
    public void close() {
        this.f4002f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f4001e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new c(e10, 2000);
            }
        } finally {
            this.f4001e = null;
            if (this.f4004h) {
                this.f4004h = false;
                t();
            }
        }
    }

    @Override
    public long d(o oVar) {
        Uri uri = oVar.f3904a;
        this.f4002f = uri;
        u(oVar);
        RandomAccessFile w10 = w(uri);
        this.f4001e = w10;
        try {
            w10.seek(oVar.f3910g);
            long j10 = oVar.f3911h;
            if (j10 == -1) {
                j10 = this.f4001e.length() - oVar.f3910g;
            }
            this.f4003g = j10;
            if (j10 >= 0) {
                this.f4004h = true;
                v(oVar);
                return this.f4003g;
            }
            throw new c(null, null, 2008);
        } catch (IOException e10) {
            throw new c(e10, 2000);
        }
    }

    @Override
    public Uri p() {
        return this.f4002f;
    }
}
