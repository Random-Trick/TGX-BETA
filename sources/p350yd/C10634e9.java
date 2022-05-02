package p350yd;

import android.net.Uri;
import gd.C4779t2;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p006a5.AbstractC0139f;
import p006a5.AbstractC0154k;
import p006a5.C0159o;
import p108hb.C5070i;
import p193nb.C7321e;

public final class C10634e9 extends AbstractC0139f {
    public Uri f34047e;
    public long f34048f;
    public C10930q6 f34049g;
    public TdApi.File f34051i;
    public boolean f34053k;
    public CountDownLatch f34055m;
    public RandomAccessFile f34056n;
    public final Object f34050h = new Object();
    public final AbstractC10985s0 f34052j = new AbstractC10985s0() {
        @Override
        public final void mo2039h2(TdApi.UpdateFile updateFile) {
            C10634e9.this.m4416B(updateFile);
        }
    };
    public final TdApi.File f34054l = new TdApi.File(0, 0, 0, new TdApi.LocalFile(), new TdApi.RemoteFile());

    public static final class C10635a implements AbstractC0154k.AbstractC0155a {
        @Override
        public AbstractC0154k mo4407a() {
            return new C10634e9();
        }
    }

    public static class C10636b extends IOException {
        public C10636b(String str) {
            super(str);
        }

        public C10636b(Throwable th) {
            super(th);
        }
    }

    public static final class C10637c {
        public static Uri m4406a(int i, int i2) {
            if (i != -1) {
                return new Uri.Builder().scheme("tg").authority("file").appendQueryParameter("account", Integer.toString(i)).appendQueryParameter("id", Integer.toString(i2)).build();
            }
            throw new IllegalArgumentException();
        }

        public static Uri m4405b(int i, String str) {
            if (i != -1) {
                return new Uri.Builder().scheme("tg").authority("file").appendQueryParameter("account", Integer.toString(i)).appendQueryParameter("remote_id", str).build();
            }
            throw new IllegalArgumentException();
        }

        public static Uri m4404c(int i, TdApi.File file) {
            int i2 = file.f25376id;
            return i2 < 0 ? m4405b(i, file.remote.f25420id) : m4406a(i, i2);
        }
    }

    public C10634e9() {
        super(true);
    }

    public void m4417A(AtomicBoolean atomicBoolean, AtomicReference atomicReference, CountDownLatch countDownLatch, TdApi.Object object) {
        synchronized (atomicBoolean) {
            if (atomicBoolean.getAndSet(false)) {
                if (object.getConstructor() == 766337656) {
                    this.f34049g.m2781K9().m1835m(((TdApi.File) object).f25376id, this.f34052j);
                }
                atomicReference.set(object);
            }
        }
        countDownLatch.countDown();
    }

    public static int m4408z(TdApi.File file, int i, int i2) {
        int i3;
        TdApi.LocalFile localFile = file.local;
        if (localFile.isDownloadingCompleted) {
            i3 = localFile.downloadedSize;
        } else {
            int i4 = localFile.downloadOffset;
            if (i >= i4) {
                i3 = localFile.downloadedPrefixSize;
                if (i < i4 + i3) {
                    i -= i4;
                }
            }
            return 0;
        }
        return Math.max(0, Math.min(i2, i3 - i));
    }

    public final void m4416B(TdApi.UpdateFile updateFile) {
        boolean z;
        CountDownLatch countDownLatch;
        synchronized (this.f34050h) {
            TdApi.File file = this.f34051i;
            if (file != null) {
                int i = file.f25376id;
                TdApi.File file2 = updateFile.file;
                if (i == file2.f25376id && C7321e.m16907u(file2, file)) {
                    z = true;
                    if (z && (countDownLatch = this.f34055m) != null) {
                        countDownLatch.countDown();
                        this.f34055m = null;
                    }
                }
            }
            z = false;
            if (z) {
                countDownLatch.countDown();
                this.f34055m = null;
            }
        }
    }

    public final void m4415C(TdApi.File file) {
        if (this.f34053k) {
            this.f34049g.m2413i5().m3986j0(file, this.f34052j);
        }
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        TdApi.File file;
        CountDownLatch countDownLatch;
        boolean z;
        if (i2 == 0) {
            return 0;
        }
        boolean z2 = true;
        while (true) {
            try {
                synchronized (this.f34050h) {
                    TdApi.File file2 = this.f34051i;
                    file = null;
                    if (file2 != null) {
                        C7321e.m16907u(file2, this.f34054l);
                        file = this.f34054l;
                        file.f25376id = this.f34051i.f25376id;
                        countDownLatch = this.f34055m;
                        if (countDownLatch == null) {
                            countDownLatch = new CountDownLatch(1);
                            this.f34055m = countDownLatch;
                        }
                    } else {
                        countDownLatch = null;
                    }
                }
                if (file != null) {
                    int i3 = (int) this.f34048f;
                    int i4 = file.size;
                    if (i4 != 0 && i3 >= i4) {
                        return -1;
                    }
                    if (z2) {
                        if (file.local.isDownloadingCompleted) {
                            m4415C(file);
                        } else {
                            m4409y(file, i3);
                        }
                        z2 = false;
                    }
                    int z3 = m4408z(file, i3, i2);
                    if (z3 == 0) {
                        countDownLatch.await();
                    } else {
                        try {
                            synchronized (this.f34050h) {
                                if (this.f34056n == null) {
                                    this.f34056n = new RandomAccessFile(file.local.path, "r");
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z && i3 > 0) {
                                this.f34056n.seek(i3);
                            }
                            int read = this.f34056n.read(bArr, i, z3);
                            m42228s(read);
                            this.f34048f += read;
                            return read;
                        } catch (IOException e) {
                            if (m4409y(file, i3)) {
                                countDownLatch.await();
                            } else {
                                throw new C10636b(e);
                            }
                        }
                    }
                } else {
                    throw new C10636b("file == null");
                }
            } catch (InterruptedException e2) {
                throw new C10636b(e2);
            }
        }
    }

    @Override
    public long mo4413c(C0159o oVar) {
        Uri uri = oVar.f553a;
        if (!"tg".equals(uri.getScheme())) {
            throw new C10636b("Unsupported URI scheme: " + uri.getScheme());
        } else if ("file".equals(uri.getAuthority())) {
            int t = C5070i.m24051t(uri.getQueryParameter("account"), -1);
            if (t != -1) {
                int t2 = C5070i.m24051t(uri.getQueryParameter("id"), -1);
                String queryParameter = uri.getQueryParameter("remote_id");
                if (t2 != -1 || !C5070i.m24062i(queryParameter)) {
                    m42226u(oVar);
                    this.f34047e = uri;
                    this.f34048f = oVar.f559g;
                    this.f34049g = C10536ab.m4756R0(t);
                    TdApi.Function getRemoteFile = !C5070i.m24062i(queryParameter) ? new TdApi.GetRemoteFile(queryParameter, null) : new TdApi.GetFile(t2);
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    final AtomicReference atomicReference = new AtomicReference();
                    this.f34049g.m2270r4().m14783o(getRemoteFile, new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C10634e9.this.m4417A(atomicBoolean, atomicReference, countDownLatch, object);
                        }
                    });
                    try {
                        countDownLatch.await();
                        TdApi.Object object = (TdApi.Object) atomicReference.get();
                        if (object == null) {
                            throw new C10636b("getFile failed");
                        } else if (!(object instanceof TdApi.Error)) {
                            synchronized (this.f34050h) {
                                this.f34051i = (TdApi.File) object;
                            }
                            m42225v(oVar);
                            int i = this.f34051i.size;
                            if (i != 0) {
                                return i;
                            }
                            return -1L;
                        } else {
                            throw new C10636b("getFile failed:" + C4779t2.m25379z5(object));
                        }
                    } catch (InterruptedException e) {
                        synchronized (atomicBoolean) {
                            if (!atomicBoolean.getAndSet(false)) {
                                TdApi.Object object2 = (TdApi.Object) atomicReference.get();
                                if (object2 instanceof TdApi.File) {
                                    this.f34049g.m2781K9().m1901U(((TdApi.File) object2).f25376id, this.f34052j);
                                }
                            }
                            throw new C10636b(e);
                        }
                    }
                } else {
                    throw new C10636b("id and remote_id parameters are missing");
                }
            } else {
                throw new C10636b("account parameter is missing");
            }
        } else {
            throw new C10636b("Unsupported URI authority: " + uri.getAuthority());
        }
    }

    @Override
    public void close() {
        TdApi.File file;
        this.f34047e = null;
        synchronized (this.f34050h) {
            file = this.f34051i;
            this.f34051i = null;
            CountDownLatch countDownLatch = this.f34055m;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                this.f34055m = null;
            }
            RandomAccessFile randomAccessFile = this.f34056n;
            if (randomAccessFile != null) {
                C7389v0.m16734G(randomAccessFile);
                this.f34056n = null;
            }
        }
        C10930q6 q6Var = this.f34049g;
        if (!(q6Var == null || file == null)) {
            if (this.f34053k) {
                q6Var.m2413i5().m3986j0(file, this.f34052j);
                this.f34053k = false;
            }
            this.f34049g.m2781K9().m1901U(file.f25376id, this.f34052j);
            m42227t();
        }
        this.f34049g = null;
    }

    @Override
    public Uri mo4412p() {
        return this.f34047e;
    }

    public final boolean m4409y(TdApi.File file, int i) {
        boolean z = this.f34053k;
        if (!z && file.local.canBeDownloaded) {
            this.f34053k = true;
            this.f34049g.m2413i5().m3993g(file, i, this.f34052j, false, true);
            return true;
        } else if (!z) {
            return false;
        } else {
            if (file.local.downloadOffset != i && !C4779t2.m25621P5(file, i)) {
                this.f34049g.m2413i5().m3976o0(file, this.f34052j, i);
            }
            return true;
        }
    }
}
