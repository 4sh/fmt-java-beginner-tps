package qsh.learning.javaBeginner.vehicle.wheel;

import java.util.Objects;

public class WheelId {
    private final BrandWheel brandWheel;
    private final String serialId;

    public WheelId(String brandWheel, String serialId) {
        this.brandWheel = buildBrand(brandWheel);
        this.serialId = serialId;
    }

    static private BrandWheel buildBrand(String brandWheel) {
        try {
            return BrandWheel.valueOf(brandWheel.substring(0, 5).toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public BrandWheel getBrandWheel() {
        return brandWheel;
    }

    public String getSerialId() {
        return serialId;
    }
}
