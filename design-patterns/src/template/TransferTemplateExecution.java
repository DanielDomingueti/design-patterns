package template;

public class TransferTemplateExecution {

    //use case: when you have multiple methods in common between classes to be executed at once
    //behavioral design pattern

    public static void main(String[] args) {
        TransferTemplate pixTransferTemplate = new PixTransfer();
        TransferTemplate tedTransferTemplate = new TedTransfer();

        pixTransferTemplate.execute();
        tedTransferTemplate.execute();

    }


}
