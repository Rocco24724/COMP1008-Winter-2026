public class DriverLicense implements License {
    private final String licenseType;
    private boolean suspended;

    public DriverLicense(String licenseType, boolean suspended) {
        this.licenseType = licenseType;
        this.suspended = suspended;
    }

    @Override
    public String getLicenseType() {
        return licenseType;
    }

    @Override
    public boolean canDrive(String vehicleType) {
        if (licenseIsSuspended()) {
            return false;
        }
        return licenseType.equalsIgnoreCase(vehicleType);
    }

    @Override
    public boolean licenseIsSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
}
