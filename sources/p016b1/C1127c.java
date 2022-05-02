package p016b1;

import java.io.Writer;
import org.thunderdog.challegram.Log;

@Deprecated
public class C1127c extends Writer {
    public final String f4330a;
    public StringBuilder f4331b = new StringBuilder((int) Log.TAG_YOUTUBE);

    public C1127c(String str) {
        this.f4330a = str;
    }

    @Override
    public void close() {
        m38334m();
    }

    @Override
    public void flush() {
        m38334m();
    }

    public final void m38334m() {
        if (this.f4331b.length() > 0) {
            android.util.Log.d(this.f4330a, this.f4331b.toString());
            StringBuilder sb2 = this.f4331b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m38334m();
            } else {
                this.f4331b.append(c);
            }
        }
    }
}
