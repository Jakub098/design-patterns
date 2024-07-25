package fasada;


import fasada.deliverybox.DeliveryBoxFacade;

public class Main {
    public static void main(String[] args) {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();

        deliveryBoxFacade.pickupPackage();
    }


}
