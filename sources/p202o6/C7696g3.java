package p202o6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import org.thunderdog.challegram.Log;
import p262s6.C8646a;

public final class C7696g3 {
    public static final C8646a f24648h = new C8646a("SliceMetadataManager");
    public final C7688f0 f24650b;
    public final String f24651c;
    public final int f24652d;
    public final long f24653e;
    public final String f24654f;
    public final byte[] f24649a = new byte[Log.TAG_LUX];
    public int f24655g = -1;

    public C7696g3(C7688f0 f0Var, String str, int i, long j, String str2) {
        this.f24650b = f0Var;
        this.f24651c = str;
        this.f24652d = i;
        this.f24653e = j;
        this.f24654f = str2;
    }

    public final int m15225a() {
        File A = this.f24650b.m15261A(this.f24651c, this.f24652d, this.f24653e, this.f24654f);
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
            throw new C7694g1("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final AbstractC7691f3 m15224b() {
        File A = this.f24650b.m15261A(this.f24651c, this.f24652d, this.f24653e, this.f24654f);
        if (A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C7694g1("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f24655g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C7723m0(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C7694g1("Slice checkpoint file corrupt.", e);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } else {
            throw new C7694g1("Slice checkpoint file does not exist.");
        }
    }

    public final File m15223c() {
        return new File(m15212n(), String.format("%s-NAM.dat", Integer.valueOf(this.f24655g)));
    }

    public final void m15222d(InputStream inputStream, long j) {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(m15223c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f24649a);
                if (read > 0) {
                    randomAccessFile.write(this.f24649a, 0, read);
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

    public final void m15221e(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m15223c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void m15220f(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(m15223c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24655g));
        FileOutputStream fileOutputStream = new FileOutputStream(m15211o());
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

    public final void m15219g(String str, long j, long j2, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24655g));
        FileOutputStream fileOutputStream = new FileOutputStream(m15211o());
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

    public final void m15218h(byte[] bArr, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24655g));
        FileOutputStream fileOutputStream = new FileOutputStream(m15211o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File z = this.f24650b.m15226z(this.f24651c, this.f24652d, this.f24653e, this.f24654f);
            if (z.exists()) {
                z.delete();
            }
            fileOutputStream = new FileOutputStream(z);
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

    public final void m15217i(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24655g));
        FileOutputStream fileOutputStream = new FileOutputStream(m15211o());
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

    public final void m15216j(byte[] bArr) {
        this.f24655g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m15212n(), String.format("%s-LFH.dat", Integer.valueOf(this.f24655g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new C7694g1("Could not write metadata file.", e);
        }
    }

    public final void m15215k(byte[] bArr, InputStream inputStream) {
        this.f24655g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m15223c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f24649a);
            while (read > 0) {
                fileOutputStream.write(this.f24649a, 0, read);
                read = inputStream.read(this.f24649a);
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

    public final void m15214l(byte[] bArr, int i, int i2) {
        this.f24655g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m15223c());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final boolean m15213m() {
        File A = this.f24650b.m15261A(this.f24651c, this.f24652d, this.f24653e, this.f24654f);
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
            f24648h.m11816b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e) {
            f24648h.m11816b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        }
    }

    public final File m15212n() {
        File B = this.f24650b.m15260B(this.f24651c, this.f24652d, this.f24653e, this.f24654f);
        if (!B.exists()) {
            B.mkdirs();
        }
        return B;
    }

    public final File m15211o() {
        File A = this.f24650b.m15261A(this.f24651c, this.f24652d, this.f24653e, this.f24654f);
        A.getParentFile().mkdirs();
        A.createNewFile();
        return A;
    }
}
