package p082fd;

import android.annotation.TargetApi;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import be.C1379j0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class C4391o {
    public static CancellationSignal f14557a;
    public static C4392a f14558b;

    @TargetApi(23)
    public static class C4392a {
        public FingerprintManager.AuthenticationCallback f14559a = new C4393a();
        public AbstractC4394b f14560b;
        public boolean f14561c;

        public class C4393a extends FingerprintManager.AuthenticationCallback {
            public C4393a() {
            }

            @Override
            public void onAuthenticationError(int i, CharSequence charSequence) {
                if (!C4392a.this.f14561c && C4391o.f14557a != null && charSequence != null) {
                    C4392a.this.f14560b.mo28020V6(charSequence.toString(), true);
                }
            }

            @Override
            public void onAuthenticationFailed() {
                if (!C4392a.this.f14561c) {
                    C4392a.this.f14560b.mo28020V6(C4403w.m27869i1(R.string.fingerprint_fail), false);
                }
            }

            @Override
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                if (!C4392a.this.f14561c && C4391o.f14557a != null && charSequence != null) {
                    C4392a.this.f14560b.mo28020V6(charSequence.toString(), false);
                }
            }

            @Override
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                if (!C4392a.this.f14561c) {
                    C4392a.this.f14560b.mo28019e6(0);
                }
            }
        }

        public C4392a(AbstractC4394b bVar) {
            this.f14560b = bVar;
        }

        public void m28022c() {
            this.f14561c = true;
        }

        public FingerprintManager.AuthenticationCallback m28021d() {
            return this.f14559a;
        }
    }

    public interface AbstractC4394b {
        void mo28020V6(String str, boolean z);

        void mo28019e6(int i);
    }

    public static void m28029b(AbstractC4394b bVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            m28028c();
            FingerprintManager fingerprintManager = (FingerprintManager) m28027d();
            if (fingerprintManager != null) {
                f14557a = new CancellationSignal();
                C4392a aVar = new C4392a(bVar);
                f14558b = aVar;
                FingerprintManager.AuthenticationCallback d = aVar.m28021d();
                try {
                    fingerprintManager.authenticate(null, f14557a, 0, d, null);
                } catch (Throwable th) {
                    Log.m14725e("Unable to use fingerprint sensor", th, new Object[0]);
                    d.onAuthenticationError(-1, C4403w.m27869i1(R.string.BiometricsError));
                }
            }
        }
    }

    public static void m28028c() {
        if (Build.VERSION.SDK_INT >= 23) {
            C4392a aVar = f14558b;
            if (aVar != null) {
                aVar.m28022c();
                f14558b = null;
            }
            CancellationSignal cancellationSignal = f14557a;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (Throwable th) {
                    Log.m14725e("Cannot cancel authentication", th, new Object[0]);
                }
                f14557a = null;
            }
        }
    }

    public static Object m28027d() {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1379j0.m37315n().getSystemService("fingerprint");
        }
        return null;
    }

    public static boolean m28026e() {
        FingerprintManager fingerprintManager;
        return Build.VERSION.SDK_INT >= 23 && (fingerprintManager = (FingerprintManager) m28027d()) != null && fingerprintManager.hasEnrolledFingerprints();
    }

    public static boolean m28025f() {
        FingerprintManager fingerprintManager;
        return Build.VERSION.SDK_INT >= 23 && (fingerprintManager = (FingerprintManager) m28027d()) != null && fingerprintManager.isHardwareDetected();
    }
}
