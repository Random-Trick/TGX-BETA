package p191n8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p264s8.AbstractC8693b;

public abstract class AbstractC7300a implements AbstractC7307g {
    public String f23174a;
    public List<C7303c> f23175b = new ArrayList();
    public Map<AbstractC8693b, long[]> f23176c = new HashMap();

    public AbstractC7300a(String str) {
        this.f23174a = str;
    }

    @Override
    public String mo17091b() {
        return this.f23174a;
    }

    @Override
    public long mo17090g() {
        long j = 0;
        for (long j2 : mo12958R()) {
            j += j2;
        }
        return j;
    }

    @Override
    public List<C7303c> mo17089i() {
        return this.f23175b;
    }

    @Override
    public Map<AbstractC8693b, long[]> mo17088x() {
        return this.f23176c;
    }
}
