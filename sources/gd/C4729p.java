package gd;

import be.C1357a0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p350yd.C10930q6;

public class C4729p extends AbstractC4718o<String> {
    public final long f15921a0;
    public final String f15922b0;
    public long f15923c0;

    public C4729p(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, String str, String str2) {
        super(aVar, q6Var, 15, null, str2);
        this.f15921a0 = j;
        this.f15922b0 = str;
    }

    public long m26313Z() {
        return this.f15923c0;
    }

    public String m26312a0() {
        return this.f15922b0;
    }

    public long m26311b0() {
        return this.f15921a0;
    }

    public void m26310c0(long j) {
        this.f15923c0 = j;
    }

    @Override
    public int mo25111n() {
        return C1357a0.m37541i(36.0f) + C1357a0.m37541i(1.0f);
    }
}
