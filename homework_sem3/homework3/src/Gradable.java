public interface Gradable {
    public default int getGrade() {
        return 0;
    }

    default public void addGrade(int addGrade) {

    }
}
