// DesignFactory class implementing Singleton pattern
class DesignFactory {
    private static DesignFactory instance;

    private DesignFactory() {}  // constructor

    public static DesignFactory getInstance() {
        if (instance == null) {
            instance = new DesignFactory();
        }
        return instance;
    }
}




