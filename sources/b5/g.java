package b5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import c5.l0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class g extends f {
    public final ContentResolver f3865e;
    public Uri f3866f;
    public AssetFileDescriptor f3867g;
    public FileInputStream f3868h;
    public long f3869i;
    public boolean f3870j;

    public static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public static class b extends l {
        public b(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public g(Context context) {
        super(false);
        this.f3865e = context.getContentResolver();
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f3869i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        }
        int read = ((FileInputStream) l0.j(this.f3868h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f3869i;
        if (j11 != -1) {
            this.f3869i = j11 - read;
        }
        s(read);
        return read;
    }

    @Override
    public void close() {
        this.f3866f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f3868h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f3868h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f3867g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f3867g = null;
                        if (this.f3870j) {
                            this.f3870j = false;
                            t();
                        }
                    }
                } catch (IOException e10) {
                    throw new b(e10, 2000);
                }
            } catch (IOException e11) {
                throw new b(e11, 2000);
            }
        } catch (Throwable th) {
            this.f3868h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f3867g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f3867g = null;
                    if (this.f3870j) {
                        this.f3870j = false;
                        t();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new b(e12, 2000);
                }
            } finally {
                this.f3867g = null;
                if (this.f3870j) {
                    this.f3870j = false;
                    t();
                }
            }
        }
    }

    @Override
    public long d(o oVar) {
        AssetFileDescriptor assetFileDescriptor;
        int i10 = 2000;
        try {
            Uri uri = oVar.f3904a;
            this.f3866f = uri;
            u(oVar);
            if ("content".equals(oVar.f3904a.getScheme())) {
                Bundle bundle = new Bundle();
                if (l0.f4841a >= 31) {
                    a.a(bundle);
                }
                assetFileDescriptor = this.f3865e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f3865e.openAssetFileDescriptor(uri, "r");
            }
            this.f3867g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f3868h = fileInputStream;
                int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i11 != 0 && oVar.f3910g > length) {
                    throw new b(null, 2008);
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(oVar.f3910g + startOffset) - startOffset;
                if (skip == oVar.f3910g) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f3869i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f3869i = position;
                            if (position < 0) {
                                throw new b(null, 2008);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f3869i = j10;
                        if (j10 < 0) {
                            throw new b(null, 2008);
                        }
                    }
                    long j11 = oVar.f3911h;
                    if (j11 != -1) {
                        long j12 = this.f3869i;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f3869i = j11;
                    }
                    this.f3870j = true;
                    v(oVar);
                    long j13 = oVar.f3911h;
                    return j13 != -1 ? j13 : this.f3869i;
                }
                throw new b(null, 2008);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
            sb2.append("Could not open file descriptor for: ");
            sb2.append(valueOf);
            throw new b(new IOException(sb2.toString()), 2000);
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new b(e11, i10);
        }
    }

    @Override
    public Uri p() {
        return this.f3866f;
    }
}
