public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        Lens lensOne = new Lens(18, 24);
        Lens lensTwo = new Lens(18, 55);
        Lens lensThree = new Lens(18, 135);
        Camera cameraOne = new Camera("Canon", 16.2, 16.9, true, lensThree);

        System.out.println(cameraOne.getLens());
        System.out.println(cameraOne.toString());
        cameraOne.changeLens(lensTwo);
        System.out.println("---Lens on CameraOne changed---\n" + cameraOne.toString());

        System.out.println("The number of cameras created is " + cameraOne.getNumberOfCameras());
        System.out.println("The number of lenses created is " + lensOne.getNumberOfLenses());

    }

}
