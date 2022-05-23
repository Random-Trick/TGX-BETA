package gd;

import android.annotation.TargetApi;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import ce.j0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class o {
    public static CancellationSignal f12322a;
    public static a f12323b;

    @TargetApi(23)
    public static class a {
        public FingerprintManager.AuthenticationCallback f12324a = new C0112a();
        public b f12325b;
        public boolean f12326c;

        public class C0112a extends FingerprintManager.AuthenticationCallback {
            public C0112a() {
            }

            @Override
            public void onAuthenticationError(int i10, CharSequence charSequence) {
                if (!a.this.f12326c && o.f12322a != null && charSequence != null) {
                    a.this.f12325b.V6(charSequence.toString(), true);
                }
            }

            @Override
            public void onAuthenticationFailed() {
                if (!a.this.f12326c) {
                    a.this.f12325b.V6(w.i1(R.string.fingerprint_fail), false);
                }
            }

            @Override
            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
                if (!a.this.f12326c && o.f12322a != null && charSequence != null) {
                    a.this.f12325b.V6(charSequence.toString(), false);
                }
            }

            @Override
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                if (!a.this.f12326c) {
                    a.this.f12325b.d6(0);
                }
            }
        }

        public a(b bVar) {
            this.f12325b = bVar;
        }

        public void c() {
            this.f12326c = true;
        }

        public FingerprintManager.AuthenticationCallback d() {
            return this.f12324a;
        }
    }

    public interface b {
        void V6(String str, boolean z10);

        void d6(int i10);
    }

    public static void b(b bVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            c();
            FingerprintManager fingerprintManager = (FingerprintManager) d();
            if (fingerprintManager != null) {
                f12322a = new CancellationSignal();
                a aVar = new a(bVar);
                f12323b = aVar;
                FingerprintManager.AuthenticationCallback d10 = aVar.d();
                try {
                    fingerprintManager.authenticate(null, f12322a, 0, d10, null);
                } catch (Throwable th) {
                    Log.e("Unable to use fingerprint sensor", th, new Object[0]);
                    d10.onAuthenticationError(-1, w.i1(R.string.BiometricsError));
                }
            }
        }
    }

    public static void c() {
        if (Build.VERSION.SDK_INT >= 23) {
            a aVar = f12323b;
            if (aVar != null) {
                aVar.c();
                f12323b = null;
            }
            CancellationSignal cancellationSignal = f12322a;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (Throwable th) {
                    Log.e("Cannot cancel authentication", th, new Object[0]);
                }
                f12322a = null;
            }
        }
    }

    public static Object d() {
        if (Build.VERSION.SDK_INT >= 23) {
            return j0.n().getSystemService("fingerprint");
        }
        return null;
    }

    public static boolean e() {
        FingerprintManager fingerprintManager;
        return Build.VERSION.SDK_INT >= 23 && (fingerprintManager = (FingerprintManager) d()) != null && fingerprintManager.hasEnrolledFingerprints();
    }

    public static boolean f() {
        FingerprintManager fingerprintManager;
        return Build.VERSION.SDK_INT >= 23 && (fingerprintManager = (FingerprintManager) d()) != null && fingerprintManager.isHardwareDetected();
    }
}
