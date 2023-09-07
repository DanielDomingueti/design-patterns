package template;

public class PixTransfer extends TransferTemplate {


    @Override
    protected void defineOriginAccount() {
        System.out.println("PIX: Define origin account");
    }

    @Override
    protected void defineDestinationAccount() {
        System.out.println("PIX: Define destination account");
    }

    @Override
    protected void defineTransferValue() {
        System.out.println("PIX: Define transfer value");
    }

    @Override
    protected void defineTransferDate() {
        System.out.println("PIX: Define transfer date");
    }

    @Override
    protected void completeTransfer() {
        System.out.println("PIX transfer successfully done");
    }
}
