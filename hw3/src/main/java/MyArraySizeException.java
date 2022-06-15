public class MyArraySizeException extends IllegalArgumentException {
    @Override
    public String getMessage() {
        return "Размер массива должен быть 4 на 4";
    }
}
