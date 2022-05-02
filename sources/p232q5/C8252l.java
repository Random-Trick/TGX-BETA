package p232q5;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.RecentlyNullable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;
import p163l5.C6378r;

public class C8252l {
    @Nullable
    public static String f26705a;
    public static int f26706b;

    @RecentlyNullable
    public static String m13028a() {
        BufferedReader bufferedReader;
        Throwable th;
        if (f26705a == null) {
            if (f26706b == 0) {
                f26706b = Process.myPid();
            }
            int i = f26706b;
            String str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            str = null;
            if (i > 0) {
                try {
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("/proc/");
                    sb2.append(i);
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
                    C6378r.m20507k(readLine);
                    str = readLine.trim();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    C8250j.m13041a(bufferedReader2);
                    throw th;
                }
                C8250j.m13041a(bufferedReader);
            }
            f26705a = str;
        }
        return f26705a;
    }
}
