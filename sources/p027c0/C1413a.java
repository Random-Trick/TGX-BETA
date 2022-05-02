package p027c0;

public final class C1413a extends AbstractC1421f {
    public final float f5219a;
    public final float f5220b;
    public final float f5221c;
    public final float f5222d;

    public C1413a(float f, float f2, float f3, float f4) {
        this.f5219a = f;
        this.f5220b = f2;
        this.f5221c = f3;
        this.f5222d = f4;
    }

    @Override
    public float mo12423a() {
        return this.f5220b;
    }

    @Override
    public float mo12422b() {
        return this.f5221c;
    }

    @Override
    public float mo12421c() {
        return this.f5219a;
    }

    @Override
    public float mo12420d() {
        return this.f5222d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1421f)) {
            return false;
        }
        AbstractC1421f fVar = (AbstractC1421f) obj;
        return Float.floatToIntBits(this.f5219a) == Float.floatToIntBits(fVar.mo12421c()) && Float.floatToIntBits(this.f5220b) == Float.floatToIntBits(fVar.mo12423a()) && Float.floatToIntBits(this.f5221c) == Float.floatToIntBits(fVar.mo12422b()) && Float.floatToIntBits(this.f5222d) == Float.floatToIntBits(fVar.mo12420d());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f5219a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f5220b)) * 1000003) ^ Float.floatToIntBits(this.f5221c)) * 1000003) ^ Float.floatToIntBits(this.f5222d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f5219a + ", maxZoomRatio=" + this.f5220b + ", minZoomRatio=" + this.f5221c + ", linearZoom=" + this.f5222d + "}";
    }
}
