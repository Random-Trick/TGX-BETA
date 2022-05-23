package gd;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.MediaStore;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import ce.j0;
import zd.o6;
import zd.ya;

public class i0 {
    public final PhoneStateListener f12256e;
    public boolean f12257f;
    public boolean f12258g;
    public final b f12252a = new b(this, true, false);
    public final b f12254c = new b(this, true, true);
    public final b f12253b = new b(this, false, false);
    public final b f12255d = new b(this, false, true);

    public class a extends PhoneStateListener {
        public a() {
        }

        @Override
        public void onCallStateChanged(int i10, String str) {
            if (i10 == 0) {
                i0.this.k(false);
            } else if (i10 == 1 || i10 == 2) {
                i0.this.k(true);
            }
        }
    }

    public static class b extends ContentObserver {
        public final i0 f12260a;
        public final boolean f12261b;
        public final boolean f12262c;

        public b(i0 i0Var, boolean z10, boolean z11) {
            super(null);
            this.f12260a = i0Var;
            this.f12261b = z10;
            this.f12262c = z11;
        }

        @Override
        public void onChange(boolean z10) {
            super.onChange(z10);
            this.f12260a.h(this.f12261b, this.f12262c);
        }
    }

    public i0() {
        a aVar;
        try {
            aVar = new a();
        } catch (Throwable unused) {
            aVar = null;
        }
        this.f12256e = aVar;
    }

    public static void f(boolean r10, zd.o6 r11) {
        throw new UnsupportedOperationException("Method not decompiled: gd.i0.f(boolean, zd.o6):void");
    }

    public static void g() {
        org.thunderdog.challegram.a E = j0.E();
        if (E != null && E.Z0().c0()) {
            E.Z0().U(true);
        }
    }

    public static void j(ContentResolver contentResolver, Uri uri, b bVar) {
        try {
            contentResolver.registerContentObserver(uri, false, bVar);
        } catch (Throwable unused) {
        }
    }

    public static void m(ContentResolver contentResolver, b bVar) {
        try {
            contentResolver.unregisterContentObserver(bVar);
        } catch (Throwable unused) {
        }
    }

    public final void e(final boolean z10) {
        final o6 j02 = ya.o1().j0();
        if (j02.s6() && j0.G0(1000L)) {
            b0.k().q(new Runnable() {
                @Override
                public final void run() {
                    i0.f(z10, j02);
                }
            });
        }
    }

    public final void h(boolean z10, boolean z11) {
        synchronized (this) {
            if (z10) {
                if (j0.F() == 0) {
                    e(z11);
                }
            }
        }
    }

    public void i() {
        if (!this.f12257f) {
            this.f12257f = true;
            Context n10 = j0.n();
            ContentResolver contentResolver = n10.getContentResolver();
            j(contentResolver, MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.f12252a);
            j(contentResolver, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f12254c);
            j(contentResolver, MediaStore.Video.Media.INTERNAL_CONTENT_URI, this.f12253b);
            j(contentResolver, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.f12255d);
            if (this.f12256e != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) n10.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(this.f12256e, 32);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void k(boolean z10) {
        if (this.f12258g != z10) {
            this.f12258g = z10;
            ya.o1().w2().W0(2, z10);
            if (z10) {
                j0.d0(h0.f12250a);
            }
        }
    }

    public void l() {
        if (this.f12257f) {
            this.f12257f = false;
            Context n10 = j0.n();
            ContentResolver contentResolver = n10.getContentResolver();
            m(contentResolver, this.f12252a);
            m(contentResolver, this.f12254c);
            m(contentResolver, this.f12253b);
            m(contentResolver, this.f12255d);
            if (this.f12256e != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) n10.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(this.f12256e, 0);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
