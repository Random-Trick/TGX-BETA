package b1;

import java.io.Writer;
import org.thunderdog.challegram.Log;

@Deprecated
public class c extends Writer {
    public final String f3691a;
    public StringBuilder f3692b = new StringBuilder((int) Log.TAG_YOUTUBE);

    public c(String str) {
        this.f3691a = str;
    }

    @Override
    public void close() {
        m();
    }

    @Override
    public void flush() {
        m();
    }

    public final void m() {
        if (this.f3692b.length() > 0) {
            android.util.Log.d(this.f3691a, this.f3692b.toString());
            StringBuilder sb2 = this.f3692b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m();
            } else {
                this.f3692b.append(c10);
            }
        }
    }
}
