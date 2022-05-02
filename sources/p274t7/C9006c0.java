package p274t7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p163l5.C6378r;
import p177m6.AbstractC6775l;
import p177m6.C6781o;
import p342y5.C10410r;
import p342y5.C10411s;
import p342y5.C10418z;

public class C9006c0 implements Closeable {
    public final URL f28918a;
    public AbstractC6775l<Bitmap> f28919b;
    public volatile InputStream f28920c;

    public C9006c0(URL url) {
        this.f28918a = url;
    }

    public static C9006c0 m10713y0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C9006c0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public void m10716A0(Executor executor) {
        this.f28919b = C6781o.m19052c(executor, new Callable(this) {
            public final C9006c0 f28914a;

            {
                this.f28914a = this;
            }

            @Override
            public Object call() {
                return this.f28914a.m10715m();
            }
        });
    }

    @Override
    public void close() {
        try {
            C10411s.m5157a(this.f28920c);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    public Bitmap m10715m() {
        String valueOf = String.valueOf(this.f28918a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Starting download of: ");
        sb2.append(valueOf);
        Log.i("FirebaseMessaging", sb2.toString());
        byte[] t = m10714t();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(t, 0, t.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f28918a);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 31);
                sb3.append("Successfully downloaded image: ");
                sb3.append(valueOf2);
                Log.d("FirebaseMessaging", sb3.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f28918a);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 24);
        sb4.append("Failed to decode image: ");
        sb4.append(valueOf3);
        throw new IOException(sb4.toString());
    }

    public final byte[] m10714t() {
        URLConnection openConnection = this.f28918a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f28920c = inputStream;
                byte[] a = C10410r.m5160a(C10410r.m5159b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f28918a);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("Downloaded ");
                    sb2.append(a.length);
                    sb2.append(" bytes from ");
                    sb2.append(valueOf);
                    Log.v("FirebaseMessaging", sb2.toString());
                }
                if (a.length <= 1048576) {
                    return a;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        C10418z.m5154a(th, th2);
                    }
                }
                throw th;
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
    }

    public AbstractC6775l<Bitmap> m10712z0() {
        return (AbstractC6775l) C6378r.m20506k(this.f28919b);
    }
}
