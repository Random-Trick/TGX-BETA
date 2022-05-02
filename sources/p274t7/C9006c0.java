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
    public final URL f28921a;
    public AbstractC6775l<Bitmap> f28922b;
    public volatile InputStream f28923c;

    public C9006c0(URL url) {
        this.f28921a = url;
    }

    public static C9006c0 m10712y0(String str) {
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

    public void m10715A0(Executor executor) {
        this.f28922b = C6781o.m19053c(executor, new Callable(this) {
            public final C9006c0 f28917a;

            {
                this.f28917a = this;
            }

            @Override
            public Object call() {
                return this.f28917a.m10714m();
            }
        });
    }

    @Override
    public void close() {
        try {
            C10411s.m5157a(this.f28923c);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    public Bitmap m10714m() {
        String valueOf = String.valueOf(this.f28921a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Starting download of: ");
        sb2.append(valueOf);
        Log.i("FirebaseMessaging", sb2.toString());
        byte[] t = m10713t();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(t, 0, t.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f28921a);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 31);
                sb3.append("Successfully downloaded image: ");
                sb3.append(valueOf2);
                Log.d("FirebaseMessaging", sb3.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f28921a);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 24);
        sb4.append("Failed to decode image: ");
        sb4.append(valueOf3);
        throw new IOException(sb4.toString());
    }

    public final byte[] m10713t() {
        URLConnection openConnection = this.f28921a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f28923c = inputStream;
                byte[] a = C10410r.m5160a(C10410r.m5159b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f28921a);
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

    public AbstractC6775l<Bitmap> m10711z0() {
        return (AbstractC6775l) C6378r.m20507k(this.f28922b);
    }
}
