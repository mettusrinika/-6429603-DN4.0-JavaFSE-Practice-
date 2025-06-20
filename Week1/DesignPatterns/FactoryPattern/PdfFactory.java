public class PdfFactory  extends DocFactory
{
    @Override
    public Document createDocument() {
        return new PdfDoc();
    }
}
