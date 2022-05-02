package p264s8;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import p258s2.C8632e;
import p258s2.C8634g;
import p345y8.C10447b;

public class C8694c extends AbstractC8693b {
    public short f28023a;
    public short f28024b;
    public List<C8695a> f28025c = new LinkedList();
    public int f28026d;
    public int f28027e;
    public short f28028f;

    public static class C8695a {
        public int f28029a;
        public short f28030b;

        public C8695a(int i, short s) {
            this.f28029a = i;
            this.f28030b = s;
        }

        public int m11724a() {
            return this.f28029a;
        }

        public short m11723b() {
            return this.f28030b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8695a aVar = (C8695a) obj;
            return this.f28029a == aVar.f28029a && this.f28030b == aVar.f28030b;
        }

        public int hashCode() {
            return (this.f28029a * 31) + this.f28030b;
        }

        public String toString() {
            return "{availableBitrate=" + this.f28029a + ", targetRateShare=" + ((int) this.f28030b) + '}';
        }
    }

    @Override
    public ByteBuffer mo11722a() {
        short s = this.f28023a;
        ByteBuffer allocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        allocate.putShort(this.f28023a);
        if (this.f28023a == 1) {
            allocate.putShort(this.f28024b);
        } else {
            for (C8695a aVar : this.f28025c) {
                allocate.putInt(aVar.m11724a());
                allocate.putShort(aVar.m11723b());
            }
        }
        allocate.putInt(this.f28026d);
        allocate.putInt(this.f28027e);
        C8634g.m11850j(allocate, this.f28028f);
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11721b() {
        return "rash";
    }

    @Override
    public void mo11720c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.f28023a = s;
        int i = s;
        if (s == 1) {
            this.f28024b = byteBuffer.getShort();
        } else {
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                this.f28025c.add(new C8695a(C10447b.m5103a(C8632e.m11864k(byteBuffer)), byteBuffer.getShort()));
                i = i2;
            }
        }
        this.f28026d = C10447b.m5103a(C8632e.m11864k(byteBuffer));
        this.f28027e = C10447b.m5103a(C8632e.m11864k(byteBuffer));
        this.f28028f = (short) C8632e.m11861n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8694c cVar = (C8694c) obj;
        if (this.f28028f != cVar.f28028f || this.f28026d != cVar.f28026d || this.f28027e != cVar.f28027e || this.f28023a != cVar.f28023a || this.f28024b != cVar.f28024b) {
            return false;
        }
        List<C8695a> list = this.f28025c;
        List<C8695a> list2 = cVar.f28025c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((this.f28023a * 31) + this.f28024b) * 31;
        List<C8695a> list = this.f28025c;
        return ((((((i + (list != null ? list.hashCode() : 0)) * 31) + this.f28026d) * 31) + this.f28027e) * 31) + this.f28028f;
    }
}
