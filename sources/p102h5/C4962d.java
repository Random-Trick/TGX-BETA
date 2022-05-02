package p102h5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p102h5.C4964e;
import p143k0.C6037g;
import p177m6.AbstractC6757c;
import p177m6.AbstractC6763f;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p177m6.C6781o;

public class C4962d {
    public static int f16881h;
    public static PendingIntent f16882i;
    public static final Executor f16883j = ExecutorC4963d0.f16891a;
    public final Context f16885b;
    public final C4982v f16886c;
    public final ScheduledExecutorService f16887d;
    public Messenger f16889f;
    public C4964e f16890g;
    @GuardedBy("responseCallbacks")
    public final C6037g<String, C6777m<Bundle>> f16884a = new C6037g<>();
    public Messenger f16888e = new Messenger(new HandlerC4961c0(this, Looper.getMainLooper()));

    public C4962d(Context context) {
        this.f16885b = context;
        this.f16886c = new C4982v(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f16887d = scheduledThreadPoolExecutor;
    }

    public static final Bundle m24376b(AbstractC6775l lVar) {
        if (lVar.mo19066p()) {
            return (Bundle) lVar.mo19070l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(lVar.mo19071k());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", lVar.mo19071k());
    }

    public static synchronized String m24375c() {
        String num;
        synchronized (C4962d.class) {
            int i = f16881h;
            f16881h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    public static final AbstractC6775l m24374d(Bundle bundle) {
        if (m24366l(bundle)) {
            return C6781o.m19050f(null);
        }
        return C6781o.m19050f(bundle);
    }

    public static synchronized void m24372f(Context context, Intent intent) {
        synchronized (C4962d.class) {
            if (f16882i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f16882i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f16882i);
        }
    }

    public static final void m24367k(C6777m mVar) {
        if (mVar.m19084d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    public static boolean m24366l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public AbstractC6775l<Bundle> m24377a(final Bundle bundle) {
        boolean z = true;
        if (this.f16886c.m24343c() >= 12000000) {
            return C4969i.m24360c(this.f16885b).m24356g(1, bundle).mo19074h(f16883j, C4984x.f16928a);
        }
        if (this.f16886c.m24345a() == 0) {
            z = false;
        }
        if (!z) {
            return C6781o.m19051e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return m24365m(bundle).mo19072j(f16883j, new AbstractC6757c(this, bundle) {
            public final C4962d f16930a;
            public final Bundle f16931b;

            {
                this.f16930a = this;
                this.f16931b = bundle;
            }

            @Override
            public final Object mo10597a(AbstractC6775l lVar) {
                return this.f16930a.m24373e(this.f16931b, lVar);
            }
        });
    }

    public final AbstractC6775l m24373e(Bundle bundle, AbstractC6775l lVar) {
        return (lVar.mo19066p() && m24366l((Bundle) lVar.mo19070l())) ? m24365m(bundle).mo19065q(f16883j, C4956a0.f16874a) : lVar;
    }

    public final void m24371g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C4964e.C4965a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C4964e) {
                        this.f16890g = (C4964e) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f16889f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                            sb2.append("Unexpected response, no error or registration id ");
                            sb2.append(valueOf);
                            Log.w("Rpc", sb2.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            m24369i(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (this.f16884a) {
                            for (int i = 0; i < this.f16884a.size(); i++) {
                                m24369i(this.f16884a.m21480i(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            m24369i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public final void m24369i(String str, Bundle bundle) {
        synchronized (this.f16884a) {
            C6777m<Bundle> remove = this.f16884a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.m19085c(bundle);
        }
    }

    public final void m24368j(String str, ScheduledFuture scheduledFuture, AbstractC6775l lVar) {
        synchronized (this.f16884a) {
            this.f16884a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final AbstractC6775l<Bundle> m24365m(Bundle bundle) {
        final String c = m24375c();
        final C6777m<Bundle> mVar = new C6777m<>();
        synchronized (this.f16884a) {
            this.f16884a.put(c, mVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f16886c.m24345a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m24372f(this.f16885b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 5);
        sb2.append("|ID|");
        sb2.append(c);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f16888e);
        if (!(this.f16889f == null && this.f16890g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f16889f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f16890g.m24363b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f16887d.schedule(new Runnable(mVar) {
                public final C6777m f16929a;

                {
                    this.f16929a = mVar;
                }

                @Override
                public final void run() {
                    C4962d.m24367k(this.f16929a);
                }
            }, 30L, TimeUnit.SECONDS);
            mVar.m19087a().mo19080b(f16883j, new AbstractC6763f(this, c, schedule) {
                public final C4962d f16876a;
                public final String f16877b;
                public final ScheduledFuture f16878c;

                {
                    this.f16876a = this;
                    this.f16877b = c;
                    this.f16878c = schedule;
                }

                @Override
                public final void mo10607a(AbstractC6775l lVar) {
                    this.f16876a.m24368j(this.f16877b, this.f16878c, lVar);
                }
            });
            return mVar.m19087a();
        }
        if (this.f16886c.m24345a() == 2) {
            this.f16885b.sendBroadcast(intent);
        } else {
            this.f16885b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f16887d.schedule(new Runnable(mVar) {
            public final C6777m f16929a;

            {
                this.f16929a = mVar;
            }

            @Override
            public final void run() {
                C4962d.m24367k(this.f16929a);
            }
        }, 30L, TimeUnit.SECONDS);
        mVar.m19087a().mo19080b(f16883j, new AbstractC6763f(this, c, schedule2) {
            public final C4962d f16876a;
            public final String f16877b;
            public final ScheduledFuture f16878c;

            {
                this.f16876a = this;
                this.f16877b = c;
                this.f16878c = schedule2;
            }

            @Override
            public final void mo10607a(AbstractC6775l lVar) {
                this.f16876a.m24368j(this.f16877b, this.f16878c, lVar);
            }
        });
        return mVar.m19087a();
    }
}
