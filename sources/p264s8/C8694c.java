package p264s8;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import p258s2.C8632e;
import p258s2.C8634g;
import p345y8.C10447b;

public class C8694c extends AbstractC8693b {
    public short f28020a;
    public short f28021b;
    public List<C8695a> f28022c = new LinkedList();
    public int f28023d;
    public int f28024e;
    public short f28025f;

    public static class C8695a {
        public int f28026a;
        public short f28027b;

        public C8695a(int i, short s) {
            this.f28026a = i;
            this.f28027b = s;
        }

        public int m11725a() {
            return this.f28026a;
        }

        public short m11724b() {
            return this.f28027b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8695a aVar = (C8695a) obj;
            return this.f28026a == aVar.f28026a && this.f28027b == aVar.f28027b;
        }

        public int hashCode() {
            return (this.f28026a * 31) + this.f28027b;
        }

        public String toString() {
            return "{availableBitrate=" + this.f28026a + ", targetRateShare=" + ((int) this.f28027b) + '}';
        }
    }

    @Override
    public ByteBuffer mo11723a() {
        short s = this.f28020a;
        ByteBuffer allocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        allocate.putShort(this.f28020a);
        if (this.f28020a == 1) {
            allocate.putShort(this.f28021b);
        } else {
            for (C8695a aVar : this.f28022c) {
                allocate.putInt(aVar.m11725a());
                allocate.putShort(aVar.m11724b());
            }
        }
        allocate.putInt(this.f28023d);
        allocate.putInt(this.f28024e);
        C8634g.m11851j(allocate, this.f28025f);
        allocate.rewind();
        return allocate;
    }

    @Override
    public String mo11722b() {
        return "rash";
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        this.f28020a = s;
        int i = s;
        if (s == 1) {
            this.f28021b = byteBuffer.getShort();
        } else {
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                this.f28022c.add(new C8695a(C10447b.m5103a(C8632e.m11865k(byteBuffer)), byteBuffer.getShort()));
                i = i2;
            }
        }
        this.f28023d = C10447b.m5103a(C8632e.m11865k(byteBuffer));
        this.f28024e = C10447b.m5103a(C8632e.m11865k(byteBuffer));
        this.f28025f = (short) C8632e.m11862n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8694c cVar = (C8694c) obj;
        if (this.f28025f != cVar.f28025f || this.f28023d != cVar.f28023d || this.f28024e != cVar.f28024e || this.f28020a != cVar.f28020a || this.f28021b != cVar.f28021b) {
            return false;
        }
        List<C8695a> list = this.f28022c;
        List<C8695a> list2 = cVar.f28022c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((this.f28020a * 31) + this.f28021b) * 31;
        List<C8695a> list = this.f28022c;
        return ((((((i + (list != null ? list.hashCode() : 0)) * 31) + this.f28023d) * 31) + this.f28024e) * 31) + this.f28025f;
    }
}
