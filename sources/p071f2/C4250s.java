package p071f2;

import androidx.work.C1070b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class C4250s {
    public UUID f14291a;
    public EnumC4251a f14292b;
    public C1070b f14293c;
    public Set<String> f14294d;
    public C1070b f14295e;
    public int f14296f;

    public enum EnumC4251a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean m28351a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C4250s(UUID uuid, EnumC4251a aVar, C1070b bVar, List<String> list, C1070b bVar2, int i) {
        this.f14291a = uuid;
        this.f14292b = aVar;
        this.f14293c = bVar;
        this.f14294d = new HashSet(list);
        this.f14295e = bVar2;
        this.f14296f = i;
    }

    public EnumC4251a m28352a() {
        return this.f14292b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4250s.class != obj.getClass()) {
            return false;
        }
        C4250s sVar = (C4250s) obj;
        if (this.f14296f == sVar.f14296f && this.f14291a.equals(sVar.f14291a) && this.f14292b == sVar.f14292b && this.f14293c.equals(sVar.f14293c) && this.f14294d.equals(sVar.f14294d)) {
            return this.f14295e.equals(sVar.f14295e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f14291a.hashCode() * 31) + this.f14292b.hashCode()) * 31) + this.f14293c.hashCode()) * 31) + this.f14294d.hashCode()) * 31) + this.f14295e.hashCode()) * 31) + this.f14296f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f14291a + "', mState=" + this.f14292b + ", mOutputData=" + this.f14293c + ", mTags=" + this.f14294d + ", mProgress=" + this.f14295e + '}';
    }
}
