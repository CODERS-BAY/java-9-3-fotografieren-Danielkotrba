public class Camera {
    private static int NUMBER_OF_Cameras;
    private String brand;
    private double megaPixels;
    private double displaySize;
    private Boolean colored;
    private Lens lens;

    public Camera(String brand, double megaPixels, double displaySize, Boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        NUMBER_OF_Cameras++;
    }

    public static int getNumberOfCameras() { return NUMBER_OF_Cameras; }

    public Lens getLens() { return lens; }

    public void changeLens(Lens newLens) {
        this.lens = newLens;
        System.out.println("The new lens is : " + newLens);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                '}';
    }
}