package template;

public class TransferTemplateExecution {

    public static void main(String[] args) {
        TransferTemplate pixTransferTemplate = new PixTransfer();
        TransferTemplate tedTransferTemplate = new TedTransfer();

        pixTransferTemplate.execute();
        tedTransferTemplate.execute();

    }


}
