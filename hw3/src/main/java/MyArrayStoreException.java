public class MyArrayStoreException extends ArrayStoreException{
    @Override
    public String getMessage() {
        return "В массиве должны храниться только int";
    }
}
