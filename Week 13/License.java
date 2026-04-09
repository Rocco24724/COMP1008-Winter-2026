public interface License {
    String getLicenseType();
    boolean canDrive(String vehicleType);
    boolean licenseIsSuspended();
}
