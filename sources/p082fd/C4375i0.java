package p082fd;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.MediaStore;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import be.C1379j0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p350yd.C10536ab;
import p350yd.C10930q6;

public class C4375i0 {
    public final PhoneStateListener f14489e;
    public boolean f14490f;
    public boolean f14491g;
    public final C4377b f14485a = new C4377b(this, true, false);
    public final C4377b f14487c = new C4377b(this, true, true);
    public final C4377b f14486b = new C4377b(this, false, false);
    public final C4377b f14488d = new C4377b(this, false, true);

    public class C4376a extends PhoneStateListener {
        public C4376a() {
        }

        @Override
        public void onCallStateChanged(int i, String str) {
            if (i == 0) {
                C4375i0.this.m28113k(false);
            } else if (i == 1 || i == 2) {
                C4375i0.this.m28113k(true);
            }
        }
    }

    public static class C4377b extends ContentObserver {
        public final C4375i0 f14493a;
        public final boolean f14494b;
        public final boolean f14495c;

        public C4377b(C4375i0 i0Var, boolean z, boolean z2) {
            super(null);
            this.f14493a = i0Var;
            this.f14494b = z;
            this.f14495c = z2;
        }

        @Override
        public void onChange(boolean z) {
            super.onChange(z);
            this.f14493a.m28116h(this.f14494b, this.f14495c);
        }
    }

    public C4375i0() {
        C4376a aVar;
        try {
            aVar = new C4376a();
        } catch (Throwable unused) {
            aVar = null;
        }
        this.f14489e = aVar;
    }

    public static void m28118f(boolean r10, p350yd.C10930q6 r11) {
        throw new UnsupportedOperationException("Method not decompiled: p082fd.C4375i0.m28118f(boolean, yd.q6):void");
    }

    public static void m28117g() {
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
        if (E != null && E.m14529V0().m6909c0()) {
            E.m14529V0().m6926U(true);
        }
    }

    public static void m28114j(ContentResolver contentResolver, Uri uri, C4377b bVar) {
        try {
            contentResolver.registerContentObserver(uri, false, bVar);
        } catch (Throwable unused) {
        }
    }

    public static void m28111m(ContentResolver contentResolver, C4377b bVar) {
        try {
            contentResolver.unregisterContentObserver(bVar);
        } catch (Throwable unused) {
        }
    }

    public final void m28119e(final boolean z) {
        final C10930q6 j0 = C10536ab.m4667o1().m4684j0();
        if (j0.m2316o6() && C1379j0.m37361G0(1000L)) {
            C4356b0.m28201k().m28195q(new Runnable() {
                @Override
                public final void run() {
                    C4375i0.m28118f(z, j0);
                }
            });
        }
    }

    public final void m28116h(boolean z, boolean z2) {
        synchronized (this) {
            if (z) {
                if (C1379j0.m37364F() == 0) {
                    m28119e(z2);
                }
            }
        }
    }

    public void m28115i() {
        if (!this.f14490f) {
            this.f14490f = true;
            Context n = C1379j0.m37315n();
            ContentResolver contentResolver = n.getContentResolver();
            m28114j(contentResolver, MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.f14485a);
            m28114j(contentResolver, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f14487c);
            m28114j(contentResolver, MediaStore.Video.Media.INTERNAL_CONTENT_URI, this.f14486b);
            m28114j(contentResolver, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.f14488d);
            if (this.f14489e != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) n.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(this.f14489e, 32);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void m28113k(boolean z) {
        if (this.f14491g != z) {
            this.f14491g = z;
            C10536ab.m4667o1().m4636w2().m7075W0(2, z);
            if (z) {
                C1379j0.m37334d0(RunnableC4373h0.f14483a);
            }
        }
    }

    public void m28112l() {
        if (this.f14490f) {
            this.f14490f = false;
            Context n = C1379j0.m37315n();
            ContentResolver contentResolver = n.getContentResolver();
            m28111m(contentResolver, this.f14485a);
            m28111m(contentResolver, this.f14487c);
            m28111m(contentResolver, this.f14486b);
            m28111m(contentResolver, this.f14488d);
            if (this.f14489e != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) n.getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(this.f14489e, 0);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
