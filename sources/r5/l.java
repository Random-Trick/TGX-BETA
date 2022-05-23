package r5;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.RecentlyNullable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;
import m5.r;

public class l {
    @Nullable
    public static String f21745a;
    public static int f21746b;

    @RecentlyNullable
    public static String a() {
        BufferedReader bufferedReader;
        Throwable th;
        if (f21745a == null) {
            if (f21746b == 0) {
                f21746b = Process.myPid();
            }
            int i10 = f21746b;
            String str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            str = null;
            if (i10 > 0) {
                try {
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("/proc/");
                    sb2.append(i10);
                    sb2.append("/cmdline");
                    String sb3 = sb2.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    bufferedReader = new BufferedReader(new FileReader(sb3));
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    r.k(readLine);
                    str = readLine.trim();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    j.a(bufferedReader2);
                    throw th;
                }
                j.a(bufferedReader);
            }
            f21745a = str;
        }
        return f21745a;
    }
}
