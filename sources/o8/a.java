package o8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t8.b;

public abstract class a implements g {
    public String f19311a;
    public List<c> f19312b = new ArrayList();
    public Map<b, long[]> f19313c = new HashMap();

    public a(String str) {
        this.f19311a = str;
    }

    @Override
    public String b() {
        return this.f19311a;
    }

    @Override
    public long g() {
        long j10 = 0;
        for (long j11 : S()) {
            j10 += j11;
        }
        return j10;
    }

    @Override
    public List<c> i() {
        return this.f19312b;
    }

    @Override
    public Map<b, long[]> w() {
        return this.f19313c;
    }
}
