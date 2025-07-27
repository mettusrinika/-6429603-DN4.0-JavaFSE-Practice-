public class WordFactory extends DocFactory
{
    @Override
    public Document createDocument() {
        return new WordDoc();
    }
}

