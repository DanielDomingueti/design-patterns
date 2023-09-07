package template;

public abstract class TransferTemplate {

    public void execute() {
        defineOriginAccount();
        defineDestinationAccount();
        defineTransferValue();
        defineTransferDate();
        completeTransfer();
    }

    protected abstract void defineOriginAccount();
    protected abstract void defineDestinationAccount();
    protected abstract void defineTransferValue();
    protected abstract void defineTransferDate();
    protected abstract void completeTransfer();

}
