package u7;

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
import n6.l;
import n6.o;
import z5.r;
import z5.s;
import z5.z;

public class c0 implements Closeable {
    public final URL f23609a;
    public l<Bitmap> f23610b;
    public volatile InputStream f23611c;

    public c0(URL url) {
        this.f23609a = url;
    }

    public static c0 y0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new c0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public void A0(Executor executor) {
        this.f23610b = o.c(executor, new Callable(this) {
            public final c0 f23605a;

            {
                this.f23605a = this;
            }

            @Override
            public Object call() {
                return this.f23605a.m();
            }
        });
    }

    @Override
    public void close() {
        try {
            s.a(this.f23611c);
        } catch (NullPointerException e10) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e10);
        }
    }

    public Bitmap m() {
        String valueOf = String.valueOf(this.f23609a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Starting download of: ");
        sb2.append(valueOf);
        Log.i("FirebaseMessaging", sb2.toString());
        byte[] s10 = s();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(s10, 0, s10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f23609a);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 31);
                sb3.append("Successfully downloaded image: ");
                sb3.append(valueOf2);
                Log.d("FirebaseMessaging", sb3.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f23609a);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 24);
        sb4.append("Failed to decode image: ");
        sb4.append(valueOf3);
        throw new IOException(sb4.toString());
    }

    public final byte[] s() {
        URLConnection openConnection = this.f23609a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f23611c = inputStream;
                byte[] a10 = r.a(r.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f23609a);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("Downloaded ");
                    sb2.append(a10.length);
                    sb2.append(" bytes from ");
                    sb2.append(valueOf);
                    Log.v("FirebaseMessaging", sb2.toString());
                }
                if (a10.length <= 1048576) {
                    return a10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        z.a(th, th2);
                    }
                }
                throw th;
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
    }

    public l<Bitmap> z0() {
        return (l) m5.r.k(this.f23610b);
    }
}
