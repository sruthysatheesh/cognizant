package design_principles;
interface Document {
    void open();

    void save();

    void close();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("opening the word document...");
    }

    @Override
    public void save() {
        System.out.println("saving the word document...");
    }

    @Override
    public void close() {
        System.out.println("closing the word document...");
    }
}

class pdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("opening the pdf document...");
    }

    @Override
    public void save() {
        System.out.println("saving the pdf document...");
    }

    @Override
    public void close() {
        System.out.println("closing the pdf document...");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("opening the excel document...");
    }

    @Override
    public void save() {
        System.out.println("saving the excel document...");
    }

    @Override
    public void close() {
        System.out.println("closing the excel document...");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new pdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();
        wordDocument.save();
        wordDocument.close();

        System.out.println("----------------------");

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.close();

        System.out.println("----------------------");

        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
        excelDocument.save();
        excelDocument.close();

        System.out.println("----------------------");
    }
}