package p6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import org.thunderdog.challegram.Log;
import t6.a;

public final class g3 {
    public static final a f20614h = new a("SliceMetadataManager");
    public final f0 f20616b;
    public final String f20617c;
    public final int f20618d;
    public final long f20619e;
    public final String f20620f;
    public final byte[] f20615a = new byte[Log.TAG_LUX];
    public int f20621g = -1;

    public g3(f0 f0Var, String str, int i10, long j10, String str2) {
        this.f20616b = f0Var;
        this.f20617c = str;
        this.f20618d = i10;
        this.f20619e = j10;
        this.f20620f = str2;
    }

    public final int a() {
        File A = this.f20616b.A(this.f20617c, this.f20618d, this.f20619e, this.f20620f);
        if (!A.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(A);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new g1("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final f3 b() {
        File A = this.f20616b.A(this.f20617c, this.f20618d, this.f20619e, this.f20620f);
        if (A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new g1("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f20621g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new m0(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e10) {
                    throw new g1("Slice checkpoint file corrupt.", e10);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } else {
            throw new g1("Slice checkpoint file does not exist.");
        }
    }

    public final File c() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f20621g)));
    }

    public final void d(InputStream inputStream, long j10) {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            do {
                read = inputStream.read(this.f20615a);
                if (read > 0) {
                    randomAccessFile.write(this.f20615a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void e(long j10, byte[] bArr, int i10, int i11) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i10, i11);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void f(int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f20621g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void g(String str, long j10, long j11, int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f20621g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void h(byte[] bArr, int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f20621g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File z10 = this.f20616b.z(this.f20617c, this.f20618d, this.f20619e, this.f20620f);
            if (z10.exists()) {
                z10.delete();
            }
            fileOutputStream = new FileOutputStream(z10);
            try {
                fileOutputStream.write(bArr);
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    public final void i(int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f20621g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void j(byte[] bArr) {
        this.f20621g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f20621g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e10) {
            throw new g1("Could not write metadata file.", e10);
        }
    }

    public final void k(byte[] bArr, InputStream inputStream) {
        this.f20621g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f20615a);
            while (read > 0) {
                fileOutputStream.write(this.f20615a, 0, read);
                read = inputStream.read(this.f20615a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void l(byte[] bArr, int i10, int i11) {
        this.f20621g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i11);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final boolean m() {
        File A = this.f20616b.A(this.f20617c, this.f20618d, this.f20619e, this.f20620f);
        if (!A.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(A);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            f20614h.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e10) {
            f20614h.b("Could not read checkpoint while checking if extraction finished. %s", e10);
            return false;
        }
    }

    public final File n() {
        File B = this.f20616b.B(this.f20617c, this.f20618d, this.f20619e, this.f20620f);
        if (!B.exists()) {
            B.mkdirs();
        }
        return B;
    }

    public final File o() {
        File A = this.f20616b.A(this.f20617c, this.f20618d, this.f20619e, this.f20620f);
        A.getParentFile().mkdirs();
        A.createNewFile();
        return A;
    }
}
