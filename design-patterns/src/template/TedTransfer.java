package template;

public class TedTransfer extends TransferTemplate {

    @Override
    protected void defineOriginAccount() {
        System.out.println("TED: Define origin account");
    }

    @Override
    protected void defineDestinationAccount() {
        System.out.println("TED: Define destination account");
    }

    @Override
    protected void defineTransferValue() {
        System.out.println("TED: Define transfer value");
    }

    @Override
    protected void defineTransferDate() {
        System.out.println("TED: Define transfer date");
    }

    @Override
    protected void completeTransfer() {
        System.out.println("TED transfer successfully done");
    }
}
