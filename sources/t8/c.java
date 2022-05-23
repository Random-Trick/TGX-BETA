package t8;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import s2.e;
import s2.g;
import z8.b;

public class c extends b {
    public short f22980a;
    public short f22981b;
    public List<a> f22982c = new LinkedList();
    public int f22983d;
    public int f22984e;
    public short f22985f;

    public static class a {
        public int f22986a;
        public short f22987b;

        public a(int i10, short s10) {
            this.f22986a = i10;
            this.f22987b = s10;
        }

        public int a() {
            return this.f22986a;
        }

        public short b() {
            return this.f22987b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22986a == aVar.f22986a && this.f22987b == aVar.f22987b;
        }

        public int hashCode() {
            return (this.f22986a * 31) + this.f22987b;
        }

        public String toString() {
            return "{availableBitrate=" + this.f22986a + ", targetRateShare=" + ((int) this.f22987b) + '}';
        }
    }

    @Override
    public ByteBuffer a() {
        short s10 = this.f22980a;
        ByteBuffer allocate = ByteBuffer.allocate(s10 == 1 ? 13 : (s10 * 6) + 11);
        allocate.putShort(this.f22980a);
        if (this.f22980a == 1) {
            allocate.putShort(this.f22981b);
        } else {
            for (a aVar : this.f22982c) {
                allocate.putInt(aVar.a());
                allocate.putShort(aVar.b());
            }
        }
        allocate.putInt(this.f22983d);
        allocate.putInt(this.f22984e);
        g.j(allocate, this.f22985f);
        allocate.rewind();
        return allocate;
    }

    @Override
    public String b() {
        return "rash";
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        short s10 = byteBuffer.getShort();
        this.f22980a = s10;
        int i10 = s10;
        if (s10 == 1) {
            this.f22981b = byteBuffer.getShort();
        } else {
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    break;
                }
                this.f22982c.add(new a(b.a(e.k(byteBuffer)), byteBuffer.getShort()));
                i10 = i11;
            }
        }
        this.f22983d = b.a(e.k(byteBuffer));
        this.f22984e = b.a(e.k(byteBuffer));
        this.f22985f = (short) e.n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f22985f != cVar.f22985f || this.f22983d != cVar.f22983d || this.f22984e != cVar.f22984e || this.f22980a != cVar.f22980a || this.f22981b != cVar.f22981b) {
            return false;
        }
        List<a> list = this.f22982c;
        List<a> list2 = cVar.f22982c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i10 = ((this.f22980a * 31) + this.f22981b) * 31;
        List<a> list = this.f22982c;
        return ((((((i10 + (list != null ? list.hashCode() : 0)) * 31) + this.f22983d) * 31) + this.f22984e) * 31) + this.f22985f;
    }
}
