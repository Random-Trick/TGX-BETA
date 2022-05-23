package zd;

import android.net.Uri;
import b5.f;
import b5.k;
import b5.o;
import hd.t2;
import ib.i;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;

public final class c9 extends f {
    public Uri f27326e;
    public long f27327f;
    public o6 f27328g;
    public TdApi.File f27330i;
    public boolean f27332k;
    public CountDownLatch f27334m;
    public RandomAccessFile f27335n;
    public final Object f27329h = new Object();
    public final q0 f27331j = new q0() {
        @Override
        public final void h2(TdApi.UpdateFile updateFile) {
            c9.this.B(updateFile);
        }
    };
    public final TdApi.File f27333l = new TdApi.File(0, 0, 0, new TdApi.LocalFile(), new TdApi.RemoteFile());

    public static final class a implements k.a {
        @Override
        public k a() {
            return new c9();
        }
    }

    public static class b extends IOException {
        public b(String str) {
            super(str);
        }

        public b(Throwable th) {
            super(th);
        }
    }

    public static final class c {
        public static Uri a(int i10, int i11) {
            if (i10 != -1) {
                return new Uri.Builder().scheme("tg").authority("file").appendQueryParameter("account", Integer.toString(i10)).appendQueryParameter("id", Integer.toString(i11)).build();
            }
            throw new IllegalArgumentException();
        }

        public static Uri b(int i10, String str) {
            if (i10 != -1) {
                return new Uri.Builder().scheme("tg").authority("file").appendQueryParameter("account", Integer.toString(i10)).appendQueryParameter("remote_id", str).build();
            }
            throw new IllegalArgumentException();
        }

        public static Uri c(int i10, TdApi.File file) {
            int i11 = file.f19913id;
            return i11 < 0 ? b(i10, file.remote.f19958id) : a(i10, i11);
        }
    }

    public c9() {
        super(true);
    }

    public void A(AtomicBoolean atomicBoolean, AtomicReference atomicReference, CountDownLatch countDownLatch, TdApi.Object object) {
        synchronized (atomicBoolean) {
            if (atomicBoolean.getAndSet(false)) {
                if (object.getConstructor() == 766337656) {
                    this.f27328g.O9().m(((TdApi.File) object).f19913id, this.f27331j);
                }
                atomicReference.set(object);
            }
        }
        countDownLatch.countDown();
    }

    public static int z(TdApi.File file, int i10, int i11) {
        int i12;
        TdApi.LocalFile localFile = file.local;
        if (localFile.isDownloadingCompleted) {
            i12 = localFile.downloadedSize;
        } else {
            int i13 = localFile.downloadOffset;
            if (i10 >= i13) {
                i12 = localFile.downloadedPrefixSize;
                if (i10 < i13 + i12) {
                    i10 -= i13;
                }
            }
            return 0;
        }
        return Math.max(0, Math.min(i11, i12 - i10));
    }

    public final void B(TdApi.UpdateFile updateFile) {
        boolean z10;
        CountDownLatch countDownLatch;
        synchronized (this.f27329h) {
            TdApi.File file = this.f27330i;
            if (file != null) {
                int i10 = file.f19913id;
                TdApi.File file2 = updateFile.file;
                if (i10 == file2.f19913id && e.v(file2, file)) {
                    z10 = true;
                    if (z10 && (countDownLatch = this.f27334m) != null) {
                        countDownLatch.countDown();
                        this.f27334m = null;
                    }
                }
            }
            z10 = false;
            if (z10) {
                countDownLatch.countDown();
                this.f27334m = null;
            }
        }
    }

    public final void C(TdApi.File file) {
        if (this.f27332k) {
            this.f27328g.m5().j0(file, this.f27331j);
        }
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        TdApi.File file;
        CountDownLatch countDownLatch;
        boolean z10;
        if (i11 == 0) {
            return 0;
        }
        boolean z11 = true;
        while (true) {
            try {
                synchronized (this.f27329h) {
                    TdApi.File file2 = this.f27330i;
                    file = null;
                    if (file2 != null) {
                        e.v(file2, this.f27333l);
                        file = this.f27333l;
                        file.f19913id = this.f27330i.f19913id;
                        countDownLatch = this.f27334m;
                        if (countDownLatch == null) {
                            countDownLatch = new CountDownLatch(1);
                            this.f27334m = countDownLatch;
                        }
                    } else {
                        countDownLatch = null;
                    }
                }
                if (file != null) {
                    int i12 = (int) this.f27327f;
                    int i13 = file.size;
                    if (i13 != 0 && i12 >= i13) {
                        return -1;
                    }
                    if (z11) {
                        if (file.local.isDownloadingCompleted) {
                            C(file);
                        } else {
                            y(file, i12);
                        }
                        z11 = false;
                    }
                    int z12 = z(file, i12, i11);
                    if (z12 == 0) {
                        countDownLatch.await();
                    } else {
                        try {
                            synchronized (this.f27329h) {
                                if (this.f27335n == null) {
                                    this.f27335n = new RandomAccessFile(file.local.path, "r");
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (z10 && i12 > 0) {
                                this.f27335n.seek(i12);
                            }
                            int read = this.f27335n.read(bArr, i10, z12);
                            s(read);
                            this.f27327f += read;
                            return read;
                        } catch (IOException e10) {
                            if (y(file, i12)) {
                                countDownLatch.await();
                            } else {
                                throw new b(e10);
                            }
                        }
                    }
                } else {
                    throw new b("file == null");
                }
            } catch (InterruptedException e11) {
                throw new b(e11);
            }
        }
    }

    @Override
    public void close() {
        TdApi.File file;
        this.f27326e = null;
        synchronized (this.f27329h) {
            file = this.f27330i;
            this.f27330i = null;
            CountDownLatch countDownLatch = this.f27334m;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                this.f27334m = null;
            }
            RandomAccessFile randomAccessFile = this.f27335n;
            if (randomAccessFile != null) {
                v0.G(randomAccessFile);
                this.f27335n = null;
            }
        }
        o6 o6Var = this.f27328g;
        if (!(o6Var == null || file == null)) {
            if (this.f27332k) {
                o6Var.m5().j0(file, this.f27331j);
                this.f27332k = false;
            }
            this.f27328g.O9().U(file.f19913id, this.f27331j);
            t();
        }
        this.f27328g = null;
    }

    @Override
    public long d(o oVar) {
        Uri uri = oVar.f3904a;
        if (!"tg".equals(uri.getScheme())) {
            throw new b("Unsupported URI scheme: " + uri.getScheme());
        } else if ("file".equals(uri.getAuthority())) {
            int t10 = i.t(uri.getQueryParameter("account"), -1);
            if (t10 != -1) {
                int t11 = i.t(uri.getQueryParameter("id"), -1);
                String queryParameter = uri.getQueryParameter("remote_id");
                if (t11 != -1 || !i.i(queryParameter)) {
                    u(oVar);
                    this.f27326e = uri;
                    this.f27327f = oVar.f3910g;
                    this.f27328g = ya.R0(t10);
                    TdApi.Function getRemoteFile = !i.i(queryParameter) ? new TdApi.GetRemoteFile(queryParameter, null) : new TdApi.GetFile(t11);
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    final AtomicReference atomicReference = new AtomicReference();
                    this.f27328g.v4().o(getRemoteFile, new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            c9.this.A(atomicBoolean, atomicReference, countDownLatch, object);
                        }
                    });
                    try {
                        countDownLatch.await();
                        TdApi.Object object = (TdApi.Object) atomicReference.get();
                        if (object == null) {
                            throw new b("getFile failed");
                        } else if (!(object instanceof TdApi.Error)) {
                            synchronized (this.f27329h) {
                                this.f27330i = (TdApi.File) object;
                            }
                            v(oVar);
                            int i10 = this.f27330i.size;
                            if (i10 != 0) {
                                return i10;
                            }
                            return -1L;
                        } else {
                            throw new b("getFile failed:" + t2.z5(object));
                        }
                    } catch (InterruptedException e10) {
                        synchronized (atomicBoolean) {
                            if (!atomicBoolean.getAndSet(false)) {
                                TdApi.Object object2 = (TdApi.Object) atomicReference.get();
                                if (object2 instanceof TdApi.File) {
                                    this.f27328g.O9().U(((TdApi.File) object2).f19913id, this.f27331j);
                                }
                            }
                            throw new b(e10);
                        }
                    }
                } else {
                    throw new b("id and remote_id parameters are missing");
                }
            } else {
                throw new b("account parameter is missing");
            }
        } else {
            throw new b("Unsupported URI authority: " + uri.getAuthority());
        }
    }

    @Override
    public Uri p() {
        return this.f27326e;
    }

    public final boolean y(TdApi.File file, int i10) {
        boolean z10 = this.f27332k;
        if (!z10 && file.local.canBeDownloaded) {
            this.f27332k = true;
            this.f27328g.m5().g(file, i10, this.f27331j, false, true);
            return true;
        } else if (!z10) {
            return false;
        } else {
            if (file.local.downloadOffset != i10 && !t2.P5(file, i10)) {
                this.f27328g.m5().o0(file, this.f27331j, i10);
            }
            return true;
        }
    }
}
