package p006a5;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p006a5.AbstractC0154k;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C0176x extends AbstractC0139f {
    public RandomAccessFile f651e;
    public Uri f652f;
    public long f653g;
    public boolean f654h;

    public static final class C0177a {
        public static boolean m42138b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class C0178b implements AbstractC0154k.AbstractC0155a {
        public AbstractC0150i0 f655a;

        public C0176x mo4407a() {
            C0176x xVar = new C0176x();
            AbstractC0150i0 i0Var = this.f655a;
            if (i0Var != null) {
                xVar.mo17399g(i0Var);
            }
            return xVar;
        }
    }

    public static class C0179c extends C0156l {
        public C0179c(Throwable th, int i) {
            super(th, i);
        }

        public C0179c(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C0176x() {
        super(false);
    }

    public static RandomAccessFile m42140w(Uri uri) {
        int i = 2006;
        try {
            return new RandomAccessFile((String) C1186a.m38188e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C0179c(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
            }
            if (C1216l0.f4526a < 21 || !C0177a.m42138b(e.getCause())) {
                i = 2005;
            }
            throw new C0179c(e, i);
        } catch (SecurityException e2) {
            throw new C0179c(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C0179c(e3, 2000);
        }
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f653g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C1216l0.m37971j(this.f651e)).read(bArr, i, (int) Math.min(this.f653g, i2));
            if (read > 0) {
                this.f653g -= read;
                m42228s(read);
            }
            return read;
        } catch (IOException e) {
            throw new C0179c(e, 2000);
        }
    }

    @Override
    public long mo4413c(C0159o oVar) {
        Uri uri = oVar.f553a;
        this.f652f = uri;
        m42226u(oVar);
        RandomAccessFile w = m42140w(uri);
        this.f651e = w;
        try {
            w.seek(oVar.f559g);
            long j = oVar.f560h;
            if (j == -1) {
                j = this.f651e.length() - oVar.f559g;
            }
            this.f653g = j;
            if (j >= 0) {
                this.f654h = true;
                m42225v(oVar);
                return this.f653g;
            }
            throw new C0179c(null, null, 2008);
        } catch (IOException e) {
            throw new C0179c(e, 2000);
        }
    }

    @Override
    public void close() {
        this.f652f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f651e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C0179c(e, 2000);
            }
        } finally {
            this.f651e = null;
            if (this.f654h) {
                this.f654h = false;
                m42227t();
            }
        }
    }

    @Override
    public Uri mo4412p() {
        return this.f652f;
    }
}
