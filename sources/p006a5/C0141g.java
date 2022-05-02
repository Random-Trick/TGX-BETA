package p006a5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p020b5.C1216l0;

public final class C0141g extends AbstractC0139f {
    public final ContentResolver f511e;
    public Uri f512f;
    public AssetFileDescriptor f513g;
    public FileInputStream f514h;
    public long f515i;
    public boolean f516j;

    public static final class C0142a {
        public static void m42224a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public static class C0143b extends C0156l {
        public C0143b(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public C0141g(Context context) {
        super(false);
        this.f511e = context.getContentResolver();
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f515i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0143b(e, 2000);
            }
        }
        int read = ((FileInputStream) C1216l0.m37971j(this.f514h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f515i;
        if (j2 != -1) {
            this.f515i = j2 - read;
        }
        m42228s(read);
        return read;
    }

    @Override
    public long mo4413c(C0159o oVar) {
        AssetFileDescriptor assetFileDescriptor;
        int i = 2000;
        try {
            Uri uri = oVar.f553a;
            this.f512f = uri;
            m42226u(oVar);
            if ("content".equals(oVar.f553a.getScheme())) {
                Bundle bundle = new Bundle();
                if (C1216l0.f4526a >= 31) {
                    C0142a.m42224a(bundle);
                }
                assetFileDescriptor = this.f511e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f511e.openAssetFileDescriptor(uri, "r");
            }
            this.f513g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f514h = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && oVar.f559g > length) {
                    throw new C0143b(null, 2008);
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(oVar.f559g + startOffset) - startOffset;
                if (skip == oVar.f559g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f515i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f515i = position;
                            if (position < 0) {
                                throw new C0143b(null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f515i = j;
                        if (j < 0) {
                            throw new C0143b(null, 2008);
                        }
                    }
                    long j2 = oVar.f560h;
                    if (j2 != -1) {
                        long j3 = this.f515i;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f515i = j2;
                    }
                    this.f516j = true;
                    m42225v(oVar);
                    long j4 = oVar.f560h;
                    return j4 != -1 ? j4 : this.f515i;
                }
                throw new C0143b(null, 2008);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
            sb2.append("Could not open file descriptor for: ");
            sb2.append(valueOf);
            throw new C0143b(new IOException(sb2.toString()), 2000);
        } catch (C0143b e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new C0143b(e2, i);
        }
    }

    @Override
    public void close() {
        this.f512f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f514h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f514h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f513g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f513g = null;
                        if (this.f516j) {
                            this.f516j = false;
                            m42227t();
                        }
                    }
                } catch (IOException e) {
                    throw new C0143b(e, 2000);
                }
            } catch (IOException e2) {
                throw new C0143b(e2, 2000);
            }
        } catch (Throwable th) {
            this.f514h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f513g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f513g = null;
                    if (this.f516j) {
                        this.f516j = false;
                        m42227t();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C0143b(e3, 2000);
                }
            } finally {
                this.f513g = null;
                if (this.f516j) {
                    this.f516j = false;
                    m42227t();
                }
            }
        }
    }

    @Override
    public Uri mo4412p() {
        return this.f512f;
    }
}
