public class Main {
    public static void main(String[] args) {
        SimpleNamesCollection.counter();
        SimplePhoneDictionary phoneDictionary = new SimplePhoneDictionary();
        phoneDictionary.add("чори", "8888");
        phoneDictionary.add("чори", "87");
        phoneDictionary.add("кравченко", "85");
        System.out.println(phoneDictionary.get("чори"));
        System.out.println(phoneDictionary.get("кравченко"));
    }
}
