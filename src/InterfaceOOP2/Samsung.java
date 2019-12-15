package InterfaceOOP2;

public class Samsung extends cellPhone {
    @Override
    public void call() {
        System.out.println("samsung is calling");
    }

    @Override
    public void text() {
        System.out.println("samsung is texting");
    }

    @Override
    public void takePicture() {
        System.out.println("samsung is taking picture");

    }

    @Override
    public void location() {
        System.out.println("samsung has flashCard on side");

    }

    @Override
    public void faceId() {
        System.out.println("samsung has faceID function");

    }
}
