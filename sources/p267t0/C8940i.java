package p267t0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p256s0.C8606e;
import p352z0.C11216f;

public class C8940i extends C8941j {
    @Override
    public Typeface mo10879b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        try {
            C8606e.C8609c[] a = bVar.m11939a();
            int length = a.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                C8606e.C8609c cVar = a[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.m11937b()).setWeight(cVar.m11934e());
                    if (!cVar.m11933f()) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(cVar.m11936c()).setFontVariationSettings(cVar.m11935d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (builder == null) {
                return null;
            }
            int i5 = (i & 1) != 0 ? 700 : 400;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override
    public Typeface mo10878c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 < length) {
                    C11216f.C11218b bVar = bVarArr[i3];
                    try {
                        openFileDescriptor = contentResolver.openFileDescriptor(bVar.m1198d(), "r", cancellationSignal);
                    } catch (IOException unused) {
                    }
                    if (openFileDescriptor != null) {
                        try {
                            Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.m1197e());
                            if (!bVar.m1196f()) {
                                i4 = 0;
                            }
                            Font build = weight.setSlant(i4).setTtcIndex(bVar.m1199c()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    } else if (openFileDescriptor == null) {
                        i3++;
                    }
                    openFileDescriptor.close();
                    i3++;
                } else if (builder == null) {
                    return null;
                } else {
                    int i5 = (i & 1) != 0 ? 700 : 400;
                    if ((i & 2) != 0) {
                        i2 = 1;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override
    public Typeface mo10877d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override
    public Typeface mo10876e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override
    public C11216f.C11218b mo10873h(C11216f.C11218b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
