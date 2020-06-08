public class Lens {

    private static int NUMBER_OF_LENSES;
    private int minFocalLength;
    private int maxFocalLength;

    public Lens(int minFocalLength, int maxFocalLength) throws IllegalAccessException {
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;

        if (minFocalLength > maxFocalLength) {
            throw new IllegalAccessException("The minimal focal length must be less than the maximal focal length");
        }else {
            NUMBER_OF_LENSES++;
        }
}
    public static int getNumberOfLenses() { return NUMBER_OF_LENSES; }

    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }

}