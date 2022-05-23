package i5;

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
import i5.e;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import k0.g;
import n6.c;
import n6.f;
import n6.l;
import n6.m;
import n6.o;

public class d {
    public static int f13997h;
    public static PendingIntent f13998i;
    public static final Executor f13999j = d0.f14007a;
    public final Context f14001b;
    public final v f14002c;
    public final ScheduledExecutorService f14003d;
    public Messenger f14005f;
    public e f14006g;
    @GuardedBy("responseCallbacks")
    public final g<String, m<Bundle>> f14000a = new g<>();
    public Messenger f14004e = new Messenger(new c0(this, Looper.getMainLooper()));

    public d(Context context) {
        this.f14001b = context;
        this.f14002c = new v(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14003d = scheduledThreadPoolExecutor;
    }

    public static final Bundle b(l lVar) {
        if (lVar.p()) {
            return (Bundle) lVar.l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(lVar.k());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", lVar.k());
    }

    public static synchronized String c() {
        String num;
        synchronized (d.class) {
            int i10 = f13997h;
            f13997h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    public static final l d(Bundle bundle) {
        if (l(bundle)) {
            return o.f(null);
        }
        return o.f(bundle);
    }

    public static synchronized void f(Context context, Intent intent) {
        synchronized (d.class) {
            if (f13998i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f13998i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f13998i);
        }
    }

    public static final void k(m mVar) {
        if (mVar.d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    public static boolean l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public l<Bundle> a(final Bundle bundle) {
        boolean z10 = true;
        if (this.f14002c.c() >= 12000000) {
            return i.c(this.f14001b).g(1, bundle).h(f13999j, x.f14039a);
        }
        if (this.f14002c.a() == 0) {
            z10 = false;
        }
        if (!z10) {
            return o.e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return m(bundle).j(f13999j, new c(this, bundle) {
            public final d f14041a;
            public final Bundle f14042b;

            {
                this.f14041a = this;
                this.f14042b = bundle;
            }

            @Override
            public final Object a(l lVar) {
                return this.f14041a.e(this.f14042b, lVar);
            }
        });
    }

    public final l e(Bundle bundle, l lVar) {
        return (lVar.p() && l((Bundle) lVar.l())) ? m(bundle).q(f13999j, a0.f13991a) : lVar;
    }

    public final void g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new e.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof e) {
                        this.f14006g = (e) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f14005f = (Messenger) parcelableExtra;
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
                            i(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (this.f14000a) {
                            for (int i10 = 0; i10 < this.f14000a.size(); i10++) {
                                i(this.f14000a.i(i10), intent2.getExtras());
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
                            i(group, extras);
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

    public final void i(String str, Bundle bundle) {
        synchronized (this.f14000a) {
            m<Bundle> remove = this.f14000a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.c(bundle);
        }
    }

    public final void j(String str, ScheduledFuture scheduledFuture, l lVar) {
        synchronized (this.f14000a) {
            this.f14000a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final l<Bundle> m(Bundle bundle) {
        final String c10 = c();
        final m<Bundle> mVar = new m<>();
        synchronized (this.f14000a) {
            this.f14000a.put(c10, mVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f14002c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.f14001b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 5);
        sb2.append("|ID|");
        sb2.append(c10);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f14004e);
        if (!(this.f14005f == null && this.f14006g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f14005f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f14006g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f14003d.schedule(new Runnable(mVar) {
                public final m f14040a;

                {
                    this.f14040a = mVar;
                }

                @Override
                public final void run() {
                    d.k(this.f14040a);
                }
            }, 30L, TimeUnit.SECONDS);
            mVar.a().b(f13999j, new f(this, c10, schedule) {
                public final d f13993a;
                public final String f13994b;
                public final ScheduledFuture f13995c;

                {
                    this.f13993a = this;
                    this.f13994b = c10;
                    this.f13995c = schedule;
                }

                @Override
                public final void a(l lVar) {
                    this.f13993a.j(this.f13994b, this.f13995c, lVar);
                }
            });
            return mVar.a();
        }
        if (this.f14002c.a() == 2) {
            this.f14001b.sendBroadcast(intent);
        } else {
            this.f14001b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f14003d.schedule(new Runnable(mVar) {
            public final m f14040a;

            {
                this.f14040a = mVar;
            }

            @Override
            public final void run() {
                d.k(this.f14040a);
            }
        }, 30L, TimeUnit.SECONDS);
        mVar.a().b(f13999j, new f(this, c10, schedule2) {
            public final d f13993a;
            public final String f13994b;
            public final ScheduledFuture f13995c;

            {
                this.f13993a = this;
                this.f13994b = c10;
                this.f13995c = schedule2;
            }

            @Override
            public final void a(l lVar) {
                this.f13993a.j(this.f13994b, this.f13995c, lVar);
            }
        });
        return mVar.a();
    }
}
