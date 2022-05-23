package f2;

import androidx.work.b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class s {
    public UUID f11829a;
    public a f11830b;
    public b f11831c;
    public Set<String> f11832d;
    public b f11833e;
    public int f11834f;

    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public s(UUID uuid, a aVar, b bVar, List<String> list, b bVar2, int i10) {
        this.f11829a = uuid;
        this.f11830b = aVar;
        this.f11831c = bVar;
        this.f11832d = new HashSet(list);
        this.f11833e = bVar2;
        this.f11834f = i10;
    }

    public a a() {
        return this.f11830b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f11834f == sVar.f11834f && this.f11829a.equals(sVar.f11829a) && this.f11830b == sVar.f11830b && this.f11831c.equals(sVar.f11831c) && this.f11832d.equals(sVar.f11832d)) {
            return this.f11833e.equals(sVar.f11833e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f11829a.hashCode() * 31) + this.f11830b.hashCode()) * 31) + this.f11831c.hashCode()) * 31) + this.f11832d.hashCode()) * 31) + this.f11833e.hashCode()) * 31) + this.f11834f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f11829a + "', mState=" + this.f11830b + ", mOutputData=" + this.f11831c + ", mTags=" + this.f11832d + ", mProgress=" + this.f11833e + '}';
    }
}
